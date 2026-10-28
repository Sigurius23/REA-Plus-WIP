.class public final Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;
.super Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;,
        Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;,
        Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0089\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u0005*\u0001f\u0008\u0001\u0018\u0000 \u00a4\u00012\u00020\u00012\u00020\u0002:\u0004\u00a4\u0001\u00a5\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J=\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0013\u001a\u00020\u00102\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008#\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008*\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008/\u00100J=\u00109\u001a\u0004\u0018\u0001082\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u0010012\u0008\u00104\u001a\u0004\u0018\u0001032\u0008\u00106\u001a\u0004\u0018\u0001052\u0008\u00107\u001a\u0004\u0018\u000105H\u0017\u00a2\u0006\u0004\u00089\u0010:JO\u00109\u001a\u00020\u00112\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u0010012\u0008\u00104\u001a\u0004\u0018\u0001032\u0008\u00106\u001a\u0004\u0018\u0001052\u0008\u00107\u001a\u0004\u0018\u0001052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00110\u000fH\u0016\u00a2\u0006\u0004\u00089\u0010<J\u001d\u0010?\u001a\u00020\u00112\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020=01H\u0017\u00a2\u0006\u0004\u0008?\u0010@J\r\u0010A\u001a\u00020\u0011\u00a2\u0006\u0004\u0008A\u0010\u001cJS\u0010C\u001a\u0004\u0018\u0001082\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u0010012\u0008\u00104\u001a\u0004\u0018\u0001032\u0008\u00106\u001a\u0004\u0018\u0001052\u0008\u00107\u001a\u0004\u0018\u0001052\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008C\u0010DJO\u0010I\u001a\u0004\u0018\u0001082\u0006\u0010E\u001a\u0002082\u0008\u00104\u001a\u0004\u0018\u0001032\u000c\u0010G\u001a\u0008\u0012\u0004\u0012\u00020F012\u0006\u0010H\u001a\u0002082\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ1\u0010M\u001a\u0004\u0018\u0001082\u0008\u0010K\u001a\u0004\u0018\u0001082\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008M\u0010NJ+\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010O\u001a\u00020F2\u0006\u0010Q\u001a\u00020P2\u0008\u0010R\u001a\u0004\u0018\u000105H\u0002\u00a2\u0006\u0004\u0008T\u0010UJ\u001f\u0010X\u001a\u0004\u0018\u00010W*\u00020F2\u0008\u0010V\u001a\u0004\u0018\u00010=H\u0002\u00a2\u0006\u0004\u0008X\u0010YJ#\u0010Z\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020F2\u0008\u0010V\u001a\u0004\u0018\u00010=H\u0002\u00a2\u0006\u0004\u0008Z\u0010[J\u0017\u0010\\\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\\\u0010]J\u001f\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008_\u0010\u0017J\u0017\u0010`\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008`\u0010aJ\'\u0010g\u001a\u00020f2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0002\u00a2\u0006\u0004\u0008g\u0010hJ\u0017\u0010i\u001a\u00020d2\u0006\u0010O\u001a\u00020FH\u0002\u00a2\u0006\u0004\u0008i\u0010jJ\u0017\u0010k\u001a\u00020b2\u0006\u0010O\u001a\u00020FH\u0002\u00a2\u0006\u0004\u0008k\u0010lJ\'\u0010n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0m2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008n\u0010oJ\u001d\u0010q\u001a\u00020\u00112\u000c\u0010p\u001a\u0008\u0012\u0004\u0012\u00020=01H\u0002\u00a2\u0006\u0004\u0008q\u0010@J\u001f\u0010s\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002\u00a2\u0006\u0004\u0008s\u0010tJ\u001f\u0010u\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002\u00a2\u0006\u0004\u0008u\u0010tJ\u001f\u0010v\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002\u00a2\u0006\u0004\u0008v\u0010tJ.\u0010{\u001a\u0004\u0018\u00018\u0000\"\u0006\u0008\u0000\u0010w\u0018\u00012\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u00000xH\u0082\u0008\u00a2\u0006\u0004\u0008{\u0010|J\"\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020F2\u0006\u0010\u007f\u001a\u00020~H\u0002\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020FH\u0002\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\"\u0010G\u001a\u000f\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020F0\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008G\u0010\u008f\u0001R-\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0090\u00018\u0000X\u0081\u0004\u00a2\u0006\u0017\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001\u0012\u0005\u0008\u0095\u0001\u0010\u001c\u001a\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u001d\u0010p\u001a\u0008\u0012\u0004\u0012\u00020=018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008p\u0010\u0096\u0001R\u001f\u0010\u0097\u0001\u001a\u0008\u0012\u0004\u0012\u00020=018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0096\u0001RU\u0010\u00a0\u0001\u001a\u0014\u0012\u0004\u0012\u00020y0\u0098\u0001j\t\u0012\u0004\u0012\u00020y`\u0099\u00012\u0019\u0010\u009a\u0001\u001a\u0014\u0012\u0004\u0012\u00020y0\u0098\u0001j\t\u0012\u0004\u0012\u00020y`\u0099\u00018V@VX\u0097\u000e\u00a2\u0006\u0017\u0012\u0005\u0008\u009f\u0001\u0010\u001c\u001a\u0006\u0008\u009b\u0001\u0010\u009c\u0001\"\u0006\u0008\u009d\u0001\u0010\u009e\u0001R#\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u00a1\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\u00a8\u0006\u00a6\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;",
        "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;",
        "Lcom/mapbox/maps/MapView;",
        "mapView",
        "Landroid/widget/FrameLayout;",
        "viewAnnotationsLayout",
        "<init>",
        "(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;)V",
        "",
        "resId",
        "Lcom/mapbox/maps/ViewAnnotationOptions;",
        "options",
        "Lw/a;",
        "asyncInflater",
        "Lkotlin/Function1;",
        "Landroid/view/View;",
        "Ll83/a0;",
        "asyncInflateCallback",
        "addViewAnnotation",
        "(ILcom/mapbox/maps/ViewAnnotationOptions;Lw/a;Lkotlin/jvm/functions/Function1;)V",
        "(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;",
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
        "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
        "positions",
        "onDelegatingViewAnnotationPositionsUpdate",
        "(Ljava/util/List;)V",
        "destroy",
        "resultCallback",
        "cameraForAnnotationsImpl",
        "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;",
        "cameraForViewAnnotationPoints",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;",
        "viewAnnotations",
        "cameraOptionsWithNoZoom",
        "adjustCameraForAnnotations",
        "(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;",
        "camera",
        "callback",
        "invokeCallbackAndReturn",
        "(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;",
        "viewAnnotation",
        "Landroid/graphics/Rect;",
        "annotationFrame",
        "zoom",
        "Lcom/mapbox/maps/CoordinateBounds;",
        "calculateCoordinateBoundForAnnotation",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Landroid/graphics/Rect;Ljava/lang/Double;)Lcom/mapbox/maps/CoordinateBounds;",
        "positionDescriptor",
        "Lcom/mapbox/geojson/Point;",
        "coordinate",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;",
        "getViewAnnotationOptionsFrame",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Landroid/graphics/Rect;",
        "validateOptions",
        "(Lcom/mapbox/maps/ViewAnnotationOptions;)V",
        "inflatedView",
        "prepareViewAnnotation",
        "measureView",
        "(Landroid/view/View;)V",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "onGlobalLayoutListener",
        "Landroid/view/ViewTreeObserver$OnDrawListener;",
        "onDrawListener",
        "com/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1",
        "buildAttachStateListener",
        "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnDrawListener;)Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;",
        "buildDrawListener",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnDrawListener;",
        "buildGlobalLayoutListener",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Ll83/k;",
        "findByAnnotatedLayerFeature",
        "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Ll83/k;",
        "updatedPositionDescriptors",
        "positionAnnotationViews",
        "newPositionDescriptor",
        "notifyPositionListeners",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V",
        "notifyAnchorCoordinateListeners",
        "notifyAnchorListeners",
        "V",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "expected",
        "getValue",
        "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;",
        "annotation",
        "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;",
        "currentVisibility",
        "updateVisibilityAndNotifyUpdateListeners",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V",
        "remove",
        "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)V",
        "Landroid/widget/FrameLayout;",
        "Lcom/mapbox/maps/MapboxMap;",
        "mapboxMap",
        "Lcom/mapbox/maps/MapboxMap;",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "renderThread",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "",
        "pixelRatio",
        "F",
        "",
        "Ljava/util/Map;",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "viewUpdatedListenerSet",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "getViewUpdatedListenerSet$maps_sdk_release",
        "()Ljava/util/concurrent/CopyOnWriteArraySet;",
        "getViewUpdatedListenerSet$maps_sdk_release$annotations",
        "Ljava/util/List;",
        "currentPositionDescriptors",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "value",
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
        "ViewAnnotation",
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
.field public static final Companion:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;

