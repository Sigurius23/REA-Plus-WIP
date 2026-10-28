.class public final Ls93/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/i;


# virtual methods
.method public final bridge J(Lva3/e;)Z
    .locals 0

    invoke-static {p0, p1}, Ls93/h;->p(Ls93/i;Lva3/e;)Z

    move-result p1

    return p1
.end method

.method public final T(Lva3/e;)Ls93/b;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lm83/x;->w:Lm83/x;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EMPTY"

    return-object v0
.end method
