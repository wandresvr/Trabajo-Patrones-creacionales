package Builder;

public class AddWeaponAttachments {
    public static void main(String[] args) {
        // Uso directo del Builder a través de la interfaz
        IWeaponAttachmentsBuilder builder = new WeaponAttachmentsBuilder();
        WeaponAttachments customLoadout = builder
                .setSight("Holographic")
                .setBarrel("Extended with muzzle")
                .setStock("Rescue stock")
                .setGrip("Vertical grip")
                .setAmmo("Piercing bullets")
                .build();

        customLoadout.showLoadout();
    }
}