package pucrs.myflight.modelo;

public class Geo {
	private static final double Raio_Terra = 6371.0;

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

	private static double calcularDistanciaHaversine(double lat1, double lon1, double lat2, double lon2) {
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(lon2 - lon1);
		
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);
		
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
				   Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		
		return Raio_Terra * c;
	}

	public static double distancia(Geo p1, Geo p2) {
        return calcularDistanciaHaversine(
            p1.getLatitude(), p1.getLongitude(), 
            p2.getLatitude(), p2.getLongitude()
        );
    }

	public double distancia(Geo outro) {
        return calcularDistanciaHaversine(
            this.latitude, this.longitude, 
            outro.getLatitude(), outro.getLongitude()
        );
    }


}
