.class public final Lcom/whoop/bot/models/conversation/AiChatMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/AiChatMessage$$serializer;,
        Lcom/whoop/bot/models/conversation/AiChatMessage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONB\u0093\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u009b\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u000c\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\"J\u0010\u0010*\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010$J\u009c\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00101\u001a\u00020\u000c2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102J\'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001\u00a2\u0006\u0004\u00089\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010<\u001a\u0004\u0008=\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010>\u001a\u0004\u0008?\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008@\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010<\u001a\u0004\u0008A\u0010\u001bR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010<\u001a\u0004\u0008B\u0010\u001bR&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010C\u0012\u0004\u0008E\u0010F\u001a\u0004\u0008D\u0010\"R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010G\u001a\u0004\u0008H\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010I\u001a\u0004\u0008\u000e\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010<\u001a\u0004\u0008J\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010<\u001a\u0004\u0008K\u0010\u001bR\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010C\u001a\u0004\u0008L\u0010\"R\u0017\u0010\u0012\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010G\u001a\u0004\u0008M\u0010$\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "",
        "",
        "content",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "messageStatus",
        "role",
        "id",
        "timestamp",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "additionalContext",
        "",
        "canHaveFeedback",
        "isSuggestion",
        "feedbackType",
        "feedbackResponse",
        "feedbackReasons",
        "stoppedByUser",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Z",
        "component8",
        "()Ljava/lang/Boolean;",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getContent",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "getMessageStatus",
        "getRole",
        "getId",
        "getTimestamp",
        "Ljava/util/List;",
        "getAdditionalContext",
        "getAdditionalContext$annotations",
        "()V",
        "Z",
        "getCanHaveFeedback",
        "Ljava/lang/Boolean;",
        "getFeedbackType",
        "getFeedbackResponse",
        "getFeedbackReasons",
        "getStoppedByUser",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/AiChatMessage$Companion;


# instance fields
.field private final additionalContext:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final canHaveFeedback:Z

.field private final content:Ljava/lang/String;

.field private final feedbackReasons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final feedbackResponse:Ljava/lang/String;

.field private final feedbackType:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isSuggestion:Ljava/lang/Boolean;

.field private final messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

.field private final role:Ljava/lang/String;

.field private final stoppedByUser:Z

