

public class Main {

	public static void main(String[] args) {
        LapTope laptop = new LapTope();
       
        Hdd hddObject1 = new Hdd();
        hddObject1.setSize(500);
        hddObject1.setSpeed(200);
        
        laptop.setHdd(hddObject1);
        
        Ram ram = new Ram();
        ram.setSize(1000);
        ram.setModel("HP");
        laptop.setRam(ram);
        
        Proc proc2 = new Proc();
        proc2.setChast(2);
        proc2.setModel("e");
        proc2.setCore(4);
        laptop.setProc(proc2);
        
        Os osObject = new Os();
        osObject.setName("Windows");
        osObject.setVersion(10);
        laptop.setOs(osObject);
        
        System.out.print(laptop);
    }
}
