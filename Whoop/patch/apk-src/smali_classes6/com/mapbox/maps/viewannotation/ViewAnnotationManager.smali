.class public interface abstract Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;,
        Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0004\u0008f\u0018\u0000 B2\u00020\u0001:\u0001BJ!\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J=\u0010\u0007\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000c0\u000bH&\u00a2\u0006\u0004\u0008\u0007\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000c2\u0006\u0010 \u001a\u00020\u001fH&\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020\u000c2\u0006\u0010 \u001a\u00020\u001fH&\u00a2\u0006\u0004\u0008#\u0010\"J\u0017\u0010&\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020$H&\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020$H&\u00a2\u0006\u0004\u0008(\u0010)JC\u00102\u001a\u0004\u0018\u0001012\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00060*2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010.H\'\u00a2\u0006\u0004\u00082\u00103JU\u00102\u001a\u00020\u000c2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00060*2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010.2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000c0\u000bH&\u00a2\u0006\u0004\u00082\u00105R2\u0010>\u001a\u0012\u0012\u0004\u0012\u00020706j\u0008\u0012\u0004\u0012\u000207`88&@&X\u00a7\u000e\u00a2\u0006\u0012\u0012\u0004\u0008=\u0010\u0015\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040?8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;",
        "",
        "",
        "resId",
        "Lcom/mapbox/maps/ViewAnnotationOptions;",
        "options",
        "Landroid/view/View;",
        "addViewAnnotation",
        "(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;",
        "Lw/a;",
        "asyncInflater",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "asyncInflateCallback",
        "(ILcom/mapbox/maps/ViewAnnotationOptions;Lw/a;Lkotlin/jvm/functions/Function1;)V",
        "view",
        "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V",
        "",
        "removeViewAnnotation",
        "(Landroid/view/View;)Z",
        "removeAllViewAnnotations",
        "()V",
        "updateViewAnnotation",
        "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)Z",
        "Lcom/mapbox/maps/AnnotatedLayerFeature;",
        "annotatedLayerFeature",
        "getViewAnnotation",
        "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Landroid/view/View;",
        "getViewAnnotationOptions",
        "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/ViewAnnotationOptions;",
        "(Landroid/view/View;)Lcom/mapbox/maps/ViewAnnotationOptions;",
        "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;",
        "listener",
        "addOnViewAnnotationUpdatedListener",
        "(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V",
        "removeOnViewAnnotationUpdatedListener",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;",
        "mode",
        "setViewAnnotationUpdateMode",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V",
        "getViewAnnotationUpdateMode",
        "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;",
        "",
        "annotations",
        "Lcom/mapbox/maps/EdgeInsets;",
        "edgeInsets",
        "",
        "bearing",
        "pitch",
        "Lcom/mapbox/maps/CameraOptions;",
        "cameraForAnnotations",
        "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;",
        "result",
        "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V",
        "Ljava/util/HashSet;",
        "",
        "Lkotlin/collections/HashSet;",
        "getViewAnnotationAvoidLayers",
        "()Ljava/util/HashSet;",
        "setViewAnnotationAvoidLayers",
        "(Ljava/util/HashSet;)V",
        "getViewAnnotationAvoidLayers$annotations",
        "viewAnnotationAvoidLayers",
        "",
        "getAnnotations",
        "()Ljava/util/Map;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;

.field public static final DEFAULT_UPDATE_MODE:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;->$$INSTANCE:Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;

    sput-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;->Companion:Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;

    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;->MAP_SYNCHRONIZED:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    sput-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;->DEFAULT_UPDATE_MODE:Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    return-void
.end method


# virtual methods
.method public abstract addOnViewAnnotationUpdatedListener(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V
.end method

.method public abstract addViewAnnotation(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;
.end method

.method public abstract addViewAnnotation(ILcom/mapbox/maps/ViewAnnotationOptions;Lw/a;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            "Lw/a;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V
.end method

.method public abstract cameraForAnnotations(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;
    .annotation build Lcom/mapbox/maps/MapboxDelicateApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lcom/mapbox/maps/EdgeInsets;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")",
            "Lcom/mapbox/maps/CameraOptions;"
        }
    .end annotation
.end method

.method public abstract cameraForAnnotations(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lcom/mapbox/maps/EdgeInsets;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getAnnotations()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getViewAnnotation(Lcom/mapbox/maps/AnnotatedLayerFeature;)Landroid/view/View;
.end method

.method public abstract getViewAnnotationAvoidLayers()Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getViewAnnotationOptions(Landroid/view/View;)Lcom/mapbox/maps/ViewAnnotationOptions;
.end method

.method public abstract getViewAnnotationOptions(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/ViewAnnotationOptions;
.end method

.method public abstract getViewAnnotationUpdateMode()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;
.end method

.method public abstract removeAllViewAnnotations()V
.end method

.method public abstract removeOnViewAnnotationUpdatedListener(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V
.end method

.method public abstract removeViewAnnotation(Landroid/view/View;)Z
.end method

.method public abstract setViewAnnotationAvoidLayers(Ljava/util/HashSet;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setViewAnnotationUpdateMode(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V
.end method

.method public abstract updateViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)Z
.end method
