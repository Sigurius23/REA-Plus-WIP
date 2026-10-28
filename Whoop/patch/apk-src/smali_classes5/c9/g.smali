.class public final synthetic Lc9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Lnn/g;
.implements Lcom/amplitude/quickjs/wrapper/MapCreator;
.implements Lcom/google/android/material/textfield/f0;
.implements Lh5/u;
.implements Lcq/e;
.implements Lcom/mapbox/bindgen/Expected$Transformer;
.implements Lud3/z;
.implements Lcom/mapbox/common/FlushOperationResultCallback;
.implements Lcom/mapbox/maps/FeatureStateOperationCallback;
.implements Lcom/mapbox/maps/MapLoadingErrorDelegate;
.implements Lcom/mapbox/maps/MapIdleCallback;
.implements Lcom/mapbox/maps/StyleImageMissingCallback;
.implements Lcom/mapbox/maps/MapLoadedCallback;
.implements Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;
.implements Lcom/mapbox/maps/RenderFrameFinishedCallback;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc9/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic c(Landroid/app/ActivityManager$RunningTaskInfo;)Landroid/content/ComponentName;
    .locals 0

    iget-object p0, p0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    return-object p0
.end method

.method public static bridge synthetic d()Landroid/media/metrics/LogSessionId;
    .locals 1

    sget-object v0, Landroid/media/metrics/LogSessionId;->LOG_SESSION_ID_NONE:Landroid/media/metrics/LogSessionId;

    return-object v0
.end method


# virtual methods
.method public a(IIIII)Z
    .locals 3

    const/16 v0, 0x43

    const/4 v1, 0x2

    const/16 v2, 0x4d

    if-ne p2, v0, :cond_0

    const/16 v0, 0x4f

    if-ne p3, v0, :cond_0

    if-ne p4, v2, :cond_0

    if-eq p5, v2, :cond_1

    if-eq p1, v1, :cond_1

    :cond_0
    if-ne p2, v2, :cond_2

    const/16 p2, 0x4c

    if-ne p3, p2, :cond_2

    if-ne p4, p2, :cond_2

    const/16 p2, 0x54

    if-eq p5, p2, :cond_1

    if-ne p1, v1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lzd3/o;)Lud3/a0;
    .locals 0

    invoke-static {p1}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->a(Lzd3/o;)Lud3/a0;

    move-result-object p1

    return-object p1
.end method

.method public get()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lc9/g;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/mapbox/common/module/MapboxHttpClient;->f(Ljava/lang/String;)Lcom/mapbox/common/LifecycleState;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lc9/g;->w:I

    check-cast p1, Lc9/b;

    packed-switch v0, :pswitch_data_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 4
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 5
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 1

    iget v0, p0, Lc9/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/mapbox/common/module/cronet/LazyEngine;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->f(Ljava/lang/Exception;)V

    return-void

    :pswitch_1
    invoke-static {p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->d(Ljava/lang/Exception;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 3

    const/4 v0, 0x7

    iget-object v1, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v1, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    iget v1, v0, Lv4/b;->b:I

    iget v0, v0, Lv4/b;->d:I

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    .line 1
    iget v0, p0, Lc9/g;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {p1}, Lcom/mapbox/maps/MapboxMap;->p(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_1
    invoke-static {p1}, Lcom/mapbox/maps/MapboxMap;->n(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_2
    invoke-static {p1}, Lcom/mapbox/maps/MapboxMap;->f(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_3
    invoke-static {p1}, Lcom/mapbox/maps/MapboxMap;->m(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_4
    invoke-static {p1}, Lcom/mapbox/maps/MapboxMap;->o(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_5
    invoke-static {p1}, Lcom/mapbox/maps/MapProvider;->b(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_6
    invoke-static {p1}, Lcom/mapbox/maps/MapProvider;->a(Lcom/mapbox/bindgen/Expected;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public run(Lcom/mapbox/maps/MapIdle;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->l(Lcom/mapbox/maps/MapIdle;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/MapLoaded;)V
    .locals 0

    .line 3
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->k(Lcom/mapbox/maps/MapLoaded;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/RenderFrameFinished;)V
    .locals 0

    .line 4
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->j(Lcom/mapbox/maps/RenderFrameFinished;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleImageMissing;)V
    .locals 0

    .line 5
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->a(Lcom/mapbox/maps/StyleImageMissing;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleImageRemoveUnused;)V
    .locals 0

    .line 6
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->c(Lcom/mapbox/maps/StyleImageRemoveUnused;)V

    return-void
.end method

.method public sendMapLoadingError(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 0

    invoke-static {p1}, Lcom/mapbox/maps/MapboxMap;->u(Lcom/mapbox/maps/MapLoadingError;)V

    return-void
.end method
