.class public final Llive/hms/video/transport/RetryScheduler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/RetryScheduler$Companion;,
        Llive/hms/video/transport/RetryScheduler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 72\u00020\u0001:\u00017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0082\u0001\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e26\u0010\u0012\u001a2\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJj\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e26\u0010\u0012\u001a2\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"2\u0006\u0010!\u001a\u00020\u000b\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R(\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010&R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\"0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u001e\u0010,\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030+0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00068"
    }
    d2 = {
        "Llive/hms/video/transport/RetryScheduler;",
        "",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Lkotlin/Function2;",
        "Llive/hms/video/transport/models/TransportState;",
        "Llive/hms/video/error/HMSException;",
        "Ll83/a0;",
        "onStateChange",
        "<init>",
        "(Llive/hms/video/events/AnalyticsEventsService;Lc93/m;)V",
        "Llive/hms/video/transport/models/TransportFailureCategory;",
        "category",
        "error",
        "",
        "shouldSendStateUpdate",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "task",
        "",
        "maxRetryInMillis",
        "failedAtMillis",
        "isFirstFailure",
        "",
        "retries",
        "schedule",
        "(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;",
        "sendEvent",
        "(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;)V",
        "maxFailedRetries",
        "(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;)Ljava/lang/Object;",
        "reset",
        "()V",
        "tfc",
        "Lbc3/s;",
        "getDependecyForCategory",
        "(Llive/hms/video/transport/models/TransportFailureCategory;)Lbc3/s;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "Lc93/m;",
        "Ljava/util/HashMap;",
        "inProgress",
        "Ljava/util/HashMap;",
        "Ljava/util/ArrayList;",
        "Ljava/util/concurrent/ScheduledFuture;",
        "retryFutures",
        "Ljava/util/ArrayList;",
        "Llive/hms/video/sdk/models/enums/RetrySchedulerState;",
        "state",
        "Llive/hms/video/sdk/models/enums/RetrySchedulerState;",
        "getState$lib_release",
        "()Llive/hms/video/sdk/models/enums/RetrySchedulerState;",
        "setState$lib_release",
        "(Llive/hms/video/sdk/models/enums/RetrySchedulerState;)V",
        "errorOccuredAtMillis",
        "J",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/transport/RetryScheduler$Companion;

.field private static final TAG:Ljava/lang/String; = "RetryScheduler"


# instance fields
.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private errorOccuredAtMillis:J

.field private final inProgress:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Lbc3/s;",
            ">;"
        }
    .end annotation
.end field

.field private final onStateChange:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final retryFutures:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;>;"
        }
    .end annotation
.end field

.field private state:Llive/hms/video/sdk/models/enums/RetrySchedulerState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/transport/RetryScheduler$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/transport/RetryScheduler$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/transport/RetryScheduler;->Companion:Llive/hms/video/transport/RetryScheduler$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/events/AnalyticsEventsService;Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "analyticsEventsService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStateChange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/transport/RetryScheduler;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p2, p0, Llive/hms/video/transport/RetryScheduler;->onStateChange:Lc93/m;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/transport/RetryScheduler;->retryFutures:Ljava/util/ArrayList;

    sget-object p1, Llive/hms/video/sdk/models/enums/RetrySchedulerState;->PREVIEW:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    iput-object p1, p0, Llive/hms/video/transport/RetryScheduler;->state:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    return-void
.end method

