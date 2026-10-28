.class public abstract synthetic Lpp/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lsun/misc/Unsafe;Lpp/b;JLjava/lang/Object;)Z
    .locals 6

    :goto_0
    sget-object v5, Lpp/h;->b:Lpp/h;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    if-eq p0, v4, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    move-object p0, v0

    move-object p1, v1

    move-wide p2, v2

    move-object p4, v4

    goto :goto_0
.end method
