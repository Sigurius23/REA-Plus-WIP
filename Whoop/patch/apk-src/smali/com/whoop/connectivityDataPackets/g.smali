.class final Lcom/whoop/connectivityDataPackets/g;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_strap_firmware_events` (`timestamp` INTEGER NOT NULL, `type` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
