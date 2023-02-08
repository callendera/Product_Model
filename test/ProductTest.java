import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1, p2, p3, p4;

    @BeforeEach
    void setUp() {

        ArrayList<Product> products = new ArrayList<Product>();

        Product p1 = new Product("000001", "Pipeweed", "Long Bottom Leaf", 600.0);
        Product p2 = new Product("000002", "Lembas", "Elven Wayfare Bread", 200.0);
        Product p3 = new Product("000003", "Wine", "Woodland Elf Wine", 400.0);
        Product p4 = new Product( "000004", "Mushrooms", "Farmer Took's Finest", 125.0);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
    }

    @Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setName() {
        p2.setName("Lembas");
        assertEquals("Lembas", p2.getName());
    }

    @Test
    void setDescription() {
        p3.setDescription("Woodland Elf Wine");
        assertEquals("Woodland Elf Wine", p3.getDescription());
    }

    @Test
    void setCost() {
        p4.setCost(125.0);
        assertEquals(125.0, p4.getCost());
    }
}