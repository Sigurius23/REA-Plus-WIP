.class final Lcom/whoop/connectivityDataPackets/d;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xe

    const/16 v1, 0xf

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_rev2_raw_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `sequence_no` INTEGER NOT NULL, `metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_table_rev2_raw_data_packet_time_stamp_sequence_no` ON `table_rev2_raw_data` (`packet_time_stamp`, `sequence_no`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
