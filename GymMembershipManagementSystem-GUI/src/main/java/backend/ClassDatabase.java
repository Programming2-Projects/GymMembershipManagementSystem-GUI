/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Youssef
 */
public class ClassDatabase extends DataBase<Class>{

    public ClassDatabase (String fileName) {
        super(fileName);
    }

    @Override
    public Class createRecordFrom (String line) {
        if (line == null || line.isEmpty())
            return null;

        String[] data = line.split(",\\s*");
        if (data.length != 5)
            return null;

        String classID = data[0];
        String className = data[1];
        String trainerID = data[2];
        int duration = Integer.parseInt(data[3]);
        int availableSeats = Integer.parseInt(data[4]);
        return new Class(classID, className, trainerID, duration, availableSeats);
    }

}
