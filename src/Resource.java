public class Resource {

        private String resourceId;
        private String resourceName;
        private int quantity;
        private String resourceType;

        public Resource(String id, String name, int quantity, String type) {
            this.resourceId = id;
            this.resourceName = name;
            this.quantity = quantity;
            this.resourceType = type;
        }

        public boolean isAvailable(int requiredQty) {
            return quantity >= requiredQty;
        }

        public void allocate(int qty) {
            if (isAvailable(qty)) {
                quantity -= qty;
            }
        }

        public String getName() {
            return resourceName;
        }
    }


