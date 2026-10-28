.class public final Lx30/k0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p5, p0, Lx30/k0;->w:I

    iput-object p1, p0, Lx30/k0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lx30/k0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lx30/k0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, Lx30/k0;->w:I

    iput-object p1, p0, Lx30/k0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lx30/k0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, Lx30/k0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lx30/k0;

    iget-object p1, p0, Lx30/k0;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ly00/b2;

    iget-object p1, p0, Lx30/k0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lz20/l;

    iget-object p1, p0, Lx30/k0;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/Throwable;

    const/4 v6, 0x5

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v6, p2

    new-instance v2, Lx30/k0;

    iget-object p1, p0, Lx30/k0;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lz20/g;

    iget-object p1, p0, Lx30/k0;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lz20/h;

    iget-object p1, p0, Lx30/k0;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ly00/f4;

    const/4 v7, 0x4

    invoke-direct/range {v2 .. v7}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v6, p2

    new-instance p2, Lx30/k0;

    iget-object v0, p0, Lx30/k0;->z:Ljava/lang/Object;

    check-cast v0, Lyy/j;

    iget-object v1, p0, Lx30/k0;->E:Ljava/lang/Object;

    check-cast v1, Lyy/b;

    const/4 v2, 0x3

    invoke-direct {p2, v0, v1, v6, v2}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lx30/k0;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_2
    move-object v6, p2

    new-instance p2, Lx30/k0;

    iget-object v0, p0, Lx30/k0;->z:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lx30/k0;->E:Ljava/lang/Object;

    check-cast v1, Lux/f0;

    const/4 v2, 0x2

    invoke-direct {p2, v0, v1, v6, v2}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lx30/k0;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_3
    move-object v6, p2

    new-instance p2, Lx30/k0;

    iget-object v0, p0, Lx30/k0;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/glance/session/SessionWorker;

    iget-object v1, p0, Lx30/k0;->E:Ljava/lang/Object;

    check-cast v1, Lp6/l;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v6, v2}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lx30/k0;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_4
    move-object v6, p2

    new-instance v2, Lx30/k0;

    iget-object p1, p0, Lx30/k0;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lx30/p0;

    iget-object p1, p0, Lx30/k0;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/c1;

    iget-object p1, p0, Lx30/k0;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, La40/a;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

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

    iget v0, p0, Lx30/k0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lx6/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx30/k0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx30/k0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx30/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 61

    move-object/from16 v1, p0

    iget v0, v1, Lx30/k0;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    iget-object v4, v1, Lx30/k0;->E:Ljava/lang/Object;

    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    iget-object v6, v1, Lx30/k0;->z:Ljava/lang/Object;

    const/4 v7, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast v6, Lz20/l;

    iget-object v0, v6, Lz20/l;->a:Lb10/c1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v8, v1, Lx30/k0;->x:I

    sget-object v32, Lm83/y;->w:Lm83/y;

    const/4 v9, 0x2

    if-eqz v8, :cond_2

    if-eq v8, v7, :cond_1

    if-ne v8, v9, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, Lx30/k0;->y:Ljava/lang/Object;

    check-cast v5, Ly00/b2;

    instance-of v8, v5, Ly00/y1;

    const-string v10, "payment_method"

    if-eqz v8, :cond_3

    check-cast v5, Ly00/y1;

    iget-object v5, v5, Ly00/y1;->w:Ljava/lang/String;

    invoke-virtual {v6}, Lz20/l;->c()Lyy/f;

    move-result-object v6

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    iput v7, v1, Lx30/k0;->x:I

    check-cast v0, Lb10/z0;

    invoke-virtual {v0, v5, v6, v8, v1}, Lb10/z0;->Q(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_6

    goto/16 :goto_7

    :cond_3
    instance-of v7, v5, Ly00/a2;

    if-eqz v7, :cond_4

    check-cast v5, Ly00/a2;

    iget-object v5, v5, Ly00/a2;->w:Ljava/lang/String;

    invoke-virtual {v6}, Lz20/l;->c()Lyy/f;

    move-result-object v6

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    iput v9, v1, Lx30/k0;->x:I

    check-cast v0, Lb10/z0;

    invoke-virtual {v0, v5, v6, v7, v1}, Lb10/z0;->R(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_6

    goto/16 :goto_7

    :cond_4
    instance-of v0, v5, Ly00/w1;

    if-eqz v0, :cond_e

    check-cast v5, Ly00/w1;

    invoke-virtual {v6}, Lz20/l;->c()Lyy/f;

    move-result-object v0

    iget-object v2, v5, Ly00/w1;->x:Ly00/a1;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v20

    iget-object v5, v2, Ly00/a1;->w:Ly00/z0;

    iget-object v15, v2, Ly00/a1;->x:Ljava/util/List;

    instance-of v6, v5, Ly00/w0;

    if-eqz v6, :cond_5

    new-instance v9, Ly00/l3;

    iget-object v10, v2, Ly00/a1;->y:Ljava/lang/String;

    check-cast v5, Ly00/w0;

    iget-wide v6, v5, Ly00/w0;->w:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iget-object v2, v2, Ly00/a1;->w:Ly00/z0;

    invoke-interface {v2}, Ly00/z0;->k0()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v0}, Lyy/f;->f()Z

    move-result v24

    iget-object v0, v5, Ly00/w0;->E:Ljava/lang/String;

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v36

    const v37, 0x6fe8b8

    const-wide/16 v13, 0x0

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v35, v0

    invoke-direct/range {v9 .. v37}, Ly00/l3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;ZI)V

    :goto_1
    move-object v0, v9

    goto :goto_2

    :cond_5
    move-object v11, v15

    instance-of v5, v5, Ly00/y0;

    if-eqz v5, :cond_d

    iget-object v10, v2, Ly00/a1;->y:Ljava/lang/String;

    invoke-virtual {v0}, Lyy/f;->f()Z

    move-result v14

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v19

    new-instance v9, Ly00/g6;

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v32

    move-object v15, v11

    move-wide/from16 v11, v20

    move-object/from16 v17, v32

    invoke-direct/range {v9 .. v19}, Ly00/g6;-><init>(Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;Lcom/stripe/android/model/StripeIntent$Usage;Ljava/util/List;Ljava/util/List;Z)V

    goto :goto_1

    :cond_6
    :goto_2
    move-object/from16 v22, v4

    check-cast v22, Ljava/lang/Throwable;

    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_c

    check-cast v0, Ly00/c8;

    invoke-interface {v0}, Ly00/c8;->p()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    sget-object v7, Ly00/f4;->G:Lt9/c0;

    const-string v7, "wechat_pay"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "card"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_9
    move-object/from16 v35, v4

    check-cast v35, Ljava/util/List;

    instance-of v2, v0, Ly00/l3;

    if-eqz v2, :cond_a

    check-cast v0, Ly00/l3;

    iget-object v2, v0, Ly00/l3;->w:Ljava/lang/String;

    iget-object v3, v0, Ly00/l3;->y:Ljava/lang/Long;

    iget-wide v4, v0, Ly00/l3;->z:J

    iget-object v6, v0, Ly00/l3;->E:Ly00/d3;

    iget-object v7, v0, Ly00/l3;->F:Ly00/e3;

    iget-object v8, v0, Ly00/l3;->G:Ljava/lang/String;

    iget-object v9, v0, Ly00/l3;->H:Ly00/g3;

    iget-object v10, v0, Ly00/l3;->I:Ljava/lang/String;

    iget-wide v11, v0, Ly00/l3;->J:J

    iget-object v13, v0, Ly00/l3;->K:Ljava/lang/String;

    iget-object v14, v0, Ly00/l3;->L:Ljava/lang/String;

    iget-boolean v15, v0, Ly00/l3;->M:Z

    move-object/from16 v34, v2

    iget-object v2, v0, Ly00/l3;->N:Ly00/o4;

    move-object/from16 v49, v2

    iget-object v2, v0, Ly00/l3;->O:Ljava/lang/String;

    move-object/from16 v50, v2

    iget-object v2, v0, Ly00/l3;->P:Ljava/lang/String;

    move-object/from16 v51, v2

    iget-object v2, v0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    move-object/from16 v52, v2

    iget-object v2, v0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    move-object/from16 v53, v2

    iget-object v2, v0, Ly00/l3;->S:Ly00/i3;

    move-object/from16 v54, v2

    iget-object v2, v0, Ly00/l3;->T:Ly00/j3;

    move-object/from16 v55, v2

    iget-object v2, v0, Ly00/l3;->U:Ljava/util/List;

    move-object/from16 v36, v3

    iget-object v3, v0, Ly00/l3;->V:Ljava/util/List;

    move-wide/from16 v37, v4

    iget-object v4, v0, Ly00/l3;->W:Ly00/b8;

    iget-object v5, v0, Ly00/l3;->X:Ljava/lang/String;

    iget-boolean v0, v0, Ly00/l3;->Y:Z

    move/from16 v60, v0

    const-string v0, "captureMethod"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationMethod"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unactivatedPaymentMethods"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkFundingSources"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v33, Ly00/l3;

    move-object/from16 v56, v2

    move-object/from16 v57, v3

    move-object/from16 v58, v4

    move-object/from16 v59, v5

    move-object/from16 v39, v6

    move-object/from16 v40, v7

    move-object/from16 v41, v8

    move-object/from16 v42, v9

    move-object/from16 v43, v10

    move-wide/from16 v44, v11

    move-object/from16 v46, v13

    move-object/from16 v47, v14

    move/from16 v48, v15

    invoke-direct/range {v33 .. v60}, Ly00/l3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    :goto_4
    move-object/from16 v13, v33

    goto :goto_5

    :cond_a
    move-object/from16 v4, v35

    instance-of v2, v0, Ly00/g6;

    if-eqz v2, :cond_b

    check-cast v0, Ly00/g6;

    const v2, 0x3fdff

    invoke-static {v0, v3, v4, v2}, Ly00/g6;->b(Ly00/g6;Ly00/o4;Ljava/util/List;I)Ly00/g6;

    move-result-object v33

    goto :goto_4

    :goto_5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "elementsSessionId"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v13}, Ly00/c8;->p()Ljava/util/List;

    move-result-object v14

    new-instance v9, Ly00/u1;

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v15, Lm83/z;->w:Lm83/z;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v24, v0

    move-object/from16 v23, v32

    invoke-direct/range {v9 .. v28}, Ly00/u1;-><init>(Ly00/t1;Ljava/lang/String;Ljava/lang/String;Ly00/c8;Ljava/util/List;Ljava/util/Map;Ly00/r1;Ly00/p1;Ljava/lang/String;Ljava/lang/String;Ly00/b1;ZLjava/lang/Throwable;Ljava/util/List;Ljava/lang/String;Ly00/c3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v9

    goto :goto_6

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    :goto_6
    new-instance v2, Ll83/n;

    invoke-direct {v2, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_7
    return-object v2

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    check-cast v6, Lz20/h;

    iget-object v0, v1, Lx30/k0;->y:Ljava/lang/Object;

    check-cast v0, Lz20/g;

    iget-object v2, v0, Lz20/g;->d:Lb20/f;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, v1, Lx30/k0;->x:I

    const/4 v10, 0x4

    if-eqz v9, :cond_10

    if-ne v9, v7, :cond_f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    check-cast v4, Ll83/n;

    iget-object v4, v4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_8

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v0, Lz20/g;->a:Lb10/c1;

    iget-object v12, v6, Lz20/h;->a:Ljava/lang/String;

    new-instance v11, Ly00/v2;

    move-object v13, v4

    check-cast v13, Ly00/f4;

    new-instance v14, Ljava/lang/Integer;

    const/16 v4, 0x64

    invoke-direct {v14, v4}, Ljava/lang/Integer;-><init>(I)V

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v16}, Ly00/v2;-><init>(Ljava/lang/String;Ly00/f4;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lz20/g;->f:Ljava/util/Set;

    new-instance v9, Lyy/f;

    iget-object v6, v6, Lz20/h;->b:Ljava/lang/String;

    iget-object v12, v0, Lz20/g;->b:Lk83/a;

    invoke-interface {v12}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lux/y;

    iget-object v12, v12, Lux/y;->x:Ljava/lang/String;

    invoke-direct {v9, v6, v12, v10}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v7, v1, Lx30/k0;->x:I

    check-cast v5, Lb10/z0;

    invoke-virtual {v5, v11, v4, v9, v1}, Lb10/z0;->B(Ly00/v2;Ljava/util/Set;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_11

    goto :goto_9

    :cond_11
    :goto_8
    invoke-static {v4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_12

    iget-object v0, v0, Lz20/g;->c:Lqy/d;

    const-string v6, "Failed to retrieve payment methods."

    invoke-virtual {v0, v6, v5}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lb20/c;->z:Lb20/c;

    sget v6, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v5}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v5

    invoke-static {v2, v0, v5, v3, v10}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_12
    instance-of v0, v4, Ll83/m;

    if-nez v0, :cond_13

    move-object v0, v4

    check-cast v0, Ljava/util/List;

    sget-object v0, Lb20/d;->x:Lb20/d;

    const/4 v5, 0x6

    invoke-static {v2, v0, v3, v3, v5}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_13
    new-instance v8, Ll83/n;

    invoke-direct {v8, v4}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_9
    return-object v8

    :pswitch_1
    check-cast v6, Lyy/j;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lx30/k0;->x:I

    if-eqz v3, :cond_15

    if-ne v3, v7, :cond_14

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v3, p1

    goto :goto_a

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lx30/k0;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    check-cast v4, Lyy/b;

    :try_start_1
    iget-object v3, v6, Lyy/j;->a:Lab/i0;

    iput v7, v1, Lx30/k0;->x:I

    invoke-virtual {v3, v4, v1}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_16

    move-object v2, v0

    goto :goto_d

    :cond_16
    :goto_a
    check-cast v3, Lyy/n0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_c

    :goto_b
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v3

    :goto_c
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_17

    iget-object v3, v6, Lyy/j;->c:Lqy/d;

    const-string v4, "Exception while making analytics request"

    invoke-virtual {v3, v4, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_17
    :goto_d
    return-object v2

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lx30/k0;->x:I

    if-eqz v2, :cond_19

    if-ne v2, v7, :cond_18

    iget-object v0, v1, Lx30/k0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_e

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lx30/k0;->y:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lbc3/c0;

    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v12, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v8, Lcz/d;

    move-object v9, v6

    check-cast v9, Lc93/m;

    move-object v10, v4

    check-cast v10, Lux/f0;

    const/4 v13, 0x0

    const/16 v14, 0x10

    invoke-direct/range {v8 .. v14}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v12, v1, Lx30/k0;->y:Ljava/lang/Object;

    iput v7, v1, Lx30/k0;->x:I

    invoke-static {v8, v1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1a

    goto :goto_f

    :cond_1a
    move-object v0, v12

    :goto_e
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_1b

    invoke-interface {v0, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1b
    move-object v0, v2

    :goto_f
    return-object v0

    :pswitch_3
    move-object v10, v6

    check-cast v10, Landroidx/glance/session/SessionWorker;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lx30/k0;->x:I

    if-eqz v2, :cond_1d

    if-ne v2, v7, :cond_1c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_10

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lx30/k0;->y:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Lx6/u;

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v14, Lx6/p;

    const/4 v15, 0x0

    invoke-direct {v14, v9, v10, v15}, Lx6/p;-><init>(Lx6/u;Landroidx/glance/session/SessionWorker;Lq83/d;)V

    new-instance v8, La00/f;

    move-object v11, v4

    check-cast v11, Lp6/l;

    const/16 v13, 0x8

    move-object v12, v15

    invoke-direct/range {v8 .. v13}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v7, v1, Lx30/k0;->x:I

    new-instance v11, Lp33/m;

    const/16 v16, 0xc

    move-object v12, v2

    move-object v13, v8

    invoke-direct/range {v11 .. v16}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v11, v1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1e

    goto :goto_10

    :cond_1e
    move-object v0, v2

    :goto_10
    return-object v0

    :pswitch_4
    check-cast v6, Lp1/c1;

    iget-object v0, v1, Lx30/k0;->y:Ljava/lang/Object;

    check-cast v0, Lx30/p0;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, v1, Lx30/k0;->x:I

    if-eqz v9, :cond_20

    if-ne v9, v7, :cond_1f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_11

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v0, Lx30/p0;->w:Lec3/r1;

    invoke-static {v5, v7}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v5

    iget-object v9, v0, Lx30/p0;->j:Lec3/r1;

    iget-object v0, v0, Lx30/p0;->y:Lec3/h2;

    new-instance v10, Lx30/i0;

    invoke-direct {v10, v6, v3}, Lx30/i0;-><init>(Lp1/c1;Lq83/d;)V

    invoke-static {v5, v9, v0, v10}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v0

    new-instance v5, Lx30/j0;

    check-cast v4, La40/a;

    invoke-direct {v5, v4, v6, v3}, Lx30/j0;-><init>(La40/a;Lp1/c1;Lq83/d;)V

    iput v7, v1, Lx30/k0;->x:I

    invoke-static {v0, v5, v1}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_21

    move-object v2, v8

    :cond_21
    :goto_11
    return-object v2

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
