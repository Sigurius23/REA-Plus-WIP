.class public final Lay/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lay/n;->w:I

    iput-object p1, p0, Lay/n;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lay/n;->w:I

    const/16 v2, 0x8

    const/16 v3, 0x10

    sget-object v4, Lp1/l;->a:Lp1/v0;

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x2

    const/4 v9, 0x3

    const/4 v10, 0x0

    iget-object v11, v0, Lay/n;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, -0x520d2714

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    check-cast v11, Landroid/app/RemoteAction;

    invoke-virtual {v11}, Landroid/app/RemoteAction;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, 0x38a0c7d5

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    check-cast v11, Landroid/view/textclassifier/TextClassification;

    invoke-virtual {v11}, Landroid/view/textclassifier/TextClassification;->getLabel()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, 0x27b3a34e

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    check-cast v11, Lx0/d;

    iget-object v2, v11, Lx0/d;->b:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v11, Lu10/p;

    and-int/2addr v2, v9

    if-ne v2, v8, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    sget-object v2, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v2

    check-cast v1, Lp1/q;

    const v8, -0x7c374fdd

    invoke-virtual {v1, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_2

    if-ne v12, v4, :cond_3

    :cond_2
    invoke-virtual {v11}, Lu10/p;->i()Lec3/f2;

    move-result-object v12

    invoke-virtual {v1, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v12, Lec3/f2;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    invoke-static {v12, v1, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v4

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzy/c;

    const v8, -0x7c37406a

    invoke-virtual {v1, v8}, Lp1/q;->e0(I)V

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v4, v1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    int-to-float v3, v3

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v16, v3

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v4, v2, v1, v10, v10}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    invoke-static {v12, v5, v9}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11, v1}, Lu10/p;->b(Lp1/q;)V

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    :goto_3
    return-object v7

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v9

    if-ne v2, v8, :cond_9

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_5

    :cond_9
    :goto_4
    check-cast v11, Ly00/x;

    iget-object v2, v11, Ly00/x;->H:Ljava/lang/String;

    invoke-static {v2, v5, v1, v10}, Lkotlin/jvm/internal/j;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    return-object v7

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v8, :cond_a

    move v10, v6

    :cond_a
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v10}, Lp1/q;->U(IZ)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v1}, Lp1/q;->X()V

    return-object v7

    :cond_b
    throw v5

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v9

    if-ne v2, v8, :cond_d

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_7

    :cond_d
    :goto_6
    check-cast v11, Lb30/m0;

    int-to-float v2, v3

    const/16 v3, 0x30

    invoke-static {v11, v2, v1, v3, v10}, Ltx/f;->a(Lb30/m0;FLandroidx/compose/runtime/Composer;II)V

    :goto_7
    return-object v7

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v11, La00/g;

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v8, :cond_e

    move v3, v6

    goto :goto_8

    :cond_e
    move v3, v10

    :goto_8
    and-int/2addr v2, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    const v2, 0x7f1407ec

    invoke-static {v1, v2}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v11, La00/g;->y:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Landroidx/compose/ui/Modifier;

    sget v13, Ll1/a;->a:F

    sget v15, Ll1/a;->b:F

    const/16 v16, 0x0

    const/16 v17, 0xa

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_f

    if-ne v8, v4, :cond_10

    :cond_f
    new-instance v8, Lht2/d;

    const/16 v4, 0x11

    invoke-direct {v8, v2, v4}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v10, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_9
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    :cond_12
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v2, v11, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Lx1/b;

    invoke-static {v10, v2, v1, v6}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_a

    :cond_14
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_a
    return-object v7

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    check-cast v11, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    iget-object v12, v11, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->x:Landroidx/lifecycle/y1;

    and-int/2addr v3, v9

    if-ne v3, v8, :cond_16

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_15

    goto :goto_b

    :cond_15
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_16
    :goto_b
    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_17

    invoke-static {v1}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    new-instance v8, Lp1/a0;

    invoke-direct {v8, v3}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v8

    :cond_17
    check-cast v3, Lp1/a0;

    iget-object v3, v3, Lp1/a0;->w:Lbc3/c0;

    new-array v8, v10, [Leb/i1;

    invoke-static {v8, v1}, Lge3/g;->S([Leb/i1;Landroidx/compose/runtime/Composer;)Leb/u0;

    move-result-object v8

    invoke-virtual {v12}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Li20/p;

    iget-object v13, v13, Li20/p;->w:Li20/k1;

    iput-object v8, v13, Li20/k1;->a:Leb/u0;

    invoke-static {v5, v1, v9}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v5

    const v9, -0x358249b7

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_18

    if-ne v13, v4, :cond_19

    :cond_18
    new-instance v13, Li20/c;

    const/4 v9, 0x4

    invoke-direct {v13, v11, v9}, Li20/c;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    invoke-virtual {v1, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v13, Lc93/a;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    invoke-static {v13, v10, v1, v10, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li20/p;

    iget-object v6, v6, Li20/p;->w:Li20/k1;

    const v9, -0x35823bf1

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_1a

    if-ne v12, v4, :cond_1b

    :cond_1a
    new-instance v12, Lep1/g;

    const/16 v4, 0x1a

    invoke-direct {v12, v3, v5, v11, v4}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    iput-object v12, v6, Li20/k1;->b:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v5, v8, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->m(Lh40/k;Leb/u0;Landroidx/compose/runtime/Composer;I)V

    :goto_c
    return-object v7

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, -0x4033abe

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    check-cast v11, Lg40/d0;

    iget-object v2, v11, Lg40/d0;->a:Le10/k0;

    iget-object v2, v2, Le10/k0;->x:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f140fba

    invoke-static {v3, v2, v1}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1c

    const-string v2, ""

    :cond_1c
    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    return-object v2

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v9

    if-ne v2, v8, :cond_1e

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_1d

    goto :goto_d

    :cond_1d
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_e

    :cond_1e
    :goto_d
    check-cast v11, Lb30/j3;

    iget-boolean v2, v11, Lb30/j3;->a:Z

    if-eqz v2, :cond_1f

    invoke-static {v1, v10}, Lb30/g3;->d(Landroidx/compose/runtime/Composer;I)V

    :cond_1f
    :goto_e
    return-object v7

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/2addr v3, v9

    if-ne v3, v8, :cond_21

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_f

    :cond_20
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_10

    :cond_21
    :goto_f
    check-cast v11, Lr20/s;

    int-to-float v2, v2

    const/16 v17, 0x7

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v16, v2

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v11, v1, v2}, Lr20/s;->J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_10
    return-object v7

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v9

    if-ne v2, v8, :cond_23

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_11

    :cond_22
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_12

    :cond_23
    :goto_11
    check-cast v11, Ly00/i;

    iget v2, v11, Ly00/i;->z:I

    invoke-static {v2, v1, v10}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v12

    const/16 v20, 0x30

    const/16 v21, 0x7c

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v12 .. v21}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_12
    return-object v7

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v11, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    and-int/2addr v2, v9

    if-ne v2, v8, :cond_25

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_24

    goto :goto_13

    :cond_24
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_14

    :cond_25
    :goto_13
    check-cast v1, Lp1/q;

    const v2, 0xd2f23e3

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_26

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v2, Lp1/c1;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    const v3, 0xd2f2e05

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_27

    if-ne v8, v4, :cond_28

    :cond_27
    new-instance v8, Le;

    const/16 v3, 0xb

    invoke-direct {v8, v11, v2, v5, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v8, Lc93/m;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    const-string v3, "BridgeEvents"

    invoke-static {v1, v8, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v3, v11, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v3}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lay/b0;

    iget-object v12, v3, Lay/b0;->w:Lay/j;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    const v2, 0xd2f5cf8

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_29

    if-ne v3, v4, :cond_2a

    :cond_29
    new-instance v3, Lay/k;

    invoke-direct {v3, v11, v6}, Lay/k;-><init>(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object v14, v3

    check-cast v14, Lc93/a;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    const/4 v15, 0x0

    const/16 v17, 0x6

    move-object/from16 v16, v1

    invoke-static/range {v12 .. v17}, Ltx/f;->e(Lay/i;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :goto_14
    return-object v7

    :pswitch_data_0
    .packed-switch 0x0
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
