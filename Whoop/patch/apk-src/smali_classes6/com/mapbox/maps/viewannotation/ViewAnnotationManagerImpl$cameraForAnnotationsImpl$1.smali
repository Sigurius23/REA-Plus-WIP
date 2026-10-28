.class final Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->cameraForAnnotationsImpl(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/mapbox/maps/CameraOptions;",
        "cameraForViewAnnotationPoints",
        "Ll83/a0;",
        "invoke",
        "(Lcom/mapbox/maps/CameraOptions;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $cameraOptionsWithNoZoom:Lcom/mapbox/maps/CameraOptions;

.field final synthetic $edgeInsets:Lcom/mapbox/maps/EdgeInsets;

.field final synthetic $resultCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $viewAnnotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;",
            "Lcom/mapbox/maps/EdgeInsets;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;",
            ">;",
            "Lcom/mapbox/maps/CameraOptions;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->this$0:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;

    iput-object p2, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$edgeInsets:Lcom/mapbox/maps/EdgeInsets;

    iput-object p3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$viewAnnotations:Ljava/util/List;

    iput-object p4, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$cameraOptionsWithNoZoom:Lcom/mapbox/maps/CameraOptions;

    iput-object p5, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$resultCallback:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/mapbox/maps/CameraOptions;

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->invoke(Lcom/mapbox/maps/CameraOptions;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lcom/mapbox/maps/CameraOptions;)V
    .locals 7

    const-string v0, "cameraForViewAnnotationPoints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->this$0:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;

    .line 3
    iget-object v3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$edgeInsets:Lcom/mapbox/maps/EdgeInsets;

    .line 4
    iget-object v4, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$viewAnnotations:Ljava/util/List;

    .line 5
    iget-object v5, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$cameraOptionsWithNoZoom:Lcom/mapbox/maps/CameraOptions;

    .line 6
    iget-object v6, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;->$resultCallback:Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    .line 7
    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->access$adjustCameraForAnnotations(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    return-void
.end method
