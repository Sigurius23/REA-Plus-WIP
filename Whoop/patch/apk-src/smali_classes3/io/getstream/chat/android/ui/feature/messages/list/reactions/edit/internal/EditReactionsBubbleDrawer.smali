.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019JM\u0010#\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u0014\u0010&\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\'R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010)R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010)R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010*R\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "editReactionsViewStyle",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/graphics/Paint;",
        "paint",
        "Ll83/a0;",
        "drawBubbleRoundRect",
        "(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V",
        "",
        "isRtl",
        "",
        "bubbleTailPosition",
        "drawLargeTailBubble",
        "(Landroid/graphics/Canvas;Landroid/graphics/Paint;ZF)V",
        "isMyMessage",
        "offset",
        "parseOffset",
        "(ZZF)F",
        "drawSmallTailBubble",
        "largeTailBubbleInitialPosition",
        "()F",
        "Landroid/content/Context;",
        "context",
        "",
        "bubbleWidth",
        "bubbleHeight",
        "isSingleReaction",
        "messageAnchorPosition",
        "Li93/j;",
        "canvasBounds",
        "drawReactionsBubble",
        "(Landroid/content/Context;Landroid/graphics/Canvas;IIZZFLi93/j;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "bubblePaintMine",
        "Landroid/graphics/Paint;",
        "bubblePaintTheirs",
        "I",
        "Z",
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
.field private bubbleHeight:I

.field private final bubblePaintMine:Landroid/graphics/Paint;

.field private final bubblePaintTheirs:Landroid/graphics/Paint;

.field private bubbleWidth:I

.field private final editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

.field private isMyMessage:Z

.field private isSingleReaction:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V
    .locals 3

    const-string v0, "editReactionsViewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getBubbleColorMine()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubblePaintMine:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getBubbleColorTheirs()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubblePaintTheirs:Landroid/graphics/Paint;

    return-void
.end method

.method private final drawBubbleRoundRect(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 9

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubbleWidth:I

    int-to-float v4, v0

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubbleHeight:I

    int-to-float v5, v0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getBubbleRadius()I

    move-result v0

    int-to-float v6, v0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getBubbleRadius()I

    move-result v0

    int-to-float v7, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final drawLargeTailBubble(Landroid/graphics/Canvas;Landroid/graphics/Paint;ZF)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getLargeTailBubbleOffset()I

    move-result v0

    int-to-float v0, v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->isMyMessage:Z

    invoke-direct {p0, p3, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->parseOffset(ZZF)F

    move-result p3

    add-float/2addr p3, p4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->largeTailBubbleInitialPosition()F

    move-result p4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getLargeTailBubbleCyOffset()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p4, v0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getLargeTailBubbleRadius()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, p3, p4, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final drawSmallTailBubble(Landroid/graphics/Canvas;Landroid/graphics/Paint;ZF)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getSmallTailBubbleOffset()I

    move-result v0

    int-to-float v0, v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->isMyMessage:Z

    invoke-direct {p0, p3, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->parseOffset(ZZF)F

    move-result p3

    add-float/2addr p3, p4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->largeTailBubbleInitialPosition()F

    move-result p4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getLargeTailBubbleRadius()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p4, v0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getSmallTailBubbleCyOffset()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p4, v0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->editReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;->getSmallTailBubbleRadius()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, p3, p4, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private final largeTailBubbleInitialPosition()F
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubbleHeight:I

    int-to-float v0, v0

    const/4 v1, 0x2

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    return v0
.end method

.method private final parseOffset(ZZF)F
    .locals 0

    if-eqz p2, :cond_0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    neg-float p1, p3

    return p1

    :cond_1
    if-nez p2, :cond_2

    if-nez p1, :cond_2

    neg-float p1, p3

    return p1

    :cond_2
    :goto_0
    return p3
.end method


# virtual methods
.method public final drawReactionsBubble(Landroid/content/Context;Landroid/graphics/Canvas;IIZZFLi93/j;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canvasBounds"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubbleWidth:I

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubbleHeight:I

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->isMyMessage:Z

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->isSingleReaction:Z

    if-eqz p5, :cond_0

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubblePaintMine:Landroid/graphics/Paint;

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->bubblePaintTheirs:Landroid/graphics/Paint;

    :goto_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    iget p4, p8, Li93/h;->w:I

    iget p5, p8, Li93/h;->x:I

    float-to-int p6, p7

    if-gt p4, p6, :cond_1

    if-gt p6, p5, :cond_1

    goto :goto_1

    :cond_1
    int-to-float p6, p5

    cmpl-float p6, p7, p6

    if-lez p6, :cond_2

    move p4, p5

    :cond_2
    int-to-float p7, p4

    :goto_1
    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->drawBubbleRoundRect(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    invoke-direct {p0, p2, p3, p1, p7}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->drawLargeTailBubble(Landroid/graphics/Canvas;Landroid/graphics/Paint;ZF)V

    invoke-direct {p0, p2, p3, p1, p7}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;->drawSmallTailBubble(Landroid/graphics/Canvas;Landroid/graphics/Paint;ZF)V

    return-void
.end method
