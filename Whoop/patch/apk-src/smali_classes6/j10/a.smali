.class public final Lj10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll20/a;Lw20/a0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj10/a;->a:I

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj10/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lj10/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln10/h0;Ljs2/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lj10/a;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lj10/a;->b:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Lj10/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltz/b;Lbz/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj10/a;->a:I

    const-string v0, "googlePayPaymentMethodLauncherFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lj10/a;->b:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lj10/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Le10/l;Le10/k;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    iget v2, v0, Lj10/a;->a:I

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, Lg20/w;

    move-object/from16 v3, p2

    check-cast v3, Ln10/f0;

    move-object/from16 v4, p3

    check-cast v4, Le10/v0;

    const-string v5, "confirmationOption"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "confirmationArgs"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v3, Ln10/d0;

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    check-cast v3, Ln10/d0;

    iget-object v1, v3, Ln10/d0;->a:Ly00/s;

    instance-of v3, v1, Ly00/q;

    if-eqz v3, :cond_0

    move-object v11, v1

    check-cast v11, Ly00/q;

    iget-object v1, v2, Lg20/w;->c:Lj/d;

    iget-object v3, v2, Lg20/w;->a:Ln10/j0;

    invoke-virtual {v3}, Ln10/j0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    iget-object v3, v2, Lg20/w;->b:Ln10/j0;

    invoke-virtual {v3}, Ln10/j0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    iget-boolean v8, v2, Lg20/w;->e:Z

    iget-object v9, v2, Lg20/w;->f:Ljava/util/Set;

    iget-object v12, v2, Lg20/w;->d:Ljava/lang/Integer;

    new-instance v5, Lg20/h;

    const/4 v10, 0x1

    invoke-direct/range {v5 .. v12}, Lg20/h;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLy00/s;Ljava/lang/Integer;)V

    invoke-virtual {v1, v5, v4}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    instance-of v3, v1, Ly00/r;

    if-eqz v3, :cond_1

    move-object v11, v1

    check-cast v11, Ly00/r;

    iget-object v1, v2, Lg20/w;->c:Lj/d;

    new-instance v5, Lg20/h;

    iget-object v3, v2, Lg20/w;->a:Ln10/j0;

    invoke-virtual {v3}, Ln10/j0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    iget-object v3, v2, Lg20/w;->b:Ln10/j0;

    invoke-virtual {v3}, Ln10/j0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    iget-boolean v8, v2, Lg20/w;->e:Z

    iget-object v9, v2, Lg20/w;->f:Ljava/util/Set;

    const/4 v10, 0x1

    iget-object v12, v2, Lg20/w;->d:Ljava/lang/Integer;

    invoke-direct/range {v5 .. v12}, Lg20/h;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLy00/s;Ljava/lang/Integer;)V

    invoke-virtual {v1, v5, v4}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_1
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_2
    instance-of v1, v3, Ln10/e0;

    if-eqz v1, :cond_3

    check-cast v3, Ln10/e0;

    iget-object v11, v3, Ln10/e0;->a:Ly00/c8;

    iget-object v1, v2, Lg20/w;->c:Lj/d;

    new-instance v5, Lg20/k;

    iget-object v3, v2, Lg20/w;->a:Ln10/j0;

    invoke-virtual {v3}, Ln10/j0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    iget-object v3, v2, Lg20/w;->b:Ln10/j0;

    invoke-virtual {v3}, Ln10/j0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    iget-boolean v8, v2, Lg20/w;->e:Z

    iget-object v9, v2, Lg20/w;->f:Ljava/util/Set;

    const/4 v10, 0x1

    iget-object v12, v2, Lg20/w;->d:Ljava/lang/Integer;

    invoke-direct/range {v5 .. v12}, Lg20/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLy00/c8;Ljava/lang/Integer;)V

    invoke-virtual {v1, v5, v4}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :goto_0
    return-void

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Lj/d;

    move-object/from16 v3, p2

    check-cast v3, Ll83/a0;

    move-object/from16 v3, p3

    check-cast v3, Ll10/c;

    const-string v4, "confirmationOption"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "confirmationArgs"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Le10/k;->x:Lv00/c0;

    iget-object v3, v3, Ll10/c;->w:Ll10/b;

    iget-object v1, v1, Le10/k;->y:Ly00/c8;

    iget-object v5, v0, Lj10/a;->b:Ljava/lang/Object;

    check-cast v5, Ltz/b;

    sget-object v6, Lbc3/q0;->a:Lkc3/e;

    invoke-static {v6}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    new-instance v7, Lsz/c0;

    iget-object v6, v3, Ll10/b;->w:Lh20/g2;

    iget-object v8, v3, Ll10/b;->G:Lh20/l1;

    if-nez v6, :cond_4

    const/4 v6, -0x1

    goto :goto_1

    :cond_4
    sget-object v9, Ll10/a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v9, v6

    :goto_1
    const/4 v9, 0x1

    if-ne v6, v9, :cond_5

    sget-object v6, Lsz/g;->x:Lsz/g;

    goto :goto_2

    :cond_5
    sget-object v6, Lsz/g;->y:Lsz/g;

    :goto_2
    iget-object v9, v3, Ll10/b;->y:Ljava/lang/String;

    iget-object v10, v4, Lv00/c0;->J:Ljava/lang/String;

    if-nez v10, :cond_6

    iget-object v10, v3, Ll10/b;->x:Ljava/lang/String;

    :cond_6
    invoke-virtual {v8}, Lh20/l1;->f()Z

    move-result v11

    invoke-virtual {v8}, Lh20/l1;->k()Lsz/b0;

    move-result-object v12

    iget-object v13, v3, Ll10/b;->J:Ljava/util/List;

    move-object v8, v6

    invoke-direct/range {v7 .. v13}, Lsz/c0;-><init>(Lsz/g;Ljava/lang/String;Ljava/lang/String;ZLsz/b0;Ljava/util/List;)V

    new-instance v6, Li7/g;

    const/16 v8, 0x15

    invoke-direct {v6, v8}, Li7/g;-><init>(I)V

    iget-object v14, v3, Ll10/b;->H:Lux/a;

    iget-object v15, v3, Ll10/b;->I:Lux/b;

    iget-object v5, v5, Ltz/b;->a:Lj00/i;

    iget-object v6, v5, Lj00/i;->a:Lv03/h;

    invoke-interface {v6}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    iget-object v8, v5, Lj00/i;->b:Lv03/h;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ltz/a;

    iget-object v9, v5, Lj00/i;->c:Lv03/h;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb10/b;

    iget-object v5, v5, Lj00/i;->d:Lv03/h;

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyy/j;

    const-string v10, "context"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "googlePayRepositoryFactory"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "cardBrandFilter"

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "cardFundingFilter"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "paymentAnalyticsRequestFactory"

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "analyticsRequestExecutor"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v6, Lsz/h0;->a:Z

    if-nez v6, :cond_7

    const/4 v6, 0x1

    sput-boolean v6, Lsz/h0;->a:Z

    sget-object v17, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->p0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v21, 0x0

    const/16 v22, 0x3e

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v16 .. v22}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v6

    invoke-virtual {v5, v6}, Lyy/j;->a(Lyy/b;)V

    :cond_7
    instance-of v5, v1, Ly00/l3;

    const/4 v6, 0x0

    if-eqz v5, :cond_8

    move-object v8, v1

    check-cast v8, Ly00/l3;

    goto :goto_3

    :cond_8
    move-object v8, v6

    :goto_3
    if-eqz v8, :cond_a

    iget-object v8, v8, Ly00/l3;->K:Ljava/lang/String;

    if-nez v8, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    move-object v9, v8

    goto :goto_6

    :cond_a
    :goto_5
    iget-object v8, v3, Ll10/b;->z:Ljava/lang/String;

    if-nez v8, :cond_9

    const-string v8, ""

    goto :goto_4

    :goto_6
    const-wide/16 v10, 0x0

    if-eqz v5, :cond_b

    move-object v5, v1

    check-cast v5, Ly00/l3;

    iget-object v5, v5, Ly00/l3;->y:Ljava/lang/Long;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_7

    :cond_b
    instance-of v5, v1, Ly00/g6;

    if-eqz v5, :cond_d

    iget-object v5, v3, Ll10/b;->E:Ljava/lang/Long;

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    :cond_c
    :goto_7
    invoke-interface {v1}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v13

    iget-object v12, v3, Ll10/b;->F:Ljava/lang/String;

    iget-object v1, v4, Lv00/c0;->d0:Ly00/n;

    move-object v8, v7

    new-instance v7, Lsz/l0;

    const/16 v17, 0x1

    move-object/from16 v16, v1

    invoke-direct/range {v7 .. v17}, Lsz/l0;-><init>(Lsz/c0;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lux/a;Lux/b;Ly00/n;Z)V

    invoke-virtual {v2, v7, v6}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Lw20/c0;

    move-object/from16 v3, p2

    check-cast v3, Ll83/a0;

    move-object/from16 v3, p3

    check-cast v3, Le10/u0;

    const-string v4, "confirmationOption"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "confirmationArgs"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lj10/a;->b:Ljava/lang/Object;

    check-cast v4, Ll20/a;

    iget-object v3, v3, Le10/u0;->w:Ly00/o4;

    new-instance v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v6, 0x1a

    invoke-direct {v5, v6, v2, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v3, v5}, Ll20/a;->b(Ly00/o4;Lkotlin/jvm/functions/Function1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Le10/l;)Le10/l;
    .locals 1

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le10/v0;

    if-eqz v0, :cond_0

    check-cast p1, Le10/v0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ll10/c;

    if-eqz v0, :cond_1

    check-cast p1, Ll10/c;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le10/u0;

    if-eqz v0, :cond_2

    check-cast p1, Le10/u0;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Le10/l;Le10/k;)Z
    .locals 2

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Le10/v0;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Ll10/c;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Le10/u0;

    const-string v0, "confirmationArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le10/u0;->x:Ly00/u5;

    instance-of v1, v0, Ly00/l5;

    if-eqz v1, :cond_0

    check-cast v0, Ly00/l5;

    iget-object v0, v0, Ly00/l5;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lj10/a;->b:Ljava/lang/Object;

    check-cast v0, Ll20/a;

    iget-object p2, p2, Le10/k;->y:Ly00/c8;

    iget-object v1, p1, Le10/u0;->w:Ly00/o4;

    invoke-virtual {v0, p2, v1}, Ll20/a;->c(Ly00/c8;Ly00/o4;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-boolean p1, p1, Le10/u0;->y:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 p1, 0x0

    :goto_2
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lv00/c0;)V
    .locals 1

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_1
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Le10/l;Le10/k;Le10/h0;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Le10/v0;

    invoke-virtual {p0, p1, p2, p3}, Lj10/a;->i(Le10/v0;Le10/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ll10/c;

    iget-object p1, p1, Ll10/c;->w:Ll10/b;

    iget-object p1, p1, Ll10/b;->z:Ljava/lang/String;

    if-nez p1, :cond_1

    iget-object p1, p2, Le10/k;->y:Ly00/c8;

    instance-of p1, p1, Ly00/l3;

    if-nez p1, :cond_1

    iget-object p1, p0, Lj10/a;->c:Ljava/lang/Object;

    check-cast p1, Lbz/i;

    const-string p2, "GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lbz/i;->a(Ljava/lang/String;)V

    :cond_0
    new-instance p1, Le10/b;

    new-instance p3, Ljava/lang/IllegalStateException;

    invoke-direct {p3, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const p2, 0x7f1410f2

    invoke-static {p2}, Ls4/i;->h(I)Lzy/b;

    move-result-object p2

    sget-object v0, Le10/s;->a:Le10/s;

    invoke-direct {p1, p3, p2, v0}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    goto :goto_0

    :cond_1
    new-instance p1, Le10/c;

    const/4 p2, 0x1

    const/4 p3, 0x0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0, p2, p3}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Le10/u0;

    new-instance p1, Le10/c;

    const/4 p2, 0x1

    const/4 p3, 0x0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0, p2, p3}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Le10/l;Le10/k;Ln10/c0;Landroid/os/Parcelable;)Le10/i;
    .locals 3

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Le10/v0;

    check-cast p4, Lg20/d;

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p4, Lg20/b;

    if-eqz p1, :cond_0

    new-instance p1, Le10/h;

    check-cast p4, Lg20/b;

    iget-object p2, p4, Lg20/b;->w:Ly00/c8;

    const/4 p4, 0x1

    invoke-direct {p1, p2, p3, p4}, Le10/h;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_0

    :cond_0
    instance-of p1, p4, Lg20/c;

    if-eqz p1, :cond_1

    new-instance p1, Le10/f;

    check-cast p4, Lg20/c;

    iget-object p2, p4, Lg20/c;->w:Ljava/lang/Throwable;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p2, p3, p4}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    goto :goto_0

    :cond_1
    instance-of p1, p4, Lg20/a;

    if-eqz p1, :cond_2

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->w:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    check-cast p1, Ll10/c;

    check-cast p4, Lsz/g0;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p4, Lsz/e0;

    if-eqz p1, :cond_3

    new-instance p1, Le10/u0;

    check-cast p4, Lsz/e0;

    iget-object p3, p4, Lsz/e0;->w:Ly00/o4;

    const/4 p4, 0x0

    const/16 v0, 0x18

    invoke-direct {p1, p3, p4, v0}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;I)V

    new-instance p3, Le10/g;

    invoke-direct {p3, p1, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    goto :goto_2

    :cond_3
    instance-of p1, p4, Lsz/f0;

    if-eqz p1, :cond_5

    new-instance p3, Le10/f;

    check-cast p4, Lsz/f0;

    iget p1, p4, Lsz/f0;->x:I

    iget-object p2, p4, Lsz/f0;->w:Ljava/lang/Throwable;

    const/4 p4, 0x3

    if-ne p1, p4, :cond_4

    const p4, 0x7f141001

    invoke-static {p4}, Ls4/i;->h(I)Lzy/b;

    move-result-object p4

    goto :goto_1

    :cond_4
    const p4, 0x7f14101c

    invoke-static {p4}, Ls4/i;->h(I)Lzy/b;

    move-result-object p4

    :goto_1
    new-instance v0, Le10/q;

    invoke-direct {v0, p1}, Le10/q;-><init>(I)V

    invoke-direct {p3, p2, p4, v0}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    goto :goto_2

    :cond_5
    instance-of p1, p4, Lsz/d0;

    if-eqz p1, :cond_6

    new-instance p3, Le10/e;

    sget-object p1, Le10/m;->w:Le10/m;

    invoke-direct {p3, p1}, Le10/e;-><init>(Le10/m;)V

    :goto_2
    return-object p3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    check-cast p1, Le10/u0;

    check-cast p4, Lw20/o;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "result"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p4, Lw20/n;

    if-eqz p3, :cond_8

    new-instance p3, Le10/g;

    iget-object v0, p1, Le10/u0;->x:Ly00/u5;

    instance-of v1, v0, Ly00/l5;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    check-cast v0, Ly00/l5;

    check-cast p4, Lw20/n;

    iget-object p4, p4, Lw20/n;->w:Ljava/lang/String;

    const/16 v1, 0xe

    invoke-static {v0, p4, v2, v1}, Ly00/l5;->f(Ly00/l5;Ljava/lang/String;Ly00/o;I)Ly00/l5;

    move-result-object p4

    goto :goto_3

    :cond_7
    new-instance v0, Ly00/l5;

    check-cast p4, Lw20/n;

    iget-object p4, p4, Lw20/n;->w:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p4, v2}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    move-object p4, v0

    :goto_3
    invoke-static {p1, p4}, Le10/u0;->b(Le10/u0;Ly00/u5;)Le10/u0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    goto :goto_4

    :cond_8
    instance-of p1, p4, Lw20/m;

    if-eqz p1, :cond_9

    new-instance p3, Le10/e;

    sget-object p1, Le10/m;->w:Le10/m;

    invoke-direct {p3, p1}, Le10/e;-><init>(Le10/m;)V

    :goto_4
    return-object p3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lj/c;Lcom/whoop/profile/view/edit/n;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj10/a;->c:Ljava/lang/Object;

    check-cast v0, Ljs2/h;

    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    new-instance v2, Lf10/a;

    const/4 v3, 0x7

    invoke-direct {v2, p2, v3}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v1, v2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljs2/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg20/w;

    return-object p1

    :pswitch_0
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2;

    invoke-direct {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2;-><init>()V

    new-instance v1, Lf10/a;

    const/4 v2, 0x6

    invoke-direct {v1, p2, v2}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj10/a;->c:Ljava/lang/Object;

    check-cast v0, Lw20/a0;

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract;-><init>()V

    new-instance v2, Lf10/a;

    const/4 v3, 0x4

    invoke-direct {v2, p2, v3}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v1, v2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "activityResultLauncher"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lw20/c0;

    invoke-direct {p2, p1}, Lw20/c0;-><init>(Lj/d;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "IntentConfirmation"

    return-object v0

    :pswitch_0
    const-string v0, "GooglePay"

    return-object v0

    :pswitch_1
    const-string v0, "CvcRecollection"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic h(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lj10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg20/w;

    return-void

    :pswitch_0
    check-cast p1, Lj/d;

    return-void

    :pswitch_1
    check-cast p1, Lw20/c0;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Le10/v0;Le10/k;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Ln10/g0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln10/g0;

    iget v1, v0, Ln10/g0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/g0;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln10/g0;

    invoke-direct {v0, p0, p3}, Ln10/g0;-><init>(Lj10/a;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Ln10/g0;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln10/g0;->E:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    if-eq v1, v8, :cond_2

    if-ne v1, v7, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_3
    iget-object p2, v6, Ln10/g0;->x:Le10/k;

    iget-object p1, v6, Ln10/g0;->w:Le10/v0;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_8

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p2, Le10/k;->x:Lv00/c0;

    :try_start_1
    iget-object v1, p0, Lj10/a;->b:Ljava/lang/Object;

    check-cast v1, Ln10/h0;

    move v3, v2

    iget-object v2, p3, Lv00/c0;->h0:Lv00/a0;

    iget-object v4, p3, Lv00/c0;->P:Lv00/p;

    if-eqz v4, :cond_5

    iget-object v5, v4, Lv00/p;->w:Ljava/lang/String;

    goto :goto_2

    :cond_5
    move-object v5, v9

    :goto_2
    if-eqz v4, :cond_6

    iget-object v4, v4, Lv00/p;->x:Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object v4, v9

    :goto_3
    iget-object p3, p3, Lv00/c0;->d0:Ly00/n;

    iput-object p1, v6, Ln10/g0;->w:Le10/v0;

    iput-object p2, v6, Ln10/g0;->x:Le10/k;

    iput v3, v6, Ln10/g0;->E:I

    move-object v3, v5

    move-object v5, p3

    invoke-interface/range {v1 .. v6}, Ln10/h0;->a(Lv00/a0;Ljava/lang/String;Ljava/lang/String;Ly00/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_7

    goto :goto_7

    :cond_7
    :goto_4
    check-cast p3, Ln10/i0;
    :try_end_1
    .catch Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    instance-of v1, p1, Le10/t0;

    if-eqz v1, :cond_a

    iget-object v1, p2, Le10/k;->y:Ly00/c8;

    check-cast p1, Le10/t0;

    iget-object p2, p2, Le10/k;->x:Lv00/c0;

    iget-object p2, p2, Lv00/c0;->L:Li20/b;

    if-eqz p2, :cond_8

    invoke-static {p2}, Li20/l1;->n(Li20/b;)Ly00/p;

    move-result-object p2

    goto :goto_5

    :cond_8
    move-object p2, v9

    :goto_5
    iput-object v9, v6, Ln10/g0;->w:Le10/v0;

    iput-object v9, v6, Ln10/g0;->x:Le10/k;

    iput v8, v6, Ln10/g0;->E:I

    invoke-interface {p3, v1, p1, p2, v6}, Ln10/i0;->b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_7

    :cond_9
    return-object p1

    :cond_a
    instance-of v1, p1, Le10/u0;

    if-eqz v1, :cond_d

    iget-object v1, p2, Le10/k;->y:Ly00/c8;

    check-cast p1, Le10/u0;

    iget-object p2, p2, Le10/k;->x:Lv00/c0;

    iget-object p2, p2, Lv00/c0;->L:Li20/b;

    if-eqz p2, :cond_b

    invoke-static {p2}, Li20/l1;->n(Li20/b;)Ly00/p;

    move-result-object p2

    goto :goto_6

    :cond_b
    move-object p2, v9

    :goto_6
    iput-object v9, v6, Ln10/g0;->w:Le10/v0;

    iput-object v9, v6, Ln10/g0;->x:Le10/k;

    iput v7, v6, Ln10/g0;->E:I

    invoke-interface {p3, v1, p1, p2, v6}, Ln10/i0;->a(Ly00/c8;Le10/u0;Ly00/p;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_7
    return-object v0

    :cond_c
    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_8
    new-instance p2, Le10/b;

    new-instance p3, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;->F:Lzy/c;

    sget-object v0, Le10/t;->a:Le10/t;

    invoke-direct {p2, p3, p1, v0}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2
.end method
