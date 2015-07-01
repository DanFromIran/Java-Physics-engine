import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;



public class CircleTest extends JComponent implements Runnable
{
    //                                    AABB friction, ballCollision Friction, drag Friction,    time factor
    PhysicsEngine PE = new PhysicsEngine ( 1,            20,                      0 ,               8 );
    boolean firstFrame = true;

    public CircleTest ()
    {
	Thread t = new Thread (this);
	t.start ();
    }


    public void run ()
    {
	try
	{
	    while (true)
	    {
		timeStep ();
		repaint ();
		Thread.sleep (1);
	    }
	}
	catch (InterruptedException ie)
	{
	}
    }


    public void paint (Graphics g)
    {
	Graphics2D g2 = (Graphics2D) g;
	g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
	Circle ball1 = PE.getCircle ("ball1"), ball2 = PE.getCircle ("ball2"), ball3 = PE.getCircle ("ball3");
	Circle ball4 = PE.getCircle ("ball4"), ball5 = PE.getCircle ("ball5"), ball6 = PE.getCircle ("ball6");
	Circle ball7 = PE.getCircle ("ball7"), ball8 = PE.getCircle ("ball8"), ball9 = PE.getCircle ("ball9");
	Circle ball10 = PE.getCircle ("ball10"), ball11 = PE.getCircle ("ball11"), ball12 = PE.getCircle ("ball12");
	
	Ellipse2D circle1 = new Ellipse2D.Double (ball1.pos.x - ball1.r, ball1.pos.y - ball1.r, ball1.r * 2, ball1.r * 2);
	Ellipse2D circle2 = new Ellipse2D.Double (ball2.pos.x - ball2.r, ball2.pos.y - ball2.r, ball2.r * 2, ball2.r * 2);
	Ellipse2D circle3 = new Ellipse2D.Double (ball3.pos.x - ball3.r, ball3.pos.y - ball3.r, ball3.r * 2, ball3.r * 2);
	Ellipse2D circle4 = new Ellipse2D.Double (ball4.pos.x - ball4.r, ball4.pos.y - ball4.r, ball4.r * 2, ball4.r * 2);
	Ellipse2D circle5 = new Ellipse2D.Double (ball5.pos.x - ball5.r, ball5.pos.y - ball5.r, ball5.r * 2, ball5.r * 2);
	Ellipse2D circle6 = new Ellipse2D.Double (ball6.pos.x - ball6.r, ball6.pos.y - ball6.r, ball6.r * 2, ball6.r * 2);
	Ellipse2D circle7 = new Ellipse2D.Double (ball7.pos.x - ball7.r, ball7.pos.y - ball7.r, ball7.r * 2, ball7.r * 2);
	Ellipse2D circle8 = new Ellipse2D.Double (ball8.pos.x - ball8.r, ball8.pos.y - ball8.r, ball8.r * 2, ball8.r * 2);
	Ellipse2D circle9 = new Ellipse2D.Double (ball9.pos.x - ball9.r, ball9.pos.y - ball9.r, ball9.r * 2, ball9.r * 2);
	Ellipse2D circle10 = new Ellipse2D.Double (ball10.pos.x - ball10.r, ball10.pos.y - ball10.r, ball10.r * 2, ball10.r * 2);
	Ellipse2D circle11 = new Ellipse2D.Double (ball11.pos.x - ball11.r, ball11.pos.y - ball11.r, ball11.r * 2, ball11.r * 2);
	Ellipse2D circle12 = new Ellipse2D.Double (ball12.pos.x - ball12.r, ball12.pos.y - ball12.r, ball12.r * 2, ball12.r * 2);
	Rectangle box = new Rectangle (10, 10, 1200, 700);
	g2.setPaint (Color.green);
	g2.fill (box);
	g2.setPaint (Color.red);
	g2.fill (circle1);
	g2.setPaint (Color.blue);
	g2.fill (circle2);
	g2.setPaint (Color.red);
	g2.fill (circle3);
	g2.fill (circle9);
	g2.setPaint (Color.pink);
	g2.fill (circle4);
	g2.fill (circle7);
	 g2.setPaint (Color.red);
	g2.fill (circle8);
	g2.setPaint (Color.black);
	g2.fill (circle5);     
	g2.fill (circle12);   
	g2.fill (circle6);
	g2.fill (circle11);
	g2.fill (circle10);
	
    }


