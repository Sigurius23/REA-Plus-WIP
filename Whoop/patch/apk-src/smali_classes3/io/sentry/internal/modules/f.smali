.class public final Lio/sentry/internal/modules/f;
.super Lio/sentry/internal/modules/d;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lio/sentry/v0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/internal/modules/f;->e:I

    .line 3
    const-class v0, Lio/sentry/internal/modules/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 4
    invoke-direct {p0, p1}, Lio/sentry/internal/modules/d;-><init>(Lio/sentry/v0;)V

    .line 5
    invoke-static {v0}, Lds/q;->q(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/modules/f;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lio/sentry/v0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/internal/modules/f;->e:I

    .line 1
    invoke-direct {p0, p2}, Lio/sentry/internal/modules/d;-><init>(Lio/sentry/v0;)V

    .line 2
    iput-object p1, p0, Lio/sentry/internal/modules/f;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 6

    iget v0, p0, Lio/sentry/internal/modules/f;->e:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iget-object v1, p0, Lio/sentry/internal/modules/f;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/internal/modules/a;

    invoke-interface {v2}, Lio/sentry/internal/modules/a;->a()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    return-object v0

    :pswitch_0
    const-string v0, "sentry-external-modules.txt"

    iget-object v1, p0, Lio/sentry/internal/modules/d;->a:Lio/sentry/v0;

    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    :try_start_0
    iget-object v3, p0, Lio/sentry/internal/modules/f;->f:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_2

    :try_start_1
    sget-object v4, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v5, "%s file was not found."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v4, v5, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_4

    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    :try_start_3
    invoke-virtual {p0, v3}, Lio/sentry/internal/modules/d;->c(Ljava/io/InputStream;)Ljava/util/TreeMap;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    move-object v2, v0

    goto :goto_5

    :goto_1
    if-eqz v3, :cond_3

    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v3

    :try_start_6
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    throw v0
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :goto_3
    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Access to resources failed."

    invoke-interface {v1, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :goto_4
    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Access to resources denied."

    invoke-interface {v1, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_5
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
