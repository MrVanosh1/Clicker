package pl.clicker.game.screens;

import pl.clicker.game.ClickerGame;
import pl.clicker.game.entities.Player;

public class GameplayScreen extends AbstractScreen {

	private Player player;
	
	@Override
	protected void init() {
		initPlayer();
	}
	
	public GameplayScreen(ClickerGame game) {
		super(game);
	}


	private void initPlayer() {
		player = new Player();
		stage.addActor(player);
	}
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		super.render(delta);
		update();
		
		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();
	}

	private void update() {
		stage.act();
	}

}
