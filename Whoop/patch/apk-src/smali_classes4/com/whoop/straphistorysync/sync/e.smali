.class public final Lcom/whoop/straphistorysync/sync/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyh2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/straphistorysync/sync/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 Q2\u00020\u0001:\u0001:Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJM\u0010,\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#2\u0006\u0010\'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u00080\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u00082\u00103J\u001f\u00104\u001a\u00020+2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u00084\u00103J%\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u0017072\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\u00088\u00109J%\u0010:\u001a\u0008\u0012\u0004\u0012\u00020$072\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010LR\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010O\u00a8\u0006R"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/e;",
        "Lyh2/c;",
        "Lcom/whoop/straphistorysync/sync/d;",
        "stateMachine",
        "Lbi2/j;",
        "watermarkTracker",
        "Lbi2/g;",
        "sensorSyncHolderFactory",
        "Lbi2/i;",
        "sensorSyncProcessorFactory",
        "Liy1/c;",
        "metricWriter",
        "Lca2/h;",
        "rawDataTrackingService",
        "Lst0/r;",
        "strapLockStateTracker",
        "Ljs0/c;",
        "configurationRepository",
        "Lbc3/c0;",
        "coroutineScope",
        "Ltr2/n;",
        "logger",
        "Lkotlin/Function0;",
        "",
        "timeProvider",
        "<init>",
        "(Lcom/whoop/straphistorysync/sync/d;Lbi2/j;Lbi2/g;Lbi2/i;Liy1/c;Lca2/h;Lst0/r;Ljs0/c;Lbc3/c0;Ltr2/n;Lc93/a;)V",
        "Ljk0/d;",
        "",
        "k",
        "(Ljk0/d;)Ljava/lang/String;",
        "strap",
        "Lcom/whoop/domain/model/WhoopStrapInfo;",
        "strapInfo",
        "deviceSerial",
        "Lec3/p1;",
        "Lcom/whoop/straphistorysync/sync/f;",
        "stateFlow",
        "Lsj2/a;",
        "priority",
        "",
        "isRawDataInBacklog",
        "sessionId",
        "Ll83/a0;",
        "l",
        "(Ljk0/d;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/String;Lec3/p1;Lsj2/a;ZLjava/lang/String;)V",
        "j",
        "(Ljk0/d;Ljava/lang/String;)V",
        "o",
        "(Ljk0/d;)V",
        "p",
        "(Lcom/whoop/domain/model/WhoopStrapInfo;Z)V",
        "q",
        "Lyh2/a;",
        "type",
        "Lec3/f2;",
        "b",
        "(Ljk0/d;Lyh2/a;)Lec3/f2;",
        "a",
        "(Ljk0/d;Lsj2/a;)Lec3/f2;",
        "Lcom/whoop/straphistorysync/sync/d;",
        "Lbi2/j;",
        "c",
        "Lbi2/g;",
        "d",
        "Lbi2/i;",
        "e",
        "Liy1/c;",
        "f",
        "Lca2/h;",
        "g",
        "Lst0/r;",
        "h",
        "Ljs0/c;",
        "i",
        "Lbc3/c0;",
        "Ltr2/n;",
        "Lc93/a;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "lastTerminalTimestamps",
        "m",
        "strap-history-sync_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final m:Lcom/whoop/straphistorysync/sync/e$a;


# instance fields
.field private final a:Lcom/whoop/straphistorysync/sync/d;

.field private final b:Lbi2/j;

.field private final c:Lbi2/g;

.field private final d:Lbi2/i;

.field private final e:Liy1/c;

.field private final f:Lca2/h;

.field private final g:Lst0/r;

.field private final h:Ljs0/c;

.field private final i:Lbc3/c0;

.field private final j:Ltr2/n;

