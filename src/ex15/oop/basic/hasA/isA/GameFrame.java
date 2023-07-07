package ex15.oop.basic.hasA.isA;

import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
	@Override
	public void paint(Graphics g) {
		g.drawLine(0, 0, 300, 300);
	}
}
