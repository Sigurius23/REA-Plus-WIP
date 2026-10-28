.class final Lcom/whoop/connectivityDataPackets/i;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x7

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_research_packets` (`revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packetData` BLOB NOT NULL, `versionId` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
