.class public interface abstract Lc0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/t1;


# direct methods
.method public static a(Lc0/q;ILd0/e2;I)Lc0/f1;
    .locals 6

    const/4 v0, 0x2

    and-int/2addr p3, v0

    const/4 v1, 0x3

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    int-to-long p2, p2

    const/16 v2, 0x20

    shl-long v2, p2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr p2, v4

    or-long/2addr p2, v2

    new-instance v2, Ly3/j;

    invoke-direct {v2, p2, p3}, Ly3/j;-><init>(J)V

    const/4 p2, 0x0

    invoke-static {p2, p2, v1, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p2

    :cond_0
    check-cast p0, Lc0/x;

    invoke-virtual {p0, p1}, Lc0/x;->g(I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p1, Lc0/w;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lc0/w;-><init>(Lc0/x;I)V

    invoke-static {p2, p1}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, Lc0/x;->h(I)Z

    move-result p3

    if-eqz p3, :cond_2

    new-instance p1, Lc0/w;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, Lc0/w;-><init>(Lc0/x;I)V

    invoke-static {p2, p1}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p1, v0}, Lvp/c;->G(II)Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p1, Lc0/w;

    const/4 p3, 0x2

    invoke-direct {p1, p0, p3}, Lc0/w;-><init>(Lc0/x;I)V

    invoke-static {p2, p1}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p1, v1}, Lvp/c;->G(II)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lc0/w;

    const/4 p3, 0x3

    invoke-direct {p1, p0, p3}, Lc0/w;-><init>(Lc0/x;I)V

    invoke-static {p2, p1}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    return-object p0

    :cond_4
    sget-object p0, Lc0/e1;->a:Lc0/f1;

    return-object p0
.end method
