.class public final Lx20/n;
.super Lc20/e;
.source "SourceFile"


# instance fields
.field public a:Lj/d;


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lx20/n;->a:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lx20/n;->a:Lj/d;

    return-void
.end method

.method public final b(Lj/c;Lj/b;)V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    iput-object p1, p0, Lx20/n;->a:Lj/d;

    return-void
.end method

.method public final d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 11

    check-cast p2, Ly00/c8;

    invoke-interface {p2}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    iget-object p4, p4, Ly00/o4;->E:Ly00/f4;

    goto :goto_0

    :cond_0
    move-object p4, v0

    :goto_0
    if-nez p4, :cond_1

    const/4 p4, -0x1

    goto :goto_1

    :cond_1
    sget-object v1, Lx20/m;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v1, p4

    :goto_1
    const/4 v1, 0x1

    const/4 v2, 0x4

    const-string v3, "Required value was null."

    if-eq p4, v1, :cond_b

    const/4 v4, 0x2

    if-eq p4, v4, :cond_9

    const/4 v4, 0x3

    if-eq p4, v4, :cond_6

    if-eq p4, v2, :cond_3

    invoke-interface {p2}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Ly00/o4;->E:Ly00/f4;

    if-eqz p1, :cond_2

    iget-object v0, p1, Ly00/f4;->w:Ljava/lang/String;

    :cond_2
    const-string p1, "Received invalid payment method type "

    const-string p2, " in PollingAuthenticator"

    invoke-static {p1, v0, p2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    move-object p4, v3

    new-instance v3, Lx20/k;

    invoke-interface {p2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p1, Ls40/a;->b:Ljava/lang/Integer;

    iget-object v9, p3, Lyy/f;->x:Ljava/lang/String;

    invoke-interface {p2}, Ly00/c8;->m()Ly00/b8;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayPromptPayDetails"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ly00/p7;

    iget-object v10, p2, Ly00/p7;->w:Ljava/lang/String;

    if-eqz v10, :cond_4

    const/16 v6, 0xe10

    const/4 v7, 0x5

    const v8, 0x7f1410da

    invoke-direct/range {v3 .. v10}, Lx20/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    move-object p4, v3

    new-instance v3, Lx20/k;

    invoke-interface {p2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    iget-object v5, p1, Ls40/a;->b:Ljava/lang/Integer;

    iget-object v9, p3, Lyy/f;->x:Ljava/lang/String;

    invoke-interface {p2}, Ly00/c8;->m()Ly00/b8;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayPayNowDetails"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ly00/o7;

    iget-object v10, p2, Ly00/o7;->w:Ljava/lang/String;

    if-eqz v10, :cond_7

    const/16 v6, 0xe10

    const/4 v7, 0x5

    const v8, 0x7f1410da

    invoke-direct/range {v3 .. v10}, Lx20/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    move-object p4, v3

    new-instance v3, Lx20/k;

    invoke-interface {p2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-object v5, p1, Ls40/a;->b:Ljava/lang/Integer;

    iget-object v9, p3, Lyy/f;->x:Ljava/lang/String;

    const/4 v10, 0x0

    const/16 v6, 0x3c

    const/4 v7, 0x5

    const v8, 0x7f140fd0

    invoke-direct/range {v3 .. v10}, Lx20/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    move-object p4, v3

    new-instance v3, Lx20/k;

    invoke-interface {p2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    iget-object v5, p1, Ls40/a;->b:Ljava/lang/Integer;

    iget-object v9, p3, Lyy/f;->x:Ljava/lang/String;

    const/4 v10, 0x0

    const/16 v6, 0x12c

    const/4 v7, 0x5

    const v8, 0x7f1410ff

    invoke-direct/range {v3 .. v10}, Lx20/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;IIILjava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget-object p2, p1, Ls40/a;->a:Lg/l;

    invoke-virtual {p2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p2

    const-string p3, "getApplication(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const p4, 0x7f01005d

    const v4, 0x7f01005e

    invoke-static {p2, p4, v4}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object p2

    const-string p4, "makeCustomAnimation(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lx20/n;->a:Lj/d;

    if-nez p4, :cond_d

    iget-object p1, p1, Ls40/a;->a:Lg/l;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getApplicationContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lyy/j;

    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    sget-object p3, Lkc3/d;->w:Lkc3/d;

    invoke-static {p3}, Ls93/k;->c(Ljava/lang/Object;)V

    sget-object p4, Lqy/e;->b:Lqy/d;

    invoke-direct {p2, p4, p3}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance p3, Lb10/b;

    new-instance p4, Lal0/f;

    invoke-direct {p4, p1, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    invoke-direct {p3, p1, v1, p4}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object p1, Lb20/e;->z:Lb20/e;

    const/4 p4, 0x6

    and-int/2addr p4, v2

    sget-object v1, Lm83/z;->w:Lm83/z;

    if-eqz p4, :cond_c

    move-object v0, v1

    :cond_c
    const-string p4, "additionalNonPiiParams"

    invoke-static {v0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p4

    invoke-virtual {p3, p1, p4}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lyy/j;->a(Lyy/b;)V

    goto :goto_3

    :cond_d
    invoke-virtual {p4, v3, p2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
