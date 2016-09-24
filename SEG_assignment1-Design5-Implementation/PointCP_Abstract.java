// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public abstract class PointCP_Abstract
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  public char typeCoord;

  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  public double xOrRho;

  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  public double yOrTheta;

  //Instance methods **************************************************


  public double getX()
  {
    if(typeCoord == 'C')
      return xOrRho;
    else
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getY()
  {
    if(typeCoord == 'C')
      return yOrTheta;
    else
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getRho()
  {
    if(typeCoord == 'P')
      return xOrRho;
    else
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }

  public double getTheta()
  {
    if(typeCoord == 'P')
      return yOrTheta;
    else
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }


  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public void convertStorageToPolar(){};
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian(){};
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  // public String toString()
  // {
  //   return "Stored as " + (typeCoord == 'C'
  //      ? "Cartesian  (" + getX() + "," + getY() + ")"
  //      : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
  // }
}
