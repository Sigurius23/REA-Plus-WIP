.class public final Lb30/k0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb30/k0;->w:I

    .line 1
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lb30/k0;->z:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Lb30/k0;->w:I

    iput-object p1, p0, Lb30/k0;->z:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb30/k0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lq83/d;

    new-instance v0, Lb30/k0;

    iget-object v1, p0, Lb30/k0;->z:Ljava/lang/Object;

    check-cast v1, Lx30/p0;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p3, v2}, Lb30/k0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/k0;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iput-object p2, v0, Lb30/k0;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p3, Lq83/d;

    new-instance v0, Lb30/k0;

    iget-object v1, p0, Lb30/k0;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/m;

    invoke-direct {v0, v1, p3}, Lb30/k0;-><init>(Lc93/m;Lq83/d;)V

    iput-object p1, v0, Lb30/k0;->x:Ljava/lang/Object;

    iput-object p2, v0, Lb30/k0;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lb30/s;

    check-cast p2, Lb30/k;

    check-cast p3, Lq83/d;

    new-instance v0, Lb30/k0;

    iget-object v1, p0, Lb30/k0;->z:Ljava/lang/Object;

    check-cast v1, Lb30/m0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p3, v2}, Lb30/k0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/k0;->x:Ljava/lang/Object;

    iput-object p2, v0, Lb30/k0;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lb30/k0;->w:I

    iget-object v2, v0, Lb30/k0;->z:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lb30/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Lb30/k0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/b;

    if-eqz v2, :cond_0

    iget-object v2, v2, Ly00/b;->y:Ly00/a;

    iget-object v2, v2, Ly00/a;->x:Ly00/i;

    if-nez v2, :cond_1

    :cond_0
    sget-object v2, Ly00/i;->M:Lt9/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt9/c0;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ly00/i;

    if-nez v2, :cond_1

    sget-object v2, Ly00/i;->X:Ly00/i;

    :cond_1
    return-object v2

    :pswitch_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lb30/k0;->x:Ljava/lang/Object;

    iget-object v3, v0, Lb30/k0;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/m;

    invoke-interface {v2, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_1
    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lb30/k0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/s;

    iget-object v3, v0, Lb30/k0;->y:Ljava/lang/Object;

    check-cast v3, Lb30/k;

    check-cast v2, Lb30/m0;

    iget-object v4, v2, Lb30/m0;->b:Lh20/l1;

    iget-object v5, v4, Lh20/l1;->z:Lh20/j1;

    iget-object v6, v2, Lb30/m0;->a:Lb30/i1;

    iget-object v7, v2, Lb30/m0;->c:Lb30/y;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v7, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v2, v7}, Lb30/m0;->a(Lb30/y;)Lb30/q;

    move-result-object v7

    iget-object v12, v1, Lb30/s;->a:Lb30/q;

    invoke-virtual {v7, v12}, Lb30/q;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    iget-object v7, v6, Lb30/i1;->b:Ljava/lang/Integer;

    iget-object v12, v1, Lb30/s;->b:Lb30/k1;

    invoke-virtual {v12}, Lb30/k1;->b()Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    iget-object v7, v6, Lb30/i1;->c:Ljava/lang/Integer;

    invoke-virtual {v12}, Lb30/k1;->c()Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto/16 :goto_12

    :cond_2
    if-eqz v3, :cond_18

    iget-object v6, v6, Lb30/i1;->g:Ly00/v3;

    iget-object v7, v3, Lb30/k;->a:Lb30/n;

    invoke-virtual {v4}, Lh20/l1;->h()Z

    move-result v12

    if-eqz v12, :cond_4

    if-eqz v6, :cond_3

    iget-object v12, v6, Ly00/v3;->y:Ljava/lang/String;

    goto :goto_0

    :cond_3
    move-object v12, v9

    :goto_0
    iget-object v13, v7, Lb30/n;->a:Ll40/a;

    invoke-static {v12, v13}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v12

    goto :goto_1

    :cond_4
    move v12, v11

    :goto_1
    invoke-virtual {v4}, Lh20/l1;->f()Z

    move-result v13

    if-eqz v13, :cond_6

    if-eqz v6, :cond_5

    iget-object v13, v6, Ly00/v3;->x:Ljava/lang/String;

    goto :goto_2

    :cond_5
    move-object v13, v9

    :goto_2
    iget-object v14, v7, Lb30/n;->b:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    goto :goto_3

    :cond_6
    move v13, v11

    :goto_3
    invoke-virtual {v4}, Lh20/l1;->i()Z

    move-result v14

    if-eqz v14, :cond_8

    if-eqz v6, :cond_7

    iget-object v14, v6, Ly00/v3;->z:Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object v14, v9

    :goto_4
    iget-object v15, v7, Lb30/n;->c:Ll40/a;

    invoke-static {v14, v15}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v14

    goto :goto_5

    :cond_8
    move v14, v11

    :goto_5
    if-nez v12, :cond_a

    if-nez v13, :cond_a

    if-eqz v14, :cond_9

    goto :goto_6

    :cond_9
    move v12, v11

    goto :goto_7

    :cond_a
    :goto_6
    move v12, v10

    :goto_7
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_14

    if-eq v13, v10, :cond_11

    if-ne v13, v8, :cond_13

    if-eqz v6, :cond_b

    iget-object v13, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v13, :cond_b

    iget-object v13, v13, Ly00/c;->E:Ljava/lang/String;

    goto :goto_8

    :cond_b
    move-object v13, v9

    :goto_8
    iget-object v14, v7, Lb30/n;->g:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    if-nez v13, :cond_12

    if-eqz v6, :cond_c

    iget-object v13, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v13, :cond_c

    iget-object v13, v13, Ly00/c;->x:Ljava/lang/String;

    goto :goto_9

    :cond_c
    move-object v13, v9

    :goto_9
    iget-object v14, v7, Lb30/n;->i:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    if-nez v13, :cond_12

    if-eqz v6, :cond_d

    iget-object v13, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v13, :cond_d

    iget-object v13, v13, Ly00/c;->y:Ljava/lang/String;

    goto :goto_a

    :cond_d
    move-object v13, v9

    :goto_a
    iget-object v14, v7, Lb30/n;->d:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    if-nez v13, :cond_12

    if-eqz v6, :cond_e

    iget-object v13, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v13, :cond_e

    iget-object v13, v13, Ly00/c;->z:Ljava/lang/String;

    goto :goto_b

    :cond_e
    move-object v13, v9

    :goto_b
    iget-object v14, v7, Lb30/n;->e:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    if-nez v13, :cond_12

    if-eqz v6, :cond_f

    iget-object v13, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v13, :cond_f

    iget-object v13, v13, Ly00/c;->w:Ljava/lang/String;

    goto :goto_c

    :cond_f
    move-object v13, v9

    :goto_c
    iget-object v14, v7, Lb30/n;->f:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    if-nez v13, :cond_12

    if-eqz v6, :cond_10

    iget-object v6, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v6, :cond_10

    iget-object v6, v6, Ly00/c;->F:Ljava/lang/String;

    goto :goto_d

    :cond_10
    move-object v6, v9

    :goto_d
    iget-object v7, v7, Lb30/n;->h:Ll40/a;

    invoke-static {v6, v7}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_e

    :cond_11
    move v6, v11

    goto :goto_11

    :cond_12
    :goto_e
    move v6, v10

    goto :goto_11

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_14
    if-eqz v6, :cond_15

    iget-object v13, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v13, :cond_15

    iget-object v13, v13, Ly00/c;->E:Ljava/lang/String;

    goto :goto_f

    :cond_15
    move-object v13, v9

    :goto_f
    iget-object v14, v7, Lb30/n;->g:Ll40/a;

    invoke-static {v13, v14}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v13

    if-nez v13, :cond_12

    if-eqz v6, :cond_16

    iget-object v6, v6, Ly00/v3;->w:Ly00/c;

    if-eqz v6, :cond_16

    iget-object v6, v6, Ly00/c;->x:Ljava/lang/String;

    goto :goto_10

    :cond_16
    move-object v6, v9

    :goto_10
    iget-object v7, v7, Lb30/n;->i:Ll40/a;

    invoke-static {v6, v7}, Lb30/k;->a(Ljava/lang/String;Ll40/a;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_e

    :goto_11
    if-nez v12, :cond_17

    if-eqz v6, :cond_18

    :cond_17
    :goto_12
    move v6, v10

    goto :goto_13

    :cond_18
    move v6, v11

    :goto_13
    if-eqz v1, :cond_1a

    iget-object v7, v1, Lb30/s;->b:Lb30/k1;

    iget-boolean v12, v7, Lb30/k1;->b:Z

    if-nez v12, :cond_19

    goto :goto_14

    :cond_19
    invoke-virtual {v7}, Lb30/k1;->b()Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_2c

    invoke-virtual {v7}, Lb30/k1;->c()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_2c

    :cond_1a
    :goto_14
    if-eqz v3, :cond_2b

    iget-object v7, v3, Lb30/k;->a:Lb30/n;

    invoke-virtual {v4}, Lh20/l1;->h()Z

    move-result v12

    if-eqz v12, :cond_1b

    iget-object v12, v7, Lb30/n;->a:Ll40/a;

    if-eqz v12, :cond_1b

    iget-boolean v12, v12, Ll40/a;->b:Z

    goto :goto_15

    :cond_1b
    move v12, v10

    :goto_15
    invoke-virtual {v4}, Lh20/l1;->f()Z

    move-result v13

    if-eqz v13, :cond_1c

    iget-object v13, v7, Lb30/n;->b:Ll40/a;

    if-eqz v13, :cond_1c

    iget-boolean v13, v13, Ll40/a;->b:Z

    goto :goto_16

    :cond_1c
    move v13, v10

    :goto_16
    invoke-virtual {v4}, Lh20/l1;->i()Z

    move-result v4

    if-eqz v4, :cond_1d

    iget-object v4, v7, Lb30/n;->c:Ll40/a;

    if-eqz v4, :cond_1d

    iget-boolean v4, v4, Ll40/a;->b:Z

    goto :goto_17

    :cond_1d
    move v4, v10

    :goto_17
    if-eqz v12, :cond_1e

    if-eqz v13, :cond_1e

    if-eqz v4, :cond_1e

    move v4, v10

    goto :goto_18

    :cond_1e
    move v4, v11

    :goto_18
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_27

    if-eq v5, v10, :cond_24

    if-ne v5, v8, :cond_26

    iget-object v5, v7, Lb30/n;->i:Ll40/a;

    if-eqz v5, :cond_1f

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_19

    :cond_1f
    move v5, v10

    :goto_19
    if-eqz v5, :cond_25

    iget-object v5, v7, Lb30/n;->h:Ll40/a;

    if-eqz v5, :cond_20

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_1a

    :cond_20
    move v5, v10

    :goto_1a
    if-eqz v5, :cond_25

    iget-object v5, v7, Lb30/n;->g:Ll40/a;

    if-eqz v5, :cond_21

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_1b

    :cond_21
    move v5, v10

    :goto_1b
    if-eqz v5, :cond_25

    iget-object v5, v7, Lb30/n;->d:Ll40/a;

    if-eqz v5, :cond_22

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_1c

    :cond_22
    move v5, v10

    :goto_1c
    if-eqz v5, :cond_25

    iget-object v5, v7, Lb30/n;->f:Ll40/a;

    if-eqz v5, :cond_23

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_1d

    :cond_23
    move v5, v10

    :goto_1d
    if-eqz v5, :cond_25

    :cond_24
    :goto_1e
    move v5, v10

    goto :goto_21

    :cond_25
    move v5, v11

    goto :goto_21

    :cond_26
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_27
    iget-object v5, v7, Lb30/n;->i:Ll40/a;

    if-eqz v5, :cond_28

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_1f

    :cond_28
    move v5, v10

    :goto_1f
    if-eqz v5, :cond_25

    iget-object v5, v7, Lb30/n;->g:Ll40/a;

    if-eqz v5, :cond_29

    iget-boolean v5, v5, Ll40/a;->b:Z

    goto :goto_20

    :cond_29
    move v5, v10

    :goto_20
    if-eqz v5, :cond_25

    goto :goto_1e

    :goto_21
    if-eqz v4, :cond_2a

    if-eqz v5, :cond_2a

    move v4, v10

    goto :goto_22

    :cond_2a
    move v4, v11

    :goto_22
    if-nez v4, :cond_2b

    move v4, v10

    goto :goto_23

    :cond_2b
    move v4, v11

    :goto_23
    if-nez v4, :cond_2c

    move v4, v10

    goto :goto_24

    :cond_2c
    move v4, v11

    :goto_24
    if-nez v6, :cond_2d

    iget-boolean v2, v2, Lb30/m0;->d:Z

    if-nez v2, :cond_40

    :cond_2d
    if-eqz v4, :cond_40

    if-eqz v1, :cond_2e

    iget-object v2, v1, Lb30/s;->a:Lb30/q;

    iget-object v2, v2, Lb30/q;->a:Ly00/i;

    goto :goto_25

    :cond_2e
    move-object v2, v9

    :goto_25
    if-eqz v1, :cond_2f

    iget-object v4, v1, Lb30/s;->b:Lb30/k1;

    invoke-virtual {v4}, Lb30/k1;->b()Ljava/lang/Integer;

    move-result-object v4

    goto :goto_26

    :cond_2f
    move-object v4, v9

    :goto_26
    if-eqz v1, :cond_30

    iget-object v1, v1, Lb30/s;->b:Lb30/k1;

    invoke-virtual {v1}, Lb30/k1;->c()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_27

    :cond_30
    move-object v1, v9

    :goto_27
    if-eqz v3, :cond_37

    iget-object v5, v3, Lb30/k;->a:Lb30/n;

    if-eqz v5, :cond_37

    new-instance v12, Ly00/c;

    iget-object v6, v5, Lb30/n;->f:Ll40/a;

    if-eqz v6, :cond_31

    iget-object v6, v6, Ll40/a;->a:Ljava/lang/String;

    move-object v13, v6

    goto :goto_28

    :cond_31
    move-object v13, v9

    :goto_28
    iget-object v6, v5, Lb30/n;->i:Ll40/a;

    if-eqz v6, :cond_32

    iget-object v6, v6, Ll40/a;->a:Ljava/lang/String;

    move-object v14, v6

    goto :goto_29

    :cond_32
    move-object v14, v9

    :goto_29
    iget-object v6, v5, Lb30/n;->d:Ll40/a;

    if-eqz v6, :cond_33

    iget-object v6, v6, Ll40/a;->a:Ljava/lang/String;

    move-object v15, v6

    goto :goto_2a

    :cond_33
    move-object v15, v9

    :goto_2a
    iget-object v6, v5, Lb30/n;->e:Ll40/a;

    if-eqz v6, :cond_34

    iget-object v6, v6, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v16, v6

    goto :goto_2b

    :cond_34
    move-object/from16 v16, v9

    :goto_2b
    iget-object v6, v5, Lb30/n;->g:Ll40/a;

    if-eqz v6, :cond_35

    iget-object v6, v6, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v17, v6

    goto :goto_2c

    :cond_35
    move-object/from16 v17, v9

    :goto_2c
    iget-object v5, v5, Lb30/n;->h:Ll40/a;

    if-eqz v5, :cond_36

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v18, v5

    goto :goto_2d

    :cond_36
    move-object/from16 v18, v9

    :goto_2d
    invoke-direct/range {v12 .. v18}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2e

    :cond_37
    move-object v12, v9

    :goto_2e
    if-eqz v3, :cond_38

    iget-object v5, v3, Lb30/k;->a:Lb30/n;

    if-eqz v5, :cond_38

    iget-object v5, v5, Lb30/n;->b:Ll40/a;

    if-eqz v5, :cond_38

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    goto :goto_2f

    :cond_38
    move-object v5, v9

    :goto_2f
    if-eqz v3, :cond_39

    iget-object v6, v3, Lb30/k;->a:Lb30/n;

    if-eqz v6, :cond_39

    iget-object v6, v6, Lb30/n;->c:Ll40/a;

    if-eqz v6, :cond_39

    iget-object v6, v6, Ll40/a;->a:Ljava/lang/String;

    goto :goto_30

    :cond_39
    move-object v6, v9

    :goto_30
    if-eqz v3, :cond_3a

    iget-object v3, v3, Lb30/k;->a:Lb30/n;

    if-eqz v3, :cond_3a

    iget-object v3, v3, Lb30/n;->a:Ll40/a;

    if-eqz v3, :cond_3a

    iget-object v3, v3, Ll40/a;->a:Ljava/lang/String;

    goto :goto_31

    :cond_3a
    move-object v3, v9

    :goto_31
    filled-new-array {v5, v6, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    instance-of v8, v7, Ljava/util/Collection;

    if-eqz v8, :cond_3b

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_3b

    goto :goto_33

    :cond_3b
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3c
    :goto_32
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_3c

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_3d

    goto :goto_32

    :cond_3d
    move v10, v11

    :cond_3e
    :goto_33
    if-nez v12, :cond_3f

    if-eqz v10, :cond_3f

    goto :goto_34

    :cond_3f
    new-instance v9, Ly00/v3;

    invoke-direct {v9, v12, v5, v3, v6}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_34
    new-instance v3, Lh20/a;

    invoke-direct {v3, v4, v1, v2, v9}, Lh20/a;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ly00/i;Ly00/v3;)V

    move-object v9, v3

    :cond_40
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