.field private final k:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/straphistorysync/sync/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/straphistorysync/sync/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/straphistorysync/sync/e;->m:Lcom/whoop/straphistorysync/sync/e$a;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/straphistorysync/sync/d;Lbi2/j;Lbi2/g;Lbi2/i;Liy1/c;Lca2/h;Lst0/r;Ljs0/c;Lbc3/c0;Ltr2/n;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/d;",
            "Lbi2/j;",
            "Lbi2/g;",
            "Lbi2/i;",
            "Liy1/c;",
            "Lca2/h;",
            "Lst0/r;",
            "Ljs0/c;",
            "Lbc3/c0;",
            "Ltr2/n;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "stateMachine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watermarkTracker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensorSyncHolderFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensorSyncProcessorFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLockStateTracker"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeProvider"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/e;->a:Lcom/whoop/straphistorysync/sync/d;

    .line 3
    iput-object p2, p0, Lcom/whoop/straphistorysync/sync/e;->b:Lbi2/j;

    .line 4
    iput-object p3, p0, Lcom/whoop/straphistorysync/sync/e;->c:Lbi2/g;

    .line 5
    iput-object p4, p0, Lcom/whoop/straphistorysync/sync/e;->d:Lbi2/i;

    .line 6
    iput-object p5, p0, Lcom/whoop/straphistorysync/sync/e;->e:Liy1/c;

    .line 7
    iput-object p6, p0, Lcom/whoop/straphistorysync/sync/e;->f:Lca2/h;

    .line 8
    iput-object p7, p0, Lcom/whoop/straphistorysync/sync/e;->g:Lst0/r;

    .line 9
    iput-object p8, p0, Lcom/whoop/straphistorysync/sync/e;->h:Ljs0/c;

    .line 10
    iput-object p9, p0, Lcom/whoop/straphistorysync/sync/e;->i:Lbc3/c0;

    .line 11
    iput-object p10, p0, Lcom/whoop/straphistorysync/sync/e;->j:Ltr2/n;

    .line 12
    iput-object p11, p0, Lcom/whoop/straphistorysync/sync/e;->k:Lc93/a;

    .line 13
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/e;->l:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/straphistorysync/sync/d;Lbi2/j;Lbi2/g;Lbi2/i;Liy1/c;Lca2/h;Lst0/r;Ljs0/c;Lbc3/c0;Ltr2/n;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_0

    .line 14
    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "SensorHistoricalPullApi"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p10

    :goto_0
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_1

    .line 15
    new-instance v0, Lbf2/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lbf2/a;-><init>(I)V

    move-object v13, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    goto :goto_2

    :cond_1
    move-object/from16 v13, p11

    goto :goto_1

    .line 16
    :goto_2
    invoke-direct/range {v2 .. v13}, Lcom/whoop/straphistorysync/sync/e;-><init>(Lcom/whoop/straphistorysync/sync/d;Lbi2/j;Lbi2/g;Lbi2/i;Liy1/c;Lca2/h;Lst0/r;Ljs0/c;Lbc3/c0;Ltr2/n;Lc93/a;)V

    return-void
.end method

