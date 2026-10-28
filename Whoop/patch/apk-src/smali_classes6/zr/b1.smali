.class public final Lzr/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;


# static fields
.field public static final G:Lzr/b1;


# instance fields
.field public final transient E:[Ljava/lang/Object;

.field public final transient F:I

.field public transient w:Lzr/y0;

.field public transient x:Lzr/z0;

.field public transient y:Lzr/a1;

.field public final transient z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzr/b1;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lzr/b1;-><init>([Ljava/lang/Object;ILjava/lang/Object;)V

    sput-object v0, Lzr/b1;->G:Lzr/b1;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lzr/b1;->z:Ljava/lang/Object;

    iput-object p1, p0, Lzr/b1;->E:[Ljava/lang/Object;

    iput p2, p0, Lzr/b1;->F:I

    return-void
.end method

.method public static a(Ljava/util/Map;)Lzr/b1;
    .locals 4

    instance-of v0, p0, Lzr/b1;

    if-eqz v0, :cond_0

    instance-of v0, p0, Ljava/util/SortedMap;

    if-nez v0, :cond_0

    check-cast p0, Lzr/b1;

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    :goto_0
    new-instance v2, Lab/h0;

    invoke-direct {v2, v1}, Lab/h0;-><init>(I)V

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, v2, Lab/h0;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v3, v1

    if-le v0, v3, :cond_2

    array-length v3, v1

    invoke-static {v3, v0}, Lzr/a0;->e(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lab/h0;->y:Ljava/lang/Object;

    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lab/h0;->i()Lzr/b1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lzr/j0;
    .locals 3

    iget-object v0, p0, Lzr/b1;->w:Lzr/y0;

    if-nez v0, :cond_0

    new-instance v0, Lzr/y0;

    iget-object v1, p0, Lzr/b1;->E:[Ljava/lang/Object;

    iget v2, p0, Lzr/b1;->F:I

    invoke-direct {v0, p0, v1, v2}, Lzr/y0;-><init>(Lzr/b1;[Ljava/lang/Object;I)V

    iput-object v0, p0, Lzr/b1;->w:Lzr/y0;

    :cond_0
    return-object v0
.end method

.method public final c()Lzr/b0;
    .locals 4

    iget-object v0, p0, Lzr/b1;->y:Lzr/a1;

    if-nez v0, :cond_0

    new-instance v0, Lzr/a1;

    const/4 v1, 0x1

    iget v2, p0, Lzr/b1;->F:I

    iget-object v3, p0, Lzr/b1;->E:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Lzr/a1;-><init>(II[Ljava/lang/Object;)V

    iput-object v0, p0, Lzr/b1;->y:Lzr/a1;

    :cond_0
    return-object v0
.end method

.method public final clear()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lzr/b1;->c()Lzr/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lzr/b1;->b()Lzr/j0;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p1, p0}, Lzr/q;->e(Ljava/lang/Object;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    move-object p1, v0

    goto/16 :goto_4

    :cond_1
    iget-object v1, p0, Lzr/b1;->E:[Ljava/lang/Object;

    iget v2, p0, Lzr/b1;->F:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    aget-object v2, v1, v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    aget-object p1, v1, v3

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :cond_2
    iget-object v2, p0, Lzr/b1;->z:Ljava/lang/Object;

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    instance-of v4, v2, [B

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, [B

    array-length v2, v4

    add-int/lit8 v5, v2, -0x1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Lzr/q;->p(I)I

    move-result v2

    :goto_1
    and-int/2addr v2, v5

    aget-byte v6, v4, v2

    const/16 v7, 0xff

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_4

    goto :goto_0

    :cond_4
    aget-object v7, v1, v6

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    xor-int/lit8 p1, v6, 0x1

    aget-object p1, v1, p1

    goto :goto_4

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    instance-of v4, v2, [S

    if-eqz v4, :cond_9

    move-object v4, v2

    check-cast v4, [S

    array-length v2, v4

    add-int/lit8 v5, v2, -0x1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Lzr/q;->p(I)I

    move-result v2

    :goto_2
    and-int/2addr v2, v5

    aget-short v6, v4, v2

    const v7, 0xffff

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_7

    goto :goto_0

    :cond_7
    aget-object v7, v1, v6

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    xor-int/lit8 p1, v6, 0x1

    aget-object p1, v1, p1

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    check-cast v2, [I

    array-length v4, v2

    sub-int/2addr v4, v3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-static {v5}, Lzr/q;->p(I)I

    move-result v5

    :goto_3
    and-int/2addr v5, v4

    aget v6, v2, v5

    const/4 v7, -0x1

    if-ne v6, v7, :cond_a

    goto/16 :goto_0

    :cond_a
    aget-object v7, v1, v6

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    xor-int/lit8 p1, v6, 0x1

    aget-object p1, v1, p1

    :goto_4
    if-nez p1, :cond_b

    return-object v0

    :cond_b
    return-object p1

    :cond_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_3
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lzr/b1;->b()Lzr/j0;

    move-result-object v0

    invoke-static {v0}, Lzr/q;->j(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lzr/b1;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lzr/b1;->x:Lzr/z0;

    if-nez v0, :cond_0

    new-instance v0, Lzr/a1;

    const/4 v1, 0x0

    iget v2, p0, Lzr/b1;->F:I

    iget-object v3, p0, Lzr/b1;->E:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Lzr/a1;-><init>(II[Ljava/lang/Object;)V

    new-instance v1, Lzr/z0;

    invoke-direct {v1, p0, v0}, Lzr/z0;-><init>(Lzr/b1;Lzr/a1;)V

    iput-object v1, p0, Lzr/b1;->x:Lzr/z0;

    return-object v1

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lzr/b1;->F:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, "size"

    iget v1, p0, Lzr/b1;->F:I

    invoke-static {v1, v0}, Lzr/q;->c(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    int-to-long v1, v1

    const-wide/16 v3, 0x8

    mul-long/2addr v1, v3

    const-wide/32 v3, 0x40000000

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzr/b1;->b()Lzr/j0;

    move-result-object v1

    check-cast v1, Lzr/y0;

    invoke-virtual {v1}, Lzr/y0;->o()Lzr/k1;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    move-object v3, v1

    check-cast v3, Lzr/e0;

    invoke-virtual {v3}, Lzr/e0;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-nez v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lzr/b1;->c()Lzr/b0;

    move-result-object v0

    return-object v0
.end method
