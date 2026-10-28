.class public Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;
.super Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0016\u0018\u0000 ,2\u00020\u0001:\u0001,B+\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0004\u00a2\u0006\u0004\u0008!\u0010\"J!\u0010#\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0004\u00a2\u0006\u0004\u0008#\u0010\u0015J\u0019\u0010$\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0004\u00a2\u0006\u0004\u0008$\u0010%R.\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010&\u001a\u0004\u0008\'\u0010(R\u001a\u0010\u0008\u001a\u00020\u00078\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;",
        "Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;",
        "Lec3/f2;",
        "",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "channels",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lec3/f2;Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Lio/getstream/chat/android/client/events/NewMessageEvent;",
        "event",
        "cachedChannel",
        "Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "handleNewMessageEvent",
        "(Lio/getstream/chat/android/client/events/NewMessageEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "channel",
        "Lio/getstream/chat/android/models/Member;",
        "member",
        "addIfMembershipUpdated",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "cid",
        "removeIfCurrentUserLeftChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "handleCidEvent",
        "(Lio/getstream/chat/android/client/events/CidEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "Lio/getstream/chat/android/client/events/HasChannel;",
        "handleChannelEvent",
        "(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "removeIfChannelExists",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "addIfCurrentUserJoinedChannel",
        "addIfChannelIsAbsent",
        "(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "Lec3/f2;",
        "getChannels",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "getClientState",
        "()Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Companion",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler$Companion;

.field private static final SYSTEM_MESSAGE:Ljava/lang/String; = "system"


# instance fields
.field private final channels:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->Companion:Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler$Companion;

    return-void
.end method

.method public constructor <init>(Lec3/f2;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            ")V"
        }
    .end annotation

    const-string v0, "channels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->channels:Lec3/f2;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method private final addIfMembershipUpdated(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMembership(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->updateMember(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;-><init>(Lio/getstream/chat/android/models/Channel;)V

    return-object v0

    :cond_1
    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method

.method private final handleNewMessageEvent(Lio/getstream/chat/android/client/events/NewMessageEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v0, "system"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->addIfChannelIsAbsent(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1
.end method

.method private final removeIfCurrentUserLeftChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->removeIfChannelExists(Ljava/lang/String;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final addIfChannelIsAbsent(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->channels:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1

    :cond_1
    new-instance v0, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;-><init>(Lio/getstream/chat/android/models/Channel;)V

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method

.method public final addIfCurrentUserJoinedChannel(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "member"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->addIfChannelIsAbsent(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method

.method public final getChannels()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->channels:Lec3/f2;

    return-object v0
.end method

.method public final getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-object v0
.end method

.method public final handleChannelEvent(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    if-eqz v0, :cond_0

    new-instance p2, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    if-eqz v0, :cond_1

    new-instance p2, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getCid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->removeIfCurrentUserLeftChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;->handleChannelEvent(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1
.end method

.method public final handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->handleNewMessageEvent(Lio/getstream/chat/android/client/events/NewMessageEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getCid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->removeIfCurrentUserLeftChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->addIfCurrentUserJoinedChannel(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object p1

    invoke-direct {p0, p3, p1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->addIfMembershipUpdated(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-super {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;->handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1
.end method

.method public final removeIfChannelExists(Ljava/lang/String;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;->channels:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    sget-object p1, Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;->INSTANCE:Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;

    return-object p1
.end method
