.class public abstract Ld/a;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public final a:[Ld/q;

.field public b:[Ld/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Ld/s;->d:[Ld/q;

    iput-object v0, p0, Ld/a;->a:[Ld/q;

    iput-object v0, p0, Ld/a;->b:[Ld/q;

    return-void
.end method

.method public constructor <init>(Ld/s;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ld/s;->f()[Ld/q;

    move-result-object p1

    iput-object p1, p0, Ld/a;->a:[Ld/q;

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ld/a;->b:[Ld/q;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'elementVector\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([Ld/q;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Ld/a;->a:[Ld/q;

    iput-object p1, p0, Ld/a;->b:[Ld/q;

    return-void
.end method

.method public constructor <init>([Ld/q;[Ld/q;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ld/a;->a:[Ld/q;

    iput-object p2, p0, Ld/a;->b:[Ld/q;

    return-void
.end method

.method public static l([B[B)Z
    .locals 6

    const/4 v0, 0x0

    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xdf

    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xdf

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    if-ge v1, v2, :cond_0

    return v3

    :cond_0
    return v0

    :cond_1
    array-length v1, p0

    array-length v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr v1, v3

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_4

    aget-byte v4, p0, v2

    aget-byte v5, p1, v2

    if-eq v4, v5, :cond_3

    and-int/lit16 p0, v4, 0xff

    and-int/lit16 p1, v5, 0xff

    if-ge p0, p1, :cond_2

    return v3

    :cond_2
    return v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    if-gt p0, p1, :cond_5

    return v3

    :cond_5
    return v0
.end method


# virtual methods
.method public final g(Ld/b1;)Z
    .locals 6

    instance-of v0, p1, Ld/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Ld/a;

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v0, v0

    iget-object v2, p1, Ld/a;->a:[Ld/q;

    array-length v2, v2

    if-eq v2, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ld/a;->j()Ld/b1;

    move-result-object v2

    check-cast v2, Ld/z;

    invoke-virtual {p1}, Ld/a;->j()Ld/b1;

    move-result-object p1

    check-cast p1, Ld/z;

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, v2, Ld/a;->a:[Ld/q;

    aget-object v4, v4, v3

    invoke-interface {v4}, Ld/q;->d()Ld/b1;

    move-result-object v4

    iget-object v5, p1, Ld/a;->a:[Ld/q;

    aget-object v5, v5, v3

    invoke-interface {v5}, Ld/q;->d()Ld/b1;

    move-result-object v5

    if-eq v4, v5, :cond_2

    invoke-virtual {v4, v5}, Ld/b1;->g(Ld/b1;)Z

    move-result v4

    if-nez v4, :cond_2

    :goto_1
    return v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    add-int/lit8 v2, v1, 0x1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    aget-object v3, v0, v1

    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v3

    invoke-virtual {v3}, Ld/b1;->hashCode()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    return v2
.end method

.method public j()Ld/b1;
    .locals 15

    iget-object v0, p0, Ld/a;->b:[Ld/q;

    if-nez v0, :cond_7

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    invoke-virtual {v0}, [Ld/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld/q;

    iput-object v0, p0, Ld/a;->b:[Ld/q;

    const-string v1, "cannot encode object added to SET"

    array-length v2, v0

    const/4 v3, 0x2

    if-ge v2, v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v4, 0x0

    aget-object v4, v0, v4

    const/4 v5, 0x1

    aget-object v6, v0, v5

    :try_start_0
    invoke-interface {v4}, Ld/q;->d()Ld/b1;

    move-result-object v7

    invoke-virtual {v7}, Ld/b1;->i()[B

    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-interface {v6}, Ld/q;->d()Ld/b1;

    move-result-object v8

    invoke-virtual {v8}, Ld/b1;->i()[B

    move-result-object v8
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    invoke-static {v8, v7}, Ld/a;->l([B[B)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v14, v6

    move-object v6, v4

    move-object v4, v14

    move-object v14, v8

    move-object v8, v7

    move-object v7, v14

    :cond_1
    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v9, v0, v3

    :try_start_2
    invoke-interface {v9}, Ld/q;->d()Ld/b1;

    move-result-object v10

    invoke-virtual {v10}, Ld/b1;->i()[B

    move-result-object v10
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    invoke-static {v8, v10}, Ld/a;->l([B[B)Z

    move-result v11

    if-eqz v11, :cond_2

    add-int/lit8 v7, v3, -0x2

    aput-object v4, v0, v7

    move-object v4, v6

    move-object v7, v8

    move-object v6, v9

    move-object v8, v10

    goto :goto_3

    :cond_2
    invoke-static {v7, v10}, Ld/a;->l([B[B)Z

    move-result v11

    if-eqz v11, :cond_3

    add-int/lit8 v7, v3, -0x2

    aput-object v4, v0, v7

    move-object v4, v9

    move-object v7, v10

    goto :goto_3

    :cond_3
    add-int/lit8 v11, v3, -0x1

    :goto_1
    add-int/lit8 v12, v11, -0x1

    if-lez v12, :cond_5

    add-int/lit8 v11, v11, -0x2

    aget-object v11, v0, v11

    :try_start_3
    invoke-interface {v11}, Ld/q;->d()Ld/b1;

    move-result-object v13

    invoke-virtual {v13}, Ld/b1;->i()[B

    move-result-object v13
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    invoke-static {v13, v10}, Ld/a;->l([B[B)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    aput-object v11, v0, v12

    move v11, v12

    goto :goto_1

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    aput-object v9, v0, v12

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    add-int/lit8 v1, v2, -0x2

    aput-object v4, v0, v1

    sub-int/2addr v2, v5

    aput-object v6, v0, v2

    goto :goto_4

    :catch_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    new-instance v0, Ld/z;

    iget-object v1, p0, Ld/a;->b:[Ld/q;

    invoke-direct {v0, v1}, Ld/z;-><init>([Ld/q;)V

    const/4 v1, -0x1

    iput v1, v0, Ld/z;->d:I

    return-object v0
.end method

.method public k()Ld/b1;
    .locals 3

    new-instance v0, Ld/z;

    iget-object v1, p0, Ld/a;->a:[Ld/q;

    iget-object v2, p0, Ld/a;->b:[Ld/q;

    invoke-direct {v0, v1, v2}, Ld/z;-><init>([Ld/q;[Ld/q;)V

    const/4 v1, -0x1

    iput v1, v0, Ld/z;->d:I

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    if-nez v1, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v3, "["

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    aget-object v4, v0, v3

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_1

    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0
.end method
