.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R.\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010$\u001a\u0004\u0008*\u0010&\"\u0004\u0008+\u0010(R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010$\u001a\u0004\u0008-\u0010&\"\u0004\u0008.\u0010(R(\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00100/8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R.\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00086\u0010$\u001a\u0004\u00087\u0010&\"\u0004\u00088\u0010(R.\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010$\u001a\u0004\u0008:\u0010&\"\u0004\u0008;\u0010(R.\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00100!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010$\u001a\u0004\u0008=\u0010&\"\u0004\u0008>\u0010(\u00a8\u0006?"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
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
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "",
        "isMine",
        "Ll83/a0;",
        "setPoll",
        "(Lio/getstream/chat/android/models/Poll;Z)V",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;",
        "pollAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Option;",
        "onOptionClick",
        "Lkotlin/jvm/functions/Function1;",
        "getOnOptionClick",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnOptionClick",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onClosePollClick",
        "getOnClosePollClick",
        "setOnClosePollClick",
        "onViewPollResultsClick",
        "getOnViewPollResultsClick",
        "setOnViewPollResultsClick",
        "Lkotlin/Function0;",
        "onShowAllPollOptionClick",
        "Lc93/a;",
        "getOnShowAllPollOptionClick",
        "()Lc93/a;",
        "setOnShowAllPollOptionClick",
        "(Lc93/a;)V",
        "onSuggestOptionClick",
        "getOnSuggestOptionClick",
        "setOnSuggestOptionClick",
        "onAddCommentClick",
        "getOnAddCommentClick",
        "setOnAddCommentClick",
        "onViewCommentsClick",
        "getOnViewCommentsClick",
        "setOnViewCommentsClick",
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
.field private final logger$delegate:Ll83/h;

.field private onAddCommentClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onClosePollClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onOptionClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onShowAllPollOptionClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private onSuggestOptionClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onViewCommentsClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onViewPollResultsClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private pollAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;

