.class public final Lio/getstream/chat/android/client/user/CredentialConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000f\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/client/user/CredentialConfig;",
        "",
        "userId",
        "",
        "userToken",
        "userName",
        "isAnonymous",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getUserId",
        "()Ljava/lang/String;",
        "getUserToken",
        "getUserName",
        "()Z",
        "isValid",
        "isValid$stream_chat_android_client_release",
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
.field private final isAnonymous:Z

.field private final userId:Ljava/lang/String;

.field private final userName:Ljava/lang/String;

.field private final userToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userId:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userToken:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userName:Ljava/lang/String;

    iput-boolean p4, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->isAnonymous:Z

    return-void
.end method


# virtual methods
.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userToken:Ljava/lang/String;

    return-object v0
.end method

.method public final isAnonymous()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->isAnonymous:Z

    return v0
.end method

.method public final isValid$stream_chat_android_client_release()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userId:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userToken:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CredentialConfig;->userName:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
