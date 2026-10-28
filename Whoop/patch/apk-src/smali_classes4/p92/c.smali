.class public final Lp92/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J)\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lp92/c;",
        "",
        "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;",
        "gpsDao",
        "Lcom/whoop/data/remote/commons/AppExecutors;",
        "appExecutors",
        "<init>",
        "(Lcom/whoop/data/local/room/dao/wipeable/GpsDao;Lcom/whoop/data/remote/commons/AppExecutors;)V",
        "Lcom/whoop/data/local/room/entity/GpsDto;",
        "gpsDto",
        "Ll83/a0;",
        "g",
        "(Lcom/whoop/data/local/room/entity/GpsDto;)V",
        "Lp92/h$a;",
        "routePoint",
        "k",
        "(Lp92/h$a;)V",
        "",
        "start",
        "end",
        "i",
        "(JJ)V",
        "d",
        "Landroidx/lifecycle/p0;",
        "",
        "f",
        "(JJ)Landroidx/lifecycle/p0;",
        "a",
        "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;",
        "getGpsDao",
        "()Lcom/whoop/data/local/room/dao/wipeable/GpsDao;",
        "b",
        "Lcom/whoop/data/remote/commons/AppExecutors;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

.field private final b:Lcom/whoop/data/remote/commons/AppExecutors;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/GpsDao;Lcom/whoop/data/remote/commons/AppExecutors;)V
    .locals 1

    const-string v0, "gpsDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appExecutors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp92/c;->a:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    iput-object p2, p0, Lp92/c;->b:Lcom/whoop/data/remote/commons/AppExecutors;

    return-void
.end method

.method public static synthetic a(Lp92/c;JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp92/c;->e(Lp92/c;JJ)V

    return-void
.end method

.method public static synthetic b(Lp92/c;JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp92/c;->j(Lp92/c;JJ)V

    return-void
.end method

.method public static synthetic c(Lp92/c;Lcom/whoop/data/local/room/entity/GpsDto;)V
    .locals 0

    invoke-static {p0, p1}, Lp92/c;->h(Lp92/c;Lcom/whoop/data/local/room/entity/GpsDto;)V

    return-void
.end method

.method private static final e(Lp92/c;JJ)V
    .locals 0

    iget-object p0, p0, Lp92/c;->a:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    invoke-interface {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao;->removeGpsData(JJ)V

    return-void
.end method

.method private final g(Lcom/whoop/data/local/room/entity/GpsDto;)V
    .locals 3

    iget-object v0, p0, Lp92/c;->b:Lcom/whoop/data/remote/commons/AppExecutors;

    invoke-virtual {v0}, Lcom/whoop/data/remote/commons/AppExecutors;->diskIO()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lio/sentry/android/core/r0;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p0, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final h(Lp92/c;Lcom/whoop/data/local/room/entity/GpsDto;)V
    .locals 0

    iget-object p0, p0, Lp92/c;->a:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    invoke-interface {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao;->saveGpsDto(Lcom/whoop/data/local/room/entity/GpsDto;)V

    return-void
.end method

.method private static final j(Lp92/c;JJ)V
    .locals 1

    iget-object p0, p0, Lp92/c;->a:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    new-instance v0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;-><init>(JJ)V

    invoke-interface {p0, v0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao;->saveGpsMetaData(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;)V

    return-void
.end method


# virtual methods
.method public final d(JJ)V
    .locals 8

    iget-object v0, p0, Lp92/c;->b:Lcom/whoop/data/remote/commons/AppExecutors;

    invoke-virtual {v0}, Lcom/whoop/data/remote/commons/AppExecutors;->diskIO()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lp92/b;

    const/4 v7, 0x0

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, Lp92/b;-><init>(Lp92/c;JJI)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(JJ)Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lp92/c;->a:Lcom/whoop/data/local/room/dao/wipeable/GpsDao;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao;->getGpsLiveData(JJ)Landroidx/lifecycle/p0;

    move-result-object p1

    return-object p1
.end method

.method public final i(JJ)V
    .locals 8

    iget-object v0, p0, Lp92/c;->b:Lcom/whoop/data/remote/commons/AppExecutors;

    invoke-virtual {v0}, Lcom/whoop/data/remote/commons/AppExecutors;->diskIO()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lp92/b;

    const/4 v7, 0x1

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, Lp92/b;-><init>(Lp92/c;JJI)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k(Lp92/h$a;)V
    .locals 14

    const-string v0, "routePoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/local/room/entity/GpsDto;

    invoke-virtual {p1}, Lp92/h$a;->d()J

    move-result-wide v2

    invoke-virtual {p1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {p1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual {p1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v8

    invoke-virtual {p1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v10, v0

    invoke-virtual {p1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {p1}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result p1

    float-to-double v12, p1

    invoke-direct/range {v1 .. v13}, Lcom/whoop/data/local/room/entity/GpsDto;-><init>(JDDDDD)V

    invoke-direct {p0, v1}, Lp92/c;->g(Lcom/whoop/data/local/room/entity/GpsDto;)V

    return-void
.end method
