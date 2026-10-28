.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/User;",
        "result",
        "Ll83/a0;",
        "onFetchCurrentUserResult",
        "(Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final logger$delegate:Ll83/h;

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V
    .locals 1

    const-string v0, "userRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    const-string p1, "Chat:FetchCurUserLDB"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUserRepository$p(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;)Lio/getstream/chat/android/client/persistance/repository/UserRepository;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$5:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Ln23/g;

    iget-object p2, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "[onFetchCurrentUserResult] result: "

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->L$5:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->I$1:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase$onFetchCurrentUserResult$1;->label:I

    invoke-interface {v2, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_4
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_6

    :cond_5
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
