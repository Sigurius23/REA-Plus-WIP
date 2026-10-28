.class public final Ll20/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Ly00/c8;)Z
    .locals 2

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly00/l3;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-eqz v0, :cond_0

    check-cast p1, Ly00/l3;

    iget-object p1, p1, Ly00/l3;->X:Ljava/lang/String;

    if-eqz p1, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "card"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "require_cvc_recollection"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    instance-of p1, p1, Ly00/g6;

    if-eqz p1, :cond_2

    :cond_1
    return v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    instance-of p1, p1, Ly00/g6;

    if-eqz p1, :cond_4

    return v1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Ly00/o4;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ly00/o4;->H:Ly00/z3;

    if-eqz p1, :cond_0

    new-instance v0, Lw20/l;

    iget-object v1, p1, Ly00/z3;->H:Ljava/lang/String;

    iget-object p1, p1, Ly00/z3;->w:Ly00/i;

    invoke-direct {v0, v1, p1}, Lw20/l;-><init>(Ljava/lang/String;Ly00/i;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unable to create CvcRecollectionData"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ly00/c8;Ly00/o4;)Z
    .locals 1

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Ly00/o4;->E:Ly00/f4;

    sget-object v0, Ly00/f4;->I:Ly00/f4;

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Ll20/a;->a(Ly00/c8;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
