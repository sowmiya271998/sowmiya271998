interface VehicleDispInfo
{
	void vehicleDisplay();
}
class VehicleDetails implements VehicleDispInfo
{
	public void vehicleDisplay()
	{
		final int registrationNo = 8756;
		final int vehicleNo  = 98457;
		String vehicleType = "4 Wheeler";
		System.out.println("Registration Number : "+registrationNo+"\nVehicle Number : "+vehicleNo+"\nVehicle Type : "+vehicleType);
	}
	void vehiclePrice()
	{
		final int price=450000;
		System.out.println("\nPrice of the Vehicle is : "+price);
	}
}
class NonAbstractClass 
{
	public static void main(String[] args) 
	{
		VehicleDispInfo a=new VehicleDetails();
		VehicleDetails b=new VehicleDetails();
		a.vehicleDisplay();
		b.vehiclePrice();
	}
}
