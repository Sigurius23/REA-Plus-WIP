.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u001d\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010%\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020!H\u0000\u00a2\u0006\u0004\u0008#\u0010$R\u0016\u0010&\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010.R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010/R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u00100R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00102\u00a8\u00064"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;",
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
        "Ll83/a0;",
        "init",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "",
        "isMyMessage",
        "setMessage",
        "(Lio/getstream/chat/android/models/Message;Z)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "reactionClickListener",
        "setReactionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "editReactionsViewStyle",
        "applyStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V",
        "applyStyle",
        "",
        "messageAnchorPosition",
        "positionBubbleTail$stream_chat_android_ui_components_release",
        "(F)V",
        "positionBubbleTail",
        "reactionsViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;",
        "reactionsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;",
        "bubbleDrawer",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "Z",
        "F",
        "bubbleHeight",
        "I",
        "reactionsColumns",
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
.field private bubbleDrawer:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;

.field private bubbleHeight:I

.field private isMyMessage:Z

.field private messageAnchorPosition:F

.field private reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

.field private reactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

.field private reactionsColumns:I

.field private reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    .line 4
    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x5

    .line 6
    iput v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    .line 7
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    .line 9
    invoke-direct {p0, v0, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x5

    .line 10
    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    .line 11
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static final applyStyle$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;->onReactionClick(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Companion;->invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->applyStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getBubbleHeight()I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleHeight:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/p1;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public static synthetic q(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->applyStyle$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final applyStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V
    .locals 5

    const-string v0, "editReactionsViewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleDrawer:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/helper/SupportedReactions;->getReactions()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getReactionsColumn()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    const/4 v0, 0x0

    const-string v1, "reactionsViewStyle"

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getHorizontalPadding()I

    move-result p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getVerticalPadding()I

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getHorizontalPadding()I

    move-result v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getVerticalPadding()I

    move-result v4

    invoke-virtual {p0, p1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    invoke-direct {p1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getItemSize()I

    move-result v0

    new-instance v1, Lrm/p;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;-><init>(ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    const/16 v1, 0xc

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    sub-int/2addr v0, v1

    new-instance v10, Li93/j;

    const/4 v2, 0x1

    invoke-direct {v10, v1, v0, v2}, Li93/h;-><init>(III)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleDrawer:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v0, "getContext(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    iget v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleHeight:I

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->isMyMessage:Z

    const/4 v8, 0x1

    iget v9, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->messageAnchorPosition:F

    move-object v4, p1

    invoke-virtual/range {v2 .. v10}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->drawReactionsBubble(Landroid/content/Context;Landroid/graphics/Canvas;IIZZFLi93/j;)V

    return-void

    :cond_0
    const-string p1, "bubbleDrawer"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final positionBubbleTail$stream_chat_android_ui_components_release(F)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->messageAnchorPosition:F

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public final setMessage(Lio/getstream/chat/android/models/Message;Z)V
    .locals 6

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->isMyMessage:Z

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/helper/SupportedReactions;->getReactions()Ljava/util/Map;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v5, 0x1

    :cond_2
    :goto_1
    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;

    invoke-direct {v3, v2, v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;-><init>(Ljava/lang/String;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    if-le p1, p2, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    int-to-float p1, p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsColumns:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-float p1, p1

    float-to-int p1, p1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleHeight:I

    mul-int/2addr p2, p1

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleHeight:I

    :cond_4
    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->bubbleHeight:I

    const/16 p2, 0x10

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p0, p2}, Landroid/view/View;->setMinimumHeight(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    return-void

    :cond_5
    const-string p1, "reactionsAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V
    .locals 1

    const-string v0, "reactionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    return-void
.end method
