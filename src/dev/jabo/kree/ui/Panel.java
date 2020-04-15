package dev.jabo.kree.ui;

import java.awt.Color;
import java.awt.Graphics;

import dev.jabo.kree.Scene;
import dev.jabo.kree.Vector2;

public class Panel extends UserInterface {
	
	private Color color;
	
	public Panel(Scene parentScene, Vector2 position, Vector2 scale) {
		
		transform.position = position;
		transform.scale = scale;
		
		AddToScene(parentScene);
		
	}

	@Override
	public void Update() {
		
	}

	@Override
	public void Render(Graphics g) {
		
		g.setColor(color);		
		g.fillRect(transform.position.x, transform.position.y, transform.scale.x, transform.scale.x);
		
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

}