.class Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;)V
    .locals 3

    .line 2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getPacketRevision()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    .line 4
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getPacketData()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    .line 5
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->getVersionId()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x4

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `cached_table_metrics_data` (`packet_revision`,`timestamp`,`packet_data`,`version_id`) VALUES (?,?,?,?)"

    return-object v0
.end method
