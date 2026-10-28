.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0000\u0018\u00002\u00020\u0001:\u0001-B9\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J3\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J3\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008!\u0010\u001cJ3\u0010\"\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010(\u001a\u0004\u0008)\u0010*R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010+R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
        "layoutManager",
        "",
        "",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;",
        "swipeStateByPosition",
        "",
        "multiSwipeEnabled",
        "<init>",
        "(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;Z)V",
        "Landroid/view/View;",
        "",
        "value",
        "Ll83/a0;",
        "animateSwipeTo",
        "(Landroid/view/View;F)V",
        "adapterPosition",
        "closeAllOtherPositions",
        "(I)V",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;",
        "viewHolder",
        "x",
        "y",
        "onSwipeStarted",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V",
        "dX",
        "totalDeltaX",
        "onSwipeChanged",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V",
        "onSwipeCompleted",
        "onSwipeCanceled",
        "onRestoreSwipePosition",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getRecyclerView",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
        "getLayoutManager",
        "()Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
        "Ljava/util/Map;",
        "Z",
        "SwipeState",
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
.field private final layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

.field private multiSwipeEnabled:Z

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final swipeStateByPosition:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;)V
    .locals 8

    .line 1
    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;",
            ">;)V"
        }
    .end annotation

    .line 2
    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "swipeStateByPosition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "swipeStateByPosition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->swipeStateByPosition:Ljava/util/Map;

    .line 7
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->multiSwipeEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 8
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;Ljava/util/Map;Z)V

    return-void
.end method

.method public static synthetic a(Ljava/util/Map$Entry;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->closeAllOtherPositions$lambda$3(Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method private final animateSwipeTo(Landroid/view/View;F)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0x64

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public static synthetic b(ILjava/util/Map$Entry;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->closeAllOtherPositions$lambda$2(ILjava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method private final closeAllOtherPositions(I)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->swipeStateByPosition:Ljava/util/Map;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v2, 0x13

    invoke-direct {v1, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-static {v0, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    invoke-static {p1, v0}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    new-instance v0, Lxb3/e;

    invoke-direct {v0, p1}, Lxb3/e;-><init>(Lxb3/f;)V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lxb3/e;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->swipeStateByPosition:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    iget-object v2, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroidx/recyclerview/widget/u1;->isViewPartiallyVisible(Landroid/view/View;ZZ)Z

    move-result v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    iget-object v3, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v2, v3, v4, v4}, Landroidx/recyclerview/widget/u1;->isViewPartiallyVisible(Landroid/view/View;ZZ)Z

    move-result v2

    if-nez v1, :cond_2

    if-eqz v2, :cond_0

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->animateSwipeTo(Landroid/view/View;F)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private static final closeAllOtherPositions$lambda$2(ILjava/util/Map$Entry;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eq p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final closeAllOtherPositions$lambda$3(Ljava/util/Map$Entry;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final getLayoutManager()Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    return-object v0
.end method

.method public final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final onRestoreSwipePosition(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;I)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->swipeStateByPosition:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState;

    sget-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getOpenedX()F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setX(F)V

    return-void
.end method

.method public final onSwipeCanceled(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 0

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object p1

    const/4 p3, 0x0

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->animateSwipeTo(Landroid/view/View;F)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->swipeStateByPosition:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->setVerticalScrollEnabled(Z)V

    return-void
.end method

.method public final onSwipeChanged(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V
    .locals 0

    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getX()F

    move-result p2

    add-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwipeDeltaRange()Li93/f;

    move-result-object p3

    invoke-static {p2, p3}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getX()F

    move-result p4

    cmpg-float p4, p4, p2

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setX(F)V

    :goto_0
    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPressed(Z)V

    return-void
.end method

.method public final onSwipeCompleted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 0

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->isSwiped()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getOpenedX()F

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->getSwipeView()Landroid/view/View;

    move-result-object p4

    invoke-direct {p0, p4, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->animateSwipeTo(Landroid/view/View;F)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->isSwiped()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;

    goto :goto_1

    :cond_1
    sget-object p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Closed;

    :goto_1
    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->swipeStateByPosition:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->multiSwipeEnabled:Z

    if-nez p3, :cond_2

    sget-object p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener$SwipeState$Open;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->closeAllOtherPositions(I)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->setVerticalScrollEnabled(Z)V

    return-void
.end method

.method public final onSwipeStarted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 0

    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->layoutManager:Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/widgets/internal/ScrollPauseLinearLayoutManager;->setVerticalScrollEnabled(Z)V

    return-void
.end method