.method public static final synthetic access$getInProgress$p(Llive/hms/video/transport/RetryScheduler;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic access$getOnStateChange$p(Llive/hms/video/transport/RetryScheduler;)Lc93/m;
    .locals 0

    iget-object p0, p0, Llive/hms/video/transport/RetryScheduler;->onStateChange:Lc93/m;

    return-object p0
.end method

.method public static final synthetic access$schedule(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p11}, Llive/hms/video/transport/RetryScheduler;->schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Llive/hms/video/error/HMSException;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "JJZI",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v3, p10

    move-object/from16 v4, p11

    instance-of v5, v4, Llive/hms/video/transport/RetryScheduler$schedule$2;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Llive/hms/video/transport/RetryScheduler$schedule$2;

    iget v6, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->label:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Llive/hms/video/transport/RetryScheduler$schedule$2;

    invoke-direct {v5, v1, v4}, Llive/hms/video/transport/RetryScheduler$schedule$2;-><init>(Llive/hms/video/transport/RetryScheduler;Lq83/d;)V

    :goto_0
    iget-object v4, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->result:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    .line 2
    iget v7, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->label:I

    const-string v8, "schedule: ["

    const/4 v9, 0x3

    const/4 v10, 0x2

    const-string v12, "RetryScheduler"

    const/4 v13, 0x1

    if-eqz v7, :cond_4

    if-eq v7, v13, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_1

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    iget-object v2, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/e0;

    iget-object v3, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$0:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/transport/RetryScheduler;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_10

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$3:I

    iget v2, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$2:I

    iget v3, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$1:I

    iget v7, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$0:I

    iget-wide v14, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->J$1:J

    iget-wide v9, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->J$0:J

    iget-boolean v11, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->Z$0:Z

    iget-object v13, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$7:Ljava/lang/Object;

    check-cast v13, Lbc3/s;

    iget-object v13, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$6:Ljava/lang/Object;

    check-cast v13, Llive/hms/video/transport/models/TransportFailureCategory;

    move/from16 p1, v0

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$5:Ljava/lang/Object;

    check-cast v0, [Llive/hms/video/transport/models/TransportFailureCategory;

    move-object/from16 p2, v0

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$4:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    move-object/from16 p3, v0

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$3:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object/from16 p4, v0

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$2:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/error/HMSException;

    move-object/from16 p5, v0

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$1:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/models/TransportFailureCategory;

    move-object/from16 p6, v0

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/RetryScheduler;

    :try_start_0
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v4, p4

    move-object/from16 v18, v8

    move-object v1, v13

    move-wide/from16 v19, v14

    move-object/from16 v15, p2

    move-object/from16 p2, p3

    move v8, v3

    move-wide v13, v9

    move-object v9, v5

    move v10, v7

    move/from16 v5, p1

    move-object/from16 p1, p5

    move-object v7, v0

    move-object v0, v6

    move v6, v2

    move-object/from16 v2, p6

    goto/16 :goto_5

    :catch_0
    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v18, v8

    move-wide/from16 v19, v14

    move-object/from16 v15, p2

    move/from16 v33, v7

    move-object v7, v0

    move-object v0, v6

    move-object v6, v13

    move-wide v13, v9

    move/from16 v10, v33

    goto/16 :goto_c

    :cond_3
    iget v2, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$0:I

    iget-object v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$0:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Llive/hms/video/transport/models/TransportFailureCategory;

    :try_start_1
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v33, v3

    move v3, v2

    move-object/from16 v2, v33

    goto :goto_1

    :cond_4
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    .line 3
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "schedule: category="

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " error="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v12, v4}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v4, Lkotlin/jvm/internal/e0;

    .line 5
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 6
    iput v3, v4, Lkotlin/jvm/internal/e0;->w:I

    if-eqz p9, :cond_7

    .line 7
    iget-object v7, v1, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbc3/s;

    if-eqz v7, :cond_6

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "schedule: Already a task for "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " scheduled, waiting for its completion"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    :try_start_2
    iput-object v2, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$0:Ljava/lang/Object;

    iput v3, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$0:I

    const/4 v0, 0x1

    iput v0, v5, Llive/hms/video/transport/RetryScheduler$schedule$2;->label:I

    check-cast v7, Lbc3/t;

    .line 10
    invoke-virtual {v7, v5}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-ne v0, v6, :cond_5

    move-object v0, v6

    goto/16 :goto_f

    :catch_2
    move-exception v0

    .line 11
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] de-duplicated retry ended exceptionally; primary task already handled it - ignoring. "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    move v2, v3

    .line 14
    :goto_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(I)V

    return-object v0

    .line 15
    :cond_6
    iget-object v7, v1, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v9

    invoke-interface {v7, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v7, 0x0

    .line 16
    invoke-virtual {v0, v7}, Llive/hms/video/error/HMSException;->setTerminal(Z)V

    .line 17
    invoke-direct {v1, v0, v2}, Llive/hms/video/transport/RetryScheduler;->sendEvent(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;)V

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    .line 18
    :goto_3
    sget-object v9, Llive/hms/video/transport/models/TransportFailureCategory;->Companion:Llive/hms/video/transport/models/TransportFailureCategory$Companion;

    invoke-virtual {v9}, Llive/hms/video/transport/models/TransportFailureCategory$Companion;->getDependencies()Ljava/util/HashMap;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Llive/hms/video/transport/models/TransportFailureCategory;

    if-nez v9, :cond_8

    new-array v9, v7, [Llive/hms/video/transport/models/TransportFailureCategory;

    .line 19
    :cond_8
    array-length v10, v9

    move-wide/from16 v13, p7

    move-object/from16 v19, v6

    move/from16 p1, v7

    move-object/from16 v18, v8

    move-object v15, v9

    move v11, v10

    move-wide/from16 v9, p5

    move-object v7, v1

    move-object v1, v4

    move-object v6, v5

    move/from16 v8, p1

    move-object/from16 v4, p4

    move v5, v3

    move/from16 v3, p3

    :goto_4
    if-ge v8, v11, :cond_b

    move/from16 p2, v11

    aget-object v11, v15, v8

    move/from16 p3, v8

    .line 20
    :try_start_3
    iget-object v8, v7, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    invoke-virtual {v8, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbc3/s;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    if-eqz v8, :cond_a

    move/from16 p4, v5

    .line 21
    :try_start_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    move-wide/from16 p5, v13

    :try_start_5
    const-string v13, "schedule: Suspending retry task of "

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", waiting for "

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    const-string v13, " to recover"

    .line 23
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v5}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    iput-object v7, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$1:Ljava/lang/Object;

    iput-object v0, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$2:Ljava/lang/Object;

    iput-object v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$3:Ljava/lang/Object;

    iput-object v1, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$4:Ljava/lang/Object;

    iput-object v15, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$5:Ljava/lang/Object;

    iput-object v11, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$6:Ljava/lang/Object;

    iput-object v8, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$7:Ljava/lang/Object;

    iput-boolean v3, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->Z$0:Z

    iput-wide v9, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->J$0:J
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8

    move-wide/from16 v13, p5

    :try_start_6
    iput-wide v13, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->J$1:J
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    move/from16 v5, p4

    :try_start_7
    iput v5, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$0:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    move-object/from16 p4, v0

    move/from16 v0, p1

    :try_start_8
    iput v0, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$1:I

    move/from16 p1, v0

    move/from16 v0, p3

    iput v0, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$2:I

    move/from16 p3, v0

    move/from16 v0, p2

    iput v0, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->I$3:I

    move/from16 p2, v0

    const/4 v0, 0x2

    iput v0, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->label:I

    check-cast v8, Lbc3/t;

    .line 25
    invoke-virtual {v8, v6}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    sget-object v16, Lr83/a;->w:Lr83/a;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    move-object/from16 v0, v19

    if-ne v8, v0, :cond_9

    goto/16 :goto_f

    :cond_9
    move/from16 v8, p1

    move-object/from16 p1, p4

    move-wide/from16 v19, v13

    move-wide v13, v9

    move v10, v5

    move-object v9, v6

    move/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 p2, v1

    move-object v1, v11

    move v11, v3

    .line 26
    :goto_5
    :try_start_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    move-object/from16 p3, v4

    :try_start_a
    const-string v4, "schedule: Resuming retry task of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " as "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    const-string v4, " is recovered"

    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3

    move v1, v10

    move v10, v5

    move v5, v1

    move-object v1, v9

    move v9, v6

    move-object v6, v1

    move-object/from16 v1, p1

    move-object/from16 v4, p3

    move-object v3, v2

    move-object/from16 v2, p2

    :goto_6
    const/16 v17, 0x1

    goto :goto_b

    :catch_3
    move-object/from16 v3, p2

    move-object/from16 v4, p3

    :goto_7
    move-object v6, v1

    move-object v5, v9

    move-object/from16 v1, p1

    goto/16 :goto_c

    :catch_4
    move-object/from16 p3, v4

    move-object/from16 v3, p2

    goto :goto_7

    :goto_8
    move-wide/from16 v19, v13

    move-wide v13, v9

    move v10, v5

    move-object v5, v6

    move-object v6, v11

    move v11, v3

    move-object v3, v1

    move-object/from16 v1, p4

    goto :goto_c

    :catch_5
    :goto_9
    move-object/from16 v0, v19

    goto :goto_8

    :catch_6
    :goto_a
    move-object/from16 p4, v0

    goto :goto_9

    :catch_7
    move/from16 v5, p4

    goto :goto_a

    :catch_8
    move/from16 v5, p4

    move-wide/from16 v13, p5

    goto :goto_a

    :cond_a
    move-object/from16 p4, v0

    move-object/from16 v0, v19

    move/from16 v8, p1

    move v11, v3

    move-wide/from16 v19, v13

    move-object v3, v2

    move-wide v13, v9

    move/from16 v10, p2

    move/from16 v9, p3

    move-object v2, v1

    move-object/from16 v1, p4

    goto :goto_6

    :goto_b
    add-int/lit8 v9, v9, 0x1

    move/from16 p1, v8

    move v8, v9

    move-wide/from16 v33, v19

    move-object/from16 v19, v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move v3, v11

    move v11, v10

    move-wide v9, v13

    move-wide/from16 v13, v33

    goto/16 :goto_4

    .line 29
    :goto_c
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "schedule: Stopping retry task of "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " as it\'s dependency "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    const-string v6, " failed to recover"

    .line 31
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v12, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v26, v3

    move-object v6, v5

    move/from16 v30, v10

    move/from16 v25, v11

    move-wide/from16 v28, v13

    move-wide/from16 v23, v19

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x1

    :goto_d
    move-object/from16 v20, v4

    goto :goto_e

    :cond_b
    move-object/from16 p4, v0

    move-object/from16 v0, v19

    move-object/from16 v26, v1

    move/from16 v25, v3

    move/from16 v30, v5

    move-wide/from16 v28, v9

    move-wide/from16 v23, v13

    move/from16 v1, p1

    move-object v3, v2

    move-object/from16 v2, p4

    goto :goto_d

    .line 32
    :goto_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v4, v4, v23

    cmp-long v4, v4, v28

    if-gez v4, :cond_c

    if-eqz v1, :cond_d

    :cond_c
    move-object v0, v2

    move-object v2, v3

    move-object v3, v7

    move-wide/from16 v9, v28

    goto/16 :goto_11

    :cond_d
    if-eqz v25, :cond_e

    .line 33
    iget-object v1, v7, Llive/hms/video/transport/RetryScheduler;->onStateChange:Lc93/m;

    sget-object v4, Llive/hms/video/transport/models/TransportState;->Reconnecting:Llive/hms/video/transport/models/TransportState;

    invoke-interface {v1, v4, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_e
    sget-object v1, Llive/hms/video/transport/RetryScheduler;->Companion:Llive/hms/video/transport/RetryScheduler$Companion;

    invoke-virtual {v1, v3}, Llive/hms/video/transport/RetryScheduler$Companion;->getDelayForCategory(Llive/hms/video/transport/models/TransportFailureCategory;)J

    move-result-wide v4

    .line 35
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    .line 36
    new-instance v8, Ljava/lang/StringBuilder;

    move-object/from16 v9, v18

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, "] Scheduling retry task in "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    const-string v9, "ms"

    .line 38
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 39
    invoke-virtual {v1, v12, v8}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v31

    .line 41
    sget-object v1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-static {}, Llive/hms/video/utils/HMSConstantsKt;->getCMaxTransportRetryDelayUnit()Ljava/util/concurrent/TimeUnit;

    move-result-object v8

    new-instance v19, Llive/hms/video/transport/RetryScheduler$schedule$future$1;

    const/16 v32, 0x0

    move-object/from16 v27, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v7

    invoke-direct/range {v19 .. v32}, Llive/hms/video/transport/RetryScheduler$schedule$future$1;-><init>(Lkotlin/jvm/functions/Function1;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/transport/RetryScheduler;JZLkotlin/jvm/internal/e0;Llive/hms/video/error/HMSException;JILbc3/s;Lq83/d;)V

    move-object/from16 v9, v19

    move-object/from16 v3, v22

    move-object/from16 v2, v26

    move-object/from16 v7, v31

    invoke-virtual {v1, v4, v5, v8, v9}, Llive/hms/video/utils/HMSCoroutineScope;->schedule(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    .line 42
    iget-object v4, v3, Llive/hms/video/transport/RetryScheduler;->retryFutures:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    iput-object v3, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$0:Ljava/lang/Object;

    iput-object v2, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$1:Ljava/lang/Object;

    iput-object v1, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$2:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$3:Ljava/lang/Object;

    iput-object v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$4:Ljava/lang/Object;

    iput-object v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$5:Ljava/lang/Object;

    iput-object v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$6:Ljava/lang/Object;

    iput-object v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->L$7:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, v6, Llive/hms/video/transport/RetryScheduler$schedule$2;->label:I

    .line 44
    invoke-virtual {v7, v6}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lr83/a;->w:Lr83/a;

    if-ne v4, v0, :cond_f

    :goto_f
    return-object v0

    :cond_f
    move-object v0, v1

    .line 45
    :goto_10
    iget-object v1, v3, Llive/hms/video/transport/RetryScheduler;->retryFutures:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 46
    iget v0, v2, Lkotlin/jvm/internal/e0;->w:I

    .line 47
    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    return-object v1

    .line 48
    :goto_11
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Llive/hms/video/error/HMSException;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ". ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "] Could not recover in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    const-string v5, " milli seconds."

    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Llive/hms/video/error/HMSException;->setDescription$lib_release(Ljava/lang/String;)V

    if-eqz v1, :cond_11

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Llive/hms/video/error/HMSException;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Could not recover all of it\'s required dependencies - ["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v15

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    array-length v5, v15

    const/4 v11, 0x0

    :goto_12
    if-ge v11, v5, :cond_10

    aget-object v6, v15, v11

    .line 54
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    .line 55
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_12

    .line 56
    :cond_10
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5d

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/error/HMSException;->setDescription$lib_release(Ljava/lang/String;)V

    .line 57
    :cond_11
    iget-object v1, v3, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/s;

    if-eqz v1, :cond_12

    check-cast v1, Lbc3/t;

    invoke-virtual {v1, v0}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :cond_12
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Llive/hms/video/error/HMSException;->setTerminal(Z)V

    .line 59
    invoke-direct {v3, v0, v2}, Llive/hms/video/transport/RetryScheduler;->sendEvent(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;)V

    if-eqz v25, :cond_13

    .line 60
    iget-object v2, v3, Llive/hms/video/transport/RetryScheduler;->onStateChange:Lc93/m;

    sget-object v3, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    invoke-interface {v2, v3, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v30, 0x1

    .line 61
    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    return-object v1

    .line 62
    :cond_13
    throw v0
.end method

.method public static synthetic schedule$default(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v11, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v12, p11

    goto :goto_1

    :cond_0
    move/from16 v11, p10

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {v1 .. v12}, Llive/hms/video/transport/RetryScheduler;->schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic schedule$default(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const-wide/32 v0, 0xea60

    move-wide v7, v0

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object/from16 v9, p7

    goto :goto_1

    :cond_0
    move-wide v7, p5

    goto :goto_0

    .line 1
    :goto_1
    invoke-virtual/range {v2 .. v9}, Llive/hms/video/transport/RetryScheduler;->schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final sendEvent(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;)V
    .locals 1

    sget-object v0, Llive/hms/video/transport/RetryScheduler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_1

    const/4 p1, 0x5

    if-ne p2, p1, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->state:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    invoke-virtual {p2, p1, v0}, Llive/hms/video/events/AnalyticsEventFactory;->connect(Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/RetrySchedulerState;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object p2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {p2, p1}, Llive/hms/video/events/AnalyticsEventFactory;->subscribeFail(Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object p2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {p2, p1}, Llive/hms/video/events/AnalyticsEventFactory;->publishFail(Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->state:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    invoke-virtual {p2, p1, v0}, Llive/hms/video/events/AnalyticsEventFactory;->disconnect(Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/RetrySchedulerState;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    :goto_0
    instance-of p2, p1, Llive/hms/video/events/AnalyticsEvent;

    if-eqz p2, :cond_5

    iget-object p2, p0, Llive/hms/video/transport/RetryScheduler;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    check-cast p1, Llive/hms/video/events/AnalyticsEvent;

    invoke-virtual {p2, p1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    :cond_5
    return-void
.end method


# virtual methods
.method public final getDependecyForCategory(Llive/hms/video/transport/models/TransportFailureCategory;)Lbc3/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            ")",
            "Lbc3/s;"
        }
    .end annotation

    const-string v0, "tfc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/s;

    return-object p1
.end method

.method public final getState$lib_release()Llive/hms/video/sdk/models/enums/RetrySchedulerState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->state:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    return-object v0
.end method

.method public final reset()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->retryFutures:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->retryFutures:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler;->inProgress:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JLq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Llive/hms/video/error/HMSException;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/16 v12, 0x80

    const/4 v13, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-wide/from16 v5, p5

    move-object/from16 v11, p7

    invoke-static/range {v0 .. v13}, Llive/hms/video/transport/RetryScheduler;->schedule$default(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setState$lib_release(Llive/hms/video/sdk/models/enums/RetrySchedulerState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/transport/RetryScheduler;->state:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    return-void
.end method
