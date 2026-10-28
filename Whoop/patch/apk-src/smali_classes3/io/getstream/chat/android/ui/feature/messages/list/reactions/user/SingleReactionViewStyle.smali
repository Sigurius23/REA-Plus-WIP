.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u00086\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 E2\u00020\u0001:\u0001EB\u00a9\u0001\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0008H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u00b2\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0003\u0010\r\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\u0008\u0010@\u001a\u0004\u0018\u00010AH\u00d6\u0003J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\t\u0010C\u001a\u00020DH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0017R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u0017\u00a8\u0006F"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "bubbleBorderColorMine",
        "",
        "bubbleBorderColorTheirs",
        "bubbleColorMine",
        "bubbleColorTheirs",
        "bubbleBorderWidthMine",
        "",
        "bubbleBorderWidthTheirs",
        "totalHeight",
        "bubbleHeight",
        "bubbleRadius",
        "largeTailBubbleCy",
        "largeTailBubbleRadius",
        "largeTailBubbleOffset",
        "smallTailBubbleCy",
        "smallTailBubbleRadius",
        "smallTailBubbleOffset",
        "reactionOrientation",
        "<init>",
        "(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)V",
        "getBubbleBorderColorMine",
        "()I",
        "getBubbleBorderColorTheirs",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getBubbleColorMine",
        "getBubbleColorTheirs",
        "getBubbleBorderWidthMine",
        "()F",
        "getBubbleBorderWidthTheirs",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getTotalHeight",
        "getBubbleHeight",
        "getBubbleRadius",
        "getLargeTailBubbleCy",
        "getLargeTailBubbleRadius",
        "getLargeTailBubbleOffset",
        "getSmallTailBubbleCy",
        "getSmallTailBubbleRadius",
        "getSmallTailBubbleOffset",
        "getReactionOrientation",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;

.field private static final DEFAULT_BUBBLE_BORDER_COLOR_MINE:I

.field private static final DEFAULT_BUBBLE_BORDER_WIDTH_MINE:F

.field private static final DEFAULT_BUBBLE_COLOR_MINE:I

.field private static final DEFAULT_BUBBLE_COLOR_THEIRS:I


# instance fields
.field private final bubbleBorderColorMine:I

.field private final bubbleBorderColorTheirs:Ljava/lang/Integer;

.field private final bubbleBorderWidthMine:F

.field private final bubbleBorderWidthTheirs:Ljava/lang/Float;

.field private final bubbleColorMine:I

.field private final bubbleColorTheirs:I

.field private final bubbleHeight:I

.field private final bubbleRadius:I

.field private final largeTailBubbleCy:I

.field private final largeTailBubbleOffset:I

.field private final largeTailBubbleRadius:I

.field private final reactionOrientation:I

.field private final smallTailBubbleCy:I

.field private final smallTailBubbleOffset:I

.field private final smallTailBubbleRadius:I

.field private final totalHeight:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle$Companion;

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_BORDER_COLOR_MINE:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_COLOR_MINE:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_gainsboro:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_COLOR_THEIRS:I

    const/4 v0, 0x1

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_BORDER_WIDTH_MINE:F

    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    iput p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    iput p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    iput p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    iput p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    iput p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    iput p11, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    iput p12, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    iput p13, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    iput p14, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    iput p15, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    move/from16 p1, p16

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    return-void
.end method

.method public static final synthetic access$getDEFAULT_BUBBLE_BORDER_COLOR_MINE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_BORDER_COLOR_MINE:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_BUBBLE_BORDER_WIDTH_MINE$cp()F
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_BORDER_WIDTH_MINE:F

    return v0
.end method

.method public static final synthetic access$getDEFAULT_BUBBLE_COLOR_MINE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_COLOR_MINE:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_BUBBLE_COLOR_THEIRS$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->DEFAULT_BUBBLE_COLOR_THEIRS:I

    return v0
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIIIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    move-object/from16 p0, v0

    move/from16 p16, v1

    move/from16 p15, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    invoke-direct/range {p0 .. p16}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;-><init>(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)V

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    return v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    return v0
.end method

.method public final component6()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    return v0
.end method

.method public final copy(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;
    .locals 17

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;-><init>(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    iget p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getBubbleBorderColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    return v0
.end method

.method public final getBubbleBorderColorTheirs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBubbleBorderWidthMine()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    return v0
.end method

.method public final getBubbleBorderWidthTheirs()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    return-object v0
.end method

.method public final getBubbleColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    return v0
.end method

.method public final getBubbleColorTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    return v0
.end method

.method public final getBubbleHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    return v0
.end method

.method public final getBubbleRadius()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    return v0
.end method

.method public final getLargeTailBubbleCy()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    return v0
.end method

.method public final getLargeTailBubbleOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    return v0
.end method

.method public final getLargeTailBubbleRadius()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    return v0
.end method

.method public final getReactionOrientation()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    return v0
.end method

.method public final getSmallTailBubbleCy()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    return v0
.end method

.method public final getSmallTailBubbleOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    return v0
.end method

.method public final getSmallTailBubbleRadius()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    return v0
.end method

.method public final getTotalHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorMine:I

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderColorTheirs:Ljava/lang/Integer;

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorMine:I

    iget v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleColorTheirs:I

    iget v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthMine:F

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleBorderWidthTheirs:Ljava/lang/Float;

    iget v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->totalHeight:I

    iget v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleHeight:I

    iget v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->bubbleRadius:I

    iget v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleCy:I

    iget v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleRadius:I

    iget v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->largeTailBubbleOffset:I

    iget v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleCy:I

    iget v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleRadius:I

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->smallTailBubbleOffset:I

    move/from16 v16, v15

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;->reactionOrientation:I

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v17, v15

    const-string v15, "SingleReactionViewStyle(bubbleBorderColorMine="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bubbleBorderColorTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bubbleColorMine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bubbleColorTheirs="

    const-string v2, ", bubbleBorderWidthMine="

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bubbleBorderWidthTheirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bubbleHeight="

    const-string v2, ", bubbleRadius="

    invoke-static {v0, v7, v1, v8, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", largeTailBubbleCy="

    const-string v2, ", largeTailBubbleRadius="

    invoke-static {v0, v9, v1, v10, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", largeTailBubbleOffset="

    const-string v2, ", smallTailBubbleCy="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", smallTailBubbleRadius="

    const-string v2, ", smallTailBubbleOffset="

    invoke-static {v0, v13, v1, v14, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", reactionOrientation="

    const-string v2, ")"

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
