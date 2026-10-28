.class public final Lio/getstream/chat/android/client/api/state/ChatClientExtensions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a5\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a?\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0013\u001a+\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a6\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0087@\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a,\u0010\u001e\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001aG\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\u0008\u0000\u0010 *\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u001c\u0010$\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0002\u00a2\u0006\u0004\u0008%\u0010&\u001a+\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u0007\u00a2\u0006\u0004\u0008+\u0010,\u001a)\u00101\u001a\u0008\u0012\u0004\u0012\u00020*0)*\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0007\u00a2\u0006\u0004\u00081\u00102\u001a\'\u00104\u001a\u0008\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u00084\u00105\u001a/\u00108\u001a\u0008\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u00088\u00109\u001a\'\u0010:\u001a\u0008\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0004\u0008:\u0010;\u001a\u001f\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00190)*\u00020\u00002\u0006\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008<\u0010=\u001a!\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\'0)*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008>\u0010?\u001a)\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\'0)*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008@\u0010;\u001a*\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\'0A*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008B\u0010C\u001a3\u0010E\u001a\u0008\u0012\u0004\u0012\u0002030)*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010D\u001a\u00020\u0019H\u0007\u00a2\u0006\u0004\u0008E\u0010F\u001a\u000f\u0010G\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008G\u0010H\"\u0014\u0010I\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008I\u0010J\"\u0014\u0010K\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008K\u0010J\"\u0015\u0010O\u001a\u00020L*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010N\"\u0015\u0010S\u001a\u00020P*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010R\"\u001b\u0010W\u001a\u0008\u0012\u0004\u0012\u00020P0T*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010V\"\u0018\u0010[\u001a\u00020X*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Y\u0010Z\u00a8\u0006^\u00b2\u0006\u000c\u0010]\u001a\u00020\\8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "request",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "chatEventHandlerFactory",
        "Lbc3/c0;",
        "coroutineScope",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "queryChannelsAsState",
        "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;)Lec3/f2;",
        "",
        "cid",
        "",
        "messageLimit",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "watchChannelAsState",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;",
        "aroundMessageId",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;)Lec3/f2;",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "queryThreadsAsState",
        "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;",
        "messageId",
        "",
        "olderToNewer",
        "Lio/getstream/chat/android/client/api/state/ThreadState;",
        "getRepliesAsState",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;)Ljava/lang/Object;",
        "awaitRepliesAsState",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;",
        "T",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "",
        "producer",
        "getStateOrNull",
        "(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Lo23/d;",
        "Ll83/a0;",
        "setMessageForReply",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "downloadAttachment",
        "(Lio/getstream/chat/android/client/ChatClient;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)Lo23/d;",
        "Lio/getstream/chat/android/models/Channel;",
        "loadOlderMessages",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;I)Lo23/d;",
        "channelCid",
        "baseMessageId",
        "loadNewerMessages",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;I)Lo23/d;",
        "loadMessagesAroundId",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
        "cancelEphemeralMessage",
        "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "getMessageUsingCache",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;",
        "loadMessageById",
        "Ln23/h;",
        "loadMessageByIdInternal",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "userPresence",
        "loadNewestMessages",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZ)Lo23/d;",
        "createAttachmentFallbackName",
        "()Ljava/lang/String;",
        "TAG",
        "Ljava/lang/String;",
        "ATTACHMENT_FALLBACK_NAME_DATE_FORMAT",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "getState",
        "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "state",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "getGlobalState",
        "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "Lec3/l;",
        "getGlobalStateFlow",
        "(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;",
        "globalStateFlow",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "getChatClientConfig",
        "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "chatClientConfig",
        "Lb23/k;",
        "logger",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ATTACHMENT_FALLBACK_NAME_DATE_FORMAT:Ljava/lang/String; = "yyyy-MM-dd_HH-mm-ss"

.field private static final TAG:Ljava/lang/String; = "Chat:Client-StatePlugin"


