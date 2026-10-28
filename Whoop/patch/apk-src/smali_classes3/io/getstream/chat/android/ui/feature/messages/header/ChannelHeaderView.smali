.class public final Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;,
        Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;,
        Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;,
        Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 T2\u00020\u0001:\u0004UVWTB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001b\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001c\u0010\u0014J\r\u0010\u001d\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\r\u0010\u001e\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0017\u00a2\u0006\u0004\u0008 \u0010\u001aJ\r\u0010!\u001a\u00020\u000e\u00a2\u0006\u0004\u0008!\u0010\u0016J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\"\u0010\u0014J\r\u0010#\u001a\u00020\u000e\u00a2\u0006\u0004\u0008#\u0010\u0016J\r\u0010$\u001a\u00020\u000e\u00a2\u0006\u0004\u0008$\u0010\u0016J\r\u0010%\u001a\u00020\u000e\u00a2\u0006\u0004\u0008%\u0010\u0016J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008&\u0010\u0014J\u001b\u0010*\u001a\u00020\u000e2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\u0004\u0008*\u0010+J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0017\u00a2\u0006\u0004\u0008-\u0010\u001aJ\r\u0010.\u001a\u00020\u0017\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0017\u00a2\u0006\u0004\u00080\u0010\u001aJ\r\u00101\u001a\u00020\u000e\u00a2\u0006\u0004\u00081\u0010\u0016J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u00082\u0010\u0014J\u0019\u00103\u001a\u00020\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00085\u0010\u0016J\u000f\u00106\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00086\u0010\u0016J\u000f\u00107\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00087\u0010\u0016J\u000f\u00108\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00088\u0010\u0016J\u000f\u00109\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00089\u0010\u0016J\u000f\u0010:\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008:\u0010\u0016J\u000f\u0010;\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008;\u0010\u0016Jo\u0010F\u001a\u00020\u000e2\u0008\u0008\u0002\u0010=\u001a\u00020<2\u0008\u0008\u0002\u0010>\u001a\u00020<2\u0008\u0008\u0002\u0010?\u001a\u00020\u00172\u0008\u0008\u0002\u0010@\u001a\u00020\u00172\u0008\u0008\u0002\u0010A\u001a\u00020<2\u0008\u0008\u0002\u0010B\u001a\u00020\u00172\u0008\u0008\u0002\u0010C\u001a\u00020\u00172\u000e\u0008\u0002\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'2\u0008\u0008\u0002\u0010E\u001a\u00020DH\u0002\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010H\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008H\u0010\u0016J\u000f\u0010I\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008I\u0010\u0016J\u000f\u0010J\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008J\u0010\u0016R\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008R\u0010S\u00a8\u0006X"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;",
        "Landroid/widget/FrameLayout;",
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
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Ll83/a0;",
        "setAvatar",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;",
        "listener",
        "setAvatarClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V",
        "hideAvatar",
        "()V",
        "",
        "text",
        "showBackButtonBadge",
        "(Ljava/lang/String;)V",
        "hideBackButtonBadge",
        "setBackButtonClickListener",
        "setNormalMode",
        "setThreadMode",
        "title",
        "setTitle",
        "hideTitle",
        "setTitleClickListener",
        "showOnlineStateSubtitle",
        "showSearchingForNetworkLabel",
        "showOfflineStateLabel",
        "setRetryClickListener",
        "",
        "Lio/getstream/chat/android/models/User;",
        "typingUsers",
        "showTypingStateLabel",
        "(Ljava/util/List;)V",
        "subtitle",
        "setOnlineStateSubtitle",
        "getOnlineStateSubtitle",
        "()Ljava/lang/String;",
        "setThreadSubtitle",
        "hideSubtitle",
        "setSubtitleClickListener",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "configBackground",
        "configChannelAvatar",
        "configTitle",
        "configBackButton",
        "configOfflineLabel",
        "configSearchingForNetworkLabel",
        "configOnlineLabel",
        "",
        "isThread",
        "isTitleEnabled",
        "normalModeTitle",
        "threadModeTitle",
        "isSubtitleEnabled",
        "normalModeSubtitle",
        "threadModeSubtitle",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
        "onlineState",
        "reduceHeaderState",
        "(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V",
        "renderHeaderState",
        "renderTitleState",
        "renderSubtitleState",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;",
        "headerState",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;",
        "Companion",
        "HeaderState",
        "OnlineState",
        "OnClickListener",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;

