package Builder;

public class WeaponAttachmentsBuilder implements IWeaponAttachmentsBuilder {
    private String sight = "Sight stock";
    private String barrel = "Barrel stock";
    private String stock = "Basic";
    private String grip = "No grip";
    private String ammo = "Standar";

    @Override
    public IWeaponAttachmentsBuilder setSight(String sight) {
        this.sight = sight;
        return this;
    }
    @Override
    public IWeaponAttachmentsBuilder setBarrel(String barrel) {
        this.barrel = barrel;
        return this;
    }
    @Override
    public IWeaponAttachmentsBuilder setStock(String stock) {
        this.stock = stock;
        return this;
    }
    @Override
    public IWeaponAttachmentsBuilder setGrip(String grip) {
        this.grip = grip;
        return this;
    }
    @Override
    public IWeaponAttachmentsBuilder setAmmo(String ammo) {
        this.ammo = ammo;
        return this;
    }
    @Override
    public WeaponAttachments build() {
        return new WeaponAttachments(sight, barrel, stock, grip, ammo);
    }
}
