import java.util.*;

public class posVector {
	private float xPosition, yPosition;		//Objektets position
	private float xSpeed, ySpeed;			//Hastighet och riktning
	
public posVector(float speed, float angleDegree, float xPosition, float yPosition){
		this.xSpeed = (float)(speed * Math.cos(Math.toRadians(angleDegree)));
		this.ySpeed = (float)(-speed * Math.sin(Math.toRadians(angleDegree)));
		this.xPosition = xPosition;
		this.yPosition = yPosition;
}
/*public posVector(float xSpeed, float ySpeed, float xPosition, float yPosition){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
}*/
//H�mta vektorns l�ngd ( magnitud )
public float getSpeedMagnitude(){
	return (int)Math.sqrt(xSpeed*xSpeed + ySpeed*ySpeed);
}
//H�mta vilken mellan x-planet och vekorn
public float getAngleDegree(){
	return (float)Math.toDegrees(Math.atan2(-ySpeed, xSpeed));
}
public float scalar(posVector vector1){
	return (this.xSpeed*vector1.getX() + this.ySpeed*vector1.getY());
}
//addera given inparameters vektor med denna vektorn
public void addVector(posVector vector1){
	this.xSpeed += vector1.getX();
	this.ySpeed += vector1.getY();
}
//subtrahera given inparameters vektor med denna vektorn
public void subVector(posVector vector1){
	this.xSpeed -= vector1.getX();
	this.ySpeed -= vector1.getY();
}
//F�rflytta denna vektorns position (xPosition, yPosition) med (xSpeed, ySpeed) antal pixlar
public void moveVector(){
	xPosition += xSpeed;
	yPosition += ySpeed;
}
//H�mta enhetsvektorn f�r denna vektorn
public posVector normalize(){
	posVector returnvec = this.clone();
	if(this.getSpeedMagnitude() != 0){
		returnvec.xSpeed = this.xSpeed / this.getSpeedMagnitude();
		returnvec.ySpeed = this.ySpeed / this.getSpeedMagnitude();
	}
	return returnvec;
}
public float getX(){
	return this.xSpeed;
}
public float getY(){
	return this.ySpeed;
}
@Override
public posVector clone(){
	try{
		return (posVector)super.clone();
	}
	catch(CloneNotSupportedException e){
		throw new InternalError();
	}
}




}
