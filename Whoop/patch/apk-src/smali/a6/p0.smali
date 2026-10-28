.class public final La6/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/g1;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:La6/y0;

.field public final c:La6/d1;

.field public final d:La6/l0;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Lmc3/c;


# direct methods
.method public constructor <init>(Ljava/io/File;La6/y0;La6/d1;La6/l0;)V
    .locals 1

    const-string v0, "coordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/p0;->a:Ljava/io/File;

    iput-object p2, p0, La6/p0;->b:La6/y0;

    iput-object p3, p0, La6/p0;->c:La6/d1;

    iput-object p4, p0, La6/p0;->d:La6/l0;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La6/p0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, La6/p0;->f:Lmc3/c;

    return-void
.end method


# virtual methods
.method public final b(La6/r;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, La6/n0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/n0;

    iget v1, v0, La6/n0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/n0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/n0;

    invoke-direct {v0, p0, p2}, La6/n0;-><init>(La6/p0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La6/n0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/n0;->E:I

    iget-object v3, p0, La6/p0;->f:Lmc3/c;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-boolean p1, v0, La6/n0;->w:Z

    iget-object v0, v0, La6/n0;->x:La6/k0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La6/p0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_7

    invoke-virtual {v3}, Lmc3/c;->tryLock()Z

    move-result p2

    :try_start_1
    new-instance v2, La6/k0;

    iget-object v6, p0, La6/p0;->a:Ljava/io/File;

    iget-object v7, p0, La6/p0;->b:La6/y0;

    invoke-direct {v2, v6, v7}, La6/k0;-><init>(Ljava/io/File;La6/y0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    :try_start_2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iput-object v2, v0, La6/n0;->x:La6/k0;

    iput-boolean p2, v0, La6/n0;->w:Z

    iput v4, v0, La6/n0;->E:I

    invoke-virtual {p1, v2, v6, v0}, La6/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move v0, p2

    move-object p2, p1

    move p1, v0

    move-object v0, v2

    :goto_1
    :try_start_3
    invoke-interface {v0}, La6/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v0, v5

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_2
    if-nez v0, :cond_5

    if-eqz p1, :cond_4

    invoke-virtual {v3, v5}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_4
    return-object p2

    :cond_5
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    goto :goto_5

    :catchall_3
    move-exception p1

    move v0, p2

    move-object p2, p1

    move p1, v0

    move-object v0, v2

    :goto_3
    :try_start_5
    invoke-interface {v0}, La6/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v0

    :try_start_6
    invoke-static {p2, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_5
    move-exception p1

    move v8, p2

    move-object p2, p1

    move p1, v8

    :goto_5
    if-eqz p1, :cond_6

    invoke-virtual {v3, v5}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_6
    throw p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "StorageConnection has already been disposed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(La6/h0;Ls83/c;)Ljava/lang/Object;
    .locals 10

    const-string v0, "Unable to rename "

    instance-of v1, p2, La6/o0;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, La6/o0;

    iget v2, v1, La6/o0;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, La6/o0;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, La6/o0;

    invoke-direct {v1, p0, p2}, La6/o0;-><init>(La6/p0;Ls83/c;)V

    :goto_0
    iget-object p2, v1, La6/o0;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/o0;->F:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    iget-object v6, p0, La6/p0;->a:Ljava/io/File;

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, La6/o0;->y:La6/r0;

    iget-object v2, v1, La6/o0;->x:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v1, v1, La6/o0;->w:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p2

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v1, La6/o0;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v3, v1, La6/o0;->w:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v3

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La6/p0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_c

    invoke-virtual {v6}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unable to create parent directories of "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    iput-object p1, v1, La6/o0;->w:Ljava/lang/Object;

    iget-object p2, p0, La6/p0;->f:Lmc3/c;

    iput-object p2, v1, La6/o0;->x:Ljava/lang/Object;

    iput v5, v1, La6/o0;->F:I

    invoke-virtual {p2, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    :try_start_1
    new-instance v3, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".tmp"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v3, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    :try_start_2
    new-instance v8, La6/r0;

    iget-object v9, p0, La6/p0;->b:La6/y0;

    invoke-direct {v8, v3, v9}, La6/k0;-><init>(Ljava/io/File;La6/y0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    :try_start_3
    iput-object p2, v1, La6/o0;->w:Ljava/lang/Object;

    iput-object v3, v1, La6/o0;->x:Ljava/lang/Object;

    iput-object v8, v1, La6/o0;->y:La6/r0;

    iput v4, v1, La6/o0;->F:I

    invoke-interface {p1, v8, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p1, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    move-object v1, p2

    move-object v2, v3

    move-object p1, v8

    :goto_4
    :try_start_4
    invoke-interface {p1}, La6/a;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object p1, v7

    goto :goto_5

    :catchall_1
    move-exception p1

    :goto_5
    if-nez p1, :cond_a

    :try_start_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz p1, :cond_9

    const/4 p1, 0x0

    :try_start_6
    invoke-virtual {v2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object p2

    invoke-virtual {v6}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v3

    new-array v4, v5, [Ljava/nio/file/CopyOption;

    sget-object v8, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    aput-object v8, v4, p1

    invoke-static {p2, v3, v4}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_7

    :goto_6
    move-object p2, v1

    goto :goto_c

    :catch_0
    move v5, p1

    :goto_7
    if-eqz v5, :cond_8

    goto :goto_8

    :cond_8
    :try_start_7
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p1

    move-object p2, v1

    move-object v3, v2

    goto :goto_b

    :cond_9
    :goto_8
    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    :try_start_8
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_3
    move-exception p1

    move-object v1, p2

    move-object v2, v3

    move-object p2, p1

    move-object p1, v8

    :goto_9
    :try_start_9
    invoke-interface {p1}, La6/a;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_a

    :catchall_4
    move-exception p1

    :try_start_a
    invoke-static {p2, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_a
    throw p2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_5
    move-exception p1

    goto :goto_c

    :catch_2
    move-exception p1

    :goto_b
    :try_start_b
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :cond_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :goto_c
    invoke-interface {p2, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "StorageConnection has already been disposed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, La6/p0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, La6/p0;->d:La6/l0;

    invoke-virtual {v0}, La6/l0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final e()La6/d1;
    .locals 1

    iget-object v0, p0, La6/p0;->c:La6/d1;

    return-object v0
.end method
