.class public final Ltt/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltt/d;


# static fields
.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Ldt/g;

.field public final b:Lvt/c;

.field public final c:Lpg3/o;

.field public final d:Ltt/i;

.field public final e:Lgt/l;

.field public final f:Ltt/g;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Lht/j;

.field public j:Ljava/lang/String;

.field public final k:Ljava/util/HashSet;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltt/c;->m:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ldt/g;Lst/a;Ljava/util/concurrent/ExecutorService;Lht/j;)V
    .locals 5

    new-instance v0, Lvt/c;

    invoke-virtual {p1}, Ldt/g;->a()V

    iget-object v1, p1, Ldt/g;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lvt/c;-><init>(Landroid/content/Context;Lst/a;)V

    new-instance p2, Lpg3/o;

    invoke-direct {p2, p1}, Lpg3/o;-><init>(Ldt/g;)V

    sget-object v1, Ljc/b;->x:Ljc/b;

    if-nez v1, :cond_0

    new-instance v1, Ljc/b;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ljc/b;-><init>(I)V

    sput-object v1, Ljc/b;->x:Ljc/b;

    :cond_0
    sget-object v1, Ljc/b;->x:Ljc/b;

    sget-object v2, Ltt/i;->d:Ltt/i;

    if-nez v2, :cond_1

    new-instance v2, Ltt/i;

    invoke-direct {v2, v1}, Ltt/i;-><init>(Ljc/b;)V

    sput-object v2, Ltt/i;->d:Ltt/i;

    :cond_1
    sget-object v1, Ltt/i;->d:Ltt/i;

    new-instance v2, Lgt/l;

    new-instance v3, Lgt/d;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v4}, Lgt/d;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v3}, Lgt/l;-><init>(Lst/a;)V

    new-instance v3, Ltt/g;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Ltt/c;->g:Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    iput-object v4, p0, Ltt/c;->k:Ljava/util/HashSet;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Ltt/c;->l:Ljava/util/ArrayList;

    iput-object p1, p0, Ltt/c;->a:Ldt/g;

    iput-object v0, p0, Ltt/c;->b:Lvt/c;

    iput-object p2, p0, Ltt/c;->c:Lpg3/o;

    iput-object v1, p0, Ltt/c;->d:Ltt/i;

    iput-object v2, p0, Ltt/c;->e:Lgt/l;

    iput-object v3, p0, Ltt/c;->f:Ltt/g;

    iput-object p3, p0, Ltt/c;->h:Ljava/util/concurrent/ExecutorService;

    iput-object p4, p0, Ltt/c;->i:Lht/j;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    sget-object v0, Ltt/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltt/c;->a:Ldt/g;

    invoke-virtual {v1}, Ldt/g;->a()V

    iget-object v1, v1, Ldt/g;->a:Landroid/content/Context;

    invoke-static {v1}, Lpg3/o;->n0(Landroid/content/Context;)Lpg3/o;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Ltt/c;->c:Lpg3/o;

    invoke-virtual {v2}, Lpg3/o;->t0()Lut/a;

    move-result-object v2

    iget v3, v2, Lut/a;->b:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :cond_1
    :goto_0
    if-eqz v5, :cond_2

    invoke-virtual {p0, v2}, Ltt/c;->f(Lut/a;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ltt/c;->c:Lpg3/o;

    invoke-virtual {v2}, Lut/a;->a()Lpa3/b;

    move-result-object v2

    iput-object v3, v2, Lpa3/b;->b:Ljava/lang/String;

    const/4 v3, 0x3

    iput v3, v2, Lpa3/b;->c:I

    invoke-virtual {v2}, Lpa3/b;->a()Lut/a;

    move-result-object v2

    invoke-virtual {v4, v2}, Lpg3/o;->q0(Lut/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_3

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    :try_start_2
    invoke-virtual {v1}, Lpg3/o;->u0()V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_4

    :cond_3
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p0, v2}, Ltt/c;->i(Lut/a;)V

    iget-object v0, p0, Ltt/c;->i:Lht/j;

    new-instance v1, Ltt/b;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Ltt/b;-><init>(Ltt/c;I)V

    invoke-virtual {v0, v1}, Lht/j;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_3
    if-eqz v1, :cond_4

    :try_start_3
    invoke-virtual {v1}, Lpg3/o;->u0()V

    :cond_4
    throw v2

    :goto_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final b(Lut/a;)Lut/a;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Ltt/c;->b:Lvt/c;

    iget-object v3, v1, Ltt/c;->a:Ldt/g;

    invoke-virtual {v3}, Ldt/g;->a()V

    iget-object v3, v3, Ldt/g;->c:Ldt/i;

    iget-object v3, v3, Ldt/i;->a:Ljava/lang/String;

    iget-object v4, v0, Lut/a;->a:Ljava/lang/String;

    iget-object v5, v1, Ltt/c;->a:Ldt/g;

    invoke-virtual {v5}, Ldt/g;->a()V

    iget-object v5, v5, Ldt/g;->c:Ldt/i;

    iget-object v5, v5, Ldt/i;->g:Ljava/lang/String;

    iget-object v6, v0, Lut/a;->d:Ljava/lang/String;

    const-string v7, "Firebase Installations Service is unavailable. Please try again later."

    iget-object v8, v2, Lvt/c;->c:Lvt/d;

    invoke-virtual {v8}, Lvt/d;->a()Z

    move-result v9

    if-eqz v9, :cond_a

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "projects/"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "/installations/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/authTokens:generate"

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lvt/c;->a(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v4

    const/4 v10, 0x0

    :goto_0
    const/4 v11, 0x1

    if-gt v10, v11, :cond_9

    const v12, 0x8003

    invoke-static {v12}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    invoke-virtual {v2, v4, v3}, Lvt/c;->c(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v12

    :try_start_0
    const-string v13, "POST"

    invoke-virtual {v12, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v13, "Authorization"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "FIS_v2 "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v13, v14}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-static {v12}, Lvt/c;->h(Ljava/net/HttpURLConnection;)V

    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v13

    invoke-virtual {v8, v13}, Lvt/d;->b(I)V

    const/16 v14, 0xc8

    if-lt v13, v14, :cond_0

    const/16 v14, 0x12c

    if-ge v13, v14, :cond_0

    move v14, v11

    goto :goto_1

    :cond_0
    const/4 v14, 0x0

    :goto_1
    const/4 v15, 0x2

    const/4 v9, 0x0

    if-eqz v14, :cond_1

    invoke-static {v12}, Lvt/c;->f(Ljava/net/HttpURLConnection;)Lvt/b;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    :try_start_1
    invoke-static {v12, v9, v3, v5}, Lvt/c;->b(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v14, 0x191

    if-eq v13, v14, :cond_5

    const/16 v14, 0x194

    if-ne v13, v14, :cond_2

    goto :goto_3

    :cond_2
    const/16 v14, 0x1ad

    if-eq v13, v14, :cond_4

    const/16 v14, 0x1f4

    if-lt v13, v14, :cond_3

    const/16 v14, 0x258

    if-ge v13, v14, :cond_3

    :catch_0
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    goto/16 :goto_6

    :cond_3
    :try_start_2
    const-string v13, "Firebase-Installations"

    const-string v14, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."

    invoke-static {v13, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvt/b;->a()Lae3/k;

    move-result-object v13

    iput v15, v13, Lae3/k;->b:I

    invoke-virtual {v13}, Lae3/k;->a()Lvt/b;

    move-result-object v2

    goto :goto_2

    :cond_4
    new-instance v9, Lcom/google/firebase/installations/FirebaseInstallationsException;

    const-string v11, "Firebase servers have received too many requests from this client in a short period of time. Please try again later."

    invoke-direct {v9, v11}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v9

    :cond_5
    :goto_3
    invoke-static {}, Lvt/b;->a()Lae3/k;

    move-result-object v13

    const/4 v14, 0x3

    iput v14, v13, Lae3/k;->b:I

    invoke-virtual {v13}, Lae3/k;->a()Lvt/b;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_4
    iget v3, v2, Lvt/b;->c:I

    invoke-static {v3}, Le4/p;->e(I)I

    move-result v3

    if-eqz v3, :cond_8

    if-eq v3, v11, :cond_7

    if-ne v3, v15, :cond_6

    monitor-enter p0

    :try_start_3
    iput-object v9, v1, Ltt/c;->j:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    invoke-virtual {v0}, Lut/a;->a()Lpa3/b;

    move-result-object v0

    iput v15, v0, Lpa3/b;->c:I

    invoke-virtual {v0}, Lpa3/b;->a()Lut/a;

    move-result-object v0

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_6
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    invoke-direct {v0, v7}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const-string v2, "BAD CONFIG"

    invoke-virtual {v0}, Lut/a;->a()Lpa3/b;

    move-result-object v0

    iput-object v2, v0, Lpa3/b;->h:Ljava/io/Serializable;

    const/4 v2, 0x5

    iput v2, v0, Lpa3/b;->c:I

    invoke-virtual {v0}, Lpa3/b;->a()Lut/a;

    move-result-object v0

    return-object v0

    :cond_8
    iget-object v3, v2, Lvt/b;->a:Ljava/lang/String;

    iget-wide v4, v2, Lvt/b;->b:J

    iget-object v2, v1, Ltt/c;->d:Ltt/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, v2, Ltt/i;->a:Ljc/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v6

    invoke-virtual {v0}, Lut/a;->a()Lpa3/b;

    move-result-object v0

    iput-object v3, v0, Lpa3/b;->d:Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lpa3/b;->f:Ljava/io/Serializable;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lpa3/b;->g:Ljava/io/Serializable;

    invoke-virtual {v0}, Lpa3/b;->a()Lut/a;

    move-result-object v0

    return-object v0

    :goto_5
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    throw v0

    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_9
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    invoke-direct {v0, v7}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    invoke-direct {v0, v7}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Lcq/u;
    .locals 4

    invoke-virtual {p0}, Ltt/c;->e()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ltt/c;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    new-instance v1, Ltt/f;

    invoke-direct {v1, v0}, Ltt/f;-><init>(Lcq/i;)V

    iget-object v2, p0, Ltt/c;->g:Ljava/lang/Object;

    monitor-enter v2

    :try_start_1
    iget-object v3, p0, Ltt/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    iget-object v1, p0, Ltt/c;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ltt/b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Ltt/b;-><init>(Ltt/c;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final d()Lcq/u;
    .locals 4

    invoke-virtual {p0}, Ltt/c;->e()V

    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    new-instance v1, Ltt/e;

    iget-object v2, p0, Ltt/c;->d:Ltt/i;

    invoke-direct {v1, v2, v0}, Ltt/e;-><init>(Ltt/i;Lcq/i;)V

    iget-object v2, p0, Ltt/c;->g:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Ltt/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    iget-object v1, p0, Ltt/c;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ltt/b;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Ltt/b;-><init>(Ltt/c;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final e()V
    .locals 5

    iget-object v0, p0, Ltt/c;->a:Ldt/g;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v1, v0, Ldt/g;->c:Ldt/i;

    iget-object v1, v1, Ldt/i;->b:Ljava/lang/String;

    const-string v2, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v1, v2}, Luo/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v1, v0, Ldt/g;->c:Ldt/i;

    iget-object v1, v1, Ldt/i;->g:Ljava/lang/String;

    const-string v3, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v1, v3}, Luo/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v1, v0, Ldt/g;->c:Ldt/i;

    iget-object v1, v1, Ldt/i;->a:Ljava/lang/String;

    const-string v3, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v1, v3}, Luo/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v1, v0, Ldt/g;->c:Ldt/i;

    iget-object v1, v1, Ldt/i;->b:Ljava/lang/String;

    sget-object v4, Ltt/i;->c:Ljava/util/regex/Pattern;

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    invoke-static {v1, v2}, Luo/w;->b(ZLjava/lang/String;)V

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->c:Ldt/i;

    iget-object v0, v0, Ldt/i;->a:Ljava/lang/String;

    sget-object v1, Ltt/i;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    invoke-static {v0, v3}, Luo/w;->b(ZLjava/lang/String;)V

    return-void
.end method

.method public final f(Lut/a;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ltt/c;->a:Ldt/g;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->b:Ljava/lang/String;

    const-string v1, "CHIME_ANDROID_SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltt/c;->a:Ldt/g;

    const-string v1, "[DEFAULT]"

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget p1, p1, Lut/a;->b:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Ltt/c;->e:Lgt/l;

    invoke-virtual {p1}, Lgt/l;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lut/b;

    iget-object v0, p1, Lut/b;->a:Landroid/content/SharedPreferences;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Lut/b;->a:Landroid/content/SharedPreferences;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p1, Lut/b;->a:Landroid/content/SharedPreferences;

    const-string v3, "|S|id"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_1

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lut/b;->a()Ljava/lang/String;

    move-result-object v2

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ltt/c;->f:Ltt/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ltt/g;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_3
    iget-object p1, p0, Ltt/c;->f:Ltt/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ltt/g;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lut/a;)Lut/a;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v0, Lut/a;->a:Ljava/lang/String;

    const/4 v3, 0x4

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v6, 0xb

    if-ne v2, v6, :cond_3

    iget-object v2, v1, Ltt/c;->e:Lgt/l;

    invoke-virtual {v2}, Lgt/l;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lut/b;

    iget-object v6, v2, Lut/b;->a:Landroid/content/SharedPreferences;

    monitor-enter v6

    :try_start_0
    sget-object v7, Lut/b;->c:[Ljava/lang/String;

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_2

    aget-object v9, v7, v8

    iget-object v10, v2, Lut/b;->b:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "|T|"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "|"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v2, Lut/b;->a:Landroid/content/SharedPreferences;

    invoke-interface {v10, v9, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_1

    const-string v2, "{"

    invoke-virtual {v9, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v7, "token"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_0
    move-object v5, v9

    :catch_0
    :goto_1
    :try_start_2
    monitor-exit v6

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    monitor-exit v6

    goto :goto_3

    :goto_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_3
    :goto_3
    iget-object v2, v1, Ltt/c;->b:Lvt/c;

    iget-object v6, v1, Ltt/c;->a:Ldt/g;

    invoke-virtual {v6}, Ldt/g;->a()V

    iget-object v6, v6, Ldt/g;->c:Ldt/i;

    iget-object v6, v6, Ldt/i;->a:Ljava/lang/String;

    iget-object v7, v0, Lut/a;->a:Ljava/lang/String;

    iget-object v8, v1, Ltt/c;->a:Ldt/g;

    invoke-virtual {v8}, Ldt/g;->a()V

    iget-object v8, v8, Ldt/g;->c:Ldt/i;

    iget-object v8, v8, Ldt/i;->g:Ljava/lang/String;

    iget-object v9, v1, Ltt/c;->a:Ldt/g;

    invoke-virtual {v9}, Ldt/g;->a()V

    iget-object v9, v9, Ldt/g;->c:Ldt/i;

    iget-object v9, v9, Ldt/i;->b:Ljava/lang/String;

    const-string v10, "Firebase Installations Service is unavailable. Please try again later."

    iget-object v11, v2, Lvt/c;->c:Lvt/d;

    invoke-virtual {v11}, Lvt/d;->a()Z

    move-result v12

    if-eqz v12, :cond_c

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "projects/"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "/installations"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lvt/c;->a(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v12

    const/4 v13, 0x0

    :goto_4
    const/4 v14, 0x1

    if-gt v13, v14, :cond_b

    const v15, 0x8001

    invoke-static {v15}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    invoke-virtual {v2, v12, v6}, Lvt/c;->c(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v15

    :try_start_3
    const-string v4, "POST"

    invoke-virtual {v15, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v15, v14}, Ljava/net/URLConnection;->setDoOutput(Z)V

    if-eqz v5, :cond_4

    const-string v4, "x-goog-fis-android-iid-migration-auth"

    invoke-virtual {v15, v4, v5}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :cond_4
    :goto_5
    invoke-static {v15, v7, v9}, Lvt/c;->g(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    invoke-virtual {v11, v4}, Lvt/d;->b(I)V
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v3, 0xc8

    if-lt v4, v3, :cond_5

    const/16 v3, 0x12c

    if-ge v4, v3, :cond_5

    move v3, v14

    goto :goto_6

    :cond_5
    const/4 v3, 0x0

    :goto_6
    if-eqz v3, :cond_6

    :try_start_4
    invoke-static {v15}, Lvt/c;->e(Ljava/net/HttpURLConnection;)Lvt/a;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/AssertionError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    goto :goto_7

    :catch_1
    const/4 v3, 0x4

    goto/16 :goto_9

    :cond_6
    :try_start_5
    invoke-static {v15, v9, v6, v8}, Lvt/c;->b(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const/16 v3, 0x1ad

    if-eq v4, v3, :cond_a

    const/16 v3, 0x1f4

    if-lt v4, v3, :cond_7

    const/16 v3, 0x258

    if-ge v4, v3, :cond_7

    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    const/4 v3, 0x4

    goto/16 :goto_a

    :cond_7
    :try_start_6
    const-string v3, "Firebase-Installations"

    const-string v4, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v16, Lvt/a;

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x2

    invoke-direct/range {v16 .. v21}, Lvt/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvt/b;I)V
    :try_end_6
    .catch Ljava/lang/AssertionError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    move-object/from16 v2, v16

    :goto_7
    iget v3, v2, Lvt/a;->e:I

    invoke-static {v3}, Le4/p;->e(I)I

    move-result v3

    if-eqz v3, :cond_9

    if-ne v3, v14, :cond_8

    const-string v2, "BAD CONFIG"

    invoke-virtual {v0}, Lut/a;->a()Lpa3/b;

    move-result-object v0

    iput-object v2, v0, Lpa3/b;->h:Ljava/io/Serializable;

    const/4 v2, 0x5

    iput v2, v0, Lpa3/b;->c:I

    invoke-virtual {v0}, Lpa3/b;->a()Lut/a;

    move-result-object v0

    return-object v0

    :cond_8
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    const-string v2, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {v0, v2}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    iget-object v3, v2, Lvt/a;->b:Ljava/lang/String;

    iget-object v4, v2, Lvt/a;->c:Ljava/lang/String;

    iget-object v5, v1, Ltt/c;->d:Ltt/i;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v5, v5, Ltt/i;->a:Ljc/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v5

    iget-object v2, v2, Lvt/a;->d:Lvt/b;

    iget-object v7, v2, Lvt/b;->a:Ljava/lang/String;

    iget-wide v8, v2, Lvt/b;->b:J

    invoke-virtual {v0}, Lut/a;->a()Lpa3/b;

    move-result-object v0

    iput-object v3, v0, Lpa3/b;->b:Ljava/lang/String;

    const/4 v3, 0x4

    iput v3, v0, Lpa3/b;->c:I

    iput-object v7, v0, Lpa3/b;->d:Ljava/lang/Object;

    iput-object v4, v0, Lpa3/b;->e:Ljava/lang/Object;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lpa3/b;->f:Ljava/io/Serializable;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lpa3/b;->g:Ljava/io/Serializable;

    invoke-virtual {v0}, Lpa3/b;->a()Lut/a;

    move-result-object v0

    return-object v0

    :cond_a
    const/4 v3, 0x4

    :try_start_7
    new-instance v4, Lcom/google/firebase/installations/FirebaseInstallationsException;

    const-string v14, "Firebase servers have received too many requests from this client in a short period of time. Please try again later."

    invoke-direct {v4, v14}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_7
    .catch Ljava/lang/AssertionError; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_8
    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    throw v0

    :catch_2
    :goto_9
    invoke-virtual {v15}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    :goto_a
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_4

    :cond_b
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    invoke-direct {v0, v10}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    invoke-direct {v0, v10}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Ltt/c;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltt/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltt/h;

    invoke-interface {v2, p1}, Ltt/h;->a(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i(Lut/a;)V
    .locals 3

    iget-object v0, p0, Ltt/c;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltt/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltt/h;

    invoke-interface {v2, p1}, Ltt/h;->b(Lut/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
