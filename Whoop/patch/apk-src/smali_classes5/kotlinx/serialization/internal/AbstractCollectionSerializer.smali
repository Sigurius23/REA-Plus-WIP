.class public abstract Lkotlinx/serialization/internal/AbstractCollectionSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Element:",
        "Ljava/lang/Object;",
        "Collection:",
        "Ljava/lang/Object;",
        "Builder:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010(\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u0004B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0002H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\r\u001a\u00020\n*\u00028\u0001H$\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H$\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\t\u001a\u00028\u0002H$\u00a2\u0006\u0004\u0008\t\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00028\u0002H$\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u0013\u0010\u0014\u001a\u00028\u0001*\u00028\u0002H$\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00028\u0002*\u00028\u0001H$\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0018*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\nH$\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0001H&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010\"\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00018\u0001H\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008$\u0010%J1\u0010)\u001a\u00020\u00182\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00022\u0008\u0008\u0002\u0010(\u001a\u00020\'H$\u00a2\u0006\u0004\u0008)\u0010*J/\u0010,\u001a\u00020\u00182\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH$\u00a2\u0006\u0004\u0008,\u0010-\u0082\u0001\u0002./\u00a8\u00060"
    }
    d2 = {
        "Lkotlinx/serialization/internal/AbstractCollectionSerializer;",
        "Element",
        "Collection",
        "Builder",
        "Lwc3/c;",
        "<init>",
        "()V",
        "Lzc3/b;",
        "decoder",
        "builder",
        "",
        "readSize",
        "(Lzc3/b;Ljava/lang/Object;)I",
        "collectionSize",
        "(Ljava/lang/Object;)I",
        "",
        "collectionIterator",
        "(Ljava/lang/Object;)Ljava/util/Iterator;",
        "()Ljava/lang/Object;",
        "builderSize",
        "toResult",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "toBuilder",
        "size",
        "Ll83/a0;",
        "checkCapacity",
        "(Ljava/lang/Object;I)V",
        "Lzc3/e;",
        "encoder",
        "value",
        "serialize",
        "(Lzc3/e;Ljava/lang/Object;)V",
        "Lzc3/d;",
        "previous",
        "merge",
        "(Lzc3/d;Ljava/lang/Object;)Ljava/lang/Object;",
        "deserialize",
        "(Lzc3/d;)Ljava/lang/Object;",
        "index",
        "",
        "checkIndex",
        "readElement",
        "(Lzc3/b;ILjava/lang/Object;Z)V",
        "startIndex",
        "readAll",
        "(Lzc3/b;Ljava/lang/Object;II)V",
        "Lkotlinx/serialization/internal/CollectionLikeSerializer;",
        "Lkotlinx/serialization/internal/MapLikeSerializer;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;-><init>()V

    return-void
.end method

.method public static synthetic readElement$default(Lkotlinx/serialization/internal/AbstractCollectionSerializer;Lzc3/b;ILjava/lang/Object;ZILjava/lang/Object;)V
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->readElement(Lzc3/b;ILjava/lang/Object;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readElement"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final readSize(Lzc3/b;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            "TBuilder;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/b;->decodeCollectionSize(Lyc3/g;)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->checkCapacity(Ljava/lang/Object;I)V

    return p1
.end method


# virtual methods
.method public abstract builder()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilder;"
        }
    .end annotation
.end method

.method public abstract builderSize(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TBuilder;)I"
        }
    .end annotation
.end method

.method public abstract checkCapacity(Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TBuilder;I)V"
        }
    .end annotation
.end method

.method public abstract collectionIterator(Ljava/lang/Object;)Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCollection;)",
            "Ljava/util/Iterator<",
            "TElement;>;"
        }
    .end annotation
.end method

.method public abstract collectionSize(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCollection;)I"
        }
    .end annotation
.end method

.method public deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")TCollection;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->merge(Lzc3/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract synthetic getDescriptor()Lyc3/g;
.end method

.method public final merge(Lzc3/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            "TCollection;)TCollection;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-virtual {p0, p2}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->toBuilder(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v3, p2

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->builder()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :goto_2
    invoke-virtual {p0, v3}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->builderSize(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v1

    invoke-interface {v1}, Lzc3/b;->decodeSequentially()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0, v1, v3}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->readSize(Lzc3/b;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, v1, v3, p2, p1}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->readAll(Lzc3/b;Ljava/lang/Object;II)V

    :cond_2
    move-object v0, p0

    goto :goto_4

    :cond_3
    :goto_3
    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {v1, p1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    add-int v2, p2, p1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->readElement$default(Lkotlinx/serialization/internal/AbstractCollectionSerializer;Lzc3/b;ILjava/lang/Object;ZILjava/lang/Object;)V

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {v1, p1}, Lzc3/b;->endStructure(Lyc3/g;)V

    invoke-virtual {p0, v3}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->toResult(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract readAll(Lzc3/b;Ljava/lang/Object;II)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            "TBuilder;II)V"
        }
    .end annotation
.end method

.method public abstract readElement(Lzc3/b;ILjava/lang/Object;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            "ITBuilder;Z)V"
        }
    .end annotation
.end method

.method public abstract serialize(Lzc3/e;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "TCollection;)V"
        }
    .end annotation
.end method

.method public abstract toBuilder(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCollection;)TBuilder;"
        }
    .end annotation
.end method

.method public abstract toResult(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TBuilder;)TCollection;"
        }
    .end annotation
.end method
