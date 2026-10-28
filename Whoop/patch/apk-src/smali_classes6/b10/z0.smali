.class public final Lb10/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb10/c1;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lc93/a;

.field public final d:Lb10/d;

.field public final e:Lq83/j;

.field public final f:Ljava/util/Set;

.field public final g:Lab/i0;

.field public final h:Lyy/j;

.field public final i:Lty/a;

.field public final j:Lb10/b;

.field public final k:Lt9/p;

.field public final l:Lq30/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V
    .locals 12

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestSurface"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    move-object/from16 v6, p4

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const v11, 0xf688

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 37
    invoke-direct/range {v1 .. v11}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lqy/d;Lq83/j;Ljava/util/Set;Lyy/j;Lb10/b;Ljava/util/Set;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc93/a;Lb10/d;Lqy/d;Lq83/j;Ljava/util/Set;Lyy/j;Lb10/b;Ljava/util/Set;I)V
    .locals 5

    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_0

    .line 1
    sget-object v0, Lux/j0;->c:Ljava/lang/String;

    :cond_0
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_1

    .line 2
    sget-object p4, Lqy/e;->b:Lqy/d;

    :cond_1
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_2

    .line 3
    sget-object p5, Lbc3/q0;->a:Lkc3/e;

    .line 4
    sget-object p5, Lkc3/d;->w:Lkc3/d;

    :cond_2
    and-int/lit8 v0, p10, 0x40

    .line 5
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    if-eqz v0, :cond_3

    move-object p6, v1

    .line 6
    :cond_3
    new-instance v0, Lab/i0;

    const/16 v2, 0xe

    invoke-direct {v0, p5, p4, v2}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    and-int/lit16 v2, p10, 0x100

    if-eqz v2, :cond_4

    .line 7
    new-instance p7, Lyy/j;

    invoke-direct {p7, p4, p5}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    .line 8
    :cond_4
    invoke-static {p1, p5}, Ls4/d;->a(Landroid/content/Context;Lq83/j;)Lty/a;

    move-result-object v2

    .line 9
    new-instance v3, Lzx/o;

    invoke-direct {v3, p1, p6, p3, p7}, Lzx/o;-><init>(Landroid/content/Context;Ljava/util/Set;Lb10/d;Lyy/j;)V

    and-int/lit16 v3, p10, 0x800

    if-eqz v3, :cond_5

    .line 10
    new-instance p8, Lb10/b;

    invoke-direct {p8, p1, p6, p2}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    .line 11
    :cond_5
    new-instance v3, Lt9/p;

    const/4 v4, 0x2

    .line 12
    invoke-direct {v3, v4}, Lt9/p;-><init>(I)V

    and-int/lit16 p10, p10, 0x2000

    if-eqz p10, :cond_6

    move-object p9, v1

    .line 13
    :cond_6
    check-cast p9, Ljava/lang/Iterable;

    .line 14
    new-instance p10, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p9, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p10, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    invoke-interface {p9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p9

    :goto_0
    invoke-interface {p9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 16
    check-cast v1, Lux/k0;

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "wechat_pay_beta=v1"

    .line 18
    invoke-virtual {p10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 19
    :cond_7
    invoke-static {p10}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p9

    new-instance p10, Lqy/a;

    const/4 v1, 0x0

    .line 20
    invoke-direct {p10, v1, p9}, Lqy/a;-><init>(ILjava/util/Set;)V

    .line 21
    invoke-virtual {p10}, Lqy/a;->a()Ljava/lang/String;

    move-result-object p9

    .line 22
    const-string p10, "context"

    invoke-static {p1, p10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p10, "publishableKeyProvider"

    invoke-static {p2, p10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p10, "requestSurface"

    invoke-static {p3, p10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p10, "logger"

    invoke-static {p4, p10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "workContext"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "productUsageTokens"

    invoke-static {p6, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "analyticsRequestExecutor"

    invoke-static {p7, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "paymentAnalyticsRequestFactory"

    invoke-static {p8, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "apiVersion"

    invoke-static {p9, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lb10/z0;->b:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lb10/z0;->c:Lc93/a;

    .line 26
    iput-object p3, p0, Lb10/z0;->d:Lb10/d;

    .line 27
    iput-object p5, p0, Lb10/z0;->e:Lq83/j;

    .line 28
    iput-object p6, p0, Lb10/z0;->f:Ljava/util/Set;

    .line 29
    iput-object v0, p0, Lb10/z0;->g:Lab/i0;

    .line 30
    iput-object p7, p0, Lb10/z0;->h:Lyy/j;

    .line 31
    iput-object v2, p0, Lb10/z0;->i:Lty/a;

    .line 32
    iput-object p8, p0, Lb10/z0;->j:Lb10/b;

    .line 33
    iput-object v3, p0, Lb10/z0;->k:Lt9/p;

    .line 34
    new-instance p1, Lq30/w0;

    const/4 p2, 0x0

    const-string p3, "AndroidBindings/22.6.1"

    invoke-direct {p1, p2, p9, p3}, Lq30/w0;-><init>(Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lb10/z0;->l:Lq30/w0;

    .line 35
    invoke-virtual {p0}, Lb10/z0;->y()V

    .line 36
    invoke-static {p5}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance p3, La13/h;

    invoke-direct {p3, p0, p2, v4}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p4, 0x3

    invoke-static {p1, p2, p2, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 1

    const-string v0, "client_secret"

    invoke-static {v0, p0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p1}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Ll83/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    check-cast v0, Lyy/n0;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Ls4/b;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v0, :cond_3

    iget-boolean p1, v0, Lyy/n0;->e:Z

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-virtual {p0, v0}, Lb10/z0;->C(Lyy/n0;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Ls4/b;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final B(Ly00/v2;Ljava/util/Set;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lb10/e0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/e0;

    iget v1, v0, Lb10/e0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/e0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/e0;

    invoke-direct {v0, p0, p4}, Lb10/e0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/e0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/e0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p4, "payment_methods"

    invoke-static {p4}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Ly00/v2;->c0()Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p4, p3, p1, v2}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p3, Lz00/f;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance p4, Lb10/f;

    const/4 v2, 0x3

    invoke-direct {p4, p0, p2, v2}, Lb10/f;-><init>(Lb10/z0;Ljava/util/Set;I)V

    iput v3, v0, Lb10/e0;->y:I

    invoke-virtual {p0, p1, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_4

    check-cast p1, Ly00/z5;

    iget-object p1, p1, Ly00/z5;->w:Ljava/util/List;

    :cond_4
    return-object p1
.end method

.method public final C(Lyy/n0;)V
    .locals 19

    move-object/from16 v0, p1

    iget-object v1, v0, Lyy/n0;->f:Lyy/f0;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lyy/f0;->a:Ljava/lang/String;

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget v3, v0, Lyy/n0;->a:I

    invoke-static {v0}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lwy/a;->b(Lorg/json/JSONObject;)Lqy/f;

    move-result-object v0

    const-string v1, "context"

    move-object/from16 v9, p0

    iget-object v2, v9, Lb10/z0;->b:Landroid/content/Context;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lqy/f;->x:Ljava/lang/String;

    iget-object v4, v0, Lqy/f;->y:Ljava/lang/String;

    iget-object v6, v0, Lqy/f;->E:Ljava/lang/String;

    invoke-static {v2, v1, v4, v6}, Lv8/b;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iget-object v11, v0, Lqy/f;->w:Ljava/lang/String;

    iget-object v13, v0, Lqy/f;->y:Ljava/lang/String;

    iget-object v14, v0, Lqy/f;->z:Ljava/lang/String;

    iget-object v15, v0, Lqy/f;->E:Ljava/lang/String;

    iget-object v1, v0, Lqy/f;->F:Ljava/lang/String;

    iget-object v2, v0, Lqy/f;->G:Ljava/lang/String;

    iget-object v0, v0, Lqy/f;->H:Ljava/util/Map;

    new-instance v8, Lqy/f;

    move-object/from16 v18, v0

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object v10, v8

    invoke-direct/range {v10 .. v18}, Lqy/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    const/16 v0, 0x1ad

    if-eq v3, v0, :cond_1

    packed-switch v3, :pswitch_data_0

    new-instance v2, Lcom/stripe/android/core/exception/APIException;

    const/4 v7, 0x0

    const/16 v4, 0x18

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v2

    :pswitch_0
    new-instance v0, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {v0, v8, v5}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lqy/f;Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-instance v2, Lcom/stripe/android/exception/CardException;

    const/4 v6, 0x0

    const/16 v4, 0x18

    const/16 v3, 0x192

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/core/exception/StripeException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v2

    :pswitch_2
    new-instance v0, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {v0, v8, v5}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lqy/f;Ljava/lang/String;)V

    throw v0

    :pswitch_3
    new-instance v2, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/4 v7, 0x0

    const/16 v4, 0x18

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v2

    :cond_1
    new-instance v0, Lcom/stripe/android/core/exception/RateLimitException;

    const/16 v1, 0xc

    invoke-direct {v0, v8, v5, v1}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lqy/f;Ljava/lang/String;I)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x190
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final D(Ljava/lang/String;Ljava/util/Set;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/f0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/f0;

    iget v1, v0, Lb10/f0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/f0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/f0;

    invoke-direct {v0, p0, p3}, Lb10/f0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/f0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/f0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "consumers/payment_details/list"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iget-object v2, p0, Lb10/z0;->d:Lb10/d;

    iget-object v2, v2, Lb10/d;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "request_surface"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v5, "credentials"

    invoke-direct {v2, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v5, "types"

    invoke-direct {p2, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 p2, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p3, p4, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->x:Lz00/a;

    iput v3, v0, Lb10/f0;->y:I

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final E(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/g0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/g0;

    iget v1, v0, Lb10/g0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/g0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/g0;

    invoke-direct {v0, p0, p3}, Lb10/g0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/g0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/g0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "consumers/shipping_addresses/list"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iget-object v2, p0, Lb10/z0;->d:Lb10/d;

    iget-object v2, v2, Lb10/d;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "request_surface"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v5, "credentials"

    invoke-direct {v2, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->E:Lz00/a;

    iput v3, v0, Lb10/g0;->y:I

    new-instance p3, Lb01/f;

    const/16 v2, 0xc

    invoke-direct {p3, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final F(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/h0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/h0;

    iget v1, v0, Lb10/h0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/h0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/h0;

    invoke-direct {v0, p0, p3}, Lb10/h0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/h0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/h0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "consumers/sessions/log_out"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iget-object v2, p0, Lb10/z0;->d:Lb10/d;

    iget-object v2, v2, Lb10/d;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "request_surface"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v5, "credentials"

    invoke-direct {v2, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/b;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput v3, v0, Lb10/h0;->y:I

    new-instance p3, Lb01/f;

    const/16 v2, 0xc

    invoke-direct {p3, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final G(Lyy/g;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/i0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/i0;

    iget v1, v0, Lb10/i0;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/i0;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/i0;

    invoke-direct {v0, p0, p3}, Lb10/i0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/i0;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/i0;->G:I

    const-string v3, "networkaddress.cache.ttl"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lb10/i0;->z:Lb10/i;

    iget-object p2, v0, Lb10/i0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lb10/i0;->x:Lyy/g;

    iget-object v0, v0, Lb10/i0;->w:Lb10/z0;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_2

    :catchall_0
    move-exception p3

    move-object v5, p3

    move-object p3, p1

    move-object p1, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {v3}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "0"

    invoke-static {v3, v2}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lb10/h;

    invoke-direct {v2, p3}, Lb10/h;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p3

    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_1
    instance-of p3, v2, Ll83/m;

    if-eqz p3, :cond_3

    sget-object v2, Lb10/g;->a:Lb10/g;

    :cond_3
    move-object p3, v2

    check-cast p3, Lb10/i;

    :try_start_2
    iget-object v2, p0, Lb10/z0;->g:Lab/i0;

    iput-object p0, v0, Lb10/i0;->w:Lb10/z0;

    iput-object p1, v0, Lb10/i0;->x:Lyy/g;

    iput-object p2, v0, Lb10/i0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, v0, Lb10/i0;->z:Lb10/i;

    iput v4, v0, Lb10/i0;->G:I

    invoke-virtual {v2, p1, v0}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, p0

    :goto_2
    :try_start_3
    check-cast v0, Lyy/n0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v1, p0

    :goto_3
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_4
    new-instance v2, Ll83/n;

    invoke-direct {v2, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_8

    check-cast v0, Lyy/n0;

    iget-boolean p1, v0, Lyy/n0;->e:Z

    if-nez p1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p1, p3, Lb10/h;

    if-eqz p1, :cond_6

    check-cast p3, Lb10/h;

    iget-object p1, p3, Lb10/h;->a:Ljava/lang/String;

    if-nez p1, :cond_5

    const-string p1, "-1"

    :cond_5
    invoke-static {v3, p1}, Ljava/security/Security;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    return-object v0

    :cond_7
    invoke-virtual {v1, v0}, Lb10/z0;->C(Lyy/n0;)V

    const/4 p1, 0x0

    throw p1

    :cond_8
    instance-of p3, p2, Ljava/io/IOException;

    if-eqz p3, :cond_9

    sget p3, Lcom/stripe/android/core/exception/APIConnectionException;->F:I

    check-cast p2, Ljava/io/IOException;

    iget-object p1, p1, Lyy/g;->b:Ljava/lang/String;

    invoke-static {p2, p1}, Ls4/a;->a(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p2

    :cond_9
    throw p2
.end method

.method public final H(Ljava/util/Map;Ly00/d5;Ly00/x6;)Ljava/util/Map;
    .locals 4

    const-string v0, "payment_method_data"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    sget-object v2, Lm83/a0;->w:Lm83/a0;

    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ly00/d5;->h()Ljava/util/Set;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, p2

    :cond_2
    :goto_1
    invoke-virtual {p0, v2}, Lb10/z0;->d(Ljava/util/Set;)Ll83/k;

    move-result-object p2

    invoke-static {v1, p2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p2

    new-instance p3, Ll83/k;

    invoke-direct {p3, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, p3}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p2, "source_data"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_4

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    :cond_4
    if-eqz v3, :cond_6

    if-eqz p3, :cond_5

    iget-object v2, p3, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    :cond_5
    invoke-virtual {p0, v2}, Lb10/z0;->d(Ljava/util/Set;)Ll83/k;

    move-result-object p3

    invoke-static {v3, p3}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p3

    new-instance v0, Ll83/k;

    invoke-direct {v0, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    :cond_6
    return-object p1
.end method

.method public final I(Ly00/q;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lb10/j0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lb10/j0;

    iget v4, v3, Lb10/j0;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lb10/j0;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lb10/j0;

    invoke-direct {v3, v1, v2}, Lb10/j0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lb10/j0;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lb10/j0;->z:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lb10/j0;->w:Ly00/q;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lyy/f;->h()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v0, Ly00/q;->w:Ly00/d5;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    iput-object v0, v3, Lb10/j0;->w:Ly00/q;

    iput v6, v3, Lb10/j0;->z:I

    move-object/from16 v5, p2

    invoke-virtual {v1, v2, v5, v3}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    return-object v4

    :cond_4
    :goto_1
    instance-of v3, v2, Ll83/m;

    if-nez v3, :cond_7

    :try_start_0
    check-cast v2, Ly00/o4;

    iget-object v6, v0, Ly00/q;->E:Ljava/lang/String;

    iget-object v5, v2, Ly00/o4;->w:Ljava/lang/String;

    iget-object v0, v0, Ly00/q;->I:Ly00/u5;

    const-string v2, "clientSecret"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethodId"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Ly00/l5;

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    check-cast v0, Ly00/l5;

    goto :goto_2

    :cond_5
    move-object v0, v3

    :goto_2
    if-eqz v0, :cond_6

    iget-object v3, v0, Ly00/l5;->z:Ly00/o;

    :cond_6
    new-instance v8, Ly00/l5;

    invoke-direct {v8, v3}, Ly00/l5;-><init>(Ly00/o;)V

    sget-object v0, Ly00/f4;->G:Lt9/c0;

    const-string v13, "card"

    new-instance v3, Ly00/q;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v16, 0x0

    const v17, 0x77e2d

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Ly00/q;-><init>(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ly00/u5;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    return-object v0

    :cond_7
    return-object v2

    :cond_8
    :goto_3
    return-object v0
.end method

.method public final J(Ly00/r;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lb10/k0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lb10/k0;

    iget v4, v3, Lb10/k0;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lb10/k0;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lb10/k0;

    invoke-direct {v3, v1, v2}, Lb10/k0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lb10/k0;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lb10/k0;->z:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lb10/k0;->w:Ly00/r;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lyy/f;->h()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v0, Ly00/r;->y:Ly00/d5;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    iput-object v0, v3, Lb10/k0;->w:Ly00/r;

    iput v6, v3, Lb10/k0;->z:I

    move-object/from16 v5, p2

    invoke-virtual {v1, v2, v5, v3}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    return-object v4

    :cond_4
    :goto_1
    instance-of v3, v2, Ll83/m;

    if-nez v3, :cond_7

    :try_start_0
    check-cast v2, Ly00/o4;

    iget-object v4, v0, Ly00/r;->w:Ljava/lang/String;

    iget-object v5, v2, Ly00/o4;->w:Ljava/lang/String;

    iget-object v0, v0, Ly00/r;->J:Ly00/u5;

    const-string v2, "clientSecret"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethodId"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Ly00/l5;

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    check-cast v0, Ly00/l5;

    goto :goto_2

    :cond_5
    move-object v0, v3

    :goto_2
    if-eqz v0, :cond_6

    iget-object v3, v0, Ly00/l5;->z:Ly00/o;

    :cond_6
    new-instance v13, Ly00/l5;

    invoke-direct {v13, v3}, Ly00/l5;-><init>(Ly00/o;)V

    sget-object v0, Ly00/f4;->G:Lt9/c0;

    const-string v12, "card"

    new-instance v3, Ly00/r;

    const/16 v16, 0x0

    const/16 v17, 0x1cec

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Ly00/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/l5;Ly00/a6;Ly00/n;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    return-object v0

    :cond_7
    return-object v2

    :cond_8
    :goto_3
    return-object v0
.end method

.method public final K(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/l0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/l0;

    iget v1, v0, Lb10/l0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/l0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/l0;

    invoke-direct {v0, p0, p3}, Lb10/l0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/l0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/l0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    new-instance p3, Ly00/f3;

    invoke-direct {p3, p1}, Ly00/f3;-><init>(Ljava/lang/String;)V

    iget-object p3, p3, Ly00/f3;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p3

    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_1
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_4

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string v2, "paymentIntentId"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "payment_intents/%s/refresh"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v2, p3}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-static {p1, v2}, Lb10/z0;->l(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0x1c

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 v2, 0x2

    invoke-direct {p3, p0, v2}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/l0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :cond_4
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final L(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/m0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/m0;

    iget v1, v0, Lb10/m0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/m0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/m0;

    invoke-direct {v0, p0, p3}, Lb10/m0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/m0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/m0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    new-instance p3, Ly00/d6;

    invoke-direct {p3, p1}, Ly00/d6;-><init>(Ljava/lang/String;)V

    iget-object p3, p3, Ly00/d6;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p3

    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_1
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_4

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string v2, "paymentIntentId"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "setup_intents/%s/refresh"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v2, p3}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-static {p1, v2}, Lb10/z0;->l(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 v2, 0x1

    invoke-direct {p3, p0, v2}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/m0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :cond_4
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final M(Lyy/f;Ljava/util/Map;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/n0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/n0;

    iget v1, v0, Lb10/n0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/n0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/n0;

    invoke-direct {v0, p0, p3}, Lb10/n0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/n0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/n0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "https://merchant-ui-api.stripe.com/elements/mobile-card-element-config"

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p1, p2, v2}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0xc

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    iput v3, v0, Lb10/n0;->y:I

    new-instance p3, Lb01/f;

    const/16 v2, 0xc

    invoke-direct {p3, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final N(Ljava/lang/String;Ljava/util/Set;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/o0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/o0;

    iget v1, v0, Lb10/o0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/o0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/o0;

    invoke-direct {v0, p0, p3}, Lb10/o0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/o0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/o0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "customerId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "customers/%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    const/16 v2, 0xc

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p1, p4, p3, v2}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p3, Lz00/a;

    const/16 p4, 0x9

    invoke-direct {p3, p4}, Lz00/a;-><init>(I)V

    new-instance p4, Lb10/f;

    const/4 v2, 0x2

    invoke-direct {p4, p0, p2, v2}, Lb10/f;-><init>(Lb10/z0;Ljava/util/Set;I)V

    iput v3, v0, Lb10/o0;->y:I

    invoke-virtual {p0, p1, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final O(Ly00/b2;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lb10/p0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/p0;

    iget v1, v0, Lb10/p0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/p0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/p0;

    invoke-direct {v0, p0, p3}, Lb10/p0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/p0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/p0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lb10/p0;->y:I

    invoke-virtual {p0, p1, p2, v0}, Lb10/z0;->P(Ly00/b2;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final P(Ly00/b2;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lb10/q0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lb10/q0;

    iget v4, v3, Lb10/q0;->y:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lb10/q0;->y:I

    goto :goto_0

    :cond_0
    new-instance v3, Lb10/q0;

    invoke-direct {v3, v0, v2}, Lb10/q0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lb10/q0;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lb10/q0;->y:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v1, v2, Ll83/n;->w:Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lyy/f;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid API key"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    return-object v1

    :cond_3
    invoke-virtual {v0}, Lb10/z0;->y()V

    new-instance v2, Lf1/p1;

    invoke-virtual/range {p2 .. p2}, Lyy/f;->f()Z

    move-result v5

    invoke-direct {v2, v1, v5}, Lf1/p1;-><init>(Ly00/b2;Z)V

    new-instance v5, Ln83/f;

    invoke-direct {v5}, Ln83/f;-><init>()V

    const-string v7, "type"

    invoke-interface {v1}, Ly00/b2;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "mobile_app_id"

    invoke-interface {v1}, Ly00/b2;->r0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ly00/b2;->getClientSecret()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    const-string v8, "client_secret"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-interface {v1}, Ly00/b2;->s0()Ljava/lang/String;

    move-result-object v7

    const-string v8, "locale"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ly00/b2;->E()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    const-string v8, "customer_session_client_secret"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {v1}, Ly00/b2;->l()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    const-string v8, "legacy_customer_ephemeral_key"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-interface {v1}, Ly00/b2;->r()Ljava/util/List;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_1

    :cond_7
    const/4 v7, 0x0

    :goto_1
    if-eqz v7, :cond_8

    const-string v8, "external_payment_methods"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    invoke-interface {v1}, Ly00/b2;->t0()Ljava/util/List;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_2

    :cond_9
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_a

    const-string v8, "custom_payment_methods"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-interface {v1}, Ly00/b2;->Q()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_b

    goto :goto_3

    :cond_b
    const/4 v7, 0x0

    :goto_3
    if-eqz v7, :cond_c

    const-string v8, "mobile_session_id"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-interface {v1}, Ly00/b2;->t()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_d

    const-string v8, "client_default_payment_method"

    invoke-virtual {v5, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    invoke-interface {v1}, Ly00/b2;->W()Ly00/z1;

    move-result-object v7

    if-eqz v7, :cond_e

    iget-object v8, v7, Ly00/z1;->w:Ljava/lang/String;

    new-instance v10, Ll83/k;

    const-string v11, "seller_details[network_id]"

    invoke-direct {v10, v11, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v7, Ly00/z1;->x:Ljava/lang/String;

    new-instance v8, Ll83/k;

    const-string v11, "seller_details[external_id]"

    invoke-direct {v8, v11, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v8}, [Ll83/k;

    move-result-object v7

    invoke-static {v7}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v5, v7}, Ln83/f;->putAll(Ljava/util/Map;)V

    :cond_e
    invoke-interface {v1}, Ly00/b2;->U()Ly00/x1;

    move-result-object v7

    iget-object v7, v7, Ly00/x1;->w:Ljava/util/Set;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v7

    const/16 v8, 0xa

    invoke-static {v7, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-static {v10}, Lm83/g0;->W(I)I

    move-result v10

    const/16 v11, 0x10

    if-ge v10, v11, :cond_f

    move v10, v11

    :cond_f
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v7}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    move-object v10, v7

    check-cast v10, Lm83/d0;

    iget-object v12, v10, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, "]"

    if-eqz v12, :cond_10

    invoke-virtual {v10}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm83/c0;

    iget v12, v10, Lm83/c0;->a:I

    iget-object v10, v10, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "link[disallow_funding_source_creation]["

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_10
    invoke-virtual {v5, v11}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-interface {v1}, Ly00/b2;->u0()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_11

    const-string v10, "country_override"

    invoke-virtual {v5, v10, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    instance-of v7, v1, Ly00/w1;

    if-eqz v7, :cond_12

    move-object v7, v1

    check-cast v7, Ly00/w1;

    goto :goto_5

    :cond_12
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_1d

    iget-object v7, v7, Ly00/w1;->x:Ly00/a1;

    iget-object v10, v7, Ly00/a1;->w:Ly00/z0;

    invoke-interface {v10}, Ly00/z0;->v()Ljava/lang/String;

    move-result-object v11

    new-instance v14, Ll83/k;

    const-string v12, "deferred_intent[mode]"

    invoke-direct {v14, v12, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    instance-of v11, v10, Ly00/w0;

    if-eqz v11, :cond_13

    move-object v12, v10

    check-cast v12, Ly00/w0;

    goto :goto_6

    :cond_13
    const/4 v12, 0x0

    :goto_6
    if-eqz v12, :cond_14

    move-object v15, v10

    const/16 p3, 0x0

    iget-wide v9, v12, Ly00/w0;->w:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    move-object v10, v15

    goto :goto_7

    :cond_14
    const/16 p3, 0x0

    move-object/from16 v9, p3

    :goto_7
    new-instance v15, Ll83/k;

    const-string v12, "deferred_intent[amount]"

    invoke-direct {v15, v12, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v10}, Ly00/z0;->k0()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ll83/k;

    const-string v6, "deferred_intent[currency]"

    invoke-direct {v12, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v10}, Ly00/z0;->D()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v6

    if-eqz v6, :cond_15

    iget-object v6, v6, Lcom/stripe/android/model/StripeIntent$Usage;->w:Ljava/lang/String;

    goto :goto_8

    :cond_15
    move-object/from16 v6, p3

    :goto_8
    new-instance v9, Ll83/k;

    const-string v8, "deferred_intent[setup_future_usage]"

    invoke-direct {v9, v8, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v11, :cond_16

    move-object v6, v10

    check-cast v6, Ly00/w0;

    goto :goto_9

    :cond_16
    move-object/from16 v6, p3

    :goto_9
    if-eqz v6, :cond_17

    iget-object v6, v6, Ly00/w0;->z:Ly00/e3;

    if-eqz v6, :cond_17

    iget-object v6, v6, Ly00/e3;->w:Ljava/lang/String;

    goto :goto_a

    :cond_17
    move-object/from16 v6, p3

    :goto_a
    new-instance v8, Ll83/k;

    const-string v1, "deferred_intent[capture_method]"

    invoke-direct {v8, v1, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v7, Ly00/a1;->y:Ljava/lang/String;

    new-instance v6, Ll83/k;

    move-object/from16 v18, v8

    const-string v8, "deferred_intent[payment_method_configuration][id]"

    invoke-direct {v6, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v7, Ly00/a1;->z:Ljava/lang/String;

    new-instance v8, Ll83/k;

    move-object/from16 v19, v6

    const-string v6, "deferred_intent[on_behalf_of]"

    invoke-direct {v8, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v11, :cond_18

    check-cast v10, Ly00/w0;

    goto :goto_b

    :cond_18
    move-object/from16 v10, p3

    :goto_b
    if-eqz v10, :cond_19

    iget-object v1, v10, Ly00/w0;->E:Ljava/lang/String;

    if-eqz v1, :cond_19

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    goto :goto_c

    :cond_19
    move-object/from16 v1, p3

    :goto_c
    new-instance v6, Ll83/k;

    const-string v10, "deferred_intent[payment_method_options]"

    invoke-direct {v6, v10, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v21, v6

    move-object/from16 v20, v8

    move-object/from16 v17, v9

    move-object/from16 v16, v12

    filled-new-array/range {v14 .. v21}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    iget-object v6, v7, Ly00/a1;->x:Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    if-ltz v8, :cond_1a

    check-cast v9, Ljava/lang/String;

    const-string v11, "deferred_intent[payment_method_types]["

    invoke-static {v8, v11, v13}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ll83/k;

    invoke-direct {v11, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v8, v10

    goto :goto_d

    :cond_1a
    invoke-static {}, Lwb3/f;->d0()V

    throw p3

    :cond_1b
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-static {v7}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    goto :goto_e

    :cond_1c
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v6, v7}, Lm83/g0;->g0(Ljava/util/LinkedHashMap;Ljava/lang/Iterable;)V

    move-object v1, v6

    :goto_e
    invoke-virtual {v5, v1}, Ln83/f;->putAll(Ljava/util/Map;)V

    :cond_1d
    invoke-virtual {v5}, Ln83/f;->b()Ln83/f;

    move-result-object v1

    const-string v5, "elements/sessions"

    invoke-static {v5}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, Ly00/b2;->f0()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v1, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    const/16 v6, 0x8

    iget-object v7, v0, Lb10/z0;->l:Lq30/w0;

    move-object/from16 v8, p2

    invoke-static {v7, v5, v8, v1, v6}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object v1

    new-instance v5, Lb01/f;

    invoke-direct {v5, v0}, Lb01/f;-><init>(Lb10/z0;)V

    const/4 v6, 0x1

    iput v6, v3, Lb10/q0;->y:I

    invoke-virtual {v0, v1, v2, v5, v3}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_1e

    return-object v4

    :cond_1e
    return-object v1
.end method

.method public final Q(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lb10/r0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/r0;

    iget v1, v0, Lb10/r0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/r0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/r0;

    invoke-direct {v0, p0, p4}, Lb10/r0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/r0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/r0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    new-instance p4, Ly00/f3;

    invoke-direct {p4, p1}, Ly00/f3;-><init>(Ljava/lang/String;)V

    iget-object p4, p4, Ly00/f3;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p4

    invoke-static {p4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p2}, Lyy/f;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p3}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {p1, p3}, Lb10/z0;->l(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    :goto_2
    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string p3, "paymentIntentId"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payment_intents/%s"

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    invoke-static {p3, p4}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const/16 p4, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p3, p2, p1, p4}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0x1c

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 p4, 0x7

    invoke-direct {p3, p0, p4}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/r0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    :cond_5
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final R(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lb10/s0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/s0;

    iget v1, v0, Lb10/s0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/s0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/s0;

    invoke-direct {v0, p0, p4}, Lb10/s0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/s0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/s0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    new-instance p4, Ly00/d6;

    invoke-direct {p4, p1}, Ly00/d6;-><init>(Ljava/lang/String;)V

    iget-object p4, p4, Ly00/d6;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p4

    invoke-static {p4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p2}, Lyy/f;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p3}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {p1, p3}, Lb10/z0;->l(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    :goto_2
    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string p3, "setupIntentId"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "setup_intents/%s"

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    invoke-static {p3, p4}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const/16 p4, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p3, p2, p1, p4}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 p4, 0x6

    invoke-direct {p3, p0, p4}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/s0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    :cond_5
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final S(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lb10/t0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/t0;

    iget v1, v0, Lb10/t0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/t0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/t0;

    invoke-direct {v0, p0, p4}, Lb10/t0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/t0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/t0;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p4, Ly00/f3;->c:Ljava/util/regex/Pattern;

    const-string p4, "value"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, Ly00/f3;->c:Ljava/util/regex/Pattern;

    invoke-virtual {p4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/regex/Matcher;->matches()Z

    move-result p4

    if-eqz p4, :cond_5

    iput v4, v0, Lb10/t0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->Q(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    return-object p1

    :cond_5
    sget-object p4, Ly00/d6;->c:Ljava/util/regex/Pattern;

    sget-object p4, Ly00/d6;->c:Ljava/util/regex/Pattern;

    invoke-virtual {p4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/regex/Matcher;->matches()Z

    move-result p4

    if-eqz p4, :cond_7

    iput v3, v0, Lb10/t0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->R(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid client secret."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final T(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lb10/u0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/u0;

    iget v1, v0, Lb10/u0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/u0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/u0;

    invoke-direct {v0, p0, p3}, Lb10/u0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/u0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/u0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "customerId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v2, "elements/customers/"

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/set_default_payment_method"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p2, :cond_3

    const-string p2, ""

    :cond_3
    const-string p3, "payment_method"

    invoke-static {p3, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    const/16 p3, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p1, p4, p2, p3}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0x9

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    iput v3, v0, Lb10/u0;->y:I

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public final U(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p5, Lb10/v0;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lb10/v0;

    iget v1, v0, Lb10/v0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/v0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/v0;

    invoke-direct {v0, p0, p5}, Lb10/v0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Lb10/v0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/v0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p1, p5, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p5, "consumers/payment_details/share"

    invoke-static {p5}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    iget-object v2, p0, Lb10/z0;->d:Lb10/d;

    iget-object v2, v2, Lb10/d;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "request_surface"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v5, "credentials"

    invoke-direct {v2, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v5, "id"

    invoke-direct {p1, v5, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p0, p2}, Lb10/z0;->d(Ljava/util/Set;)Ll83/k;

    move-result-object p2

    filled-new-array {v4, v2, p1, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    if-nez p3, :cond_3

    sget-object p3, Lm83/z;->w:Lm83/z;

    :cond_3
    invoke-static {p1, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p2, 0x8

    iget-object p3, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {p3, p5, p4, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->y:Lz00/a;

    iput v3, v0, Lb10/v0;->y:I

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_5

    check-cast p1, Ly00/h0;

    iget-object p1, p1, Ly00/h0;->w:Ly00/o4;

    :cond_5
    return-object p1
.end method

.method public final V(Ly00/z6;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/w0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/w0;

    iget v1, v0, Lb10/w0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/w0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/w0;

    invoke-direct {v0, p0, p3}, Lb10/w0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/w0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/w0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "3ds2/authenticate"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ly00/z6;->c0()Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x4

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 v2, 0x5

    invoke-direct {p3, p0, v2}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/w0;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final W(Ljava/lang/String;Ly00/i0;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lb10/x0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/x0;

    iget v1, v0, Lb10/x0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/x0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/x0;

    invoke-direct {v0, p0, p4}, Lb10/x0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/x0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/x0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p2, Ly00/i0;->w:Ljava/lang/String;

    const-string v2, "paymentDetailsId"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "consumers/payment_details/"

    invoke-virtual {v2, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iget-object v2, p0, Lb10/z0;->d:Lb10/d;

    iget-object v2, v2, Lb10/d;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "request_surface"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "consumer_session_client_secret"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v5, "credentials"

    invoke-direct {v2, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, Ly00/i0;->c0()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p2, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p4, p3, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lz00/a;->x:Lz00/a;

    iput v3, v0, Lb10/x0;->y:I

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final X(Ljava/lang/String;Ly00/y5;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lb10/y0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/y0;

    iget v1, v0, Lb10/y0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/y0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/y0;

    invoke-direct {v0, p0, p4}, Lb10/y0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/y0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/y0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string p4, "paymentMethodId"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "payment_methods/"

    invoke-virtual {p4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ly00/y5;->c0()Ljava/util/Map;

    move-result-object p4

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p1, p3, p4, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p3, Lz00/a;

    const/16 p4, 0x1d

    invoke-direct {p3, p4}, Lz00/a;-><init>(I)V

    new-instance p4, La20/g;

    const/16 v2, 0x16

    invoke-direct {p4, v2, p0, p2}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lb10/y0;->y:I

    invoke-virtual {p0, p1, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p6, Lb10/j;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lb10/j;

    iget v1, v0, Lb10/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/j;

    invoke-direct {v0, p0, p6}, Lb10/j;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p6, v0, Lb10/j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/j;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p6, Ll83/n;

    iget-object p1, p6, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p6, "paymentIntentId"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "financialConnectionsSessionId"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "payment_intents/%s/link_account_sessions/%s/attach"

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p6, p2}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "client_secret"

    invoke-static {p3, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p5}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p1, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p3, 0x8

    iget-object p5, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {p5, p2, p4, p1, p3}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0x1c

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    iput v3, v0, Lb10/j;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p6, Lb10/k;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lb10/k;

    iget v1, v0, Lb10/k;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/k;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/k;

    invoke-direct {v0, p0, p6}, Lb10/k;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p6, v0, Lb10/k;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/k;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p6, Ll83/n;

    iget-object p1, p6, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p6, "setupIntentId"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "financialConnectionsSessionId"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "setup_intents/%s/link_account_sessions/%s/attach"

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p6, p2}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "client_secret"

    invoke-static {p3, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p5}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p1, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/16 p3, 0x8

    iget-object p5, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {p5, p2, p4, p1, p3}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    iput v3, v0, Lb10/k;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final c(Ljava/util/Set;)Ljava/lang/String;
    .locals 7

    const-string v0, "attribution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripe-android/22.6.1"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lb10/z0;->f:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ";"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/Set;)Ll83/k;
    .locals 2

    invoke-virtual {p0, p1}, Lb10/z0;->c(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "payment_user_agent"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lb10/l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/l;

    iget v1, v0, Lb10/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/l;

    invoke-direct {v0, p0, p3}, Lb10/l;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/l;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string p3, "paymentIntentId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payment_intents/%s/source_cancel"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "source"

    invoke-static {p3, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    const/16 p3, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p1, p4, p2, p3}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0x1c

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 p4, 0x4

    invoke-direct {p3, p0, p4}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/l;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lb10/m;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/m;

    iget v1, v0, Lb10/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/m;

    invoke-direct {v0, p0, p3}, Lb10/m;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/m;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "setupIntentId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "setup_intents/%s/source_cancel"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "source"

    invoke-static {p3, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    const/16 p3, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p1, p4, p2, p3}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lb10/e;-><init>(Lb10/z0;I)V

    iput v3, v0, Lb10/m;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final g(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/n;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/n;

    iget v1, v0, Lb10/n;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/n;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/n;

    invoke-direct {v0, p0, p3}, Lb10/n;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/n;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/n;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "3ds2/challenge_complete"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "source"

    invoke-static {v2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p3, p2, p1, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x4

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    iput v3, v0, Lb10/n;->y:I

    new-instance p3, Lb01/f;

    const/16 v2, 0xc

    invoke-direct {p3, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final h(Ly00/q;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lb10/o;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/o;

    iget v1, v0, Lb10/o;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/o;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/o;

    invoke-direct {v0, p0, p4}, Lb10/o;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/o;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/o;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lb10/o;->y:Ljava/util/List;

    move-object p3, p1

    check-cast p3, Ljava/util/List;

    iget-object p2, v0, Lb10/o;->x:Lyy/f;

    iget-object p1, v0, Lb10/o;->w:Lb10/z0;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lb10/o;->w:Lb10/z0;

    iput-object p2, v0, Lb10/o;->x:Lyy/f;

    move-object p4, p3

    check-cast p4, Ljava/util/List;

    iput-object p4, v0, Lb10/o;->y:Ljava/util/List;

    iput v4, v0, Lb10/o;->F:I

    invoke-virtual {p0, p1, p2, v0}, Lb10/z0;->I(Ly00/q;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_6

    check-cast p4, Ly00/q;

    const/4 v2, 0x0

    iput-object v2, v0, Lb10/o;->w:Lb10/z0;

    iput-object v2, v0, Lb10/o;->x:Lyy/f;

    iput-object v2, v0, Lb10/o;->y:Ljava/util/List;

    iput v3, v0, Lb10/o;->F:I

    invoke-virtual {p1, p4, p2, p3, v0}, Lb10/z0;->i(Ly00/q;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    :cond_6
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ly00/q;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lb10/p;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/p;

    iget v1, v0, Lb10/p;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/p;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/p;

    invoke-direct {v0, p0, p4}, Lb10/p;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/p;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/p;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ly00/q;->c0()Ljava/util/Map;

    move-result-object p4

    invoke-virtual {p2}, Lyy/f;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "client_secret"

    invoke-static {v2, p4}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p4

    :cond_3
    iget-object v2, p1, Ly00/q;->w:Ly00/d5;

    iget-object v4, p1, Ly00/q;->y:Ly00/x6;

    invoke-virtual {p0, p4, v2, v4}, Lb10/z0;->H(Ljava/util/Map;Ly00/d5;Ly00/x6;)Ljava/util/Map;

    move-result-object p4

    invoke-static {p3}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p4, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p3

    iget-object p4, p0, Lb10/z0;->i:Lty/a;

    invoke-virtual {p4}, Lty/a;->a()Lty/b;

    move-result-object p4

    iget-object v2, p0, Lb10/z0;->k:Lt9/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p4}, Lt9/p;->f(Ljava/util/LinkedHashMap;Lty/b;)Ljava/util/Map;

    move-result-object p3

    :try_start_0
    new-instance p4, Ly00/f3;

    iget-object v2, p1, Ly00/q;->E:Ljava/lang/String;

    invoke-direct {p4, v2}, Ly00/f3;-><init>(Ljava/lang/String;)V

    iget-object p4, p4, Ly00/f3;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p4

    invoke-static {p4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string v2, "paymentIntentId"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "payment_intents/%s/confirm"

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    invoke-static {v2, p4}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p4, p2, p3, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p2

    new-instance p3, Lz00/a;

    const/16 p4, 0x1c

    invoke-direct {p3, p4}, Lz00/a;-><init>(I)V

    new-instance p4, La20/g;

    const/16 v2, 0x19

    invoke-direct {p4, v2, p1, p0}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lb10/p;->y:I

    invoke-virtual {p0, p2, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    :cond_5
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ly00/r;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lb10/q;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/q;

    iget v1, v0, Lb10/q;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/q;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/q;

    invoke-direct {v0, p0, p4}, Lb10/q;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/q;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/q;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lb10/q;->y:Ljava/util/List;

    move-object p3, p1

    check-cast p3, Ljava/util/List;

    iget-object p2, v0, Lb10/q;->x:Lyy/f;

    iget-object p1, v0, Lb10/q;->w:Lb10/z0;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lb10/q;->w:Lb10/z0;

    iput-object p2, v0, Lb10/q;->x:Lyy/f;

    move-object p4, p3

    check-cast p4, Ljava/util/List;

    iput-object p4, v0, Lb10/q;->y:Ljava/util/List;

    iput v4, v0, Lb10/q;->F:I

    invoke-virtual {p0, p1, p2, v0}, Lb10/z0;->J(Ly00/r;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_6

    check-cast p4, Ly00/r;

    const/4 v2, 0x0

    iput-object v2, v0, Lb10/q;->w:Lb10/z0;

    iput-object v2, v0, Lb10/q;->x:Lyy/f;

    iput-object v2, v0, Lb10/q;->y:Ljava/util/List;

    iput v3, v0, Lb10/q;->F:I

    invoke-virtual {p1, p4, p2, p3, v0}, Lb10/z0;->k(Ly00/r;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    :cond_6
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ly00/r;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lb10/r;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/r;

    iget v1, v0, Lb10/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/r;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/r;

    invoke-direct {v0, p0, p4}, Lb10/r;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/r;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/r;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    new-instance p4, Ly00/d6;

    iget-object v2, p1, Ly00/r;->w:Ljava/lang/String;

    invoke-direct {p4, v2}, Ly00/d6;-><init>(Ljava/lang/String;)V

    iget-object p4, p4, Ly00/d6;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p4

    invoke-static {p4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string v2, "setupIntentId"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "setup_intents/%s/confirm"

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object p4

    invoke-static {v2, p4}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Ly00/r;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p2}, Lyy/f;->h()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "client_secret"

    invoke-static {v4, v2}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    :cond_3
    iget-object v4, p1, Ly00/r;->y:Ly00/d5;

    const/4 v5, 0x0

    invoke-virtual {p0, v2, v4, v5}, Lb10/z0;->H(Ljava/util/Map;Ly00/d5;Ly00/x6;)Ljava/util/Map;

    move-result-object v2

    invoke-static {p3}, Lkr/e;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object p3

    invoke-static {v2, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p3

    iget-object v2, p0, Lb10/z0;->i:Lty/a;

    invoke-virtual {v2}, Lty/a;->a()Lty/b;

    move-result-object v2

    iget-object v4, p0, Lb10/z0;->k:Lt9/p;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, v2}, Lt9/p;->f(Ljava/util/LinkedHashMap;Lty/b;)Ljava/util/Map;

    move-result-object p3

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p4, p2, p3, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p2

    new-instance p3, Lz00/g;

    const/4 p4, 0x1

    invoke-direct {p3, p4}, Lz00/g;-><init>(I)V

    new-instance p4, La20/g;

    const/16 v2, 0x17

    invoke-direct {p4, v2, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lb10/r;->y:I

    invoke-virtual {p0, p2, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1

    :cond_5
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ly00/w;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/s;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/s;

    iget v1, v0, Lb10/s;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/s;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/s;

    invoke-direct {v0, p0, p3}, Lb10/s;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/s;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/s;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "confirmation_tokens"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ly00/w;->c0()Ljava/util/Map;

    move-result-object v2

    iget-object v4, p1, Ly00/w;->x:Ly00/d5;

    const/4 v5, 0x0

    invoke-virtual {p0, v2, v4, v5}, Lb10/z0;->H(Ljava/util/Map;Ly00/d5;Ly00/x6;)Ljava/util/Map;

    move-result-object v2

    const/16 v4, 0x8

    iget-object v5, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v5, p3, p2, v2, v4}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p2

    new-instance p3, Lz00/a;

    const/16 v2, 0x8

    invoke-direct {p3, v2}, Lz00/a;-><init>(I)V

    new-instance v2, La20/g;

    const/16 v4, 0x15

    invoke-direct {v2, v4, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lb10/s;->y:I

    invoke-virtual {p0, p2, p3, v2, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final n(Ly00/m0;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lb10/t;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lb10/t;

    iget v4, v3, Lb10/t;->y:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lb10/t;->y:I

    goto :goto_0

    :cond_0
    new-instance v3, Lb10/t;

    invoke-direct {v3, v0, v2}, Lb10/t;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lb10/t;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lb10/t;->y:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v1, v2, Ll83/n;->w:Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v2, "connections/link_account_sessions_for_deferred_payment"

    invoke-static {v2}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, v1, Ly00/m0;->a:Ljava/lang/String;

    new-instance v7, Ll83/k;

    const-string v8, "unique_id"

    invoke-direct {v7, v8, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v5, "initial_institution"

    const/4 v9, 0x0

    invoke-direct {v8, v5, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v10, "manual_entry_only"

    invoke-direct {v5, v10, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const-string v11, "search_session"

    invoke-direct {v10, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v9, Ly00/i8;->w:Ly00/i8;

    new-instance v11, Ll83/k;

    const-string v9, "verification_method"

    const-string v12, "automatic"

    invoke-direct {v11, v9, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v1, Ly00/m0;->c:Ljava/lang/String;

    new-instance v12, Ll83/k;

    const-string v13, "customer"

    invoke-direct {v12, v13, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v1, Ly00/m0;->d:Ljava/lang/String;

    new-instance v13, Ll83/k;

    const-string v14, "on_behalf_of"

    invoke-direct {v13, v14, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v1, Ly00/m0;->b:Ljava/lang/String;

    new-instance v14, Ll83/k;

    const-string v15, "hosted_surface"

    invoke-direct {v14, v15, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v1, Ly00/m0;->e:Ly00/p2;

    if-eqz v9, :cond_3

    iget-object v9, v9, Ly00/p2;->w:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v9, "LINK_DISABLED"

    :goto_1
    new-instance v15, Ll83/k;

    const-string v6, "link_mode"

    invoke-direct {v15, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v6, v1, Ly00/m0;->g:Ljava/lang/Integer;

    new-instance v9, Ll83/k;

    move-object/from16 v16, v5

    const-string v5, "amount"

    invoke-direct {v9, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v5, v1, Ly00/m0;->h:Ljava/lang/String;

    new-instance v6, Ll83/k;

    move-object/from16 v17, v7

    const-string v7, "currency"

    invoke-direct {v6, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v1, Ly00/m0;->f:Ljava/lang/String;

    new-instance v5, Ll83/k;

    const-string v7, "product"

    invoke-direct {v5, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v7, v16

    move-object/from16 v16, v9

    move-object v9, v7

    move-object/from16 v18, v5

    move-object/from16 v7, v17

    move-object/from16 v17, v6

    filled-new-array/range {v7 .. v18}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const/16 v5, 0x8

    iget-object v6, v0, Lb10/z0;->l:Lq30/w0;

    move-object/from16 v7, p2

    invoke-static {v6, v2, v7, v1, v5}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object v1

    new-instance v2, Lz00/a;

    const/16 v5, 0xb

    invoke-direct {v2, v5}, Lz00/a;-><init>(I)V

    new-instance v5, Lb01/f;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, Lb01/f;-><init>(I)V

    const/4 v6, 0x1

    iput v6, v3, Lb10/t;->y:I

    invoke-virtual {v0, v1, v2, v5, v3}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4

    return-object v4

    :cond_4
    return-object v1
.end method

.method public final o(Ljava/lang/String;Ly00/p0;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lb10/u;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/u;

    iget v1, v0, Lb10/u;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/u;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/u;

    invoke-direct {v0, p0, p4}, Lb10/u;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/u;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/u;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p4, "paymentIntentId"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "payment_intents/%s/link_account_sessions"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p4, p1}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Ly00/p0;->toMap()Ljava/util/Map;

    move-result-object p2

    const/16 p4, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p1, p3, p2, p4}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0xb

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    iput v3, v0, Lb10/u;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/v;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/v;

    iget v1, v0, Lb10/v;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/v;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/v;

    invoke-direct {v0, p0, p3}, Lb10/v;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/v;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/v;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string p3, "payment_methods"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Ly00/d5;->h()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {p0, v4}, Lb10/z0;->d(Ljava/util/Set;)Ll83/k;

    move-result-object v4

    invoke-static {v2, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v2

    iget-object v4, p0, Lb10/z0;->i:Lty/a;

    invoke-virtual {v4}, Lty/a;->a()Lty/b;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lty/b;->b()Ljava/util/Map;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_4

    sget-object v4, Lm83/z;->w:Lm83/z;

    :cond_4
    invoke-static {v2, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    const/16 v4, 0x8

    iget-object v5, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v5, p3, p2, v2, v4}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p2

    new-instance p3, Lz00/a;

    const/16 v2, 0x1d

    invoke-direct {p3, v2}, Lz00/a;-><init>(I)V

    new-instance v2, La20/g;

    const/16 v4, 0x18

    invoke-direct {v2, v4, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lb10/v;->y:I

    invoke-virtual {p0, p2, p3, v2, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public final q(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lb10/w;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/w;

    iget v1, v0, Lb10/w;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/w;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/w;

    invoke-direct {v0, p0, p3}, Lb10/w;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/w;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/w;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v0, Lb10/w;->y:Lyy/f;

    iget-object p1, v0, Lb10/w;->x:Ljava/lang/String;

    iget-object v2, v0, Lb10/w;->w:Lb10/z0;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p3

    goto :goto_3

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    sget-boolean p3, Lux/j0;->d:Z

    if-eqz p3, :cond_6

    iget-object p3, p0, Lb10/z0;->i:Lty/a;

    iput-object p0, v0, Lb10/w;->w:Lb10/z0;

    iput-object p1, v0, Lb10/w;->x:Ljava/lang/String;

    iput-object p2, v0, Lb10/w;->y:Lyy/f;

    iput v4, v0, Lb10/w;->F:I

    iget-object v2, p3, Lty/a;->e:Lq83/j;

    new-instance v4, Ls40/c0;

    const/16 v6, 0xc

    invoke-direct {v4, p3, v5, v6}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p3, v1, :cond_4

    goto :goto_5

    :cond_4
    move-object v2, p0

    :goto_1
    if-eqz p3, :cond_5

    :try_start_3
    check-cast p3, Lty/b;

    goto :goto_4

    :cond_5
    const-string p3, "Could not obtain fraud data required to create a Radar Session."

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-direct {v4, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    move-object v2, p0

    goto :goto_3

    :catchall_2
    move-exception p3

    goto :goto_2

    :cond_6
    :try_start_4
    const-string p3, "Stripe.advancedFraudSignalsEnabled must be set to \'true\' to create a Radar Session."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_4
    instance-of v4, p3, Ll83/m;

    if-nez v4, :cond_8

    :try_start_5
    check-cast p3, Lty/b;

    invoke-virtual {p3}, Lty/b;->b()Ljava/util/Map;

    move-result-object p3

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v2, v4}, Lb10/z0;->d(Ljava/util/Set;)Ll83/k;

    move-result-object v4

    invoke-static {p3, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p3

    const-string v4, "payment_method"

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p3, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iget-object p3, v2, Lb10/z0;->l:Lq30/w0;

    const-string v4, "radar/saved_payment_method_session"

    invoke-static {v4}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x8

    invoke-static {p3, v4, p2, p1, v6}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/g;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lz00/g;-><init>(I)V

    new-instance p3, Lb10/e;

    const/4 v4, 0x3

    invoke-direct {p3, v2, v4}, Lb10/e;-><init>(Lb10/z0;I)V

    iput-object v5, v0, Lb10/w;->w:Lb10/z0;

    iput-object v5, v0, Lb10/w;->x:Ljava/lang/String;

    iput-object v5, v0, Lb10/w;->y:Lyy/f;

    iput v3, v0, Lb10/w;->F:I

    invoke-virtual {v2, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_5
    return-object v1

    :cond_7
    :goto_6
    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object p3, p2

    goto :goto_8

    :goto_7
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    move-object p3, p1

    :cond_8
    :goto_8
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_9

    :cond_9
    sget p2, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    new-instance p3, Ll83/n;

    invoke-direct {p3, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_9
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final r(Ljava/lang/String;Ly00/p0;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lb10/x;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lb10/x;

    iget v1, v0, Lb10/x;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/x;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/x;

    invoke-direct {v0, p0, p4}, Lb10/x;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lb10/x;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/x;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p4, "setupIntentId"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "setup_intents/%s/link_account_sessions"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p4, p1}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Ly00/p0;->toMap()Ljava/util/Map;

    move-result-object p2

    const/16 p4, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p1, p3, p2, p4}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p2, Lz00/a;

    const/16 p3, 0xb

    invoke-direct {p2, p3}, Lz00/a;-><init>(I)V

    new-instance p3, Lb01/f;

    const/16 p4, 0xc

    invoke-direct {p3, p4}, Lb01/f;-><init>(I)V

    iput v3, v0, Lb10/x;->y:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final s(Ly00/m;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/y;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/y;

    iget v1, v0, Lb10/y;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/y;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/y;

    invoke-direct {v0, p0, p3}, Lb10/y;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/y;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/y;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lb10/z0;->y()V

    const-string p3, "tokens"

    invoke-static {p3}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ly00/m;->c0()Ljava/util/Map;

    move-result-object v2

    iget-object v4, p1, Ly00/m;->w:Ljava/util/Set;

    invoke-virtual {p0, v4}, Lb10/z0;->d(Ljava/util/Set;)Ll83/k;

    move-result-object v4

    invoke-static {v2, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v2

    iget-object v4, p0, Lb10/z0;->i:Lty/a;

    invoke-virtual {v4}, Lty/a;->a()Lty/b;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lty/b;->b()Ljava/util/Map;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_4

    sget-object v4, Lm83/z;->w:Lm83/z;

    :cond_4
    invoke-static {v2, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    const/16 v4, 0x8

    iget-object v5, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v5, p3, p2, v2, v4}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p2

    new-instance p3, Lz00/g;

    const/4 v2, 0x5

    invoke-direct {p3, v2}, Lz00/g;-><init>(I)V

    new-instance v2, La20/g;

    const/16 v4, 0x1a

    invoke-direct {v2, v4, p0, p1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, v0, Lb10/y;->y:I

    invoke-virtual {p0, p2, p3, v2, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    instance-of v2, v1, Lb10/z;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lb10/z;

    iget v3, v2, Lb10/z;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lb10/z;->y:I

    goto :goto_0

    :cond_0
    new-instance v2, Lb10/z;

    invoke-direct {v2, p0, v1}, Lb10/z;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lb10/z;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lb10/z;->y:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, p0, Lb10/z0;->l:Lq30/w0;

    const-string v4, "paymentDetailsId"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "consumers/payment_details/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "request_surface"

    iget-object v4, p0, Lb10/z0;->d:Lb10/d;

    iget-object v4, v4, Lb10/d;->w:Ljava/lang/String;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "credentials"

    const-string v4, "consumer_session_client_secret"

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v4}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "url"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "options"

    move-object/from16 v10, p4

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lyy/g;

    sget-object v7, Lyy/k0;->z:Lyy/k0;

    iget-object p1, v1, Lq30/w0;->y:Ljava/lang/Object;

    move-object v11, p1

    check-cast v11, Lqy/c;

    iget-object p1, v1, Lq30/w0;->x:Ljava/lang/Object;

    move-object v12, p1

    check-cast v12, Ljava/lang/String;

    iget-object p1, v1, Lq30/w0;->z:Ljava/lang/Object;

    move-object v13, p1

    check-cast v13, Ljava/lang/String;

    invoke-direct/range {v6 .. v13}, Lyy/g;-><init>(Lyy/k0;Ljava/lang/String;Ljava/util/Map;Lyy/f;Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lb01/f;

    const/16 v0, 0xc

    invoke-direct {p1, v0}, Lb01/f;-><init>(I)V

    iput v5, v2, Lb10/z;->y:I

    invoke-virtual {p0, v6, p1, v2}, Lb10/z0;->G(Lyy/g;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ljava/lang/String;Ljava/util/Set;Ls83/c;Lyy/f;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lb10/a0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/a0;

    iget v1, v0, Lb10/a0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/a0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/a0;

    invoke-direct {v0, p0, p3}, Lb10/a0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/a0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/a0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p3, "paymentMethodId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payment_methods/%s/detach"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    const/16 v2, 0xc

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v4, p1, p4, p3, v2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p3, Lz00/a;

    const/16 p4, 0x1d

    invoke-direct {p3, p4}, Lz00/a;-><init>(I)V

    new-instance p4, Lb10/f;

    const/4 v2, 0x0

    invoke-direct {p4, p0, p2, v2}, Lb10/f;-><init>(Lb10/z0;Ljava/util/Set;I)V

    iput v3, v0, Lb10/a0;->y:I

    invoke-virtual {p0, p1, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final v(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p5, Lb10/b0;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lb10/b0;

    iget v1, v0, Lb10/b0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/b0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/b0;

    invoke-direct {v0, p0, p5}, Lb10/b0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Lb10/b0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/b0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p1, p5, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p5, "paymentMethodId"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "elements/payment_methods/%s/detach"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p5, p3}, Lkr/e;->n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string p5, "customer_session_client_secret"

    invoke-static {p5, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const/16 p5, 0x8

    iget-object v2, p0, Lb10/z0;->l:Lq30/w0;

    invoke-static {v2, p3, p4, p1, p5}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    new-instance p3, Lz00/a;

    const/16 p4, 0x1d

    invoke-direct {p3, p4}, Lz00/a;-><init>(I)V

    new-instance p4, Lb10/f;

    const/4 p5, 0x1

    invoke-direct {p4, p0, p2, p5}, Lb10/f;-><init>(Lb10/z0;Ljava/util/Set;I)V

    iput v3, v0, Lb10/b0;->y:I

    invoke-virtual {p0, p1, p3, p4, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 8

    const-string v0, "Unable to parse response with "

    instance-of v1, p4, Lb10/c0;

    if-eqz v1, :cond_0

    move-object v1, p4

    check-cast v1, Lb10/c0;

    iget v2, v1, Lb10/c0;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lb10/c0;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lb10/c0;

    invoke-direct {v1, p0, p4}, Lb10/c0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p4, v1, Lb10/c0;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lb10/c0;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p2, v1, Lb10/c0;->w:Lwy/b;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v1, Lb10/c0;->w:Lwy/b;

    iput v4, v1, Lb10/c0;->z:I

    invoke-virtual {p0, p1, p3, v1}, Lb10/z0;->G(Lyy/g;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p4, Lyy/n0;

    invoke-static {p4}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {p2, p1}, Lwy/b;->m(Lorg/json/JSONObject;)Lvy/b;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    :cond_4
    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v3, 0x17

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/APIException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V
    .locals 7

    const/4 v5, 0x0

    const/16 v6, 0x3e

    iget-object v0, p0, Lb10/z0;->j:Lb10/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, p0, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-void
.end method

.method public final y()V
    .locals 1

    iget-object v0, p0, Lb10/z0;->i:Lty/a;

    invoke-virtual {v0}, Lty/a;->b()V

    return-void
.end method

.method public final z(Lzx/a;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb10/d0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb10/d0;

    iget v1, v0, Lb10/d0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb10/d0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb10/d0;

    invoke-direct {v0, p0, p3}, Lb10/d0;-><init>(Lb10/z0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lb10/d0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb10/d0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lb10/d0;->w:Lb10/z0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p2, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p3, 0x0

    const/4 v2, 0x5

    invoke-static {p2, p3, v2}, Lyy/f;->b(Lyy/f;Ljava/lang/String;I)Lyy/f;

    move-result-object p3

    iget-object p2, p2, Lyy/f;->w:Ljava/lang/String;

    new-instance v2, Ll83/k;

    const-string v4, "key"

    invoke-direct {v2, v4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p1, Lzx/a;->w:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "bin_prefix"

    invoke-direct {v4, v5, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v4}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    const/16 v2, 0x8

    iget-object v4, p0, Lb10/z0;->l:Lq30/w0;

    const-string v5, "https://api.stripe.com/edge-internal/card-metadata"

    invoke-static {v4, v5, p3, p2, v2}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p2

    new-instance p3, Lso/q;

    const-string v2, "bin"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p1, p3, Lso/q;->w:Ljava/lang/Object;

    new-instance p1, Lz00/a;

    const/4 v2, 0x7

    invoke-direct {p1, v2}, Lz00/a;-><init>(I)V

    iput-object p1, p3, Lso/q;->x:Ljava/lang/Object;

    iput-object p0, v0, Lb10/d0;->w:Lb10/z0;

    iput v3, v0, Lb10/d0;->z:I

    new-instance p1, Lb01/f;

    const/16 v2, 0xc

    invoke-direct {p1, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {p0, p2, p3, p1, v0}, Lb10/z0;->w(Lyy/g;Lwy/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_4

    sget-object p3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->t0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {p1, p3}, Lb10/z0;->x(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V

    :cond_4
    return-object p2
.end method
