.class public final Lio/getstream/chat/android/client/utils/PerformanceUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000cJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J<\u0010\u0014\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0010\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0017\u0010\u000cR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/PerformanceUtils;",
        "",
        "<init>",
        "()V",
        "",
        "taskName",
        "Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;",
        "entry",
        "Ll83/a0;",
        "doMeasureAndUpdateResult",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;)V",
        "startTask",
        "(Ljava/lang/String;)V",
        "stopTask",
        "T",
        "Lkotlin/Function0;",
        "task",
        "(Ljava/lang/String;Lc93/a;)Ljava/lang/Object;",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "suspendTask",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "message",
        "log",
        "",
        "tasks",
        "Ljava/util/Map;",
        "TaskEntry",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

.field private static volatile tasks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/utils/PerformanceUtils;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    sget-object v0, Lm83/z;->w:Lm83/z;

    sput-object v0, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final doMeasureAndUpdateResult(Ljava/lang/String;Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;)V
    .locals 12

    invoke-virtual {p2}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->getLastStart()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-double v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->getSumDuration()D

    move-result-wide v2

    add-double v7, v2, v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->getCount()I

    move-result v2

    add-int/lit8 v6, v2, 0x1

    sget-object v2, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v4, p2

    invoke-static/range {v4 .. v11}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->copy$default(Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;Ljava/lang/String;IDLjava/lang/Long;ILjava/lang/Object;)Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    move-result-object p2

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p2

    sput-object p2, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    int-to-double v2, v6

    div-double/2addr v7, v2

    sget-object p2, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Task \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\" completed for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " seconds\nThe average duration for task \""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" is "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, " seconds"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/utils/PerformanceUtils;->log(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final log(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Performance"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final startTask(Ljava/lang/String;)V
    .locals 12

    const-string v0, "Task \""

    const-string v1, "taskName"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    if-nez v4, :cond_0

    sget-object v3, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    new-instance v4, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v5, p1

    :try_start_1
    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;-><init>(Ljava/lang/String;IDLjava/lang/Long;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v1}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p1, v5

    goto :goto_1

    :cond_0
    sget-object v3, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v4 .. v11}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->copy$default(Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;Ljava/lang/String;IDLjava/lang/Long;ILjava/lang/Object;)Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v1

    :goto_0
    sput-object v1, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    sget-object v1, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" started"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/utils/PerformanceUtils;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw v0
.end method

.method public final stopTask(Ljava/lang/String;)V
    .locals 3

    const-string v0, "There is no such task \""

    const-string v1, "taskName"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p1

    :try_start_0
    sget-object v1, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    if-nez v1, :cond_0

    sget-object v1, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/utils/PerformanceUtils;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object v0, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/utils/PerformanceUtils;->doMeasureAndUpdateResult(Ljava/lang/String;Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    return-void

    :goto_0
    monitor-exit p1

    throw v0
.end method

.method public final suspendTask(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;

    iget v3, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->label:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;-><init>(Lio/getstream/chat/android/client/utils/PerformanceUtils;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->label:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-wide v4, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->J$0:J

    iget v0, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->I$0:I

    iget-object v6, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v2, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v11, v0

    move-object v10, v2

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->getCount()I

    move-result v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iput-object v0, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->L$1:Ljava/lang/Object;

    iput v1, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->I$0:I

    iput-wide v7, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->J$0:J

    iput v6, v2, Lio/getstream/chat/android/client/utils/PerformanceUtils$suspendTask$1;->label:I

    move-object/from16 v5, p2

    invoke-interface {v5, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    return-object v4

    :cond_4
    move-object v10, v0

    move v11, v1

    move-object v1, v2

    move-wide v4, v7

    :goto_2
    sget-object v0, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    new-instance v9, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    new-instance v14, Ljava/lang/Long;

    invoke-direct {v14, v4, v5}, Ljava/lang/Long;-><init>(J)V

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v9 .. v16}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;-><init>(Ljava/lang/String;IDLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10, v9}, Lio/getstream/chat/android/client/utils/PerformanceUtils;->doMeasureAndUpdateResult(Ljava/lang/String;Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;)V

    return-object v1
.end method

.method public final task(Ljava/lang/String;Lc93/a;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")TT;"
        }
    .end annotation

    const-string v0, "taskName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "task"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p1

    :try_start_0
    sget-object v0, Lio/getstream/chat/android/client/utils/PerformanceUtils;->tasks:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;->getCount()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move v3, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    move-object v2, p1

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    sget-object v9, Lio/getstream/chat/android/client/utils/PerformanceUtils;->INSTANCE:Lio/getstream/chat/android/client/utils/PerformanceUtils;

    move-wide v4, v0

    new-instance v1, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p1

    :try_start_3
    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;-><init>(Ljava/lang/String;IDLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v9, v2, v1}, Lio/getstream/chat/android/client/utils/PerformanceUtils;->doMeasureAndUpdateResult(Ljava/lang/String;Lio/getstream/chat/android/client/utils/PerformanceUtils$TaskEntry;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v2

    return-object p2

    :catchall_1
    move-exception v0

    :goto_2
    move-object p2, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, p1

    goto :goto_2

    :goto_3
    monitor-exit v2

    throw p2
.end method
