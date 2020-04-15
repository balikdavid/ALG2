
package interfacevariant;

/**
 *
 * @author David Bálik
 */
public interface ShapeInterface {
    final String NAME = "Geometric shape";
    
    public double area();
    
    
    default String getShapeName(){
        return this.getClass().getSimpleName();
    }    

    public int compareTo(ShapesApp o);
    

    
}
