.class final Lcom/whoop/labradorService/data/a;
.super Lmb/b;
.source "SourceFile"


# instance fields
.field private final a:Lmb/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    new-instance v0, Lcom/whoop/labradorService/data/LabradorPacketDatabase$a;

    invoke-direct {v0}, Lcom/whoop/labradorService/data/LabradorPacketDatabase$a;-><init>()V

    iput-object v0, p0, Lcom/whoop/labradorService/data/a;->a:Lmb/a;

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_ecg_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT INTO `_new_ecg_packets` (`timestamp`,`packet_revision`,`packet_data`,`version_id`) SELECT `timestamp`,`packet_revision`,`packet_data`,`version_id` FROM `raw_ecg_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE `raw_ecg_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "ALTER TABLE `_new_ecg_packets` RENAME TO `ecg_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_ecg_packets_timestamp_packet_revision` ON `ecg_packets` (`timestamp`, `packet_revision`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Lcom/whoop/labradorService/data/a;->a:Lmb/a;

    invoke-interface {v0, p1}, Lmb/a;->f(Ltb/a;)V

    return-void
.end method
