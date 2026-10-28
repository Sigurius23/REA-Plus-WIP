.class public final Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;
.super Landroid/widget/ViewFlipper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Companion;,
        Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Flipper;,
        Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;,
        Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 )2\u00020\u0001:\u0004)*+,B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010\'\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;",
        "Landroid/widget/ViewFlipper;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Ll83/a0;",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "messageResults",
        "showMessages",
        "(Ljava/util/List;)V",
        "showLoading",
        "()V",
        "showError",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;",
        "pinnedMessageSelectedListener",
        "setPinnedMessageSelectedListener",
        "(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;",
        "loadMoreListener",
        "setLoadMoreListener",
        "(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;",
        "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;",
        "adapter",
        "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "scrollListener",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;",
        "Companion",
        "Flipper",
        "PinnedMessageSelectedListener",
        "LoadMoreListener",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Companion;

.field public static final LOAD_MORE_THRESHOLD:I = 0xa
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

.field private loadMoreListener:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;

.field private final scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

.field private style:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->Companion:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    .line 3
    new-instance p1, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-direct {p1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    .line 4
    new-instance p1, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0xa

    invoke-direct {p1, v1, v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    .line 8
    new-instance p1, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-direct {p1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0xa

    invoke-direct {p1, v1, v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    .line 10
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->scrollListener$lambda$0(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;)Ll83/a0;

    return-void
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->getBackgroundColor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;->emptyImage:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->getEmptyStateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->getMessagePreviewStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->setMessagePreviewStyle(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->style:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;->pinnedMessageListRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    new-instance v0, Landroidx/recyclerview/widget/y;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/y;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_divider:I

    invoke-static {v1, v2}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v1, v0, Landroidx/recyclerview/widget/y;->a:Landroid/graphics/drawable/Drawable;

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/q1;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiPinnedMessageListViewBinding;->emptyDescriptionTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_pinned_message_list_empty_description:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final scrollListener$lambda$0(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;->onLoadMoreRequested()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final setLoadMoreListener(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$LoadMoreListener;

    return-void
.end method

.method public final setPinnedMessageSelectedListener(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;->setPinnedMessageSelectedListener(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView$PinnedMessageSelectedListener;)V

    return-void
.end method

.method public final showError()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_pinned_message_list_results_error:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final showLoading()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getItemCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->disablePagination()V

    return-void
.end method

.method public final showMessages(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/model/MessageResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messageResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->adapter:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->enablePagination()V

    return-void
.end method
