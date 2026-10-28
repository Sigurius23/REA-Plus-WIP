.class public abstract Luf/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/d;


# static fields
.field public static w:Ljava/lang/reflect/Constructor;


# direct methods
.method public static final A([SI[SI)Ljava/nio/ByteBuffer;
    .locals 7

    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "wrap(...)"

    const/4 v2, 0x0

    if-gez v0, :cond_0

    new-array p0, v2, [B

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    mul-int/lit8 v3, v0, 0x2

    new-array v3, v3, [B

    :goto_0
    if-ge v2, v0, :cond_5

    if-lt v2, p1, :cond_1

    aget-short v4, p2, v2

    goto :goto_1

    :cond_1
    if-lt v2, p3, :cond_2

    aget-short v4, p0, v2

    goto :goto_1

    :cond_2
    aget-short v4, p0, v2

    aget-short v5, p2, v2

    add-int/2addr v4, v5

    :goto_1
    const/16 v5, 0x7fff

    if-le v4, v5, :cond_3

    move v4, v5

    :cond_3
    const/16 v5, -0x8000

    if-ge v4, v5, :cond_4

    move v4, v5

    :cond_4
    mul-int/lit8 v5, v2, 0x2

    and-int/lit16 v6, v4, 0xff

    int-to-byte v6, v6

    aput-byte v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    shr-int/lit8 v4, v4, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static B(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, "10"

    :try_start_0
    new-instance v1, Ljava/math/BigInteger;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x10

    invoke-direct {v1, p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    const-string v0, "%08x-%04x-%04x-%04x-%04x%08x"

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v6

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static C()Lfe3/c;
    .locals 1

    sget-boolean v0, Lfe3/c;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lfe3/c;

    invoke-direct {v0}, Lfe3/c;-><init>()V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final D(Llb3/c0;)Llb3/c0;
    .locals 13

    sget-object v1, Lob3/b;->w:Lob3/b;

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v7, 0x0

    if-eq v0, v2, :cond_1

    :cond_0
    :goto_0
    move-object v9, v7

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v8

    move-object v0, v8

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/u0;

    invoke-virtual {v3}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    sget-object v4, Llb3/g1;->y:Llb3/g1;

    if-ne v3, v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v2

    const-string v3, "getParameters(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v9, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Llb3/u0;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lr93/x0;

    invoke-virtual {v2}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    sget-object v4, Llb3/g1;->y:Llb3/g1;

    if-ne v3, v4, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v2}, Llb3/u0;->c()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    sget-object v4, Llb3/g1;->z:Llb3/g1;

    if-ne v3, v4, :cond_5

    invoke-virtual {v2}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    invoke-virtual {v3}, Llb3/y;->p0()Llb3/f1;

    move-result-object v3

    :goto_3
    move-object v4, v0

    goto :goto_4

    :cond_5
    move-object v3, v7

    goto :goto_3

    :goto_4
    new-instance v0, Lmb3/h;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v5, v2

    new-instance v2, Lmb3/i;

    const/4 v6, 0x6

    invoke-direct {v2, v5, v7, v4, v6}, Lmb3/i;-><init>(Llb3/u0;Lg40/d;Lr93/x0;I)V

    const/4 v5, 0x0

    const/16 v6, 0x38

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZI)V

    invoke-static {v0}, Lio/sentry/config/a;->n(Llb3/y;)Llb3/v0;

    move-result-object v2

    :goto_5
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    sget-object v0, Llb3/s0;->b:Llb3/d;

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-virtual {v0, v1, v9}, Llb3/d;->f(Llb3/q0;Ljava/util/List;)Llb3/y0;

    move-result-object v0

    new-instance v1, Llb3/a1;

    invoke-direct {v1, v0}, Llb3/a1;-><init>(Llb3/y0;)V

    move-object v0, v8

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_a

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/u0;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/u0;

    invoke-virtual {v3}, Llb3/u0;->a()Llb3/g1;

    move-result-object v5

    sget-object v6, Llb3/g1;->y:Llb3/g1;

    if-eq v5, v6, :cond_9

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/x0;

    invoke-interface {v5}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v5

    const-string v6, "getUpperBounds(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    sget-object v11, Lmb3/e;->a:Lmb3/e;

    if-eqz v10, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Llb3/y;

    sget-object v12, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v1, v10, v12}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v10

    invoke-virtual {v10}, Llb3/y;->p0()Llb3/f1;

    move-result-object v10

    invoke-virtual {v11, v10}, Lmb3/e;->a(Lob3/g;)Llb3/f1;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Llb3/u0;->c()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v3}, Llb3/u0;->a()Llb3/g1;

    move-result-object v5

    sget-object v10, Llb3/g1;->E:Llb3/g1;

    if-ne v5, v10, :cond_8

    invoke-virtual {v3}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    invoke-virtual {v3}, Llb3/y;->p0()Llb3/f1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lmb3/e;->a(Lob3/g;)Llb3/f1;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lmb3/h;

    iget-object v3, v3, Lmb3/h;->y:Lmb3/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lg40/d;

    const/16 v5, 0xa

    invoke-direct {v4, v6, v5}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    iput-object v4, v3, Lmb3/i;->x:Lc93/a;

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_6

    :cond_a
    :goto_8
    if-eqz v9, :cond_b

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result p0

    invoke-static {v9, v0, v1, p0}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object p0

    return-object p0

    :cond_b
    return-object v7
.end method

.method public static final E(IILyc3/g;)V
    .locals 2

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lkotlinx/serialization/SerializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is not allowed in ProtoNumber for property \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, p1}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' of \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\', because protobuf supports field numbers in range 1..2147483647"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static F(JJ)J
    .locals 9

    add-long v0, p0, p2

    xor-long v2, p0, p2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-gez v2, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    xor-long v7, p0, v0

    cmp-long v4, v7, v4

    if-ltz v4, :cond_1

    move v3, v6

    :cond_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_2

    return-wide v0

    :cond_2
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "overflow: checkedAdd("

    const-string v2, ", "

    invoke-static {p0, p1, v1, v2}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, ")"

    invoke-static {p2, p3, p1, p0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final G(ZZLandroidx/compose/runtime/Composer;)Lg1/y1;
    .locals 12

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, 0x75a3e169

    invoke-virtual {v9, p2}, Lp1/q;->e0(I)V

    const/4 p2, 0x1

    if-ne p0, p2, :cond_0

    sget-object p0, Lg40/e1;->x:Lg40/e1;

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_0
    if-nez p0, :cond_3

    sget-object p0, Lg40/e1;->w:Lg40/e1;

    goto :goto_0

    :goto_1
    const/4 p0, 0x0

    if-eqz p1, :cond_1

    const p1, 0x2e1f97ec

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object p1

    iget-wide p1, p1, Ld40/n;->a:J

    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    :goto_2
    move-wide v5, p1

    goto :goto_4

    :cond_1
    const p1, 0x2e209657

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    const p1, 0x46c488c6

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    invoke-static {v9}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result p1

    const p2, 0x3d23d70a    # 0.04f

    if-eqz p1, :cond_2

    sget-wide v1, Li2/x;->f:J

    invoke-static {p2, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide p1

    goto :goto_3

    :cond_2
    sget-wide v1, Li2/x;->b:J

    invoke-static {p2, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide p1

    :goto_3
    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    goto :goto_2

    :goto_4
    const/4 v10, 0x0

    const/16 v11, 0x16

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v0 .. v11}, Lg40/j4;->d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;

    move-result-object p1

    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    return-object p1

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final H(Llb3/g1;)Lob3/p;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lob3/p;->y:Lob3/p;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lob3/p;->x:Lob3/p;

    return-object p0

    :cond_2
    sget-object p0, Lob3/p;->z:Lob3/p;

    return-object p0
.end method

.method public static I()Ljava/lang/StackTraceElement;
    .locals 5

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const-class v1, Lo73/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v2, 0x0

    aget-object v0, v0, v2

    new-instance v2, Ljava/lang/StackTraceElement;

    const-string v3, "_COROUTINE."

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    const-string v4, "_"

    invoke-direct {v2, v1, v4, v3, v0}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v2
.end method

.method public static J(JJLjava/math/RoundingMode;)J
    .locals 8

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    div-long v0, p0, p2

    mul-long v2, p2, v0

    sub-long v2, p0, v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    xor-long/2addr p0, p2

    const/16 v7, 0x3f

    shr-long/2addr p0, v7

    long-to-int p0, p0

    or-int/lit8 p0, p0, 0x1

    sget-object p1, Lbs/e;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget p1, p1, v7

    packed-switch p1, :pswitch_data_0

    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :pswitch_0
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    sub-long/2addr p1, v2

    sub-long/2addr v2, p1

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    sget-object p1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    if-eq p4, p1, :cond_2

    sget-object p1, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    if-ne p4, p1, :cond_3

    const-wide/16 p1, 0x1

    and-long/2addr p1, v0

    cmp-long p1, p1, v4

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_1
    if-lez p1, :cond_3

    goto :goto_0

    :pswitch_1
    if-lez p0, :cond_3

    goto :goto_0

    :pswitch_2
    if-gez p0, :cond_3

    :cond_2
    :goto_0
    :pswitch_3
    int-to-long p0, p0

    add-long/2addr v0, p0

    return-wide v0

    :pswitch_4
    if-nez v6, :cond_4

    :cond_3
    :goto_1
    :pswitch_5
    return-wide v0

    :cond_4
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "mode was UNNECESSARY, but rounding was necessary"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final K(Lyc3/g;I)J
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    sget-object v2, Ldd3/b;->x:Ldd3/b;

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v7, p1

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v4, v3, :cond_4

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/annotation/Annotation;

    instance-of v9, v8, Ldd3/c;

    if-eqz v9, :cond_0

    check-cast v8, Ldd3/c;

    invoke-interface {v8}, Ldd3/c;->number()I

    move-result v7

    invoke-static {v7, v4, p0}, Luf/c0;->E(IILyc3/g;)V

    goto :goto_1

    :cond_0
    instance-of v9, v8, Ldd3/f;

    if-eqz v9, :cond_1

    check-cast v8, Ldd3/f;

    invoke-interface {v8}, Ldd3/f;->type()Ldd3/b;

    move-result-object v2

    goto :goto_1

    :cond_1
    instance-of v9, v8, Ldd3/e;

    if-eqz v9, :cond_2

    move v6, v1

    goto :goto_1

    :cond_2
    instance-of v8, v8, Ldd3/d;

    if-eqz v8, :cond_3

    move v5, v1

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    move p1, v7

    :goto_2
    const-wide/16 v0, 0x0

    if-eqz v6, :cond_6

    const-wide v3, 0x100000000L

    goto :goto_3

    :cond_6
    move-wide v3, v0

    :goto_3
    if-eqz v5, :cond_7

    const-wide v0, 0x1000000000L

    :cond_7
    or-long/2addr v0, v3

    iget-wide v2, v2, Ldd3/b;->w:J

    or-long/2addr v0, v2

    int-to-long p0, p1

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final L(Lyc3/g;IZ)I
    .locals 5

    const-string v0, "descriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object v0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    :goto_0
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/annotation/Annotation;

    instance-of v4, v3, Ldd3/d;

    if-eqz v4, :cond_1

    const/4 p0, -0x2

    return p0

    :cond_1
    instance-of v4, v3, Ldd3/c;

    if-eqz v4, :cond_2

    check-cast v3, Ldd3/c;

    invoke-interface {v3}, Ldd3/c;->number()I

    move-result p1

    if-nez p2, :cond_2

    invoke-static {p1, v2, p0}, Luf/c0;->E(IILyc3/g;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return p1
.end method

.method public static M(JJ)J
    .locals 4

    const-string v0, "a"

    invoke-static {p0, p1, v0}, Lug/m;->p(JLjava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, p3, v0}, Lug/m;->p(JLjava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    return-wide p2

    :cond_0
    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    return-wide p0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    shr-long/2addr p0, v0

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v1

    shr-long/2addr p2, v1

    :goto_0
    cmp-long v2, p0, p2

    if-eqz v2, :cond_2

    sub-long/2addr p0, p2

    const/16 v2, 0x3f

    shr-long v2, p0, v2

    and-long/2addr v2, p0

    sub-long/2addr p0, v2

    sub-long/2addr p0, v2

    add-long/2addr p2, v2

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v2

    shr-long/2addr p0, v2

    goto :goto_0

    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    shl-long/2addr p0, p2

    return-wide p0
.end method

.method public static final N(Lyc3/g;Lcd3/f;)Ljava/util/List;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "serializersModule"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v1

    sget-object v2, Lyc3/c;->a:Lyc3/c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p0}, Lvb/g;->b(Lyc3/g;)Lj93/d;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    check-cast p1, Lcd3/d;

    iget-object p1, p1, Lcd3/d;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, p1

    :goto_1
    check-cast v1, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object v1, p1

    goto :goto_3

    :cond_4
    sget-object p1, Lyc3/c;->b:Lyc3/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    invoke-interface {p0, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm83/q;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lm83/q;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    :goto_3
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc3/g;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/annotation/Annotation;

    instance-of v3, v3, Ldd3/c;

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " implementing oneOf type "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " should have @ProtoNumber annotation in its single property."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    check-cast v1, Ljava/util/List;

    return-object v1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " should be abstract or sealed or interface to be used as @ProtoOneOf property."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final O(Lv00/s0;)Lh20/o3;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lh20/o3;->y:Lh20/o3;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh20/o3;->w:Lh20/o3;

    return-object p0

    :cond_2
    sget-object p0, Lh20/o3;->x:Lh20/o3;

    return-object p0
.end method

.method public static final P(Ly00/c8;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/l3;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/l3;

    iget-object p0, p0, Ly00/l3;->K:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static R(Landroid/widget/EdgeEffect;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ll5/c;->b(Landroid/widget/EdgeEffect;)F

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final S(J)Ldd3/b;
    .locals 3

    const-wide v0, 0x600000000L

    and-long/2addr p0, v0

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    const-wide/16 v1, 0x0

    cmp-long v1, p0, v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ldd3/b;->y:Ldd3/b;

    const-wide v1, 0x200000000L

    cmp-long p0, p0, v1

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    sget-object p0, Ldd3/b;->z:Ldd3/b;

    return-object p0
.end method

.method public static T(I[I[I[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_3

    aget v2, p1, v1

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v2, p3, v1

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget v2, p2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static U()V
    .locals 1

    sget-boolean v0, Lfe3/c;->e:Z

    return-void
.end method

.method public static V(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x3

    return p0
.end method

.method public static W(I)I
    .locals 0

    and-int/lit8 p0, p0, 0x7

    return p0
.end method

.method public static Y(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Luf/c0;->w:Ljava/lang/reflect/Constructor;

    if-nez v0, :cond_0

    const-class v0, Ljava/lang/Class;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v1}, [Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/invoke/MethodHandles$Lookup;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v0, Luf/c0;->w:Ljava/lang/reflect/Constructor;

    :cond_0
    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/invoke/MethodHandles$Lookup;

    invoke-virtual {v0, p0, p1}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectSpecial(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/invoke/MethodHandle;->bindTo(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;

    move-result-object p0

    invoke-virtual {p0, p3}, Ljava/lang/invoke/MethodHandle;->invokeWithArguments([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final Z(J)Z
    .locals 2

    const-wide v0, 0x1000000000L

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x3c02b075

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_4

    or-int/lit16 v0, v0, 0x180

    goto :goto_4

    :cond_4
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_3

    :cond_5
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_6
    :goto_4
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_8

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, p0

    goto :goto_6

    :cond_8
    :goto_5
    if-eqz v3, :cond_9

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_9
    move-object v5, p0

    const/4 p0, 0x0

    const/16 v3, 0x30

    invoke-static {p0, v12, v3}, Ld40/r;->d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v9

    int-to-float v10, p0

    new-instance p0, Lb30/m6;

    const/4 v3, 0x0

    invoke-direct {p0, v1, v2, v3}, Lb30/m6;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const v3, -0x2eaf5428

    invoke-static {v3, v12, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 p0, v0, 0x6

    and-int/lit8 p0, p0, 0xe

    const/high16 v0, 0x1b0000

    or-int v13, p0, v0

    const/16 v14, 0xe

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v14}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    :goto_6
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance v0, Lb30/k6;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lb30/k6;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final a0(Lyc3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p0

    sget-object v0, Lyc3/e;->i:Lyc3/e;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    instance-of p0, p0, Lyc3/f;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b0()Z
    .locals 1

    sget-boolean v0, Lfe3/c;->e:Z

    return v0
.end method

.method public static final c0(Lg2/i;I)V
    .locals 3

    const-string v0, "msg"

    const-string v1, "Skipping moving focus due to exception: "

    const-string v2, "$this$moveFocusSafely"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    check-cast p0, Lg2/l;

    invoke-virtual {p0, p1}, Lg2/l;->h(I)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v0, 0x65b8bd1b

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p5, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    move-object/from16 v10, p3

    invoke-virtual {v5, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x800

    goto :goto_4

    :cond_5
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    if-ne v1, v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_6

    :cond_7
    :goto_5
    filled-new-array/range {p2 .. p3}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lm83/y;->w:Lm83/y;

    const v3, 0x7f14106d

    invoke-static {v3, v1, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v1

    invoke-static {v1, v5}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f1410f6

    invoke-static {v5, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v1, Lb2/t;->w:Lb2/t;

    const-string v4, "update_payment_method_bank_account_ui"

    invoke-static {v1, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    and-int/lit8 v1, v0, 0xe

    or-int/lit16 v1, v1, 0x6000

    and-int/lit8 v0, v0, 0x70

    or-int v6, v1, v0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Luf/c0;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v6, Lm;

    const/16 v12, 0xc

    move-object v7, p0

    move-object v8, p1

    move-object v9, p2

    move/from16 v11, p5

    invoke-direct/range {v6 .. v12}, Lm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static e0(Landroid/widget/EdgeEffect;FF)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Ll5/c;->c(Landroid/widget/EdgeEffect;FF)F

    move-result p0

    return p0

    :cond_0
    invoke-static {p0, p1, p2}, Ll5/b;->a(Landroid/widget/EdgeEffect;FF)V

    return p1
.end method

.method public static final f0(Lh20/h1;)V
    .locals 54

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lh20/h1;->E:Lh20/y2;

    sget-object v2, Ld40/p;->a:Ld40/n;

    sget-object v3, Ld40/q;->a:Ld40/n;

    iget-object v2, v0, Lh20/h1;->w:Lh20/v1;

    iget v4, v2, Lh20/v1;->y:I

    invoke-static {v4}, Li2/w0;->c(I)J

    move-result-wide v4

    iget v6, v2, Lh20/v1;->z:I

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v6

    iget v8, v2, Lh20/v1;->E:I

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v8

    iget v10, v2, Lh20/v1;->F:I

    invoke-static {v10}, Li2/w0;->c(I)J

    move-result-wide v10

    iget v12, v2, Lh20/v1;->H:I

    invoke-static {v12}, Li2/w0;->c(I)J

    move-result-wide v12

    iget v14, v2, Lh20/v1;->I:I

    invoke-static {v14}, Li2/w0;->c(I)J

    move-result-wide v14

    move-object/from16 v16, v3

    iget v3, v2, Lh20/v1;->J:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v17

    iget v3, v2, Lh20/v1;->w:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v19

    move/from16 v28, v3

    iget v3, v2, Lh20/v1;->x:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v21

    iget v3, v2, Lh20/v1;->G:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v25

    iget v2, v2, Lh20/v1;->K:I

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v23

    const/16 v27, 0xb9e

    invoke-static/range {v19 .. v27}, Lg1/d1;->d(JJJJI)Lg1/c1;

    move-result-object v2

    const/16 v19, 0x20

    move-object/from16 v3, v16

    move-wide/from16 v16, v17

    move-object/from16 v18, v2

    invoke-static/range {v3 .. v19}, Ld40/n;->a(Ld40/n;JJJJJJJLg1/c1;I)Ld40/n;

    move-result-object v2

    sput-object v2, Ld40/p;->b:Ld40/n;

    sget-object v3, Ld40/q;->b:Ld40/n;

    iget-object v2, v0, Lh20/h1;->x:Lh20/v1;

    iget v4, v2, Lh20/v1;->y:I

    invoke-static {v4}, Li2/w0;->c(I)J

    move-result-wide v4

    iget v6, v2, Lh20/v1;->z:I

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v6

    iget v8, v2, Lh20/v1;->E:I

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v8

    iget v10, v2, Lh20/v1;->F:I

    invoke-static {v10}, Li2/w0;->c(I)J

    move-result-wide v10

    iget v12, v2, Lh20/v1;->H:I

    invoke-static {v12}, Li2/w0;->c(I)J

    move-result-wide v12

    iget v14, v2, Lh20/v1;->I:I

    invoke-static {v14}, Li2/w0;->c(I)J

    move-result-wide v14

    move-object/from16 v16, v3

    iget v3, v2, Lh20/v1;->J:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v17

    iget v3, v2, Lh20/v1;->w:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v19

    move/from16 v27, v3

    iget v3, v2, Lh20/v1;->x:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v21

    iget v3, v2, Lh20/v1;->G:I

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v25

    iget v2, v2, Lh20/v1;->K:I

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v23

    invoke-static/range {v19 .. v26}, Lg1/d1;->c(JJJJ)Lg1/c1;

    move-result-object v2

    const/16 v19, 0x20

    move-object/from16 v3, v16

    move-wide/from16 v16, v17

    move-object/from16 v18, v2

    invoke-static/range {v3 .. v19}, Ld40/n;->a(Ld40/n;JJJJJJJLg1/c1;I)Ld40/n;

    move-result-object v2

    sput-object v2, Ld40/p;->a:Ld40/n;

    sget-object v2, Ld40/q;->c:Ld40/o;

    iget-object v3, v0, Lh20/h1;->y:Lh20/c3;

    iget v4, v3, Lh20/c3;->w:F

    iget v5, v3, Lh20/c3;->y:F

    iget v6, v3, Lh20/c3;->x:F

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ld40/o;

    invoke-direct {v2, v4, v5, v6}, Ld40/o;-><init>(FFF)V

    sput-object v2, Ld40/p;->c:Ld40/o;

    sget-object v2, Ld40/q;->d:Ld40/s;

    iget-object v4, v0, Lh20/h1;->z:Lh20/l3;

    iget-object v5, v4, Lh20/l3;->x:Ljava/lang/Integer;

    iget v7, v4, Lh20/l3;->w:F

    iget-object v8, v4, Lh20/l3;->y:Lh20/j3;

    iget-object v8, v8, Lh20/j3;->w:Lh20/k3;

    if-eqz v8, :cond_0

    invoke-static {v8}, Luf/c0;->o0(Lh20/k3;)Ll3/v0;

    move-result-object v8

    move-object/from16 v47, v8

    goto :goto_0

    :cond_0
    const/16 v47, 0x0

    :goto_0
    iget v8, v2, Ld40/s;->a:I

    iget v10, v2, Ld40/s;->b:I

    iget v11, v2, Ld40/s;->c:I

    iget-wide v12, v2, Ld40/s;->e:J

    iget-wide v14, v2, Ld40/s;->f:J

    move/from16 v31, v10

    iget-wide v9, v2, Ld40/s;->g:J

    move-object/from16 v46, v5

    move/from16 v17, v6

    iget-wide v5, v2, Ld40/s;->h:J

    move-wide/from16 v40, v5

    iget-wide v5, v2, Ld40/s;->i:J

    move-wide/from16 v42, v5

    iget-wide v5, v2, Ld40/s;->j:J

    move-wide/from16 v44, v5

    iget-object v5, v2, Ld40/s;->m:Lp3/i;

    iget-object v6, v2, Ld40/s;->n:Lp3/i;

    move-object/from16 v48, v5

    iget-object v5, v2, Ld40/s;->o:Lp3/i;

    move-object/from16 v50, v5

    iget-object v5, v2, Ld40/s;->p:Lp3/i;

    move-object/from16 v51, v5

    iget-object v5, v2, Ld40/s;->q:Lp3/i;

    move-object/from16 v52, v5

    iget-object v5, v2, Ld40/s;->r:Lp3/i;

    new-instance v29, Ld40/s;

    move-object/from16 v53, v5

    move-object/from16 v49, v6

    move/from16 v33, v7

    move/from16 v30, v8

    move-wide/from16 v38, v9

    move/from16 v32, v11

    move-wide/from16 v34, v12

    move-wide/from16 v36, v14

    invoke-direct/range {v29 .. v53}, Ld40/s;-><init>(IIIFJJJJJJLjava/lang/Integer;Ll3/v0;Lp3/i;Lp3/i;Lp3/i;Lp3/i;Lp3/i;Lp3/i;)V

    sput-object v29, Ld40/p;->d:Ld40/s;

    sget-object v5, Ld40/q;->e:Ld40/k;

    new-instance v29, Ld40/i;

    iget-object v6, v1, Lh20/y2;->w:Lh20/z2;

    iget-object v7, v1, Lh20/y2;->y:Lh20/a3;

    iget-object v8, v1, Lh20/y2;->w:Lh20/z2;

    iget-object v9, v1, Lh20/y2;->x:Lh20/z2;

    iget-object v6, v6, Lh20/z2;->w:Ljava/lang/Integer;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_1

    :cond_1
    move/from16 v6, v28

    :goto_1
    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v30

    iget v6, v8, Lh20/z2;->x:I

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v32

    iget v6, v8, Lh20/z2;->y:I

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v34

    iget v6, v8, Lh20/z2;->z:I

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v36

    iget v6, v8, Lh20/z2;->E:I

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v38

    invoke-direct/range {v29 .. v39}, Ld40/i;-><init>(JJJJJ)V

    move-object/from16 v6, v29

    new-instance v28, Ld40/i;

    iget-object v8, v9, Lh20/z2;->w:Ljava/lang/Integer;

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_2

    :cond_2
    move/from16 v8, v27

    :goto_2
    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v29

    iget v8, v9, Lh20/z2;->x:I

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v31

    iget v8, v9, Lh20/z2;->y:I

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v33

    iget v8, v9, Lh20/z2;->z:I

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v35

    iget v8, v9, Lh20/z2;->E:I

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v37

    invoke-direct/range {v28 .. v38}, Ld40/i;-><init>(JJJJJ)V

    move-object/from16 v8, v28

    new-instance v9, Ld40/j;

    iget-object v10, v7, Lh20/a3;->w:Ljava/lang/Float;

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_3

    :cond_3
    iget v3, v3, Lh20/c3;->w:F

    :goto_3
    iget-object v10, v7, Lh20/a3;->x:Ljava/lang/Float;

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v10

    goto :goto_4

    :cond_4
    move/from16 v10, v17

    :goto_4
    iget-object v7, v7, Lh20/a3;->y:Ljava/lang/Float;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    goto :goto_5

    :cond_5
    iget-object v7, v5, Ld40/k;->c:Ld40/j;

    iget v7, v7, Ld40/j;->c:F

    :goto_5
    invoke-direct {v9, v3, v10, v7}, Ld40/j;-><init>(FFF)V

    new-instance v3, Ld40/l;

    iget-object v1, v1, Lh20/y2;->z:Lh20/b3;

    iget-object v7, v1, Lh20/b3;->w:Ljava/lang/Integer;

    if-nez v7, :cond_6

    iget-object v7, v4, Lh20/l3;->x:Ljava/lang/Integer;

    :cond_6
    iget-object v1, v1, Lh20/b3;->x:Ljava/lang/Float;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-wide v10, 0x100000000L

    invoke-static {v1, v10, v11}, Lv63/c;->j(FJ)J

    move-result-wide v1

    goto :goto_6

    :cond_7
    iget-wide v1, v2, Ld40/s;->i:J

    iget v4, v4, Lh20/l3;->w:F

    invoke-static {v1, v2}, Lv63/c;->a(J)V

    const-wide v10, 0xff00000000L

    and-long/2addr v10, v1

    invoke-static {v1, v2, v10, v11, v4}, Ld13/a;->d(JJF)J

    move-result-wide v1

    :goto_6
    invoke-direct {v3, v1, v2, v7}, Ld40/l;-><init>(JLjava/lang/Integer;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ld40/k;

    invoke-direct {v1, v6, v8, v9, v3}, Ld40/k;-><init>(Ld40/i;Ld40/i;Ld40/j;Ld40/l;)V

    sput-object v1, Ld40/p;->e:Ld40/k;

    sget-object v1, Ld40/q;->o:Ld40/g;

    iget-object v2, v0, Lh20/h1;->G:Lh20/j2;

    iget v3, v2, Lh20/j2;->w:F

    iget v4, v2, Lh20/j2;->x:F

    iget v5, v2, Lh20/j2;->y:F

    iget v2, v2, Lh20/j2;->z:F

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ld40/g;

    invoke-direct {v1, v3, v4, v5, v2}, Ld40/g;-><init>(FFFF)V

    sput-object v1, Ld40/p;->f:Ld40/g;

    iget-object v1, v0, Lh20/h1;->H:Lh20/h3;

    iget v1, v1, Lh20/h3;->w:F

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_8

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    goto :goto_7

    :cond_8
    const/4 v9, 0x0

    :goto_7
    sput-object v9, Ld40/p;->g:Ljava/lang/Float;

    iget v1, v0, Lh20/h1;->K:F

    sput v1, Ld40/p;->k:F

    iget-object v1, v0, Lh20/h1;->I:Lh20/j2;

    iget v2, v1, Lh20/j2;->w:F

    iget v3, v1, Lh20/j2;->y:F

    iget v4, v1, Lh20/j2;->x:F

    iget v1, v1, Lh20/j2;->z:F

    new-instance v5, Ld40/g;

    invoke-direct {v5, v2, v4, v3, v1}, Ld40/g;-><init>(FFFF)V

    sput-object v5, Ld40/p;->h:Ld40/g;

    iget-object v0, v0, Lh20/h1;->J:Lh20/i2;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    sget-object v0, Ld40/h;->x:Ld40/h;

    goto :goto_8

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    sget-object v0, Ld40/h;->w:Ld40/h;

    :goto_8
    sput-object v0, Ld40/p;->j:Ld40/h;

    return-void
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object/from16 v3, p5

    check-cast v3, Lp1/q;

    const v0, 0x7aed2768

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p6

    :goto_1
    and-int/lit8 v1, p6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    invoke-virtual {v3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    invoke-virtual {v3, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x800

    goto :goto_4

    :cond_5
    const/16 v1, 0x400

    :goto_4
    or-int v6, v0, v1

    and-int/lit16 v0, v6, 0x2493

    const/16 v1, 0x2492

    if-ne v0, v1, :cond_7

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v10, p4

    goto/16 :goto_7

    :cond_7
    :goto_5
    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v0, v1, v3, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v1, v3, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    move-object/from16 v10, p4

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v3, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-nez v2, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    invoke-static {v1, v3, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x7c1afd3b

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    if-eqz p0, :cond_b

    const v0, 0x7f140f80

    invoke-static {v3, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    and-int/lit8 v4, v6, 0xe

    const/4 v5, 0x4

    const/4 v0, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Luf/c0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    :cond_b
    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    const v0, -0x7c1ae0d0

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v11, 0x1

    if-eqz p1, :cond_c

    const v0, 0x7f140ff5

    invoke-static {v3, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x8

    int-to-float v0, v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v1, v6, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v4, v1, 0x180

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Luf/c0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    :cond_c
    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    shr-int/lit8 v0, v6, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v6, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v4, v0, v1

    const/4 v5, 0x4

    const/4 v0, 0x0

    move-object v2, p2

    move-object v1, p3

    invoke-static/range {v0 .. v5}, Luf/c0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v4, Laq1/c;

    const/4 v11, 0x1

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, v10

    move/from16 v10, p6

    invoke-direct/range {v4 .. v11}, Laq1/c;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final h(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/m;ZZLq3/g0;Lu0/r0;Lu0/q0;Li2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;II)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p13

    move/from16 v3, p14

    const-string v4, "value"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "label"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p12

    check-cast v4, Lp1/q;

    const v5, -0x6a68660f

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v8, v2, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_5

    or-int/lit16 v5, v5, 0x180

    :cond_4
    move-object/from16 v11, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v11, v2, 0x180

    if-nez v11, :cond_4

    move-object/from16 v11, p2

    invoke-virtual {v4, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x100

    goto :goto_3

    :cond_6
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v5, v12

    :goto_4
    and-int/lit8 v12, v3, 0x8

    if-eqz v12, :cond_8

    or-int/lit16 v5, v5, 0xc00

    :cond_7
    move-object/from16 v13, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v13, v2, 0xc00

    if-nez v13, :cond_7

    move-object/from16 v13, p3

    invoke-virtual {v4, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    const/16 v14, 0x800

    goto :goto_5

    :cond_9
    const/16 v14, 0x400

    :goto_5
    or-int/2addr v5, v14

    :goto_6
    and-int/lit8 v14, v3, 0x10

    if-eqz v14, :cond_b

    or-int/lit16 v5, v5, 0x6000

    :cond_a
    move-object/from16 v15, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v15, v2, 0x6000

    if-nez v15, :cond_a

    move-object/from16 v15, p4

    invoke-virtual {v4, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    const/16 v16, 0x4000

    goto :goto_7

    :cond_c
    const/16 v16, 0x2000

    :goto_7
    or-int v5, v5, v16

    :goto_8
    and-int/lit8 v16, v3, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_d

    or-int v5, v5, v17

    move/from16 v6, p5

    goto :goto_a

    :cond_d
    and-int v17, v2, v17

    move/from16 v6, p5

    if-nez v17, :cond_f

    invoke-virtual {v4, v6}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_e

    const/high16 v17, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v17, 0x10000

    :goto_9
    or-int v5, v5, v17

    :cond_f
    :goto_a
    and-int/lit8 v17, v3, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_10

    or-int v5, v5, v18

    move/from16 v7, p6

    goto :goto_c

    :cond_10
    and-int v19, v2, v18

    move/from16 v7, p6

    if-nez v19, :cond_12

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v20, 0x80000

    :goto_b
    or-int v5, v5, v20

    :cond_12
    :goto_c
    and-int/lit16 v9, v3, 0x80

    const/high16 v21, 0xc00000

    if-eqz v9, :cond_13

    or-int v5, v5, v21

    move-object/from16 v10, p7

    goto :goto_e

    :cond_13
    and-int v21, v2, v21

    move-object/from16 v10, p7

    if-nez v21, :cond_15

    invoke-virtual {v4, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_14

    const/high16 v22, 0x800000

    goto :goto_d

    :cond_14
    const/high16 v22, 0x400000

    :goto_d
    or-int v5, v5, v22

    :cond_15
    :goto_e
    and-int/lit16 v1, v3, 0x100

    const/high16 v22, 0x6000000

    if-eqz v1, :cond_17

    or-int v5, v5, v22

    :cond_16
    move/from16 v22, v1

    move-object/from16 v1, p8

    goto :goto_10

    :cond_17
    and-int v22, v2, v22

    if-nez v22, :cond_16

    move/from16 v22, v1

    move-object/from16 v1, p8

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_18

    const/high16 v23, 0x4000000

    goto :goto_f

    :cond_18
    const/high16 v23, 0x2000000

    :goto_f
    or-int v5, v5, v23

    :goto_10
    and-int/lit16 v1, v3, 0x200

    const/high16 v23, 0x30000000

    if-eqz v1, :cond_1a

    or-int v5, v5, v23

    :cond_19
    move/from16 v23, v1

    move-object/from16 v1, p9

    goto :goto_12

    :cond_1a
    and-int v23, v2, v23

    if-nez v23, :cond_19

    move/from16 v23, v1

    move-object/from16 v1, p9

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1b

    const/high16 v24, 0x20000000

    goto :goto_11

    :cond_1b
    const/high16 v24, 0x10000000

    :goto_11
    or-int v5, v5, v24

    :goto_12
    and-int/lit16 v1, v3, 0x400

    if-nez v1, :cond_1c

    move-object/from16 v1, p10

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1d

    const/16 v19, 0x4

    goto :goto_13

    :cond_1c
    move-object/from16 v1, p10

    :cond_1d
    const/16 v19, 0x2

    :goto_13
    and-int/lit16 v1, v3, 0x800

    if-nez v1, :cond_1e

    move-object/from16 v1, p11

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1f

    const/16 v20, 0x20

    goto :goto_14

    :cond_1e
    move-object/from16 v1, p11

    :cond_1f
    const/16 v20, 0x10

    :goto_14
    or-int v19, v19, v20

    const v20, 0x12492493

    and-int v1, v5, v20

    const v2, 0x12492492

    if-ne v1, v2, :cond_21

    and-int/lit8 v1, v19, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_21

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_20

    goto :goto_15

    :cond_20
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v20, v4

    move-object v8, v10

    move-object v3, v11

    move-object v4, v13

    move-object v5, v15

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    goto/16 :goto_21

    :cond_21
    :goto_15
    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v1, p13, 0x1

    if-eqz v1, :cond_25

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_16

    :cond_22
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_23

    and-int/lit8 v19, v19, -0xf

    :cond_23
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_24

    and-int/lit8 v19, v19, -0x71

    :cond_24
    move-object/from16 v9, p8

    move-object/from16 v12, p9

    move-object/from16 v17, p10

    move/from16 v25, v6

    move v3, v7

    move-object v1, v11

    move-object v8, v13

    move-object v11, v15

    move/from16 v2, v18

    move-object/from16 v18, p11

    goto/16 :goto_20

    :cond_25
    :goto_16
    if-eqz v8, :cond_26

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_17

    :cond_26
    move-object v1, v11

    :goto_17
    const/4 v2, 0x0

    if-eqz v12, :cond_28

    const v8, -0x5a9b6794

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v8, v11, :cond_27

    new-instance v8, Lb01/f;

    const/16 v11, 0xf

    invoke-direct {v8, v11}, Lb01/f;-><init>(I)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_28
    move-object v8, v13

    :goto_18
    if-eqz v14, :cond_29

    const/4 v11, 0x0

    goto :goto_19

    :cond_29
    move-object v11, v15

    :goto_19
    if-eqz v16, :cond_2a

    move v6, v2

    :cond_2a
    if-eqz v17, :cond_2b

    goto :goto_1a

    :cond_2b
    move v2, v7

    :goto_1a
    if-eqz v9, :cond_2c

    sget-object v7, Lq3/f0;->w:Lg40/h2;

    goto :goto_1b

    :cond_2c
    move-object v7, v10

    :goto_1b
    if-eqz v22, :cond_2d

    sget-object v9, Lu0/r0;->e:Lu0/r0;

    goto :goto_1c

    :cond_2d
    move-object/from16 v9, p8

    :goto_1c
    if-eqz v23, :cond_2e

    sget-object v10, Lu0/q0;->g:Lu0/q0;

    goto :goto_1d

    :cond_2e
    move-object/from16 v10, p9

    :goto_1d
    and-int/lit16 v12, v3, 0x400

    if-eqz v12, :cond_2f

    sget-object v12, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v4, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/l5;

    iget-object v12, v12, Lg1/l5;->a:Lt0/a;

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    sget-object v17, Lt0/d;->a:Lt0/c;

    move-object/from16 v20, v17

    move-object/from16 p2, v12

    move/from16 p7, v13

    move-object/from16 p8, v14

    move-object/from16 p3, v15

    move-object/from16 p4, v16

    move-object/from16 p5, v17

    move-object/from16 p6, v20

    invoke-static/range {p2 .. p8}, Lt0/a;->d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;

    move-result-object v12

    and-int/lit8 v19, v19, -0xf

    goto :goto_1e

    :cond_2f
    move-object/from16 v12, p10

    :goto_1e
    and-int/lit16 v13, v3, 0x800

    if-eqz v13, :cond_30

    invoke-static {v6, v2, v4}, Luf/c0;->G(ZZLandroidx/compose/runtime/Composer;)Lg1/y1;

    move-result-object v13

    and-int/lit8 v19, v19, -0x71

    move v3, v2

    move/from16 v25, v6

    move-object/from16 v17, v12

    move/from16 v2, v18

    move-object v12, v10

    move-object/from16 v18, v13

    :goto_1f
    move-object v10, v7

    goto :goto_20

    :cond_30
    move v3, v2

    move/from16 v25, v6

    move-object/from16 v17, v12

    move/from16 v2, v18

    move-object/from16 v18, p11

    move-object v12, v10

    goto :goto_1f

    :goto_20
    invoke-virtual {v4}, Lp1/q;->r()V

    sget-object v6, Ld40/r;->j:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld40/g;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Ld40/g;->a()Ll0/l1;

    move-result-object v6

    new-instance v13, Lb30/b0;

    const/4 v14, 0x0

    invoke-direct {v13, v0, v14}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v14, -0x55f7e115

    invoke-static {v14, v4, v13}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    and-int/lit8 v14, v5, 0xe

    or-int/2addr v2, v14

    shr-int/lit8 v14, v5, 0x6

    and-int/lit8 v14, v14, 0x70

    or-int/2addr v2, v14

    shr-int/lit8 v14, v5, 0x9

    and-int/lit16 v14, v14, 0x1c00

    or-int/2addr v2, v14

    shl-int/lit8 v14, v5, 0xf

    const/high16 v15, 0x70000000

    and-int/2addr v14, v15

    or-int v21, v2, v14

    shr-int/lit8 v2, v5, 0xf

    and-int/lit16 v5, v2, 0x380

    or-int/lit8 v5, v5, 0x30

    and-int/lit16 v14, v2, 0x1c00

    or-int/2addr v5, v14

    const v14, 0xe000

    and-int/2addr v2, v14

    or-int/2addr v2, v5

    shl-int/lit8 v5, v19, 0x1b

    and-int/2addr v5, v15

    or-int v22, v2, v5

    shr-int/lit8 v2, v19, 0x3

    and-int/lit8 v23, v2, 0xe

    const v24, 0x785b0

    move-object/from16 v20, v4

    const/4 v4, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object v2, v7

    const/4 v7, 0x0

    move-object v5, v1

    move-object v1, v8

    move-object v8, v11

    move-object v11, v9

    const/4 v9, 0x0

    move-object v14, v5

    move-object v5, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v26, v16

    const/16 v16, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v24}, Lvp/c;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/e8;Ll0/l1;Landroidx/compose/runtime/Composer;IIII)V

    move-object v4, v1

    move v7, v3

    move-object v5, v8

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object/from16 v11, v17

    move-object/from16 v12, v18

    move/from16 v6, v25

    move-object/from16 v3, v26

    :goto_21
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_31

    new-instance v0, Lb30/a0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lb30/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/m;ZZLq3/g0;Lu0/r0;Lu0/q0;Li2/a1;Lg1/e8;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method public static h0(Llo/s;III)I
    .locals 4

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v1, 0x1f

    const/4 v2, 0x1

    if-gt v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->d(Z)V

    shl-int v0, v2, p1

    sub-int/2addr v0, v2

    shl-int v1, v2, p2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ltx/f;->z(II)I

    move-result v3

    shl-int/2addr v2, p3

    invoke-static {v3, v2}, Ltx/f;->z(II)I

    invoke-virtual {p0}, Llo/s;->b()I

    move-result v2

    if-ge v2, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Llo/s;->i(I)I

    move-result p1

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, Llo/s;->b()I

    move-result v0

    if-ge v0, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p2}, Llo/s;->i(I)I

    move-result p2

    add-int/2addr p1, p2

    if-ne p2, v1, :cond_4

    invoke-virtual {p0}, Llo/s;->b()I

    move-result p2

    if-ge p2, p3, :cond_3

    :goto_1
    const/4 p0, -0x1

    return p0

    :cond_3
    invoke-virtual {p0, p3}, Llo/s;->i(I)I

    move-result p0

    add-int/2addr p0, p1

    return p0

    :cond_4
    return p1
.end method

.method public static final i(Lb30/y0;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x14433acf

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v10, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v10

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int/2addr v2, v1

    move v11, v2

    goto :goto_2

    :cond_2
    move v11, v1

    :goto_2
    and-int/lit8 v2, v11, 0x3

    if-ne v2, v3, :cond_4

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_4
    :goto_3
    const/4 v12, 0x0

    new-array v2, v12, [Ljava/lang/Object;

    const v3, 0x1e896111

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v3, v13, :cond_5

    new-instance v3, Lb1/h;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lb1/h;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v3

    check-cast v4, Lc93/a;

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    const/16 v6, 0xc00

    const/4 v7, 0x6

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lp1/c1;

    iget-object v2, v0, Lb30/y0;->E:Ln53/e;

    const v3, 0x1e896a85

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_6

    new-instance v3, Lb01/f;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lb01/f;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    invoke-static {v2, v3}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    invoke-static {v2, v5, v12}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    const v3, 0x7f1410db

    invoke-static {v3}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->c()J

    move-result-wide v6

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb30/d6;

    sget-object v8, Lb30/d6;->x:Lb30/d6;

    const/4 v15, 0x1

    if-ne v4, v8, :cond_7

    move v4, v15

    goto :goto_4

    :cond_7
    move v4, v12

    :goto_4
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb30/d6;

    sget-object v8, Lb30/d6;->z:Lb30/d6;

    move-wide/from16 v16, v6

    if-ne v2, v8, :cond_8

    move v6, v15

    :goto_5
    move-object v2, v3

    move v7, v4

    move-wide/from16 v3, v16

    goto :goto_6

    :cond_8
    move v6, v12

    goto :goto_5

    :goto_6
    const v8, 0x1e899298

    invoke-virtual {v5, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_9

    if-ne v9, v13, :cond_a

    :cond_9
    new-instance v9, Lb01/m;

    const/4 v8, 0x4

    invoke-direct {v9, v8, v14}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v9, Lc93/a;

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object v8, v5

    move v5, v7

    move-object v7, v9

    const/high16 v9, 0x30000

    invoke-static/range {v2 .. v9}, Lkotlin/jvm/internal/j;->h(Lzy/b;JZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v8

    invoke-interface {v14}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v0, Lb30/y0;->c:Lh20/l;

    iget-object v3, v0, Lb30/y0;->h:Lzy/c;

    const v4, 0x1e89b661

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    if-nez v3, :cond_b

    const/4 v3, 0x0

    goto :goto_7

    :cond_b
    invoke-static {v3, v5}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    :goto_7
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    const v4, 0x1e89bc5f

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v6, v11, 0xe

    if-eq v6, v10, :cond_d

    and-int/lit8 v6, v11, 0x8

    if-eqz v6, :cond_c

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_8

    :cond_c
    move v15, v12

    :cond_d
    :goto_8
    or-int/2addr v4, v15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_e

    if-ne v6, v13, :cond_f

    :cond_e
    new-instance v6, Li;

    const/16 v4, 0x12

    invoke-direct {v6, v4, v14, v0}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v4, v6

    check-cast v4, Lc93/a;

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    const v6, 0x1e89d515

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    if-ne v7, v13, :cond_11

    :cond_10
    new-instance v7, Lb01/m;

    const/4 v6, 0x5

    invoke-direct {v7, v6, v14}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lc93/a;

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object v8, v5

    move-object v5, v7

    const/4 v7, 0x0

    move-object v6, v8

    invoke-static/range {v2 .. v7}, Ls2/e;->e(Lh20/l;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v6

    :cond_12
    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_13

    new-instance v3, Lb30/j6;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lb30/j6;-><init>(Lb30/y0;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static i0(JJ)J
    .locals 9

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    not-long v1, p0

    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    add-int/2addr v0, v1

    not-long v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    add-int/2addr v1, v0

    const/16 v0, 0x41

    if-le v1, v0, :cond_0

    mul-long/2addr p0, p2

    return-wide p0

    :cond_0
    xor-long v2, p0, p2

    const/16 v0, 0x3f

    ushr-long/2addr v2, v0

    const-wide v4, 0x7fffffffffffffffL

    add-long/2addr v2, v4

    const/16 v0, 0x40

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ge v1, v0, :cond_1

    move v0, v5

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    const-wide/16 v6, 0x0

    cmp-long v1, p0, v6

    if-gez v1, :cond_2

    move v6, v5

    goto :goto_1

    :cond_2
    move v6, v4

    :goto_1
    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v7, p2, v7

    if-nez v7, :cond_3

    move v4, v5

    :cond_3
    and-int/2addr v4, v6

    or-int/2addr v0, v4

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    mul-long v4, p0, p2

    if-eqz v1, :cond_6

    div-long p0, v4, p0

    cmp-long p0, p0, p2

    if-nez p0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    return-wide v2

    :cond_6
    :goto_3
    return-wide v4
.end method

.method public static final j(Lb30/y0;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x6b887c55    # 3.300021E26f

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v5, v5, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_9

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_8
    move-object/from16 v26, v0

    goto/16 :goto_9

    :cond_9
    :goto_5
    iget-object v5, v1, Lb30/y0;->c:Lh20/l;

    if-eqz v2, :cond_a

    iget-boolean v6, v1, Lb30/y0;->w:Z

    if-eqz v6, :cond_a

    const/4 v6, 0x1

    goto :goto_6

    :cond_a
    const/4 v6, 0x0

    :goto_6
    iget-object v5, v5, Lh20/l;->c:Lh20/r4;

    instance-of v7, v5, Lh20/m4;

    const/4 v8, 0x0

    const v9, 0x7f141073

    if-eqz v7, :cond_c

    if-eqz v6, :cond_b

    const v9, 0x7f14108c

    :cond_b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_8

    :cond_c
    instance-of v6, v5, Lh20/n4;

    const v7, 0x7f14106c

    if-eqz v6, :cond_f

    check-cast v5, Lh20/n4;

    iget-object v5, v5, Lh20/n4;->a:Ly00/s2;

    instance-of v6, v5, Ly00/q2;

    if-eqz v6, :cond_d

    move v9, v7

    goto :goto_7

    :cond_d
    instance-of v5, v5, Ly00/r2;

    if-eqz v5, :cond_e

    :goto_7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_8

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    instance-of v6, v5, Lh20/p4;

    if-eqz v6, :cond_10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_8

    :cond_10
    instance-of v6, v5, Lh20/o4;

    if-eqz v6, :cond_11

    const v5, 0x7f1410ce

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_8

    :cond_11
    sget-object v6, Lh20/q4;->a:Lh20/q4;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    move-object v5, v8

    :goto_8
    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object v8

    :cond_12
    if-eqz v8, :cond_8

    invoke-virtual {v8, v3}, Lzy/b;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v6

    iget-object v6, v6, Lg1/h9;->h:Ll3/v0;

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v7

    iget-wide v7, v7, Ld40/n;->e:J

    sget-object v12, Lp3/r;->F:Lp3/r;

    const/16 v9, 0x8

    int-to-float v15, v9

    const/16 v17, 0x0

    const/16 v18, 0xd

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-string v10, "update_payment_method_subtitle"

    invoke-static {v9, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v28, 0x0

    const v29, 0xffd8

    move-object/from16 v25, v6

    move-object v6, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v27, 0x30030

    move-object/from16 v26, v0

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_9
    invoke-virtual/range {v26 .. v26}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lar2/f;

    const/4 v5, 0x3

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void

    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static j0(Ljava/lang/CharSequence;Ljava/lang/Object;I)Z
    .locals 1

    instance-of v0, p0, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/text/Spanned;

    invoke-interface {p0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p0

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final k(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, 0x3eed1fe3

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    and-int/lit8 v4, v2, 0x3

    if-ne v4, v3, :cond_2

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v21, v1

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v3, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h9;

    iget-object v3, v3, Lg1/h9;->g:Ll3/v0;

    and-int/lit8 v22, v2, 0xe

    const/16 v23, 0x0

    const v24, 0xfffe

    move-object/from16 v21, v1

    const/4 v1, 0x0

    move-object/from16 v20, v3

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_2
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lb30/z;

    const/4 v3, 0x0

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lb30/z;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final l(Ljava/lang/String;ZZFZLc93/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 54

    move/from16 v2, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p8

    move-object/from16 v3, p7

    check-cast v3, Lp1/q;

    const v0, 0x18973475

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    move-object/from16 v12, p0

    if-nez v0, :cond_1

    invoke-virtual {v3, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v1, v10, 0x30

    if-nez v1, :cond_3

    move/from16 v1, p1

    invoke-virtual {v3, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    goto :goto_3

    :cond_3
    move/from16 v1, p1

    :goto_3
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v3, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_4

    :cond_4
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v3, v6}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v10, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v3, v7}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_6

    :cond_8
    const/16 v5, 0x2000

    :goto_6
    or-int/2addr v0, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v10

    const/high16 v13, 0x20000

    if-nez v5, :cond_b

    invoke-virtual {v3, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    move v5, v13

    goto :goto_7

    :cond_a
    const/high16 v5, 0x10000

    :goto_7
    or-int/2addr v0, v5

    :cond_b
    const/high16 v5, 0x180000

    and-int/2addr v5, v10

    if-nez v5, :cond_d

    invoke-virtual {v3, v9}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v5, 0x80000

    :goto_8
    or-int/2addr v0, v5

    :cond_d
    const v5, 0x92493

    and-int/2addr v5, v0

    const v14, 0x92492

    if-ne v5, v14, :cond_f

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_f
    :goto_9
    const v5, 0x7f141019

    invoke-static {v3, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    const v5, -0x5aa888e7

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    if-nez v7, :cond_10

    const v15, 0x7f1410ec

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v15, v11, v3}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v36, v11

    goto :goto_a

    :cond_10
    move-object/from16 v36, v5

    :goto_a
    const/4 v11, 0x0

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    if-eqz v7, :cond_11

    sget-object v15, Lb2/e;->K:Lb2/l;

    goto :goto_b

    :cond_11
    sget-object v15, Lb2/e;->J:Lb2/l;

    :goto_b
    const v4, -0x5aa862d3

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x70000

    and-int/2addr v4, v0

    if-ne v4, v13, :cond_12

    const/4 v4, 0x1

    goto :goto_c

    :cond_12
    move v4, v11

    :goto_c
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_13

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v13, v4, :cond_14

    :cond_13
    new-instance v13, Liy0/a;

    const/4 v4, 0x1

    invoke-direct {v13, v8, v4}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v13, Lc93/a;

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x6

    invoke-static {v4, v2, v5, v13, v12}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    if-eqz v7, :cond_15

    int-to-float v12, v11

    goto :goto_d

    :cond_15
    const/16 v12, 0x10

    int-to-float v12, v12

    :goto_d
    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, Ll0/m;->a:Ll0/e;

    invoke-static {v12, v15, v3, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move-object v15, v12

    iget-wide v11, v3, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    move/from16 v24, v0

    iget-boolean v0, v3, Lp1/q;->S:Z

    if-eqz v0, :cond_16

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_e
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v3, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v3, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    move-object/from16 v25, v0

    iget-boolean v0, v3, Lp1/q;->S:Z

    if-nez v0, :cond_17

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    :cond_17
    invoke-static {v11, v3, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v3, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x8

    int-to-float v0, v0

    const/16 v21, 0x0

    const/16 v22, 0xb

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v20, v0

    move-object/from16 v17, v4

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v1, v24, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x1b0

    shl-int/lit8 v4, v24, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v4, v1

    const/4 v5, 0x0

    move/from16 v1, p1

    move-object/from16 v8, v17

    move-object/from16 v7, v25

    invoke-static/range {v0 .. v5}, Lv8/b;->d(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    const/4 v2, 0x0

    invoke-static {v0, v1, v3, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v1, v3, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-eqz v5, :cond_19

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_19
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v3, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v3, Lp1/q;->S:Z

    if-nez v0, :cond_1a

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    :cond_1a
    invoke-static {v1, v3, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v3, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v9, :cond_1c

    const v0, -0x67b38af0

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/h9;

    iget-object v0, v0, Lg1/h9;->i:Ll3/v0;

    sget-object v42, Lp3/r;->G:Lp3/r;

    const/16 v50, 0x0

    const v51, 0xfffffb

    const-wide/16 v38, 0x0

    const-wide/16 v40, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    move-object/from16 v37, v0

    invoke-static/range {v37 .. v51}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v1

    invoke-static {v6, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    const/4 v13, 0x0

    invoke-static {v0, v1, v2, v3, v13}, Luf/c0;->u(Ll3/v0;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v13}, Lp1/q;->q(Z)V

    move v1, v13

    const/4 v0, 0x4

    const/4 v2, 0x1

    goto :goto_10

    :cond_1c
    const/4 v13, 0x0

    const v0, -0x67afa4c3

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/h9;

    iget-object v0, v0, Lg1/h9;->i:Ll3/v0;

    sget-object v42, Lp3/r;->I:Lp3/r;

    const/16 v50, 0x0

    const v51, 0xfffffb

    const-wide/16 v38, 0x0

    const-wide/16 v40, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    move-object/from16 v37, v0

    invoke-static/range {v37 .. v51}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v31

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->e()J

    move-result-wide v0

    invoke-static {v6, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    const/16 v34, 0x0

    const v35, 0xfffa

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/4 v2, 0x1

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    move-object/from16 v32, v3

    move-object v11, v14

    move-wide/from16 v52, v0

    move v1, v13

    move-wide/from16 v13, v52

    const/4 v0, 0x4

    invoke-static/range {v11 .. v35}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_10
    const v4, 0x4e9f523

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    if-eqz v36, :cond_1d

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v13, v0

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v3}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v0

    iget-object v0, v0, Lg1/h9;->i:Ll3/v0;

    invoke-static {v3}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v13, v4, Ld40/n;->e:J

    const/16 v34, 0x0

    const v35, 0xfff8

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x30

    move-object/from16 v31, v0

    move-object/from16 v32, v3

    move-object/from16 v11, v36

    invoke-static/range {v11 .. v35}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :cond_1d
    invoke-static {v3, v1, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_11
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1e

    new-instance v0, Lj00/t;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p4

    move v4, v6

    move v7, v9

    move v8, v10

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v8}, Lj00/t;-><init>(Ljava/lang/String;ZZFZLc93/a;ZI)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method public static l0(Llo/s;)V
    .locals 2

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Llo/s;->t(I)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Llo/s;->t(I)V

    invoke-virtual {p0}, Llo/s;->h()Z

    move-result v0

    invoke-virtual {p0}, Llo/s;->h()Z

    move-result v1

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Llo/s;->t(I)V

    :cond_0
    if-eqz v1, :cond_1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Llo/s;->t(I)V

    :cond_1
    return-void
.end method

.method public static final m(ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "onChange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v0, -0x4013235

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    invoke-virtual {v8, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x4000

    goto :goto_3

    :cond_3
    const/16 v5, 0x2000

    :goto_3
    or-int/2addr v0, v5

    and-int/lit16 v0, v0, 0x2493

    const/16 v5, 0x2492

    if-ne v0, v5, :cond_5

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_4
    new-instance v0, Lg1/f4;

    const/4 v5, 0x2

    move v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v2, p4

    invoke-direct/range {v0 .. v5}, Lg1/f4;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x34a48670    # -1.4383504E7f

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x30006

    const/16 v10, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v10}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_6

    new-instance v0, Lb30/m1;

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/m1;-><init>(ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static m0(Llo/s;)V
    .locals 12

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Llo/s;->i(I)I

    move-result v1

    const/4 v2, 0x6

    if-nez v1, :cond_0

    invoke-virtual {p0, v2}, Llo/s;->t(I)V

    return-void

    :cond_0
    const/16 v3, 0x10

    const/4 v4, 0x5

    const/16 v5, 0x8

    invoke-static {p0, v4, v5, v3}, Luf/c0;->h0(Llo/s;III)I

    move-result v3

    const/4 v6, 0x1

    add-int/2addr v3, v6

    const/4 v7, 0x7

    if-ne v1, v6, :cond_1

    mul-int/2addr v3, v7

    invoke-virtual {p0, v3}, Llo/s;->t(I)V

    return-void

    :cond_1
    if-ne v1, v0, :cond_9

    invoke-virtual {p0}, Llo/s;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    move v8, v6

    goto :goto_0

    :cond_2
    move v8, v4

    :goto_0
    if-eqz v1, :cond_3

    move v4, v7

    :cond_3
    if-eqz v1, :cond_4

    move v2, v5

    :cond_4
    const/4 v1, 0x0

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_9

    invoke-virtual {p0}, Llo/s;->h()Z

    move-result v9

    const/16 v10, 0xb4

    if-eqz v9, :cond_5

    invoke-virtual {p0, v7}, Llo/s;->t(I)V

    move v9, v1

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v0}, Llo/s;->i(I)I

    move-result v9

    const/4 v11, 0x3

    if-ne v9, v11, :cond_6

    invoke-virtual {p0, v4}, Llo/s;->i(I)I

    move-result v9

    mul-int/2addr v9, v8

    if-eqz v9, :cond_6

    invoke-virtual {p0}, Llo/s;->s()V

    :cond_6
    invoke-virtual {p0, v2}, Llo/s;->i(I)I

    move-result v9

    mul-int/2addr v9, v8

    if-eqz v9, :cond_7

    if-eq v9, v10, :cond_7

    invoke-virtual {p0}, Llo/s;->s()V

    :cond_7
    invoke-virtual {p0}, Llo/s;->s()V

    :goto_2
    if-eqz v9, :cond_8

    if-eq v9, v10, :cond_8

    invoke-virtual {p0}, Llo/s;->h()Z

    move-result v9

    if-eqz v9, :cond_8

    add-int/lit8 v5, v5, 0x1

    :cond_8
    add-int/2addr v5, v6

    goto :goto_1

    :cond_9
    return-void
.end method

.method public static final n(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0xc512380

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x1

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    or-int/lit8 v1, p1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p1, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    or-int/2addr v1, p1

    goto :goto_1

    :cond_2
    move v1, p1

    :goto_1
    and-int/lit8 v2, v1, 0x3

    if-ne v2, v0, :cond_4

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz p2, :cond_5

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_5
    move-object v0, p0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v2

    const p0, -0x1a6f7841

    invoke-virtual {v5, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v5, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg00/b;

    const/4 p2, 0x0

    invoke-virtual {v5, p2}, Lp1/q;->q(Z)V

    iget-wide v6, p0, Lg00/b;->f:J

    and-int/lit8 p0, v1, 0xe

    or-int/lit16 p0, p0, 0x180

    move-wide v1, v6

    const/16 v7, 0x8

    const/4 v4, 0x0

    move v6, p0

    invoke-static/range {v0 .. v7}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object p0, v0

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lb70/a;

    const/16 v1, 0xb

    invoke-direct {v0, p1, p3, v1, p0}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final n0(Lc43/v;)Lstream/video/sfu/models/PeerType;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lstream/video/sfu/models/PeerType;->PEER_TYPE_SUBSCRIBER:Lstream/video/sfu/models/PeerType;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lstream/video/sfu/models/PeerType;->PEER_TYPE_PUBLISHER_UNSPECIFIED:Lstream/video/sfu/models/PeerType;

    return-object p0
.end method

.method public static final o(ZZLn00/d;ZZZLjava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Lg2/s;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v15, p5

    move-object/from16 v0, p7

    move-object/from16 v9, p8

    move-object/from16 v4, p9

    move-object/from16 v8, p10

    move-object/from16 v12, p11

    move-object/from16 v6, p12

    move/from16 v1, p15

    move/from16 v2, p16

    const-string v7, "signUpState"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "sectionController"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "emailController"

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "phoneNumberController"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "nameController"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "emailFocusRequester"

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "changeSignupDetails"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p14

    check-cast v7, Lp1/q;

    const v10, 0x4f26d2f7

    invoke-virtual {v7, v10}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v10, v1, 0x6

    if-nez v10, :cond_1

    move/from16 v10, p0

    invoke-virtual {v7, v10}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v14, 0x4

    goto :goto_0

    :cond_0
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v14, v1

    goto :goto_1

    :cond_1
    move/from16 v10, p0

    move v14, v1

    :goto_1
    and-int/lit8 v16, v1, 0x30

    const/16 v17, 0x20

    move/from16 v13, p1

    if-nez v16, :cond_3

    invoke-virtual {v7, v13}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_2

    move/from16 v18, v17

    goto :goto_2

    :cond_2
    const/16 v18, 0x10

    :goto_2
    or-int v14, v14, v18

    :cond_3
    and-int/lit16 v11, v1, 0x180

    const/16 v18, 0x80

    const/16 v19, 0x100

    if-nez v11, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move/from16 v11, v19

    goto :goto_3

    :cond_4
    move/from16 v11, v18

    :goto_3
    or-int/2addr v14, v11

    :cond_5
    and-int/lit16 v11, v1, 0xc00

    if-nez v11, :cond_7

    move/from16 v11, p3

    invoke-virtual {v7, v11}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_6

    const/16 v20, 0x800

    goto :goto_4

    :cond_6
    const/16 v20, 0x400

    :goto_4
    or-int v14, v14, v20

    goto :goto_5

    :cond_7
    move/from16 v11, p3

    :goto_5
    and-int/lit16 v3, v1, 0x6000

    if-nez v3, :cond_9

    invoke-virtual {v7, v5}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_6

    :cond_8
    const/16 v3, 0x2000

    :goto_6
    or-int/2addr v14, v3

    :cond_9
    const/high16 v23, 0x30000

    and-int v3, v1, v23

    if-nez v3, :cond_b

    invoke-virtual {v7, v15}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v3, 0x10000

    :goto_7
    or-int/2addr v14, v3

    :cond_b
    const/high16 v3, 0x180000

    and-int/2addr v3, v1

    if-nez v3, :cond_d

    move-object/from16 v3, p6

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_c

    const/high16 v20, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v20, 0x80000

    :goto_8
    or-int v14, v14, v20

    goto :goto_9

    :cond_d
    move-object/from16 v3, p6

    :goto_9
    const/high16 v20, 0xc00000

    and-int v20, v1, v20

    if-nez v20, :cond_10

    const/high16 v20, 0x1000000

    and-int v20, v1, v20

    if-nez v20, :cond_e

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    goto :goto_a

    :cond_e
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    :goto_a
    if-eqz v20, :cond_f

    const/high16 v20, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v20, 0x400000

    :goto_b
    or-int v14, v14, v20

    :cond_10
    const/high16 v20, 0x6000000

    and-int v20, v1, v20

    if-nez v20, :cond_12

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x4000000

    goto :goto_c

    :cond_11
    const/high16 v20, 0x2000000

    :goto_c
    or-int v14, v14, v20

    :cond_12
    const/high16 v20, 0x30000000

    and-int v20, v1, v20

    if-nez v20, :cond_15

    const/high16 v20, 0x40000000    # 2.0f

    and-int v20, v1, v20

    if-nez v20, :cond_13

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    goto :goto_d

    :cond_13
    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    :goto_d
    if-eqz v20, :cond_14

    const/high16 v20, 0x20000000

    goto :goto_e

    :cond_14
    const/high16 v20, 0x10000000

    :goto_e
    or-int v14, v14, v20

    :cond_15
    move/from16 v24, v14

    and-int/lit8 v14, v2, 0x6

    if-nez v14, :cond_17

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_16

    const/16 v16, 0x4

    goto :goto_f

    :cond_16
    const/16 v16, 0x2

    :goto_f
    or-int v14, v2, v16

    goto :goto_10

    :cond_17
    move v14, v2

    :goto_10
    and-int/lit8 v16, v2, 0x30

    if-nez v16, :cond_19

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    goto :goto_11

    :cond_18
    const/16 v17, 0x10

    :goto_11
    or-int v14, v14, v17

    :cond_19
    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_1b

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    move/from16 v18, v19

    :cond_1a
    or-int v14, v14, v18

    :cond_1b
    or-int/lit16 v1, v14, 0xc00

    const v14, 0x12492493

    and-int v14, v24, v14

    const v2, 0x12492492

    if-ne v14, v2, :cond_1d

    and-int/lit16 v1, v1, 0x493

    const/16 v2, 0x492

    if-ne v1, v2, :cond_1d

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_1c

    goto :goto_13

    :cond_1c
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v15, v7

    :goto_12
    move-object/from16 v14, p13

    goto/16 :goto_17

    :cond_1d
    :goto_13
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const v14, -0xaeb55b8

    invoke-virtual {v7, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v14, v1, :cond_1e

    new-instance v14, Lj00/u;

    const/4 v1, 0x0

    invoke-direct {v14, v1}, Lj00/u;-><init>(I)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v18, v14

    check-cast v18, Lc93/a;

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const/16 v20, 0xc00

    const/16 v21, 0x6

    const/16 v17, 0x0

    move-object/from16 v16, v2

    move-object/from16 v19, v7

    invoke-static/range {v16 .. v21}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/c1;

    iget-object v14, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v14, Ln53/e;

    invoke-static {v14, v7, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v14

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_1f

    move-object/from16 v1, v16

    move-object v15, v1

    goto :goto_14

    :cond_1f
    const/16 v1, 0x10

    int-to-float v1, v1

    const/16 v18, 0x0

    const/16 v21, 0x2

    move/from16 v19, v1

    move/from16 v20, v1

    move/from16 v17, v1

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v15, v16

    :goto_14
    invoke-interface {v9}, Lg40/m3;->l()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x1

    if-eqz v16, :cond_20

    invoke-static/range {v16 .. v16}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_20

    move/from16 v16, v17

    goto :goto_15

    :cond_20
    const/16 v16, 0x0

    :goto_15
    iget-object v0, v4, Lg40/z1;->a:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v5, :cond_21

    if-eqz v16, :cond_21

    if-nez v0, :cond_21

    if-nez p5, :cond_21

    goto :goto_16

    :cond_21
    const/16 v17, 0x0

    :goto_16
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    new-instance v0, Lj00/w;

    move v10, v11

    move-object/from16 p13, v15

    move-object v11, v3

    move-object v15, v7

    move-object v3, v9

    move-object/from16 v9, p2

    move v7, v5

    move v5, v13

    move-object v13, v12

    move-object v12, v2

    move/from16 v2, v17

    invoke-direct/range {v0 .. v14}, Lj00/w;-><init>(Landroidx/compose/ui/Modifier;ZLg40/m3;Lg40/z1;ZLc93/a;ZLg40/m3;Ln00/d;ZLjava/lang/String;Lp1/c1;Lg2/s;Lp1/c1;)V

    const v1, 0x2d51cdcf

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v21

    and-int/lit8 v0, v24, 0xe

    or-int v23, v0, v23

    const/16 v24, 0x1c

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v22, v15

    move-object/from16 v17, v16

    move/from16 v16, p0

    invoke-static/range {v16 .. v24}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto/16 :goto_12

    :goto_17
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object v1, v0

    new-instance v0, Lj00/v;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v25, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lj00/v;-><init>(ZZLn00/d;ZZZLjava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Lg2/s;Lc93/a;Landroidx/compose/ui/Modifier;II)V

    move-object/from16 v1, v25

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public static final o0(Lh20/k3;)Ll3/v0;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lh20/k3;->x:Ljava/lang/Float;

    const-wide v2, 0x100000000L

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1, v2, v3}, Lv63/c;->j(FJ)J

    move-result-wide v4

    :goto_0
    move-wide v9, v4

    goto :goto_1

    :cond_0
    sget-wide v4, Ly3/o;->c:J

    goto :goto_0

    :goto_1
    iget-object v1, v0, Lh20/k3;->y:Ljava/lang/Integer;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    new-instance v5, Lp3/r;

    invoke-direct {v5, v1}, Lp3/r;-><init>(I)V

    move-object v11, v5

    goto :goto_2

    :cond_1
    move-object v11, v4

    :goto_2
    iget-object v1, v0, Lh20/k3;->w:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/16 v5, 0xe

    invoke-static {v1, v4, v5}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v1

    filled-new-array {v1}, [Lp3/x;

    move-result-object v1

    invoke-static {v1}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v4

    :cond_2
    move-object v13, v4

    iget-object v0, v0, Lh20/k3;->z:Ljava/lang/Float;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0, v2, v3}, Lv63/c;->j(FJ)J

    move-result-wide v0

    :goto_3
    move-wide v14, v0

    goto :goto_4

    :cond_3
    sget-wide v0, Ly3/o;->c:J

    goto :goto_3

    :goto_4
    new-instance v6, Ll3/v0;

    const-wide/16 v7, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const v21, 0xffff59

    invoke-direct/range {v6 .. v21}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    return-object v6
.end method

.method public static final p(Lj00/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v2, p0

    move-object/from16 v8, p2

    move/from16 v9, p5

    const-string v0, "onStateChanged"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x2d74de11

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v1, v9, 0x30

    move/from16 v11, p1

    if-nez v1, :cond_3

    invoke-virtual {v10, v11}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v9, 0x180

    const/16 v3, 0x100

    if-nez v1, :cond_5

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v9, 0xc00

    move-object/from16 v12, p3

    if-nez v1, :cond_7

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    move v13, v0

    and-int/lit16 v0, v13, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_9

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v26, v10

    goto/16 :goto_d

    :cond_9
    :goto_5
    iget-object v0, v2, Lj00/h;->I:Lec3/h2;

    const/4 v14, 0x0

    invoke-static {v0, v10, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    iget-object v1, v2, Lj00/h;->T:Lec3/r1;

    invoke-static {v1, v10, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj00/k;

    const v5, -0x5dca010

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    and-int/lit16 v5, v13, 0x380

    if-ne v5, v3, :cond_a

    const/4 v3, 0x1

    goto :goto_6

    :cond_a
    move v3, v14

    :goto_6
    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    const/4 v7, 0x0

    if-nez v3, :cond_b

    if-ne v5, v6, :cond_c

    :cond_b
    new-instance v5, Lj00/x;

    const/4 v3, 0x0

    invoke-direct {v5, v8, v0, v7, v3}, Lj00/x;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lc93/m;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-static {v10, v5, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg2/i;

    sget-object v4, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v10, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb3/x2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj00/k;

    iget-object v5, v5, Lj00/k;->k:Ln00/d;

    const v15, -0x5dc85ee

    invoke-virtual {v10, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v15, :cond_e

    if-ne v7, v6, :cond_d

    goto :goto_7

    :cond_d
    move-object/from16 v18, v0

    const/16 v19, 0x0

    goto :goto_8

    :cond_e
    :goto_7
    new-instance v15, Lj00/y;

    const/16 v20, 0x0

    move-object/from16 v18, v0

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v20}, Lj00/y;-><init>(Lg2/i;Lb3/x2;Lp1/c1;Lq83/d;I)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v15

    :goto_8
    check-cast v7, Lc93/m;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-static {v10, v7, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj00/k;

    iget-object v15, v0, Lj00/k;->b:Ljava/lang/String;

    iget-object v11, v2, Lj00/h;->O:La33/d;

    iget-object v12, v2, Lj00/h;->L:Lg40/f3;

    move/from16 v16, v13

    iget-object v13, v2, Lj00/h;->M:Lg40/z1;

    iget-object v0, v2, Lj00/h;->N:Lg40/f3;

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj00/k;

    iget-object v3, v3, Lj00/k;->k:Ln00/d;

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj00/k;

    iget-boolean v4, v4, Lj00/k;->i:Z

    iget-object v5, v2, Lj00/h;->G:Lj00/k;

    iget-object v5, v5, Lj00/k;->d:Ljava/util/List;

    sget-object v7, Lj00/c0;->y:Lj00/c0;

    invoke-interface {v5, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v17

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj00/k;

    iget-boolean v5, v5, Lj00/k;->f:Z

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj00/k;

    iget-boolean v7, v7, Lj00/k;->g:Z

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v14, v18

    check-cast v14, Lj00/k;

    iget-boolean v14, v14, Lj00/k;->h:Z

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzy/c;

    move-object/from16 v18, v0

    const v0, -0x5dc12b0

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    if-nez v1, :cond_f

    move-object/from16 v22, v19

    :goto_9
    const/4 v0, 0x0

    goto :goto_a

    :cond_f
    invoke-static {v1, v10}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_9

    :goto_a
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const v0, -0x5dc0e20

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_11

    if-ne v1, v6, :cond_10

    goto :goto_b

    :cond_10
    move-object/from16 v21, v3

    move/from16 v23, v4

    move/from16 v19, v5

    move-object v8, v6

    move/from16 v20, v7

    goto :goto_c

    :cond_11
    :goto_b
    new-instance v0, Lb30/i0;

    move-object v1, v6

    const/4 v6, 0x0

    move/from16 v20, v7

    const/16 v7, 0x13

    move-object/from16 v19, v1

    const/4 v1, 0x0

    move-object/from16 v21, v3

    const-class v3, Lj00/h;

    move/from16 v23, v4

    const-string v4, "toggleExpanded"

    move/from16 v24, v5

    const-string v5, "toggleExpanded()V"

    move-object/from16 v8, v19

    move/from16 v19, v24

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_c
    check-cast v1, Lj93/g;

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v24, v1

    check-cast v24, Lc93/a;

    const v0, -0x5dc06fb

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    if-ne v1, v8, :cond_13

    :cond_12
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x14

    const/4 v1, 0x0

    const-class v3, Lj00/h;

    const-string v4, "changeSignupDetails"

    const-string v5, "changeSignupDetails()V"

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_13
    check-cast v1, Lj93/g;

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    check-cast v1, Lc93/a;

    shl-int/lit8 v0, v16, 0xf

    const/high16 v2, 0x380000

    and-int/2addr v0, v2

    const v2, 0x9240

    or-int v27, v2, v0

    const/high16 v0, 0x70000

    shl-int/lit8 v2, v16, 0x6

    and-int v28, v2, v0

    move/from16 v16, p1

    move-object/from16 v25, p3

    move-object/from16 v26, v10

    move-object v10, v15

    move-object/from16 v15, v21

    move/from16 v21, v14

    move-object/from16 v14, v18

    move/from16 v18, v17

    move/from16 v17, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v1

    invoke-static/range {v10 .. v28}, Luf/c0;->q(Ljava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZZZLjava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_d
    invoke-virtual/range {v26 .. v26}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lj00/r;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v9

    invoke-direct/range {v0 .. v6}, Lj00/r;-><init>(Lj00/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final q(Ljava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZZZLjava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move/from16 v1, p6

    move/from16 v8, p7

    move/from16 v14, p9

    move/from16 v6, p10

    move-object/from16 v5, p13

    move-object/from16 v15, p14

    move/from16 v3, p17

    move/from16 v4, p18

    const-string v7, "merchantName"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "sectionController"

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "emailController"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "phoneNumberController"

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "nameController"

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "signUpState"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "toggleExpanded"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "changeSignupDetails"

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p16

    check-cast v7, Lp1/q;

    const v2, 0x70e3ddd4

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v3, 0x6

    const/16 v16, 0x2

    const/16 v17, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move/from16 v2, v17

    goto :goto_0

    :cond_0
    move/from16 v2, v16

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    and-int/lit8 v18, v3, 0x30

    const/16 v19, 0x10

    const/16 v20, 0x20

    if-nez v18, :cond_4

    and-int/lit8 v18, v3, 0x40

    if-nez v18, :cond_2

    invoke-virtual {v7, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    goto :goto_2

    :cond_2
    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    :goto_2
    if-eqz v18, :cond_3

    move/from16 v18, v20

    goto :goto_3

    :cond_3
    move/from16 v18, v19

    :goto_3
    or-int v2, v2, v18

    :cond_4
    and-int/lit16 v0, v3, 0x180

    const/16 v18, 0x80

    const/16 v21, 0x100

    if-nez v0, :cond_6

    invoke-virtual {v7, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move/from16 v0, v21

    goto :goto_4

    :cond_5
    move/from16 v0, v18

    :goto_4
    or-int/2addr v2, v0

    :cond_6
    and-int/lit16 v0, v3, 0xc00

    const/16 v22, 0x400

    const/16 v23, 0x800

    if-nez v0, :cond_9

    and-int/lit16 v0, v3, 0x1000

    if-nez v0, :cond_7

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_5

    :cond_7
    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_8

    move/from16 v0, v23

    goto :goto_6

    :cond_8
    move/from16 v0, v22

    :goto_6
    or-int/2addr v2, v0

    :cond_9
    and-int/lit16 v0, v3, 0x6000

    const/16 v24, 0x2000

    const/16 v25, 0x4000

    if-nez v0, :cond_b

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    move/from16 v0, v25

    goto :goto_7

    :cond_a
    move/from16 v0, v24

    :goto_7
    or-int/2addr v2, v0

    :cond_b
    const/high16 v0, 0x30000

    and-int v26, v3, v0

    const/high16 v27, 0x10000

    const/high16 v28, 0x20000

    if-nez v26, :cond_d

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_c

    move/from16 v26, v28

    goto :goto_8

    :cond_c
    move/from16 v26, v27

    :goto_8
    or-int v2, v2, v26

    :cond_d
    const/high16 v26, 0x180000

    and-int v26, v3, v26

    if-nez v26, :cond_f

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_e

    const/high16 v26, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v26, 0x80000

    :goto_9
    or-int v2, v2, v26

    :cond_f
    const/high16 v26, 0xc00000

    and-int v26, v3, v26

    move/from16 p16, v0

    if-nez v26, :cond_11

    invoke-virtual {v7, v8}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x800000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x400000

    :goto_a
    or-int v2, v2, v26

    :cond_11
    const/high16 v26, 0x6000000

    and-int v26, v3, v26

    move/from16 v0, p8

    if-nez v26, :cond_13

    invoke-virtual {v7, v0}, Lp1/q;->h(Z)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x4000000

    goto :goto_b

    :cond_12
    const/high16 v29, 0x2000000

    :goto_b
    or-int v2, v2, v29

    :cond_13
    const/high16 v29, 0x30000000

    and-int v29, v3, v29

    if-nez v29, :cond_15

    invoke-virtual {v7, v14}, Lp1/q;->h(Z)Z

    move-result v29

    if-eqz v29, :cond_14

    const/high16 v29, 0x20000000

    goto :goto_c

    :cond_14
    const/high16 v29, 0x10000000

    :goto_c
    or-int v2, v2, v29

    :cond_15
    move/from16 v29, v2

    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_17

    invoke-virtual {v7, v6}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_16

    move/from16 v16, v17

    :cond_16
    or-int v2, v4, v16

    goto :goto_d

    :cond_17
    move v2, v4

    :goto_d
    and-int/lit8 v16, v4, 0x30

    move/from16 v9, p11

    if-nez v16, :cond_19

    invoke-virtual {v7, v9}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_18

    move/from16 v19, v20

    :cond_18
    or-int v2, v2, v19

    :cond_19
    and-int/lit16 v0, v4, 0x180

    if-nez v0, :cond_1b

    move-object/from16 v0, p12

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    move/from16 v18, v21

    :cond_1a
    or-int v2, v2, v18

    goto :goto_e

    :cond_1b
    move-object/from16 v0, p12

    :goto_e
    and-int/lit16 v0, v4, 0xc00

    if-nez v0, :cond_1d

    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    move/from16 v22, v23

    :cond_1c
    or-int v2, v2, v22

    :cond_1d
    and-int/lit16 v0, v4, 0x6000

    if-nez v0, :cond_1f

    invoke-virtual {v7, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    move/from16 v24, v25

    :cond_1e
    or-int v2, v2, v24

    :cond_1f
    and-int v0, v4, p16

    if-nez v0, :cond_21

    move-object/from16 v0, p15

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_20

    move/from16 v27, v28

    :cond_20
    or-int v2, v2, v27

    :goto_f
    move/from16 v16, v2

    goto :goto_10

    :cond_21
    move-object/from16 v0, p15

    goto :goto_f

    :goto_10
    const v2, 0x12492493

    and-int v2, v29, v2

    const v1, 0x12492492

    if-ne v2, v1, :cond_23

    const v1, 0x12493

    and-int v1, v16, v1

    const v2, 0x12492

    if-ne v1, v2, :cond_23

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_22

    goto :goto_11

    :cond_22
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_24

    :cond_23
    :goto_11
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_24

    invoke-static {v7}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v1

    new-instance v3, Lp1/a0;

    invoke-direct {v3, v1}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v3

    :cond_24
    check-cast v1, Lp1/a0;

    iget-object v1, v1, Lp1/a0;->w:Lbc3/c0;

    const v3, -0x5dba43c

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_25

    invoke-static {v7}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v3

    :cond_25
    check-cast v3, Lg2/s;

    const v4, -0x5db9b14

    const/4 v13, 0x0

    invoke-static {v4, v7, v13}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_26

    new-instance v4, Lr0/c;

    invoke-direct {v4}, Lr0/c;-><init>()V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v4, Lr0/a;

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    if-nez v6, :cond_28

    if-eqz v14, :cond_27

    goto :goto_12

    :cond_27
    const/4 v13, 0x0

    goto :goto_13

    :cond_28
    :goto_12
    const/4 v13, 0x1

    :goto_13
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const v6, -0x5db882a

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    const/high16 v18, 0x1c00000

    and-int v6, v29, v18

    const/high16 v9, 0x800000

    if-ne v6, v9, :cond_29

    const/4 v9, 0x1

    goto :goto_14

    :cond_29
    const/4 v9, 0x0

    :goto_14
    invoke-virtual {v7, v13}, Lp1/q;->h(Z)Z

    move-result v19

    or-int v9, v9, v19

    move/from16 v19, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v19, :cond_2a

    if-ne v9, v2, :cond_2b

    :cond_2a
    new-instance v9, Lh20/i;

    const/4 v10, 0x0

    invoke-direct {v9, v8, v13, v3, v10}, Lh20/i;-><init>(ZZLg2/s;Lq83/d;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v9, Lc93/m;

    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    shr-int/lit8 v10, v29, 0x15

    and-int/lit8 v10, v10, 0xe

    invoke-static {v7, v9, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p6, :cond_2e

    const v9, -0x5db7455

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v7, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li2/x;

    move/from16 v19, v6

    iget-wide v5, v9, Li2/x;->a:J

    sget-object v9, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v7, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg1/c1;

    invoke-virtual {v9}, Lg1/c1;->i()Z

    move-result v9

    const-wide/high16 v21, 0x3fe0000000000000L    # 0.5

    if-eqz v9, :cond_2c

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    move-result v5

    float-to-double v5, v5

    cmpl-double v5, v5, v21

    if-lez v5, :cond_2d

    goto :goto_15

    :cond_2c
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    move-result v5

    float-to-double v5, v5

    cmpg-double v5, v5, v21

    if-gez v5, :cond_2d

    :goto_15
    const/high16 v5, 0x3f800000    # 1.0f

    :goto_16
    const/4 v6, 0x0

    goto :goto_17

    :cond_2d
    const v5, 0x3f5eb852    # 0.87f

    goto :goto_16

    :goto_17
    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_2e
    move/from16 v19, v6

    const v5, -0x5db7171

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v7, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v5, v5, Li2/x;->a:J

    sget-object v9, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v7, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg1/c1;

    invoke-virtual {v9}, Lg1/c1;->i()Z

    move-result v9

    if-eqz v9, :cond_2f

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    :goto_18
    const/4 v6, 0x0

    goto :goto_19

    :cond_2f
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    goto :goto_18

    :goto_19
    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    const v5, 0x3ec28f5c    # 0.38f

    :goto_1a
    const v6, -0xbd5da14

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    if-eqz v13, :cond_30

    sget-object v6, Li2/w0;->a:Li2/v0;

    :goto_1b
    const/4 v9, 0x0

    goto :goto_1c

    :cond_30
    invoke-static {v7}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v6

    iget v6, v6, Ld40/o;->a:F

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    goto :goto_1b

    :goto_1c
    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    const v9, -0x7b246141

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    const/16 v9, 0x30

    if-eqz v13, :cond_31

    move-object/from16 v21, v3

    move-object/from16 v24, v4

    move/from16 v23, v9

    move/from16 v22, v10

    move-object v3, v0

    :goto_1d
    const/4 v9, 0x0

    goto :goto_1e

    :cond_31
    move-object/from16 v21, v3

    move/from16 v22, v10

    const/4 v3, 0x0

    invoke-static {v3, v7, v9}, Ld40/r;->d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v10

    move/from16 v23, v9

    iget v9, v10, Lf0/t;->a:F

    iget-object v10, v10, Lf0/t;->b:Li2/t;

    invoke-static {v9, v0, v10, v6}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v10

    move-object/from16 v24, v4

    iget-wide v3, v10, Ld40/n;->a:J

    invoke-static {v9, v3, v4, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    goto :goto_1d

    :goto_1e
    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    const v4, -0x5db589b

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move/from16 v4, v19

    const/high16 v9, 0x800000

    if-ne v4, v9, :cond_32

    const/4 v4, 0x1

    goto :goto_1f

    :cond_32
    const/4 v4, 0x0

    :goto_1f
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    move-object/from16 v9, v24

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_33

    if-ne v10, v2, :cond_34

    :cond_33
    new-instance v10, Lam2/i0;

    const/16 v2, 0x8

    invoke-direct {v10, v8, v1, v9, v2}, Lam2/i0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-static {v3, v10}, Landroidx/compose/ui/focus/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v9}, Landroidx/compose/foundation/relocation/a;->a(Landroidx/compose/ui/Modifier;Lr0/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_35

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_35
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_20
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_36

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    :cond_36
    invoke-static {v1, v7, v1, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_37
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x0

    invoke-static {v2, v6, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 p16, v9

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_38

    move-object/from16 v6, p16

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_38
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_21
    invoke-static {v7, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_39

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    :cond_39
    invoke-static {v8, v7, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3a
    invoke-static {v7, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v29, 0xe

    shr-int/lit8 v1, v29, 0x12

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v9, v29, 0xc

    and-int/lit16 v1, v9, 0x380

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x6

    const/high16 v10, 0x70000

    and-int/2addr v1, v10

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x12

    const/high16 v20, 0x380000

    and-int v1, v1, v20

    or-int v8, v0, v1

    move-object/from16 v0, p0

    move/from16 v2, p6

    move/from16 v1, p7

    move/from16 v6, p10

    move v3, v5

    move v4, v13

    const/16 v19, 0x0

    move-object/from16 v5, p13

    invoke-static/range {v0 .. v8}, Luf/c0;->l(Ljava/lang/String;ZZFZLc93/a;ZLandroidx/compose/runtime/Composer;I)V

    const v0, -0x91d12ac

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    if-nez p10, :cond_3b

    shr-int/lit8 v0, v29, 0xf

    and-int/lit8 v1, v0, 0x70

    or-int v1, v22, v1

    shr-int/lit8 v2, v29, 0x9

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x1c00

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v0, v2

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0xc

    and-int v2, v1, v10

    or-int/2addr v0, v2

    and-int v1, v1, v20

    or-int/2addr v0, v1

    const/high16 v1, 0x1000000

    or-int/2addr v0, v1

    shl-int/lit8 v1, v29, 0x12

    and-int v2, v1, v18

    or-int/2addr v0, v2

    const/high16 v2, 0xe000000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    or-int/2addr v0, v2

    const/high16 v2, 0x70000000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    and-int/lit8 v1, v9, 0xe

    or-int/lit8 v1, v1, 0x30

    shr-int/lit8 v2, v16, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int v16, v1, v2

    const/4 v13, 0x0

    move-object/from16 v8, p2

    move-object/from16 v2, p5

    move/from16 v1, p6

    move/from16 v3, p8

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-object v9, v11

    move-object v10, v12

    move v4, v14

    move-object v12, v15

    move-object/from16 v11, v21

    move v15, v0

    move-object v14, v7

    move-object/from16 v7, p1

    move/from16 v0, p7

    invoke-static/range {v0 .. v16}, Luf/c0;->o(ZZLn00/d;ZZZLjava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Lg2/s;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v14

    const/4 v6, 0x0

    :goto_22
    const/4 v0, 0x1

    goto :goto_23

    :cond_3b
    move/from16 v6, v19

    goto :goto_22

    :goto_23
    invoke-static {v7, v6, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_24
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_3c

    move-object v1, v0

    new-instance v0, Lj00/s;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lj00/s;-><init>(Ljava/lang/String;La33/d;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZZZLjava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;II)V

    move-object/from16 v1, v30

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_3c
    return-void
.end method

.method public static final q0(ZLo0/o;I)I
    .locals 0

    if-eqz p0, :cond_0

    iget-object p0, p1, Lo0/o;->m:Ljava/lang/Object;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/p;

    iget p0, p0, Lo0/p;->u:I

    return p0

    :cond_0
    iget-object p0, p1, Lo0/o;->m:Ljava/lang/Object;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/p;

    iget p0, p0, Lo0/p;->v:I

    return p0
.end method

.method public static final r()Li2/l;
    .locals 2

    new-instance v0, Li2/l;

    new-instance v1, Landroid/graphics/PathMeasure;

    invoke-direct {v1}, Landroid/graphics/PathMeasure;-><init>()V

    invoke-direct {v0, v1}, Li2/l;-><init>(Landroid/graphics/PathMeasure;)V

    return-object v0
.end method

.method public static final s(Ljava/lang/String;Ljava/lang/String;Ly00/e4;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x78bdf430

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    and-int/lit16 v4, v0, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_4

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v4, p2, Ly00/e4;->E:Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    const v6, 0x7f14106e

    invoke-static {v6, v4, v5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    invoke-static {v4, v9}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v7

    const v4, 0x7f14107f

    invoke-static {v9, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v4, Lb2/t;->w:Lb2/t;

    const-string v5, "update_payment_method_sepa_debit_ui"

    invoke-static {v4, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    and-int/lit8 v4, v0, 0xe

    or-int/lit16 v4, v4, 0x6000

    and-int/lit8 v0, v0, 0x70

    or-int v10, v4, v0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v10}, Luf/c0;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_4
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_5

    new-instance v0, La01/d;

    const/4 v5, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final t(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v2, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move/from16 v9, p4

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v0, 0x27c83478

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, v2}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    invoke-virtual {v6, v4}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x93

    const/16 v3, 0x92

    if-ne v1, v3, :cond_4

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_4

    :cond_4
    :goto_3
    const v1, 0x7f1410e5

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v1

    invoke-static {v1, v6}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    const/16 v1, 0xc

    int-to-float v12, v1

    const/4 v14, 0x0

    const/16 v15, 0xd

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v7, "update_payment_method_set_as_default_checkbox"

    invoke-static {v1, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v7, v0, 0x6

    and-int/lit16 v7, v7, 0x380

    or-int/lit8 v7, v7, 0x6

    shl-int/lit8 v0, v0, 0x9

    const v8, 0xe000

    and-int/2addr v8, v0

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    and-int/2addr v0, v8

    or-int/2addr v7, v0

    const/4 v8, 0x2

    move-object v0, v1

    const/4 v1, 0x0

    invoke-static/range {v0 .. v8}, Lx30/s0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lb30/l6;

    invoke-direct {v1, v2, v4, v5, v9}, Lb30/l6;-><init>(ZZLkotlin/jvm/functions/Function1;I)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final u(Ll3/v0;JLandroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v4, 0x1eb42ef4

    invoke-virtual {v0, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    invoke-virtual {v0, v2, v3}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_3

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v22, v0

    goto/16 :goto_5

    :cond_3
    :goto_2
    const v5, 0x7f14101a

    invoke-static {v0, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f080860

    const/4 v7, 0x0

    invoke-static {v6, v0, v7}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    iget-object v8, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v8, v8, Ll3/m0;->b:J

    invoke-static {v8, v9}, Lv63/c;->a(J)V

    const-wide v10, 0xff00000000L

    and-long v12, v8, v10

    const v14, 0x3f733333    # 0.95f

    invoke-static {v8, v9, v12, v13, v14}, Ld13/a;->d(JJF)J

    move-result-wide v8

    invoke-virtual {v6}, Ln2/a;->h()J

    move-result-wide v12

    invoke-static {v12, v13}, Lh2/e;->e(J)F

    move-result v12

    invoke-virtual {v6}, Ln2/a;->h()J

    move-result-wide v13

    invoke-static {v13, v14}, Lh2/e;->c(J)F

    move-result v13

    div-float/2addr v12, v13

    invoke-static {v8, v9}, Lv63/c;->a(J)V

    and-long/2addr v10, v8

    invoke-static {v8, v9, v10, v11, v12}, Ld13/a;->d(JJF)J

    move-result-wide v16

    const v10, 0x2594d25

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    new-instance v10, Ll3/d;

    invoke-direct {v10}, Ll3/d;-><init>()V

    const-string v11, "Link"

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x6

    invoke-static {v5, v11, v12}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v11

    invoke-static {v7, v11}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const/4 v13, 0x1

    invoke-static {v13, v11}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v13, "link_logo"

    if-eqz v12, :cond_5

    if-nez v11, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v10, v12}, Ll3/d;->b(Ljava/lang/String;)V

    const-string v5, "\ufffd"

    invoke-static {v10, v13, v5}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ll3/d;->b(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual {v10, v5}, Ll3/d;->b(Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v10}, Ll3/d;->k()Ll3/g;

    move-result-object v5

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    new-instance v7, Lu0/j0;

    new-instance v15, Ll3/d0;

    const/16 v20, 0x4

    move-wide/from16 v18, v8

    invoke-direct/range {v15 .. v20}, Ll3/d0;-><init>(JJI)V

    new-instance v8, Lj00/z;

    const/4 v9, 0x0

    invoke-direct {v8, v2, v3, v6, v9}, Lj00/z;-><init>(JLjava/lang/Object;I)V

    const v6, -0x7cc459cb

    invoke-static {v6, v0, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    invoke-direct {v7, v15, v6}, Lu0/j0;-><init>(Ll3/d0;Lx1/b;)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v19

    shl-int/lit8 v6, v4, 0x3

    and-int/lit16 v6, v6, 0x380

    shl-int/lit8 v4, v4, 0x15

    const/high16 v7, 0x1c00000

    and-int v24, v4, v7

    const v25, 0x17ffa

    const/4 v1, 0x0

    move-object/from16 v22, v0

    move-object v0, v5

    const-wide/16 v4, 0x0

    move/from16 v23, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, p0

    invoke-static/range {v0 .. v25}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_5
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_6

    new-instance v0, Lg40/f0;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lg40/f0;-><init>(Ljava/lang/Object;JII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final v(Lb30/y0;Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p1, Lp1/q;

    const v0, 0x4b7c4860    # 1.65336E7f

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p2, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, p2

    goto :goto_2

    :cond_2
    move v0, p2

    :goto_2
    and-int/lit8 v2, v0, 0x3

    if-ne v2, v1, :cond_4

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_5

    :cond_4
    :goto_3
    iget-boolean v1, p0, Lb30/y0;->B:Z

    const v2, -0x684be9b5

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/16 v3, 0x20

    if-eqz v1, :cond_5

    int-to-float v4, v3

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {p1, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    and-int/lit8 v4, v0, 0xe

    invoke-static {p0, p1, v4}, Luf/c0;->x(Lb30/y0;Landroidx/compose/runtime/Composer;I)V

    :cond_5
    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    iget-boolean v4, p0, Lb30/y0;->b:Z

    if-eqz v4, :cond_7

    if-eqz v1, :cond_6

    const/16 v1, 0x10

    int-to-float v1, v1

    goto :goto_4

    :cond_6
    int-to-float v1, v3

    :goto_4
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {p1, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {p0, p1, v0}, Luf/c0;->i(Lb30/y0;Landroidx/compose/runtime/Composer;I)V

    :cond_7
    :goto_5
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lb30/j6;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lb30/j6;-><init>(Lb30/y0;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final w(Lb30/y0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    iget-object v3, v0, Lb30/y0;->D:Ll83/p;

    iget-boolean v4, v0, Lb30/y0;->g:Z

    iget-object v5, v0, Lb30/y0;->c:Lh20/l;

    const-string v6, "modifier"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v6, 0xde5e750

    invoke-virtual {v11, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v2, 0x6

    if-nez v6, :cond_2

    and-int/lit8 v6, v2, 0x8

    if-nez v6, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_0
    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    :goto_1
    or-int/2addr v6, v2

    goto :goto_2

    :cond_2
    move v6, v2

    :goto_2
    and-int/lit8 v8, v2, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_3

    :cond_3
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v6, v8

    :cond_4
    and-int/lit8 v8, v6, 0x13

    const/16 v9, 0x12

    if-ne v8, v9, :cond_6

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v11}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_6
    :goto_4
    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Landroid/content/Context;

    sget-object v8, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v8

    iget-object v9, v0, Lb30/y0;->E:Ln53/e;

    const/4 v10, 0x0

    invoke-static {v9, v11, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v16

    invoke-virtual {v5, v4}, Lh20/l;->d(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v5}, Lh20/l;->b()Z

    move-result v9

    if-eqz v9, :cond_7

    const/4 v9, 0x1

    goto :goto_5

    :cond_7
    move v9, v10

    :goto_5
    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-string v12, "update_payment_method_screen"

    invoke-static {v8, v12}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v14, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v13, v11, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v7, v5, Lh20/l;->c:Lh20/r4;

    iget-object v8, v5, Lh20/l;->b:Ly00/o4;

    instance-of v10, v7, Lh20/m4;

    const/4 v12, 0x0

    if-eqz v10, :cond_b

    const v7, -0x44042791

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb30/m0;

    const/4 v7, 0x2

    const/4 v10, 0x0

    invoke-static {v3, v12, v11, v10, v7}, Ltx/f;->a(Lb30/m0;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    move v14, v9

    move v13, v10

    const/4 v3, 0x1

    goto/16 :goto_b

    :cond_b
    const/4 v10, 0x0

    instance-of v13, v7, Lh20/n4;

    if-eqz v13, :cond_e

    const v8, -0x4400e7e5

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    check-cast v7, Lh20/n4;

    iget-object v7, v7, Lh20/n4;->a:Ly00/s2;

    instance-of v8, v7, Ly00/q2;

    if-eqz v8, :cond_c

    const v3, -0x43ff4d82

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    check-cast v7, Ly00/q2;

    move v12, v9

    iget-object v9, v7, Ly00/q2;->w:Ljava/lang/String;

    iget-object v3, v7, Ly00/q2;->x:Ljava/lang/String;

    move v7, v12

    const/16 v12, 0x36

    move v8, v7

    const/4 v7, 0x0

    move v13, v8

    const/4 v8, 0x0

    move v14, v13

    move v13, v10

    move-object v10, v3

    const/4 v3, 0x1

    invoke-static/range {v7 .. v12}, Luf/c0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move v9, v3

    goto :goto_7

    :cond_c
    move v14, v9

    move v13, v10

    const/4 v9, 0x1

    instance-of v7, v7, Ly00/r2;

    if-eqz v7, :cond_d

    const v7, -0x43f996d1

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb30/m0;

    const/4 v7, 0x2

    invoke-static {v3, v12, v11, v13, v7}, Ltx/f;->a(Lb30/m0;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_8
    move v3, v9

    goto/16 :goto_b

    :cond_d
    const v0, 0x482102e7

    invoke-static {v0, v11, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_e
    move v14, v9

    move v13, v10

    const/4 v9, 0x1

    instance-of v3, v7, Lh20/o4;

    const/4 v10, 0x0

    if-eqz v3, :cond_11

    const v3, 0x48215ed7

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    iget-object v3, v8, Ly00/o4;->F:Ly00/v3;

    if-eqz v3, :cond_f

    iget-object v8, v3, Ly00/v3;->y:Ljava/lang/String;

    goto :goto_9

    :cond_f
    move-object v8, v10

    :goto_9
    if-eqz v3, :cond_10

    iget-object v10, v3, Ly00/v3;->x:Ljava/lang/String;

    :cond_10
    check-cast v7, Lh20/o4;

    iget-object v3, v7, Lh20/o4;->a:Ly00/e4;

    const/16 v7, 0x200

    invoke-static {v8, v10, v3, v11, v7}, Luf/c0;->s(Ljava/lang/String;Ljava/lang/String;Ly00/e4;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_11
    instance-of v3, v7, Lh20/p4;

    if-eqz v3, :cond_14

    const v3, 0x48218965

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    iget-object v3, v8, Ly00/o4;->F:Ly00/v3;

    if-eqz v3, :cond_12

    iget-object v8, v3, Ly00/v3;->y:Ljava/lang/String;

    goto :goto_a

    :cond_12
    move-object v8, v10

    :goto_a
    if-eqz v3, :cond_13

    iget-object v10, v3, Ly00/v3;->x:Ljava/lang/String;

    :cond_13
    check-cast v7, Lh20/p4;

    iget-object v3, v7, Lh20/p4;->a:Ly00/l4;

    move v7, v9

    iget-object v9, v3, Ly00/l4;->y:Ljava/lang/String;

    iget-object v3, v3, Ly00/l4;->E:Ljava/lang/String;

    const/4 v12, 0x0

    move-object/from16 v23, v10

    move-object v10, v3

    move v3, v7

    move-object v7, v8

    move-object/from16 v8, v23

    invoke-static/range {v7 .. v12}, Luf/c0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_14
    move v3, v9

    sget-object v8, Lh20/q4;->a:Lh20/q4;

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    const v7, -0x43ea53d9

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_b
    iget-boolean v7, v0, Lb30/y0;->x:Z

    if-nez v7, :cond_16

    invoke-virtual {v5, v4}, Lh20/l;->d(Z)Z

    move-result v5

    if-eqz v5, :cond_15

    if-nez v4, :cond_16

    :cond_15
    move v10, v3

    goto :goto_c

    :cond_16
    move v10, v13

    :goto_c
    const v4, 0x4821d641

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    if-eqz v10, :cond_17

    and-int/lit8 v4, v6, 0xe

    invoke-static {v0, v14, v15, v11, v4}, Luf/c0;->j(Lb30/y0;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    :cond_17
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    const v4, 0x4821e9f0    # 165799.75f

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    iget-boolean v4, v0, Lb30/y0;->j:Z

    if-eqz v4, :cond_1c

    invoke-interface/range {v16 .. v16}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb30/c6;

    iget-boolean v4, v4, Lb30/c6;->c:Z

    iget-boolean v5, v0, Lb30/y0;->A:Z

    const v7, 0x48220954

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v6, 0xe

    const/4 v8, 0x4

    if-eq v7, v8, :cond_19

    and-int/lit8 v7, v6, 0x8

    if-eqz v7, :cond_18

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    goto :goto_d

    :cond_18
    move v10, v13

    goto :goto_e

    :cond_19
    :goto_d
    move v10, v3

    :goto_e
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v10, :cond_1a

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_1b

    :cond_1a
    new-instance v7, Lb30/r0;

    const/4 v8, 0x3

    invoke-direct {v7, v0, v8}, Lb30/r0;-><init>(Lb30/y0;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    invoke-static {v4, v5, v7, v11, v13}, Luf/c0;->t(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :cond_1c
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    invoke-interface/range {v16 .. v16}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb30/c6;

    iget-object v4, v4, Lb30/c6;->a:Lzy/c;

    const v5, 0x48222aaa

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    if-nez v4, :cond_1d

    goto :goto_f

    :cond_1d
    invoke-interface {v4, v15}, Lzy/c;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xc

    int-to-float v7, v5

    const/16 v21, 0x0

    const/16 v22, 0xd

    sget-object v17, Lb2/t;->w:Lb2/t;

    const/16 v18, 0x0

    const/16 v20, 0x0

    move/from16 v19, v7

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v7, "update_payment_method_error_message"

    invoke-static {v5, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0x30

    invoke-static {v4, v5, v11, v7}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    and-int/lit8 v4, v6, 0xe

    invoke-static {v0, v11, v4}, Luf/c0;->v(Lb30/y0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_1e

    new-instance v4, Lk;

    const/16 v5, 0xc

    invoke-direct {v4, v0, v1, v2, v5}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void

    :cond_1f
    const v0, 0x4820db9c

    invoke-static {v0, v11, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0
.end method

.method public static final x(Lb30/y0;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v8, p1

    check-cast v8, Lp1/q;

    const p1, 0x63295853

    invoke-virtual {v8, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_2

    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_0

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    or-int/2addr p1, p2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    and-int/lit8 v2, p1, 0x3

    const/4 v11, 0x1

    if-ne v2, v0, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_4
    :goto_3
    iget-object v2, p0, Lb30/y0;->E:Ln53/e;

    const/4 v3, 0x0

    invoke-static {v2, v8, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb30/c6;

    iget-object v4, v4, Lb30/c6;->b:Lb30/d6;

    sget-object v5, Lb30/d6;->y:Lb30/d6;

    if-ne v4, v5, :cond_5

    move v5, v11

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb30/c6;

    iget-boolean v2, v2, Lb30/c6;->d:Z

    const v4, 0x7f1410c5

    invoke-static {v8, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lb2/t;->w:Lb2/t;

    const-string v7, "update_payment_method_save_button"

    invoke-static {v6, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-string v7, "isLoading="

    invoke-static {v7, v5}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lc30/g;->a:[Lj93/z;

    const-string v9, "<this>"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lb30/y4;

    invoke-direct {v9, v7, v0}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-static {v6, v3, v9}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, -0x2fbbb30b

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, p1, 0xe

    if-eq v7, v1, :cond_7

    and-int/lit8 v9, p1, 0x8

    if-eqz v9, :cond_6

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    goto :goto_5

    :cond_6
    move v9, v3

    goto :goto_6

    :cond_7
    :goto_5
    move v9, v11

    :goto_6
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_8

    if-ne v10, v12, :cond_9

    :cond_8
    new-instance v10, Lb30/s0;

    invoke-direct {v10, p0, v11}, Lb30/s0;-><init>(Lb30/y0;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lc93/a;

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const v9, -0x2fbba34f

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    if-eq v7, v1, :cond_b

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_a

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_7

    :cond_a
    move p1, v3

    goto :goto_8

    :cond_b
    :goto_7
    move p1, v11

    :goto_8
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_c

    if-ne v1, v12, :cond_d

    :cond_c
    new-instance v1, Lb30/s0;

    invoke-direct {v1, p0, v0}, Lb30/s0;-><init>(Lb30/y0;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v7, v1

    check-cast v7, Lc93/a;

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const/16 v9, 0x6000

    move v1, v2

    move-object v2, v10

    const/16 v10, 0x40

    move-object v0, v4

    const/4 v4, 0x1

    move-object v3, v6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Lio/sentry/config/a;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_e

    new-instance v0, Lb30/j6;

    invoke-direct {v0, p0, p2, v11}, Lb30/j6;-><init>(Lb30/y0;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final y(ZZLj0/i;Lg1/e8;FFLandroidx/compose/runtime/Composer;I)Lp1/c1;
    .locals 12

    move-object/from16 v0, p6

    move/from16 v1, p7

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0xe

    invoke-static {p2, v0, v2}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    and-int/lit16 v1, v1, 0x1ffe

    move-object v3, p3

    check-cast v3, Lg1/y1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, v0

    check-cast v8, Lp1/q;

    const v4, 0x3b86960b

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    const/4 v11, 0x6

    shr-int/2addr v1, v11

    and-int/lit8 v1, v1, 0xe

    invoke-static {p2, v8, v1}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p2

    if-nez p0, :cond_0

    iget-wide p1, v3, Lg1/y1;->h:J

    :goto_0
    move-wide v4, p1

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    iget-wide p1, v3, Lg1/y1;->g:J

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-wide p1, v3, Lg1/y1;->e:J

    goto :goto_0

    :cond_2
    iget-wide p1, v3, Lg1/y1;->f:J

    goto :goto_0

    :goto_1
    const/16 p1, 0x96

    const/4 p2, 0x0

    const/4 v1, 0x0

    if-eqz p0, :cond_3

    const v3, 0x12f681b4

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-static {p1, v1, p2, v11}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v6

    const/16 v9, 0x30

    const/16 v10, 0xc

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    const v3, 0x12f8137e

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    new-instance v3, Li2/x;

    invoke-direct {v3, v4, v5}, Li2/x;-><init>(J)V

    invoke-static {v3, v8}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    move/from16 v2, p4

    goto :goto_3

    :cond_4
    move/from16 v2, p5

    :goto_3
    if-eqz p0, :cond_5

    const p0, 0x5120c64e

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-static {p1, v1, p2, v11}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    const/16 p0, 0x30

    const/16 p2, 0xc

    const/4 v4, 0x0

    move/from16 p4, p0

    move/from16 p5, p2

    move p0, v2

    move-object p2, v4

    move-object p3, v8

    invoke-static/range {p0 .. p5}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    const p0, 0x51225d6c

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    new-instance p0, Ly3/f;

    move/from16 p1, p5

    invoke-direct {p0, p1}, Ly3/f;-><init>(F)V

    invoke-static {p0, v8}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_4
    new-instance p1, Lf0/t;

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    new-instance p2, Li2/c1;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    invoke-direct {p2, v1, v2}, Li2/c1;-><init>(J)V

    invoke-direct {p1, p0, p2}, Lf0/t;-><init>(FLi2/t;)V

    invoke-static {p1, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final z(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lcf/d;->f:Lcf/d;

    sget-object v1, Lcf/d;->e:Lcf/d;

    instance-of v2, p2, Luf/b0;

    if-eqz v2, :cond_0

    move-object v2, p2

    check-cast v2, Luf/b0;

    iget v3, v2, Luf/b0;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Luf/b0;->H:I

    goto :goto_0

    :cond_0
    new-instance v2, Luf/b0;

    invoke-direct {v2, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v2, Luf/b0;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Luf/b0;->H:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object p0, v2, Luf/b0;->E:Lkotlin/jvm/internal/g0;

    iget-object p1, v2, Luf/b0;->z:Log/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v2, Luf/b0;->F:Lkotlin/jvm/internal/g0;

    iget-object p1, v2, Luf/b0;->E:Lkotlin/jvm/internal/g0;

    iget-object v1, v2, Luf/b0;->z:Log/g;

    iget-object v4, v2, Luf/b0;->y:Lcf/e;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v1

    move-object v1, p2

    move-object p2, v10

    goto/16 :goto_4

    :cond_3
    iget-object p0, v2, Luf/b0;->z:Log/g;

    iget-object p1, v2, Luf/b0;->y:Lcf/e;

    iget-object v1, v2, Luf/b0;->x:Lyf/e;

    iget-object v4, v2, Luf/b0;->w:Luf/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v10

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Luf/u;->a:Ldg/a;

    const-string v4, "<this>"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcf/l;->d:Lgf/a;

    invoke-virtual {p2, v4}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcf/e;

    if-nez p2, :cond_5

    sget-object p2, Lcf/c;->d:Lcf/c;

    :cond_5
    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    const-string v9, "httpTraceMiddleware"

    invoke-static {v4, v9}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v4

    sget-object v9, Lcf/d;->d:Lcf/d;

    invoke-virtual {p2, v9}, Lcf/e;->a(Lcf/e;)Z

    move-result v9

    if-nez v9, :cond_7

    invoke-virtual {p2, v1}, Lcf/e;->a(Lcf/e;)Z

    move-result v9

    if-eqz v9, :cond_6

    goto :goto_1

    :cond_6
    move-object v10, v4

    move-object v4, p2

    move-object p2, v10

    goto :goto_3

    :cond_7
    :goto_1
    iget-object v9, p0, Luf/u;->b:Ljava/lang/Object;

    check-cast v9, Lvf/b;

    invoke-virtual {p2, v1}, Lcf/e;->a(Lcf/e;)Z

    move-result v1

    iput-object p0, v2, Luf/b0;->w:Luf/u;

    iput-object p1, v2, Luf/b0;->x:Lyf/e;

    iput-object p2, v2, Luf/b0;->y:Lcf/e;

    iput-object v4, v2, Luf/b0;->z:Log/g;

    iput v7, v2, Luf/b0;->H:I

    invoke-static {v9, v1, v2}, Ls93/h;->k(Lvf/b;ZLs83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto/16 :goto_6

    :cond_8
    move-object v10, v4

    move-object v4, p0

    move-object p0, v10

    :goto_2
    check-cast v1, Ljava/lang/String;

    new-instance v7, Lar0/a;

    const/16 v9, 0x9

    invoke-direct {v7, v1, v9}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, v8, v7}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    move-object v10, p2

    move-object p2, p0

    move-object p0, v4

    move-object v4, v10

    :goto_3
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v8, v2, Luf/b0;->w:Luf/u;

    iput-object v8, v2, Luf/b0;->x:Lyf/e;

    iput-object v4, v2, Luf/b0;->y:Lcf/e;

    iput-object p2, v2, Luf/b0;->z:Log/g;

    iput-object v1, v2, Luf/b0;->E:Lkotlin/jvm/internal/g0;

    iput-object v1, v2, Luf/b0;->F:Lkotlin/jvm/internal/g0;

    iput v6, v2, Luf/b0;->H:I

    invoke-interface {p1, p0, v2}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v3, :cond_9

    goto :goto_6

    :cond_9
    move-object p1, v1

    move-object v1, p0

    move-object p0, p1

    :goto_4
    iput-object v1, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p0, Lcf/c;->e:Lcf/c;

    invoke-virtual {v4, p0}, Lcf/e;->a(Lcf/e;)Z

    move-result p0

    if-nez p0, :cond_b

    invoke-virtual {v4, v0}, Lcf/e;->a(Lcf/e;)Z

    move-result p0

    if-eqz p0, :cond_a

    goto :goto_5

    :cond_a
    new-instance p0, Lle3/c;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lle3/c;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-interface {p2, v8, p0}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_8

    :cond_b
    :goto_5
    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lrf/l;

    iget-object p0, p0, Lrf/l;->x:Lwf/a;

    invoke-virtual {v4, v0}, Lcf/e;->a(Lcf/e;)Z

    move-result v0

    iput-object v8, v2, Luf/b0;->w:Luf/u;

    iput-object v8, v2, Luf/b0;->x:Lyf/e;

    iput-object v8, v2, Luf/b0;->y:Lcf/e;

    iput-object p2, v2, Luf/b0;->z:Log/g;

    iput-object p1, v2, Luf/b0;->E:Lkotlin/jvm/internal/g0;

    iput-object v8, v2, Luf/b0;->F:Lkotlin/jvm/internal/g0;

    iput v5, v2, Luf/b0;->H:I

    invoke-static {p0, v0, v2}, Ls30/b;->f(Lwf/a;ZLs83/c;)Ljava/io/Serializable;

    move-result-object p0

    if-ne p0, v3, :cond_c

    :goto_6
    return-object v3

    :cond_c
    move-object v10, p2

    move-object p2, p0

    move-object p0, p1

    move-object p1, v10

    :goto_7
    check-cast p2, Ll83/k;

    iget-object v0, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lwf/a;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v1, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lrf/l;

    invoke-static {v1, v0}, Lrf/l;->b(Lrf/l;Lwf/a;)Lrf/l;

    move-result-object v0

    iput-object v0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v0, Lar0/a;

    const/16 v1, 0xa

    invoke-direct {v0, p2, v1}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v8, v0}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    move-object p1, p0

    :goto_8
    iget-object p0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public abstract Q()I
.end method

.method public abstract X(Lfr/k;)F
.end method

.method public b(I)I
    .locals 2

    invoke-virtual {p0, p1}, Luf/c0;->d0(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Luf/c0;->d0(I)I

    move-result v1

    if-ne v1, v0, :cond_1

    return v0

    :cond_1
    return p1
.end method

.method public c(I)I
    .locals 0

    invoke-virtual {p0, p1}, Luf/c0;->g0(I)I

    move-result p1

    return p1
.end method

.method public d(I)I
    .locals 0

    invoke-virtual {p0, p1}, Luf/c0;->d0(I)I

    move-result p1

    return p1
.end method

.method public abstract d0(I)I
.end method

.method public f(I)I
    .locals 2

    invoke-virtual {p0, p1}, Luf/c0;->g0(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Luf/c0;->g0(I)I

    move-result v1

    if-ne v1, v0, :cond_1

    return v0

    :cond_1
    return p1
.end method

.method public abstract g0(I)I
.end method

.method public abstract k0(Lfr/k;F)V
.end method

.method public abstract p0(Ljava/util/ArrayList;)V
.end method
