.class public final Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0002;<B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bB+\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J\r\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\u0008(\u0010)J\u001b\u0010,\u001a\u00020\u000e2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000e0*\u00a2\u0006\u0004\u0008,\u0010-J\u001b\u0010.\u001a\u00020\u000e2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000e0*\u00a2\u0006\u0004\u0008.\u0010-J\r\u0010/\u001a\u00020\u000e\u00a2\u0006\u0004\u0008/\u0010)J\r\u00100\u001a\u00020\u000e\u00a2\u0006\u0004\u00080\u0010)J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010+\u001a\u000201\u00a2\u0006\u0004\u00082\u00103J\u0015\u00105\u001a\u00020\u000e2\u0006\u0010+\u001a\u000204\u00a2\u0006\u0004\u00085\u00106J\u001d\u00107\u001a\u00020\u000e2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000e0*H\u0007\u00a2\u0006\u0004\u00087\u0010-R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "Ll83/a0;",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "Landroid/content/res/TypedArray;",
        "typedArray",
        "configUserAvatar",
        "(Landroid/content/res/TypedArray;)V",
        "configOnlineTitle",
        "configOfflineTitleContainer",
        "Landroid/content/res/ColorStateList;",
        "getProgressBarTint",
        "(Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;",
        "configActionButton",
        "configureSeparator",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "getOnlineTitleTextStyle",
        "(Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;",
        "getOfflineTitleTextStyle",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "setUser",
        "(Lio/getstream/chat/android/models/User;)V",
        "",
        "title",
        "setOnlineTitle",
        "(Ljava/lang/String;)V",
        "showOnlineTitle",
        "()V",
        "Lkotlin/Function0;",
        "listener",
        "setOnTitleClickListener",
        "(Lc93/a;)V",
        "setOnTitleLongClickListener",
        "showOfflineTitle",
        "showConnectingTitle",
        "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;",
        "setOnUserAvatarClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;",
        "setOnActionButtonClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;)V",
        "setOnUserAvatarLongClickListener",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;",
        "UserAvatarClickListener",
        "ActionButtonClickListener",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic w:I


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    .line 6
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p1, p0, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    .line 10
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 13
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p1, p0, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    .line 14
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final configActionButton(Landroid/content/res/TypedArray;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->actionButton:Landroid/widget/ImageView;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiShowActionButton:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-nez v1, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiActionButtonIcon:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_pen:I

    invoke-static {v1, v2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiActionBackgroundTint:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_icon_button_background_selector:I

    invoke-static {p1, v1}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_2
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private final configOfflineTitleContainer(Landroid/content/res/TypedArray;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTextView:Landroid/widget/TextView;

    const-string v1, "offlineTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->getOfflineTitleTextStyle(Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineProgressBar:Landroid/widget/ProgressBar;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiShowOfflineProgressBar:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->getProgressBarTint(Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private final configOnlineTitle(Landroid/content/res/TypedArray;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    const-string v1, "onlineTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->getOnlineTitleTextStyle(Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method private final configUserAvatar(Landroid/content/res/TypedArray;)V
    .locals 2

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiShowUserAvatar:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private final configureSeparator(Landroid/content/res/TypedArray;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->separator:Landroid/view/View;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiChannelListSeparatorBackgroundDrawable:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final getOfflineTitleTextStyle(Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOfflineTitleTextSize:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOfflineTitleTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOfflineTitleFontAssets:I

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOfflineTitleTextFont:I

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOfflineTitleTextStyle:I

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    return-object p1
.end method

.method private final getOnlineTitleTextStyle(Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOnlineTitleTextSize:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_large:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOnlineTitleTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOnlineTitleFontAssets:I

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOnlineTitleTextFont:I

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOnlineTitleTextStyle:I

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    return-object p1
.end method

.method private final getProgressBarTint(Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView_streamUiOfflineProgressBarTint:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {p1, v0}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/ui/R$styleable;->ChannelListHeaderView:[I

    sget v2, Lio/getstream/chat/android/ui/R$attr;->streamUiChannelListHeaderStyle:I

    sget v3, Lio/getstream/chat/android/ui/R$style;->StreamUi_ChannelListHeader:I

    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->configUserAvatar(Landroid/content/res/TypedArray;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->configOnlineTitle(Landroid/content/res/TypedArray;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->configOfflineTitleContainer(Landroid/content/res/TypedArray;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->configActionButton(Landroid/content/res/TypedArray;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->configureSeparator(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private static final setOnActionButtonClickListener$lambda$10(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;->onClick()V

    return-void
.end method

.method private static final setOnTitleClickListener$lambda$5(Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final setOnTitleClickListener$lambda$6(Lc93/a;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final setOnTitleLongClickListener$lambda$7(Lc93/a;Landroid/view/View;)Z
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method private static final setOnTitleLongClickListener$lambda$8(Lc93/a;Landroid/view/View;)Z
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method private static final setOnUserAvatarClickListener$lambda$9(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;->onUserAvatarClick()V

    return-void
.end method

.method private static final setOnUserAvatarLongClickListener$lambda$11(Lc93/a;Landroid/view/View;)Z
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final setOnActionButtonClickListener(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->actionButton:Landroid/widget/ImageView;

    new-instance v1, Ljo/j;

    const/16 v2, 0xa

    invoke-direct {v1, p1, v2}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setOnTitleClickListener(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTextView:Landroid/widget/TextView;

    new-instance v1, Lb30/q1;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lb30/q1;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    new-instance v1, Lb30/q1;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lb30/q1;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setOnTitleLongClickListener(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTextView:Landroid/widget/TextView;

    new-instance v1, Lq13/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lq13/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    new-instance v1, Lq13/a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lq13/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public final setOnUserAvatarClickListener(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance v1, Ljo/j;

    const/16 v2, 0xb

    invoke-direct {v1, p1, v2}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setOnUserAvatarLongClickListener(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance v1, Lq13/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lq13/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public final setOnlineTitle(Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setUser(Lio/getstream/chat/android/models/User;)V
    .locals 4

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    return-void
.end method

.method public final showConnectingTitle()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTitleContainer:Landroid/widget/LinearLayout;

    const-string v1, "offlineTitleContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineProgressBar:Landroid/widget/ProgressBar;

    const-string v2, "offlineProgressBar"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    const-string v1, "onlineTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_header_disconnected:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final showOfflineTitle()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTitleContainer:Landroid/widget/LinearLayout;

    const-string v1, "offlineTitleContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineProgressBar:Landroid/widget/ProgressBar;

    const-string v1, "offlineProgressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    const-string v2, "onlineTextView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_header_offline:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final showOnlineTitle()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->offlineTitleContainer:Landroid/widget/LinearLayout;

    const-string v1, "offlineTitleContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelListHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    const-string v1, "onlineTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
