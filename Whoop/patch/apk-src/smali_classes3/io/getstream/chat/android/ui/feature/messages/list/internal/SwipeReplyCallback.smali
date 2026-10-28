.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;
.super Landroidx/recyclerview/widget/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\u000c\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJG\u0010$\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010&\u001a\u0004\u0008\'\u0010(R%\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008*\u0010+R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010)\u001a\u0004\u0008-\u0010+\"\u0004\u0008.\u0010/R\u001a\u00102\u001a\u0004\u0018\u00010\u0005*\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u001e\u00106\u001a\u0004\u0018\u000103*\u0006\u0012\u0002\u0008\u00030\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u0018\u0010:\u001a\u00020\u0011*\u0002078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;",
        "Landroidx/recyclerview/widget/m0;",
        "Landroid/graphics/drawable/Drawable;",
        "replyDrawable",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Message;",
        "",
        "canReply",
        "<init>",
        "(Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;)V",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "asBaseMessageItemViewHolder",
        "(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "viewHolder",
        "",
        "getMovementFlags",
        "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I",
        "target",
        "onMove",
        "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Landroidx/recyclerview/widget/o2;)Z",
        "",
        "getSwipeThreshold",
        "(Landroidx/recyclerview/widget/o2;)F",
        "direction",
        "Ll83/a0;",
        "onSwiped",
        "(Landroidx/recyclerview/widget/o2;I)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "dX",
        "dY",
        "actionState",
        "isCurrentlyActive",
        "onChildDraw",
        "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V",
        "Landroid/graphics/drawable/Drawable;",
        "getReplyDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "Lkotlin/jvm/functions/Function1;",
        "getCanReply",
        "()Lkotlin/jvm/functions/Function1;",
        "onReply",
        "getOnReply",
        "setOnReply",
        "(Lkotlin/jvm/functions/Function1;)V",
        "getMessage",
        "(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/models/Message;",
        "message",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "getMessageItem",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "messageItem",
        "Landroid/view/View;",
        "getMiddleVerticalPoint",
        "(Landroid/view/View;)I",
        "middleVerticalPoint",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback$Companion;

.field private static final REPLY_DRAWABLE_SIZE_MULTIPLIER:I = 0x3


# instance fields
.field private final canReply:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private onReply:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final replyDrawable:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "replyDrawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canReply"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/m0;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->canReply:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p2, 0x17

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onReply:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onReply$lambda$0(Lio/getstream/chat/android/models/Message;)Ll83/a0;

    return-void
.end method

.method private final asBaseMessageItemViewHolder(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/o2;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "*>;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getMessage(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->asBaseMessageItemViewHolder(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getMessageItem(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getMessageItem(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder<",
            "*>;)",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getMiddleVerticalPoint(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    add-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    return p1
.end method

.method private static final onReply$lambda$0(Lio/getstream/chat/android/models/Message;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final getCanReply()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->canReply:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewHolder"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->canReply:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getMessage(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    const/16 p1, 0x8

    invoke-static {v0, p1}, Landroidx/recyclerview/widget/m0;->makeMovementFlags(II)I

    move-result p1

    return p1

    :cond_0
    if-nez p1, :cond_1

    return v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getOnReply()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onReply:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getReplyDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getSwipeThreshold(Landroidx/recyclerview/widget/o2;)F
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x3e99999a    # 0.3f

    return p1
.end method

.method public final onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V
    .locals 5

    const-string p6, "canvas"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "recyclerView"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "viewHolder"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-int p6, p4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {p6, v0}, Ljava/lang/Math;->min(II)I

    move-result p6

    iget-object v0, p3, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getMiddleVerticalPoint(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    new-instance v2, Landroid/graphics/Rect;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    sub-int v3, p6, v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v0

    invoke-direct {v2, v3, v0, p6, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p6

    div-int/lit8 p6, p6, 0x2

    int-to-float p6, p6

    invoke-static {p4, p6}, Ljava/lang/Math;->min(FF)F

    move-result p4

    iget-object p3, p3, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    if-eqz p7, :cond_3

    const p6, 0x7f0a07ea

    invoke-virtual {p3, p6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p7

    if-nez p7, :cond_3

    sget-object p7, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p3}, Lh5/h0;->e(Landroid/view/View;)F

    move-result p7

    invoke-static {p7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p7

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-ne v3, p3, :cond_0

    goto :goto_1

    :cond_0
    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v3}, Lh5/h0;->e(Landroid/view/View;)F

    move-result v3

    cmpl-float v4, v3, v1

    if-lez v4, :cond_1

    move v1, v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    add-float/2addr v1, p2

    invoke-static {p3, v1}, Lh5/h0;->k(Landroid/view/View;F)V

    invoke-virtual {p3, p6, p7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_3
    invoke-virtual {p3, p4}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p3, p5}, Landroid/view/View;->setTranslationY(F)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->replyDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onMove(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Landroidx/recyclerview/widget/o2;)Z
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewHolder"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onSwiped(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getMessage(Landroidx/recyclerview/widget/o2;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onReply:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setOnReply(Lkotlin/jvm/functions/Function1;)V
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

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onReply:Lkotlin/jvm/functions/Function1;

    return-void
.end method
