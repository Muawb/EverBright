package me.muawb.everbright.particles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.TimeUtils;

/**
 * Describe object particle. Allows spawn particle each one second
 * and set coordinates objects for movement.
 * Implements functionality interface {@link Disposable} which contain
 * method {@link this#dispose()}, which enable dispose object of memory.
 */

public class ParticleBright implements Disposable {

    //Declare references, which determine size particles.
    protected Rectangle obj;
    protected Rectangle obj1;
    protected Rectangle obj2;
    protected Rectangle obj3;
    protected Rectangle obj4;
    protected Rectangle obj5;
    protected Rectangle obj6;
    protected Rectangle obj7;
    protected Rectangle obj8;
    protected Rectangle obj9;
    protected Rectangle obj10;
    protected Rectangle obj11;
    protected Rectangle obj12;
    protected Rectangle obj13;
    protected Rectangle obj14;
    protected Rectangle obj15;
    protected Rectangle obj16;
    protected Rectangle obj17;
    protected Rectangle obj18;
    protected Rectangle obj19;
    protected Rectangle obj20;
    protected Rectangle obj21;
    protected Rectangle obj22;
    protected Rectangle obj23;
    protected Rectangle obj24;
    protected Rectangle obj25;

    //...

    //Determine texture for particles.
    private Texture mainTexture;
    //Need for play sound.
    private Sound clickAudioPlay;
    //Have list in Rectangles.
    private Array<Rectangle> listRectangle;

    //Determine time last spawn particle.
    private static long dropTime;

    public ParticleBright(String pathToTexture, String pathToAudioFile){
        Gdx.app.log("ParticleBright: ", "Call parametrized constructor.");
        mainTexture = new Texture(pathToTexture);
        clickAudioPlay = Gdx.audio.newSound(Gdx.files.internal(pathToAudioFile));
        listRectangle = new Array<>();

        obj = new Rectangle();
        obj1 = new Rectangle();
        obj2 = new Rectangle();
        obj3 = new Rectangle();
        obj4 = new Rectangle();
        obj5 = new Rectangle();
        obj6 = new Rectangle();
        obj7 = new Rectangle();
        obj8 = new Rectangle();
        obj9 = new Rectangle();
        obj10 = new Rectangle();
        obj11 = new Rectangle();
        obj12 = new Rectangle();
        obj13 = new Rectangle();
        obj14 = new Rectangle();
        obj15 = new Rectangle();
        obj16 = new Rectangle();
        obj17 = new Rectangle();
        obj18 = new Rectangle();
        obj19 = new Rectangle();
        obj20 = new Rectangle();
        obj21 = new Rectangle();
        obj22 = new Rectangle();
        obj23 = new Rectangle();
        obj24 = new Rectangle();
        obj25 = new Rectangle();

        dropTime = 0;
    }

    /**
     * Create particle and set they coordinate. Put their in Array, play sound.
     *
     * @param pos1
     *          x with screen
     * @param pos2
     *          y with screen
     */

