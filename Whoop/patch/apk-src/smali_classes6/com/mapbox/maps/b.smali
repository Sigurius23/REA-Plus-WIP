.class public final synthetic Lcom/mapbox/maps/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/CameraChangedCoalescedCallback;
.implements Lcom/mapbox/maps/StyleDataLoadedCallback;


# instance fields
.field public final synthetic w:Lcom/mapbox/maps/MapController;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/MapController;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/b;->w:Lcom/mapbox/maps/MapController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/b;->w:Lcom/mapbox/maps/MapController;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapController;->d(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/CameraChangedCoalesced;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/b;->w:Lcom/mapbox/maps/MapController;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapController;->e(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/StyleDataLoaded;)V

    return-void
.end method