.field private static final EXCEPTION_TEXT_FEATURE_IS_NULL:Ljava/lang/String; = "Annotated feature can not be null!"

.field private static final MAX_ADJUST_BOUNDS_COUNTER:I = 0x2

.field private static final TAG:Ljava/lang/String; = "ViewAnnotationImpl"

.field private static final USER_FIXED_DIMENSION:I = -0x1


# instance fields
.field private currentPositionDescriptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private final mapboxMap:Lcom/mapbox/maps/MapboxMap;

.field private final pixelRatio:F

.field private final renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

.field private volatile updatedPositionDescriptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private final viewAnnotations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;",
            ">;"
        }
    .end annotation
.end field

.field private final viewAnnotationsLayout:Landroid/widget/FrameLayout;

.field private final viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->Companion:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;)V
    .locals 3

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewAnnotationsLayout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;-><init>()V

    .line 4
    iput-object p2, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    .line 5
    invoke-virtual {p1}, Lcom/mapbox/maps/MapView;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    .line 6
    invoke-virtual {p1}, Lcom/mapbox/maps/MapView;->getMapController$maps_sdk_release()Lcom/mapbox/maps/MapController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/MapController;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v1

    iput-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->pixelRatio:F

    .line 8
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    .line 9
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    sget-object v1, Lm83/y;->w:Lm83/y;

    iput-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updatedPositionDescriptors:Ljava/util/List;

    .line 11
    iput-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->currentPositionDescriptors:Ljava/util/List;

    .line 12
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x1

    .line 13
    invoke-virtual {p1, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    const/4 p2, 0x0

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 15
    invoke-virtual {v0, p0}, Lcom/mapbox/maps/MapboxMap;->setViewAnnotationPositionsUpdateListener$maps_sdk_release(Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;-><init>(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;)V

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->buildDrawListener$lambda$21(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V

    return-void
.end method

.method public static final synthetic access$adjustCameraForAnnotations(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->adjustCameraForAnnotations(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p0

    return-object p0
.end method

.method private static final addViewAnnotation$lambda$0(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Lcom/mapbox/maps/ViewAnnotationOptions;Lkotlin/jvm/functions/Function1;Landroid/view/View;ILandroid/view/ViewGroup;)V
    .locals 0

    const-string p4, "this$0"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "$options"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "$asyncInflateCallback"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "view"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->prepareViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final adjustCameraForAnnotations(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/CameraOptions;",
            "Lcom/mapbox/maps/EdgeInsets;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;",
            ">;",
            "Lcom/mapbox/maps/CameraOptions;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/maps/CameraOptions;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {p1 .. p1}, Lcom/mapbox/maps/util/CameraOptionsUtils;->isEmpty(Lcom/mapbox/maps/CameraOptions;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-direct {v0, v6, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->invokeCallbackAndReturn(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    return-object v1

    :cond_0
    move-object/from16 v7, p1

    move v8, v3

    move-object v10, v6

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    const/4 v9, 0x1

    :goto_0
    if-nez v8, :cond_16

    const/4 v8, 0x2

    if-gt v9, v8, :cond_16

    invoke-virtual {v7}, Lcom/mapbox/maps/CameraOptions;->getZoom()Ljava/lang/Double;

    move-result-object v7

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v8, p3

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    const/4 v10, 0x1

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v15}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v5

    invoke-direct {v0, v15, v5}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->getViewAnnotationOptionsFrame(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Landroid/graphics/Rect;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v3, v3, v3, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    :cond_1
    invoke-direct {v0, v15, v5, v7}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->calculateCoordinateBoundForAnnotation(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Landroid/graphics/Rect;Ljava/lang/Double;)Lcom/mapbox/maps/CoordinateBounds;

    move-result-object v16

    if-nez v16, :cond_2

    goto/16 :goto_2

    :cond_2
    if-eqz v11, :cond_3

    iget-object v3, v11, Ll83/q;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v17

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->north()D

    move-result-wide v19

    cmpg-double v3, v17, v19

    if-gez v3, :cond_4

    :cond_3
    new-instance v11, Ll83/q;

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->north()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v11, v15, v5, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x0

    :cond_4
    if-eqz v12, :cond_5

    iget-object v3, v12, Ll83/q;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v17

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->east()D

    move-result-wide v19

    cmpg-double v3, v17, v19

    if-gez v3, :cond_6

    :cond_5
    new-instance v12, Ll83/q;

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->east()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v12, v15, v5, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x0

    :cond_6
    if-eqz v14, :cond_7

    iget-object v3, v14, Ll83/q;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v17

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->south()D

    move-result-wide v19

    cmpl-double v3, v17, v19

    if-lez v3, :cond_8

    :cond_7
    new-instance v14, Ll83/q;

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->south()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v14, v15, v5, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x0

    :cond_8
    if-eqz v13, :cond_9

    iget-object v3, v13, Ll83/q;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v17

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->west()D

    move-result-wide v19

    cmpl-double v3, v17, v19

    if-lez v3, :cond_a

    :cond_9
    new-instance v13, Ll83/q;

    invoke-virtual/range {v16 .. v16}, Lcom/mapbox/maps/CoordinateBounds;->west()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v13, v15, v5, v3}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x0

    :cond_a
    :goto_2
    const/4 v3, 0x0

    goto/16 :goto_1

    :cond_b
    if-eqz v11, :cond_15

    if-eqz v12, :cond_15

    if-eqz v14, :cond_15

    if-nez v13, :cond_c

    goto/16 :goto_b

    :cond_c
    iget-object v3, v13, Ll83/q;->w:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    check-cast v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v3

    invoke-direct {v0, v5, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v7

    iget-object v3, v14, Ll83/q;->w:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    check-cast v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v3

    invoke-direct {v0, v5, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v5, v2

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v2

    invoke-static {v7, v8, v2, v3}, Lcom/mapbox/geojson/Point;->fromLngLat(DD)Lcom/mapbox/geojson/Point;

    move-result-object v2

    iget-object v3, v12, Ll83/q;->w:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    check-cast v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v3

    invoke-direct {v0, v7, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v7

    iget-object v3, v11, Ll83/q;->w:Ljava/lang/Object;

    move-object v15, v3

    check-cast v15, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    check-cast v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v3

    invoke-direct {v0, v15, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v15, v4

    invoke-virtual {v3}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v3

    invoke-static {v7, v8, v3, v4}, Lcom/mapbox/geojson/Point;->fromLngLat(DD)Lcom/mapbox/geojson/Point;

    move-result-object v3

    filled-new-array {v2, v3}, [Lcom/mapbox/geojson/Point;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    new-instance v19, Lcom/mapbox/maps/EdgeInsets;

    if-eqz p2, :cond_d

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/EdgeInsets;->getTop()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_3

    :cond_d
    move-object v2, v15

    :goto_3
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    iget-object v4, v11, Ll83/q;->x:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    if-eqz v4, :cond_e

    iget v4, v4, Landroid/graphics/Rect;->top:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_4

    :cond_e
    move-object v4, v5

    :goto_4
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    add-double v20, v7, v2

    if-eqz p2, :cond_f

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/EdgeInsets;->getLeft()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_5

    :cond_f
    move-object v2, v15

    :goto_5
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    iget-object v4, v13, Ll83/q;->x:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    if-eqz v4, :cond_10

    iget v4, v4, Landroid/graphics/Rect;->left:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_6

    :cond_10
    move-object v4, v5

    :goto_6
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    add-double v22, v7, v2

    if-eqz p2, :cond_11

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/EdgeInsets;->getBottom()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_7

    :cond_11
    move-object v2, v15

    :goto_7
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    iget-object v4, v14, Ll83/q;->x:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    if-eqz v4, :cond_12

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_8

    :cond_12
    move-object v4, v5

    :goto_8
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    add-double v24, v7, v2

    if-eqz p2, :cond_13

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/EdgeInsets;->getRight()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_9

    :cond_13
    move-object v2, v15

    :goto_9
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    iget-object v4, v12, Ll83/q;->x:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    if-eqz v4, :cond_14

    iget v4, v4, Landroid/graphics/Rect;->right:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_a

    :cond_14
    move-object v4, v5

    :goto_a
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    add-double v26, v7, v2

    invoke-direct/range {v19 .. v27}, Lcom/mapbox/maps/EdgeInsets;-><init>(DDDD)V

    iget-object v2, v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v2

    move-object/from16 v20, v19

    move-object/from16 v19, p4

    invoke-virtual/range {v17 .. v22}, Lcom/mapbox/maps/MapboxMap;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v7

    move-object v2, v5

    move v8, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v4, v15

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_15
    :goto_b
    const-string v2, "ViewAnnotationImpl"

    const-string v3, "ViewAnnotation options framing is null. Returning empty camera"

    invoke-static {v2, v3}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v6, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->invokeCallbackAndReturn(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    return-object v1

    :cond_16
    invoke-static {v7}, Lcom/mapbox/maps/util/CameraOptionsUtils;->isEmpty(Lcom/mapbox/maps/CameraOptions;)Z

    move-result v2

    if-nez v2, :cond_17

    move-object v6, v7

    :cond_17
    invoke-direct {v0, v6, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->invokeCallbackAndReturn(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    return-object v1
.end method

.method public static synthetic b(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->buildGlobalLayoutListener$lambda$22(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V

    return-void
.end method

.method private final buildAttachStateListener(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnDrawListener;)Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;
    .locals 1

    new-instance v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;

    invoke-direct {v0, p1, p3, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;-><init>(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-object v0
.end method

.method private final buildDrawListener(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnDrawListener;
    .locals 1

    new-instance v0, Lcom/mapbox/maps/viewannotation/b;

    invoke-direct {v0, p1, p0}, Lcom/mapbox/maps/viewannotation/b;-><init>(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V

    return-object v0
.end method

.method private static final buildDrawListener$lambda$21(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V
    .locals 4

    const-string v0, "$viewAnnotation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getHandleVisibilityAutomatically()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->isVisible()Z

    move-result v2

    if-nez v2, :cond_a

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getVisibility()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    move-result-object v2

    sget-object v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INVISIBLE:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    if-eq v2, v3, :cond_a

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getVisibility()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    move-result-object v2

    sget-object v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->VISIBLE_AND_NOT_POSITIONED:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    if-ne v2, v3, :cond_3

    goto/16 :goto_3

    :cond_3
    if-eqz v0, :cond_5

    iget-object v2, p1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v2, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setPositioned(Z)V

    :goto_1
    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    if-eqz v0, :cond_6

    sget-object v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->VISIBLE_AND_NOT_POSITIONED:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    goto :goto_2

    :cond_6
    sget-object v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INVISIBLE:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    :goto_2
    invoke-direct {p1, p0, v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updateVisibilityAndNotifyUpdateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V

    iget-object v2, p1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationOptions$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v2}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/ViewAnnotationOptions;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getVisible()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_7
    if-nez v1, :cond_a

    iget-object p1, p1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    invoke-direct {v1}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;-><init>()V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->visible(Ljava/lang/Boolean;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->build()Lcom/mapbox/maps/ViewAnnotationOptions;

    move-result-object v0

    const-string v1, "Builder()\n              \u2026e)\n              .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/mapbox/maps/MapboxMap;->updateViewAnnotation$maps_sdk_release(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    return-void

    :cond_8
    new-instance p1, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {v2}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    :goto_3
    return-void
.end method

.method private final buildGlobalLayoutListener(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 1

    new-instance v0, Lcom/mapbox/maps/viewannotation/c;

    invoke-direct {v0, p1, p0}, Lcom/mapbox/maps/viewannotation/c;-><init>(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V

    return-object v0
.end method

.method private static final buildGlobalLayoutListener$lambda$22(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;)V
    .locals 7

    const-string v0, "$viewAnnotation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getMeasuredWidth()I

    move-result v0

    const-string v1, "Builder()\n              \u2026))\n              .build()"

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getMeasuredWidth()I

    move-result v3

    if-eq v0, v3, :cond_1

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setMeasuredWidth(I)V

    iget-object v0, p1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    invoke-direct {v4}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->width(Ljava/lang/Double;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->build()Lcom/mapbox/maps/ViewAnnotationOptions;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Lcom/mapbox/maps/MapboxMap;->updateViewAnnotation$maps_sdk_release(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getMeasuredHeight()I

    move-result v0

    if-eq v0, v2, :cond_3

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getMeasuredHeight()I

    move-result v2

    if-eq v0, v2, :cond_3

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setMeasuredHeight(I)V

    iget-object p1, p1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    invoke-direct {v2}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    int-to-double v3, p0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->height(Ljava/lang/Double;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->build()Lcom/mapbox/maps/ViewAnnotationOptions;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, p0}, Lcom/mapbox/maps/MapboxMap;->updateViewAnnotation$maps_sdk_release(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method

.method public static synthetic c(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Ljava/util/List;J)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->onDelegatingViewAnnotationPositionsUpdate$lambda$20(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Ljava/util/List;J)V

    return-void
.end method

.method private final calculateCoordinateBoundForAnnotation(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Landroid/graphics/Rect;Ljava/lang/Double;)Lcom/mapbox/maps/CoordinateBounds;
    .locals 10

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-nez p3, :cond_1

    iget-object p3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/mapbox/maps/MapboxMap;->getMetersPerPixelAtLatitude(D)D

    move-result-wide v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v1

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/mapbox/maps/MapboxMap;->getMetersPerPixelAtLatitude(DD)D

    move-result-wide v0

    :goto_0
    iget-object p3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p3, p1}, Lcom/mapbox/maps/MapboxMap;->projectedMetersForCoordinate(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ProjectedMeters;

    move-result-object p1

    iget p3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->pixelRatio:F

    float-to-double v2, p3

    div-double/2addr v0, v2

    invoke-virtual {p1}, Lcom/mapbox/maps/ProjectedMeters;->getNorthing()D

    move-result-wide v2

    iget p3, p2, Landroid/graphics/Rect;->top:I

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    int-to-double v4, p3

    mul-double/2addr v4, v0

    add-double/2addr v4, v2

    invoke-virtual {p1}, Lcom/mapbox/maps/ProjectedMeters;->getEasting()D

    move-result-wide v2

    iget p3, p2, Landroid/graphics/Rect;->right:I

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    int-to-double v6, p3

    mul-double/2addr v6, v0

    add-double/2addr v6, v2

    invoke-virtual {p1}, Lcom/mapbox/maps/ProjectedMeters;->getNorthing()D

    move-result-wide v2

    iget p3, p2, Landroid/graphics/Rect;->bottom:I

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    int-to-double v8, p3

    mul-double/2addr v8, v0

    sub-double/2addr v2, v8

    invoke-virtual {p1}, Lcom/mapbox/maps/ProjectedMeters;->getEasting()D

    move-result-wide v8

    iget p1, p2, Landroid/graphics/Rect;->left:I

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-double p1, p1

    mul-double/2addr p1, v0

    sub-double/2addr v8, p1

    new-instance p1, Lcom/mapbox/maps/ProjectedMeters;

    invoke-direct {p1, v4, v5, v6, v7}, Lcom/mapbox/maps/ProjectedMeters;-><init>(DD)V

    new-instance p2, Lcom/mapbox/maps/ProjectedMeters;

    invoke-direct {p2, v2, v3, v8, v9}, Lcom/mapbox/maps/ProjectedMeters;-><init>(DD)V

    iget-object p3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p3, p1}, Lcom/mapbox/maps/MapboxMap;->coordinateForProjectedMeters(Lcom/mapbox/maps/ProjectedMeters;)Lcom/mapbox/geojson/Point;

    move-result-object p1

    iget-object p3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p3, p2}, Lcom/mapbox/maps/MapboxMap;->coordinateForProjectedMeters(Lcom/mapbox/maps/ProjectedMeters;)Lcom/mapbox/geojson/Point;

    move-result-object p2

    new-instance p3, Lcom/mapbox/maps/CoordinateBounds;

    invoke-direct {p3, p2, p1}, Lcom/mapbox/maps/CoordinateBounds;-><init>(Lcom/mapbox/geojson/Point;Lcom/mapbox/geojson/Point;)V

    return-object p3
.end method

.method private final cameraForAnnotationsImpl(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;
    .locals 19
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
            ")",
            "Lcom/mapbox/maps/CameraOptions;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v5, p5

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget-object v4, v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v8}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v6, v7

    :cond_4
    check-cast v6, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    if-eqz v6, :cond_2

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-direct {v0, v6, v5}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->invokeCallbackAndReturn(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    return-object v1

    :cond_6
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    new-instance v1, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v1}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    move-object/from16 v2, p4

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/CameraOptions$Builder;->pitch(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-virtual {v1}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v4

    const-string v1, "Builder().apply(block).build()"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v5, :cond_9

    move-object v9, v4

    iget-object v4, v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    new-instance v10, Lcom/mapbox/maps/EdgeInsets;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/mapbox/maps/EdgeInsets;-><init>(DDDD)V

    move-object v5, v8

    const/4 v8, 0x0

    move-object v6, v9

    const/4 v9, 0x0

    move-object v7, v10

    invoke-virtual/range {v4 .. v9}, Lcom/mapbox/maps/MapboxMap;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    move-object v4, v6

    const/4 v5, 0x0

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->adjustCameraForAnnotations(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object v1

    return-object v1

    :cond_9
    iget-object v7, v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    new-instance v10, Lcom/mapbox/maps/EdgeInsets;

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    move-object v9, v10

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v9 .. v17}, Lcom/mapbox/maps/EdgeInsets;-><init>(DDDD)V

    new-instance v13, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;

    move-object/from16 v2, p2

    move-object v1, v0

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1;-><init>(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v9

    move-object v9, v4

    invoke-virtual/range {v7 .. v13}, Lcom/mapbox/maps/MapboxMap;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V

    return-object v6
.end method

.method private final coordinate(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationOptions$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/maps/ViewAnnotationOptions;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getAnnotatedFeature()Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/mapbox/maps/AnnotatedFeature;->isGeometry()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getAnnotatedFeature()Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/AnnotatedFeature;->getGeometry()Lcom/mapbox/geojson/Geometry;

    move-result-object p1

    instance-of p2, p1, Lcom/mapbox/geojson/Point;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/mapbox/geojson/Point;

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorCoordinate()Lcom/mapbox/geojson/Point;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0

    :cond_4
    new-instance p2, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p2, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final findByAnnotatedLayerFeature(Lcom/mapbox/maps/AnnotatedLayerFeature;)Ll83/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/AnnotatedLayerFeature;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    iget-object v4, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v4, v3}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationOptions$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p1, v0}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll83/k;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lcom/mapbox/maps/ViewAnnotationOptions;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/mapbox/maps/ViewAnnotationOptions;->getAnnotatedFeature()Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/mapbox/maps/AnnotatedFeature;->isAnnotatedLayerFeature()Z

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    invoke-virtual {v3}, Lcom/mapbox/maps/ViewAnnotationOptions;->getAnnotatedFeature()Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/mapbox/maps/AnnotatedFeature;->getAnnotatedLayerFeature()Lcom/mapbox/maps/AnnotatedLayerFeature;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    :goto_1
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_4
    move-object v1, v2

    :goto_2
    check-cast v1, Ll83/k;

    if-nez v1, :cond_5

    new-instance p1, Ll83/k;

    invoke-direct {p1, v2, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_5
    return-object v1
.end method

.method private final synthetic getValue(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "TV;>;)TV;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic getViewAnnotationAvoidLayers$annotations()V
    .locals 0
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    return-void
.end method

.method private final getViewAnnotationOptionsFrame(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Landroid/graphics/Rect;
    .locals 8

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationOptions$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/maps/ViewAnnotationOptions;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getWidth()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getHeight()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getWidth()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getWidth()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    mul-double/2addr v6, v4

    double-to-int v0, v6

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getHeight()Ljava/lang/Double;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpl-double v2, v6, v2

    if-lez v2, :cond_1

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getHeight()Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    mul-double/2addr v2, v4

    double-to-int p1, v2

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    new-instance v2, Landroid/graphics/Rect;

    neg-int v3, v0

    neg-int v4, p1

    invoke-direct {v2, v3, v4, v0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorConfig()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object p2

    if-nez p2, :cond_3

    :cond_2
    new-instance p2, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;

    invoke-direct {p2}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;-><init>()V

    sget-object v5, Lcom/mapbox/maps/ViewAnnotationAnchor;->CENTER:Lcom/mapbox/maps/ViewAnnotationAnchor;

    invoke-virtual {p2, v5}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;->anchor(Lcom/mapbox/maps/ViewAnnotationAnchor;)Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;->build()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object p2

    :cond_3
    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig;->getAnchor()Lcom/mapbox/maps/ViewAnnotationAnchor;

    move-result-object v5

    sget-object v6, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    packed-switch v5, :pswitch_data_0

    invoke-virtual {v2, v1, v1}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_0
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v2, v1, v4}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v2, v3, p1}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {v2, v0, p1}, Landroid/graphics/Rect;->offset(II)V

    goto :goto_2

    :pswitch_7
    invoke-virtual {v2, v1, p1}, Landroid/graphics/Rect;->offset(II)V

    :goto_2
    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig;->getOffsetX()D

    move-result-wide v0

    double-to-int p1, v0

    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig;->getOffsetY()D

    move-result-wide v0

    double-to-int p2, v0

    invoke-virtual {v2, p1, p2}, Landroid/graphics/Rect;->offset(II)V

    return-object v2

    :cond_4
    const/4 p1, 0x0

    return-object p1

    :cond_5
    new-instance p2, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p2, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic getViewUpdatedListenerSet$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method private final invokeCallbackAndReturn(Lcom/mapbox/maps/CameraOptions;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/CameraOptions;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/maps/CameraOptions;"
        }
    .end annotation

    if-eqz p2, :cond_1

    if-nez p1, :cond_0

    new-instance v0, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    const-string v1, "Builder().apply(block).build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method

.method private final measureView(Landroid/view/View;)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    sget v2, Lcom/mapbox/maps/R$id;->composeView:I

    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p1, v1, v1}, Landroid/view/View;->measure(II)V

    if-eqz v2, :cond_2

    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private final notifyAnchorCoordinateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V
    .locals 5

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorCoordinate()Lcom/mapbox/geojson/Point;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorCoordinate()Lcom/mapbox/geojson/Point;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorCoordinate()Lcom/mapbox/geojson/Point;

    move-result-object v3

    const-string v4, "newPositionDescriptor.anchorCoordinate"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2, v3}, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;->onViewAnnotationAnchorCoordinateUpdated(Landroid/view/View;Lcom/mapbox/geojson/Point;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private final notifyAnchorListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V
    .locals 5

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorConfig()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorConfig()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getAnchorConfig()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object v3

    const-string v4, "newPositionDescriptor.anchorConfig"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2, v3}, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;->onViewAnnotationAnchorUpdated(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationAnchorConfig;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private final notifyPositionListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V
    .locals 9

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getLeftTopCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getLeftTopCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getWidth()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getWidth()D

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Double;D)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getPositionDescriptor()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getHeight()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :cond_2
    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getHeight()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Double;D)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getLeftTopCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v4

    const-string v1, "newPositionDescriptor.leftTopCoordinate"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getWidth()D

    move-result-wide v5

    invoke-virtual {p2}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getHeight()D

    move-result-wide v7

    invoke-interface/range {v2 .. v8}, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;->onViewAnnotationPositionUpdated(Landroid/view/View;Lcom/mapbox/maps/ScreenCoordinate;DD)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method private static final onDelegatingViewAnnotationPositionsUpdate$lambda$20(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Ljava/util/List;J)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$immutableUpdatedPositionDescriptorsCopy"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->positionAnnotationViews(Ljava/util/List;)V

    return-void
.end method

.method private final positionAnnotationViews(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->Companion:Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;

    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->currentPositionDescriptors:Ljava/util/List;

    invoke-virtual {v0, v1, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;->needToReorderZ$maps_sdk_release(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    iput-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->currentPositionDescriptors:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    iget-object v2, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getLeftTopCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {v1}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getLeftTopCoordinate()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getViewLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getMeasuredWidth()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    invoke-virtual {v1}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getWidth()D

    move-result-wide v6

    double-to-int v4, v6

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_1
    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getMeasuredHeight()I

    move-result v4

    if-ne v4, v5, :cond_2

    invoke-virtual {v1}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getHeight()D

    move-result-wide v6

    double-to-int v4, v6

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_2
    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->isVisible()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    if-ne v3, v5, :cond_4

    invoke-virtual {v2, v4}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setPositioned(Z)V

    iget-object v3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getViewLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_3

    sget-object v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->VISIBLE_AND_POSITIONED:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    goto :goto_1

    :cond_3
    sget-object v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INVISIBLE:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    :goto_1
    invoke-direct {p0, v2, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updateVisibilityAndNotifyUpdateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V

    :cond_4
    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->isPositioned()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2, v4}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setPositioned(Z)V

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    sget-object v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->VISIBLE_AND_POSITIONED:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    invoke-direct {p0, v2, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updateVisibilityAndNotifyUpdateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V

    :cond_5
    invoke-direct {p0, v2, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->notifyAnchorListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V

    invoke-direct {p0, v2, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->notifyAnchorCoordinateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V

    invoke-direct {p0, v2, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->notifyPositionListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V

    invoke-virtual {v2, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setPositionDescriptor(Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    goto/16 :goto_0

    :cond_6
    iget-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->currentPositionDescriptors:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_9

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;

    invoke-virtual {v3}, Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_b
    :goto_4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_c
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget-object v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INVISIBLE:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    invoke-direct {p0, v0, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updateVisibilityAndNotifyUpdateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V

    goto :goto_5

    :cond_d
    return-void
.end method

.method private final prepareViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V
    .locals 14

    invoke-direct/range {p0 .. p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->measureView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    :cond_0
    iget v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->toBuilder()Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getWidth()Ljava/lang/Double;

    move-result-object v4

    if-nez v4, :cond_2

    int-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    :cond_2
    invoke-virtual {v3, v4}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->width(Ljava/lang/Double;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getHeight()Ljava/lang/Double;

    move-result-object v4

    if-nez v4, :cond_3

    int-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    :cond_3
    invoke-virtual {v3, v4}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->height(Ljava/lang/Double;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->build()Lcom/mapbox/maps/ViewAnnotationOptions;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getVisible()Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_4

    const/4 v3, 0x1

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_0

    :goto_1
    sget-object v5, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INITIAL:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getWidth()Ljava/lang/Double;

    move-result-object v3

    const/4 v6, -0x1

    if-eqz v3, :cond_5

    move v0, v6

    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getHeight()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_6

    move v7, v6

    :goto_2
    move v6, v0

    goto :goto_3

    :cond_6
    move v7, v1

    goto :goto_2

    :goto_3
    new-instance v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    const/16 v11, 0x204

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v12}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;-><init>(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View$OnAttachStateChangeListener;ZLcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;IILcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->buildGlobalLayoutListener(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->buildDrawListener(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnDrawListener;

    move-result-object v3

    invoke-virtual {v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v4

    invoke-direct {p0, v4, v2, v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->buildAttachStateListener(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnDrawListener;)Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setAttachStateListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getAttachStateListener()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "updatedOptions"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v13}, Lcom/mapbox/maps/MapboxMap;->addViewAnnotation$maps_sdk_release(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    return-void

    :cond_7
    new-instance v0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final remove(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INVISIBLE:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    invoke-direct {p0, p1, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updateVisibilityAndNotifyUpdateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getAttachStateListener()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/View$OnAttachStateChangeListener;->onViewDetachedFromWindow(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getAttachStateListener()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setAttachStateListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapboxMap;->removeViewAnnotation$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    return-void

    :cond_1
    new-instance v0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final updateVisibilityAndNotifyUpdateListeners(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V
    .locals 3

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getVisibility()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    move-result-object v0

    if-eq v0, p2, :cond_3

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getVisibility()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    move-result-object v0

    sget-object v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INITIAL:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->INVISIBLE:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    if-ne p2, v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->isVisible()Z

    move-result v0

    sget-object v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->VISIBLE_AND_POSITIONED:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    if-eq p2, v1, :cond_2

    sget-object v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;->VISIBLE_AND_NOT_POSITIONED:Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;

    if-ne p2, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {p1, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setVisibility(Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V

    iget-object p2, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    if-eq v1, v0, :cond_3

    iget-object p2, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;

    invoke-virtual {p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;->onViewAnnotationVisibilityUpdated(Landroid/view/View;Z)V

    goto :goto_2

    :cond_3
    :goto_3
    return-void
.end method

.method private final validateOptions(Lcom/mapbox/maps/ViewAnnotationOptions;)V
    .locals 1

    invoke-virtual {p1}, Lcom/mapbox/maps/ViewAnnotationOptions;->getAnnotatedFeature()Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Annotated feature can not be null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addOnViewAnnotationUpdatedListener(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addViewAnnotation(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;
    .locals 3

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->validateOptions(Lcom/mapbox/maps/ViewAnnotationOptions;)V

    .line 3
    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotationsLayout:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 5
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->prepareViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V

    return-object p1
.end method

.method public addViewAnnotation(ILcom/mapbox/maps/ViewAnnotationOptions;Lw/a;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            "Lw/a;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string p1, "options"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "asyncInflater"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public addViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 8
    :cond_0
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

    .line 9
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    new-instance p2, Lcom/mapbox/maps/MapboxViewAnnotationException;

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to add view annotation that was already added before! Please consider deleting annotation view ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    const-string p1, ") beforehand."

    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {p2, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 15
    :cond_2
    :goto_1
    invoke-direct {p0, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->validateOptions(Lcom/mapbox/maps/ViewAnnotationOptions;)V

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->prepareViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V

    return-void
.end method

.method public cameraForAnnotations(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;
    .locals 7
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

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v1 .. v6}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->cameraForAnnotationsImpl(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    return-object p1
.end method

.method public cameraForAnnotations(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V
    .locals 1
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

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p5}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->cameraForAnnotationsImpl(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/CameraOptions;

    return-void
.end method

.method public final destroy()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxMap;->setViewAnnotationPositionsUpdateListener$maps_sdk_release(Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    invoke-virtual {p0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->removeAllViewAnnotations()V

    return-void
.end method

.method public getAnnotations()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/mapbox/maps/ViewAnnotationOptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    iget-object v3, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationOptions$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/maps/ViewAnnotationOptions;

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getViewAnnotation(Lcom/mapbox/maps/AnnotatedLayerFeature;)Landroid/view/View;
    .locals 1

    const-string v0, "annotatedLayerFeature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->findByAnnotatedLayerFeature(Lcom/mapbox/maps/AnnotatedLayerFeature;)Ll83/k;

    move-result-object p1

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public getViewAnnotationAvoidLayers()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationAvoidLayers$maps_sdk_release()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public getViewAnnotationOptions(Landroid/view/View;)Lcom/mapbox/maps/ViewAnnotationOptions;
    .locals 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v3}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    if-eqz v1, :cond_3

    .line 7
    iget-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/MapboxMap;->getViewAnnotationOptions$maps_sdk_release(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/maps/ViewAnnotationOptions;

    return-object p1

    .line 10
    :cond_2
    new-instance v0, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-object v2
.end method

.method public getViewAnnotationOptions(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/ViewAnnotationOptions;
    .locals 1

    const-string v0, "annotatedLayerFeature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->findByAnnotatedLayerFeature(Lcom/mapbox/maps/AnnotatedLayerFeature;)Ll83/k;

    move-result-object p1

    .line 2
    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    .line 3
    check-cast p1, Lcom/mapbox/maps/ViewAnnotationOptions;

    return-object p1
.end method

.method public getViewAnnotationUpdateMode()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getViewAnnotationMode$maps_sdk_release()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;

    move-result-object v0

    return-object v0
.end method

.method public final getViewUpdatedListenerSet$maps_sdk_release()Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method public onDelegatingViewAnnotationPositionsUpdate(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;",
            ">;)V"
        }
    .end annotation

    const-string v0, "positions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updatedPositionDescriptors:Ljava/util/List;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/viewannotation/a;

    invoke-direct {v1, p0, p1}, Lcom/mapbox/maps/viewannotation/a;-><init>(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setNeedViewAnnotationSync$maps_sdk_release(Z)V

    iput-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->updatedPositionDescriptors:Ljava/util/List;

    return-void
.end method

.method public removeAllViewAnnotations()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-direct {p0, v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->remove(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeOnViewAnnotationUpdatedListener(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewUpdatedListenerSet:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeViewAnnotation(Landroid/view/View;)Z
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    iget-object v1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->remove(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public setViewAnnotationAvoidLayers(Ljava/util/HashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapboxMap;->setViewAnnotationAvoidLayers$maps_sdk_release(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;

    return-void
.end method

.method public setViewAnnotationUpdateMode(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setViewAnnotationMode$maps_sdk_release(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V

    return-void
.end method

.method public updateViewAnnotation(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)Z
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->viewAnnotations:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    invoke-virtual {v2}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getView()Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;

    const/4 p1, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getVisible()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    move p1, v2

    :cond_2
    invoke-virtual {v1, p1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setHandleVisibilityAutomatically(Z)V

    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getWidth()Ljava/lang/Double;

    move-result-object p1

    const/4 v0, -0x1

    if-eqz p1, :cond_3

    invoke-virtual {v1, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setMeasuredWidth(I)V

    :cond_3
    invoke-virtual {p2}, Lcom/mapbox/maps/ViewAnnotationOptions;->getHeight()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v1, v0}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->setMeasuredHeight(I)V

    :cond_4
    iget-object p1, p0, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;->mapboxMap:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v1}, Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/mapbox/maps/MapboxMap;->updateViewAnnotation$maps_sdk_release(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    return v2

    :cond_5
    new-instance p2, Lcom/mapbox/maps/MapboxViewAnnotationException;

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p2, p1}, Lcom/mapbox/maps/MapboxViewAnnotationException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    return p1
.end method
