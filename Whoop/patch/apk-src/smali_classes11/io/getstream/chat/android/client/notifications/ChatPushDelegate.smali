.class public final Lio/getstream/chat/android/client/notifications/ChatPushDelegate;
.super Lio/getstream/android/push/delegate/PushDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/notifications/ChatPushDelegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u000e\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ;\u0010\u0012\u001a\u00020\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0018j\u0008\u0012\u0004\u0012\u00020\u0005`\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/ChatPushDelegate;",
        "Lio/getstream/android/push/delegate/PushDelegate;",
        "<init>",
        "()V",
        "",
        "",
        "",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "effect",
        "",
        "ifValid",
        "(Ljava/util/Map;Lc93/a;)Z",
        "payload",
        "extractChannelType",
        "(Ljava/util/Map;)Ljava/lang/String;",
        "extractChannelId",
        "metadata",
        "handlePushMessage",
        "(Ljava/util/Map;Ljava/util/Map;)Z",
        "Ly03/a;",
        "pushDevice",
        "registerPushDevice",
        "(Ly03/a;)V",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "expectedKeys",
        "Ljava/util/HashSet;",
        "Companion",
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
.field private static final Companion:Lio/getstream/chat/android/client/notifications/ChatPushDelegate$Companion;

.field private static final KEY_CHANNEL_ID:Ljava/lang/String; = "channel_id"

.field private static final KEY_CHANNEL_TYPE:Ljava/lang/String; = "channel_type"

.field private static final KEY_CID:Ljava/lang/String; = "cid"

.field private static final KEY_GETSTREAM:Ljava/lang/String; = "getstream"

.field private static final KEY_MESSAGE_ID:Ljava/lang/String; = "message_id"


# instance fields
.field private final expectedKeys:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/ChatPushDelegate$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->Companion:Lio/getstream/chat/android/client/notifications/ChatPushDelegate$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/android/push/delegate/PushDelegate;-><init>()V

    const-string v0, "channel_type"

    const-string v1, "getstream"

    const-string v2, "channel_id"

    const-string v3, "message_id"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->w([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->expectedKeys:Ljava/util/HashSet;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/notifications/ChatPushDelegate;Ljava/util/Map;Ljava/util/Map;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->handlePushMessage$lambda$1(Lio/getstream/chat/android/client/notifications/ChatPushDelegate;Ljava/util/Map;Ljava/util/Map;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final extractChannelId(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "cid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    const-string v0, "channel_id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private final extractChannelType(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "cid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    const-string v0, "channel_type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private static final handlePushMessage$lambda$1(Lio/getstream/chat/android/client/notifications/ChatPushDelegate;Ljava/util/Map;Ljava/util/Map;)Ll83/a0;
    .locals 9

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->extractChannelType(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->extractChannelId(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "message_id"

    invoke-static {v1, p1}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    sget-object v1, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->INSTANCE:Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;

    const-string v5, "getstream"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-eqz v6, :cond_0

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v1, v5}, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->parse(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->expectedKeys:Ljava/util/HashSet;

    invoke-virtual {v8, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v7, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    new-instance v1, Lio/getstream/chat/android/models/PushMessage;

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/models/PushMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient$Companion;->handlePushMessage(Lio/getstream/chat/android/models/PushMessage;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final ifValid(Ljava/util/Map;Lc93/a;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            ")Z"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/PayloadValidator;->INSTANCE:Lio/getstream/chat/android/client/PayloadValidator;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/PayloadValidator;->isFromStreamServer(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/PayloadValidator;->isValidPayload(Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    return p1
.end method


# virtual methods
.method public handlePushMessage(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lim1/a0;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p2, p1, v1}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/notifications/ChatPushDelegate;->ifValid(Ljava/util/Map;Lc93/a;)Z

    move-result p1

    return p1
.end method

.method public registerPushDevice(Ly03/a;)V
    .locals 1

    const-string v0, "pushDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
