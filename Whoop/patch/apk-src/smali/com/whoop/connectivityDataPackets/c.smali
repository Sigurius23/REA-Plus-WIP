.class final Lcom/whoop/connectivityDataPackets/c;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xc

    const/16 v1, 0xd

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "ALTER TABLE `table_battery_pack_relative_console_packets` ADD COLUMN `meta_optical_revision` INTEGER NOT NULL DEFAULT 0"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "ALTER TABLE `table_battery_pack_relative_firmware_packets` ADD COLUMN `meta_optical_revision` INTEGER NOT NULL DEFAULT 0"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
