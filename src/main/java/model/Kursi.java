package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "kursi" )
public class Kursi {
    @Id
    private int id;
    private String name;
   @Column (name= "creation_date")
   private Date creationDate;
   @Column (name="students_enrolled")
    private int studentsEnrolled;
    @Column (name= "percentage_of_completation")
    private double percentageOfCompletation;
    @Column (name= "finished")
    private boolean finished;
    public Kursi(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(int studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public double getPercentageOfCompletation() {
        return percentageOfCompletation;
    }

    public void setPercentageOfCompletation(double percentageOfCompletation) {
        this.percentageOfCompletation = percentageOfCompletation;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Kursi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", studentsEnrolled=" + studentsEnrolled +
                ", percentageOfCompletation=" + percentageOfCompletation +
                ", finished=" + finished +
                '}';
    }
}

