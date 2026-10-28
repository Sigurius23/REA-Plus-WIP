.class public final Lud3/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/File;Lud3/h0;)Lud3/p0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lud3/p0;

    invoke-direct {v0, p0, p1}, Lud3/p0;-><init>(Ljava/io/File;Lud3/h0;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Lud3/h0;)Lud3/t0;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lvo/c;->b(Lud3/h0;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/charset/Charset;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Lud3/h0;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-string v0, "getBytes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p1, p0, v0, v1}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lud3/h0;[BII)Lud3/t0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lwd3/f;->a(JJJ)V

    new-instance v0, Lud3/t0;

    invoke-direct {v0, p0, p1, p3, p2}, Lud3/t0;-><init>(Lud3/h0;[BII)V

    return-object v0
.end method

.method public static synthetic d(Lud3/u0;[BLud3/h0;II)Lud3/t0;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    array-length p4, p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p1, p3, p4}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    return-object p0
.end method
