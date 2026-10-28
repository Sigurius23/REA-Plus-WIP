.class public final synthetic Lcom/mapbox/maps/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/StyleDataLoadedCallback;
.implements Lcom/mapbox/maps/StyleLoadedCallback;
.implements Lcom/mapbox/maps/StyleImageMissingCallback;


# instance fields
.field public final synthetic w:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/o;->w:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/o;->w:Ljava/lang/ref/WeakReference;

    invoke-static {v0, p1}, Lcom/mapbox/maps/Snapshotter;->f(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/StyleDataLoaded;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleImageMissing;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/o;->w:Ljava/lang/ref/WeakReference;

    invoke-static {v0, p1}, Lcom/mapbox/maps/Snapshotter;->d(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/StyleImageMissing;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleLoaded;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/mapbox/maps/o;->w:Ljava/lang/ref/WeakReference;

    invoke-static {v0, p1}, Lcom/mapbox/maps/Snapshotter;->h(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/StyleLoaded;)V

    return-void
.end method
