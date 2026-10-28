.class public final Lcom/iterable/iterableapi/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/l2;


# static fields
.field public static final z:Ljava/util/HashSet;


# instance fields
.field public final w:Lcom/iterable/iterableapi/n2;

.field public final x:La00/g;

.field public final y:Lcom/iterable/iterableapi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Ljava/util/HashSet;

    const-string v10, "events/inAppConsume"

    const-string v11, "users/disableDevice"

    const-string v1, "events/track"

    const-string v2, "events/trackPushOpen"

    const-string v3, "commerce/trackPurchase"

    const-string v4, "events/trackInAppOpen"

    const-string v5, "events/trackInAppClick"

    const-string v6, "events/trackInAppClose"

    const-string v7, "events/trackInboxSession"

    const-string v8, "events/trackInAppDelivery"

    const-string v9, "embedded-messaging/messages"

    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/iterable/iterableapi/j2;->z:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lb9/b;->F:Lb9/b;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    new-instance v0, Lb9/b;

    const-string v2, "NetworkConnectivityManager"

    const/4 v3, 0x1

    invoke-direct {v0, v3}, Lb9/b;-><init>(I)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lb9/b;->z:Ljava/lang/Object;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, v0, Lb9/b;->E:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "connectivity"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/ConnectivityManager;

    iput-object v3, v0, Lb9/b;->y:Ljava/lang/Object;

    const-string v4, "Internet active : "

    :try_start_0
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v5

    if-nez v5, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v3

    const/16 v5, 0xc

    invoke-virtual {v3, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v3

    :goto_0
    iput-boolean v3, v0, Lb9/b;->x:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v4, v0, Lb9/b;->x:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v3, "Error in detecting network availability"

    invoke-static {v2, v3}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    new-instance v3, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v3}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v3}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v3

    iget-object v4, v0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v4, Landroid/net/ConnectivityManager;

    if-eqz v4, :cond_2

    :try_start_1
    new-instance v5, Lcom/iterable/iterableapi/r1;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v6}, Lcom/iterable/iterableapi/r1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3, v5}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    sput-object v0, Lb9/b;->F:Lb9/b;

    :cond_3
    sget-object v0, Lb9/b;->F:Lb9/b;

    sget-object v2, La00/g;->F:La00/g;

    const/4 v3, 0x1

    if-nez v2, :cond_6

    new-instance v2, La00/g;

    const/16 v4, 0x8

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, La00/g;-><init>(IZ)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v2, La00/g;->z:Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v2, La00/g;->E:Ljava/lang/Object;

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    :try_start_2
    iget-object v4, v2, La00/g;->y:Ljava/lang/Object;

    check-cast v4, Lcom/iterable/iterableapi/a0;

    if-nez v4, :cond_5

    new-instance v4, Lcom/iterable/iterableapi/a0;

    const-string v5, "iterable_sdk.db"

    const/4 v6, 0x0

    invoke-direct {v4, p1, v5, v6, v3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    iput-object v4, v2, La00/g;->y:Ljava/lang/Object;

    :cond_5
    iget-object p1, v2, La00/g;->y:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/a0;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iput-object p1, v2, La00/g;->x:Ljava/lang/Object;
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    const-string p1, "IterableTaskStorage"

    const-string v4, "Database cannot be opened for writing"

    invoke-static {p1, v4}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    sput-object v2, La00/g;->F:La00/g;

    :cond_6
    sget-object p1, La00/g;->F:La00/g;

    iput-object p1, p0, Lcom/iterable/iterableapi/j2;->x:La00/g;

    new-instance v2, Lcom/iterable/iterableapi/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v2, Lcom/iterable/iterableapi/a;->a:Z

    iput-object p1, v2, Lcom/iterable/iterableapi/a;->b:La00/g;

    invoke-virtual {p1}, La00/g;->t()Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v3, "HealthMonitor"

    const-string v4, "DB Ready notified to healthMonitor"

    invoke-static {v3, v4}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v1, v2, Lcom/iterable/iterableapi/a;->a:Z

    goto :goto_4

    :cond_7
    const-string v1, "HealthMonitor"

    const-string v4, "DB Error notified to healthMonitor"

    invoke-static {v1, v4}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, v2, Lcom/iterable/iterableapi/a;->a:Z

    :goto_4
    iget-object v1, p1, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v2, p0, Lcom/iterable/iterableapi/j2;->y:Lcom/iterable/iterableapi/a;

    new-instance v1, Lcom/iterable/iterableapi/d2;

    sget-object v3, Lcom/iterable/iterableapi/g;->i:Lcom/iterable/iterableapi/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v4, Landroid/os/HandlerThread;

    const-string v5, "NetworkThread"

    invoke-direct {v4, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Lcom/iterable/iterableapi/d2;->F:Ljava/util/ArrayList;

    iput-object p1, v1, Lcom/iterable/iterableapi/d2;->w:La00/g;

    iput-object v3, v1, Lcom/iterable/iterableapi/d2;->x:Lcom/iterable/iterableapi/g;

    iput-object v0, v1, Lcom/iterable/iterableapi/d2;->y:Lb9/b;

    iput-object v2, v1, Lcom/iterable/iterableapi/d2;->z:Lcom/iterable/iterableapi/a;

    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v2, v4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v2, v1, Lcom/iterable/iterableapi/d2;->E:Landroid/os/Handler;

    iget-object v2, p1, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-enter v0

    :try_start_3
    iget-object v2, v0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    invoke-virtual {v3, v1}, Lcom/iterable/iterableapi/g;->a(Lcom/iterable/iterableapi/f;)V

    new-instance v0, Lcom/iterable/iterableapi/n2;

    invoke-direct {v0, p1, v1}, Lcom/iterable/iterableapi/n2;-><init>(La00/g;Lcom/iterable/iterableapi/d2;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/j2;->w:Lcom/iterable/iterableapi/n2;

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/iterable/iterableapi/j2;->x:La00/g;

    invoke-virtual {v0}, La00/g;->t()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "OfflineTask"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Deleted "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " offline tasks"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IterableTaskStorage"

    invoke-static {v1, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    .locals 18

    move-object/from16 v1, p0

    const-string v0, "OfflineTask"

    new-instance v2, Lcom/iterable/iterableapi/o;

    const-string v6, "POST"

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v9}, Lcom/iterable/iterableapi/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V

    sget-object v3, Lcom/iterable/iterableapi/j2;->z:Ljava/util/HashSet;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v1, Lcom/iterable/iterableapi/j2;->y:Lcom/iterable/iterableapi/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "canSchedule"

    const-string v6, "HealthMonitor"

    invoke-static {v6, v5}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x1

    :try_start_0
    iget-object v7, v3, Lcom/iterable/iterableapi/a;->b:La00/g;

    invoke-virtual {v7}, La00/g;->t()Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v7, v7, La00/g;->x:Ljava/lang/Object;

    check-cast v7, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v7, v0}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    const-wide/16 v8, 0x3e8

    cmp-long v3, v6, v8

    if-gez v3, :cond_a

    sget-object v3, Lcom/iterable/iterableapi/n;->x:Lcom/iterable/iterableapi/m;

    iput-object v3, v2, Lcom/iterable/iterableapi/o;->f:Lcom/iterable/iterableapi/n;

    iget-object v3, v1, Lcom/iterable/iterableapi/j2;->w:Lcom/iterable/iterableapi/n2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    invoke-virtual {v2}, Lcom/iterable/iterableapi/o;->b()Lorg/json/JSONObject;

    move-result-object v6
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v3, v3, Lcom/iterable/iterableapi/n2;->a:La00/g;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, La00/g;->t()Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    new-instance v9, Lcom/iterable/iterableapi/b2;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v9, Lcom/iterable/iterableapi/b2;->a:Ljava/lang/String;

    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    iput-wide v11, v9, Lcom/iterable/iterableapi/b2;->c:J

    new-instance v13, Ljava/util/Date;

    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    invoke-virtual {v13}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    new-instance v15, Ljava/util/Date;

    invoke-direct {v15}, Ljava/util/Date;-><init>()V

    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    move-result-wide v15

    iput-object v6, v9, Lcom/iterable/iterableapi/b2;->i:Ljava/lang/String;

    iput v5, v9, Lcom/iterable/iterableapi/b2;->k:I

    const-string v5, "task_id"

    invoke-virtual {v7, v5, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "name"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget v4, v9, Lcom/iterable/iterableapi/b2;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "version"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "created"

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v4, v9, Lcom/iterable/iterableapi/b2;->d:J

    const-wide/16 v11, 0x0

    cmp-long v17, v4, v11

    move-wide/from16 p1, v11

    if-eqz v17, :cond_1

    const-string v11, "modified"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v11, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_1
    iget-wide v4, v9, Lcom/iterable/iterableapi/b2;->e:J

    cmp-long v11, v4, p1

    if-eqz v11, :cond_2

    const-string v11, "last_attempt"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v11, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_2
    cmp-long v4, v13, p1

    if-eqz v4, :cond_3

    const-string v4, "scheduled"

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_3
    cmp-long v4, v15, p1

    if-eqz v4, :cond_4

    const-string v4, "requested"

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_4
    iget-boolean v4, v9, Lcom/iterable/iterableapi/b2;->f:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "processing"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-boolean v4, v9, Lcom/iterable/iterableapi/b2;->g:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "failed"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-boolean v4, v9, Lcom/iterable/iterableapi/b2;->h:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "blocking"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    if-eqz v6, :cond_5

    const-string v4, "data"

    invoke-virtual {v7, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v4, v9, Lcom/iterable/iterableapi/b2;->j:Ljava/lang/String;

    if-eqz v4, :cond_6

    const-string v5, "error"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    const-string v4, "type"

    const-string v5, "API"

    invoke-virtual {v7, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget v4, v9, Lcom/iterable/iterableapi/b2;->l:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "attempts"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v4, v3, La00/g;->x:Ljava/lang/Object;

    check-cast v4, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v4, v0, v8, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-wide/16 v11, -0x1

    cmp-long v0, v4, v11

    if-nez v0, :cond_7

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Lcom/iterable/iterableapi/e2;

    invoke-direct {v4, v3}, Lcom/iterable/iterableapi/e2;-><init>(La00/g;)V

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_7
    invoke-virtual {v7}, Landroid/content/ContentValues;->clear()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Lcom/iterable/iterableapi/e2;

    invoke-direct {v4, v3, v9}, Lcom/iterable/iterableapi/e2;-><init>(La00/g;Lcom/iterable/iterableapi/b2;)V

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-object v8, v10

    :goto_0
    if-nez v8, :cond_8

    new-instance v0, Lcom/iterable/iterableapi/a2;

    invoke-direct {v0}, Lcom/iterable/iterableapi/a2;-><init>()V

    filled-new-array {v2}, [Lcom/iterable/iterableapi/o;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_8
    sget-object v0, Lcom/iterable/iterableapi/n2;->b:Ljava/util/HashMap;

    move-object/from16 v2, p5

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/iterable/iterableapi/n2;->c:Ljava/util/HashMap;

    move-object/from16 v9, p6

    invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_0
    const-string v0, "RequestProcessor"

    const-string v3, "Failed serializing the request for offline execution. Attempting to request the request now..."

    invoke-static {v0, v3}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/iterable/iterableapi/a2;

    invoke-direct {v0}, Lcom/iterable/iterableapi/a2;-><init>()V

    filled-new-array {v2}, [Lcom/iterable/iterableapi/o;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_9
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "Database is not ready"

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v5, v3, Lcom/iterable/iterableapi/a;->a:Z

    :cond_a
    new-instance v0, Lcom/iterable/iterableapi/a2;

    invoke-direct {v0}, Lcom/iterable/iterableapi/a2;-><init>()V

    filled-new-array {v2}, [Lcom/iterable/iterableapi/o;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_1
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V
    .locals 7

    new-instance v0, Lcom/iterable/iterableapi/o;

    const-string v4, "GET"

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/iterable/iterableapi/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V

    new-instance p1, Lcom/iterable/iterableapi/a2;

    invoke-direct {p1}, Lcom/iterable/iterableapi/a2;-><init>()V

    filled-new-array {v0}, [Lcom/iterable/iterableapi/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
