.class public final Landroidx/room/y0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Z

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le00/w;Ljava/lang/String;ZLq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/room/y0;->w:I

    .line 1
    iput-object p1, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Landroidx/room/y0;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh20/k4;La30/f1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/room/y0;->w:I

    .line 2
    iput-object p1, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p5, p0, Landroidx/room/y0;->w:I

    iput-object p1, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Landroidx/room/y0;->y:Z

    iput-object p3, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ln00/k;Lq83/d;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Landroidx/room/y0;->w:I

    .line 4
    iput-object p1, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(ZLq00/p0;Ly00/c0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Landroidx/room/y0;->w:I

    .line 5
    iput-boolean p1, p0, Landroidx/room/y0;->y:Z

    iput-object p2, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget p1, p0, Landroidx/room/y0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Landroidx/room/y0;

    iget-boolean v0, p0, Landroidx/room/y0;->y:Z

    iget-object v1, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    iget-object v2, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    check-cast v2, Ly00/c0;

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/room/y0;-><init>(ZLq00/p0;Ly00/c0;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Landroidx/room/y0;

    iget-object v0, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    check-cast v0, Ln00/k;

    invoke-direct {p1, v0, p2}, Landroidx/room/y0;-><init>(Ln00/k;Lq83/d;)V

    return-object p1

    :pswitch_1
    new-instance p1, Landroidx/room/y0;

    iget-object v0, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast v0, Lh20/k4;

    iget-object v1, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    check-cast v1, La30/f1;

    invoke-direct {p1, v0, v1, p2}, Landroidx/room/y0;-><init>(Lh20/k4;La30/f1;Lq83/d;)V

    return-object p1

    :pswitch_2
    new-instance v2, Landroidx/room/y0;

    iget-object p1, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld0/e;

    iget-boolean v4, p0, Landroidx/room/y0;->y:Z

    iget-object p1, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ld0/e2;

    const/4 v7, 0x2

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Landroidx/room/y0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_3
    move-object v6, p2

    new-instance p1, Landroidx/room/y0;

    iget-object p2, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast p2, Le00/w;

    iget-object v0, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-boolean v1, p0, Landroidx/room/y0;->y:Z

    invoke-direct {p1, p2, v0, v1, v6}, Landroidx/room/y0;-><init>(Le00/w;Ljava/lang/String;ZLq83/d;)V

    return-object p1

    :pswitch_4
    move-object v6, p2

    new-instance v3, Landroidx/room/y0;

    iget-object p1, p0, Landroidx/room/y0;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroidx/room/z0;

    iget-boolean v5, p0, Landroidx/room/y0;->y:Z

    iget-object p1, p0, Landroidx/room/y0;->E:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/String;

    const/4 v8, 0x0

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v3 .. v8}, Landroidx/room/y0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/room/y0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Landroidx/room/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Landroidx/room/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Landroidx/room/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Landroidx/room/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Landroidx/room/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Landroidx/room/y0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/y0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v5, p0

    iget v0, v5, Landroidx/room/y0;->w:I

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v3, 0x1

    iget-object v4, v5, Landroidx/room/y0;->E:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Ly00/c0;

    iget-object v0, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast v0, Lq00/p0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v6, v5, Landroidx/room/y0;->x:I

    if-eqz v6, :cond_2

    if-eq v6, v3, :cond_1

    if-ne v6, v7, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v2, v5, Landroidx/room/y0;->y:Z

    if-eqz v2, :cond_3

    iput v3, v5, Landroidx/room/y0;->x:I

    invoke-static {v0, v4, v5}, Lq00/p0;->g(Lq00/p0;Ly00/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_3
    iput v7, v5, Landroidx/room/y0;->x:I

    invoke-virtual {v0, v4, v5}, Lq00/p0;->q(Ly00/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    :goto_1
    move-object v8, v1

    :cond_4
    :goto_2
    return-object v8

    :pswitch_0
    move-object v9, v4

    check-cast v9, Ln00/k;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v0, v5, Landroidx/room/y0;->x:I

    if-eqz v0, :cond_7

    if-eq v0, v3, :cond_6

    if-ne v0, v7, :cond_5

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iget-boolean v1, v5, Landroidx/room/y0;->y:Z

    iget-object v0, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lwz/m1;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget v0, Ln00/k;->R:I

    iget-object v0, v9, Ln00/k;->N:Lec3/h2;

    :cond_8
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ln00/c;

    const/16 v16, 0x0

    const/16 v17, 0xdf

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, v9, Ln00/k;->K:Lg40/f3;

    iget-object v0, v0, Lg40/f3;->n:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v11, v9, Ln00/k;->E:Lwz/m1;

    iget-boolean v12, v11, Lwz/m1;->a:Z

    iput-boolean v1, v11, Lwz/m1;->a:Z

    move-object v1, v0

    :try_start_1
    iget-object v0, v9, Ln00/k;->z:Lxz/x;

    sget-object v2, Ly00/c2;->x:Ly00/c2;

    iget-object v4, v9, Ln00/k;->w:Lwz/g0;

    invoke-virtual {v4}, Lwz/g0;->b()Ljava/lang/String;

    move-result-object v4

    iput-object v11, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    iput-boolean v12, v5, Landroidx/room/y0;->y:Z

    iput v3, v5, Landroidx/room/y0;->x:I

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Lxz/x;->k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v10, :cond_9

    goto :goto_4

    :cond_9
    move-object v2, v11

    move v1, v12

    :goto_3
    iput-boolean v1, v2, Lwz/m1;->a:Z

    invoke-static {v0}, Ls30/b;->w(Ljava/lang/Object;)Lxz/m0;

    move-result-object v0

    new-instance v1, La6/e;

    const/16 v2, 0x8

    invoke-direct {v1, v9, v6, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v6, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    iput v7, v5, Landroidx/room/y0;->x:I

    sget v2, Ln00/k;->R:I

    invoke-virtual {v9, v0, v1, v5}, Ln00/k;->l(Lxz/m0;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_a

    :goto_4
    move-object v8, v10

    :cond_a
    :goto_5
    return-object v8

    :catchall_1
    move-exception v0

    move-object v2, v11

    move v1, v12

    :goto_6
    iput-boolean v1, v2, Lwz/m1;->a:Z

    throw v0

    :pswitch_1
    check-cast v4, La30/f1;

    iget-object v0, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast v0, Lh20/k4;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v9, v5, Landroidx/room/y0;->x:I

    if-eqz v9, :cond_d

    if-eq v9, v3, :cond_c

    if-ne v9, v7, :cond_b

    iget-boolean v1, v5, Landroidx/room/y0;->y:Z

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_e

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_b

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Le30/c;->E:Lh20/x;

    iget-object v9, v4, La30/f1;->E:Lv00/c0;

    iget-object v9, v9, Lv00/c0;->l0:La30/l0;

    iput v3, v5, Landroidx/room/y0;->x:I

    invoke-virtual {v2, v9}, Lh20/x;->c(La30/l0;)V

    if-eqz v9, :cond_14

    iget-object v10, v9, La30/l0;->w:Lwz/g0;

    if-nez v10, :cond_e

    goto :goto_9

    :cond_e
    iget-object v11, v2, Lh20/x;->a:Lwz/l1;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11, v10}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object v11

    invoke-virtual {v11}, Ln20/e;->b()Lb00/a;

    move-result-object v11

    invoke-virtual {v11}, Lb00/a;->b()Z

    move-result v12

    if-eqz v12, :cond_13

    iget-boolean v11, v11, Lb00/a;->c:Z

    if-eqz v11, :cond_f

    goto :goto_8

    :cond_f
    iget-object v9, v9, La30/l0;->x:La30/k0;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eqz v9, :cond_12

    if-eq v9, v3, :cond_12

    if-eq v9, v7, :cond_11

    const/4 v2, 0x3

    if-ne v9, v2, :cond_10

    goto :goto_7

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_11
    :goto_7
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_12
    invoke-virtual {v2, v10, v5}, Lh20/x;->a(Lwz/g0;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_a

    :cond_13
    :goto_8
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_14
    :goto_9
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_a
    if-ne v2, v1, :cond_15

    goto :goto_d

    :cond_15
    :goto_b
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_16

    new-instance v3, Lq20/m;

    sget-object v9, Lwz/h0;->y:Lwz/h0;

    const/4 v10, 0x6

    invoke-direct {v3, v9, v6, v6, v10}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;I)V

    sget-object v9, Lh20/f4;->w:Lh20/f4;

    invoke-virtual {v0, v3, v9}, Lh20/k4;->C(Lq20/y;Lh20/f4;)V

    :cond_16
    iget-object v3, v0, Le30/c;->Z:Lh20/f;

    iget-object v9, v4, La30/f1;->x:La30/a;

    invoke-virtual {v3, v9}, Lh20/f;->a(La30/a;)V

    iget-object v3, v4, La30/f1;->y:Lq20/y;

    instance-of v9, v3, Lq20/j;

    if-nez v9, :cond_18

    instance-of v9, v3, Lq20/m;

    if-eqz v9, :cond_17

    goto :goto_c

    :cond_17
    invoke-virtual {v0, v3}, Le30/c;->z(Lq20/y;)V

    :cond_18
    :goto_c
    iget-object v3, v4, La30/f1;->E:Lv00/c0;

    iget-object v9, v0, Le30/c;->K:Lec3/h2;

    invoke-virtual {v9, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v3, v0, Lh20/k4;->s0:Le10/r0;

    iput-boolean v2, v5, Landroidx/room/y0;->y:Z

    iput v7, v5, Landroidx/room/y0;->x:I

    invoke-virtual {v3, v5}, Le10/r0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_19

    :goto_d
    move-object v8, v1

    goto :goto_10

    :cond_19
    move v1, v2

    :goto_e
    instance-of v2, v3, Le10/v;

    if-eqz v2, :cond_1a

    check-cast v3, Le10/v;

    goto :goto_f

    :cond_1a
    move-object v3, v6

    :goto_f
    if-eqz v3, :cond_1b

    iget-object v2, v3, Le10/v;->a:Ljava/lang/Throwable;

    if-eqz v2, :cond_1b

    invoke-static {v2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v6

    :cond_1b
    if-nez v1, :cond_1c

    iget-object v1, v4, La30/f1;->E:Lv00/c0;

    invoke-virtual {v0, v1, v6}, Lh20/k4;->F(Lv00/c0;Lzy/c;)V

    :cond_1c
    :goto_10
    return-object v8

    :pswitch_2
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Landroidx/room/y0;->x:I

    if-eqz v0, :cond_1e

    if-ne v0, v3, :cond_1d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    iget-boolean v1, v5, Landroidx/room/y0;->y:Z

    if-eqz v1, :cond_1f

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_11

    :cond_1f
    const v1, 0x3f4ccccd    # 0.8f

    :goto_11
    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    check-cast v4, Ld0/e2;

    iput v3, v5, Landroidx/room/y0;->x:I

    const/4 v3, 0x0

    const/16 v5, 0xc

    move-object v1, v2

    move-object v2, v4

    move-object/from16 v4, p0

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v4

    if-ne v0, v6, :cond_20

    move-object v8, v6

    :cond_20
    :goto_12
    return-object v8

    :pswitch_3
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Landroidx/room/y0;->x:I

    if-eqz v0, :cond_22

    if-ne v0, v3, :cond_21

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_13

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    check-cast v0, Le00/w;

    iget-object v1, v0, Le00/w;->e:Lg30/g;

    check-cast v4, Ljava/lang/String;

    iget-boolean v2, v5, Landroidx/room/y0;->y:Z

    iget-object v7, v0, Le00/w;->a:Lb10/d;

    iget-object v7, v7, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {v0}, Le00/w;->b()Lyy/f;

    move-result-object v0

    iput v3, v5, Landroidx/room/y0;->x:I

    move-object v3, v4

    move-object v4, v0

    move-object v0, v1

    move-object v1, v3

    move-object v3, v7

    invoke-virtual/range {v0 .. v5}, Lg30/g;->g(Ljava/lang/String;ZLjava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_23

    goto :goto_14

    :cond_23
    :goto_13
    new-instance v6, Ll83/n;

    invoke-direct {v6, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_14
    return-object v6

    :pswitch_4
    iget-object v0, v5, Landroidx/room/y0;->z:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Landroidx/room/z0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, v5, Landroidx/room/y0;->x:I

    if-eqz v6, :cond_25

    if-ne v6, v3, :cond_24

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_15

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {v10}, Landroidx/room/z0;->access$getConnectionManager$p(Landroidx/room/z0;)Landroidx/room/n0;

    move-result-object v2

    const/4 v13, 0x0

    if-eqz v2, :cond_27

    new-instance v9, La30/u;

    iget-boolean v11, v5, Landroidx/room/y0;->y:Z

    move-object v12, v4

    check-cast v12, [Ljava/lang/String;

    const/4 v14, 0x1

    invoke-direct/range {v9 .. v14}, La30/u;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    iput v3, v5, Landroidx/room/y0;->x:I

    iget-object v2, v2, Landroidx/room/n0;->f:Llb/b;

    invoke-interface {v2, v1, v9, v5}, Llb/b;->A0(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_26

    move-object v8, v0

    :cond_26
    :goto_15
    return-object v8

    :cond_27
    const-string v0, "connectionManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v13

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
