.class public final Ld20/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb10/c1;

.field public final b:Lyy/j;

.field public final c:Lb10/b;

.field public final d:Lyy/g0;

.field public final e:Lqy/d;

.field public final f:Lq83/j;


# direct methods
.method public constructor <init>(Lb10/c1;Lyy/j;Lb10/b;Lyy/g0;Lqy/d;Lq83/j;)V
    .locals 1

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryDelaySupplier"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld20/c;->a:Lb10/c1;

    iput-object p2, p0, Ld20/c;->b:Lyy/j;

    iput-object p3, p0, Ld20/c;->c:Lb10/b;

    iput-object p4, p0, Ld20/c;->d:Lyy/g0;

    iput-object p5, p0, Ld20/c;->e:Lqy/d;

    iput-object p6, p0, Ld20/c;->f:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a(Lq30/a0;Lyy/f;ILs83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Ld20/a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ld20/a;

    iget v1, v0, Ld20/a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld20/a;->G:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ld20/a;

    invoke-direct {v0, p0, p4}, Ld20/a;-><init>(Ld20/c;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Ld20/a;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld20/a;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v6, Ld20/a;->z:I

    iget-object p2, v6, Ld20/a;->y:Lyy/f;

    iget-object p1, v6, Ld20/a;->x:Lq30/a0;

    iget-object v1, v6, Ld20/a;->w:Ld20/c;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    :goto_2
    move-object v3, p2

    move v4, p3

    goto :goto_3

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lq30/a0;->f()Lq30/n0;

    move-result-object p4

    iget-object p4, p4, Lq30/n0;->x:Ljava/lang/String;

    iput-object p0, v6, Ld20/a;->w:Ld20/c;

    iput-object p1, v6, Ld20/a;->x:Lq30/a0;

    iput-object p2, v6, Ld20/a;->y:Lyy/f;

    iput p3, v6, Ld20/a;->z:I

    iput v3, v6, Ld20/a;->G:I

    iget-object v1, p0, Ld20/c;->a:Lb10/c1;

    check-cast v1, Lb10/z0;

    invoke-virtual {v1, p4, p2, v6}, Lb10/z0;->g(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v1, p0

    goto :goto_2

    :goto_3
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_5

    check-cast p4, Ly00/d7;

    rsub-int/lit8 p1, v4, 0x3

    iget-object p2, v1, Ld20/c;->e:Lqy/d;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "3DS2 challenge completion request was successful. "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " retries attempted."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lqy/d;->a(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_5
    const/4 p2, 0x0

    iput-object p2, v6, Ld20/a;->w:Ld20/c;

    iput-object p2, v6, Ld20/a;->x:Lq30/a0;

    iput-object p2, v6, Ld20/a;->y:Lyy/f;

    iput v2, v6, Ld20/a;->G:I

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Ld20/c;->b(Lq30/a0;Lyy/f;ILjava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_6

    :goto_4
    return-object v0

    :cond_6
    :goto_5
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p4
.end method

.method public final b(Lq30/a0;Lyy/f;ILjava/lang/Throwable;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p5, Ld20/b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ld20/b;

    iget v1, v0, Ld20/b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld20/b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld20/b;

    invoke-direct {v0, p0, p5}, Ld20/b;-><init>(Ld20/c;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Ld20/b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld20/b;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v0, Ld20/b;->z:I

    iget-object p2, v0, Ld20/b;->y:Lyy/f;

    iget-object p1, v0, Ld20/b;->x:Lq30/a0;

    iget-object p4, v0, Ld20/b;->w:Ld20/c;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p5, Ljava/lang/StringBuilder;

    const-string v2, "3DS2 challenge completion request failed. Remaining retries: "

    invoke-direct {p5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    iget-object v2, p0, Ld20/c;->e:Lqy/d;

    invoke-virtual {v2, p5, p4}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of p5, p4, Lcom/stripe/android/core/exception/StripeException;

    if-eqz p5, :cond_4

    check-cast p4, Lcom/stripe/android/core/exception/StripeException;

    iget-boolean p4, p4, Lcom/stripe/android/core/exception/StripeException;->z:Z

    goto :goto_1

    :cond_4
    const/4 p4, 0x0

    :goto_1
    if-lez p3, :cond_7

    if-eqz p4, :cond_7

    iget-object p4, p0, Ld20/c;->d:Lyy/g0;

    invoke-interface {p4, p3}, Lyy/g0;->a(I)J

    move-result-wide p4

    iput-object p0, v0, Ld20/b;->w:Ld20/c;

    iput-object p1, v0, Ld20/b;->x:Lq30/a0;

    iput-object p2, v0, Ld20/b;->y:Lyy/f;

    iput p3, v0, Ld20/b;->z:I

    iput v4, v0, Ld20/b;->G:I

    invoke-static {p4, p5, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object p4, p0

    :goto_2
    sub-int/2addr p3, v4

    const/4 p5, 0x0

    iput-object p5, v0, Ld20/b;->w:Ld20/c;

    iput-object p5, v0, Ld20/b;->x:Lq30/a0;

    iput-object p5, v0, Ld20/b;->y:Lyy/f;

    iput v3, v0, Ld20/b;->G:I

    invoke-virtual {p4, p1, p2, p3, v0}, Ld20/c;->a(Lq30/a0;Lyy/f;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    return-object p1

    :cond_7
    const-string p1, "Did not make a successful 3DS2 challenge completion request after retrying."

    invoke-virtual {v2, p1}, Lqy/d;->a(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
