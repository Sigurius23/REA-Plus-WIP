.class final Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->setUserPushPreference(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/PushPreference;",
        "result",
        "Ll83/a0;",
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
    c = "io.getstream.chat.android.client.ChatClient$setUserPushPreference$1"
    f = "ChatClient.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->label:I

    if-nez v2, :cond_2

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v1, Ln23/g;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v2}, Lio/getstream/chat/android/client/ChatClient;->access$getMutableClientState$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->getUser()Lec3/f2;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/User;

    if-nez v4, :cond_0

    return-object v3

    :cond_0
    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object/from16 v27, v1

    check-cast v27, Lio/getstream/chat/android/models/PushPreference;

    const v30, 0x1bfffff

    const/16 v31, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    invoke-static/range {v4 .. v31}, Lio/getstream/chat/android/models/User;->copy$default(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/User;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$setUserPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v2}, Lio/getstream/chat/android/client/ChatClient;->access$getMutableClientState$p(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    move-result-object v2

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->setUser(Lio/getstream/chat/android/models/User;)V

    :cond_1
    return-object v3

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
