.class public final synthetic Ljs2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Ljs2/h;->w:I

    iput-object p1, p0, Ljs2/h;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljs2/h;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljs2/h;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Ljs2/h;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, v1, Ljs2/h;->z:Ljava/lang/Object;

    iget-object v9, v1, Ljs2/h;->y:Ljava/lang/Object;

    iget-object v10, v1, Ljs2/h;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v9, Lio0/v;

    check-cast v8, Lp1/c1;

    check-cast v0, Ljava/lang/String;

    invoke-static {v10, v9, v8, v0}, Lno0/l0;->n(Lkotlin/jvm/functions/Function1;Lio0/v;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v10, Lko0/d;

    check-cast v9, Lko0/e;

    check-cast v8, Ll83/h;

    check-cast v0, Llo0/z;

    invoke-static {v10, v9, v8, v0}, Lno0/h0;->d(Lko0/d;Lko0/e;Ll83/h;Llo0/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v10, Ljava/util/List;

    check-cast v9, Lcom/whoop/design/models/modal/BottomSheet;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ln0/q;

    invoke-static {v10, v9, v8, v0}, Lno0/i;->i(Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheet;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v10, Ljava/util/ArrayList;

    check-cast v9, Ljava/util/ArrayList;

    check-cast v8, Ljava/util/ArrayList;

    check-cast v0, Lk2/e;

    invoke-static {v10, v9, v8, v0}, Ln22/b;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v10, Lg20/x;

    move-object v15, v9

    check-cast v15, Ljava/lang/Integer;

    check-cast v8, Lk83/a;

    move-object v14, v0

    check-cast v14, Lj/d;

    const-string v0, "hostActivityLauncher"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ln10/j0;

    invoke-direct {v12, v8, v5}, Ln10/j0;-><init>(Lk83/a;I)V

    new-instance v13, Ln10/j0;

    invoke-direct {v13, v8, v6}, Ln10/j0;-><init>(Lk83/a;I)V

    iget-object v0, v10, Lg20/x;->a:Ld1/j;

    iget-object v2, v0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v2, Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    iget-object v0, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/util/Set;

    new-instance v11, Lg20/w;

    invoke-direct/range {v11 .. v17}, Lg20/w;-><init>(Ln10/j0;Ln10/j0;Lj/d;Ljava/lang/Integer;ZLjava/util/Set;)V

    return-object v11

    :pswitch_4
    check-cast v10, Ljava/lang/String;

    check-cast v9, Ljava/lang/String;

    check-cast v8, Ln10/g;

    check-cast v0, Lux/e;

    const-string v2, "$this$createConfirmAction"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v9, :cond_0

    new-instance v2, Ly00/a6;

    invoke-direct {v2, v9, v4}, Ly00/a6;-><init>(Ljava/lang/String;Ly00/d;)V

    move-object v4, v2

    :cond_0
    iget-object v2, v8, Ln10/g;->d:Ly00/n;

    invoke-virtual {v0, v10, v4, v2}, Lux/e;->b(Ljava/lang/String;Ly00/a6;Ly00/n;)Ly00/s;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v10, Lc93/a;

    check-cast v9, Lc93/a;

    check-cast v8, Lmt2/f;

    check-cast v0, Lmt2/g;

    invoke-static {v10, v9, v8, v0}, Lmt2/e;->f(Lc93/a;Lc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v10, Lmq0/g;

    check-cast v9, Lbq0/c;

    check-cast v8, Landroid/graphics/Bitmap;

    check-cast v0, Landroid/view/View;

    invoke-static {v10, v9, v8, v0}, Lmq0/g$b;->i(Lmq0/g;Lbq0/c;Landroid/graphics/Bitmap;Landroid/view/View;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v10, Lmp0/b0;

    check-cast v9, Landroidx/appcompat/widget/SwitchCompat;

    check-cast v8, Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;

    check-cast v0, Landroid/view/View;

    invoke-static {v10, v9, v8, v0}, Lmp0/b0;->K(Lmp0/b0;Landroidx/appcompat/widget/SwitchCompat;Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;Landroid/view/View;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v10, Lmp0/b0;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lip0/h;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v10, v9, v8, v0}, Lmp0/b0;->R(Lmp0/b0;Lkotlin/jvm/functions/Function1;Lip0/h;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v10, Lmp0/b0;

    check-cast v9, Landroidx/appcompat/widget/SwitchCompat;

    check-cast v8, Lip0/h;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v10, v9, v8, v0}, Lmp0/b0;->E(Lmp0/b0;Landroidx/appcompat/widget/SwitchCompat;Lip0/h;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v10, Lvc1/a;

    check-cast v9, Lm91/o;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v9, v8, v0}, Lm91/g;->a(Lvc1/a;Lm91/o;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v10, Lp1/h1;

    check-cast v9, Ljava/util/List;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v0, Ljava/lang/String;

    invoke-static {v10, v9, v8, v0}, Lm81/e;->c(Lp1/h1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v10, Ll61/d;

    check-cast v9, Li91/h;

    check-cast v8, Li91/h;

    check-cast v0, Lk2/e;

    invoke-static {v10, v9, v8, v0}, Lm61/b;->b(Ll61/d;Li91/h;Li91/h;Lk2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v10, Ly2/t0;

    check-cast v9, Lm1/v;

    check-cast v8, Ly2/j1;

    check-cast v0, Ly2/i1;

    invoke-interface {v10}, Ly2/r;->A()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v9, Lm1/v;->O:Lm1/g;

    invoke-virtual {v2}, Lm1/g;->d()Lm1/b0;

    move-result-object v2

    iget-object v4, v9, Lm1/v;->O:Lm1/g;

    iget-object v4, v4, Lm1/g;->h:Lp1/f0;

    invoke-virtual {v4}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v2

    goto :goto_0

    :cond_1
    iget-object v2, v9, Lm1/v;->O:Lm1/g;

    invoke-virtual {v2}, Lm1/g;->f()F

    move-result v2

    :goto_0
    iget-object v4, v9, Lm1/v;->Q:Lh0/d2;

    sget-object v9, Lh0/d2;->x:Lh0/d2;

    if-ne v4, v9, :cond_2

    move v9, v2

    goto :goto_1

    :cond_2
    move v9, v3

    :goto_1
    sget-object v10, Lh0/d2;->w:Lh0/d2;

    if-ne v4, v10, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    iput-boolean v6, v0, Ly2/i1;->w:Z

    invoke-static {v9}, Le93/b;->X(F)I

    move-result v4

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    invoke-virtual {v0, v8, v4, v2, v3}, Ly2/i1;->f(Ly2/j1;IIF)V

    iput-boolean v5, v0, Ly2/i1;->w:Z

    return-object v7

    :pswitch_e
    check-cast v10, Ljava/lang/String;

    check-cast v9, Lbc3/c0;

    check-cast v8, Ll1/x4;

    check-cast v0, Li3/z;

    new-instance v2, Ll01/q;

    const/16 v3, 0x18

    invoke-direct {v2, v3, v9, v8}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v3, Li3/w;->a:[Lj93/z;

    sget-object v3, Li3/k;->c:Li3/y;

    new-instance v4, Li3/a;

    invoke-direct {v4, v10, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast v0, Li3/l;

    invoke-virtual {v0, v3, v4}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v7

    :pswitch_f
    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v9, Llg2/b;

    check-cast v8, Lp1/c1;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v10, v9, v8, v0}, Llg2/c;->f(Lkotlin/jvm/functions/Function1;Llg2/b;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v10, Ly3/c;

    check-cast v9, Lp1/a1;

    check-cast v8, Lp1/c1;

    check-cast v0, Ly2/y;

    invoke-static {v10, v9, v8, v0}, Llf0/l1;->d(Ly3/c;Lp1/a1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v10, Lk91/b;

    check-cast v9, Li2/k0;

    check-cast v8, Li2/k0;

    check-cast v0, Lk2/c;

    invoke-static {v10, v9, v8, v0}, Llf0/h1;->b(Lk91/b;Li2/k0;Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v10, Lic0/a;

    check-cast v9, Lic0/b;

    check-cast v8, Ll83/h;

    check-cast v0, Ljc0/a;

    invoke-static {v10, v9, v8, v0}, Llc0/h;->c(Lic0/a;Lic0/b;Ll83/h;Ljc0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v9, Lj72/b;

    check-cast v8, Lp1/c1;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v10, v9, v8, v0}, Ll72/d;->c(Lkotlin/jvm/functions/Function1;Lj72/b;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v10, Ll32/b;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lj32/j;

    invoke-static {v10, v9, v8, v0}, Ll32/c;->d(Ll32/b;Lkotlin/jvm/functions/Function1;Lj32/j;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v10, Lm1/g0;

    check-cast v9, Ll0/k1;

    check-cast v8, Lb2/f;

    check-cast v0, Lk2/c;

    invoke-interface {v10}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/e;

    iget-wide v4, v2, Lh2/e;->a:J

    const/16 v2, 0x20

    shr-long v10, v4, v2

    long-to-int v6, v10

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpl-float v10, v6, v3

    if-lez v10, :cond_6

    sget v10, Ll1/c3;->a:F

    check-cast v0, La3/p0;

    invoke-virtual {v0, v10}, La3/p0;->q0(F)F

    move-result v10

    iget-object v11, v0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v12

    invoke-interface {v9, v12}, Ll0/k1;->b(Ly3/m;)F

    move-result v12

    invoke-virtual {v0, v12}, La3/p0;->q0(F)F

    move-result v12

    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v13

    invoke-interface {v9, v13}, Ll0/k1;->c(Ly3/m;)F

    move-result v9

    invoke-virtual {v0, v9}, La3/p0;->q0(F)F

    move-result v9

    invoke-static {v6}, Le93/b;->X(F)I

    move-result v13

    invoke-interface {v11}, Lk2/e;->d()J

    move-result-wide v14

    shr-long/2addr v14, v2

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    sub-float/2addr v14, v12

    sub-float/2addr v14, v9

    invoke-static {v14}, Le93/b;->X(F)I

    move-result v9

    invoke-virtual {v0}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v14

    invoke-interface {v8, v13, v9, v14}, Lb2/f;->a(IILy3/m;)I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v8, v12

    const/4 v9, 0x2

    int-to-float v9, v9

    div-float/2addr v6, v9

    add-float/2addr v8, v6

    sub-float v12, v8, v6

    sub-float/2addr v12, v10

    cmpg-float v13, v12, v3

    if-gez v13, :cond_4

    move v15, v3

    goto :goto_3

    :cond_4
    move v15, v12

    :goto_3
    add-float/2addr v8, v6

    add-float/2addr v8, v10

    invoke-interface {v11}, Lk2/e;->d()J

    move-result-wide v12

    shr-long v2, v12, v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpl-float v3, v8, v2

    if-lez v3, :cond_5

    move/from16 v17, v2

    goto :goto_4

    :cond_5
    move/from16 v17, v8

    :goto_4
    const-wide v2, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    neg-float v3, v2

    div-float v16, v3, v9

    div-float v18, v2, v9

    iget-object v2, v11, Lk2/b;->x:La3/p;

    invoke-virtual {v2}, La3/p;->A()J

    move-result-wide v3

    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v5

    invoke-interface {v5}, Li2/v;->q()V

    :try_start_0
    iget-object v5, v2, La3/p;->x:Ljava/lang/Object;

    move-object v14, v5

    check-cast v14, Laj/d;

    const/16 v19, 0x0

    invoke-virtual/range {v14 .. v19}, Laj/d;->d(FFFFI)V

    invoke-virtual {v0}, La3/p0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2, v3, v4}, Ld;->z(La3/p;J)V

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v2, v3, v4}, Ld;->z(La3/p;J)V

    throw v0

    :cond_6
    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    :goto_5
    return-object v7

    :pswitch_16
    check-cast v10, Lbc3/c0;

    check-cast v9, Ll1/w3;

    check-cast v8, Lc93/a;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-instance v2, Lg1/l;

    const/4 v3, 0x4

    invoke-direct {v2, v9, v0, v4, v3}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v10, v4, v4, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    new-instance v2, Ll1/j2;

    invoke-direct {v2, v9, v8, v6}, Ll1/j2;-><init>(Ll1/w3;Lc93/a;I)V

    invoke-virtual {v0, v2}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-object v7

    :pswitch_17
    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v9, Lky2/g$a$a;

    check-cast v8, Lky2/i;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v10, v9, v8, v0}, Lky2/b;->e(Lkotlin/jvm/functions/Function1;Lky2/g$a$a;Lky2/i;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    check-cast v10, Lim2/b;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Ll83/h;

    check-cast v0, Lim2/a;

    invoke-static {v10, v9, v8, v0}, Lkm2/f;->a(Lim2/b;Lkotlin/jvm/functions/Function1;Ll83/h;Lim2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v10, Lnl2/c$a;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lp1/a1;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v10, v9, v8, v0}, Lkl2/b;->c(Lnl2/c$a;Lkotlin/jvm/functions/Function1;Lp1/a1;I)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v10, La91/b;

    check-cast v0, Lp1/i0;

    invoke-static {v10, v9, v8, v0}, Lkd1/y;->c(La91/b;Ljava/lang/Object;Ljava/lang/Object;Lp1/i0;)Lp1/h0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    check-cast v10, Ljava/lang/Integer;

    check-cast v9, Lo12/e;

    check-cast v8, Lcom/whoop/whooplabs/feature/navigation/b;

    check-cast v0, Lp12/e;

    invoke-static {v10, v9, v8, v0}, Ljx2/f;->i(Ljava/lang/Integer;Lo12/e;Lcom/whoop/whooplabs/feature/navigation/b;Lp12/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    check-cast v10, Lgs2/a;

    check-cast v9, Lgs2/c;

    check-cast v8, Ll83/h;

    check-cast v0, Lhs2/a;

    invoke-static {v10, v9, v8, v0}, Ljs2/i;->g(Lgs2/a;Lgs2/c;Ll83/h;Lhs2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

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
