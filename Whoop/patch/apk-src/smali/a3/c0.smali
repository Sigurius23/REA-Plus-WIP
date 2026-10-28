.class public interface abstract La3/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/n;


# virtual methods
.method public E(La3/w0;Ly2/q0;I)I
    .locals 4

    new-instance v0, La3/s1;

    sget-object v1, La3/u1;->x:La3/u1;

    sget-object v2, La3/v1;->x:La3/v1;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/16 v1, 0xd

    invoke-static {p3, p2, v1}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, La3/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result p1

    return p1
.end method

.method public abstract b(Ly2/t0;Ly2/q0;J)Ly2/s0;
.end method

.method public g0(La3/w0;Ly2/q0;I)I
    .locals 5

    new-instance v0, La3/b0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, La3/b0;-><init>(La3/c0;I)V

    new-instance v1, La3/s1;

    sget-object v2, La3/u1;->w:La3/u1;

    sget-object v3, La3/v1;->w:La3/v1;

    const/4 v4, 0x0

    invoke-direct {v1, p2, v2, v3, v4}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/4 v2, 0x7

    invoke-static {p2, p3, v2}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v2, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-virtual {v0, v2, v1, p2, p3}, La3/b0;->a(Ly2/v;La3/s1;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result p1

    return p1
.end method

.method public o(La3/w0;Ly2/q0;I)I
    .locals 4

    new-instance v0, La3/s1;

    sget-object v1, La3/u1;->x:La3/u1;

    sget-object v2, La3/v1;->w:La3/v1;

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/4 v1, 0x7

    invoke-static {p2, p3, v1}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, La3/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result p1

    return p1
.end method

.method public y(La3/w0;Ly2/q0;I)I
    .locals 5

    new-instance v0, La3/b0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La3/b0;-><init>(La3/c0;I)V

    new-instance v1, La3/s1;

    sget-object v2, La3/u1;->w:La3/u1;

    sget-object v3, La3/v1;->x:La3/v1;

    const/4 v4, 0x0

    invoke-direct {v1, p2, v2, v3, v4}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    const/4 p2, 0x0

    const/16 v2, 0xd

    invoke-static {p3, p2, v2}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v2, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-virtual {v0, v2, v1, p2, p3}, La3/b0;->a(Ly2/v;La3/s1;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result p1

    return p1
.end method
