.class final Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->propagateData(Ljava/lang/String;)V
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
    c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$propagateData$1"
    f = "StartStopBuffer.kt"
    l = {
        0x5c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;-><init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->access$getActive$p(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->access$getEvents$p(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Ljava/util/Queue;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->access$aboveSafetyThreshold(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->access$getEvents$p(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Ljava/util/Queue;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    sget-object v3, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1$1$1;

    const/4 v5, 0x0

    invoke-direct {v4, v1, p1, v5}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1$1$1;-><init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Ljava/lang/Object;Lq83/d;)V

    iput-object v5, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;->label:I

    invoke-static {v3, v4, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Ll83/a0;

    goto :goto_0

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
