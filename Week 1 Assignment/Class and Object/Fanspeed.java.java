package dxc;

class fan
{
	private int speed=1;
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	
	
	public fan(int speed,boolean on,double radius,String color)
	{
		this.speed=speed;
		this.on=on;
		this.radius=radius;
		this.color=color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	void tostring()
	{
		if(on==true )
		{
			System.out.println("Fanspeed :"+speed+" color :"+color+" Radius:"+radius);
		}
		else
		{
			System.out.println("color :"+color+" Radius :"+radius+" Fan is off");
		}
	}
}
public class Fanspeed {

	public static void main(String[] args)
	{
	
		fan f=new fan(2, true, 6, "white");
		f.tostring();

	}

}