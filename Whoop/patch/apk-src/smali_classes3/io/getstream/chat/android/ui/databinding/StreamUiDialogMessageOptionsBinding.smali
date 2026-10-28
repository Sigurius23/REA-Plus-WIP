.class public final Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final containerView:Landroid/widget/LinearLayout;

.field public final editReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

.field public final messageContainer:Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;

.field public final messageOptionsView:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;

.field private final rootView:Landroid/widget/ScrollView;

.field public final userReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;


# direct methods
.method private constructor <init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->rootView:Landroid/widget/ScrollView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->containerView:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->editReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->messageContainer:Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->messageOptionsView:Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->userReactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;
    .locals 9

    sget v0, Lio/getstream/chat/android/ui/R$id;->containerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->editReactionsView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageOptionsView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userReactionsView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;

    if-eqz v8, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/ScrollView;

    invoke-direct/range {v2 .. v8}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;-><init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;Lio/getstream/chat/android/ui/widgets/internal/TouchInterceptingFrameLayout;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionsView;)V

    return-object v2

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_dialog_message_options:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->rootView:Landroid/widget/ScrollView;

    return-object v0
.end method

.method public final getRoot()Landroid/widget/ScrollView;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiDialogMessageOptionsBinding;->rootView:Landroid/widget/ScrollView;

    return-object v0
.end method
