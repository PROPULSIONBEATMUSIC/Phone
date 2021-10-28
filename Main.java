//поля: serialNumber, model, weight
//методы: вывод, receiveCall(String name), getNumber
//конструктор: для всех параметров, для number и model
//Классы: BabushkaPhone, SmartPhone
//метод sendMessage для SmartPhone
//переопределить метод receiveCall для бабушкафона
//придумать и добавить по 3поля для BabushkaPhone, SmartPhone
//также по 1 методу
//создать объекты всех классов и повзаимодействовать

class BabushkaPhone {
    String serialNumber;
    String model;
    int weight;
    int cost;

    public BabushkaPhone(String model, String serialNumber, int weight, int cost){
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
    }

     public static void main(String[] args) {
         BabushkaPhone BabushkaPhone = new BabushkaPhone("I3346ty", "102982857623", 100, 800);
        System.out.println("Модель: " + BabushkaPhone.model + " Серийный номер: " + BabushkaPhone.serialNumber + " Вес: " + BabushkaPhone.weight + " Цена: " + BabushkaPhone.cost);
     }
}

class SmartPhone {
    String serialNumber;
    String model;
    int weight;
    int cost;

    public String sendMessage(String message){
        String mess = " Со счета списаны все деньги ";
        System.out.println(message);
        return mess;
    }

    public SmartPhone(String model, String serialNumber, int weight, int cost){
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.cost = cost;
    }

    public static void main(String[] args) {
        SmartPhone SmartPhone = new SmartPhone("I3346ty", "102982857623", 100, 2800000);
        System.out.println("Модель: " + SmartPhone.model + " Серийный номер: " + SmartPhone.serialNumber + " Вес: " + SmartPhone.weight + " Цена: " + SmartPhone.cost);

    }
}
