.class public final Lz2/a;
.super Lv63/c;
.source "SourceFile"


# instance fields
.field public a:Lz2/f;


# virtual methods
.method public final c(Lz2/h;)Z
    .locals 1

    iget-object v0, p0, Lz2/a;->a:Lz2/f;

    invoke-interface {v0}, Lz2/f;->getKey()Lz2/h;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e(Lz2/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/a;->a:Lz2/f;

    invoke-interface {v0}, Lz2/f;->getKey()Lz2/h;

    move-result-object v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Check failed."

    invoke-static {p1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lz2/a;->a:Lz2/f;

    invoke-interface {p1}, Lz2/f;->d()Ll0/b2;

    move-result-object p1

    return-object p1
.end method
