.class public abstract Lse/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(I[B)I
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static B(I[B)J
    .locals 7

    aget-byte v0, p1, p0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v4, p0, 0x1

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x2

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x3

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x4

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x5

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x6

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 p0, p0, 0x7

    aget-byte p0, p1, p0

    int-to-long p0, p0

    and-long/2addr p0, v2

    const/16 v2, 0x38

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static C(Lcom/google/crypto/tink/shaded/protobuf/a1;I[BIILcom/google/crypto/tink/shaded/protobuf/a0;Landroidx/health/platform/client/proto/d;)I
    .locals 7

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lse/a;->S(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;[BIILandroidx/health/platform/client/proto/d;)I

    move-result p0

    invoke-interface {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->b(Ljava/lang/Object;)V

    iput-object v0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p0, v4, :cond_1

    move-object v6, v5

    move v5, v4

    invoke-static {v2, p0, v6}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget p2, v6, Landroidx/health/platform/client/proto/d;->a:I

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    move-object v3, v2

    move-object v2, v1

    invoke-interface {v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-static/range {v1 .. v6}, Lse/a;->S(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;[BIILandroidx/health/platform/client/proto/d;)I

    move-result p0

    move-object p2, v1

    move-object v1, v2

    move-object v2, v3

    move v4, v5

    move-object v5, v6

    invoke-interface {v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->b(Ljava/lang/Object;)V

    iput-object p2, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {p5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static D(I[BIILcom/google/crypto/tink/shaded/protobuf/d1;Landroidx/health/platform/client/proto/d;)I
    .locals 7

    ushr-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_b

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p2, p1}, Lse/a;->A(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->a()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->c()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v4

    and-int/lit8 v0, p0, -0x8

    or-int/lit8 v6, v0, 0x4

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-static {p1, p2, p5}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget v0, p5, Landroidx/health/platform/client/proto/d;->a:I

    if-ne v0, v6, :cond_3

    move p2, v2

    :cond_2
    move v3, p3

    goto :goto_1

    :cond_3
    move-object v1, p1

    move v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lse/a;->D(I[BIILcom/google/crypto/tink/shaded/protobuf/d1;Landroidx/health/platform/client/proto/d;)I

    move-result p2

    goto :goto_0

    :goto_1
    if-gt p2, v3, :cond_4

    if-ne v0, v6, :cond_4

    invoke-virtual {p4, p0, v4}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->e()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_5
    move-object v1, p1

    move-object v5, p5

    invoke-static {v1, p2, v5}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget p2, v5, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz p2, :cond_8

    array-length p3, v1

    sub-int/2addr p3, p1

    if-gt p2, p3, :cond_7

    if-nez p2, :cond_6

    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {p4, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(ILjava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v1, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p3

    invoke-virtual {p4, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(ILjava/lang/Object;)V

    :goto_2
    add-int/2addr p1, p2

    return p1

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->f()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->d()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_9
    move-object v1, p1

    invoke-static {p2, v1}, Lse/a;->B(I[B)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_a
    move-object v1, p1

    move-object v5, p5

    invoke-static {v1, p2, v5}, Lse/a;->H([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget-wide p2, v5, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(ILjava/lang/Object;)V

    return p1

    :cond_b
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->a()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static E(I[BILandroidx/health/platform/client/proto/d;)I
    .locals 2

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    shl-int/lit8 p1, v1, 0x7

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v1

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x3

    aget-byte v1, p1, v1

    if-ltz v1, :cond_2

    shl-int/lit8 p1, v1, 0x15

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr p0, v1

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return p2

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_0
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-gez p2, :cond_4

    move p2, v0

    goto :goto_0

    :cond_4
    iput p0, p3, Landroidx/health/platform/client/proto/d;->a:I

    return v0
.end method

.method public static F([BILandroidx/health/platform/client/proto/d;)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Landroidx/health/platform/client/proto/d;->a:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Lse/a;->E(I[BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    return p0
.end method

.method public static G(I[BIILcom/google/crypto/tink/shaded/protobuf/a0;Landroidx/health/platform/client/proto/d;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-static {p1, p2, p5}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result p2

    iget v0, p5, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result v0

    iget v1, p5, Landroidx/health/platform/client/proto/d;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result p2

    iget v0, p5, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->c(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static H([BILandroidx/health/platform/client/proto/d;)I
    .locals 9

    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    iput-wide v1, p2, Landroidx/health/platform/client/proto/d;->b:J

    return v0

    :cond_0
    const-wide/16 v3, 0x7f

    and-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x2

    aget-byte v0, p0, v0

    and-int/lit8 v3, v0, 0x7f

    int-to-long v3, v3

    const/4 v5, 0x7

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    move v3, v5

    :goto_0
    if-gez v0, :cond_1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    add-int/2addr v3, v5

    and-int/lit8 v4, p1, 0x7f

    int-to-long v6, v4

    shl-long/2addr v6, v3

    or-long/2addr v1, v6

    move v8, v0

    move v0, p1

    move p1, v8

    goto :goto_0

    :cond_1
    iput-wide v1, p2, Landroidx/health/platform/client/proto/d;->b:J

    return p1
.end method

.method public static final I(Ltb/a;)V
    .locals 4

    const-string v0, "connection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    const-string v1, "SELECT name FROM sqlite_master WHERE type = \'trigger\'"

    invoke-interface {p0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :goto_0
    :try_start_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_1
    :goto_1
    move-object v1, v0

    check-cast v1, Ln83/b;

    invoke-virtual {v1}, Ln83/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "room_fts_content_sync_"

    invoke-static {v1, v2, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "DROP TRIGGER IF EXISTS "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_1

    :cond_2
    return-void

    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static J(Lm83/b0;)Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Lm83/b0;->g()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v2}, Lm83/b0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v3, Lkotlin/jvm/internal/e0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    :cond_0
    check-cast v3, Lkotlin/jvm/internal/e0;

    iget v4, v3, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v3, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v2, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Ld93/a;

    if-eqz v2, :cond_3

    instance-of v2, v1, Ld93/d;

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const-string p0, "kotlin.collections.MutableMap.MutableEntry"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/m0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/internal/e0;

    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static K([B)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    div-int/lit8 v4, v3, 0x10

    const-string v5, "0123456789abcdef"

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 v3, v3, 0x10

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final M()Lr7/h0;
    .locals 4

    const/16 v0, 0x2710

    int-to-double v0, v0

    new-instance v2, Lr7/h0;

    sget-object v3, Lr7/g0;->x:Lr7/e0;

    invoke-direct {v2, v0, v1, v3}, Lr7/h0;-><init>(DLr7/g0;)V

    return-object v2
.end method

.method public static final synthetic N()Lr7/h0;
    .locals 3

    const v0, 0x186a0

    int-to-double v0, v0

    sget-object v2, Lr7/h0;->y:Lr7/d0;

    invoke-static {v0, v1}, Lr7/d0;->a(D)Lr7/h0;

    move-result-object v0

    return-object v0
.end method

.method public static varargs O([Ljava/lang/String;)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    if-eqz v3, :cond_1

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "null"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static final P(Ljava/util/List;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu00/f;

    iget-object p0, p0, Lu00/f;->a:Ljava/lang/String;

    sget-object v0, Ly00/f4;->G:Lt9/c0;

    const-string v0, "card"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Q(Lr93/n0;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p0, :cond_8

    invoke-interface {p0}, Lr93/c;->getKind()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    invoke-static {v2}, Lya3/f;->k(Lr93/k;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Lr93/k;->g()Lr93/k;

    move-result-object v4

    sget-object v5, Lr93/f;->w:Lr93/f;

    invoke-static {v4, v5}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lr93/f;->y:Lr93/f;

    invoke-static {v4, v5}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_1
    check-cast v2, Lr93/e;

    sget-object v4, Lo93/d;->a:Ljava/util/LinkedHashSet;

    invoke-static {v2}, Lya3/f;->k(Lr93/k;)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v4, Lo93/d;->a:Ljava/util/LinkedHashSet;

    invoke-static {v2}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lva3/c;->e()Lva3/c;

    move-result-object v0

    :cond_2
    invoke-static {v4, v0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-static {v0}, Lya3/f;->k(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Lr93/n0;->b0()Lu93/v;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v0

    sget-object v2, Lfa3/w;->a:Lva3/e;

    invoke-interface {v0, v2}, Ls93/i;->J(Lva3/e;)Z

    move-result v0

    if-eqz v0, :cond_4

    move p0, v3

    goto :goto_0

    :cond_4
    invoke-interface {p0}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object p0

    sget-object v0, Lfa3/w;->a:Lva3/e;

    invoke-interface {p0, v0}, Ls93/i;->J(Lva3/e;)Z

    move-result p0

    :goto_0
    if-eqz p0, :cond_6

    :cond_5
    return v3

    :cond_6
    :goto_1
    return v1

    :cond_7
    invoke-static {v3}, Lse/a;->a(I)V

    throw v0

    :cond_8
    invoke-static {v1}, Lse/a;->a(I)V

    throw v0
.end method

.method public static R(I[B)J
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    int-to-long p0, p0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static S(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;[BIILandroidx/health/platform/client/proto/d;)I
    .locals 6

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Lse/a;->E(I[BILandroidx/health/platform/client/proto/d;)I

    move-result v0

    iget p3, p5, Landroidx/health/platform/client/proto/d;->a:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_1

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_1

    add-int v4, v3, p3

    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/a1;->g(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V

    iput-object v1, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return v4

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->f()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static T(Lne3/j0;)Lbi/s;
    .locals 15

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p0, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {p0, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v3, :cond_2

    invoke-virtual {p0, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x3a

    const/4 v13, 0x6

    invoke-static {v11, v12, v9, v9, v13}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_1

    invoke-virtual {v11, v9, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    const-string v14, "substring(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "toLowerCase(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_0

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v13, Ljava/util/List;

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    const-string p0, "Unexpected header: "

    invoke-virtual {p0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v3, Lbi/s;

    new-instance v9, Lbi/q;

    invoke-static {v2}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    invoke-direct {v9, p0}, Lbi/q;-><init>(Ljava/util/Map;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v11}, Lbi/s;-><init>(IJJLbi/q;Lbi/t;Ljava/lang/Object;)V

    return-object v3
.end method

.method public static final U(Llb3/y;Ljava/util/List;Ls93/i;)Llb3/y;
    .locals 1

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAnnotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {p0, p1, p2, v0}, Lse/a;->W(Llb3/y;Ljava/util/List;Ls93/i;I)Llb3/y;

    move-result-object p0

    return-object p0
.end method

.method public static final V(Llb3/c0;Ljava/util/List;Llb3/k0;)Llb3/c0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAttributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lnb3/i;

    if-eqz v0, :cond_2

    check-cast p0, Lnb3/i;

    new-instance v0, Lnb3/i;

    iget-object v1, p0, Lnb3/i;->x:Llb3/q0;

    iget-object v2, p0, Lnb3/i;->y:Lnb3/g;

    iget-object v3, p0, Lnb3/i;->z:Lnb3/k;

    iget-boolean v5, p0, Lnb3/i;->F:Z

    iget-object p0, p0, Lnb3/i;->G:[Ljava/lang/String;

    array-length p2, p0

    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, [Ljava/lang/String;

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lnb3/i;-><init>(Llb3/q0;Lnb3/g;Lnb3/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v0

    :cond_2
    move-object v4, p1

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result p0

    invoke-static {v4, p2, p1, p0}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static W(Llb3/y;Ljava/util/List;Ls93/i;I)Llb3/y;
    .locals 1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p2

    :cond_0
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "newArguments"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "newAnnotations"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "newArgumentsForUpperBound"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p3

    if-ne p1, p3, :cond_2

    :cond_1
    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p3

    if-ne p2, p3, :cond_2

    return-object p0

    :cond_2
    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object p3

    instance-of v0, p2, Ls93/n;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Ls93/n;

    invoke-virtual {v0}, Ls93/n;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p2, Ls93/g;->a:Ls93/f;

    :cond_3
    invoke-static {p3, p2}, Lio/sentry/config/a;->T(Llb3/k0;Ls93/i;)Llb3/k0;

    move-result-object p2

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of p3, p0, Llb3/r;

    if-eqz p3, :cond_4

    check-cast p0, Llb3/r;

    iget-object p3, p0, Llb3/r;->x:Llb3/c0;

    invoke-static {p3, p1, p2}, Lse/a;->V(Llb3/c0;Ljava/util/List;Llb3/k0;)Llb3/c0;

    move-result-object p3

    iget-object p0, p0, Llb3/r;->y:Llb3/c0;

    invoke-static {p0, p1, p2}, Lse/a;->V(Llb3/c0;Ljava/util/List;Llb3/k0;)Llb3/c0;

    move-result-object p0

    invoke-static {p3, p0}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of p3, p0, Llb3/c0;

    if-eqz p3, :cond_5

    check-cast p0, Llb3/c0;

    invoke-static {p0, p1, p2}, Lse/a;->V(Llb3/c0;Ljava/util/List;Llb3/k0;)Llb3/c0;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object p2

    :cond_1
    invoke-static {p0, p1, p2}, Lse/a;->V(Llb3/c0;Ljava/util/List;Llb3/k0;)Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static Y(JZ)Lk1/b;
    .locals 2

    if-eqz p2, :cond_1

    invoke-static {p0, p1}, Li2/w0;->x(J)F

    move-result p0

    float-to-double p0, p0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double p0, p0, v0

    if-lez p0, :cond_0

    sget-object p0, Lg1/z4;->d:Lk1/b;

    return-object p0

    :cond_0
    sget-object p0, Lg1/z4;->e:Lk1/b;

    return-object p0

    :cond_1
    sget-object p0, Lg1/z4;->f:Lk1/b;

    return-object p0
.end method

.method public static Z(JZ)J
    .locals 4

    invoke-static {p0, p1}, Li2/w0;->x(J)F

    move-result v0

    if-nez p2, :cond_0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double p2, v0, v2

    if-gez p2, :cond_0

    sget-wide p0, Li2/x;->f:J

    :cond_0
    return-wide p0
.end method

.method public static synthetic a(I)V
    .locals 6

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v0, :cond_0

    const-string v5, "propertyDescriptor"

    aput-object v5, v1, v2

    goto :goto_0

    :cond_0
    const-string v5, "memberDescriptor"

    aput-object v5, v1, v2

    goto :goto_0

    :cond_1
    const-string v5, "companionObject"

    aput-object v5, v1, v2

    :goto_0
    const-string v2, "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil"

    aput-object v2, v1, v4

    if-eq p0, v4, :cond_4

    if-eq p0, v3, :cond_3

    if-eq p0, v0, :cond_2

    const-string p0, "isPropertyWithBackingFieldInOuterClass"

    aput-object p0, v1, v3

    goto :goto_1

    :cond_2
    const-string p0, "hasJvmFieldAnnotation"

    aput-object p0, v1, v3

    goto :goto_1

    :cond_3
    const-string p0, "isMappedIntrinsicCompanionObject"

    aput-object p0, v1, v3

    goto :goto_1

    :cond_4
    const-string p0, "isClassCompanionObjectWithBackingFieldsInOuter"

    aput-object p0, v1, v3

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final a0(Lno/nordicsemi/android/ble/g0;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lpd3/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lpd3/c;

    iget v1, v0, Lpd3/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpd3/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpd3/c;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lpd3/c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpd3/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lpd3/c;->w:Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p1

    new-instance v2, Lio/sentry/android/replay/m;

    const/4 v4, 0x2

    invoke-direct {v2, p1, v4}, Lio/sentry/android/replay/m;-><init>(Lkotlin/jvm/internal/g0;I)V

    iput-object v2, p0, Lno/nordicsemi/android/ble/g0;->n:Lio/sentry/android/replay/m;

    iput-object p1, v0, Lpd3/c;->w:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lpd3/c;->y:I

    invoke-static {p0, v0}, Lse/a;->d0(Lno/nordicsemi/android/ble/k0;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final b(Lb30/j0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, -0x412951fa

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_6

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_6
    :goto_4
    iget-object v5, v0, Lb30/j0;->r:Lec3/h2;

    const/4 v6, 0x0

    invoke-static {v5, v15, v6}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb30/b;

    iget-boolean v7, v7, Lb30/b;->f:Z

    const/4 v8, 0x1

    xor-int/2addr v7, v8

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb30/b;

    iget-object v9, v9, Lb30/b;->b:Ljava/util/List;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lb30/b;

    iget-object v10, v10, Lb30/b;->a:Ljava/lang/String;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb30/b;

    iget-object v11, v11, Lb30/b;->h:Lq20/c;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lb30/b;

    iget-object v12, v12, Lb30/b;->j:Ljava/util/List;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lb30/b;

    iget-object v13, v13, Lb30/b;->c:Ls20/a;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lb30/b;

    iget-object v14, v14, Lb30/b;->i:Lt20/n;

    const-string v8, "PaymentSheetAddPaymentMethodForm"

    invoke-static {v1, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v6, 0x22a35ab5

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v3, 0xe

    if-eq v6, v4, :cond_8

    and-int/lit8 v17, v3, 0x8

    if-eqz v17, :cond_7

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    goto :goto_5

    :cond_7
    const/16 v17, 0x0

    goto :goto_6

    :cond_8
    :goto_5
    const/16 v17, 0x1

    :goto_6
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move/from16 v18, v3

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v17, :cond_a

    if-ne v4, v3, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v17, v7

    goto :goto_8

    :cond_a
    :goto_7
    new-instance v4, Lb30/g;

    move/from16 v17, v7

    const/4 v7, 0x0

    invoke-direct {v4, v0, v7}, Lb30/g;-><init>(Lb30/j0;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    const v7, 0x22a38864

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x4

    if-eq v6, v7, :cond_c

    and-int/lit8 v7, v18, 0x8

    if-eqz v7, :cond_b

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_9

    :cond_b
    const/4 v7, 0x0

    goto :goto_a

    :cond_c
    :goto_9
    const/4 v7, 0x1

    :goto_a
    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v7, v7, v19

    move-object/from16 v19, v4

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v7, :cond_d

    if-ne v4, v3, :cond_e

    :cond_d
    new-instance v4, La20/g;

    const/16 v7, 0x1b

    invoke-direct {v4, v7, v0, v5}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    const v7, 0x22a3d51d

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x4

    if-eq v6, v7, :cond_10

    and-int/lit8 v7, v18, 0x8

    if-eqz v7, :cond_f

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_c

    :cond_f
    const/4 v7, 0x0

    :goto_b
    move-object/from16 v20, v4

    goto :goto_d

    :cond_10
    :goto_c
    const/4 v7, 0x1

    goto :goto_b

    :goto_d
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v7, :cond_11

    if-ne v4, v3, :cond_12

    :cond_11
    new-instance v4, Lb30/g;

    const/4 v7, 0x1

    invoke-direct {v4, v0, v7}, Lb30/g;-><init>(Lb30/j0;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    const v7, 0x22a3b514

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x4

    if-eq v6, v7, :cond_14

    and-int/lit8 v6, v18, 0x8

    if-eqz v6, :cond_13

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    goto :goto_e

    :cond_13
    const/4 v6, 0x0

    goto :goto_f

    :cond_14
    :goto_e
    const/4 v6, 0x1

    :goto_f
    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_15

    if-ne v7, v3, :cond_16

    :cond_15
    new-instance v7, Li;

    const/16 v3, 0xf

    invoke-direct {v7, v3, v0, v5}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v7, Lc93/a;

    const/4 v3, 0x0

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    const v16, 0x201000

    move/from16 v3, v17

    const/16 v17, 0x0

    move-object v5, v13

    move-object v13, v4

    move-object v4, v9

    move-object v9, v5

    move-object v5, v10

    move-object v6, v11

    move-object v10, v14

    move-object/from16 v11, v20

    move-object v14, v7

    move-object v7, v12

    move-object v12, v8

    move-object/from16 v8, v19

    invoke-static/range {v3 .. v17}, Lce/w;->p(ZLjava/util/List;Ljava/lang/String;Lq20/c;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ls20/a;Lt20/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_10
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_17

    new-instance v4, Lk;

    const/16 v5, 0xa

    invoke-direct {v4, v0, v1, v2, v5}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final b0(Lno/nordicsemi/android/ble/m0;Ls83/i;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Ls;

    const/16 v1, 0x11

    invoke-direct {p1, p0, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;

    move-result-object p1

    new-instance v1, Leu/f;

    invoke-direct {v1, v0, p0}, Leu/f;-><init>(Lbc3/m;Lno/nordicsemi/android/ble/m0;)V

    invoke-virtual {p1, v1}, Lno/nordicsemi/android/ble/k0;->d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;

    move-result-object p1

    new-instance v1, Leu/f;

    invoke-direct {v1, p0, v0}, Leu/f;-><init>(Lno/nordicsemi/android/ble/m0;Lbc3/m;)V

    invoke-virtual {p1, v1}, Lno/nordicsemi/android/ble/k0;->c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;

    move-result-object p0

    new-instance p1, Leu/f;

    const/4 v1, 0x6

    invoke-direct {p1, v0, v1}, Leu/f;-><init>(Lbc3/m;I)V

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/k0;->a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;

    move-result-object p0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/k0;->b()V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ly00/x;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x156e25cb

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    sget-object p2, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    or-int/lit8 p2, p2, 0x30

    and-int/lit16 v0, p3, 0x180

    if-nez v0, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit16 v0, p2, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_5

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {p1}, Lse/b;->D(Ly00/c0;)Lzy/c;

    move-result-object p0

    invoke-static {p0, v4}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    iget-object p0, p1, Ly00/x;->z:Ljava/lang/String;

    const-string v0, "\u2022\u2022\u2022\u2022 "

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance p0, Lay/n;

    const/16 v0, 0x9

    invoke-direct {p0, p1, v0}, Lay/n;-><init>(Ljava/lang/Object;I)V

    const v0, -0xa05f721

    invoke-static {v0, v4, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    and-int/lit8 p0, p2, 0xe

    or-int/lit8 p0, p0, 0x30

    shl-int/lit8 p2, p2, 0x9

    const v3, 0xe000

    and-int/2addr p2, v3

    or-int v5, p0, p2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static/range {v0 .. v5}, Lse/a;->l(Lx1/b;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object p0, v3

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lof2/d;

    const/16 v1, 0x19

    invoke-direct {v0, p0, p1, p3, v1}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final c0(Lno/nordicsemi/android/ble/q0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lpd3/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lpd3/b;

    iget v1, v0, Lpd3/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpd3/b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpd3/b;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lpd3/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpd3/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lpd3/b;->w:Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p1

    new-instance v2, Lpd3/a;

    invoke-direct {v2, p1}, Lpd3/a;-><init>(Lkotlin/jvm/internal/g0;)V

    iput-object v2, p0, Lno/nordicsemi/android/ble/n0;->q:Ljava/lang/Object;

    iput-object p1, v0, Lpd3/b;->w:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lpd3/b;->y:I

    invoke-static {p0, v0}, Lse/a;->d0(Lno/nordicsemi/android/ble/k0;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final d(Lcom/amplitude/android/engagement/types/ButtonBlock;ZLsj/f;Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x67ed6aaf

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/ButtonBlock;->getMeta()Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/ButtonMeta;->getLabel()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "Continue"

    :cond_0
    move-object v8, v2

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/ButtonMeta;->getAction()Lcom/amplitude/android/engagement/types/Action;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Lcom/amplitude/android/engagement/types/CompleteAction;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/amplitude/android/engagement/types/CompleteAction;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    move-object v5, v2

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/ButtonMeta;->getButtonType()Lcom/amplitude/android/engagement/types/ButtonType;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/amplitude/android/engagement/types/ButtonType;->TERTIARY:Lcom/amplitude/android/engagement/types/ButtonType;

    :cond_2
    new-instance v3, Loj/m;

    move/from16 v7, p1

    move-object/from16 v4, p2

    move/from16 v6, p4

    invoke-direct/range {v3 .. v8}, Loj/m;-><init>(Lsj/f;Lcom/amplitude/android/engagement/types/Action;IZLjava/lang/String;)V

    const v2, 0x503c1647

    invoke-static {v2, v0, v3}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x180

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v0, v3}, Luj/e;->a(Lcom/amplitude/android/engagement/types/ButtonType;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    new-instance v9, Lqj/a;

    const/4 v14, 0x0

    move-object v10, p0

    move/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    invoke-direct/range {v9 .. v14}, Lqj/a;-><init>(Ljava/lang/Object;ZLl83/e;II)V

    iput-object v9, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final d0(Lno/nordicsemi/android/ble/k0;Ls83/c;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lq83/l;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-direct {v0, p1}, Lq83/l;-><init>(Lq83/d;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/k0;->i(Landroid/os/Handler;)Lno/nordicsemi/android/ble/k0;

    move-result-object p1

    new-instance v1, Lp33/b;

    invoke-direct {v1, v0, p0}, Lp33/b;-><init>(Lq83/l;Lno/nordicsemi/android/ble/k0;)V

    invoke-virtual {p1, v1}, Lno/nordicsemi/android/ble/k0;->d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;

    move-result-object p1

    new-instance v1, Lp33/b;

    invoke-direct {v1, p0, v0}, Lp33/b;-><init>(Lno/nordicsemi/android/ble/k0;Lq83/l;)V

    invoke-virtual {p1, v1}, Lno/nordicsemi/android/ble/k0;->c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;

    move-result-object p0

    new-instance p1, Lp33/b;

    const/4 v1, 0x5

    invoke-direct {p1, v0, v1}, Lp33/b;-><init>(Lq83/l;I)V

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/k0;->a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;

    move-result-object p0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/k0;->b()V

    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v10, p3

    check-cast v10, Lp1/q;

    const p3, 0x59db6508

    invoke-virtual {v10, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, v5, 0x6

    if-nez p3, :cond_1

    sget-object p3, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v10, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, v5

    goto :goto_1

    :cond_1
    move p3, v5

    :goto_1
    and-int/lit8 v0, v5, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p3, v0

    :cond_3
    and-int/lit16 v0, v5, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p3, v0

    :cond_5
    and-int/lit16 v0, v5, 0xc00

    if-nez v0, :cond_7

    invoke-virtual {v10, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x800

    goto :goto_4

    :cond_6
    const/16 v0, 0x400

    :goto_4
    or-int/2addr p3, v0

    :cond_7
    and-int/lit16 v0, v5, 0x6000

    if-nez v0, :cond_9

    invoke-virtual {v10, v4}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x4000

    goto :goto_5

    :cond_8
    const/16 v0, 0x2000

    :goto_5
    or-int/2addr p3, v0

    :cond_9
    and-int/lit16 v0, p3, 0x2493

    const/16 v1, 0x2492

    if-ne v0, v1, :cond_b

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_7

    :cond_b
    :goto_6
    new-instance v0, Lb30/v4;

    const/4 v1, 0x1

    invoke-direct {v0, v4, v1}, Lb30/v4;-><init>(II)V

    const v1, 0x6abdb91e

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit8 v0, p3, 0xe

    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v1, p3, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, p3, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 p3, p3, 0x9

    const v1, 0xe000

    and-int/2addr p3, v1

    or-int v11, v0, p3

    move-object v9, p0

    move-object v7, p1

    move-object v8, p2

    invoke-static/range {v6 .. v11}, Lse/a;->l(Lx1/b;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, Lb30/k6;

    const/4 v6, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lb30/k6;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;III)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static e0(IJ[B)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, p0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v2, p1

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    shr-long/2addr p1, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x738d080b

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {v1}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v2

    iget-wide v2, v2, Lg00/b;->d:J

    invoke-static {v1}, Lce/w;->Q(Landroidx/compose/runtime/Composer;)Lg00/c;

    move-result-object v4

    iget-object v4, v4, Lg00/c;->a:Lt0/i;

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-eqz v8, :cond_2

    invoke-virtual {v1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v1, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v1, Lp1/q;->S:Z

    if-nez v6, :cond_3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x7f141113

    invoke-static {v1, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    int-to-float v3, v3

    const/4 v4, 0x2

    int-to-float v4, v4

    invoke-static {v5, v3, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v4

    iget-wide v4, v4, Lg00/b;->o:J

    invoke-static {v1}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v6

    iget-object v6, v6, Lg00/e;->f:Ll3/v0;

    const/16 v7, 0xc

    invoke-static {v7}, Lv63/c;->h(I)J

    move-result-wide v7

    move-object/from16 v22, v1

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v4

    move-object/from16 v21, v6

    move-wide v5, v7

    sget-object v8, Lp3/r;->G:Lp3/r;

    const/16 v24, 0x0

    const v25, 0xffd0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, 0x30c30

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v22

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lp0/w0;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v3}, Lp0/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final f0(Ll3/g;)Lb3/q1;
    .locals 21

    move-object/from16 v0, p0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v1, v0, Ll3/g;->y:Ljava/util/ArrayList;

    new-instance v2, Lb3/q1;

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-nez v1, :cond_1

    move-object v4, v3

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    move-object/from16 v16, v2

    goto/16 :goto_6

    :cond_2
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v0, Lb3/b2;

    const/4 v5, 0x2

    invoke-direct {v0, v5}, Lb3/b2;-><init>(I)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5

    iput-object v5, v0, Lb3/b2;->b:Landroid/os/Parcel;

    if-nez v1, :cond_3

    move-object v1, v3

    :cond_3
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v3, :cond_16

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll3/e;

    iget-object v8, v7, Ll3/e;->a:Ljava/lang/Object;

    check-cast v8, Ll3/m0;

    iget v9, v7, Ll3/e;->b:I

    iget v7, v7, Ll3/e;->c:I

    iget-object v10, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v10

    iput-object v10, v0, Lb3/b2;->b:Landroid/os/Parcel;

    iget-object v10, v8, Ll3/m0;->a:Lw3/o;

    iget-wide v11, v8, Ll3/m0;->l:J

    iget-wide v13, v8, Ll3/m0;->h:J

    move v15, v6

    iget-wide v5, v8, Ll3/m0;->b:J

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    invoke-interface {v10}, Lw3/o;->b()J

    move-result-wide v1

    move/from16 v18, v3

    move-object v10, v4

    sget-wide v3, Li2/x;->n:J

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_4

    invoke-virtual {v0, v2}, Lb3/b2;->c(B)V

    iget-object v1, v8, Ll3/m0;->a:Lw3/o;

    move-wide/from16 v19, v3

    invoke-interface {v1}, Lw3/o;->b()J

    move-result-wide v2

    iget-object v1, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    goto :goto_3

    :cond_4
    move-wide/from16 v19, v3

    :goto_3
    sget-wide v1, Ly3/o;->c:J

    invoke-static {v5, v6, v1, v2}, Ly3/o;->a(JJ)Z

    move-result v3

    const/4 v4, 0x2

    if-nez v3, :cond_5

    invoke-virtual {v0, v4}, Lb3/b2;->c(B)V

    invoke-virtual {v0, v5, v6}, Lb3/b2;->e(J)V

    :cond_5
    iget-object v3, v8, Ll3/m0;->c:Lp3/r;

    const/4 v5, 0x3

    if-eqz v3, :cond_6

    invoke-virtual {v0, v5}, Lb3/b2;->c(B)V

    iget v3, v3, Lp3/r;->w:I

    iget-object v6, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v6, v3}, Landroid/os/Parcel;->writeInt(I)V

    :cond_6
    iget-object v3, v8, Ll3/m0;->d:Lp3/n;

    if-eqz v3, :cond_9

    iget v3, v3, Lp3/n;->a:I

    const/4 v6, 0x4

    invoke-virtual {v0, v6}, Lb3/b2;->c(B)V

    if-nez v3, :cond_8

    :cond_7
    const/4 v3, 0x0

    goto :goto_4

    :cond_8
    const/4 v6, 0x1

    if-ne v3, v6, :cond_7

    const/4 v3, 0x1

    :goto_4
    invoke-virtual {v0, v3}, Lb3/b2;->c(B)V

    :cond_9
    iget-object v3, v8, Ll3/m0;->e:Lp3/o;

    if-eqz v3, :cond_e

    iget v3, v3, Lp3/o;->a:I

    const/4 v6, 0x5

    invoke-virtual {v0, v6}, Lb3/b2;->c(B)V

    if-nez v3, :cond_b

    :cond_a
    const/4 v4, 0x0

    goto :goto_5

    :cond_b
    const v6, 0xffff

    if-ne v3, v6, :cond_c

    const/4 v4, 0x1

    goto :goto_5

    :cond_c
    const/4 v6, 0x1

    if-ne v3, v6, :cond_d

    goto :goto_5

    :cond_d
    if-ne v3, v4, :cond_a

    move v4, v5

    :goto_5
    invoke-virtual {v0, v4}, Lb3/b2;->c(B)V

    :cond_e
    iget-object v3, v8, Ll3/m0;->g:Ljava/lang/String;

    if-eqz v3, :cond_f

    const/4 v4, 0x6

    invoke-virtual {v0, v4}, Lb3/b2;->c(B)V

    iget-object v4, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_f
    invoke-static {v13, v14, v1, v2}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_10

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lb3/b2;->c(B)V

    invoke-virtual {v0, v13, v14}, Lb3/b2;->e(J)V

    :cond_10
    iget-object v1, v8, Ll3/m0;->i:Lw3/a;

    if-eqz v1, :cond_11

    iget v1, v1, Lw3/a;->a:F

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lb3/b2;->c(B)V

    invoke-virtual {v0, v1}, Lb3/b2;->d(F)V

    :cond_11
    iget-object v1, v8, Ll3/m0;->j:Lw3/p;

    if-eqz v1, :cond_12

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Lb3/b2;->c(B)V

    iget v2, v1, Lw3/p;->a:F

    invoke-virtual {v0, v2}, Lb3/b2;->d(F)V

    iget v1, v1, Lw3/p;->b:F

    invoke-virtual {v0, v1}, Lb3/b2;->d(F)V

    :cond_12
    move-wide/from16 v1, v19

    invoke-static {v11, v12, v1, v2}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_13

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lb3/b2;->c(B)V

    iget-object v1, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v1, v11, v12}, Landroid/os/Parcel;->writeLong(J)V

    :cond_13
    iget-object v1, v8, Ll3/m0;->m:Lw3/l;

    if-eqz v1, :cond_14

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Lb3/b2;->c(B)V

    iget v1, v1, Lw3/l;->a:I

    iget-object v2, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInt(I)V

    :cond_14
    iget-object v1, v8, Ll3/m0;->n:Li2/z0;

    if-eqz v1, :cond_15

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Lb3/b2;->c(B)V

    iget-wide v2, v1, Li2/z0;->a:J

    iget-object v4, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v4, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v2, v1, Li2/z0;->b:J

    const/16 v4, 0x20

    shr-long v4, v2, v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v0, v4}, Lb3/b2;->d(F)V

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v0, v2}, Lb3/b2;->d(F)V

    iget v1, v1, Li2/z0;->c:F

    invoke-virtual {v0, v1}, Lb3/b2;->d(F)V

    :cond_15
    new-instance v1, Landroid/text/Annotation;

    iget-object v2, v0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    const-string v4, "androidx.compose.text.SpanStyle"

    invoke-direct {v1, v4, v2}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x21

    invoke-virtual {v10, v1, v9, v7, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v6, v15, 0x1

    move-object v4, v10

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move/from16 v3, v18

    goto/16 :goto_2

    :cond_16
    move-object v10, v4

    move-object v0, v10

    goto/16 :goto_1

    :goto_6
    const-string v1, "plain text"

    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-direct {v1, v0}, Lb3/q1;-><init>(Landroid/content/ClipData;)V

    return-object v1
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lh40/k;Lwz/e1;Lh00/j;Lk20/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v15, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v13, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v8, p11

    move-object/from16 v3, p12

    move-object/from16 v14, p13

    move-object/from16 v5, p14

    const-string v12, "modifier"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "bottomSheetState"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "initialDestination"

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "appBarState"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "eventReporter"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "onBackPressed"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "moveToWeb"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "goBack"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "onNavBackStackEntryChanged"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "navigationChannel"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "handleViewAction"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "navigate"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dismiss"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dismissWithResult"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "getLinkAccount"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "changeEmail"

    move-object/from16 v5, p15

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p16

    check-cast v12, Lp1/q;

    const v5, 0x1db9f0d9

    invoke-virtual {v12, v5}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v5, p17

    and-int/lit8 v16, v5, 0x6

    const/16 v17, 0x4

    const/16 v18, 0x2

    if-nez v16, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_0

    move/from16 v16, v17

    goto :goto_0

    :cond_0
    move/from16 v16, v18

    :goto_0
    or-int v16, v5, v16

    goto :goto_1

    :cond_1
    move/from16 v16, v5

    :goto_1
    and-int/lit8 v19, v5, 0x30

    const/16 v20, 0x10

    const/16 v21, 0x20

    if-nez v19, :cond_4

    and-int/lit8 v19, v5, 0x40

    if-nez v19, :cond_2

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    goto :goto_2

    :cond_2
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    :goto_2
    if-eqz v19, :cond_3

    move/from16 v19, v21

    goto :goto_3

    :cond_3
    move/from16 v19, v20

    :goto_3
    or-int v16, v16, v19

    :cond_4
    and-int/lit16 v1, v5, 0x180

    const/16 v19, 0x80

    move/from16 v22, v1

    if-nez v22, :cond_6

    invoke-virtual {v12, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_5

    const/16 v22, 0x100

    goto :goto_4

    :cond_5
    move/from16 v22, v19

    :goto_4
    or-int v16, v16, v22

    :cond_6
    and-int/lit16 v1, v5, 0xc00

    const/16 v22, 0x400

    const/16 v23, 0x800

    if-nez v1, :cond_8

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    move/from16 v1, v23

    goto :goto_5

    :cond_7
    move/from16 v1, v22

    :goto_5
    or-int v16, v16, v1

    :cond_8
    and-int/lit16 v1, v5, 0x6000

    const/16 v24, 0x2000

    const/16 v25, 0x4000

    if-nez v1, :cond_b

    const v1, 0x8000

    and-int/2addr v1, v5

    if-nez v1, :cond_9

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_6

    :cond_9
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_6
    if-eqz v1, :cond_a

    move/from16 v1, v25

    goto :goto_7

    :cond_a
    move/from16 v1, v24

    :goto_7
    or-int v16, v16, v1

    :cond_b
    const/high16 v1, 0x30000

    and-int/2addr v1, v5

    const/high16 v26, 0x10000

    const/high16 v27, 0x20000

    if-nez v1, :cond_d

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    move/from16 v1, v27

    goto :goto_8

    :cond_c
    move/from16 v1, v26

    :goto_8
    or-int v16, v16, v1

    :cond_d
    const/high16 v1, 0x180000

    and-int/2addr v1, v5

    if-nez v1, :cond_f

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/high16 v1, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v1, 0x80000

    :goto_9
    or-int v16, v16, v1

    :cond_f
    const/high16 v1, 0xc00000

    and-int/2addr v1, v5

    if-nez v1, :cond_11

    invoke-virtual {v12, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/high16 v1, 0x800000

    goto :goto_a

    :cond_10
    const/high16 v1, 0x400000

    :goto_a
    or-int v16, v16, v1

    :cond_11
    const/high16 v1, 0x6000000

    and-int/2addr v1, v5

    if-nez v1, :cond_13

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/high16 v1, 0x4000000

    goto :goto_b

    :cond_12
    const/high16 v1, 0x2000000

    :goto_b
    or-int v16, v16, v1

    :cond_13
    const/high16 v1, 0x30000000

    and-int/2addr v1, v5

    if-nez v1, :cond_15

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/high16 v1, 0x20000000

    goto :goto_c

    :cond_14
    const/high16 v1, 0x10000000

    :goto_c
    or-int v16, v16, v1

    :cond_15
    move/from16 v1, p18

    and-int/lit8 v28, v1, 0x6

    if-nez v28, :cond_17

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_16

    goto :goto_d

    :cond_16
    move/from16 v17, v18

    :goto_d
    or-int v17, v1, v17

    goto :goto_e

    :cond_17
    move/from16 v17, v1

    :goto_e
    and-int/lit8 v18, v1, 0x30

    if-nez v18, :cond_19

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    move/from16 v20, v21

    :cond_18
    or-int v17, v17, v20

    :cond_19
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_1b

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const/16 v19, 0x100

    :cond_1a
    or-int v17, v17, v19

    :cond_1b
    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_1d

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    move/from16 v22, v23

    :cond_1c
    or-int v17, v17, v22

    :cond_1d
    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_1f

    move-object/from16 v0, p14

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1e

    move/from16 v24, v25

    :cond_1e
    or-int v17, v17, v24

    :goto_f
    move-object/from16 v14, p15

    goto :goto_10

    :cond_1f
    move-object/from16 v0, p14

    goto :goto_f

    :goto_10
    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_20

    move/from16 v26, v27

    :cond_20
    or-int v0, v17, v26

    const v17, 0x12492493

    and-int v1, v16, v17

    const v2, 0x12492492

    if-ne v1, v2, :cond_22

    const v1, 0x12493

    and-int/2addr v1, v0

    const v2, 0x12492

    if-ne v1, v2, :cond_22

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_21

    goto :goto_11

    :cond_21
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object v2, v12

    goto/16 :goto_13

    :cond_22
    :goto_11
    const/4 v1, 0x0

    new-array v2, v1, [Leb/i1;

    invoke-static {v2, v12}, Lge3/g;->S([Leb/i1;Landroidx/compose/runtime/Composer;)Leb/u0;

    move-result-object v17

    const v2, -0x1a6f3038

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v12, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/x2;

    const v1, -0x65cb5396

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const v4, -0x1883268e

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_23

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v4, Lp1/c1;

    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v6, -0x18831cfb

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    move/from16 v18, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v18, :cond_24

    if-ne v6, v5, :cond_25

    :cond_24
    new-instance v6, Llq0/d;

    const/16 v7, 0x15

    invoke-direct {v6, v7, v1, v4}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    invoke-static {v1, v6, v12}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    const v1, -0xffdab2c

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_26

    if-ne v6, v5, :cond_27

    :cond_26
    new-instance v6, Llive/hms/video/connection/degredation/a;

    const/16 v1, 0x14

    invoke-direct {v6, v2, v1}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v6, Lc93/a;

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    new-instance v1, Ld1/j;

    invoke-direct {v1, v6, v4}, Ld1/j;-><init>(Lc93/a;Lp1/c1;)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    const v2, -0xbd1461

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x380

    const/16 v2, 0x100

    if-ne v0, v2, :cond_28

    const/4 v0, 0x1

    goto :goto_12

    :cond_28
    const/4 v0, 0x0

    :goto_12
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_29

    if-ne v2, v5, :cond_2a

    :cond_29
    new-instance v2, Lh0/l0;

    const/4 v0, 0x1

    invoke-direct {v2, v3, v0}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object/from16 v19, v2

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    shr-int/lit8 v0, v16, 0x1b

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v24, v16, 0xc

    const v2, 0xe000

    and-int v2, v24, v2

    or-int v22, v0, v2

    move-object/from16 v18, v1

    move-object/from16 v20, v9

    move-object/from16 v16, v10

    move-object/from16 v21, v12

    invoke-static/range {v16 .. v22}, Ln40/h;->a(Lec3/t1;Leb/u0;Ld1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v0, v21

    const v1, -0xbd0305

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v1, v5, :cond_2b

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v1, Lp1/c1;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    const/4 v4, 0x3

    invoke-static {v2, v0, v4}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v6

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const v7, -0xbcecc6

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_2c

    if-ne v9, v5, :cond_2d

    :cond_2c
    new-instance v9, Ld30/o;

    const/16 v5, 0x1b

    invoke-direct {v9, v6, v1, v2, v5}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v9, Lc93/m;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    invoke-static {v0, v9, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v21, v0

    new-instance v0, Lh00/h;

    move-object/from16 v5, p3

    move-object/from16 v12, p6

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v16, v1

    move-object v2, v3

    move-object v7, v11

    move-object/from16 v4, v17

    move-object/from16 v29, v21

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p5

    invoke-direct/range {v0 .. v16}, Lh00/h;-><init>(Lh40/k;Lc93/a;Landroidx/compose/ui/Modifier;Leb/u0;Lh00/j;Lh40/k;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lwz/e1;Lp1/c1;)V

    const v1, 0x4126c6b9

    move-object/from16 v2, v29

    invoke-static {v1, v2, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    and-int/lit8 v1, v24, 0xe

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v5, p4

    invoke-static {v5, v0, v2, v1}, Lio/sentry/config/a;->e(Lk20/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_13
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, Lh00/e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lh00/e;-><init>(Landroidx/compose/ui/Modifier;Lh40/k;Lwz/e1;Lh00/j;Lk20/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;II)V

    move-object/from16 v1, v30

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method public static final g0(Lh20/u2;)Ly00/a1;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lh20/u2;->w:Lh20/r2;

    iget-boolean v2, v0, Lh20/u2;->E:Z

    instance-of v3, v1, Lh20/p2;

    if-eqz v3, :cond_d

    new-instance v4, Ly00/w0;

    check-cast v1, Lh20/p2;

    iget-wide v5, v1, Lh20/p2;->w:J

    iget-object v7, v1, Lh20/p2;->x:Ljava/lang/String;

    iget-object v3, v1, Lh20/p2;->y:Lh20/t2;

    if-eqz v3, :cond_0

    invoke-static {v3}, Lse/a;->h0(Lh20/t2;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v9, v1, Lh20/p2;->z:Lh20/k2;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v9, :cond_3

    if-eq v9, v11, :cond_2

    if-ne v9, v10, :cond_1

    sget-object v9, Ly00/e3;->E:Ly00/e3;

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    sget-object v9, Ly00/e3;->z:Ly00/e3;

    goto :goto_1

    :cond_3
    sget-object v9, Ly00/e3;->y:Ly00/e3;

    :goto_1
    iget-object v1, v1, Lh20/p2;->E:Lh20/o2;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lh20/o2;->w:Ljava/util/LinkedHashMap;

    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v13

    invoke-static {v13}, Lm83/g0;->W(I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly00/f4;

    iget-object v14, v14, Ly00/f4;->w:Ljava/lang/String;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v12, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v12}, Ljava/util/Map;->size()I

    move-result v13

    invoke-static {v13}, Lm83/g0;->W(I)I

    move-result v13

    invoke-direct {v1, v13}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v12}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh20/t2;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_7

    if-eq v13, v11, :cond_6

    if-ne v13, v10, :cond_5

    const-string v13, "none"

    goto :goto_4

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    const-string v13, "off_session"

    goto :goto_4

    :cond_7
    const-string v13, "on_session"

    :goto_4
    new-instance v15, Ll83/k;

    const-string v8, "setup_future_usage"

    invoke-direct {v15, v8, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v8

    invoke-interface {v1, v14, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    goto :goto_5

    :cond_9
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_5
    if-eqz v2, :cond_b

    const-string v2, "card"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_a

    sget-object v8, Lm83/z;->w:Lm83/z;

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    check-cast v8, Ljava/util/Map;

    invoke-static {v8}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v8

    const-string v10, "require_cvc_recollection"

    const-string v11, "true"

    invoke-interface {v8, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v10, 0x0

    :goto_6
    move-object v8, v3

    goto :goto_7

    :cond_c
    invoke-static {v1}, Ls/s;->o(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    move-object v10, v8

    goto :goto_6

    :goto_7
    invoke-direct/range {v4 .. v10}, Ly00/w0;-><init>(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/e3;Ljava/lang/String;)V

    goto :goto_8

    :cond_d
    instance-of v2, v1, Lh20/q2;

    if-eqz v2, :cond_e

    new-instance v4, Ly00/y0;

    check-cast v1, Lh20/q2;

    iget-object v2, v1, Lh20/q2;->w:Ljava/lang/String;

    iget-object v1, v1, Lh20/q2;->x:Lh20/t2;

    invoke-static {v1}, Lse/a;->h0(Lh20/t2;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v1

    invoke-direct {v4, v2, v1}, Ly00/y0;-><init>(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;)V

    :goto_8
    iget-object v1, v0, Lh20/u2;->x:Ljava/util/List;

    iget-object v2, v0, Lh20/u2;->z:Ljava/lang/String;

    iget-object v0, v0, Lh20/u2;->y:Ljava/lang/String;

    new-instance v3, Ly00/a1;

    invoke-direct {v3, v4, v1, v0, v2}, Ly00/a1;-><init>(Ly00/z0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final h(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x3e025f8f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move/from16 v0, p0

    invoke-virtual {v12, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_1
    move/from16 v0, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    move-object/from16 v14, p2

    if-nez v5, :cond_5

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v5, v3, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_7

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_7
    :goto_4
    sget-object v5, Lb2/e;->E:Lb2/m;

    sget v6, Lg00/g;->e:F

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v6, 0xc

    int-to-float v6, v6

    const/16 v19, 0x0

    const/16 v20, 0xb

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v18, v6

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v15, 0x0

    invoke-static {v5, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v8, v12, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v2, :cond_b

    const v3, 0x2a2453b1

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    const-string v3, "wallet_payment_detail_item_loading_indicator"

    invoke-static {v7, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v5, v1

    const v1, -0x1a6f7841

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    iget-wide v8, v1, Lg00/b;->u:J

    const/16 v6, 0xc06

    const/4 v7, 0x4

    const-wide/16 v10, 0x0

    invoke-static/range {v5 .. v13}, Lup/d;->f(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    const v1, 0x2a28f4b7    # 1.50063E-13f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const-string v1, "wallet_payment_detail_item_menu_button"

    invoke-static {v7, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lq00/j;->b:Lx1/b;

    shr-int/lit8 v1, v3, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x6030

    shl-int/lit8 v3, v3, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int v10, v1, v3

    const/16 v11, 0x8

    move v7, v0

    move-object v9, v12

    move-object v5, v14

    invoke-static/range {v5 .. v11}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lo42/j;

    const/4 v5, 0x1

    move/from16 v1, p0

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lo42/j;-><init>(ZZLl83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final h0(Lh20/t2;)Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "PaymentSheet.IntentConfiguration setupFutureUse cannot be set to None"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lcom/stripe/android/model/StripeIntent$Usage;->z:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object p0

    :cond_2
    sget-object p0, Lcom/stripe/android/model/StripeIntent$Usage;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object p0
.end method

.method public static final i(La3/q2;Lp1/t;)Lp1/w;
    .locals 1

    new-instance v0, Lp1/w;

    invoke-direct {v0, p1, p0}, Lp1/w;-><init>(Lp1/t;Lhb3/a0;)V

    return-object v0
.end method

.method public static final i0(Lo20/b;Ljava/lang/String;Lv00/c0;)Ly00/d5;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo20/b;->a:Ljava/util/LinkedHashMap;

    sget-object v1, Lv00/d0;->b:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/b0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Lv00/b0;->c(Lv00/c0;)Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object p0, p0, Lo20/b;->b:Lq20/h;

    const-string v3, "customerRequestedSave"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v3, p2, Lv00/c0;->a0:Z

    if-eqz v3, :cond_2

    :cond_1
    const/4 v2, 0x1

    :cond_2
    iget-object v3, p2, Lv00/c0;->S:Lv00/i0;

    invoke-interface {v3, v2, p0}, Lv00/i0;->L(ZLq20/h;)Ly00/r3;

    move-result-object p0

    iget-object p2, p2, Lv00/c0;->d0:Ly00/n;

    invoke-static {v0, p1, v1, p0, p2}, Ls4/i;->u(Ljava/util/Map;Ljava/lang/String;ZLy00/r3;Ly00/n;)Ly00/d5;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Ly00/c0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, 0x1c2e4fd5

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    sget-object p2, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit16 v0, p3, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p2, v0

    :cond_5
    and-int/lit16 v0, p2, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_7

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v1, p0

    goto :goto_5

    :cond_7
    :goto_4
    instance-of v0, p1, Ly00/a0;

    const/4 v7, 0x0

    if-eqz v0, :cond_8

    const v0, -0x5fef2592

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Lse/b;->D(Ly00/c0;)Lzy/c;

    move-result-object v0

    invoke-static {v0, v4}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    move-object v0, p1

    check-cast v0, Ly00/a0;

    iget-object v1, v0, Ly00/a0;->z:Ljava/lang/String;

    const-string v3, "\u2022\u2022\u2022\u2022 "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Ly00/a0;->K:Ly00/i;

    invoke-static {v0}, Ldp/d;->D(Ly00/i;)I

    move-result v5

    and-int/lit8 v6, p2, 0x7e

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lse/a;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    move-object v1, p0

    instance-of p0, p1, Ly00/x;

    if-eqz p0, :cond_9

    const p0, -0x5fea8a7b

    invoke-virtual {v4, p0}, Lp1/q;->e0(I)V

    move-object p0, p1

    check-cast p0, Ly00/x;

    and-int/lit8 p2, p2, 0xe

    const/4 v0, 0x0

    invoke-static {v0, p0, v4, p2}, Lse/a;->c(Landroidx/compose/ui/Modifier;Ly00/x;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    instance-of p0, p1, Ly00/b0;

    if-eqz p0, :cond_b

    const p0, -0x5fe8a6d5

    invoke-virtual {v4, p0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Lse/b;->D(Ly00/c0;)Lzy/c;

    move-result-object p0

    invoke-static {p0, v4}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    sget-object p0, Ly00/i;->X:Ly00/i;

    invoke-static {p0}, Ldp/d;->D(Ly00/i;)I

    move-result v5

    and-int/lit8 p0, p2, 0xe

    or-int/lit16 p0, p0, 0xc00

    and-int/lit8 p2, p2, 0x70

    or-int v6, p0, p2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lse/a;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance p2, Lof2/d;

    const/16 v0, 0x18

    invoke-direct {p2, v1, p1, p3, v0}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void

    :cond_b
    const p0, 0x2e742476

    invoke-static {p0, v4, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0
.end method

.method public static final j0(Lo20/b;Lu00/f;Lv00/c0;Ly00/o4;Lj00/k;)Lq20/y;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "<this>"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "paymentMethod"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "paymentMethodMetadata"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lo20/b;->b:Lq20/h;

    iget-object v7, v1, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v8

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v6, Lq20/h;->w:Ly00/o;

    if-nez v5, :cond_0

    const/4 v6, -0x1

    goto :goto_0

    :cond_0
    sget-object v6, Lq20/z;->b:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v6, v6, v9

    :goto_0
    const/4 v9, 0x1

    const/4 v10, 0x0

    if-ne v6, v9, :cond_1

    goto :goto_1

    :cond_1
    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    move-object v5, v10

    :goto_1
    invoke-static {v0, v7, v2}, Lse/a;->i0(Lo20/b;Ljava/lang/String;Lv00/c0;)Ly00/d5;

    move-result-object v12

    iget-object v6, v0, Lo20/b;->a:Ljava/util/LinkedHashMap;

    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v13}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getDestination()Lg40/w1;

    move-result-object v13

    sget-object v14, Lg40/u1;->x:Lg40/u1;

    if-ne v13, v14, :cond_3

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v8, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    sget-object v9, Ly00/f4;->G:Lt9/c0;

    const-string v9, "card"

    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-string v13, "sepa_debit"

    if-eqz v11, :cond_5

    new-instance v8, Ly00/l5;

    const/4 v11, 0x3

    invoke-direct {v8, v11, v10, v5}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    :goto_3
    move-object v15, v8

    goto/16 :goto_6

    :cond_5
    const-string v11, "blik"

    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBlikCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_6

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object v5, v10

    :goto_4
    if-eqz v5, :cond_b

    new-instance v8, Ly00/k5;

    invoke-direct {v8, v5, v10}, Ly00/k5;-><init>(Ljava/lang/String;Ly00/o;)V

    goto :goto_3

    :cond_7
    const-string v11, "konbini"

    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getKonbiniConfirmationNumber$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_8

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    goto :goto_5

    :cond_8
    move-object v5, v10

    :goto_5
    if-eqz v5, :cond_b

    new-instance v8, Ly00/m5;

    invoke-direct {v8, v5, v10}, Ly00/m5;-><init>(Ljava/lang/String;Ly00/o;)V

    goto :goto_3

    :cond_9
    const-string v8, "wechat_pay"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance v8, Ly00/t5;

    invoke-direct {v8, v10}, Ly00/t5;-><init>(Ly00/o;)V

    goto :goto_3

    :cond_a
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    new-instance v8, Ly00/o5;

    invoke-direct {v8, v5}, Ly00/o5;-><init>(Ly00/o;)V

    goto :goto_3

    :cond_b
    move-object v15, v10

    :goto_6
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v14}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->getDestination()Lg40/w1;

    move-result-object v14

    move-object/from16 v16, v10

    sget-object v10, Lg40/v1;->w:Lg40/v1;

    if-ne v14, v10, :cond_c

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    move-object/from16 v10, v16

    goto :goto_7

    :cond_d
    move-object/from16 v16, v10

    sget-object v8, Ly00/f4;->G:Lt9/c0;

    const-string v8, "bacs_debit"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    new-instance v8, Ly00/e5;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBacsDebitConfirmed$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_e

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    if-eqz v5, :cond_e

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_8

    :cond_e
    move-object/from16 v5, v16

    :goto_8
    invoke-direct {v8, v5}, Ly00/e5;-><init>(Ljava/lang/Boolean;)V

    :goto_9
    move-object/from16 v20, v8

    goto/16 :goto_f

    :cond_f
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    new-instance v8, Ly00/f5;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSetAsDefaultPaymentMethod$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll40/a;

    if-eqz v10, :cond_10

    iget-object v10, v10, Ll40/a;->a:Ljava/lang/String;

    if-eqz v10, :cond_10

    invoke-static {v10}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_a

    :cond_10
    move-object/from16 v10, v16

    :goto_a
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhoneNumberCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_11

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    goto :goto_b

    :cond_11
    move-object/from16 v5, v16

    :goto_b
    invoke-direct {v8, v10, v5}, Ly00/f5;-><init>(Ljava/lang/Boolean;Ljava/lang/String;)V

    goto :goto_9

    :cond_12
    const-string v8, "link"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    new-instance v8, Ly00/g5;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSetAsDefaultPaymentMethod$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_13

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    if-eqz v5, :cond_13

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_c

    :cond_13
    move-object/from16 v5, v16

    :goto_c
    invoke-direct {v8, v5}, Ly00/g5;-><init>(Ljava/lang/Boolean;)V

    goto :goto_9

    :cond_14
    const-string v8, "us_bank_account"

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    new-instance v8, Ly00/i5;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSetAsDefaultPaymentMethod$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_15

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    if-eqz v5, :cond_15

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_d

    :cond_15
    move-object/from16 v5, v16

    :goto_d
    invoke-direct {v8, v5}, Ly00/i5;-><init>(Ljava/lang/Boolean;)V

    goto/16 :goto_9

    :cond_16
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    new-instance v8, Ly00/h5;

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSetAsDefaultPaymentMethod$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_17

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    if-eqz v5, :cond_17

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_e

    :cond_17
    move-object/from16 v5, v16

    :goto_e
    invoke-direct {v8, v5}, Ly00/h5;-><init>(Ljava/lang/Boolean;)V

    goto/16 :goto_9

    :cond_18
    move-object/from16 v20, v16

    :goto_f
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    if-eqz v4, :cond_19

    invoke-virtual {v4}, Lj00/k;->b()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v4, Lj00/k;->a:Lj00/i0;

    if-nez v1, :cond_19

    return-object v16

    :cond_19
    if-eqz v3, :cond_1a

    new-instance v0, Lq20/w;

    move-object/from16 v1, v16

    invoke-direct {v0, v3, v1, v1}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    return-object v0

    :cond_1a
    move-object/from16 v1, v16

    sget-object v2, Ly00/i;->M:Lt9/c0;

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll40/a;

    if-eqz v3, :cond_1b

    iget-object v3, v3, Ll40/a;->a:Ljava/lang/String;

    goto :goto_10

    :cond_1b
    move-object v3, v1

    :goto_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v13

    iget-object v14, v0, Lo20/b;->b:Lq20/h;

    if-eqz v4, :cond_1c

    iget-object v0, v4, Lj00/k;->a:Lj00/i0;

    if-eqz v0, :cond_1c

    invoke-virtual {v4}, Lj00/k;->b()Z

    move-result v2

    if-eqz v2, :cond_1c

    move-object/from16 v17, v0

    goto :goto_11

    :cond_1c
    move-object/from16 v17, v1

    :goto_11
    new-instance v11, Lq20/n;

    move-object/from16 v16, v20

    invoke-direct/range {v11 .. v17}, Lq20/n;-><init>(Ly00/d5;Ly00/i;Lq20/h;Ly00/u5;Ly00/j5;Lj00/i0;)V

    return-object v11

    :cond_1d
    move-object/from16 v16, v20

    invoke-virtual {v2, v7}, Lv00/c0;->C(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1e

    new-instance v17, Lq20/i;

    iget-object v0, v1, Lu00/f;->a:Ljava/lang/String;

    iget-object v2, v12, Ly00/d5;->P:Ly00/v3;

    iget-object v3, v1, Lu00/f;->c:Lzy/c;

    iget v4, v1, Lu00/f;->d:I

    iget-object v5, v1, Lu00/f;->f:Ljava/lang/String;

    iget-object v1, v1, Lu00/f;->g:Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v23, v1

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move/from16 v21, v4

    move-object/from16 v22, v5

    invoke-direct/range {v17 .. v23}, Lq20/i;-><init>(Ljava/lang/String;Ly00/v3;Lzy/c;ILjava/lang/String;Ljava/lang/String;)V

    return-object v17

    :cond_1e
    invoke-virtual {v2, v7}, Lv00/c0;->y(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1f

    new-instance v3, Lq20/g;

    iget-object v4, v1, Lu00/f;->a:Ljava/lang/String;

    iget-object v5, v12, Ly00/d5;->P:Ly00/v3;

    iget-object v6, v1, Lu00/f;->c:Lzy/c;

    iget-object v7, v1, Lu00/f;->f:Ljava/lang/String;

    iget-object v8, v1, Lu00/f;->g:Ljava/lang/String;

    invoke-direct/range {v3 .. v8}, Lq20/g;-><init>(Ljava/lang/String;Ly00/v3;Lzy/c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_1f
    move-object/from16 v17, v12

    iget-object v12, v1, Lu00/f;->c:Lzy/c;

    iget v13, v1, Lu00/f;->d:I

    iget-object v14, v1, Lu00/f;->e:Ljava/lang/Integer;

    move-object/from16 v19, v15

    iget-object v15, v1, Lu00/f;->f:Ljava/lang/String;

    iget-object v1, v1, Lu00/f;->g:Ljava/lang/String;

    iget-object v0, v0, Lo20/b;->b:Lq20/h;

    new-instance v11, Lq20/o;

    move-object/from16 v18, v0

    move-object/from16 v20, v16

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v20}, Lq20/o;-><init>(Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ly00/d5;Lq20/h;Ly00/u5;Ly00/j5;)V

    return-object v11
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Ly00/c0;ZZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    const-string v0, "onClick"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onMenuButtonClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p9

    check-cast v15, Lp1/q;

    const v0, -0x215738ee

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p10, v0

    invoke-virtual {v15, v3}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {v15, v4}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x800

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {v15, v5}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x4000

    goto :goto_3

    :cond_3
    const/16 v1, 0x2000

    :goto_3
    or-int/2addr v0, v1

    move/from16 v6, p5

    invoke-virtual {v15, v6}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/high16 v1, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v1, 0x10000

    :goto_4
    or-int/2addr v0, v1

    invoke-virtual {v15, v7}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_5

    const/high16 v1, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v1, 0x80000

    :goto_5
    or-int/2addr v0, v1

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/high16 v1, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v1, 0x400000

    :goto_6
    or-int/2addr v0, v1

    invoke-virtual {v15, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/high16 v1, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v1, 0x2000000

    :goto_7
    or-int/2addr v0, v1

    const v1, 0x2492493

    and-int/2addr v1, v0

    const v10, 0x2492492

    if-ne v1, v10, :cond_9

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_9
    :goto_8
    const/4 v1, 0x0

    const/4 v10, 0x6

    move-object/from16 v11, p0

    invoke-static {v11, v3, v1, v8, v10}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v12, 0x8

    int-to-float v12, v12

    const/16 v13, 0x14

    int-to-float v13, v13

    const/16 v19, 0x0

    const/16 v21, 0x4

    move/from16 v20, v12

    move/from16 v18, v12

    move/from16 v17, v13

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    new-instance v13, Lq00/r;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-eqz v1, :cond_a

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_9
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v15, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v15, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    move/from16 v20, v0

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v10, v15, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "wallet_payment_detail_item_radio_button"

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v3, 0xc

    int-to-float v3, v3

    const/16 v25, 0x0

    const/16 v26, 0xb

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v24, v3

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, Lg00/d;->a:Lg00/b;

    const v12, -0x1a6f7841

    invoke-virtual {v15, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v15, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v22, v3

    move-object/from16 v3, v21

    check-cast v3, Lg00/b;

    const/4 v5, 0x0

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    const-string v5, "<this>"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x39b9deb4

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    const v5, -0x22d0cf5

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    iget-boolean v3, v3, Lg00/b;->a:Z

    if-eqz v3, :cond_d

    sget-wide v23, Lg00/a;->c:J

    move-wide/from16 v5, v23

    const/4 v3, 0x0

    goto :goto_a

    :cond_d
    const v3, -0x1a6f7841

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/b;

    const/4 v3, 0x0

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    iget-wide v5, v5, Lg00/b;->f:J

    :goto_a
    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    const v3, -0x1a6f7841

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lg00/b;

    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    move-object/from16 v16, v10

    move-object v8, v11

    iget-wide v10, v3, Lg00/b;->k:J

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v15, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    move-wide/from16 v24, v10

    iget-wide v10, v3, Li2/x;->a:J

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v15, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->i()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    goto :goto_b

    :cond_e
    invoke-static {v10, v11}, Li2/w0;->x(J)F

    :goto_b
    const v3, 0x3ec28f5c    # 0.38f

    invoke-static {v3, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v10

    move/from16 v3, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move-object v4, v8

    move-object v7, v12

    move-object v8, v13

    move-object/from16 v9, v16

    const/16 v23, 0x6

    move-wide v12, v5

    move-object v6, v14

    move-object/from16 v16, v15

    move v5, v3

    move-wide v14, v10

    move-wide/from16 v10, v24

    move/from16 v3, v26

    invoke-static/range {v10 .. v18}, Ls2/e;->p(JJJLandroidx/compose/runtime/Composer;II)Lg1/v1;

    move-result-object v14

    move-object/from16 v15, v16

    const/4 v10, 0x0

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    shr-int/lit8 v25, v20, 0xf

    and-int/lit8 v10, v25, 0xe

    or-int/lit16 v10, v10, 0x1b0

    const/16 v17, 0x18

    const/4 v11, 0x0

    const/4 v13, 0x0

    move/from16 v16, v10

    move-object/from16 v12, v22

    move/from16 v10, p5

    invoke-static/range {v10 .. v17}, Lg1/w4;->a(ZLc93/a;Landroidx/compose/ui/Modifier;ZLg1/v1;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-static {v9, v10, v3, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Lb2/e;->K:Lb2/l;

    sget-object v13, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x30

    invoke-static {v13, v12, v15, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_f

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_f
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v15, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    invoke-static {v13, v15, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v15, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p4, :cond_12

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_12
    const/high16 v0, 0x3f000000    # 0.5f

    :goto_d
    invoke-static {v0, v9}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shl-int/lit8 v1, v20, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v1, v23, v1

    invoke-static {v0, v2, v15, v1}, Lse/a;->j(Landroidx/compose/ui/Modifier;Ly00/c0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Ly00/c0;->h()Z

    move-result v10

    move-object/from16 v16, v15

    sget-object v15, Lq00/j;->a:Lx1/b;

    const v17, 0x180006

    const/16 v18, 0x1e

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v0, 0x1

    invoke-static/range {v10 .. v18}, Landroidx/compose/animation/b;->g(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v16

    instance-of v1, v2, Ly00/a0;

    if-eqz v1, :cond_13

    move-object v1, v2

    check-cast v1, Ly00/a0;

    goto :goto_e

    :cond_13
    const/4 v1, 0x0

    :goto_e
    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ly00/a0;->k()Z

    move-result v1

    if-ne v1, v0, :cond_14

    move v1, v0

    goto :goto_f

    :cond_14
    const/4 v1, 0x0

    :goto_f
    const v4, 0x36e1f1dd

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    if-eqz v1, :cond_15

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v15, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v1, 0x7f08084a

    const/4 v8, 0x0

    invoke-static {v1, v15, v8}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v10

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const v3, -0x1a6f7841

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    iget-wide v13, v1, Lg00/b;->z:J

    const/16 v16, 0x1b0

    const/16 v17, 0x0

    const/4 v11, 0x0

    invoke-static/range {v10 .. v17}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_10

    :cond_15
    const/4 v8, 0x0

    :goto_10
    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    shr-int/lit8 v1, v20, 0x9

    and-int/lit8 v1, v1, 0xe

    and-int/lit8 v3, v25, 0x70

    or-int/2addr v1, v3

    shr-int/lit8 v3, v20, 0x12

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v1, v3

    move/from16 v4, p3

    move/from16 v7, p6

    move-object/from16 v9, p8

    invoke-static {v4, v7, v9, v15, v1}, Lse/a;->h(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const v1, -0x58ce376a

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    if-nez p4, :cond_16

    const v1, 0x7f14111f

    invoke-static {v15, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lh00/d;->a:Lh00/d;

    move-object/from16 v16, v15

    const/16 v15, 0x180

    move-object/from16 v14, v16

    const/16 v16, 0xa

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v16}, Lkotlin/jvm/internal/j;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ls2/e;Ll0/i;Landroidx/compose/runtime/Composer;II)V

    move-object v15, v14

    :cond_16
    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_17

    new-instance v0, Lq00/q;

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lq00/q;-><init>(Landroidx/compose/ui/Modifier;Ly00/c0;ZZZZZLc93/a;Lc93/a;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final k0(Ln0/n;)I
    .locals 5

    iget-object v0, p0, Ln0/n;->k:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/g;

    check-cast v4, Ln0/o;

    iget v4, v4, Ln0/o;->p:I

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/2addr v3, v0

    iget p0, p0, Ln0/n;->q:I

    add-int/2addr v3, p0

    return v3
.end method

.method public static final l(Lx1/b;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, p3

    move/from16 v3, p5

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v5, -0x318def45

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v3, 0x6

    sget-object v6, Ll0/t1;->a:Ll0/t1;

    if-nez v5, :cond_1

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    goto :goto_4

    :cond_5
    move-object/from16 v7, p1

    :goto_4
    and-int/lit16 v8, v3, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v5, v8

    :cond_7
    and-int/lit16 v8, v3, 0x6000

    if-nez v8, :cond_9

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_6

    :cond_8
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v5, v8

    :cond_9
    and-int/lit16 v8, v5, 0x2493

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_b

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_b
    :goto_7
    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    invoke-virtual {v6, v0, v9, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v10, 0xc

    int-to-float v10, v10

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/16 v11, 0x36

    invoke-static {v10, v8, v4, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v4, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v4, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v4, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-nez v14, :cond_d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_e

    :cond_d
    invoke-static {v10, v4, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v4, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0x18

    int-to-float v6, v6

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, Lb2/e;->w:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v15, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    move-object/from16 v16, v10

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-eqz v3, :cond_f

    invoke-virtual {v4, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v4, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_b

    :cond_10
    :goto_a
    move-object/from16 v3, v16

    goto :goto_c

    :cond_11
    :goto_b
    invoke-static {v9, v4, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v6, v5, 0x3

    and-int/lit8 v6, v6, 0xe

    const/4 v9, 0x1

    invoke-static {v6, v1, v4, v9}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v6, v10, v4, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_12

    invoke-virtual {v4, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v9, v4, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v4, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v3

    iget-wide v8, v3, Lg00/b;->m:J

    invoke-static {v4}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v3

    iget-object v3, v3, Lg00/e;->c:Ll3/v0;

    shr-int/lit8 v6, v5, 0x6

    and-int/lit8 v26, v6, 0xe

    const/16 v27, 0xc30

    const v28, 0xd7fa

    move v6, v5

    const/4 v5, 0x0

    move v10, v6

    move-wide v6, v8

    const-wide/16 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x2

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x1

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    move-object/from16 v24, v3

    move/from16 v3, v25

    move-object/from16 v25, v4

    const/16 v29, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v25

    const v5, -0x5a01b9c3

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_15

    invoke-static {v4}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v5

    iget-wide v5, v5, Lg00/b;->o:J

    invoke-static {v4}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v7

    iget-object v7, v7, Lg00/e;->d:Ll3/v0;

    shr-int/lit8 v3, v3, 0x9

    and-int/lit8 v24, v3, 0xe

    const/16 v25, 0x0

    const v26, 0xfffa

    const/4 v3, 0x0

    move-object/from16 v23, v4

    move-wide v4, v5

    move-object/from16 v22, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v0, v29

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v23

    :goto_e
    const/4 v9, 0x1

    goto :goto_f

    :cond_15
    move/from16 v0, v29

    goto :goto_e

    :goto_f
    invoke-static {v4, v0, v9, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_10
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lot1/a;

    const/16 v7, 0x18

    const/4 v2, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lot1/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static l0(Lbi/s;Lne3/h0;)V
    .locals 5

    iget v0, p0, Lbi/s;->a:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lne3/h0;->h0(J)Lne3/i;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-wide v1, p0, Lbi/s;->b:J

    invoke-virtual {p1, v1, v2}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-wide v1, p0, Lbi/s;->c:J

    invoke-virtual {p1, v1, v2}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object p0, p0, Lbi/s;->d:Lbi/q;

    iget-object p0, p0, Lbi/q;->a:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    int-to-long v1, v2

    invoke-virtual {p1, v1, v2}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const-string v4, ":"

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-interface {p1, v3}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    invoke-interface {p1, v0}, Lne3/i;->writeByte(I)Lne3/i;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static final m(ZZZLc93/a;Ll0/l1;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v0, p5

    move/from16 v8, p8

    sget-object v3, Ll0/m;->c:Ll0/g;

    const-string v5, "onClick"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "modifier"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    const v5, 0x3beb78d0

    invoke-virtual {v9, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v8, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v8

    goto :goto_1

    :cond_1
    move v5, v8

    :goto_1
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_4

    or-int/lit16 v5, v5, 0x80

    :cond_4
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_6

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x800

    goto :goto_3

    :cond_5
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v8, 0x6000

    if-nez v6, :cond_8

    move-object/from16 v6, p4

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x4000

    goto :goto_4

    :cond_7
    const/16 v7, 0x2000

    :goto_4
    or-int/2addr v5, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p4

    :goto_5
    const/high16 v7, 0x30000

    and-int/2addr v7, v8

    if-nez v7, :cond_a

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    const/high16 v3, 0x20000

    goto :goto_6

    :cond_9
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v5, v3

    :cond_a
    const/high16 v3, 0x180000

    and-int/2addr v3, v8

    if-nez v3, :cond_c

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const/high16 v3, 0x100000

    goto :goto_7

    :cond_b
    const/high16 v3, 0x80000

    :goto_7
    or-int/2addr v5, v3

    :cond_c
    const/high16 v3, 0xc00000

    and-int/2addr v3, v8

    move-object/from16 v7, p6

    if-nez v3, :cond_e

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/high16 v3, 0x800000

    goto :goto_8

    :cond_d
    const/high16 v3, 0x400000

    :goto_8
    or-int/2addr v5, v3

    :cond_e
    const v3, 0x492493

    and-int/2addr v3, v5

    const v10, 0x492492

    if-ne v3, v10, :cond_10

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_9

    :cond_f
    invoke-virtual {v9}, Lp1/q;->X()V

    move/from16 v3, p2

    move-object/from16 v16, v9

    goto/16 :goto_e

    :cond_10
    :goto_9
    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v3, v8, 0x1

    if-eqz v3, :cond_12

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit16 v3, v5, -0x381

    move v5, v3

    move/from16 v3, p2

    goto :goto_b

    :cond_12
    :goto_a
    and-int/lit16 v3, v5, -0x381

    move v5, v3

    move v3, v1

    :goto_b
    invoke-virtual {v9}, Lp1/q;->r()V

    if-eqz v1, :cond_13

    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_13
    const v10, 0x3f19999a    # 0.6f

    :goto_c
    invoke-static {v10, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v9}, Lg1/l3;->b(Landroidx/compose/runtime/Composer;)Lg1/l5;

    move-result-object v11

    iget-object v11, v11, Lg1/l5;->b:Lt0/i;

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v12

    iget-wide v12, v12, Ld40/n;->a:J

    and-int/lit8 v5, v5, 0x70

    invoke-static {v2, v9, v5}, Ld40/r;->d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v14

    if-eqz v2, :cond_14

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    goto :goto_d

    :cond_14
    const/4 v0, 0x0

    int-to-float v0, v0

    :goto_d
    new-instance v2, Lb30/s4;

    move-object v5, v4

    move v4, v3

    move/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lb30/s4;-><init>(ZZLc93/a;Ll0/l1;Lx1/b;)V

    const v1, 0x2c531533    # 2.9996671E-12f

    invoke-static {v1, v9, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0x180000

    const/16 v18, 0x8

    move-object/from16 v16, v9

    move-object v9, v10

    move-object v10, v11

    move-wide v11, v12

    move-object v13, v14

    move v14, v0

    invoke-static/range {v9 .. v18}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move v3, v4

    :goto_e
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_15

    new-instance v0, Lb30/r4;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v8}, Lb30/r4;-><init>(ZZZLc93/a;Ll0/l1;Landroidx/compose/ui/Modifier;Lx1/b;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static m0(Landroid/os/Looper;)Landroid/os/Looper;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    const-string v0, "Can\'t create handler inside thread that has not called Looper.prepare()"

    invoke-static {v0, p0}, Luo/w;->h(Ljava/lang/String;Z)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lh20/l;ZZLandroidx/compose/ui/Modifier;Lh20/g1;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    move/from16 v8, p8

    const-string v2, "displayableSavedPaymentMethod"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lh20/l;->b:Ly00/o4;

    move-object/from16 v3, p7

    check-cast v3, Lp1/q;

    const v4, 0x7fb21814

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_1
    move v4, v8

    :goto_1
    and-int/lit8 v5, v8, 0x30

    move/from16 v9, p1

    if-nez v5, :cond_3

    invoke-virtual {v3, v9}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v8, 0x180

    move/from16 v10, p2

    if-nez v5, :cond_5

    invoke-virtual {v3, v10}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0xc00

    :cond_6
    move-object/from16 v6, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_4

    :cond_8
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    :goto_5
    and-int/lit16 v7, v8, 0x6000

    if-nez v7, :cond_b

    and-int/lit8 v7, p9, 0x10

    if-nez v7, :cond_a

    const v7, 0x8000

    and-int/2addr v7, v8

    if-nez v7, :cond_9

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_6

    :cond_9
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_6
    if-eqz v7, :cond_a

    const/16 v7, 0x4000

    goto :goto_7

    :cond_a
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v4, v7

    :cond_b
    and-int/lit8 v7, p9, 0x20

    const/high16 v11, 0x30000

    if-eqz v7, :cond_d

    or-int/2addr v4, v11

    :cond_c
    move-object/from16 v11, p5

    goto :goto_9

    :cond_d
    and-int/2addr v11, v8

    if-nez v11, :cond_c

    move-object/from16 v11, p5

    invoke-virtual {v3, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v4, v12

    :goto_9
    and-int/lit8 v12, p9, 0x40

    const/high16 v13, 0x180000

    if-eqz v12, :cond_10

    or-int/2addr v4, v13

    :cond_f
    move-object/from16 v13, p6

    goto :goto_b

    :cond_10
    and-int/2addr v13, v8

    if-nez v13, :cond_f

    move-object/from16 v13, p6

    invoke-virtual {v3, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x100000

    goto :goto_a

    :cond_11
    const/high16 v14, 0x80000

    :goto_a
    or-int/2addr v4, v14

    :goto_b
    const v14, 0x92493

    and-int/2addr v14, v4

    const v15, 0x92492

    if-ne v14, v15, :cond_13

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v5, v0

    move-object/from16 v22, v3

    move-object v4, v6

    move-object v6, v11

    move-object v7, v13

    goto/16 :goto_14

    :cond_13
    :goto_c
    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v14, v8, 0x1

    const/16 v16, 0x0

    const p7, -0xe001

    const/4 v15, 0x0

    if-eqz v14, :cond_16

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_15

    and-int v4, v4, p7

    :cond_15
    move-object/from16 v20, v0

    move-object/from16 v17, v11

    move-object/from16 v21, v13

    goto :goto_e

    :cond_16
    :goto_d
    if-eqz v5, :cond_17

    sget-object v5, Lb2/t;->w:Lb2/t;

    move-object v6, v5

    :cond_17
    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_18

    new-instance v0, Lh20/g1;

    sget-object v5, Lh20/e1;->y:Lh20/e1;

    invoke-direct {v0, v5}, Lh20/g1;-><init>(Lh20/f1;)V

    and-int v4, v4, p7

    :cond_18
    if-eqz v7, :cond_1a

    const v5, 0x18ef283b

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_19

    new-instance v5, Lou1/a;

    const/4 v7, 0x7

    invoke-direct {v5, v7}, Lou1/a;-><init>(I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v5, Lc93/a;

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    move-object v11, v5

    :cond_1a
    if-eqz v12, :cond_15

    move-object/from16 v20, v0

    move-object/from16 v17, v11

    move-object/from16 v21, v16

    :goto_e
    invoke-virtual {v3}, Lp1/q;->r()V

    invoke-virtual {v1}, Lh20/l;->c()Lzy/c;

    move-result-object v0

    invoke-static {v0, v3}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/j;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const/4 v0, 0x1

    invoke-static {v2, v0}, Ldp/d;->I(Ly00/o4;Z)Lzy/c;

    move-result-object v5

    if-nez v5, :cond_1b

    iget-object v5, v1, Lh20/l;->a:Lzy/c;

    :cond_1b
    iget-object v7, v2, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v5, v3}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v14

    iget-object v5, v2, Ly00/o4;->R:Ly00/s2;

    if-eqz v5, :cond_1c

    invoke-static {v5}, Lse/b;->I(Ly00/s2;)Lzy/d;

    move-result-object v0

    goto :goto_12

    :cond_1c
    iget-boolean v5, v2, Ly00/o4;->S:Z

    if-eqz v5, :cond_1e

    iget-object v5, v2, Ly00/o4;->E:Ly00/f4;

    if-nez v5, :cond_1d

    const/4 v5, -0x1

    goto :goto_f

    :cond_1d
    sget-object v11, Lb30/o2;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v11, v5

    :goto_f
    if-eq v5, v0, :cond_21

    const/4 v0, 0x3

    if-eq v5, v0, :cond_1f

    :cond_1e
    move-object/from16 v0, v16

    goto :goto_12

    :cond_1f
    iget-object v0, v2, Ly00/o4;->Q:Ly00/l4;

    if-eqz v0, :cond_20

    iget-object v0, v0, Ly00/l4;->E:Ljava/lang/String;

    goto :goto_10

    :cond_20
    move-object/from16 v0, v16

    :goto_10
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lm83/y;->w:Lm83/y;

    const v5, 0x7f1410a8

    invoke-static {v5, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    goto :goto_12

    :cond_21
    iget-object v0, v2, Ly00/o4;->H:Ly00/z3;

    if-eqz v0, :cond_22

    iget-object v0, v0, Ly00/z3;->H:Ljava/lang/String;

    goto :goto_11

    :cond_22
    move-object/from16 v0, v16

    :goto_11
    invoke-static {v0}, Ldp/d;->w(Ljava/lang/String;)Lzy/b;

    move-result-object v0

    :goto_12
    const v2, 0x18efc1e2

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    if-nez v0, :cond_23

    goto :goto_13

    :cond_23
    invoke-static {v0, v3}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v16

    :goto_13
    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "saved_payment_method_row_button_"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    iget-boolean v12, v1, Lh20/l;->e:Z

    new-instance v0, Lb30/o4;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v2, 0x48c4132

    invoke-static {v2, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v2, v0, 0xe

    const v5, 0xc06000

    or-int/2addr v2, v5

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v2

    shl-int/lit8 v2, v4, 0x9

    const/high16 v5, 0xe000000

    and-int/2addr v2, v5

    or-int v23, v0, v2

    shr-int/lit8 v0, v4, 0x9

    and-int/lit8 v0, v0, 0x70

    shr-int/lit8 v2, v4, 0xc

    and-int/lit16 v2, v2, 0x380

    or-int v24, v0, v2

    const/16 v25, 0x4

    const/4 v11, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0x0

    move-object/from16 v22, v3

    invoke-static/range {v9 .. v25}, Lkotlin/jvm/internal/j;->f(ZZZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lh20/g1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v4, v6

    move-object/from16 v6, v17

    move-object/from16 v5, v20

    move-object/from16 v7, v21

    :goto_14
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_24

    new-instance v0, Lb30/w3;

    const/4 v10, 0x1

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lb30/w3;-><init>(Ljava/lang/Object;ZZLandroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/a;Ll83/e;III)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method public static final o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object/from16 v14, p5

    check-cast v14, Lp1/q;

    const v0, -0x1b57384b

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v6, 0x180

    if-nez v4, :cond_4

    move-object/from16 v4, p2

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move/from16 v7, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    move/from16 v7, p3

    invoke-virtual {v14, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_5

    :cond_9
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit16 v8, v6, 0x6000

    move-object/from16 v13, p4

    if-nez v8, :cond_b

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x4000

    goto :goto_7

    :cond_a
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v0, v8

    :cond_b
    and-int/lit16 v8, v0, 0x2493

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_d

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v4

    move v4, v7

    goto/16 :goto_c

    :cond_d
    :goto_8
    if-eqz v3, :cond_e

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_e
    move-object v3, v4

    :goto_9
    const/4 v4, 0x0

    if-eqz v5, :cond_f

    move v9, v4

    goto :goto_a

    :cond_f
    move v9, v7

    :goto_a
    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v7, v14, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_10

    invoke-virtual {v14, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_b
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v14, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_11
    invoke-static {v7, v14, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v5, v0, 0xe

    invoke-static {v1, v14, v5}, Lse/a;->q(Lzy/c;Landroidx/compose/runtime/Composer;I)V

    shr-int/lit8 v5, v0, 0x3

    and-int/lit16 v7, v5, 0x380

    const/high16 v8, 0x70000

    shl-int/lit8 v0, v0, 0x3

    and-int/2addr v0, v8

    or-int v15, v7, v0

    const/16 v16, 0x1b

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v16}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    const v0, 0x239599f7

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_13

    and-int/lit8 v0, v5, 0xe

    const/4 v5, 0x0

    invoke-static {v2, v5, v14, v0}, Lse/a;->r(Lg40/h1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_13
    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move v4, v9

    :goto_c
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v0, Lbf0/g;

    const/16 v8, 0xd

    move-object/from16 v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move/from16 v8, p8

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, -0x7c0ec2f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p9, 0x2

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v4, p1

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_a

    and-int/lit8 v7, p9, 0x8

    move-wide/from16 v9, p3

    if-nez v7, :cond_9

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_6

    :cond_9
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v3, v7

    goto :goto_7

    :cond_a
    move-wide/from16 v9, p3

    :goto_7
    and-int/lit16 v7, v8, 0x6000

    if-nez v7, :cond_d

    and-int/lit8 v7, p9, 0x10

    if-nez v7, :cond_b

    move-object/from16 v7, p5

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x4000

    goto :goto_8

    :cond_b
    move-object/from16 v7, p5

    :cond_c
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v3, v11

    goto :goto_9

    :cond_d
    move-object/from16 v7, p5

    :goto_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v8

    if-nez v11, :cond_f

    move-object/from16 v11, p6

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v12, 0x10000

    :goto_a
    or-int/2addr v3, v12

    goto :goto_b

    :cond_f
    move-object/from16 v11, p6

    :goto_b
    const v12, 0x12493

    and-int/2addr v12, v3

    const v13, 0x12492

    if-ne v12, v13, :cond_11

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v12

    if-nez v12, :cond_10

    goto :goto_d

    :cond_10
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v16, v0

    move-object v1, v2

    move-object v2, v4

    move-wide v4, v9

    :goto_c
    move v3, v6

    move-object v6, v7

    goto/16 :goto_15

    :cond_11
    :goto_d
    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v12, v8, 0x1

    const v13, -0xe001

    const/4 v14, 0x0

    if-eqz v12, :cond_16

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_12

    goto :goto_e

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p9, 0x2

    if-eqz v1, :cond_13

    and-int/lit8 v3, v3, -0x71

    :cond_13
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_14

    and-int/lit16 v3, v3, -0x1c01

    :cond_14
    and-int/lit8 v1, p9, 0x10

    if-eqz v1, :cond_15

    and-int/2addr v3, v13

    :cond_15
    move-wide v11, v9

    move-object v9, v2

    move-object v10, v4

    goto :goto_11

    :cond_16
    :goto_e
    if-eqz v1, :cond_17

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_f

    :cond_17
    move-object v1, v2

    :goto_f
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_18

    sget-object v2, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/l5;

    iget-object v2, v2, Lg1/l5;->b:Lt0/i;

    and-int/lit8 v3, v3, -0x71

    goto :goto_10

    :cond_18
    move-object v2, v4

    :goto_10
    if-eqz v5, :cond_19

    move v6, v14

    :cond_19
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_1a

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v4, v4, Ld40/n;->a:J

    and-int/lit16 v3, v3, -0x1c01

    move-wide v9, v4

    :cond_1a
    and-int/lit8 v4, p9, 0x10

    if-eqz v4, :cond_1b

    shr-int/lit8 v4, v3, 0x3

    and-int/lit8 v4, v4, 0x70

    invoke-static {v6, v0, v4}, Ld40/r;->d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v4

    and-int/2addr v3, v13

    move-object v7, v4

    :cond_1b
    move-wide v11, v9

    move-object v9, v1

    move-object v10, v2

    :goto_11
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v1, Ld40/r;->i:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld40/m;

    if-eqz v6, :cond_1c

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v4

    :goto_12
    move v14, v2

    goto :goto_13

    :cond_1c
    int-to-float v2, v14

    goto :goto_12

    :goto_13
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_1e

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1d

    const/4 v2, 0x0

    move-object v13, v2

    goto :goto_14

    :cond_1d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1e
    move-object v13, v7

    :goto_14
    new-instance v2, Lb1/d;

    const/4 v4, 0x2

    move-object/from16 p4, p6

    move-object/from16 p1, v1

    move-object/from16 p0, v2

    move/from16 p5, v4

    move-object/from16 p2, v7

    move-object/from16 p3, v10

    invoke-direct/range {p0 .. p5}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx1/b;I)V

    move-object/from16 v1, p0

    const v2, 0x4b081c74    # 8920180.0f

    invoke-static {v2, v0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    and-int/lit8 v1, v3, 0xe

    const/high16 v2, 0x180000

    or-int/2addr v1, v2

    and-int/lit8 v2, v3, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v3, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int v17, v1, v2

    const/16 v18, 0x8

    move-object/from16 v16, v0

    invoke-static/range {v9 .. v18}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v9

    move-object v2, v10

    move-wide v4, v11

    goto/16 :goto_c

    :goto_15
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v0, Lb21/b;

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb21/b;-><init>(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method public static final q(Lzy/c;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v3, p1

    check-cast v3, Lp1/q;

    const p1, 0x44a2b18d

    invoke-virtual {v3, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_3

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    if-nez p0, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {p0, v3}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    const/16 p1, 0x8

    int-to-float v8, p1

    const/4 v9, 0x7

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const v1, 0x6cacddc5

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_5

    new-instance v1, Lg40/y1;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lg40/y1;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Ld71/c;

    const/16 v1, 0xb

    invoke-direct {v0, p0, p2, v1}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final r(Lg40/h1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p3

    const-string v2, "validationMessage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, 0x1f6ae20

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    or-int/lit8 v3, v3, 0x30

    and-int/lit8 v3, v3, 0x13

    const/16 v5, 0x12

    if-ne v3, v5, :cond_3

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v24, v2

    move-object/from16 v2, p1

    goto :goto_3

    :cond_3
    :goto_2
    invoke-interface {v0}, Lg40/h1;->b()Lzy/b;

    move-result-object v3

    invoke-static {v3, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    invoke-virtual {v5}, Lg1/c1;->c()J

    move-result-wide v5

    sget-object v7, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v2, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/h9;

    iget-object v7, v7, Lg1/h9;->f:Ll3/v0;

    int-to-float v10, v4

    const/4 v12, 0x0

    const/16 v13, 0xd

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v28, v8

    const v8, 0x7244bf3b

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_4

    new-instance v8, Lg40/y1;

    const/4 v9, 0x4

    invoke-direct {v8, v9}, Lg40/y1;-><init>(I)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    const/4 v9, 0x1

    invoke-static {v4, v9, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v26, 0x0

    const v27, 0xfff8

    move-object/from16 v23, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v28

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_5

    new-instance v4, Lf01/b;

    const/16 v5, 0x9

    invoke-direct {v4, v0, v2, v1, v5}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final s(Ljava/util/List;Lbc3/i0;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, La30/x0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, La30/x0;

    iget v1, v0, La30/x0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La30/x0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, La30/x0;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, La30/x0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La30/x0;->y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, La30/x0;->w:Ljava/util/List;

    check-cast p0, Ljava/util/List;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_3

    goto :goto_4

    :cond_3
    if-eqz p1, :cond_5

    move-object p2, p0

    check-cast p2, Ljava/util/List;

    iput-object p2, v0, La30/x0;->w:Ljava/util/List;

    iput v3, v0, La30/x0;->y:I

    invoke-interface {p1, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p4, Lq20/j0;

    goto :goto_2

    :cond_5
    move-object p4, v4

    :goto_2
    instance-of p1, p4, Lq20/i0;

    if-eqz p1, :cond_6

    check-cast p4, Lq20/i0;

    goto :goto_3

    :cond_6
    move-object p4, v4

    :goto_3
    if-eqz p4, :cond_7

    iget-object p3, p4, Lq20/i0;->w:Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object p3, v4

    :goto_4
    move-object p1, p0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v0, p4

    check-cast v0, Ly00/o4;

    iget-object v0, v0, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object v4, p4

    :cond_9
    check-cast v4, Ly00/o4;

    if-eqz v4, :cond_a

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p1, v4}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    :cond_a
    return-object p0
.end method

.method public static final t(Llb3/y;)Llb3/c0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    instance-of v1, v0, Llb3/c0;

    if-eqz v1, :cond_0

    check-cast v0, Llb3/c0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "This is should be simple type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static u(Lf9/m;Ljava/lang/String;Lf9/j;I)Lz8/g;
    .locals 12

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iget-object v0, p2, Lf9/j;->c:Ljava/lang/String;

    invoke-static {p1, v0}, Lx8/a;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-wide v6, p2, Lf9/j;->a:J

    iget-wide v8, p2, Lf9/j;->b:J

    invoke-virtual {p0}, Lf9/m;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    :goto_0
    move-object v10, p1

    goto :goto_1

    :cond_0
    iget-object p0, p0, Lf9/m;->x:Lzr/g0;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf9/b;

    iget-object p0, p0, Lf9/b;->a:Ljava/lang/String;

    iget-object p1, p2, Lf9/j;->c:Ljava/lang/String;

    invoke-static {p0, p1}, Lx8/a;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_1
    const-string p0, "The uri must be set."

    invoke-static {v2, p0}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz8/g;

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-object v5, Lzr/b1;->G:Lzr/b1;

    move v11, p3

    invoke-direct/range {v1 .. v11}, Lz8/g;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    return-object v1
.end method

.method public static v([B[B)[B
    .locals 59

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/16 v3, 0x20

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    invoke-static {v2, v0}, Lse/a;->R(I[B)J

    move-result-wide v4

    const-wide/32 v6, 0x3ffffff

    and-long/2addr v4, v6

    const/4 v8, 0x3

    invoke-static {v8, v0}, Lse/a;->R(I[B)J

    move-result-wide v9

    const/4 v11, 0x2

    shr-long/2addr v9, v11

    const-wide/32 v12, 0x3ffff03

    and-long/2addr v9, v12

    const/4 v12, 0x6

    invoke-static {v12, v0}, Lse/a;->R(I[B)J

    move-result-wide v13

    const/4 v15, 0x4

    shr-long/2addr v13, v15

    const-wide/32 v16, 0x3ffc0ff

    and-long v13, v13, v16

    move/from16 v16, v3

    const/16 v3, 0x9

    invoke-static {v3, v0}, Lse/a;->R(I[B)J

    move-result-wide v17

    shr-long v17, v17, v12

    const-wide/32 v19, 0x3f03fff

    and-long v17, v17, v19

    move-wide/from16 v19, v6

    const/16 v6, 0xc

    invoke-static {v6, v0}, Lse/a;->R(I[B)J

    move-result-wide v21

    const/16 v7, 0x8

    shr-long v21, v21, v7

    const-wide/32 v23, 0xfffff

    and-long v21, v21, v23

    const-wide/16 v23, 0x5

    mul-long v25, v9, v23

    mul-long v27, v13, v23

    mul-long v29, v17, v23

    mul-long v31, v21, v23

    move/from16 v33, v11

    const/16 v11, 0x11

    move/from16 v34, v7

    new-array v7, v11, [B

    const-wide/16 v35, 0x0

    move/from16 v45, v15

    move-wide/from16 v37, v35

    move-wide/from16 v39, v37

    move-wide/from16 v41, v39

    move-wide/from16 v43, v41

    move v15, v2

    :goto_0
    array-length v6, v1

    const/16 v47, 0x18

    const/16 v3, 0x10

    const/16 v48, 0x1a

    if-ge v15, v6, :cond_1

    array-length v6, v1

    sub-int/2addr v6, v15

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v1, v15, v7, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v49, 0x1

    aput-byte v49, v7, v6

    if-eq v6, v3, :cond_0

    add-int/lit8 v6, v6, 0x1

    invoke-static {v7, v6, v11, v2}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_0
    invoke-static {v2, v7}, Lse/a;->R(I[B)J

    move-result-wide v49

    and-long v49, v49, v19

    add-long v43, v43, v49

    invoke-static {v8, v7}, Lse/a;->R(I[B)J

    move-result-wide v49

    shr-long v49, v49, v33

    and-long v49, v49, v19

    add-long v35, v35, v49

    invoke-static {v12, v7}, Lse/a;->R(I[B)J

    move-result-wide v49

    shr-long v49, v49, v45

    and-long v49, v49, v19

    add-long v37, v37, v49

    const/16 v6, 0x9

    invoke-static {v6, v7}, Lse/a;->R(I[B)J

    move-result-wide v49

    shr-long v49, v49, v12

    and-long v49, v49, v19

    add-long v39, v39, v49

    const/16 v6, 0xc

    invoke-static {v6, v7}, Lse/a;->R(I[B)J

    move-result-wide v49

    shr-long v49, v49, v34

    and-long v49, v49, v19

    aget-byte v3, v7, v3

    shl-int/lit8 v3, v3, 0x18

    move-wide/from16 v51, v9

    int-to-long v8, v3

    or-long v8, v49, v8

    add-long v41, v41, v8

    mul-long v8, v43, v4

    mul-long v49, v35, v31

    add-long v49, v49, v8

    mul-long v8, v37, v29

    add-long v8, v8, v49

    mul-long v49, v39, v27

    add-long v49, v49, v8

    mul-long v8, v41, v25

    add-long v8, v8, v49

    mul-long v49, v43, v51

    mul-long v53, v35, v4

    add-long v53, v53, v49

    mul-long v49, v37, v31

    add-long v49, v49, v53

    mul-long v53, v39, v29

    add-long v53, v53, v49

    mul-long v49, v41, v27

    add-long v49, v49, v53

    mul-long v53, v43, v13

    mul-long v55, v35, v51

    add-long v55, v55, v53

    mul-long v53, v37, v4

    add-long v53, v53, v55

    mul-long v55, v39, v31

    add-long v55, v55, v53

    mul-long v53, v41, v29

    add-long v53, v53, v55

    mul-long v55, v43, v17

    mul-long v57, v35, v13

    add-long v57, v57, v55

    mul-long v55, v37, v51

    add-long v55, v55, v57

    mul-long v57, v39, v4

    add-long v57, v57, v55

    mul-long v55, v41, v31

    add-long v55, v55, v57

    mul-long v43, v43, v21

    mul-long v35, v35, v17

    add-long v35, v35, v43

    mul-long v37, v37, v13

    add-long v37, v37, v35

    mul-long v39, v39, v51

    add-long v39, v39, v37

    mul-long v41, v41, v4

    add-long v41, v41, v39

    shr-long v35, v8, v48

    and-long v8, v8, v19

    add-long v49, v49, v35

    shr-long v35, v49, v48

    and-long v37, v49, v19

    add-long v53, v53, v35

    shr-long v35, v53, v48

    and-long v39, v53, v19

    add-long v55, v55, v35

    shr-long v35, v55, v48

    and-long v43, v55, v19

    add-long v41, v41, v35

    shr-long v35, v41, v48

    and-long v41, v41, v19

    mul-long v35, v35, v23

    add-long v35, v35, v8

    shr-long v8, v35, v48

    and-long v35, v35, v19

    add-long v8, v37, v8

    add-int/lit8 v15, v15, 0x10

    move-wide/from16 v37, v39

    move-wide/from16 v39, v43

    const/16 v3, 0x9

    move-wide/from16 v43, v35

    move-wide/from16 v35, v8

    move-wide/from16 v9, v51

    const/4 v8, 0x3

    goto/16 :goto_0

    :cond_1
    shr-long v4, v35, v48

    and-long v6, v35, v19

    add-long v37, v37, v4

    shr-long v4, v37, v48

    and-long v8, v37, v19

    add-long v39, v39, v4

    shr-long v4, v39, v48

    and-long v10, v39, v19

    add-long v41, v41, v4

    shr-long v4, v41, v48

    and-long v13, v41, v19

    mul-long v4, v4, v23

    add-long v4, v4, v43

    shr-long v17, v4, v48

    and-long v4, v4, v19

    add-long v6, v6, v17

    add-long v23, v4, v23

    shr-long v17, v23, v48

    and-long v21, v23, v19

    add-long v17, v6, v17

    shr-long v23, v17, v48

    and-long v17, v17, v19

    add-long v23, v8, v23

    shr-long v25, v23, v48

    and-long v23, v23, v19

    add-long v25, v10, v25

    shr-long v27, v25, v48

    and-long v19, v25, v19

    add-long v27, v13, v27

    const-wide/32 v25, 0x4000000

    sub-long v27, v27, v25

    const/16 v1, 0x3f

    move v15, v12

    move-wide/from16 v25, v13

    shr-long v12, v27, v1

    and-long/2addr v4, v12

    and-long/2addr v6, v12

    and-long/2addr v8, v12

    and-long/2addr v10, v12

    and-long v25, v25, v12

    not-long v12, v12

    and-long v21, v21, v12

    or-long v4, v4, v21

    and-long v17, v17, v12

    or-long v6, v6, v17

    and-long v17, v23, v12

    or-long v8, v8, v17

    and-long v17, v19, v12

    or-long v10, v10, v17

    and-long v12, v27, v12

    or-long v12, v25, v12

    shl-long v17, v6, v48

    or-long v4, v4, v17

    const-wide v17, 0xffffffffL

    and-long v4, v4, v17

    shr-long/2addr v6, v15

    const/16 v1, 0x14

    shl-long v14, v8, v1

    or-long/2addr v6, v14

    and-long v6, v6, v17

    const/16 v46, 0xc

    shr-long v8, v8, v46

    const/16 v14, 0xe

    shl-long v14, v10, v14

    or-long/2addr v8, v14

    and-long v8, v8, v17

    const/16 v14, 0x12

    shr-long/2addr v10, v14

    shl-long v12, v12, v34

    or-long/2addr v10, v12

    and-long v10, v10, v17

    invoke-static {v3, v0}, Lse/a;->R(I[B)J

    move-result-wide v12

    add-long/2addr v12, v4

    and-long v4, v12, v17

    invoke-static {v1, v0}, Lse/a;->R(I[B)J

    move-result-wide v14

    add-long/2addr v14, v6

    shr-long v6, v12, v16

    add-long/2addr v14, v6

    and-long v6, v14, v17

    move/from16 v1, v47

    invoke-static {v1, v0}, Lse/a;->R(I[B)J

    move-result-wide v12

    add-long/2addr v12, v8

    shr-long v8, v14, v16

    add-long/2addr v12, v8

    and-long v8, v12, v17

    const/16 v1, 0x1c

    invoke-static {v1, v0}, Lse/a;->R(I[B)J

    move-result-wide v0

    add-long/2addr v0, v10

    shr-long v10, v12, v16

    add-long/2addr v0, v10

    and-long v0, v0, v17

    new-array v3, v3, [B

    invoke-static {v2, v4, v5, v3}, Lse/a;->e0(IJ[B)V

    move/from16 v2, v45

    invoke-static {v2, v6, v7, v3}, Lse/a;->e0(IJ[B)V

    move/from16 v2, v34

    invoke-static {v2, v8, v9, v3}, Lse/a;->e0(IJ[B)V

    const/16 v6, 0xc

    invoke-static {v6, v0, v1, v3}, Lse/a;->e0(IJ[B)V

    return-object v3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The key length in bytes must be 32."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final w(Lio/ktor/utils/io/q;Lio/ktor/utils/io/m;La1/h;)Ljava/lang/Object;
    .locals 3

    if-eq p0, p1, :cond_1

    instance-of v0, p0, Lio/ktor/utils/io/m;

    const-wide v1, 0x7fffffffffffffffL

    if-eqz v0, :cond_0

    check-cast p0, Lio/ktor/utils/io/m;

    invoke-virtual {p1, p0, v1, v2, p2}, Lio/ktor/utils/io/m;->j(Lio/ktor/utils/io/m;JLs83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, v1, v2, p2}, Lse/a;->x(Lio/ktor/utils/io/q;Lio/ktor/utils/io/m;JLs83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final x(Lio/ktor/utils/io/q;Lio/ktor/utils/io/m;JLs83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p4

    instance-of v1, v0, Lio/ktor/utils/io/r;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/ktor/utils/io/r;

    iget v2, v1, Lio/ktor/utils/io/r;->I:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/ktor/utils/io/r;->I:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/ktor/utils/io/r;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lio/ktor/utils/io/r;->H:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/ktor/utils/io/r;->I:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-ne v3, v6, :cond_1

    iget v3, v1, Lio/ktor/utils/io/r;->G:I

    iget-wide v8, v1, Lio/ktor/utils/io/r;->E:J

    iget v10, v1, Lio/ktor/utils/io/r;->F:I

    iget-wide v11, v1, Lio/ktor/utils/io/r;->z:J

    iget-object v13, v1, Lio/ktor/utils/io/r;->y:Lw63/a;

    iget-object v14, v1, Lio/ktor/utils/io/r;->x:Lio/ktor/utils/io/s;

    iget-object v15, v1, Lio/ktor/utils/io/r;->w:Lio/ktor/utils/io/q;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v15

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v8, v1, Lio/ktor/utils/io/r;->E:J

    iget v3, v1, Lio/ktor/utils/io/r;->F:I

    iget-wide v10, v1, Lio/ktor/utils/io/r;->z:J

    iget-object v13, v1, Lio/ktor/utils/io/r;->y:Lw63/a;

    iget-object v14, v1, Lio/ktor/utils/io/r;->x:Lio/ktor/utils/io/s;

    iget-object v12, v1, Lio/ktor/utils/io/r;->w:Lio/ktor/utils/io/q;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lw63/a;->k:Lio/ktor/utils/io/internal/e;

    invoke-virtual {v0}, Lio/ktor/utils/io/internal/e;->t0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw63/a;

    move-object/from16 v3, p1

    iget-boolean v8, v3, Lio/ktor/utils/io/m;->b:Z

    xor-int/2addr v8, v7

    move-object v13, v0

    move-wide v11, v4

    move v10, v8

    move-object/from16 v0, p0

    move-wide/from16 v8, p2

    :goto_1
    sub-long v14, v8, v11

    cmp-long v16, v14, v4

    if-eqz v16, :cond_9

    :try_start_2
    iget v4, v13, Lio/seon/androidsdk/service/e1;->f:I

    int-to-long v4, v4

    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v4, v4

    iget v5, v13, Lio/seon/androidsdk/service/e1;->d:I

    iput v5, v13, Lio/seon/androidsdk/service/e1;->b:I

    iput v5, v13, Lio/seon/androidsdk/service/e1;->c:I

    iput v4, v13, Lio/seon/androidsdk/service/e1;->e:I

    iput-object v0, v1, Lio/ktor/utils/io/r;->w:Lio/ktor/utils/io/q;

    iput-object v3, v1, Lio/ktor/utils/io/r;->x:Lio/ktor/utils/io/s;

    iput-object v13, v1, Lio/ktor/utils/io/r;->y:Lw63/a;

    iput-wide v8, v1, Lio/ktor/utils/io/r;->z:J

    iput v10, v1, Lio/ktor/utils/io/r;->F:I

    iput-wide v11, v1, Lio/ktor/utils/io/r;->E:J

    iput v7, v1, Lio/ktor/utils/io/r;->I:I

    check-cast v0, Lio/ktor/utils/io/m;

    invoke-virtual {v0, v13, v1}, Lio/ktor/utils/io/m;->r(Lw63/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v4, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v14, v3

    move v3, v10

    move-wide/from16 v17, v11

    move-object v12, v0

    move-object v0, v4

    move-wide v10, v8

    move-wide/from16 v8, v17

    :goto_2
    :try_start_3
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v4, -0x1

    if-eq v0, v4, :cond_8

    iput-object v12, v1, Lio/ktor/utils/io/r;->w:Lio/ktor/utils/io/q;

    iput-object v14, v1, Lio/ktor/utils/io/r;->x:Lio/ktor/utils/io/s;

    iput-object v13, v1, Lio/ktor/utils/io/r;->y:Lw63/a;

    iput-wide v10, v1, Lio/ktor/utils/io/r;->z:J

    iput v3, v1, Lio/ktor/utils/io/r;->F:I

    iput-wide v8, v1, Lio/ktor/utils/io/r;->E:J

    iput v0, v1, Lio/ktor/utils/io/r;->G:I

    iput v6, v1, Lio/ktor/utils/io/r;->I:I

    move-object v4, v14

    check-cast v4, Lio/ktor/utils/io/m;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v4, v13}, Lio/ktor/utils/io/m;->L(Lio/seon/androidsdk/service/e1;)V

    iget v15, v13, Lio/seon/androidsdk/service/e1;->c:I

    iget v6, v13, Lio/seon/androidsdk/service/e1;->b:I

    if-le v15, v6, :cond_5

    invoke-virtual {v4, v13, v1}, Lio/ktor/utils/io/m;->N(Lio/seon/androidsdk/service/e1;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    sget-object v14, Lr83/a;->w:Lr83/a;

    if-ne v6, v14, :cond_5

    move-object v5, v6

    :cond_5
    if-ne v5, v2, :cond_6

    :goto_3
    return-object v2

    :cond_6
    move v14, v3

    move v3, v0

    move-object v0, v12

    move-wide v11, v10

    move v10, v14

    move-object v14, v4

    :goto_4
    int-to-long v3, v3

    add-long/2addr v3, v8

    if-eqz v10, :cond_7

    move-object v5, v0

    check-cast v5, Lio/ktor/utils/io/m;

    invoke-virtual {v5}, Lio/ktor/utils/io/m;->l()I

    move-result v5

    if-nez v5, :cond_7

    move-object v5, v14

    check-cast v5, Lio/ktor/utils/io/m;

    invoke-virtual {v5, v7}, Lio/ktor/utils/io/m;->k(I)V

    :cond_7
    move-wide v8, v11

    const/4 v6, 0x2

    move-wide v11, v3

    move-object v3, v14

    const-wide/16 v4, 0x0

    goto/16 :goto_1

    :cond_8
    move-wide v11, v8

    goto :goto_6

    :goto_5
    move-object v14, v3

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_9
    move-object v14, v3

    :goto_6
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v11, v12}, Ljava/lang/Long;-><init>(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget-object v1, Lw63/a;->k:Lio/ktor/utils/io/internal/e;

    invoke-virtual {v13, v1}, Lw63/a;->j(Lx63/f;)V

    return-object v0

    :goto_7
    :try_start_4
    check-cast v14, Lio/ktor/utils/io/m;

    invoke-virtual {v14, v0}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    sget-object v1, Lw63/a;->k:Lio/ktor/utils/io/internal/e;

    invoke-virtual {v13, v1}, Lw63/a;->j(Lx63/f;)V

    throw v0
.end method

.method public static y(Ljava/lang/String;)[B
    .locals 6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    if-eq v3, v5, :cond_0

    mul-int/lit8 v4, v4, 0x10

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "input is not hexadecimal"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected a string of even length"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z([BILandroidx/health/platform/client/proto/d;)I
    .locals 2

    invoke-static {p0, p1, p2}, Lse/a;->F([BILandroidx/health/platform/client/proto/d;)I

    move-result p1

    iget v0, p2, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    iput-object p0, p2, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->f()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;->d()Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public abstract L(Lkr/u;FF)V
.end method
