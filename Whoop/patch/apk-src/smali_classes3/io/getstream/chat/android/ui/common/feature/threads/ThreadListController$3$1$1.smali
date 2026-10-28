.class final Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/p;


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
        "Lc93/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0006H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;",
        "threads",
        "",
        "Lio/getstream/chat/android/models/Thread;",
        "loading",
        "",
        "loadingMore",
        "unseenThreadIds",
        "",
        "",
        "loadingError"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3$1$1"
    f = "ThreadListController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic Z$0:Z

.field synthetic Z$1:Z

.field synthetic Z$2:Z

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v1, p1

    check-cast v1, Ljava/util/List;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object v4, p4

    check-cast v4, Ljava/util/Set;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v6, p6

    check-cast v6, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->invoke(Ljava/util/List;ZZLjava/util/Set;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;ZZLjava/util/Set;ZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;ZZ",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;

    invoke-direct {v0, p6}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;-><init>(Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->Z$0:Z

    iput-boolean p3, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->Z$1:Z

    iput-object p4, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->L$1:Ljava/lang/Object;

    iput-boolean p5, v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->Z$2:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->Z$0:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->Z$1:Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-boolean v6, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->Z$2:Z

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3$1$1;->label:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;-><init>(Ljava/util/List;ZZIZ)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
