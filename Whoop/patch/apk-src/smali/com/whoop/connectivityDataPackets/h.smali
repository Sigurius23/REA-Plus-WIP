.class final Lcom/whoop/connectivityDataPackets/h;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `console_packets_metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
