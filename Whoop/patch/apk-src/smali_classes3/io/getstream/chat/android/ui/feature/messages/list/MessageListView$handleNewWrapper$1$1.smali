.class final Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "io.getstream.chat.android.ui.feature.messages.list.MessageListView$handleNewWrapper$1$1"
    f = "MessageListView.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $filteredList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/model/MessageListItemWrapper;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;",
            "Lio/getstream/chat/android/ui/model/MessageListItemWrapper;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$filteredList:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;ZLio/getstream/chat/android/ui/model/MessageListItemWrapper;ZLjava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->invokeSuspend$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;ZLio/getstream/chat/android/ui/model/MessageListItemWrapper;ZLjava/util/List;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;ZLio/getstream/chat/android/ui/model/MessageListItemWrapper;ZLjava/util/List;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getScrollHelper$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->getHasNewMessages()Z

    move-result v0

    if-eqz p3, :cond_0

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->getEndOfNewMessagesReached()Z

    move-result p2

    invoke-virtual {p0, p1, v0, p3, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->onMessageListChanged$stream_chat_android_ui_components_release(ZZZZ)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    const-string p0, "scrollHelper"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$filteredList:Ljava/util/List;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/model/MessageListItemWrapper;Ljava/util/List;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->label:I

    if-nez v0, :cond_10

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getAdapter$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object p1

    const-string v0, "adapter"

    const/4 v1, 0x0

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->isThread()Z

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->isThread()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->isThread()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->getItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v3, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getAdapter$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/z0;->getItemCount()I

    move-result p1

    if-gt p1, v3, :cond_3

    :cond_1
    move v6, v3

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    move v6, v2

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getAdapter$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->isThread()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->isThread()Z

    move-result p1

    if-nez p1, :cond_4

    move v2, v3

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getAdapter$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v6, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    new-instance v3, Lxa0/a;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lxa0/a;-><init>(I)V

    invoke-static {p1, v3}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    new-instance v3, Lxb3/e;

    invoke-direct {v3, p1}, Lxb3/e;-><init>(Lxb3/f;)V

    :cond_5
    invoke-virtual {v3}, Lxb3/e;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v3}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_6
    move-object p1, v1

    :goto_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz p1, :cond_7

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getEnterThreadListener$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;->onThreadEntered(Lio/getstream/chat/android/models/Message;)Z

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getAdapter$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->isThread()Z

    move-result v3

    invoke-virtual {p1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;->setThread(Z)V

    if-eqz v6, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getMessageListViewStyle$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getThreadMessagesStart()I

    move-result p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$chatMessageStart(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;I)V

    goto :goto_2

    :cond_8
    if-eqz v2, :cond_9

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getMessageListViewStyle$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getMessagesStart()I

    move-result p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$chatMessageStart(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;I)V

    :cond_9
    :goto_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getLogger(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lb23/k;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$filteredList:Ljava/util/List;

    iget-object v3, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "[handleNewWrapper] isOldListEmpty: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, ", filteredList.size: "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v5, v4, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$getAdapter$p(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v9, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$filteredList:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->$listItem:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/b1;

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/ui/feature/messages/list/b1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;ZLio/getstream/chat/android/ui/model/MessageListItemWrapper;ZLjava/util/List;)V

    invoke-static {p1, v2, v9, v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->access$submitListOnAnimationsFinished(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;Ljava/util/List;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_c
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_d
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
