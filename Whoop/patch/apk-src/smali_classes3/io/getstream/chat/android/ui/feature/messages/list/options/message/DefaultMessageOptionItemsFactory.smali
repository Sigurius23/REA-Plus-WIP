.class public Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J>\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "createMessageOptionItems",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
        "selectedMessage",
        "Lio/getstream/chat/android/models/Message;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "isInThread",
        "",
        "ownCapabilities",
        "",
        "",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
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
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final createMessageOptionItems(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;ZLjava/util/Set;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)Ljava/util/List;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/models/User;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    const-string v5, "selectedMessage"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "ownCapabilities"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "style"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_0

    sget-object v1, Lm83/y;->w:Lm83/y;

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canRetryMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    const-string v8, "getString(...)"

    if-eqz v6, :cond_1

    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v10, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_resend_message:I

    invoke-virtual {v6, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getRetryIcon()I

    move-result v11

    invoke-static {v6, v11}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v12, Lio/getstream/chat/android/ui/common/state/messages/Resend;

    invoke-direct {v12, v1}, Lio/getstream/chat/android/ui/common/state/messages/Resend;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v9

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    :goto_0
    invoke-static {v4, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canReplyToMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v11, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v9, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_reply:I

    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReplyIcon()I

    move-result v9

    invoke-static {v6, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v14, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    invoke-direct {v14, v1}, Lio/getstream/chat/android/ui/common/state/messages/Reply;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move/from16 v6, p3

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    goto :goto_1

    :goto_2
    invoke-static {v4, v6, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canThreadReplyToMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;ZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v6

    if-eqz v6, :cond_3

    new-instance v12, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v9, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_thread_reply:I

    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getThreadReplyIcon()I

    move-result v9

    invoke-static {v6, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v15, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;

    invoke-direct {v15, v1}, Lio/getstream/chat/android/ui/common/state/messages/ThreadReply;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    :goto_3
    invoke-static {v4, v2, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canMarkAsUnread(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v13, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v9, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_mark_as_unread:I

    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getMarkAsUnreadIcon()I

    move-result v9

    invoke-static {v6, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;

    invoke-direct {v6, v1}, Lio/getstream/chat/android/ui/common/state/messages/MarkAsUnread;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v6

    invoke-direct/range {v13 .. v19}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_4
    const/4 v13, 0x0

    :goto_4
    invoke-static {v4, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canCopyMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    if-eqz v6, :cond_5

    new-instance v14, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v9, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_copy_message:I

    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getCopyIcon()I

    move-result v9

    invoke-static {v6, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Lio/getstream/chat/android/ui/common/state/messages/Copy;

    invoke-direct {v6, v1}, Lio/getstream/chat/android/ui/common/state/messages/Copy;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v14 .. v20}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    const/4 v14, 0x0

    :goto_5
    invoke-static {v4, v2, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canEditMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v6

    if-eqz v6, :cond_6

    new-instance v15, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v9, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_edit_message:I

    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getEditIcon()I

    move-result v7

    invoke-static {v9, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v7, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    invoke-direct {v7, v1}, Lio/getstream/chat/android/ui/common/state/messages/Edit;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v6

    move-object/from16 v18, v7

    invoke-direct/range {v15 .. v21}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    const/4 v15, 0x0

    :goto_6
    invoke-static {v4, v2, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canFlagMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v6

    if-eqz v6, :cond_7

    new-instance v22, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v7, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_flag_message:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getFlagIcon()I

    move-result v9

    invoke-static {v7, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v7, Lio/getstream/chat/android/ui/common/state/messages/Flag;

    invoke-direct {v7, v1}, Lio/getstream/chat/android/ui/common/state/messages/Flag;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v27, 0x8

    const/16 v28, 0x0

    const/16 v26, 0x0

    move-object/from16 v23, v6

    move-object/from16 v25, v7

    invoke-direct/range {v22 .. v28}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v22

    goto :goto_7

    :cond_7
    const/16 v16, 0x0

    :goto_7
    invoke-static {v4, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canPinMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v6

    if-eqz v6, :cond_8

    sget v6, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_unpin_message:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getUnpinIcon()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v9, Ll83/k;

    invoke-direct {v9, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_8
    sget v6, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_pin_message:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getPinIcon()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v9, Ll83/k;

    invoke-direct {v9, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    iget-object v6, v9, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget-object v7, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    new-instance v22, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v9, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-static {v9, v7}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v7, Lio/getstream/chat/android/ui/common/state/messages/Pin;

    invoke-direct {v7, v1}, Lio/getstream/chat/android/ui/common/state/messages/Pin;-><init>(Lio/getstream/chat/android/models/Message;)V

    const/16 v27, 0x8

    const/16 v28, 0x0

    const/16 v26, 0x0

    move-object/from16 v23, v6

    move-object/from16 v25, v7

    invoke-direct/range {v22 .. v28}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v22

    goto :goto_9

    :cond_9
    const/16 v17, 0x0

    :goto_9
    invoke-static {v4, v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canBlockUser(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_e

    const/4 v6, 0x0

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getBlockedUserIds()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_a

    invoke-interface {v9, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-ne v5, v7, :cond_a

    move v6, v7

    :cond_a
    if-eqz v6, :cond_b

    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_unblock_user:I

    goto :goto_a

    :cond_b
    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_block_user:I

    :goto_a
    if-eqz v6, :cond_c

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getUnblockUserIcon()I

    move-result v9

    goto :goto_b

    :cond_c
    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getBlockUserIcon()I

    move-result v9

    :goto_b
    if-eqz v6, :cond_d

    new-instance v6, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;

    invoke-direct {v6, v1}, Lio/getstream/chat/android/ui/common/state/messages/UnblockUser;-><init>(Lio/getstream/chat/android/models/Message;)V

    :goto_c
    move-object/from16 v25, v6

    goto :goto_d

    :cond_d
    new-instance v6, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;

    invoke-direct {v6, v1}, Lio/getstream/chat/android/ui/common/state/messages/BlockUser;-><init>(Lio/getstream/chat/android/models/Message;)V

    goto :goto_c

    :goto_d
    new-instance v22, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v6, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-static {v6, v9}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v27, 0x8

    const/16 v28, 0x0

    const/16 v26, 0x0

    move-object/from16 v23, v5

    invoke-direct/range {v22 .. v28}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v22

    goto :goto_e

    :cond_e
    const/16 v18, 0x0

    :goto_e
    invoke-static {v4, v2, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;->canDeleteMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    sget v5, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_delete_message:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/DefaultMessageOptionItemsFactory;->context:Landroid/content/Context;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getDeleteIcon()I

    move-result v4

    invoke-static {v5, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/ui/common/state/messages/Delete;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/common/state/messages/Delete;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-direct {v2, v3, v4, v5, v7}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;-><init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Z)V

    move-object/from16 v19, v2

    goto :goto_f

    :cond_f
    const/16 v19, 0x0

    :goto_f
    filled-new-array/range {v10 .. v19}, [Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method
