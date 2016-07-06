package pl.clicker.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.clicker.game.ClickerGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = ClickerGame.GAME_NAME;
		config.width = ClickerGame.Width;
		config.height = ClickerGame.Height;
		config.resizable = false;
		new LwjglApplication(new ClickerGame(), config);
	}
}
