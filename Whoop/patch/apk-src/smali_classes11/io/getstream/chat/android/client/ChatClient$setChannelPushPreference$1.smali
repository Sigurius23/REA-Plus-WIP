.class final Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->setChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$setChannelPushPreference$1"
    f = "ChatClient.kt"
    l = {
        0x6ae
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $level:Lio/getstream/chat/android/models/PushPreferenceLevel;

.field I$0:I

.field I$1:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->$cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->$level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->$cid:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->$level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->I$0:I

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/plugin/Plugin;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/PushPreferenceLevel;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->$cid:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->$level:Lio/getstream/chat/android/models/PushPreferenceLevel;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v7, v2

    move v2, v3

    move-object v6, v5

    move-object v5, p1

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    iput-object v0, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$0:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$4:Ljava/lang/Object;

    iput-object v9, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$5:Ljava/lang/Object;

    iput-object v9, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->L$6:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->I$1:I

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$setChannelPushPreference$1;->label:I

    invoke-interface {p1, v7, v6, v0, p0}, Lio/getstream/chat/android/client/plugin/Plugin;->onChannelPushPreferenceSet(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;

    if-ne v8, v1, :cond_2

    return-object v1

    :cond_3
    return-object v8
.end method
