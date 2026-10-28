.class final Lcom/whoop/connectivityDataPackets/l;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x9

    const/16 v1, 0xa

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_battery_firmware_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
