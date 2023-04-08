package me.muawb.everbright.event;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector3;
import me.muawb.everbright.particles.ParticleBright;

/**
 * child class parents InputAdapter which are abstract class.
 * Overrides method {@link this#touchDown(int, int, int, int)},
 * invoked which user click mouse at screen.
 */

public class ClickEvent extends InputAdapter {

    private ParticleBright particle;

    //Describe body physical located in space.
    private Vector3 coordinates;

    public ClickEvent(ParticleBright bright, Vector3 coordinates){
        particle = bright;
        this.coordinates = coordinates;
    }

    /**
     * Invoked when user click mouse at screen.
     *
     * @param pos1
     *          it is x
     * @param pos2
     *          it is y
     * @param pointer
     * @param button
     *
     * @return
     *      result operation.
     */

    @Override
    public boolean touchDown(int pos1, int pos2, int pointer, int button) {
        if (particle.isSleep()){
            particle.spawn(coordinates.x, coordinates.y);
        }
        return false;
    }
}
