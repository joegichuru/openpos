package ke.nexthub.openpos.models.inventory;

import java.io.Serializable;

/**
 * LineItem of Sale.
 *
 * @author Joseph
 */
public class LineItem implements Serializable {
    private final Product product;
    private int quantity;
    private int id;
    private double unitPriceAtSale;

    /**
     * Constructs a new LineItem.
     *
     * @param product  product of this LineItem.
     * @param quantity product quantity of this LineItem.
     */
    public LineItem(Product product, int quantity) {
        this(product, quantity, product.getUnitPrice());
    }

    /**
     * Constructs a new LineItem.
     *
     * @param product         product of this LineItem.
     * @param quantity        product quantity of this LineItem.
     * @param unitPriceAtSale unit price at sale time. default is price from ProductCatalog.
     */
    public LineItem( Product product, int quantity,
                    double unitPriceAtSale) {
        this.product = product;
        this.quantity = quantity;
        this.unitPriceAtSale = unitPriceAtSale;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUnitPriceAtSale() {
        return unitPriceAtSale;
    }

    public void setUnitPriceAtSale(double unitPriceAtSale) {
        this.unitPriceAtSale = unitPriceAtSale;
    }
}
