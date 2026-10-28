.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J?\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0008\u0008\u0002\u0010 \u001a\u00020\u0006\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\'R\u001b\u0010.\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010/R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u00100R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u00100\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "viewReactionsViewStyle",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V",
        "",
        "shouldDrawTheirsBorder",
        "()Z",
        "Landroid/graphics/Path;",
        "createBubbleRoundRectPath",
        "()Landroid/graphics/Path;",
        "",
        "getStrokeOffset",
        "()F",
        "isRtl",
        "createLargeTailBubblePath",
        "(Z)Landroid/graphics/Path;",
        "createSmallTailBubblePath",
        "bubbleOffset",
        "calculateBubbleCenterX",
        "(F)F",
        "positionBubble",
        "(ZF)F",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/Canvas;",
        "canvas",
        "",
        "bubbleWidth",
        "isMyMessage",
        "isSingleReaction",
        "inverseBubbleStyle",
        "Ll83/a0;",
        "drawReactionsBubble",
        "(Landroid/content/Context;Landroid/graphics/Canvas;IZZZ)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "Landroid/graphics/Paint;",
        "bubblePaintTheirs",
        "Landroid/graphics/Paint;",
        "bubblePaintMine",
        "bubbleStrokePaintMine",
        "bubbleStrokePaintTheirs$delegate",
        "Ll83/h;",
        "getBubbleStrokePaintTheirs",
        "()Landroid/graphics/Paint;",
        "bubbleStrokePaintTheirs",
        "I",
        "Z",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer$Companion;

.field private static final MULTIPLE_REACTIONS_BASELINE_OFFSET:I


# instance fields
.field private final bubblePaintMine:Landroid/graphics/Paint;

.field private final bubblePaintTheirs:Landroid/graphics/Paint;

.field private final bubbleStrokePaintMine:Landroid/graphics/Paint;

.field private final bubbleStrokePaintTheirs$delegate:Ll83/h;

.field private bubbleWidth:I

.field private isMyMessage:Z

.field private isSingleReaction:Z

.field private final viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer$Companion;

    const/16 v0, 0x20

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->MULTIPLE_REACTIONS_BASELINE_OFFSET:I

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V
    .locals 4

    const-string v0, "viewReactionsViewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleColorTheirs()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubblePaintTheirs:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleColorMine()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubblePaintMine:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderColorMine()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthMine()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleStrokePaintMine:Landroid/graphics/Paint;

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/4 v0, 0x6

    invoke-direct {p1, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleStrokePaintTheirs$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;)Landroid/graphics/Paint;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleStrokePaintTheirs_delegate$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;)Landroid/graphics/Paint;

    move-result-object p0

    return-object p0
.end method

.method private static final bubbleStrokePaintTheirs_delegate$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;)Landroid/graphics/Paint;
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->shouldDrawTheirsBorder()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderColorTheirs()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthTheirs()Ljava/lang/Float;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object p0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You need to specify either bubbleBorderColorTheirs and bubbleBorderWidthTheirs to draw a border for another user reaction bubble"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final calculateBubbleCenterX(F)F
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->isMyMessage:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->isSingleReaction:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleWidth:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v0, p1

    return v0

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleWidth:I

    int-to-float v0, v0

    add-float/2addr v0, p1

    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->MULTIPLE_REACTIONS_BASELINE_OFFSET:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    return v0

    :cond_1
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->isSingleReaction:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleWidth:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    sub-float/2addr v0, p1

    return v0

    :cond_2
    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->MULTIPLE_REACTIONS_BASELINE_OFFSET:I

    int-to-float v0, v0

    sub-float/2addr v0, p1

    return v0
.end method

.method private final createBubbleRoundRectPath()Landroid/graphics/Path;
    .locals 8

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->getStrokeOffset()F

    move-result v1

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleWidth:I

    int-to-float v2, v2

    sub-float v3, v2, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleHeight()I

    move-result v2

    int-to-float v4, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleRadius()I

    move-result v2

    int-to-float v5, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleRadius()I

    move-result v2

    int-to-float v6, v2

    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move v2, v1

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    return-object v0
.end method

.method private final createLargeTailBubblePath(Z)Landroid/graphics/Path;
    .locals 4

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getLargeTailBubbleOffset()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->positionBubble(ZF)F

    move-result p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getLargeTailBubbleCy()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getLargeTailBubbleRadius()I

    move-result v2

    int-to-float v2, v2

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    return-object v0
.end method

.method private final createSmallTailBubblePath(Z)Landroid/graphics/Path;
    .locals 4

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getSmallTailBubbleOffset()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->positionBubble(ZF)F

    move-result p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getSmallTailBubbleCy()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getSmallTailBubbleRadius()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->getStrokeOffset()F

    move-result v3

    sub-float/2addr v2, v3

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    return-object v0
.end method

.method public static synthetic drawReactionsBubble$default(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;Landroid/content/Context;Landroid/graphics/Canvas;IZZZILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->drawReactionsBubble(Landroid/content/Context;Landroid/graphics/Canvas;IZZZ)V

    return-void
.end method

.method private final getBubbleStrokePaintTheirs()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleStrokePaintTheirs$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Paint;

    return-object v0
.end method

.method private final getStrokeOffset()F
    .locals 2

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->isMyMessage:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthMine()F

    move-result v0

    :goto_0
    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->shouldDrawTheirsBorder()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthTheirs()Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private final positionBubble(ZF)F
    .locals 0

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->calculateBubbleCenterX(F)F

    move-result p2

    if-eqz p1, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleWidth:I

    int-to-float p1, p1

    sub-float/2addr p1, p2

    return p1

    :cond_0
    return p2
.end method

.method private final shouldDrawTheirsBorder()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderColorTheirs()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->viewReactionsViewStyle:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthTheirs()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final drawReactionsBubble(Landroid/content/Context;Landroid/graphics/Canvas;IZZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->isMyMessage:Z

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleWidth:I

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->isSingleReaction:Z

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->createBubbleRoundRectPath()Landroid/graphics/Path;

    move-result-object p5

    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {p3, p5, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->createLargeTailBubblePath(Z)Landroid/graphics/Path;

    move-result-object p5

    invoke-virtual {p3, p5, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->createSmallTailBubblePath(Z)Landroid/graphics/Path;

    move-result-object p1

    invoke-virtual {p3, p1, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    if-eqz p6, :cond_1

    if-nez p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :cond_1
    :goto_0
    if-eqz p4, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubblePaintMine:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubbleStrokePaintMine:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->bubblePaintTheirs:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->shouldDrawTheirsBorder()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsBubbleDrawer;->getBubbleStrokePaintTheirs()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_3
    return-void
.end method
