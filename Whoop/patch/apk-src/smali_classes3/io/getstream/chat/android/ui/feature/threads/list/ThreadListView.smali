.class public final Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$Companion;,
        Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;,
        Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;,
        Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 ?2\u00020\u0001:\u0004?@ABB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J#\u0010\u001b\u001a\u00020\t2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001d\u0010\u0010J\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010(\u001a\u00020\t2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008(\u0010)J\u0015\u0010+\u001a\u00020\t2\u0006\u0010\'\u001a\u00020*\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010.\u001a\u00020\t2\u0006\u0010\'\u001a\u00020-\u00a2\u0006\u0004\u0008.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0012\u00103R\u0016\u00104\u001a\u00020\"8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0016\u00106\u001a\u00020\u000c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0018\u00108\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>\u00a8\u0006C"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
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
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;",
        "requireAdapter",
        "()Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;",
        "initAdapter",
        "()V",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "style",
        "applyEmptyStateStyle",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V",
        "applyBannerStyle",
        "",
        "Lio/getstream/chat/android/models/Thread;",
        "threads",
        "",
        "isLoadingMore",
        "showThreads",
        "(Ljava/util/List;Z)V",
        "showLoading",
        "",
        "unreadThreadsCount",
        "showUnreadThreadsBanner",
        "(I)V",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;",
        "factory",
        "setViewHolderFactory",
        "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;",
        "listener",
        "setUnreadThreadsBannerClickListener",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
        "setThreadClickListener",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;",
        "setLoadMoreListener",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "viewHolderFactory",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;",
        "adapter",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;",
        "clickListener",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "scrollListener",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "loadMoreListener",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;",
        "Companion",
        "UnreadThreadsBannerClickListener",
        "ThreadClickListener",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$Companion;

.field private static final LOAD_MORE_THRESHOLD:I = 0xa

.field public static final synthetic w:I


# instance fields
.field private adapter:Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

.field private clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

.field private loadMoreListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;

.field private final scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

.field private style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

.field private viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->Companion:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    .line 3
    new-instance p1, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0xa

    invoke-direct {p1, v1, v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0xa

    invoke-direct {p1, v1, v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    .line 8
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final applyBannerStyle(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    const-string v1, "unreadThreadsBannerTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v0, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v2, v2, v3, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerPaddingLeft()I

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerPaddingTop()I

    move-result v3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerPaddingRight()I

    move-result v4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerPaddingBottom()I

    move-result v5

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerMarginLeft()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerMarginTop()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerMarginRight()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBannerMarginBottom()I

    move-result p1

    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final applyEmptyStateStyle(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->emptyImage:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getEmptyStateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->emptyTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getEmptyStateText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->emptyTextView:Landroid/widget/TextView;

    const-string v1, "emptyTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getEmptyStateTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->scrollListener$lambda$0(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;)Ll83/a0;

    return-void
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->threadListRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    const/4 v0, 0x0

    const-string v1, "style"

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;->getBackgroundColor()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->applyEmptyStateStyle(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->applyBannerStyle(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method private final initAdapter()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    const-string v1, "viewHolderFactory"

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    const-string v4, "style"

    if-eqz v3, :cond_4

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->setStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    if-eqz v0, :cond_3

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->setThreadClickListener$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    if-eqz v3, :cond_2

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    if-eqz v4, :cond_1

    invoke-direct {v0, v3, v4}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;-><init>(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->adapter:Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->threadListRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    return-void

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final requireAdapter()Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->adapter:Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->initAdapter()V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->adapter:Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final scrollListener$lambda$0(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;->onLoadMore()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setUnreadThreadsBannerClickListener$lambda$2(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;->onUnreadThreadsBannerClick()V

    return-void
.end method


# virtual methods
.method public final setLoadMoreListener(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;

    return-void
.end method

.method public final setThreadClickListener(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    return-void
.end method

.method public final setUnreadThreadsBannerClickListener(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;)V
    .locals 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    new-instance v1, Lb30/k3;

    const/16 v2, 0x1a

    invoke-direct {v1, p1, v2}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setViewHolderFactory(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V
    .locals 1

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->adapter:Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    if-nez v0, :cond_0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter was already initialized, please set ChannelListItemViewHolderFactory first"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final showLoading()V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->requireAdapter()Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->threadListRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "threadListRecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->emptyContainer:Landroid/widget/LinearLayout;

    const-string v2, "emptyContainer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v1, "progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->disablePagination()V

    return-void
.end method

.method public final showThreads(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->requireAdapter()Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->threadListRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const-string v4, "threadListRecyclerView"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x8

    if-nez v2, :cond_1

    move v5, v1

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->emptyContainer:Landroid/widget/LinearLayout;

    const-string v5, "emptyContainer"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v5, "progressBar"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Thread;

    new-instance v5, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;

    invoke-direct {v5, v4}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;-><init>(Lio/getstream/chat/android/models/Thread;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    sget-object p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_4

    :cond_4
    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_4
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->requireAdapter()Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;

    move-result-object p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v3, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->enablePagination()V

    if-eqz v0, :cond_5

    if-nez v2, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->threadListRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_5
    return-void
.end method

.method public final showUnreadThreadsBanner(I)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$plurals;->stream_ui_thread_list_new_threads:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getQuantityString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    const-string v2, "unreadThreadsBannerTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiThreadListViewBinding;->unreadThreadsBannerTextView:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
