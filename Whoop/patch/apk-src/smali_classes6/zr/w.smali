.class public final Lzr/w;
.super Lzr/y;
.source "SourceFile"


# direct methods
.method public static f(I)Lzr/y;
    .locals 0

    if-gez p0, :cond_0

    sget-object p0, Lzr/y;->b:Lzr/x;

    return-object p0

    :cond_0
    if-lez p0, :cond_1

    sget-object p0, Lzr/y;->c:Lzr/x;

    return-object p0

    :cond_1
    sget-object p0, Lzr/y;->a:Lzr/w;

    return-object p0
.end method


# virtual methods
.method public final a(II)Lzr/y;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    invoke-static {p1}, Lzr/w;->f(I)Lzr/y;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;
    .locals 0

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Lzr/w;->f(I)Lzr/y;

    move-result-object p1

    return-object p1
.end method

.method public final c(ZZ)Lzr/y;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    invoke-static {p1}, Lzr/w;->f(I)Lzr/y;

    move-result-object p1

    return-object p1
.end method

.method public final d(ZZ)Lzr/y;
    .locals 0

    invoke-static {p2, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    invoke-static {p1}, Lzr/w;->f(I)Lzr/y;

    move-result-object p1

    return-object p1
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
