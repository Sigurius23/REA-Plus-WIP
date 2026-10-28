.class public final synthetic Lep1/g;
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
.method public synthetic constructor <init>(Lh0/w;Lh0/d4;Lbc3/k1;Lh0/a3;)V
    .locals 0

    .line 1
    const/16 p2, 0x11

    iput p2, p0, Lep1/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep1/g;->x:Ljava/lang/Object;

    iput-object p3, p0, Lep1/g;->y:Ljava/lang/Object;

    iput-object p4, p0, Lep1/g;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lep1/g;->w:I

    iput-object p1, p0, Lep1/g;->x:Ljava/lang/Object;

    iput-object p2, p0, Lep1/g;->y:Ljava/lang/Object;

    iput-object p3, p0, Lep1/g;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/internal/d0;Lh0/b0;)V
    .locals 0

    .line 3
    const/16 p4, 0x12

    iput p4, p0, Lep1/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep1/g;->x:Ljava/lang/Object;

    iput-object p2, p0, Lep1/g;->y:Ljava/lang/Object;

    iput-object p3, p0, Lep1/g;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lep1/g;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x1

    iget-object v10, v0, Lep1/g;->z:Ljava/lang/Object;

    iget-object v11, v0, Lep1/g;->y:Ljava/lang/Object;

    iget-object v12, v0, Lep1/g;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v12, Lid2/j;

    check-cast v11, Landroidx/compose/ui/platform/ComposeView;

    check-cast v10, Landroid/view/View;

    check-cast v1, Lp1/i0;

    invoke-static {v12, v11, v10, v1}, Lid2/n;->h(Lid2/j;Landroidx/compose/ui/platform/ComposeView;Landroid/view/View;Lp1/i0;)Lp1/h0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v12, Lgd0/c$e;

    check-cast v11, Lkotlin/jvm/functions/Function1;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lob0/a;

    invoke-static {v12, v11, v10, v1}, Lid0/c;->g(Lgd0/c$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lob0/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v12, Lkotlin/jvm/functions/Function3;

    check-cast v11, Lic2/h;

    check-cast v10, Lic2/g;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v12, v11, v10, v1}, Lic2/f;->c(Lkotlin/jvm/functions/Function3;Lic2/h;Lic2/g;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v12, Lbc3/c0;

    move-object v14, v11

    check-cast v14, Lh40/k;

    move-object v15, v10

    check-cast v15, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    check-cast v1, Li20/v;

    const-string v2, "result"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Lg20/p;

    const/16 v18, 0x10

    const/16 v17, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v18}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v1, v17

    invoke-static {v12, v1, v1, v13, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    :pswitch_3
    check-cast v12, Lkotlin/jvm/functions/Function1;

    check-cast v11, Lhy0/p0;

    check-cast v10, Lp1/c1;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v12, v11, v10, v1}, Lhy0/n0;->a(Lkotlin/jvm/functions/Function1;Lhy0/p0;Lp1/c1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    check-cast v12, Lgv2/d;

    check-cast v11, Lp1/c1;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v12, v11, v10, v1}, Lhv2/i;->i(Lgv2/d;Lp1/c1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v12, Lh71/j;

    check-cast v11, Lp1/c1;

    check-cast v10, Lp1/c1;

    check-cast v1, Ly2/y;

    invoke-static {v12, v11, v10, v1}, Lh71/g;->h(Lh71/j;Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v12, Ljava/util/List;

    check-cast v11, Lkotlin/jvm/functions/Function3;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v12, v11, v10, v1}, Lh51/d;->e(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v12, Lh21/d;

    check-cast v11, Lp1/c1;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v12, v11, v10, v1}, Lh21/c;->f(Lh21/d;Lp1/c1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    check-cast v12, Ljava/util/List;

    check-cast v11, Lq0/b;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v12, v11, v10, v1}, Lh02/b0;->e(Ljava/util/List;Lq0/b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    check-cast v12, Lv2/c;

    check-cast v11, Lu2/v;

    check-cast v10, Lh0/f1;

    check-cast v1, Lu2/r;

    const-wide/16 v4, 0x0

    invoke-static {v12, v1, v4, v5}, Lsb3/a;->a(Lv2/c;Lu2/r;J)V

    check-cast v11, Lu2/h0;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-object v1, v1, La3/n0;->Z:Lb3/j3;

    invoke-interface {v1}, Lb3/j3;->f()F

    move-result v1

    invoke-static {v1, v1}, Ls4/i;->a(FF)J

    move-result-wide v1

    invoke-virtual {v12, v1, v2}, Lv2/c;->a(J)J

    move-result-wide v1

    iget-object v9, v12, Lv2/c;->a:Lrm/j1;

    iget-object v11, v9, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v11, [Lv2/a;

    invoke-static {v11, v6}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    iput v7, v9, Lrm/j1;->c:I

    iget-object v9, v12, Lv2/c;->b:Lrm/j1;

    iget-object v11, v9, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v11, [Lv2/a;

    invoke-static {v11, v6}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    iput v7, v9, Lrm/j1;->c:I

    iput-wide v4, v12, Lv2/c;->c:J

    iget-object v4, v10, Lh0/f1;->U:Ldc3/h;

    if-eqz v4, :cond_2

    new-instance v5, Lh0/j0;

    sget-object v6, Lh0/k1;->a:Lh0/j1;

    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_0

    move v6, v3

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v6

    :goto_0
    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v3

    :goto_1
    invoke-static {v6, v3}, Ls4/i;->a(FF)J

    move-result-wide v1

    invoke-direct {v5, v1, v2}, Lh0/j0;-><init>(J)V

    invoke-interface {v4, v5}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v8

    :pswitch_a
    check-cast v12, Lkotlin/jvm/internal/d0;

    check-cast v11, Lh0/k2;

    check-cast v10, Lkotlin/jvm/internal/d0;

    check-cast v1, Ld0/k;

    iget-object v2, v1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget v3, v12, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v2, v3

    invoke-interface {v11, v2}, Lh0/k2;->a(F)F

    move-result v3

    iget-object v4, v1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iput v4, v12, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v1}, Ld0/k;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iput v4, v10, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    invoke-virtual {v1}, Ld0/k;->a()V

    :cond_3
    return-object v8

    :pswitch_b
    check-cast v12, Lh0/w;

    check-cast v11, Lbc3/k1;

    check-cast v10, Lh0/a3;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-boolean v2, v12, Lh0/w;->Q:Z

    if-eqz v2, :cond_4

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_4
    const/high16 v2, -0x40800000    # -1.0f

    :goto_2
    mul-float v3, v2, v1

    iget-object v4, v12, Lh0/w;->P:Lh0/c3;

    invoke-virtual {v4, v3}, Lh0/c3;->h(F)J

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Lh0/c3;->e(J)J

    move-result-wide v12

    iget-object v3, v10, Lh0/a3;->a:Lh0/c3;

    iget-object v5, v3, Lh0/c3;->k:Lh0/k2;

    invoke-virtual {v3, v5, v12, v13, v9}, Lh0/c3;->c(Lh0/k2;JI)J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Lh0/c3;->e(J)J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Lh0/c3;->g(J)F

    move-result v3

    mul-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v2, v2, v4

    if-gez v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Scroll animation cancelled because scroll was not consumed ("

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, " < "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-interface {v11, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_5
    return-object v8

    :pswitch_c
    check-cast v12, Lh/i;

    check-cast v11, Lp1/c1;

    check-cast v10, Lp1/c1;

    check-cast v1, Lgv1/l;

    invoke-static {v12, v11, v10, v1}, Lgv1/g;->g(Lh/i;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v12, Lc93/a;

    check-cast v11, Lbc3/c0;

    check-cast v10, Lg1/y3;

    check-cast v1, Ljava/lang/String;

    invoke-static {v12, v11, v10, v1}, Lgt1/n;->l(Lc93/a;Lbc3/c0;Lg1/y3;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    check-cast v12, Lbc3/c0;

    check-cast v11, Lh0/n1;

    check-cast v10, Lp1/c1;

    check-cast v1, Lh2/b;

    new-instance v1, Ld30/o;

    const/16 v2, 0x12

    invoke-direct {v1, v11, v10, v6, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v12, v6, v6, v1, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    :pswitch_f
    check-cast v12, Lp1/c1;

    check-cast v11, Lp1/t2;

    check-cast v10, Lp1/t2;

    check-cast v1, Li2/g0;

    invoke-interface {v11}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    check-cast v1, Li2/x0;

    invoke-virtual {v1, v2}, Li2/x0;->p(F)V

    invoke-interface {v11}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v1, v2}, Li2/x0;->r(F)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v1, v2}, Li2/x0;->a(F)V

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/e1;

    iget-wide v2, v2, Li2/e1;->a:J

    invoke-virtual {v1, v2, v3}, Li2/x0;->y(J)V

    return-object v8

    :pswitch_10
    check-cast v12, Ljava/lang/String;

    check-cast v11, Lg1/s0;

    check-cast v10, Lbc3/c0;

    check-cast v1, Li3/z;

    invoke-static {v12, v1}, Li3/w;->g(Ljava/lang/String;Li3/z;)V

    iget-object v2, v11, Lg1/s0;->a:Lg1/a0;

    iget-object v2, v2, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lg1/t0;->w:Lg1/t0;

    if-eq v2, v3, :cond_6

    new-instance v2, Lcd1/d;

    invoke-direct {v2, v11, v10}, Lcd1/d;-><init>(Lg1/s0;Lbc3/c0;)V

    sget-object v3, Li3/k;->u:Li3/y;

    new-instance v4, Li3/a;

    invoke-direct {v4, v6, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast v1, Li3/l;

    invoke-virtual {v1, v3, v4}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_6
    return-object v8

    :pswitch_11
    check-cast v12, Ly2/t0;

    check-cast v11, Lg1/d2;

    check-cast v10, Ly2/j1;

    check-cast v1, Ly2/i1;

    invoke-interface {v12}, Ly2/r;->A()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v11, Lg1/d2;->O:Lg1/a0;

    invoke-virtual {v2}, Lg1/a0;->e()Lg1/k3;

    move-result-object v2

    iget-object v4, v11, Lg1/d2;->O:Lg1/a0;

    iget-object v4, v4, Lg1/a0;->h:Lp1/f0;

    invoke-virtual {v4}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lg1/k3;->d(Ljava/lang/Object;)F

    move-result v2

    goto :goto_3

    :cond_7
    iget-object v2, v11, Lg1/d2;->O:Lg1/a0;

    invoke-virtual {v2}, Lg1/a0;->g()F

    move-result v2

    :goto_3
    iget-object v4, v11, Lg1/d2;->Q:Lh0/d2;

    sget-object v5, Lh0/d2;->x:Lh0/d2;

    if-ne v4, v5, :cond_8

    move v5, v2

    goto :goto_4

    :cond_8
    move v5, v3

    :goto_4
    sget-object v6, Lh0/d2;->w:Lh0/d2;

    if-ne v4, v6, :cond_9

    move v3, v2

    :cond_9
    invoke-static {v5}, Le93/b;->X(F)I

    move-result v2

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    invoke-static {v10, v2, v3, v1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    return-object v8

    :pswitch_12
    check-cast v12, Ly3/c;

    check-cast v11, Lkotlin/jvm/functions/Function1;

    check-cast v10, Ld0/l;

    check-cast v1, Lg1/t0;

    new-instance v2, Lg1/s0;

    invoke-direct {v2, v1, v12, v11, v10}, Lg1/s0;-><init>(Lg1/t0;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;)V

    return-object v2

    :pswitch_13
    check-cast v12, Ly2/j1;

    check-cast v11, Ly2/t0;

    check-cast v10, Ly2/j1;

    check-cast v1, Ly2/i1;

    iget v2, v12, Ly2/j1;->w:I

    sget v3, Lg1/p0;->a:F

    invoke-interface {v11, v3}, Ly3/c;->F(F)I

    move-result v3

    mul-int/2addr v3, v4

    if-le v2, v3, :cond_a

    sget v2, Lg1/p0;->b:F

    goto :goto_5

    :cond_a
    sget v2, Lg1/p0;->c:F

    :goto_5
    invoke-static {v10, v7, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget v3, v10, Ly2/j1;->w:I

    invoke-interface {v11, v2}, Ly3/c;->F(F)I

    move-result v2

    add-int/2addr v2, v3

    iget v3, v12, Ly2/j1;->x:I

    neg-int v3, v3

    div-int/2addr v3, v4

    invoke-static {v12, v2, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    return-object v8

    :pswitch_14
    check-cast v12, Lgr1/q;

    check-cast v11, Lkotlin/jvm/functions/Function1;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Leb/s0;

    invoke-static {v12, v11, v10, v1}, Lfr1/b;->g(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v12, Lc93/m;

    check-cast v11, Lp1/c1;

    check-cast v10, Lp1/c1;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v12, v11, v10, v1}, Lf41/p;->o(Lc93/m;Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v12, Lf1/s1;

    check-cast v11, Lbc3/c0;

    check-cast v10, Landroid/content/Context;

    check-cast v1, Lw0/a;

    invoke-virtual {v1}, Lw0/a;->a()V

    iget-object v2, v1, Lw0/a;->a:La0/q0;

    sget-object v3, Lu0/b1;->x:[Lu0/b1;

    invoke-virtual {v12}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-wide v13, v3, Lq3/y;->b:J

    invoke-static {v13, v14}, Ll3/u0;->c(J)Z

    move-result v3

    if-nez v3, :cond_b

    iget-object v3, v12, Lf1/s1;->m:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v3, v12, Lf1/s1;->f:Lq3/g0;

    instance-of v3, v3, Lq3/s;

    if-nez v3, :cond_b

    move v3, v9

    goto :goto_6

    :cond_b
    move v3, v7

    :goto_6
    new-instance v13, Lf1/j1;

    invoke-direct {v13, v12, v6, v9}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    new-instance v14, Lf1/w1;

    invoke-direct {v14, v13, v11}, Lf1/w1;-><init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    new-instance v15, Lf1/z0;

    invoke-direct {v15, v9, v14, v6}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-eqz v3, :cond_c

    const v3, 0x1040003

    invoke-virtual {v13, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v13, Lx0/d;

    sget-object v14, Lx0/e;->a:Ljava/lang/Object;

    const v7, 0x1010311

    invoke-direct {v13, v14, v3, v7, v15}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v13}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_c
    sget-object v3, Lu0/b1;->x:[Lu0/b1;

    invoke-virtual {v12}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-wide v13, v3, Lq3/y;->b:J

    invoke-static {v13, v14}, Ll3/u0;->c(J)Z

    move-result v3

    if-nez v3, :cond_d

    iget-object v3, v12, Lf1/s1;->f:Lq3/g0;

    instance-of v3, v3, Lq3/s;

    if-nez v3, :cond_d

    move v3, v9

    goto :goto_7

    :cond_d
    const/4 v3, 0x0

    :goto_7
    new-instance v7, Lf1/j1;

    invoke-direct {v7, v12, v6, v4}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    new-instance v13, Lf1/w1;

    invoke-direct {v13, v7, v11}, Lf1/w1;-><init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    new-instance v14, Lf1/z0;

    invoke-direct {v14, v9, v13, v6}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-eqz v3, :cond_e

    const v3, 0x1040001

    invoke-virtual {v7, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lx0/d;

    sget-object v13, Lx0/e;->b:Ljava/lang/Object;

    const v15, 0x1010312

    invoke-direct {v7, v13, v3, v15, v14}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v7}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_e
    sget-object v3, Lu0/b1;->x:[Lu0/b1;

    iget-object v3, v12, Lf1/s1;->m:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v12, Lf1/s1;->x:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb3/q1;

    if-eqz v3, :cond_f

    iget-object v3, v3, Lb3/q1;->a:Landroid/content/ClipData;

    invoke-virtual {v3}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v3

    const-string v7, "text/*"

    invoke-virtual {v3, v7}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v3

    if-ne v3, v9, :cond_f

    move v3, v9

    goto :goto_8

    :cond_f
    const/4 v3, 0x0

    :goto_8
    new-instance v7, Lf1/j1;

    invoke-direct {v7, v12, v6, v5}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    new-instance v5, Lf1/w1;

    invoke-direct {v5, v7, v11}, Lf1/w1;-><init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    new-instance v11, Lf1/z0;

    invoke-direct {v11, v9, v5, v6}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-eqz v3, :cond_10

    const v3, 0x104000b

    invoke-virtual {v7, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lx0/d;

    sget-object v7, Lx0/e;->c:Ljava/lang/Object;

    const v13, 0x1010313

    invoke-direct {v5, v7, v3, v13, v11}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v5}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_10
    sget-object v3, Lu0/b1;->x:[Lu0/b1;

    invoke-virtual {v12}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-wide v13, v3, Lq3/y;->b:J

    invoke-static {v13, v14}, Ll3/u0;->d(J)I

    move-result v3

    invoke-virtual {v12}, Lf1/s1;->m()Lq3/y;

    move-result-object v5

    iget-object v5, v5, Lq3/y;->a:Ll3/g;

    iget-object v5, v5, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v3, v5, :cond_11

    move v3, v9

    goto :goto_9

    :cond_11
    const/4 v3, 0x0

    :goto_9
    new-instance v5, Lf1/v1;

    const/4 v7, 0x0

    invoke-direct {v5, v12, v7}, Lf1/v1;-><init>(Lf1/s1;I)V

    new-instance v7, Lf1/v1;

    invoke-direct {v7, v12, v9}, Lf1/v1;-><init>(Lf1/s1;I)V

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    new-instance v13, Lf1/z0;

    invoke-direct {v13, v9, v7, v5}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-eqz v3, :cond_12

    const v3, 0x104000d

    invoke-virtual {v11, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lx0/d;

    sget-object v7, Lx0/e;->d:Ljava/lang/Object;

    const v11, 0x101037e

    invoke-direct {v5, v7, v3, v11, v13}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v5}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_12
    sget-object v3, Lu0/b1;->x:[Lu0/b1;

    iget-object v3, v12, Lf1/s1;->m:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v12}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-wide v13, v3, Lq3/y;->b:J

    invoke-static {v13, v14}, Ll3/u0;->c(J)Z

    move-result v3

    if-eqz v3, :cond_13

    move v7, v9

    goto :goto_a

    :cond_13
    const/4 v7, 0x0

    :goto_a
    new-instance v3, Lf1/v1;

    invoke-direct {v3, v12, v4}, Lf1/v1;-><init>(Lf1/s1;I)V

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    new-instance v5, Lf1/z0;

    invoke-direct {v5, v9, v3, v6}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-eqz v7, :cond_14

    const v3, 0x104001a

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lx0/d;

    sget-object v6, Lx0/e;->e:Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-direct {v4, v6, v3, v7, v5}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_14
    invoke-virtual {v1}, Lw0/a;->a()V

    return-object v8

    :pswitch_17
    check-cast v12, Lf1/j;

    check-cast v11, Lf1/v;

    check-cast v10, Lkotlin/jvm/internal/b0;

    check-cast v1, Lu2/r;

    iget-wide v2, v1, Lu2/r;->c:J

    invoke-interface {v12, v2, v3, v11}, Lf1/j;->n(JLf1/v;)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v1}, Lu2/r;->a()V

    iput-boolean v9, v10, Lkotlin/jvm/internal/b0;->w:Z

    :cond_15
    return-object v8

    :pswitch_18
    check-cast v12, Lkotlin/jvm/functions/Function1;

    check-cast v11, Lny0/p0;

    check-cast v10, Lcy0/c;

    invoke-static {v12, v11, v10, v1}, Ley0/i;->g(Lkotlin/jvm/functions/Function1;Lny0/p0;Lcy0/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v12, Lby0/a;

    check-cast v11, Lby0/c;

    check-cast v10, Ll83/h;

    check-cast v1, Lcy0/a;

    invoke-static {v12, v11, v10, v1}, Ley0/i;->h(Lby0/a;Lby0/c;Ll83/h;Lcy0/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v12, Lkotlin/jvm/functions/Function1;

    check-cast v11, Lm91/u;

    check-cast v10, Lcy0/c$d;

    invoke-static {v12, v11, v10, v1}, Ley0/g;->a(Lkotlin/jvm/functions/Function1;Lm91/u;Lcy0/c$d;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v12, Ljava/util/List;

    check-cast v11, Lj31/k;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v12, v11, v10, v1}, Leu2/g;->f(Ljava/util/List;Lj31/k;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v12, Lcp1/g;

    check-cast v11, Lp1/a1;

    check-cast v10, Lp1/a1;

    invoke-static {v12, v11, v10, v1}, Lep1/h;->k(Lcp1/g;Lp1/a1;Lp1/a1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

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
