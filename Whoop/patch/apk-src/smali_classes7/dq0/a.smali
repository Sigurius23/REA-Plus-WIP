.class public final Ldq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldq0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ-\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Ldq0/a;",
        "Ldq0/b;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "",
        "token",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/ConnectionData;",
        "c",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;",
        "a",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "d",
        "(Ljava/lang/String;)Lo23/d;",
        "getCurrentUser",
        "()Lio/getstream/chat/android/models/User;",
        "channelType",
        "channelId",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
        "e",
        "()V",
        "message",
        "sendMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "cid",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "f",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;)V
    .locals 1

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    return-void
.end method


# virtual methods
.method public a(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/client/ChatClient;->switchUser$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Long;Lc93/a;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->markRead(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->connectUser$default(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lo23/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->deleteMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lio/getstream/chat/android/client/ChatClient;->disconnect$default(Lio/getstream/chat/android/client/ChatClient;ZZILjava/lang/Object;)Lo23/d;

    move-result-object v0

    check-cast v0, Lo23/h;

    invoke-virtual {v0}, Lo23/h;->enqueue()V

    return-void
.end method

.method public f(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p1

    return-object p1
.end method

.method public getCurrentUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0
.end method

.method public sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ldq0/a;->a:Lio/getstream/chat/android/client/ChatClient;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/client/ChatClient;->sendMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1
.end method
