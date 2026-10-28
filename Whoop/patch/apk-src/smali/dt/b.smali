.class public abstract Ldt/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs A([Ljava/lang/Object;)Ljava/util/Set;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    array-length v1, p0

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {p0, v0}, Lm83/n;->S0([Ljava/lang/Object;Ljava/util/HashSet;)V

    return-object v0
.end method

.method public static B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 3

    if-eqz p0, :cond_2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static C(Ljava/lang/String;)Lbg/l;
    .locals 3

    const-string v0, "scheme"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbg/l;->e:Ljava/util/LinkedHashMap;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbg/l;

    if-nez v0, :cond_0

    new-instance v0, Lbg/l;

    const/4 v1, -0x1

    invoke-direct {v0, p0, v1}, Lbg/l;-><init>(Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method

.method public static D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    add-int/2addr v1, v0

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    :goto_1
    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1, p1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    return-object v1
.end method

.method public static F()V
    .locals 5

    const-string v0, " => "

    const-string v1, "Iterable Call"

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " => Line #"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "Couldn\'t print info"

    invoke-static {v1, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static G(Ljava/nio/MappedByteBuffer;)Li6/b;
    .locals 13

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    const/16 v1, 0x64

    const-string v2, "Cannot read metadata."

    if-gt v0, v1, :cond_5

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    const-wide v4, 0xffffffffL

    const-wide/16 v6, -0x1

    if-ge v3, v0, :cond_1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v9

    add-int/lit8 v9, v9, 0x4

    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v4

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v11

    add-int/lit8 v11, v11, 0x4

    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const v11, 0x6d657461

    if-ne v11, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-wide v9, v6

    :goto_1
    cmp-long v0, v9, v6

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    int-to-long v6, v0

    sub-long v6, v9, v6

    long-to-int v0, v6

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0xc

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    int-to-long v6, v0

    and-long/2addr v6, v4

    :goto_2
    int-to-long v11, v1

    cmp-long v0, v11, v6

    if-gez v0, :cond_4

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    int-to-long v11, v3

    and-long/2addr v11, v4

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    const v3, 0x456d6a69

    if-eq v3, v0, :cond_3

    const v3, 0x656d6a69

    if-ne v3, v0, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    add-long/2addr v11, v9

    long-to-int v0, v11

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v0, Li6/b;

    invoke-direct {v0}, Li6/c;-><init>()V

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v1

    iput-object p0, v0, Li6/c;->z:Ljava/lang/Object;

    iput v2, v0, Li6/c;->w:I

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    sub-int/2addr v2, p0

    iput v2, v0, Li6/c;->x:I

    iget-object p0, v0, Li6/c;->z:Ljava/lang/Object;

    check-cast p0, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p0

    iput p0, v0, Li6/c;->y:I

    return-object v0

    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final H(Lkotlin/jvm/functions/Function1;Lp1/q;)Lh0/x2;
    .locals 2

    invoke-static {p0, p1}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lf1/a0;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0}, Lf1/a0;-><init>(ILp1/c1;)V

    new-instance p0, Lh0/d0;

    invoke-direct {p0, v0}, Lh0/d0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, p0

    :cond_0
    check-cast v0, Lh0/x2;

    return-object v0
.end method

.method public static final I(La0/v0;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    invoke-virtual {p0, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, v0, La0/w0;

    if-eqz v2, :cond_2

    check-cast v0, La0/w0;

    invoke-virtual {v0, p2}, La0/w0;->l(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v0}, La0/w0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return p2

    :cond_2
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0

    :cond_3
    return v1
.end method

.method public static final J(La0/v0;Ljava/lang/Object;)V
    .locals 13

    iget-object v0, p0, La0/v0;->a:[J

    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_5

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    aget-wide v4, v0, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_4

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_3

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_2

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    iget-object v10, p0, La0/v0;->b:[Ljava/lang/Object;

    aget-object v10, v10, v9

    iget-object v10, p0, La0/v0;->c:[Ljava/lang/Object;

    aget-object v10, v10, v9

    instance-of v11, v10, La0/w0;

    if-eqz v11, :cond_0

    check-cast v10, La0/w0;

    invoke-virtual {v10, p1}, La0/w0;->l(Ljava/lang/Object;)Z

    invoke-virtual {v10}, La0/w0;->g()Z

    move-result v10

    goto :goto_2

    :cond_0
    if-ne v10, p1, :cond_1

    const/4 v10, 0x1

    goto :goto_2

    :cond_1
    move v10, v2

    :goto_2
    if-eqz v10, :cond_2

    invoke-virtual {p0, v9}, La0/v0;->l(I)Ljava/lang/Object;

    :cond_2
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    if-ne v6, v7, :cond_5

    :cond_4
    if-eq v3, v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static final K(FJLy3/c;)F
    .locals 4

    sget-wide v0, Ly3/o;->c:J

    invoke-static {p1, p2, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return p0

    :cond_0
    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3, p1, p2}, Ly3/c;->K(J)F

    move-result p0

    return p0

    :cond_1
    const-wide v2, 0x200000000L

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    mul-float/2addr p1, p0

    return p1

    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0
.end method

.method public static final L(FJLy3/c;)F
    .locals 4

    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Ly3/c;->m0()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3ff0cccccccccccdL    # 1.05

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-interface {p3, p0}, Ly3/c;->q(F)J

    move-result-wide v0

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    invoke-static {v0, v1}, Ly3/o;->c(J)F

    move-result p2

    div-float/2addr p1, p2

    :goto_0
    mul-float/2addr p1, p0

    return p1

    :cond_0
    invoke-interface {p3, p1, p2}, Ly3/c;->K(J)F

    move-result p0

    return p0

    :cond_1
    const-wide v2, 0x200000000L

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    goto :goto_0

    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0
.end method

.method public static M(I)I
    .locals 1

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x20

    shl-int p0, v0, p0

    return p0
.end method

.method public static final N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 12

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const/4 v10, 0x0

    const v11, 0x7fffc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v3, p0

    move v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final O(Landroid/text/TextPaint;F)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    const/16 v0, 0xff

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_2
    return-void
.end method

.method public static final P(Landroid/text/Spannable;JII)V
    .locals 2

    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 p1, 0x21

    invoke-interface {p0, v0, p3, p4, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    return-void
.end method

.method public static final Q(Landroid/text/Spannable;JLy3/c;II)V
    .locals 6

    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v2

    const/16 v3, 0x21

    if-eqz v2, :cond_0

    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    invoke-interface {p3, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-interface {p0, v0, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void

    :cond_0
    const-wide v4, 0x200000000L

    invoke-static {v0, v1, v4, v5}, Ly3/p;->a(JJ)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-interface {p0, p3, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    return-void
.end method

.method public static final R(Landroid/text/Spannable;Ls3/b;II)V
    .locals 2

    if-eqz p1, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object p1, p1, Ls3/b;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/a;

    iget-object v1, v1, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/util/Locale;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/util/Locale;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/util/Locale;

    new-instance v0, Landroid/os/LocaleList;

    invoke-direct {v0, p1}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    new-instance p1, Landroid/text/style/LocaleSpan;

    invoke-direct {p1, v0}, Landroid/text/style/LocaleSpan;-><init>(Landroid/os/LocaleList;)V

    const/16 v0, 0x21

    invoke-interface {p0, p1, p2, p3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    return-void
.end method

.method public static S(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    const-string v0, "singleton(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final T(Lq83/d;Lbc3/a;)V
    .locals 1

    :try_start_0
    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, p0}, Lhc3/b;->g(Ljava/lang/Object;Lq83/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    instance-of v0, p0, Lkotlinx/coroutines/DispatchException;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlinx/coroutines/DispatchException;

    iget-object p0, p0, Lkotlinx/coroutines/DispatchException;->w:Ljava/lang/Throwable;

    :cond_0
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbc3/a;->resumeWith(Ljava/lang/Object;)V

    throw p0
.end method

.method public static U(Ljava/util/ArrayList;)V
    .locals 2

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :cond_2
    new-instance v0, Lrx/exceptions/CompositeException;

    invoke-direct {v0, p0}, Lrx/exceptions/CompositeException;-><init>(Ljava/util/List;)V

    throw v0

    :cond_3
    return-void
.end method

.method public static V(Ljava/lang/Throwable;)V
    .locals 1

    instance-of v0, p0, Lrx/exceptions/OnErrorNotImplementedException;

    if-nez v0, :cond_5

    instance-of v0, p0, Lrx/exceptions/OnErrorFailedException;

    if-nez v0, :cond_4

    instance-of v0, p0, Lrx/exceptions/OnCompletedFailedException;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/VirtualMachineError;

    if-nez v0, :cond_2

    instance-of v0, p0, Ljava/lang/ThreadDeath;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/LinkageError;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Ljava/lang/LinkageError;

    throw p0

    :cond_1
    check-cast p0, Ljava/lang/ThreadDeath;

    throw p0

    :cond_2
    check-cast p0, Ljava/lang/VirtualMachineError;

    throw p0

    :cond_3
    check-cast p0, Lrx/exceptions/OnCompletedFailedException;

    throw p0

    :cond_4
    check-cast p0, Lrx/exceptions/OnErrorFailedException;

    throw p0

    :cond_5
    check-cast p0, Lrx/exceptions/OnErrorNotImplementedException;

    throw p0
.end method

.method public static W(Ljava/lang/Throwable;Lxg3/h;)V
    .locals 0

    invoke-static {p0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-interface {p1, p0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static X(Ljava/lang/Throwable;Lxg3/h;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-static {p2, p0}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final Y(Ljava/lang/Throwable;Lc93/a;)Z
    .locals 3

    invoke-static {p0}, Lpf/c;->B(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    instance-of v1, v1, Landroidx/compose/runtime/tooling/DiagnosticComposeException;

    if-eqz v1, :cond_1

    return v2

    :cond_2
    :goto_0
    :try_start_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v2, v0, 0x1

    if-nez v0, :cond_3

    new-instance v0, Landroidx/compose/runtime/tooling/DiagnosticComposeException;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/tooling/DiagnosticComposeException;-><init>(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :goto_1
    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_4

    invoke-static {p0, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    return v2
.end method

.method public static Z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    invoke-static {v0}, Ldt/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " \ud83d\udc9b "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static final a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 27

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v5, p9

    check-cast v5, Lp1/q;

    const v0, -0x40a548e5

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    move-object/from16 v8, p0

    if-nez v0, :cond_1

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, v11, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v2, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_2

    move-object/from16 v2, p1

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :goto_3
    and-int/lit8 v3, v11, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v4, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_5

    move/from16 v4, p2

    invoke-virtual {v5, v4}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :goto_5
    and-int/lit8 v6, v11, 0x8

    const/4 v12, 0x0

    if-eqz v6, :cond_8

    or-int/lit16 v0, v0, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v6, v10, 0xc00

    if-nez v6, :cond_a

    invoke-virtual {v5, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x800

    goto :goto_6

    :cond_9
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v0, v6

    :cond_a
    :goto_7
    and-int/lit16 v6, v10, 0x6000

    if-nez v6, :cond_d

    and-int/lit8 v6, v11, 0x10

    if-nez v6, :cond_b

    move-object/from16 v6, p3

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/16 v7, 0x4000

    goto :goto_8

    :cond_b
    move-object/from16 v6, p3

    :cond_c
    const/16 v7, 0x2000

    :goto_8
    or-int/2addr v0, v7

    goto :goto_9

    :cond_d
    move-object/from16 v6, p3

    :goto_9
    const/high16 v7, 0x30000

    and-int/2addr v7, v10

    if-nez v7, :cond_f

    and-int/lit8 v7, v11, 0x20

    move-object/from16 v13, p4

    if-nez v7, :cond_e

    invoke-virtual {v5, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    const/high16 v7, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v7, 0x10000

    :goto_a
    or-int/2addr v0, v7

    goto :goto_b

    :cond_f
    move-object/from16 v13, p4

    :goto_b
    and-int/lit8 v14, v11, 0x40

    const/high16 v7, 0x180000

    if-eqz v14, :cond_10

    or-int/2addr v0, v7

    move-object/from16 v15, p5

    goto :goto_d

    :cond_10
    and-int/2addr v7, v10

    move-object/from16 v15, p5

    if-nez v7, :cond_12

    invoke-virtual {v5, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    const/high16 v7, 0x100000

    goto :goto_c

    :cond_11
    const/high16 v7, 0x80000

    :goto_c
    or-int/2addr v0, v7

    :cond_12
    :goto_d
    const/high16 v7, 0xc00000

    and-int/2addr v7, v10

    if-nez v7, :cond_15

    and-int/lit16 v7, v11, 0x80

    if-nez v7, :cond_13

    move-object/from16 v7, p6

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_13
    move-object/from16 v7, p6

    :cond_14
    const/high16 v16, 0x400000

    :goto_e
    or-int v0, v0, v16

    goto :goto_f

    :cond_15
    move-object/from16 v7, p6

    :goto_f
    and-int/lit16 v12, v11, 0x100

    const/high16 v16, 0x6000000

    if-eqz v12, :cond_17

    or-int v0, v0, v16

    :cond_16
    move/from16 v16, v12

    move-object/from16 v12, p7

    goto :goto_11

    :cond_17
    and-int v16, v10, v16

    if-nez v16, :cond_16

    move/from16 v16, v12

    move-object/from16 v12, p7

    invoke-virtual {v5, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v17, 0x2000000

    :goto_10
    or-int v0, v0, v17

    :goto_11
    const/high16 v23, 0x30000000

    and-int v17, v10, v23

    if-nez v17, :cond_1a

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/high16 v17, 0x20000000

    goto :goto_12

    :cond_19
    const/high16 v17, 0x10000000

    :goto_12
    or-int v0, v0, v17

    :cond_1a
    move/from16 v17, v0

    const v0, 0x12492493

    and-int v0, v17, v0

    move/from16 v18, v1

    const v1, 0x12492492

    const/4 v12, 0x0

    const/16 v19, 0x1

    if-eq v0, v1, :cond_1b

    move/from16 v0, v19

    goto :goto_13

    :cond_1b
    move v0, v12

    :goto_13
    and-int/lit8 v1, v17, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v0, v10, 0x1

    const v24, -0x1c00001

    const v20, -0x70001

    const v21, -0xe001

    if-eqz v0, :cond_20

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v0, v11, 0x10

    if-eqz v0, :cond_1d

    and-int v17, v17, v21

    :cond_1d
    and-int/lit8 v0, v11, 0x20

    if-eqz v0, :cond_1e

    and-int v17, v17, v20

    :cond_1e
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_1f

    and-int v17, v17, v24

    :cond_1f
    move v0, v12

    move-object v12, v5

    move v5, v0

    move-object/from16 v1, p7

    move v14, v4

    move-object/from16 v20, v15

    move/from16 v0, v17

    const/4 v3, 0x0

    move-object v15, v13

    goto/16 :goto_1d

    :cond_20
    :goto_14
    if-eqz v18, :cond_21

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object/from16 v25, v0

    goto :goto_15

    :cond_21
    move-object/from16 v25, v2

    :goto_15
    if-eqz v3, :cond_22

    move/from16 v26, v19

    goto :goto_16

    :cond_22
    move/from16 v26, v4

    :goto_16
    and-int/lit8 v0, v11, 0x10

    if-eqz v0, :cond_23

    const/high16 v6, 0x30000

    const/16 v7, 0x1f

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lg1/v0;->b(FFFFFLandroidx/compose/runtime/Composer;II)Lg1/q1;

    move-result-object v0

    and-int v17, v17, v21

    move-object v6, v0

    :cond_23
    and-int/lit8 v0, v11, 0x20

    if-eqz v0, :cond_24

    invoke-static {}, Lg1/m5;->a()Lp1/u2;

    move-result-object v0

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/l5;

    invoke-virtual {v0}, Lg1/l5;->c()Lt0/a;

    move-result-object v0

    and-int v17, v17, v20

    :goto_17
    move/from16 v1, v17

    goto :goto_18

    :cond_24
    move-object v0, v13

    goto :goto_17

    :goto_18
    if-eqz v14, :cond_25

    const/4 v2, 0x0

    goto :goto_19

    :cond_25
    move-object v2, v15

    :goto_19
    and-int/lit16 v3, v11, 0x80

    if-eqz v3, :cond_26

    const/16 v21, 0x6000

    const/16 v22, 0xf

    move v3, v12

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    move/from16 v4, v16

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v20, v5

    move v5, v3

    const/4 v3, 0x0

    invoke-static/range {v12 .. v22}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    move-object/from16 v12, v20

    and-int v1, v1, v24

    :goto_1a
    move/from16 v17, v1

    goto :goto_1b

    :cond_26
    move v3, v12

    move-object v12, v5

    move v5, v3

    move/from16 v4, v16

    const/4 v3, 0x0

    move-object/from16 v7, p6

    goto :goto_1a

    :goto_1b
    if-eqz v4, :cond_27

    sget-object v1, Lg1/v0;->a:Ll0/l1;

    :goto_1c
    move-object v15, v0

    move-object/from16 v20, v2

    move/from16 v0, v17

    move-object/from16 v2, v25

    move/from16 v14, v26

    goto :goto_1d

    :cond_27
    move-object/from16 v1, p7

    goto :goto_1c

    :goto_1d
    invoke-virtual {v12}, Lp1/q;->r()V

    const v4, 0x1dab67c0

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v4, v13, :cond_28

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_28
    check-cast v4, Lj0/i;

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    shr-int/lit8 v3, v0, 0x6

    check-cast v7, Lg1/m1;

    invoke-virtual {v7, v14, v12}, Lg1/m1;->a(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v13, :cond_29

    new-instance v8, Lf0/q1;

    const/4 v13, 0x4

    invoke-direct {v8, v13}, Lf0/q1;-><init>(I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-static {v2, v13, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v13, -0x270e63e3

    invoke-virtual {v12, v13}, Lp1/q;->e0(I)V

    if-eqz v14, :cond_2a

    iget-wide v10, v7, Lg1/m1;->a:J

    goto :goto_1e

    :cond_2a
    iget-wide v10, v7, Lg1/m1;->c:J

    :goto_1e
    new-instance v13, Li2/x;

    invoke-direct {v13, v10, v11}, Li2/x;-><init>(J)V

    invoke-static {v13, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v10

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li2/x;

    iget-wide v10, v10, Li2/x;->a:J

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Li2/x;

    move-object/from16 p1, v7

    move-object/from16 p2, v8

    iget-wide v7, v13, Li2/x;->a:J

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v18

    if-nez v6, :cond_2b

    const v7, 0x1db19c41

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    goto :goto_1f

    :cond_2b
    const/4 v13, 0x0

    const v7, 0x5389dbc0

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v7, v3, 0x38e

    invoke-virtual {v6, v14, v4, v12, v7}, Lg1/q1;->a(ZLj0/i;Landroidx/compose/runtime/Composer;I)Ld0/m;

    move-result-object v7

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_1f
    if-eqz v7, :cond_2c

    iget-object v7, v7, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/f;

    iget v7, v7, Ly3/f;->w:F

    :goto_20
    move/from16 v21, v7

    goto :goto_21

    :cond_2c
    int-to-float v7, v13

    goto :goto_20

    :goto_21
    new-instance v7, Lg1/y0;

    invoke-direct {v7, v5, v1, v9}, Lg1/y0;-><init>(Lp1/c1;Ll0/k1;Lkotlin/jvm/functions/Function3;)V

    const v5, -0x136739e

    invoke-static {v5, v12, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    and-int/lit8 v7, v0, 0xe

    or-int v7, v7, v23

    and-int/lit16 v8, v0, 0x380

    or-int/2addr v7, v8

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v3, v7

    const/high16 v7, 0x380000

    and-int/2addr v0, v7

    or-int v25, v3, v0

    const/16 v26, 0x0

    move-object/from16 v13, p2

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-wide/from16 v16, v10

    move-object/from16 v24, v12

    move-object/from16 v12, p0

    invoke-static/range {v12 .. v26}, Lhg3/i;->l(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JJLf0/t;FLj0/i;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v7, p1

    move-object v8, v1

    move-object v4, v6

    move v3, v14

    move-object v5, v15

    move-object/from16 v6, v20

    move-object/from16 v20, v24

    goto :goto_22

    :cond_2d
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move v3, v4

    move-object/from16 v20, v5

    move-object v4, v6

    move-object v5, v13

    move-object v6, v15

    :goto_22
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2e

    new-instance v0, Lg1/w0;

    move-object/from16 v1, p0

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lg1/w0;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method public static a0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x5

    invoke-static {v0}, Ldt/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " \ud83e\udde1\ufe0f "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static final b(Leb/q;Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p3, Lp1/q;

    const v0, -0x5e232270

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit16 v0, v0, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_3

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v0, Lm8/a;->a:Lp1/b0;

    invoke-virtual {v0, p0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    sget-object v1, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v1, p0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalSavedStateRegistryOwner()Lp1/t1;

    move-result-object v2

    invoke-virtual {v2, p0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lp1/u1;

    move-result-object v0

    new-instance v1, La3/n1;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p1, p2}, La3/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x3279f30

    invoke-static {v2, p3, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p3, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_4

    new-instance v0, Lgb/r;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lgb/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {v0}, Ldt/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " \ud83e\udde1 "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V
    .locals 12

    move-object/from16 v9, p6

    move/from16 v0, p8

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-static {}, Lg1/m5;->a()Lp1/u2;

    move-result-object v1

    invoke-virtual {v9, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/l5;

    invoke-virtual {v1}, Lg1/l5;->c()Lt0/a;

    move-result-object v6

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    sget p3, Lg1/v0;->d:F

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v9, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v1

    const v3, 0x3df5c28f    # 0.12f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    invoke-static {p3, v1, v2}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object p3

    :cond_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    const-wide/16 v2, 0x0

    const/4 v5, 0x7

    const-wide/16 v0, 0x0

    move-object v4, v9

    invoke-static/range {v0 .. v5}, Lg1/v0;->c(JJLp1/q;I)Lg1/m1;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object/from16 v0, p4

    :goto_0
    sget-object v7, Lg1/v0;->a:Ll0/l1;

    const v1, 0x7ffffffe

    and-int v10, p7, v1

    const/4 v11, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    move v2, p2

    move-object v5, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object v4, v6

    move-object v6, v0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    move-object/from16 v9, p8

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    move v2, p2

    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_2

    invoke-static {}, Lg1/m5;->a()Lp1/u2;

    move-result-object p1

    move-object p2, v9

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/l5;

    invoke-virtual {p1}, Lg1/l5;->c()Lt0/a;

    move-result-object p3

    :cond_2
    move-object v4, p3

    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    move-object v5, p1

    goto :goto_0

    :cond_3
    move-object/from16 v5, p4

    :goto_0
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_4

    const-wide/16 p1, 0x0

    const/4 p3, 0x7

    invoke-static {p1, p2, v9, p3}, Lg1/v0;->d(JLandroidx/compose/runtime/Composer;I)Lg1/m1;

    move-result-object p1

    move-object v6, p1

    goto :goto_1

    :cond_4
    move-object/from16 v6, p5

    :goto_1
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_5

    sget-object p1, Lg1/v0;->e:Ll0/l1;

    move-object v7, p1

    goto :goto_2

    :cond_5
    move-object/from16 v7, p6

    :goto_2
    const p1, 0x7ffffffe

    and-int v10, p9, p1

    const/4 v11, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v11}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final e(Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x483b17a9

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_5

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_6

    :cond_5
    :goto_3
    const v0, 0x671a9c9b

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    invoke-static {v5}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v1

    if-eqz v1, :cond_8

    instance-of v0, v1, Landroidx/lifecycle/r;

    if-eqz v0, :cond_6

    move-object v0, v1

    check-cast v0, Landroidx/lifecycle/r;

    invoke-interface {v0}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v0

    :goto_4
    move-object v4, v0

    goto :goto_5

    :cond_6
    sget-object v0, Ll8/a;->b:Ll8/a;

    goto :goto_4

    :goto_5
    const-class v0, Lgb/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lpf/c;->c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    check-cast v0, Lgb/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lgb/a;->x:Ljava/lang/ref/WeakReference;

    iget-object v0, v0, Lgb/a;->w:Ljava/util/UUID;

    and-int/lit8 v1, p2, 0x70

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/2addr p2, v1

    invoke-interface {p0, v0, p1, v5, p2}, Ly1/c;->c(Ljava/lang/Object;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lgb/s;

    invoke-direct {v0, p0, p1, p3}, Lgb/s;-><init>(Ly1/c;Lx1/b;I)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(La0/v0;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p0, p1}, La0/v0;->f(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, La0/v0;->c:[Ljava/lang/Object;

    aget-object v2, v2, v0

    :goto_1
    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    instance-of v3, v2, La0/w0;

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, La0/w0;

    invoke-virtual {v3, p2}, La0/w0;->a(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    if-eq v2, p2, :cond_4

    new-instance v3, La0/w0;

    invoke-direct {v3}, La0/w0;-><init>()V

    invoke-virtual {v3, v2}, La0/w0;->a(Ljava/lang/Object;)Z

    invoke-virtual {v3, p2}, La0/w0;->a(Ljava/lang/Object;)Z

    move-object p2, v3

    goto :goto_3

    :cond_4
    :goto_2
    move-object p2, v2

    :goto_3
    if-eqz v1, :cond_5

    not-int v0, v0

    iget-object v1, p0, La0/v0;->b:[Ljava/lang/Object;

    aput-object p1, v1, v0

    iget-object p0, p0, La0/v0;->c:[Ljava/lang/Object;

    aput-object p2, p0, v0

    return-void

    :cond_5
    iget-object p0, p0, La0/v0;->c:[Ljava/lang/Object;

    aput-object p2, p0, v0

    return-void
.end method

.method public static g(Ln83/i;)Ln83/i;
    .locals 1

    iget-object v0, p0, Ln83/i;->w:Ln83/f;

    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    iget v0, v0, Ln83/f;->I:I

    if-lez v0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ln83/i;->x:Ln83/i;

    return-object p0
.end method

.method public static final h(Ljava/lang/String;)Lo63/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo63/e;

    invoke-direct {v0, p0}, Lo63/e;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static i()La0/v0;
    .locals 1

    sget-object v0, La0/d1;->a:[J

    new-instance v0, La0/v0;

    invoke-direct {v0}, La0/v0;-><init>()V

    return-object v0
.end method

.method public static j()Lp1/c1;
    .locals 3

    sget-object v0, Lp1/v0;->y:Lp1/v0;

    new-instance v1, Lp1/k1;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v1, v2, v0}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    return-object v1
.end method

.method public static k(Ljava/lang/String;Lud3/h0;)Lud3/z0;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lvo/c;->b(Lud3/h0;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/charset/Charset;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Lud3/h0;

    new-instance v1, Lne3/h;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "charset"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, "string"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "charset"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    if-ltz v2, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v2, v4, :cond_1

    sget-object v4, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3, v2, p0}, Lne3/h;->t1(IILjava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v2, "substring(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-string v0, "getBytes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    array-length v2, p0

    invoke-virtual {v1, p0, v0, v2}, Lne3/h;->write([BII)V

    :goto_0
    iget-wide v2, v1, Lne3/h;->x:J

    new-instance p0, Lud3/z0;

    invoke-direct {p0, p1, v2, v3, v1}, Lud3/z0;-><init>(Lud3/h0;JLne3/h;)V

    return-object p0

    :cond_1
    const-string p1, "endIndex > string.length: "

    const-string v0, " > "

    invoke-static {v2, p1, v0}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string p0, "endIndex < beginIndex: "

    const-string p1, " < "

    invoke-static {v2, v3, p0, p1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;
    .locals 8

    const-string v0, "db"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "tables"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Landroidx/room/v;->c:Landroidx/room/i2;

    invoke-virtual {v3, p1}, Landroidx/room/i2;->g([Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v1, p1, Ll83/k;->w:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, [Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, [I

    const-string p1, "resolvedTableNames"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "tableIds"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroidx/lifecycle/e1;

    const/4 v7, 0x2

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v7}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v2}, Lec3/s1;-><init>(Lc93/m;)V

    iget-object v0, v0, Landroidx/room/v;->j:Landroidx/room/c0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v5}, Landroidx/room/c0;->a([Ljava/lang/String;)Landroidx/room/y;

    move-result-object v6

    :cond_0
    const/4 v0, 0x2

    if-eqz v6, :cond_1

    new-array v1, v0, [Lec3/l;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v6, v1, p1

    invoke-static {v1}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object p1

    :cond_1
    const/4 v1, -0x1

    invoke-static {p1, v1, v0}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p1

    new-instance v1, Lec3/l1;

    invoke-direct {v1, p1, p0, p2, v0}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    return-object v1
.end method

.method public static m(Ljava/lang/Object;Ljava/lang/Long;ZLio/sentry/util/network/c;Ljava/util/List;Lio/sentry/util/network/d;)La3/p;
    .locals 2

    if-eqz p2, :cond_0

    invoke-interface {p3, p0}, Lio/sentry/util/network/c;->a(Ljava/lang/Object;)Lxl/a;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p5, p0}, Lio/sentry/util/network/d;->a(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object p0

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance p5, Ljava/util/HashSet;

    invoke-direct {p5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_1
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/Map$Entry;

    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-interface {p3, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance p0, La3/p;

    const/16 p4, 0xd

    invoke-direct {p0, p1, p2, p3, p4}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x3

    invoke-static {v0}, Ldt/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " \ud83d\udc9a "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static final o(Li63/x;)Li63/w;
    .locals 9

    new-instance v0, Li63/x;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lal/a;-><init>(I)V

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lal/a;->x0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_0

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_0
    const/16 v4, 0xf

    const/4 v5, 0x0

    invoke-static {v5, v5, v4, v2, v5}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x1

    const/16 v8, 0xb

    invoke-static {v5, v5, v8, v6, v7}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2, v4}, Lal/a;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_2
    new-instance p0, Li63/y;

    iget-object v0, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const-string v1, "values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lo63/o;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x6

    invoke-static {v0}, Ldt/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " \u2764\ufe0f "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    const/4 v0, 0x6

    invoke-static {v0}, Ldt/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " \u2764\ufe0f "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final r(Landroid/app/Activity;I)Leb/a0;
    .locals 3

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroidx/core/app/ActivityCompat;->requireViewById(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    const-string v1, "requireViewById<View>(activity, viewId)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Leb/c;->G:Leb/c;

    invoke-static {v0, v1}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v0

    sget-object v1, Leb/c;->H:Leb/c;

    invoke-static {v0, v1}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Activity "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have a NavController set on "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final s(Landroid/view/View;)Leb/a0;
    .locals 3

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/c;->G:Leb/c;

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v0

    sget-object v1, Leb/c;->H:Leb/c;

    invoke-static {v0, v1}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " does not have a NavController set"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic t(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;I)Ljava/util/Collection;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->m:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    :cond_0
    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;->w:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;

    invoke-interface {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lb5/c;->b(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final v(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const v0, 0x7f0a0d65

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/view/ViewParent;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewParent;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static varargs w([Ljava/lang/Object;)Ljava/util/HashSet;
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    array-length v1, p0

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    invoke-static {p0, v0}, Lm83/n;->S0([Ljava/lang/Object;Ljava/util/HashSet;)V

    return-object v0
.end method

.method public static x(I)Z
    .locals 1

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/iterable/iterableapi/w;->d:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    :goto_0
    if-lt p0, v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    if-nez v2, :cond_1

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v2, v4

    move v4, v1

    :cond_1
    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->x0(Ljava/lang/Iterable;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, Ljava/util/LinkedHashSet;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    return-object v0
.end method
