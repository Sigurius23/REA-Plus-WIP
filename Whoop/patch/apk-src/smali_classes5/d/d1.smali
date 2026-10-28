.class public final Ld/d1;
.super Ld/b1;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/HashMap;


# instance fields
.field public final a:[B

.field public b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ld/d1;->c:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/d1;->a:[B

    const/4 p1, 0x0

    iput-object p1, p0, Ld/d1;->b:Ljava/lang/String;

    return-void
.end method

.method public static l([B)Ld/d1;
    .locals 2

    array-length v0, p0

    const/16 v1, 0x1000

    if-gt v0, v1, :cond_2

    new-instance v0, Ld/p0;

    invoke-direct {v0, p0}, Ld/p0;-><init>([B)V

    sget-object v1, Ld/d1;->c:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld/d1;

    if-eqz v0, :cond_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0}, Ld/d1;->m([B)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ld/d1;

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    invoke-direct {v0, p0}, Ld/d1;-><init>([B)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid relative OID contents"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "exceeded relative OID contents length limit"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static m([B)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    move v3, v2

    :goto_0
    array-length v4, p0

    if-ge v0, v4, :cond_3

    const/16 v4, 0x80

    if-eqz v3, :cond_1

    aget-byte v3, p0, v0

    and-int/lit16 v3, v3, 0xff

    if-ne v3, v4, :cond_1

    :goto_1
    return v1

    :cond_1
    aget-byte v3, p0, v0

    and-int/2addr v3, v4

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/d1;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/d1;->a:[B

    const/16 v1, 0xd

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ld/d1;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ld/d1;

    iget-object v0, p0, Ld/d1;->a:[B

    iget-object p1, p1, Ld/d1;->a:[B

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

    iget-object v0, p0, Ld/d1;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v0, v1, Ld/d1;->b:Ljava/lang/String;

    if-nez v0, :cond_7

    iget-object v0, v1, Ld/d1;->a:[B

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v3, 0x1

    const-wide/16 v6, 0x0

    move-wide v9, v6

    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_0
    array-length v12, v0

    if-eq v8, v12, :cond_6

    aget-byte v12, v0, v8

    const-wide v13, 0xffffffffffff80L

    cmp-long v13, v9, v13

    const/4 v14, 0x7

    const/16 v15, 0x2e

    if-gtz v13, :cond_2

    and-int/lit8 v13, v12, 0x7f

    int-to-long v4, v13

    add-long/2addr v9, v4

    and-int/lit16 v4, v12, 0x80

    if-nez v4, :cond_1

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v15}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_1
    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-wide v9, v6

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_1
    shl-long/2addr v9, v14

    goto :goto_3

    :cond_2
    if-nez v11, :cond_3

    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v11

    :cond_3
    and-int/lit8 v4, v12, 0x7f

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v11, v4}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    and-int/lit16 v5, v12, 0x80

    if-nez v5, :cond_5

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v15}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-wide v9, v6

    const/4 v11, 0x0

    goto :goto_3

    :cond_5
    invoke-virtual {v4, v14}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v11

    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ld/d1;->b:Ljava/lang/String;

    :cond_7
    iget-object v0, v1, Ld/d1;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_4
    monitor-exit p0

    throw v0
.end method
