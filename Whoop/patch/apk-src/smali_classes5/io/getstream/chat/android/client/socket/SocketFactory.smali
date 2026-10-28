.class public final Lio/getstream/chat/android/client/socket/SocketFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/SocketFactory$Companion;,
        Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0002)(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u001f\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0015*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0015*\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010!R\u001b\u0010\'\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/SocketFactory;",
        "",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "parser",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "tokenManager",
        "Lio/getstream/chat/android/client/utils/HeadersUtil;",
        "headersUtil",
        "Lud3/l0;",
        "httpClient",
        "<init>",
        "(Lio/getstream/chat/android/client/parser/ChatParser;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/utils/HeadersUtil;Lud3/l0;)V",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "connectionConf",
        "Lud3/o0;",
        "buildRequest",
        "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lud3/o0;",
        "",
        "buildUrl",
        "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/lang/String;",
        "buildUserDetailJson",
        "",
        "reduceUserDetails",
        "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/util/Map;",
        "Lio/getstream/chat/android/PrivacySettings;",
        "reducePrivacySettings",
        "(Lio/getstream/chat/android/PrivacySettings;)Ljava/util/Map;",
        "Lio/getstream/chat/android/client/socket/StreamWebSocket;",
        "createSocket",
        "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lio/getstream/chat/android/client/socket/StreamWebSocket;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "Lio/getstream/chat/android/client/utils/HeadersUtil;",
        "Lud3/l0;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
        "ConnectionConf",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/socket/SocketFactory$Companion;

.field private static final X_STREAM_CLIENT:Ljava/lang/String; = "X-Stream-Client"


# instance fields
.field private final headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

.field private final httpClient:Lud3/l0;

.field private final logger$delegate:Ll83/h;

.field private final parser:Lio/getstream/chat/android/client/parser/ChatParser;

.field private final tokenManager:Lio/getstream/chat/android/client/token/TokenManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/socket/SocketFactory$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/socket/SocketFactory;->Companion:Lio/getstream/chat/android/client/socket/SocketFactory$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/parser/ChatParser;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/utils/HeadersUtil;Lud3/l0;)V
    .locals 1

    const-string v0, "parser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headersUtil"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->httpClient:Lud3/l0;

    .line 6
    const-string p1, "Chat:SocketFactory"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/parser/ChatParser;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/utils/HeadersUtil;Lud3/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 7
    new-instance p4, Lud3/l0;

    invoke-direct {p4}, Lud3/l0;-><init>()V

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/socket/SocketFactory;-><init>(Lio/getstream/chat/android/client/parser/ChatParser;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/utils/HeadersUtil;Lud3/l0;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/socket/SocketFactory;Lud3/o0;Lud3/f1;)Lle3/g;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/socket/SocketFactory;->createSocket$lambda$1(Lio/getstream/chat/android/client/socket/SocketFactory;Lud3/o0;Lud3/f1;)Lud3/e1;

    move-result-object p0

    check-cast p0, Lle3/g;

    return-object p0
.end method

.method private final buildRequest(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lud3/o0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/SocketFactory;->buildUrl(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/utils/HeadersUtil;->buildSdkTrackingHeaders$stream_chat_android_client_release()Ljava/lang/String;

    move-result-object p1

    const-string v1, "X-Stream-Client"

    invoke-virtual {v0, v1, p1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1
.end method

.method private final buildUrl(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/SocketFactory;->buildUserDetailJson(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "encode(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->headersUtil:Lio/getstream/chat/android/client/utils/HeadersUtil;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/utils/HeadersUtil;->buildSdkTrackingHeaders$stream_chat_android_client_release()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getEndpoint()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getApiKey()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "connect?json="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&api_key="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&X-Stream-Client="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    instance-of v1, p1, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;

    if-eqz v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&stream-auth-type=anonymous"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-object v0, v2

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {p1}, Lio/getstream/chat/android/client/token/TokenManager;->ensureTokenLoaded()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {p1}, Lio/getstream/chat/android/client/token/TokenManager;->getToken()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&authorization="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&stream-auth-type=jwt"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_1
    :goto_0
    new-instance p1, Ljava/io/UnsupportedEncodingException;

    const-string v1, "Unable to encode user details json: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final buildUserDetailJson(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/lang/String;
    .locals 4

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/SocketFactory;->reduceUserDetails(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "user_details"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getId$stream_chat_android_client_release()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v2, "user_id"

    invoke-direct {v0, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    const-string v3, "server_determines_connection_id"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/parser/ChatParser;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final createSocket$lambda$1(Lio/getstream/chat/android/client/socket/SocketFactory;Lud3/o0;Lud3/f1;)Lud3/e1;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->httpClient:Lud3/l0;

    invoke-virtual {p0, p1, p2}, Lud3/l0;->c(Lud3/o0;Lud3/f1;)Lle3/g;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final reducePrivacySettings(Lio/getstream/chat/android/PrivacySettings;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/PrivacySettings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Lio/getstream/chat/android/PrivacySettings;->getTypingIndicators()Lio/getstream/chat/android/TypingIndicators;

    move-result-object v1

    const-string v2, "enabled"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/TypingIndicators;->getEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "typing_indicators"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/PrivacySettings;->getDeliveryReceipts()Lio/getstream/chat/android/DeliveryReceipts;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/DeliveryReceipts;->getEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "delivery_receipts"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/PrivacySettings;->getReadReceipts()Lio/getstream/chat/android/ReadReceipts;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/ReadReceipts;->getEnabled()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "read_receipts"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0
.end method

.method private final reduceUserDetails(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getId$stream_chat_android_client_release()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "id"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->isReconnection()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getRole()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getRole()Ljava/lang/String;

    move-result-object v1

    const-string v2, "role"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getBanned()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "banned"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getInvisible()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "invisible"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getPrivacySettings()Lio/getstream/chat/android/PrivacySettings;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "privacy_settings"

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/socket/SocketFactory;->reducePrivacySettings(Lio/getstream/chat/android/PrivacySettings;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getTeams()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getTeams()Ljava/util/List;

    move-result-object v1

    const-string v2, "teams"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "language"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "image"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_8
    return-object v0
.end method


# virtual methods
.method public final createSocket(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lio/getstream/chat/android/client/socket/StreamWebSocket;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const-string v0, "connectionConf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/SocketFactory;->buildRequest(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lud3/o0;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/SocketFactory;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lud3/o0;->a:Lud3/e0;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "new web socket: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/socket/StreamWebSocket;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/SocketFactory;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    new-instance v2, Lio/getstream/chat/android/client/socket/c;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0, p1}, Lio/getstream/chat/android/client/socket/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/socket/StreamWebSocket;-><init>(Lio/getstream/chat/android/client/parser/ChatParser;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method
