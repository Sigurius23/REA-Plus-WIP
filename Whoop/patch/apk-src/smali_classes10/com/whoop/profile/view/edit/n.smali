.class public final synthetic Lcom/whoop/profile/view/edit/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/whoop/profile/view/edit/n;->w:I

    iput-object p2, p0, Lcom/whoop/profile/view/edit/n;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/n;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lf1/k;La0/k0;Lf1/u;)V
    .locals 0

    .line 2
    const/16 p1, 0x1a

    iput p1, p0, Lcom/whoop/profile/view/edit/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/profile/view/edit/n;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/n;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lcom/whoop/profile/view/edit/n;->w:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, v0, Lcom/whoop/profile/view/edit/n;->y:Ljava/lang/Object;

    iget-object v8, v0, Lcom/whoop/profile/view/edit/n;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v8, Lf1/w0;

    check-cast v7, Landroid/content/Context;

    check-cast v1, Lw0/a;

    invoke-virtual {v1}, Lw0/a;->a()V

    iget-object v2, v1, Lw0/a;->a:La0/q0;

    sget-object v9, Lu0/b1;->x:[Lu0/b1;

    invoke-virtual {v8}, Lf1/w0;->i()Z

    move-result v9

    new-instance v10, Lf1/d0;

    const/4 v11, 0x5

    invoke-direct {v10, v8, v11}, Lf1/d0;-><init>(Lf1/w0;I)V

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    new-instance v12, Lf1/z0;

    invoke-direct {v12, v5, v10, v4}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-eqz v9, :cond_0

    const v4, 0x1040001

    invoke-virtual {v11, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v9, Lx0/d;

    sget-object v10, Lx0/e;->b:Ljava/lang/Object;

    const v11, 0x1010312

    invoke-direct {v9, v10, v4, v11, v12}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v9}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_0
    sget-object v4, Lu0/b1;->x:[Lu0/b1;

    iget-object v4, v8, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v8}, Lf1/w0;->k()Ly2/y;

    move-result-object v9

    invoke-virtual {v4, v9}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v11, v5

    :goto_0
    if-ge v11, v10, :cond_5

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf1/l;

    invoke-virtual {v12}, Lf1/l;->e()Ll3/g;

    move-result-object v13

    iget-object v14, v13, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_2

    move-object/from16 p1, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lf1/b1;->a()La0/k0;

    move-result-object v14

    move-object/from16 p1, v4

    iget-wide v3, v12, Lf1/l;->a:J

    invoke-virtual {v14, v3, v4}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf1/u;

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    iget-object v4, v3, Lf1/u;->a:Lf1/t;

    iget v4, v4, Lf1/t;->b:I

    iget-object v3, v3, Lf1/u;->b:Lf1/t;

    iget v3, v3, Lf1/t;->b:I

    sub-int/2addr v4, v3

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget-object v4, v13, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v3, v4, :cond_4

    :goto_1
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v4, p1

    goto :goto_0

    :cond_4
    :goto_2
    move v3, v5

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v3, 0x1

    :goto_4
    new-instance v4, Lf1/d0;

    const/4 v9, 0x6

    invoke-direct {v4, v8, v9}, Lf1/d0;-><init>(Lf1/w0;I)V

    new-instance v9, Lf1/d0;

    const/4 v10, 0x7

    invoke-direct {v9, v8, v10}, Lf1/d0;-><init>(Lf1/w0;I)V

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    new-instance v8, Lf1/z0;

    invoke-direct {v8, v5, v9, v4}, Lf1/z0;-><init>(ILc93/a;Lc93/a;)V

    if-nez v3, :cond_6

    const v3, 0x104000d

    invoke-virtual {v7, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lx0/d;

    sget-object v5, Lx0/e;->d:Ljava/lang/Object;

    const v7, 0x101037e

    invoke-direct {v4, v5, v3, v7, v8}, Lx0/d;-><init>(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v1}, Lw0/a;->a()V

    return-object v6

    :pswitch_0
    check-cast v8, Lf1/w0;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lf1/u;

    invoke-virtual {v8, v1}, Lf1/w0;->m(Lf1/u;)V

    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v6

    :pswitch_1
    check-cast v8, Lbc3/c0;

    check-cast v7, Lb3/r1;

    check-cast v1, Ll3/g;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, Ld30/o;

    const/16 v5, 0xc

    invoke-direct {v3, v7, v1, v4, v5}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v15, 0x1

    invoke-static {v8, v4, v2, v3, v15}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v6

    :pswitch_2
    check-cast v8, La0/k0;

    check-cast v7, Lf1/u;

    check-cast v1, Lf1/r;

    iget-object v2, v1, Lf1/r;->f:Ll3/r0;

    iget-object v2, v2, Ll3/r0;->a:Ll3/q0;

    iget-object v2, v2, Ll3/q0;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v8, v7, v1, v5, v2}, Lf1/k;->m(La0/k0;Lf1/u;Lf1/r;II)V

    return-object v6

    :pswitch_3
    check-cast v8, Lf01/o0;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v7, v1}, Lf01/n0;->c(Lf01/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lf01/d;

    invoke-static {v8, v7, v1}, Lf01/c;->b(Lkotlin/jvm/functions/Function1;Lf01/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v8, Lj0/i;

    check-cast v7, Lj0/h;

    check-cast v1, Ljava/lang/Throwable;

    check-cast v8, Lj0/j;

    invoke-virtual {v8, v7}, Lj0/j;->b(Lj0/h;)Z

    return-object v6

    :pswitch_6
    check-cast v8, Li2/m0;

    move-object v11, v7

    check-cast v11, Li2/t;

    check-cast v1, Lk2/c;

    move-object v9, v1

    check-cast v9, La3/p0;

    invoke-virtual {v9}, La3/p0;->a()V

    iget-object v10, v8, Li2/m0;->a:Li2/s0;

    const/4 v13, 0x0

    const/16 v14, 0x3c

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    return-object v6

    :pswitch_7
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lcy0/c$b;

    invoke-static {v8, v7, v1}, Ley0/g;->d(Lkotlin/jvm/functions/Function1;Lcy0/c$b;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lcp1/r;

    invoke-static {v8, v7, v1}, Lep1/w;->a(Lkotlin/jvm/functions/Function1;Lcp1/r;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lcp1/h;

    invoke-static {v8, v7, v1}, Lep1/i;->f(Lkotlin/jvm/functions/Function1;Lcp1/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lcp1/g;

    invoke-static {v8, v7, v1}, Lep1/h;->e(Lkotlin/jvm/functions/Function1;Lcp1/g;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    check-cast v8, Leo2/a;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ln0/q;

    invoke-static {v8, v7, v1}, Leo2/m;->d(Leo2/a;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    check-cast v8, Lcj1/k;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v7, v1}, Lej1/x;->d(Lcj1/k;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v8, Lu03/a;

    check-cast v7, Lv10/a;

    check-cast v1, Ls40/a;

    const-string v2, "host"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v8}, Lu03/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc20/a;

    iget-object v2, v2, Lc20/a;->f:Lj/d;

    if-eqz v2, :cond_7

    new-instance v1, Lux/v;

    invoke-direct {v1, v2}, Lux/v;-><init>(Lj/d;)V

    goto :goto_5

    :cond_7
    new-instance v2, Lux/u;

    invoke-direct {v2, v1, v7}, Lux/u;-><init>(Ls40/a;Lv10/a;)V

    move-object v1, v2

    :goto_5
    return-object v1

    :pswitch_e
    check-cast v8, Le10/i0;

    check-cast v7, La1/e;

    check-cast v1, Landroid/os/Parcelable;

    const-string v2, "result"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v8, Le10/i0;->a:Landroidx/lifecycle/k1;

    iget-object v3, v8, Le10/i0;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le10/g0;

    if-eqz v5, :cond_8

    invoke-virtual {v2, v4, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v8, Le10/i0;->b:Le10/j;

    iget-object v3, v5, Le10/g0;->w:Le10/l;

    iget-object v4, v5, Le10/g0;->x:Le10/k;

    iget-object v5, v5, Le10/g0;->y:Ln10/c0;

    invoke-interface {v2, v3, v4, v5, v1}, Le10/j;->f(Le10/l;Le10/k;Ln10/c0;Landroid/os/Parcelable;)Le10/i;

    move-result-object v1

    goto :goto_6

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Arguments should have been initialized before handling result!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v2, Le10/f;

    invoke-static {v1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v3

    sget-object v4, Le10/r;->a:Le10/r;

    invoke-direct {v2, v1, v3, v4}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    move-object v1, v2

    :goto_6
    invoke-virtual {v7, v1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v6

    :pswitch_f
    check-cast v8, Lp1/h1;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v8, v7, v1}, Ldn0/p;->n(Lp1/h1;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lc42/u;

    invoke-static {v8, v7, v1}, Ld42/p;->d(Lkotlin/jvm/functions/Function1;Lc42/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lc42/q;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v8, v7, v1}, Ld42/p;->t(Lkotlin/jvm/functions/Function1;Lc42/q;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lc42/s;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v8, v7, v1}, Ld42/p;->A(Lkotlin/jvm/functions/Function1;Lc42/s;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    check-cast v8, Lc93/m;

    check-cast v7, Ld30/w;

    check-cast v1, Ly2/y;

    const-string v2, "coordinates"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v7, Ld30/w;->a:Ljava/lang/String;

    invoke-interface {v8, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v6

    :pswitch_14
    move-object v10, v8

    check-cast v10, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    move-object v12, v7

    check-cast v12, Landroidx/lifecycle/y1;

    move-object v11, v1

    check-cast v11, Lq30/a0;

    sget v1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    const-string v1, "challengeResult"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v9, Lb2/y;

    const/4 v14, 0x2

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v14}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v1, v13, v13, v9, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v8, Lkotlin/jvm/internal/e0;

    check-cast v7, Lkotlin/jvm/internal/e0;

    check-cast v1, Lyb3/k;

    iget v2, v8, Lkotlin/jvm/internal/e0;->w:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_9

    move-object v2, v1

    check-cast v2, Lyb3/n;

    invoke-virtual {v2}, Lyb3/n;->b()Li93/j;

    move-result-object v2

    iget v2, v2, Li93/h;->w:I

    iput v2, v8, Lkotlin/jvm/internal/e0;->w:I

    :cond_9
    check-cast v1, Lyb3/n;

    invoke-virtual {v1}, Lyb3/n;->b()Li93/j;

    move-result-object v1

    iget v1, v1, Li93/h;->x:I

    const/4 v15, 0x1

    add-int/2addr v1, v15

    iput v1, v7, Lkotlin/jvm/internal/e0;->w:I

    const-string v1, ""

    return-object v1

    :pswitch_16
    check-cast v8, Ld0/z1;

    check-cast v7, Ld0/s1;

    check-cast v1, Lp1/i0;

    new-instance v1, Ld0/b2;

    invoke-direct {v1, v5, v8, v7}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_17
    check-cast v8, Lp1/t2;

    check-cast v7, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;

    check-cast v1, Lcom/whoop/membership/view/upcycle/a$b;

    invoke-static {v8, v7, v1}, Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;->z(Lp1/t2;Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;Lcom/whoop/membership/view/upcycle/a$b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v8, Landroidx/lifecycle/g0;

    check-cast v7, Ll83/h;

    check-cast v1, Lp1/i0;

    invoke-static {v8, v7, v1}, Lcom/whoop/weightlifting/a;->g(Landroidx/lifecycle/g0;Ll83/h;Lp1/i0;)Lp1/h0;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v8, Lcq0/e;

    check-cast v7, Lcom/whoop/data/remote/commons/ApiErrorResponse;

    invoke-static {v8, v7, v1}, Lcq0/e;->d(Lcq0/e;Lcom/whoop/data/remote/commons/ApiErrorResponse;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v8, Lcq0/e;

    check-cast v7, Landroidx/lifecycle/p0;

    invoke-static {v8, v7, v1}, Lcq0/e;->e(Lcq0/e;Landroidx/lifecycle/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v8, Lc93/m;

    check-cast v7, Ljava/util/List;

    check-cast v1, Ljava/lang/String;

    invoke-static {v8, v7, v1}, Lcp0/x0;->w(Lc93/m;Ljava/util/List;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    check-cast v8, Leb/a0;

    check-cast v7, Ll83/h;

    check-cast v1, Lcom/whoop/profile/presentation/edit/EditProfileEvent;

    invoke-static {v8, v7, v1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->i(Leb/a0;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;

    move-result-object v1

    return-object v1

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
