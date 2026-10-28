.class final Lcom/whoop/connectivityDataPackets/f;
.super Lmb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x11

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Ltb/a;)V
    .locals 1

    const-string v0, "ALTER TABLE `table_metrics_data` ADD COLUMN `frame_revision` INTEGER NOT NULL DEFAULT 1"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method
