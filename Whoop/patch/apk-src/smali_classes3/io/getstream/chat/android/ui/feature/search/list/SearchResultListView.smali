.class public final Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;
.super Landroid/widget/ViewFlipper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Companion;,
        Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Flipper;,
        Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;,
        Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 /2\u00020\u0001:\u0004012/B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ\r\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0018\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;",
        "Landroid/widget/ViewFlipper;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;",
        "style",
        "Ll83/a0;",
        "setupViewStyle",
        "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V",
        "setupView",
        "()V",
        "",
        "query",
        "",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "messages",
        "showMessages",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "showLoading",
        "showError",
        "",
        "isEnabled",
        "setPaginationEnabled",
        "(Z)V",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;",
        "searchResultSelectedListener",
        "setSearchResultSelectedListener",
        "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;",
        "loadMoreListener",
        "setLoadMoreListener",
        "(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;",
        "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;",
        "adapter",
        "Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "scrollListener",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "Companion",
        "SearchResultSelectedListener",
        "LoadMoreListener",
        "Flipper",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Companion;

.field public static final LOAD_MORE_THRESHOLD:I = 0xa
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final adapter:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

.field private loadMoreListener:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;

.field private final scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->Companion:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    .line 4
    new-instance v0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/16 v2, 0xa

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    .line 5
    sget-object v0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;

    move-result-object p1

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;-><init>(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->adapter:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    .line 7
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->setupViewStyle(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V

    .line 8
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->setupView()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->scrollListener$lambda$0(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)Ll83/a0;

    return-void
.end method

.method private static final scrollListener$lambda$0(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;->onLoadMoreRequested()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setupView()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->searchListView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->adapter:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    return-void
.end method

.method private final setupViewStyle(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;)V
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getBackgroundColor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->searchInfoBar:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getSearchInfoBarBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->searchInfoBar:Landroid/widget/TextView;

    const-string v1, "searchInfoBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getSearchInfoBarTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->emptyImage:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getEmptyStateIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->emptyLabel:Landroid/widget/TextView;

    const-string v1, "emptyLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getEmptyStateTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getProgressBarIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->searchListView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/y;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/y;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;->getItemSeparator()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, v1, Landroidx/recyclerview/widget/y;->a:Landroid/graphics/drawable/Drawable;

    const/4 p1, -0x1

    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/q1;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Drawable cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final setLoadMoreListener(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;

    return-void
.end method

.method public final setPaginationEnabled(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->enablePagination()V

    return-void

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->disablePagination()V

    return-void
.end method

.method public final setSearchResultSelectedListener(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->adapter:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;->setSearchResultSelectedListener(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;)V

    return-void
.end method

.method public final showError()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_search_results_error:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final showLoading()V
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->adapter:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->disablePagination()V

    return-void
.end method

.method public final showMessages(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->searchInfoBar:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$plurals;->stream_ui_search_results_count:I

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchResultListViewBinding;->emptyLabel:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_search_results_empty:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->adapter:Lio/getstream/chat/android/ui/feature/search/internal/SearchResultListAdapter;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    return-void
.end method
