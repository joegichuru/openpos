package ke.nexthub.openpos.models.inventory;

import java.io.Serializable;

/**
 * Lot or bunch of products that you import to inventory.
 *
 * @author Joseph
 *
 */
public class ProductLot implements Serializable {
    private int id;
    private long createdAt;
    private int quantity;
    private Product product;
    private double unitCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
}