.field public static final synthetic w:I


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

.field private headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

.field private style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->Companion:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p1, p0, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    .line 6
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->Companion:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    const-string v0, "getContext(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;->access$createInitialHeaderState(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$Companion;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    .line 7
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final configBackButton()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->backButtonContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getShowBackButton()Z

    move-result v1

    const/4 v4, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getShowBackButton()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->backButton:Landroid/widget/ImageView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getBackButtonIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->backButtonBadge:Landroid/widget/TextView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getShowBackButtonBadge()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v4, 0x8

    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v4, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_badge_bg:I

    invoke-static {v1, v4}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getBackButtonBadgeBackgroundColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    return-void

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final configBackground()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    const/4 v1, 0x0

    const-string v2, "style"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getBackground()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->separator:Landroid/view/View;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getSeparatorBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->separator:Landroid/view/View;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getSeparatorBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final configChannelAvatar()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getShowUserAvatar()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getShowUserAvatar()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final configOfflineLabel()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getOfflineTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->offlineTextView:Landroid/widget/TextView;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->getSize()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setTextSizePx(Landroid/widget/TextView;F)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->getColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->getFont()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->offlineRetryButton:Landroid/widget/TextView;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->getSize()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setTextSizePx(Landroid/widget/TextView;F)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle;->getFont()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-void

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final configOnlineLabel()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    const-string v1, "onlineTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getOnlineTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final configSearchingForNetworkLabel()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->connectingTextView:Landroid/widget/TextView;

    const-string v1, "connectingTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getSearchingForNetworkTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->connectingProgressBar:Landroid/widget/ProgressBar;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getShowSearchingForNetworkProgressBar()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getSearchingForNetworkProgressBarTint()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final configTitle()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->titleTextView:Landroid/widget/TextView;

    const-string v1, "titleTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->getTitleTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CustomViewStyleable"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->style:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configBackground()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configChannelAvatar()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configTitle()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configBackButton()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configOfflineLabel()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configSearchingForNetworkLabel()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->configOnlineLabel()V

    return-void
.end method

.method private final reduceHeaderState(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->copy(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->renderHeaderState()V

    return-void
.end method

.method public static synthetic reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread()Z

    move-result p1

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled()Z

    move-result p2

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getNormalModeTitle()Ljava/lang/String;

    move-result-object p3

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p4}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getThreadModeTitle()Ljava/lang/String;

    move-result-object p4

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p5}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled()Z

    move-result p5

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p6}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getNormalModeSubtitle()Ljava/lang/String;

    move-result-object p6

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p7}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getThreadModeSubtitle()Ljava/lang/String;

    move-result-object p7

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p8}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getTypingUsers()Ljava/util/List;

    move-result-object p8

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {p9}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getOnlineState()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    move-result-object p9

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-direct/range {p2 .. p11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;)V

    return-void
.end method

.method private final renderHeaderState()V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->renderTitleState()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->renderSubtitleState()V

    return-void
.end method

