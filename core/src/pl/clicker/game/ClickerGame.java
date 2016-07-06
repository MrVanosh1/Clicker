package pl.clicker.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pl.clicker.game.screens.SplashScreen;

public class ClickerGame extends Game {
	public final static String GAME_NAME = "Clicker Game";
	
	public static int Width = 480;
	public static int Height = 700;
	
	private boolean paused;
	
	
	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}


	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	
}
