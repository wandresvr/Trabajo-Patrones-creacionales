package Builder;

public interface IWeaponAttachmentsBuilder {
    IWeaponAttachmentsBuilder setSight(String sight);
    IWeaponAttachmentsBuilder setBarrel(String barrel);
    IWeaponAttachmentsBuilder setStock(String stock);
    IWeaponAttachmentsBuilder setGrip(String grip);
    IWeaponAttachmentsBuilder setAmmo(String ammo);
    WeaponAttachments build();
}
