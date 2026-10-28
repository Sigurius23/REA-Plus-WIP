.class final Lio/getstream/chat/android/client/scope/UserScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/scope/UserScope;
.implements Lbc3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/scope/UserScopeImpl;",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/scope/ClientScope;",
        "clientScope",
        "Lio/getstream/chat/android/client/scope/user/UserIdentifier;",
        "userIdentifier",
        "<init>",
        "(Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/user/UserIdentifier;)V",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "userId",
        "Ll83/a0;",
        "cancelChildren",
        "(Ljava/lang/String;)V",
        "getUserId",
        "()Lio/getstream/chat/android/client/scope/user/UserIdentifier;",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
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
.field private final synthetic $$delegate_0:Lbc3/c0;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/user/UserIdentifier;)V
    .locals 3

    const-string v0, "clientScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIdentifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1, p2}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object v0

    invoke-interface {p1}, Lio/getstream/chat/android/client/scope/ClientScope;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    new-instance v1, La6/l0;

    const/16 v2, 0x18

    invoke-direct {v1, p2, v2}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/scope/user/UserJobKt;->UserJob(Lbc3/k1;Lc93/a;)Lio/getstream/chat/android/client/scope/user/UserJob;

    move-result-object p1

    invoke-static {v0, p1}, Lbc3/f0;->B(Lbc3/c0;Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/scope/UserScopeImpl;->$$delegate_0:Lbc3/c0;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/user/UserIdentifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 3
    new-instance p2, Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    invoke-direct {p2}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;-><init>()V

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/scope/UserScopeImpl;-><init>(Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/user/UserIdentifier;)V

    return-void
.end method

.method private static final __delegate_0$lambda$0(Lio/getstream/chat/android/client/scope/user/UserIdentifier;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cancelChildren(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/UserScopeImpl;->$$delegate_0:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type io.getstream.chat.android.client.scope.user.UserJob"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/getstream/chat/android/client/scope/user/UserJob;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/scope/user/UserJob;->cancelChildren(Ljava/lang/String;)V

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/UserScopeImpl;->$$delegate_0:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final getUserId()Lio/getstream/chat/android/client/scope/user/UserIdentifier;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/scope/UserScopeImpl;->$$delegate_0:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->Key:Lio/getstream/chat/android/client/scope/user/UserIdentifier$Key;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no UserIdentifier found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
