.class public final Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter$ThreadListItemDiffCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00030\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0014\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;",
        "viewHolderFactory",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V",
        "",
        "position",
        "",
        "getItemId",
        "(I)J",
        "getItemViewType",
        "(I)I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;",
        "holder",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;I)V",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;",
        "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "ThreadListItemDiffCallback",
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
.field private final logger$delegate:Ll83/h;

.field private final style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

.field private final viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewHolderFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter$ThreadListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter$ThreadListItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->style:Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    const-string p1, "Chat:ThreadListAdapter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->logger$delegate:Ll83/h;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->setHasStableIds(Z)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final getItemId(I)J
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;->getStableId()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "getItem(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder<",
            "+",
            "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)I

    move-result v0

    .line 4
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;)I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->getLogger()Lb23/k;

    move-result-object p1

    .line 6
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    .line 7
    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 8
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 9
    const-string p2, "Item view type "

    const-string v4, " does not match the holder view type "

    .line 10
    invoke-static {v0, v1, p2, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 11
    invoke-interface {p1, v3, v2, p2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;
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

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/threads/list/adapter/internal/ThreadListAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItemViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/threads/list/adapter/viewholder/BaseThreadListItemViewHolder;

    move-result-object p1

    return-object p1
.end method
