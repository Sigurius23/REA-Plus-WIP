.class public final Li20/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Li20/l0;->w:I

    iput-object p1, p0, Li20/l0;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Li20/l0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v10

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    int-to-float v9, p1

    sget-object p1, Lg1/d1;->a:Lp1/u2;

    move-object p2, v10

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/c1;

    invoke-virtual {p1}, Lg1/c1;->h()J

    move-result-wide v5

    sget-object v1, Lx20/e;->b:Lx1/b;

    new-instance p1, Li20/l0;

    iget-object p2, p0, Li20/l0;->x:Lc93/a;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Li20/l0;-><init>(Lc93/a;I)V

    const p2, -0x542374f4

    invoke-static {p2, v10, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const v11, 0x180186

    const/16 v12, 0x2a

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v1 .. v12}, Lg1/n0;->d(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_3

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v3, Lx20/e;->c:Lx1/b;

    const/16 v5, 0x6000

    const/16 v6, 0xe

    iget-object v0, p0, Li20/l0;->x:Lc93/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_5

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_5
    :goto_4
    invoke-static {p1}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object p2

    iget-object p2, p2, Ld40/n;->i:Lg1/c1;

    invoke-virtual {p2}, Lg1/c1;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld40/r;->p(J)Z

    move-result p2

    const v0, 0x3d8f5c29    # 0.07f

    if-eqz p2, :cond_6

    sget-wide v1, Li2/x;->b:J

    invoke-static {v0, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v0

    goto :goto_5

    :cond_6
    sget-wide v1, Li2/x;->f:J

    invoke-static {v0, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v0

    :goto_5
    sget-object p2, Lb2/e;->K:Lb2/l;

    sget-object v2, Ll0/m;->e:Ll0/h;

    sget-object v3, Lb2/t;->w:Lb2/t;

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v0, v1, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x8

    int-to-float v1, v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v3, v1, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v2, p2, p1, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object p2

    invoke-static {p1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v1

    move-object v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v2, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {p1, p2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v1, v2, v1, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {p1, p2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p2, 0x72fb0983

    invoke-virtual {v2, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Li20/l0;->x:Lc93/a;

    invoke-virtual {v2, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_a

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_b

    :cond_a
    new-instance v1, Lg40/i3;

    const/16 v0, 0x13

    invoke-direct {v1, p2, v0}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v1, Lc93/a;

    const/4 p2, 0x0

    invoke-virtual {v2, p2}, Lp1/q;->q(Z)V

    invoke-static {v1, p1, p2}, Li20/l1;->g(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
