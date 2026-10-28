.class public final Lmp/z0;
.super Lmp/b1;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Lmp/s;


# direct methods
.method public constructor <init>(Lmp/s;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lmp/z0;->x:Lmp/s;

    invoke-virtual {p1}, Lmp/o;->a()Lmp/p;

    move-result-object p1

    invoke-virtual {p1}, Lmp/i;->e()Lmp/e0;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmp/b1;

    invoke-virtual {v2}, Lmp/b1;->b()I

    move-result v2

    if-ge v0, v2, :cond_1

    move v0, v2

    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmp/b1;

    invoke-virtual {v1}, Lmp/b1;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lmp/z0;->w:I

    const/16 p1, 0x8

    if-gt v0, p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/fido/zzhf;

    const-string v0, "Exceeded cutoff limit for max depth of cbor value"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, -0x60

    invoke-static {v0}, Lmp/b1;->d(B)I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lmp/z0;->w:I

    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lmp/b1;

    invoke-virtual {p1}, Lmp/b1;->a()I

    move-result v0

    const/16 v1, -0x60

    invoke-static {v1}, Lmp/b1;->d(B)I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lmp/b1;->a()I

    move-result p1

    sub-int/2addr v1, p1

    return v1

    :cond_0
    check-cast p1, Lmp/z0;

    iget-object p1, p1, Lmp/z0;->x:Lmp/s;

    iget-object v0, p0, Lmp/z0;->x:Lmp/s;

    iget-object v1, v0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    iget-object v2, p1, Lmp/s;->z:Lmp/n;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-eq v1, v2, :cond_1

    iget-object v0, v0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    iget-object p1, p1, Lmp/s;->z:Lmp/n;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    sub-int/2addr v0, p1

    return v0

    :cond_1
    invoke-virtual {v0}, Lmp/o;->a()Lmp/p;

    move-result-object v0

    invoke-virtual {v0}, Lmp/i;->e()Lmp/e0;

    move-result-object v0

    invoke-virtual {p1}, Lmp/o;->a()Lmp/p;

    move-result-object p1

    invoke-virtual {p1}, Lmp/i;->e()Lmp/e0;

    move-result-object p1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmp/b1;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmp/b1;

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_5

    return v3

    :cond_5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmp/b1;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmp/b1;

    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_2

    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    const-class v1, Lmp/z0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lmp/z0;

    iget-object v0, p0, Lmp/z0;->x:Lmp/s;

    iget-object p1, p1, Lmp/z0;->x:Lmp/s;

    invoke-virtual {v0, p1}, Lmp/o;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, -0x60

    invoke-static {v0}, Lmp/b1;->d(B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lmp/z0;->x:Lmp/s;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lmp/z0;->x:Lmp/s;

    invoke-virtual {v0}, Lmp/o;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Lmp/o;->a()Lmp/p;

    move-result-object v0

    invoke-virtual {v0}, Lmp/i;->e()Lmp/e0;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmp/b1;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\n"

    const-string v5, "\n  "

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmp/b1;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Lg73/a;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lg73/a;-><init>(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\n  "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :try_start_0
    invoke-static {v2, v1, v0}, Lmp/b;->g(Ljava/lang/StringBuilder;Ljava/util/Iterator;Lg73/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "\n}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
