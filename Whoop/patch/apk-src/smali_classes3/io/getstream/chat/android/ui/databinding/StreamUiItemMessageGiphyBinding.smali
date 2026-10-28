.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final cancelButton:Landroid/widget/TextView;

.field public final cardView:Lcom/google/android/material/card/MaterialCardView;

.field public final footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

.field public final gapView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

.field public final giphyIconImageView:Landroid/widget/ImageView;

.field public final giphyLabelTextView:Landroid/widget/TextView;

.field public final giphyPreview:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final giphyQueryTextView:Landroid/widget/TextView;

.field public final horizontalDivider:Landroid/view/View;

.field public final loadingProgressBar:Landroid/widget/ProgressBar;

.field public final marginEnd:Landroidx/constraintlayout/widget/Guideline;

.field public final marginStart:Landroidx/constraintlayout/widget/Guideline;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final sendButton:Landroid/widget/TextView;

.field public final shuffleButton:Landroid/widget/TextView;

.field public final verticalDivider1:Landroid/view/View;

.field public final verticalDivider2:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lcom/google/android/material/card/MaterialCardView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->cancelButton:Landroid/widget/TextView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->cardView:Lcom/google/android/material/card/MaterialCardView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->gapView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyIconImageView:Landroid/widget/ImageView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyLabelTextView:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyPreview:Lcom/google/android/material/imageview/ShapeableImageView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyQueryTextView:Landroid/widget/TextView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->horizontalDivider:Landroid/view/View;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->loadingProgressBar:Landroid/widget/ProgressBar;

    iput-object p12, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->marginEnd:Landroidx/constraintlayout/widget/Guideline;

    iput-object p13, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->marginStart:Landroidx/constraintlayout/widget/Guideline;

    iput-object p14, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->sendButton:Landroid/widget/TextView;

    iput-object p15, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->shuffleButton:Landroid/widget/TextView;

    move-object/from16 p1, p16

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->verticalDivider1:Landroid/view/View;

    move-object/from16 p1, p17

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->verticalDivider2:Landroid/view/View;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;
    .locals 21

    move-object/from16 v0, p0

    sget v1, Lio/getstream/chat/android/ui/R$id;->cancelButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->cardView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/google/android/material/card/MaterialCardView;

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

    sget v1, Lio/getstream/chat/android/ui/R$id;->giphyIconImageView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->giphyLabelTextView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->giphyPreview:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/google/android/material/imageview/ShapeableImageView;

    if-eqz v11, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->giphyQueryTextView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->horizontalDivider:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    if-eqz v13, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->loadingProgressBar:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/ProgressBar;

    if-eqz v14, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->marginEnd:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v15, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->marginStart:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v16, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->sendButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/TextView;

    if-eqz v17, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->shuffleButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/TextView;

    if-eqz v18, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->verticalDivider1:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v19

    if-eqz v19, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->verticalDivider2:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v20

    if-eqz v20, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v3 .. v20}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lcom/google/android/material/card/MaterialCardView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_message_giphy:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
