.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeMessagesListState()V
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$2"
    f = "MessageListController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {p1, v0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    iput-object p2, p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->L$0:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$showEmptyState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
