.class public Lc6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/w0;


# instance fields
.field public final a:Lne3/p;

.field public final b:Lne3/e0;

.field public final c:Lc6/a;


# direct methods
.method public constructor <init>(Lne3/p;Lne3/e0;Lz5/b;)V
    .locals 0

    const-string p3, "fileSystem"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "path"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc6/c;->a:Lne3/p;

    iput-object p2, p0, Lc6/c;->b:Lne3/e0;

    new-instance p1, Lc6/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc6/a;-><init>(I)V

    iput-object p1, p0, Lc6/c;->c:Lc6/a;

    return-void
.end method

.method public static f(Lc6/c;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lc6/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lc6/b;

    iget v1, v0, Lc6/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc6/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lc6/b;

    invoke-direct {v0, p0, p1}, Lc6/b;-><init>(Lc6/c;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lc6/b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lc6/b;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lc6/b;->x:Lne3/j0;

    iget-object v0, v0, Lc6/b;->w:Lc6/c;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_b

    :catchall_0
    move-exception p1

    goto/16 :goto_f

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lc6/b;->x:Lne3/j0;

    iget-object v2, v0, Lc6/b;->w:Lc6/c;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lc6/c;->c:Lc6/a;

    iget-object p1, p1, Lc6/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_10

    :try_start_2
    iget-object p1, p0, Lc6/c;->a:Lne3/p;

    iget-object v2, p0, Lc6/c;->b:Lne3/e0;

    invoke-virtual {p1, v2}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    iput-object p0, v0, Lc6/b;->w:Lc6/c;

    iput-object p1, v0, Lc6/b;->x:Lne3/j0;

    iput v4, v0, Lc6/b;->E:I

    new-instance v2, Lne3/i0;

    invoke-direct {v2, p1}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-static {v2}, Ls40/e0;->g(Ljava/io/InputStream;)[B

    move-result-object v2

    array-length v6, v2

    if-nez v6, :cond_4

    new-instance v2, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;

    invoke-direct {v2, v5, v4, v5}, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;-><init>(Lio/getstream/video/android/model/Device;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    sget-object v6, Ldd3/a;->b:Ldd3/a;

    sget-object v7, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;->Companion:Lio/getstream/video/android/core/notifications/internal/storage/a;

    invoke-virtual {v7}, Lio/getstream/video/android/core/notifications/internal/storage/a;->serializer()Lwc3/c;

    move-result-object v7

    check-cast v7, Lwc3/b;

    invoke-virtual {v6, v7, v2}, Ldd3/a;->a(Lwc3/b;[B)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_1
    if-ne v2, v1, :cond_5

    goto/16 :goto_a

    :cond_5
    move-object v8, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v8

    :goto_2
    if-eqz p0, :cond_6

    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p0

    goto :goto_7

    :cond_6
    :goto_3
    move-object p0, v5

    goto :goto_7

    :goto_4
    move-object v8, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v8

    goto :goto_5

    :catchall_3
    move-exception v2

    goto :goto_4

    :goto_5
    if-eqz p0, :cond_7

    :try_start_5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception p0

    :try_start_6
    invoke-static {p1, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_6

    :catch_0
    move-object p0, v2

    goto :goto_8

    :cond_7
    :goto_6
    move-object p0, p1

    move-object p1, v5

    :goto_7
    if-nez p0, :cond_8

    goto/16 :goto_13

    :cond_8
    throw p0
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_1
    :goto_8
    iget-object p1, p0, Lc6/c;->a:Lne3/p;

    iget-object v2, p0, Lc6/c;->b:Lne3/e0;

    invoke-virtual {p1, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result p1

    if-eqz p1, :cond_f

    :try_start_7
    iget-object p1, p0, Lc6/c;->a:Lne3/p;

    invoke-virtual {p1, v2}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :try_start_8
    iput-object p0, v0, Lc6/b;->w:Lc6/c;

    iput-object p1, v0, Lc6/b;->x:Lne3/j0;

    iput v3, v0, Lc6/b;->E:I

    new-instance v0, Lne3/i0;

    invoke-direct {v0, p1}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-static {v0}, Ls40/e0;->g(Ljava/io/InputStream;)[B

    move-result-object v0

    array-length v2, v0

    if-nez v2, :cond_9

    new-instance v0, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;

    invoke-direct {v0, v5, v4, v5}, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;-><init>(Lio/getstream/video/android/model/Device;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_9
    sget-object v2, Ldd3/a;->b:Ldd3/a;

    sget-object v3, Lio/getstream/video/android/core/notifications/internal/storage/DevicePreferences;->Companion:Lio/getstream/video/android/core/notifications/internal/storage/a;

    invoke-virtual {v3}, Lio/getstream/video/android/core/notifications/internal/storage/a;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {v2, v3, v0}, Ldd3/a;->a(Lwc3/b;[B)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    :goto_9
    if-ne v0, v1, :cond_a

    :goto_a
    return-object v1

    :cond_a
    move-object v8, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v8

    :goto_b
    if-eqz p0, :cond_b

    :try_start_9
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_c

    :catchall_5
    move-exception v5

    :cond_b
    :goto_c
    move-object p0, v5

    move-object v5, p1

    move-object p1, p0

    :cond_c
    :goto_d
    move-object p0, v0

    goto :goto_10

    :goto_e
    move-object v8, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v8

    goto :goto_f

    :catchall_6
    move-exception v0

    goto :goto_e

    :goto_f
    if-eqz p0, :cond_c

    :try_start_a
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_d

    :catchall_7
    move-exception p0

    :try_start_b
    invoke-static {p1, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    goto :goto_d

    :catch_2
    move-exception p0

    goto :goto_11

    :goto_10
    if-nez p1, :cond_d

    goto :goto_12

    :cond_d
    :try_start_c
    throw p1
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    :catch_3
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    :goto_11
    nop

    instance-of p1, p0, Ljava/io/FileNotFoundException;

    if-eqz p1, :cond_e

    iget-object p1, v0, Lc6/c;->b:Lne3/e0;

    invoke-virtual {p1}, Lne3/e0;->c()Lne3/e0;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    check-cast p0, Ljava/io/FileNotFoundException;

    invoke-static {p1, p0}, Lse/h;->V(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    move-result-object p0

    :cond_e
    throw p0

    :cond_f
    :goto_12
    move-object p1, v5

    :goto_13
    return-object p1

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This scope has already been closed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(La6/r;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lc6/c;->f(Lc6/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lc6/c;->c:Lc6/a;

    iget-object v1, v1, Lc6/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
