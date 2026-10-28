.class public final Liv/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lev/s;
.implements Lev/b;


# instance fields
.field public E:Ljv/c;

.field public final w:Lkotlin/jvm/functions/Function1;

.field public x:Liv/h;

.field public y:Lev/f;

.field public z:Liv/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Liv/f;->x:Liv/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Liv/g;->w:Lkotlin/jvm/functions/Function1;

    sget-object v0, Liv/f;->y:Liv/f;

    invoke-static {v0}, Lio/sentry/config/a;->b(Lkotlin/jvm/functions/Function1;)Ljv/c;

    move-result-object v0

    iput-object v0, p0, Liv/g;->E:Ljv/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Liv/h;

    if-eqz v0, :cond_0

    check-cast p1, Liv/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Liv/g;->x:Liv/h;

    check-cast p1, Liv/i;

    invoke-virtual {p1, p0}, Liv/i;->setViewOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The provided view needs to implement AttributionView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lev/i;)V
    .locals 0

    iget-object p1, p1, Lev/i;->h:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lev/f;

    iput-object p1, p0, Liv/g;->y:Lev/f;

    return-void
.end method

.method public final g(Lcom/mapbox/maps/MapView;Landroid/util/AttributeSet;F)Landroid/view/View;
    .locals 4

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "mapView.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Liv/j;->b:[I

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljv/a;

    const/4 v2, 0x0

    invoke-direct {v0, p2, p3, v2}, Ljv/a;-><init>(Landroid/content/res/TypedArray;FI)V

    invoke-static {v0}, Lio/sentry/config/a;->b(Lkotlin/jvm/functions/Function1;)Ljv/c;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iput-object p3, p0, Liv/g;->E:Ljv/c;

    new-instance p2, Liv/e;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3}, Liv/e;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Liv/g;->z:Liv/e;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Liv/g;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final initialize()V
    .locals 8

    iget-object v0, p0, Liv/g;->x:Liv/h;

    const/4 v1, 0x0

    const-string v2, "attributionView"

    if-eqz v0, :cond_4

    iget-object v3, p0, Liv/g;->E:Ljv/c;

    iget v3, v3, Ljv/c;->y:I

    check-cast v0, Liv/i;

    invoke-virtual {v0, v3}, Liv/i;->setGravity(I)V

    iget-object v0, p0, Liv/g;->x:Liv/h;

    if-eqz v0, :cond_3

    iget-object v3, p0, Liv/g;->E:Ljv/c;

    iget-boolean v3, v3, Ljv/c;->w:Z

    check-cast v0, Liv/i;

    invoke-virtual {v0, v3}, Liv/i;->setEnable(Z)V

    iget-object v0, p0, Liv/g;->x:Liv/h;

    if-eqz v0, :cond_2

    iget-object v3, p0, Liv/g;->E:Ljv/c;

    iget v3, v3, Ljv/c;->x:I

    check-cast v0, Liv/i;

    invoke-virtual {v0, v3}, Liv/i;->setIconColor(I)V

    iget-object v0, p0, Liv/g;->x:Liv/h;

    if-eqz v0, :cond_1

    iget-object v3, p0, Liv/g;->E:Ljv/c;

    iget v4, v3, Ljv/c;->z:F

    float-to-int v4, v4

    iget v5, v3, Ljv/c;->E:F

    float-to-int v5, v5

    iget v6, v3, Ljv/c;->F:F

    float-to-int v6, v6

    iget v3, v3, Ljv/c;->G:F

    float-to-int v3, v3

    check-cast v0, Liv/i;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0, v4, v5, v6, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iget-object v0, p0, Liv/g;->x:Liv/h;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Liv/h;->requestLayout()V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    iget-object p1, p0, Liv/g;->E:Ljv/c;

    iget-boolean p1, p1, Ljv/c;->H:Z

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Liv/g;->z:Liv/e;

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    iget-object v1, p0, Liv/g;->y:Lev/f;

    if-eqz v1, :cond_4

    iget-object v2, p1, Liv/e;->w:Landroid/content/Context;

    iput-object v1, p1, Liv/e;->F:Lev/f;

    iget-object v3, v1, Lev/f;->b:Lcom/mapbox/maps/module/MapTelemetry;

    iput-object v3, p1, Liv/e;->G:Lcom/mapbox/maps/module/MapTelemetry;

    iget-object v3, v1, Lev/f;->c:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    iput-object v3, p1, Liv/e;->H:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    invoke-interface {v3}, Lcom/mapbox/maps/geofencing/MapGeofencingConsent;->shouldShowConsent()Z

    move-result v3

    iget-object v1, v1, Lev/f;->a:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v1}, Lcom/mapbox/maps/MapboxMap;->getAttributions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/String;

    invoke-interface {v1, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const-string v5, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/String;

    new-instance v5, Lcom/mapbox/maps/attribution/AttributionParser$Options;

    invoke-direct {v5, v2}, Lcom/mapbox/maps/attribution/AttributionParser$Options;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withCopyrightSign(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withImproveMap(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withTelemetryAttribution(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withMapboxAttribution(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withMapboxPrivacyPolicy(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withMapboxGeofencingConsent(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v3

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v3, v1}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withAttributionData([Ljava/lang/String;)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v1

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-virtual {v1, v3}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->withExtraAttributions(Ljava/util/List;)Lcom/mapbox/maps/attribution/AttributionParser$Options;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/attribution/AttributionParser$Options;->build()Lcom/mapbox/maps/attribution/AttributionParser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/attribution/AttributionParser;->getAttributions()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p1, Liv/e;->x:Ljava/util/List;

    instance-of v1, v2, Landroid/app/Activity;

    if-eqz v1, :cond_1

    move-object v1, v2

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v4

    :cond_1
    if-nez v4, :cond_3

    iget-object v1, p1, Liv/e;->x:Ljava/util/List;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Liv/e;->a()Lm/i;

    move-result-object v0

    const v3, 0x7f140820

    invoke-virtual {v0, v3}, Lm/i;->b(I)V

    new-instance v3, Liv/d;

    invoke-direct {v3, v2, v1}, Liv/d;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iget-object v1, v0, Lm/i;->a:Lm/e;

    iput-object v3, v1, Lm/e;->q:Landroid/widget/ListAdapter;

    iput-object p1, v1, Lm/e;->r:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0}, Lm/i;->c()Lm/j;

    move-result-object v0

    iput-object v0, p1, Liv/e;->y:Lm/j;

    return-void

    :cond_2
    const-string p1, "attributionList"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    return-void

    :cond_4
    const-string p1, "mapAttributionDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_5
    const-string p1, "dialogManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method public final onStart()V
    .locals 0

    return-void
.end method

.method public final onStop()V
    .locals 4

    iget-object v0, p0, Liv/g;->z:Liv/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v2, v0, Liv/e;->y:Lm/j;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lm/c0;->dismiss()V

    :cond_1
    iget-object v2, v0, Liv/e;->z:Lm/j;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lm/c0;->dismiss()V

    :cond_3
    iget-object v0, v0, Liv/e;->E:Lm/j;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v1, v0

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lm/c0;->dismiss()V

    :cond_5
    return-void

    :cond_6
    const-string v0, "dialogManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
