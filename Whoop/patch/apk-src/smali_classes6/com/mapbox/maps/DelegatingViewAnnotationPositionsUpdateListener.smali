.class public abstract Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH&\u00a2\u0006\u0004\u0008\u000c\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;",
        "Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;",
        "<init>",
        "()V",
        "",
        "Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;",
        "positions",
        "Ll83/a0;",
        "onViewAnnotationPositionsUpdate",
        "(Ljava/util/List;)V",
        "",
        "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
        "onDelegatingViewAnnotationPositionsUpdate",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onDelegatingViewAnnotationPositionsUpdate(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
            ">;)V"
        }
    .end annotation
.end method

.method public final onViewAnnotationPositionsUpdate(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;",
            ">;)V"
        }
    .end annotation

    const-string v0, "positions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;

    new-instance v2, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    invoke-virtual {v1}, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    const-string v4, "it.identifier"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;->getWidth()D

    move-result-wide v4

    invoke-virtual {v1}, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;->getHeight()D

    move-result-wide v6

    invoke-virtual {v1}, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;->getLeftTopCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v8

    const-string v9, "it.leftTopCoordinate"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;->getAnchorCoordinate()Lcom/mapbox/geojson/Point;

    move-result-object v9

    const-string v10, "it.anchorCoordinate"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;->getAnchorConfig()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object v10

    const-string v1, "it.anchorConfig"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v2 .. v10}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;-><init>(Ljava/lang/String;DDLcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/geojson/Point;Lcom/mapbox/maps/ViewAnnotationAnchorConfig;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;->onDelegatingViewAnnotationPositionsUpdate(Ljava/util/List;)V

    return-void
.end method
