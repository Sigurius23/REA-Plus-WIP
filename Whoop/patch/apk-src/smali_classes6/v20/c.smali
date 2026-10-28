.class public final Lv20/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V
    .locals 0

    iput p2, p0, Lv20/c;->w:I

    iput-object p1, p0, Lv20/c;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lv20/c;->w:I

    sget-object v2, Lp1/l;->a:Lp1/v0;

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, v0, Lv20/c;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;

    const/4 v6, 0x2

    const/4 v7, 0x3

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v7

    if-ne v2, v6, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, Lv20/c;

    invoke-direct {v2, v5, v7}, Lv20/c;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V

    const v3, -0x697b1e19

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x7f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v8 .. v18}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    return-object v4

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/2addr v8, v7

    if-ne v8, v6, :cond_3

    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v8, 0x0

    invoke-static {v8, v1, v7}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v9

    move-object v14, v1

    check-cast v14, Lp1/q;

    const v1, -0x70dc3440

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v1, v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_4

    if-ne v7, v2, :cond_5

    :cond_4
    new-instance v7, Ls40/c0;

    const/16 v1, 0x12

    invoke-direct {v7, v5, v9, v8, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lc93/m;

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-static {v14, v7, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x70dbf6cc

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_6

    if-ne v7, v2, :cond_7

    :cond_6
    new-instance v7, Lv20/b;

    invoke-direct {v7, v5, v6}, Lv20/b;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v12, v7

    check-cast v12, Lc93/a;

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    new-instance v1, Lv20/c;

    invoke-direct {v1, v5, v6}, Lv20/c;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V

    const v2, -0x2653d671

    invoke-static {v2, v14, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v15, 0x6008

    const/16 v16, 0x6

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v16}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    return-object v4

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v7

    if-ne v2, v6, :cond_9

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_5

    :cond_9
    :goto_4
    new-instance v2, Lv20/c;

    invoke-direct {v2, v5, v3}, Lv20/c;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V

    const v3, -0x6934fe52

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    new-instance v2, Lv20/c;

    const/4 v3, 0x1

    invoke-direct {v2, v5, v3}, Lv20/c;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V

    const v3, 0x7dc0800d

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const/16 v22, 0x36

    const/16 v23, 0xc

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v1

    invoke-static/range {v17 .. v23}, Ldp/d;->a(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    return-object v4

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v7

    if-ne v2, v6, :cond_b

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_7

    :cond_b
    :goto_6
    sget v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;->y:I

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;->o()Lv20/r;

    move-result-object v2

    invoke-static {v2, v1, v3}, Lrg/a;->b(Lv20/r;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    return-object v4

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/2addr v8, v7

    if-ne v8, v6, :cond_d

    move-object v6, v1

    check-cast v6, Lp1/q;

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_9

    :cond_d
    :goto_8
    move-object v11, v1

    check-cast v11, Lp1/q;

    const v1, -0x26060179

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_e

    new-instance v1, Lou1/a;

    const/4 v6, 0x7

    invoke-direct {v1, v6}, Lou1/a;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v1, Lc93/a;

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    new-instance v12, Lb30/j3;

    invoke-direct {v12, v3, v3, v3, v1}, Lb30/j3;-><init>(ZZZLc93/a;)V

    const v1, -0x2605e84a

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_f

    if-ne v6, v2, :cond_10

    :cond_f
    new-instance v6, Lv20/b;

    invoke-direct {v6, v5, v7}, Lv20/b;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v13, v6

    check-cast v13, Lc93/a;

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    const/16 v10, 0x1b0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static/range {v9 .. v15}, Lb30/g3;->c(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    :goto_9
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
