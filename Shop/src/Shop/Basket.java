package Shop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
	private static final String ITEM_ORDER_FORMAT = "%s (%.2f x %d = %.2f)";

    private final Map<Item, Integer> ORDER = new HashMap<>();

    public void add(Item item) {
        add(item, 1);
    }

    public void add(Item item, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        if (ORDER.containsKey(item)) {
            quantity = ORDER.get(item) + quantity;
        }
        ORDER.put(item, quantity);
    }

    public void remove(Item item) {
        remove(item, 1);
    }

    public void remove(Item item, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        quantity = ORDER.get(item) - quantity;
        if (quantity == 0) {
            ORDER.remove(item);
        }
        else if (quantity < 0) {
            throw new IllegalStateException(String.format("There is no that many items to remove~"));
        }
        else {
            ORDER.put(item, quantity);
        }
    }

    public double getOrderValue() {
        double orderValue = 0;

        for(Map.Entry<Item, Integer> itemOrder : ORDER.entrySet()) {
            orderValue += itemOrder.getKey().getPrice() * itemOrder.getValue();
        }

        return orderValue;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for(Map.Entry<Item, Integer> itemOrder : ORDER.entrySet()) {
            Item item = itemOrder.getKey();
            Integer quantity = itemOrder.getValue();
            String itemString = String.format(
                    getItemOrderFormat(),
                    item.getName(),
                    item.getPrice(),
                    quantity,
                    item.getPrice() * quantity
            );
            result.append(itemString);
            result.append(System.lineSeparator());
        }
        result.append(String.format("Total: %.2f", getOrderValue()));

        return result.toString();
    }

    public Map<Item, Integer> getOrder() {
        return Collections.unmodifiableMap(ORDER);
	 }

	public static String getItemOrderFormat() {
		return ITEM_ORDER_FORMAT;
	}
}