    public void spawn(float pos1, float pos2){
        //Set configuration each object.
        obj.x = pos1;
        obj.y = pos2;
        obj.height = 5;
        obj.width = 5;

        obj1.x = pos1;
        obj1.y = pos2;
        obj1.height = 5;
        obj1.width = 5;

        obj2.x = pos1;
        obj2.y = pos2;
        obj2.height = 5;
        obj2.width = 5;

        obj3.x = pos1;
        obj3.y = pos2;
        obj3.height = 5;
        obj3.width = 5;

        obj4.x = pos1;
        obj4.y = pos2;
        obj4.height = 5;
        obj4.width = 5;

        obj5.x = pos1;
        obj5.y = pos2;
        obj5.height = 5;
        obj5.width = 5;

        obj6.x = pos1;
        obj6.y = pos2;
        obj6.height = 5;
        obj6.width = 5;

        obj7.x = pos1;
        obj7.y = pos2;
        obj7.height = 5;
        obj7.width = 5;

        obj8.x = pos1;
        obj8.y = pos2;
        obj8.height = 5;
        obj8.width = 5;

        obj9.x = pos1;
        obj9.y = pos2;
        obj9.height = 5;
        obj9.width = 5;

        obj10.x = pos1;
        obj10.y = pos2;
        obj10.height = 5;
        obj10.width = 5;

        obj11.x = pos1;
        obj11.y = pos2;
        obj11.height = 5;
        obj11.width = 5;

        obj12.x = pos1;
        obj12.y = pos2;
        obj12.height = 5;
        obj12.width = 5;

        obj13.x = pos1;
        obj13.y = pos2;
        obj13.height = 5;
        obj13.width = 5;

        obj14.x = pos1;
        obj14.y = pos2;
        obj14.height = 5;
        obj14.width = 5;

        obj15.x = pos1;
        obj15.y = pos2;
        obj15.height = 5;
        obj15.width = 5;

        obj16.x = pos1;
        obj16.y = pos2;
        obj16.height = 5;
        obj16.width = 5;

        obj17.x = pos1;
        obj17.y = pos2;
        obj17.height = 5;
        obj17.width = 5;

        obj18.x = pos1;
        obj18.y = pos2;
        obj18.height = 5;
        obj18.width = 5;

        obj19.x = pos1;
        obj19.y = pos2;
        obj19.height = 5;
        obj19.width = 5;

        obj20.x = pos1;
        obj20.y = pos2;
        obj20.height = 5;
        obj20.width = 5;

        obj21.x = pos1;
        obj21.y = pos2;
        obj21.height = 5;
        obj21.width = 5;

        obj22.x = pos1;
        obj22.y = pos2;
        obj22.height = 5;
        obj22.width = 5;

        obj23.x = pos1;
        obj23.y = pos2;
        obj23.height = 5;
        obj23.width = 5;

        obj24.x = pos1;
        obj24.y = pos2;
        obj24.height = 5;
        obj24.width = 5;

        obj25.x = pos1;
        obj25.y = pos2;
        obj.height = 5;
        obj.width = 5;

        //Add all objects to array.
        listRectangle.add(obj);
        listRectangle.add(obj1);
        listRectangle.add(obj2);
        listRectangle.add(obj3);
        listRectangle.add(obj4);
        listRectangle.add(obj5);
        listRectangle.add(obj6);
        listRectangle.add(obj7);
        listRectangle.add(obj8);
        listRectangle.add(obj9);
        listRectangle.add(obj10);
        listRectangle.add(obj11);
        listRectangle.add(obj12);
        listRectangle.add(obj13);
        listRectangle.add(obj14);
        listRectangle.add(obj15);
        listRectangle.add(obj16);
        listRectangle.add(obj17);
        listRectangle.add(obj18);
        listRectangle.add(obj19);
        listRectangle.add(obj20);
        listRectangle.add(obj21);
        listRectangle.add(obj22);
        listRectangle.add(obj23);
        listRectangle.add(obj24);
        listRectangle.add(obj25);

        //Receive time spawn.
        dropTime = TimeUtils.nanoTime();
        Gdx.app.log("ParticleBright: ", "Play audio file.");
        clickAudioPlay.play();
    }

    /**
     * Check, how many time passed after spawn particles.
     *
     * @return
     *      If passed one second, return true otherwise false.
     */

    public boolean isSleep(){
        if (TimeUtils.nanoTime() - dropTime > 1000000000L){
            Gdx.app.log("ParticleBright: ", "Spawn.");
            return true;
        }
        return false;
    }

    /**
     * Set coordinate each object, what be object movement in right destination.
     */

