.class public final Lh20/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V
    .locals 0

    iput p2, p0, Lh20/j0;->w:I

    iput-object p1, p0, Lh20/j0;->x:Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lh20/j0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Lh20/j0;

    iget-object v2, v0, Lh20/j0;->x:Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lh20/j0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    const v2, -0x56a2d51c

    invoke-static {v2, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0xc00000

    const/16 v12, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-ne v2, v3, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    iget-object v2, v0, Lh20/j0;->x:Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object v3

    iget-object v3, v3, Le30/c;->Q:Lec3/r1;

    const/4 v5, 0x0

    invoke-static {v3, v1, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v3

    move-object v11, v1

    check-cast v11, Lp1/q;

    const v1, 0x6a96ceef

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_4

    if-ne v6, v7, :cond_5

    :cond_4
    new-instance v6, Lb;

    const/4 v1, 0x5

    invoke-direct {v6, v3, v1}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-static {v6, v11, v1}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v6

    const v1, 0x6a96d996

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_6

    if-ne v3, v7, :cond_7

    :cond_6
    new-instance v3, Lh20/i0;

    const/4 v1, 0x0

    const/4 v8, 0x0

    invoke-direct {v3, v2, v6, v8, v1}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lc93/m;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-static {v11, v3, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object v14

    const v1, 0x6a9712f5

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    if-ne v3, v7, :cond_9

    :cond_8
    new-instance v12, Lb30/i0;

    const/16 v18, 0x0

    const/16 v19, 0x7

    const/4 v13, 0x0

    const-class v15, Lh20/w0;

    const-string v16, "onUserCancel"

    const-string v17, "onUserCancel()V"

    invoke-direct/range {v12 .. v19}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v12

    :cond_9
    check-cast v3, Lj93/g;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    move-object v9, v3

    check-cast v9, Lc93/a;

    new-instance v1, Lh20/j0;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lh20/j0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    const v2, -0x3c9a0dc4

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0x6008

    const/4 v13, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v13}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    return-object v4

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_b

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_5

    :cond_b
    :goto_4
    iget-object v2, v0, Lh20/j0;->x:Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object v2

    const/16 v3, 0x8

    invoke-static {v2, v1, v3}, Lds/p;->g(Lh20/w0;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
