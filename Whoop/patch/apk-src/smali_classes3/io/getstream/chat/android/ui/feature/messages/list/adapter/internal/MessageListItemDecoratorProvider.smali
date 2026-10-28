.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R!\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00148VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "dateFormatter",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "messageListViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
        "showAvatarPredicate",
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
        "messageBackgroundFactory",
        "Lkotlin/Function1;",
        "",
        "getLanguageDisplayName",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "",
        "decoratorPredicate",
        "<init>",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "",
        "decorators$delegate",
        "Ll83/h;",
        "getDecorators",
        "()Ljava/util/List;",
        "decorators",
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
.field private final decorators$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
            "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageListViewStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showAvatarPredicate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageBackgroundFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getLanguageDisplayName"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decoratorPredicate"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lcom/whoop/profile/view/edit/j;

    const/4 v9, 0x2

    move-object v8, p1

    move-object v5, p2

    move-object v3, p3

    move-object v4, p4

    move-object v2, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/profile/view/edit/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;->decorators$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Channel;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;->decorators_delegate$lambda$5$lambda$3(Lio/getstream/chat/android/models/Channel;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/models/Channel;)Ljava/util/ArrayList;
    .locals 0

    invoke-static/range {p0 .. p6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;->decorators_delegate$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/models/Channel;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final decorators_delegate$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/models/Channel;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p6

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/TextDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/TextDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/GapDecorator;

    invoke-direct {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/GapDecorator;-><init>()V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MaxPossibleWidthDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MaxPossibleWidthDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MessageContainerMarginDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v6

    invoke-direct {v5, v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MessageContainerMarginDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;

    move-object/from16 v7, p2

    invoke-direct {v6, v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V

    new-instance v7, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FailedIndicatorDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v8

    new-instance v9, Lu13/a;

    const/4 v10, 0x0

    invoke-direct {v9, v0, v10}, Lu13/a;-><init>(Lio/getstream/chat/android/models/Channel;I)V

    invoke-direct {v7, v8, v9}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FailedIndicatorDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lc93/a;)V

    new-instance v8, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v9

    invoke-direct {v8, v9}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReactionsEnabled()Z

    move-result v9

    const/4 v11, 0x0

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    move-object v8, v11

    :goto_0
    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReplyDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReplyMessageStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    move-result-object v12

    invoke-direct {v9, v12}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReplyDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    new-instance v13, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FootnoteDecorator;

    new-instance v15, Lu13/a;

    const/4 v12, 0x1

    invoke-direct {v15, v0, v12}, Lu13/a;-><init>(Lio/getstream/chat/android/models/Channel;I)V

    new-instance v14, Lu13/a;

    move/from16 p0, v10

    const/4 v10, 0x2

    invoke-direct {v14, v0, v10}, Lu13/a;-><init>(Lio/getstream/chat/android/models/Channel;I)V

    move-object/from16 v17, p1

    move-object/from16 v18, p4

    move-object/from16 v16, v14

    move-object/from16 v14, p3

    invoke-direct/range {v13 .. v18}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FootnoteDecorator;-><init>(Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lc93/a;Lc93/a;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v14

    invoke-direct {v0, v14}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getPinMessageEnabled()Z

    move-result v14

    if-eqz v14, :cond_1

    move-object v11, v0

    :cond_1
    const/16 v0, 0xb

    new-array v0, v0, [Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;

    aput-object v1, v0, p0

    aput-object v2, v0, v12

    aput-object v3, v0, v10

    const/4 v1, 0x3

    aput-object v4, v0, v1

    const/4 v1, 0x4

    aput-object v5, v0, v1

    const/4 v1, 0x5

    aput-object v6, v0, v1

    const/4 v1, 0x6

    aput-object v7, v0, v1

    const/4 v1, 0x7

    aput-object v8, v0, v1

    const/16 v1, 0x8

    aput-object v9, v0, v1

    const/16 v1, 0x9

    aput-object v13, v0, v1

    const/16 v1, 0xa

    aput-object v11, v0, v1

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, p5

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v1
.end method

.method private static final decorators_delegate$lambda$5$lambda$0(Lio/getstream/chat/android/models/Channel;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->isCurrentUserBanned(Lio/getstream/chat/android/models/Channel;)Z

    move-result p0

    return p0
.end method

.method private static final decorators_delegate$lambda$5$lambda$2(Lio/getstream/chat/android/models/Channel;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z

    move-result p0

    return p0
.end method

.method private static final decorators_delegate$lambda$5$lambda$3(Lio/getstream/chat/android/models/Channel;)Z
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Config;->isThreadEnabled()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final getDecorators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;->decorators$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
