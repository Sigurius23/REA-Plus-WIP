.class public final Lg1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;


# direct methods
.method public synthetic constructor <init>(ILc93/m;)V
    .locals 0

    iput p1, p0, Lg1/e;->w:I

    iput-object p2, p0, Lg1/e;->x:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg1/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p2, Lb2/t;->w:Lb2/t;

    const-string v0, "Container"

    invoke-static {p2, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, p1, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p2, p0, Lg1/e;->x:Lc93/m;

    invoke-static {v2, p2, p1, v3}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_5

    move v0, v2

    goto :goto_3

    :cond_5
    move v0, v3

    :goto_3
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_9

    sget-object p2, Lb2/e;->G:Lb2/m;

    invoke-static {p2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v0, p1, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {p1, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v1, p1, Lp1/q;->S:Z

    if-nez v1, :cond_7

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    invoke-static {v0, p1, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p2, p0, Lg1/e;->x:Lc93/m;

    invoke-static {v3, p2, p1, v2}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_a

    move v0, v2

    goto :goto_6

    :cond_a
    move v0, v3

    :goto_6
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_10

    const/high16 p2, 0x3f800000    # 1.0f

    float-to-double v0, p2

    const-wide/16 v4, 0x0

    cmpl-double v0, v0, v4

    if-lez v0, :cond_b

    goto :goto_7

    :cond_b
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, p2, v1

    if-lez v4, :cond_c

    move p2, v1

    :cond_c
    invoke-direct {v0, p2, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_d

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_8
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {p1, p2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_e

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    :cond_e
    invoke-static {v1, p1, v1, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p2, p0, Lg1/e;->x:Lc93/m;

    invoke-static {v3, p2, p1, v2}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_9

    :cond_10
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_12

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_c

    :cond_12
    :goto_a
    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Lb2/e;->w:Lb2/m;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    invoke-static {p1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v2

    move-object v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-eqz v6, :cond_13

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_b
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_14

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    :cond_14
    invoke-static {v2, v3, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lg1/e;->x:Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_c
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_16

    move v0, v2

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    :goto_d
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_19

    sget-object p2, Lg1/j1;->a:Lp1/b0;

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    if-eqz v2, :cond_17

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v3

    if-lez v0, :cond_18

    goto :goto_e

    :cond_17
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v0, v3

    if-gez v0, :cond_18

    :goto_e
    const v0, 0x3f3d70a4    # 0.74f

    goto :goto_f

    :cond_18
    const v0, 0x3f19999a    # 0.6f

    :goto_f
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lg1/e;

    iget-object v1, p0, Lg1/e;->x:Lc93/m;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lg1/e;-><init>(ILc93/m;)V

    const v1, -0x7ec21e0e

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_10

    :cond_19
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1a

    move v0, v3

    goto :goto_11

    :cond_1a
    move v0, v2

    :goto_11
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1b

    sget-object p2, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/h9;

    iget-object p2, p2, Lg1/h9;->j:Ll3/v0;

    iget-object v0, p0, Lg1/e;->x:Lc93/m;

    invoke-static {p2, v0, p1, v2}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_12

    :cond_1b
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_12
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1c

    move v0, v2

    goto :goto_13

    :cond_1c
    const/4 v0, 0x0

    :goto_13
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1f

    sget-object p2, Lg1/j1;->a:Lp1/b0;

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    if-eqz v2, :cond_1d

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v3

    if-lez v0, :cond_1e

    goto :goto_14

    :cond_1d
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v0, v3

    if-gez v0, :cond_1e

    :goto_14
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_15

    :cond_1e
    const v0, 0x3f5eb852    # 0.87f

    :goto_15
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lg1/e;

    iget-object v1, p0, Lg1/e;->x:Lc93/m;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lg1/e;-><init>(ILc93/m;)V

    const v1, -0x62a0022d

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_16

    :cond_1f
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_16
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_20

    move v0, v3

    goto :goto_17

    :cond_20
    move v0, v2

    :goto_17
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_21

    sget-object p2, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/h9;

    iget-object p2, p2, Lg1/h9;->g:Ll3/v0;

    iget-object v0, p0, Lg1/e;->x:Lc93/m;

    invoke-static {p2, v0, p1, v2}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_18

    :cond_21
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_18
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
