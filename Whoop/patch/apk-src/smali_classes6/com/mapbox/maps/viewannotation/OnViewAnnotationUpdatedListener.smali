.class public interface abstract Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;",
        "",
        "Landroid/view/View;",
        "view",
        "Lcom/mapbox/maps/ScreenCoordinate;",
        "leftTopCoordinate",
        "",
        "width",
        "height",
        "Ll83/a0;",
        "onViewAnnotationPositionUpdated",
        "(Landroid/view/View;Lcom/mapbox/maps/ScreenCoordinate;DD)V",
        "",
        "visible",
        "onViewAnnotationVisibilityUpdated",
        "(Landroid/view/View;Z)V",
        "Lcom/mapbox/geojson/Point;",
        "anchorCoordinate",
        "onViewAnnotationAnchorCoordinateUpdated",
        "(Landroid/view/View;Lcom/mapbox/geojson/Point;)V",
        "Lcom/mapbox/maps/ViewAnnotationAnchorConfig;",
        "anchor",
        "onViewAnnotationAnchorUpdated",
        "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationAnchorConfig;)V",
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


# virtual methods
.method public abstract onViewAnnotationAnchorCoordinateUpdated(Landroid/view/View;Lcom/mapbox/geojson/Point;)V
.end method

.method public abstract onViewAnnotationAnchorUpdated(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationAnchorConfig;)V
.end method

.method public abstract onViewAnnotationPositionUpdated(Landroid/view/View;Lcom/mapbox/maps/ScreenCoordinate;DD)V
.end method

.method public abstract onViewAnnotationVisibilityUpdated(Landroid/view/View;Z)V
.end method
