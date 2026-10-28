.class public final Lb30/v5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb30/v5;->w:I

    iput-object p1, p0, Lb30/v5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    iput-object p2, p0, Lb30/v5;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/v5;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/v5;->y:Ljava/lang/String;

    iput-object p2, p0, Lb30/v5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lb30/v5;->w:I

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
    new-instance v1, Lb30/v5;

    iget-object v2, v0, Lb30/v5;->y:Ljava/lang/String;

    const/4 v3, 0x1

    iget-object v4, v0, Lb30/v5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-direct {v1, v4, v2, v3}, Lb30/v5;-><init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;Ljava/lang/String;I)V

    const v2, 0x1359e2fe

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

    const/4 v3, 0x3

    and-int/2addr v2, v3

    const/4 v4, 0x2

    if-ne v2, v4, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v2, 0x0

    invoke-static {v2, v1, v3}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v4

    move-object v9, v1

    check-cast v9, Lp1/q;

    const v1, -0x37abfa29

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    iget-object v12, v0, Lb30/v5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_5

    :cond_4
    new-instance v10, Lb30/i0;

    const/16 v16, 0x0

    const/16 v17, 0x3

    const/4 v11, 0x0

    const-class v13, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    const-string v14, "finish"

    const-string v15, "finish()V"

    invoke-direct/range {v10 .. v17}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v10

    :cond_5
    check-cast v2, Lj93/g;

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move-object v7, v2

    check-cast v7, Lc93/a;

    new-instance v1, Lb30/v5;

    iget-object v2, v0, Lb30/v5;->y:Ljava/lang/String;

    invoke-direct {v1, v2, v12}, Lb30/v5;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)V

    const v2, 0x2c1e1aa6

    invoke-static {v2, v9, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v10, 0x6008

    const/4 v11, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v11}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_7

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_5

    :cond_7
    :goto_4
    check-cast v1, Lp1/q;

    const v2, -0x3ab9c1

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lb30/v5;->x:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_8

    if-ne v4, v5, :cond_9

    :cond_8
    new-instance v4, Lb30/u5;

    const/4 v3, 0x0

    invoke-direct {v4, v2, v3}, Lb30/u5;-><init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lc93/a;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    const v6, -0x3a8af6

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_a

    if-ne v7, v5, :cond_b

    :cond_a
    new-instance v7, Lb30/u5;

    const/4 v5, 0x1

    invoke-direct {v7, v2, v5}, Lb30/u5;-><init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;I)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lc93/a;

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    iget-object v2, v0, Lb30/v5;->y:Ljava/lang/String;

    invoke-static {v2, v4, v7, v1, v3}, Lse/h;->q(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

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
