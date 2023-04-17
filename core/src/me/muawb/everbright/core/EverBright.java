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
        setCoordinates(Gdx.input.getX(), Gdx.input.getY(), 0);
        //Defined matrix for SpriteBatch and update it.
        update();

        //Draw.
        draw();

        particle.moveParticles();
    }

    /**
     * Update matrix which contain SpriteBatch.
     */

    public void update(){
        batch.setProjectionMatrix(mainCamera.combined);
        mainCamera.update();
    }

    /**
     * With use Vector3 we very definitely specify a coordinate from the screen.
     *
     * @param x
     *      x coordinate
     * @param y
     *      y coordinate
     * @param z
     *      z coordinate
     */

    public void setCoordinates(int x, int y, int z){
        //Set coordinate.
        coordinateVector.set(x, y, z);
        //Put their in matrix.
        mainCamera.unproject(coordinateVector);
    }

    /**
     * This is method enable a draw object and texture with use SpriteBatch.
     * Here we do iteration for Collection which contain of Rectangle, and draw it.
     */

    public void draw(){
        batch.begin(); // Start draw.
        for (Rectangle rect : particle.getListRectangle()){
            batch.draw(particle.getMainTexture(), rect.x, rect.y);
        }
        batch.end(); // End draw.
    }

    /**
     * Close object which implements interface {@link com.badlogic.gdx.utils.Disposable}.
     */

    @Override
    public void dispose() {
        batch.dispose();
        particle.dispose();
    }
}
