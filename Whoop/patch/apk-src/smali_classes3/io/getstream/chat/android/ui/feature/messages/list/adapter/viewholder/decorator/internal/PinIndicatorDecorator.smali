.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010#\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u001f\u0010&\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010)\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "root",
        "Landroid/widget/TextView;",
        "pinIndicatorTextView",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "data",
        "Ll83/a0;",
        "setupPinIndicator",
        "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;",
        "viewHolder",
        "decorateCustomAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;",
        "decorateGiphyAttachmentMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;",
        "decorateFileAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;",
        "decorateMediaAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;",
        "decoratePlainTextMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;",
        "decorateDeletedMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;",
        "decorateGiphyMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;",
        "decorateLinkAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;",
        "decoratePollMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;",
        "type",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;",
        "getType",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;",
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
.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

.field private final type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;->PIN_INDICATOR:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/widget/TextView;Landroidx/constraintlayout/widget/p;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/widget/TextView;Landroidx/constraintlayout/widget/p;)Ll83/a0;

    return-void
.end method

.method private final setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 3

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getPinnedText(Lio/getstream/chat/android/models/Message;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getPinnedMessageIndicatorTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p2, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getPinnedMessageIndicatorIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_pin_indicator_icon_size:I

    invoke-static {p2, v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawableWithSize(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getPinnedMessageBackgroundColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p3, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->updateConstraints(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method private static final setupPinIndicator$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/widget/TextView;Landroidx/constraintlayout/widget/p;)Ll83/a0;
    .locals 1

    const-string v0, "$this$updateConstraints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result p0

    if-eqz p0, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {p2, p1}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object p1

    iget-object p1, p1, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iput p0, p1, Landroidx/constraintlayout/widget/l;->w:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final decorateCustomAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateDeletedMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final decorateFileAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateGiphyAttachmentMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateGiphyMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final decorateLinkAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateMediaAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decoratePlainTextMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decoratePollMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pinIndicatorTextView:Landroid/widget/TextView;

    const-string v1, "pinIndicatorTextView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->setupPinIndicator(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final getType()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;->type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;

    return-object v0
.end method
