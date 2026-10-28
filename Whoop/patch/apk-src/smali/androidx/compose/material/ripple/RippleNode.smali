.class public abstract Landroidx/compose/material/ripple/RippleNode;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/r;
.implements La3/a0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/material/ripple/RippleNode;",
        "Lb2/v;",
        "La3/m;",
        "La3/r;",
        "La3/a0;",
        "Li2/a0;",
        "color",
        "Li2/a0;",
        "material-ripple"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final O:Lj0/i;

.field public final P:Z

.field public final Q:F

.field public final R:Lc93/a;

.field public S:Lc33/c;

.field public T:F

.field public U:J

.field public V:Z

.field public final W:La0/q0;

.field private final color:Li2/a0;


# direct methods
.method public constructor <init>(Lj0/i;ZFLi2/a0;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->O:Lj0/i;

    iput-boolean p2, p0, Landroidx/compose/material/ripple/RippleNode;->P:Z

    iput p3, p0, Landroidx/compose/material/ripple/RippleNode;->Q:F

    iput-object p4, p0, Landroidx/compose/material/ripple/RippleNode;->color:Li2/a0;

    iput-object p5, p0, Landroidx/compose/material/ripple/RippleNode;->R:Lc93/a;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Landroidx/compose/material/ripple/RippleNode;->U:J

    new-instance p1, La0/q0;

    invoke-direct {p1}, La0/q0;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->W:La0/q0;

    return-void
.end method


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final O(La3/p0;)V
    .locals 8

    invoke-virtual {p1}, La3/p0;->a()V

    iget-object v0, p0, Landroidx/compose/material/ripple/RippleNode;->S:Lc33/c;

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/compose/material/ripple/RippleNode;->T:F

    iget-object v2, p0, Landroidx/compose/material/ripple/RippleNode;->color:Li2/a0;

    invoke-interface {v2}, Li2/a0;->a()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, Lc33/c;->d(La3/p0;FJ)V

    :cond_0
    move-object v0, p0

    check-cast v0, Lk1/a;

    iget-object p1, p1, La3/p0;->w:Lk2/b;

    iget-object p1, p1, Lk2/b;->x:La3/p;

    invoke-virtual {p1}, La3/p;->w()Li2/v;

    move-result-object p1

    iget-object v1, v0, Lk1/a;->Y:Lk1/e;

    if-eqz v1, :cond_1

    iget-wide v2, v0, Landroidx/compose/material/ripple/RippleNode;->U:J

    iget v4, v0, Landroidx/compose/material/ripple/RippleNode;->T:F

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    iget-object v5, v0, Landroidx/compose/material/ripple/RippleNode;->color:Li2/a0;

    invoke-interface {v5}, Li2/a0;->a()J

    move-result-wide v5

    iget-object v0, v0, Landroidx/compose/material/ripple/RippleNode;->R:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/b;

    iget v7, v0, Lk1/b;->d:F

    invoke-virtual/range {v1 .. v7}, Lk1/e;->e(JIJF)V

    invoke-static {p1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v1, p1}, Lk1/e;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public final P0()V
    .locals 4

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, La6/c;

    const/16 v2, 0x16

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final X0(Lj0/n;)V
    .locals 11

    instance-of v0, p1, Lj0/l;

    if-eqz v0, :cond_5

    move-object v2, p1

    check-cast v2, Lj0/l;

    iget-wide v4, p0, Landroidx/compose/material/ripple/RippleNode;->U:J

    iget p1, p0, Landroidx/compose/material/ripple/RippleNode;->T:F

    move-object v0, p0

    check-cast v0, Lk1/a;

    iget-object v1, v0, Lk1/a;->X:Lk1/d;

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    :goto_0
    instance-of v3, v1, Landroid/view/ViewGroup;

    if-nez v3, :cond_2

    move-object v3, v1

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v6, v3, Landroid/view/View;

    if-eqz v6, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_1
    const-string p1, "Couldn\'t find a valid parent for "

    const-string v0, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    invoke-static {v1, p1, v0}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v3, :cond_4

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    instance-of v8, v7, Lk1/d;

    if-eqz v8, :cond_3

    check-cast v7, Lk1/d;

    move-object v1, v7

    goto :goto_2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    new-instance v3, Lk1/d;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v3, v6}, Lk1/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object v1, v3

    :goto_2
    iput-object v1, v0, Lk1/a;->X:Lk1/d;

    :goto_3
    invoke-virtual {v1, v0}, Lk1/d;->b(Lk1/a;)Lk1/e;

    move-result-object v1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result v6

    iget-object p1, v0, Landroidx/compose/material/ripple/RippleNode;->color:Li2/a0;

    invoke-interface {p1}, Li2/a0;->a()J

    move-result-wide v7

    iget-object p1, v0, Landroidx/compose/material/ripple/RippleNode;->R:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk1/b;

    iget v9, p1, Lk1/b;->d:F

    new-instance v10, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 p1, 0xe

    invoke-direct {v10, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    iget-boolean v3, v0, Landroidx/compose/material/ripple/RippleNode;->P:Z

    invoke-virtual/range {v1 .. v10}, Lk1/e;->b(Lj0/l;ZJIJFLio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;)V

    iput-object v1, v0, Lk1/a;->Y:Lk1/e;

    invoke-static {v0}, La3/g;->h(La3/r;)V

    return-void

    :cond_5
    instance-of v0, p1, Lj0/m;

    if-eqz v0, :cond_6

    move-object p1, p0

    check-cast p1, Lk1/a;

    iget-object p1, p1, Lk1/a;->Y:Lk1/e;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lk1/e;->d()V

    return-void

    :cond_6
    instance-of p1, p1, Lj0/k;

    if-eqz p1, :cond_7

    move-object p1, p0

    check-cast p1, Lk1/a;

    iget-object p1, p1, Lk1/a;->Y:Lk1/e;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lk1/e;->d()V

    :cond_7
    return-void
.end method

.method public final g(J)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/material/ripple/RippleNode;->V:Z

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    invoke-static {p1, p2}, Lv63/b;->l(J)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/material/ripple/RippleNode;->U:J

    iget p1, p0, Landroidx/compose/material/ripple/RippleNode;->Q:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-wide p1, p0, Landroidx/compose/material/ripple/RippleNode;->U:J

    sget v1, Lk1/c;->a:F

    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result v1

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result p1

    invoke-static {v1, p1}, Lge3/g;->c(FF)J

    move-result-wide p1

    invoke-static {p1, p2}, Lh2/b;->d(J)F

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    iget-boolean p2, p0, Landroidx/compose/material/ripple/RippleNode;->P:Z

    if-eqz p2, :cond_1

    sget p2, Lk1/c;->a:F

    invoke-interface {v0, p2}, Ly3/c;->q0(F)F

    move-result p2

    add-float/2addr p1, p2

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result p1

    :cond_1
    :goto_0
    iput p1, p0, Landroidx/compose/material/ripple/RippleNode;->T:F

    iget-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->W:La0/q0;

    iget-object p2, p1, La0/q0;->a:[Ljava/lang/Object;

    iget v0, p1, La0/q0;->b:I

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    aget-object v2, p2, v1

    check-cast v2, Lj0/n;

    invoke-virtual {p0, v2}, Landroidx/compose/material/ripple/RippleNode;->X0(Lj0/n;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, La0/q0;->c()V

    return-void
.end method
