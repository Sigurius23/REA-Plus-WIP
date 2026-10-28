.class public final Lcom/whoop/whoopaction/domain/models/PermissionParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/OSActionParameters;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/PermissionParameters$$serializer;,
        Lcom/whoop/whoopaction/domain/models/PermissionParameters$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B3\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bBE\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00081\u0010\u001f\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/PermissionParameters;",
        "Lcom/whoop/whoopaction/domain/models/OSActionParameters;",
        "Lcom/whoop/whoopaction/domain/models/PermissionType;",
        "permission",
        "Lcom/whoop/whoopaction/domain/models/PermissionActionContext;",
        "context",
        "",
        "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onError",
        "<init>",
        "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/PermissionParameters;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/whoopaction/domain/models/PermissionType;",
        "component2",
        "()Lcom/whoop/whoopaction/domain/models/PermissionActionContext;",
        "component3",
        "()Ljava/util/Map;",
        "copy",
        "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/PermissionParameters;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/whoopaction/domain/models/PermissionType;",
        "getPermission",
        "Lcom/whoop/whoopaction/domain/models/PermissionActionContext;",
        "getContext",
        "Ljava/util/Map;",
        "getOnError",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/PermissionParameters$Companion;


# instance fields
.field private final context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

.field private final onError:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;"
        }
    .end annotation
.end field

.field private final permission:Lcom/whoop/whoopaction/domain/models/PermissionType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PermissionParameters$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/PermissionParameters$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->Companion:Lcom/whoop/whoopaction/domain/models/PermissionParameters$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/whoopaction/domain/models/PermissionParameters;-><init>(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_0

    .line 3
    sget-object p2, Lcom/whoop/whoopaction/domain/models/PermissionType;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/PermissionType;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 5
    sget-object p1, Lm83/z;->w:Lm83/z;

    .line 6
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/PermissionType;",
            "Lcom/whoop/whoopaction/domain/models/PermissionActionContext;",
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;)V"
        }
    .end annotation

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    .line 9
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    .line 10
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 11
    sget-object p1, Lcom/whoop/whoopaction/domain/models/PermissionType;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/PermissionType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 12
    sget-object p3, Lm83/z;->w:Lm83/z;

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/PermissionParameters;-><init>(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PermissionType;->Companion:Lcom/whoop/whoopaction/domain/models/PermissionType$Companion;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/PermissionType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Luw2/a;->a:Luw2/a;

    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/PermissionParameters;Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/PermissionParameters;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->copy(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/PermissionParameters;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    sget-object v3, Lcom/whoop/whoopaction/domain/models/PermissionType;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/PermissionType;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/whoopaction/domain/models/PermissionActionContext$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/PermissionActionContext$$serializer;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/whoopaction/domain/models/PermissionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    return-object v0
.end method

.method public final component2()Lcom/whoop/whoopaction/domain/models/PermissionActionContext;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/PermissionParameters;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/PermissionType;",
            "Lcom/whoop/whoopaction/domain/models/PermissionActionContext;",
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;)",
            "Lcom/whoop/whoopaction/domain/models/PermissionParameters;"
        }
    .end annotation

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/PermissionParameters;-><init>(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/PermissionParameters;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getContext()Lcom/whoop/whoopaction/domain/models/PermissionActionContext;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    return-object v0
.end method

.method public final getOnError()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    return-object v0
.end method

.method public final getPermission()Lcom/whoop/whoopaction/domain/models/PermissionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/whoopaction/domain/models/PermissionActionContext;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->permission:Lcom/whoop/whoopaction/domain/models/PermissionType;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->context:Lcom/whoop/whoopaction/domain/models/PermissionActionContext;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PermissionParameters;->onError:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PermissionParameters(permission="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", context="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onError="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
