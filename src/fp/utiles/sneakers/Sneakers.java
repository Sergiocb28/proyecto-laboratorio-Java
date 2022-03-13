package fp.utiles.sneakers;

import java.time.LocalDate;

public class Sneakers implements Comparable <Sneakers>{
    //Atributos
    private LocalDate orderDate;
    private String brand;
    private String sneakerName;
    private Integer salePrice;
    private Integer retailPrice;
    private LocalDate releaseDate;
    private Double shoeSize;
    private String buyerRegion;

    //Excepcines
    public Sneakers(LocalDate orderDate, Integer retailPrice){
        if  (orderDate.getYear() < 2019){
            throw new IllegalArgumentException("La fecha debe ser posterior a 2019");
        }
        this.orderDate = orderDate;


        if ( retailPrice == 0){
            throw new IllegalArgumentException("El precio de retail no puede ser 0");
        }
        this.retailPrice = retailPrice;

    }


   //Atributo derivado
    public TipoTalla getTipoTalla(){
        TipoTalla tipoTalla = null;
        if(shoeSize <= 5.5){
           tipoTalla = TipoTalla.PEQUEÑA;
        }else if (shoeSize > 5.5 && shoeSize <= 10.5){
           tipoTalla = TipoTalla.NORMAL;
        }else {
            tipoTalla = TipoTalla.GRANDE;
        }
        return tipoTalla;
    }



    //Constructor
    public Sneakers(LocalDate orderDate, String brand, String sneakerName, Integer salePrice, Integer retailPrice,
        LocalDate releaseDate, Double shoeSize, String buyerRegion) {
        this.orderDate = orderDate;
        this.brand = brand;
        this.sneakerName = sneakerName;
        this.salePrice = salePrice;
        this.retailPrice = retailPrice;
        this.releaseDate = releaseDate;
        this.shoeSize = shoeSize;
        this.buyerRegion = buyerRegion;
    
    }


    //Getters and Setters
    public LocalDate getOrderDate() {
        return orderDate;
    }


    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getSneakerName() {
        return sneakerName;
    }


    public void setSneakerName(String sneakerName) {
        this.sneakerName = sneakerName;
    }


    public Integer getSalePrice() {
        return salePrice;
    }


    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }


    public Integer getRetailPrice() {
        return retailPrice;
    }


    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }


    public LocalDate getReleaseDate() {
        return releaseDate;
    }


    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }


    public Double getShoeSize() {
        return shoeSize;
    }


    public void setShoeSize(Double shoeSize) {
        this.shoeSize = shoeSize;
    }


    public String getBuyerRegion() {
        return buyerRegion;
    }


    public void setBuyerRegion(String buyerRegion) {
        this.buyerRegion = buyerRegion;
    }


    //compareTo
    public int compareTo(Sneakers o) {
        int r = this.brand.compareTo(o.getBrand());
        if (r == 0){
            r = this.salePrice.compareTo(o.getsalePrice());
        }
        return r;
    }





    //toString
    @Override
    public String toString() {
        return "Sneakers [brand=" + brand + ", buyerRegion=" + buyerRegion + ", orderDate=" + orderDate + ", releaseDate="
                + releaseDate + ", retailPrice=" + retailPrice + ", salePrice=" + salePrice + ", shoeSize=" + shoeSize
                + ", sneakerName=" + sneakerName + "]";
    
    }


    
    //hashCode
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((buyerRegion == null) ? 0 : buyerRegion.hashCode());
        result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
        result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
        result = prime * result + ((retailPrice == null) ? 0 : retailPrice.hashCode());
        result = prime * result + ((salePrice == null) ? 0 : salePrice.hashCode());
        result = prime * result + ((shoeSize == null) ? 0 : shoeSize.hashCode());
        result = prime * result + ((sneakerName == null) ? 0 : sneakerName.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sneakers other = (Sneakers) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (buyerRegion == null) {
            if (other.buyerRegion != null)
                return false;
        } else if (!buyerRegion.equals(other.buyerRegion))
            return false;
        if (orderDate == null) {
            if (other.orderDate != null)
                return false;
        } else if (!orderDate.equals(other.orderDate))
            return false;
        if (releaseDate == null) {
            if (other.releaseDate != null)
                return false;
        } else if (!releaseDate.equals(other.releaseDate))
            return false;
        if (retailPrice == null) {
            if (other.retailPrice != null)
                return false;
        } else if (!retailPrice.equals(other.retailPrice))
            return false;
        if (salePrice == null) {
            if (other.salePrice != null)
                return false;
        } else if (!salePrice.equals(other.salePrice))
            return false;
        if (shoeSize == null) {
            if (other.shoeSize != null)
                return false;
        } else if (!shoeSize.equals(other.shoeSize))
            return false;
        if (sneakerName == null) {
            if (other.sneakerName != null)
                return false;
        } else if (!sneakerName.equals(other.sneakerName))
            return false;
        return true;
    }
    



    private Integer getsalePrice() {
        return null;
    }



    private String getBrand() {
        return null;
    }
    


}



