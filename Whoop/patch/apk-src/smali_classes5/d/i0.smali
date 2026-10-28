.class public final Ld/i0;
.super Ld/b1;
.source "SourceFile"


# static fields
.field public static final b:[C


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Ld/i0;->b:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/i0;->a:[B

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/i0;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/i0;->a:[B

    const/16 v1, 0x1c

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/i0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/i0;

    iget-object v0, p0, Ld/i0;->a:[B

    iget-object p1, p1, Ld/i0;->a:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ld/i0;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Ld/i0;->a:[B

    array-length v1, v0

    new-instance v2, Ljava/lang/StringBuffer;

    const/4 v3, 0x2

    const/16 v4, 0x80

    if-ge v1, v4, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v6, v1

    move v5, v3

    :goto_0
    ushr-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/2addr v5, v1

    mul-int/2addr v5, v3

    add-int/lit8 v5, v5, 0x3

    invoke-direct {v2, v5}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v3, "#1C"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v3, Ld/i0;->b:[C

    if-ge v1, v4, :cond_2

    ushr-int/lit8 v4, v1, 0x4

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v3, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    and-int/lit8 v4, v1, 0xf

    aget-char v4, v3, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    :cond_2
    const/4 v5, 0x5

    new-array v6, v5, [B

    move v7, v1

    move v8, v5

    :goto_2
    add-int/lit8 v9, v8, -0x1

    int-to-byte v10, v7

    aput-byte v10, v6, v9

    ushr-int/lit8 v7, v7, 0x8

    if-nez v7, :cond_5

    rsub-int/lit8 v7, v9, 0x5

    add-int/lit8 v8, v8, -0x2

    or-int/2addr v4, v7

    int-to-byte v4, v4

    aput-byte v4, v6, v8

    :goto_3
    add-int/lit8 v4, v8, 0x1

    aget-byte v7, v6, v8

    ushr-int/lit8 v8, v7, 0x4

    and-int/lit8 v8, v8, 0xf

    aget-char v8, v3, v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    and-int/lit8 v7, v7, 0xf

    aget-char v7, v3, v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    if-lt v4, v5, :cond_4

    :goto_4
    const/4 v4, 0x0

    :goto_5
    if-ge v4, v1, :cond_3

    aget-byte v5, v0, v4

    ushr-int/lit8 v6, v5, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v3, v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v3, v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    move v8, v4

    goto :goto_3

    :cond_5
    move v8, v9

    goto :goto_2
.end method