    private void timeStep ()
    {
	if (firstFrame)
	{
	    addObjects ();
	    firstFrame = false;
	}
	PE.Update ();
    }


    private void addObjects ()
    {
    
    

	PE.addCircle ("ball1", 100, 100, 2, 0, 0, 0, 10);
	PE.addCircle ("ball2", 100, 140, 2, 0, 0, 0, 10);
	PE.addCircle ("ball3", 100, 180, 2, 0, 0, 0, 10);
	PE.addCircle ("ball4", 100, 220, 2, 0, 0, 0, 10);
	PE.addCircle ("ball5", 100, 260, 2, 0, 0, 0, 10);
	PE.addCircle ("ball6", 100, 300, 2, 0, 0, 0, 10);
	PE.addCircle ("ball7", 100, 340, 2, 0, 0, 0, 10);
	PE.addCircle ("ball8", 100, 380, 2, 0, 0, 0, 10);
	PE.addCircle ("ball9", 650, 320, -0.0001, 0, 0, 0, 200, 200);
	PE.addCircle ("ball10", 100, 420, 2, 0, 0, 0, 10);
	PE.addCircle ("ball11", 100, 460, 2, 0, 0, 0, 10);
	PE.addCircle ("ball12", 100, 500, 2, 0, 0, 0, 10);
    
	
	// PE.addCircle ("ball1", 920, 140, 0.4, -0.4, 0, 0, 23);
	// PE.addCircle ("ball2", 270, 160, 0.8, 2.3, 0, 0, 18);
	// PE.addCircle ("ball3", 750, 130, 0.1, 1.3, 0, 0, 17);
	// PE.addCircle ("ball4", 320, 140, 0.4, -3.4, 0, 0, 19);
	// PE.addCircle ("ball5", 470, 160, 0, 2.3, 0, 0, 10);
	// PE.addCircle ("ball6", 550, 130, 0.7, 1.3, 0, 0, 11);
	// PE.addCircle ("ball7", 220, 240, 1.4, -2.4, 0, 0, 13);
	// PE.addCircle ("ball8", 270, 360, 0.8, 2.3, 0, 0, 18);
	// PE.addCircle ("ball9", 280, 430, 1, 0.1, 0, 0,17, 57);
	// PE.addCircle ("ball10", 320, 440, -0.1, 2.4, 0, 0, 13);
	// PE.addCircle ("ball11", 470, 360, 0.2, 1.8, 0, 0, 18);
	// PE.addCircle ("ball12", 550, 530, -3.7, 1.3, 0, 0, 17);
	
	

	// PE.addCircle ("ball1", 220, 140, 0.4, 0, 0, 0.01, 23);
	// PE.addCircle ("ball2", 270, 160, 0.8, 0, 0, 0.01, 18);
	// PE.addCircle ("ball3", 150, 130, 0, 0, 0, 0.01, 17);
	// PE.addCircle ("ball4", 320, 140, 0.4, 0, 0, 0.01, 23);
	// PE.addCircle ("ball5", 470, 160, 0, 0, 0, 0.01, 18);
	// PE.addCircle ("ball6", 550, 130, 0.7, 0, 0, 0.01, 17);
	// PE.addCircle ("ball7", 220, 240, 0.4, 0, 0, 0.01, 23);
	// PE.addCircle ("ball8", 270, 360, 0.8, 0, 0, 0.01, 18);
	// PE.addCircle ("ball9", 150, 430, 0, 0, 0, 0.01, 47);
	// PE.addCircle ("ball10", 320, 440, 0.4, 0, 0, 0.01, 23);
	// PE.addCircle ("ball11", 470, 360, 0.2, 0, 0, 0.01, 18);
	// PE.addCircle ("ball12", 550, 530, 0.7, 0, 0, 0.01, 17);
	// 
	PE.addAABB ("box", 10, 10, 1200, 700);
    }


