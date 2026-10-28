.class public final Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1"
    f = "ThreadListController.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;

    const/4 v1, 0x3

    .line 1
    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    .line 2
    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->label:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/state/QueryThreadsState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/QueryThreadsState;->getThreads()Lec3/f2;

    move-result-object v4

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/QueryThreadsState;->getLoading()Lec3/f2;

    move-result-object v5

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/QueryThreadsState;->getLoadingMore()Lec3/f2;

    move-result-object v6

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/QueryThreadsState;->getUnseenThreadIds()Lec3/f2;

    move-result-object v7

    invoke-interface {v1}, Lio/getstream/chat/android/client/api/state/QueryThreadsState;->getLoadingError()Lec3/f2;

    move-result-object v1

    new-instance v8, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;-><init>(Lq83/d;)V

    const/4 v10, 0x5

    new-array v10, v10, [Lec3/l;

    const/4 v11, 0x0

    aput-object v4, v10, v11

    aput-object v5, v10, v3

    const/4 v4, 0x2

    aput-object v6, v10, v4

    const/4 v4, 0x3

    aput-object v7, v10, v4

    const/4 v4, 0x4

    aput-object v1, v10, v4

    iput-object v9, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v9, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1;->label:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    new-instance v1, La63/j;

    const/4 v3, 0x7

    invoke-direct {v1, v9, v8, v3}, La63/j;-><init>(Lq83/d;Ll83/e;I)V

    sget-object v3, Lec3/n1;->w:Lec3/n1;

    invoke-static {v3, p1, v1, p0, v10}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    return-object v2
.end method
