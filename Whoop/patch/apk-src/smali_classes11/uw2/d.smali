.class public final Luw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luw2/d$a;
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
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J)\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Luw2/d;",
        "Lwc3/c;",
        "Lcom/whoop/whoopaction/domain/models/OSAction;",
        "<init>",
        "()V",
        "Lkotlinx/serialization/json/JsonObject;",
        "jsonObject",
        "",
        "key",
        "Lad3/c;",
        "json",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "a",
        "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lad3/c;)Lcom/whoop/navigation/models/GenericInteraction;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "c",
        "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/OSAction;)V",
        "Lzc3/d;",
        "decoder",
        "b",
        "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/OSAction;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "Lyc3/g;",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "whoop-action_release"
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
.field public static final c:Luw2/d$a;

.field public static final d:I

.field private static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/OSActionType;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Luw2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luw2/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luw2/d;->c:Luw2/d$a;

    const/16 v0, 0x8

    sput v0, Luw2/d;->d:I

    sget-object v0, Lcom/whoop/whoopaction/domain/models/OSActionType;->ADD_TO_CALENDAR:Lcom/whoop/whoopaction/domain/models/OSActionType;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whoopaction/domain/models/OSActionType;->DIAL:Lcom/whoop/whoopaction/domain/models/OSActionType;

    const-class v2, Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whoopaction/domain/models/OSActionType;->PERMISSION:Lcom/whoop/whoopaction/domain/models/OSActionType;

    const-class v2, Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/whoopaction/domain/models/OSActionType;->PICK_MEDIA:Lcom/whoop/whoopaction/domain/models/OSActionType;

    const-class v2, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Luw2/d;->e:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "OSActionSerializer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Luw2/d;->a:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v1, "OSAction"

    invoke-static {v1, v0}, Lvf3/b;->c(Ljava/lang/String;[Lyc3/g;)Lyc3/h;

    move-result-object v0

    iput-object v0, p0, Luw2/d;->b:Lyc3/g;

    return-void
.end method

.method private final a(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lad3/c;)Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    invoke-virtual {p1, p2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    instance-of v0, p1, Lkotlinx/serialization/json/JsonNull;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lcom/whoop/navigation/models/GenericInteraction;->Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;

    invoke-virtual {p2}, Lcom/whoop/navigation/models/GenericInteraction$Companion;->serializer()Lwc3/c;

    move-result-object p2

    invoke-static {p2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p2

    check-cast p2, Lwc3/b;

    invoke-virtual {p3, p2, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/navigation/models/GenericInteraction;

    return-object p1

    :cond_2
    :goto_1
    return-object p2
.end method


# virtual methods
.method public b(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/OSAction;
    .locals 8

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
    if-eqz p1, :cond_8

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    const-string v2, "type"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_7

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-static {v2}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    const-string v3, "parameters"

    invoke-virtual {v0, v3}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-nez v3, :cond_1

    new-instance v3, Lkotlinx/serialization/json/JsonObject;

    sget-object v4, Lm83/z;->w:Lm83/z;

    invoke-direct {v3, v4}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :cond_1
    const-string v4, "on_success"

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v5

    invoke-direct {p0, v0, v4, v5}, Luw2/d;->a(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lad3/c;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v4

    const-string v5, "on_error"

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v6

    invoke-direct {p0, v0, v5, v6}, Luw2/d;->a(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lad3/c;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/OSActionType;->getEntries()Lt83/a;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/whoopaction/domain/models/OSActionType;

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v1, v6

    :cond_3
    check-cast v1, Lcom/whoop/whoopaction/domain/models/OSActionType;

    if-nez v1, :cond_4

    sget-object v1, Lcom/whoop/whoopaction/domain/models/OSActionType;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/OSActionType;

    :cond_4
    sget-object v5, Luw2/d;->e:Ljava/util/Map;

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj93/d;

    if-nez v5, :cond_5

    iget-object p1, p0, Luw2/d;->a:Ltr2/n;

    const-string v1, "Unrecognized OSActionType: "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lcom/whoop/whoopaction/domain/models/OSAction;

    sget-object v1, Lcom/whoop/whoopaction/domain/models/OSActionType;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/OSActionType;

    new-instance v2, Lcom/whoop/whoopaction/domain/models/UnknownOSActionParameters;

    invoke-direct {v2, v3}, Lcom/whoop/whoopaction/domain/models/UnknownOSActionParameters;-><init>(Lkotlinx/serialization/json/JsonElement;)V

    invoke-direct {p1, v1, v2, v4, v0}, Lcom/whoop/whoopaction/domain/models/OSAction;-><init>(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object p1

    :cond_5
    invoke-static {v5}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    check-cast v5, Lwc3/b;

    invoke-virtual {p1, v5, v3}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopaction/domain/models/OSActionParameters;

    new-instance v2, Lcom/whoop/whoopaction/domain/models/OSAction;

    const-string v3, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.OSActionParameters"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, p1, v4, v0}, Lcom/whoop/whoopaction/domain/models/OSAction;-><init>(Lcom/whoop/whoopaction/domain/models/OSActionType;Lcom/whoop/whoopaction/domain/models/OSActionParameters;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v2

    :cond_6
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "No serializer found for OS action type: "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "OSAction is missing \"type\" field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "OSActionSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lzc3/e;Lcom/whoop/whoopaction/domain/models/OSAction;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Serialization of OSAction not supported. Actions only deserialized from backend."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Luw2/d;->b(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/OSAction;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Luw2/d;->b:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/whoopaction/domain/models/OSAction;

    invoke-virtual {p0, p1, p2}, Luw2/d;->c(Lzc3/e;Lcom/whoop/whoopaction/domain/models/OSAction;)V

    return-void
.end method