    public static void main (String[] args)
    {

	JFrame f = new JFrame ("Circle Test");
	f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	f.getContentPane ().add (new CircleTest ());
	f.setSize (1250, 1000);
	f.setVisible (true);
    }
}

class PhysicsEngine
{
    public Vector Objects = new Vector ();
    public Vector AABBs = new Vector ();
    public double frictionWithAABB;
    public double BallBallFriction;
    public double timeScale;
    public double dragFriction;
    int objectNum = 0;

    double lasttime = 0, time = 0;

    public PhysicsEngine()
    {
    this.frictionWithAABB=1;
    this.BallBallFriction=1;
    this.timeScale=10;
    this.dragFriction=1;
    }
    
    public PhysicsEngine(double AABBFriction,double BallBallCollisionFriction, double drag)
    {
    this.frictionWithAABB=AABBFriction;
    this.BallBallFriction=BallBallCollisionFriction;
    this.dragFriction=drag;
    }
    
    public PhysicsEngine(double AABBFriction,double BallBallCollisionFriction,double drag, double timeFactor)
    {
    this.frictionWithAABB=AABBFriction;
    this.BallBallFriction=1 - 0.01*BallBallCollisionFriction;
    this.dragFriction=1 - drag*0.0001;
    this.timeScale=timeFactor;
    }
    
    public void addParticle ()
    {
	Objects.add (new Particle ("##" + objectNum));
	objectNum++;
    }


    public void addParticle (String label)
    {
	Objects.add (new Particle (label, 1, 0, 0, 0, 0, 0, 0));
    }


    public void addParticle (String label, double x, double y, double vx, double vy, double ax, double ay)
    {
	Objects.add (new Particle (label, 1, x, y, vx, vy, ax, ay));
    }


    public void addParticle (double x, double y, double vx, double vy, double ax, double ay)
    {
	Objects.add (new Particle ("##" + objectNum, 1, x, y, vx, vy, ax, ay));
	objectNum++;
    }


    public void addParticle (String label, Vec2D pos, Vec2D vel, Vec2D acc)
    {
	Objects.add (new Particle (label, 1, pos, vel, acc));
    }


    public void addParticle (Vec2D pos, Vec2D vel, Vec2D acc)
    {
	Objects.add (new Particle ("##" + objectNum, 1, pos, vel, acc));
	objectNum++;
    }


    public void addCircle ()
    {
	Objects.add (new Circle ("##" + objectNum, 1));
	objectNum++;
    }


    public void addCircle (String label)
    {
	Objects.add (new Circle (label, 1, 0, 0, 0, 0, 0, 0, 1));
    }


    public void addCircle (String label, double radius)
    {
	Objects.add (new Circle (label, 1, 0, 0, 0, 0, 0, 0, radius));
    }


    public void addCircle (String label, double x, double y, double vx, double vy, double ax, double ay)
    {
	Objects.add (new Circle (label, 1, x, y, vx, vy, ax, ay, 1));
    }


    public void addCircle (String label, double x, double y, double vx, double vy, double ax, double ay, double radius)
    {
	Objects.add (new Circle (label, 1, x, y, vx, vy, ax, ay, radius));
    }

    public void addCircle (String label, double x, double y, double vx, double vy, double ax, double ay, double mass, double radius)
    {
	Objects.add (new Circle (label, mass, x, y, vx, vy, ax, ay, radius));
    }


    public void addCircle (double x, double y, double vx, double vy, double ax, double ay)
    {
	Objects.add (new Circle ("##" + objectNum, 1, x, y, vx, vy, ax, ay, 1));
	objectNum++;
    }


    public void addCircle (String label, Vec2D pos, Vec2D vel, Vec2D acc)
    {
	Objects.add (new Circle (label, 1, pos, vel, acc, 1));
    }


    public void addCircle (String label, Vec2D pos, Vec2D vel, Vec2D acc, double radius)
    {
	Objects.add (new Circle (label, 1, pos, vel, acc, radius));
    }


    public void addCircle (Vec2D pos, Vec2D vel, Vec2D acc)
    {
	Objects.add (new Circle ("##" + objectNum, 1, pos, vel, acc, 1));
	objectNum++;
    }