    public void moveParticles(){
        obj.x -= 30 * Gdx.graphics.getDeltaTime();
        obj.y -= 152 * Gdx.graphics.getDeltaTime();

        obj1.x -= 70 * Gdx.graphics.getDeltaTime();
        obj1.y -= 145 * Gdx.graphics.getDeltaTime();

        obj2.x -= 110 * Gdx.graphics.getDeltaTime();
        obj2.y -= 130 * Gdx.graphics.getDeltaTime();

        obj3.x -= 140 * Gdx.graphics.getDeltaTime();
        obj3.y -= 110 * Gdx.graphics.getDeltaTime();

        obj4.x -= 165 * Gdx.graphics.getDeltaTime();
        obj4.y -= 80 * Gdx.graphics.getDeltaTime();

        obj5.x -= 180 * Gdx.graphics.getDeltaTime();        //left down
        obj5.y -= 40 * Gdx.graphics.getDeltaTime();



        obj6.x -= 185 * Gdx.graphics.getDeltaTime();        //left mid
        obj6.y -= 0 * Gdx.graphics.getDeltaTime();



        obj7.x -= 180 * Gdx.graphics.getDeltaTime();        //left up after mid
        obj7.y += 40 * Gdx.graphics.getDeltaTime();

        obj8.x -= 165 * Gdx.graphics.getDeltaTime();
        obj8.y += 80 * Gdx.graphics.getDeltaTime();

        obj9.x -= 140 * Gdx.graphics.getDeltaTime();
        obj9.y += 110 * Gdx.graphics.getDeltaTime();

        obj10.x -= 110 * Gdx.graphics.getDeltaTime();
        obj10.y += 130 * Gdx.graphics.getDeltaTime();

        obj12.x -= 70 * Gdx.graphics.getDeltaTime();
        obj12.y += 145 * Gdx.graphics.getDeltaTime();

        obj13.x -= 20 * Gdx.graphics.getDeltaTime();
        obj13.y += 152 * Gdx.graphics.getDeltaTime();



        obj14.x += 30 * Gdx.graphics.getDeltaTime();
        obj14.y += 152 * Gdx.graphics.getDeltaTime();

        obj15.x += 70 * Gdx.graphics.getDeltaTime();
        obj15.y += 145 * Gdx.graphics.getDeltaTime();

        obj17.x += 110 * Gdx.graphics.getDeltaTime();
        obj17.y += 130 * Gdx.graphics.getDeltaTime();

        obj18.x += 140 * Gdx.graphics.getDeltaTime();
        obj18.y += 110 * Gdx.graphics.getDeltaTime();

        obj19.x += 165 * Gdx.graphics.getDeltaTime();
        obj19.y += 80 * Gdx.graphics.getDeltaTime();

        obj20.x += 180 * Gdx.graphics.getDeltaTime();
        obj20.y += 40 * Gdx.graphics.getDeltaTime();        //right up after mid


        obj16.x += 185 * Gdx.graphics.getDeltaTime();
        obj16.y -= 0 * Gdx.graphics.getDeltaTime();     //right mid


        obj21.x += 180 * Gdx.graphics.getDeltaTime();   //right down after mid
        obj21.y -= 40 * Gdx.graphics.getDeltaTime();

        obj22.x += 165 * Gdx.graphics.getDeltaTime();
        obj22.y -= 80 * Gdx.graphics.getDeltaTime();

        obj23.x += 140 * Gdx.graphics.getDeltaTime();
        obj23.y -= 110 * Gdx.graphics.getDeltaTime();

        obj24.x += 110 * Gdx.graphics.getDeltaTime();
        obj24.y -= 130 * Gdx.graphics.getDeltaTime();

        obj25.x += 70 * Gdx.graphics.getDeltaTime();
        obj25.y -= 145 * Gdx.graphics.getDeltaTime();

        obj11.x += 30 * Gdx.graphics.getDeltaTime();
        obj11.y -= 152 * Gdx.graphics.getDeltaTime();
    }

    /**
     * Return object {@code mainTexture}
     * @return
     */

    public Texture getMainTexture() {
        return mainTexture;
    }

    /**
     * Return object {@code listRectangle}
     * @return
     */

    public Array<Rectangle> getListRectangle() {
        return listRectangle;
    }

    /**
     * Enable dispose object of memory.
     */

    @Override
    public void dispose() {
        mainTexture.dispose();
        clickAudioPlay.dispose();
    }
}
