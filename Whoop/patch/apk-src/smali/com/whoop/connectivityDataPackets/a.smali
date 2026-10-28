.class final Lcom/whoop/connectivityDataPackets/a;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `memfault_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serial_number` TEXT NOT NULL, `value` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
