.class public abstract Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\t\u0008\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00028\u0000H\u0017\u00a2\u0006\u0004\u0008\u0017\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;",
        "",
        "T",
        "Lwc3/c;",
        "<init>",
        "()V",
        "Lzc3/b;",
        "compositeDecoder",
        "decodeSequentially",
        "(Lzc3/b;)Ljava/lang/Object;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Ljava/lang/Object;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Ljava/lang/Object;",
        "",
        "klassName",
        "Lwc3/b;",
        "findPolymorphicSerializerOrNull",
        "(Lzc3/b;Ljava/lang/String;)Lwc3/b;",
        "Lwc3/j;",
        "(Lzc3/e;Ljava/lang/Object;)Lwc3/j;",
        "Lj93/d;",
        "getBaseClass",
        "()Lj93/d;",
        "baseClass",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$decodeSequentially(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->decodeSequentially(Lzc3/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final decodeSequentially(Lzc3/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lva3/l;->k(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;Ljava/lang/String;)Lwc3/b;

    move-result-object v0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {p1, v1, v2, v0, v3}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")TT;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object p1

    invoke-interface {p1}, Lzc3/b;->decodeSequentially()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->access$decodeSequentially(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move-object v2, v1

    move-object v3, v2

    :goto_0
    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v4

    invoke-interface {p1, v4}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_5

    if-eqz v4, :cond_4

    const/4 v2, 0x1

    if-eq v4, v2, :cond_2

    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid index in polymorphic deserialization of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v3, :cond_1

    const-string v3, "unknown class"

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n Expected 0, 1 or DECODE_DONE(-1), but found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {p0, p1, v3}, Lva3/l;->k(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;Ljava/lang/String;)Lwc3/b;

    move-result-object v2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v5

    invoke-interface {p1, v5, v4, v2, v1}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot read polymorphic value before its type token"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v3

    invoke-interface {p1, v3, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_5
    if-eqz v2, :cond_6

    move-object v1, v2

    :goto_1
    invoke-interface {p1, v0}, Lzc3/b;->endStructure(Lyc3/g;)V

    return-object v1

    :cond_6
    const-string p1, "Polymorphic value has not been read for class "

    invoke-static {p1, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public findPolymorphicSerializerOrNull(Lzc3/b;Ljava/lang/String;)Lwc3/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/b;",
            "Ljava/lang/String;",
            ")",
            "Lwc3/b;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Lzc3/b;->getSerializersModule()Lcd3/f;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getBaseClass()Lj93/d;

    move-result-object v0

    check-cast p1, Lcd3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v1, "baseClass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v1, p1, Lcd3/d;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    instance-of v3, v1, Lwc3/c;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_2

    .line 4
    check-cast v1, Lwc3/b;

    return-object v1

    .line 5
    :cond_2
    iget-object p1, p1, Lcd3/d;->e:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/m0;->f(ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p1, Lkotlin/jvm/functions/Function1;

    goto :goto_2

    :cond_3
    move-object p1, v2

    :goto_2
    if-eqz p1, :cond_4

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwc3/b;

    return-object p1

    :cond_4
    return-object v2
.end method

.method public findPolymorphicSerializerOrNull(Lzc3/e;Ljava/lang/Object;)Lwc3/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "TT;)",
            "Lwc3/j;"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-interface {p1}, Lzc3/e;->getSerializersModule()Lcd3/f;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getBaseClass()Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcd3/f;->c(Lj93/d;Ljava/lang/Object;)Lwc3/j;

    move-result-object p1

    return-object p1
.end method

.method public abstract getBaseClass()Lj93/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj93/d;"
        }
    .end annotation
.end method

.method public abstract synthetic getDescriptor()Lyc3/g;
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lva3/l;->l(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/e;Ljava/lang/Object;)Lwc3/j;

    move-result-object v0

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {p1, v1}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v2

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v3

    invoke-interface {v3}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {p1, v2, v4, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, v2, v3, v0, p2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method