.field private final timestamp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/bot/models/conversation/AiChatMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/AiChatMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiChatMessage;->Companion:Lcom/whoop/bot/models/conversation/AiChatMessage$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/AiChatMessage;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lj02/y0;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Lj02/y0;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ljl0/a;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Ljl0/a;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v6, 0xc

    new-array v6, v6, [Ll83/h;

    aput-object v1, v6, v5

    aput-object v3, v6, v7

    const/4 v3, 0x2

    aput-object v1, v6, v3

    const/4 v3, 0x3

    aput-object v1, v6, v3

    const/4 v3, 0x4

    aput-object v1, v6, v3

    const/4 v3, 0x5

    aput-object v4, v6, v3

    const/4 v3, 0x6

    aput-object v1, v6, v3

    const/4 v3, 0x7

    aput-object v1, v6, v3

    aput-object v1, v6, v0

    const/16 v0, 0x9

    aput-object v1, v6, v0

    const/16 v0, 0xa

    aput-object v2, v6, v0

    const/16 v0, 0xb

    aput-object v1, v6, v0

    sput-object v6, Lcom/whoop/bot/models/conversation/AiChatMessage;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/whoop/bot/models/conversation/AiChatMessage;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p14, p1, 0x1

    if-nez p14, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    .line 6
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    const-string p2, "user"

    .line 8
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 9
    const-string p2, "toString(...)"

    .line 10
    invoke-static {p2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    sget-object p4, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_5

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    const/4 p5, 0x0

    if-nez p2, :cond_6

    iput-boolean p5, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    goto :goto_5

    :cond_6
    iput-boolean p8, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    .line 12
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    goto :goto_9

    :cond_a
    iput-object p12, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    :goto_9
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_b

    iput-boolean p5, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    return-void

    :cond_b
    iput-boolean p13, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackReasons"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    .line 20
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    .line 21
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    .line 22
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    .line 23
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    .line 24
    iput-boolean p7, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    .line 25
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    .line 26
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    .line 27
    iput-object p10, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    .line 28
    iput-object p11, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    .line 29
    iput-boolean p12, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 30
    const-string p1, ""

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 31
    sget-object v1, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    .line 32
    const-string v2, "user"

    goto :goto_1

    :cond_2
    move-object/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    .line 33
    const-string v3, "toString(...)"

    .line 34
    invoke-static {v3}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    move-object v4, v5

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    .line 35
    sget-object v7, Lm83/y;->w:Lm83/y;

    if-eqz v6, :cond_5

    move-object v6, v7

    goto :goto_4

    :cond_5
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    move v8, v9

    goto :goto_5

    :cond_6
    move/from16 v8, p7

    :goto_5
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    .line 36
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_7
    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move-object v11, v5

    goto :goto_7

    :cond_8
    move-object/from16 v11, p9

    :goto_7
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    goto :goto_8

    :cond_9
    move-object/from16 v5, p10

    :goto_8
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    goto :goto_9

    :cond_a
    move-object/from16 v7, p11

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move/from16 p14, v9

    :goto_a
    move-object p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p12, v5

    move-object/from16 p8, v6

    move-object/from16 p13, v7

    move/from16 p9, v8

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    goto :goto_b

    :cond_b
    move/from16 p14, p12

    goto :goto_a

    .line 37
    :goto_b
    invoke-direct/range {p2 .. p14}, Lcom/whoop/bot/models/conversation/AiChatMessage;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 11

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ljava/util/List;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v4, Lwc3/a;

    const-class v5, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    new-instance v7, Lwc3/e;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    new-array v10, v9, [Ljava/lang/annotation/Annotation;

    invoke-direct {v7, v8, v10}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v8, v9, [Lwc3/c;

    invoke-direct {v4, v6, v7, v8}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v3, v4}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    new-instance v4, Lwc3/a;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    new-instance v7, Lwc3/e;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-array v5, v9, [Ljava/lang/annotation/Annotation;

    invoke-direct {v7, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v1, v9, [Lwc3/c;

    invoke-direct {v4, v6, v7, v1}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lwc3/c;

    aput-object v4, v1, v9

    invoke-direct {v0, v2, v3, v1}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/AiChatMessage;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/AiChatMessage;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/AiChatMessage;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/AiChatMessage;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-boolean p7, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-boolean p12, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    :cond_b
    move-object p13, p11

    move p14, p12

    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/bot/models/conversation/AiChatMessage;->copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAdditionalContext$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/AiChatMessage;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/bot/models/conversation/AiChatMessage;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v3, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    const-string v3, "user"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-boolean v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    if-eqz v2, :cond_d

    :goto_6
    iget-boolean v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :goto_a
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    if-eqz v1, :cond_17

    :goto_b
    iget-boolean p0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    return v0
.end method

.method public final component2()Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    return v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageStatus"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalContext"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackReasons"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-object v2, p1

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/bot/models/conversation/AiChatMessage;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    iget-boolean v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    iget-boolean p1, p1, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAdditionalContext()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    return-object v0
.end method

.method public final getCanHaveFeedback()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeedbackReasons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    return-object v0
.end method

.method public final getFeedbackResponse()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeedbackType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getStoppedByUser()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    return v0
.end method

.method public final getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isSuggestion()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->content:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->messageStatus:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->role:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->id:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->timestamp:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->additionalContext:Ljava/util/List;

    iget-boolean v6, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->canHaveFeedback:Z

    iget-object v7, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->isSuggestion:Ljava/lang/Boolean;

    iget-object v8, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackType:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackResponse:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->feedbackReasons:Ljava/util/List;

    iget-boolean v11, p0, Lcom/whoop/bot/models/conversation/AiChatMessage;->stoppedByUser:Z

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "AiChatMessage(content="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", messageStatus="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", role="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    const-string v1, ", timestamp="

    invoke-static {v12, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", additionalContext="

    const-string v1, ", canHaveFeedback="

    invoke-static {v4, v0, v1, v12, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSuggestion="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", feedbackType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", feedbackResponse="

    const-string v1, ", feedbackReasons="

    invoke-static {v12, v8, v0, v9, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stoppedByUser="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
