.class public final Lds/w;
.super Lds/n;
.source "SourceFile"

# interfaces
.implements Lds/g;


# virtual methods
.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lds/n;->w:Ljava/lang/Object;

    instance-of v0, v0, Lds/a;

    return v0
.end method

.method public final l(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lds/n;->G:Ljava/lang/Object;

    :cond_0
    sget-object v0, Lds/n;->F:Lbi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lbi/g;->k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p0, v0}, Lds/n;->e(Lds/n;Z)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
