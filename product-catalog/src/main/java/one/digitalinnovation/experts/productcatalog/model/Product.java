package one.digitalinnovation.experts.productcatalog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//@Document(indexName = "product", type = "catalog")
@Document(indexName = "product")
@Getter
@Setter
public class Product {

    @Id
    private Long id;
    private String nome;
    private Integer amount;



}
