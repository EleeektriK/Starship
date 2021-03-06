package ru.starship;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Starship extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");


	}

	@Override
	public void render () {
		ScreenUtils.clear(0.51f, 0.21f, 0.4f, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
