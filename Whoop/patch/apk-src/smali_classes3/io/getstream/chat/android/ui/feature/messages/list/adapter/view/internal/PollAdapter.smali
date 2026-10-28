.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0002\u0018\u0000 \"2\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00030\u0001:\u0001\"Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\'\u0010\u001d\u001a\u00020\u00082\u000e\u0010\u001c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010 R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010!R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010!R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010!R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010!R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010!R\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
        "pollViewStyle",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Option;",
        "Ll83/a0;",
        "onOptionClick",
        "Lkotlin/Function0;",
        "onClosePollClick",
        "onViewPollResultsClick",
        "onShowAllOptionsClick",
        "onSuggestOptionClick",
        "onAddCommentClick",
        "onViewCommentsClick",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;",
        "position",
        "getItemViewType",
        "(I)I",
        "holder",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;I)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
        "Lkotlin/jvm/functions/Function1;",
        "Lc93/a;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter$Companion;

.field private static final VIEW_TYPE_ADD_COMMENT:I = 0x7

.field private static final VIEW_TYPE_ANSWER:I = 0x2

.field private static final VIEW_TYPE_CLOSE:I = 0x3

.field private static final VIEW_TYPE_HEADER:I = 0x1

.field private static final VIEW_TYPE_RESULTS:I = 0x4

.field private static final VIEW_TYPE_SHOW_ALL_OPTIONS:I = 0x5

.field private static final VIEW_TYPE_SUGGEST_OPTION:I = 0x6

.field private static final VIEW_TYPE_VIEW_COMMENTS:I = 0x8


# instance fields
.field private final onAddCommentClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final onClosePollClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final onOptionClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final onShowAllOptionsClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final onSuggestOptionClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final onViewCommentsClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final onViewPollResultsClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "pollViewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOptionClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClosePollClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewPollResultsClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShowAllOptionsClick"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuggestOptionClick"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddCommentClick"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewCommentsClick"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onOptionClick:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onClosePollClick:Lc93/a;

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onViewPollResultsClick:Lc93/a;

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onShowAllOptionsClick:Lc93/a;

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onSuggestOptionClick:Lc93/a;

    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onAddCommentClick:Lc93/a;

    iput-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onViewCommentsClick:Lc93/a;

    return-void
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;

    if-eqz v0, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Close;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Close;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x3

    return p1

    :cond_2
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x4

    return p1

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;

    if-eqz v0, :cond_4

    const/4 p1, 0x5

    return p1

    :cond_4
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$SuggestOption;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$SuggestOption;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p1, 0x6

    return p1

    :cond_5
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$AddComment;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$AddComment;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p1, 0x7

    return p1

    :cond_6
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;

    if-eqz p1, :cond_7

    const/16 p1, 0x8

    return p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;

    .line 3
    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    .line 2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown view type: "

    .line 3
    invoke-static {p2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :pswitch_0
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;

    .line 6
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollViewCommentsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollViewCommentsBinding;

    move-result-object p1

    .line 7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollViewCommentsBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollViewCommentsBinding;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onViewCommentsClick:Lc93/a;

    .line 9
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollViewCommentsBinding;Lc93/a;)V

    return-object p2

    .line 10
    :pswitch_1
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;

    .line 11
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAddCommentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAddCommentBinding;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAddCommentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAddCommentBinding;

    .line 13
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onAddCommentClick:Lc93/a;

    .line 14
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAddCommentBinding;Lc93/a;)V

    return-object p2

    .line 15
    :pswitch_2
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;

    .line 16
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollSuggestOptionBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollSuggestOptionBinding;

    move-result-object p1

    .line 17
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollSuggestOptionBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollSuggestOptionBinding;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onSuggestOptionClick:Lc93/a;

    .line 19
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollSuggestOptionBinding;Lc93/a;)V

    return-object p2

    .line 20
    :pswitch_3
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;

    .line 21
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;

    move-result-object p1

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;

    .line 23
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onShowAllOptionsClick:Lc93/a;

    .line 24
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;Lc93/a;)V

    return-object p2

    .line 25
    :pswitch_4
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;

    .line 26
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;

    move-result-object p1

    .line 27
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onViewPollResultsClick:Lc93/a;

    .line 29
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollResultsBinding;Lc93/a;)V

    return-object p2

    .line 30
    :pswitch_5
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;

    .line 31
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCloseBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCloseBinding;

    move-result-object p1

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCloseBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCloseBinding;

    .line 33
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onClosePollClick:Lc93/a;

    .line 34
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollCloseBinding;Lc93/a;)V

    return-object p2

    .line 35
    :pswitch_6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;

    .line 36
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    move-result-object p1

    .line 37
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->onOptionClick:Lkotlin/jvm/functions/Function1;

    .line 39
    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;Lkotlin/jvm/functions/Function1;)V

    return-object p2

    .line 40
    :pswitch_7
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/HeaderViewHolder;

    .line 41
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;

    move-result-object p1

    .line 42
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;->pollViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollViewKt;->access$applyStyle(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;

    .line 43
    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/HeaderViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollHeaderBinding;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
