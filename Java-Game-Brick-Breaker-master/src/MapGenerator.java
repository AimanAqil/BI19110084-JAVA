import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator 
{
	public int map[][];
	public int blockwidth;
	public int blockheight;
	
	public MapGenerator (int row, int col)
	{
		map = new int[row][col];		
		for(int i = 0; i<map.length; i++)
		{
			for(int j =0; j<map[0].length; j++)
			{
				map[i][j] = 1;
			}			
		}
		
		blockwidth = 555/col;
		blockheight = 150/row;
	}	
	
	public void draw(Graphics2D g)
	{
		for(int i = 0; i<map.length; i++)
		{
			for(int j =0; j<map[0].length; j++)
			{
				if(map[i][j] > 0)
				{
					g.setColor(Color.blue);
					g.fillRect(j * blockwidth + 80, i * blockheight + 50, blockwidth, blockheight);
					
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * blockwidth + 80, i * blockheight + 50, blockwidth, blockheight);				
				}
			}
		}
	}
	
	public void BrickValue(int value, int row, int col)
	{
		map[row][col] = value;
	}
}
