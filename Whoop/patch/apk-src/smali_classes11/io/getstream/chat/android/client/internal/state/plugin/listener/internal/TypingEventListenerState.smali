.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ%\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJI\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018JC\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJQ\u0010\u001d\u001a\u00020\t2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "channelLogic",
        "Ln23/h;",
        "Ll83/a0;",
        "onTypingStopPrecondition",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;)Ln23/h;",
        "Ljava/util/Date;",
        "eventTime",
        "onTypingStartPrecondition",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Ljava/util/Date;)Ln23/h;",
        "",
        "eventType",
        "channelType",
        "channelId",
        "",
        "",
        "extraData",
        "onTypingEventPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;",
        "onTypingEventRequest",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "result",
        "onTypingEventResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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
.field private static final ARG_TYPING_PARENT_ID:Ljava/lang/String; = "parent_id"

.field private static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState$Companion;

.field private static final MILLI_SEC:I = 0x3e8

.field private static final TYPING_DELAY:I = 0xbb8

.field private static final TYPING_DELAY_SECS:I = 0x3


# instance fields
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-void
.end method

.method private final onTypingStartPrecondition(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Ljava/util/Date;)Ln23/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
            "Ljava/util/Date;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->typingEventsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string v0, "Typing events are not enabled"

    invoke-direct {p2, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_0
    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getLastStartTypingEvent()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getLastStartTypingEvent()Ljava/util/Date;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long p2, v0, v2

    if-gez p2, :cond_1

    new-instance p2, Ln23/f;

    new-instance v0, Ln23/a;

    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getLastStartTypingEvent()Ljava/util/Date;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Last typing event was sent at "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". There must be a delay of 3 seconds before sending new event"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p2

    :cond_1
    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final onTypingStopPrecondition(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;)Ln23/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->typingEventsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Typing events are not enabled"

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_0
    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getLastStartTypingEvent()Ljava/util/Date;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "lastStartTypingEvent is null. Make sure to send Event.TYPING_START before sending Event.TYPING_STOP"

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_1
    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final onTypingEventPrecondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "eventTime"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p2

    const-string p3, "typing.start"

    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-direct {p0, p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->onTypingStartPrecondition(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Ljava/util/Date;)Ln23/h;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p3, "typing.stop"

    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->onTypingStopPrecondition(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;)Ln23/h;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onTypingEventRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "eventTime"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p2

    const-string p3, "typing.start"

    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setLastStartTypingEvent(Ljava/util/Date;)V

    return-void

    :cond_0
    const-string p3, "typing.stop"

    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setLastStartTypingEvent(Ljava/util/Date;)V

    :cond_1
    return-void
.end method

.method public final onTypingEventResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Ln23/g;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/TypingEventListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p1, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    const-string p3, "typing.start"

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_1

    const-string p2, "parent_id"

    invoke-interface {p5, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, Ljava/lang/String;

    if-eqz p3, :cond_0

    move-object p4, p2

    check-cast p4, Ljava/lang/String;

    :cond_0
    invoke-interface {p1, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setKeystrokeParentMessageId(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p3, "typing.stop"

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setKeystrokeParentMessageId(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
