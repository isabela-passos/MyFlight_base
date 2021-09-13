package pucrs.myflight.modelo;


public class Geo {
	private double latitude;
	private double longitude;
	
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static  double distancia (Geo geo1, Geo geo2) {

		double latitude1 = geo1.getLatitude();
		double longitude1 = geo1.getLongitude();
		double latitude2 = geo1.getLatitude();
		double longitude2 = geo1.getLongitude();

		
        // converter para radiano
        latitude1 = Math.toRadians(latitude1);
        latitude2 = Math.toRadians(latitude2);
		longitude1 = Math.toRadians(longitude1);
        longitude2 = Math.toRadians(longitude2);
		
        // apply formulae
		double r = 6371;
        double dist = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin(latitude1 - latitude2 / 2), 2) + Math.pow(Math.sin(longitude1 - longitude2 / 2), 2) * Math.cos(latitude1) * Math.cos(latitude2)));
		
		return dist;
       
	}

}
