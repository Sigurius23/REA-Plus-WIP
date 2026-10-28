.class public abstract Lk20/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq20/y;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lq20/j;

    if-eqz v0, :cond_0

    const-string p0, "google_pay"

    return-object p0

    :cond_0
    instance-of v0, p0, Lq20/m;

    if-eqz v0, :cond_1

    const-string p0, "link"

    return-object p0

    :cond_1
    instance-of v0, p0, Lq20/x;

    if-eqz v0, :cond_2

    const-string p0, "shop_pay"

    return-object p0

    :cond_2
    instance-of v0, p0, Lq20/t;

    if-eqz v0, :cond_3

    check-cast p0, Lq20/t;

    invoke-virtual {p0}, Lq20/t;->i()Ly00/d5;

    move-result-object p0

    iget-object p0, p0, Ly00/d5;->w:Ljava/lang/String;

    return-object p0

    :cond_3
    instance-of v0, p0, Lq20/w;

    if-eqz v0, :cond_6

    check-cast p0, Lq20/w;

    iget-object p0, p0, Lq20/w;->x:Ly00/o4;

    iget-object p0, p0, Ly00/o4;->E:Ly00/f4;

    if-eqz p0, :cond_5

    iget-object p0, p0, Ly00/f4;->w:Ljava/lang/String;

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    return-object p0

    :cond_5
    :goto_0
    const-string p0, "saved"

    return-object p0

    :cond_6
    instance-of v0, p0, Lq20/i;

    if-eqz v0, :cond_7

    check-cast p0, Lq20/i;

    iget-object p0, p0, Lq20/i;->x:Ljava/lang/String;

    return-object p0

    :cond_7
    instance-of v0, p0, Lq20/g;

    if-eqz v0, :cond_8

    check-cast p0, Lq20/g;

    iget-object p0, p0, Lq20/g;->x:Ljava/lang/String;

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Lq20/y;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lq20/m;

    if-eqz v0, :cond_0

    const-string p0, "wallet"

    return-object p0

    :cond_0
    instance-of v0, p0, Lq20/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Lq20/s;

    iget-object p0, p0, Lq20/s;->F:Lq20/r;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lq20/r;->x:Ly00/p2;

    sget-object v0, Ly00/p2;->x:Ly00/p2;

    if-ne p0, v0, :cond_1

    const-string p0, "link_card_brand"

    return-object p0

    :cond_1
    const-string p0, "instant_debits"

    return-object p0

    :cond_2
    return-object v1

    :cond_3
    instance-of v0, p0, Lq20/j;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/t;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/w;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/g;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/i;

    if-nez v0, :cond_5

    instance-of p0, p0, Lq20/x;

    if-eqz p0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    return-object v1
.end method
