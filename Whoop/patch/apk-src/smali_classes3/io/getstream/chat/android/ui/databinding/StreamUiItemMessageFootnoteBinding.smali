.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final deliveryStatusIcon:Landroid/widget/ImageView;

.field public final editedInfo:Landroid/widget/TextView;

.field public final editedLabel:Landroid/widget/TextView;

.field public final messageFooterContainer:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final messageFooterContainerInner:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final messageFooterLabel:Landroid/widget/TextView;

.field public final readCount:Landroid/widget/TextView;

.field private final rootView:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final timeView:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->rootView:Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->deliveryStatusIcon:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedInfo:Landroid/widget/TextView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterContainer:Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterContainerInner:Landroidx/appcompat/widget/LinearLayoutCompat;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterLabel:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->readCount:Landroid/widget/TextView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->timeView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;
    .locals 12

    sget v0, Lio/getstream/chat/android/ui/R$id;->deliveryStatusIcon:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->editedInfo:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->editedLabel:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    move-object v3, p0

    check-cast v3, Landroidx/appcompat/widget/LinearLayoutCompat;

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageFooterContainerInner:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/appcompat/widget/LinearLayoutCompat;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageFooterLabel:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->readCount:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->timeView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    move-object v7, v3

    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;-><init>(Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_message_footnote:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->rootView:Landroidx/appcompat/widget/LinearLayoutCompat;

    return-object v0
.end method

.method public final getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->rootView:Landroidx/appcompat/widget/LinearLayoutCompat;

    return-object v0
.end method
