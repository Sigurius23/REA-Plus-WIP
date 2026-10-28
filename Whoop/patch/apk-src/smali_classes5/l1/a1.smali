.class public final Ll1/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln0/u;Li93/j;Lm1/o;Lm1/r;Lkotlin/jvm/functions/Function1;Lm1/n;Ljava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll1/a1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/a1;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll1/a1;->z:Ljava/lang/Object;

    iput-object p3, p0, Ll1/a1;->E:Ljava/lang/Object;

    iput-object p4, p0, Ll1/a1;->F:Ljava/lang/Object;

    iput-object p5, p0, Ll1/a1;->x:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll1/a1;->G:Ljava/lang/Object;

    iput-object p7, p0, Ll1/a1;->H:Ljava/lang/Object;

    iput-object p8, p0, Ll1/a1;->I:Ljava/lang/Object;

    iput-object p9, p0, Ll1/a1;->J:Ljava/lang/Object;

    iput-object p10, p0, Ll1/a1;->K:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq00/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll1/a1;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/a1;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll1/a1;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ll1/a1;->z:Ljava/lang/Object;

    iput-object p4, p0, Ll1/a1;->E:Ljava/lang/Object;

    iput-object p5, p0, Ll1/a1;->F:Ljava/lang/Object;

    iput-object p6, p0, Ll1/a1;->G:Ljava/lang/Object;

    iput-object p7, p0, Ll1/a1;->H:Ljava/lang/Object;

    iput-object p8, p0, Ll1/a1;->I:Ljava/lang/Object;

    iput-object p9, p0, Ll1/a1;->J:Ljava/lang/Object;

    iput-object p10, p0, Ll1/a1;->K:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    iget v1, v0, Ll1/a1;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Ll1/a1;->y:Ljava/lang/Object;

    const/4 v4, 0x2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    const/4 v6, 0x0

    iget-object v7, v0, Ll1/a1;->J:Ljava/lang/Object;

    iget-object v8, v0, Ll1/a1;->G:Ljava/lang/Object;

    iget-object v9, v0, Ll1/a1;->K:Ljava/lang/Object;

    iget-object v10, v0, Ll1/a1;->E:Ljava/lang/Object;

    iget-object v11, v0, Ll1/a1;->I:Ljava/lang/Object;

    iget-object v12, v0, Ll1/a1;->H:Ljava/lang/Object;

    iget-object v13, v0, Ll1/a1;->F:Ljava/lang/Object;

    iget-object v14, v0, Ll1/a1;->z:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v10, Lbc3/c0;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v15, p2

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    check-cast v9, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v15, v15, 0x3

    if-ne v15, v4, :cond_1

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v15

    if-nez v15, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    check-cast v3, Lq00/i0;

    check-cast v1, Lp1/q;

    const v4, -0x7961e2a3

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    move-object v4, v14

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v4, v15

    move-object v15, v13

    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v4, v15

    move-object v15, v8

    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v4, v15

    move-object v15, v12

    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v4, v15

    move-object v15, v11

    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v4, v15

    move-object/from16 v16, v14

    check-cast v16, Lkotlin/jvm/functions/Function1;

    move-object/from16 v18, v13

    check-cast v18, Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v8

    check-cast v19, Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v12

    check-cast v20, Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v11

    check-cast v21, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_2

    if-ne v8, v5, :cond_3

    :cond_2
    new-instance v15, Lam2/b;

    const/16 v22, 0x13

    move-object/from16 v17, v10

    invoke-direct/range {v15 .. v22}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v15

    :cond_3
    move-object/from16 v18, v8

    check-cast v18, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    move-object/from16 v19, v7

    check-cast v19, Lc93/a;

    const v4, -0x79614927

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_4

    if-ne v7, v5, :cond_5

    :cond_4
    new-instance v7, Lp62/h;

    const/16 v4, 0x10

    invoke-direct {v7, v9, v4}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    const/16 v22, 0x0

    iget-object v4, v0, Ll1/a1;->x:Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v1

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    invoke-static/range {v16 .. v22}, Lse/h;->i(Lq00/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    return-object v2

    :pswitch_0
    check-cast v8, Lm1/n;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v15, p2

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    and-int/lit8 v6, v15, 0x3

    const/16 v17, 0x1

    if-eq v6, v4, :cond_6

    move/from16 v4, v17

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v6, v15, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_7

    new-instance v4, Lkx1/b;

    const/16 v6, 0xd

    invoke-direct {v4, v6}, Lkx1/b;-><init>(I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    invoke-static {v6, v15, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    check-cast v3, Ln0/u;

    sget-object v4, Ll1/b0;->a:Ll1/b0;

    invoke-static {}, Ld0/f;->o()Ld0/x;

    move-result-object v4

    sget-object v6, Lo1/n;->y:Lo1/n;

    invoke-static {v6, v1}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v6

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    move-object/from16 v16, v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v15, :cond_8

    if-ne v2, v5, :cond_9

    :cond_8
    sget-object v2, Li0/m;->b:Li0/m;

    new-instance v15, Li0/b;

    invoke-direct {v15, v3, v2}, Li0/b;-><init>(Ln0/u;Li0/n;)V

    new-instance v2, Ll1/a0;

    invoke-direct {v2, v15}, Ll1/a0;-><init>(Li0/b;)V

    sget v15, Li0/k;->a:F

    new-instance v15, Li0/g;

    invoke-direct {v15, v2, v4, v6}, Li0/g;-><init>(Li0/l;Ld0/x;Ld0/l;)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v15

    :cond_9
    move-object/from16 v22, v2

    check-cast v22, Lh0/p3;

    move-object v2, v14

    check-cast v2, Li93/j;

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    move-object v4, v10

    check-cast v4, Lm1/o;

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object v4, v13

    check-cast v4, Lm1/r;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Ll1/a1;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object v4, v12

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object v4, v11

    check-cast v4, Ll1/e0;

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object v4, v7

    check-cast v4, Ll1/n3;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object v4, v9

    check-cast v4, Ll1/y;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    move-object v6, v14

    check-cast v6, Li93/j;

    check-cast v10, Lm1/o;

    check-cast v13, Lm1/r;

    check-cast v12, Ljava/lang/Long;

    check-cast v11, Ll1/e0;

    check-cast v7, Ll1/n3;

    move-object v14, v9

    check-cast v14, Ll1/y;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_a

    if-ne v4, v5, :cond_b

    :cond_a
    new-instance v5, Lid2/s;

    iget-object v9, v0, Ll1/a1;->x:Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v13

    move-object v13, v7

    move-object v7, v10

    move-object v10, v8

    move-object/from16 v8, v29

    move-object/from16 v29, v12

    move-object v12, v11

    move-object/from16 v11, v29

    invoke-direct/range {v5 .. v14}, Lid2/s;-><init>(Li93/j;Lm1/o;Lm1/r;Lkotlin/jvm/functions/Function1;Lm1/n;Ljava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v5

    :cond_b
    move-object/from16 v25, v4

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const/16 v27, 0x0

    const/16 v28, 0x1bc

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v26, v1

    move-object/from16 v18, v3

    invoke-static/range {v17 .. v28}, Lkotlin/jvm/internal/j;->d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_c
    move-object/from16 v26, v1

    move-object/from16 v16, v2

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    :goto_3
    return-object v16

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
