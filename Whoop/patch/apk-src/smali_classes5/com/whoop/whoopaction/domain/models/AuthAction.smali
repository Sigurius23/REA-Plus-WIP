.class public final Lcom/whoop/whoopaction/domain/models/AuthAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/Action;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/AuthAction$$serializer;,
        Lcom/whoop/whoopaction/domain/models/AuthAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=BW\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0004\u0008\r\u0010\u000eBc\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00080\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J`\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00080\nH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00087\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00088\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008:\u0010\'R#\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00080\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010)\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/AuthAction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/whoop/whoopaction/domain/models/AuthOperation;",
        "operation",
        "",
        "username",
        "password",
        "mfaCode",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onSuccess",
        "",
        "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
        "onError",
        "<init>",
        "(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "redacted",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/AuthAction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "toString",
        "()Ljava/lang/String;",
        "component1",
        "()Lcom/whoop/whoopaction/domain/models/AuthOperation;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component6",
        "()Ljava/util/Map;",
        "copy",
        "(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/AuthAction;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/whoopaction/domain/models/AuthOperation;",
        "getOperation",
        "Ljava/lang/String;",
        "getUsername",
        "getPassword",
        "getMfaCode",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getOnSuccess",
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

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/AuthAction$Companion;


# instance fields
.field private final mfaCode:Ljava/lang/String;

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

.field private final onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

.field private final operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field private final password:Ljava/lang/String;

.field private final username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/AuthAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthAction;->Companion:Lcom/whoop/whoopaction/domain/models/AuthAction$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/AuthAction;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v1, 0x5

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/whoopaction/domain/models/AuthAction;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/whoopaction/domain/models/AuthAction;-><init>(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    if-nez p8, :cond_0

    .line 3
    sget-object p2, Lcom/whoop/whoopaction/domain/models/AuthOperation;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    and-int/lit8 p2, p1, 0x2

    const/4 p8, 0x0

    if-nez p2, :cond_1

    iput-object p8, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p8, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p8, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p8, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_3
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    .line 5
    sget-object p1, Lm83/z;->w:Lm83/z;

    .line 6
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    return-void

    :cond_5
    iput-object p7, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/AuthOperation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;)V"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    .line 9
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    .line 12
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    .line 13
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 14
    sget-object p1, Lcom/whoop/whoopaction/domain/models/AuthOperation;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 15
    sget-object p6, Lm83/z;->w:Lm83/z;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 16
    invoke-direct/range {p2 .. p8}, Lcom/whoop/whoopaction/domain/models/AuthAction;-><init>(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->Companion:Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;->serializer()Lwc3/c;

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

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/AuthAction;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthAction;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/AuthAction;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/AuthAction;Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/AuthAction;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/whoopaction/domain/models/AuthAction;->copy(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/AuthAction;

    move-result-object p0

    return-object p0
.end method

.method private final redacted(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    :cond_0
    const-string p1, "REDACTED"

    return-object p1
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/AuthAction;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthAction;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v3, Lcom/whoop/whoopaction/domain/models/AuthOperation;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/whoopaction/domain/models/AuthOperation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/AuthAction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/AuthOperation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;)",
            "Lcom/whoop/whoopaction/domain/models/AuthAction;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whoopaction/domain/models/AuthAction;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/whoopaction/domain/models/AuthAction;-><init>(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/AuthAction;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMfaCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    return-object v0
.end method

.method public final getOnSuccess()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getOperation()Lcom/whoop/whoopaction/domain/models/AuthOperation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    return-object v0
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->operation:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->username:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/whoop/whoopaction/domain/models/AuthAction;->redacted(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->password:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/whoop/whoopaction/domain/models/AuthAction;->redacted(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->mfaCode:Ljava/lang/String;

    invoke-direct {p0, v3}, Lcom/whoop/whoopaction/domain/models/AuthAction;->redacted(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onSuccess:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, p0, Lcom/whoop/whoopaction/domain/models/AuthAction;->onError:Ljava/util/Map;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AuthAction(operation="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", username="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", password="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mfaCode="

    const-string v1, ", onSuccess="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onError="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
