.class public final Le00/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly00/n;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ly00/d5;

.field public final synthetic z:Le00/w;


# direct methods
.method public constructor <init>(Le00/w;Ljava/lang/String;Ly00/d5;Ljava/lang/String;Ly00/n;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le00/f;->w:I

    .line 1
    iput-object p1, p0, Le00/f;->z:Le00/w;

    iput-object p2, p0, Le00/f;->F:Ljava/lang/String;

    iput-object p3, p0, Le00/f;->y:Ly00/d5;

    iput-object p4, p0, Le00/f;->G:Ljava/lang/String;

    iput-object p5, p0, Le00/f;->E:Ly00/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ly00/d5;Le00/w;Ly00/n;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le00/f;->w:I

    .line 2
    iput-object p1, p0, Le00/f;->y:Ly00/d5;

    iput-object p2, p0, Le00/f;->z:Le00/w;

    iput-object p3, p0, Le00/f;->E:Ly00/n;

    iput-object p4, p0, Le00/f;->F:Ljava/lang/String;

    iput-object p5, p0, Le00/f;->G:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget p1, p0, Le00/f;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Le00/f;

    iget-object v4, p0, Le00/f;->F:Ljava/lang/String;

    iget-object v5, p0, Le00/f;->G:Ljava/lang/String;

    iget-object v1, p0, Le00/f;->y:Ly00/d5;

    iget-object v2, p0, Le00/f;->z:Le00/w;

    iget-object v3, p0, Le00/f;->E:Ly00/n;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Le00/f;-><init>(Ly00/d5;Le00/w;Ly00/n;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0

    :pswitch_0
    move-object v6, p2

    new-instance v1, Le00/f;

    iget-object v5, p0, Le00/f;->G:Ljava/lang/String;

    move-object v7, v6

    iget-object v6, p0, Le00/f;->E:Ly00/n;

    iget-object v2, p0, Le00/f;->z:Le00/w;

    iget-object v3, p0, Le00/f;->F:Ljava/lang/String;

    iget-object v4, p0, Le00/f;->y:Ly00/d5;

    invoke-direct/range {v1 .. v7}, Le00/f;-><init>(Le00/w;Ljava/lang/String;Ly00/d5;Ljava/lang/String;Ly00/n;Lq83/d;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le00/f;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Le00/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Le00/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v5, p0

    iget v0, v5, Le00/f;->w:I

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v7, 0x0

    iget-object v8, v5, Le00/f;->y:Ly00/d5;

    iget-object v9, v5, Le00/f;->z:Le00/w;

    const/4 v2, 0x1

    const-string v10, "cvc"

    const-string v11, "card"

    packed-switch v0, :pswitch_data_0

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v5, Le00/f;->x:I

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v8, Ly00/d5;->Q:Ly00/r3;

    sget-object v1, Lm83/z;->w:Lm83/z;

    if-eqz v0, :cond_2

    const-string v3, "allow_redisplay"

    iget-object v0, v0, Ly00/r3;->w:Ljava/lang/String;

    invoke-static {v3, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    iget-object v3, v8, Ly00/d5;->P:Ly00/v3;

    if-eqz v3, :cond_3

    iget-object v3, v3, Ly00/v3;->z:Ljava/lang/String;

    if-eqz v3, :cond_3

    const-string v1, "billing_phone"

    invoke-static {v1, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    :cond_3
    const-string v3, "payment_method"

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v13, "expand"

    invoke-direct {v4, v13, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, v5, Le00/f;->E:Ly00/n;

    invoke-static {v9, v4}, Le00/w;->a(Le00/w;Ly00/n;)Ljava/util/Map;

    move-result-object v4

    iget-object v13, v9, Le00/w;->d:Lb10/c1;

    invoke-virtual {v8}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v14

    check-cast v14, Ljava/util/LinkedHashMap;

    invoke-virtual {v14, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/util/Map;

    if-eqz v15, :cond_4

    check-cast v14, Ljava/util/Map;

    goto :goto_1

    :cond_4
    move-object v14, v7

    :goto_1
    if-eqz v14, :cond_5

    invoke-interface {v14, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14, v10}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    invoke-static {v11, v14}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v14

    goto :goto_2

    :cond_5
    move-object v14, v7

    :goto_2
    new-instance v15, Ll83/k;

    const-string v6, "payment_method_options"

    invoke-direct {v15, v6, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v6, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v9}, Le00/w;->b()Lyy/f;

    move-result-object v4

    iput v2, v5, Le00/f;->x:I

    move-object v0, v13

    check-cast v0, Lb10/z0;

    iget-object v1, v5, Le00/f;->F:Ljava/lang/String;

    iget-object v2, v5, Le00/f;->G:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lb10/z0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_6

    goto/16 :goto_9

    :cond_6
    :goto_3
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v2, v9, Le00/w;->h:Lb20/f;

    sget-object v3, Lb20/c;->K:Lb20/c;

    sget v4, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v7, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_7
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_f

    check-cast v0, Ly00/o4;

    iget-object v14, v0, Ly00/o4;->w:Ljava/lang/String;

    new-instance v1, Lwz/p0;

    invoke-virtual {v8}, Ly00/d5;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    const-string v2, ""

    :cond_8
    move-object v15, v2

    iget-object v2, v0, Ly00/o4;->F:Ly00/v3;

    if-eqz v2, :cond_9

    iget-object v3, v2, Ly00/v3;->x:Ljava/lang/String;

    move-object/from16 v17, v3

    goto :goto_4

    :cond_9
    move-object/from16 v17, v7

    :goto_4
    if-eqz v2, :cond_c

    invoke-static {v2}, Lug/m;->S(Ly00/v3;)Lh20/i1;

    move-result-object v2

    iget-object v3, v2, Lh20/i1;->w:Lh20/x0;

    if-nez v3, :cond_a

    move-object/from16 v18, v7

    goto :goto_6

    :cond_a
    iget-object v2, v2, Lh20/i1;->y:Ljava/lang/String;

    iget-object v4, v3, Lh20/x0;->y:Ljava/lang/String;

    iget-object v6, v3, Lh20/x0;->z:Ljava/lang/String;

    iget-object v9, v3, Lh20/x0;->w:Ljava/lang/String;

    iget-object v12, v3, Lh20/x0;->F:Ljava/lang/String;

    iget-object v13, v3, Lh20/x0;->E:Ljava/lang/String;

    iget-object v3, v3, Lh20/x0;->x:Ljava/lang/String;

    if-eqz v3, :cond_b

    sget-object v16, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/b;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lcom/stripe/android/core/model/b;->a(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object v3

    move-object/from16 v25, v3

    goto :goto_5

    :cond_b
    move-object/from16 v25, v7

    :goto_5
    new-instance v18, Ly00/y;

    move-object/from16 v19, v2

    move-object/from16 v20, v4

    move-object/from16 v21, v6

    move-object/from16 v23, v9

    move-object/from16 v22, v12

    move-object/from16 v24, v13

    invoke-direct/range {v18 .. v25}, Ly00/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    :goto_6
    move-object/from16 v16, v18

    goto :goto_7

    :cond_c
    move-object/from16 v16, v7

    :goto_7
    new-instance v12, Ly00/b0;

    iget-object v13, v5, Le00/f;->G:Ljava/lang/String;

    invoke-direct/range {v12 .. v17}, Ly00/b0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/y;Ljava/lang/String;)V

    move-object v2, v12

    invoke-virtual {v8}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_d

    check-cast v3, Ljava/util/Map;

    goto :goto_8

    :cond_d
    move-object v3, v7

    :goto_8
    if-eqz v3, :cond_e

    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v10}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v11, v3}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    :cond_e
    move-object v15, v7

    const/16 v16, 0x0

    const/16 v17, 0x28

    iget-object v13, v5, Le00/f;->F:Ljava/lang/String;

    move-object v12, v14

    iget-object v14, v5, Le00/f;->E:Ly00/n;

    invoke-static/range {v12 .. v17}, Lt9/p;->j(Ljava/lang/String;Ljava/lang/String;Ly00/n;Ljava/util/Map;Ly00/r3;I)Ly00/d5;

    move-result-object v3

    invoke-direct {v1, v2, v3, v0}, Lwz/p0;-><init>(Ly00/b0;Ly00/d5;Ly00/o4;)V

    move-object v0, v1

    :cond_f
    new-instance v12, Ll83/n;

    invoke-direct {v12, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_9
    return-object v12

    :pswitch_0
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Le00/f;->x:I

    if-eqz v0, :cond_11

    if-ne v0, v2, :cond_10

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_a

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v9, Le00/w;->e:Lg30/g;

    new-instance v1, Ly00/f0;

    invoke-virtual {v8}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v3

    iget-object v4, v5, Le00/f;->G:Ljava/lang/String;

    check-cast v3, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v3, v4}, Ly00/f0;-><init>(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    iget-object v3, v9, Le00/w;->a:Lb10/d;

    iget-object v3, v3, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {v9}, Le00/w;->b()Lyy/f;

    move-result-object v4

    iput v2, v5, Le00/f;->x:I

    move-object v2, v1

    iget-object v1, v5, Le00/f;->F:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lg30/g;->c(Ljava/lang/String;Ly00/g0;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_12

    goto/16 :goto_e

    :cond_12
    :goto_a
    iget-object v1, v5, Le00/f;->F:Ljava/lang/String;

    iget-object v2, v5, Le00/f;->E:Ly00/n;

    instance-of v3, v0, Ll83/m;

    if-nez v3, :cond_15

    :try_start_0
    check-cast v0, Ly00/d0;

    iget-object v0, v0, Ly00/d0;->w:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/c0;

    invoke-virtual {v8}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_13

    check-cast v3, Ljava/util/Map;

    goto :goto_b

    :cond_13
    move-object v3, v7

    :goto_b
    if-eqz v3, :cond_14

    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v10, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v11, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v3

    move-object/from16 v20, v3

    goto :goto_c

    :cond_14
    move-object/from16 v20, v7

    :goto_c
    invoke-virtual {v0}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v17

    iget-object v3, v8, Ly00/d5;->Q:Ly00/r3;

    const/16 v22, 0x8

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    invoke-static/range {v17 .. v22}, Lt9/p;->j(Ljava/lang/String;Ljava/lang/String;Ly00/n;Ljava/util/Map;Ly00/r3;I)Ly00/d5;

    move-result-object v1

    new-instance v2, Lwz/o0;

    invoke-direct {v2, v0, v1, v8}, Lwz/o0;-><init>(Ly00/c0;Ly00/d5;Ly00/d5;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v2

    goto :goto_d

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_15
    :goto_d
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_16

    iget-object v2, v9, Le00/w;->h:Lb20/f;

    sget-object v3, Lb20/c;->J:Lb20/c;

    sget v4, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v7, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_16
    new-instance v6, Ll83/n;

    invoke-direct {v6, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_e
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
