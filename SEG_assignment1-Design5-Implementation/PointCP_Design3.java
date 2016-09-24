public class PointCP_Design3 extends PointCP_Abstract
{
	//Constructors ******************************************************

	/**
	* Constructs a coordinate object, with a type identifier.
	*/
  public PointCP_Design3(char type, double xOrRho, double yOrTheta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    typeCoord = type;
  }
}