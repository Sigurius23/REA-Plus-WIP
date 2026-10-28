.class public final Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$$serializer;,
        Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;<BI\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eB[\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JX\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00084\u0010!R\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010%R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008\u000c\u0010\'\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;",
        "",
        "",
        "content",
        "role",
        "",
        "userTimestamp",
        "",
        "fileIds",
        "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
        "trackingCapabilities",
        "",
        "isSuggestion",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
        "component6",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getContent",
        "getRole",
        "Ljava/lang/Long;",
        "getUserTimestamp",
        "Ljava/util/List;",
        "getFileIds",
        "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
        "getTrackingCapabilities",
        "Z",
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

.field public static final Companion:Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$a;


# instance fields
.field private final content:Ljava/lang/String;

.field private final fileIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isSuggestion:Z

.field private final role:Ljava/lang/String;

.field private final trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

.field private final userTimestamp:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->Companion:Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls51/p;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Ls51/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    and-int/lit8 p8, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$$serializer;->INSTANCE:Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$$serializer;

    invoke-virtual {p8}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    .line 2
    new-instance v0, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    :goto_1
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    return-void

    :cond_3
    iput-boolean p7, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
            "Z)V"
        }
    .end annotation

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingCapabilities"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    .line 8
    iput-object p4, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object/from16 v5, p4

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    .line 11
    new-instance v6, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v6, p5

    :goto_1
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v7, v0

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    goto :goto_3

    :cond_2
    move/from16 v7, p6

    goto :goto_2

    .line 12
    :goto_3
    invoke-direct/range {v1 .. v7}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ZILjava/lang/Object;)Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lzc3/c;Lyc3/g;)V
    .locals 8

    sget-object v0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    new-instance v2, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/ai/chat/api/AiTrackingCapabilities$$serializer;->INSTANCE:Lcom/whoop/ai/chat/api/AiTrackingCapabilities$$serializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    if-eqz v1, :cond_5

    :goto_2
    iget-boolean p0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;",
            "Z)",
            "Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;"
        }
    .end annotation

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingCapabilities"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    iget-object v3, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    iget-boolean p1, p1, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final getFileIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingCapabilities()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    return-object v0
.end method

.method public final getUserTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/api/AiTrackingCapabilities;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSuggestion()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->content:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->role:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->userTimestamp:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->fileIds:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->trackingCapabilities:Lcom/whoop/ai/chat/api/AiTrackingCapabilities;

    iget-boolean v5, p0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;->isSuggestion:Z

    const-string v6, ", role="

    const-string v7, ", userTimestamp="

    const-string v8, "AiCreateTurnRequestBody(content="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fileIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackingCapabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSuggestion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
