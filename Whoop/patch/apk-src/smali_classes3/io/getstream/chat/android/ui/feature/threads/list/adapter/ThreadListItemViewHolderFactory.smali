.class public Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\tH\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u000bJ\'\u0010\u000f\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\r\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\r\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010 \u001a\u00020\u00182\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR$\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00168\u0004@BX\u0084.\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\"\u001a\u0004\u0008#\u0010$R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0008\u0010!\u001a\u0004\u0018\u00010\u001c8\u0004@BX\u0084\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
        "item",
        "",
        "getItemViewType",
        "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)I",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "viewHolder",
        "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;)I",
        "Landroid/view/ViewGroup;",
        "parentView",
        "viewType",
        "createViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;",
        "createThreadItemViewHolder",
        "(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;",
        "createLoadingMoreViewHolder",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "style",
        "Ll83/a0;",
        "setStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V",
        "setStyle",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
        "clickListener",
        "setThreadClickListener$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V",
        "setThreadClickListener",
        "value",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
        "getClickListener",
        "()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;",
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
.field private clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

.field private style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createLoadingMoreViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadListLoadingMoreViewHolder;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadListLoadingMoreViewHolder;-><init>(Landroid/view/ViewGroup;)V

    return-object v0
.end method

.method public final createThreadItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder<",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->getStyle()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;-><init>(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;Lio/getstream/chat/android/ui/databinding/StreamUiItemThreadListBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
            ">;"
        }
    .end annotation

    const-string v0, "parentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->createLoadingMoreViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unhandled ThreadList view type: "

    invoke-static {p2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->createThreadItemViewHolder(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final getClickListener()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    return-object v0
.end method

.method public final getItemViewType(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)I
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getItemViewType(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
            ">;)I"
        }
    .end annotation

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadItemViewHolder;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/internal/ThreadListLoadingMoreViewHolder;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unhandled ThreadList view holder: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final setStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    return-void
.end method

.method public final setThreadClickListener$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->clickListener:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$ThreadClickListener;

    return-void
.end method
