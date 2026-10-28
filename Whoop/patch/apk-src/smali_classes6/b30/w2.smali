.class public final Lb30/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lb30/w2;->w:I

    iput-object p2, p0, Lb30/w2;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb30/w2;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lb30/w2;->y:Ljava/lang/Object;

    check-cast v0, Lp0/a0;

    iget-object v1, p0, Lb30/w2;->x:Ljava/lang/Object;

    check-cast v1, Lp0/z;

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    and-int/2addr p2, v4

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v2}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, v0, Lp0/a0;->b:Lo0/i;

    invoke-virtual {p1}, Lo0/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lp0/b0;

    iget p1, v1, Lp0/z;->c:I

    iget-object p2, v1, Lp0/z;->a:Ljava/lang/Object;

    invoke-interface {v6}, Lp0/b0;->getItemCount()I

    move-result v2

    const/4 v3, -0x1

    if-ge p1, v2, :cond_2

    invoke-interface {v6, p1}, Lp0/b0;->c(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move v8, p1

    goto :goto_3

    :cond_2
    :goto_2
    invoke-interface {v6, p2}, Lp0/b0;->b(Ljava/lang/Object;)I

    move-result p1

    if-eq p1, v3, :cond_1

    iput p1, v1, Lp0/z;->c:I

    goto :goto_1

    :goto_3
    if-eq v8, v3, :cond_3

    const p1, -0x6339ef97

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    iget-object v7, v0, Lp0/a0;->a:Ly1/c;

    iget-object v9, v1, Lp0/z;->a:Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lp0/y;->f(Lp0/b0;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_3
    const p1, -0x633657e2

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v0, p1, :cond_5

    :cond_4
    new-instance v0, Lno0/e0;

    const/16 p1, 0x14

    invoke-direct {v0, v1, p1}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v0, v10}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v8

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, Lb2/t;->w:Lb2/t;

    const-string p2, "wallet_screen_dialog_button_tag"

    invoke-static {p1, p2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object p1, p0, Lb30/w2;->y:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lc93/a;

    new-instance p1, Lb30/o4;

    iget-object p2, p0, Lb30/w2;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    const/16 v2, 0xc

    invoke-direct {p1, p2, v2}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const p2, -0x51fbe905

    invoke-static {p2, v8, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x30000030

    const/16 v10, 0x1fc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lb30/w2;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    iget-object p2, v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->y:Ld30/v;

    const/4 v0, 0x0

    if-eqz p2, :cond_9

    iget-object v9, v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->z:Lk20/a;

    if-eqz v9, :cond_8

    move-object v10, p1

    check-cast v10, Lp1/q;

    const p1, 0x72d9efbc

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_2

    if-ne v0, v11, :cond_3

    :cond_2
    new-instance v1, Lp00/j;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const/4 v2, 0x0

    const-class v4, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const-string v5, "setCancelAndFinish"

    const-string v6, "setCancelAndFinish()V"

    invoke-direct/range {v1 .. v8}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_3
    check-cast v0, Lj93/g;

    const/4 p1, 0x0

    invoke-virtual {v10, p1}, Lp1/q;->q(Z)V

    const v1, 0x72da1786

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    if-ne v2, v11, :cond_5

    :cond_4
    new-instance v1, Lp00/j;

    const/4 v7, 0x0

    const/16 v8, 0x11

    const/4 v2, 0x0

    const-class v4, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const-string v5, "setCompletedResultAndDismiss"

    const-string v6, "setCompletedResultAndDismiss()V"

    invoke-direct/range {v1 .. v8}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v1

    :cond_5
    check-cast v2, Lj93/g;

    invoke-virtual {v10, p1}, Lp1/q;->q(Z)V

    iget-object v1, p0, Lb30/w2;->x:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lt10/j;

    const v1, 0x72d9f77c

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_6

    if-ne v4, v11, :cond_7

    :cond_6
    new-instance v4, Lt10/g;

    const/4 v1, 0x3

    invoke-direct {v4, v3, v1}, Lt10/g;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, v4

    check-cast v6, Lc93/a;

    invoke-virtual {v10, p1}, Lp1/q;->q(Z)V

    move-object v7, v2

    check-cast v7, Lc93/a;

    check-cast v0, Lc93/a;

    const/4 v11, 0x0

    move-object v4, p2

    move-object v5, v9

    move-object v9, v0

    invoke-static/range {v4 .. v11}, Lt10/o;->d(Ld30/v;Lk20/a;Lc93/a;Lc93/a;Lt10/j;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    const-string p1, "eventReporter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_9
    const-string p1, "formInteractor"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    move-object/from16 v0, p0

    iget v1, v0, Lb30/w2;->w:I

    const/16 v2, 0x30

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x1

    const/4 v11, 0x0

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    iget-object v13, v0, Lb30/w2;->x:Ljava/lang/Object;

    iget-object v14, v0, Lb30/w2;->y:Ljava/lang/Object;

    const/4 v15, 0x2

    const/4 v3, 0x3

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_1

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
    check-cast v14, Ld30/v;

    iget-boolean v2, v14, Ld30/v;->h:Z

    check-cast v13, Lc93/a;

    invoke-static {v2, v13, v1, v11}, Lt10/o;->c(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    return-object v12

    :pswitch_0
    invoke-direct/range {p0 .. p2}, Lb30/w2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_1
    invoke-direct/range {p0 .. p2}, Lb30/w2;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_2

    move v3, v10

    goto :goto_2

    :cond_2
    move v3, v11

    :goto_2
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    check-cast v14, Lx1/b;

    check-cast v13, Lp0/x0;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v14, v13, v1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_3
    return-object v12

    :pswitch_3
    invoke-direct/range {p0 .. p2}, Lb30/w2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_4
    move-object/from16 v23, p1

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v3

    if-ne v1, v15, :cond_5

    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_4
    int-to-float v1, v5

    invoke-static {v9, v6, v1, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    check-cast v14, Ln00/c;

    iget-boolean v1, v14, Ln00/c;->f:Z

    xor-int/lit8 v14, v1, 0x1

    check-cast v13, Lg40/m3;

    const/16 v24, 0xd80

    const/16 v25, 0x3f0

    const/4 v15, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v13 .. v25}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    :goto_5
    return-object v12

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_6

    move v11, v10

    :cond_6
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v11}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    check-cast v14, Lkotlin/jvm/functions/Function3;

    check-cast v13, Lm1/i0;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v14, v13, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_6
    return-object v12

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v14, Ljava/lang/String;

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_8

    move v3, v10

    goto :goto_7

    :cond_8
    move v3, v11

    :goto_7
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v1, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    if-ne v3, v8, :cond_a

    :cond_9
    new-instance v3, Lht2/d;

    const/16 v2, 0x15

    invoke-direct {v3, v14, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v11, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v13, Lx1/b;

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_8
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v1, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v13, v1, v10}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_9
    return-object v12

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x3

    if-eq v4, v15, :cond_f

    move v4, v10

    goto :goto_a

    :cond_f
    move v4, v11

    :goto_a
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    check-cast v14, Lp1/c1;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_10

    new-instance v2, Ljs2/e;

    invoke-direct {v2, v3, v14}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v2}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v13, Lx1/b;

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_11

    invoke-virtual {v1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_b
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v1, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    :cond_12
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v13, v1, v10}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_c

    :cond_14
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_c
    return-object v12

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_15

    move v3, v10

    goto :goto_d

    :cond_15
    move v3, v11

    :goto_d
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_16

    check-cast v14, Ll1/y4;

    iget-object v2, v14, Ll1/y4;->j:Ll3/v0;

    check-cast v13, Lx1/b;

    invoke-static {v2, v13, v1, v11}, Ll1/o4;->a(Ll3/v0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_e

    :cond_16
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_e
    return-object v12

    :pswitch_9
    check-cast v14, Ljava/lang/String;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_17

    move v3, v10

    goto :goto_f

    :cond_17
    move v3, v11

    :goto_f
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v1, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_18

    if-ne v3, v8, :cond_19

    :cond_18
    new-instance v3, Lht2/d;

    const/16 v2, 0x10

    invoke-direct {v3, v14, v2}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v11, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    check-cast v13, Ll1/y;

    iget-wide v2, v13, Ll1/y;->f:J

    const/16 v33, 0x0

    const v34, 0x3fff8

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v31, v1

    move-wide/from16 v16, v2

    invoke-static/range {v14 .. v34}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_10

    :cond_1a
    move-object/from16 v31, v1

    invoke-virtual/range {v31 .. v31}, Lp1/q;->X()V

    :goto_10
    return-object v12

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_1b

    move v11, v10

    :cond_1b
    and-int/2addr v2, v10

    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v11}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1c

    move-object v3, v14

    check-cast v3, Lo2/e;

    move-object v4, v13

    check-cast v4, Ljava/lang/String;

    const/4 v9, 0x0

    const/16 v10, 0xc

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v3 .. v10}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_11

    :cond_1c
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_11
    return-object v12

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_1d

    move v11, v10

    :cond_1d
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v11}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_21

    sget v2, Ll1/g;->b:F

    sget v3, Ll1/g;->c:F

    invoke-static {v9, v2, v3}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v14, Ll0/k1;

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v4, Lb2/e;->K:Lb2/l;

    check-cast v13, Lx1/b;

    const/16 v5, 0x36

    invoke-static {v3, v4, v1, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-eqz v8, :cond_1e

    invoke-virtual {v1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_12
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v1, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-nez v5, :cond_1f

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    :cond_1f
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Ll0/t1;->a:Ll0/t1;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v13, v2, v1, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_21
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_13
    return-object v12

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v13, Lc93/a;

    check-cast v14, Lg2/i;

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_23

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_14

    :cond_22
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_15

    :cond_23
    :goto_14
    check-cast v1, Lp1/q;

    const v2, 0x15c40e5d

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_24

    if-ne v3, v8, :cond_25

    :cond_24
    new-instance v3, Li20/b1;

    invoke-direct {v3, v14, v13, v11}, Li20/b1;-><init>(Lg2/i;Lc93/a;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v3, Lc93/a;

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    invoke-static {v10, v3, v1, v7}, Lse/b;->a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_15
    return-object v12

    :pswitch_d
    move-object/from16 v23, p1

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v3

    if-ne v1, v15, :cond_27

    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_26

    goto :goto_16

    :cond_26
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_17

    :cond_27
    :goto_16
    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v14, Lg2/s;

    invoke-static {v1, v14}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    check-cast v13, Lg40/m3;

    const/16 v24, 0x1b0

    const/16 v25, 0x3f0

    const/4 v14, 0x1

    const/4 v15, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v13 .. v25}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    :goto_17
    return-object v12

    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v5, p2

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    and-int/2addr v3, v5

    if-ne v3, v15, :cond_29

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_28

    goto :goto_18

    :cond_28
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_1d

    :cond_29
    :goto_18
    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v7, Lg00/g;->f:F

    invoke-static {v5, v6, v7, v10}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0x14

    int-to-float v7, v7

    invoke-static {v5, v7, v6, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    check-cast v14, Lh00/j;

    move-object/from16 v28, v13

    check-cast v28, Lc93/a;

    sget-object v8, Ll0/m;->a:Ll0/e;

    invoke-static {v8, v6, v1, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    invoke-static {v1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v6

    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_2a

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_2a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_19
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v1, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v1, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_2b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2c

    :cond_2b
    invoke-static {v6, v8, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v1, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lh00/j;->b:Z

    iget-object v5, v14, Lh00/j;->c:Lzy/c;

    if-eqz v2, :cond_2d

    const v2, -0x521890c5

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f140fb6

    invoke-static {v1, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v27

    const/16 v30, 0x0

    const/16 v32, 0x4

    const/16 v26, 0x0

    const v29, 0x7f080856

    move-object/from16 v31, v1

    invoke-static/range {v26 .. v32}, Lse/b;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)V

    move-object/from16 v13, v28

    move-object/from16 v6, v31

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_2d
    move-object v6, v1

    move-object/from16 v13, v28

    const v1, -0x52149b75

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v14, Lh00/j;->a:Z

    const/4 v2, 0x0

    invoke-static {v1, v2, v6, v11}, Lse/b;->j(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_1a
    if-eqz v5, :cond_2e

    const v1, -0x52121b5b

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-static {v5, v6}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v26

    const v1, -0x1a6f7841

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    iget-wide v1, v1, Lg00/b;->m:J

    const v5, -0x548d6062

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/e;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    sget-object v9, Lg00/h;->a:Lg00/e;

    const-string v9, "<this>"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v32, Lp3/r;->H:Lp3/r;

    const/16 v5, 0x12

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v30

    const/16 v5, 0x1a

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v40

    new-instance v27, Ll3/v0;

    const/16 v39, 0x0

    const v42, 0xfdffd9

    const-wide/16 v28, 0x0

    const/16 v33, 0x0

    sget-object v34, Lp3/i;->w:Lp3/f;

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v27 .. v42}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    invoke-static/range {v27 .. v27}, Lg00/h;->a(Ll3/v0;)Ll3/v0;

    move-result-object v46

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v18, v7

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v27

    const/16 v49, 0xc30

    const v50, 0xd7f8

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x2

    const/16 v42, 0x0

    const/16 v43, 0x1

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v48, 0x30

    move-wide/from16 v28, v1

    move-object/from16 v47, v6

    invoke-static/range {v26 .. v50}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_2e
    move/from16 v18, v7

    const v1, -0x520b8067

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    float-to-double v1, v4

    const-wide/16 v15, 0x0

    cmpl-double v1, v1, v15

    if-lez v1, :cond_2f

    goto :goto_1b

    :cond_2f
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1b
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v4, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_1c
    const v1, -0x65be42d4

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v14, Lh00/j;->b:Z

    if-nez v1, :cond_30

    const v1, 0x7f140fe6

    invoke-static {v6, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v3

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v5, 0x180

    const/4 v7, 0x0

    const v4, 0x7f08085c

    move-object v3, v13

    invoke-static/range {v1 .. v7}, Lse/b;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)V

    :cond_30
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_1d
    return-object v12

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v14, Lcz/t0;

    check-cast v13, Lkotlin/jvm/functions/Function1;

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_32

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_31

    goto :goto_1e

    :cond_31
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_1f

    :cond_32
    :goto_1e
    check-cast v1, Lp1/q;

    const v2, -0x4cc7764e

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_33

    if-ne v3, v8, :cond_34

    :cond_33
    new-instance v3, Lgz/a;

    invoke-direct {v3, v13, v10}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v3, Lc93/a;

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v3}, Lcz/t0;->b(Lc93/a;)Lb30/j3;

    move-result-object v19

    iget-boolean v2, v14, Lcz/t0;->b:Z

    invoke-virtual {v14}, Lcz/t0;->a()Z

    move-result v3

    xor-int/lit8 v22, v3, 0x1

    const v3, -0x4cc75720

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_35

    if-ne v4, v8, :cond_36

    :cond_35
    new-instance v4, Lgz/a;

    invoke-direct {v4, v13, v15}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    move-object/from16 v20, v4

    check-cast v20, Lc93/a;

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v1

    move/from16 v21, v2

    invoke-static/range {v16 .. v22}, Lb30/g3;->c(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    :goto_1f
    return-object v12

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v13, Lkotlin/jvm/functions/Function1;

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_38

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_37

    goto :goto_20

    :cond_37
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_21

    :cond_38
    :goto_20
    check-cast v14, Lcz/p0;

    iget-boolean v15, v14, Lcz/p0;->j:Z

    iget-object v2, v14, Lcz/p0;->d:Ljava/util/List;

    iget-object v3, v14, Lcz/p0;->c:Ljava/lang/String;

    iget-object v4, v14, Lcz/p0;->f:Ljava/util/List;

    iget-object v5, v14, Lcz/p0;->g:Ls20/a;

    iget-object v6, v14, Lcz/p0;->h:Lt20/n;

    check-cast v1, Lp1/q;

    const v7, 0x37cfecf3

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_39

    if-ne v9, v8, :cond_3a

    :cond_39
    new-instance v9, Lge0/c;

    const/16 v7, 0xb

    invoke-direct {v9, v13, v7}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3a
    move-object/from16 v20, v9

    check-cast v20, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    const v7, 0x37d01720

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_3b

    if-ne v9, v8, :cond_3c

    :cond_3b
    new-instance v9, Lge0/c;

    const/16 v7, 0xc

    invoke-direct {v9, v13, v7}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3c
    move-object/from16 v23, v9

    check-cast v23, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    const/16 v28, 0xc00

    const/16 v29, 0xe00

    const/16 v18, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    invoke-static/range {v15 .. v29}, Lce/w;->p(ZLjava/util/List;Ljava/lang/String;Lq20/c;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ls20/a;Lt20/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_21
    return-object v12

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v13, Lp1/t2;

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_3e

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_3d

    goto :goto_22

    :cond_3d
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_25

    :cond_3e
    :goto_22
    check-cast v14, Lg40/z1;

    iget-boolean v2, v14, Lg40/z1;->b:Z

    if-eqz v2, :cond_3f

    move-object v2, v1

    check-cast v2, Lp1/q;

    const v3, -0x3e30170a

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzy/c;

    invoke-static {v3, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const v4, 0x7f141009

    invoke-static {v4, v3, v2}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11}, Lp1/q;->q(Z)V

    :goto_23
    const/4 v2, 0x0

    goto :goto_24

    :cond_3f
    move-object v2, v1

    check-cast v2, Lp1/q;

    const v3, -0x3e2d10e3

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzy/c;

    invoke-static {v3, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11}, Lp1/q;->q(Z)V

    goto :goto_23

    :goto_24
    invoke-static {v3, v2, v1, v11, v15}, Lce/w;->o(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_25
    return-object v12

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_40

    move v11, v10

    :cond_40
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v11}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_41

    sget-object v2, Lg1/g5;->a:Lp1/u2;

    check-cast v14, Lc9/k;

    invoke-virtual {v2, v14}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    check-cast v13, Lc93/m;

    const/16 v3, 0x8

    invoke-static {v2, v13, v1, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_26

    :cond_41
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_26
    return-object v12

    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_42

    move v11, v10

    :cond_42
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v11}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_43

    check-cast v14, Lx1/b;

    check-cast v13, Lg1/f5;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v14, v13, v1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_27

    :cond_43
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_27
    return-object v12

    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_44

    move v3, v10

    goto :goto_28

    :cond_44
    move v3, v11

    :goto_28
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_45

    check-cast v14, Lkotlin/jvm/functions/Function3;

    check-cast v13, Lg1/i5;

    iget-object v2, v13, Lg1/i5;->a:Lg1/n6;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v14, v2, v1, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_29

    :cond_45
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_29
    return-object v12

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x3

    if-eq v4, v15, :cond_46

    move v11, v10

    :cond_46
    and-int/2addr v3, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v3, v11}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_47

    check-cast v14, Lg1/h9;

    iget-object v3, v14, Lg1/h9;->i:Ll3/v0;

    new-instance v4, Lb30/l4;

    check-cast v13, Lx1/b;

    const/16 v5, 0xa

    invoke-direct {v4, v13, v5}, Lb30/l4;-><init>(Lx1/b;I)V

    const v5, 0x35f8ebe7

    invoke-static {v5, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    invoke-static {v3, v4, v1, v2}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2a

    :cond_47
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2a
    return-object v12

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v13, Lf1/w0;

    and-int/lit8 v3, v2, 0x3

    if-eq v3, v15, :cond_48

    move v3, v10

    goto :goto_2b

    :cond_48
    move v3, v11

    :goto_2b
    and-int/2addr v2, v10

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5b

    check-cast v14, Lx1/b;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v14, v1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13}, Lf1/w0;->h()Z

    move-result v2

    if-eqz v2, :cond_5a

    iget-object v2, v13, Lf1/w0;->i:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5a

    invoke-virtual {v13}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    if-nez v2, :cond_49

    move v2, v10

    goto :goto_2c

    :cond_49
    iget-object v3, v2, Lf1/u;->a:Lf1/t;

    iget-object v2, v2, Lf1/u;->b:Lf1/t;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_2c
    if-nez v2, :cond_5a

    const v2, -0x677cb21b

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    if-nez v2, :cond_4a

    const v2, 0x77e70677

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    move v14, v11

    goto/16 :goto_37

    :cond_4a
    const v3, 0x77e70678

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    const v3, -0x677ca73e

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v3, v4}, [Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move v5, v11

    :goto_2d
    if-ge v5, v4, :cond_59

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-virtual {v1, v7}, Lp1/q;->h(Z)Z

    move-result v14

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_4b

    if-ne v15, v8, :cond_4c

    :cond_4b
    new-instance v15, Lf1/n1;

    invoke-direct {v15, v7, v13}, Lf1/n1;-><init>(ZLf1/w0;)V

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4c
    check-cast v15, Lu0/d1;

    invoke-virtual {v1, v7}, Lp1/q;->h(Z)Z

    move-result v14

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v14, :cond_4d

    if-ne v6, v8, :cond_4f

    :cond_4d
    if-eqz v7, :cond_4e

    new-instance v6, Lf1/d0;

    invoke-direct {v6, v13, v11}, Lf1/d0;-><init>(Lf1/w0;I)V

    goto :goto_2e

    :cond_4e
    new-instance v6, Lf1/d0;

    invoke-direct {v6, v13, v10}, Lf1/d0;-><init>(Lf1/w0;I)V

    :goto_2e
    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4f
    check-cast v6, Lc93/a;

    if-eqz v7, :cond_50

    iget-object v14, v2, Lf1/u;->a:Lf1/t;

    iget-object v14, v14, Lf1/t;->a:Lw3/j;

    :goto_2f
    move-object/from16 v17, v14

    goto :goto_30

    :cond_50
    iget-object v14, v2, Lf1/u;->b:Lf1/t;

    iget-object v14, v14, Lf1/t;->a:Lw3/j;

    goto :goto_2f

    :goto_30
    if-eqz v7, :cond_54

    invoke-virtual {v13}, Lf1/w0;->g()Lf1/u;

    move-result-object v14

    if-nez v14, :cond_52

    :cond_51
    :goto_31
    const/4 v10, 0x0

    goto :goto_32

    :cond_52
    iget-object v14, v14, Lf1/u;->a:Lf1/t;

    invoke-virtual {v13, v14}, Lf1/w0;->d(Lf1/t;)Lf1/l;

    move-result-object v10

    if-nez v10, :cond_53

    goto :goto_31

    :cond_53
    iget v14, v14, Lf1/t;->b:I

    iget-object v10, v10, Lf1/l;->c:Le1/i;

    invoke-virtual {v10}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll3/r0;

    if-eqz v10, :cond_51

    invoke-static {v10, v14}, Lu0/n0;->r(Ll3/r0;I)F

    move-result v10

    :goto_32
    move/from16 v21, v10

    goto :goto_34

    :cond_54
    invoke-virtual {v13}, Lf1/w0;->g()Lf1/u;

    move-result-object v10

    if-nez v10, :cond_55

    :goto_33
    goto :goto_31

    :cond_55
    iget-object v10, v10, Lf1/u;->b:Lf1/t;

    invoke-virtual {v13, v10}, Lf1/w0;->d(Lf1/t;)Lf1/l;

    move-result-object v14

    if-nez v14, :cond_56

    goto :goto_33

    :cond_56
    iget v10, v10, Lf1/t;->b:I

    iget-object v14, v14, Lf1/l;->c:Le1/i;

    invoke-virtual {v14}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll3/r0;

    if-eqz v14, :cond_51

    invoke-static {v14, v10}, Lu0/n0;->r(Ll3/r0;I)F

    move-result v10

    goto :goto_32

    :goto_34
    new-instance v10, Lf1/g0;

    invoke-direct {v10, v6}, Lf1/g0;-><init>(Lc93/a;)V

    iget-boolean v6, v2, Lf1/u;->c:Z

    invoke-virtual {v1, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v14, :cond_58

    if-ne v11, v8, :cond_57

    goto :goto_35

    :cond_57
    const/4 v14, 0x0

    goto :goto_36

    :cond_58
    :goto_35
    new-instance v11, Lf1/e0;

    const/4 v14, 0x0

    invoke-direct {v11, v15, v14}, Lf1/e0;-><init>(Lu0/d1;I)V

    invoke-virtual {v1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_36
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v9, v15, v11}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/16 v24, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v23, v1

    move/from16 v18, v6

    move/from16 v16, v7

    move-object v15, v10

    invoke-static/range {v15 .. v24}, Lf1/y0;->e(Lf1/m;ZLw3/j;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 v5, v5, 0x1

    move v11, v14

    const/4 v6, 0x0

    const/4 v10, 0x1

    goto/16 :goto_2d

    :cond_59
    move v14, v11

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    :goto_37
    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    goto :goto_38

    :cond_5a
    move v14, v11

    const v2, 0x7805236b

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    goto :goto_38

    :cond_5b
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_38
    return-object v12

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_5d

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_5c

    goto :goto_39

    :cond_5c
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_3b

    :cond_5d
    :goto_39
    check-cast v14, Ll0/l1;

    invoke-static {v14, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->e:Ll0/h;

    check-cast v13, Lx1/b;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    invoke-static {v1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v5, v1

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_5e

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3a

    :cond_5e
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3a
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_5f

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_60

    :cond_5f
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_60
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Ll0/z;->a:Ll0/z;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v13, v2, v1, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_3b
    return-object v12

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_62

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_61

    goto :goto_3c

    :cond_61
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_3f

    :cond_62
    :goto_3c
    check-cast v14, Ljava/lang/Integer;

    if-eqz v14, :cond_63

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v6

    :goto_3d
    move-wide/from16 v30, v6

    goto :goto_3e

    :cond_63
    sget-wide v6, Li2/x;->n:J

    goto :goto_3d

    :goto_3e
    sget-object v2, Ld40/p;->e:Ld40/k;

    invoke-static {v2, v1}, Ld40/r;->g(Ld40/k;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v48

    int-to-float v2, v5

    const/4 v4, 0x5

    int-to-float v4, v4

    invoke-static {v9, v2, v2, v2, v4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast v1, Lp1/q;

    const v4, 0x1c0c4fac

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_64

    new-instance v4, Lb01/f;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lb01/f;-><init>(I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_64
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    invoke-static {v2, v14, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v29

    move-object/from16 v28, v13

    check-cast v28, Ljava/lang/String;

    new-instance v2, Lw3/k;

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    const/16 v51, 0x0

    const v52, 0xfdf8

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const-wide/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v50, 0x0

    move-object/from16 v49, v1

    move-object/from16 v40, v2

    invoke-static/range {v28 .. v52}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3f
    return-object v12

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_66

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_65

    goto :goto_40

    :cond_65
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_41

    :cond_66
    :goto_40
    check-cast v14, Lzy/c;

    invoke-static {v14, v1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    check-cast v13, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    iget-object v3, v13, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->E:Ljava/lang/Integer;

    const/4 v14, 0x0

    invoke-static {v2, v3, v1, v14}, Lds/q;->d(Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    :goto_41
    return-object v12

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object v4, v14

    check-cast v4, Le30/c;

    and-int/2addr v2, v3

    if-ne v2, v15, :cond_68

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_67

    goto :goto_42

    :cond_67
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_43

    :cond_68
    :goto_42
    iget-object v2, v4, Le30/c;->M:Lr20/d;

    iget-object v2, v2, Lr20/d;->g:Ln53/e;

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr20/s;

    check-cast v1, Lp1/q;

    const v5, -0x415db431

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_69

    if-ne v5, v8, :cond_6a

    :cond_69
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr20/s;

    invoke-interface {v2}, Lr20/s;->k()Lec3/f2;

    move-result-object v5

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6a
    check-cast v5, Lec3/f2;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    invoke-static {v5, v1, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lb30/j3;

    iget-object v2, v4, Le30/c;->M:Lr20/d;

    invoke-virtual {v2}, Lr20/d;->a()Z

    move-result v20

    check-cast v13, Lp1/c1;

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/16 v26, 0x1

    xor-int/lit8 v21, v2, 0x1

    check-cast v14, Le30/c;

    const v2, -0x415d8c48

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6b

    if-ne v3, v8, :cond_6c

    :cond_6b
    new-instance v28, Lb30/i0;

    const/16 v34, 0x0

    const/16 v35, 0x2

    const/16 v29, 0x0

    const-class v31, Le30/c;

    const-string v32, "handleBackPressed"

    const-string v33, "handleBackPressed()V"

    move-object/from16 v30, v14

    invoke-direct/range {v28 .. v35}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v3, v28

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6c
    check-cast v3, Lj93/g;

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    move-object/from16 v19, v3

    check-cast v19, Lc93/a;

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v15 .. v21}, Lb30/g3;->c(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    :goto_43
    return-object v12

    :pswitch_1b
    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v3

    if-ne v1, v15, :cond_6e

    move-object v1, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6d

    goto :goto_44

    :cond_6d
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_45

    :cond_6e
    :goto_44
    move-object v2, v14

    check-cast v2, Lh20/w0;

    sget-object v3, Lb30/p2;->x:Lb30/p2;

    move-object v5, v13

    check-cast v5, Lf0/r1;

    const/16 v7, 0x30

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lds/p;->i(Le30/c;Lb30/p2;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;I)V

    :goto_45
    return-object v12

    :pswitch_1c
    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/2addr v1, v3

    if-ne v1, v15, :cond_70

    move-object/from16 v1, v17

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6f

    goto :goto_46

    :cond_6f
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_47

    :cond_70
    :goto_46
    check-cast v14, Lh20/k4;

    move-object v1, v13

    move-object v13, v14

    sget-object v14, Lb30/p2;->w:Lb30/p2;

    move-object/from16 v16, v1

    check-cast v16, Lf0/r1;

    const/16 v18, 0x30

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, Lds/p;->i(Le30/c;Lb30/p2;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;I)V

    :goto_47
    return-object v12

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
