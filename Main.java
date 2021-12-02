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

        public static void main(String[] args) {
            Phone justPhone = new Phone(123123, 333333, 100);
            justPhone.getNumber();
            justPhone.receiveCall("Babka");
            justPhone.info();
        }
    }

    class BabushkaPhone extends Phone{
        int cost;
        int resolution;
        String os;
        public BabushkaPhone(int serialNumber, int model, int weight) {
            super(serialNumber, model, weight);
            this.cost = 1000;
            this.resolution = 144;
            this.os = "Apple";
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

        public static void main(String[] args) {
            BabushkaPhone Babka = new BabushkaPhone(1234, 8888, 1000);
            Babka.receiveCall("Uncle dad");
            Babka.info();
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
            SmartPhone retardedPhone = new SmartPhone(1243756, 99999, 1);
            retardedPhone.sendMessage();
            retardedPhone.info();
        }
    }
