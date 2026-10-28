.class public final Lbl/e;
.super Ltl/h;
.source "SourceFile"


# instance fields
.field public d:Lzk/l;


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lzk/z;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-interface {p1}, Lzk/z;->getSize()I

    move-result p1

    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lwk/e;

    check-cast p2, Lzk/z;

    iget-object p1, p0, Lbl/e;->d:Lzk/l;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object p1, p1, Lzk/l;->e:Lbd3/k;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lbd3/k;->m(Lzk/z;Z)V

    :cond_0
    return-void
.end method
