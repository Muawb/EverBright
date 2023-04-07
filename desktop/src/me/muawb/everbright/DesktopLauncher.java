package me.muawb.everbright;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import me.muawb.everbright.core.EverBright;

public class DesktopLauncher {

	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("EverBright");
		config.setWindowedMode(700, 500);
		new Lwjgl3Application(new EverBright(), config);
	}
}
