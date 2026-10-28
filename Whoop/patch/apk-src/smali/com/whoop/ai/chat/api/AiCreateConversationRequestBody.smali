.class public final Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$$serializer;,
        Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>?Be\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBw\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001fJv\u0010)\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00086\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00087\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010%R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00102\u001a\u0004\u0008<\u0010\u001f\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;",
        "",
        "",
        "fingerprint",
        "sourceType",
        "sourceId",
        "initialMessage",
        "presetQuestionKey",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "args",
        "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
        "trackingCapabilities",
        "entrypointExperience",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getFingerprint",
        "getSourceType",
        "getSourceId",
        "getInitialMessage",
        "getPresetQuestionKey",
        "Ljava/util/Map;",
        "getArgs",
        "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
        "getTrackingCapabilities",
        "getEntrypointExperience",
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

.field public static final Companion:Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$a;


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

.field private final entrypointExperience:Ljava/lang/String;

.field private final fingerprint:Ljava/lang/String;

.field private final initialMessage:Ljava/lang/String;

.field private final presetQuestionKey:Ljava/lang/String;

.field private final sourceId:Ljava/lang/String;

.field private final sourceType:Ljava/lang/String;

.field private final trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->Companion:Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ls51/p;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Ls51/p;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p1, 0xf

    const/16 v1, 0xf

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$$serializer;->INSTANCE:Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$$serializer;

    invoke-virtual {v0}, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    .line 2
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 3
    iput-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    .line 4
    new-instance v0, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    :goto_2
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    return-void

    :cond_4
    iput-object p9, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "sourceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingCapabilities"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    .line 12
    iput-object p6, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    .line 13
    iput-object p7, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    .line 14
    iput-object p8, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    .line 15
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 16
    new-instance v10, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    move-object v11, v2

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    goto :goto_4

    :cond_3
    move-object/from16 v11, p8

    goto :goto_3

    .line 17
    :goto_4
    invoke-direct/range {v3 .. v11}, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    sget-object v4, Lm83/z;->w:Lm83/z;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_1
    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    new-instance v3, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/ai/chat/api/AiTrackingCapabilities$$serializer;->INSTANCE:Lcom/whoop/ai/chat/api/AiTrackingCapabilities$$serializer;

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    invoke-interface {p1, p2, v0, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    iget-object p0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;"
        }
    .end annotation

    const-string v0, "sourceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingCapabilities"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;

    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
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

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final getEntrypointExperience()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    return-object v0
.end method

.method public final getFingerprint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getPresetQuestionKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingCapabilities()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    invoke-static {v3, v0, v2}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    invoke-virtual {v3}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->fingerprint:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceType:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->sourceId:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->initialMessage:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->presetQuestionKey:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->args:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    iget-object v7, p0, Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;->entrypointExperience:Ljava/lang/String;

    const-string v8, ", sourceType="

    const-string v9, ", sourceId="

    const-string v10, "AiCreateConversationRequestBody(fingerprint="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", initialMessage="

    const-string v8, ", presetQuestionKey="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", args="

    const-string v2, ", trackingCapabilities="

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", entrypointExperience="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
