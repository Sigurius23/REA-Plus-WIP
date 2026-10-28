.class public abstract Lb4/l;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lh5/s;
.implements Lp1/i;
.implements La3/b2;
.implements Lh5/u;


# instance fields
.field public E:Z

.field public F:Lc93/a;

.field public G:Lc93/a;

.field public H:Landroidx/compose/ui/Modifier;

.field public I:Lkotlin/jvm/functions/Function1;

.field public J:Ly3/c;

.field public K:Lkotlin/jvm/functions/Function1;

.field public L:Landroidx/lifecycle/g0;

.field public M:Lpb/f;

.field public final N:[I

.field public O:J

.field public P:Lh5/q1;

.field public final Q:Lb4/k;

.field public final R:Lb4/k;

.field public S:Lkotlin/jvm/functions/Function1;

.field public final T:[I

.field public U:I

.field public V:I

.field public final W:Lh5/t;

.field public a0:Z

.field public final b0:La3/n0;

.field public final w:Lt2/d;

.field public final x:Landroid/view/View;

.field public final y:Landroidx/compose/ui/node/Owner;

.field public z:Lc93/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lp1/o;ILt2/d;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    iput-object p4, p0, Lb4/l;->w:Lt2/d;

    iput-object p5, p0, Lb4/l;->x:Landroid/view/View;

    iput-object p6, p0, Lb4/l;->y:Landroidx/compose/ui/node/Owner;

    sget-object p1, Lb3/t3;->a:Ljava/util/LinkedHashMap;

    const p1, 0x7f0a015f

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p2, Lb4/b;

    invoke-direct {p2, p0, p1}, Lb4/b;-><init>(Landroid/view/ViewGroup;I)V

    invoke-static {p0, p2}, Lh5/p0;->q(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V

    invoke-static {p0, p0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    sget-object p2, Lb4/j;->z:Lb4/j;

    iput-object p2, p0, Lb4/l;->z:Lc93/a;

    sget-object p2, Lb4/j;->y:Lb4/j;

    iput-object p2, p0, Lb4/l;->F:Lc93/a;

    sget-object p2, Lb4/j;->x:Lb4/j;

    iput-object p2, p0, Lb4/l;->G:Lc93/a;

    sget-object p2, Lb2/t;->w:Lb2/t;

    iput-object p2, p0, Lb4/l;->H:Landroidx/compose/ui/Modifier;

    invoke-static {}, Lvb/g;->a()Ly3/d;

    move-result-object p3

    iput-object p3, p0, Lb4/l;->J:Ly3/c;

    const/4 p3, 0x2

    new-array p5, p3, [I

    iput-object p5, p0, Lb4/l;->N:[I

    const-wide/16 p5, 0x0

    iput-wide p5, p0, Lb4/l;->O:J

    new-instance p5, Lb4/k;

    const/4 p6, 0x1

    invoke-direct {p5, p0, p6}, Lb4/k;-><init>(Lb4/l;I)V

    iput-object p5, p0, Lb4/l;->Q:Lb4/k;

    new-instance p5, Lb4/k;

    invoke-direct {p5, p0, p1}, Lb4/k;-><init>(Lb4/l;I)V

    iput-object p5, p0, Lb4/l;->R:Lb4/k;

    new-array p5, p3, [I

    iput-object p5, p0, Lb4/l;->T:[I

    const/high16 p5, -0x80000000

    iput p5, p0, Lb4/l;->U:I

    iput p5, p0, Lb4/l;->V:I

    new-instance p5, Lh5/t;

    invoke-direct {p5}, Lh5/t;-><init>()V

    iput-object p5, p0, Lb4/l;->W:Lh5/t;

    new-instance p5, La3/n0;

    const/4 v0, 0x3

    invoke-direct {p5, v0}, La3/n0;-><init>(I)V

    iput-object p0, p5, La3/n0;->N:Lb4/l;

    sget-object v0, Lb4/n;->a:Lb4/m;

    invoke-static {p2, v0, p4}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p4, Lb4/c;->z:Lb4/c;

    invoke-static {p2, p6, p4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p2, p0}, Lu2/d0;->j(Landroidx/compose/ui/Modifier;Lb4/l;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    new-instance p4, Lb4/g;

    invoke-direct {p4, p0, p5, p0}, Lb4/g;-><init>(Lb4/l;La3/n0;Lb4/l;)V

    invoke-static {p2, p4}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    new-instance p4, Lb4/d;

    invoke-direct {p4, p0, p5, p3}, Lb4/d;-><init>(Lb4/l;La3/n0;I)V

    invoke-static {p2, p4}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    iget-object p3, p0, Lb4/l;->H:Landroidx/compose/ui/Modifier;

    invoke-interface {p3, p2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-virtual {p5, p3}, La3/n0;->E0(Landroidx/compose/ui/Modifier;)V

    new-instance p3, Lb2/z;

    const/4 p4, 0x5

    invoke-direct {p3, p4, p5, p2}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lb4/l;->I:Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, Lb4/l;->J:Ly3/c;

    invoke-virtual {p5, p2}, La3/n0;->A0(Ly3/c;)V

    new-instance p2, La0/a1;

    const/16 p3, 0xb

    invoke-direct {p2, p5, p3}, La0/a1;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lb4/l;->K:Lkotlin/jvm/functions/Function1;

    new-instance p2, Lb4/d;

    invoke-direct {p2, p0, p5, p1}, Lb4/d;-><init>(Lb4/l;La3/n0;I)V

    iput-object p2, p5, La3/n0;->k0:Lb4/d;

    new-instance p2, Lb4/e;

    invoke-direct {p2, p0, p1}, Lb4/e;-><init>(Lb4/l;I)V

    iput-object p2, p5, La3/n0;->l0:Lb4/e;

    new-instance p1, Lb4/f;

    invoke-direct {p1, p0, p5}, Lb4/f;-><init>(Lb4/l;La3/n0;)V

    invoke-virtual {p5, p1}, La3/n0;->D0(Ly2/r0;)V

    iput-object p5, p0, Lb4/l;->b0:La3/n0;

    return-void
.end method

.method private final getSnapshotObserver()La3/c2;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lb4/l;->y:Landroidx/compose/ui/node/Owner;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic j(Lb4/l;)La3/c2;
    .locals 0

    invoke-direct {p0}, Lb4/l;->getSnapshotObserver()La3/c2;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lb4/l;III)I
    .locals 1

    const/high16 p0, 0x40000000    # 2.0f

    if-gez p3, :cond_3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x2

    const v0, 0x7fffffff

    if-ne p3, p1, :cond_1

    if-eq p2, v0, :cond_1

    const/high16 p0, -0x80000000

    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0

    :cond_1
    const/4 p1, -0x1

    if-ne p3, p1, :cond_2

    if-eq p2, v0, :cond_2

    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0

    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Le93/b;->n(III)I

    move-result p1

    invoke-static {p1, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static l(Lv4/b;IIII)Lv4/b;
    .locals 2

    iget v0, p0, Lv4/b;->a:I

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    if-gez v0, :cond_0

    move v0, p1

    :cond_0
    iget v1, p0, Lv4/b;->b:I

    sub-int/2addr v1, p2

    if-gez v1, :cond_1

    move v1, p1

    :cond_1
    iget p2, p0, Lv4/b;->c:I

    sub-int/2addr p2, p3

    if-gez p2, :cond_2

    move p2, p1

    :cond_2
    iget p0, p0, Lv4/b;->d:I

    sub-int/2addr p0, p4

    if-gez p0, :cond_3

    goto :goto_0

    :cond_3
    move p1, p0

    :goto_0
    invoke-static {v0, v1, p2, p1}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final U()Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    return v0
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lb4/l;->F:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method public final b(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    iget-object p1, p0, Lb4/l;->W:Lh5/t;

    invoke-virtual {p1, p3, p4}, Lh5/t;->b(II)V

    return-void
.end method

.method public final c(Landroid/view/View;I)V
    .locals 0

    iget-object p1, p0, Lb4/l;->W:Lh5/t;

    invoke-virtual {p1, p2}, Lh5/t;->c(I)V

    return-void
.end method

.method public final d(Landroid/view/View;II[II)V
    .locals 5

    iget-object p1, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Lb4/n;->g(I)F

    move-result p1

    invoke-static {p3}, Lb4/n;->g(I)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 p3, 0x20

    shl-long/2addr v0, p3

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    invoke-static {p5}, Lb4/n;->i(I)I

    move-result p5

    iget-object v0, p0, Lb4/l;->w:Lt2/d;

    iget-object v0, v0, Lt2/d;->a:Lt2/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v4, v0, Lb2/v;->N:Z

    if-eqz v4, :cond_1

    invoke-static {v0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lt2/g;

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1, p1, p2, p5}, Lt2/g;->l0(JI)J

    move-result-wide p1

    goto :goto_0

    :cond_2
    const-wide/16 p1, 0x0

    :goto_0
    shr-long v0, p1, p3

    long-to-int p3, v0

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-static {p3}, Lds/q;->r(F)I

    move-result p3

    const/4 p5, 0x0

    aput p3, p4, p5

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Lds/q;->r(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p4, p2

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eq v1, p0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_0
    iget-object v0, p0, Lb4/l;->F:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lb4/l;->G:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final g(Landroid/view/View;IIIII[I)V
    .locals 10

    iget-object p1, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Lb4/n;->g(I)F

    move-result p1

    invoke-static {p3}, Lb4/n;->g(I)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 p3, 0x20

    shl-long/2addr v0, p3

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long v5, v0, p1

    invoke-static {p4}, Lb4/n;->g(I)F

    move-result p1

    invoke-static {p5}, Lb4/n;->g(I)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long/2addr v0, p3

    and-long/2addr p1, v2

    or-long v7, v0, p1

    invoke-static/range {p6 .. p6}, Lb4/n;->i(I)I

    move-result v9

    iget-object p1, p0, Lb4/l;->w:Lt2/d;

    iget-object p1, p1, Lt2/d;->a:Lt2/g;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-boolean p4, p1, Lb2/v;->N:Z

    if-eqz p4, :cond_1

    invoke-static {p1}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lt2/g;

    :cond_1
    move-object v4, p2

    if-eqz v4, :cond_2

    invoke-virtual/range {v4 .. v9}, Lt2/g;->J(JJI)J

    move-result-wide p1

    goto :goto_0

    :cond_2
    const-wide/16 p1, 0x0

    :goto_0
    shr-long p3, p1, p3

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-static {p3}, Lds/q;->r(F)I

    move-result p3

    const/4 p4, 0x0

    aput p3, p7, p4

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Lds/q;->r(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p7, p2

    return-void
.end method

.method public final gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lb4/l;->T:[I

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v2, 0x0

    aget v4, v1, v2

    aget v5, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int v6, v2, v4

    aget v1, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int v7, v2, v1

    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDensity()Ly3/c;
    .locals 1

    iget-object v0, p0, Lb4/l;->J:Ly3/c;

    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    return-object v0
.end method

.method public final getLayoutNode()La3/n0;
    .locals 1

    iget-object v0, p0, Lb4/l;->b0:La3/n0;

    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/g0;
    .locals 1

    iget-object v0, p0, Lb4/l;->L:Landroidx/lifecycle/g0;

    return-object v0
.end method

.method public final getModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lb4/l;->H:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Lb4/l;->W:Lh5/t;

    invoke-virtual {v0}, Lh5/t;->a()I

    move-result v0

    return v0
.end method

.method public final getOnDensityChanged$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lb4/l;->K:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lb4/l;->I:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lb4/l;->S:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getRelease()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lb4/l;->G:Lc93/a;

    return-object v0
.end method

.method public final getReset()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lb4/l;->F:Lc93/a;

    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Lpb/f;
    .locals 1

    iget-object v0, p0, Lb4/l;->M:Lpb/f;

    return-object v0
.end method

.method public final getUpdate()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lb4/l;->z:Lc93/a;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    return-object v0
.end method

.method public final h(Landroid/view/View;IIIII)V
    .locals 9

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Lb4/n;->g(I)F

    move-result v0

    invoke-static {p3}, Lb4/n;->g(I)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const-wide v5, 0xffffffffL

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    invoke-static {p4}, Lb4/n;->g(I)F

    move-result v2

    invoke-static {p5}, Lb4/n;->g(I)F

    move-result v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v7, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v7, v4

    and-long/2addr v2, v5

    or-long/2addr v2, v7

    invoke-static {p6}, Lb4/n;->i(I)I

    move-result v4

    iget-object v5, p0, Lb4/l;->w:Lt2/d;

    iget-object v5, v5, Lt2/d;->a:Lt2/g;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    iget-boolean v7, v5, Lb2/v;->N:Z

    if-eqz v7, :cond_1

    invoke-static {v5}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lt2/g;

    :cond_1
    if-eqz v6, :cond_2

    move-wide p2, v0

    move-wide p4, v2

    move p6, v4

    move-object p1, v6

    invoke-virtual/range {p1 .. p6}, Lt2/g;->J(JJI)J

    :cond_2
    return-void
.end method

.method public final i(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    const/4 p2, 0x1

    if-nez p1, :cond_1

    and-int/lit8 p1, p3, 0x1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method public final invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    iget-boolean p1, p0, Lb4/l;->a0:Z

    if-eqz p1, :cond_0

    new-instance p1, Lb4/a;

    const/4 p2, 0x0

    iget-object v0, p0, Lb4/l;->R:Lb4/k;

    invoke-direct {p1, v0, p2}, Lb4/a;-><init>(Lc93/a;I)V

    iget-object p2, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb4/l;->b0:La3/n0;

    invoke-virtual {p1}, La3/n0;->P()V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public final m(Lh5/q1;)Lh5/q1;
    .locals 14

    iget-object v0, p1, Lh5/q1;->a:Lh5/o1;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v1

    sget-object v2, Lv4/b;->e:Lv4/b;

    invoke-virtual {v1, v2}, Lv4/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, -0x9

    invoke-virtual {v0, v1}, Lh5/o1;->h(I)Lv4/b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lv4/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lh5/o1;->f()Lh5/h;

    move-result-object v0

    if-eqz v0, :cond_6

    :cond_0
    iget-object v0, p0, Lb4/l;->b0:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    iget-object v1, v0, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Lvo/b;->C(J)J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v4, v1, v3

    long-to-int v4, v4

    const/4 v5, 0x0

    if-gez v4, :cond_2

    move v4, v5

    :cond_2
    const-wide v6, 0xffffffffL

    and-long/2addr v1, v6

    long-to-int v1, v1

    if-gez v1, :cond_3

    move v1, v5

    :cond_3
    invoke-static {v0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v2

    invoke-interface {v2}, Ly2/y;->n()J

    move-result-wide v8

    shr-long v10, v8, v3

    long-to-int v2, v10

    and-long/2addr v8, v6

    long-to-int v8, v8

    iget-wide v9, v0, Ly2/j1;->y:J

    shr-long v11, v9, v3

    long-to-int v11, v11

    and-long/2addr v9, v6

    long-to-int v9, v9

    int-to-float v10, v11

    int-to-float v9, v9

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v12, v9

    shl-long v9, v10, v3

    and-long v11, v12, v6

    or-long/2addr v9, v11

    invoke-virtual {v0, v9, v10}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v9

    invoke-static {v9, v10}, Lvo/b;->C(J)J

    move-result-wide v9

    shr-long v11, v9, v3

    long-to-int v0, v11

    sub-int/2addr v2, v0

    if-gez v2, :cond_4

    move v2, v5

    :cond_4
    and-long/2addr v6, v9

    long-to-int v0, v6

    sub-int/2addr v8, v0

    if-gez v8, :cond_5

    goto :goto_0

    :cond_5
    move v5, v8

    :goto_0
    if-nez v4, :cond_7

    if-nez v1, :cond_7

    if-nez v2, :cond_7

    if-nez v5, :cond_7

    :cond_6
    :goto_1
    return-object p1

    :cond_7
    iget-object p1, p1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p1, v4, v1, v2, v5}, Lh5/o1;->n(IIII)Lh5/q1;

    move-result-object p1

    return-object p1
.end method

.method public final o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    new-instance p1, Lh5/q1;

    invoke-direct {p1, p2}, Lh5/q1;-><init>(Lh5/q1;)V

    iput-object p1, p0, Lb4/l;->P:Lh5/q1;

    invoke-virtual {p0, p2}, Lb4/l;->m(Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Lb4/l;->Q:Lb4/k;

    invoke-virtual {v0}, Lb4/k;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    iget-boolean p1, p0, Lb4/l;->a0:Z

    if-eqz p1, :cond_0

    new-instance p1, Lb4/a;

    const/4 p2, 0x0

    iget-object v0, p0, Lb4/l;->R:Lb4/k;

    invoke-direct {p1, v0, p2}, Lb4/a;-><init>(Lc93/a;I)V

    iget-object p2, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object p1, p0, Lb4/l;->b0:La3/n0;

    invoke-virtual {p1}, La3/n0;->P()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-direct {p0}, Lb4/l;->getSnapshotObserver()La3/c2;

    move-result-object v0

    iget-object v0, v0, La3/c2;->a:Lz1/v;

    invoke-virtual {v0, p0}, Lz1/v;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    iget-object p1, p0, Lb4/l;->x:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    iget-object v0, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eq v1, p0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    iput p1, p0, Lb4/l;->U:I

    iput p2, p0, Lb4/l;->V:I

    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 7

    iget-object p1, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Lb4/n;->h(F)F

    move-result p1

    invoke-static {p3}, Lb4/n;->h(F)F

    move-result p2

    invoke-static {p1, p2}, Ls4/i;->a(FF)J

    move-result-wide v4

    iget-object p1, p0, Lb4/l;->w:Lt2/d;

    invoke-virtual {p1}, Lt2/d;->c()Lbc3/c0;

    move-result-object p1

    new-instance v1, Lb4/h;

    const/4 v6, 0x0

    move-object v3, p0

    move v2, p4

    invoke-direct/range {v1 .. v6}, Lb4/h;-><init>(ZLb4/l;JLq83/d;)V

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, v1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return v0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    iget-object p1, p0, Lb4/l;->x:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Lb4/n;->h(F)F

    move-result p1

    invoke-static {p3}, Lb4/n;->h(F)F

    move-result p2

    invoke-static {p1, p2}, Ls4/i;->a(FF)J

    move-result-wide v3

    iget-object p1, p0, Lb4/l;->w:Lt2/d;

    invoke-virtual {p1}, Lt2/d;->c()Lbc3/c0;

    move-result-object p1

    new-instance v1, Lb4/i;

    const/4 v6, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v5, v5, v1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return v0
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    iget-object v0, p0, Lb4/l;->S:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final setDensity(Ly3/c;)V
    .locals 1

    iget-object v0, p0, Lb4/l;->J:Ly3/c;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lb4/l;->J:Ly3/c;

    iget-object v0, p0, Lb4/l;->K:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object v0, p0, Lb4/l;->L:Landroidx/lifecycle/g0;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lb4/l;->L:Landroidx/lifecycle/g0;

    invoke-static {p0, p1}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    :cond_0
    return-void
.end method

.method public final setModifier(Landroidx/compose/ui/Modifier;)V
    .locals 1

    iget-object v0, p0, Lb4/l;->H:Landroidx/compose/ui/Modifier;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lb4/l;->H:Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lb4/l;->I:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/l;->K:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnModifierChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/l;->I:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/l;->S:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setRelease(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/l;->G:Lc93/a;

    return-void
.end method

.method public final setReset(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/l;->F:Lc93/a;

    return-void
.end method

.method public final setSavedStateRegistryOwner(Lpb/f;)V
    .locals 1

    iget-object v0, p0, Lb4/l;->M:Lpb/f;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lb4/l;->M:Lpb/f;

    invoke-static {p0, p1}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    :cond_0
    return-void
.end method

.method public final setUpdate(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb4/l;->z:Lc93/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb4/l;->E:Z

    iget-object p1, p0, Lb4/l;->Q:Lb4/k;

    invoke-virtual {p1}, Lb4/k;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
