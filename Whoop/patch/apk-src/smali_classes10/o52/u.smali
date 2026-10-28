.class public final synthetic Lo52/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/Style$OnStyleLoaded;


# instance fields
.field public final synthetic w:Lcom/mapbox/maps/MapboxMap;

.field public final synthetic x:Lo52/w;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/MapboxMap;Lo52/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo52/u;->w:Lcom/mapbox/maps/MapboxMap;

    iput-object p2, p0, Lo52/u;->x:Lo52/w;

    return-void
.end method


# virtual methods
.method public final onStyleLoaded(Lcom/mapbox/maps/Style;)V
    .locals 2

    iget-object v0, p0, Lo52/u;->w:Lcom/mapbox/maps/MapboxMap;

    iget-object v1, p0, Lo52/u;->x:Lo52/w;

    invoke-static {v0, v1, p1}, Lo52/w;->W(Lcom/mapbox/maps/MapboxMap;Lo52/w;Lcom/mapbox/maps/Style;)V

    return-void
.end method
