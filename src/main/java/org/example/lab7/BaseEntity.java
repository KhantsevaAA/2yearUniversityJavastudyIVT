package org.example.lab7;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseEntity <P extends Serializable> //implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected P id;
    public P getId() {
        return id;
    }
    public BaseEntity<P> setId(P id) {
        this.id = id;
        return this;
    }
}
