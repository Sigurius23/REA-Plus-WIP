.class public interface abstract Lio/getstream/chat/android/client/debugger/ChatClientDebugger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;",
        "",
        "",
        "tag",
        "src",
        "desc",
        "Ln23/e;",
        "error",
        "Ll83/a0;",
        "onNonFatalErrorOccurred",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln23/e;)V",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "",
        "isRetrying",
        "Lio/getstream/chat/android/client/debugger/SendMessageDebugger;",
        "debugSendMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lio/getstream/chat/android/client/debugger/SendMessageDebugger;",
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


# direct methods
.method public static synthetic debugSendMessage$default(Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lio/getstream/chat/android/client/debugger/SendMessageDebugger;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/debugger/ChatClientDebugger;->debugSendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lio/getstream/chat/android/client/debugger/SendMessageDebugger;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: debugSendMessage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public debugSendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lio/getstream/chat/android/client/debugger/SendMessageDebugger;
    .locals 0

    const-string p4, "channelType"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "message"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/debugger/StubSendMessageDebugger;->INSTANCE:Lio/getstream/chat/android/client/debugger/StubSendMessageDebugger;

    return-object p1
.end method

.method public onNonFatalErrorOccurred(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln23/e;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "src"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "desc"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "error"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
