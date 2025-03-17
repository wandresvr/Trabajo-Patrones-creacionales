package Builder;

public class WeaponAttachments {
    private String sight;   // Mira
    private String barrel;  // Cañón
    private String stock;   // Culata
    private String grip;    // Empuñadura
    private String ammo;    // Tipo de munición

    public WeaponAttachments(String sight, String barrel, String stock, String grip, String ammo) {
        this.sight = sight;
        this.barrel = barrel;
        this.stock = stock;
        this.grip = grip;
        this.ammo = ammo;
    }

    public void showLoadout() { //Método para mostrar los accesorios del arma
        System.out.println("Setup loaduot:");
        System.out.println("Sight: " + (sight != null ? sight : "Stock"));
        System.out.println("Barrel: " + (barrel != null ? barrel : "Stock"));
        System.out.println("Stock: " + (stock != null ? stock : "Basic"));
        System.out.println("Grip: " + (grip != null ? grip : "No grip"));
        System.out.println("Ammo: " + (ammo != null ? ammo : "Standar"));
    }
}