.method private final renderSubtitleState()V
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getOnlineState()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->CONNECTING:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const-string v3, "connectingContainer"

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->connectingContainer:Landroid/widget/LinearLayout;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isSubtitleEnabled()Z

    move-result v1

    const-string v2, "subtitleContainer"

    const/16 v4, 0x8

    if-nez v1, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->subtitleContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->subtitleContainer:Landroid/widget/FrameLayout;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v2, :cond_2

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getTypingUsers()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->typingIndicatorView:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

    const-string v2, "typingIndicatorView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->typingIndicatorView:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getTypingUsers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;->setTypingUsers(Ljava/util/List;)V

    return-void

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getOnlineState()Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_7

    const/4 v2, 0x2

    if-eq v1, v2, :cond_6

    const/4 v2, 0x3

    if-eq v1, v2, :cond_5

    const/4 v0, 0x4

    if-ne v1, v0, :cond_4

    return-void

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->offlineContainer:Landroid/widget/LinearLayout;

    const-string v1, "offlineContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_6
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->connectingContainer:Landroid/widget/LinearLayout;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getThreadModeSubtitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getNormalModeSubtitle()Ljava/lang/String;

    move-result-object v1

    :goto_1
    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    const-string v3, "onlineTextView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_9

    goto :goto_2

    :cond_9
    move v2, v5

    :goto_2
    if-eqz v2, :cond_a

    move v4, v5

    :cond_a
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final renderTitleState()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isTitleEnabled()Z

    move-result v1

    const/16 v2, 0x8

    const-string v3, "titleTextView"

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->isThread()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getThreadModeTitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->headerState:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$HeaderState;->getNormalModeTitle()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v4, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v3, 0x0

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    if-eqz v1, :cond_2

    move v2, v3

    :cond_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final setAvatarClickListener$lambda$0(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void
.end method

.method private static final setBackButtonClickListener$lambda$2(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void
.end method

.method private static final setRetryClickListener$lambda$5$lambda$4(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void
.end method

.method private static final setSubtitleClickListener$lambda$6(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void
.end method

.method private static final setTitleClickListener$lambda$3(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void
.end method


# virtual methods
.method public final getOnlineStateSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->onlineTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hideAvatar()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    const-string v1, "channelAvatarView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final hideBackButtonBadge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->backButtonBadge:Landroid/widget/TextView;

    const-string v1, "backButtonBadge"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final hideSubtitle()V
    .locals 12

    const/16 v10, 0x1ef

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final hideTitle()V
    .locals 12

    const/16 v10, 0x1fd

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final setAvatar(Lio/getstream/chat/android/models/Channel;)V
    .locals 3

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;->setChannel$default(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)V

    return-void
.end method

.method public final setAvatarClickListener(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->channelAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/a;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/header/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setBackButtonClickListener(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->backButtonContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/header/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setNormalMode()V
    .locals 12

    const/16 v10, 0x1fe

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final setOnlineStateSubtitle(Ljava/lang/String;)V
    .locals 13

    const-string v0, "subtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1df

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v7, p1

    invoke-static/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final setRetryClickListener(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->offlineRetryButton:Landroid/widget/TextView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/a;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/header/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setSubtitleClickListener(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->subtitleContainer:Landroid/widget/FrameLayout;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/header/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setThreadMode()V
    .locals 12

    const/16 v10, 0x1fe

    const/4 v11, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final setThreadSubtitle(Ljava/lang/String;)V
    .locals 13

    const-string v0, "subtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v8, p1

    invoke-static/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 13

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_header_thread_subtitle:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "getString(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1b9

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final setTitleClickListener(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->titleTextView:Landroid/widget/TextView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/header/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/header/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final showBackButtonBadge(Ljava/lang/String;)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiChannelHeaderViewBinding;->backButtonBadge:Landroid/widget/TextView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final showOfflineStateLabel()V
    .locals 12

    sget-object v9, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->OFFLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final showOnlineStateSubtitle()V
    .locals 12

    sget-object v9, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->ONLINE:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final showSearchingForNetworkLabel()V
    .locals 12

    sget-object v9, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;->CONNECTING:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method

.method public final showTypingStateLabel(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "typingUsers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x17f

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v9, p1

    invoke-static/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->reduceHeaderState$default(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnlineState;ILjava/lang/Object;)V

    return-void
.end method
