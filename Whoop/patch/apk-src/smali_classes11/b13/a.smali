.class public final synthetic Lb13/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lb13/a;->w:I

    iput-object p2, p0, Lb13/a;->x:Ljava/lang/Object;

    iput-object p3, p0, Lb13/a;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget v0, p0, Lb13/a;->w:I

    iget-object v1, p0, Lb13/a;->y:Ljava/lang/Object;

    iget-object v2, p0, Lb13/a;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    invoke-static {v2, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;->a(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;Landroid/view/View;)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    check-cast v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    sget-object p1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->M:Lkc3/d;

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object p1

    sget-object v0, Lq30/c;->w:Lq30/c;

    invoke-virtual {p1, v0}, Lt30/g;->g(Lq30/h;)V

    return-void

    :pswitch_1
    check-cast v2, Ls40/z0;

    check-cast v1, Ls40/y0;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/o2;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {v2, p1}, Ls40/z0;->a(I)V

    return-void

    :pswitch_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast v1, Lcom/whoop/domain/model/teams/TeamUserListing;

    invoke-static {v2, v1, p1}, Lrq0/d1;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUserListing;Landroid/view/View;)V

    return-void

    :pswitch_3
    check-cast v2, Leq0/x1;

    check-cast v1, Lrq0/t0;

    invoke-static {v2, v1, p1}, Lrq0/t0;->N(Leq0/x1;Lrq0/t0;Landroid/view/View;)V

    return-void

    :pswitch_4
    check-cast v2, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    check-cast v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v2, v1, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->T(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V

    return-void

    :pswitch_5
    check-cast v2, Lmr/n;

    check-cast v1, Landroid/view/View$OnClickListener;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Lmr/l;->a(I)V

    return-void

    :pswitch_6
    check-cast v2, Llq0/g;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-static {v2, v1, p1}, Llq0/g;->l(Llq0/g;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;)V

    return-void

    :pswitch_7
    check-cast v2, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    check-cast v1, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;

    invoke-static {v2, v1, p1}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;->a(Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_8
    check-cast v2, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    check-cast v1, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;

    invoke-static {v2, v1, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;->a(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$MessagePreviewViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_9
    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;

    invoke-static {v2, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_a
    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;

    invoke-static {v2, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_b
    check-cast v2, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;

    check-cast v1, Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;

    invoke-static {v2, v1, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;->D(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;Landroid/view/View;)V

    return-void

    :pswitch_c
    check-cast v2, Lcom/whoop/ui/WhoopEditText;

    check-cast v1, Lbh3/b;

    invoke-static {v2, v1, p1}, Lcom/whoop/ui/WhoopEditText;->O(Lcom/whoop/ui/WhoopEditText;Lbh3/b;Landroid/view/View;)V

    return-void

    :pswitch_d
    check-cast v2, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;

    check-cast v1, Landroid/app/Activity;

    invoke-static {v2, v1, p1}, Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;->a(Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;Landroid/app/Activity;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