    public void addAABB ()
    {
	AABBs.add (new AABB ("##" + objectNum));
	objectNum++;
    }


    public void addAABB (String name)
    {
	AABBs.add (new AABB (name));
    }


    public void addAABB (double x, double y, double width, double height)
    {
	AABBs.add (new AABB ("##" + objectNum, x, y, width, height));
	objectNum++;
    }


    public void addAABB (String name, double x, double y, double width, double height)
    {
	AABBs.add (new AABB (name, x, y, width, height));
    }


    public Particle getParticle (String name)
    {
	for (int i = 0 ; i < Objects.size () ; i++)
	{
	    if (Objects.get (i) instanceof Particle)
	    {
		Particle current = (Particle) Objects.get (i);
		if (current.name == name)
		    return current;
	    }
	}
	return new Particle ();
    }


    public Circle getCircle (String name)
    {
	for (int i = 0 ; i < Objects.size () ; i++)
	{
	    if (Objects.get (i) instanceof Circle)
	    {
		Circle current = (Circle) Objects.get (i);
		if (current.name == name)
		    return current;
	    }
	}
	return new Circle ();
    }



    public double getTimeSinceLast ()
    {
	if (lasttime == 0)
	{
	    lasttime = System.currentTimeMillis ();
	    return 0;
	}
	time = System.currentTimeMillis ();
	double timedif = time - lasttime;
	lasttime = time;
	return timedif / this.timeScale;
       
    }


    public void Update ()
    {
	double updateTime = getTimeSinceLast ();
	if (updateTime == 0)
	    return;
	AABBCollisionResolution ();
	ballCollisionResolution ();

	for (int i = 0 ; i < Objects.size () ; i++)
	{
	    if (Objects.get (i) instanceof Particle)
	    {
		Particle current = (Particle) Objects.get (i);
		current.Update (updateTime,this.dragFriction); //updates the velocity and position of particles
		
	    }
	}
    }


    private void AABBCollisionCheck (Circle a, AABB b)
    {
	xAxis (a, b); //checks collision for x axis
	yAxis (a, b); //checks collision for y axis

    }


    private void xAxis (Circle a, AABB b)
    {
	double right = b.getR ();
	double vel = a.v.x;
	double pos = a.pos.x;
	if ((pos + vel) > right - a.r)
	{
	    a.pos.x = right - a.r;
	    a.v.x *= (-1); // if it hit the boundary just reverse the movement
	    //FrictionwithAABB:
	    a.v.scalarMul(this.frictionWithAABB);
	    return;
	}


	double left = b.x;

	if ((pos + vel) < left + a.r)
	{
	    a.pos.x = left + a.r;
	    a.v.x *= (-1);
	    //FrictionwithAABB:
	    a.v.scalarMul(this.frictionWithAABB);
	    return;
	}
    }


    private void yAxis (Circle a, AABB b)
    {
	double down = b.getD ();
	double vel = a.v.y;
	double pos = a.pos.y;
	if ((pos + vel) > down - a.r)
	{
	    a.pos.y = (down - a.r);
	    a.v.y *= (-1);
	    //FrictionwithAABB:
	    a.v.scalarMul(this.frictionWithAABB);
	    return;
	}


	double up = b.y;


	if ((pos + vel) < up + a.r)
	{
	    a.pos.y = up + a.r;
	    a.v.y *= (-1);
	 //FrictionwithAABB:
	 a.v.scalarMul(this.frictionWithAABB);
	    return;
	}
    }




    public void AABBCollisionResolution ()
    {
	for (int i = 0 ; i < Objects.size () ; i++)
	{
	    if (Objects.get (i) instanceof Circle)
	    {
		Circle current = (Circle) Objects.get (i);
		for (int j = 0 ; j < AABBs.size () ; j++)
		{

		    AABB box = (AABB) AABBs.get (j);
		    AABBCollisionCheck (current, box);
		}
	    }
	}
    } //end of public void AABBCollisionResolution()




