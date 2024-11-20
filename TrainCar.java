
public class TrainCar implements Comparable<TrainCar>
{
    private String name;
    private String cargo;
    private double load;
    private TrainCar nextCar;
    
    public TrainCar(String name, String cargo, double load)
    {
        this.name = name;
        this.cargo = cargo;
        this.load = load;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public double getLoad() {return load;}
    public void setLoad(double laod) {this.load = load;}
    public TrainCar getNext() {return nextCar;}
    public void setNextCar(TrainCar next) {this.nextCar = next;}
    
    public String toString() {
        return "name: " + name + " cargo: " + cargo + " load: " + load;
    }
    
    public void swapCargo(TrainCar tc) {
        String tCargo = this.cargo;
        double tLoad = this.load;
        
        this.cargo = tc.getCargo();
        this.load = tc.getLoad();
        
        tc.setCargo(tCargo);
        tc.setLoad(tLoad);
    }
    
    public void printTrain() {
        System.out.println(this);
        if (nextCar != null) {
            nextCar.printTrain();
        }
    }
    
    public int compareTo(TrainCar tn) {
        if (this.load > tn.load) {
            return 1;
        }
        return -1;
    }
}
