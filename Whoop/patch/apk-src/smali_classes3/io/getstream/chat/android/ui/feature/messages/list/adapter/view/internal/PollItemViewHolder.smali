.class abstract Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;",
        ">",
        "Landroidx/recyclerview/widget/o2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0011\u0008\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u0082\u0001\u0008\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;",
        "T",
        "Landroidx/recyclerview/widget/o2;",
        "Lec/a;",
        "binding",
        "<init>",
        "(Lec/a;)V",
        "pollItem",
        "Ll83/a0;",
        "bindPollItem",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V",
        "bind",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AddCommentViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/CloseViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/HeaderViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ShowAllOptionsViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/SuggestOptionViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewCommentsViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/ViewResultsViewHolder;",
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


# direct methods
.method private constructor <init>(Lec/a;)V
    .locals 0

    .line 2
    invoke-interface {p1}, Lec/a;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Lec/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;-><init>(Lec/a;)V

    return-void
.end method


# virtual methods
.method public abstract bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final bindPollItem(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V
    .locals 1

    const-string v0, "pollItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V

    return-void
.end method