.method public static synthetic c(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/straphistorysync/sync/e;->m(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/straphistorysync/sync/e;Ljk0/d;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/e;->n(Lcom/whoop/straphistorysync/sync/e;Ljk0/d;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()J
    .locals 2

    invoke-static {}, Lcom/whoop/straphistorysync/sync/e;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f()J
    .locals 2

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic g(Lcom/whoop/straphistorysync/sync/e;)Ljs0/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/straphistorysync/sync/e;->h:Ljs0/c;

    return-object p0
.end method

.method public static final synthetic h(Lcom/whoop/straphistorysync/sync/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/straphistorysync/sync/e;->j:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic i(Lcom/whoop/straphistorysync/sync/e;Ljk0/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/straphistorysync/sync/e;->o(Ljk0/d;)V

    return-void
.end method

.method private final j(Ljk0/d;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->i:Lbc3/c0;

    new-instance v1, Lcom/whoop/straphistorysync/sync/e$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/whoop/straphistorysync/sync/e$b;-><init>(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;Ljk0/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final k(Ljk0/d;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Device serial number is not available"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final l(Ljk0/d;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/String;Lec3/p1;Lsj2/a;ZLjava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk0/d;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "Ljava/lang/String;",
            "Lec3/p1;",
            "Lsj2/a;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/e;->e:Liy1/c;

    invoke-virtual {p2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v0

    invoke-virtual {v0}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object v0

    invoke-interface {v0}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/straphistorysync/sync/e;->g:Lst0/r;

    new-instance v0, Lwh2/a;

    new-instance v6, Li;

    const/16 v5, 0x17

    invoke-direct {v6, v5, p0, p3}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    move/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Lwh2/a;-><init>(Liy1/c;Ljava/lang/String;Ljava/lang/String;Lst0/r;ZLc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lwh2/a;->n()V

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/e;->d:Lbi2/i;

    check-cast v1, Lxh2/b;

    iget-object v1, v1, Lxh2/b;->a:Lxf3/c;

    invoke-static {v1, p2, v0}, Lxh2/c;->c(Lxf3/c;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;)Lbi2/h;

    move-result-object p2

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/e;->c:Lbi2/g;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/e;->a:Lcom/whoop/straphistorysync/sync/d;

    check-cast v1, Lxh2/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p4, v2, p2, v0}, Lxh2/c;->a(Ljava/lang/String;Lec3/p1;Lcom/whoop/straphistorysync/sync/d;Lbi2/h;Lwh2/a;)Lcom/whoop/straphistorysync/sync/i;

    move-result-object v8

    new-instance v3, Lcom/whoop/straphistorysync/sync/h;

    sget-object p2, Lvk0/k$a;->a:Lvk0/k$a;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SensorHPS_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p7

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v7

    new-instance v9, Lc;

    const/16 p2, 0xe

    invoke-direct {v9, p0, p1, p3, p2}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v6, "SensorHistoricalPullTask"

    invoke-direct/range {v3 .. v9}, Lcom/whoop/straphistorysync/sync/h;-><init>(Lec3/p1;Lec3/p1;Ljava/lang/String;Ltr2/n;Lcom/whoop/straphistorysync/sync/i;Lc93/a;)V

    invoke-interface {p1, v3, p5}, Ljk0/d;->u(Lvk0/j;Lsj2/a;)Lbc3/i0;

    return-void
.end method

.method private static final m(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->l:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p0, p0, Lcom/whoop/straphistorysync/sync/e;->k:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lcom/whoop/straphistorysync/sync/e;Ljk0/d;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/e;->j(Ljk0/d;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final o(Ljk0/d;)V
    .locals 9

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->e:Liy1/c;

    new-instance v1, Ljy1/a;

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v2

    invoke-virtual {v2}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "whoop_device:"

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object p1

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "firmware_version:"

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "connectivity.strap.app.sensor_hps.requeued"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method private final p(Lcom/whoop/domain/model/WhoopStrapInfo;Z)V
    .locals 9

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->e:Liy1/c;

    new-instance v1, Ljy1/a;

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v2

    invoke-virtual {v2}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "whoop_device:"

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object p1

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "firmware_version:"

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "is_raw_data_in_strap_or_app_backlog:"

    invoke-static {v3, p2}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    iget-object v3, p0, Lcom/whoop/straphistorysync/sync/e;->g:Lst0/r;

    invoke-static {v3}, Lst0/s;->a(Lst0/r;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "strap_lock_state:"

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "reason:already_running"

    filled-new-array {v2, p1, p2, v3, v4}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "connectivity.strap.app.sensor_hps.session_skipped"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method private final q(Lcom/whoop/domain/model/WhoopStrapInfo;Z)V
    .locals 12

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/e;->k:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sub-long/2addr v2, v0

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->e:Liy1/c;

    new-instance v4, Ljy1/a;

    long-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v1

    invoke-virtual {v1}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "whoop_device:"

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object p1

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "firmware_version:"

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "is_raw_data_in_strap_or_app_backlog:"

    invoke-static {v2, p2}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/e;->g:Lst0/r;

    invoke-static {v2}, Lst0/s;->a(Lst0/r;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "strap_lock_state:"

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, p1, p2, v2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    sget-object v9, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-string v6, "connectivity.strap.app.sensor_hps.time_between_runs_ms"

    invoke-direct/range {v4 .. v11}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Liy1/c;->b(Ljy1/a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljk0/d;Lsj2/a;)Lec3/f2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk0/d;",
            "Lsj2/a;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "strap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priority"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v3

    const/4 v0, 0x0

    if-nez v3, :cond_0

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e;->j:Ltr2/n;

    const-string p2, "HPS submit called but strapInfo is null, skipping"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lcom/whoop/straphistorysync/sync/f$b$b;

    sget-object v2, Lbi2/a;->SensorInfoNull:Lbi2/a;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/straphistorysync/sync/f$b$b;-><init>(Lbi2/a;Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v3}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/e;->j:Ltr2/n;

    const-string v2, "HPS submit requested for device: "

    invoke-static {v2, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v5, v0, [Lqr2/a$a;

    invoke-interface {v1, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/e;->a:Lcom/whoop/straphistorysync/sync/d;

    invoke-virtual {v1, v4}, Lcom/whoop/straphistorysync/sync/d;->a(Ljava/lang/String;)Lcom/whoop/straphistorysync/sync/a;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/straphistorysync/sync/a$a;

    if-eqz v2, :cond_1

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e;->j:Ltr2/n;

    const-string p2, "HPS already in progress for device "

    const-string v2, ", returning existing state flow"

    invoke-static {p2, v4, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/e;->f:Lca2/h;

    invoke-interface {p1}, Lca2/h;->c()Z

    move-result p1

    invoke-direct {p0, v3, p1}, Lcom/whoop/straphistorysync/sync/e;->p(Lcom/whoop/domain/model/WhoopStrapInfo;Z)V

    check-cast v1, Lcom/whoop/straphistorysync/sync/a$a;

    invoke-virtual {v1}, Lcom/whoop/straphistorysync/sync/a$a;->a()Lec3/f2;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v2, v1, Lcom/whoop/straphistorysync/sync/a$b;

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "toString(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    invoke-static {v5, v2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/e;->j:Ltr2/n;

    const-string v5, "Starting new HPS session SensorHPS_"

    const-string v6, "_"

    invoke-static {v5, v4, v6, v8}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v2, v5, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->f:Lca2/h;

    invoke-interface {v0}, Lca2/h;->c()Z

    move-result v7

    invoke-direct {p0, v3, v7}, Lcom/whoop/straphistorysync/sync/e;->q(Lcom/whoop/domain/model/WhoopStrapInfo;Z)V

    move-object v0, v1

    check-cast v0, Lcom/whoop/straphistorysync/sync/a$b;

    invoke-virtual {v0}, Lcom/whoop/straphistorysync/sync/a$b;->a()Lec3/p1;

    move-result-object v5

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v8}, Lcom/whoop/straphistorysync/sync/e;->l(Ljk0/d;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/String;Lec3/p1;Lsj2/a;ZLjava/lang/String;)V

    invoke-virtual {v0}, Lcom/whoop/straphistorysync/sync/a$b;->a()Lec3/p1;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public b(Ljk0/d;Lyh2/a;)Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk0/d;",
            "Lyh2/a;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "strap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/straphistorysync/sync/e;->k(Ljk0/d;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/e;->b:Lbi2/j;

    invoke-virtual {v0, p1, p2}, Lbi2/j;->c(Ljava/lang/String;Lyh2/a;)Lec3/f2;

    move-result-object p1

    return-object p1
.end method
