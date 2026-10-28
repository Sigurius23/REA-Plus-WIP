.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/recyclerview/widget/o2;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/o2;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->x:Landroidx/recyclerview/widget/o2;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->x:Landroidx/recyclerview/widget/o2;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->x:Landroidx/recyclerview/widget/o2;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
