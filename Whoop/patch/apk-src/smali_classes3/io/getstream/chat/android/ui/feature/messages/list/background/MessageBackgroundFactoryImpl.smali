.class public Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u000cJ\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000cJ\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000cJ\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u000cJ\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u000cJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u000cJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u000cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;",
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "data",
        "Landroid/graphics/drawable/Drawable;",
        "defaultBackground",
        "(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;",
        "",
        "radius",
        "bottomEndCorner",
        "",
        "isMine",
        "isBottomPosition",
        "Lkr/k;",
        "shapeAppearanceModel",
        "(Landroid/content/Context;FFZZ)Lkr/k;",
        "plainTextMessageBackground",
        "pollMessageBackground",
        "imageAttachmentMessageBackground",
        "deletedMessageBackground",
        "textAndAttachmentMessageBackground",
        "fileAttachmentsMessageBackground",
        "linkAttachmentMessageBackground",
        "giphyAppearanceModel",
        "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl$Companion;

.field private static final DEFAULT_CORNER_RADIUS:F

.field private static final MESSAGE_CURRENT_USER_BACKGROUND:I

.field private static final MESSAGE_OTHER_USER_BACKGROUND:I

.field private static final SMALL_CARD_VIEW_CORNER_RADIUS:F


# instance fields
.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl$Companion;

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->MESSAGE_OTHER_USER_BACKGROUND:I

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_gainsboro:I

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->MESSAGE_CURRENT_USER_BACKGROUND:I

    const/4 v0, 0x2

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->SMALL_CARD_VIEW_CORNER_RADIUS:F

    const/16 v0, 0x10

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->DEFAULT_CORNER_RADIUS:F

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    return-void
.end method

.method public static final synthetic access$getDEFAULT_CORNER_RADIUS$cp()F
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->DEFAULT_CORNER_RADIUS:F

    return v0
.end method

.method private final defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 6

    sget v2, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->DEFAULT_CORNER_RADIUS:F

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result v5

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    const/4 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->create(Landroid/content/Context;FFZZ)Lkr/k;

    move-result-object p1

    new-instance v0, Lkr/g;

    invoke-direct {v0, p1}, Lkr/g;-><init>(Lkr/k;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v2, p1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Lkr/g;->o(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageStrokeColorMine()I

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->r(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageStrokeWidthMine()F

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->s(F)V

    if-eqz v3, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageLinkBackgroundColorMine()I

    move-result p1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageBackgroundColorMine()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_4
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->MESSAGE_CURRENT_USER_BACKGROUND:I

    invoke-static {v1, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_1
    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    return-object v0

    :cond_5
    sget-object p1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Lkr/g;->o(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageStrokeColorTheirs()I

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->r(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageStrokeWidthTheirs()F

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->s(F)V

    if-eqz v3, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageLinkBackgroundColorTheirs()I

    move-result p1

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageBackgroundColorTheirs()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_7
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->MESSAGE_OTHER_USER_BACKGROUND:I

    invoke-static {v1, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_2
    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    return-object v0
.end method

.method private final shapeAppearanceModel(Landroid/content/Context;FFZZ)Lkr/k;
    .locals 6

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->create(Landroid/content/Context;FFZZ)Lkr/k;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final deletedMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->DEFAULT_CORNER_RADIUS:F

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v5

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result v6

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    const/4 v4, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->create(Landroid/content/Context;FFZZ)Lkr/k;

    move-result-object p1

    new-instance v0, Lkr/g;

    invoke-direct {v0, p1}, Lkr/g;-><init>(Lkr/k;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageDeletedBackgroundTheirs()I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getMessageDeletedBackgroundMine()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    return-object v0
.end method

.method public final fileAttachmentsMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final giphyAppearanceModel(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->DEFAULT_CORNER_RADIUS:F

    sget v4, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->SMALL_CARD_VIEW_CORNER_RADIUS:F

    const/4 v6, 0x1

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    const/4 v5, 0x1

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->create(Landroid/content/Context;FFZZ)Lkr/k;

    move-result-object p1

    new-instance v0, Lkr/g;

    invoke-direct {v0, p1}, Lkr/g;-><init>(Lkr/k;)V

    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->MESSAGE_OTHER_USER_BACKGROUND:I

    invoke-static {v2, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    return-object v0
.end method

.method public final imageAttachmentMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final linkAttachmentMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final plainTextMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final pollMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final textAndAttachmentMessageBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;->defaultBackground(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
