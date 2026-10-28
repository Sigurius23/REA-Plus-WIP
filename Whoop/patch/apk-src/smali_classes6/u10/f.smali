.class public final Lu10/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lu10/f;->w:I

    iput-object p2, p0, Lu10/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lu10/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lu10/f;->w:I

    const/4 v2, 0x0

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    sget-object v6, Lp1/l;->a:Lp1/v0;

    const/4 v7, 0x2

    iget-object v8, v0, Lu10/f;->x:Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, v0, Lu10/f;->y:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v7, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v9

    :goto_0
    and-int/2addr v2, v4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v10

    check-cast v2, Lb1/f;

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    move-object v13, v10

    check-cast v13, Lb1/f;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    if-ne v3, v6, :cond_2

    :cond_1
    new-instance v11, Lp00/j;

    const/16 v17, 0x0

    const/16 v18, 0x1d

    const/4 v12, 0x0

    const-class v14, Lb1/f;

    const-string v15, "data"

    const-string v16, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"

    invoke-direct/range {v11 .. v18}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v11}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lp1/t2;

    check-cast v8, Lx0/g;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/c;

    invoke-static {v8, v2, v1, v9}, Lz0/i;->a(Lx0/g;Lx0/c;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_1
    return-object v5

    :pswitch_0
    check-cast v10, Lr93/b;

    check-cast v8, Lr93/b;

    move-object/from16 v1, p1

    check-cast v1, Lr93/k;

    move-object/from16 v2, p2

    check-cast v2, Lr93/k;

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move v4, v9

    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v10, Lc93/a;

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v7, :cond_6

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_4

    :cond_6
    :goto_3
    const-string v2, "simple_dialog_dismiss_button"

    invoke-static {v3, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    check-cast v1, Lp1/q;

    const v2, -0x6b859878

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    if-ne v3, v6, :cond_8

    :cond_7
    new-instance v3, Lry2/g;

    const/16 v2, 0x1c

    invoke-direct {v3, v10, v2}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v11, v3

    check-cast v11, Lc93/a;

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    new-instance v2, Lg1/q6;

    check-cast v8, Ljava/lang/String;

    const/4 v3, 0x5

    invoke-direct {v2, v8, v3}, Lg1/q6;-><init>(Ljava/lang/String;I)V

    const v3, 0xd1b53ce

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const v20, 0x30000030

    const/16 v21, 0x1fc

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v11 .. v21}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    return-object v5

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast v10, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    iget-object v4, v10, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->y:Landroidx/lifecycle/y1;

    and-int/lit8 v3, v3, 0x3

    if-ne v3, v7, :cond_a

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_6

    :cond_a
    :goto_5
    sget v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->z:I

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v3

    iget-object v3, v3, Lx20/k;->G:Ljava/lang/String;

    check-cast v8, Lp1/c1;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lx20/p;

    iget-boolean v7, v7, Lx20/p;->d:Z

    if-eqz v7, :cond_d

    if-eqz v3, :cond_d

    check-cast v1, Lp1/q;

    const v2, 0x1501761

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v2

    iget-object v2, v2, Lx20/k;->w:Ljava/lang/String;

    invoke-virtual {v4}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lx20/w;

    const v4, -0x6b4fe8ea

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_b

    if-ne v7, v6, :cond_c

    :cond_b
    new-instance v10, Lp00/j;

    const/16 v16, 0x0

    const/16 v17, 0x1b

    const/4 v11, 0x0

    const-class v13, Lx20/w;

    const-string v14, "hideQrCode"

    const-string v15, "hideQrCode()V"

    invoke-direct/range {v10 .. v17}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v10

    :cond_c
    check-cast v7, Lj93/g;

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    check-cast v7, Lc93/a;

    invoke-static {v3, v2, v7, v1, v9}, Ls93/h;->a(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_d
    check-cast v1, Lp1/q;

    const v3, 0x153f859

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx20/w;

    invoke-static {v3, v2, v1, v9}, Ls9/f;->k(Lx20/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_6
    return-object v5

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v14, v8

    check-cast v14, Lcom/stripe/android/link/LinkActivity;

    move-object v12, v10

    check-cast v12, Lwz/y;

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v7, :cond_f

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_8

    :cond_f
    :goto_7
    check-cast v1, Lp1/q;

    const v2, 0x7f833814

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_10

    if-ne v3, v6, :cond_11

    :cond_10
    new-instance v3, Luo1/b;

    const/16 v2, 0x18

    invoke-direct {v3, v12, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    invoke-static {v3, v1, v4}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v13

    const v2, 0x7f8341a7

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_12

    if-ne v3, v6, :cond_13

    :cond_12
    new-instance v11, Ln43/a;

    const/16 v16, 0x1d

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v16}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v11

    :cond_13
    check-cast v3, Lc93/m;

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    invoke-static {v1, v3, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x40

    invoke-static {v12, v13, v1, v2}, Lwz/n1;->a(Lwz/y;Lh40/k;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    return-object v5

    :pswitch_4
    move-object v1, v10

    move-object/from16 v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v7, :cond_15

    move-object v2, v10

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_9

    :cond_14
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_15
    :goto_9
    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-object v2, v2, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->h()J

    move-result-wide v11

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v11, v12, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v13, v1

    check-cast v13, Lw20/b0;

    check-cast v8, Lp1/t2;

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v3, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    invoke-static {v10}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v3

    move-object v7, v10

    check-cast v7, Lp1/q;

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_16
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_18

    :cond_17
    invoke-static {v3, v7, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v9}, Ls2/d;->e(Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw20/y;

    iget-object v1, v1, Lw20/y;->a:Ljava/lang/String;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw20/y;

    iget-boolean v2, v2, Lw20/y;->d:Z

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw20/y;

    iget-object v8, v3, Lw20/y;->c:Lw20/z;

    const v3, 0x224bbd8d

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_19

    if-ne v11, v6, :cond_1a

    :cond_19
    new-instance v11, Lv20/g;

    const/16 v17, 0x0

    const/16 v18, 0x2

    const/4 v12, 0x1

    const-class v14, Lw20/b0;

    const-string v15, "onCvcChanged"

    const-string v16, "onCvcChanged(Ljava/lang/String;)V"

    invoke-direct/range {v11 .. v18}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v11, Lj93/g;

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    move-object v9, v11

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    move-object v6, v1

    move-object v1, v7

    move v7, v2

    invoke-static/range {v6 .. v11}, Ls2/d;->b(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    :goto_b
    return-object v5

    :pswitch_5
    move-object v1, v10

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast v8, Lp1/t2;

    and-int/lit8 v3, v3, 0x3

    if-ne v3, v7, :cond_1c

    move-object v3, v2

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_c

    :cond_1b
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_d

    :cond_1c
    :goto_c
    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw20/y;

    iget-object v10, v3, Lw20/y;->a:Ljava/lang/String;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw20/y;

    iget-boolean v11, v3, Lw20/y;->b:Z

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw20/y;

    iget-object v12, v3, Lw20/y;->c:Lw20/z;

    check-cast v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lw20/x;

    check-cast v2, Lp1/q;

    const v1, -0x1f3d280

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1d

    if-ne v3, v6, :cond_1e

    :cond_1d
    new-instance v13, Lv20/g;

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/4 v14, 0x1

    const-class v16, Lw20/x;

    const-string v17, "handleViewAction"

    const-string v18, "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)V"

    invoke-direct/range {v13 .. v20}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v2, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v13

    :cond_1e
    check-cast v3, Lj93/g;

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    move-object v13, v3

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    move-object v14, v2

    invoke-static/range {v10 .. v15}, Ls2/d;->d(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_d
    return-object v5

    :pswitch_6
    move-object v1, v10

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v10, p2

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    check-cast v8, Lp1/t2;

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    and-int/lit8 v10, v10, 0x3

    if-ne v10, v7, :cond_20

    move-object v7, v3

    check-cast v7, Lp1/q;

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v10

    if-nez v10, :cond_1f

    goto :goto_e

    :cond_1f
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_20
    :goto_e
    check-cast v3, Lp1/q;

    const v7, -0x22cced36

    invoke-virtual {v3, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_21

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v3, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v7, Lp1/c1;

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-nez v10, :cond_27

    const/16 v10, 0x14

    int-to-float v15, v10

    const/16 v16, 0x7

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_22

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_22
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_f
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v3, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-nez v13, :cond_23

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_24

    :cond_23
    invoke-static {v12, v3, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v3, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->r()Lu10/q;

    move-result-object v10

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lu10/p;

    invoke-virtual {v1, v10, v11, v3, v9}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->o(Lu10/q;Lu10/p;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu10/p;

    const v8, -0x22ccc83e

    invoke-virtual {v3, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_25

    if-ne v10, v6, :cond_26

    :cond_25
    new-instance v10, Ls40/c0;

    const/16 v6, 0xe

    invoke-direct {v10, v1, v7, v2, v6}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v3, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v10, Lc93/m;

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    invoke-static {v3, v10, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :cond_27
    :goto_10
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
