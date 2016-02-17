package util;

import java.awt.Color;
import java.util.ArrayList;

public class Parser {

	public static Color ColorFromString (String string) {
		
		String s = string.toLowerCase().trim();
		if (s.equals("black")) return new Color(0,0,0);
		if (s.equals("blue")) return new Color(0,0,255);
		if (s.equals("cyan")) return new Color(0,255,255);
		if (s.equals("red")) return new Color(255,0,0);
		if (s.equals("yellow")) return new Color(255,255,0);
		if (s.equals("white")) return new Color(255,255,255);
		if (s.equals("magenta")) return new Color(255,0,255);
		if (s.equals("green")) return new Color(0,255,0);
		if (s.equals("gray")) return new Color(127,127,127);
		
		String[] t = s.split("[,|\\.|\\s]+");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (String a : t)
		{
			try
			{
				int c = Integer.parseInt(a);
				if (c<0) c=0;
				if (c>255) c=255;
				list.add(c);
			}
			catch (NumberFormatException e){}
		}
		
		Integer[] out = new Integer[list.size()];
		out = (Integer[]) list.toArray(out);
		
		if (out.length>=4) return new Color(out[0],out[1],out[2],out[3]);
		if (out.length>=3) return new Color(out[0],out[1],out[2]);
		return null;
	}
	
}
