.class public abstract Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;
.super Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008&\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000cH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\u0011\"\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "getSwipeView",
        "()Landroid/view/View;",
        "",
        "getOpenedX",
        "()F",
        "getClosedX",
        "Li93/f;",
        "getSwipeDeltaRange",
        "()Li93/f;",
        "",
        "isSwipeEnabled",
        "()Z",
        "isSwiped",
        "view",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "swipeListener",
        "Ll83/a0;",
        "setSwipeListener",
        "(Landroid/view/View;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V",
        "listener",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "getListener",
        "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;",
        "setListener",
        "(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V",
        "swiping",
        "Z",
        "getSwiping",
        "setSwiping",
        "(Z)V",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder$Companion;

.field private static final SWIPE_THRESHOLD:F


# instance fields
.field private listener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

.field private swiping:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder$Companion;

    const/16 v0, 0x10

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->SWIPE_THRESHOLD:F

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static/range {p0 .. p7}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->setSwipeListener$lambda$0(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final setSwipeListener$lambda$0(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->isSwipeEnabled()Z

    move-result p6

    const/4 v0, 0x0

    if-nez p6, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p7}, Landroid/view/MotionEvent;->getRawX()F

    move-result p6

    invoke-virtual {p7}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    invoke-virtual {p7}, Landroid/view/MotionEvent;->getAction()I

    move-result p7

    if-eqz p7, :cond_b

    const/4 v2, 0x1

    if-eq p7, v2, :cond_8

    const/4 v3, 0x2

    if-eq p7, v3, :cond_3

    const/4 p1, 0x3

    if-eq p7, p1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-boolean p1, p4, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz p1, :cond_2

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    iput-boolean v0, p4, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz p5, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result p1

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p5, p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeCanceled(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    :cond_2
    iget-boolean p0, p4, Lkotlin/jvm/internal/b0;->w:Z

    return p0

    :cond_3
    iget p1, p1, Lkotlin/jvm/internal/d0;->w:F

    sub-float p1, p6, p1

    iget p2, p2, Lkotlin/jvm/internal/d0;->w:F

    sub-float p2, v1, p2

    iget p7, p3, Lkotlin/jvm/internal/d0;->w:F

    sub-float p7, p6, p7

    iput p6, p3, Lkotlin/jvm/internal/d0;->w:F

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    iput-boolean p3, p4, Lkotlin/jvm/internal/b0;->w:Z

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p3, p2

    if-lez p2, :cond_4

    move v0, v2

    :cond_4
    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    iget-boolean p2, p4, Lkotlin/jvm/internal/b0;->w:Z

    if-nez p2, :cond_5

    if-eqz v0, :cond_5

    if-eqz p5, :cond_7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result p1

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p5, p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeStarted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    goto :goto_0

    :cond_5
    if-eqz v0, :cond_6

    if-eqz p5, :cond_7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result p2

    invoke-interface {p5, p0, p2, p7, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeChanged(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;IFF)V

    goto :goto_0

    :cond_6
    if-eqz p2, :cond_7

    if-nez v0, :cond_7

    if-eqz p5, :cond_7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result p1

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p5, p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeCanceled(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    :cond_7
    :goto_0
    iget-boolean p0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    return p0

    :cond_8
    iget-boolean p2, p4, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz p2, :cond_a

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    iput-boolean v0, p4, Lkotlin/jvm/internal/b0;->w:Z

    iget p1, p1, Lkotlin/jvm/internal/d0;->w:F

    sub-float p1, p6, p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->SWIPE_THRESHOLD:F

    cmpl-float p1, p1, p2

    if-lez p1, :cond_9

    move v0, v2

    :cond_9
    if-eqz p5, :cond_a

    invoke-virtual {p0}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result p1

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p5, p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;->onSwipeCompleted(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;ILjava/lang/Float;Ljava/lang/Float;)V

    :cond_a
    :goto_1
    return v0

    :cond_b
    iput p6, p1, Lkotlin/jvm/internal/d0;->w:F

    iput v1, p2, Lkotlin/jvm/internal/d0;->w:F

    iget p1, p1, Lkotlin/jvm/internal/d0;->w:F

    iput p1, p3, Lkotlin/jvm/internal/d0;->w:F

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    return v0
.end method


# virtual methods
.method public abstract getClosedX()F
.end method

.method public final getListener()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->listener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    return-object v0
.end method

.method public abstract getOpenedX()F
.end method

.method public abstract getSwipeDeltaRange()Li93/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li93/f;"
        }
    .end annotation
.end method

.method public abstract getSwipeView()Landroid/view/View;
.end method

.method public final getSwiping()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    return v0
.end method

.method public abstract isSwipeEnabled()Z
.end method

.method public abstract isSwiped()Z
.end method

.method public final setListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->listener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    return-void
.end method

.method public final setSwipeListener(Landroid/view/View;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lkotlin/jvm/internal/d0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/d0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/d0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkotlin/jvm/internal/b0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->listener:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;

    move-object v2, p0

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/e;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final setSwiping(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/SwipeViewHolder;->swiping:Z

    return-void
.end method
