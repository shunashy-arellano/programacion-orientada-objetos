import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Planetas2{	
	public Planetas2(){	 
		BranchGroup group = new BranchGroup();
		Appearance appsol = new Appearance();
		Appearance appearth = new Appearance();
		Appearance appmercurio = new Appearance();
		Appearance appvenus = new Appearance();

	        TextureLoader tex=new TextureLoader("TIERRA.JPG", null);
		appearth.setTexture(tex.getTexture());
		tex=new TextureLoader("VENUS.JPG", null);
		appvenus.setTexture(tex.getTexture());
		tex=new TextureLoader("MERCURIO.JPG", null);
		appmercurio.setTexture(tex.getTexture());
		tex=new TextureLoader("SOL.JPG", null);
		appsol.setTexture(tex.getTexture());

		Sphere earth = new Sphere(0.045f, Primitive.GENERATE_NORMALS | 			
		Primitive.GENERATE_TEXTURE_COORDS, 32, appearth);//12.756km
		Sphere mercurio = new Sphere(0.015f, Primitive.GENERATE_NORMALS | 			
		Primitive.GENERATE_TEXTURE_COORDS, 32, appmercurio);//4.88km
		Sphere venus = new Sphere(0.045f, Primitive.GENERATE_NORMALS | 			
		Primitive.GENERATE_TEXTURE_COORDS, 32, appvenus);//12.104km
		Sphere sol = new Sphere(0.35f, Primitive.GENERATE_NORMALS | 
		Primitive.GENERATE_TEXTURE_COORDS, 32, appsol);
		
		TransformGroup earthRotXformGroup = Posi.rotate(earth, new Alpha(-1, 1250));//24horas
		TransformGroup mercurioRotXformGroup = Posi.rotate(mercurio, new Alpha(-1, 3000));//58dias
		TransformGroup venusRotXformGroup = Posi.rotate(venus, new Alpha(-1, 4500));//243dias
		TransformGroup solRotXformGroup = Posi.rotate(sol, new Alpha(-1, 1250));

		TransformGroup earthTransXformGroup = Posi.translate(earthRotXformGroup, new Vector3f(0.0f, 0.0f, 0.7f));
		TransformGroup earthRotGroupXformGroup = Posi.rotate(earthTransXformGroup, new Alpha(-1, 5000));
		TransformGroup mercurioTransXformGroup = Posi.translate(mercurioRotXformGroup, new Vector3f(0.0f, 0.0f, 0.4f));
		TransformGroup mercurioRotGroupXformGroup = Posi.rotate(mercurioTransXformGroup, new Alpha(-1, 1250));//88dias
		TransformGroup venusTransXformGroup = Posi.translate(venusRotXformGroup, new Vector3f(0.0f, 0.0f, 0.5f));
		TransformGroup venusRotGroupXformGroup = Posi.rotate(venusTransXformGroup, new Alpha(-1, 3125));//225dias
		
	    	group.addChild(earthRotGroupXformGroup);
	    	group.addChild(venusRotGroupXformGroup);
	    	group.addChild(mercurioRotGroupXformGroup);
	    	group.addChild(solRotXformGroup);

	    	GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
	    	Canvas3D canvas = new Canvas3D(config); 
		canvas.setSize(1280, 720);
	    	SimpleUniverse universe = new SimpleUniverse(canvas);
	    	universe.getViewingPlatform().setNominalViewingTransform();
	    	universe.addBranchGraph(group);  
	    	JFrame f = new JFrame("Planetario");
	    	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	    	f.add(canvas);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String a[]) {
		new Planetas2();
	}
} 