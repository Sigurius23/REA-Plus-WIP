.class public final Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final rootView:Landroidx/cardview/widget/CardView;

.field public final userReactionsContainer:Landroidx/cardview/widget/CardView;

.field public final userReactionsTitleTextView:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/cardview/widget/CardView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->rootView:Landroidx/cardview/widget/CardView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->userReactionsContainer:Landroidx/cardview/widget/CardView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->userReactionsTitleTextView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;
    .locals 4

    sget v0, Lio/getstream/chat/android/ui/R$id;->recyclerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Landroidx/cardview/widget/CardView;

    sget v2, Lio/getstream/chat/android/ui/R$id;->userReactionsTitleTextView:I

    invoke-static {p0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    new-instance p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    invoke-direct {p0, v0, v1, v0, v3}, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;-><init>(Landroidx/cardview/widget/CardView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;)V

    return-object p0

    :cond_0
    move v0, v2

    :cond_1
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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_user_reactions_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->rootView:Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method public final getRoot()Landroidx/cardview/widget/CardView;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiUserReactionsViewBinding;->rootView:Landroidx/cardview/widget/CardView;

    return-object v0
.end method
