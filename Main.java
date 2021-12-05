//класс Phone
//поля: serialNumber, model, weight
//методы: вывод, receiveCall(String name), getNumber
//конструктор: для всех параметров, для number и model
//Классы: BabushkaPhone, SmartPhone
//метод sendMessage для SmartPhone
//переопределить метод receiveCall для бабушкафона

//придумать и добавить по 3поля для BabushkaPhone, SmartPhone
//также по 1 методу
//создать объекты всех классов и повзаимодействовать

    class Phone{
        int serialNumber;
        int model;
        int weight;

        public void receiveCall(String name){
            System.out.println("receiveCall");
        }

        public int getNumber() {
            System.out.println(serialNumber);
            return serialNumber;
        }

        public Phone(int serialNumber, int model, int weight) {
            this.serialNumber = serialNumber;
            this.model = model;
            this.weight = weight;
        }

        public void info(){
            System.out.println("serialNumber: " + serialNumber + "\n" + "model: " + model + "\n" + "weight: " + weight);
        }

    }

    class BabushkaPhone extends Phone{
        int cost;
        int resolution;
        String os;
        public BabushkaPhone(int serialNumber, int model, int weight, int cost, int resolution, String os) {
            super(serialNumber, model, weight);
            this.cost = cost;
            this.resolution = resolution;
            this.os = os;
        }

        @Override
        public void receiveCall(String name) {
            super.receiveCall(name);
        }

        @Override
        public void info() {
            super.info();
            System.out.println("cost: " + cost + "\n" + "resolution: " + resolution + "\n" + "os: " + os);
        }

    }
    class SmartPhone extends Phone{
        String fullTitle;
        String overPrice;
        String description;
        public SmartPhone(int serialNumber, int model, int weight) {
            super(serialNumber, model, weight);
            this.fullTitle = "Super_Mega_Nano_Ultra_Giper_Turbo_Extra_Phone";
            this.overPrice = "140%";
            this.description = "Smart phone for retarded peoples!";
        }

        public void sendMessage() {
            System.out.println("sendMessage");
        }

        @Override
        public void info() {
            super.info();
            System.out.println("fullTitle: " + fullTitle + "\n" + "overPrice: " + overPrice + "\n" + "description: " + description);
        }

        public static void main(String[] args) {
            System.out.println("");
            SmartPhone retardedPhone = new SmartPhone(1243756, 99999, 1);
            retardedPhone.sendMessage();
            retardedPhone.info();
            System.out.println("");
            BabushkaPhone babka = new BabushkaPhone(1234, 8888, 1000, 1000, 144, "IOS");
            babka.receiveCall("Uncle dad");
            babka.info();
            System.out.println("");
            Phone justPhone = new Phone(123123, 333333, 100);
            justPhone.getNumber();
            justPhone.receiveCall("babka");
            justPhone.info();
        }
    }