    private void CircleCircleResolution (Circle circle1, Circle circle2)
    {
	Vec2D v1 = circle1.v; // Temporary variables for circle's velocities.
	Vec2D v2 = circle2.v;

	Vec2D n = new Vec2D (circle1.pos.x - circle2.pos.x, circle1.pos.y - circle2.pos.y).Norm (); //Creates a normalized vector along the point of collision.

	double a1 = Vec2D.Dot (n, v1); // Projects the velocites onto the normalized vector from above
	double a2 = Vec2D.Dot (n, v2);

	double optimizedP = (2 * (a1 - a2)) / (circle1.mass + circle2.mass); // finds the change in momentum between the two objects

	//System.out.println(v1.Display() + "\n" +  v2.Display());
	Vec2D v1Final = v1.Sub (n.scalMul (optimizedP * circle2.mass)); // calculates the final velocities of the balls.
	Vec2D v2Final = v2.Add (n.scalMul (optimizedP * circle1.mass));
	
	v1Final.scalarMul(this.BallBallFriction);
	v2Final.scalarMul(this.BallBallFriction);
	
	circle1.v = v1Final;
	circle2.v = v2Final;


	

    }




    public void ballCollisionResolution ()
    {

	for (int i = 0 ; i < Objects.size () ; i++)
	{
	    if (Objects.get (i) instanceof Circle)
	    {
		Circle b1 = (Circle) Objects.get (i);

		for (int j = i + 1 ; j < Objects.size () ; j++)
		{
		    if (Objects.get (j) instanceof Circle)
		    {

			Circle b2 = (Circle) Objects.get (j);

			if (Vec2D.magSquared (b2.v) == 0)
			{

			    if (stationaryCheck (b1, b2))

				CircleCircleResolution (b1, b2);
			}
			/*else if (Vec2D.magSquared (b1.v) == 0)
			{
			    if (stationaryCheck (b2, b1))
				CircleCircleResolution (b2, b1);
			}*/
			else
			{

			    if (movingCheck (b1, b2))

				CircleCircleResolution (b1, b2);
			}
		    }
		}
	    }
	} //end of outer for loop
    } //end of public void AABBCollisionResolution()




    private boolean stationaryCheck (Circle a1, Circle a2)
    {
	//create a vector from center of a1 to center of a2 called C
	Vec2D C = new Vec2D (a2.pos.x - a1.pos.x, a2.pos.y - a1.pos.y);

	double d1 = C.Mag (); //d1 is the distance between centers.
	double sumr = a1.r + a2.r;
	double d2 = d1 - sumr; //d2  is the distance between the circle edges

	if (a1.v.Mag () < d2)
	    return false;                   //they cant reach

	if (Vec2D.Dot (a1.v, C) < 0)
	    return false;                          //opposite directions


	Vec2D D = Vec2D.Project (C, a1.v); //projection of position vector onto velocity vector

	// sqrt(F) is the closest distance the centers can get.

	// D.Mag()^2 + F = C.Mag()^2
	// F = C.Mag()^2 - D.Mag()^2

	double F = (C.Mag () * C.Mag ()) - (D.Mag () * D.Mag ());

	if (Math.sqrt (F) > sumr)
	    return false;         // the closest the balls can get is less bigger than the sum of raddi, they never hit



	//sqrt(T) is distance between the projection of C onto move vector and the distance the ball can travel

	// sumr^2 = T + F
	// T= sumr^2 - F
	double T = (sumr * sumr) - F;

	if (T < 0)
	    return false;

	//the distance that tbe ball can travel is called Distance.
	double Distance = D.Mag () - Math.sqrt (T);

	if (a1.v.Mag () < Distance)
	    return false;

	a1.pos = Vec2D.Add (a1.v.Norm ().scalMul (Distance), a1.pos);



	return true;
    } //end of stationaryCheck



