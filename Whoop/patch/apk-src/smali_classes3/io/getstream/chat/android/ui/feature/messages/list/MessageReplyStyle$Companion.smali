.class public final Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0013\u001a\u0004\u0008\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u000b8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/content/res/TypedArray;",
        "attributes",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "invoke",
        "(Landroid/content/res/TypedArray;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "",
        "MESSAGE_STROKE_WIDTH_THEIRS$delegate",
        "Ll83/h;",
        "getMESSAGE_STROKE_WIDTH_THEIRS",
        "()F",
        "MESSAGE_STROKE_WIDTH_THEIRS",
        "",
        "DEFAULT_TEXT_COLOR",
        "I",
        "getDEFAULT_TEXT_COLOR$stream_chat_android_ui_components_release",
        "()I",
        "DEFAULT_TEXT_SIZE",
        "getDEFAULT_TEXT_SIZE$stream_chat_android_ui_components_release",
        "MESSAGE_STROKE_COLOR_MINE",
        "getMESSAGE_STROKE_COLOR_MINE$stream_chat_android_ui_components_release",
        "MESSAGE_STROKE_COLOR_THEIRS",
        "getMESSAGE_STROKE_COLOR_THEIRS$stream_chat_android_ui_components_release",
        "VALUE_NOT_SET",
        "DEFAULT_TEXT_STYLE",
        "MESSAGE_STROKE_WIDTH_MINE",
        "F",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getMESSAGE_STROKE_WIDTH_THEIRS()F
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getMESSAGE_STROKE_WIDTH_THEIRS$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method


# virtual methods
.method public final getDEFAULT_TEXT_COLOR$stream_chat_android_ui_components_release()I
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v0

    return v0
.end method

.method public final getDEFAULT_TEXT_SIZE$stream_chat_android_ui_components_release()I
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v0

    return v0
.end method

.method public final getMESSAGE_STROKE_COLOR_MINE$stream_chat_android_ui_components_release()I
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getMESSAGE_STROKE_COLOR_MINE$cp()I

    move-result v0

    return v0
.end method

.method public final getMESSAGE_STROKE_COLOR_THEIRS$stream_chat_android_ui_components_release()I
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getMESSAGE_STROKE_COLOR_THEIRS$cp()I

    move-result v0

    return v0
.end method

.method public final invoke(Landroid/content/res/TypedArray;Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "attributes"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyShowUserAvatar:I

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyBackgroundColorMine:I

    const v3, 0x7fffffff

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyBackgroundColorTheirs:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyLinkBackgroundColorMine:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyLinkBackgroundColorTheirs:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    sget v2, Lio/getstream/chat/android/ui/common/R$font;->stream_roboto_medium:I

    invoke-static {v1, v2}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :cond_0
    new-instance v4, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v10, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextSizeMine:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v11

    invoke-static {v1, v11}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v4, v10, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v10, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextColorMine:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v11

    invoke-static {v1, v11}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v4, v10, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v10, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextFontAssetsMine:I

    sget v11, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextFontMine:I

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v10, v11, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v10, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextStyleMine:I

    const/4 v11, 0x0

    invoke-virtual {v4, v10, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v10

    new-instance v4, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v4, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextSizeTheirs:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v13

    invoke-static {v1, v13}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v4, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextColorTheirs:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v13

    invoke-static {v1, v13}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v4, v12, v13}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v12, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextFontAssetsTheirs:I

    sget v13, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextFontTheirs:I

    invoke-virtual {v4, v12, v13, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyTextStyleTheirs:I

    invoke-virtual {v4, v2, v11}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v11

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyLinkColorTheirs:I

    invoke-virtual {v2, v4, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v13

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyLinkColorMine:I

    invoke-virtual {v2, v4, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v12

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyStrokeColorMine:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getMESSAGE_STROKE_COLOR_MINE$cp()I

    move-result v3

    invoke-static {v1, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v14

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyStrokeWidthMine:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v15

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyStrokeColorTheirs:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->access$getMESSAGE_STROKE_COLOR_THEIRS$cp()I

    move-result v3

    invoke-static {v1, v3}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v16

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReplyStrokeWidthTheirs:I

    invoke-direct/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;->getMESSAGE_STROKE_WIDTH_THEIRS()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v17

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    invoke-direct/range {v4 .. v17}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;-><init>(ZIIIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IFIF)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getMessageReplyStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v4}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    return-object v0
.end method
