.class public final Lsa3/b;
.super Lq1/j0;
.source "SourceFile"


# virtual methods
.method public final bridge synthetic e(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final g(I)Ljava/lang/Boolean;
    .locals 2

    iget v0, p0, Lq1/j0;->b:I

    const/4 v1, 0x1

    shl-int v0, v1, v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
