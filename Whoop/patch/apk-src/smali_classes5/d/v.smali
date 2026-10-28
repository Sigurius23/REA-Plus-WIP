.class public final Ld/v;
.super Ld/b1;
.source "SourceFile"


# static fields
.field public static final b:[Ld/v;


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [Ld/v;

    sput-object v0, Ld/v;->b:[Ld/v;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ld/j0;->l([B)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_1

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iput-object v1, p0, Ld/v;->a:[B

    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ge v0, v1, :cond_0

    aget-byte v2, p1, v0

    add-int/lit8 v0, v0, 0x1

    aget-byte v3, p1, v0

    shr-int/lit8 v3, v3, 0x7

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enumerated must be non-negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "malformed enumerated"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/v;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/v;->a:[B

    const/16 v1, 0xa

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/v;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/v;

    iget-object v0, p0, Ld/v;->a:[B

    iget-object p1, p1, Ld/v;->a:[B

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

    iget-object v0, p0, Ld/v;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method
