.class public abstract Lkotlinx/serialization/internal/MapLikeSerializer;
.super Lkotlinx/serialization/internal/AbstractCollectionSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        "Collection:",
        "Ljava/lang/Object;",
        "Builder::",
        "Ljava/util/Map<",
        "TKey;TValue;>;>",
        "Lkotlinx/serialization/internal/AbstractCollectionSerializer<",
        "Ljava/util/Map$Entry<",
        "+TKey;+TValue;>;TCollection;TBuilder;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u0003*\u0014\u0008\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\u0008\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0012\u001a\u00020\u0011*\u00028\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H$\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0004\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010#\u001a\u0004\u0008$\u0010%R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010#\u001a\u0004\u0008&\u0010%R\u0014\u0010*\u001a\u00020\'8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u0082\u0001\u0002+,\u00a8\u0006-"
    }
    d2 = {
        "Lkotlinx/serialization/internal/MapLikeSerializer;",
        "Key",
        "Value",
        "Collection",
        "",
        "Builder",
        "Lkotlinx/serialization/internal/AbstractCollectionSerializer;",
        "",
        "Lwc3/c;",
        "keySerializer",
        "valueSerializer",
        "<init>",
        "(Lwc3/c;Lwc3/c;)V",
        "",
        "index",
        "key",
        "value",
        "Ll83/a0;",
        "insertKeyValuePair",
        "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V",
        "Lzc3/b;",
        "decoder",
        "builder",
        "startIndex",
        "size",
        "readAll",
        "(Lzc3/b;Ljava/util/Map;II)V",
        "",
        "checkIndex",
        "readElement",
        "(Lzc3/b;ILjava/util/Map;Z)V",
        "Lzc3/e;",
        "encoder",
        "serialize",
        "(Lzc3/e;Ljava/lang/Object;)V",
        "Lwc3/c;",
        "getKeySerializer",
        "()Lwc3/c;",
        "getValueSerializer",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "Lkotlinx/serialization/internal/HashMapSerializer;",
        "Lkotlinx/serialization/internal/LinkedHashMapSerializer;",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final keySerializer:Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwc3/c;"
        }
    .end annotation
.end field

.field private final valueSerializer:Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwc3/c;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lwc3/c;Lwc3/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwc3/c;",
            "Lwc3/c;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->keySerializer:Lwc3/c;

    .line 4
    iput-object p2, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->valueSerializer:Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(Lwc3/c;Lwc3/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlinx/serialization/internal/MapLikeSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-void
.end method


# virtual methods
.method public abstract getDescriptor()Lyc3/g;
.end method

.method public final getKeySerializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->keySerializer:Lwc3/c;

    return-object v0
.end method

.method public final getValueSerializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->valueSerializer:Lwc3/c;

    return-object v0
.end method

.method public abstract insertKeyValuePair(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TBuilder;ITKey;TValue;)V"
        }
    .end annotation
.end method

.method public bridge synthetic readAll(Lzc3/b;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/MapLikeSerializer;->readAll(Lzc3/b;Ljava/util/Map;II)V

    return-void
.end method

.method public final readAll(Lzc3/b;Ljava/util/Map;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            "TBuilder;II)V"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p4, :cond_3

    const/4 v0, 0x2

    mul-int/2addr p4, v0

    const/4 v1, 0x0

    .line 2
    invoke-static {v1, p4}, Le93/b;->i0(II)Li93/j;

    move-result-object p4

    invoke-static {v0, p4}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object p4

    .line 3
    iget v0, p4, Li93/h;->w:I

    .line 4
    iget v2, p4, Li93/h;->x:I

    .line 5
    iget p4, p4, Li93/h;->y:I

    if-lez p4, :cond_0

    if-le v0, v2, :cond_1

    :cond_0
    if-gez p4, :cond_2

    if-gt v2, v0, :cond_2

    :cond_1
    :goto_0
    add-int v3, p3, v0

    .line 6
    invoke-virtual {p0, p1, v3, p2, v1}, Lkotlinx/serialization/internal/MapLikeSerializer;->readElement(Lzc3/b;ILjava/util/Map;Z)V

    if-eq v0, v2, :cond_2

    add-int/2addr v0, p4

    goto :goto_0

    :cond_2
    return-void

    .line 7
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Size must be known in advance when using READ_ALL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic readElement(Lzc3/b;ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/MapLikeSerializer;->readElement(Lzc3/b;ILjava/util/Map;Z)V

    return-void
.end method

.method public final readElement(Lzc3/b;ILjava/util/Map;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            "ITBuilder;Z)V"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->keySerializer:Lwc3/c;

    check-cast v1, Lwc3/b;

    const/4 v2, 0x0

    .line 3
    invoke-interface {p1, v0, p2, v1, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz p4, :cond_1

    .line 4
    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-interface {p1, p4}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result p4

    add-int/lit8 v1, p2, 0x1

    if-ne p4, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    const-string p1, "Value must follow key in a map, index for key: "

    const-string p3, ", returned index for value: "

    .line 6
    invoke-static {p2, p4, p1, p3}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    add-int/lit8 p4, p2, 0x1

    .line 8
    :goto_0
    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->valueSerializer:Lwc3/c;

    invoke-interface {p2}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-interface {p2}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p2

    instance-of p2, p2, Lyc3/f;

    if-nez p2, :cond_2

    .line 9
    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object p2

    iget-object v1, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->valueSerializer:Lwc3/c;

    check-cast v1, Lwc3/b;

    invoke-static {v0, p3}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, p2, p4, v1, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object p2

    iget-object v1, p0, Lkotlinx/serialization/internal/MapLikeSerializer;->valueSerializer:Lwc3/c;

    check-cast v1, Lwc3/b;

    .line 11
    invoke-interface {p1, p2, p4, v1, v2}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 12
    :goto_1
    invoke-interface {p3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "TCollection;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->collectionSize(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lzc3/e;->beginCollection(Lyc3/g;I)Lzc3/c;

    move-result-object p1

    invoke-virtual {p0, p2}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->collectionIterator(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object v4

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getKeySerializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/j;

    invoke-interface {p1, v4, v0, v6, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getDescriptor()Lyc3/g;

    move-result-object v3

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/MapLikeSerializer;->getValueSerializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-interface {p1, v3, v5, v4, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method
