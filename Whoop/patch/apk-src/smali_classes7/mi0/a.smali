.class public final Lmi0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmi0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lmi0/a;",
        "Lwc3/c;",
        "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "c",
        "(Lzc3/e;Lcom/whoop/archv2/model/template/AnyScreenTemplate;)V",
        "Lzc3/d;",
        "decoder",
        "b",
        "(Lzc3/d;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "Lyc3/g;",
        "a",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "arch-v2_release"
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
.field public static final b:Lmi0/a$a;

.field public static final c:I

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ltr2/n;


# instance fields
.field private final a:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lmi0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmi0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmi0/a;->b:Lmi0/a$a;

    const/16 v0, 0x8

    sput v0, Lmi0/a;->c:I

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/archv2/model/template/ListTemplate;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "LIST"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/archv2/model/template/NavigationTemplate;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    const-string v4, "NAVIGATE"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/archv2/model/template/SingleItemTemplate;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    const-string v5, "SINGLE_ITEM"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/archv2/model/template/FlowTemplate;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v5, "FLOW"

    invoke-direct {v1, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lmi0/a;->d:Ljava/util/Map;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AnyScreenTemplateSerializer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lmi0/a;->e:Ltr2/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "AnyScreenTemplate"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lmi0/a;->a(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    iput-object v1, p0, Lmi0/a;->a:Lyc3/g;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final a(Lyc3/a;)Ll83/a0;
    .locals 4

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "type"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v1, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v1}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "content"

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v1, Lcom/whoop/cache/api/prefetch/PrefetchList;->Companion:Lcom/whoop/cache/api/prefetch/PrefetchList$a;

    invoke-virtual {v1}, Lcom/whoop/cache/api/prefetch/PrefetchList$a;->serializer()Lwc3/c;

    move-result-object v1

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "prefetch_list"

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v1, Lcom/whoop/design/models/modal/LifecycleInteractions;->Companion:Lcom/whoop/design/models/modal/LifecycleInteractions$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions$Companion;->serializer()Lwc3/c;

    move-result-object v1

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "lifecycle_interactions"

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v1, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    invoke-direct {v1, v0, v0}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "bindings"

    invoke-virtual {p0, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v1, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v2, Lcom/whoop/design/models/binding/AggregateBinding;->Companion:Lcom/whoop/design/models/binding/AggregateBinding$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/binding/AggregateBinding$Companion;->serializer()Lwc3/c;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "aggregate_bindings"

    invoke-virtual {p0, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public b(Lzc3/d;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;
    .locals 12

    const-string v1, "aggregate_bindings deserialization failed, returning null"

    const-string v0, "No serializer found for template type: "

    const-string v2, "Unknown template type: "

    const-string v3, "decoder"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, p1, Lad3/k;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_d

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v3

    const/4 v5, 0x0

    :try_start_0
    const-string v6, "type"

    invoke-virtual {v3, v6}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlinx/serialization/json/JsonElement;

    if-eqz v6, :cond_4

    invoke-static {v6}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v6

    invoke-static {v6}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    sget-object v7, Lmi0/a;->d:Ljava/util/Map;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "toUpperCase(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj93/d;

    if-eqz v7, :cond_3

    invoke-static {v7}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v0, "content"

    invoke-virtual {v3, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v6

    check-cast v2, Lwc3/b;

    invoke-virtual {v6, v2, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/archv2/model/template/ScreenTemplate;

    :goto_1
    move-object v7, v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v2, "Missing \"content\" field"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v2, Lkotlinx/serialization/SerializationException;

    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    new-instance v0, Lkotlinx/serialization/SerializationException;

    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v2, "Missing \"type\" field"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    sget-object v2, Lmi0/a;->e:Ltr2/n;

    const-string v6, "Template deserialization failed, returning UnknownTemplate"

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {v2, v6, v0, v7}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object v0, Lcom/whoop/archv2/model/template/UnknownTemplate;->INSTANCE:Lcom/whoop/archv2/model/template/UnknownTemplate;

    goto :goto_1

    :goto_3
    :try_start_1
    const-string v0, "prefetch_list"

    invoke-virtual {v3, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_6

    sget-object v2, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v2

    sget-object v6, Lcom/whoop/cache/api/prefetch/PrefetchList;->Companion:Lcom/whoop/cache/api/prefetch/PrefetchList$a;

    invoke-virtual {v6}, Lcom/whoop/cache/api/prefetch/PrefetchList$a;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v2, v6, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/cache/api/prefetch/PrefetchList;
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_6

    :cond_6
    :goto_4
    move-object v0, v4

    :goto_5
    move-object v8, v0

    goto :goto_7

    :goto_6
    sget-object v2, Lmi0/a;->e:Ltr2/n;

    const-string v6, "PrefetchList deserialization failed, returning null"

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v2, v6, v0, v8}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object v8, v4

    :goto_7
    :try_start_2
    const-string v0, "lifecycle_interactions"

    invoke-virtual {v3, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_8

    sget-object v2, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_8

    :cond_7
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v2

    sget-object v6, Lcom/whoop/design/models/modal/LifecycleInteractions;->Companion:Lcom/whoop/design/models/modal/LifecycleInteractions$Companion;

    invoke-virtual {v6}, Lcom/whoop/design/models/modal/LifecycleInteractions$Companion;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v2, v6, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/modal/LifecycleInteractions;
    :try_end_2
    .catch Lkotlinx/serialization/SerializationException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_9

    :catch_2
    move-exception v0

    goto :goto_a

    :cond_8
    :goto_8
    move-object v0, v4

    :goto_9
    move-object v9, v0

    goto :goto_b

    :goto_a
    sget-object v2, Lmi0/a;->e:Ltr2/n;

    const-string v6, "LifecycleInteractions deserialization failed, returning null"

    new-array v9, v5, [Lqr2/a$a;

    invoke-interface {v2, v6, v0, v9}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object v9, v4

    :goto_b
    :try_start_3
    const-string v0, "bindings"

    invoke-virtual {v3, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_a

    sget-object v2, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_c

    :cond_9
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v2

    sget-object v6, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v6, v6}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v6

    invoke-virtual {v2, v6, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_3
    .catch Lkotlinx/serialization/SerializationException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_d

    :catch_3
    move-exception v0

    goto :goto_e

    :cond_a
    :goto_c
    move-object v0, v4

    :goto_d
    move-object v10, v0

    goto :goto_f

    :goto_e
    sget-object v2, Lmi0/a;->e:Ltr2/n;

    const-string v6, "bindings deserialization failed, returning null"

    new-array v10, v5, [Lqr2/a$a;

    invoke-interface {v2, v6, v0, v10}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object v10, v4

    :goto_f
    :try_start_4
    const-string v0, "aggregate_bindings"

    invoke-virtual {v3, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_c

    sget-object v2, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_10

    :cond_b
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v2, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p1, v2, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;
    :try_end_4
    .catch Lkotlinx/serialization/SerializationException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    move-object v4, p1

    goto :goto_10

    :catch_4
    move-exception v0

    move-object p1, v0

    goto :goto_11

    :catch_5
    move-exception v0

    move-object p1, v0

    goto :goto_12

    :cond_c
    :goto_10
    move-object v11, v4

    goto :goto_13

    :goto_11
    sget-object v0, Lmi0/a;->e:Ltr2/n;

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_10

    :goto_12
    sget-object v0, Lmi0/a;->e:Ltr2/n;

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_10

    :goto_13
    new-instance v6, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-direct/range {v6 .. v11}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;-><init>(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)V

    return-object v6

    :cond_d
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "AnyScreenTemplateSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lzc3/e;Lcom/whoop/archv2/model/template/AnyScreenTemplate;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of AnyScreenTemplate not supported. Templates only deserialized from backend."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmi0/a;->b(Lzc3/d;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lmi0/a;->a:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {p0, p1, p2}, Lmi0/a;->c(Lzc3/e;Lcom/whoop/archv2/model/template/AnyScreenTemplate;)V

    return-void
.end method