    private boolean movingCheck (Circle a1, Circle a2)
    {



	Vec2D rv = Vec2D.Sub (a1.v, a2.v);  //velocity of b1 relative to b2


	//create a vector from center of a1 to center of a2 called C
	Vec2D C = new Vec2D (a2.pos.x - a1.pos.x, a2.pos.y - a1.pos.y);

	double d1 = C.Mag (); //d1 is the distance between centers.
	double sumr = a1.r + a2.r;
	double d2 = d1 - sumr; //d2  is the distance between the circle edges

	if (a1.v.Mag () < d2)
	    return false;                   //they cant reach

	if (Vec2D.Dot (rv, C) < 0)
	    return false;                          //opposite directions


	Vec2D D = Vec2D.Project (C, rv); //projection of position vector onto velocity vector

	// sqrt(F) is the closest distance the centers can get.

	// D.Mag()^2 + F = C.Mag()^2
	// F = C.Mag()^2 - D.Mag()^2

	double F = (C.Mag () * C.Mag ()) - (D.Mag () * D.Mag ());

	if (Math.sqrt (F) > sumr)
	    return false;         // the closest the balls can get is less bigger than the sum of raddi, they never hit


	//sqrt(T) is distance between the projection of C onto move vector and the distance the ball can travel

	// sumr^2 = T + F
	// T= sumr^2 - F
	double T = (sumr * sumr) - F;

	if (T < 0)
	    return false;

	//the distance that tbe ball can travel is called Distance.
	double Distance = D.Mag () - Math.sqrt (T);

	if (rv.Mag () < Distance)
	    return false;


	double ratio = Distance / rv.Mag (); //the time ratio.

	//making the balls touch.
	//recall that a1 and a2 are merely for check, the real balls are b1 and b2
	//mistake caught: when I say a1.v.scalMul(ratio) it changes the a1.v which it should not
	a1.pos = Vec2D.Add (a1.v.scalMul (ratio), a1.pos);
	a2.pos = Vec2D.Add (a2.v.scalMul (ratio), a2.pos);
	// updateCircle (a1);
	// updateCircle (a2);
	
	return true;
    } //end of movingCheck





} //end of class PhysicsEngine


class Vec2D
{

    public double x, y;
    public Vec2D ()
    {
	x = 0;
	y = 0;
    }



    public Vec2D (double i, double j)
    {
	x = i;
	y = j;
    }


    public Vec2D Add (Vec2D A)
    {

	return new Vec2D (A.x + x, A.y + y);
    }


    public static Vec2D Add (Vec2D A, Vec2D B)
    {

	return new Vec2D (A.x + B.x, A.y + B.y);
    }



    public static Vec2D Sub (Vec2D A, Vec2D B)
    {

	return new Vec2D (A.x - B.x, A.y - B.y);

    }


    public Vec2D Sub (Vec2D A)
    {

	return new Vec2D (x - A.x, y - A.y);
    }


    public void makeZero ()
    {
	x = 0;
	y = 0;

    }


    public static double Dot (Vec2D A, Vec2D B)
    {
	return (A.x * B.x) + (A.y * B.y);
    }


    public String Display ()
    {
	return "x=" + x + "\ny=" + y;
    }


    public static double Distance (Vec2D A, Vec2D B)
    {
	double deltax = B.x - A.x;
	double deltay = B.y - A.y;
	return Math.sqrt ((deltax * deltax) + (deltay * deltay));
    }


    public static double distanceSquared (Vec2D A, Vec2D B)
    {
	double deltax = B.x - A.x;
	double deltay = B.y - A.y;
	return (deltax * deltax) + (deltay * deltay);
    }


    public double Mag ()
    {
	return Math.sqrt (x * x + y * y);
    }


    public static double Mag (Vec2D A)
    {
	return Math.sqrt (A.x * A.x + A.y * A.y);
    }


    public static double magSquared (Vec2D A)
    {
	return (A.x * A.x + A.y * A.y);
    }


    public double magSquared ()
    {
	return (x * x + y * y);
    }


    public Vec2D scalMul (double A)
    {
	return new Vec2D (x * A, y * A);
    }
    
    public void scalarMul (double A)
    {
	this.x=x*A;
	this.y=y*A;
	
    }


    public Vec2D Norm ()
    {
	return new Vec2D (x, y).scalMul (1 / this.Mag ());
    }


