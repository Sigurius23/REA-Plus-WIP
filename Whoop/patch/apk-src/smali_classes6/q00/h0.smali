.class public final synthetic Lq00/h0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Lq00/h0;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lq00/h0;->w:I

    const-string v3, "cancelled"

    const-string v4, "failed"

    const-string v5, "completed"

    const-string v6, "has_launched"

    const v7, 0x7f141055

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v14, "p0"

    sget-object v15, Ll83/a0;->a:Ll83/a0;

    packed-switch v2, :pswitch_data_0

    check-cast v1, Lq20/y;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ls10/f;

    invoke-virtual {v2, v1}, Ls10/f;->a(Lq20/y;)V

    return-object v15

    :pswitch_0
    check-cast v1, Lh20/l;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lh20/z4;

    invoke-virtual {v2, v1}, Lh20/z4;->f(Lh20/l;)V

    return-object v15

    :pswitch_1
    check-cast v1, Ls2/c;

    iget-object v1, v1, Ls2/c;->a:Landroid/view/KeyEvent;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lu0/h1;

    iget-object v3, v2, Lu0/h1;->f:Lf1/x1;

    iget-boolean v4, v2, Lu0/h1;->d:Z

    invoke-virtual {v1}, Landroid/view/KeyEvent;->getAction()I

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, v2, Lu0/h1;->i:Lu0/d0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v6

    const/high16 v7, -0x80000000

    and-int/2addr v7, v6

    if-eqz v7, :cond_0

    const v7, 0x7fffffff

    and-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v5, Lu0/d0;->a:Ljava/lang/Integer;

    move-object v5, v13

    goto :goto_0

    :cond_0
    iget-object v7, v5, Lu0/d0;->a:Ljava/lang/Integer;

    if-eqz v7, :cond_3

    iput-object v13, v5, Lu0/d0;->a:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5, v6}, Landroid/view/KeyCharacterMap;->getDeadChar(II)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    if-nez v5, :cond_1

    move-object v7, v13

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_0

    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_0
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lq3/a;

    invoke-direct {v6, v5, v11}, Lq3/a;-><init>(Ljava/lang/String;I)V

    goto :goto_1

    :cond_4
    move-object v6, v13

    :goto_1
    if-eqz v6, :cond_6

    if-eqz v4, :cond_5

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lu0/h1;->a(Ljava/util/List;)V

    iput-object v13, v3, Lf1/x1;->a:Ljava/lang/Float;

    goto :goto_3

    :cond_5
    :goto_2
    move v11, v12

    goto :goto_3

    :cond_6
    invoke-static {v1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v5

    if-ne v5, v9, :cond_5

    iget-object v5, v2, Lu0/h1;->j:Lu0/y0;

    invoke-virtual {v5, v1}, Lu0/y0;->b(Landroid/view/KeyEvent;)Lu0/k0;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-boolean v5, v1, Lu0/k0;->w:Z

    if-eqz v5, :cond_7

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance v4, Lkotlin/jvm/internal/b0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-boolean v11, v4, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v5, Ls90/f;

    const/16 v6, 0x10

    invoke-direct {v5, v1, v2, v4, v6}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v1, Lf1/g1;

    iget-object v6, v2, Lu0/h1;->c:Lq3/y;

    iget-object v7, v2, Lu0/h1;->g:Lq3/r;

    iget-object v9, v2, Lu0/h1;->a:Lu0/s0;

    invoke-virtual {v9}, Lu0/s0;->d()Lu0/p1;

    move-result-object v9

    invoke-direct {v1, v6, v7, v9, v3}, Lf1/g1;-><init>(Lq3/y;Lq3/r;Lu0/p1;Lf1/x1;)V

    invoke-virtual {v5, v1}, Ls90/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v9, v1, Lf1/g1;->f:J

    iget-wide v12, v6, Lq3/y;->b:J

    invoke-static {v9, v10, v12, v13}, Ll3/u0;->b(JJ)Z

    move-result v3

    iget-object v5, v1, Lf1/g1;->g:Ll3/g;

    if-eqz v3, :cond_8

    iget-object v3, v6, Lq3/y;->a:Ll3/g;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    iget-object v3, v2, Lu0/h1;->k:Lkotlin/jvm/functions/Function1;

    iget-wide v9, v1, Lf1/g1;->f:J

    invoke-static {v6, v5, v9, v10, v8}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v1

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iget-object v1, v2, Lu0/h1;->h:Lu0/t1;

    if-eqz v1, :cond_a

    iput-boolean v11, v1, Lu0/t1;->e:Z

    :cond_a
    iget-boolean v11, v4, Lkotlin/jvm/internal/b0;->w:Z

    :goto_3
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v1, Lz10/r;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lt20/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v2, Lt20/w;->z:Landroidx/lifecycle/k1;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v8, v9, v6}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v1, Lz10/p;

    if-eqz v6, :cond_b

    move-object v8, v1

    check-cast v8, Lz10/p;

    goto :goto_4

    :cond_b
    move-object v8, v13

    :goto_4
    iget-object v9, v2, Lt20/w;->a0:Lec3/w1;

    new-instance v10, Lt20/s;

    if-eqz v6, :cond_c

    move-object v3, v5

    goto :goto_5

    :cond_c
    instance-of v5, v1, Lz10/q;

    if-eqz v5, :cond_d

    move-object v3, v4

    goto :goto_5

    :cond_d
    instance-of v4, v1, Lz10/o;

    if-eqz v4, :cond_1a

    :goto_5
    if-eqz v8, :cond_e

    iget-object v4, v8, Lz10/p;->w:Lz10/n;

    if-eqz v4, :cond_e

    iget-object v4, v4, Lz10/n;->x:Lz10/m;

    if-eqz v4, :cond_e

    iget-object v4, v4, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_e
    move-object v4, v13

    :goto_6
    if-eqz v8, :cond_f

    iget-object v5, v8, Lz10/p;->w:Lz10/n;

    if-eqz v5, :cond_f

    iget-object v5, v5, Lz10/n;->w:Ly00/c8;

    goto :goto_7

    :cond_f
    move-object v5, v13

    :goto_7
    invoke-direct {v10, v3, v4, v5}, Lt20/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/c8;)V

    invoke-virtual {v9, v10}, Lec3/w1;->a(Ljava/lang/Object;)Z

    if-eqz v6, :cond_17

    check-cast v1, Lz10/p;

    iget-object v1, v1, Lz10/p;->w:Lz10/n;

    iget-object v3, v1, Lz10/n;->w:Ly00/c8;

    if-eqz v3, :cond_10

    invoke-interface {v3}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v13

    :cond_10
    move-object/from16 v20, v13

    iget-object v1, v1, Lz10/n;->x:Lz10/m;

    if-eqz v1, :cond_16

    iget-object v3, v2, Lt20/w;->Y:Lec3/h2;

    iget-object v1, v1, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v4

    instance-of v5, v4, Lcom/stripe/android/financialconnections/model/BankAccount;

    if-eqz v5, :cond_12

    :cond_11
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lt20/g;

    new-instance v16, Lt20/b;

    new-instance v7, Lt20/e;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lt20/e;-><init>(Ljava/lang/String;)V

    move-object v8, v4

    check-cast v8, Lcom/stripe/android/financialconnections/model/BankAccount;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v21

    invoke-static {v2, v11}, Lt20/w;->j(Lt20/w;Z)Lzy/c;

    move-result-object v22

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/BankAccount;->getUsesMicrodeposits()Z

    move-result v23

    const/16 v24, 0x0

    move-object/from16 v17, v7

    invoke-direct/range {v16 .. v24}, Lt20/b;-><init>(Lt20/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/c;ZZ)V

    move-object/from16 v7, v16

    invoke-static {v6, v7}, Ls4/l;->u(Lt20/g;Lt20/b;)Lt20/g;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    goto :goto_8

    :cond_12
    instance-of v5, v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    if-eqz v5, :cond_14

    :cond_13
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lt20/g;

    new-instance v16, Lt20/b;

    new-instance v7, Lt20/e;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lt20/e;-><init>(Ljava/lang/String;)V

    move-object v8, v4

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getInstitutionName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getLast4()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v21

    invoke-static {v2, v12}, Lt20/w;->j(Lt20/w;Z)Lzy/c;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v17, v7

    invoke-direct/range {v16 .. v24}, Lt20/b;-><init>(Lt20/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/c;ZZ)V

    move-object/from16 v7, v16

    invoke-static {v6, v7}, Ls4/l;->u(Lt20/g;Lt20/b;)Lt20/g;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_8

    :cond_14
    if-nez v4, :cond_15

    invoke-static {v7}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lt20/w;->p(Lzy/b;)V

    goto :goto_8

    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_16
    invoke-static {v7}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lt20/w;->p(Lzy/b;)V

    goto :goto_8

    :cond_17
    instance-of v3, v1, Lz10/q;

    if-eqz v3, :cond_18

    invoke-static {v7}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lt20/w;->p(Lzy/b;)V

    goto :goto_8

    :cond_18
    instance-of v1, v1, Lz10/o;

    if-eqz v1, :cond_19

    invoke-virtual {v2, v13}, Lt20/w;->p(Lzy/b;)V

    :goto_8
    return-object v15

    :cond_19
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_3
    check-cast v1, Lz10/j;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lt20/w;

    iget-object v8, v2, Lt20/w;->z:Landroidx/lifecycle/k1;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v8, v9, v6}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v1, Lz10/h;

    if-eqz v6, :cond_1b

    move-object v8, v1

    check-cast v8, Lz10/h;

    goto :goto_9

    :cond_1b
    move-object v8, v13

    :goto_9
    iget-object v9, v2, Lt20/w;->a0:Lec3/w1;

    new-instance v10, Lt20/s;

    if-eqz v6, :cond_1c

    move-object v3, v5

    goto :goto_a

    :cond_1c
    instance-of v5, v1, Lz10/i;

    if-eqz v5, :cond_1d

    move-object v3, v4

    goto :goto_a

    :cond_1d
    instance-of v4, v1, Lz10/g;

    if-eqz v4, :cond_24

    :goto_a
    if-eqz v8, :cond_1e

    iget-object v4, v8, Lz10/h;->w:Ly00/c8;

    goto :goto_b

    :cond_1e
    move-object v4, v13

    :goto_b
    invoke-direct {v10, v3, v13, v4}, Lt20/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/c8;)V

    invoke-virtual {v9, v10}, Lec3/w1;->a(Ljava/lang/Object;)Z

    if-eqz v6, :cond_21

    move-object v3, v1

    check-cast v3, Lz10/h;

    iget-object v4, v2, Lt20/w;->Y:Lec3/h2;

    :cond_1f
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lt20/g;

    new-instance v16, Lt20/b;

    new-instance v6, Lt20/d;

    iget-object v7, v3, Lz10/h;->x:Ly00/o4;

    invoke-direct {v6, v7}, Lt20/d;-><init>(Ly00/o4;)V

    iget-object v7, v3, Lz10/h;->z:Ljava/lang/String;

    iget-object v8, v3, Lz10/h;->y:Ljava/lang/String;

    iget-object v9, v3, Lz10/h;->w:Ly00/c8;

    if-eqz v9, :cond_20

    invoke-interface {v9}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v20, v9

    goto :goto_c

    :cond_20
    move-object/from16 v20, v13

    :goto_c
    invoke-static {v2, v12}, Lt20/w;->j(Lt20/w;Z)Lzy/c;

    move-result-object v22

    const/16 v23, 0x0

    iget-boolean v9, v3, Lz10/h;->E:Z

    const/16 v21, 0x0

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    move/from16 v24, v9

    invoke-direct/range {v16 .. v24}, Lt20/b;-><init>(Lt20/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/c;ZZ)V

    move-object/from16 v6, v16

    invoke-static {v5, v6}, Ls4/l;->u(Lt20/g;Lt20/b;)Lt20/g;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_d

    :cond_21
    instance-of v3, v1, Lz10/i;

    if-eqz v3, :cond_22

    invoke-static {v7}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lt20/w;->p(Lzy/b;)V

    goto :goto_d

    :cond_22
    instance-of v1, v1, Lz10/g;

    if-eqz v1, :cond_23

    invoke-virtual {v2, v13}, Lt20/w;->p(Lzy/b;)V

    :goto_d
    return-object v15

    :cond_23
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_24
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_4
    check-cast v1, Lq20/s;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ld30/a;

    iget-object v3, v2, Ld30/a;->a:Lkotlin/jvm/internal/i;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v2, Ld30/a;->b:La33/d;

    if-nez v1, :cond_25

    goto :goto_e

    :cond_25
    move v11, v12

    :goto_e
    iget-object v1, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    if-eqz v11, :cond_26

    iget-object v2, v2, La33/d;->x:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lq20/c;

    :cond_26
    invoke-virtual {v1, v13}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-object v15

    :pswitch_5
    check-cast v1, Lzy/c;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Le30/c;

    invoke-virtual {v2, v1}, Le30/c;->v(Lzy/c;)V

    return-object v15

    :pswitch_6
    check-cast v1, Lb30/o3;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Le30/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Le30/c;->R:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v13, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v15

    :pswitch_7
    check-cast v1, Lq20/s;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ld30/a;

    iget-object v3, v2, Ld30/a;->a:Lkotlin/jvm/internal/i;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v2, Ld30/a;->b:La33/d;

    if-nez v1, :cond_27

    goto :goto_f

    :cond_27
    move v11, v12

    :goto_f
    iget-object v1, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    if-eqz v11, :cond_28

    iget-object v2, v2, La33/d;->x:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lq20/c;

    :cond_28
    invoke-virtual {v1, v13}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-object v15

    :pswitch_8
    move-object v7, v1

    check-cast v7, Lzy/c;

    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lt10/e;

    iget-object v10, v1, Lt10/e;->f:Lec3/h2;

    :cond_29
    invoke-virtual {v10}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lt10/j;

    const/4 v8, 0x0

    const/16 v9, 0x5f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v2

    invoke-virtual {v10, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    return-object v15

    :pswitch_9
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lt10/e;

    iget-object v3, v2, Lt10/e;->f:Lec3/h2;

    iget-object v4, v2, Lt10/e;->d:Lt10/t;

    iget-object v5, v2, Lt10/e;->h:Lb30/p3;

    invoke-interface {v1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb30/p3;

    iput-object v1, v2, Lt10/e;->h:Lb30/p3;

    if-eqz v1, :cond_2b

    iget-object v2, v1, Lb30/p3;->c:Lc93/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, v4, Lt10/t;->a:Lc93/a;

    :cond_2a
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lt10/j;

    iget-boolean v6, v1, Lb30/p3;->e:Z

    iget-object v5, v1, Lb30/p3;->a:Lzy/c;

    const/4 v10, 0x0

    const/16 v11, 0x7c

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    goto :goto_11

    :cond_2b
    iput-object v13, v4, Lt10/t;->a:Lc93/a;

    :cond_2c
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lt10/j;

    iget-object v4, v2, Lt10/e;->b:Ls10/f;

    iget-object v4, v4, Ls10/f;->b:Lec3/r1;

    iget-object v4, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2d

    move/from16 v18, v11

    goto :goto_10

    :cond_2d
    move/from16 v18, v12

    :goto_10
    iget-object v4, v2, Lt10/e;->a:Lv00/c0;

    iget-object v4, v4, Lv00/c0;->w:Ly00/c8;

    iget-object v5, v2, Lt10/e;->c:Lc10/n;

    invoke-static {v4, v5}, Lt10/e;->a(Ly00/c8;Lc10/n;)Lzy/c;

    move-result-object v17

    const/16 v22, 0x0

    const/16 v23, 0x7c

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    :goto_11
    return-object v15

    :pswitch_a
    check-cast v1, Lt20/u;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lk20/a;

    invoke-virtual {v2, v1}, Lk20/a;->t(Lt20/u;)V

    return-object v15

    :pswitch_b
    check-cast v1, Lq20/y;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ls10/f;

    invoke-virtual {v2, v1}, Ls10/f;->a(Lq20/y;)V

    return-object v15

    :pswitch_c
    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lk20/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lc10/g;

    invoke-direct {v3, v1}, Lc10/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lk20/a;->g(Lx30/s0;)V

    new-instance v3, Lk20/l;

    const/4 v4, 0x6

    invoke-direct {v3, v1, v4}, Lk20/l;-><init>(Ljava/lang/String;I)V

    invoke-static {v2, v3}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-object v15

    :pswitch_d
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lsc3/r;

    invoke-virtual {v2, v1}, Lsc3/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    return-object v1

    :pswitch_e
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lsc3/r;

    invoke-virtual {v2, v1}, Lsc3/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    return-object v1

    :pswitch_f
    throw v13

    :pswitch_10
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lsc3/t;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_11
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lsc3/q;

    invoke-interface {v2, v1}, Lsc3/q;->test(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_12
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lsc3/r;

    iget-object v2, v2, Lsc3/r;->a:Lkotlin/jvm/internal/q;

    invoke-interface {v2, v1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_13
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lsc3/r;

    invoke-virtual {v2, v1}, Lsc3/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrc3/a;

    return-object v1

    :pswitch_14
    check-cast v1, Lcom/stripe/android/core/model/Country;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/view/ShippingInfoWidget;

    sget v3, Lcom/stripe/android/view/ShippingInfoWidget;->T:I

    invoke-virtual {v2, v1}, Lcom/stripe/android/view/ShippingInfoWidget;->c(Lcom/stripe/android/core/model/Country;)V

    return-object v15

    :pswitch_15
    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    if-eqz v1, :cond_31

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getApplicationContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lyy/j;

    sget-object v5, Lbc3/q0;->a:Lkc3/e;

    sget-object v5, Lkc3/d;->w:Lkc3/d;

    invoke-static {v5}, Ls93/k;->c(Ljava/lang/Object;)V

    sget-object v6, Lqy/e;->b:Lqy/d;

    invoke-direct {v4, v6, v5}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v5, Lb10/b;

    new-instance v6, Lal0/f;

    invoke-direct {v6, v3, v11}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v5, v3, v7, v6}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v3, Lb20/c;->x:Lb20/c;

    sget v6, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    and-int/lit8 v7, v8, 0x2

    if-eqz v7, :cond_2e

    move-object v6, v13

    :cond_2e
    and-int v7, v8, v8

    sget-object v8, Lm83/z;->w:Lm83/z;

    if-eqz v7, :cond_2f

    move-object v13, v8

    :cond_2f
    const-string v7, "additionalNonPiiParams"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v6, :cond_30

    goto :goto_12

    :cond_30
    invoke-static {v6}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object v8

    :goto_12
    invoke-static {v8, v13}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v3

    invoke-virtual {v4, v3}, Lyy/j;->a(Lyy/b;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v3

    iget-object v4, v3, Ls40/t0;->y:Lb10/b;

    sget-object v5, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->V:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v9, 0x0

    const/16 v10, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v4

    iget-object v3, v3, Ls40/t0;->x:Lyy/j;

    invoke-virtual {v3, v4}, Lyy/j;->a(Lyy/b;)V

    new-instance v5, Lv10/b;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v3

    invoke-virtual {v3}, Ls40/t0;->g()Lv10/b;

    move-result-object v3

    iget-object v6, v3, Lv10/b;->w:Ljava/lang/String;

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v8

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    invoke-virtual {v1}, Ls40/t0;->g()Lv10/b;

    move-result-object v1

    iget-object v10, v1, Lv10/b;->E:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    invoke-virtual {v1}, Ls40/t0;->g()Lv10/b;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    invoke-virtual {v1}, Ls40/t0;->g()Lv10/b;

    move-result-object v1

    iget-object v12, v1, Lv10/b;->G:Ljava/lang/String;

    const/4 v7, 0x2

    const/4 v9, 0x1

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v12}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ly00/m6;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v5}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    const-string v3, "putExtras(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, -0x1

    invoke-virtual {v2, v3, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_13

    :cond_31
    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    iget-object v3, v1, Ls40/t0;->y:Lb10/b;

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->W:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v3

    iget-object v1, v1, Ls40/t0;->x:Lyy/j;

    invoke-virtual {v1, v3}, Lyy/j;->a(Lyy/b;)V

    :goto_13
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    return-object v15

    :pswitch_16
    check-cast v1, Landroid/content/Intent;

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-object v15

    :pswitch_17
    check-cast v1, Ljz/o;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lq00/p0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    new-instance v4, Ln20/j;

    const/16 v5, 0x12

    invoke-direct {v4, v1, v2, v13, v5}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3, v13, v13, v4, v10}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v15

    :pswitch_18
    move-object v2, v1

    check-cast v2, Ly00/c0;

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lq00/p0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lq00/p0;->M:Lec3/h2;

    :cond_32
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lq00/i0;

    invoke-virtual {v2}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v21

    const/16 v26, 0x0

    const v27, 0xffeffff

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v16 .. v27}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_32

    invoke-static {v3}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v4, Lq00/n0;

    invoke-direct {v4, v2, v3, v13}, Lq00/n0;-><init>(Ly00/c0;Lq00/p0;Lq83/d;)V

    invoke-static {v1, v13, v13, v4, v10}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v15

    :pswitch_19
    check-cast v1, Ly00/c0;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lq00/p0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lq00/p0;->G:Ln40/g;

    sget-object v3, Lwz/b1;->d:Lwz/b1;

    invoke-virtual {v1}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "paymentDetailsId"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Lwz/e1;->a:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "payment_details"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ll83/k;

    const-string v6, "is_billing_update_flow"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v6, "billing_update_cvc"

    invoke-direct {v1, v6, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, Lwz/n1;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ln40/h;->b(Ln40/g;Ljava/lang/String;)V

    return-object v15

    :pswitch_1a
    move-object v2, v1

    check-cast v2, Ly00/c0;

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lq00/p0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lq00/p0;->M:Lec3/h2;

    :cond_33
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lq00/i0;

    invoke-virtual {v2}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v21

    const/16 v26, 0x0

    const v27, 0xffeffff

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v16 .. v27}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    invoke-static {v3}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v4, Lq00/n0;

    invoke-direct {v4, v3, v2, v13}, Lq00/n0;-><init>(Lq00/p0;Ly00/c0;Lq83/d;)V

    invoke-static {v1, v13, v13, v4, v10}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v15

    :pswitch_1b
    move-object/from16 v20, v1

    check-cast v20, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    iget-object v2, v1, Lq00/p0;->M:Lec3/h2;

    :cond_34
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lq00/i0;

    const/16 v26, 0x0

    const v27, 0xfff7fff

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v16 .. v27}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_34

    return-object v15

    :pswitch_1c
    check-cast v1, Ly00/c0;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lq00/p0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lq00/p0;->N:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq00/i0;

    invoke-virtual {v3}, Lq00/i0;->d()Ly00/c0;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    iget-object v3, v2, Lq00/p0;->O:Lg40/f3;

    const-string v4, ""

    invoke-virtual {v3, v4}, Lg40/f3;->s(Ljava/lang/String;)V

    iget-object v3, v2, Lq00/p0;->P:Lx30/e0;

    invoke-virtual {v3, v4}, Lx30/e0;->s(Ljava/lang/String;)V

    :cond_35
    iget-object v2, v2, Lq00/p0;->M:Lec3/h2;

    :cond_36
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Lq00/i0;

    invoke-virtual {v1}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v18

    const/16 v26, 0x0

    const v27, 0xfff7fdf

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v16 .. v27}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_36

    return-object v15

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
