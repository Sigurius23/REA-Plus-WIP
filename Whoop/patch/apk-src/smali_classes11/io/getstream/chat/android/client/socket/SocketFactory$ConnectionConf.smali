.class public abstract Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/socket/SocketFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ConnectionConf"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;,
        Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0000H\u0000\u00a2\u0006\u0002\u0008\u0013R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0012\u0010\u000c\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\t8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000b\u0082\u0001\u0002\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "",
        "<init>",
        "()V",
        "value",
        "",
        "isReconnection",
        "()Z",
        "endpoint",
        "",
        "getEndpoint",
        "()Ljava/lang/String;",
        "apiKey",
        "getApiKey",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "asReconnectionConf",
        "asReconnectionConf$stream_chat_android_client_release",
        "id",
        "getId$stream_chat_android_client_release",
        "AnonymousConnectionConf",
        "UserConnectionConf",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;",
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


# instance fields
.field private isReconnection:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final asReconnectionConf$stream_chat_android_client_release()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->isReconnection:Z

    return-object p0
.end method

.method public abstract getApiKey()Ljava/lang/String;
.end method

.method public abstract getEndpoint()Ljava/lang/String;
.end method

.method public final getId$stream_chat_android_client_release()Ljava/lang/String;
    .locals 4

    instance-of v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    const-string v3, "!"

    invoke-static {v0, v3, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public abstract getUser()Lio/getstream/chat/android/models/User;
.end method

.method public final isReconnection()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->isReconnection:Z

    return v0
.end method
