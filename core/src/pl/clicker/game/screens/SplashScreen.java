package pl.clicker.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

import pl.clicker.game.ClickerGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(final ClickerGame game) {
		super(game);
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new GameplayScreen(game));
			}
		}, 1);
	}
	
	@Override
	protected void init() {
		// TODO IMPLEMENT BETTER ASSETS LOADING WHEN GAME GROWS
		splashImg = new Texture("badlogic.jpg");
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg, 0, 0);
		spriteBatch.end();
	}

}
