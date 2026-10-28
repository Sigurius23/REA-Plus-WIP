.class public final Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PostApiRequest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$$serializer;,
        Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PostApiRequest<",
        "Ll83/a0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0081\u0008\u0018\u0000 )2\u000e\u0012\n\u0012\u0008\u0018\u00010\u0002j\u0002`\u00030\u0001:\u0002*)B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B9\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0006\u0010\u000eJ\'\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010#\u001a\u0004\u0008$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010#\u001a\u0004\u0008%\u0010\u0018R \u0010\u000b\u001a\u0008\u0018\u00010\u0002j\u0002`\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;",
        "Lcom/whoop/network/request/PostApiRequest;",
        "Ll83/a0;",
        "Lcom/whoop/network/request/NoRequestBody;",
        "",
        "conversationId",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "seen0",
        "path",
        "body",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ll83/a0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;)Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;",
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
        "getPath",
        "Ll83/a0;",
        "getBody",
        "()Ll83/a0;",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$Companion;


# instance fields
.field private final body:Ll83/a0;

.field private final conversationId:Ljava/lang/String;

.field private final path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->Companion:Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ll83/a0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$$serializer;

    invoke-virtual {p5}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    and-int/lit8 p5, p1, 0x2

    if-nez p5, :cond_1

    .line 2
    const-string p3, "ai-conversation-service/v1/conversation/"

    const-string p5, "/recommendations"

    .line 3
    invoke-static {p3, p2, p5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->path:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->path:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    .line 6
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->body:Ll83/a0;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->body:Ll83/a0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    .line 14
    const-string v0, "ai-conversation-service/v1/conversation/"

    const-string v1, "/recommendations"

    .line 15
    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->path:Ljava/lang/String;

    .line 17
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->body:Ll83/a0;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->copy(Ljava/lang/String;)Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;Lzc3/c;Lyc3/g;)V
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ai-conversation-service/v1/conversation/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/recommendations"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->getBody()Ll83/a0;

    move-result-object v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/UnitSerializer;->INSTANCE:Lkotlinx/serialization/internal/UnitSerializer;

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->getBody()Ll83/a0;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;
    .locals 1

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;

    invoke-direct {v0, p1}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->getBody()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Ll83/a0;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->body:Ll83/a0;

    return-object v0
.end method

.method public final getConversationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;->conversationId:Ljava/lang/String;

    const-string v1, "SwapRecommendationsRequest(conversationId="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PostApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
