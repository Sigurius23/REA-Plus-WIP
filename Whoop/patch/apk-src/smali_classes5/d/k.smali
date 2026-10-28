.class public final Ld/k;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    iput-object p1, p0, Ld/k;->a:[B

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    const/16 v2, 0x39

    if-gt v0, v2, :cond_0

    array-length v0, p1

    const/4 v3, 0x1

    if-le v0, v3, :cond_0

    aget-byte p1, p1, v3

    if-lt p1, v1, :cond_0

    if-gt p1, v2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "illegal characters in UTCTime string"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "UTCTime string too short"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/k;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/k;->a:[B

    const/16 v1, 0x17

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/k;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/k;

    iget-object p1, p1, Ld/k;->a:[B

    iget-object v0, p0, Ld/k;->a:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ld/k;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld/k;->a:[B

    invoke-static {v0}, Lwg/c;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
