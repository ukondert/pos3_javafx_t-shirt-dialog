package at.htlle.pos3.javafx.model;

public class TShirt {
    private final boolean isShortSleeved; // required if short or long sleeved
    private final String backPrint;
    private final String frontPrintSmall;
    private final String frontPrintLarge;
    private final Brand brand;
    private final boolean isBioCotton;
    private final double price;

    private TShirt(TShirtBuilder tshirtBuilder) {
        this.isShortSleeved = tshirtBuilder.isShortSleeved;
        this.backPrint = tshirtBuilder.backPrint;
        this.frontPrintSmall = tshirtBuilder.frontPrintSmall;
        this.frontPrintLarge = tshirtBuilder.frontPrintLarge;
        this.brand = tshirtBuilder.brand;
        this.price = tshirtBuilder.price;
        this.isBioCotton = tshirtBuilder.isBioCotton;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "[ isShortSleeved: " + isShortSleeved + ", backPrint: " + backPrint + ", frontPrintLarge: "
                + frontPrintLarge + ", frontPrintSmall: " + frontPrintSmall + ", brand: " + brand + ", isBioCotton: "
                + isBioCotton + ", price: " + price + " ]";
    }

    public static class TShirtBuilder {
        private final boolean isShortSleeved; // required if short or long sleeved
        private String backPrint;
        private String frontPrintSmall;
        private String frontPrintLarge;
        private Brand brand;
        private double price = 0;
        private boolean isBioCotton;

        public TShirtBuilder(boolean isShortSleeved) {
            this.isShortSleeved = isShortSleeved;
            this.price += (this.isShortSleeved) ? Price.SHORT_SLEEVE : Price.LONG_SLEEVE;
        }

        public TShirtBuilder withSmallFrontPrint(String text) {
            this.price += Price.FRONT_PRINT_SMALL;
            this.frontPrintSmall += (text + "\n");
            return this;
        }

        public TShirtBuilder withLargeFrontPrint(String text) {
            this.price += Price.FRONT_PRINT_LARGE;
            this.frontPrintLarge += (text + "\n");
            return this;
        }

        public TShirtBuilder withBackPrint(String text) {
            this.price += Price.BACK_PRINT;
            this.backPrint += (text + "\n");
            return this;
        }

        public TShirtBuilder withBrand(Brand brand) {
            if (this.brand != null) {
                switch (this.brand) {
                    case FAIR_FOR_ME:
                        this.price -= Price.FAIR_FOR_ME;
                        break;
                    case FAST_FASHION_AS_WE_WISH:
                        this.price -= Price.FAST_FASHION_AS_WE_WISH;
                        break;
                    case I_CAN_NOT_CARE_LESS:
                        this.price -= Price.I_CAN_NOT_CARE_LESS;
                        break;

                }
            }

            switch (brand) {
                case FAIR_FOR_ME:
                    this.price += Price.FAIR_FOR_ME;
                    break;
                case FAST_FASHION_AS_WE_WISH:
                    this.price += Price.FAST_FASHION_AS_WE_WISH;
                    break;
                case I_CAN_NOT_CARE_LESS:
                    this.price += Price.I_CAN_NOT_CARE_LESS;
                    break;
            }
            this.brand = brand;
            return this;
        }

        public TShirtBuilder withBioCotton() {
            if (!this.isBioCotton) {
                this.isBioCotton = true;
                this.price += Price.BIO_COTTON;
            }
            return this;
        }

        public TShirt build() throws IncompatibleConfigurationException {
            validate();
            return new TShirt(this);
        }

        private boolean validate() throws IncompatibleConfigurationException {
            if (this.brand == Brand.FAST_FASHION_AS_WE_WISH && this.isBioCotton) {
                throw new IncompatibleConfigurationException("Can not be Fast Fashion brand and Bio Cotton.");
            }
            return true;
        }
    }
}
