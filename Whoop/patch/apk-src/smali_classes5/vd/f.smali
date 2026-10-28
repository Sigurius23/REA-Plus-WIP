.class public abstract Lvd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v0

    invoke-interface {v0}, Lmg/h;->c()Log/j;

    move-result-object v0

    invoke-interface {v0, p2}, Log/j;->a(Ljava/lang/String;)Log/g;

    move-result-object p2

    invoke-interface {p2, p1}, Log/g;->j(Log/b;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Log/k;->x:Log/d;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Log/k;

    if-eqz v0, :cond_1

    iget-object v0, v0, Log/k;->w:Ljava/util/Map;

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_2
    invoke-static {p0}, Lrg/a;->m(Lq83/j;)Lrg/h;

    move-result-object p0

    if-eqz p0, :cond_3

    check-cast p0, Lrg/f;

    iget-object p0, p0, Lrg/f;->w:Lrg/b;

    :cond_3
    invoke-interface {p2, p1}, Log/g;->g(Log/b;)Log/e;

    move-result-object p0

    if-eqz p3, :cond_4

    invoke-interface {p0, p3}, Log/e;->a(Ljava/lang/Throwable;)V

    :cond_4
    invoke-interface {p0, p4}, Log/e;->r(Lc93/a;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p3, p2}, Log/e;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-interface {p0}, Log/e;->e()V

    return-void
.end method

.method public static final B(Lq83/j;Ljava/lang/String;)Lgm/r;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v0

    invoke-interface {v0}, Lmg/h;->c()Log/j;

    move-result-object v0

    invoke-interface {v0, p1}, Log/j;->a(Ljava/lang/String;)Log/g;

    move-result-object v0

    new-instance v1, Lgm/r;

    invoke-direct {v1, p0, v0, p1}, Lgm/r;-><init>(Lq83/j;Log/g;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final C(Lkotlin/time/Duration;)Ljava/util/Map;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    sget-object p0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p0}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    new-instance v0, Ll83/k;

    const-string v1, "duration"

    invoke-direct {v0, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0
.end method

.method public static D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final E([B)Lye/c;
    .locals 8

    const-string v0, "payload"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p0

    const-string v0, "ErrorResponse"

    :try_start_0
    invoke-virtual {p0}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "Error"

    if-nez v2, :cond_1

    :try_start_1
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "expected restXml error response with root tag of <ErrorResponse> or <Error>"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lb9/b;->t()Lb9/b;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "expected more tags after <ErrorResponse>"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    move-object v0, p0

    :goto_1
    invoke-virtual {v0}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "RequestId"

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    move-object v1, v3

    move-object v4, v1

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Lb9/b;->t()Lb9/b;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v7, "message"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_3

    :sswitch_1
    const-string v7, "Code"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v5}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :sswitch_2
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v5}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :sswitch_3
    const-string v7, "Message"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v5}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v1

    :cond_7
    :goto_3
    invoke-virtual {v5}, Lb9/b;->j()V

    goto :goto_2

    :cond_8
    move-object v1, v3

    move-object v4, v1

    :goto_4
    if-nez v3, :cond_b

    :cond_9
    :goto_5
    invoke-virtual {p0}, Lb9/b;->t()Lb9/b;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v0}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_b
    :goto_6
    new-instance p0, Laf/a;

    invoke-direct {p0, v3, v4, v1}, Laf/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_7
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    const-string p0, "Unable to deserialize RestXml error"

    invoke-static {p0, v0}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_8
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Laf/a;

    new-instance v0, Lye/c;

    iget-object v1, p0, Laf/a;->b:Ljava/lang/String;

    iget-object v2, p0, Laf/a;->c:Ljava/lang/String;

    iget-object p0, p0, Laf/a;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p0}, Lye/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x63dc6819 -> :sswitch_3
        -0x5f314c16 -> :sswitch_2
        0x20220d -> :sswitch_1
        0x38eb0007 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;
    .locals 2

    invoke-static {}, Landroidx/health/platform/client/proto/w;->s()Landroidx/health/platform/client/proto/v;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/w;

    invoke-static {v1, p0}, Landroidx/health/platform/client/proto/w;->p(Landroidx/health/platform/client/proto/w;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/w;

    return-object p0
.end method

.method public static final G(La0/q0;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, La0/q0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, La0/q0;->b:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0}, La0/q0;->j(I)Ljava/lang/Object;

    return-object v1

    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "List is empty."

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V
    .locals 1

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lb20/f;->a(Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V

    return-void
.end method

.method public static final I(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lme/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lme/g;

    iget v1, v0, Lme/g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lme/g;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lme/g;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lme/g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lme/g;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lme/g;->w:Lme/b;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lme/b;

    const/4 v2, 0x2

    invoke-direct {p2, p0, p1, v2}, Lme/b;-><init>(Lvg/n;Ls/m2;I)V

    :try_start_1
    iput-object p2, v0, Lme/g;->w:Lme/b;

    iput v3, v0, Lme/g;->y:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object p0, p2, Lme/b;->x:Ls/m2;

    invoke-virtual {p0, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, p2

    move-object p2, p0

    move-object p0, v4

    :goto_1
    :try_start_3
    check-cast p2, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-object p2

    :catchall_1
    move-exception p0

    move-object p1, p0

    :goto_2
    move-object p0, p2

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_2

    :goto_3
    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p0

    invoke-static {p1, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    throw p1
.end method

.method public static J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    sget-object p0, Lvg/n;->a:Lvg/m;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Lvg/m;->b:Lvg/r;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    new-instance p1, Lme/h;

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-direct {p1, p0, p3, v0}, Lme/h;-><init>(Lvg/n;Lq83/d;I)V

    new-instance p3, Ls/m2;

    invoke-direct {p3, p1}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object p1, p3

    :cond_1
    invoke-static {p0, p1, p2}, Lvd/f;->I(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static K(Lfo/g;[Ljava/lang/String;Ljava/util/Map;)Lfo/g;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p0, :cond_3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v2, p1

    if-ne v2, v1, :cond_1

    aget-object p0, p1, v0

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfo/g;

    return-object p0

    :cond_1
    array-length v2, p1

    if-le v2, v1, :cond_5

    new-instance p0, Lfo/g;

    invoke-direct {p0}, Lfo/g;-><init>()V

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v2, p1, v0

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfo/g;

    invoke-virtual {p0, v2}, Lfo/g;->a(Lfo/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p0

    :cond_3
    if-eqz p1, :cond_4

    array-length v2, p1

    if-ne v2, v1, :cond_4

    aget-object p1, p1, v0

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfo/g;

    invoke-virtual {p0, p1}, Lfo/g;->a(Lfo/g;)V

    return-object p0

    :cond_4
    if-eqz p1, :cond_5

    array-length v2, p1

    if-le v2, v1, :cond_5

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_5

    aget-object v2, p1, v0

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfo/g;

    invoke-virtual {p0, v2}, Lfo/g;->a(Lfo/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-object p0
.end method

.method public static L(J)I
    .locals 2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const-wide/32 v0, -0x80000000

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    const/high16 p0, -0x80000000

    return p0

    :cond_1
    long-to-int p0, p0

    return p0
.end method

.method public static final M(Ll53/k;)[Ljava/lang/Object;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll53/k;->a:Ljava/lang/String;

    iget-object v1, p0, Ll53/k;->b:Ljava/lang/String;

    iget-object v2, p0, Ll53/k;->c:Ljava/lang/Object;

    iget-wide v3, p0, Ll53/k;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final P(Landroidx/health/platform/client/proto/p;Ln7/c;)V
    .locals 4

    iget-object v0, p1, Ln7/c;->a:Ljava/lang/String;

    iget-object v1, p1, Ln7/c;->c:Ljava/time/Instant;

    iget-object v2, p1, Ln7/c;->b:Ln7/a;

    const-string v3, ""

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Ln7/c;->a:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/u;

    invoke-static {v3, v0}, Landroidx/health/platform/client/proto/u;->v(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)V

    :cond_0
    iget-object v0, v2, Ln7/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {}, Landroidx/health/platform/client/proto/o;->s()Landroidx/health/platform/client/proto/n;

    move-result-object v0

    iget-object v2, v2, Ln7/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/o;

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/o;->p(Landroidx/health/platform/client/proto/o;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/o;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/u;

    invoke-static {v2, v0}, Landroidx/health/platform/client/proto/u;->w(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/o;)V

    :cond_1
    sget-object v0, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    invoke-virtual {v1, v0}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/u;

    invoke-static {v2, v0, v1}, Landroidx/health/platform/client/proto/u;->y(Landroidx/health/platform/client/proto/u;J)V

    :cond_2
    iget-object v0, p1, Ln7/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/u;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u;->C(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)V

    :cond_3
    iget-wide v0, p1, Ln7/c;->e:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_4

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/u;

    invoke-static {v2, v0, v1}, Landroidx/health/platform/client/proto/u;->D(Landroidx/health/platform/client/proto/u;J)V

    :cond_4
    iget-object v0, p1, Ln7/c;->f:Ln7/b;

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/health/platform/client/proto/y;->y()Landroidx/health/platform/client/proto/x;

    move-result-object v1

    iget-object v2, v0, Ln7/b;->a:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/y;

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/y;->p(Landroidx/health/platform/client/proto/y;Ljava/lang/String;)V

    :cond_5
    iget-object v2, v0, Ln7/b;->b:Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/y;

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/y;->q(Landroidx/health/platform/client/proto/y;Ljava/lang/String;)V

    :cond_6
    sget-object v2, Lg7/a;->b:Ljava/util/LinkedHashMap;

    iget v0, v0, Ln7/b;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "UNKNOWN"

    invoke-virtual {v2, v0, v3}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/y;

    invoke-static {v2, v0}, Landroidx/health/platform/client/proto/y;->r(Landroidx/health/platform/client/proto/y;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/y;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/u;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u;->E(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/y;)V

    :cond_7
    iget p1, p1, Ln7/c;->g:I

    if-lez p1, :cond_8

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object p0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast p0, Landroidx/health/platform/client/proto/u;

    invoke-static {p0, p1}, Landroidx/health/platform/client/proto/u;->s(Landroidx/health/platform/client/proto/u;I)V

    :cond_8
    return-void
.end method

.method public static synthetic Q(Lio/sentry/android/replay/capture/l;)V
    .locals 3

    new-instance v0, Lio/sentry/protocol/v;

    invoke-direct {v0}, Lio/sentry/protocol/v;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p0, v1, v0, v2}, Lio/sentry/android/replay/capture/l;->c(ILio/sentry/protocol/v;Lio/sentry/r6;)V

    return-void
.end method

.method public static final R(Lkg/a;Lgm/r;)Lb9/b;
    .locals 3

    iget-object v0, p0, Lkg/a;->b:Lkg/d;

    iget-object v1, p1, Lgm/r;->z:Ljava/lang/Object;

    check-cast v1, Lkg/f;

    instance-of v2, v1, Lkg/a;

    if-eqz v2, :cond_0

    check-cast v1, Lkg/a;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, v1, Lkg/a;->b:Lkg/d;

    invoke-virtual {v0, v1}, Lkg/d;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lb9/b;

    invoke-direct {v0, p0, p1}, Lb9/b;-><init>(Lkg/a;Lgm/r;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "expected start tag "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but current reader state is on "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected start tag found "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lgm/r;->z:Ljava/lang/Object;

    check-cast p1, Lkg/f;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static S(Ljava/util/Collection;)[I
    .locals 4

    instance-of v0, p0, Lcs/b;

    if-eqz v0, :cond_0

    check-cast p0, Lcs/b;

    iget-object v0, p0, Lcs/b;->w:[I

    iget v1, p0, Lcs/b;->x:I

    iget p0, p0, Lcs/b;->y:I

    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    array-length v0, p0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static final synthetic T(Lio/getstream/android/video/generated/models/MemberResponse;)Lc43/d;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserResponse;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserResponse;->getImage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserResponse;->getTeams()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_2
    move-object v6, v0

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserResponse;->getRole()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/util/Date;

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getCreatedAt()Ljg3/i;

    move-result-object v0

    invoke-virtual {v0}, Ljg3/i;->toEpochSecond()J

    move-result-wide v0

    invoke-direct {v7, v0, v1}, Ljava/util/Date;-><init>(J)V

    new-instance v8, Ljava/util/Date;

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/MemberResponse;->getUpdatedAt()Ljg3/i;

    move-result-object p0

    invoke-virtual {p0}, Ljg3/i;->toEpochSecond()J

    move-result-wide v0

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    new-instance v1, Lc43/d;

    invoke-direct/range {v1 .. v8}, Lc43/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public static final U(Lq3/y;)Landroid/view/inputmethod/ExtractedText;
    .locals 5

    new-instance v0, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v0}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    iget-object v1, p0, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    iput-object v1, v0, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->startOffset:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialEndOffset:I

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialStartOffset:I

    iget-wide v3, p0, Lq3/y;->b:J

    invoke-static {v3, v4}, Ll3/u0;->f(J)I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    invoke-static {v3, v4}, Ll3/u0;->e(J)I

    move-result v1

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    iget-object p0, p0, Lq3/y;->a:Ll3/g;

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {p0, v1, v2}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    iput p0, v0, Landroid/view/inputmethod/ExtractedText;->flags:I

    return-object v0
.end method

.method public static final synthetic V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/UserResponse;->getRole()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/UserResponse;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/UserResponse;->getImage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/UserResponse;->getTeams()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/UserResponse;->getCustom()Ljava/util/Map;

    move-result-object p0

    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    invoke-direct {v8, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/video/android/model/User;

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x384

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v13}, Lio/getstream/video/android/model/User;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static W(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    const/4 v0, 0x0

    const/16 v16, 0x0

    goto/16 :goto_6

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, -0x1

    const/16 v6, 0x80

    if-ge v4, v6, :cond_3

    sget-object v7, Lcs/c;->a:[B

    aget-byte v4, v7, v4

    goto :goto_1

    :cond_3
    sget-object v4, Lcs/c;->a:[B

    move v4, v5

    :goto_1
    if-ltz v4, :cond_6

    const/16 v7, 0xa

    if-lt v4, v7, :cond_4

    goto :goto_4

    :cond_4
    neg-int v4, v4

    int-to-long v8, v4

    int-to-long v10, v7

    const-wide/high16 v12, -0x8000000000000000L

    div-long v14, v12, v10

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_9

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ge v3, v6, :cond_5

    sget-object v16, Lcs/c;->a:[B

    aget-byte v3, v16, v3

    goto :goto_3

    :cond_5
    sget-object v3, Lcs/c;->a:[B

    move v3, v5

    :goto_3
    if-ltz v3, :cond_6

    if-ge v3, v7, :cond_6

    cmp-long v16, v8, v14

    if-gez v16, :cond_7

    :cond_6
    :goto_4
    const/16 v16, 0x0

    goto :goto_5

    :cond_7
    mul-long/2addr v8, v10

    const/16 v16, 0x0

    int-to-long v2, v3

    add-long v17, v2, v12

    cmp-long v17, v8, v17

    if-gez v17, :cond_8

    :goto_5
    move-object/from16 v0, v16

    goto :goto_6

    :cond_8
    sub-long/2addr v8, v2

    move v3, v4

    goto :goto_2

    :cond_9
    const/16 v16, 0x0

    if-eqz v1, :cond_a

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_6

    :cond_a
    cmp-long v0, v8, v12

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    neg-long v0, v8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_6
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v3

    int-to-long v3, v3

    cmp-long v1, v1, v3

    if-eqz v1, :cond_c

    goto :goto_7

    :cond_c
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_d
    :goto_7
    return-object v16
.end method

.method public static final X(Ldc3/x;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ldc3/n;

    if-nez v1, :cond_0

    check-cast v0, Ll83/a0;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance v0, La1/h;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object p0, Lq83/k;->w:Lq83/k;

    invoke-static {p0, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldc3/o;

    iget-object p0, p0, Ldc3/o;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public static final Z([B)Lb9/b;
    .locals 3

    const-string v0, "payload"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/iterable/iterableapi/q;

    invoke-static {p0}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/iterable/iterableapi/q;-><init>(Ljava/lang/String;)V

    new-instance p0, Lxl/a;

    invoke-direct {p0, v0}, Lxl/a;-><init>(Lcom/iterable/iterableapi/q;)V

    new-instance v0, Lgm/r;

    invoke-direct {v0, p0}, Lgm/r;-><init>(Lxl/a;)V

    iget-object p0, v0, Lgm/r;->z:Ljava/lang/Object;

    check-cast p0, Lkg/f;

    :cond_0
    instance-of v1, p0, Lkg/a;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lgm/r;->M()Lkg/f;

    move-result-object p0

    :cond_1
    if-eqz p0, :cond_2

    if-eqz v1, :cond_0

    :cond_2
    check-cast p0, Lkg/a;

    if-eqz p0, :cond_3

    invoke-static {p0, v0}, Lvd/f;->R(Lkg/a;Lgm/r;)Lb9/b;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected start tag: last = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Lkg/f;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "error"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, 0xda34a06

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v3, v4

    :cond_2
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_4

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v21, v2

    goto/16 :goto_6

    :cond_4
    :goto_2
    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-static {v2}, Ld40/r;->m(Landroidx/compose/runtime/Composer;)Ld40/s;

    move-result-object v6

    const v7, 0x456a987

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_5

    if-ne v8, v9, :cond_8

    :cond_5
    iget-object v7, v6, Ld40/s;->k:Ljava/lang/Integer;

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v4, v7}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    move-object v8, v4

    goto :goto_5

    :cond_7
    :goto_4
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    goto :goto_3

    :goto_5
    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Landroid/graphics/Typeface;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    const v7, 0x456be64

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_9

    if-ne v10, v9, :cond_a

    :cond_9
    sget-object v7, Ld40/q;->d:Ld40/s;

    iget-wide v10, v7, Ld40/s;->g:J

    invoke-static {v10, v11}, Ly3/o;->c(J)F

    move-result v7

    iget v6, v6, Ld40/s;->d:F

    mul-float/2addr v7, v6

    invoke-interface {v5, v7}, Ly3/c;->h(F)J

    move-result-wide v5

    new-instance v10, Ly3/o;

    invoke-direct {v10, v5, v6}, Ly3/o;-><init>(J)V

    invoke-virtual {v2, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v10, Ly3/o;

    iget-wide v5, v10, Ly3/o;->a:J

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    invoke-static {v2}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v7

    invoke-virtual {v7}, Lg1/c1;->c()J

    move-result-wide v10

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v7, Lq30/u0;

    const/16 v12, 0x14

    invoke-direct {v7, v8, v12}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    new-instance v8, Lp3/u;

    invoke-direct {v8, v7}, Lp3/u;-><init>(Lq30/u0;)V

    const v7, 0x456eef9

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_b

    new-instance v7, Lb01/f;

    const/16 v9, 0x11

    invoke-direct {v7, v9}, Lb01/f;-><init>(I)V

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    invoke-static {v1, v4, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    and-int/lit8 v22, v3, 0xe

    const/16 v23, 0x0

    const v24, 0x1ffb0

    move-object v1, v4

    move-wide v4, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v21, v2

    move-wide v2, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_6
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_c

    new-instance v2, Lb30/j1;

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v2, v0, v4, v3}, Lb30/j1;-><init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v6, p3

    const-string v1, "step"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v1, 0x6b8738a1

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Configuration;

    iget v1, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    const/16 v2, 0x258

    const/4 v4, 0x0

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v3, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v3, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-nez v15, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v11, v3, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v11, v5

    sget-wide v4, Li2/x;->b:J

    const v15, 0x3ecccccd    # 0.4f

    invoke-static {v15, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v4, v5, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v4

    instance-of v4, v4, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v4

    check-cast v4, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/ModalFormFactor;->getCanClickOutsideToClose()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    new-instance v5, Lnj/f;

    const/4 v15, 0x1

    invoke-direct {v5, v6, v15}, Lnj/f;-><init>(Ljava/lang/Object;I)V

    const/4 v15, 0x6

    invoke-static {v2, v4, v5, v3, v15}, Lds/p;->y(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v8, 0x0

    invoke-static {v2, v3, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v2, 0x1b4948f1

    invoke-virtual {v3, v2}, Lp1/q;->f0(I)V

    const/4 v2, 0x3

    const/4 v4, 0x0

    invoke-static {v11, v4, v2}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->E:Lb2/m;

    sget-object v11, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v11, v2, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz v1, :cond_5

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v8, 0x0

    goto :goto_3

    :cond_5
    const v1, -0x1896950d

    invoke-virtual {v3, v1}, Lp1/q;->f0(I)V

    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/m;

    const/4 v8, 0x0

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    iget v1, v1, Luj/m;->Q:F

    const/4 v5, 0x0

    const/4 v11, 0x1

    invoke-static {v2, v5, v1, v11}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_3
    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    new-instance v2, Lh0/y1;

    const/4 v5, 0x2

    const/4 v11, 0x1

    invoke-direct {v2, v5, v11, v4}, Lh0/y1;-><init>(IILq83/d;)V

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v4, v2}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v3, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v4, v3, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v3, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lsj/l;

    move-object/from16 v7, p0

    move/from16 v8, p2

    invoke-direct {v1, v7, v0, v8, v6}, Lsj/l;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILc93/a;)V

    const/16 v4, 0x48

    const/4 v5, 0x4

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Ls30/b;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v11, 0x1

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-nez v9, :cond_9

    return-void

    :cond_9
    new-instance v0, Lpj/n;

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object v1, v7

    move v3, v8

    invoke-direct/range {v0 .. v6}, Lpj/n;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p1

    move/from16 v1, p3

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, 0x21ba662c

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    or-int/lit8 v3, v1, 0x6

    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x20

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    if-ne v4, v5, :cond_3

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v8, p0

    goto/16 :goto_4

    :cond_3
    :goto_1
    sget-object v4, Lh00/c0;->a:Lp1/b0;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh00/b0;

    const/4 v5, 0x1

    invoke-static {v6, v2, v5}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    invoke-virtual {v7}, Lf0/r1;->c()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const v9, -0x11875ab8

    invoke-virtual {v2, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v2, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_4

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_5

    :cond_4
    new-instance v10, Landroidx/room/e;

    const/16 v9, 0xa

    const/4 v11, 0x0

    invoke-direct {v10, v4, v7, v11, v9}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v2, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v10, Lc93/m;

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    invoke-static {v2, v10, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0xe

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v7, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_2
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v2, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-nez v13, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    :cond_7
    invoke-static {v9, v2, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v13, 0x14

    int-to-float v13, v13

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-static {v4, v13, v14, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v17, 0x0

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v18, v13

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v20

    sget-object v4, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v2}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v4

    iget-object v4, v4, Ll0/c2;->e:Ll0/b;

    invoke-static {v4, v2}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v4

    invoke-virtual {v4}, Ll0/x0;->a()F

    move-result v24

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v14, v13, v2, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v2, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_9

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v2, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v14, v2, v14, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v2, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v3, 0x70

    const/4 v4, 0x6

    or-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ll0/z;->a:Ll0/z;

    invoke-virtual {v0, v4, v2, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Lh00/p0;

    const/4 v4, 0x0

    invoke-direct {v3, v8, v0, v1, v4}, Lh00/p0;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;
    .locals 1

    instance-of v0, p2, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    if-eqz v0, :cond_0

    new-instance p2, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    invoke-direct {p2, p0, p1}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ln5/a;Ljava/lang/String;)V

    return-object p2

    :cond_0
    instance-of p2, p2, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    if-eqz p2, :cond_1

    new-instance p2, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    invoke-direct {p2, p0, p1}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ln5/a;Ljava/lang/String;)V

    return-object p2

    :cond_1
    new-instance p0, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {p0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw p0
.end method

.method public static final e(Lp6/x1;Landroid/widget/RemoteViews;Ln6/o;Lp6/x0;)V
    .locals 22

    move-object/from16 v10, p0

    iget-object v4, v10, Lp6/x1;->a:Landroid/content/Context;

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/g0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/g0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/g0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ln6/s;->w:Ln6/s;

    iput-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v12, Lkotlin/jvm/internal/g0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    new-instance v11, Lkotlin/jvm/internal/g0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v13, Lkotlin/jvm/internal/g0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf41/n;

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v13}, Lf41/n;-><init>(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Landroid/content/Context;Landroid/widget/RemoteViews;Lp6/x0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lp6/x1;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;)V

    move-object/from16 v21, v5

    move-object v5, v0

    move-object v0, v1

    move-object/from16 v1, v21

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    move-object/from16 v15, p2

    invoke-interface {v15, v14, v5}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lv6/v;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lv6/n;

    sget-object v5, Lp6/c1;->a:Ljava/lang/Object;

    iget v5, v6, Lp6/x0;->b:I

    iget v14, v6, Lp6/x0;->a:I

    const/16 v16, 0x0

    const/4 v15, -0x1

    if-ne v5, v15, :cond_2

    if-eqz v2, :cond_0

    invoke-static {v1, v2, v14}, Lvd/f;->g(Landroid/widget/RemoteViews;Lv6/v;I)V

    :cond_0
    if-eqz v3, :cond_1

    invoke-static {v1, v3, v14}, Lvd/f;->f(Landroid/widget/RemoteViews;Lv6/n;I)V

    :cond_1
    :goto_0
    move-object/from16 v18, v4

    move-object/from16 v17, v8

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    goto/16 :goto_9

    :cond_2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x1f

    if-ge v5, v15, :cond_21

    if-eqz v2, :cond_3

    iget-object v2, v2, Lv6/v;->a:La7/e;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v3, :cond_4

    iget-object v3, v3, Lv6/n;->a:La7/e;

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    invoke-static {v2}, Lvd/f;->y(La7/e;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v3}, Lvd/f;->y(La7/e;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    instance-of v5, v2, La7/c;

    if-nez v5, :cond_7

    instance-of v5, v2, La7/b;

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v5, v16

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v5, 0x1

    :goto_4
    instance-of v15, v3, La7/c;

    if-nez v15, :cond_9

    instance-of v15, v3, La7/b;

    if-eqz v15, :cond_8

    goto :goto_5

    :cond_8
    move/from16 v15, v16

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v15, 0x1

    :goto_6
    if-eqz v5, :cond_a

    if-eqz v15, :cond_a

    const v5, 0x7f0d059c

    goto :goto_7

    :cond_a
    if-eqz v5, :cond_b

    const v5, 0x7f0d059d

    goto :goto_7

    :cond_b
    if-eqz v15, :cond_c

    const v5, 0x7f0d059e

    goto :goto_7

    :cond_c
    const v5, 0x7f0d059f

    :goto_7
    const v15, 0x7f0a0b69

    move-object/from16 v17, v8

    const/4 v8, 0x0

    invoke-static {v1, v10, v15, v5, v8}, Ldc/a;->E(Landroid/widget/RemoteViews;Lp6/x1;IILjava/lang/Integer;)I

    move-result v5

    instance-of v15, v2, La7/a;

    sget-object v8, La7/d;->a:La7/d;

    move-object/from16 v18, v4

    sget-object v4, La7/c;->a:La7/c;

    move/from16 p2, v15

    sget-object v15, La7/b;->a:La7/b;

    if-eqz p2, :cond_d

    check-cast v2, La7/a;

    iget v2, v2, La7/a;->a:F

    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v19

    move-object/from16 v20, v13

    invoke-virtual/range {v19 .. v19}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    move-object/from16 v19, v12

    const/4 v12, 0x1

    invoke-static {v12, v2, v13}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    const-string v12, "setWidth"

    invoke-virtual {v1, v5, v12, v2}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    goto :goto_8

    :cond_d
    move-object/from16 v19, v12

    move-object/from16 v20, v13

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    if-nez v2, :cond_e

    goto :goto_8

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    :goto_8
    instance-of v2, v3, La7/a;

    if-eqz v2, :cond_10

    check-cast v3, La7/a;

    iget v2, v3, La7/a;->a:F

    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    const/4 v12, 0x1

    invoke-static {v12, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    const-string v3, "setHeight"

    invoke-virtual {v1, v5, v3, v2}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    goto :goto_9

    :cond_10
    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    if-nez v3, :cond_11

    goto :goto_9

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    :goto_9
    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lo6/b;

    const-string v2, "GlanceAppWidget"

    if-eqz v0, :cond_15

    iget-object v3, v0, Lo6/b;->a:Lo6/a;

    iget-object v0, v10, Lp6/x1;->m:Ljava/lang/Integer;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_a

    :cond_13
    move v0, v14

    :goto_a
    :try_start_0
    iget-boolean v4, v10, Lp6/x1;->f:Z

    const/16 v5, 0x19

    if-eqz v4, :cond_14

    new-instance v4, Lpt2/k;

    invoke-direct {v4, v5}, Lpt2/k;-><init>(I)V

    invoke-static {v3, v10, v0, v4}, Lq6/e;->b(Lo6/a;Lp6/x1;ILpt2/k;)Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Landroid/widget/RemoteViews;->setOnClickFillInIntent(ILandroid/content/Intent;)V

    goto :goto_c

    :catchall_0
    move-exception v0

    goto :goto_b

    :cond_14
    new-instance v4, Lpt2/k;

    invoke-direct {v4, v5}, Lpt2/k;-><init>(I)V

    invoke-static {v3, v10, v0, v4}, Lq6/e;->d(Lo6/a;Lp6/x1;ILpt2/k;)Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_c

    :goto_b
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unrecognized Action: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_15
    :goto_c
    iget-object v0, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, La7/e;

    if-eqz v0, :cond_17

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x1f

    if-lt v3, v15, :cond_16

    invoke-static {v1, v14, v0}, Lp6/o;->a(Landroid/widget/RemoteViews;ILa7/e;)V

    goto :goto_d

    :cond_16
    const-string v0, "Cannot set the rounded corner of views before Api 31."

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_17
    :goto_d
    iget-object v0, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lv6/p;

    if-eqz v0, :cond_1a

    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, v0, Lv6/p;->a:Lv6/o;

    iget v4, v3, Lv6/o;->a:F

    iget-object v3, v3, Lv6/o;->b:Ljava/util/List;

    invoke-static {v3, v2}, Ls/s;->d(Ljava/util/List;Landroid/content/res/Resources;)F

    move-result v3

    add-float/2addr v3, v4

    iget-object v4, v0, Lv6/p;->b:Lv6/o;

    iget v5, v4, Lv6/o;->a:F

    iget-object v4, v4, Lv6/o;->b:Ljava/util/List;

    invoke-static {v4, v2}, Ls/s;->d(Ljava/util/List;Landroid/content/res/Resources;)F

    move-result v4

    add-float/2addr v4, v5

    iget-object v5, v0, Lv6/p;->c:Lv6/o;

    iget v7, v5, Lv6/o;->a:F

    iget-object v5, v5, Lv6/o;->b:Ljava/util/List;

    invoke-static {v5, v2}, Ls/s;->d(Ljava/util/List;Landroid/content/res/Resources;)F

    move-result v5

    add-float/2addr v5, v7

    iget-object v7, v0, Lv6/p;->d:Lv6/o;

    iget v8, v7, Lv6/o;->a:F

    iget-object v7, v7, Lv6/o;->b:Ljava/util/List;

    invoke-static {v7, v2}, Ls/s;->d(Ljava/util/List;Landroid/content/res/Resources;)F

    move-result v7

    add-float/2addr v7, v8

    iget-object v8, v0, Lv6/p;->e:Lv6/o;

    iget v9, v8, Lv6/o;->a:F

    iget-object v8, v8, Lv6/o;->b:Ljava/util/List;

    invoke-static {v8, v2}, Ls/s;->d(Ljava/util/List;Landroid/content/res/Resources;)F

    move-result v8

    add-float/2addr v8, v9

    iget-object v0, v0, Lv6/p;->f:Lv6/o;

    iget v9, v0, Lv6/o;->a:F

    iget-object v0, v0, Lv6/o;->b:Ljava/util/List;

    invoke-static {v0, v2}, Ls/s;->d(Ljava/util/List;Landroid/content/res/Resources;)F

    move-result v0

    add-float/2addr v0, v9

    iget-boolean v2, v10, Lp6/x1;->c:Z

    if-eqz v2, :cond_18

    move v9, v8

    goto :goto_e

    :cond_18
    move v9, v4

    :goto_e
    add-float/2addr v3, v9

    if-eqz v2, :cond_19

    goto :goto_f

    :cond_19
    move v4, v8

    :goto_f
    add-float/2addr v7, v4

    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v4, v6, Lp6/x0;->a:I

    const/4 v12, 0x1

    invoke-static {v12, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    invoke-static {v12, v5, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    float-to-int v5, v5

    invoke-static {v12, v7, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    float-to-int v6, v6

    invoke-static {v12, v0, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    move v2, v4

    move v4, v5

    move v5, v6

    move v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/widget/RemoteViews;->setViewPadding(IIIII)V

    :cond_1a
    iget-object v0, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v0, :cond_20

    move-object/from16 v12, v19

    iget-object v0, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lp6/x;

    move-object/from16 v13, v20

    iget-object v0, v13, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lw6/b;

    if-eqz v0, :cond_1c

    iget-object v0, v0, Lw6/b;->a:Lw6/a;

    sget-object v2, Lw6/c;->a:Lt9/c0;

    iget-object v0, v0, Lw6/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1b

    const/4 v15, 0x0

    goto :goto_10

    :cond_1b
    move-object v15, v0

    :goto_10
    check-cast v15, Ljava/util/List;

    if-eqz v15, :cond_1c

    move-object v2, v15

    check-cast v2, Ljava/lang/Iterable;

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v14, v0}, Landroid/widget/RemoteViews;->setContentDescription(ILjava/lang/CharSequence;)V

    :cond_1c
    move-object/from16 v8, v17

    iget-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ln6/s;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1d

    const/4 v12, 0x1

    if-eq v0, v12, :cond_1f

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1e

    const/16 v16, 0x8

    :cond_1d
    :goto_11
    move/from16 v0, v16

    goto :goto_12

    :cond_1e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1f
    const/16 v16, 0x4

    goto :goto_11

    :goto_12
    invoke-virtual {v1, v14, v0}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    return-void

    :cond_20
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There is currently no valid use case where a complex view is used on Android S"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f(Landroid/widget/RemoteViews;Lv6/n;I)V
    .locals 7

    iget-object p1, p1, Lv6/n;->a:La7/e;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-object v5, La7/b;->a:La7/b;

    sget-object v6, La7/d;->a:La7/d;

    if-ge v0, v1, :cond_1

    const/4 p0, 0x3

    new-array p0, p0, [La7/e;

    aput-object v6, p0, v4

    sget-object p2, La7/c;->a:La7/c;

    aput-object p2, p0, v3

    aput-object v5, p0, v2

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sget-object p2, Lp6/c1;->a:Ljava/lang/Object;

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Using a height of "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requires a complex layout before API 31"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/16 v1, 0x21

    if-ge v0, v1, :cond_2

    new-array v0, v2, [La7/e;

    aput-object v6, v0, v4

    aput-object v5, v0, v3

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-static {p0, p2, p1}, Lp6/o;->b(Landroid/widget/RemoteViews;ILa7/e;)V

    return-void
.end method

.method public static final g(Landroid/widget/RemoteViews;Lv6/v;I)V
    .locals 7

    iget-object p1, p1, Lv6/v;->a:La7/e;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-object v5, La7/b;->a:La7/b;

    sget-object v6, La7/d;->a:La7/d;

    if-ge v0, v1, :cond_1

    const/4 p0, 0x3

    new-array p0, p0, [La7/e;

    aput-object v6, p0, v4

    sget-object p2, La7/c;->a:La7/c;

    aput-object p2, p0, v3

    aput-object v5, p0, v2

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sget-object p2, Lp6/c1;->a:Ljava/lang/Object;

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Using a width of "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requires a complex layout before API 31"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/16 v1, 0x21

    if-ge v0, v1, :cond_2

    new-array v0, v2, [La7/e;

    aput-object v6, v0, v4

    aput-object v5, v0, v3

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-static {p0, p2, p1}, Lp6/o;->c(Landroid/widget/RemoteViews;ILa7/e;)V

    return-void
.end method

.method public static h([B[B)Z
    .locals 5

    array-length v0, p0

    array-length v1, p1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    move v1, v0

    :goto_0
    array-length v3, p0

    if-ge v0, v3, :cond_1

    aget-byte v3, p0, v0

    aget-byte v4, p1, v0

    xor-int/2addr v3, v4

    or-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v2
.end method

.method public static varargs i([I)Ljava/util/List;
    .locals 3

    array-length v0, p0

    if-nez v0, :cond_0

    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    :cond_0
    new-instance v0, Lcs/b;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Lcs/b;-><init>(II[I)V

    return-object v0
.end method

.method public static final j(Lbc3/m;)Lb5/e;
    .locals 1

    new-instance v0, Lb5/e;

    invoke-direct {v0, p0}, Lb5/e;-><init>(Lbc3/m;)V

    return-object v0
.end method

.method public static k(J)I
    .locals 3

    long-to-int v0, p0

    int-to-long v1, v0

    cmp-long v1, v1, p0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Out of range: %s"

    invoke-static {p1, p0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final l(Lb9/b;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lb9/b;->u()Lkg/f;

    move-result-object p0

    instance-of v0, p0, Lkg/e;

    if-eqz v0, :cond_1

    check-cast p0, Lkg/e;

    iget-object p0, p0, Lkg/e;->b:Ljava/lang/String;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    if-eqz p0, :cond_3

    instance-of v0, p0, Lkg/b;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected XmlToken.Text element, found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static o()V
    .locals 1

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static p(Lh5/j;Landroid/view/KeyEvent;)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0, p1}, Lh5/j;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static q(Ljava/lang/String;)Lre/z;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "PASSWORD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p0, Lre/p;->b:Lre/p;

    return-object p0

    :sswitch_1
    const-string v0, "DEVICE_PASSWORD_VERIFIER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p0, Lre/k;->b:Lre/k;

    return-object p0

    :sswitch_2
    const-string v0, "ADMIN_NO_SRP_AUTH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p0, Lre/i;->b:Lre/i;

    return-object p0

    :sswitch_3
    const-string v0, "SELECT_MFA_TYPE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p0, Lre/u;->b:Lre/u;

    return-object p0

    :sswitch_4
    const-string v0, "SELECT_CHALLENGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p0, Lre/t;->b:Lre/t;

    return-object p0

    :sswitch_5
    const-string v0, "CUSTOM_CHALLENGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p0, Lre/j;->b:Lre/j;

    return-object p0

    :sswitch_6
    const-string v0, "EMAIL_OTP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p0, Lre/m;->b:Lre/m;

    return-object p0

    :sswitch_7
    const-string v0, "MFA_SETUP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object p0, Lre/n;->b:Lre/n;

    return-object p0

    :sswitch_8
    const-string v0, "NEW_PASSWORD_REQUIRED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    sget-object p0, Lre/o;->b:Lre/o;

    return-object p0

    :sswitch_9
    const-string v0, "DEVICE_SRP_AUTH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    sget-object p0, Lre/l;->b:Lre/l;

    return-object p0

    :sswitch_a
    const-string v0, "SOFTWARE_TOKEN_MFA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    sget-object p0, Lre/x;->b:Lre/x;

    return-object p0

    :sswitch_b
    const-string v0, "SMS_OTP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    sget-object p0, Lre/w;->b:Lre/w;

    return-object p0

    :sswitch_c
    const-string v0, "SMS_MFA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    sget-object p0, Lre/v;->b:Lre/v;

    return-object p0

    :sswitch_d
    const-string v0, "WEB_AUTHN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    sget-object p0, Lre/y;->b:Lre/y;

    return-object p0

    :sswitch_e
    const-string v0, "PASSWORD_SRP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    sget-object p0, Lre/q;->b:Lre/q;

    return-object p0

    :sswitch_f
    const-string v0, "PASSWORD_VERIFIER"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :goto_0
    new-instance v0, Lre/s;

    invoke-direct {v0, p0}, Lre/s;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_f
    sget-object p0, Lre/r;->b:Lre/r;

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x678dac06 -> :sswitch_f
        -0x5400a9d3 -> :sswitch_e
        -0x53d9a525 -> :sswitch_d
        -0x5137aa3e -> :sswitch_c
        -0x5137a0fb -> :sswitch_b
        0x9a42dca -> :sswitch_a
        0x1365271f -> :sswitch_9
        0x142717c4 -> :sswitch_8
        0x156b5926 -> :sswitch_7
        0x248e97c8 -> :sswitch_6
        0x267d2cf5 -> :sswitch_5
        0x3113a4c0 -> :sswitch_4
        0x34075734 -> :sswitch_3
        0x4f517304 -> :sswitch_2
        0x512fa651 -> :sswitch_1
        0x772faa9b -> :sswitch_0
    .end sparse-switch
.end method

.method public static u(III[I)I
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_1

    aget v0, p3, p1

    if-ne v0, p0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static final v(Lm7/e0;)Landroidx/health/platform/client/proto/p;
    .locals 4

    invoke-static {}, Landroidx/health/platform/client/proto/u;->e0()Landroidx/health/platform/client/proto/p;

    move-result-object v0

    const-string v1, "newBuilder()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lm7/r0;->c()Ln7/c;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/f;->P(Landroidx/health/platform/client/proto/p;Ln7/c;)V

    invoke-interface {p0}, Lm7/e0;->getTime()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/u;

    invoke-static {v3, v1, v2}, Landroidx/health/platform/client/proto/u;->z(Landroidx/health/platform/client/proto/u;J)V

    invoke-interface {p0}, Lm7/e0;->d()Ljava/time/ZoneOffset;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result p0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/u;

    invoke-static {v1, p0}, Landroidx/health/platform/client/proto/u;->x(Landroidx/health/platform/client/proto/u;I)V

    :cond_0
    return-object v0
.end method

.method public static final w(Lm7/g0;)Landroidx/health/platform/client/proto/p;
    .locals 4

    invoke-static {}, Landroidx/health/platform/client/proto/u;->e0()Landroidx/health/platform/client/proto/p;

    move-result-object v0

    const-string v1, "newBuilder()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lm7/r0;->c()Ln7/c;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/f;->P(Landroidx/health/platform/client/proto/p;Ln7/c;)V

    invoke-interface {p0}, Lm7/g0;->getStartTime()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/u;

    invoke-static {v3, v1, v2}, Landroidx/health/platform/client/proto/u;->A(Landroidx/health/platform/client/proto/u;J)V

    invoke-interface {p0}, Lm7/g0;->e()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/u;

    invoke-static {v3, v1, v2}, Landroidx/health/platform/client/proto/u;->B(Landroidx/health/platform/client/proto/u;J)V

    invoke-interface {p0}, Lm7/g0;->b()Ljava/time/ZoneOffset;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result v1

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/u;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/u;->p(Landroidx/health/platform/client/proto/u;I)V

    :cond_0
    invoke-interface {p0}, Lm7/g0;->f()Ljava/time/ZoneOffset;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result p0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/u;

    invoke-static {v1, p0}, Landroidx/health/platform/client/proto/u;->q(Landroidx/health/platform/client/proto/u;I)V

    :cond_1
    return-object v0
.end method

.method public static final y(La7/e;)Z
    .locals 1

    instance-of v0, p0, La7/a;

    if-nez v0, :cond_2

    sget-object v0, La7/b;->a:La7/b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, La7/c;->a:La7/c;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, La7/d;->a:La7/d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static final z(Li2/z0;Li2/z0;F)Li2/z0;
    .locals 7

    new-instance v0, Li2/z0;

    iget-wide v1, p0, Li2/z0;->a:J

    iget-wide v3, p1, Li2/z0;->a:J

    invoke-static {v1, v2, v3, v4, p2}, Li2/w0;->w(JJF)J

    move-result-wide v1

    iget-wide v3, p0, Li2/z0;->b:J

    iget-wide v5, p1, Li2/z0;->b:J

    invoke-static {v3, v4, v5, v6, p2}, Lge3/g;->H(JJF)J

    move-result-wide v3

    iget p0, p0, Li2/z0;->c:F

    iget p1, p1, Li2/z0;->c:F

    invoke-static {p0, p1, p2}, Le93/b;->O(FFF)F

    move-result v5

    invoke-direct/range {v0 .. v5}, Li2/z0;-><init>(JJF)V

    return-object v0
.end method


# virtual methods
.method public abstract N(Z)V
.end method

.method public abstract O(Z)V
.end method

.method public abstract Y(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
.end method

.method public m(Lca/a;)Lu8/c0;
    .locals 2

    iget-object v0, p1, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->d(Z)V

    invoke-virtual {p0, p1, v0}, Lvd/f;->n(Lca/a;Ljava/nio/ByteBuffer;)Lu8/c0;

    move-result-object p1

    return-object p1
.end method

.method public abstract n(Lca/a;Ljava/nio/ByteBuffer;)Lu8/c0;
.end method

.method public abstract r()Ljava/util/List;
.end method

.method public abstract s([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
.end method

.method public abstract t()I
.end method

.method public abstract x()Z
.end method
