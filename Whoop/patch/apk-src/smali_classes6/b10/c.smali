.class public final Lb10/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb10/c;->w:I

    iput-object p1, p0, Lb10/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lv03/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Lb10/c;->w:I

    iput-object p2, p0, Lb10/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 43

    move-object/from16 v0, p0

    iget v1, v0, Lb10/c;->w:I

    const-string v2, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    const-string v3, "key_account_id"

    const-string v4, "key_publishable_key"

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lc20/g;

    invoke-virtual {v1}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    sget-object v5, Lux/y;->y:Lux/y;

    if-nez v5, :cond_2

    new-instance v5, Lux/x;

    invoke-direct {v5, v1}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v1, v5, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v5, Lux/y;

    invoke-interface {v1, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v4, v1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v5

    :cond_0
    if-eqz v7, :cond_1

    sput-object v7, Lux/y;->y:Lux/y;

    move-object v5, v7

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    return-object v5

    :pswitch_0
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lt9/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lb5/g;->b:Lb5/g;

    invoke-static {}, Landroid/os/LocaleList;->getAdjustedDefault()Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v1}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object v1

    invoke-virtual {v1}, Lb5/g;->c()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v7

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1, v6}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object v7

    :cond_4
    return-object v7

    :pswitch_1
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lc20/g;

    invoke-virtual {v1}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    sget-object v5, Lux/y;->y:Lux/y;

    if-nez v5, :cond_7

    new-instance v5, Lux/x;

    invoke-direct {v5, v1}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v1, v5, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    new-instance v5, Lux/y;

    invoke-interface {v1, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v4, v1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v5

    :cond_5
    if-eqz v7, :cond_6

    sput-object v7, Lux/y;->y:Lux/y;

    move-object v5, v7

    goto :goto_2

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_2
    return-object v5

    :pswitch_2
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lc20/o;

    invoke-virtual {v1}, Lc20/o;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lu10/u;

    new-instance v1, Lh20/z4;

    iget-object v2, v10, Lu10/u;->f:Lv00/c0;

    invoke-static {v2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v2

    iget-object v3, v10, Lu10/u;->a:Lk20/a;

    iget-object v4, v10, Lu10/u;->i:Lbc3/c0;

    iget-object v5, v10, Lu10/u;->g:Lq83/j;

    iget-object v6, v10, Lu10/u;->h:Lq83/j;

    iget-object v8, v10, Lu10/u;->b:Lz20/g;

    iget-object v9, v10, Lu10/u;->c:Ls10/f;

    iget-object v9, v9, Ls10/f;->b:Lec3/r1;

    new-instance v19, Lq00/h0;

    iget-object v13, v10, Lu10/u;->c:Ls10/f;

    const/16 v17, 0x0

    const/16 v18, 0x1d

    const/4 v12, 0x1

    const-class v14, Ls10/f;

    const-string v15, "set"

    const-string v16, "set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V"

    move-object/from16 v11, v19

    invoke-direct/range {v11 .. v18}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object v11, v10, Lu10/u;->d:Lh20/f;

    new-instance v12, La6/e;

    const/16 v13, 0x10

    invoke-direct {v12, v10, v7, v13}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v22, Lp00/j;

    const/4 v14, 0x0

    const/16 v15, 0x15

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v20, v11

    const-class v11, Lu10/u;

    move-object/from16 v21, v12

    const-string v12, "onPaymentMethodRemoved"

    const-string v13, "onPaymentMethodRemoved()V"

    move-object/from16 v17, v8

    move-object/from16 v8, v22

    invoke-direct/range {v8 .. v15}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v7, Lb30/t0;

    const/4 v8, 0x4

    invoke-direct {v7, v10, v8}, Lb30/t0;-><init>(Ljava/lang/Object;I)V

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v24

    const/16 v25, 0x0

    move-object v11, v1

    move-object v12, v2

    move-object v13, v3

    move-object v14, v4

    move-object v15, v5

    move-object/from16 v16, v6

    move-object/from16 v23, v7

    invoke-direct/range {v11 .. v25}, Lh20/z4;-><init>(Lec3/f2;Lk20/a;Lbc3/c0;Lq83/j;Lq83/j;Lz20/g;Lec3/r1;Lkotlin/jvm/functions/Function1;Lh20/f;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/o;Lec3/f2;Z)V

    return-object v11

    :pswitch_3
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lb10/a1;

    invoke-virtual {v1}, Lb10/a1;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld30/f0;

    iget-object v2, v1, Ld30/f0;->d:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    iget-object v2, v1, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v2, Ls10/e;

    iget-object v3, v1, Ld30/f0;->g:Ljava/lang/Object;

    move-object v11, v3

    check-cast v11, Lbc3/c0;

    iget-object v3, v1, Ld30/f0;->c:Ljava/lang/Object;

    move-object v13, v3

    check-cast v13, Lv00/c0;

    iget-object v3, v1, Ld30/f0;->b:Ljava/lang/Object;

    check-cast v3, Lk20/a;

    iget-boolean v4, v1, Ld30/f0;->a:Z

    xor-int/lit8 v18, v4, 0x1

    new-instance v8, Lt10/f;

    invoke-direct {v8, v1, v6}, Lt10/f;-><init>(Ld30/f0;I)V

    new-instance v10, Lt10/f;

    const/4 v12, 0x1

    invoke-direct {v10, v1, v12}, Lt10/f;-><init>(Ld30/f0;I)V

    new-instance v14, Lt10/f;

    invoke-direct {v14, v1, v5}, Lt10/f;-><init>(Ld30/f0;I)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "coroutineScope"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "paymentMethodMetadata"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v13, Lv00/c0;->V:Lq20/c;

    iget-object v15, v13, Lv00/c0;->w:Ly00/c8;

    move/from16 v16, v12

    const-string v12, "eventReporter"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v2, Ls10/e;->e:Ljava/lang/String;

    invoke-static {v12}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_b

    iget-object v6, v2, Ls10/e;->b:Ls10/f;

    iget-object v6, v6, Ls10/f;->b:Lec3/r1;

    iget-object v6, v6, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lq20/t;

    if-eqz v7, :cond_8

    check-cast v6, Lq20/t;

    goto :goto_3

    :cond_8
    const/4 v6, 0x0

    :goto_3
    sget-object v7, Ly00/f4;->G:Lt9/c0;

    const-string v7, "card"

    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lq20/t;->i()Ly00/d5;

    move-result-object v6

    goto :goto_4

    :cond_9
    const/4 v6, 0x0

    :goto_4
    if-nez v6, :cond_a

    move/from16 v6, v16

    goto :goto_5

    :cond_a
    const/4 v6, 0x0

    :goto_5
    xor-int/lit8 v6, v6, 0x1

    iget-object v7, v2, Ls10/e;->d:Landroidx/lifecycle/k1;

    iget-boolean v12, v13, Lv00/c0;->c0:Z

    move-object/from16 v19, v3

    new-instance v3, Lb5/d;

    invoke-direct {v3, v6, v12, v7}, Lb5/d;-><init>(ZZLandroidx/lifecycle/k1;)V

    move-object/from16 v23, v3

    goto :goto_6

    :cond_b
    move-object/from16 v19, v3

    const/16 v23, 0x0

    :goto_6
    iget-object v12, v2, Ls10/e;->f:Lny/d;

    move-object v3, v14

    new-instance v14, Lrq0/x;

    const/4 v6, 0x7

    invoke-direct {v14, v10, v6}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    move-object v7, v15

    new-instance v15, Lrq0/x;

    const/16 v10, 0x8

    invoke-direct {v15, v8, v10}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    const-string v8, "tapToAddCollectionHandler"

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v8, v13, Lv00/c0;->k0:Z

    if-eqz v8, :cond_c

    move v8, v10

    new-instance v10, Lb30/m;

    move/from16 v42, v16

    move-object/from16 v16, v3

    move/from16 v3, v42

    invoke-direct/range {v10 .. v15}, Lb30/m;-><init>(Lbc3/c0;Lny/d;Lv00/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v24, v10

    goto :goto_7

    :cond_c
    move/from16 v8, v16

    move-object/from16 v16, v3

    move v3, v8

    move v8, v10

    const/16 v24, 0x0

    :goto_7
    new-instance v10, Lh20/g;

    new-instance v12, Lh20/y;

    invoke-direct {v12}, Lh20/y;-><init>()V

    move-object v14, v13

    iget-object v13, v2, Ls10/e;->c:Lzx/o;

    new-instance v15, Lq80/h;

    const/16 v3, 0x17

    invoke-direct {v15, v2, v3}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    iget-object v3, v2, Ls10/e;->a:Lwz/l1;

    iget-object v2, v2, Ls10/e;->d:Landroidx/lifecycle/k1;

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v20, v2

    move-object/from16 v17, v3

    invoke-direct/range {v10 .. v24}, Lh20/g;-><init>(Lbc3/c0;Lh20/y;Lzx/o;Lv00/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Lwz/l1;ZLk20/a;Landroidx/lifecycle/k1;Lg40/z;ZLb5/d;Lb30/m;)V

    move-object v13, v14

    new-instance v26, Lq00/h0;

    iget-object v2, v1, Ld30/f0;->e:Ljava/lang/Object;

    move-object/from16 v28, v2

    check-cast v28, Ls10/f;

    const/16 v32, 0x0

    const/16 v33, 0x11

    const/16 v27, 0x1

    const-class v29, Ls10/f;

    const-string v30, "set"

    const-string v31, "set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V"

    invoke-direct/range {v26 .. v33}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v2, v26

    new-instance v26, Lq00/h0;

    iget-object v3, v1, Ld30/f0;->b:Ljava/lang/Object;

    move-object/from16 v28, v3

    check-cast v28, Lk20/a;

    const/16 v33, 0x12

    const-class v29, Lk20/a;

    const-string v30, "onUsBankAccountFormEvent"

    const-string v31, "onUsBankAccountFormEvent(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)V"

    invoke-direct/range {v26 .. v33}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v31, Lq00/h0;

    iget-object v3, v1, Ld30/f0;->h:Ljava/lang/Object;

    move-object/from16 v29, v3

    check-cast v29, Lt10/e;

    const/16 v33, 0x0

    const/16 v34, 0x13

    const/16 v28, 0x1

    const-class v30, Lt10/e;

    move-object/from16 v27, v31

    const-string v31, "updatePrimaryButton"

    const-string v32, "updatePrimaryButton(Lkotlin/jvm/functions/Function1;)V"

    invoke-direct/range {v27 .. v34}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v33, Lq00/h0;

    iget-object v3, v1, Ld30/f0;->h:Ljava/lang/Object;

    move-object/from16 v30, v3

    check-cast v30, Lt10/e;

    const/16 v34, 0x0

    const/16 v35, 0x14

    const/16 v29, 0x1

    const-class v31, Lt10/e;

    const-string v32, "updateError"

    move-object/from16 v28, v33

    const-string v33, "updateError(Lcom/stripe/android/core/strings/ResolvableString;)V"

    invoke-direct/range {v28 .. v35}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v3, Lr12/a;

    const/16 v11, 0x1a

    invoke-direct {v3, v1, v11}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    new-instance v11, Lsc0/c;

    const/4 v12, 0x5

    invoke-direct {v11, v1, v12}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    const-string v14, "selectedPaymentMethodCode"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v14, v13, Lv00/c0;->S:Lv00/i0;

    iget-object v15, v13, Lv00/c0;->P:Lv00/p;

    if-eqz v15, :cond_d

    const/4 v6, 0x1

    goto :goto_8

    :cond_d
    const/4 v6, 0x0

    :goto_8
    invoke-static {v9, v14, v7, v6}, Ls4/b;->q(Ljava/lang/String;Lv00/i0;Ly00/c8;Z)Z

    move-result v6

    sget-object v14, Ly00/f4;->G:Lt9/c0;

    const-string v14, "link"

    invoke-virtual {v9, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    new-instance v12, Ld30/a;

    new-instance v8, La33/d;

    invoke-direct {v8, v5}, La33/d;-><init>(Lq20/c;)V

    invoke-direct {v12, v2, v8}, Ld30/a;-><init>(Lkotlin/jvm/functions/Function1;La33/d;)V

    if-eqz v6, :cond_e

    if-nez v14, :cond_e

    const/16 v19, 0x1

    goto :goto_9

    :cond_e
    const/16 v19, 0x0

    :goto_9
    iget-object v2, v13, Lv00/c0;->T:Ly00/p2;

    iget-object v6, v13, Lv00/c0;->g0:Ljava/lang/String;

    instance-of v8, v7, Ly00/l3;

    invoke-interface {v7}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v22

    invoke-interface {v7}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v17, v2

    iget-object v2, v13, Lv00/c0;->L:Li20/b;

    new-instance v29, Lq00/h0;

    const/16 v35, 0x0

    const/16 v36, 0x18

    const/16 v30, 0x1

    const-class v32, Ld30/a;

    const-string v33, "handleLinkedBankAccountChanged"

    const-string v34, "handleLinkedBankAccountChanged(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V"

    move-object/from16 v31, v12

    invoke-direct/range {v29 .. v36}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object v12, v13, Lv00/c0;->V:Lq20/c;

    if-eqz v15, :cond_f

    iget-boolean v15, v15, Lv00/p;->z:Z

    move/from16 v35, v15

    goto :goto_a

    :cond_f
    const/16 v35, 0x0

    :goto_a
    iget-object v15, v13, Lv00/c0;->W:Lf20/b;

    move-object/from16 v25, v2

    sget-object v2, Ly00/f4;->l0:Ly00/f4;

    move-object/from16 v20, v3

    iget-object v3, v13, Lv00/c0;->Z:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh20/i3;

    if-nez v2, :cond_10

    sget-object v2, Lh20/i3;->w:Lh20/i3;

    :cond_10
    move-object/from16 v38, v2

    iget-object v2, v13, Lv00/c0;->J:Ljava/lang/String;

    iget-boolean v3, v13, Lv00/c0;->a0:Z

    move-object/from16 v39, v2

    iget-object v2, v13, Lv00/c0;->d0:Ly00/n;

    move-object/from16 v36, v15

    move v15, v14

    new-instance v14, Lt20/n;

    move-object/from16 v41, v2

    new-instance v2, Lsz0/k;

    move/from16 v40, v3

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lsz0/k;-><init>(I)V

    move-object/from16 v30, v29

    move-object/from16 v29, v20

    const/16 v20, 0x0

    const-string v24, "payment_element"

    move-object/from16 v33, v28

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x0

    move-object/from16 v32, v2

    move/from16 v21, v8

    move-object/from16 v34, v11

    move-object/from16 v16, v12

    move/from16 v37, v18

    move-object/from16 v18, v6

    invoke-direct/range {v14 .. v41}, Lt20/n;-><init>(ZLq20/c;Ly00/p2;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Li20/b;Lq20/y;Lg40/z;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLf20/b;ZLh20/i3;Ljava/lang/String;ZLy00/n;)V

    invoke-virtual {v10, v9}, Lh20/g;->c(Ljava/lang/String;)Lh20/v;

    move-result-object v2

    invoke-virtual {v10, v9}, Lh20/g;->a(Ljava/lang/String;)Ls20/a;

    move-result-object v3

    instance-of v2, v2, Lh20/u;

    if-eqz v2, :cond_12

    iget-object v2, v1, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v2, Ls10/f;

    invoke-virtual {v3}, Ls20/a;->a()Lo20/b;

    move-result-object v6

    invoke-virtual {v13, v9}, Lv00/c0;->R(Ljava/lang/String;)Lu00/f;

    move-result-object v8

    if-eqz v8, :cond_11

    const/4 v11, 0x0

    invoke-static {v6, v8, v13, v11, v11}, Lse/a;->j0(Lo20/b;Lu00/f;Lv00/c0;Ly00/o4;Lj00/k;)Lq20/y;

    move-result-object v6

    invoke-virtual {v2, v6}, Ls10/f;->a(Lq20/y;)V

    goto :goto_b

    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    :goto_b
    invoke-virtual {v10, v9}, Lh20/g;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    new-instance v25, Landroidx/room/v0;

    const/16 v31, 0x0

    const/16 v32, 0x14

    const/16 v26, 0x2

    const-class v28, Lh20/g;

    const-string v29, "onFormFieldValuesChanged"

    const-string v30, "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V"

    move-object/from16 v27, v10

    invoke-direct/range {v25 .. v32}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v15, Lq00/h0;

    iget-object v2, v1, Ld30/f0;->b:Ljava/lang/Object;

    move-object/from16 v17, v2

    check-cast v17, Lk20/a;

    const/16 v21, 0x0

    const/16 v22, 0x10

    const/16 v16, 0x1

    const-class v18, Lk20/a;

    const-string v19, "onPaymentMethodFormInteraction"

    const-string v20, "onPaymentMethodFormInteraction(Ljava/lang/String;)V"

    invoke-direct/range {v15 .. v22}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v13, v9, v4}, Lv00/c0;->i(Ljava/lang/String;Z)Lt00/a;

    move-result-object v2

    invoke-interface {v7}, Ly00/c8;->q0()Z

    move-result v16

    iget-object v4, v1, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v4, Lt10/e;

    iget-object v4, v4, Lt10/e;->g:Lec3/h2;

    new-instance v6, Lsz0/k;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Lsz0/k;-><init>(I)V

    invoke-static {v4, v6}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v17

    invoke-static {v5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    invoke-static {v4}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v19

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v5, v5, v6, v4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v18

    iget-object v1, v1, Ld30/f0;->g:Ljava/lang/Object;

    move-object/from16 v20, v1

    check-cast v20, Lbc3/c0;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v21, Lhc3/o;->a:Lbc3/w1;

    new-instance v8, Ld30/v;

    move-object v10, v3

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v12, v25

    move-object v15, v2

    invoke-direct/range {v8 .. v21}, Ld30/v;-><init>(Ljava/lang/String;Ls20/a;Ljava/util/List;Lc93/m;Lt20/n;Lkotlin/jvm/functions/Function1;Lt00/a;ZLec3/f2;Lec3/w1;Lec3/r1;Lbc3/c0;Lq83/j;)V

    return-object v8

    :pswitch_4
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, La30/h;

    invoke-virtual {v1}, La30/h;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/shoppay/ShopPayActivityContract;

    new-instance v2, Lg10/a;

    invoke-direct {v2, v1}, Lg10/a;-><init>(Lcom/stripe/android/shoppay/ShopPayActivityContract;)V

    return-object v2

    :pswitch_5
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lp20/i;

    new-instance v2, Ln10/j0;

    invoke-direct {v2, v1, v5}, Ln10/j0;-><init>(Lk83/a;I)V

    return-object v2

    :pswitch_6
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->y:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    return-object v1

    :pswitch_7
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lb10/a1;

    invoke-virtual {v1}, Lb10/a1;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhy/c;

    return-object v1

    :pswitch_8
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lng3/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "PaymentSheet.AddressController"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    return-object v1

    :pswitch_9
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lcy/b;

    invoke-virtual {v1}, Lcy/b;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqy/d;

    new-instance v2, Lla/b;

    invoke-direct {v2, v1}, Lla/b;-><init>(Lqy/d;)V

    return-object v2

    :pswitch_a
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lv03/i;

    invoke-virtual {v1}, Lv03/i;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    const-string v2, "definitions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lab/g;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v1, v5}, Lab/g;-><init>(Ljava/util/List;I)V

    return-object v2

    :pswitch_b
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lg73/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lyy/c;->g:Ljava/util/UUID;

    sget-object v1, Lyy/c;->g:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :pswitch_c
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, La00/k;

    invoke-virtual {v1}, La00/k;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La00/i;

    return-object v1

    :pswitch_d
    iget-object v1, v0, Lb10/c;->x:Ljava/lang/Object;

    check-cast v1, Lu00/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lb10/d;->x:Lb10/d;

    sget-object v1, Lb10/d;->x:Lb10/d;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
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
