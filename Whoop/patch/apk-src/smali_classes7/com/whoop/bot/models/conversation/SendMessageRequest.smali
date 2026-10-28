.class public final Lcom/whoop/bot/models/conversation/SendMessageRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PostApiRequest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/SendMessageRequest$$serializer;,
        Lcom/whoop/bot/models/conversation/SendMessageRequest$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PostApiRequest<",
        "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 /2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00020/B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007BC\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0006\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ$\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008(\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\'\u001a\u0004\u0008+\u0010\u001aR\u001a\u0010\u000c\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010,\u001a\u0004\u0008-\u0010.\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/SendMessageRequest;",
        "Lcom/whoop/network/request/PostApiRequest;",
        "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;",
        "",
        "conversationId",
        "body",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)V",
        "",
        "seen0",
        "path",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "httpTimeoutConfig",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;Ljava/lang/String;Lcom/whoop/network/request/HttpTimeoutConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/SendMessageRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)Lcom/whoop/bot/models/conversation/SendMessageRequest;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getConversationId",
        "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;",
        "getBody",
        "getPath",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "getHttpTimeoutConfig",
        "()Lcom/whoop/network/request/HttpTimeoutConfig;",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/bot/models/conversation/SendMessageRequest$Companion;


# instance fields
.field private final body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

.field private final conversationId:Ljava/lang/String;

.field private final httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

.field private final path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/SendMessageRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/SendMessageRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->Companion:Lcom/whoop/bot/models/conversation/SendMessageRequest$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;Ljava/lang/String;Lcom/whoop/network/request/HttpTimeoutConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 9

    and-int/lit8 p6, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/bot/models/conversation/SendMessageRequest$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/SendMessageRequest$$serializer;

    invoke-virtual {p6}, Lcom/whoop/bot/models/conversation/SendMessageRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    and-int/lit8 p3, p1, 0x4

    if-nez p3, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->getId()Ljava/lang/String;

    move-result-object p3

    const-string p4, "ai-conversation-service/v1/conversation/"

    const-string p6, "/message/"

    .line 3
    invoke-static {p4, p2, p6, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->path:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->path:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    .line 5
    new-instance v0, Lcom/whoop/network/request/HttpTimeoutConfig;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/32 v1, 0x1d4c0

    const-wide/32 v3, 0x1d4c0

    const-wide/16 v5, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/network/request/HttpTimeoutConfig;-><init>(JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    return-void

    :cond_2
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)V
    .locals 9

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    .line 16
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->getId()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ai-conversation-service/v1/conversation/"

    const-string v1, "/message/"

    .line 17
    invoke-static {v0, p1, v1, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->path:Ljava/lang/String;

    .line 19
    new-instance v0, Lcom/whoop/network/request/HttpTimeoutConfig;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/32 v1, 0x1d4c0

    const-wide/32 v3, 0x1d4c0

    const-wide/16 v5, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/network/request/HttpTimeoutConfig;-><init>(JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/SendMessageRequest;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/SendMessageRequest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)Lcom/whoop/bot/models/conversation/SendMessageRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/SendMessageRequest;Lzc3/c;Lyc3/g;)V
    .locals 11

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody$$serializer;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ai-conversation-service/v1/conversation/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/message/"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v1

    new-instance v2, Lcom/whoop/network/request/HttpTimeoutConfig;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-wide/32 v3, 0x1d4c0

    const-wide/32 v5, 0x1d4c0

    const-wide/16 v7, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/whoop/network/request/HttpTimeoutConfig;-><init>(JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/network/request/HttpTimeoutConfig$$serializer;->INSTANCE:Lcom/whoop/network/request/HttpTimeoutConfig$$serializer;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)Lcom/whoop/bot/models/conversation/SendMessageRequest;
    .locals 1

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/models/conversation/SendMessageRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/bot/models/conversation/SendMessageRequest;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/SendMessageRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/SendMessageRequest;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    return-object v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SendMessageRequest;->getBody()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    move-result-object v0

    return-object v0
.end method

.method public final getConversationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHasBody()Z

    move-result v0

    return v0
.end method

.method public bridge getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getParameters()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->conversationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SendMessageRequest;->body:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SendMessageRequest(conversationId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PostApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
