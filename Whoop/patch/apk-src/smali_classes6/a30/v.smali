.class public final La30/v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:La30/n0;

.field public final synthetic H:La30/t0;

.field public final synthetic I:La30/a0;

.field public final synthetic J:La30/u0;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La30/n0;La30/t0;La30/a0;La30/u0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La30/v;->G:La30/n0;

    iput-object p2, p0, La30/v;->H:La30/t0;

    iput-object p3, p0, La30/v;->I:La30/a0;

    iput-object p4, p0, La30/v;->J:La30/u0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, La30/v;

    iget-object v3, p0, La30/v;->I:La30/a0;

    iget-object v4, p0, La30/v;->J:La30/u0;

    iget-object v1, p0, La30/v;->G:La30/n0;

    iget-object v2, p0, La30/v;->H:La30/t0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La30/v;-><init>(La30/n0;La30/t0;La30/a0;La30/u0;Lq83/d;)V

    iput-object p1, v0, La30/v;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v9, p0

    iget-object v1, v9, La30/v;->I:La30/a0;

    iget-object v11, v1, La30/a0;->g:Lk20/a;

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v9, La30/v;->E:I

    const/4 v14, 0x4

    const/4 v15, 0x3

    iget-object v10, v9, La30/v;->J:La30/u0;

    iget-object v2, v9, La30/v;->H:La30/t0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v9, La30/v;->z:Ljava/lang/Object;

    check-cast v0, La30/a;

    iget-object v2, v9, La30/v;->y:Ljava/lang/Object;

    check-cast v2, Lmy/a;

    iget-object v6, v9, La30/v;->x:Ljava/lang/Object;

    check-cast v6, Lv00/c0;

    iget-object v7, v9, La30/v;->w:Ljava/lang/Object;

    check-cast v7, Ly00/c8;

    iget-object v8, v9, La30/v;->F:Ljava/lang/Object;

    check-cast v8, Ly00/u1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v7

    move-object v7, v0

    move-object v0, v13

    move/from16 v16, v3

    move/from16 v22, v4

    move-object v13, v5

    move-object v14, v9

    move-object/from16 v23, v10

    move-object/from16 v17, v11

    move-object/from16 v4, p1

    :goto_0
    move-object v10, v6

    move-object v6, v2

    move-object v2, v8

    goto/16 :goto_17

    :pswitch_1
    iget-object v0, v9, La30/v;->z:Ljava/lang/Object;

    check-cast v0, Lmy/a;

    iget-object v2, v9, La30/v;->y:Ljava/lang/Object;

    check-cast v2, Lv00/c0;

    iget-object v6, v9, La30/v;->x:Ljava/lang/Object;

    check-cast v6, Ly00/c8;

    iget-object v7, v9, La30/v;->w:Ljava/lang/Object;

    check-cast v7, Lbc3/i0;

    iget-object v8, v9, La30/v;->F:Ljava/lang/Object;

    check-cast v8, Ly00/u1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v2

    move-object v2, v0

    move-object v0, v6

    move-object v6, v13

    move/from16 v16, v3

    move/from16 v22, v4

    move-object v13, v5

    move-object v14, v9

    move-object/from16 v23, v10

    move-object/from16 v17, v11

    move-object v5, v12

    move-object/from16 v4, p1

    goto/16 :goto_15

    :pswitch_2
    iget-object v0, v9, La30/v;->z:Ljava/lang/Object;

    check-cast v0, Ly00/c8;

    iget-object v2, v9, La30/v;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    iget-object v6, v9, La30/v;->x:Ljava/lang/Object;

    check-cast v6, Lbc3/i0;

    iget-object v7, v9, La30/v;->w:Ljava/lang/Object;

    check-cast v7, Ly00/u1;

    iget-object v8, v9, La30/v;->F:Ljava/lang/Object;

    check-cast v8, Lmy/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v16, v3

    move/from16 v22, v4

    move-object v13, v5

    move-object v14, v9

    move-object/from16 v23, v10

    move-object/from16 v17, v11

    move-object v5, v12

    move-object/from16 v3, p1

    goto/16 :goto_13

    :pswitch_3
    iget-object v0, v9, La30/v;->z:Ljava/lang/Object;

    check-cast v0, La30/k;

    iget-object v6, v9, La30/v;->y:Ljava/lang/Object;

    check-cast v6, Ly00/u1;

    iget-object v7, v9, La30/v;->x:Ljava/lang/Object;

    check-cast v7, Lbc3/i0;

    iget-object v8, v9, La30/v;->w:Ljava/lang/Object;

    check-cast v8, Lmy/a;

    iget-object v13, v9, La30/v;->F:Ljava/lang/Object;

    check-cast v13, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v20, v2

    move/from16 v16, v3

    move-object v2, v6

    move-object v14, v7

    move-object/from16 v17, v10

    move-object v7, v13

    move-object v6, v0

    move v10, v4

    move-object v13, v5

    move-object/from16 v0, p1

    :goto_1
    move-object v3, v8

    goto/16 :goto_c

    :pswitch_4
    iget-object v0, v9, La30/v;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v6, v9, La30/v;->x:Ljava/lang/Object;

    check-cast v6, Lbc3/i0;

    iget-object v7, v9, La30/v;->w:Ljava/lang/Object;

    check-cast v7, Lmy/a;

    iget-object v8, v9, La30/v;->F:Ljava/lang/Object;

    check-cast v8, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v13, p1

    check-cast v13, Ll83/n;

    iget-object v13, v13, Ll83/n;->w:Ljava/lang/Object;

    move-object/from16 v20, v2

    move/from16 v16, v3

    move-object v14, v8

    move-object/from16 v17, v10

    move-object v2, v13

    move v10, v4

    move-object v13, v5

    move-object v8, v7

    move-object v7, v6

    goto/16 :goto_5

    :pswitch_5
    iget-object v0, v9, La30/v;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v6, v9, La30/v;->x:Ljava/lang/Object;

    check-cast v6, Lbc3/i0;

    iget-object v7, v9, La30/v;->w:Ljava/lang/Object;

    check-cast v7, Lmy/a;

    iget-object v8, v9, La30/v;->F:Ljava/lang/Object;

    check-cast v8, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v13, p1

    goto :goto_3

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v9, La30/v;->F:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lbc3/c0;

    iget-object v0, v9, La30/v;->G:La30/n0;

    iget-object v7, v0, La30/n0;->b:Lmy/a;

    invoke-virtual {v2}, La30/t0;->f()V

    iget-object v0, v1, La30/a0;->p:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lux/y;

    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    const-string v6, "pk_test"

    invoke-static {v0, v6, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    xor-int/2addr v0, v3

    iget-object v6, v1, La30/a0;->q:Ljava/lang/String;

    invoke-virtual {v7, v6, v0}, Lmy/a;->b(Ljava/lang/String;Z)V

    iget-boolean v0, v10, La30/u0;->b:Z

    iget-object v6, v11, Lk20/a;->e:Lbz/c;

    sget-object v13, Lbz/b;->w:Lbz/b;

    invoke-static {v6, v13}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    new-instance v6, Lk20/l;

    invoke-direct {v6, v0}, Lk20/l;-><init>(Z)V

    invoke-virtual {v11, v6, v5}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    iget-object v0, v1, La30/a0;->o:Lny/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, La30/p;

    invoke-direct {v0, v1, v5, v3}, La30/p;-><init>(La30/a0;Lq83/d;I)V

    invoke-static {v8, v5, v0, v15}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    new-instance v0, Le;

    invoke-direct {v0, v1, v7, v5, v14}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v8, v5, v0, v15}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iput-object v8, v9, La30/v;->F:Ljava/lang/Object;

    iput-object v7, v9, La30/v;->w:Ljava/lang/Object;

    iput-object v6, v9, La30/v;->x:Ljava/lang/Object;

    iput-object v0, v9, La30/v;->y:Ljava/lang/Object;

    iput v3, v9, La30/v;->E:I

    invoke-static {v1, v7, v9}, La30/a0;->f(La30/a0;Lmy/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v12, :cond_0

    :goto_2
    move-object v14, v9

    move-object v5, v12

    goto/16 :goto_16

    :cond_0
    :goto_3
    check-cast v13, Lq20/i0;

    move/from16 v16, v3

    iget-object v3, v7, Lmy/a;->x:Lh20/c2;

    move/from16 v17, v4

    iget-object v4, v7, Lmy/a;->P:Ljava/util/List;

    move-object/from16 v18, v5

    iget-object v5, v7, Lmy/a;->M:Ljava/util/List;

    if-eqz v13, :cond_1

    iget-object v13, v13, Lq20/i0;->w:Ljava/lang/String;

    goto :goto_4

    :cond_1
    move-object/from16 v13, v18

    :goto_4
    iget-object v14, v7, Lmy/a;->z:Lh20/w2;

    iget-object v15, v7, Lmy/a;->W:Ljava/lang/String;

    iput-object v8, v9, La30/v;->F:Ljava/lang/Object;

    iput-object v7, v9, La30/v;->w:Ljava/lang/Object;

    iput-object v6, v9, La30/v;->x:Ljava/lang/Object;

    iput-object v0, v9, La30/v;->y:Ljava/lang/Object;

    move-object/from16 p1, v0

    const/4 v0, 0x2

    iput v0, v9, La30/v;->E:I

    move-object v0, v2

    iget-object v2, v9, La30/v;->H:La30/t0;

    move/from16 v20, v17

    move-object/from16 v17, v10

    move/from16 v10, v20

    move-object/from16 v20, v0

    move-object v0, v7

    move-object v7, v14

    move-object v14, v8

    move-object v8, v15

    move-object v15, v6

    move-object v6, v13

    move-object/from16 v13, v18

    invoke-static/range {v1 .. v9}, La30/a0;->d(La30/a0;La30/t0;Lh20/c2;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lh20/w2;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_2

    goto :goto_2

    :cond_2
    move-object v8, v0

    move-object v7, v15

    move-object/from16 v0, p1

    :goto_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v2

    check-cast v6, Ly00/u1;

    iget-object v2, v6, Ly00/u1;->z:Ly00/c8;

    iget-object v3, v6, Ly00/u1;->w:Ly00/t1;

    invoke-interface {v2}, Ly00/c8;->q0()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v3, :cond_4

    iget-boolean v2, v3, Ly00/t1;->G:Z

    :goto_6
    move v3, v2

    goto :goto_7

    :cond_3
    sget-object v2, Lbz/d;->a:Lbz/d;

    sget-object v4, Lbz/f;->a:Lbz/f;

    invoke-virtual {v4, v2}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    move v3, v10

    goto :goto_7

    :cond_5
    sget-object v2, Lbz/e;->a:Lbz/e;

    invoke-virtual {v4, v2}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move/from16 v3, v16

    goto :goto_7

    :cond_6
    invoke-virtual {v4, v4}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    if-eqz v3, :cond_4

    iget-boolean v2, v3, Ly00/t1;->G:Z

    goto :goto_6

    :goto_7
    if-eqz v3, :cond_7

    new-instance v2, La30/p;

    invoke-direct {v2, v1, v13, v10}, La30/p;-><init>(La30/a0;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v14, v13, v13, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_7
    iget-object v2, v8, Lmy/a;->x:Lh20/c2;

    if-eqz v2, :cond_8

    iget-object v5, v2, Lh20/c2;->y:Lh20/b2;

    goto :goto_8

    :cond_8
    move-object v5, v13

    :goto_8
    instance-of v3, v5, Lh20/z1;

    if-eqz v3, :cond_b

    iget-object v2, v6, Ly00/u1;->H:Ly00/p1;

    if-eqz v2, :cond_9

    new-instance v3, La30/i;

    check-cast v5, Lh20/z1;

    iget-object v4, v5, Lh20/z1;->w:Ljava/lang/String;

    invoke-direct {v3, v2, v4}, La30/i;-><init>(Ly00/p1;Ljava/lang/String;)V

    :goto_9
    move-object v5, v3

    goto :goto_b

    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Excepted \'customer\' attribute as part of \'elements_session\' response!"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, La30/a0;->h:Lb20/f;

    sget-object v4, Lb20/e;->P:Lb20/e;

    sget v5, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v5

    const/4 v15, 0x4

    invoke-static {v3, v4, v5, v13, v15}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    iget-object v3, v6, Ly00/u1;->z:Ly00/c8;

    invoke-interface {v3}, Ly00/c8;->q0()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_a

    :cond_a
    throw v2

    :cond_b
    instance-of v3, v5, Lh20/a2;

    if-eqz v3, :cond_c

    new-instance v3, La30/j;

    check-cast v5, Lh20/a2;

    invoke-direct {v3, v2, v5}, La30/j;-><init>(Lh20/c2;Lh20/a2;)V

    goto :goto_9

    :cond_c
    :goto_a
    move-object v5, v13

    :goto_b
    iput-object v14, v9, La30/v;->F:Ljava/lang/Object;

    iput-object v8, v9, La30/v;->w:Ljava/lang/Object;

    iput-object v7, v9, La30/v;->x:Ljava/lang/Object;

    iput-object v6, v9, La30/v;->y:Ljava/lang/Object;

    iput-object v5, v9, La30/v;->z:Ljava/lang/Object;

    const/4 v15, 0x3

    iput v15, v9, La30/v;->E:I

    invoke-static {v1, v8, v6, v0, v9}, La30/a0;->c(La30/a0;Lmy/a;Ly00/u1;Lbc3/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_d

    goto/16 :goto_2

    :cond_d
    move-object v2, v14

    move-object v14, v7

    move-object v7, v2

    move-object v2, v6

    move-object v6, v5

    goto/16 :goto_1

    :goto_c
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    new-instance v0, La30/u;

    move-object v4, v2

    move-object v2, v3

    move v3, v5

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, La30/u;-><init>(La30/a0;Lmy/a;ZLy00/u1;Lq83/d;)V

    move/from16 v18, v3

    invoke-static {v7, v13, v0, v15}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v21

    iget-object v0, v4, Ly00/u1;->Q:Ljava/lang/String;

    iget-object v15, v4, Ly00/u1;->z:Ly00/c8;

    invoke-interface {v15}, Ly00/c8;->X()Z

    move-result v3

    const-string v5, "initializationMode"

    move-object/from16 v8, v20

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, v8, La30/o0;

    if-nez v5, :cond_1f

    instance-of v5, v8, La30/p0;

    if-nez v5, :cond_11

    instance-of v5, v8, La30/q0;

    if-eqz v5, :cond_e

    goto :goto_e

    :cond_e
    instance-of v5, v8, La30/r0;

    if-nez v5, :cond_10

    instance-of v5, v8, La30/s0;

    if-eqz v5, :cond_f

    goto :goto_d

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_10
    :goto_d
    sget-object v5, Ly00/m3;->x:Ly00/m3;

    goto :goto_f

    :cond_11
    :goto_e
    sget-object v5, Ly00/m3;->y:Ly00/m3;

    :goto_f
    if-eqz v3, :cond_12

    sget-object v3, Ly00/v5;->x:Ly00/v5;

    :goto_10
    move-object v8, v6

    goto :goto_11

    :cond_12
    sget-object v3, Ly00/v5;->y:Ly00/v5;

    goto :goto_10

    :goto_11
    new-instance v6, Ly00/n;

    const-string v10, "22.6.1"

    invoke-direct {v6, v0, v5, v3, v10}, Ly00/n;-><init>(Ljava/lang/String;Ly00/m3;Ly00/v5;Ljava/lang/String;)V

    iget-object v0, v1, La30/a0;->t:Lt9/p;

    iget-object v3, v4, Ly00/u1;->F:Ljava/util/Map;

    sget-object v5, Ly00/s1;->I:Ly00/s1;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    iget-object v3, v2, Lmy/a;->O:Ljava/util/List;

    goto :goto_12

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Liy/a;->j:Lt83/b;

    :goto_12
    check-cast v3, Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Ljava/util/List;

    const-string v0, "params"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lv00/k0;

    invoke-direct {v10, v3}, Lv00/k0;-><init>(Ljava/util/List;)V

    new-instance v0, La30/s;

    move-object v3, v7

    const/4 v7, 0x0

    move-object v5, v4

    move-object v4, v8

    const/4 v8, 0x0

    move-object/from16 v22, v3

    move-object v3, v2

    move-object v2, v5

    iget-object v5, v9, La30/v;->H:La30/t0;

    move-object/from16 p1, v10

    move-object/from16 v10, v22

    invoke-direct/range {v0 .. v8}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v19, v4

    move-object v4, v2

    move-object/from16 v2, v19

    move-object/from16 v19, v3

    move-object v3, v1

    const/4 v1, 0x3

    invoke-static {v10, v13, v0, v1}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    move v5, v1

    move-object v1, v0

    new-instance v0, La30/t;

    iget-object v8, v9, La30/v;->H:La30/t0;

    const/4 v10, 0x0

    move v7, v5

    move-object v5, v4

    iget-object v4, v9, La30/v;->G:La30/n0;

    move-object/from16 v20, v6

    move-object v6, v2

    move-object v2, v14

    move-object v14, v9

    move-object/from16 v9, v20

    move-object/from16 v20, v12

    move-object/from16 v23, v17

    move v12, v7

    move-object/from16 v17, v11

    move/from16 v7, v18

    move-object/from16 v11, v22

    const/16 v22, 0x0

    move-object/from16 v18, p1

    invoke-direct/range {v0 .. v10}, La30/t;-><init>(Lbc3/j0;Lbc3/i0;La30/a0;La30/n0;Ly00/u1;La30/k;ZLa30/t0;Ly00/n;Lq83/d;)V

    move-object v1, v3

    move-object v8, v5

    move-object v2, v6

    move v9, v7

    invoke-static {v11, v13, v0, v12}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v3

    new-instance v0, La30/q;

    const/4 v7, 0x0

    move-object/from16 v6, v18

    move-object/from16 v5, v19

    move-object/from16 v4, v21

    invoke-direct/range {v0 .. v7}, La30/q;-><init>(La30/a0;La30/k;Lbc3/j0;Lbc3/j0;Lmy/a;Lv00/k0;Lq83/d;)V

    move-object v2, v5

    invoke-static {v11, v13, v0, v12}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    move-object/from16 v19, v2

    move-object v2, v4

    move-object v4, v0

    new-instance v0, La30/r;

    move v5, v9

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v7}, La30/r;-><init>(La30/a0;Lbc3/j0;Lbc3/j0;Lbc3/j0;ZLmy/a;Lq83/d;)V

    move-object v2, v6

    invoke-static {v11, v13, v0, v12}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iput-object v2, v14, La30/v;->F:Ljava/lang/Object;

    iput-object v8, v14, La30/v;->w:Ljava/lang/Object;

    iput-object v4, v14, La30/v;->x:Ljava/lang/Object;

    iput-object v0, v14, La30/v;->y:Ljava/lang/Object;

    iput-object v15, v14, La30/v;->z:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, v14, La30/v;->E:I

    invoke-virtual {v3, v14}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v20

    if-ne v3, v5, :cond_14

    goto :goto_16

    :cond_14
    move-object v6, v4

    move-object v7, v8

    move-object v8, v2

    move-object v2, v0

    move-object v0, v15

    :goto_13
    check-cast v3, Lv00/c0;

    invoke-interface {v0}, Ly00/c8;->g0()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_15

    goto :goto_14

    :cond_15
    invoke-interface {v0}, Ly00/c8;->g0()Ljava/util/List;

    move-result-object v4

    const-string v9, "[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: "

    const-string v10, ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method"

    invoke-static {v9, v10, v4}, Lte0/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    iget-object v9, v1, La30/a0;->f:Lqy/d;

    invoke-virtual {v9, v4}, Lqy/d;->d(Ljava/lang/String;)V

    :goto_14
    invoke-virtual {v3}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1e

    iput-object v7, v14, La30/v;->F:Ljava/lang/Object;

    iput-object v2, v14, La30/v;->w:Ljava/lang/Object;

    iput-object v0, v14, La30/v;->x:Ljava/lang/Object;

    iput-object v3, v14, La30/v;->y:Ljava/lang/Object;

    iput-object v8, v14, La30/v;->z:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v14, La30/v;->E:I

    invoke-interface {v6, v14}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_16

    goto :goto_16

    :cond_16
    move-object v6, v7

    move-object v7, v2

    move-object v2, v8

    move-object v8, v6

    move-object v6, v3

    :goto_15
    move-object v3, v4

    check-cast v3, La30/a;

    iput-object v8, v14, La30/v;->F:Ljava/lang/Object;

    iput-object v0, v14, La30/v;->w:Ljava/lang/Object;

    iput-object v6, v14, La30/v;->x:Ljava/lang/Object;

    iput-object v2, v14, La30/v;->y:Ljava/lang/Object;

    iput-object v3, v14, La30/v;->z:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, v14, La30/v;->E:I

    invoke-interface {v7, v14}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_17

    :goto_16
    return-object v5

    :cond_17
    move-object v7, v3

    goto/16 :goto_0

    :goto_17
    move-object v8, v4

    check-cast v8, Lq20/y;

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {v0}, Lup/d;->L(Ly00/c8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_18

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_18
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-static {v0}, Lse/b;->C(Ljava/lang/Throwable;)La30/e1;

    move-result-object v5

    move-object v9, v5

    goto :goto_19

    :cond_18
    move-object v9, v13

    :goto_19
    new-instance v5, La30/v0;

    invoke-direct/range {v5 .. v10}, La30/v0;-><init>(Lmy/a;La30/a;Lq20/y;La30/e1;Lv00/c0;)V

    iget-object v0, v1, La30/a0;->k:Lhy/c;

    sget-object v1, Ly00/q1;->x:Ly00/q1;

    sget-object v3, Ly00/q1;->y:Ly00/q1;

    sget-object v4, Ly00/q1;->z:Ly00/q1;

    filled-new-array {v1, v3, v4}, [Ly00/q1;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v28

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "elementsSession"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lhy/c;->d:Lq83/j;

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    new-instance v24, Lcz/d;

    const/16 v29, 0x0

    const/16 v30, 0x9

    move-object/from16 v25, v0

    move-object/from16 v26, v2

    move-object/from16 v27, v5

    invoke-direct/range {v24 .. v30}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v0, v24

    const/4 v15, 0x3

    invoke-static {v1, v13, v13, v0, v15}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-object/from16 v1, v23

    iget-boolean v0, v1, La30/u0;->a:Z

    iget-object v1, v2, Ly00/u1;->M:Ljava/lang/Throwable;

    if-eqz v1, :cond_19

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lk20/n;

    invoke-direct {v2, v1}, Lk20/n;-><init>(Ljava/lang/Throwable;)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v2, v13}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    goto :goto_1a

    :cond_19
    move-object/from16 v1, v17

    :goto_1a
    iget-object v2, v10, Lv00/c0;->w:Ly00/c8;

    invoke-interface {v2}, Ly00/c8;->j0()Z

    move-result v2

    if-eqz v2, :cond_1b

    if-eqz v0, :cond_1a

    goto :goto_1b

    :cond_1a
    move/from16 v3, v22

    goto :goto_1c

    :cond_1b
    :goto_1b
    move/from16 v3, v16

    :goto_1c
    if-eqz v9, :cond_1c

    if-eqz v3, :cond_1c

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Lk20/a;->e:Lbz/c;

    sget-object v2, Lbz/b;->w:Lbz/b;

    check-cast v0, Lbz/a;

    invoke-virtual {v0, v2}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v2, Lk20/n;

    const/4 v4, 0x5

    invoke-direct {v2, v0, v9, v4}, Lk20/n;-><init>(Lkotlin/time/Duration;Ljava/lang/Throwable;I)V

    invoke-virtual {v1, v2, v13}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    return-object v5

    :cond_1c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Lk20/a;->e:Lbz/c;

    sget-object v2, Lbz/b;->x:Lbz/b;

    invoke-static {v0, v2}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    sget-object v2, Lbz/b;->w:Lbz/b;

    check-cast v0, Lbz/a;

    invoke-virtual {v0, v2}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    invoke-virtual {v10}, Lv00/c0;->J()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu00/f;

    iget-object v4, v4, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_1d
    new-instance v2, Lk20/o;

    invoke-direct {v2, v8, v3, v0}, Lk20/o;-><init>(Lq20/y;Ljava/util/ArrayList;Lkotlin/time/Duration;)V

    invoke-virtual {v1, v2, v10}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    return-object v5

    :cond_1e
    invoke-interface {v0}, Ly00/c8;->p()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, La30/a1;

    invoke-direct {v1, v0}, La30/a1;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    move-object v14, v9

    new-instance v0, Ll83/j;

    const-string v1, "An operation is not implemented: CheckoutSession attribution not yet supported."

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    move-object v14, v9

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

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
