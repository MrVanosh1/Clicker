package pl.clicker.game.screens;

import com.badlogic.gdx.graphics.Texture;

import pl.clicker.game.ClickerGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(ClickerGame game) {
		super(game);
		init();
	}

	private void init() {
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
