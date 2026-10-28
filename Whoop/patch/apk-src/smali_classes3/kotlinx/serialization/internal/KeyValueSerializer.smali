.class public abstract Lkotlinx/serialization/internal/KeyValueSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u00032\u0008\u0012\u0004\u0012\u00028\u00020\u0004B%\u0008\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0018R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00028\u0001*\u00028\u00028$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001b\u0082\u0001\u0002\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkotlinx/serialization/internal/KeyValueSerializer;",
        "K",
        "V",
        "R",
        "Lwc3/c;",
        "keySerializer",
        "valueSerializer",
        "<init>",
        "(Lwc3/c;Lwc3/c;)V",
        "key",
        "value",
        "toResult",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "Lzc3/e;",
        "encoder",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Ljava/lang/Object;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Ljava/lang/Object;",
        "Lwc3/c;",
        "getKeySerializer",
        "()Lwc3/c;",
        "getValueSerializer",
        "getKey",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "getValue",
        "Lkotlinx/serialization/internal/MapEntrySerializer;",
        "Lkotlinx/serialization/internal/PairSerializer;",
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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwc3/c;",
            "Lwc3/c;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lkotlinx/serialization/internal/KeyValueSerializer;->keySerializer:Lwc3/c;

    .line 4
    iput-object p2, p0, Lkotlinx/serialization/internal/KeyValueSerializer;->valueSerializer:Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(Lwc3/c;Lwc3/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlinx/serialization/internal/KeyValueSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-void
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")TR;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object p1

    invoke-interface {p1}, Lzc3/b;->decodeSequentially()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getKeySerializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-interface {p1, v1, v2, v5, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getValueSerializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-interface {p1, v2, v3, v5, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lkotlinx/serialization/internal/KeyValueSerializer;->toResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-static {}, Lkotlinx/serialization/internal/TuplesKt;->access$getNULL$p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlinx/serialization/internal/TuplesKt;->access$getNULL$p()Ljava/lang/Object;

    move-result-object v5

    :goto_0
    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v6

    invoke-interface {p1, v6}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    if-ne v6, v3, :cond_1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v5

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getValueSerializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-interface {p1, v5, v3, v6, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Invalid index: "

    invoke-static {v6, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getKeySerializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-interface {p1, v1, v2, v6, v4}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-static {}, Lkotlinx/serialization/internal/TuplesKt;->access$getNULL$p()Ljava/lang/Object;

    move-result-object v2

    if-eq v1, v2, :cond_5

    invoke-static {}, Lkotlinx/serialization/internal/TuplesKt;->access$getNULL$p()Ljava/lang/Object;

    move-result-object v2

    if-eq v5, v2, :cond_4

    invoke-virtual {p0, v1, v5}, Lkotlinx/serialization/internal/KeyValueSerializer;->toResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    invoke-interface {p1, v0}, Lzc3/b;->endStructure(Lyc3/g;)V

    return-object v1

    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'value\' is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Element \'key\' is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract synthetic getDescriptor()Lyc3/g;
.end method

.method public abstract getKey(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)TK;"
        }
    .end annotation
.end method

.method public final getKeySerializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/KeyValueSerializer;->keySerializer:Lwc3/c;

    return-object v0
.end method

.method public abstract getValue(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)TV;"
        }
    .end annotation
.end method

.method public final getValueSerializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/serialization/internal/KeyValueSerializer;->valueSerializer:Lwc3/c;

    return-object v0
.end method

.method public serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "TR;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/serialization/internal/KeyValueSerializer;->keySerializer:Lwc3/c;

    check-cast v1, Lwc3/j;

    invoke-virtual {p0, p2}, Lkotlinx/serialization/internal/KeyValueSerializer;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/serialization/internal/KeyValueSerializer;->valueSerializer:Lwc3/c;

    check-cast v1, Lwc3/j;

    invoke-virtual {p0, p2}, Lkotlinx/serialization/internal/KeyValueSerializer;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x1

    invoke-interface {p1, v0, v2, v1, p2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/KeyValueSerializer;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public abstract toResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TR;"
        }
    .end annotation
.end method
