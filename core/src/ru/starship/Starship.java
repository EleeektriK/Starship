package ru.starship;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class Starship extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Texture texture;
	private TextureRegion region;


	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		texture = new Texture("space.jpg");
		region = new TextureRegion(texture,1440,900);

	}

	@Override
	public void render () {
		ScreenUtils.clear(0.51f, 0.21f, 0.4f, 1);
		batch.begin();
		batch.draw(texture, 0, 0);
		batch.draw(region, 0, 0);
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
