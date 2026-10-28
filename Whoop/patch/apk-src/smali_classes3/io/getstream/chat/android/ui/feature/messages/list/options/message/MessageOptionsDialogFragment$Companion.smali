.class public final Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J`\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "newInstance",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;",
        "context",
        "Landroid/content/Context;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "messageOptionItems",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
        "optionsDialogType",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "messageBackgroundFactory",
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
        "attachmentFactoryManager",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "messageListItemViewHolderFactory",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
        "showAvatarPredicate",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
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

.method public static newInstance$default(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;Landroid/content/Context;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;->MESSAGE_OPTIONS:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;->createDefault(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v2

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactoryImpl;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    move-result-object v1

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;-><init>()V

    invoke-virtual {v1, v9}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setAttachmentFactoryManager$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setMessageListItemStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getGiphyViewHolderStyle()Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setGiphyViewHolderStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;)V

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getAudioRecordPlayerViewStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setAudioRecordViewStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;)V

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReplyMessageStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setReplyMessageListItemViewStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion$newInstance$1$1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;->setDecoratorProvider$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V

    move-object v10, v1

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultShowAvatarPredicate;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object v11, v0

    :goto_5
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    goto :goto_6

    :cond_5
    move-object/from16 v11, p9

    goto :goto_5

    :goto_6
    invoke-virtual/range {v2 .. v11}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;->newInstance(Landroid/content/Context;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance(Landroid/content/Context;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "message"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageOptionItems"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "optionsDialogType"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageBackgroundFactory"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "attachmentFactoryManager"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageListItemViewHolderFactory"

    invoke-static {p8, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "showAvatarPredicate"

    invoke-static {p9, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;

    invoke-direct {p1}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;-><init>()V

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->access$setMessage$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/models/Message;)V

    invoke-static {p1, p4}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->access$setOptionsDialogType$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;)V

    invoke-static {p1, p5}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->access$setStyle$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V

    invoke-static {p1, p8}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->access$setMessageListItemViewHolderFactory$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;)V

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;

    invoke-virtual {p5}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getItemStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    move-result-object p4

    invoke-virtual {p5}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReplyMessageStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;

    move-result-object p5

    invoke-direct {p2, p4, p5, p6, p9}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->access$setMessageOptionsDecoratorProvider$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;)V

    invoke-static {p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;->access$setMessageOptionItems$p(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;Ljava/util/List;)V

    return-object p1
.end method
