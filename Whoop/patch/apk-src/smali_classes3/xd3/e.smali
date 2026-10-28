.class public final Lxd3/e;
.super Lne3/q;
.source "SourceFile"


# virtual methods
.method public final p0(Lne3/e0;Z)Lne3/n0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lne3/e0;->c()Lne3/e0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lne3/p;->i(Lne3/e0;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lne3/q;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object p1

    return-object p1
.end method
