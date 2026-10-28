.class public final Lqv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field public final synthetic w:Lcom/mapbox/maps/MapboxLifecycleObserver;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqv/b;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    iget-object v0, p0, Lqv/b;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    invoke-interface {v0}, Lcom/mapbox/maps/MapboxLifecycleObserver;->onLowMemory()V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 2

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xf

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onTrimMemory with level "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is received, reduceMemoryUse will be called."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MapboxLifecyclePlugin"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lqv/b;->w:Lcom/mapbox/maps/MapboxLifecycleObserver;

    invoke-interface {p1}, Lcom/mapbox/maps/MapboxLifecycleObserver;->onLowMemory()V

    return-void
.end method
