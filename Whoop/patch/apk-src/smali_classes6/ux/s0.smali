.class public final Lux/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:Ljava/util/List;

.field public static final m:J


# instance fields
.field public final a:Lc93/a;

.field public final b:Lb10/z0;

.field public final c:Lyy/j;

.field public final d:Lb10/b;

.field public final e:Lq83/j;

.field public final f:Lv10/k;

.field public final g:Lv10/o;

.field public final h:Lv10/a;

.field public final i:Z

.field public final j:Luo1/b;

.field public final k:Lc20/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "payment_method"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lux/s0;->l:Ljava/util/List;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lux/s0;->m:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc93/a;Lb10/z0;Lq83/j;I)V
    .locals 9

    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    sget-object p4, Lbc3/q0;->a:Lkc3/e;

    sget-object p4, Lkc3/d;->w:Lkc3/d;

    :cond_0
    move-object v5, p4

    new-instance p4, Lyy/j;

    sget-object v4, Lqy/e;->b:Lqy/d;

    invoke-direct {p4, v4, v5}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance p5, Lb10/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb10/a;

    const/4 v6, 0x2

    invoke-direct {v1, p2, v6}, Lb10/a;-><init>(Lc93/a;I)V

    invoke-direct {p5, v0, v1}, Lb10/b;-><init>(Landroid/content/Context;Lk83/a;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v7, Lhc3/o;->a:Lbc3/w1;

    const-string v0, "workContext"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lux/s0;->a:Lc93/a;

    iput-object p3, p0, Lux/s0;->b:Lb10/z0;

    iput-object p4, p0, Lux/s0;->c:Lyy/j;

    iput-object p5, p0, Lux/s0;->d:Lb10/b;

    iput-object v7, p0, Lux/s0;->e:Lq83/j;

    new-instance v0, Lv10/k;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lv10/k;-><init>(Landroid/content/Context;Lc93/a;Lb10/c1;Lqy/d;Lq83/j;)V

    iput-object v0, p0, Lux/s0;->f:Lv10/k;

    new-instance v0, Lv10/o;

    invoke-direct/range {v0 .. v5}, Lv10/o;-><init>(Landroid/content/Context;Lc93/a;Lb10/c1;Lqy/d;Lq83/j;)V

    iput-object v0, p0, Lux/s0;->g:Lv10/o;

    new-instance p1, Lv10/a;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "getPackageName(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lv10/a;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lux/s0;->h:Lv10/a;

    move-object v4, v7

    invoke-static {v1}, Le4/a;->G(Landroid/content/Context;)Z

    move-result v7

    iput-boolean v7, p0, Lux/s0;->i:Z

    new-instance p1, Luo1/b;

    invoke-direct {p1, p0, v6}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lux/s0;->j:Luo1/b;

    iget-object v6, p5, Lb10/b;->j:Ljava/util/Set;

    const/4 v8, 0x0

    move-object v3, v5

    move-object v5, v2

    const/4 v2, 0x0

    move-object v0, v1

    move-object v1, p5

    invoke-static/range {v0 .. v8}, Lce/w;->F(Landroid/content/Context;Lb10/b;ZLq83/j;Lq83/j;Lc93/a;Ljava/util/Set;ZZ)Lc20/a;

    move-result-object p1

    iput-object p1, p0, Lux/s0;->k:Lc20/a;

    return-void
.end method


# virtual methods
.method public final a(Ly00/q;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lux/n0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lux/n0;

    iget v1, v0, Lux/n0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lux/n0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lux/n0;

    invoke-direct {v0, p0, p3}, Lux/n0;-><init>(Lux/s0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lux/n0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lux/n0;->y:I

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

    invoke-virtual {p1}, Ly00/q;->b()Ly00/q;

    move-result-object p1

    iput v3, v0, Lux/n0;->y:I

    iget-object p3, p0, Lux/s0;->b:Lb10/z0;

    sget-object v2, Lux/s0;->l:Ljava/util/List;

    invoke-virtual {p3, p1, p2, v2, v0}, Lb10/z0;->h(Ly00/q;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final b(Ly00/r;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lux/o0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lux/o0;

    iget v1, v0, Lux/o0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lux/o0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lux/o0;

    invoke-direct {v0, p0, p3}, Lux/o0;-><init>(Lux/s0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lux/o0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lux/o0;->y:I

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

    invoke-virtual {p1}, Ly00/r;->b()Ly00/r;

    move-result-object p1

    iput v3, v0, Lux/o0;->y:I

    iget-object p3, p0, Lux/s0;->b:Lb10/z0;

    sget-object v2, Lux/s0;->l:Ljava/util/List;

    invoke-virtual {p3, p1, p2, v2, v0}, Lb10/z0;->j(Ly00/r;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final c(Landroid/content/Intent;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lux/p0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lux/p0;

    iget v1, v0, Lux/p0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lux/p0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lux/p0;

    invoke-direct {v0, p0, p2}, Lux/p0;-><init>(Lux/s0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lux/p0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lux/p0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    const-string p2, "extra_args"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lv10/b;

    if-nez p1, :cond_4

    :cond_3
    new-instance v4, Lv10/b;

    const/4 v10, 0x0

    const/16 v11, 0x7f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    move-object p1, v4

    :cond_4
    iput v3, v0, Lux/p0;->y:I

    iget-object p2, p0, Lux/s0;->f:Lv10/k;

    invoke-virtual {p2, p1, v0}, Lv10/g;->e(Lv10/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public final d(Landroid/content/Intent;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lux/q0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lux/q0;

    iget v1, v0, Lux/q0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lux/q0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lux/q0;

    invoke-direct {v0, p0, p2}, Lux/q0;-><init>(Lux/s0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lux/q0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lux/q0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    const-string p2, "extra_args"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lv10/b;

    if-nez p1, :cond_4

    :cond_3
    new-instance v4, Lv10/b;

    const/4 v10, 0x0

    const/16 v11, 0x7f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    move-object p1, v4

    :cond_4
    iput v3, v0, Lux/q0;->y:I

    iget-object p2, p0, Lux/s0;->g:Lv10/o;

    invoke-virtual {p2, p1, v0}, Lv10/g;->e(Lv10/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    return-object p1
.end method

.method public final e(Ls40/a;Ly00/s;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v5, v4, Lux/r0;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lux/r0;

    iget v6, v5, Lux/r0;->G:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lux/r0;->G:I

    goto :goto_0

    :cond_0
    new-instance v5, Lux/r0;

    invoke-direct {v5, v0, v4}, Lux/r0;-><init>(Lux/s0;Ls83/c;)V

    :goto_0
    iget-object v4, v5, Lux/r0;->E:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lux/r0;->G:I

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const/4 v13, 0x0

    if-eqz v7, :cond_4

    if-eq v7, v11, :cond_3

    if-eq v7, v10, :cond_3

    if-eq v7, v9, :cond_2

    if-ne v7, v8, :cond_1

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v12

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v12

    :cond_3
    iget-object v1, v5, Lux/r0;->z:Lyy/f;

    iget-object v2, v5, Lux/r0;->y:Ly00/s;

    iget-object v3, v5, Lux/r0;->x:Ls40/a;

    iget-object v7, v5, Lux/r0;->w:Lux/s0;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v4, Ll83/n;

    iget-object v4, v4, Ll83/n;->w:Ljava/lang/Object;

    move-object/from16 v21, v3

    move-object v3, v1

    move-object/from16 v1, v21

    goto/16 :goto_4

    :cond_4
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v2}, Ly00/s;->getReturnUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v7, v0, Lux/s0;->h:Lv10/a;

    invoke-virtual {v7}, Lv10/a;->a()Ljava/lang/String;

    move-result-object v14

    invoke-static {v4, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->b0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    :goto_1
    move-object v15, v4

    goto :goto_2

    :cond_5
    if-nez v4, :cond_6

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->a0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_1

    :cond_6
    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->c0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_1

    :goto_2
    const/16 v19, 0x0

    const/16 v20, 0x3e

    iget-object v14, v0, Lux/s0;->d:Lb10/b;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v4

    iget-object v14, v0, Lux/s0;->c:Lyy/j;

    invoke-virtual {v14, v4}, Lyy/j;->a(Lyy/b;)V

    iget-boolean v4, v0, Lux/s0;->i:Z

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ly00/s;->getReturnUrl()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_7
    invoke-interface {v2}, Ly00/s;->getReturnUrl()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_9

    :cond_8
    move-object v4, v13

    :cond_9
    if-nez v4, :cond_a

    invoke-virtual {v7}, Lv10/a;->a()Ljava/lang/String;

    move-result-object v4

    :cond_a
    :goto_3
    instance-of v7, v2, Ly00/q;

    if-eqz v7, :cond_c

    move-object v7, v2

    check-cast v7, Ly00/q;

    iput-object v4, v7, Ly00/q;->F:Ljava/lang/String;

    iput-object v0, v5, Lux/r0;->w:Lux/s0;

    iput-object v1, v5, Lux/r0;->x:Ls40/a;

    iput-object v2, v5, Lux/r0;->y:Ly00/s;

    iput-object v3, v5, Lux/r0;->z:Lyy/f;

    iput v11, v5, Lux/r0;->G:I

    invoke-virtual {v0, v7, v3, v5}, Lux/s0;->a(Ly00/q;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_b

    goto/16 :goto_a

    :cond_b
    move-object v7, v0

    :goto_4
    move-object v15, v7

    goto :goto_5

    :cond_c
    instance-of v7, v2, Ly00/r;

    if-eqz v7, :cond_13

    move-object v7, v2

    check-cast v7, Ly00/r;

    iput-object v4, v7, Ly00/r;->z:Ljava/lang/String;

    iput-object v0, v5, Lux/r0;->w:Lux/s0;

    iput-object v1, v5, Lux/r0;->x:Ls40/a;

    iput-object v2, v5, Lux/r0;->y:Ly00/s;

    iput-object v3, v5, Lux/r0;->z:Lyy/f;

    iput v10, v5, Lux/r0;->G:I

    invoke-virtual {v0, v7, v3, v5}, Lux/s0;->b(Ly00/r;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_b

    goto :goto_a

    :goto_5
    invoke-static {v4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v17

    if-nez v17, :cond_e

    check-cast v4, Ly00/c8;

    iput-object v13, v5, Lux/r0;->w:Lux/s0;

    iput-object v13, v5, Lux/r0;->x:Ls40/a;

    iput-object v13, v5, Lux/r0;->y:Ly00/s;

    iput-object v13, v5, Lux/r0;->z:Lyy/f;

    iput v9, v5, Lux/r0;->G:I

    iget-object v2, v15, Lux/s0;->k:Lc20/a;

    invoke-virtual {v2, v4}, Lc20/a;->b(Ljava/lang/Object;)Lc20/e;

    move-result-object v2

    invoke-virtual {v2, v1, v4, v3, v5}, Lc20/e;->c(Ls40/a;Ljava/lang/Object;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_d

    goto :goto_6

    :cond_d
    move-object v1, v12

    :goto_6
    if-ne v1, v6, :cond_11

    goto :goto_a

    :cond_e
    const-string v3, "params"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v2, Ly00/q;

    if-eqz v3, :cond_f

    const v2, 0xc350

    :goto_7
    move/from16 v18, v2

    goto :goto_8

    :cond_f
    instance-of v2, v2, Ly00/r;

    if-eqz v2, :cond_12

    const v2, 0xc351

    goto :goto_7

    :goto_8
    iput-object v13, v5, Lux/r0;->w:Lux/s0;

    iput-object v13, v5, Lux/r0;->x:Ls40/a;

    iput-object v13, v5, Lux/r0;->y:Ly00/s;

    iput-object v13, v5, Lux/r0;->z:Lyy/f;

    iput v8, v5, Lux/r0;->G:I

    iget-object v2, v15, Lux/s0;->e:Lq83/j;

    new-instance v14, Ln43/a;

    const/16 v19, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v14 .. v19}, Ln43/a;-><init>(Lux/s0;Ls40/a;Ljava/lang/Throwable;ILq83/d;)V

    invoke-static {v2, v14, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_10

    goto :goto_9

    :cond_10
    move-object v1, v12

    :goto_9
    if-ne v1, v6, :cond_11

    :goto_a
    return-object v6

    :cond_11
    return-object v12

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