.field private style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, "PollView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->logger$delegate:Ll83/h;

    .line 6
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onOptionClick:Lkotlin/jvm/functions/Function1;

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p3, 0x6

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onClosePollClick:Lkotlin/jvm/functions/Function1;

    .line 8
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p3, 0x7

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewPollResultsClick:Lkotlin/jvm/functions/Function1;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 p3, 0x2

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onShowAllPollOptionClick:Lc93/a;

    .line 10
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onSuggestOptionClick:Lkotlin/jvm/functions/Function1;

    .line 11
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p3, 0x3

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onAddCommentClick:Lkotlin/jvm/functions/Function1;

    .line 12
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;

    const/4 p3, 0x4

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewCommentsClick:Lkotlin/jvm/functions/Function1;

    .line 13
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    const/4 p3, 0x1

    .line 14
    invoke-direct {p1, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 15
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/p1;)V

    .line 17
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onClosePollClick$lambda$1(Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static B(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onShowAllPollOptionClick:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static C(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewCommentsClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle$Companion;->invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    return-void
.end method

.method private static final onAddCommentClick$lambda$5(Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onClosePollClick$lambda$1(Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onOptionClick$lambda$0(Lio/getstream/chat/android/models/Option;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onShowAllPollOptionClick$lambda$3()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final onSuggestOptionClick$lambda$4(Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onViewCommentsClick$lambda$6(Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onViewPollResultsClick$lambda$2(Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic q(Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewCommentsClick$lambda$6(Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic r(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Option;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setPoll$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Option;)Ll83/a0;

    return-void
.end method

.method public static s(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onSuggestOptionClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final setPoll$lambda$10(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewPollResultsClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setPoll$lambda$11(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onShowAllPollOptionClick:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setPoll$lambda$12(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onSuggestOptionClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setPoll$lambda$13(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onAddCommentClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setPoll$lambda$14(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewCommentsClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setPoll$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Option;)Ll83/a0;
    .locals 1

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onOptionClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setPoll$lambda$9(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onClosePollClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static t(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewPollResultsClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic u(Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onAddCommentClick$lambda$5(Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic v(Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewPollResultsClick$lambda$2(Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static w(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onClosePollClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static x(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onAddCommentClick:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onSuggestOptionClick$lambda$4(Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic z(Lio/getstream/chat/android/models/Option;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onOptionClick$lambda$0(Lio/getstream/chat/android/models/Option;)Ll83/a0;

    return-void
.end method


# virtual methods
.method public final getOnAddCommentClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onAddCommentClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnClosePollClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onClosePollClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnOptionClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onOptionClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnShowAllPollOptionClick()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onShowAllPollOptionClick:Lc93/a;

    return-object v0
.end method

.method public final getOnSuggestOptionClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onSuggestOptionClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnViewCommentsClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewCommentsClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnViewPollResultsClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewPollResultsClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final setOnAddCommentClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onAddCommentClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnClosePollClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onClosePollClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnOptionClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onOptionClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnShowAllPollOptionClick(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onShowAllPollOptionClick:Lc93/a;

    return-void
.end method

.method public final setOnSuggestOptionClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onSuggestOptionClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnViewCommentsClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewCommentsClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnViewPollResultsClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->onViewPollResultsClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setPoll(Lio/getstream/chat/android/models/Poll;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "poll"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "[setPoll] poll: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->pollAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;

    if-nez v2, :cond_2

    new-instance v7, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;

    iget-object v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;

    if-eqz v8, :cond_1

    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;

    const/4 v2, 0x2

    invoke-direct {v9, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;-><init>(Ljava/lang/Object;I)V

    new-instance v10, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;

    const/4 v2, 0x0

    invoke-direct {v10, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;I)V

    new-instance v11, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;

    const/4 v2, 0x1

    invoke-direct {v11, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;I)V

    new-instance v12, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/d;

    const/4 v2, 0x2

    invoke-direct {v12, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/d;-><init>(Landroid/view/ViewGroup;I)V

    new-instance v13, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;

    invoke-direct {v13, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;I)V

    new-instance v14, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;

    const/4 v2, 0x3

    invoke-direct {v14, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;I)V

    new-instance v15, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;

    const/4 v2, 0x4

    invoke-direct {v15, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/o;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Poll;I)V

    invoke-direct/range {v7 .. v15}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->pollAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    goto :goto_0

    :cond_1
    const-string v1, "style"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_2
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v7, "getContext(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5}, Lio/getstream/chat/android/ui/common/utils/extensions/PollKt;->getSubtitle(Lio/getstream/chat/android/models/Poll;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->getWinner(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/models/Option;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    const/4 v5, 0x5

    invoke-static {v4, v5}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v4, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lio/getstream/chat/android/models/Option;

    invoke-static {v1, v10}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->getVotesUnlessAnonymous(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    const/4 v9, 0x0

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move v13, v8

    goto :goto_2

    :cond_3
    move v13, v9

    :goto_2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    instance-of v12, v8, Ljava/util/Collection;

    if-eqz v12, :cond_5

    move-object v12, v8

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_5

    :cond_4
    :goto_3
    move v12, v9

    goto :goto_4

    :cond_5
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/models/Vote;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Vote;->getOptionId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/4 v9, 0x1

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8}, Lm83/s;->v1(Ljava/lang/Iterable;)I

    move-result v14

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v15

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;

    invoke-direct/range {v9 .. v16}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;-><init>(Lio/getstream/chat/android/models/Option;Ljava/util/List;ZIIZZ)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;-><init>(I)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v5, :cond_8

    goto :goto_5

    :cond_8
    move-object v3, v6

    :goto_5
    if-eqz v3, :cond_9

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$SuggestOption;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$SuggestOption;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAllowUserSuggestedOptions()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_6

    :cond_a
    move-object v3, v6

    :goto_6
    if-eqz v3, :cond_b

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$AddComment;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$AddComment;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAllowAnswers()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_7

    :cond_c
    move-object v3, v6

    :goto_7
    if-eqz v3, :cond_d

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;-><init>(I)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAllowAnswers()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_8

    :cond_e
    move-object v3, v6

    :goto_8
    if-eqz v3, :cond_f

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Close;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Close;

    if-eqz p2, :cond_10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_9

    :cond_10
    move-object v3, v6

    :goto_9
    if-eqz v3, :cond_11

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->pollAdapter:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollAdapter;

    if-eqz v1, :cond_12

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    return-void

    :cond_12
    const-string v1, "pollAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6
.end method
