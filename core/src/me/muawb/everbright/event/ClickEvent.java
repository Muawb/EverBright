package me.muawb.everbright.event;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector3;
import me.muawb.everbright.particles.ParticleBright;

public class ClickEvent extends InputAdapter {

    private ParticleBright particle;
    private Vector3 coordinates;

    public ClickEvent(ParticleBright bright, Vector3 coordinates){
        particle = bright;
        this.coordinates = coordinates;
    }

    @Override
    public boolean touchDown(int pos1, int pos2, int pointer, int button) {
        if (particle.isSleep()){
            particle.spawn(coordinates.x, coordinates.y);
        }
        return false;
    }
}
