.class public final synthetic Lb30/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb30/k3;->w:I

    iput-object p1, p0, Lb30/k3;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget v0, p0, Lb30/k3;->w:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    iget-object v3, p0, Lb30/k3;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Ljo/s;

    invoke-static {v3}, Ljo/s;->a(Ljo/s;)V

    return-void

    :pswitch_0
    check-cast v3, Lio/sentry/android/core/o1;

    invoke-virtual {v3}, Landroid/app/Dialog;->cancel()V

    return-void

    :pswitch_1
    check-cast v3, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;->a(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_2
    check-cast v3, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;

    sget p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->w:I

    invoke-interface {v3}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;->onUnreadThreadsBannerClick()V

    return-void

    :pswitch_3
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->b(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_4
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$Companion;

    invoke-virtual {v3}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_5
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$Companion;

    invoke-virtual {v3}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_6
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;

    invoke-virtual {v3}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_7
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    invoke-virtual {v3}, Landroidx/fragment/app/y;->dismiss()V

    return-void

    :pswitch_8
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->c(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Landroid/view/View;)V

    return-void

    :pswitch_9
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;->y(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentFragment;)V

    return-void

    :pswitch_a
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_b
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_c
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentAdapter$FileAttachmentViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_d
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;->z(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;)V

    return-void

    :pswitch_e
    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->B(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;Landroid/view/View;)V

    return-void

    :pswitch_f
    check-cast v3, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;->a(Lio/getstream/chat/android/ui/feature/mentions/list/internal/MentionListItemMessageViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_10
    check-cast v3, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentDialogFragment;

    invoke-virtual {v3}, Lpq/l;->dismiss()V

    return-void

    :pswitch_11
    check-cast v3, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->b(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_12
    check-cast v3, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->y(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;Landroid/view/View;)V

    return-void

    :pswitch_13
    check-cast v3, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;->A(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryImagePageFragment;Landroid/view/View;)V

    return-void

    :pswitch_14
    check-cast v3, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;

    invoke-static {v3, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;->a(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter$ChannelMemberViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_15
    check-cast v3, Ldb/c0;

    invoke-virtual {v3}, Ldb/c0;->i()V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0469

    if-ne v0, v1, :cond_0

    iget-object p1, v3, Ldb/c0;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0468

    if-ne p1, v0, :cond_1

    iget-object p1, v3, Ldb/c0;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_1
    :goto_0
    return-void

    :pswitch_16
    check-cast v3, Ldb/l;

    iget-object p1, v3, Ldb/l;->e:Ldb/x;

    iget-object v0, p1, Ldb/x;->J0:Lu8/j0;

    if-eqz v0, :cond_2

    check-cast v0, La2/a;

    invoke-virtual {v0, v1}, La2/a;->A(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->k0()Lo9/j;

    move-result-object v0

    iget-object v1, p1, Ldb/x;->J0:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lo9/i;

    invoke-direct {v2, v0}, Lo9/i;-><init>(Lo9/j;)V

    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lu8/s0;->a(I)V

    const/4 v0, -0x3

    iput v0, v2, Lu8/s0;->r:I

    const/4 v0, 0x0

    new-array v3, v0, [Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo9/i;->c([Ljava/lang/String;)Lu8/s0;

    iput-boolean v0, v2, Lu8/s0;->q:Z

    new-instance v0, Lo9/j;

    invoke-direct {v0, v2}, Lo9/j;-><init>(Lo9/i;)V

    check-cast v1, Lb9/f0;

    invoke-virtual {v1, v0}, Lb9/f0;->D0(Lu8/t0;)V

    iget-object p1, p1, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    return-void

    :pswitch_17
    check-cast v3, Ldb/q;

    iget-object p1, v3, Ldb/q;->d:Ldb/x;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/o2;->getBindingAdapterPosition()I

    move-result v0

    iget-object v1, p1, Ldb/x;->c0:Landroid/view/View;

    if-nez v0, :cond_3

    iget-object v0, p1, Ldb/x;->G:Ldb/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ldb/x;->d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V

    goto :goto_1

    :cond_3
    if-ne v0, v2, :cond_4

    iget-object v0, p1, Ldb/x;->I:Ldb/l;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ldb/x;->d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V

    goto :goto_1

    :cond_4
    iget-object p1, p1, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_1
    return-void

    :pswitch_18
    check-cast v3, Ldb/l;

    iget-object p1, v3, Ldb/l;->e:Ldb/x;

    iget-object v0, p1, Ldb/x;->J0:Lu8/j0;

    if-eqz v0, :cond_6

    check-cast v0, La2/a;

    invoke-virtual {v0, v1}, La2/a;->A(I)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    iget-object v0, p1, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->k0()Lo9/j;

    move-result-object v0

    iget-object v1, p1, Ldb/x;->J0:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lo9/i;

    invoke-direct {v3, v0}, Lo9/i;-><init>(Lo9/j;)V

    invoke-virtual {v3, v2}, Lu8/s0;->a(I)V

    invoke-virtual {v3, v2}, Lo9/i;->d(I)V

    new-instance v0, Lo9/j;

    invoke-direct {v0, v3}, Lo9/j;-><init>(Lo9/i;)V

    check-cast v1, Lb9/f0;

    invoke-virtual {v1, v0}, Lb9/f0;->D0(Lu8/t0;)V

    iget-object v0, p1, Ldb/x;->F:Ldb/r;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f1404d0

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Ldb/r;->c:[Ljava/lang/String;

    aput-object v1, v0, v2

    iget-object p1, p1, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_6
    :goto_2
    return-void

    :pswitch_19
    check-cast v3, Ldb/x;

    iget-boolean p1, v3, Ldb/x;->K0:Z

    xor-int/2addr p1, v2

    invoke-virtual {v3, p1}, Ldb/x;->k(Z)V

    return-void

    :pswitch_1a
    check-cast v3, Lcom/whoop/ui/WhoopEditText;

    invoke-static {v3, p1}, Lcom/whoop/ui/WhoopEditText;->P(Lcom/whoop/ui/WhoopEditText;Landroid/view/View;)V

    return-void

    :pswitch_1b
    check-cast v3, Lcom/google/android/material/datepicker/o;

    invoke-virtual {v3}, Lcom/google/android/material/datepicker/o;->z()V

    const/4 p1, 0x0

    throw p1

    :pswitch_1c
    check-cast v3, Lb30/p3;

    sget p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->O:I

    iget-object p1, v3, Lb30/p3;->c:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
