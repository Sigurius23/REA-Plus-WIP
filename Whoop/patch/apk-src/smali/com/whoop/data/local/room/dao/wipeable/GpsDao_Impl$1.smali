.class Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;-><init>(Landroidx/room/z0;)V
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
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/GpsDto;)V
    .locals 3

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/GpsDto;->getTimeStamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/GpsDto;->getLatitude()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/GpsDto;->getLongitude()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x4

    .line 5
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/GpsDto;->getAltitude()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/GpsDto;->getHorizontalAccuracy()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x6

    .line 7
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/GpsDto;->getVerticalAccuracy()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/GpsDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/GpsDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_gps` (`time_stamp`,`latitude`,`longitude`,`altitude`,`horizontal_accuracy`,`vertical_accuracy`) VALUES (?,?,?,?,?,?)"

    return-object v0
.end method
