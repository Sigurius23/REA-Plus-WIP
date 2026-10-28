.class public final Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$$serializer;,
        Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0081\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEB[\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bm\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0012\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,Jn\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010#J\u0010\u00100\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00106\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010:\u001a\u0004\u0008;\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010<\u001a\u0004\u0008=\u0010%R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008>\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010?\u001a\u0004\u0008@\u0010(R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010,\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;",
        "",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "message",
        "",
        "sourceId",
        "Ls01/a;",
        "source",
        "presetQuestion",
        "Lcom/whoop/bot/models/conversation/Location;",
        "location",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "args",
        "",
        "userTimestamp",
        "<init>",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ls01/a;",
        "component4",
        "component5",
        "()Lcom/whoop/bot/models/conversation/Location;",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "()Ljava/lang/Long;",
        "copy",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "getMessage",
        "getMessage$annotations",
        "()V",
        "Ljava/lang/String;",
        "getSourceId",
        "Ls01/a;",
        "getSource",
        "getPresetQuestion",
        "Lcom/whoop/bot/models/conversation/Location;",
        "getLocation",
        "Ljava/util/Map;",
        "getArgs",
        "Ljava/lang/Long;",
        "getUserTimestamp",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$Companion;


# instance fields
.field private final args:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final location:Lcom/whoop/bot/models/conversation/Location;

.field private final message:Lcom/whoop/bot/models/conversation/AiChatMessage;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "initial_message"
    .end annotation
.end field

.field private final presetQuestion:Ljava/lang/String;

.field private final source:Ls01/a;

.field private final sourceId:Ljava/lang/String;

.field private final userTimestamp:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->Companion:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljl0/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ljl0/a;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$$serializer;

    invoke-virtual {p9}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    :goto_0
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    return-void

    :cond_2
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            "Ljava/lang/String;",
            "Ls01/a;",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/Location;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    .line 8
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;-><init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.coach.ConversationSourceType"

    invoke-static {}, Ls01/a;->values()[Ls01/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->copy(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "initial_message"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/bot/models/conversation/AiChatMessage$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/AiChatMessage$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/bot/models/conversation/Location$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/Location$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ls01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/bot/models/conversation/Location;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            "Ljava/lang/String;",
            "Ls01/a;",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/Location;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;-><init>(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getArgs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final getLocation()Lcom/whoop/bot/models/conversation/Location;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    return-object v0
.end method

.method public final getMessage()Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    return-object v0
.end method

.method public final getPresetQuestion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ls01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    return-object v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/AiChatMessage;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/Location;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->message:Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->sourceId:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->source:Ls01/a;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->presetQuestion:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->location:Lcom/whoop/bot/models/conversation/Location;

    iget-object v5, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->args:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->userTimestamp:Ljava/lang/Long;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "StartConversationV2RequestBody(message="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourceId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", presetQuestion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", args="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userTimestamp="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
