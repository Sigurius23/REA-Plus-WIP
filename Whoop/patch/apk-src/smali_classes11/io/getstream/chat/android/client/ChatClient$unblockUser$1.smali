.class final Lio/getstream/chat/android/client/ChatClient$unblockUser$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->unblockUser(Ljava/lang/String;)Lo23/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ln23/h;",
        "Ll83/a0;",
        "result",
        "<anonymous>",
        "(Ln23/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$unblockUser$1"
    f = "ChatClient.kt"
    l = {
        0xe33
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $userId:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$unblockUser$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->$userId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->$userId:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->label:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/User;

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/User;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->$userId:Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-interface {v7, v6, v1}, Lio/getstream/chat/android/client/plugin/Plugin;->onUnblockUserResult(Ljava/lang/String;Ln23/h;)V

    goto :goto_0

    :cond_2
    instance-of v1, v1, Ln23/g;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v1}, Lio/getstream/chat/android/client/ChatClient;->access$getMutableClientState$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->getUser()Lec3/f2;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/models/User;

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getBlockedUserIds()Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->$userId:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getBlockedUserIds()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v3, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->$userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v27

    const v32, 0x1efffff

    const/16 v33, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

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

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v6 .. v33}, Lio/getstream/chat/android/models/User;->copy$default(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/User;

    move-result-object v1

    iget-object v3, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v3}, Lio/getstream/chat/android/client/ChatClient;->access$getUserStateService$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/clientstate/UserStateService;

    move-result-object v3

    const/4 v6, 0x0

    iput-object v6, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$1:Ljava/lang/Object;

    iput-object v1, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->label:I

    invoke-virtual {v3, v1, v0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->onUserUpdated(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    return-object v2

    :cond_4
    :goto_1
    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$unblockUser$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v2}, Lio/getstream/chat/android/client/ChatClient;->access$getMutableClientState$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    move-result-object v2

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->setUser(Lio/getstream/chat/android/models/User;)V

    :cond_5
    :goto_2
    return-object v4
.end method
