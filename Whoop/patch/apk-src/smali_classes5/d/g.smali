.class public abstract Ld/g;
.super Ld/b1;
.source "SourceFile"

# interfaces
.implements Ld/j;


# static fields
.field public static final b:Ld/d;

.field public static final c:[C


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld/d;

    const-class v1, Ld/g;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ld/d;-><init>(ILjava/lang/Class;)V

    sput-object v0, Ld/g;->b:Ld/d;

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Ld/g;->c:[C

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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld/g;->a:[B

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    .line 4
    array-length v0, p1

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "zero length data with non-zero pad bits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x7

    if-gt p2, v0, :cond_2

    if-ltz p2, :cond_2

    int-to-byte p2, p2

    .line 5
    array-length v0, p1

    add-int/lit8 v1, v0, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte p2, v1, v2

    .line 6
    iput-object v1, p0, Ld/g;->a:[B

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "pad bits cannot be greater than 7 or less than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "\'data\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l([B)Ld/g;
    .locals 5

    array-length v0, p0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    const/4 v2, 0x0

    aget-byte v2, p0, v2

    const/16 v3, 0xff

    and-int/2addr v2, v3

    if-lez v2, :cond_1

    const/4 v4, 0x7

    if-gt v2, v4, :cond_0

    const/4 v4, 0x2

    if-lt v0, v4, :cond_0

    sub-int/2addr v0, v1

    aget-byte v0, p0, v0

    shl-int v1, v3, v2

    and-int/2addr v1, v0

    int-to-byte v1, v1

    if-eq v0, v1, :cond_1

    new-instance v0, Ld/o0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ld/o0;-><init>([BI)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid pad bits detected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ld/o0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ld/o0;-><init>([BI)V

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "truncated BIT STRING detected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 4

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Ld/g;->a:[B

    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-direct {v0, v1, v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    return-object v0
.end method

.method public final b()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final e()I
    .locals 2

    iget-object v0, p0, Ld/g;->a:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final g(Ld/b1;)Z
    .locals 7

    instance-of v0, p1, Ld/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ld/g;

    iget-object p1, p1, Ld/g;->a:[B

    iget-object v0, p0, Ld/g;->a:[B

    array-length v2, v0

    array-length v3, p1

    if-eq v3, v2, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    return v3

    :cond_2
    sub-int/2addr v2, v3

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_4

    aget-byte v5, v0, v4

    aget-byte v6, p1, v4

    if-eq v5, v6, :cond_3

    return v1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    aget-byte v4, v0, v1

    const/16 v5, 0xff

    and-int/2addr v4, v5

    aget-byte v0, v0, v2

    shl-int v4, v5, v4

    and-int/2addr v0, v4

    int-to-byte v0, v0

    aget-byte p1, p1, v2

    and-int/2addr p1, v4

    int-to-byte p1, p1

    if-ne v0, p1, :cond_5

    return v3

    :cond_5
    return v1
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Ld/g;->a:[B

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v1, 0x0

    aget-byte v1, v0, v1

    const/16 v2, 0xff

    and-int/2addr v1, v2

    array-length v3, v0

    add-int/lit8 v4, v3, -0x1

    aget-byte v5, v0, v4

    shl-int v1, v2, v1

    and-int/2addr v1, v5

    int-to-byte v1, v1

    :goto_0
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_1

    mul-int/lit16 v3, v3, 0x101

    aget-byte v2, v0, v4

    xor-int/2addr v3, v2

    goto :goto_0

    :cond_1
    mul-int/lit16 v3, v3, 0x101

    xor-int v0, v3, v1

    return v0
.end method

.method public j()Ld/b1;
    .locals 3

    new-instance v0, Ld/o0;

    iget-object v1, p0, Ld/g;->a:[B

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld/o0;-><init>([BI)V

    return-object v0
.end method

.method public k()Ld/b1;
    .locals 3

    new-instance v0, Ld/o0;

    iget-object v1, p0, Ld/g;->a:[B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld/o0;-><init>([BI)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Lro/i;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ld/b1;->f(Lro/i;Z)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Ljava/lang/StringBuffer;

    array-length v3, v0

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    invoke-direct {v1, v3}, Ljava/lang/StringBuffer;-><init>(I)V

    const/16 v2, 0x23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-eq v2, v3, :cond_0

    aget-byte v3, v0, v2

    ushr-int/lit8 v4, v3, 0x4

    and-int/lit8 v4, v4, 0xf

    sget-object v5, Ld/g;->c:[C

    aget-char v4, v5, v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v5, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/v;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Internal error encoding BitString: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1
.end method
