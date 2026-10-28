.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\rR\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;",
        "binding",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onShowAllOptions",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;Lc93/a;)V",
        "pollItem",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;",
        "Lc93/a;",
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


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;

.field private final onShowAllOptions:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShowAllOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;-><init>(Lec/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->onShowAllOptions:Lc93/a;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->onShowAllOptions:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final bind$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->onShowAllOptions:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;)V
    .locals 3

    const-string v0, "pollItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;->pollShowAllOptions:Landroid/widget/TextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3
    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_poll_action_see_all:I

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;->getCount()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 5
    invoke-virtual {v0, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollShowAllOptionsBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final bridge synthetic bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;)V

    return-void
.end method
