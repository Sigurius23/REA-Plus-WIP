.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
