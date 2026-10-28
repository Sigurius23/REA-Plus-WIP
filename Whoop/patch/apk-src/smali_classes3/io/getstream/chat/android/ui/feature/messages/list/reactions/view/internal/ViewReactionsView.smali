.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010&\u001a\u00020\u000c2\u0006\u0010#\u001a\u00020\"H\u0000\u00a2\u0006\u0004\u0008$\u0010%R\u0016\u0010\'\u001a\u00020\"8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010/R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u00100R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00100\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;",
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
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;",
        "createReactionItems",
        "(Lio/getstream/chat/android/models/Message;)Ljava/util/List;",
        "",
        "isMyMessage",
        "Lkotlin/Function0;",
        "commitCallback",
        "setMessage",
        "(Lio/getstream/chat/android/models/Message;ZLc93/a;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "reactionClickListener",
        "setReactionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "style",
        "applyStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V",
        "applyStyle",
        "reactionsViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;",
        "reactionsAdapter",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;",
        "bubbleDrawer",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "Z",
        "isSingleReaction",
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
.field private bubbleDrawer:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;

.field private isMyMessage:Z

.field private isSingleReaction:Z

.field private reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

.field private reactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

.field private reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;


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

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isSingleReaction:Z

    .line 4
    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isSingleReaction:Z

    .line 7
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    const/4 p3, 0x1

    .line 10
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isSingleReaction:Z

    .line 11
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static final applyStyle$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;->onReactionClick(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final createReactionItems(Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getSupportedReactionGroups(Lio/getstream/chat/android/models/Message;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->h0(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lhb2/f;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lea2/l;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v3}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v2, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/ui/helper/SupportedReactions;->getReactionDrawable(Ljava/lang/String;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v6, 0x1

    :cond_3
    :goto_1
    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;

    invoke-direct {v4, v2, v6, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;-><init>(Ljava/lang/String;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method private static final createReactionItems$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ll83/k;Ll83/k;)I
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getReactionSorting()Lio/getstream/chat/android/models/ReactionSorting;

    move-result-object p0

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_0
    const-string p0, "reactionsViewStyle"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final createReactionItems$lambda$5(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->applyStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V

    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/p1;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public static synthetic q(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->applyStyle$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic r(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ll83/k;Ll83/k;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->createReactionItems$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Ll83/k;Ll83/k;)I

    move-result p0

    return p0
.end method

.method public static synthetic s(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lc93/a;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setMessage$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lc93/a;)V

    return-void
.end method

.method public static synthetic setMessage$default(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/models/Message;ZLc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lio/getstream/chat/android/client/k;

    const/16 p4, 0x17

    invoke-direct {p3, p4}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setMessage(Lio/getstream/chat/android/models/Message;ZLc93/a;)V

    return-void
.end method

.method private static final setMessage$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final setMessage$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lc93/a;)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    const/4 v1, 0x0

    const-string v2, "reactionsViewStyle"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getHorizontalPadding()I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getVerticalPadding()I

    move-result v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getHorizontalPadding()I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getVerticalPadding()I

    move-result v1

    invoke-virtual {p0, v0, v3, v4, v1}, Landroid/view/View;->setPadding(IIII)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final applyStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V
    .locals 5

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    const/4 v1, 0x0

    const-string v2, "reactionsViewStyle"

    if-eqz v0, :cond_6

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->bubbleDrawer:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getTotalHeight()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getHorizontalPadding()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getVerticalPadding()I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getHorizontalPadding()I

    move-result v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getVerticalPadding()I

    move-result v4

    invoke-virtual {p0, p1, v0, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getItemSize()I

    move-result v0

    new-instance v1, Lhn/p;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;-><init>(ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->bubbleDrawer:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "getContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isMyMessage:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isSingleReaction:Z

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->drawReactionsBubble$default(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;Landroid/content/Context;Landroid/graphics/Canvas;IZZZILjava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "bubbleDrawer"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setMessage(Lio/getstream/chat/android/models/Message;ZLc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Z",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commitCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isMyMessage:Z

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->hasSingleReaction(Lio/getstream/chat/android/models/Message;)Z

    move-result p2

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->isSingleReaction:Z

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionsAdapter:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->createReactionItems(Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p1

    new-instance v0, La8/c;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, p0, p3}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, p1, v0}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string p1, "reactionsAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V
    .locals 1

    const-string v0, "reactionClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    return-void
.end method
