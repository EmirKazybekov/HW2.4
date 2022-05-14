public class LapTope {
	private Hdd hdd;
    private Ram ram;
    private Os os;
    private Proc proc; 
    public Hdd getHdd() {
        return hdd;
    }
    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }
    public Ram getRam() {
        return ram;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    public Os getOs() {
        return os;
    }
    public void setOs(Os os) {
        this.os = os;
    }
    public Proc getProc() {
        return proc;
    }
    public void setProc(Proc proc) {
        this.proc = proc;
    }
    @Override
	public String toString() {
	String massage = "HDD \n" + hdd +"\n" + "Ram \n" + ram +"\n"+ "Os \n" + os + "\n" + "Core \n" + proc; 
	return massage;
	}
}
class Hdd {
    private int size;
    private int speed;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
    	String massage = "Размер " + size + "\n" + "Скорость " + speed;
    	return massage;
    }
    
}
class Ram {
    private int size;
    private String model;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
    	String massage = "Размер " + size + "\n" + "Модель " + model;
    	return massage;
    }
}    
class Os {
    private String name;
    private int version;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
    @Override
    public String toString() {
    	String massage = "Название " + name + "\n" + "Версия " + version;
    	return massage;
    }
}
class Proc {
    private String model;
    private int core;
    private int chast;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCore() {
        return core;
    }
    public void setCore(int core) {
        this.core = core;
    }
    public int getChast() {
        return chast;
    }
    public void setChast(int chast) {
        this.chast = chast;
    }
    @Override
    public String toString() {
    	String massage = "Модель " + model + "\n" + "Ядра " + core + "\n" + "Частота " + chast;
    	return massage;
   }
}
	