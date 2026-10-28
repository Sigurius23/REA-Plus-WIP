.class public final Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$Companion;,
        Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;,
        Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;,
        Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;,
        Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$SharedMediaSpaceItemDecorator;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 ?2\u00020\u0001:\u0005@ABC?B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u000c2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000c2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0016\u0010(\u001a\u00020\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u0010/\u001a\u0004\u00085\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>\u00a8\u0006D"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;",
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
        "Ll83/a0;",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "attachmentGalleryItems",
        "setDateText",
        "(Ljava/util/List;)V",
        "setAttachments",
        "disablePagination",
        "()V",
        "enablePagination",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;",
        "listener",
        "setMediaClickListener",
        "(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;",
        "setOnLoadMoreListener",
        "(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;)V",
        "getAttachments",
        "()Ljava/util/List;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;",
        "Ljava/text/DateFormat;",
        "dateFormat",
        "Ljava/text/DateFormat;",
        "",
        "showUserAvatars",
        "Z",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;",
        "adapter$delegate",
        "Ll83/h;",
        "getAdapter",
        "()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;",
        "adapter",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;",
        "dateScrollListener$delegate",
        "getDateScrollListener",
        "()Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;",
        "dateScrollListener",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "scrollListener",
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "mediaClickListener",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;",
        "loadMoreListener",
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;",
        "Companion",
        "MediaDateScrollListener",
        "MediaClickListener",
        "OnLoadMoreListener",
        "SharedMediaSpaceItemDecorator",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$Companion;

.field private static final LOAD_MORE_THRESHOLD:I = 0xa

.field private static final MEDIA_ITEM_SPACE:I

.field private static final SPAN_COUNT:I = 0x3


# instance fields
.field private final adapter$delegate:Ll83/h;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

.field private final dateFormat:Ljava/text/DateFormat;

.field private final dateScrollListener$delegate:Ll83/h;

.field private loadMoreListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;

.field private mediaClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;

.field private final scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

.field private showUserAvatars:Z

.field private style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->Companion:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$Companion;

    const/4 v0, 0x2

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/Utils;->dpToPx(I)I

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->MEDIA_ITEM_SPACE:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    invoke-static {p1, p0, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    .line 6
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p3, "MMM yyyy"

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p1, p3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateFormat:Ljava/text/DateFormat;

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/feature/gallery/overview/a;

    const/4 p3, 0x2

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/gallery/overview/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->adapter$delegate:Ll83/h;

    .line 8
    new-instance p1, Lio/getstream/chat/android/ui/feature/gallery/overview/a;

    const/4 p3, 0x3

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/gallery/overview/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateScrollListener$delegate:Ll83/h;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    new-instance p3, Lio/getstream/chat/android/ui/feature/gallery/overview/a;

    const/4 v0, 0x4

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V

    const/16 v0, 0xa

    invoke-direct {p1, v0, p3}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;-><init>(ILc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    .line 10
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->mediaClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;->onClick(I)V

    :cond_0
    return-void
.end method

.method public static final synthetic access$getMEDIA_ITEM_SPACE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->MEDIA_ITEM_SPACE:I

    return v0
.end method

.method private static final adapter_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    if-eqz v1, :cond_0

    new-instance v2, Lhn/p;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;-><init>(Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;)V

    return-object v0

    :cond_0
    const-string p0, "style"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final adapter_delegate$lambda$1$lambda$0(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->mediaClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;->onClick(I)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateScrollListener_delegate$lambda$4$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateScrollListener_delegate$lambda$4(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->scrollListener$lambda$5(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Ll83/a0;

    return-void
.end method

.method private static final dateScrollListener_delegate$lambda$4(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/overview/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/overview/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/gallery/overview/a;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/ui/feature/gallery/overview/a;-><init>(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;I)V

    const/4 p0, 0x3

    invoke-direct {v0, p0, v1, v2}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;-><init>(ILc93/a;Lc93/a;)V

    return-object v0
.end method

.method private static final dateScrollListener_delegate$lambda$4$lambda$2(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;->mediaRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;->dateTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method private static final dateScrollListener_delegate$lambda$4$lambda$3(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Ll83/a0;
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->getAdapter()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object v0

    const-string v1, "getCurrentList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->setDateText(Ljava/util/List;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)I
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateScrollListener_delegate$lambda$4$lambda$2(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->adapter_delegate$lambda$1(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    move-result-object p0

    return-object p0
.end method

.method private final getAdapter()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->adapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    return-object v0
.end method

.method private final getDateScrollListener()Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateScrollListener$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;

    return-object v0
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->style:Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;->getShowUserAvatars()Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->showUserAvatars:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;->mediaRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->getAdapter()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->getDateScrollListener()Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    return-void

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private static final scrollListener$lambda$5(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;->onLoadMore()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setDateText(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->getDateScrollListener()Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->getLastVisibleItemPosition()I

    move-result v1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;->dateContainer:Landroid/widget/FrameLayout;

    const-string v2, "dateContainer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    :goto_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentGridViewBinding;->dateTextView:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->dateFormat:Ljava/text/DateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final disablePagination()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->disablePagination()V

    return-void
.end method

.method public final enablePagination()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->scrollListener:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->enablePagination()V

    return-void
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->getAdapter()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object v0

    const-string v1, "getCurrentList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setAttachments(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachmentGalleryItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->getAdapter()Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->setDateText(Ljava/util/List;)V

    return-void
.end method

.method public final setMediaClickListener(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->mediaClickListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaClickListener;

    return-void
.end method

.method public final setOnLoadMoreListener(Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->loadMoreListener:Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$OnLoadMoreListener;

    return-void
.end method
