.class public final Lcom/whoop/ai/chat/models/TurnFeedbackResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/models/TurnFeedbackResponse$$serializer;,
        Lcom/whoop/ai/chat/models/TurnFeedbackResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00060\u0002j\u0002`\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010(\u001a\u0004\u0008)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008+\u0010\u001cR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008-\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
        "",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "Lcom/whoop/ai/chat/models/TurnFeedbackType;",
        "feedbackType",
        "",
        "feedbackResponse",
        "",
        "feedbackReasons",
        "<init>",
        "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/TurnFeedbackResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "getFeedbackType",
        "Ljava/lang/String;",
        "getFeedbackResponse",
        "Ljava/util/List;",
        "getFeedbackReasons",
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

.field public static final Companion:Lcom/whoop/ai/chat/models/TurnFeedbackResponse$a;


# instance fields
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

.field private final feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->Companion:Lcom/whoop/ai/chat/models/TurnFeedbackResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lxa1/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lxa1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lxa1/a;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lxa1/a;-><init>(I)V

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

    sput-object v3, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/ai/chat/models/TurnFeedbackResponse$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/TurnFeedbackResponse$$serializer;

    invoke-virtual {p5}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "feedbackType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackReasons"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    .line 6
    iput-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 8
    sget-object p3, Lm83/y;->w:Lm83/y;

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;-><init>(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->Companion:Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;

    invoke-virtual {v0}, Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/TurnFeedbackResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->copy(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/TurnFeedbackResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;"
        }
    .end annotation

    const-string v0, "feedbackType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackReasons"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;-><init>(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
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

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    return-object v0
.end method

.method public final getFeedbackResponse()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeedbackType()Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackType:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackResponse:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;->feedbackReasons:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TurnFeedbackResponse(feedbackType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", feedbackResponse="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", feedbackReasons="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
