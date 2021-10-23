package test;

public class Subscription {

	    String subscriptionID;
	    String keyWords;
	    double latitude;
	    double longitude;

	    public Subscription(String subscriptionID, String keyWords, double latitude, double longitude) {
	        this.subscriptionID = subscriptionID;
	        this.keyWords = keyWords;
	        this.latitude = latitude;
	        this.longitude = longitude;
	    }

	    public Subscription() {
	    }

	    public String getSubscriptionID() {
	        return subscriptionID;
	    }

	    public void setSubscriptionID(String subscriptionID) {
	        this.subscriptionID = subscriptionID;
	    }

	    public String getKeyWords() {
	        return keyWords;
	    }

	    public void setKeyWords(String keyWords) {
	        this.keyWords = keyWords;
	    }

	    public double getLatitude() {
	        return latitude;
	    }

	    public void setLatitude(double latitude) {
	        this.latitude = latitude;
	    }

	    public double getLongitude() {
	        return longitude;
	    }

	    public void setLongitude(double longitude) {
	        this.longitude = longitude;
	    }


}
