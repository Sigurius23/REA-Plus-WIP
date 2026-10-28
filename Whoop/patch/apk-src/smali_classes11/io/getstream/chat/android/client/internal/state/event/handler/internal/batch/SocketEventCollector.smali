.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 42\u00020\u0001:\u00014B[\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t\u0012\"\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B5\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@\u00a2\u0006\u0004\u0008\u001f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\"R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010#R0\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;",
        "",
        "Lbc3/c0;",
        "scope",
        "",
        "timeout",
        "timeLimit",
        "",
        "itemCountLimit",
        "Lkotlin/Function0;",
        "now",
        "Lkotlin/Function2;",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
        "Lq83/d;",
        "Ll83/a0;",
        "fireEvent",
        "<init>",
        "(Lbc3/c0;JJILc93/a;Lc93/m;)V",
        "(Lbc3/c0;Lc93/m;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "",
        "add",
        "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;",
        "firePostponed",
        "(Lq83/d;)Ljava/lang/Object;",
        "scheduleTimeout",
        "()V",
        "onItemCountLimit",
        "onTimeLimit",
        "doFire",
        "collect$stream_chat_android_client_release",
        "collect",
        "Lbc3/c0;",
        "J",
        "I",
        "Lc93/m;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;",
        "postponed",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;",
        "timeoutJob",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;",
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
.field private static final Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$Companion;

.field private static final ITEM_COUNT_LIMIT:I = 0xc8

.field private static final TAG:Ljava/lang/String; = "Chat:EventCollector"

.field private static final TIMEOUT:J = 0x12cL

.field private static final TIME_LIMIT:J = 0x3e8L


# instance fields
.field private final fireEvent:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final itemCountLimit:I

.field private final logger$delegate:Ll83/h;

.field private final mutex:Lmc3/a;

.field private final postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

.field private final scope:Lbc3/c0;

.field private final timeLimit:J

.field private final timeout:J

.field private final timeoutJob:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$Companion;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;JJILc93/a;Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "JJI",
            "Lc93/a;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fireEvent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->scope:Lbc3/c0;

    .line 3
    iput-wide p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeout:J

    .line 4
    iput-wide p4, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeLimit:J

    .line 5
    iput p6, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->itemCountLimit:I

    .line 6
    iput-object p8, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->fireEvent:Lc93/m;

    .line 7
    const-string p1, "Chat:EventCollector"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->logger$delegate:Ll83/h;

    .line 8
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->mutex:Lmc3/a;

    .line 9
    new-instance p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-direct {p1, p7}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;-><init>(Lc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    .line 10
    new-instance p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;

    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeoutJob:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lc93/m;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fireEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v8, Lio/getstream/chat/android/client/k;

    const/4 v0, 0x3

    invoke-direct {v8, v0}, Lio/getstream/chat/android/client/k;-><init>(I)V

    const-wide/16 v3, 0x12c

    const-wide/16 v5, 0x3e8

    const/16 v7, 0xc8

    move-object v1, p0

    move-object v2, p1

    move-object v9, p2

    .line 14
    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;-><init>(Lbc3/c0;JJILc93/a;Lc93/m;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/util/Date;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->doFire$lambda$12(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$add(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->add(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$doFire(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->doFire(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$firePostponed(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->firePostponed(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMutex$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;)Lmc3/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->mutex:Lmc3/a;

    return-object p0
.end method

.method public static final synthetic access$getTimeout$p(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;)J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeout:J

    return-wide v0
.end method

.method public static final synthetic access$onItemCountLimit(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->onItemCountLimit(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onTimeLimit(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->onTimeLimit(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final add(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;

    invoke-direct {v3, v1, v2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    iget-object v4, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v3, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    :goto_1
    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    iget-object v4, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v3, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/events/ChatEvent;

    goto :goto_1

    :cond_3
    iget v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$0:I

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, v0

    move-object v0, v8

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v0, Lio/getstream/chat/android/client/events/ConnectingEvent;

    if-nez v2, :cond_a

    instance-of v2, v0, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-nez v2, :cond_a

    instance-of v2, v0, Lio/getstream/chat/android/client/events/DisconnectedEvent;

    if-nez v2, :cond_a

    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v11, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->getRealType(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v13

    const-string v14, "("

    const-string v15, ")"

    const-string v6, "[add] event.type: "

    invoke-static {v13, v6, v5, v14, v15}, Ldc/b;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v12, v11, v5, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->mutex:Lmc3/a;

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$1:Ljava/lang/Object;

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$0:I

    iput v8, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->label:I

    invoke-interface {v2, v3}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_6

    goto :goto_4

    :cond_6
    move-object v5, v2

    move v2, v9

    :goto_2
    :try_start_1
    iget-object v6, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeoutJob:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;

    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;->cancel()V

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-virtual {v6, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->add(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-virtual {v8}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->getSize()I

    move-result v8

    iget v11, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->itemCountLimit:I

    if-lt v8, v11, :cond_8

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$1:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$2:Ljava/lang/Object;

    iput v2, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$0:I

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$1:I

    iput-boolean v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->Z$0:Z

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$2:I

    iput v7, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->label:I

    invoke-direct {v1, v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->onItemCountLimit(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_7

    goto :goto_4

    :cond_7
    move-object v4, v5

    move-object v0, v6

    :goto_3
    move-object v6, v0

    move-object v5, v4

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v4, v5

    goto :goto_6

    :cond_8
    iget-object v7, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-virtual {v7}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->collectionTime()J

    move-result-wide v7

    iget-wide v11, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeLimit:J

    cmp-long v7, v7, v11

    if-ltz v7, :cond_9

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$1:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->L$2:Ljava/lang/Object;

    iput v2, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$0:I

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$1:I

    iput-boolean v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->Z$0:Z

    iput v9, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->I$2:I

    const/4 v0, 0x3

    iput v0, v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$add$1;->label:I

    invoke-direct {v1, v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->onTimeLimit(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_7

    :goto_4
    return-object v4

    :cond_9
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->scheduleTimeout()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_5
    invoke-interface {v5, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v6

    :goto_6
    invoke-interface {v4, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :cond_a
    invoke-direct {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->getRealType(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "[add] rejected (unsupported event.type): "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v5, v4, v0, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method private final doFire(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[doFire] rejected (postponed is empty)"

    invoke-interface {p1, v4, v3, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->getSize()I

    move-result v3

    const-string v6, "[doFire] postponed.size: "

    invoke-static {v3, v6}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v5, v4, v3, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->sortedBy(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->postponed:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeoutJob:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;->reset()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->fireEvent:Lc93/m;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;-><init>(ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    return-object v2
.end method

.method private static final doFire$lambda$12(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/util/Date;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/ChatEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method private final firePostponed(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v7, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "[firePostponed] no args"

    invoke-interface {p1, v8, v7, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->mutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->label:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_2

    :cond_5
    move v2, v3

    :goto_1
    :try_start_1
    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeoutJob:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;->cancel()V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$firePostponed$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->doFire(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v0, p1

    :goto_3
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_4
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final onItemCountLimit(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onItemCountLimit] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->doFire(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final onTimeLimit(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onTimeLimit] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->doFire(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final scheduleTimeout()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->timeoutJob:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$scheduleTimeout$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)V

    const/4 v4, 0x3

    invoke-static {v1, v3, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;->set(Lbc3/k1;)V

    return-void
.end method


# virtual methods
.method public final collect$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->label:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v8, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->getRealType(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v10

    const-string v11, "[collect] event.type: \'"

    const-string v12, "\', event.hash: "

    invoke-static {v10, v11, v2, v12}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v9, v8, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$0:Ljava/lang/Object;

    iput v7, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->label:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->add(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_4

    :cond_7
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$0:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->label:I

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->firePostponed(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    new-instance v6, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;-><init>(ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->fireEvent:Lc93/m;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$collect$1;->label:I

    invoke-interface {p1, v6, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    return-object v4
.end method
