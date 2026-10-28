.class public final Lg1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lx1/b;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lx1/b;I)V
    .locals 0

    iput p3, p0, Lg1/i;->w:I

    iput-object p1, p0, Lg1/i;->x:Lc93/m;

    iput-object p2, p0, Lg1/i;->y:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg1/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget p2, Ll1/d0;->b:F

    sget v0, Ll1/d0;->c:F

    new-instance v1, Lg1/i;

    iget-object v2, p0, Lg1/i;->y:Lx1/b;

    const/4 v3, 0x5

    iget-object v4, p0, Lg1/i;->x:Lc93/m;

    invoke-direct {v1, v4, v2, v3}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v2, -0x7606e600

    invoke-static {v2, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x1b6

    invoke-static {p2, v0, v1, p1, v2}, Ll1/a;->a(FFLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    and-int/2addr p2, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lg1/i;->x:Lc93/m;

    if-nez p2, :cond_3

    const p2, 0x13395559

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    :goto_3
    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_3
    const v2, -0xfe56058

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    invoke-interface {p2, p1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :goto_4
    iget-object p2, p0, Lg1/i;->y:Lx1/b;

    invoke-virtual {p2, p1, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_4
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

    if-eq v0, v1, :cond_5

    move v0, v2

    goto :goto_6

    :cond_5
    const/4 v0, 0x0

    :goto_6
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

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

    if-eqz v2, :cond_6

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v3

    if-lez v0, :cond_7

    goto :goto_7

    :cond_6
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v0, v3

    if-gez v0, :cond_7

    :goto_7
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_7
    const v0, 0x3f5eb852    # 0.87f

    :goto_8
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lg1/i;

    iget-object v1, p0, Lg1/i;->y:Lx1/b;

    const/4 v2, 0x3

    iget-object v3, p0, Lg1/i;->x:Lc93/m;

    invoke-direct {v0, v3, v1, v2}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v1, 0x49b349dc    # 1468731.5f

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_8
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_9

    move v0, v2

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_a

    sget-object p2, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/h9;

    iget-object p2, p2, Lg1/h9;->j:Ll3/v0;

    new-instance v0, Lg1/i;

    iget-object v1, p0, Lg1/i;->y:Lx1/b;

    const/4 v2, 0x2

    iget-object v3, p0, Lg1/i;->x:Lc93/m;

    invoke-direct {v0, v3, v1, v2}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v1, 0x6aab8f4d

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {p2, v0, p1, v1}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_a
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_b
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

    const/4 v3, 0x0

    if-eq v0, v1, :cond_b

    move v0, v2

    goto :goto_c

    :cond_b
    move v0, v3

    :goto_c
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_d

    iget-object p2, p0, Lg1/i;->y:Lx1/b;

    iget-object v0, p0, Lg1/i;->x:Lc93/m;

    if-nez v0, :cond_c

    const v0, 0x6e04f806

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-static {p2, p1, v3}, Lg1/s6;->d(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_c
    const v1, 0x6e05088c

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    invoke-static {p2, v0, p1, v3}, Lg1/s6;->a(Lx1/b;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_d
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_d
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_e

    move v0, v2

    goto :goto_e

    :cond_e
    move v0, v1

    :goto_e
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_12

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const/16 v0, 0x8

    int-to-float v0, v0

    int-to-float v3, v3

    invoke-static {p2, v0, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v3, p1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_f

    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_f
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_f
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    invoke-static {v3, p1, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 p2, 0xc

    int-to-float p2, p2

    new-instance v1, Lg1/i;

    const/4 v3, 0x0

    iget-object v4, p0, Lg1/i;->x:Lc93/m;

    iget-object v5, p0, Lg1/i;->y:Lx1/b;

    invoke-direct {v1, v4, v5, v3}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v3, -0x75c283aa

    invoke-static {v3, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v3, 0x1b6

    invoke-static {v0, p2, v1, p1, v3}, Lg1/k;->c(FFLx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_12
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_13

    move v2, v4

    goto :goto_11

    :cond_13
    move v2, v0

    :goto_11
    and-int/2addr p2, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_15

    iget-object p2, p0, Lg1/i;->x:Lc93/m;

    if-nez p2, :cond_14

    const p2, 0x2928ac43

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    :goto_12
    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_14
    const v2, -0xf303c82

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    invoke-interface {p2, p1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :goto_13
    iget-object p2, p0, Lg1/i;->y:Lx1/b;

    invoke-virtual {p2, p1, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :cond_15
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_14
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
