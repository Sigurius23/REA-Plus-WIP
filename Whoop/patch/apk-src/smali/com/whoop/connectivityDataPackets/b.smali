.class final Lcom/whoop/connectivityDataPackets/b;
.super Lmb/b;
.source "SourceFile"


# instance fields
.field private final a:Lmb/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xb

    const/16 v1, 0xc

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    new-instance v0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase$a;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase$a;-><init>()V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/b;->a:Lmb/a;

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE `table_battery_firmware_events`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_firmware_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/b;->a:Lmb/a;

    invoke-interface {v0, p1}, Lmb/a;->f(Ltb/a;)V

    return-void
.end method
