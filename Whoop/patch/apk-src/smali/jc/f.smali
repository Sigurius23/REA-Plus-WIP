.class public final synthetic Ljc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ljc/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljc/f;->x:Ljava/lang/String;

    iput-object p3, p0, Ljc/f;->z:Ljava/io/Serializable;

    return-void
.end method

.method public synthetic constructor <init>(Ljc/g;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ljc/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljc/f;->z:Ljava/io/Serializable;

    iput-object p3, p0, Ljc/f;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ljc/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljc/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Ljc/f;->x:Ljava/lang/String;

    iget-object v0, p0, Ljc/f;->z:Ljava/io/Serializable;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    sget-object v0, Lwb3/f;->a:Laj/d;

    if-nez v0, :cond_3

    const-class v1, Laj/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lwb3/f;->a:Laj/d;

    if-nez v0, :cond_2

    new-instance v0, Laj/d;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    sget-object v5, Lwb3/f;->b:Laj/c;

    if-nez v5, :cond_1

    const-class v5, Laj/c;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v7, Lwb3/f;->b:Laj/c;

    if-nez v7, :cond_0

    new-instance v7, Laj/c;

    new-instance v8, Ljc/p;

    invoke-direct {v8, v4}, Ljc/p;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-direct {v7, v8, v4}, Laj/c;-><init>(Ljava/lang/Object;I)V

    sput-object v7, Lwb3/f;->b:Laj/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v5

    move-object v5, v7

    goto :goto_2

    :goto_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0

    :cond_1
    :goto_2
    new-instance v4, Lio/sentry/hints/j;

    const/4 v7, 0x3

    invoke-direct {v4, v7}, Lio/sentry/hints/j;-><init>(I)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v5, v0, Laj/d;->w:Ljava/lang/Object;

    sput-object v0, Lwb3/f;->a:Laj/d;

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_3
    monitor-exit v1

    :cond_3
    move-object v1, v0

    goto :goto_5

    :goto_4
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :goto_5
    const/4 v4, 0x0

    if-eqz v6, :cond_7

    iget-object v0, v1, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Laj/c;

    :try_start_3
    invoke-virtual {v0, v3}, Laj/c;->H(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_4

    :catch_0
    move-object v0, v4

    goto :goto_7

    :cond_4
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string v8, ".zip"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    sget-object v7, Laj/b;->y:Laj/b;

    goto :goto_6

    :cond_5
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string v8, ".gz"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    sget-object v7, Laj/b;->z:Laj/b;

    goto :goto_6

    :cond_6
    sget-object v7, Laj/b;->x:Laj/b;

    :goto_6
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    invoke-static {}, Ldj/c;->a()V

    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_7
    if-nez v0, :cond_8

    :cond_7
    move-object v0, v4

    goto :goto_9

    :cond_8
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Laj/b;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v7, 0x1

    if-eq v5, v7, :cond_a

    const/4 v7, 0x2

    if-eq v5, v7, :cond_9

    invoke-static {v0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    invoke-static {v0, v6}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    goto :goto_8

    :cond_9
    :try_start_4
    new-instance v5, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v5, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v5}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    invoke-static {v0, v6}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_8

    :catch_1
    move-exception v0

    new-instance v5, Lqi/b0;

    invoke-direct {v5, v0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v5

    goto :goto_8

    :cond_a
    new-instance v5, Ljava/util/zip/ZipInputStream;

    invoke-direct {v5, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2, v5, v6}, Lqi/l;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    :goto_8
    iget-object v0, v0, Lqi/b0;->a:Lqi/i;

    if-eqz v0, :cond_7

    :goto_9
    if-eqz v0, :cond_b

    new-instance v1, Lqi/b0;

    invoke-direct {v1, v0}, Lqi/b0;-><init>(Lqi/i;)V

    goto :goto_c

    :cond_b
    invoke-static {}, Ldj/c;->a()V

    const-string v7, "LottieFetchResult close failed "

    invoke-static {}, Ldj/c;->a()V

    :try_start_5
    invoke-static {v3}, Lio/sentry/hints/j;->p(Ljava/lang/String;)Laj/a;

    move-result-object v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-virtual {v8}, Laj/a;->m()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v8}, Laj/a;->b()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v8}, Laj/a;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v1 .. v6}, Laj/d;->j(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lqi/b0;

    move-result-object v1

    iget-object v0, v1, Lqi/b0;->a:Lqi/i;

    invoke-static {}, Ldj/c;->a()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_a
    :try_start_7
    invoke-virtual {v8}, Laj/a;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_c

    :catchall_2
    move-exception v0

    move-object v1, v0

    move-object v4, v8

    goto :goto_d

    :catch_2
    move-exception v0

    move-object v4, v8

    goto :goto_b

    :cond_c
    :try_start_8
    new-instance v1, Lqi/b0;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v8}, Laj/a;->i()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_d

    :catch_3
    move-exception v0

    :goto_b
    :try_start_9
    new-instance v1, Lqi/b0;

    invoke-direct {v1, v0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    if-eqz v4, :cond_d

    :try_start_a
    invoke-virtual {v4}, Laj/a;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    goto :goto_c

    :catch_4
    move-exception v0

    invoke-static {v7, v0}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    :goto_c
    if-eqz v6, :cond_e

    iget-object v0, v1, Lqi/b0;->a:Lqi/i;

    if-eqz v0, :cond_e

    sget-object v2, Lwi/g;->b:Lwi/g;

    iget-object v2, v2, Lwi/g;->a:La0/a0;

    invoke-virtual {v2, v6, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    return-object v1

    :goto_d
    if-eqz v4, :cond_f

    :try_start_b
    invoke-virtual {v4}, Laj/a;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    goto :goto_e

    :catch_5
    move-exception v0

    invoke-static {v7, v0}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    :goto_e
    throw v1

    :pswitch_0
    iget-object v0, p0, Ljc/f;->y:Ljava/lang/Object;

    check-cast v0, Ljc/g;

    iget-object v1, p0, Ljc/f;->z:Ljava/io/Serializable;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ljc/f;->x:Ljava/lang/String;

    iget-object v0, v0, Ljc/g;->e:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->i()Lqc/w;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "id"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Lqc/w;->a:Landroidx/room/z0;

    new-instance v4, Le61/g;

    const/16 v5, 0x12

    invoke-direct {v4, v2, v5}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v5, v6, v4}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqc/u;->e(Ljava/lang/String;)Lqc/q;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
