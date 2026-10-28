.class public abstract Ljr2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\r\u0010\u0005\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u001a\r\u0010\u0006\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0002\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Li2/t;",
        "e",
        "()Li2/t;",
        "f",
        "d",
        "c",
        "b",
        "Li2/x;",
        "accentColor",
        "a",
        "(J)Li2/t;",
        "user-journey_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(J)Li2/t;
    .locals 4

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide v1, 0xcc000000L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v3, v1}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    const/16 v1, 0xe

    invoke-static {v0, p0, p1, p1, v1}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Li2/t;
    .locals 5

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0x1a5c6dff

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    sget-object v1, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    return-object v0
.end method

.method public static final c()Li2/t;
    .locals 5

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0x667ba1bb

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff7ba1bbL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Li2/t;
    .locals 5

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide v1, 0xff0e4a86L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff66deffL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v0, v1, v2, v2, v3}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    return-object v0
.end method

.method public static final e()Li2/t;
    .locals 11

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xcc000000L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    const/16 v2, 0x20

    shl-long/2addr v3, v2

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long/2addr v3, v5

    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v9, v6

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v9, v2

    and-long/2addr v5, v7

    or-long/2addr v5, v9

    move-wide v2, v3

    move-wide v4, v5

    const/16 v6, 0x8

    invoke-static/range {v0 .. v6}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    return-object v0
.end method

.method public static final f()Li2/t;
    .locals 5

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {v1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xcc000000L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    const/16 v3, 0x8

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    return-object v0
.end method
