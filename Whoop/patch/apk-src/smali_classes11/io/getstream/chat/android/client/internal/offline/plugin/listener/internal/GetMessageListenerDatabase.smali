.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J&\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repositoryFacade",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V",
        "",
        "messageId",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "Ll83/a0;",
        "onGetMessageResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lb23/k;",
        "logger",
        "Lb23/k;",
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
.field private final logger:Lb23/k;

.field private final repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V
    .locals 3

    const-string v0, "repositoryFacade"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    new-instance p1, Lb23/k;

    sget-object v0, Lb23/i;->c:Lb23/j;

    sget-object v1, Lb23/i;->d:Lb23/e;

    const-string v2, "Chat: GetMessageListenerDatabase"

    invoke-direct {p1, v2, v0, v1}, Lb23/k;-><init>(Ljava/lang/String;Lb23/j;Lb23/e;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;->logger:Lb23/k;

    return-void
.end method


# virtual methods
.method public final onGetMessageResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    check-cast p2, Ln23/g;

    iget-object p2, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1, p2, p3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_0
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_2

    check-cast p2, Ln23/f;

    iget-object p1, p2, Ln23/f;->a:Ln23/e;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;->logger:Lb23/k;

    iget-object p3, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {p3, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string p3, "[onGetMessageResult] Could not insert the message into the database. The API call had failed with: "

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    invoke-interface {p2, v2, v1, p1, p3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
