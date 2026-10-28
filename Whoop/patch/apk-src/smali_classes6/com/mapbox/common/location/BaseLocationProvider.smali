.class public abstract Lcom/mapbox/common/location/BaseLocationProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/location/LocationProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/location/BaseLocationProvider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\rR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u00128\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/mapbox/common/location/BaseLocationProvider;",
        "Lcom/mapbox/common/location/LocationProvider;",
        "<init>",
        "()V",
        "",
        "Lcom/mapbox/common/location/Location;",
        "locations",
        "Ll83/a0;",
        "notifyLocationUpdate",
        "(Ljava/util/List;)V",
        "Lcom/mapbox/common/location/LocationObserver;",
        "observer",
        "addLocationObserver",
        "(Lcom/mapbox/common/location/LocationObserver;)V",
        "Landroid/os/Looper;",
        "looper",
        "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V",
        "removeLocationObserver",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Landroid/os/Handler;",
        "observers",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "getObservers",
        "()Ljava/util/concurrent/ConcurrentHashMap;",
        "Companion",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field protected static final Companion:Lcom/mapbox/common/location/BaseLocationProvider$Companion;

.field protected static final EMPTY_HANDLER:Landroid/os/Handler;


# instance fields
.field private final observers:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/mapbox/common/location/LocationObserver;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/location/BaseLocationProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/location/BaseLocationProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/location/BaseLocationProvider;->Companion:Lcom/mapbox/common/location/BaseLocationProvider$Companion;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/mapbox/common/location/BaseLocationProvider;->EMPTY_HANDLER:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/mapbox/common/location/BaseLocationProvider;->observers:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/common/location/LocationObserver;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/location/BaseLocationProvider;->notifyLocationUpdate$lambda$1$lambda$0(Lcom/mapbox/common/location/LocationObserver;Ljava/util/List;)V

    return-void
.end method

.method private static final notifyLocationUpdate$lambda$1$lambda$0(Lcom/mapbox/common/location/LocationObserver;Ljava/util/List;)V
    .locals 1

    const-string v0, "$observer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/mapbox/common/location/LocationObserver;->onLocationUpdateReceived(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public addLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
    .locals 3

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/mapbox/common/location/BaseLocationProvider;->observers:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/mapbox/common/location/BaseLocationProvider;->EMPTY_HANDLER:Landroid/os/Handler;

    :goto_0
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public addLocationObserver(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V
    .locals 2

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "looper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/common/location/BaseLocationProvider;->observers:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final getObservers()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/mapbox/common/location/LocationObserver;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/common/location/BaseLocationProvider;->observers:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public notifyLocationUpdate(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/mapbox/common/location/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/BaseLocationProvider;->observers:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/common/location/LocationObserver;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    sget-object v3, Lcom/mapbox/common/location/BaseLocationProvider;->EMPTY_HANDLER:Landroid/os/Handler;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/mapbox/common/location/e;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v2, p1}, Lcom/mapbox/common/location/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {v2, p1}, Lcom/mapbox/common/location/LocationObserver;->onLocationUpdateReceived(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/BaseLocationProvider;->observers:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
