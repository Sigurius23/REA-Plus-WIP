.class final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2$1;->emit(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->access$getLogger(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lb23/k;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    .line 4
    sget-object v2, Lb23/g;->z:Lb23/g;

    .line 5
    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    .line 6
    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const-string v4, "[onSyncEventsReceived] events.size: "

    .line 9
    invoke-static {v1, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    .line 10
    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$startListening$2$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    .line 12
    new-instance v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;-><init>(ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    invoke-static {v0, v1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->access$handleBatchEvent(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
