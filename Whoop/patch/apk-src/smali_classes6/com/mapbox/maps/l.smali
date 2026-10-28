.class public final synthetic Lcom/mapbox/maps/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/SourceRemovedCallback;
.implements Lcom/mapbox/maps/StyleDataLoadedCallback;
.implements Lcom/mapbox/maps/CameraChangedCallback;
.implements Lcom/mapbox/maps/RenderFrameStartedCallback;
.implements Lcom/mapbox/maps/StyleLoadedCallback;
.implements Lcom/mapbox/maps/SourceAddedCallback;
.implements Lcom/mapbox/maps/SourceDataLoadedCallback;
.implements Lcom/mapbox/maps/MapLoadingErrorDelegate;
.implements Lcom/mapbox/bindgen/Expected$Transformer;
.implements Lcom/mapbox/common/EventsServiceResponseCallback;
.implements Lcom/mapbox/common/TelemetryUtilsResponseCallback;
.implements Lbh3/h;
.implements Lbh3/g;
.implements Ld0/z;
.implements Lh5/u;
.implements Lyr/e;
.implements Lha/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/mapbox/maps/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Ljava/lang/Object;)Landroid/util/CloseGuard;
    .locals 0

    check-cast p0, Landroid/util/CloseGuard;

    return-object p0
.end method

.method public static bridge synthetic e(Ljava/lang/Object;)Landroid/view/WindowInsetsAnimation;
    .locals 0

    check-cast p0, Landroid/view/WindowInsetsAnimation;

    return-object p0
.end method

.method public static bridge synthetic f(Ljava/lang/Object;)Landroid/window/SplashScreenView;
    .locals 0

    check-cast p0, Landroid/window/SplashScreenView;

    return-object p0
.end method

.method public static bridge synthetic g(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Landroid/window/SplashScreenView;

    return p0
.end method


# virtual methods
.method public a(IIIII)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm9/g;

    iget p1, p1, Lm9/g;->w:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ldn/q;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/whoop/ui/h;->E(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lcom/whoop/ui/h;->F(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(F)F
    .locals 2

    const v0, 0x3eba2e8c

    cmpg-float v0, p1, v0

    const/high16 v1, 0x40f20000    # 7.5625f

    if-gez v0, :cond_0

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    return v1

    :cond_0
    const v0, 0x3f3a2e8c

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    const v0, 0x3f0ba2e9

    sub-float/2addr p1, v0

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    const/high16 p1, 0x3f400000    # 0.75f

    add-float/2addr v1, p1

    return v1

    :cond_1
    const v0, 0x3f68ba2f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    const v0, 0x3f51745d

    sub-float/2addr p1, v0

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    const/high16 p1, 0x3f700000    # 0.9375f

    add-float/2addr v1, p1

    return v1

    :cond_2
    const v0, 0x3f745d17

    sub-float/2addr p1, v0

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    const/high16 p1, 0x3f7c0000    # 0.984375f

    add-float/2addr v1, p1

    return v1
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/mapbox/maps/Snapshotter;->c(Ljava/lang/String;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p1

    return-object p1
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 3

    sget v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    iget-object p2, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p2, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p2

    const-string v0, "getInsets(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p2, Lv4/b;->d:I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    sget-object p1, Lh5/q1;->b:Lh5/q1;

    return-object p1
.end method

.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/mapbox/maps/l;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->c(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->a(Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_1
    invoke-static {p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->b(Lcom/mapbox/bindgen/Expected;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public run(Lcom/mapbox/maps/CameraChanged;)V
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->e(Lcom/mapbox/maps/CameraChanged;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/RenderFrameStarted;)V
    .locals 0

    .line 3
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->h(Lcom/mapbox/maps/RenderFrameStarted;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/SourceAdded;)V
    .locals 0

    .line 4
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->d(Lcom/mapbox/maps/SourceAdded;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/SourceDataLoaded;)V
    .locals 0

    .line 5
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->f(Lcom/mapbox/maps/SourceDataLoaded;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/SourceRemoved;)V
    .locals 0

    .line 6
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->m(Lcom/mapbox/maps/SourceRemoved;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 0

    .line 7
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->i(Lcom/mapbox/maps/StyleDataLoaded;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleLoaded;)V
    .locals 0

    .line 8
    invoke-static {p1}, Lcom/mapbox/maps/NativeObserver;->b(Lcom/mapbox/maps/StyleLoaded;)V

    return-void
.end method

.method public sendMapLoadingError(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/l;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/mapbox/maps/Snapshotter;->e(Lcom/mapbox/maps/MapLoadingError;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lcom/mapbox/maps/Snapshotter;->g(Lcom/mapbox/maps/MapLoadingError;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method
