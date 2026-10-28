.class public final Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\'\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0014R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;",
        "",
        "",
        "loadMoreThresholdDp",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "loadMoreListener",
        "Landroid/content/res/Resources;",
        "resources",
        "<init>",
        "(ILc93/a;Landroid/content/res/Resources;)V",
        "Landroidx/core/widget/NestedScrollView;",
        "nestedScrollView",
        "attachTo",
        "(Landroidx/core/widget/NestedScrollView;)V",
        "detachFrom",
        "enablePagination",
        "()V",
        "disablePagination",
        "I",
        "Lc93/a;",
        "Landroid/content/res/Resources;",
        "",
        "paginationEnabled",
        "Z",
        "Ll5/g;",
        "scrollChangeListener",
        "Ll5/g;",
        "Companion",
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
.field private static final Companion:Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper$Companion;

.field private static final DEFAULT_LOAD_MORE_THRESHOLD_DP:I = 0xc8


# instance fields
.field private final loadMoreListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final loadMoreThresholdDp:I

.field private paginationEnabled:Z

.field private final resources:Landroid/content/res/Resources;

.field private final scrollChangeListener:Ll5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->Companion:Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper$Companion;

    return-void
.end method

.method public constructor <init>(ILc93/a;Landroid/content/res/Resources;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/a;",
            "Landroid/content/res/Resources;",
            ")V"
        }
    .end annotation

    const-string v0, "loadMoreListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->loadMoreThresholdDp:I

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->loadMoreListener:Lc93/a;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->resources:Landroid/content/res/Resources;

    if-ltz p1, :cond_0

    .line 5
    new-instance p1, Lhn/p;

    const/16 p2, 0xd

    invoke-direct {p1, p0, p2}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->scrollChangeListener:Ll5/g;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Load more threshold must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(ILc93/a;Landroid/content/res/Resources;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0xc8

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;-><init>(ILc93/a;Landroid/content/res/Resources;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->scrollChangeListener$lambda$2$lambda$1(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;Landroidx/core/widget/NestedScrollView;IIII)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->scrollChangeListener$lambda$2(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;Landroidx/core/widget/NestedScrollView;IIII)V

    return-void
.end method

.method private static final scrollChangeListener$lambda$2(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;Landroidx/core/widget/NestedScrollView;IIII)V
    .locals 0

    const-string p2, "nestedScrollView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->paginationEnabled:Z

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result p2

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p4

    add-int/2addr p4, p3

    iget p3, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->loadMoreThresholdDp:I

    int-to-float p3, p3

    iget-object p5, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->resources:Landroid/content/res/Resources;

    invoke-virtual {p5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p5

    iget p5, p5, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p3, p5

    if-lez p2, :cond_2

    sub-int/2addr p2, p4

    int-to-float p2, p2

    cmpg-float p2, p2, p3

    if-gez p2, :cond_2

    new-instance p2, Landroidx/fragment/app/m;

    const/16 p3, 0x1d

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method private static final scrollChangeListener$lambda$2$lambda$1(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;)V
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->paginationEnabled:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->loadMoreListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final attachTo(Landroidx/core/widget/NestedScrollView;)V
    .locals 1

    const-string v0, "nestedScrollView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->scrollChangeListener:Ll5/g;

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Ll5/g;)V

    return-void
.end method

.method public final detachFrom(Landroidx/core/widget/NestedScrollView;)V
    .locals 1

    const-string v0, "nestedScrollView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Ll5/g;)V

    return-void
.end method

.method public final disablePagination()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->paginationEnabled:Z

    return-void
.end method

.method public final enablePagination()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->paginationEnabled:Z

    return-void
.end method
