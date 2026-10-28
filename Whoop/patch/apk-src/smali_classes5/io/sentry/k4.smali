.class public final synthetic Lio/sentry/k4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/sentry/v0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lio/sentry/v;

.field public final synthetic d:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/v0;Ljava/lang/String;Lio/sentry/v;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/k4;->a:Lio/sentry/v0;

    iput-object p2, p0, Lio/sentry/k4;->b:Ljava/lang/String;

    iput-object p3, p0, Lio/sentry/k4;->c:Lio/sentry/v;

    iput-object p4, p0, Lio/sentry/k4;->d:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/sentry/k4;->d:Ljava/io/File;

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Started processing cached files from %s"

    iget-object v4, v1, Lio/sentry/k4;->b:Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, Lio/sentry/k4;->a:Lio/sentry/v0;

    invoke-interface {v6, v0, v3, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, v1, Lio/sentry/k4;->c:Lio/sentry/v;

    iget-object v12, v3, Lio/sentry/v;->d:Lio/sentry/j7;

    iget-object v5, v3, Lio/sentry/v;->b:Lio/sentry/v0;

    :try_start_0
    const-string v7, "Processing dir. %s"

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v0, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v7, Lnk/b;

    const/4 v8, 0x3

    invoke-direct {v7, v3, v8}, Lnk/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v7}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v13

    if-nez v13, :cond_0

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Cache dir %s is null or is not a directory."

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v0, v3, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    const-string v7, "Processing %d items from cache dir %s"

    array-length v8, v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    filled-new-array {v8, v9}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v0, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    array-length v0, v13

    const/4 v14, 0x0

    move v15, v14

    :goto_0
    if-ge v15, v0, :cond_4

    aget-object v7, v13, v15

    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v8

    if-nez v8, :cond_1

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v9, "File %s is not a File."

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v8, v9, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Lio/sentry/j7;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v8, "File \'%s\' has already been processed so it will not be processed again."

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v5, v7, v8, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v8, v3, Lio/sentry/v;->a:Lio/sentry/d1;

    invoke-interface {v8}, Lio/sentry/d1;->j()Lio/sentry/transport/q;

    move-result-object v8

    if-eqz v8, :cond_3

    sget-object v9, Lio/sentry/m;->All:Lio/sentry/m;

    invoke-virtual {v8, v9}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "DirectoryProcessor, rate limiting active."

    new-array v7, v14, [Ljava/lang/Object;

    invoke-interface {v5, v0, v3, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v9, "Processing file: %s"

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v5, v8, v9, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v8, v7

    new-instance v7, Lio/sentry/u;

    move-object v10, v8

    iget-wide v8, v3, Lio/sentry/v;->c:J

    move-object/from16 v16, v10

    iget-object v10, v3, Lio/sentry/v;->b:Lio/sentry/v0;

    move-object/from16 v14, v16

    invoke-direct/range {v7 .. v12}, Lio/sentry/u;-><init>(JLio/sentry/v0;Ljava/lang/String;Lio/sentry/j7;)V

    invoke-static {v7}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v7

    invoke-virtual {v3, v14, v7}, Lio/sentry/v;->b(Ljava/io/File;Lio/sentry/g0;)V

    const-wide/16 v7, 0x64

    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    add-int/lit8 v15, v15, 0x1

    const/4 v14, 0x0

    goto :goto_0

    :goto_2
    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v7, "Failed processing \'%s\'"

    invoke-interface {v5, v3, v0, v7, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_3
    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "Finished processing cached files from %s"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6, v0, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
