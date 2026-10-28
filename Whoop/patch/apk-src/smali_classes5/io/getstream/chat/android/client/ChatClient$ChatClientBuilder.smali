.class public abstract Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/ChatClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ChatClientBuilder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0005H\'\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;",
        "",
        "<init>",
        "()V",
        "build",
        "Lio/getstream/chat/android/client/ChatClient;",
        "internalBuild",
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
.method public constructor <init>()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lio/getstream/chat/android/client/ChatClient;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;->internalBuild()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient;->access$setInstance$cp(Lio/getstream/chat/android/client/ChatClient;)V

    return-object v0
.end method

.method public abstract internalBuild()Lio/getstream/chat/android/client/ChatClient;
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation
.end method
