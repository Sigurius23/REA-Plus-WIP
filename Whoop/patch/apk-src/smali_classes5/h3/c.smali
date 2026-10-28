.class public final Lh3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:Li3/p;

.field public final b:Ly3/k;

.field public final c:Lh3/j;

.field public final d:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final e:Lhc3/d;

.field public final f:Lh3/g;


# direct methods
.method public constructor <init>(Li3/p;Ly3/k;Lhc3/d;Lh3/j;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/c;->a:Li3/p;

    iput-object p2, p0, Lh3/c;->b:Ly3/k;

    iput-object p4, p0, Lh3/c;->c:Lh3/j;

    iput-object p5, p0, Lh3/c;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    sget-object p1, Lh3/e;->w:Lh3/e;

    invoke-static {p3, p1}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lh3/c;->e:Lhc3/d;

    new-instance p1, Lh3/g;

    invoke-virtual {p2}, Ly3/k;->a()I

    move-result p2

    new-instance p3, Lg1/l;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lg1/l;-><init>(Lh3/c;Lq83/d;)V

    invoke-direct {p1, p2, p3}, Lh3/g;-><init>(ILg1/l;)V

    iput-object p1, p0, Lh3/c;->f:Lh3/g;

    return-void
.end method

.method public static final a(Lh3/c;Landroid/view/ScrollCaptureSession;Ly3/k;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lh3/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh3/a;

    iget v1, v0, Lh3/a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh3/a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh3/a;

    invoke-direct {v0, p0, p3}, Lh3/a;-><init>(Lh3/c;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lh3/a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh3/a;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lh3/a;->z:I

    iget p2, v0, Lh3/a;->y:I

    iget-object v1, v0, Lh3/a;->x:Ly3/k;

    iget-object v0, v0, Lh3/a;->w:Ljava/lang/Object;

    check-cast v0, Landroid/view/ScrollCaptureSession;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget p1, v0, Lh3/a;->z:I

    iget p2, v0, Lh3/a;->y:I

    iget-object v2, v0, Lh3/a;->x:Ly3/k;

    iget-object v4, v0, Lh3/a;->w:Ljava/lang/Object;

    check-cast v4, Landroid/view/ScrollCaptureSession;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move p3, p2

    move-object p2, v2

    move v2, p1

    move-object p1, v4

    goto :goto_4

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget p3, p2, Ly3/k;->b:I

    iget v2, p2, Ly3/k;->d:I

    iget-object v5, p0, Lh3/c;->f:Lh3/g;

    iput-object p1, v0, Lh3/a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lh3/a;->x:Ly3/k;

    iput p3, v0, Lh3/a;->y:I

    iput v2, v0, Lh3/a;->z:I

    iput v4, v0, Lh3/a;->G:I

    iget v4, v5, Lh3/g;->a:I

    if-gt p3, v2, :cond_c

    sub-int v6, v2, p3

    if-gt v6, v4, :cond_b

    int-to-float v6, p3

    iget v7, v5, Lh3/g;->b:F

    cmpl-float v8, v6, v7

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-ltz v8, :cond_4

    int-to-float v8, v2

    int-to-float v10, v4

    add-float/2addr v10, v7

    cmpg-float v8, v8, v10

    if-gtz v8, :cond_4

    goto :goto_3

    :cond_4
    cmpg-float v6, v6, v7

    if-gez v6, :cond_5

    move v4, p3

    goto :goto_1

    :cond_5
    sub-int v4, v2, v4

    :goto_1
    int-to-float v4, v4

    sub-float/2addr v4, v7

    invoke-virtual {v5, v4, v0}, Lh3/g;->b(FLs83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto :goto_2

    :cond_6
    move-object v4, v9

    :goto_2
    if-ne v4, v1, :cond_7

    move-object v9, v4

    :cond_7
    :goto_3
    if-ne v9, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v4, Lh3/b;->x:Lh3/b;

    iput-object p1, v0, Lh3/a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lh3/a;->x:Ly3/k;

    iput p3, v0, Lh3/a;->y:I

    iput v2, v0, Lh3/a;->z:I

    iput v3, v0, Lh3/a;->G:I

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v3

    invoke-interface {v3, v4, v0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    move-object v0, p1

    move-object v1, p2

    move p2, p3

    move p1, v2

    :goto_6
    iget-object p3, p0, Lh3/c;->f:Lh3/g;

    iget v2, p3, Lh3/g;->b:F

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    sub-int/2addr p2, v2

    iget p3, p3, Lh3/g;->a:I

    const/4 v2, 0x0

    invoke-static {p2, v2, p3}, Le93/b;->n(III)I

    move-result p2

    iget-object p3, p0, Lh3/c;->f:Lh3/g;

    iget v3, p3, Lh3/g;->b:F

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    sub-int/2addr p1, v3

    iget p3, p3, Lh3/g;->a:I

    invoke-static {p1, v2, p3}, Le93/b;->n(III)I

    move-result p1

    iget p3, v1, Ly3/k;->a:I

    iget v1, v1, Ly3/k;->c:I

    if-ne p2, p1, :cond_a

    sget-object p0, Ly3/k;->e:Ly3/k;

    return-object p0

    :cond_a
    invoke-virtual {v0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    int-to-float v3, p3

    neg-float v3, v3

    int-to-float v4, p2

    neg-float v4, v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, p0, Lh3/c;->b:Ly3/k;

    iget v4, v3, Ly3/k;->a:I

    int-to-float v4, v4

    neg-float v4, v4

    iget v3, v3, Ly3/k;->b:I

    int-to-float v3, v3

    neg-float v3, v3

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, p0, Lh3/c;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    iget-object p0, p0, Lh3/c;->f:Lh3/g;

    iget p0, p0, Lh3/g;->b:F

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p0

    new-instance v0, Ly3/k;

    add-int/2addr p2, p0

    add-int/2addr p1, p0

    invoke-direct {v0, p3, p2, v1, p1}, Ly3/k;-><init>(IIII)V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw p0

    :cond_b
    const-string p0, "Expected range ("

    const-string p1, ") to be \u2264 viewportSize="

    invoke-static {v6, v4, p0, p1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    const-string p0, "Expected min="

    const-string p1, " \u2264 max="

    invoke-static {p3, v2, p0, p1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    sget-object v0, Lbc3/y1;->w:Lbc3/y1;

    new-instance v1, Lh20/i0;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    iget-object v2, p0, Lh3/c;->e:Lhc3/d;

    invoke-static {v2, v0, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    new-instance v0, Lb2/y;

    const/4 v5, 0x0

    const/16 v6, 0xd

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x0

    const/4 p3, 0x3

    iget-object p4, v1, Lh3/c;->e:Lhc3/d;

    invoke-static {p4, p1, p1, v0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    new-instance p3, Lh3/d;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4}, Lh3/d;-><init>(Landroid/os/CancellationSignal;I)V

    invoke-virtual {p1, p3}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    new-instance p3, Ld1/g;

    const/4 p4, 0x1

    invoke-direct {p3, p1, p4}, Ld1/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    iget-object p1, p0, Lh3/c;->b:Ly3/k;

    invoke-static {p1}, Li2/w0;->E(Ly3/k;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Lh3/c;->f:Lh3/g;

    const/4 p2, 0x0

    iput p2, p1, Lh3/g;->b:F

    iget-object p1, p0, Lh3/c;->c:Lh3/j;

    iget-object p1, p1, Lh3/j;->a:Lp1/k1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void
.end method
