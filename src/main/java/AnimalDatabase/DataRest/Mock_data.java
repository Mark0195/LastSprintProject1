package AnimalDatabase.DataRest;

import javax.persistence.*;

@Entity
public class Mock_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String animals;
    private String commonName;

    public Mock_data(long id, String animals, String commonName) {
        this.id = id;
        this.animals = animals;
        this.commonName = commonName;
    }

    public Mock_data() {

    }

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

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

//    public String getCommon_name() {
//        return commonName;
//    }
//
//    public void setCommon_name(String common_name) {
//        this.commonName = common_name;
//    }
}
