.class public final Lg1/b8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx1/b;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lx1/b;


# direct methods
.method public synthetic constructor <init>(Lx1/b;Lc93/m;Lx1/b;I)V
    .locals 0

    iput p4, p0, Lg1/b8;->w:I

    iput-object p1, p0, Lg1/b8;->x:Lx1/b;

    iput-object p2, p0, Lg1/b8;->y:Lc93/m;

    iput-object p3, p0, Lg1/b8;->z:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lg1/b8;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    and-int/2addr v2, v5

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Ll0/m;->g:Ll0/h;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    invoke-static {v1, v2, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    :cond_2
    invoke-static {v2, v11, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v12, Ll0/z;->a:Ll0/z;

    invoke-virtual {v12, v7, v6, v8}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    move-object/from16 p2, v7

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v11, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v11, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v11, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v6, v0, Lg1/b8;->x:Lx1/b;

    invoke-virtual {v6, v12, v11, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    sget-object v3, Lb2/e;->O:Lb2/k;

    move-object/from16 v6, p2

    invoke-virtual {v12, v6, v3}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll1/d0;->a:Ll0/l1;

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v13, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v7, v11, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v11, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lo1/h;->a:Lo1/f;

    invoke-static {v1, v11}, Ll1/n;->d(Lo1/f;Landroidx/compose/runtime/Composer;)J

    move-result-wide v7

    sget-object v1, Lo1/h;->b:Lo1/c0;

    invoke-static {v1, v11}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v9

    new-instance v1, Lg1/i;

    const/4 v2, 0x6

    iget-object v3, v0, Lg1/b8;->y:Lc93/m;

    iget-object v4, v0, Lg1/b8;->z:Lx1/b;

    invoke-direct {v1, v3, v4, v2}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v2, -0x41cc98e9

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0x180

    invoke-static/range {v7 .. v12}, Lm1/e0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_b

    move v3, v6

    goto :goto_5

    :cond_b
    move v3, v5

    :goto_5
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Lg1/b8;->x:Lx1/b;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    iget-object v6, v0, Lg1/b8;->y:Lc93/m;

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    iget-object v7, v0, Lg1/b8;->z:Lx1/b;

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_c

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v8, v4, :cond_d

    :cond_c
    new-instance v8, La01/d;

    const/16 v4, 0xd

    invoke-direct {v8, v3, v6, v7, v4}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lc93/m;

    const/4 v3, 0x6

    invoke-static {v2, v8, v1, v3, v5}, Ly2/q1;->b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
