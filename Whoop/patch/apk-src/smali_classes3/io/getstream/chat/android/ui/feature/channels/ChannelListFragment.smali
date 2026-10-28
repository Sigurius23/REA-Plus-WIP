.class public Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Builder;,
        Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;,
        Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;,
        Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0016\u0018\u0000 ~2\u00020\u0001:\n\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001~B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0015\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0014\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0014\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008-\u0010\u0003J\u000f\u0010/\u001a\u00020.H\u0014\u00a2\u0006\u0004\u0008/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0014\u00a2\u0006\u0004\u00082\u00103J\u0015\u00106\u001a\u0008\u0012\u0004\u0012\u00020504H\u0014\u00a2\u0006\u0004\u00086\u00107R\u001b\u0010;\u001a\u00020\u00198DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010\u001bR\u001b\u0010@\u001a\u00020<8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u00109\u001a\u0004\u0008>\u0010?R\u001b\u0010C\u001a\u00020<8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u00109\u001a\u0004\u0008B\u0010?R\u001d\u0010H\u001a\u0004\u0018\u00010D8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008E\u00109\u001a\u0004\u0008F\u0010GR\u001b\u0010M\u001a\u00020I8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008J\u00109\u001a\u0004\u0008K\u0010LR\u001b\u0010R\u001a\u00020N8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008O\u00109\u001a\u0004\u0008P\u0010QR\u001b\u0010W\u001a\u00020S8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008T\u00109\u001a\u0004\u0008U\u0010VR\"\u0010\u0016\u001a\u00020\u00158\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010X\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\u0018R$\u0010]\u001a\u0004\u0018\u00010\\8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`\"\u0004\u0008a\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008d\u0010e\u001a\u0004\u0008f\u0010g\"\u0004\u0008h\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR$\u0010r\u001a\u0004\u0018\u00010q8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008r\u0010s\u001a\u0004\u0008t\u0010u\"\u0004\u0008v\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0014\u0010}\u001a\u00020x8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008{\u0010|\u00a8\u0006\u0084\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;",
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
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;",
        "style",
        "applyStyle",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;)V",
        "",
        "getTheme",
        "()I",
        "Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;",
        "channelListHeaderView",
        "setupChannelListHeader",
        "(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;",
        "channelListView",
        "setupChannelList",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputView;",
        "searchInputView",
        "setupSearchInput",
        "(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;",
        "searchResultListView",
        "setupSearchResultList",
        "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)V",
        "onDestroyView",
        "onDetach",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;",
        "createChannelListViewModelFactory",
        "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "themeResId$delegate",
        "Ll83/h;",
        "getThemeResId",
        "themeResId",
        "",
        "showHeader$delegate",
        "getShowHeader",
        "()Z",
        "showHeader",
        "showSearch$delegate",
        "getShowSearch",
        "showSearch",
        "",
        "headerTitle$delegate",
        "getHeaderTitle",
        "()Ljava/lang/String;",
        "headerTitle",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;",
        "channelListHeaderViewModel$delegate",
        "getChannelListHeaderViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;",
        "channelListHeaderViewModel",
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;",
        "channelListViewModel$delegate",
        "getChannelListViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;",
        "channelListViewModel",
        "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;",
        "searchViewModel$delegate",
        "getSearchViewModel",
        "()Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;",
        "searchViewModel",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;",
        "setStyle",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;",
        "headerUserAvatarClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;",
        "getHeaderUserAvatarClickListener",
        "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;",
        "setHeaderUserAvatarClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;",
        "headerActionButtonClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;",
        "getHeaderActionButtonClickListener",
        "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;",
        "setHeaderActionButtonClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;",
        "channelListItemClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;",
        "getChannelListItemClickListener",
        "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;",
        "setChannelListItemClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;",
        "searchResultClickListener",
        "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;",
        "getSearchResultClickListener",
        "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;",
        "setSearchResultClickListener",
        "(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;",
        "_binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;",
        "binding",
        "Companion",
        "HeaderActionButtonClickListener",
        "HeaderUserAvatarClickListener",
        "ChannelListItemClickListener",
        "SearchResultClickListener",
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
.field private static final ARG_HEADER_TITLE:Ljava/lang/String; = "header_title"

.field private static final ARG_SHOW_HEADER:Ljava/lang/String; = "show_header"

.field private static final ARG_SHOW_SEARCH:Ljava/lang/String; = "show_search"

.field private static final ARG_THEME_RES_ID:Ljava/lang/String; = "theme_res_id"

.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;


# instance fields
.field private _binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

.field private final channelListHeaderViewModel$delegate:Ll83/h;

