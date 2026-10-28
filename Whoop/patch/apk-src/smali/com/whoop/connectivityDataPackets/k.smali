.class final Lcom/whoop/connectivityDataPackets/k;
.super Lmb/b;
.source "SourceFile"


# instance fields
.field private final a:Lmb/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x8

    const/16 v1, 0x9

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    new-instance v0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase$b;

    invoke-direct {v0}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase$b;-><init>()V

    iput-object v0, p0, Lcom/whoop/connectivityDataPackets/k;->a:Lmb/a;

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE `table_raw_data`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `sensor_data_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `packet_revision`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/k;->a:Lmb/a;

    invoke-interface {v0, p1}, Lmb/a;->f(Ltb/a;)V

    return-void
.end method
