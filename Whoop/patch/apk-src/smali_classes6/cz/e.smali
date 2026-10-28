.class public final Lcz/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/customersheet/CustomerSheetActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V
    .locals 0

    iput p2, p0, Lcz/e;->w:I

    iput-object p1, p0, Lcz/e;->x:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lcz/e;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, v0, Lcz/e;->x:Lcom/stripe/android/customersheet/CustomerSheetActivity;

    const/4 v6, 0x2

    const/4 v7, 0x3

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/2addr v3, v7

    if-ne v3, v6, :cond_1

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Lcz/e;

    invoke-direct {v3, v5, v2}, Lcz/e;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    const v2, 0x4db2cd7e    # 3.7497645E8f

    invoke-static {v2, v1, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

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

    move-object v6, v1

    check-cast v6, Lp1/q;

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    move-object v14, v1

    check-cast v14, Lp1/q;

    const v1, -0x4d2da0ce

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_4

    if-ne v6, v8, :cond_5

    :cond_4
    new-instance v6, Lck1/c;

    const/16 v1, 0xd

    invoke-direct {v6, v5, v1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-static {v6, v14, v2}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v9

    sget v1, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v5}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->p()Lcz/n0;

    move-result-object v1

    iget-object v1, v1, Lcz/n0;->O:Lec3/h2;

    invoke-static {v1, v14, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcz/z0;

    const v10, -0x4d2d7233

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_6

    if-ne v11, v8, :cond_7

    :cond_6
    new-instance v11, Lcz/d;

    const/4 v10, 0x0

    invoke-direct {v11, v1, v9, v5, v10}, Lcz/d;-><init>(Lp1/c1;Lh40/k;Lcom/stripe/android/customersheet/CustomerSheetActivity;Lq83/d;)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lc93/m;

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-static {v14, v11, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x4d2d5800

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_8

    if-ne v6, v8, :cond_9

    :cond_8
    new-instance v6, Lcz/c;

    invoke-direct {v6, v5, v7}, Lcz/c;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lc93/a;

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-static {v6, v3, v14, v3, v2}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    const v1, -0x4d2d3b7e

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_a

    if-ne v2, v8, :cond_b

    :cond_a
    new-instance v2, Lcz/c;

    const/4 v1, 0x4

    invoke-direct {v2, v5, v1}, Lcz/c;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v12, v2

    check-cast v12, Lc93/a;

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    new-instance v1, Lcz/e;

    invoke-direct {v1, v5, v3}, Lcz/e;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    const v2, 0x4647bb26

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

    if-ne v2, v6, :cond_d

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_5

    :cond_d
    :goto_4
    sget v2, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v5}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->p()Lcz/n0;

    move-result-object v2

    invoke-static {v2, v1, v3}, Le4/a;->e(Lcz/n0;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
