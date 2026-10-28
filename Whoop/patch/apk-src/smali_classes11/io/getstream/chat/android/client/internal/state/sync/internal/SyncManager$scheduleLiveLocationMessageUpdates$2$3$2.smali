.class final Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$scheduleLiveLocationMessageUpdates$2$3$2"
    f = "SyncManager.kt"
    l = {
        0xab,
        0xb4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $delayMillis:J

.field final synthetic $location:Lio/getstream/chat/android/models/Location;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;


# direct methods
.method public constructor <init>(JLio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Location;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
            "Lio/getstream/chat/android/models/Location;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$delayMillis:J

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$location:Lio/getstream/chat/android/models/Location;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;

    iget-wide v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$delayMillis:J

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$location:Lio/getstream/chat/android/models/Location;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;-><init>(JLio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Location;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v5, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$delayMillis:J

    iput v4, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->label:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$location:Lio/getstream/chat/android/models/Location;

    iget-object v4, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Location;->getEndAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v1

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[scheduleLiveLocationMessageUpdates] live location sharing ended at "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", messageId: "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v6, v5, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getChatClient$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object v4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$location:Lio/getstream/chat/android/models/Location;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v5

    const-string p1, "live_location_sharing_ended"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lio/getstream/chat/android/client/ChatClient;->partialUpdateMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->label:I

    check-cast p1, Lo23/k;

    invoke-virtual {p1, p0}, Lo23/k;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;->$location:Lio/getstream/chat/android/models/Location;

    instance-of v3, p1, Ln23/g;

    if-nez v3, :cond_7

    instance-of v3, p1, Ln23/f;

    if-eqz v3, :cond_6

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "[scheduleLiveLocationMessageUpdates] failed to update message: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", error: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v5, v4, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
