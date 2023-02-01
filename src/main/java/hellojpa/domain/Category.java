package hellojpa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends BaseEntity{

    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany
    @JoinColumn(name = "ITEM_ID")
    private List<Item> items = new ArrayList<>();
    private Category parent;
}
