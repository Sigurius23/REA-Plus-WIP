.class public final Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00082\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J!\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u00082\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J!\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00082\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J!\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u0019\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001d\u0010\u0012J!\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J\r\u0010 \u001a\u00020\u000b\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u0016\u0010\u0011\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010$R\u0016\u0010\u0014\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010$R\u0016\u0010\u0016\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010$R\u0016\u0010\u0018\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010$R\u0016\u0010\u0019\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010%R\u0016\u0010\u001d\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010$R\u0016\u0010\u001e\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;",
        "",
        "Landroid/content/res/TypedArray;",
        "attributes",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/res/TypedArray;Landroid/content/Context;)V",
        "",
        "nullIfNotSet",
        "(I)Ljava/lang/Integer;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Ll83/a0;",
        "checkMessageMaxWidthFactorsRange",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "messageBackgroundColorMineStyleableId",
        "defaultValue",
        "messageBackgroundColorMine",
        "(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;",
        "messageBackgroundColorTheirsId",
        "messageBackgroundColorTheirs",
        "messageLinkTextColorMineId",
        "messageLinkTextColorMine",
        "messageLinkTextColorTheirsId",
        "messageLinkTextColorTheirs",
        "reactionsEnabled",
        "",
        "(IZ)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;",
        "maxLines",
        "linkDescriptionMaxLines",
        "systemMessageGravity",
        "defaultGravity",
        "build",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Landroid/content/res/TypedArray;",
        "Landroid/content/Context;",
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
.field private final attributes:Landroid/content/res/TypedArray;

.field private final context:Landroid/content/Context;

.field private linkDescriptionMaxLines:I

.field private messageBackgroundColorMine:I

.field private messageBackgroundColorTheirs:I

.field private messageLinkTextColorMine:I

.field private messageLinkTextColorTheirs:I

.field private reactionsEnabled:Z

.field private systemMessageGravity:I


# direct methods
.method public constructor <init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V
    .locals 1

    const-string v0, "attributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    const p1, 0x7fffffff

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorMine:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorTheirs:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorMine:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorTheirs:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->reactionsEnabled:Z

    const/4 p1, 0x5

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->linkDescriptionMaxLines:I

    const/16 p1, 0x11

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->systemMessageGravity:I

    return-void
.end method

