.class public final synthetic Lkg2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkg2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lkg2/e;->w:I

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    const/16 v4, 0x8

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const-string v10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    const-string v11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    const/4 v12, 0x0

    const/4 v13, 0x1

    packed-switch v2, :pswitch_data_0

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v15, Ll3/m0;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget v3, Li2/x;->o:I

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    sget-wide v10, Li2/x;->n:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v10, v11}, Li2/x;-><init>(J)V

    goto :goto_0

    :cond_0
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v10

    new-instance v2, Li2/x;

    invoke-direct {v2, v10, v11}, Li2/x;-><init>(J)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v10, v2, Li2/x;->a:J

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v12, Ly3/o;->b:[Ly3/p;

    sget-object v12, Ll3/l0;->s:Ll3/k0;

    iget-object v12, v12, Ll3/k0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v2, :cond_2

    invoke-interface {v12, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/o;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object/from16 p1, v15

    iget-wide v14, v2, Ly3/o;->a:J

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v9, Lp3/r;->x:Lp3/r;

    sget-object v9, Ll3/l0;->n:Lp0/n0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    :cond_3
    const/16 v20, 0x0

    goto :goto_2

    :cond_4
    if-eqz v2, :cond_3

    iget-object v9, v9, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-interface {v9, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp3/r;

    move-object/from16 v20, v2

    :goto_2
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Lp3/n;

    move-object/from16 v21, v2

    goto :goto_3

    :cond_5
    const/16 v21, 0x0

    :goto_3
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v2, Lp3/o;

    move-object/from16 v22, v2

    goto :goto_4

    :cond_6
    const/16 v22, 0x0

    :goto_4
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/String;

    move-object/from16 v24, v2

    goto :goto_5

    :cond_7
    const/16 v24, 0x0

    :goto_5
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v2, :cond_8

    invoke-interface {v12, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/o;

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    :goto_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v5, v2, Ly3/o;->a:J

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ll3/l0;->o:Lp0/n0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    :cond_9
    const/16 v27, 0x0

    goto :goto_7

    :cond_a
    if-eqz v2, :cond_9

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/a;

    move-object/from16 v27, v2

    :goto_7
    const/16 v2, 0x9

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ll3/l0;->l:Lp0/n0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    :cond_b
    const/16 v28, 0x0

    goto :goto_8

    :cond_c
    if-eqz v2, :cond_b

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/p;

    move-object/from16 v28, v2

    :goto_8
    const/16 v2, 0xa

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ls3/b;->y:Ls3/b;

    sget-object v4, Ll3/l0;->u:Lp0/n0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    :cond_d
    const/16 v29, 0x0

    goto :goto_9

    :cond_e
    if-eqz v2, :cond_d

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/b;

    move-object/from16 v29, v2

    :goto_9
    const/16 v2, 0xb

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v2, :cond_10

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-wide v7, Li2/x;->n:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v7, v8}, Li2/x;-><init>(J)V

    goto :goto_a

    :cond_f
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v7

    new-instance v2, Li2/x;

    invoke-direct {v2, v7, v8}, Li2/x;-><init>(J)V

    goto :goto_a

    :cond_10
    const/4 v2, 0x0

    :goto_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v7, v2, Li2/x;->a:J

    const/16 v2, 0xc

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ll3/l0;->k:Lp0/n0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    :cond_11
    const/16 v32, 0x0

    goto :goto_b

    :cond_12
    if-eqz v2, :cond_11

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/l;

    move-object/from16 v32, v2

    :goto_b
    const/16 v2, 0xd

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Li2/z0;->d:Li2/z0;

    sget-object v2, Ll3/l0;->q:Lp0/n0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    :cond_13
    const/16 v33, 0x0

    goto :goto_c

    :cond_14
    if-eqz v1, :cond_13

    iget-object v2, v2, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/z0;

    move-object/from16 v33, v1

    :goto_c
    const v34, 0xc020

    const/16 v23, 0x0

    move-wide/from16 v25, v5

    move-wide/from16 v30, v7

    move-wide/from16 v16, v10

    move-wide/from16 v18, v14

    move-object/from16 v15, p1

    invoke-direct/range {v15 .. v34}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    return-object v15

    :pswitch_0
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v17, Ll3/b0;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_15

    check-cast v2, Lw3/k;

    goto :goto_d

    :cond_15
    const/4 v2, 0x0

    :goto_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v2, v2, Lw3/k;->a:I

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_16

    check-cast v3, Lw3/m;

    goto :goto_e

    :cond_16
    const/4 v3, 0x0

    :goto_e
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v3, Lw3/m;->a:I

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Ly3/o;->b:[Ly3/p;

    sget-object v10, Ll3/l0;->s:Ll3/k0;

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v9, :cond_17

    iget-object v10, v10, Ll3/k0;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v10, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/o;

    goto :goto_f

    :cond_17
    const/4 v9, 0x0

    :goto_f
    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v9, v9, Ly3/o;->a:J

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    sget-object v12, Lw3/q;->c:Lw3/q;

    sget-object v12, Ll3/l0;->m:Lp0/n0;

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_19

    :cond_18
    const/16 v22, 0x0

    goto :goto_10

    :cond_19
    if-eqz v8, :cond_18

    iget-object v12, v12, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lw3/q;

    move-object/from16 v22, v8

    :goto_10
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Ll3/s;->b:Lp0/n0;

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1b

    :cond_1a
    const/16 v23, 0x0

    goto :goto_11

    :cond_1b
    if-eqz v7, :cond_1a

    iget-object v8, v8, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {v8, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll3/e0;

    move-object/from16 v23, v7

    :goto_11
    const/4 v7, 0x5

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lw3/i;->c:Lw3/i;

    sget-object v8, Ll3/l0;->w:Lp0/n0;

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1d

    :cond_1c
    const/16 v24, 0x0

    goto :goto_12

    :cond_1d
    if-eqz v7, :cond_1c

    iget-object v8, v8, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {v8, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lw3/i;

    move-object/from16 v24, v7

    :goto_12
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Ll3/s;->c:Lp0/n0;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1f

    :cond_1e
    const/4 v6, 0x0

    goto :goto_13

    :cond_1f
    if-eqz v6, :cond_1e

    iget-object v7, v7, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v7, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw3/e;

    :goto_13
    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v6, v6, Lw3/e;->a:I

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_20

    check-cast v5, Lw3/d;

    goto :goto_14

    :cond_20
    const/4 v5, 0x0

    :goto_14
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v5, v5, Lw3/d;->a:I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/s;->d:Lp0/n0;

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_22

    :cond_21
    move/from16 v18, v2

    move/from16 v19, v3

    move/from16 v26, v5

    move/from16 v25, v6

    move-wide/from16 v20, v9

    const/16 v27, 0x0

    goto :goto_15

    :cond_22
    if-eqz v1, :cond_21

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lw3/s;

    move/from16 v18, v2

    move/from16 v19, v3

    move/from16 v26, v5

    move/from16 v25, v6

    move-wide/from16 v20, v9

    move-object/from16 v27, v14

    :goto_15
    invoke-direct/range {v17 .. v27}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    return-object v17

    :pswitch_1
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_23

    check-cast v2, Ljava/lang/String;

    goto :goto_16

    :cond_23
    const/4 v2, 0x0

    :goto_16
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Ll3/l0;->j:Lp0/n0;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    :cond_24
    const/4 v1, 0x0

    goto :goto_17

    :cond_25
    if-eqz v1, :cond_24

    iget-object v3, v3, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/s0;

    :goto_17
    new-instance v3, Ll3/t;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v1, v4}, Ll3/t;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    return-object v3

    :pswitch_2
    new-instance v2, Ll3/w0;

    if-eqz v1, :cond_26

    move-object v14, v1

    check-cast v14, Ljava/lang/String;

    goto :goto_18

    :cond_26
    const/4 v14, 0x0

    :goto_18
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v2, v14}, Ll3/w0;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_3
    new-instance v2, Ll3/x0;

    if-eqz v1, :cond_27

    move-object v14, v1

    check-cast v14, Ljava/lang/String;

    goto :goto_19

    :cond_27
    const/4 v14, 0x0

    :goto_19
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v2, v14}, Ll3/x0;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_4
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_28

    move-object v4, v2

    check-cast v4, Ll3/k;

    goto :goto_1a

    :cond_28
    const/4 v4, 0x0

    :goto_1a
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_29

    check-cast v2, Ljava/lang/Integer;

    goto :goto_1b

    :cond_29
    const/4 v2, 0x0

    :goto_1b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2a

    check-cast v3, Ljava/lang/Integer;

    goto :goto_1c

    :cond_2a
    const/4 v3, 0x0

    :goto_1c
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2b

    check-cast v5, Ljava/lang/String;

    goto :goto_1d

    :cond_2b
    const/4 v5, 0x0

    :goto_1d
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    packed-switch v4, :pswitch_data_1

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_5
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2c

    move-object v14, v1

    check-cast v14, Ljava/lang/String;

    goto :goto_1e

    :cond_2c
    const/4 v14, 0x0

    :goto_1e
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    new-instance v4, Ll3/o0;

    invoke-direct {v4, v14}, Ll3/o0;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v4, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_25

    :pswitch_6
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/l0;->g:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    :cond_2d
    const/4 v14, 0x0

    goto :goto_1f

    :cond_2e
    if-eqz v1, :cond_2d

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/t;

    :goto_1f
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    invoke-direct {v1, v2, v3, v14, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_25

    :pswitch_7
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/l0;->f:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    :cond_2f
    const/4 v14, 0x0

    goto :goto_20

    :cond_30
    if-eqz v1, :cond_2f

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/u;

    :goto_20
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    invoke-direct {v1, v2, v3, v14, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_25

    :pswitch_8
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/l0;->e:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_32

    :cond_31
    const/4 v14, 0x0

    goto :goto_21

    :cond_32
    if-eqz v1, :cond_31

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/w0;

    :goto_21
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    invoke-direct {v1, v2, v3, v14, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_25

    :pswitch_9
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/l0;->d:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_34

    :cond_33
    const/4 v14, 0x0

    goto :goto_22

    :cond_34
    if-eqz v1, :cond_33

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/x0;

    :goto_22
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    invoke-direct {v1, v2, v3, v14, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    goto :goto_25

    :pswitch_a
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/l0;->i:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_36

    :cond_35
    const/4 v14, 0x0

    goto :goto_23

    :cond_36
    if-eqz v1, :cond_35

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/m0;

    :goto_23
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    invoke-direct {v1, v2, v3, v14, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    goto :goto_25

    :pswitch_b
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ll3/l0;->h:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_38

    :cond_37
    const/4 v14, 0x0

    goto :goto_24

    :cond_38
    if-eqz v1, :cond_37

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/b0;

    :goto_24
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/e;

    invoke-direct {v1, v2, v3, v14, v5}, Ll3/e;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    :goto_25
    return-object v1

    :pswitch_c
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v2, Lw3/i;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_39

    move-object v4, v3

    check-cast v4, Lw3/f;

    goto :goto_26

    :cond_39
    const/4 v4, 0x0

    :goto_26
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v4, Lw3/f;->a:F

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3a

    check-cast v4, Lw3/h;

    goto :goto_27

    :cond_3a
    const/4 v4, 0x0

    :goto_27
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v4, v4, Lw3/h;->a:I

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3b

    move-object v14, v1

    check-cast v14, Lw3/g;

    goto :goto_28

    :cond_3b
    const/4 v14, 0x0

    :goto_28
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v2, v3, v4}, Lw3/i;-><init>(FI)V

    return-object v2

    :pswitch_d
    new-instance v2, Ls3/a;

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    sget-object v3, Ls3/c;->a:Ls/m2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v4

    const-string v5, "und"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3c

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "The language tag "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtag delimiter and must be replaced with \'-\'."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "Locale"

    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3c
    invoke-direct {v2, v3}, Ls3/a;-><init>(Ljava/util/Locale;)V

    return-object v2

    :pswitch_e
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_29
    if-ge v12, v3, :cond_3f

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ll3/l0;->c:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3e

    :cond_3d
    const/4 v4, 0x0

    goto :goto_2a

    :cond_3e
    if-eqz v4, :cond_3d

    iget-object v5, v5, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    :goto_2a
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_29

    :cond_3f
    return-object v2

    :pswitch_f
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_2b
    if-ge v12, v3, :cond_42

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ll3/l0;->v:Lp0/n0;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_41

    :cond_40
    const/4 v4, 0x0

    goto :goto_2c

    :cond_41
    if-eqz v4, :cond_40

    iget-object v5, v5, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls3/a;

    :goto_2c
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_2b

    :cond_42
    new-instance v1, Ls3/b;

    invoke-direct {v1, v2}, Ls3/b;-><init>(Ljava/util/List;)V

    return-object v1

    :pswitch_10
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_43

    new-instance v1, Lh2/b;

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-direct {v1, v2, v3}, Lh2/b;-><init>(J)V

    goto :goto_2f

    :cond_43
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_44

    move-object v4, v2

    check-cast v4, Ljava/lang/Float;

    goto :goto_2d

    :cond_44
    const/4 v4, 0x0

    :goto_2d
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_45

    move-object v14, v1

    check-cast v14, Ljava/lang/Float;

    goto :goto_2e

    :cond_45
    const/4 v14, 0x0

    :goto_2e
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    const/16 v1, 0x20

    shl-long v1, v2, v1

    const-wide v6, 0xffffffffL

    and-long v3, v4, v6

    or-long/2addr v1, v3

    new-instance v3, Lh2/b;

    invoke-direct {v3, v1, v2}, Lh2/b;-><init>(J)V

    move-object v1, v3

    :goto_2f
    return-object v1

    :pswitch_11
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_46

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    goto :goto_30

    :cond_46
    const/4 v4, 0x0

    :goto_30
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ll3/l0;->j:Lp0/n0;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_48

    :cond_47
    const/4 v1, 0x0

    goto :goto_31

    :cond_48
    if-eqz v1, :cond_47

    iget-object v2, v2, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/s0;

    :goto_31
    new-instance v2, Ll3/u;

    const/4 v3, 0x0

    invoke-direct {v2, v4, v1, v3}, Ll3/u;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    return-object v2

    :pswitch_12
    const/4 v3, 0x0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_49

    sget-wide v1, Ly3/o;->c:J

    new-instance v3, Ly3/o;

    invoke-direct {v3, v1, v2}, Ly3/o;-><init>(J)V

    goto :goto_34

    :cond_49
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4a

    move-object v4, v2

    check-cast v4, Ljava/lang/Float;

    goto :goto_32

    :cond_4a
    move-object v4, v3

    :goto_32
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4b

    move-object v14, v1

    check-cast v14, Ly3/p;

    goto :goto_33

    :cond_4b
    move-object v14, v3

    :goto_33
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v3, v14, Ly3/p;->a:J

    invoke-static {v2, v3, v4}, Lv63/c;->j(FJ)J

    move-result-wide v1

    new-instance v3, Ly3/o;

    invoke-direct {v3, v1, v2}, Ly3/o;-><init>(J)V

    :goto_34
    return-object v3

    :pswitch_13
    const/4 v3, 0x0

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v14, Li2/z0;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget v4, Li2/x;->o:I

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v2, :cond_4d

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4c

    sget-wide v5, Li2/x;->n:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v5, v6}, Li2/x;-><init>(J)V

    goto :goto_35

    :cond_4c
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v5

    new-instance v2, Li2/x;

    invoke-direct {v2, v5, v6}, Li2/x;-><init>(J)V

    goto :goto_35

    :cond_4d
    move-object v2, v3

    :goto_35
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v5, v2, Li2/x;->a:J

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Ll3/l0;->t:Ll3/k0;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v2, :cond_4e

    iget-object v4, v7, Ll3/k0;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lh2/b;

    goto :goto_36

    :cond_4e
    move-object v4, v3

    :goto_36
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v7, v4, Lh2/b;->a:J

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4f

    check-cast v1, Ljava/lang/Float;

    goto :goto_37

    :cond_4f
    move-object v1, v3

    :goto_37
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v19

    move-wide v15, v5

    move-wide/from16 v17, v7

    invoke-direct/range {v14 .. v19}, Li2/z0;-><init>(JJF)V

    return-object v14

    :pswitch_14
    const/4 v3, 0x0

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_50

    move-object v4, v2

    check-cast v4, Ljava/lang/Integer;

    goto :goto_38

    :cond_50
    move-object v4, v3

    :goto_38
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_51

    move-object v14, v1

    check-cast v14, Ljava/lang/Integer;

    goto :goto_39

    :cond_51
    move-object v14, v3

    :goto_39
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lj93/l0;->f(II)J

    move-result-wide v1

    new-instance v3, Ll3/u0;

    invoke-direct {v3, v1, v2}, Ll3/u0;-><init>(J)V

    return-object v3

    :pswitch_15
    const-string v2, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    new-instance v2, Lw3/a;

    invoke-direct {v2, v1}, Lw3/a;-><init>(F)V

    return-object v2

    :pswitch_16
    new-instance v2, Lp3/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v1}, Lp3/r;-><init>(I)V

    return-object v2

    :pswitch_17
    const/4 v3, 0x0

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v2, Lw3/q;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ly3/o;->b:[Ly3/p;

    sget-object v5, Ll3/l0;->s:Ll3/k0;

    iget-object v5, v5, Ll3/k0;->x:Lkotlin/jvm/functions/Function1;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v4, :cond_52

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/o;

    goto :goto_3a

    :cond_52
    move-object v4, v3

    :goto_3a
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v7, v4, Ly3/o;->a:J

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v1, :cond_53

    invoke-interface {v5, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ly3/o;

    goto :goto_3b

    :cond_53
    move-object v14, v3

    :goto_3b
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v3, v14, Ly3/o;->a:J

    invoke-direct {v2, v7, v8, v3, v4}, Lw3/q;-><init>(JJ)V

    return-object v2

    :pswitch_18
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    new-instance v2, Lw3/p;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-direct {v2, v3, v1}, Lw3/p;-><init>(FF)V

    return-object v2

    :pswitch_19
    new-instance v2, Lw3/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v1}, Lw3/l;-><init>(I)V

    return-object v2

    :pswitch_1a
    const/4 v3, 0x0

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ll3/l0;->b:Lp0/n0;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_55

    :cond_54
    move-object v4, v3

    goto :goto_3c

    :cond_55
    if-eqz v2, :cond_54

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/List;

    :goto_3c
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_56

    move-object v14, v1

    check-cast v14, Ljava/lang/String;

    goto :goto_3d

    :cond_56
    move-object v14, v3

    :goto_3d
    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ll3/g;

    invoke-direct {v1, v4, v14}, Ll3/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v1

    :pswitch_1b
    const/4 v3, 0x0

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ll3/l0;->i:Lp0/n0;

    iget-object v4, v4, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_58

    :cond_57
    move-object v2, v3

    goto :goto_3e

    :cond_58
    if-eqz v2, :cond_57

    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/m0;

    :goto_3e
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5a

    :cond_59
    move-object v6, v3

    goto :goto_3f

    :cond_5a
    if-eqz v6, :cond_59

    invoke-interface {v4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/m0;

    :goto_3f
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5c

    :cond_5b
    move-object v7, v3

    goto :goto_40

    :cond_5c
    if-eqz v7, :cond_5b

    invoke-interface {v4, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll3/m0;

    :goto_40
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5e

    :cond_5d
    move-object v14, v3

    goto :goto_41

    :cond_5e
    if-eqz v1, :cond_5d

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ll3/m0;

    :goto_41
    new-instance v1, Ll3/s0;

    invoke-direct {v1, v2, v6, v7, v14}, Ll3/s0;-><init>(Ll3/m0;Ll3/m0;Ll3/m0;Ll3/m0;)V

    return-object v1

    :pswitch_1c
    check-cast v1, Ll3/b;

    instance-of v1, v1, Ll3/b0;

    xor-int/2addr v1, v13

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_1d
    check-cast v1, Lad3/g;

    invoke-static {v1}, Ll02/a;->a(Lad3/g;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1e
    check-cast v1, Lad3/g;

    invoke-static {v1}, Lcom/whoop/navigation/json/NavigationActionTypeAdapter;->a(Lad3/g;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1f
    check-cast v1, Lkk0/a;

    invoke-static {v1}, Lkk0/a;->a(Lkk0/a;)Ljava/lang/Byte;

    move-result-object v1

    return-object v1

    :pswitch_20
    check-cast v1, Lad3/g;

    invoke-static {v1}, Lki0/b;->a(Lad3/g;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_21
    check-cast v1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    invoke-static {v1}, Lkg2/f;->c(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Lm91/u;

    move-result-object v1

    return-object v1

    :pswitch_22
    check-cast v1, Llb1/z0;

    invoke-static {v1}, Lkg2/f;->a(Llb1/z0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_23
    check-cast v1, Ljb1/b;

    invoke-static {v1}, Lkg2/f;->b(Ljb1/b;)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
