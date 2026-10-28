.class public final Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;",
        "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logicRegistry",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repositoryFacade",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V",
        "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "create",
        "()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
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

.field private final logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logicRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repositoryFacade"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-void
.end method


# virtual methods
.method public final create()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
    .locals 6

    new-instance v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->scope:Lbc3/c0;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-direct {v0, v1, v2, v3}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/DeleteReactionErrorHandlerImpl;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->scope:Lbc3/c0;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;

    invoke-direct {v4, v1, v3, v2}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->scope:Lbc3/c0;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-direct {v1, v2, v3, v5}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V

    new-instance v2, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->scope:Lbc3/c0;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-direct {v2, v3, v5}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/SendReactionErrorHandlerImpl;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    new-instance v3, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;

    invoke-direct {v3, v0, v4, v1, v2}, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;-><init>(Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;)V

    return-object v3
.end method
