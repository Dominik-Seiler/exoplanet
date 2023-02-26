module Exoplanet {
	requires java.net.http;
	requires com.fasterxml.jackson.databind;
	requires org.apache.httpcomponents.httpclient;
	requires org.apache.httpcomponents.httpcore;
	requires com.fasterxml.jackson.annotation;
	
	exports robot;
	exports groundstation;
	opens robot;
}