package me.muawb.everbright.core;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import me.muawb.everbright.event.ClickEvent;
import me.muawb.everbright.particles.ParticleBright;

/**
 * Main action listener, implements {@link ApplicationAdapter}. Here invoked
 * methods when work event.
 * {@link this#create()} invoked which run application,
 * {@link this#render()} invoked which happen replace frame,
 * {@link this#dispose()} invoked which need close such class,
 * which implements interface {@link com.badlogic.gdx.utils.Disposable}.
 *
 */

public class EverBright extends ApplicationAdapter {

    //Need for configurations particle effect.
    private ParticleBright particle;
    //Camera which represent viewport application.
    private OrthographicCamera mainCamera;
    //Sprite batch input texture or such object and draw it.
    private SpriteBatch batch;
    //Vector3 describe physical properties movement body in space.
    private Vector3 coordinateVector;

    /**
     * Invoked where run this application.
     * Into create object and set configuration.
     */

    @Override
    public void create() {
        batch = new SpriteBatch();
        coordinateVector = new Vector3();
        particle = new ParticleBright("image/light.png", "sounds/bright.mp3");

        mainCamera = new OrthographicCamera();
        //Off gravity.
        mainCamera.setToOrtho(false);

        //Set logging level DEBUG.
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        //Set action listener for key and mouse.
        Gdx.input.setInputProcessor(new ClickEvent(particle, coordinateVector));
    }

    /**
     * This method invoked which must draw visualization.
     */

    @Override
    public void render() {
        //Clear color on black.
        Gdx.gl.glClearColor(0,0,0,0.2f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Set coordinates.
        coordinateVector.set(Gdx.input.getX(), Gdx.input.getY(), 0);
        mainCamera.unproject(coordinateVector);
        //Defined matrix for SpriteBatch.
        batch.setProjectionMatrix(mainCamera.combined);
        mainCamera.update();

        //Draw.
        batch.begin();
        for (Rectangle rect: particle.listRectangle){
            batch.draw(particle.mainTexture, rect.x, rect.y);
        }
        batch.end();

        particle.moveParticles();
    }

    /**
     * Close object which implements interface {@link com.badlogic.gdx.utils.Disposable}.
     */

    @Override
    public void dispose() {
        batch.dispose();
        particle.mainTexture.dispose();
    }
}
