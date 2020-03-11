package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch sb;
	private OrthographicCamera cam;
	private Player player;
	//private InputHandler inputHandler;
	private float delta;

	private TiledMap tileMap;
	private OrthogonalTiledMapRenderer tileMapRenderer;

	@Override
	public void create () {
		sb = new SpriteBatch();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, 312, 192);
		sb.setProjectionMatrix(cam.combined);

		player = new Player();
		//inputHandler = new InputHandler();

		tileMap = new TmxMapLoader().load("level1.tmx");
		tileMapRenderer = new OrthogonalTiledMapRenderer(tileMap);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		delta = Gdx.graphics.getDeltaTime();

		// updates

		//drag
		//if (Gdx.input.isTouched()) {
            //Vector3 touchPos = new Vector3();
            //touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            //cam.unproject(touchPos);
            //player.update(touchPos);
           //player.y = touchPos.y;
           //player.x = touchPos.x;
		//}

		//tile
		if (Gdx.input.isTouched()) {
			Vector3 touchPos = new Vector3();
			if (Gdx.input.getY() > 200)
				player.y = player.y - 1;
			if (Gdx.input.getY() < 600)
				player.y = player.y + 1;

			if (Gdx.input.getX() > 1000)
				player.x = player.x + 1;
			if (Gdx.input.getX() < 200)
				player.x = player.x - 1;
		}
		// rendering
		tileMapRenderer.setView(cam);
		tileMapRenderer.render();
		sb.begin();
		player.render(sb);
		sb.end();

		// camera movement
		//cam.translate(10 * delta,0,0);
		cam.update();
	}
}