.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final attachmentsContainer:Landroid/widget/LinearLayout;

.field public final deliveryFailedIcon:Landroid/widget/ImageView;

.field public final footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

.field public final gapView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

.field public final marginEnd:Landroidx/constraintlayout/widget/Guideline;

.field public final marginStart:Landroidx/constraintlayout/widget/Guideline;

.field public final messageContainer:Landroid/widget/LinearLayout;

.field public final messageText:Landroid/widget/TextView;

.field public final pinIndicatorTextView:Landroid/widget/TextView;

.field public final reactionsSpace:Landroid/widget/Space;

.field public final reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

.field public final replyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final threadGuideline:Landroid/widget/Space;

.field public final userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Space;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;Landroid/widget/Space;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->attachmentsContainer:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->deliveryFailedIcon:Landroid/widget/ImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->gapView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->marginEnd:Landroidx/constraintlayout/widget/Guideline;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->marginStart:Landroidx/constraintlayout/widget/Guideline;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageText:Landroid/widget/TextView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->reactionsSpace:Landroid/widget/Space;

    iput-object p12, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    iput-object p13, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->replyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    iput-object p14, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->threadGuideline:Landroid/widget/Space;

    iput-object p15, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;
    .locals 20

    move-object/from16 v0, p0

    sget v1, Lio/getstream/chat/android/ui/R$id;->attachmentsContainer:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->deliveryFailedIcon:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->footnote:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    if-eqz v7, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->gapView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

    if-eqz v8, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->marginEnd:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v9, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->marginStart:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v10, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->messageContainer:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/LinearLayout;

    if-eqz v11, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->messageText:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->pinIndicatorTextView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/TextView;

    if-eqz v13, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->reactionsSpace:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/Space;

    if-eqz v14, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->reactionsView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    if-eqz v15, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->replyView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    if-eqz v16, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->threadGuideline:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/Space;

    if-eqz v17, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->userAvatarMineView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v18, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->userAvatarView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v19, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v3 .. v19}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Space;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;Landroid/widget/Space;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_custom_attachments:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