# direct methods
.method public static synthetic a(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->downloadAttachment$lambda$9(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static final synthetic access$createAttachmentFallbackName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->createAttachmentFallbackName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getChatClientConfig(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/ChatClientConfig;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getChatClientConfig(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/ChatClientConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadMessageByIdInternal(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessageByIdInternal(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final awaitRepliesAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "IZ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ThreadState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v3, "[awaitRepliesAsState] messageId: "

    const-string v4, ", messageLimit: "

    invoke-static {p2, v3, p1, v4}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v5, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$awaitRepliesAsState$3;

    const/4 v10, 0x0

    move-object v6, p0

    move-object v7, p1

    move v8, p2

    move v9, p3

    invoke-direct/range {v5 .. v10}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$awaitRepliesAsState$3;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLq83/d;)V

    invoke-static {v5, p4}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadNewerMessages$lambda$13(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static synthetic c(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessageById$lambda$19(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static final cancelEphemeralMessage(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/h;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final cancelEphemeralMessage$lambda$16(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method private static final createAttachmentFallbackName()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd_HH-mm-ss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "attachment_"

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getMessageUsingCache$lambda$17(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static final downloadAttachment(Lio/getstream/chat/android/client/ChatClient;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)Lo23/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/h;

    new-instance v1, Lih0/t;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p2, p0, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$downloadAttachment$2;-><init>(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final downloadAttachment$lambda$9(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static synthetic e(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadNewestMessages$lambda$23(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static synthetic f(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadOlderMessages$lambda$11(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static synthetic g(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->cancelEphemeralMessage$lambda$16(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method private static final getChatClientConfig(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/ChatClientConfig;
    .locals 13

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    const-string v4, ", T: "

    const-class v5, Lio/getstream/chat/android/client/api/ChatClientConfig;

    const-class v6, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-interface {v8}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-interface {v7}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    const-string v9, "[resolveDependency] DR: "

    invoke-static {v9, v8, v4, v7}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v2, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v7, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v1, v7}, Lk93/c;->b(Lj93/d;Lj93/d;)Z

    move-result v1

    const-string v7, "\'"

    const-string v8, "Dependency \'"

    const-string v9, "\' was not found. Did you init it within ChatClient?"

    if-eqz v1, :cond_6

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v10, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v12, "[resolveFactoryDependency] F: "

    invoke-static {v12, v11, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v10, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getPluginFactories()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    instance-of v1, v1, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;

    if-eqz v1, :cond_2

    move-object v3, v0

    :cond_3
    check-cast v3, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    if-eqz v3, :cond_5

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/client/plugin/DependencyResolver;->resolveDependency(Lj93/d;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    goto/16 :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\' was not resolved by factory \'"

    invoke-static {v8, v1, v2, p0, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Factory \'"

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v10, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-virtual {v0, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v1, v10}, Lk93/c;->b(Lj93/d;Lj93/d;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v10, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v12, "[resolvePluginDependency] P: "

    invoke-static {v12, v11, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v10, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    const-wide/16 v10, 0x2710

    invoke-virtual {p0, v10, v11}, Lio/getstream/chat/android/client/ChatClient;->awaitInitializationState(J)Lio/getstream/chat/android/models/InitializationState;

    move-result-object p0

    sget-object v1, Lio/getstream/chat/android/models/InitializationState;->COMPLETE:Lio/getstream/chat/android/models/InitializationState;

    if-eq p0, v1, :cond_9

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lb23/i;->c:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[resolvePluginDependency] failed (initializationState is not COMPLETE): "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, v2, p0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "ChatClient::connectUser() must be called before resolving any dependency"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    instance-of v1, v1, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;

    if-eqz v1, :cond_a

    move-object v3, v0

    :cond_b
    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    if-eqz v3, :cond_d

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/client/plugin/DependencyResolver;->resolveDependency(Lj93/d;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    :goto_0
    check-cast v0, Lio/getstream/chat/android/client/api/ChatClientConfig;

    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\' was not resolved by plugin \'"

    invoke-static {v8, v1, v2, p0, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Plugin \'"

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported dependency resolver: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final getGlobalState(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/GlobalState;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    const-string v4, ", T: "

    const-class v5, Lio/getstream/chat/android/client/api/state/GlobalState;

    const-class v6, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-interface {v8}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-interface {v7}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    const-string v9, "[resolveDependency] DR: "

    invoke-static {v9, v8, v4, v7}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v2, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v7, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v1, v7}, Lk93/c;->b(Lj93/d;Lj93/d;)Z

    move-result v1

    const-string v7, "\'"

    const-string v8, "Dependency \'"

    const-string v9, "\' was not found. Did you init it within ChatClient?"

    if-eqz v1, :cond_6

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v10, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v12, "[resolveFactoryDependency] F: "

    invoke-static {v12, v11, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v10, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getPluginFactories()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    instance-of v1, v1, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    if-eqz v1, :cond_2

    move-object v3, v0

    :cond_3
    check-cast v3, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    if-eqz v3, :cond_5

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/client/plugin/DependencyResolver;->resolveDependency(Lj93/d;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    goto/16 :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\' was not resolved by factory \'"

    invoke-static {v8, v1, v2, p0, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Factory \'"

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v10, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-virtual {v0, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v1, v10}, Lk93/c;->b(Lj93/d;Lj93/d;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v10, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v12, "[resolvePluginDependency] P: "

    invoke-static {v12, v11, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v10, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    const-wide/16 v10, 0x2710

    invoke-virtual {p0, v10, v11}, Lio/getstream/chat/android/client/ChatClient;->awaitInitializationState(J)Lio/getstream/chat/android/models/InitializationState;

    move-result-object p0

    sget-object v1, Lio/getstream/chat/android/models/InitializationState;->COMPLETE:Lio/getstream/chat/android/models/InitializationState;

    if-eq p0, v1, :cond_9

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lb23/i;->c:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[resolvePluginDependency] failed (initializationState is not COMPLETE): "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, v2, p0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "ChatClient::connectUser() must be called before resolving any dependency"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    instance-of v1, v1, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    if-eqz v1, :cond_a

    move-object v3, v0

    :cond_b
    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    if-eqz v3, :cond_d

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/client/plugin/DependencyResolver;->resolveDependency(Lj93/d;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    :goto_0
    check-cast v0, Lio/getstream/chat/android/client/api/state/GlobalState;

    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\' was not resolved by plugin \'"

    invoke-static {v8, v1, v2, p0, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Plugin \'"

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported dependency resolver: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final getGlobalStateFlow(Lio/getstream/chat/android/client/ChatClient;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getInitializationState()Lec3/f2;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$globalStateFlow$1;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v3, v2}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$special$$inlined$filter$1;

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$special$$inlined$filter$1;-><init>(Lec3/l;)V

    new-instance v1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$special$$inlined$map$1;

    invoke-direct {v1, v0, p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$special$$inlined$map$1;-><init>(Lec3/l;Lio/getstream/chat/android/client/ChatClient;)V

    return-object v1
.end method

.method public static final getMessageUsingCache(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/h;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getMessageUsingCache$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getMessageUsingCache$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final getMessageUsingCache$lambda$17(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final getRepliesAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "IZ",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ThreadState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    sget-object v0, Lb23/i;->a:Lb23/i;

    .line 3
    sget-object v0, Lb23/i;->d:Lb23/e;

    .line 4
    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    sget-object v0, Lb23/i;->c:Lb23/j;

    .line 6
    const-string v3, ", messageLimit: "

    const-string v4, ", olderToNewer: "

    .line 7
    const-string v5, "[getRepliesAsState] messageId: "

    invoke-static {p2, v5, p1, v3, v4}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 8
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 9
    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :cond_0
    invoke-static {p0, p4}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->requestsAsState(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p5}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->getReplies$stream_chat_android_client_release(Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final getRepliesAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "IZ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ThreadState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v5, p4

    .line 1
    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getRepliesAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getRepliesAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    sget-object p4, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p4}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p4

    invoke-static {p4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p4

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getRepliesAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZLbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final getState(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/StateRegistry;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    const-string v4, ", T: "

    const-class v5, Lio/getstream/chat/android/client/api/state/StateRegistry;

    const-class v6, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-interface {v8}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-interface {v7}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    const-string v9, "[resolveDependency] DR: "

    invoke-static {v9, v8, v4, v7}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v2, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v7, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    invoke-virtual {v0, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v1, v7}, Lk93/c;->b(Lj93/d;Lj93/d;)Z

    move-result v1

    const-string v7, "\'"

    const-string v8, "Dependency \'"

    const-string v9, "\' was not found. Did you init it within ChatClient?"

    if-eqz v1, :cond_6

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v10, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v12, "[resolveFactoryDependency] F: "

    invoke-static {v12, v11, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v10, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getPluginFactories()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    instance-of v1, v1, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    if-eqz v1, :cond_2

    move-object v3, v0

    :cond_3
    check-cast v3, Lio/getstream/chat/android/client/plugin/factory/PluginFactory;

    if-eqz v3, :cond_5

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/client/plugin/DependencyResolver;->resolveDependency(Lj93/d;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    goto/16 :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\' was not resolved by factory \'"

    invoke-static {v8, v1, v2, p0, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Factory \'"

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v10, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-virtual {v0, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v1, v10}, Lk93/c;->b(Lj93/d;Lj93/d;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v10, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-interface {v11}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v12, "[resolvePluginDependency] P: "

    invoke-static {v12, v11, v4, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v10, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v0

    const-wide/16 v10, 0x2710

    invoke-virtual {p0, v10, v11}, Lio/getstream/chat/android/client/ChatClient;->awaitInitializationState(J)Lio/getstream/chat/android/models/InitializationState;

    move-result-object p0

    sget-object v1, Lio/getstream/chat/android/models/InitializationState;->COMPLETE:Lio/getstream/chat/android/models/InitializationState;

    if-eq p0, v1, :cond_9

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lb23/i;->c:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[resolvePluginDependency] failed (initializationState is not COMPLETE): "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, v2, p0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "ChatClient::connectUser() must be called before resolving any dependency"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    instance-of v1, v1, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    if-eqz v1, :cond_a

    move-object v3, v0

    :cond_b
    check-cast v3, Lio/getstream/chat/android/client/plugin/Plugin;

    if-eqz v3, :cond_d

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/getstream/chat/android/client/plugin/DependencyResolver;->resolveDependency(Lj93/d;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    :goto_0
    check-cast v0, Lio/getstream/chat/android/client/api/state/StateRegistry;

    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "\' was not resolved by plugin \'"

    invoke-static {v8, v1, v2, p0, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Plugin \'"

    invoke-static {v1, v0, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v0, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported dependency resolver: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final getStateOrNull(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lbc3/c0;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getInitializationState()Lec3/f2;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p0

    invoke-interface {p0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p0

    new-instance v1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$$inlined$map$1;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$$inlined$map$1;-><init>(Lec3/l;)V

    new-instance p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v2, Lec3/l1;

    const/4 v4, 0x1

    invoke-direct {v2, v0, v1, p0, v4}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;

    invoke-direct {v0, p2, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v0, p0}, Lec3/v;->I(Lc93/m;Lec3/l;)Lfc3/k;

    move-result-object p0

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    invoke-static {p0, p1, p2, v3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessagesAroundId$lambda$15(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static synthetic i(Lbc3/k1;)Lbc3/l1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->setMessageForReply$lambda$8(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/l1;

    return-object p0
.end method

.method public static final loadMessageById(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v4, "[loadMessageById] cid: "

    const-string v5, ", messageId: "

    invoke-static {v4, p1, v5, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v2, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lo23/h;

    new-instance v1, Lih0/t;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageById$3;

    invoke-direct {v2, p0, p1, p2, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageById$3;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final loadMessageById$lambda$19(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method private static final loadMessageByIdInternal(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;

    iget v1, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$5:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iget-object p0, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$4:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iget-object p0, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$3:Ljava/lang/Object;

    check-cast p0, Ln23/h;

    iget-object p0, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$2:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/String;

    iget-object p0, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iget-object p0, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/internal/ValidationKt;->validateCidWithResult(Ljava/lang/String;)Ln23/h;

    move-result-object p3

    instance-of v2, p3, Ln23/f;

    if-eqz v2, :cond_3

    return-object p3

    :cond_3
    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p3, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->getLogic(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p0

    invoke-virtual {p0, p3, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p0

    iput-object v4, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessageByIdInternal$1;->label:I

    invoke-interface {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->loadAround(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Ln23/h;

    instance-of p0, p3, Ln23/g;

    if-eqz p0, :cond_8

    check-cast p3, Ln23/g;

    iget-object p0, p3, Ln23/g;->a:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v4, p3

    :cond_6
    check-cast v4, Lio/getstream/chat/android/models/Message;

    if-eqz v4, :cond_7

    check-cast p0, Lio/getstream/chat/android/models/Channel;

    new-instance p0, Ln23/g;

    invoke-direct {p0, v4}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_7
    new-instance p0, Ln23/f;

    new-instance p1, Ln23/a;

    const-string p2, "The message could not be found."

    invoke-direct {p1, p2}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object p0

    :cond_8
    instance-of p0, p3, Ln23/f;

    if-eqz p0, :cond_9

    new-instance p0, Ln23/f;

    new-instance p1, Ln23/a;

    const-string p3, "Error while fetching messages from backend. Messages around id: "

    invoke-static {p3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object p0

    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final loadMessagesAroundId(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v4, "[loadMessagesAroundId] cid: "

    const-string v5, ", messageId: "

    invoke-static {v4, p1, v5, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v2, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lo23/h;

    new-instance v1, Lih0/t;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;

    invoke-direct {v2, p1, p0, p2, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final loadMessagesAroundId$lambda$15(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final loadNewerMessages(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;I)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseMessageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v3, ", messageLimit: "

    const-string v4, ", baseMessageId: "

    const-string v5, "[loadNewerMessages] cid: "

    invoke-static {p3, v5, p1, v3, v4}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lo23/h;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadNewerMessages$3;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v3, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadNewerMessages$3;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final loadNewerMessages$lambda$13(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final loadNewestMessages(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZ)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "IZ)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v3, ", messageLimit: "

    const-string v4, ", userPresence: "

    const-string v5, "[loadNewestMessages] cid: "

    invoke-static {p2, v5, p1, v3, v4}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lo23/h;

    new-instance v1, Lih0/t;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadNewestMessages$3;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v3, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadNewestMessages$3;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;IZLq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method public static synthetic loadNewestMessages$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZILjava/lang/Object;)Lo23/d;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadNewestMessages(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;IZ)Lo23/d;

    move-result-object p0

    return-object p0
.end method

.method private static final loadNewestMessages$lambda$23(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final loadOlderMessages(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;I)Lo23/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v4, "[loadOlderMessages] cid: "

    const-string v5, ", messageLimit: "

    invoke-static {p2, v4, p1, v5}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v2, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lo23/h;

    new-instance v1, Lih0/t;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadOlderMessages$3;

    invoke-direct {v2, p1, p0, p2, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadOlderMessages$3;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;ILq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final loadOlderMessages$lambda$11(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final queryChannelsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lec3/f2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryChannelsAsState$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;ILjava/lang/Object;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final queryChannelsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)Lec3/f2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    .line 2
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryChannelsAsState$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;ILjava/lang/Object;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final queryChannelsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;)Lec3/f2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            "Lbc3/c0;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEventHandlerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lb23/i;->a:Lb23/i;

    .line 4
    sget-object v0, Lb23/i;->d:Lb23/e;

    .line 5
    sget-object v1, Lb23/g;->y:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lb23/i;->c:Lb23/j;

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[queryChannelsAsState] request: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 8
    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    :cond_0
    new-instance v5, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;

    const/4 v10, 0x0

    move-object v6, p0

    move-object v8, p1

    move-object v9, p2

    move-object v7, p3

    invoke-direct/range {v5 .. v10}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryChannelsAsState$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)V

    invoke-static {v6, v7, v5}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getStateOrNull(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic queryChannelsAsState$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;ILjava/lang/Object;)Lec3/f2;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p5

    invoke-direct {p2, p5}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p3}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p3

    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p3

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryChannelsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final queryThreadsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lbc3/c0;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryThreadsAsState$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p1, v1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$queryThreadsAsState$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)V

    invoke-static {p0, p2, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getStateOrNull(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic queryThreadsAsState$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;ILjava/lang/Object;)Lec3/f2;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p2}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryThreadsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final setMessageForReply(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo23/h;

    new-instance v1, Lih0/t;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lih0/t;-><init>(I)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$setMessageForReply$2;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, p2, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$setMessageForReply$2;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    invoke-direct {v0, v1, v2}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0
.end method

.method private static final setMessageForReply$lambda$8(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/l1;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method public static final watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;I)Lec3/f2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "I)",
            "Lec3/f2;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;ILjava/lang/Object;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "I",
            "Lbc3/c0;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lb23/i;->a:Lb23/i;

    .line 4
    sget-object v0, Lb23/i;->d:Lb23/e;

    .line 5
    sget-object v1, Lb23/g;->z:Lb23/g;

    const-string v2, "Chat:Client-StatePlugin"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lb23/i;->c:Lb23/j;

    .line 7
    const-string v3, "[watchChannelAsState] cid: "

    const-string v4, ", messageLimit: "

    .line 8
    invoke-static {p2, v3, p1, v4}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 9
    invoke-interface {v0, v1, v2, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :cond_0
    new-instance v5, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$watchChannelAsState$2;

    const/4 v10, 0x0

    move-object v6, p0

    move-object v8, p1

    move v9, p2

    move-object v7, p3

    invoke-direct/range {v5 .. v10}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$watchChannelAsState$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Ljava/lang/String;ILq83/d;)V

    invoke-static {v6, v7, v5}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getStateOrNull(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;)Lec3/f2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    .line 2
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;ILjava/lang/Object;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static final watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;)Lec3/f2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lbc3/c0;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v0, Lb23/i;->a:Lb23/i;

    .line 18
    sget-object v0, Lb23/i;->d:Lb23/e;

    .line 19
    sget-object v4, Lb23/g;->z:Lb23/g;

    const-string v5, "Chat:Client-StatePlugin"

    invoke-interface {v0, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lb23/i;->c:Lb23/j;

    .line 21
    const-string v6, ", messageLimit: "

    const-string v7, ", aroundMessageId: "

    .line 22
    const-string v8, "[watchChannelAsState] cid: "

    invoke-static {p2, v8, p1, v6, v7}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 23
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    .line 24
    invoke-interface {v0, v4, v5, v6, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$watchChannelAsState$4;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v2, p4

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$watchChannelAsState$4;-><init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Ljava/lang/String;ILjava/lang/String;Lq83/d;)V

    invoke-static {p0, p4, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getStateOrNull(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic watchChannelAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;ILjava/lang/Object;)Lec3/f2;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    sget-object p3, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p3}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p3

    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p3

    .line 2
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic watchChannelAsState$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;ILjava/lang/Object;)Lec3/f2;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 3
    sget-object p4, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p4}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p4

    invoke-static {p4}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p4

    .line 4
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method