    public static Vec2D Project (Vec2D A, Vec2D B)  //projection of A into B
    {
	return B.Norm ().scalMul (Vec2D.Dot (B.Norm (), A));
    }
} //end of class Vec2D

class Particle
{
    public Vec2D pos;
    public Vec2D a;
    public Vec2D v;
    double mass;
    public String name;


    public Particle ()
    {
	pos = new Vec2D (); //initializez pos to 0,0
	a = new Vec2D ();   //initializez a to 0,0
	v = new Vec2D ();   //initializez v to 0,0
	mass = 1;
	this.name = "";
    }


    public Particle (String name)
    {
	pos = new Vec2D (); //initializez pos to 0,0
	a = new Vec2D ();   //initializez a to 0,0
	v = new Vec2D ();   //initializez v to 0,0
	mass = 1;
	this.name = name;
    }


    public Particle (String name, double mass, Vec2D position, Vec2D velocity, Vec2D acceleration)
    {
	pos = new Vec2D (position.x, position.y);
	a = new Vec2D (acceleration.x, acceleration.y);
	v = new Vec2D (velocity.x, velocity.y);
	this.mass = mass;
	this.name = name;
    }


    public Particle (String name, double mass, double xpos, double ypos, double xv, double yv, double xa, double ya)
    {
	pos = new Vec2D (xpos, ypos);
	a = new Vec2D (xa, ya);
	v = new Vec2D (xv, yv);
	this.mass = mass;
	this.name = name;
    }


    public void Update (double time)  //used for updating the particle movement
    {
	// System.out.println(Vec2D.Add (v, a.scalMul (time)).Display() + " " + Vec2D.Add (pos, v.scalMul (time)).Display());
	v = Vec2D.Add (v, a.scalMul (time));
       
	pos = Vec2D.Add (pos, v.scalMul (time));
     

    }
    
    public void Update (double time, double dragFactor)  //used for updating the particle movement
    {
	// System.out.println(Vec2D.Add (v, a.scalMul (time)).Display() + " " + Vec2D.Add (pos, v.scalMul (time)).Display());
	v = Vec2D.Add (v, a.scalMul (time));
	//
	v= v.Norm().scalMul(v.Mag()* dragFactor);
	pos = Vec2D.Add (pos, v.scalMul (time));
     

    }


    public void setA (double i, double j)
    {
	a.x = i;
	a.y = j;
    }


    public void addA (double i, double j)
    {

	Vec2D B = new Vec2D (i, j);
	a = Vec2D.Add (a, B);
    }


    public void addV (double i, double j)
    {

	Vec2D B = new Vec2D (i, j);
	v = Vec2D.Add (v, B);
    }


    public void setPos (double i, double j)
    {
	pos.x = i;
	pos.y = j;
    }


    public void setV (double i, double j)
    {
	v.x = i;
	v.y = j;
    }
} //end of class particle




class Circle extends Particle
{
    double r;
    public Circle ()
    {
	super ();
	r = 2;
    }


    public Circle (String name, double radius)
    {
	super (name);
	r = radius;
    }


    public Circle (String name, double mass, Vec2D position, Vec2D velocity, Vec2D acceleration, double radius)
    {
	super (name, mass, position, velocity, acceleration);
	r = radius;
    }


    public Circle (String name, double mass, double xpos, double ypos, double xv, double yv, double xa, double ya, double radius)
    {
	super (name, mass, xpos, ypos, xv, yv, xa, ya);
	r = radius;
    }
} //end of class Cirlce

class AABB
{
    public double Width;
    public double Height;
    public double x; //starting x position
    public double y; //starting y position
    public String name;
    public AABB (String name)
    {
	this.name = name;
	Width = 1;
	Height = 1;
	x = 0;
	y = 0;
    }


    public AABB (String name, double x, double y, double Width, double Height)
    {
	this.name = name;
	this.Width = Width;
	this.Height = Height;
	this.x = x;
	this.y = y;
    }


    public double getR ()  //add the beginning point to the width to get the right side
    {
	return (this.x + this.Width);
    }


    public double getD ()  //getD stands for Get Down(the bottom side of the AABB)
    {
	return (this.y + this.Height);
    }
} //end of class AABB


