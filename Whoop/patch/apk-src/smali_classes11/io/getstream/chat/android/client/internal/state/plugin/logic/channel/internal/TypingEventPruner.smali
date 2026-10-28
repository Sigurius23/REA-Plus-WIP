.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 %2\u00020\u0001:\u0001%BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012$\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u001c\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001fR2\u0010\r\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;",
        "",
        "",
        "channelId",
        "Lbc3/c0;",
        "coroutineScope",
        "",
        "delayTimeMs",
        "Lkotlin/Function2;",
        "",
        "Lio/getstream/chat/android/client/events/TypingStartEvent;",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "Ll83/a0;",
        "onUpdated",
        "<init>",
        "(Ljava/lang/String;Lbc3/c0;JLc93/m;)V",
        "userId",
        "typingStartEvent",
        "addTypingEvent",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V",
        "removeTypingEvent",
        "(Ljava/lang/String;)V",
        "getRawTyping",
        "()Ljava/util/Map;",
        "getTypingEvent",
        "()Lio/getstream/chat/android/models/TypingEvent;",
        "clear",
        "()V",
        "processEvent",
        "Ljava/lang/String;",
        "Lbc3/c0;",
        "J",
        "Lc93/m;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;",
        "typingEvents",
        "Ljava/util/Map;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner$Companion;

.field public static final DEFAULT_DELAY_TIME_MS:J = 0x1b58L


# instance fields
.field private final channelId:Ljava/lang/String;

.field private final coroutineScope:Lbc3/c0;

.field private final delayTimeMs:J

.field private final onUpdated:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final typingEvents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbc3/c0;JLc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbc3/c0;",
            "J",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "channelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdated"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->channelId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->coroutineScope:Lbc3/c0;

    .line 4
    iput-wide p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->delayTimeMs:J

    .line 5
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->onUpdated:Lc93/m;

    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lbc3/c0;JLc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const-wide/16 p3, 0x1b58

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;-><init>(Ljava/lang/String;Lbc3/c0;JLc93/m;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->addTypingEvent$lambda$0(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;Ljava/lang/String;)Ll83/a0;

    return-void
.end method

.method private final addTypingEvent(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V
    .locals 7

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->coroutineScope:Lbc3/c0;

    new-instance v6, Lhb2/c;

    const/16 v2, 0x13

    invoke-direct {v6, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v4, 0x1b58

    move-object v3, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->cancelJob()V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->onUpdated:Lc93/m;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getRawTyping()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getTypingEvent()Lio/getstream/chat/android/models/TypingEvent;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final addTypingEvent$lambda$0(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->removeTypingEvent(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final clear()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->cancelJob()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->onUpdated:Lc93/m;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getRawTyping()Ljava/util/Map;

    move-result-object v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getTypingEvent()Lio/getstream/chat/android/models/TypingEvent;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getRawTyping()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/events/TypingStartEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->getTypingStartEvent$stream_chat_android_client_release()Lio/getstream/chat/android/client/events/TypingStartEvent;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final getTypingEvent()Lio/getstream/chat/android/models/TypingEvent;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->getTypingStartEvent$stream_chat_android_client_release()Lio/getstream/chat/android/client/events/TypingStartEvent;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner$getTypingEvent$$inlined$sortedBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Lio/getstream/chat/android/models/TypingEvent;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->channelId:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/models/TypingEvent;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private final removeTypingEvent(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->cancelJob()V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->typingEvents:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->onUpdated:Lc93/m;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getRawTyping()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->getTypingEvent()Lio/getstream/chat/android/models/TypingEvent;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final processEvent(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->removeTypingEvent(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->addTypingEvent(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V

    return-void
.end method
