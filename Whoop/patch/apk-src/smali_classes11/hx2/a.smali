.class public final Lhx2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lhx2/a;",
        "Lwc3/c;",
        "",
        "",
        "",
        "<init>",
        "()V",
        "Lkotlinx/serialization/json/JsonElement;",
        "element",
        "b",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "c",
        "(Lzc3/e;Ljava/util/Map;)V",
        "Lzc3/d;",
        "decoder",
        "a",
        "(Lzc3/d;)Ljava/util/Map;",
        "Lwc3/c;",
        "delegateSerializer",
        "Lyc3/g;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lhx2/a;

.field private static final b:Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwc3/c;"
        }
    .end annotation
.end field

.field private static final c:Lyc3/g;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhx2/a;

    invoke-direct {v0}, Lhx2/a;-><init>()V

    sput-object v0, Lhx2/a;->a:Lhx2/a;

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v0, v1}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v0

    sput-object v0, Lhx2/a;->b:Lwc3/c;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    sput-object v0, Lhx2/a;->c:Lyc3/g;

    const/16 v0, 0x8

    sput v0, Lhx2/a;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lkotlinx/serialization/json/JsonNull;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    instance-of v0, p1, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p1}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lad3/m;->h(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    instance-of v0, p1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v3, Lhx2/a;->a:Lhx2/a;

    invoke-direct {v3, v1}, Lhx2/a;->b(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    instance-of v0, p1, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_6

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    sget-object v2, Lhx2/a;->a:Lhx2/a;

    invoke-direct {v2, v1}, Lhx2/a;->b(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-object v0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Lzc3/d;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_4

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    instance-of v0, p1, Lkotlinx/serialization/json/JsonNull;

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    instance-of v0, p1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lhx2/a;->a:Lhx2/a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-direct {v3, v1}, Lhx2/a;->b(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Expected JsonObject or null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "This serializer only works with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lzc3/e;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "encoder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string p2, "Serialization not supported for DynamicMapSerializer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lhx2/a;->a(Lzc3/d;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lhx2/a;->c:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lhx2/a;->c(Lzc3/e;Ljava/util/Map;)V

    return-void
.end method
