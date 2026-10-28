.class public final Lrc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final E:Ljava/lang/String;

.field public static final F:J


# instance fields
.field public final w:Landroid/content/Context;

.field public final x:Ljc/v;

.field public final y:Lbu/c;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "ForceStopRunnable"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lrc/b;->E:Ljava/lang/String;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xe42

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lrc/b;->F:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljc/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lrc/b;->w:Landroid/content/Context;

    iput-object p2, p0, Lrc/b;->x:Ljc/v;

    iget-object p1, p2, Ljc/v;->g:Lbu/c;

    iput-object p1, p0, Lrc/b;->y:Lbu/c;

    const/4 p1, 0x0

    iput p1, p0, Lrc/b;->z:I

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_0

    const/high16 v1, 0xa000000

    goto :goto_0

    :cond_0
    const/high16 v1, 0x8000000

    :goto_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    new-instance v3, Landroid/content/ComponentName;

    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v3, -0x1

    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-wide v3, Lrc/b;->F:J

    add-long/2addr v1, v3

    if-eqz v0, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    move-object/from16 v1, p0

    const-string v2, "last_force_stop_ms"

    iget-object v3, v1, Lrc/b;->y:Lbu/c;

    iget-object v4, v1, Lrc/b;->x:Ljc/v;

    iget-object v5, v4, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    iget-object v6, v4, Ljc/v;->b:Lic/b;

    iget-object v0, v4, Ljc/v;->g:Lbu/c;

    iget-object v7, v4, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    sget-object v8, Llc/c;->F:Ljava/lang/String;

    iget-object v8, v1, Lrc/b;->w:Landroid/content/Context;

    invoke-static {v8}, Llc/a;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    move-result-object v9

    invoke-static {v8, v9}, Llc/c;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object v10

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->e()Lqc/i;

    move-result-object v11

    iget-object v11, v11, Lqc/i;->a:Landroidx/room/z0;

    new-instance v12, Lpl0/a;

    const/16 v13, 0x17

    invoke-direct {v12, v13}, Lpl0/a;-><init>(I)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v11, v13, v14, v12}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v12

    goto :goto_0

    :cond_0
    move v12, v14

    :goto_0
    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15, v12}, Ljava/util/HashSet;-><init>(I)V

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_2

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/app/job/JobInfo;

    invoke-static {v12}, Llc/c;->f(Landroid/app/job/JobInfo;)Lqc/j;

    move-result-object v13

    if-eqz v13, :cond_1

    iget-object v12, v13, Lqc/j;->a:Ljava/lang/String;

    invoke-virtual {v15, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {v12}, Landroid/app/job/JobInfo;->getId()I

    move-result v12

    invoke-static {v9, v12}, Llc/c;->b(Landroid/app/job/JobScheduler;I)V

    :goto_2
    const/4 v13, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v15, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v9

    sget-object v10, Llc/c;->F:Ljava/lang/String;

    const-string v12, "Reconciling jobs"

    invoke-virtual {v9, v10, v12}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v9, 0x1

    goto :goto_3

    :cond_4
    move v9, v14

    :goto_3
    const-wide/16 v12, -0x1

    if-eqz v9, :cond_6

    invoke-virtual {v5}, Landroidx/room/z0;->beginTransaction()V

    :try_start_0
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v10

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v10, v12, v13, v15}, Lqc/u;->g(JLjava/lang/String;)I

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_5
    invoke-virtual {v5}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5}, Landroidx/room/z0;->endTransaction()V

    goto :goto_6

    :goto_5
    invoke-virtual {v5}, Landroidx/room/z0;->endTransaction()V

    throw v0

    :cond_6
    :goto_6
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v5

    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->g()Lqc/n;

    move-result-object v10

    invoke-virtual {v7}, Landroidx/room/z0;->beginTransaction()V

    :try_start_1
    iget-object v11, v5, Lqc/u;->a:Landroidx/room/z0;

    new-instance v15, Lpl0/a;

    const/16 v12, 0x19

    invoke-direct {v15, v12}, Lpl0/a;-><init>(I)V

    const/4 v12, 0x1

    invoke-static {v11, v12, v14, v15}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    if-eqz v11, :cond_7

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_7

    const/4 v12, 0x1

    goto :goto_7

    :catchall_1
    move-exception v0

    goto/16 :goto_10

    :cond_7
    move v12, v14

    :goto_7
    if-eqz v12, :cond_8

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lqc/q;

    sget-object v15, Lic/m0;->w:Lic/m0;

    iget-object v13, v13, Lqc/q;->a:Ljava/lang/String;

    invoke-virtual {v5, v15, v13}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    const/16 v15, -0x200

    invoke-virtual {v5, v15, v13}, Lqc/u;->k(ILjava/lang/String;)V

    const-wide/16 v14, -0x1

    invoke-virtual {v5, v14, v15, v13}, Lqc/u;->g(JLjava/lang/String;)I

    const/4 v14, 0x0

    goto :goto_8

    :cond_8
    iget-object v5, v10, Lqc/n;->a:Landroidx/room/z0;

    new-instance v10, Lpl0/a;

    const/16 v11, 0x18

    invoke-direct {v10, v11}, Lpl0/a;-><init>(I)V

    const/4 v11, 0x1

    const/4 v13, 0x0

    invoke-static {v5, v13, v11, v10}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    invoke-virtual {v7}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v7}, Landroidx/room/z0;->endTransaction()V

    if-nez v12, :cond_a

    if-eqz v9, :cond_9

    goto :goto_9

    :cond_9
    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    :goto_9
    move v13, v11

    :goto_a
    iget-object v5, v0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v5, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c()Lqc/e;

    move-result-object v5

    const-string v9, "reschedule_needed"

    invoke-virtual {v5, v9}, Lqc/e;->a(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    const-wide/16 v10, 0x0

    sget-object v12, Lrc/b;->E:Ljava/lang/String;

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    const-wide/16 v16, 0x1

    cmp-long v5, v14, v16

    if-nez v5, :cond_b

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    const-string v3, "Rescheduling Workers."

    invoke-virtual {v2, v12, v3}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljc/v;->i()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lqc/d;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v2, v9, v3}, Lqc/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v0, v0, Lbu/c;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lqc/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqc/e;->b(Lqc/d;)V

    return-void

    :cond_b
    :try_start_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-lt v0, v5, :cond_c

    const/high16 v5, 0x22000000

    goto :goto_b

    :cond_c
    const/high16 v5, 0x20000000

    :goto_b
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    new-instance v14, Landroid/content/ComponentName;

    const-class v15, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    invoke-direct {v14, v8, v15}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v9, v14}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v14, "ACTION_FORCE_STOP_RESCHEDULE"

    invoke-virtual {v9, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v14, -0x1

    invoke-static {v8, v14, v9, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    const/16 v9, 0x1e

    if-lt v0, v9, :cond_10

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Landroid/app/PendingIntent;->cancel()V

    goto :goto_c

    :catch_0
    move-exception v0

    goto :goto_e

    :catch_1
    move-exception v0

    goto :goto_e

    :cond_d
    :goto_c
    const-string v0, "activity"

    invoke-virtual {v8, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-virtual {v0, v5, v8, v8}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_11

    iget-object v5, v3, Lbu/c;->w:Ljava/lang/Object;

    check-cast v5, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c()Lqc/e;

    move-result-object v5

    invoke-virtual {v5, v2}, Lqc/e;->a(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    :cond_e
    move v14, v8

    :goto_d
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v14, v5, :cond_11

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Los/a;->i(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v8

    const/16 v9, 0xa

    if-ne v8, v9, :cond_f

    invoke-virtual {v5}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v8

    cmp-long v5, v8, v10

    if-ltz v5, :cond_f

    goto :goto_f

    :cond_f
    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    :cond_10
    if-nez v5, :cond_11

    invoke-static {v8}, Lrc/b;->c(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_f

    :cond_11
    if-eqz v13, :cond_12

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    const-string v2, "Found unfinished work, scheduling it."

    invoke-virtual {v0, v12, v2}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Ljc/v;->e:Ljava/util/List;

    invoke-static {v6, v7, v0}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_12
    return-void

    :goto_e
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    iget v5, v5, Lic/w;->a:I

    const/4 v7, 0x5

    if-gt v5, v7, :cond_13

    const-string v5, "Ignoring exception"

    invoke-static {v12, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_13
    :goto_f
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    const-string v5, "Application was force-stopped, rescheduling."

    invoke-virtual {v0, v12, v5}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljc/v;->i()V

    iget-object v0, v6, Lic/b;->d:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lqc/d;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Lqc/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v2, v3, Lbu/c;->w:Ljava/lang/Object;

    check-cast v2, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()Lqc/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqc/e;->b(Lqc/d;)V

    return-void

    :goto_10
    invoke-virtual {v7}, Landroidx/room/z0;->endTransaction()V

    throw v0
.end method

.method public final b()Z
    .locals 5

    iget-object v0, p0, Lrc/b;->x:Ljc/v;

    iget-object v0, v0, Ljc/v;->b:Lic/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    sget-object v2, Lrc/b;->E:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    const-string v1, "The default process name was not specified."

    invoke-virtual {v0, v2, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v1, p0, Lrc/b;->w:Landroid/content/Context;

    invoke-static {v1, v0}, Lrc/h;->a(Landroid/content/Context;Lic/b;)Z

    move-result v0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Is default app process = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public final run()V
    .locals 12

    iget-object v0, p0, Lrc/b;->w:Landroid/content/Context;

    sget-object v1, Lrc/b;->E:Ljava/lang/String;

    iget-object v2, p0, Lrc/b;->x:Ljc/v;

    :try_start_0
    invoke-virtual {p0}, Lrc/b;->b()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljc/v;->h()V

    return-void

    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    invoke-static {v0}, Lts/o;->E(Landroid/content/Context;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    const-string v4, "Performing cleanup operations."

    invoke-virtual {v3, v1, v4}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p0}, Lrc/b;->a()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v2}, Ljc/v;->h()V

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v3

    goto :goto_1

    :catch_2
    move-exception v3

    goto :goto_1

    :catch_3
    move-exception v3

    goto :goto_1

    :catch_4
    move-exception v3

    goto :goto_1

    :catch_5
    move-exception v3

    goto :goto_1

    :catch_6
    move-exception v3

    goto :goto_1

    :catch_7
    move-exception v3

    goto :goto_1

    :catch_8
    move-exception v3

    :goto_1
    :try_start_4
    iget v4, p0, Lrc/b;->z:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lrc/b;->z:I

    const/4 v5, 0x3

    if-lt v4, v5, :cond_2

    invoke-static {v0}, Lge3/g;->G(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    goto :goto_2

    :cond_1
    const-string v0, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"

    :goto_2
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    invoke-virtual {v4, v1, v0, v3}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v2, Ljc/v;->b:Lic/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v1

    :cond_2
    int-to-long v6, v4

    const-wide/16 v8, 0x12c

    mul-long/2addr v6, v8

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Retrying after "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget v4, v4, Lic/w;->a:I

    if-gt v4, v5, :cond_3

    invoke-static {v1, v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    iget v3, p0, Lrc/b;->z:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    int-to-long v3, v3

    mul-long/2addr v3, v8

    :try_start_5
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catch_9
    move-exception v0

    :try_start_6
    const-string v3, "Unexpected SQLite exception during migrations"

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    invoke-virtual {v4, v1, v3}, Lic/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v2, Ljc/v;->b:Lic/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    invoke-virtual {v2}, Ljc/v;->h()V

    throw v0
.end method
