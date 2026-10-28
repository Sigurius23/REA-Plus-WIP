.class final Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->scheduleLiveLocationMessageUpdates()V
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
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lio/getstream/chat/android/models/Location;",
        "locations",
        "Ll83/a0;",
        "<anonymous>",
        "(Ljava/util/List;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$scheduleLiveLocationMessageUpdates$2"
    f = "SyncManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;-><init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->invoke(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->label:I

    if-nez v1, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const-string v5, "[scheduleLiveLocationMessageUpdates] locations: "

    invoke-static {v1, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLiveLocationJobs$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    invoke-interface {v1, v4}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lio/getstream/chat/android/models/Location;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Location;->getEndAt()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    goto :goto_2

    :cond_2
    invoke-static {v8}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getNow$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lc93/a;

    move-result-object v0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    :goto_2
    invoke-static {v8}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getNow$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lc93/a;

    move-result-object v2

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sub-long v6, v0, v2

    invoke-static {v8}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLogger(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Location;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v5

    const-string v10, ", messageId: "

    const-string v11, ", delayMillis: "

    const-string v12, "[scheduleLiveLocationMessageUpdates] cid: "

    invoke-static {v12, v1, v10, v5, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-static {v8}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getLiveLocationJobs$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v8}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$getSyncScope$p(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;)Lbc3/c0;

    move-result-object v1

    new-instance v5, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$scheduleLiveLocationMessageUpdates$2$3$2;-><init>(JLio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/models/Location;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v1, v4, v4, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
