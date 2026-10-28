.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->c(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->b(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->a(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->e(Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lfi/e;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;->a(Lfi/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->a(Lbc3/k1;)Lbc3/z;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ln23/h;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->h(Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ln23/h;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->H(Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Ln23/h;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->o(Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Ln23/h;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->b(Ln23/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    check-cast p1, Ll83/k;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->c(Ll83/k;)Ljava/util/Date;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->e(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->a(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;)Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->b(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_d
    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->d(Lio/getstream/chat/android/models/Channel;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->a(Lio/getstream/chat/android/models/Attachment;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_f
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->a(Lio/getstream/chat/android/client/events/ChatEvent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_10
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->c(Lio/getstream/chat/android/client/events/ChatEvent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsDumper;->a(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->a(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotificationHandler;->d(Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->b(Lio/getstream/chat/android/client/channel/state/ChannelState;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->e(Lio/getstream/chat/android/models/ChannelUserRead;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->b(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->t(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->l(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->d(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->o(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->f(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
