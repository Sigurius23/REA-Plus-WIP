.class public final Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final channelActionsContainer:Landroid/widget/LinearLayout;

.field public final channelMembersInfoTextView:Landroid/widget/TextView;

.field public final channelMembersTextView:Landroid/widget/TextView;

.field public final optionsContainer:Landroid/widget/LinearLayout;

.field public final recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final rootView:Landroid/widget/LinearLayout;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelActionsContainer:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelMembersInfoTextView:Landroid/widget/TextView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->channelMembersTextView:Landroid/widget/TextView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->optionsContainer:Landroid/widget/LinearLayout;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;
    .locals 7

    move-object v1, p0

    check-cast v1, Landroid/widget/LinearLayout;

    sget v0, Lio/getstream/chat/android/ui/R$id;->channelMembersInfoTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->channelMembersTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->optionsContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recyclerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v6, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    move-object v2, v1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_fragment_channel_actions:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
