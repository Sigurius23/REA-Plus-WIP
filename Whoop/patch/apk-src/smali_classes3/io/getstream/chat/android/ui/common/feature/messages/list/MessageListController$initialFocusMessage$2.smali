.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->initialFocusMessage(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
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
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$initialFocusMessage$2"
    f = "MessageListController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
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
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 0
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
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->label:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getListState()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_mode$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "[initialFocusMessage] mode: "

    invoke-static {v1, v2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p1, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_mode$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$focusChannelMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;)V

    return-object v0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_mode$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getParentMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$initialFocusMessage$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getParentMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$focusThreadMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
