.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;
.super Landroidx/recyclerview/widget/z1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;ZLio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2",
        "Landroidx/recyclerview/widget/z1;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "newState",
        "Ll83/a0;",
        "onScrollStateChanged",
        "(Landroidx/recyclerview/widget/RecyclerView;I)V",
        "dx",
        "dy",
        "onScrolled",
        "(Landroidx/recyclerview/widget/RecyclerView;II)V",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 4

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getLogger(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onScrollStateChanged] newState: "

    invoke-static {p2, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getDisableScrollWhenShowingDialog$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$stopScrollIfPopupShown(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_1
    return-void
.end method

.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5

    const-string p2, "recyclerView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getLogger(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Lb23/k;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    iget-object p3, p1, Lb23/k;->c:Lb23/e;

    sget-object v0, Lb23/g;->y:Lb23/g;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p3, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release()Z

    move-result p3

    invoke-static {p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getCurrentList(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onScrolled] scrollToBottomButtonEnabled: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p3, ", currentList.size: "

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getCurrentList(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$shouldScrollToBottomBeVisible(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Z

    move-result p1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getLogger(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Lb23/k;

    move-result-object p2

    iget-object p3, p2, Lb23/k;->c:Lb23/e;

    iget-object v0, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->x:Lb23/g;

    invoke-interface {p3, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string p3, "[onScrolled] shouldScrollToBottomBeVisible: "

    invoke-static {p3, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, v1, v0, p3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->access$getScrollButtonView$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;

    move-result-object p2

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_0

    :cond_3
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    :goto_1
    return-void
.end method
