
public class Operation {

	private Cars[] crs;
	private int index;
	
	Operation(int size) {
		crs = new Cars[size];
	}
	
	public void addCar(Cars s) {
		crs[index++] = s;
	}
	
	public void showAllCar() {
		for(int i=0; i<crs.length;i++) {
			if(crs[i] !=null) {
				System.out.println(crs[i].getYear()+"\t"+crs[i].getMake()+"\t"+crs[i].getMake());
			}
		}
	}
	
	public boolean delete(int year) {
		boolean status=false;
		for(int i=0; i<crs.length;i++) {
			if(crs[i] !=null) {
				if(crs[i].getYear()==year) {
					crs[i]=null;
					status=true;
				}
			}
		}
		return status;
	}
	
	public Cars findCarByYear(int year) {
		Cars std=null;
		for(int i=0; i<crs.length;i++) {
			if(crs[i]!=null) {
				if(crs[i].getYear()==year) {
					std=crs[i];
				}
			}
		}
		return std;
	}
	
	public Cars findCarByMake(String make) {
		Cars std=null;
		for(int i=0; i<crs.length;i++) {
			if(crs[i]!=null) {
				if(crs[i].getMake().equals(make)) {
					std=crs[i];
				}
			}
		}
		return std;
		}
	
	public Cars findCarByModel(String model) {
		Cars std=null;
		for(int i=0; i<crs.length;i++) {
			if(crs[i]!=null) {
				if(crs[i].getModel().equals(model)) {
					std=crs[i];
				}
			}
		}
		return std;
		}
}
