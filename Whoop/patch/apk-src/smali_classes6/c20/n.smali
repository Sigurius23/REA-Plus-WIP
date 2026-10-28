.class public final Lc20/n;
.super Lc20/e;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Lyy/j;

.field public final c:Lb10/b;

.field public final d:Z

.field public final e:Lq83/j;

.field public final f:Lc93/a;

.field public final g:Z

.field public final h:Lv10/a;

.field public final i:Ld1/j;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lyy/j;Lb10/b;ZLq83/j;Lc93/a;ZLv10/a;Ld1/j;)V
    .locals 1

    const-string v0, "paymentBrowserAuthStarterFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultReturnUrl"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redirectResolver"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc20/n;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lc20/n;->b:Lyy/j;

    iput-object p3, p0, Lc20/n;->c:Lb10/b;

    iput-boolean p4, p0, Lc20/n;->d:Z

    iput-object p5, p0, Lc20/n;->e:Lq83/j;

    iput-object p6, p0, Lc20/n;->f:Lc93/a;

    iput-boolean p7, p0, Lc20/n;->g:Z

    iput-object p8, p0, Lc20/n;->h:Lv10/a;

    iput-object p9, p0, Lc20/n;->i:Ld1/j;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ly00/c8;

    invoke-virtual {p0, p1, p2, p3, p4}, Lc20/n;->e(Ls40/a;Ly00/c8;Lyy/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ls40/a;Ly00/c8;Lyy/f;Lq83/d;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    instance-of v3, v2, Lc20/l;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lc20/l;

    iget v4, v3, Lc20/l;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lc20/l;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lc20/l;

    check-cast v2, Ls83/c;

    invoke-direct {v3, v0, v2}, Lc20/l;-><init>(Lc20/n;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lc20/l;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lc20/l;->G:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lc20/l;->z:Lyy/f;

    iget-object v5, v3, Lc20/l;->y:Ly00/c8;

    iget-object v8, v3, Lc20/l;->x:Ls40/a;

    iget-object v10, v3, Lc20/l;->w:Lc20/n;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v26, v10

    move-object v10, v1

    move-object v1, v5

    move-object v5, v8

    move-object/from16 v8, v26

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v1}, Ly00/c8;->m()Ly00/b8;

    move-result-object v2

    instance-of v5, v2, Ly00/r7;

    if-eqz v5, :cond_5

    check-cast v2, Ly00/r7;

    iput-object v0, v3, Lc20/l;->w:Lc20/n;

    move-object/from16 v5, p1

    iput-object v5, v3, Lc20/l;->x:Ls40/a;

    iput-object v1, v3, Lc20/l;->y:Ly00/c8;

    move-object/from16 v10, p3

    iput-object v10, v3, Lc20/l;->z:Lyy/f;

    iput v8, v3, Lc20/l;->G:I

    invoke-virtual {v0, v2, v1, v3}, Lc20/n;->f(Ly00/r7;Ly00/c8;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto/16 :goto_6

    :cond_4
    move-object v8, v0

    :goto_1
    check-cast v2, Lc20/j;

    move-object/from16 v16, v1

    move-object v15, v5

    move-object v14, v8

    goto/16 :goto_4

    :cond_5
    move-object/from16 v5, p1

    move-object/from16 v10, p3

    instance-of v8, v2, Ly00/h7;

    if-eqz v8, :cond_6

    check-cast v2, Ly00/h7;

    sget-object v12, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->n0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v16, 0x0

    const/16 v17, 0x3e

    iget-object v11, v0, Lc20/n;->c:Lb10/b;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v8

    iget-object v11, v0, Lc20/n;->b:Lyy/j;

    invoke-virtual {v11, v8}, Lyy/j;->a(Lyy/b;)V

    new-instance v8, Lc20/j;

    iget-object v11, v2, Ly00/h7;->y:Landroid/net/Uri;

    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "toString(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Ly00/h7;->z:Ljava/lang/String;

    const/16 v12, 0x3c

    invoke-direct {v8, v12, v11, v2, v9}, Lc20/j;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    move-object v14, v0

    move-object/from16 v16, v1

    move-object v15, v5

    move-object v2, v8

    goto :goto_4

    :cond_6
    instance-of v8, v2, Ly00/q7;

    const/16 v11, 0x34

    if-eqz v8, :cond_a

    check-cast v2, Ly00/q7;

    invoke-interface {v2}, Ly00/q7;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_7

    goto :goto_3

    :cond_7
    move-object v2, v9

    :goto_3
    if-nez v2, :cond_9

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-interface {v1}, Ly00/c8;->O()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v9, v1, Lcom/stripe/android/model/StripeIntent$NextActionType;->w:Ljava/lang/String;

    :cond_8
    const-string v1, "null hostedVoucherUrl for "

    invoke-static {v1, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_9
    new-instance v8, Lc20/j;

    invoke-direct {v8, v11, v2, v9, v9}, Lc20/j;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_a
    instance-of v8, v2, Ly00/j7;

    iget-object v12, v0, Lc20/n;->h:Lv10/a;

    if-eqz v8, :cond_b

    check-cast v2, Ly00/j7;

    new-instance v8, Lc20/j;

    iget-object v2, v2, Ly00/j7;->w:Ljava/lang/String;

    invoke-virtual {v12}, Lv10/a;->a()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v8, v11, v2, v12, v9}, Lc20/j;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_b
    instance-of v8, v2, Ly00/x7;

    if-eqz v8, :cond_f

    check-cast v2, Ly00/x7;

    new-instance v8, Lc20/j;

    iget-object v2, v2, Ly00/x7;->w:Ljava/lang/String;

    invoke-virtual {v12}, Lv10/a;->a()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v8, v11, v2, v12, v9}, Lc20/j;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :goto_4
    sget-object v1, Lux/s0;->l:Ljava/util/List;

    invoke-static/range {v16 .. v16}, Ls4/g;->i(Ly00/c8;)I

    move-result v17

    invoke-interface/range {v16 .. v16}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    const-string v1, ""

    :cond_c
    move-object/from16 v18, v1

    iget-object v1, v2, Lc20/j;->a:Ljava/lang/String;

    iget-object v5, v10, Lyy/f;->x:Ljava/lang/String;

    iget-object v8, v2, Lc20/j;->b:Ljava/lang/String;

    iget-boolean v10, v2, Lc20/j;->c:Z

    iget-object v11, v2, Lc20/j;->d:Ljava/lang/String;

    iget-boolean v2, v2, Lc20/j;->e:Z

    iput-object v9, v3, Lc20/l;->w:Lc20/n;

    iput-object v9, v3, Lc20/l;->x:Ls40/a;

    iput-object v9, v3, Lc20/l;->y:Ly00/c8;

    iput-object v9, v3, Lc20/l;->z:Lyy/f;

    iput v7, v3, Lc20/l;->G:I

    iget-object v7, v14, Lc20/n;->e:Lq83/j;

    new-instance v13, Lc20/k;

    const/16 v25, 0x0

    move-object/from16 v19, v1

    move/from16 v24, v2

    move-object/from16 v21, v5

    move-object/from16 v20, v8

    move/from16 v22, v10

    move-object/from16 v23, v11

    invoke-direct/range {v13 .. v25}, Lc20/k;-><init>(Lc20/n;Ls40/a;Ly00/c8;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLq83/d;)V

    invoke-static {v7, v13, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_d

    goto :goto_5

    :cond_d
    move-object v1, v6

    :goto_5
    if-ne v1, v4, :cond_e

    :goto_6
    return-object v4

    :cond_e
    return-object v6

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "WebAuthenticator can\'t process nextActionData: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final f(Ly00/r7;Ly00/c8;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lc20/m;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lc20/m;

    iget v4, v3, Lc20/m;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lc20/m;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lc20/m;

    invoke-direct {v3, v0, v2}, Lc20/m;-><init>(Lc20/n;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lc20/m;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lc20/m;->z:I

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x2

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v8, :cond_1

    iget-object v1, v3, Lc20/m;->w:Ly00/r7;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lc20/m;->w:Ly00/r7;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v10, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->n0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v14, 0x0

    const/16 v15, 0x3e

    iget-object v9, v0, Lc20/n;->c:Lb10/b;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v2

    iget-object v5, v0, Lc20/n;->b:Lyy/j;

    invoke-virtual {v5, v2}, Lyy/j;->a(Lyy/b;)V

    invoke-interface/range {p2 .. p2}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, v2, Ly00/o4;->z:Ljava/lang/String;

    goto :goto_1

    :cond_4
    move-object v2, v6

    :goto_1
    sget-object v5, Ly00/f4;->G:Lt9/c0;

    const-string v5, "wechat_pay"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "toString(...)"

    iget-object v9, v0, Lc20/n;->i:Ld1/j;

    if-eqz v2, :cond_6

    iget-object v2, v1, Ly00/r7;->w:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v3, Lc20/m;->w:Ly00/r7;

    iput v7, v3, Lc20/m;->z:I

    iget-object v5, v9, Ld1/j;->y:Ljava/lang/Object;

    check-cast v5, Lq83/j;

    new-instance v7, Lay/u;

    invoke-direct {v7, v2, v9, v6, v8}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v7, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast v2, Ljava/lang/String;

    iget-object v3, v1, Ly00/r7;->x:Ljava/lang/String;

    iget-object v1, v1, Ly00/r7;->w:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lc20/j;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v2, v3, v1}, Lc20/j;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    :cond_6
    iget-object v2, v1, Ly00/r7;->w:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "followRedirectsInSDK=true"

    const/4 v7, 0x0

    invoke-static {v2, v5, v7}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_8

    iput-object v1, v3, Lc20/m;->w:Ly00/r7;

    iput v8, v3, Lc20/m;->z:I

    iget-object v5, v9, Ld1/j;->y:Ljava/lang/Object;

    check-cast v5, Lq83/j;

    new-instance v7, Lay/u;

    invoke-direct {v7, v2, v9, v6, v8}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v7, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    :goto_3
    return-object v4

    :cond_7
    :goto_4
    check-cast v2, Ljava/lang/String;

    :cond_8
    new-instance v3, Lc20/j;

    iget-object v1, v1, Ly00/r7;->x:Ljava/lang/String;

    const/16 v4, 0x3c

    invoke-direct {v3, v4, v2, v1, v6}, Lc20/j;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method
