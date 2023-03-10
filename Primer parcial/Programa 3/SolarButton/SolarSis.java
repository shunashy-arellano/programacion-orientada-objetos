import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class SolarSis {	
public SolarSis(){	 
	BranchGroup group = new BranchGroup();
	Appearance appsol = new Appearance();
	Appearance appearth = new Appearance();
        TextureLoader tex=new TextureLoader("TIERRA.JPG", null);
	appearth.setTexture(tex.getTexture());
	tex=new TextureLoader("SOL.JPG", null);
	appsol.setTexture(tex.getTexture());
	Sphere earth = new Sphere(0.045f, Primitive.GENERATE_NORMALS | 			
	Primitive.GENERATE_TEXTURE_COORDS, 32, appearth);
	Sphere sol = new Sphere(0.35f, Primitive.GENERATE_NORMALS | 
	Primitive.GENERATE_TEXTURE_COORDS, 32, appsol);
	TransformGroup earthRotXformGroup = Posi.rotate(earth, new Alpha(-1, 1250));
	TransformGroup solRotXformGroup = Posi.rotate(sol, new Alpha(-1, 1250));
	TransformGroup earthTransXformGroup = Posi.translate(earthRotXformGroup, 
	new Vector3f(0.0f, 0.0f, 0.7f));
TransformGroup earthRotGroupXformGroup = Posi.rotate(earthTransXformGroup, new Alpha(-1, 5000));
    	group.addChild(earthRotGroupXformGroup);
    	group.addChild(solRotXformGroup);
    	GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
    	Canvas3D canvas = new Canvas3D(config); canvas.setSize(400, 400);
    	SimpleUniverse universe = new SimpleUniverse(canvas);
    	universe.getViewingPlatform().setNominalViewingTransform();
    	universe.addBranchGraph(group);  
    	JFrame f = new JFrame("Planetario");
    	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
    	f.add(canvas); f.pack(); f.setVisible(true); }
public static void main(String a[]) { new SolarSis();}
}                                                                         
