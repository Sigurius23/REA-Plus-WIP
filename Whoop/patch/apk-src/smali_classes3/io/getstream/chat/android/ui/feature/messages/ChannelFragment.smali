.class public Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;,
        Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;,
        Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0016\u0018\u0000 [2\u00020\u0001:\u0003\\][B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0014\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008%\u0010\u0003R\u001b\u0010+\u001a\u00020&8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001b\u0010.\u001a\u00020\u00158DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010(\u001a\u0004\u0008-\u0010\u0017R\u001d\u00101\u001a\u0004\u0018\u00010&8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u0010(\u001a\u0004\u00080\u0010*R\u001b\u00106\u001a\u0002028DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u0010(\u001a\u0004\u00084\u00105R\u001b\u00109\u001a\u0002028DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010(\u001a\u0004\u00088\u00105R\u001b\u0010>\u001a\u00020:8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010(\u001a\u0004\u0008<\u0010=R\u001b\u0010C\u001a\u00020?8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010(\u001a\u0004\u0008A\u0010BR\u001b\u0010H\u001a\u00020D8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008E\u0010(\u001a\u0004\u0008F\u0010GR\u001b\u0010M\u001a\u00020I8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008J\u0010(\u001a\u0004\u0008K\u0010LR$\u0010O\u001a\u0004\u0018\u00010N8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0014\u0010Z\u001a\u00020U8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010Y\u00a8\u0006^"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "onAttach",
        "(Landroid/content/Context;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "getTheme",
        "()I",
        "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;",
        "channelHeaderView",
        "setupChannelHeader",
        "(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;",
        "messageListView",
        "setupMessageList",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;",
        "messageComposerView",
        "setupMessageComposer",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V",
        "onDestroyView",
        "onDetach",
        "",
        "cid$delegate",
        "Ll83/h;",
        "getCid",
        "()Ljava/lang/String;",
        "cid",
        "themeResId$delegate",
        "getThemeResId",
        "themeResId",
        "messageId$delegate",
        "getMessageId",
        "messageId",
        "",
        "showHeader$delegate",
        "getShowHeader",
        "()Z",
        "showHeader",
        "threadLoadOlderToNewer$delegate",
        "getThreadLoadOlderToNewer",
        "threadLoadOlderToNewer",
        "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;",
        "factory$delegate",
        "getFactory",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;",
        "factory",
        "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;",
        "channelHeaderViewModel$delegate",
        "getChannelHeaderViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;",
        "channelHeaderViewModel",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;",
        "messageListViewModel$delegate",
        "getMessageListViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;",
        "messageListViewModel",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
        "messageComposerViewModel$delegate",
        "getMessageComposerViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
        "messageComposerViewModel",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;",
        "backPressListener",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;",
        "getBackPressListener",
        "()Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;",
        "setBackPressListener",
        "(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;",
        "binding",
        "Companion",
        "BackPressListener",
        "Builder",
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
.field private static final ARG_CHANNEL_ID:Ljava/lang/String; = "cid"

.field private static final ARG_MESSAGE_ID:Ljava/lang/String; = "message_id"

.field private static final ARG_SHOW_HEADER:Ljava/lang/String; = "show_header"

.field private static final ARG_THEME_RES_ID:Ljava/lang/String; = "theme_res_id"

.field private static final ARG_THREAD_LOAD_OLDER_TO_NEWER:Ljava/lang/String; = "thread_load_older_to_newer"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

.field private backPressListener:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

.field private final channelHeaderViewModel$delegate:Ll83/h;

.field private final cid$delegate:Ll83/h;

.field private final factory$delegate:Ll83/h;

.field private final messageComposerViewModel$delegate:Ll83/h;

.field private final messageId$delegate:Ll83/h;

.field private final messageListViewModel$delegate:Ll83/h;

.field private final showHeader$delegate:Ll83/h;

.field private final themeResId$delegate:Ll83/h;

.field private final threadLoadOlderToNewer$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->cid$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->themeResId$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->messageId$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->showHeader$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->threadLoadOlderToNewer$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->factory$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v5, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$4;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v2, Landroidx/lifecycle/y1;

    invoke-direct {v2, v4, v5, v1, v6}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->channelHeaderViewModel$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$6;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/m0;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$7;

    invoke-direct {v4, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$7;-><init>(Lc93/a;)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const-class v4, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$8;

    invoke-direct {v5, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$8;-><init>(Ll83/h;)V

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$9;

    invoke-direct {v6, v7, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$9;-><init>(Lc93/a;Ll83/h;)V

    new-instance v2, Landroidx/lifecycle/y1;

    invoke-direct {v2, v4, v5, v1, v6}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->messageListViewModel$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/d;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$11;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$11;-><init>(Landroidx/fragment/app/m0;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$12;

    invoke-direct {v4, v2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$12;-><init>(Lc93/a;)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$13;

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$13;-><init>(Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$14;

    invoke-direct {v4, v7, v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$special$$inlined$viewModels$default$14;-><init>(Lc93/a;Ll83/h;)V

    new-instance v0, Landroidx/lifecycle/y1;

    invoke-direct {v0, v2, v3, v1, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->messageComposerViewModel$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageComposer$lambda$20(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    return-void
.end method

.method public static synthetic B(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->factory_delegate$lambda$6(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->cid_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageList$lambda$13(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Ll83/a0;

    return-void
.end method

.method public static synthetic E(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageComposer$lambda$17(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public static synthetic F(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageComposer$lambda$15(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Ll83/a0;

    return-void
.end method

.method public static synthetic G(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageComposer$lambda$16(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method private static final channelHeaderViewModel_delegate$lambda$7(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Landroidx/lifecycle/a2;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method private static final cid_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "cid"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Channel cid must not be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final factory_delegate$lambda$6(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
    .locals 24

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getThreadLoadOlderToNewer()Z

    move-result v20

    const v22, 0x17fff8

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v0 .. v23}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final messageComposerViewModel_delegate$lambda$9(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Landroidx/lifecycle/a2;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method private static final messageId_delegate$lambda$3(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "message_id"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final messageListViewModel_delegate$lambda$8(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Landroidx/lifecycle/a2;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method public static final newInstance(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 1

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;->newInstance(Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p0

    return-object p0
.end method

.method public static final newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;"
        }
    .end annotation

    .line 2
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;->newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final setupChannelHeader$lambda$12$lambda$11(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)V
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$BackButtonPressed;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    return-void
.end method

.method private static final setupMessageComposer$lambda$15(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Ll83/a0;
    .locals 3

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getChannelHeaderViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    move-result-object v0

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->setActiveThread(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/api/state/ThreadState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getChannelHeaderViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;->resetThread()V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->leaveThread()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final setupMessageComposer$lambda$16(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "message"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/Reply;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void
.end method

.method private static final setupMessageComposer$lambda$17(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/state/messages/Edit;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void
.end method

.method private static final setupMessageComposer$lambda$18(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/DeleteMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/DeleteMessage;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;-><init>(Lio/getstream/chat/android/models/Message;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    return-void

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/state/messages/Edit;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void

    :cond_1
    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/SendAnyway;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/SendAnyway;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    :cond_2
    return-void
.end method

.method private static final setupMessageComposer$lambda$20(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getMessageId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/state/messages/Reply;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    :cond_0
    return-void
.end method

.method private static final setupMessageList$lambda$13(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Ll83/a0;
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Loading;

    if-nez v0, :cond_2

    instance-of v0, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;

    if-nez v0, :cond_2

    instance-of p1, p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$NavigateUp;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->backPressListener:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;->onBackPress()V

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setupMessageList$lambda$14(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/DeleteMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/DeleteMessage;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$DeleteMessage;-><init>(Lio/getstream/chat/android/models/Message;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    return-void

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/EditMessage;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/state/messages/Edit;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->performMessageAction(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void

    :cond_1
    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/SendAnyway;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/SendAnyway;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event$RetryMessage;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->onEvent(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$Event;)V

    :cond_2
    return-void
.end method

.method private static final showHeader_delegate$lambda$4(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "show_header"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private static final themeResId_delegate$lambda$2(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "theme_res_id"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final threadLoadOlderToNewer_delegate$lambda$5(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "thread_load_older_to_newer"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageList$lambda$14(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageComposer$lambda$18(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;)V

    return-void
.end method


# virtual methods
.method public final getBackPressListener()Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->backPressListener:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    return-object v0
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getChannelHeaderViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->channelHeaderViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->cid$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getFactory()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->factory$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    return-object v0
.end method

.method public final getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->messageComposerViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    return-object v0
.end method

.method public final getMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->messageId$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->messageListViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    return-object v0
.end method

.method public final getShowHeader()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->showHeader$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getTheme()I
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getThemeResId()I

    move-result v0

    return v0
.end method

.method public final getThemeResId()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->themeResId$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final getThreadLoadOlderToNewer()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->threadLoadOlderToNewer$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final onAttach(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    :cond_0
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    move-object p1, v1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    :cond_2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->backPressListener:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getThemeResId()I

    move-result p3

    if-eqz p3, :cond_0

    new-instance p3, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getThemeResId()I

    move-result v1

    invoke-direct {p3, v0, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    :cond_0
    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    return-void
.end method

.method public final onDetach()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->backPressListener:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->channelHeaderView:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;

    const-string p2, "channelHeaderView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupChannelHeader(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageListView:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    const-string p2, "messageListView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageList(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageComposerView:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    const-string p2, "messageComposerView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->setupMessageComposer(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V

    return-void
.end method

.method public final setBackPressListener(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->backPressListener:Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;

    return-void
.end method

.method public final setupChannelHeader(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;)V
    .locals 3

    const-string v0, "channelHeaderView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getShowHeader()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getChannelHeaderViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;Landroidx/lifecycle/g0;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->setBackButtonClickListener(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;)V

    return-void

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setupMessageComposer(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 29

    move-object/from16 v0, p0

    const-string v1, "messageComposerView"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageComposerViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageComposerView:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v4

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v27, 0xfffffc

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v2 .. v28}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinding;->bind$default(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroidx/lifecycle/g0;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getMode()Landroidx/lifecycle/p0;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/b;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v4, v3}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2, v4}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageListView:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/a;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/feature/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->setMessageReplyHandler(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageReplyHandler;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageListView:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/a;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/feature/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->setMessageEditHandler(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageEditHandler;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageListView:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/a;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/feature/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->setModeratedMessageHandler(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageListView:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/c;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/messages/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->setAttachmentReplyOptionClickHandler(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;)V

    return-void
.end method

.method public final setupMessageList(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 3

    const-string v0, "messageListView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Landroidx/lifecycle/g0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->getMessageListViewModel()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getState()Landroidx/lifecycle/p0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;->messageListView:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->setModeratedMessageHandler(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ModeratedMessageOptionHandler;)V

    return-void
.end method
