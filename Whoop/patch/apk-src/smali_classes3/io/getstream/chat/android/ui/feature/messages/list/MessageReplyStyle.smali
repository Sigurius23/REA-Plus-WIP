.class public final Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008%\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 :2\u00020\u0001:\u0001:B\u0081\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0010H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0003\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u0010H\u00c6\u0001J\u0013\u00104\u001a\u00020\u00032\u0008\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u00020\u0005H\u00d6\u0001J\t\u00108\u001a\u000209H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0011\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#\u00a8\u0006;"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "showUserAvatar",
        "",
        "messageBackgroundColorMine",
        "",
        "messageBackgroundColorTheirs",
        "linkBackgroundColorMine",
        "linkBackgroundColorTheirs",
        "textStyleMine",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "textStyleTheirs",
        "linkStyleMine",
        "linkStyleTheirs",
        "messageStrokeColorMine",
        "messageStrokeWidthMine",
        "",
        "messageStrokeColorTheirs",
        "messageStrokeWidthTheirs",
        "<init>",
        "(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)V",
        "getShowUserAvatar",
        "()Z",
        "getMessageBackgroundColorMine",
        "()I",
        "getMessageBackgroundColorTheirs",
        "getLinkBackgroundColorMine",
        "getLinkBackgroundColorTheirs",
        "getTextStyleMine",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "getTextStyleTheirs",
        "getLinkStyleMine",
        "getLinkStyleTheirs",
        "getMessageStrokeColorMine",
        "getMessageStrokeWidthMine",
        "()F",
        "getMessageStrokeColorTheirs",
        "getMessageStrokeWidthTheirs",
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
        "copy",
        "equals",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;

.field private static final DEFAULT_TEXT_COLOR:I

.field private static final DEFAULT_TEXT_SIZE:I

.field public static final DEFAULT_TEXT_STYLE:I = 0x0

.field private static final MESSAGE_STROKE_COLOR_MINE:I

.field private static final MESSAGE_STROKE_COLOR_THEIRS:I

.field public static final MESSAGE_STROKE_WIDTH_MINE:F = 0.0f

.field private static final MESSAGE_STROKE_WIDTH_THEIRS$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private static final VALUE_NOT_SET:I = 0x7fffffff


# instance fields
.field private final linkBackgroundColorMine:I

.field private final linkBackgroundColorTheirs:I

.field private final linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final messageBackgroundColorMine:I

.field private final messageBackgroundColorTheirs:I

.field private final messageStrokeColorMine:I

.field private final messageStrokeColorTheirs:I

.field private final messageStrokeWidthMine:F

.field private final messageStrokeWidthTheirs:F

.field private final showUserAvatar:Z

.field private final textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

.field private final textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->MESSAGE_STROKE_WIDTH_THEIRS$delegate:Ll83/h;

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_primary:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->DEFAULT_TEXT_COLOR:I

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_medium:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->DEFAULT_TEXT_SIZE:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_transparent:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->MESSAGE_STROKE_COLOR_MINE:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->MESSAGE_STROKE_COLOR_THEIRS:I

    return-void
.end method

.method public constructor <init>(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)V
    .locals 1

    const-string v0, "textStyleMine"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleTheirs"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyleMine"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyleTheirs"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    .line 3
    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    .line 4
    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    .line 5
    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    .line 6
    iput p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    .line 11
    iput p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    .line 12
    iput p11, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    .line 13
    iput p12, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    .line 14
    iput p13, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    return-void
.end method

.method public synthetic constructor <init>(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    const/4 v0, 0x1

    and-int/lit8 v1, p14, 0x1

    if-eqz v1, :cond_0

    move v3, v0

    :goto_0
    move-object/from16 v2, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    goto :goto_1

    :cond_0
    move/from16 v3, p1

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v2 .. v15}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;-><init>(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)V

    return-void
.end method

.method private static final MESSAGE_STROKE_WIDTH_THEIRS_delegate$lambda$0()F
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_COLOR$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->DEFAULT_TEXT_COLOR:I

    return v0
.end method

.method public static final synthetic access$getDEFAULT_TEXT_SIZE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->DEFAULT_TEXT_SIZE:I

    return v0
.end method

.method public static final synthetic access$getMESSAGE_STROKE_COLOR_MINE$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->MESSAGE_STROKE_COLOR_MINE:I

    return v0
.end method

.method public static final synthetic access$getMESSAGE_STROKE_COLOR_THEIRS$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->MESSAGE_STROKE_COLOR_THEIRS:I

    return v0
.end method

.method public static final synthetic access$getMESSAGE_STROKE_WIDTH_THEIRS$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->MESSAGE_STROKE_WIDTH_THEIRS$delegate:Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIFILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    goto :goto_0

    :cond_1
    move v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    goto :goto_2

    :cond_3
    move/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    goto :goto_3

    :cond_4
    move/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget v9, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    goto :goto_8

    :cond_9
    move/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget v10, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    goto :goto_9

    :cond_a
    move/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget v11, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    goto :goto_a

    :cond_b
    move/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    move/from16 p15, v0

    :goto_b
    move-object p2, p0

    move p3, p1

    move/from16 p4, v1

    move/from16 p5, v2

    move/from16 p6, v3

    move/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move/from16 p12, v9

    move/from16 p13, v10

    move/from16 p14, v11

    goto :goto_c

    :cond_c
    move/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->copy(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    return v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    return v0
.end method

.method public final component13()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    return v0
.end method

.method public final component6()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component8()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final component9()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;
    .locals 15

    const-string v0, "textStyleMine"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyleTheirs"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyleMine"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyleTheirs"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;-><init>(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    iget p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getLinkBackgroundColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    return v0
.end method

.method public final getLinkBackgroundColorTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    return v0
.end method

.method public final getLinkStyleMine()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getLinkStyleTheirs()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getMessageBackgroundColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    return v0
.end method

.method public final getMessageBackgroundColorTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    return v0
.end method

.method public final getMessageStrokeColorMine()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    return v0
.end method

.method public final getMessageStrokeColorTheirs()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    return v0
.end method

.method public final getMessageStrokeWidthMine()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    return v0
.end method

.method public final getMessageStrokeWidthTheirs()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    return v0
.end method

.method public final getShowUserAvatar()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    return v0
.end method

.method public final getTextStyleMine()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final getTextStyleTheirs()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v2, v0, v1}, Lnh3/a;->c(Lio/getstream/chat/android/ui/font/TextStyle;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->showUserAvatar:Z

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorMine:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageBackgroundColorTheirs:I

    iget v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorMine:I

    iget v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkBackgroundColorTheirs:I

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->textStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v7, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleMine:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->linkStyleTheirs:Lio/getstream/chat/android/ui/font/TextStyle;

    iget v9, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorMine:I

    iget v10, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthMine:F

    iget v11, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeColorTheirs:I

    iget v12, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->messageStrokeWidthTheirs:F

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "MessageReplyStyle(showUserAvatar="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", messageBackgroundColorMine="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", messageBackgroundColorTheirs="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", linkBackgroundColorMine="

    const-string v1, ", linkBackgroundColorTheirs="

    invoke-static {v13, v2, v0, v3, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", textStyleMine="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textStyleTheirs="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", linkStyleMine="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", linkStyleTheirs="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageStrokeColorMine="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", messageStrokeWidthMine="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", messageStrokeColorTheirs="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", messageStrokeWidthTheirs="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v12, v0, v13}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
