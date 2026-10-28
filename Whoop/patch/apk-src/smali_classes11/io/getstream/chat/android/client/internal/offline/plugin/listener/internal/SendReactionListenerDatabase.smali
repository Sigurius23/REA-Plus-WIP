.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ2\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J:\u0010\u001a\u001a\u00020\u00162\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00162\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001cH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ2\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001c2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010%R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "reactionsRepository",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "",
        "",
        "ignoredChannelTypes",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;Ljava/util/Set;)V",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "",
        "enforceUnique",
        "skipPush",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Ll83/a0;",
        "saveReactionInDatabase",
        "(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "cid",
        "onSendReactionRequest",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Ln23/h;",
        "result",
        "onSendReactionResult",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onSendReactionPrecondition",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Ljava/util/Set;",
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

.field private final ignoredChannelTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

.field private final reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
            "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
            "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoredChannelTypes"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->ignoredChannelTypes:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$saveReactionInDatabase(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->saveReactionInDatabase(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final saveReactionInDatabase(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 66
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z",
            "Ljava/lang/Boolean;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p5

    instance-of v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;

    iget v5, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;

    invoke-direct {v4, v0, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v3, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->result:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v6, :cond_6

    if-eq v6, v11, :cond_5

    if-eq v6, v10, :cond_4

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/User;

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    iget-object v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    iget-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/User;

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_5
    iget-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/Reaction;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v2

    move v2, v1

    move-object v1, v6

    goto :goto_3

    :cond_6
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v3}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v3

    if-eqz p3, :cond_7

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :goto_1
    move-object/from16 v14, p4

    goto :goto_2

    :cond_7
    move v6, v12

    goto :goto_1

    :goto_2
    invoke-static {v1, v14, v3, v2, v6}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->enrichWithDataBeforeSending(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZZ)Lio/getstream/chat/android/models/Reaction;

    move-result-object v3

    if-eqz v2, :cond_8

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-virtual {v14}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v15

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    iput-boolean v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iput v11, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    invoke-interface {v6, v14, v15, v7, v4}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->updateReactionsForMessageByDeletedDate(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_8

    goto/16 :goto_7

    :cond_8
    :goto_3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$4:Ljava/lang/Object;

    iput-boolean v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->I$0:I

    iput v10, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    invoke-interface {v6, v1, v4}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_9

    goto/16 :goto_7

    :cond_9
    move v1, v2

    move-object v2, v3

    :goto_4
    move-object v3, v2

    move v2, v1

    :cond_a
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$4:Ljava/lang/Object;

    iput-boolean v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iput v9, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    invoke-interface {v1, v3, v4}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_b

    goto/16 :goto_7

    :cond_b
    move v1, v2

    move-object v2, v3

    :goto_5
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v6

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    iput-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iput v8, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    invoke-interface {v3, v6, v4}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_c

    goto/16 :goto_7

    :cond_c
    :goto_6
    move-object v14, v3

    check-cast v14, Lio/getstream/chat/android/models/Message;

    if-eqz v14, :cond_d

    const v64, 0xffff

    const/16 v65, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, -0x1

    invoke-static/range {v14 .. v65}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    if-eqz v3, :cond_d

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-static {v3, v2, v1}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->addMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Z)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$0:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$1:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$2:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$3:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->L$4:Ljava/lang/Object;

    iput-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->Z$0:Z

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->I$0:I

    const/4 v1, 0x5

    iput v1, v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$saveReactionInDatabase$1;->label:I

    invoke-interface {v6, v2, v4}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_d

    :goto_7
    return-object v5

    :cond_d
    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final onSendReactionPrecondition(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Reaction;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p4, 0x0

    if-eqz p1, :cond_3

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object p1, p4

    :goto_1
    if-nez p2, :cond_4

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Current user is null!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_4
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_9

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->ignoredChannelTypes:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p2

    iput-object p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$0:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionPrecondition$1;->label:I

    invoke-interface {p1, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    if-nez p4, :cond_8

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Reaction::messageId cannot be found in DB!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_8
    new-instance p1, Ln23/g;

    invoke-direct {p1, v3}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_9
    :goto_3
    new-instance p1, Ln23/g;

    invoke-direct {p1, v3}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_a
    :goto_4
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Reaction::messageId and Reaction::type cannot be empty!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method

.method public final onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->saveReactionInDatabase(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p2, p1, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;

    if-eqz p1, :cond_0

    move-object p1, p6

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;

    iget v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->label:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;

    invoke-direct {p1, p0, p6}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p6, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$4:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ln23/h;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->Z$0:Z

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$3:Ljava/lang/Object;

    move-object p5, p2

    check-cast p5, Ln23/h;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p6, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p4

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$2:Ljava/lang/Object;

    iput-object p5, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$3:Ljava/lang/Object;

    iput-boolean p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->Z$0:Z

    iput v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->label:I

    invoke-interface {p6, v1, p2, p4, p1}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p6, Lio/getstream/chat/android/models/Reaction;

    if-eqz p6, :cond_5

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;->reactionsRepository:Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-static {p6, p5}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->updateSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;

    move-result-object p4

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$0:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$3:Ljava/lang/Object;

    iput-object v4, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->L$4:Ljava/lang/Object;

    iput-boolean p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->Z$0:Z

    const/4 p3, 0x0

    iput p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->I$0:I

    iput v2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase$onSendReactionResult$1;->label:I

    invoke-interface {p2, p4, p1}, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;->insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
