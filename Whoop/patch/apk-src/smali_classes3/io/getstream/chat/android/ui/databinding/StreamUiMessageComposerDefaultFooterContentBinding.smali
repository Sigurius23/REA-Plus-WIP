.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final alsoSendToChannelCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/appcompat/widget/AppCompatCheckBox;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;->alsoSendToChannelCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;
    .locals 2

    sget v0, Lio/getstream/chat/android/ui/R$id;->alsoSendToChannelCheckBox:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatCheckBox;

    if-eqz v1, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;-><init>(Landroid/view/View;Landroidx/appcompat/widget/AppCompatCheckBox;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_footer_content:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
