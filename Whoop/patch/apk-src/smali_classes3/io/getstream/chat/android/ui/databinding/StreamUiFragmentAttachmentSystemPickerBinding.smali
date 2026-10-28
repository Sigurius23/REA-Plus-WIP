.class public final Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final buttonCapture:Landroidx/cardview/widget/CardView;

.field public final buttonFiles:Landroidx/cardview/widget/CardView;

.field public final buttonMedia:Landroidx/cardview/widget/CardView;

.field public final buttonPolls:Landroidx/cardview/widget/CardView;

.field public final flow:Landroid/widget/LinearLayout;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final scrollView:Landroid/widget/HorizontalScrollView;

.field public final textCapture:Landroid/widget/TextView;

.field public final textFiles:Landroid/widget/TextView;

.field public final textMedia:Landroid/widget/TextView;

.field public final textPoll:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroid/widget/LinearLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonCapture:Landroidx/cardview/widget/CardView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonFiles:Landroidx/cardview/widget/CardView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonMedia:Landroidx/cardview/widget/CardView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->buttonPolls:Landroidx/cardview/widget/CardView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->flow:Landroid/widget/LinearLayout;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->scrollView:Landroid/widget/HorizontalScrollView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textCapture:Landroid/widget/TextView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textFiles:Landroid/widget/TextView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textMedia:Landroid/widget/TextView;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->textPoll:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;
    .locals 14

    sget v0, Lio/getstream/chat/android/ui/R$id;->button_capture:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/cardview/widget/CardView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->button_files:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/cardview/widget/CardView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->button_media:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/cardview/widget/CardView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->button_polls:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/cardview/widget/CardView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->flow:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/LinearLayout;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->scrollView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/HorizontalScrollView;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->text_capture:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->text_files:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->text_media:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->text_poll:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/widget/TextView;

    if-eqz v13, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v13}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroid/widget/LinearLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_fragment_attachment_system_picker:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentSystemPickerBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
