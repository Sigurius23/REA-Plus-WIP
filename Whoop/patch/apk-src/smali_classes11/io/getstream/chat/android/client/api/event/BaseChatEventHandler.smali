.class public abstract Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/event/ChatEventHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandler;",
        "<init>",
        "()V",
        "handleChannelEvent",
        "Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "event",
        "Lio/getstream/chat/android/client/events/HasChannel;",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "handleCidEvent",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "cachedChannel",
        "Lio/getstream/chat/android/models/Channel;",
        "handleChatEvent",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "stream-chat-android-client_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleChannelEvent(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz p2, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_0
    instance-of p2, p1, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz p2, :cond_1

    new-instance p2, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_1
    instance-of p2, p1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    if-eqz p2, :cond_2

    new-instance p2, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_2
    instance-of p2, p1, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    if-eqz p2, :cond_3

    new-instance p2, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;

    check-cast p1, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_3
    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method

.method public final handleChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/HasChannel;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;->handleChannelEvent(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;->handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method

.method public handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 0

    const-string p3, "event"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "filter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method
