package backend;

public class Class implements Recordable{
    private String classID, className, trainerID;
    private int duration, availableSeats;

    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
//        if (!Validator.isValidID(classID, 'C'))
//            throw new IllegalArgumentException("Invalid Class ID!");
//        if (!Validator.isValidName(className))
//            throw new IllegalArgumentException("Invalid class name!");
//        if (!Validator.isValidID(trainerID, 'T'))
//            throw new IllegalArgumentException("Invalid trainer ID!");
            
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats () {
        return availableSeats;
    }

    public void setAvailableSeats (int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String lineRepresentation () {
        String line = String.join(",",
        classID, className, trainerID,
        String.valueOf(duration), String.valueOf(availableSeats));

        return line;
    }

    @Override
    public String getSearchKey () {
        return classID;
    }

    @Override
    public String toString() {
        return "Class [classID=" + classID + ", className=" + className + ", trainerID=" + trainerID + ", duration="
                + duration + ", availableSeats=" + availableSeats + "]";
    }

    

}
