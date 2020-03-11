package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player {

    public float x, y;
    private Texture ship_up, ship_middle, ship_down;

    public Player() {
        x = 312 / 2;
        y = 192 / 2;

        loadPlayerTextures();
    }

    public void update (float delta){

    }

    public void render (SpriteBatch sb){
        sb.draw(ship_middle,x,y);
    }

    public void loadPlayerTextures(){
        ship_middle = new Texture("ship_middle.png");
        ship_up = new Texture("ship_up.png");
        ship_down = new Texture("ship_down.png");
    }
}
