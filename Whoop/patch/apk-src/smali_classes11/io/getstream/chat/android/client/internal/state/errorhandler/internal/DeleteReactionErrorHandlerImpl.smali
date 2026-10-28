.class public final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ5\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00102\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;",
        "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Message;",
        "originalCall",
        "",
        "cid",
        "messageId",
        "Lo23/q;",
        "onDeleteReactionError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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

.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method public static final synthetic access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-object p0
.end method

.method public static final synthetic access$getLogic$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-object p0
.end method


# virtual methods
.method public final onDeleteReactionError(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p3, v2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl$onDeleteReactionError$1;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;Ljava/lang/String;Lq83/d;)V

    invoke-static {p1, v0, v1}, Lo23/f;->h(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/q;

    move-result-object p1

    return-object p1
.end method
