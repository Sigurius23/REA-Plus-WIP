.class public final Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

.field public final channelNameLabel:Landroid/widget/TextView;

.field public final draftMessageLabel:Landroid/widget/TextView;

.field public final foregroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final guideline:Landroidx/constraintlayout/widget/Guideline;

.field public final lastMessageLabel:Landroid/widget/TextView;

.field public final lastMessageTimeLabel:Landroid/widget/TextView;

.field public final messageStatusImageView:Landroid/widget/ImageView;

.field public final muteIcon:Landroid/widget/ImageView;

.field public final readCountView:Landroid/widget/TextView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final spacer:Landroid/view/View;

.field public final typingIndicatorView:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

.field public final unreadCountBadge:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->channelNameLabel:Landroid/widget/TextView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->draftMessageLabel:Landroid/widget/TextView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->foregroundView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->guideline:Landroidx/constraintlayout/widget/Guideline;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageLabel:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->lastMessageTimeLabel:Landroid/widget/TextView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->messageStatusImageView:Landroid/widget/ImageView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->muteIcon:Landroid/widget/ImageView;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->readCountView:Landroid/widget/TextView;

    iput-object p12, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->spacer:Landroid/view/View;

    iput-object p13, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->typingIndicatorView:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

    iput-object p14, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->unreadCountBadge:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;
    .locals 18

    move-object/from16 v0, p0

    sget v1, Lio/getstream/chat/android/ui/R$id;->channelAvatarView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    if-eqz v5, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->channelNameLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->draftMessageLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v1, Lio/getstream/chat/android/ui/R$id;->guideline:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v9, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->lastMessageLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->lastMessageTimeLabel:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->messageStatusImageView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ImageView;

    if-eqz v12, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->muteIcon:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/ImageView;

    if-eqz v13, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->readCountView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->spacer:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    if-eqz v15, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->typingIndicatorView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

    if-eqz v16, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->unreadCountBadge:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/TextView;

    if-eqz v17, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    move-object v8, v4

    invoke-direct/range {v3 .. v17}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Landroid/widget/TextView;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_channel_list_item_foreground_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
