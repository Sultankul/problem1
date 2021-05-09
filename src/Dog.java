public class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(String name, String breed, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color,Shelter shelter){
        this.breed = breed;
        super.setColor(color);
        this.name = name;
        super.setShelter(shelter);
    }
    public Dog(String name, String breed, Color color,Shelter shelter,String[] commands){
        this.breed = breed;
        super.setColor(color);
        this.name = name;
        super.setShelter(shelter);
        this.commands = commands;
    }
    public void makeVoice(String voice,int number){

    }
    public void makeVoice(int number){

    }
    public void makeVoice(String voice,int number,String ton){

    }
    public String getInfo(){
        return "Age:"+ super.getAge()+ "\nColor: " + super.getColor() + "\nShelter:"+super.getShelter();
    }}


