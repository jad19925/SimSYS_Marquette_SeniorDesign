package gamePlayEngine.util;

import gamePlayEngine.model.gameElement.graphic.Location;
import gamePlayEngine.model.gameElement.graphic.Prop;
import gamePlayEngine.model.gameElement.player.Size;
import gamePlayEngine.view.util.RoundedPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;

import javax.swing.JPanel;

public class Util {

	// Change the string color to Color object.
	public static Color StringToColor(String col) {
		Color color = new Color(255, 0, 0);

		Field field;
		try {
			field = Color.class.getField(col);
			color = (Color) field.get(null);
		} catch (Exception e) {
			color = new Color(255, 0, 0);
		}
		return color;
	}

	public static Dimension panelDimension(Size size) {
		Dimension dimension = new Dimension();
		switch (size) {
		case SMALL:
			dimension.height = 50;
			dimension.width = 100;
			break;
		case MEDIUM:
			dimension.height = 100;
			dimension.width = 200;
			break;
		case LARGE:
			dimension.height = 200;
			dimension.width = 400;
			break;

		}
		return dimension;
	}

	public static JPanel panelPosition(Location location,boolean isInformationBox,Prop prop) {
		JPanel jPanel = new JPanel();
		if(isInformationBox){
			jPanel = new RoundedPanel(prop);
		}
		switch (location) {
		case UUR:
			jPanel.setBounds(0, 0, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UURC:
			jPanel.setBounds(200, 0, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UUC:
			jPanel.setBounds(400, 0, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UULC:
			jPanel.setBounds(600, 0, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UUL:
			jPanel.setBounds(800, 0, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UR:
			jPanel.setBounds(0, 160, 200, 160);
			jPanel.setOpaque(true);
			break;
		case URC:
			jPanel.setBounds(200, 160, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UC:
			jPanel.setBounds(400, 160, 200, 160);
			jPanel.setOpaque(true);
			break;
		case ULC:
			jPanel.setBounds(600, 160, 200, 160);
			jPanel.setOpaque(true);
			break;
		case UL:
			jPanel.setBounds(800, 160, 200, 160);
			jPanel.setOpaque(true);
			break;
		case R:
			jPanel.setBounds(0, 320, 200, 160);
			jPanel.setOpaque(true);
			break;
		case RC:
			jPanel.setBounds(200, 320, 200, 160);
			jPanel.setOpaque(true);
			break;
		case C:
			jPanel.setBounds(400, 320, 200, 160);
			jPanel.setOpaque(true);
			break;
		case LC:
			jPanel.setBounds(600, 320, 200, 160);
			jPanel.setOpaque(true);
			break;
		case L:
			jPanel.setBounds(800, 320, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DR:
			jPanel.setBounds(0, 480, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DRC:
			jPanel.setBounds(200, 480, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DC:
			jPanel.setBounds(400, 480, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DLC:
			jPanel.setBounds(600, 480, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DL:
			jPanel.setBounds(800, 480, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DDR:
			jPanel.setBounds(0, 640, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DDRC:
			jPanel.setBounds(200, 640, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DDC:
			jPanel.setBounds(40, 640, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DDLC:
			jPanel.setBounds(600, 640, 200, 160);
			jPanel.setOpaque(true);
			break;
		case DDL:
			jPanel.setBounds(800, 640, 200, 160);
			jPanel.setOpaque(true);
			break;
		}

		return jPanel;
	}
}
