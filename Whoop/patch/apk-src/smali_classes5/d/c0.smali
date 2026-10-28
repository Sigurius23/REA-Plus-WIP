.class public Ld/c0;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    iput-object p1, p0, Ld/c0;->a:[B

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ld/c0;->l(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ld/c0;->l(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Ld/c0;->l(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Ld/c0;->l(I)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "illegal characters in GeneralizedTime string"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "GeneralizedTime string too short"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public c(Z)I
    .locals 1

    iget-object v0, p0, Ld/c0;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/c0;->a:[B

    const/16 v1, 0x18

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/c0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/c0;

    iget-object p1, p1, Ld/c0;->a:[B

    iget-object v0, p0, Ld/c0;->a:[B

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

    iget-object v0, p0, Ld/c0;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method

.method public j()Ld/b1;
    .locals 2

    new-instance v0, Ld/e1;

    iget-object v1, p0, Ld/c0;->a:[B

    invoke-direct {v0, v1}, Ld/c0;-><init>([B)V

    return-object v0
.end method

.method public final l(I)Z
    .locals 2

    iget-object v0, p0, Ld/c0;->a:[B

    array-length v1, v0

    if-le v1, p1, :cond_0

    aget-byte p1, v0, p1

    const/16 v0, 0x30

    if-lt p1, v0, :cond_0

    const/16 v0, 0x39

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
