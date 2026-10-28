.class public final Lcom/whoop/bot/models/conversation/StartConversationV2Request;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PostApiRequest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/StartConversationV2Request$$serializer;,
        Lcom/whoop/bot/models/conversation/StartConversationV2Request$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PostApiRequest<",
        "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0081\u0008\u0018\u0000 *2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B9\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010 H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010%\u001a\u0004\u0008)\u0010\u0018\u00a8\u0006,"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/StartConversationV2Request;",
        "Lcom/whoop/network/request/PostApiRequest;",
        "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;",
        "",
        "conversationId",
        "body",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)V",
        "",
        "seen0",
        "path",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/StartConversationV2Request;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)Lcom/whoop/bot/models/conversation/StartConversationV2Request;",
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
        "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;",
        "getBody",
        "getPath",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/StartConversationV2Request$Companion;


# instance fields
.field private final body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

.field private final conversationId:Ljava/lang/String;

.field private final path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/StartConversationV2Request$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/StartConversationV2Request$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->Companion:Lcom/whoop/bot/models/conversation/StartConversationV2Request$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/bot/models/conversation/StartConversationV2Request$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/StartConversationV2Request$$serializer;

    invoke-virtual {p5}, Lcom/whoop/bot/models/conversation/StartConversationV2Request$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_1

    .line 2
    const-string p1, "ai-conversation-service/v2/conversation/"

    .line 3
    invoke-static {p1, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->path:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->path:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)V
    .locals 1

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    .line 12
    const-string p2, "ai-conversation-service/v2/conversation/"

    .line 13
    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->path:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/StartConversationV2Request;Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/StartConversationV2Request;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)Lcom/whoop/bot/models/conversation/StartConversationV2Request;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/StartConversationV2Request;Lzc3/c;Lyc3/g;)V
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$$serializer;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->getBody()Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ai-conversation-service/v2/conversation/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)Lcom/whoop/bot/models/conversation/StartConversationV2Request;
    .locals 1

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;

    invoke-direct {v0, p1, p2}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/StartConversationV2Request;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/StartConversationV2Request;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getBody()Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    return-object v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->getBody()Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    move-result-object v0

    return-object v0
.end method

.method public final getConversationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

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

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

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

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->path:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->conversationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->body:Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StartConversationV2Request(conversationId="

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
