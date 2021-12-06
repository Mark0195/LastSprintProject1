package DataRest;

import javax.persistence.*;

@Entity
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String animals;
    private String common_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }
}
