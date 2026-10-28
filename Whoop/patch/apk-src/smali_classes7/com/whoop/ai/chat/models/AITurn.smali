.class public final Lcom/whoop/ai/chat/models/AITurn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/models/AITurn$$serializer;,
        Lcom/whoop/ai/chat/models/AITurn$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@ABI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBS\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)JV\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00100\u001a\u00020\u000b2\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010!R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u00087\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010<\u0012\u0004\u0008=\u0010>\u001a\u0004\u0008\r\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/AITurn;",
        "",
        "",
        "id",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "turnStatus",
        "",
        "Lcom/whoop/ai/chat/models/AIMessage;",
        "messages",
        "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
        "feedback",
        "",
        "shouldShowSuggestedChips",
        "isOptimistic",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/models/AITurn;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
        "component5",
        "()Ljava/lang/Boolean;",
        "component6",
        "()Z",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)Lcom/whoop/ai/chat/models/AITurn;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "getTurnStatus",
        "Ljava/util/List;",
        "getMessages",
        "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
        "getFeedback",
        "Ljava/lang/Boolean;",
        "getShouldShowSuggestedChips",
        "Z",
        "isOptimistic$annotations",
        "()V",
        "Companion",
        "$serializer",
        "a",
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

.field public static final Companion:Lcom/whoop/ai/chat/models/AITurn$a;


# instance fields
.field private final feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

.field private final id:Ljava/lang/String;

.field private final isOptimistic:Z

.field private final messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AIMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldShowSuggestedChips:Ljava/lang/Boolean;

.field private final turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/ai/chat/models/AITurn$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/models/AITurn$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/models/AITurn;->Companion:Lcom/whoop/ai/chat/models/AITurn$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/models/AITurn;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lxa1/a;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lxa1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lxa1/a;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lxa1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v0, v3, v2

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/ai/chat/models/AITurn;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/ai/chat/models/AITurn$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/AITurn$$serializer;

    invoke-virtual {p7}, Lcom/whoop/ai/chat/models/AITurn$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    :goto_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AIMessage;",
            ">;",
            "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
            "Ljava/lang/Boolean;",
            "Z)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    .line 7
    iput-object p3, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    .line 8
    iput-object p4, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    .line 9
    iput-object p5, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 11
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    const/4 p8, 0x0

    if-eqz p3, :cond_1

    move-object v4, p8

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    move-object v5, p8

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    const/4 p6, 0x0

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/whoop/ai/chat/models/AITurn;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.bot.models.conversation.AiMessageStatus"

    invoke-static {}, Lcom/whoop/bot/models/conversation/AiMessageStatus;->values()[Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/ai/chat/models/AIMessage$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/AIMessage$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/AITurn;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/models/AITurn;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/AITurn;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/models/AITurn;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;ZILjava/lang/Object;)Lcom/whoop/ai/chat/models/AITurn;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/ai/chat/models/AITurn;->copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)Lcom/whoop/ai/chat/models/AITurn;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isOptimistic$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/models/AITurn;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/ai/chat/models/AITurn;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/TurnFeedbackResponse$$serializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AIMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/ai/chat/models/TurnFeedbackResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)Lcom/whoop/ai/chat/models/AITurn;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AIMessage;",
            ">;",
            "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
            "Ljava/lang/Boolean;",
            "Z)",
            "Lcom/whoop/ai/chat/models/AITurn;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ai/chat/models/AITurn;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/ai/chat/models/AITurn;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/models/AITurn;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/models/AITurn;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    iget-boolean p1, p1, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getFeedback()Lcom/whoop/ai/chat/models/TurnFeedbackResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AIMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final getShouldShowSuggestedChips()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isOptimistic()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AITurn;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/AITurn;->turnStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AITurn;->messages:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/AITurn;->feedback:Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    iget-object v4, p0, Lcom/whoop/ai/chat/models/AITurn;->shouldShowSuggestedChips:Ljava/lang/Boolean;

    iget-boolean v5, p0, Lcom/whoop/ai/chat/models/AITurn;->isOptimistic:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AITurn(id="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", turnStatus="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messages="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", feedback="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldShowSuggestedChips="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isOptimistic="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