.field private channelListItemClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

.field private final channelListViewModel$delegate:Ll83/h;

.field private headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

.field private final headerTitle$delegate:Ll83/h;

.field private headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

.field private searchResultClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

.field private final searchViewModel$delegate:Ll83/h;

.field private final showHeader$delegate:Ll83/h;

.field private final showSearch$delegate:Ll83/h;

.field protected style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

.field private final themeResId$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/b;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->themeResId$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/b;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->showHeader$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/b;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->showSearch$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/b;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/b;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerTitle$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$2;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$2;-><init>(Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$3;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$3;-><init>(Ll83/h;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$4;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$4;-><init>(Lc93/a;Ll83/h;)V

    new-instance v7, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$5;

    invoke-direct {v7, p0, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/m0;Ll83/h;)V

    new-instance v0, Landroidx/lifecycle/y1;

    invoke-direct {v0, v3, v4, v7, v5}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListHeaderViewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/b;

    const/4 v3, 0x4

    invoke-direct {v0, p0, v3}, Lio/getstream/chat/android/ui/feature/channels/b;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;I)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$6;

    invoke-direct {v3, p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/m0;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$7;

    invoke-direct {v4, v3}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$7;-><init>(Lc93/a;)V

    invoke-static {v1, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    const-class v4, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$8;

    invoke-direct {v5, v3}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$8;-><init>(Ll83/h;)V

    new-instance v7, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$9;

    invoke-direct {v7, v6, v3}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$9;-><init>(Lc93/a;Ll83/h;)V

    new-instance v3, Landroidx/lifecycle/y1;

    invoke-direct {v3, v4, v5, v0, v7}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListViewModel$delegate:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$11;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$11;-><init>(Landroidx/fragment/app/m0;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$12;

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$12;-><init>(Lc93/a;)V

    invoke-static {v1, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$13;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$13;-><init>(Ll83/h;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$14;

    invoke-direct {v3, v6, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$14;-><init>(Lc93/a;Ll83/h;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$15;

    invoke-direct {v4, p0, v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$special$$inlined$viewModels$default$15;-><init>(Landroidx/fragment/app/m0;Ll83/h;)V

    new-instance v0, Landroidx/lifecycle/y1;

    invoke-direct {v0, v1, v2, v4, v3}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchViewModel$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupSearchResultList$lambda$16$lambda$15(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public static B(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;->onUserAvatarClick()V

    :cond_0
    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupSearchInput$lambda$14$lambda$12(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupSearchInput$lambda$14$lambda$13(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V

    return-void
.end method

.method private static final channelListViewModel_delegate$lambda$4(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Landroidx/lifecycle/a2;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->createChannelListViewModelFactory()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method private static final headerTitle_delegate$lambda$3(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "header_title"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final newInstance()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1
    invoke-static {v0, v1, v2, v1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;->newInstance$default(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object v0

    return-object v0
.end method

.method public static final newInstance(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;"
        }
    .end annotation

    .line 2
    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->Companion:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$Companion;->newInstance(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final setupChannelList$lambda$11$lambda$10(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Channel;)V
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListItemClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    if-nez v0, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "requireContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent$default(Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;->onChannelClick(Lio/getstream/chat/android/models/Channel;)V

    :cond_1
    return-void
.end method

.method private static final setupChannelListHeader$lambda$9$lambda$7(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;->onActionButtonClick()V

    :cond_0
    return-void
.end method

.method private static final setupChannelListHeader$lambda$9$lambda$8(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;->onUserAvatarClick()V

    :cond_0
    return-void
.end method

.method private static final setupSearchInput$lambda$14$lambda$12(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->channelListView:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    const-string v0, "channelListView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchResultListView:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    const-string p1, "searchResultListView"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private static final setupSearchInput$lambda$14$lambda$13(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V
    .locals 4

    const-string v0, "query"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/Utils;->hideSoftKeyboard(Landroid/view/View;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getSearchViewModel()Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    move-result-object p0

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->setQuery(Ljava/lang/String;)V

    iget-object p0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->channelListView:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    const-string v0, "channelListView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/16 v3, 0x8

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchResultListView:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    const-string p1, "searchResultListView"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final setupSearchResultList$lambda$16$lambda$15(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Message;)V
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchResultClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    if-nez v0, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->Companion:Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "requireContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent$default(Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;->onSearchResultClick(Lio/getstream/chat/android/models/Message;)V

    :cond_1
    return-void
.end method

.method private static final showHeader_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "show_header"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private static final showSearch_delegate$lambda$2(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "show_search"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private static final themeResId_delegate$lambda$0(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "theme_res_id"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static y(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;->onActionButtonClick()V

    :cond_0
    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupChannelList$lambda$11$lambda$10(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method


# virtual methods
.method public final applyStyle(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;)V
    .locals 3

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchInputView:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    const-string v1, "searchInputView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->getSearchInputMarginTop()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->getSearchInputMarginBottom()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->getSearchInputMarginStart()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->getSearchInputMarginEnd()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final createChannelListViewModelFactory()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;
    .locals 10

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;

    sget-object v2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;

    const/16 v8, 0x7c

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getChannelListHeaderViewModel()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListHeaderViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;

    return-object v0
.end method

.method public final getChannelListItemClickListener()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListItemClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    return-object v0
.end method

.method public final getChannelListViewModel()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    return-object v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getHeaderActionButtonClickListener()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    return-object v0
.end method

.method public final getHeaderTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerTitle$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderUserAvatarClickListener()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    return-object v0
.end method

.method public final getSearchResultClickListener()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchResultClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    return-object v0
.end method

.method public final getSearchViewModel()Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchViewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    return-object v0
.end method

.method public final getShowHeader()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->showHeader$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getShowSearch()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->showSearch$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->DEFAULT_SORT:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getTheme()I
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getThemeResId()I

    move-result v0

    return v0
.end method

.method public final getThemeResId()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->themeResId$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final onAttach(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;->invoke(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setStyle(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    :cond_0
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    if-nez v0, :cond_1

    move-object p1, v1

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    :cond_2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    if-nez v0, :cond_3

    move-object p1, v1

    :cond_3
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    if-nez p1, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    if-nez v0, :cond_4

    move-object p1, v1

    :cond_4
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    :cond_5
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    if-nez v0, :cond_6

    move-object p1, v1

    :cond_6
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    if-nez p1, :cond_8

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    if-nez v0, :cond_7

    move-object p1, v1

    :cond_7
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    :cond_8
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListItemClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    if-nez v0, :cond_9

    move-object p1, v1

    :cond_9
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    if-nez p1, :cond_b

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    move-object v1, p1

    :goto_0
    move-object p1, v1

    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    :cond_b
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchResultClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getThemeResId()I

    move-result p3

    if-eqz p3, :cond_0

    new-instance p3, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getThemeResId()I

    move-result v1

    invoke-direct {p3, v0, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    :cond_0
    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    return-void
.end method

.method public final onDetach()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListItemClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchResultClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->channelListHeaderView:Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;

    const-string p2, "channelListHeaderView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupChannelListHeader(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->channelListView:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    const-string p2, "channelListView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupChannelList(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchInputView:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    const-string p2, "searchInputView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupSearchInput(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchResultListView:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    const-string p2, "searchResultListView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->setupSearchResultList(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getStyle()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->applyStyle(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;)V

    return-void
.end method

.method public final setChannelListItemClickListener(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->channelListItemClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$ChannelListItemClickListener;

    return-void
.end method

.method public final setHeaderActionButtonClickListener(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerActionButtonClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderActionButtonClickListener;

    return-void
.end method

.method public final setHeaderUserAvatarClickListener(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->headerUserAvatarClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$HeaderUserAvatarClickListener;

    return-void
.end method

.method public final setSearchResultClickListener(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->searchResultClickListener:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment$SearchResultClickListener;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->style:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;

    return-void
.end method

.method public final setupChannelList(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V
    .locals 3

    const-string v0, "channelListView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->channelListView:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getChannelListViewModel()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    move-result-object v0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroidx/lifecycle/g0;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannelItemClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    return-void
.end method

.method public final setupChannelListHeader(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;)V
    .locals 3

    const-string v0, "channelListHeaderView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getShowHeader()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getChannelListHeaderViewModel()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;Landroidx/lifecycle/g0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getHeaderTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->setOnlineTitle(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/a;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->setOnActionButtonClickListener(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/a;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView;->setOnUserAvatarClickListener(Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;)V

    return-void

    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setupSearchInput(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V
    .locals 2

    const-string v0, "searchInputView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchInputView:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getShowSearch()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/a;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->setDebouncedInputChangedListener(Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;)V

    new-instance v0, Lc9/c;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p1, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->setSearchStartedListener(Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;)V

    return-void

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setupSearchResultList(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)V
    .locals 3

    const-string v0, "searchResultListView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->_binding:Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelListBinding;->searchResultListView:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->getSearchViewModel()Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    move-result-object v0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    const-string v2, "getViewLifecycleOwner(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Landroidx/lifecycle/g0;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/a;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/channels/a;-><init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->setSearchResultSelectedListener(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V

    return-void
.end method
