.class public final Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final channelItemView:Landroid/widget/FrameLayout;

.field public final itemBackgroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;

.field public final itemForegroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

.field private final rootView:Landroid/widget/FrameLayout;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->rootView:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->channelItemView:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemBackgroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->itemForegroundView:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;
    .locals 4

    move-object v0, p0

    check-cast v0, Landroid/widget/FrameLayout;

    sget v1, Lio/getstream/chat/android/ui/R$id;->itemBackgroundView:I

    invoke-static {p0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$id;->itemForegroundView:I

    invoke-static {p0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;

    move-result-object p0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    invoke-direct {v2, v0, v0, v1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemBackgroundViewBinding;Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemForegroundViewBinding;)V

    return-object v2

    :cond_0
    move v1, v2

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_channel_list_item_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getRoot()Landroid/widget/FrameLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListItemViewBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method
