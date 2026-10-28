.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008/\u00100J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u00082\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\u00a8\u0006;"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "rootConstraintLayout",
        "Landroid/view/View;",
        "contentView",
        "reactionsSpace",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;",
        "reactionsView",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "data",
        "Ll83/a0;",
        "setupReactionsView",
        "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "",
        "calculateDynamicOffset",
        "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)I",
        "dynamicOffset",
        "updateOffset",
        "(Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;I)V",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$Companion;

.field private static final MULTIPLE_REACTIONS_OFFSET:I

.field private static final SINGLE_REACTION_OFFSET:I


# instance fields
.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

.field private final type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$Companion;

    const/16 v0, 0x8

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->SINGLE_REACTION_OFFSET:I

    const/16 v0, 0x1a

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->MULTIPLE_REACTIONS_OFFSET:I

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;->REACTIONS:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;

    return-void
.end method

.method public static synthetic a(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView$lambda$11(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$calculateDynamicOffset(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)I
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->calculateDynamicOffset(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$updateOffset(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->updateOffset(Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;I)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Landroid/view/View;Landroidx/constraintlayout/widget/p;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView$lambda$11$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Landroid/view/View;Landroidx/constraintlayout/widget/p;)Ll83/a0;

    return-void
.end method

.method private final calculateDynamicOffset(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)I
    .locals 3

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p2, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    move-result v2

    add-int/2addr v2, v1

    sub-int/2addr v0, v2

    invoke-virtual {p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int p2, v1, p2

    :goto_0
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    if-le p3, p1, :cond_1

    sub-int/2addr p3, v0

    return p3

    :cond_1
    invoke-virtual {p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->hasSingleReaction(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->SINGLE_REACTION_OFFSET:I

    return p1

    :cond_2
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->MULTIPLE_REACTIONS_OFFSET:I

    return p1
.end method

.method private final setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 10

    invoke-virtual {p5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->hasReactions(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getReactionsViewStyle()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;

    move-result-object v0

    invoke-virtual {p4, v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->applyStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)V

    invoke-virtual {p5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {p5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    new-instance v2, La81/l;

    const/4 v9, 0x5

    move-object v8, p0

    move-object v3, p1

    move-object v7, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v2 .. v9}, La81/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setMessage(Lio/getstream/chat/android/models/Message;ZLc93/a;)V

    return-void

    :cond_0
    move-object v4, p3

    move-object v5, p4

    const/16 p1, 0x8

    invoke-virtual {v5, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final setupReactionsView$lambda$11(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;)Ll83/a0;
    .locals 10

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1, p2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->updateConstraints(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    if-eqz v0, :cond_3

    check-cast v0, Landroidx/constraintlayout/widget/d;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p4}, Landroid/view/View;->getId()I

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/d;->v:I

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getId()I

    move-result v2

    iput v2, v0, Landroidx/constraintlayout/widget/d;->t:I

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Landroidx/constraintlayout/widget/d;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    iput v1, v0, Landroidx/constraintlayout/widget/d;->s:I

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    iput v1, v0, Landroidx/constraintlayout/widget/d;->u:I

    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;

    move-object v6, p1

    move-object v5, p0

    move-object v3, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    move-object v4, p5

    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1;-><init>(Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;)V

    invoke-static {v3, v2}, Lh5/w;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final setupReactionsView$lambda$11$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Landroid/view/View;Landroidx/constraintlayout/widget/p;)Ll83/a0;
    .locals 2

    const-string v0, "$this$updateConstraints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p2, v0, v1}, Landroidx/constraintlayout/widget/p;->c(II)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    const/4 v0, 0x7

    invoke-virtual {p2, p0, v0}, Landroidx/constraintlayout/widget/p;->c(II)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p0

    invoke-virtual {p2, p0, v1}, Landroidx/constraintlayout/widget/p;->c(II)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p0

    invoke-virtual {p2, p0, v0}, Landroidx/constraintlayout/widget/p;->c(II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final updateOffset(Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;I)V
    .locals 1

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroidx/constraintlayout/widget/d;

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, v0, Landroidx/constraintlayout/widget/d;->v:I

    invoke-virtual {v0, p4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, v0, Landroidx/constraintlayout/widget/d;->t:I

    invoke-virtual {v0, p4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final decorateCustomAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

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
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateGiphyAttachmentMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

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
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateMediaAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decoratePlainTextMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decoratePollMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 6

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->reactionsSpace:Landroid/widget/Space;

    const-string v0, "reactionsSpace"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    const-string p1, "reactionsView"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->setupReactionsView(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final getType()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;

    return-object v0
.end method
