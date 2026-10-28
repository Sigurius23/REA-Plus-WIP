.class public final Luv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lev/s;


# instance fields
.field public final w:Lkotlin/jvm/functions/Function1;

.field public x:Luv/a;

.field public y:Lvv/b;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Luv/c;->w:Luv/c;

    iput-object v0, p0, Luv/d;->w:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lvv/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lvv/a;->a:Z

    const v1, 0x800053

    iput v1, v0, Lvv/a;->b:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, v0, Lvv/a;->c:F

    iput v1, v0, Lvv/a;->d:F

    iput v1, v0, Lvv/a;->e:F

    iput v1, v0, Lvv/a;->f:F

    new-instance v2, Lvv/b;

    iget-boolean v8, v0, Lvv/a;->a:Z

    iget v7, v0, Lvv/a;->b:I

    iget v3, v0, Lvv/a;->c:F

    iget v4, v0, Lvv/a;->d:F

    iget v5, v0, Lvv/a;->e:F

    iget v6, v0, Lvv/a;->f:F

    invoke-direct/range {v2 .. v8}, Lvv/b;-><init>(FFFFIZ)V

    iput-object v2, p0, Luv/d;->y:Lvv/b;

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

    instance-of v0, p1, Luv/a;

    if-eqz v0, :cond_0

    check-cast p1, Luv/a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Luv/d;->x:Luv/a;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The provided view needs to implement LogoContract.LogoView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lev/i;)V
    .locals 0

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

    sget-object v2, Luv/e;->a:[I

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljv/a;

    const/4 v2, 0x2

    invoke-direct {v0, p2, p3, v2}, Ljv/a;-><init>(Landroid/content/res/TypedArray;FI)V

    invoke-static {v0}, Lrs/b;->c(Lkotlin/jvm/functions/Function1;)Lvv/b;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iput-object p3, p0, Luv/d;->y:Lvv/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Luv/d;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Luv/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Landroid/view/View;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final initialize()V
    .locals 8

    iget-object v0, p0, Luv/d;->x:Luv/a;

    const/4 v1, 0x0

    const-string v2, "logoView"

    if-eqz v0, :cond_3

    iget-object v3, p0, Luv/d;->y:Lvv/b;

    iget v4, v3, Lvv/b;->y:F

    float-to-int v4, v4

    iget v5, v3, Lvv/b;->z:F

    float-to-int v5, v5

    iget v6, v3, Lvv/b;->E:F

    float-to-int v6, v6

    iget v3, v3, Lvv/b;->F:F

    float-to-int v3, v3

    check-cast v0, Luv/b;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0, v4, v5, v6, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    iget-object v0, p0, Luv/d;->x:Luv/a;

    if-eqz v0, :cond_2

    iget-object v3, p0, Luv/d;->y:Lvv/b;

    iget v3, v3, Lvv/b;->x:I

    check-cast v0, Luv/b;

    invoke-virtual {v0, v3}, Luv/b;->setLogoGravity(I)V

    iget-object v0, p0, Luv/d;->x:Luv/a;

    if-eqz v0, :cond_1

    iget-object v3, p0, Luv/d;->y:Lvv/b;

    iget-boolean v3, v3, Lvv/b;->w:Z

    check-cast v0, Luv/b;

    invoke-virtual {v0, v3}, Luv/b;->setLogoEnabled(Z)V

    iget-object v0, p0, Luv/d;->x:Luv/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Luv/a;->requestLayout()V

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
.end method
