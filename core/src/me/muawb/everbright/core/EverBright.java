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

public class EverBright extends ApplicationAdapter {

    private ParticleBright particle;
    private OrthographicCamera mainCamera;
    private SpriteBatch batch;
    private Vector3 coordinateVector;

    @Override
    public void create() {
        batch = new SpriteBatch();
        coordinateVector = new Vector3();
        particle = new ParticleBright("image/light.png", "sounds/bright.mp3");

        mainCamera = new OrthographicCamera();
        mainCamera.setToOrtho(false);

        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        Gdx.input.setInputProcessor(new ClickEvent(particle, coordinateVector));
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0,0,0,0.2f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        coordinateVector.set(Gdx.input.getX(), Gdx.input.getY(), 0);
        mainCamera.unproject(coordinateVector);
        batch.setProjectionMatrix(mainCamera.combined);
        mainCamera.update();

        batch.begin();
        for (Rectangle rect: particle.listRectangle){
            batch.draw(particle.mainTexture, rect.x, rect.y);
        }
        batch.end();

        particle.moveParticles();
    }

    @Override
    public void dispose() {
        batch.dispose();
        particle.mainTexture.dispose();
    }
}
