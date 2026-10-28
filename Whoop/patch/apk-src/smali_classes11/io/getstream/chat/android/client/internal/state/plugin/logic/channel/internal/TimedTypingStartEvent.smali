.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0008H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u00c2\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJN\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010$\u001a\u00020#2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010)R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010*R \u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;",
        "",
        "Lbc3/c0;",
        "coroutineScope",
        "Lio/getstream/chat/android/client/events/TypingStartEvent;",
        "typingStartEvent",
        "",
        "userId",
        "",
        "delayTimeMs",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "removeTypingEvent",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V",
        "component1",
        "()Lbc3/c0;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()J",
        "component5",
        "()Lkotlin/jvm/functions/Function1;",
        "cancelJob",
        "()V",
        "component2$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/events/TypingStartEvent;",
        "component2",
        "copy",
        "(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/events/TypingStartEvent;",
        "getTypingStartEvent$stream_chat_android_client_release",
        "Ljava/lang/String;",
        "J",
        "Lkotlin/jvm/functions/Function1;",
        "Lbc3/k1;",
        "job",
        "Lbc3/k1;",
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


# instance fields
.field private final coroutineScope:Lbc3/c0;

.field private final delayTimeMs:J

.field private job:Lbc3/k1;

.field private final removeTypingEvent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/events/TypingStartEvent;",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingStartEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeTypingEvent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    iput-wide p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;Lq83/d;)V

    const/4 p4, 0x3

    invoke-static {p1, p3, p3, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->job:Lbc3/k1;

    return-void
.end method

.method public static final synthetic access$getDelayTimeMs$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;)J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    return-wide v0
.end method

.method public static final synthetic access$getRemoveTypingEvent$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getUserId$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    return-object p0
.end method

.method private final component1()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    return-object v0
.end method

.method private final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    return-object v0
.end method

.method private final component4()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    return-wide v0
.end method

.method private final component5()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-wide p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    :cond_4
    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->copy(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cancelJob()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->job:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final component2$stream_chat_android_client_release()Lio/getstream/chat/android/client/events/TypingStartEvent;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    return-object v0
.end method

.method public final copy(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/events/TypingStartEvent;",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingStartEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeTypingEvent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    iget-wide v5, p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getTypingStartEvent$stream_chat_android_client_release()Lio/getstream/chat/android/client/events/TypingStartEvent;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/TypingStartEvent;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->coroutineScope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->typingStartEvent:Lio/getstream/chat/android/client/events/TypingStartEvent;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->userId:Ljava/lang/String;

    iget-wide v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->delayTimeMs:J

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;->removeTypingEvent:Lkotlin/jvm/functions/Function1;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "TimedTypingStartEvent(coroutineScope="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", typingStartEvent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", delayTimeMs="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", removeTypingEvent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
