.class public final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJU\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00152\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;",
        "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Channel;",
        "originalCall",
        "",
        "channelType",
        "channelId",
        "",
        "memberIds",
        "",
        "",
        "extraData",
        "Lo23/q;",
        "onCreateChannelError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
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
.field private final channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method public static final synthetic access$getChannelRepository$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    return-object p0
.end method

.method public static final synthetic access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-object p0
.end method


# virtual methods
.method public final onCreateChannelError(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p5, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;->scope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl$onCreateChannelError$1;-><init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lq83/d;)V

    invoke-static {p1, p5, v0}, Lo23/f;->h(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/q;

    move-result-object p1

    return-object p1
.end method