.method private final checkMessageMaxWidthFactorsRange(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 6

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageMaxWidthFactorMine()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    cmpg-double v4, v2, v0

    if-gtz v4, :cond_1

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageMaxWidthFactorTheirs()F

    move-result v0

    float-to-double v0, v0

    cmpg-double v2, v2, v0

    if-gtz v2, :cond_0

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageMaxWidthFactorTheirs()F

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "messageMaxWidthFactorTheirs cannot be lower than 0.75 and greater than 1! Current value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageMaxWidthFactorMine()F

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "messageMaxWidthFactorMine cannot be lower than 0.75 and greater than 1! Current value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic linkDescriptionMaxLines$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x5

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->linkDescriptionMaxLines(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method

.method public static synthetic messageBackgroundColorMine$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x7fffffff

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorMine(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method

.method public static synthetic messageBackgroundColorTheirs$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x7fffffff

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorTheirs(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method

.method public static synthetic messageLinkTextColorMine$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x7fffffff

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorMine(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method

.method public static synthetic messageLinkTextColorTheirs$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x7fffffff

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorTheirs(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method

.method private final nullIfNotSet(I)Ljava/lang/Integer;
    .locals 1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic reactionsEnabled$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->reactionsEnabled(IZ)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method

.method public static synthetic systemMessageGravity$default(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/16 p2, 0x11

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->systemMessageGravity(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;

    return-object p0
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
    .locals 57

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageLinkBackgroundColorMine:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget-object v4, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_LINK_BACKGROUND_COLOR$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageLinkBackgroundColorTheirs:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_LINK_BACKGROUND_COLOR$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v11

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/common/R$font;->stream_roboto_medium:I

    invoke-static {v1, v2}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v3, Lio/getstream/chat/android/ui/common/R$font;->stream_roboto_bold:I

    invoke-static {v2, v3}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    :cond_1
    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeMine:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v7

    invoke-static {v6, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorMine:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v7

    invoke-static {v6, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsMine:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontMine:I

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v5, v6, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleMine:I

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v13

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeTheirs:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorTheirs:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsTheirs:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontTheirs:I

    invoke-virtual {v3, v5, v7, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleTheirs:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v14

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeUserName:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_USER_NAME$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorUserName:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_USER_NAME$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsUserName:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontUserName:I

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleUserName:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v15

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeDate:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_DATE$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorDate:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_DATE$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsDate:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontDate:I

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleDate:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v16

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeLanguage:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_DATE$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorLanguage:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_DATE$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsLanguage:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontLanguage:I

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleLanguage:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v17

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeThreadCounter:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_THREAD_COUNTER$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorThreadCounter:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_THREAD_COUNTER$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsThreadCounter:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontThreadCounter:I

    invoke-virtual {v3, v5, v7, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleThreadCounter:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v18

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeReadCounter:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_READ_COUNTER$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorReadCounter:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_READ_COUNTER$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsReadCounter:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontReadCounter:I

    invoke-virtual {v3, v5, v7, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleReadCounter:I

    invoke-virtual {v3, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v19

    new-instance v3, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeThreadSeparator:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_THREAD_COUNTER$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorThreadSeparator:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_THREAD_COUNTER$cp()I

    move-result v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsThreadSeparator:I

    sget v7, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontThreadSeparator:I

    invoke-virtual {v3, v5, v7, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleThreadSeparator:I

    invoke-virtual {v3, v1, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v20

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeLinkTitle:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v7

    invoke-static {v5, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorLinkTitle:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR$cp()I

    move-result v7

    invoke-static {v5, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v3, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsLinkTitle:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontLinkTitle:I

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3, v5, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(IILandroid/graphics/Typeface;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleLinkTitle:I

    invoke-virtual {v1, v2, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v22

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeLinkDescription:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_LINK_DESCRIPTION$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorLinkDescription:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_LINK_DESCRIPTION$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsLinkDescription:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontLinkDescription:I

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleLinkDescription:I

    invoke-virtual {v1, v2, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v23

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeLinkLabel:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_LINK_DESCRIPTION$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorLinkLabel:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_LINK_DESCRIPTION$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsLinkLabel:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontLinkLabel:I

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleLinkLabel:I

    invoke-virtual {v1, v2, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v21

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiDateSeparatorBackgroundColor:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_overlay_dark:I

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v24

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeDateSeparator:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE_DATE_SEPARATOR$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorDateSeparator:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_COLOR_DATE_SEPARATOR$cp()I

    move-result v5

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsDateSeparator:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontDateSeparator:I

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleDateSeparator:I

    invoke-virtual {v1, v2, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v25

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;-><init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReactionsBubbleBorderColorMine:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->bubbleBorderColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReactionsBubbleBorderColorTheirs:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->bubbleBorderColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReactionsBubbleBorderWidthMine:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->bubbleBorderWidthMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReactionsBubbleBorderWidthTheirs:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->bubbleBorderWidthTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReactionsBubbleColorMine:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->bubbleColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageReactionsBubbleColorTheirs:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->bubbleColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageOptionsReactionSorting:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->messageOptionsReactionSorting(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle$Companion$Builder;->build()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    move-result-object v26

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;-><init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiEditReactionsBubbleColorMine:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiEditReactionsBubbleColorTheirs:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiEditReactionsColumns:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->reactionsColumns(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->build()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    move-result-object v27

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiShowMessageDeliveryStatusIndicator:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v50

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconIndicatorSent:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_check_single:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v28, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconIndicatorDelivered:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_check_double_grey:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v29, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconIndicatorRead:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_4

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_check_double:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v30, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconIndicatorPendingSync:I

    invoke-static {v1, v2, v5}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_5

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_clock:I

    invoke-static {v1, v2}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v31, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconOnlyVisibleToYou:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_6

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_icon_eye_off:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v32, v1

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeMessageDeleted:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getDEFAULT_TEXT_SIZE$cp()I

    move-result v7

    invoke-static {v5, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorMessageDeleted:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v5, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsMessageDeleted:I

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontMessageDeleted:I

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleMessageDeleted:I

    const/4 v5, 0x2

    invoke-virtual {v1, v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiDeletedMessageBackgroundColorMine:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v8, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v34

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeMessageDeletedMine:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getSize()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorMessageDeletedMine:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getColor()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsMessageDeletedMine:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getFontAssetsPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->fontAssetsPath(ILjava/lang/String;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontMessageDeletedMine:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getFontResource()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->fontResource(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleMessageDeletedMine:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getStyle()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v33

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiDeletedMessageBackgroundColorTheirs:I

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v8, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {v7, v8}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v36

    new-instance v2, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v2, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextSizeMessageDeletedTheirs:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getSize()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextColorMessageDeletedTheirs:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getColor()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontAssetsMessageDeletedTheirs:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getFontAssetsPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->fontAssetsPath(ILjava/lang/String;)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextFontMessageDeletedTheirs:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getFontResource()I

    move-result v7

    invoke-virtual {v2, v5, v7}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->fontResource(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageTextStyleMessageDeletedTheirs:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->getStyle()I

    move-result v1

    invoke-virtual {v2, v5, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v35

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageStrokeColorMine:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getMESSAGE_STROKE_COLOR_MINE$cp()I

    move-result v7

    invoke-static {v5, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v37

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageStrokeWidthMine:I

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v38

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageStrokeColorTheirs:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->access$getMESSAGE_STROKE_COLOR_THEIRS$cp()I

    move-result v7

    invoke-static {v5, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v39

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageStrokeWidthTheirs:I

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;->getMESSAGE_STROKE_WIDTH_THEIRS$stream_chat_android_ui_components_release()F

    move-result v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v40

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiSystemMessageTextSize:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiSystemMessageTextColor:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiSystemMessageTextFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiSystemMessageTextFont:I

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiSystemMessageTextStyle:I

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v41

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiErrorMessageTextSize:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiErrorMessageTextColor:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiErrorMessageTextFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiErrorMessageTextFont:I

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiErrorMessageTextStyle:I

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v42

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageIndicatorTextSize:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageIndicatorTextColor:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageIndicatorTextFontAssets:I

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageIndicatorTextFont:I

    invoke-virtual {v1, v2, v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageIndicatorTextStyle:I

    invoke-virtual {v1, v2, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v43

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageIndicatorIcon:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_pin:I

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v44, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiPinnedMessageBackgroundColor:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_highlight:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v45

    iget-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageStartMargin:I

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_viewholder_avatar_missing_margin:I

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v4, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageEndMargin:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_viewholder_avatar_missing_margin:I

    invoke-static {v5, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    float-to-int v2, v2

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageMaxWidthFactorMine:I

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-virtual {v4, v5, v3, v3, v6}, Landroid/content/res/TypedArray;->getFraction(IIIF)F

    move-result v48

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageMaxWidthFactorTheirs:I

    invoke-virtual {v4, v5, v3, v3, v6}, Landroid/content/res/TypedArray;->getFraction(IIIF)F

    move-result v49

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconFailedIndicator:I

    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_8

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_warning:I

    invoke-static {v4, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v51, v4

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiIconBannedIndicator:I

    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_9

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_warning:I

    invoke-static {v4, v5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v52, v4

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiMessageListLoadingMoreView:I

    sget v6, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_list_loading_more_view:I

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v54

    iget-object v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadSeparatorBackgroundColor:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_unread_label_background_color:I

    invoke-static {v6, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v55

    new-instance v4, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadSeparatorTextSize:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v7, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {v6, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadSeparatorTextColor:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->context:Landroid/content/Context;

    sget v7, Lio/getstream/chat/android/ui/R$color;->stream_ui_unread_label_text_color:I

    invoke-static {v6, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadSeparatorTextFontAssets:I

    sget v6, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadSeparatorTextFont:I

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v5, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadSeparatorTextStyle:I

    invoke-virtual {v4, v5, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v56

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorMine:I

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->nullIfNotSet(I)Ljava/lang/Integer;

    move-result-object v6

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorTheirs:I

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->nullIfNotSet(I)Ljava/lang/Integer;

    move-result-object v7

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorMine:I

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->nullIfNotSet(I)Ljava/lang/Integer;

    move-result-object v8

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorTheirs:I

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->nullIfNotSet(I)Ljava/lang/Integer;

    move-result-object v9

    iget v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->linkDescriptionMaxLines:I

    iget v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->systemMessageGravity:I

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move/from16 v46, v1

    move/from16 v47, v2

    move/from16 v53, v3

    invoke-direct/range {v5 .. v56}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getMessageListItemStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v1

    invoke-interface {v1, v5}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->checkMessageMaxWidthFactorsRange(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    return-object v1
.end method

.method public final linkDescriptionMaxLines(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->linkDescriptionMaxLines:I

    return-object p0
.end method

.method public final messageBackgroundColorMine(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorMine:I

    return-object p0
.end method

.method public final messageBackgroundColorTheirs(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageBackgroundColorTheirs:I

    return-object p0
.end method

.method public final messageLinkTextColorMine(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorMine:I

    return-object p0
.end method

.method public final messageLinkTextColorTheirs(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->messageLinkTextColorTheirs:I

    return-object p0
.end method

.method public final reactionsEnabled(IZ)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->reactionsEnabled:Z

    return-object p0
.end method

.method public final systemMessageGravity(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->attributes:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;->systemMessageGravity:I

    return-object p0
.end method
