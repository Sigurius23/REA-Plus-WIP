.class public final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JC\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00112\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;",
        "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Reaction;",
        "originalCall",
        "reaction",
        "",
        "enforceUnique",
        "skipPush",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Lo23/q;",
        "onSendReactionError",
        "(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
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
.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method public static final synthetic access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-object p0
.end method


# virtual methods
.method public final onSendReactionError(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p2

    move v5, p3

    move v6, p4

    move-object v4, p5

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl$onSendReactionError$1;-><init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZLq83/d;)V

    invoke-static {p1, v0, v1}, Lo23/f;->h(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/q;

    move-result-object p1

    return-object p1
.end method
