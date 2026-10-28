.class public Lio/sentry/cache/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/cache/d;


# static fields
.field public static final I:Ljava/nio/charset/Charset;

.field public static final synthetic J:I


# instance fields
.field public final E:Ljava/util/concurrent/CountDownLatch;

.field public final F:Ljava/util/WeakHashMap;

.field public final G:Lio/sentry/util/a;

.field public final H:Lio/sentry/util/a;

.field public final w:Lio/sentry/q6;

.field public final x:Lio/sentry/util/f;

.field public final y:Ljava/io/File;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lio/sentry/cache/c;->I:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;Ljava/lang/String;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Lcom/whoop/data/repositories/c;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/cache/c;->x:Lio/sentry/util/f;

    const-string v0, "SentryOptions is required."

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/cache/c;->y:Ljava/io/File;

    iput p3, p0, Lio/sentry/cache/c;->z:I

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/c;->F:Ljava/util/WeakHashMap;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/c;->G:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/cache/c;->H:Lio/sentry/util/a;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/sentry/cache/c;->E:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final X0(Lcom/google/crypto/tink/internal/l0;)V
    .locals 3

    const-string v0, "Envelope is required."

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/sentry/cache/c;->c(Lcom/google/crypto/tink/internal/l0;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    iget-object v1, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Discarding envelope from cache: %s"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Envelope was not cached or could not be deleted: %s"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final a()[Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lio/sentry/cache/c;->y:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lio/sentry/cache/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_1
    :goto_0
    iget-object v1, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "The directory for caching files is inaccessible.: %s"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/io/File;

    return-object v0
.end method

.method public a0(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Z
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "Envelope is required."

    invoke-static {v2, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/cache/c;->a()[Ljava/io/File;

    move-result-object v4

    array-length v0, v4

    iget-object v6, v1, Lio/sentry/cache/c;->x:Lio/sentry/util/f;

    const/4 v7, 0x0

    iget-object v8, v1, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    const/4 v9, 0x1

    iget v10, v1, Lio/sentry/cache/c;->z:I

    if-lt v0, v10, :cond_19

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v11

    sget-object v12, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v13, "Cache folder if full (respecting maxSize). Rotating files"

    new-array v14, v7, [Ljava/lang/Object;

    invoke-interface {v11, v12, v13, v14}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sub-int v10, v0, v10

    add-int/2addr v10, v9

    array-length v11, v4

    if-le v11, v9, :cond_0

    new-instance v11, Ldb/k0;

    const/16 v12, 0x10

    invoke-direct {v11, v12}, Ldb/k0;-><init>(I)V

    invoke-static {v4, v11}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :cond_0
    invoke-static {v4, v10, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [Ljava/io/File;

    move v12, v7

    :goto_0
    if-ge v12, v10, :cond_19

    aget-object v13, v4, v12

    invoke-virtual {v1, v13}, Lio/sentry/cache/c;->e(Ljava/io/File;)Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    const-string v14, "File can\'t be deleted: %s"

    if-eqz v0, :cond_1

    iget-object v15, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_2

    :cond_1
    :goto_1
    move-object/from16 v17, v4

    move-object/from16 v19, v6

    move-object/from16 v21, v8

    goto/16 :goto_12

    :cond_2
    invoke-virtual {v8}, Lio/sentry/q6;->getClientReportRecorder()Lio/sentry/clientreport/g;

    move-result-object v5

    sget-object v9, Lio/sentry/clientreport/d;->CACHE_OVERFLOW:Lio/sentry/clientreport/d;

    invoke-interface {v5, v9, v0}, Lio/sentry/clientreport/g;->u(Lio/sentry/clientreport/d;Lcom/google/crypto/tink/internal/l0;)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/c5;

    if-nez v5, :cond_3

    move v9, v7

    goto :goto_3

    :cond_3
    iget-object v9, v5, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v9, v9, Lio/sentry/d5;->E:Lio/sentry/m5;

    sget-object v15, Lio/sentry/m5;->Session:Lio/sentry/m5;

    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    :goto_3
    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v5}, Lio/sentry/cache/c;->f(Lio/sentry/c5;)Lio/sentry/b7;

    move-result-object v0

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_1

    iget-object v5, v0, Lio/sentry/b7;->E:Ljava/lang/String;

    iget-object v9, v0, Lio/sentry/b7;->G:Lio/sentry/a7;

    sget-object v15, Lio/sentry/a7;->Ok:Lio/sentry/a7;

    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_5

    :cond_6
    if-eqz v5, :cond_7

    const/4 v9, 0x1

    goto :goto_6

    :cond_7
    :goto_5
    move v9, v7

    :goto_6
    if-nez v9, :cond_8

    goto :goto_1

    :cond_8
    iget-object v0, v0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    array-length v9, v11

    move v15, v7

    :goto_7
    if-ge v15, v9, :cond_1

    aget-object v7, v11, v15

    move-object/from16 v17, v4

    invoke-virtual {v1, v7}, Lio/sentry/cache/c;->e(Ljava/io/File;)Lcom/google/crypto/tink/internal/l0;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-object v0, v4, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/Iterable;

    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    move-object/from16 v23, v5

    move-object/from16 v19, v6

    move-object/from16 v21, v8

    move/from16 v22, v9

    goto/16 :goto_11

    :cond_b
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v0

    move-object/from16 v0, v19

    check-cast v0, Lio/sentry/c5;

    if-nez v0, :cond_c

    move-object/from16 v19, v6

    move-object/from16 v21, v8

    const/4 v6, 0x0

    goto :goto_9

    :cond_c
    move-object/from16 v19, v6

    iget-object v6, v0, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v6, v6, Lio/sentry/d5;->E:Lio/sentry/m5;

    move-object/from16 v21, v8

    sget-object v8, Lio/sentry/m5;->Session:Lio/sentry/m5;

    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    :goto_9
    if-nez v6, :cond_e

    :cond_d
    move-object/from16 v6, v19

    move-object/from16 v0, v20

    move-object/from16 v8, v21

    goto :goto_8

    :cond_e
    invoke-virtual {v1, v0}, Lio/sentry/cache/c;->f(Lio/sentry/c5;)Lio/sentry/b7;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v6, v0, Lio/sentry/b7;->E:Ljava/lang/String;

    iget-object v8, v0, Lio/sentry/b7;->G:Lio/sentry/a7;

    move/from16 v22, v9

    sget-object v9, Lio/sentry/a7;->Ok:Lio/sentry/a7;

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_a

    :cond_f
    if-eqz v6, :cond_10

    const/4 v8, 0x1

    goto :goto_b

    :cond_10
    :goto_a
    const/4 v8, 0x0

    :goto_b
    if-nez v8, :cond_11

    move-object/from16 v6, v19

    move-object/from16 v0, v20

    move-object/from16 v8, v21

    move/from16 v9, v22

    goto :goto_8

    :cond_11
    iget-object v8, v0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    if-eqz v8, :cond_12

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Session %s has 2 times the init flag."

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v4, v6, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_12

    :cond_12
    if-eqz v5, :cond_13

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v6, v0, Lio/sentry/b7;->F:Ljava/lang/Boolean;

    :try_start_0
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/j1;

    invoke-static {v6, v0}, Lio/sentry/c5;->d(Lio/sentry/j1;Lio/sentry/b7;)Lio/sentry/c5;

    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v23, v5

    goto :goto_d

    :catch_0
    move-exception v0

    goto :goto_c

    :catch_1
    move-exception v0

    const/4 v6, 0x0

    :goto_c
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    sget-object v9, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    move-object/from16 v23, v5

    const-string v5, "Failed to create new envelope item for the session %s"

    move-object/from16 v20, v6

    filled-new-array/range {v23 .. v23}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v8, v9, v0, v5, v6}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object/from16 v6, v20

    goto :goto_d

    :cond_13
    move-object/from16 v23, v5

    move-object/from16 v6, v19

    move-object/from16 v0, v20

    move-object/from16 v8, v21

    move/from16 v9, v22

    move-object/from16 v5, v23

    goto/16 :goto_8

    :cond_14
    move-object/from16 v23, v5

    move-object/from16 v19, v6

    move-object/from16 v21, v8

    move/from16 v22, v9

    const/4 v6, 0x0

    :goto_d
    if-eqz v6, :cond_17

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/c5;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_15
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lcom/google/crypto/tink/internal/l0;

    iget-object v4, v4, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v4, Lio/sentry/w4;

    invoke-direct {v5, v4, v0}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V

    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v4, v14, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_16
    :try_start_2
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/j1;

    invoke-interface {v0, v5, v4}, Lio/sentry/j1;->d(Lcom/google/crypto/tink/internal/l0;Ljava/io/OutputStream;)V

    invoke-virtual {v7, v8, v9}, Ljava/io/File;->setLastModified(J)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_10

    :catchall_1
    move-exception v0

    move-object v5, v0

    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_f

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_10
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Failed to serialize the new envelope to the disk."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_12

    :cond_17
    :goto_11
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v4, v17

    move-object/from16 v6, v19

    move-object/from16 v8, v21

    move/from16 v9, v22

    move-object/from16 v5, v23

    const/4 v7, 0x0

    goto/16 :goto_7

    :goto_12
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v4, v14, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_18
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v4, v17

    move-object/from16 v6, v19

    move-object/from16 v8, v21

    const/4 v7, 0x0

    const/4 v9, 0x1

    goto/16 :goto_0

    :cond_19
    move-object/from16 v19, v6

    move-object/from16 v21, v8

    iget-object v0, v1, Lio/sentry/cache/c;->y:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    const-string v6, "session.json"

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/io/File;

    const-string v7, "previous_session.json"

    invoke-direct {v6, v4, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-class v4, Lio/sentry/hints/i;

    invoke-static {v3, v4}, Lhg3/i;->W(Lio/sentry/g0;Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_1a

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v8, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v9, "Current envelope doesn\'t exist."

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Object;

    invoke-interface {v4, v8, v9, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1a
    const-class v4, Lio/sentry/hints/a;

    const-string v8, "sentry:typeCheckHint"

    invoke-virtual {v3, v8}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    const-class v9, Lio/sentry/b7;

    sget-object v10, Lio/sentry/cache/c;->I:Ljava/nio/charset/Charset;

    if-nez v4, :cond_1c

    const-class v4, Lio/sentry/hints/g;

    invoke-virtual {v3, v8}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1b

    goto :goto_14

    :cond_1b
    :goto_13
    const/4 v15, 0x1

    goto/16 :goto_1d

    :cond_1c
    :goto_14
    invoke-virtual {v3, v8}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v7, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v12, "Previous session is not ended, we\'d need to end it."

    const/4 v13, 0x0

    new-array v14, v13, [Ljava/lang/Object;

    invoke-interface {v0, v7, v12, v14}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_7
    new-instance v12, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    new-instance v13, Ljava/io/FileInputStream;

    invoke-direct {v13, v11}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v13, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v12, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/j1;

    invoke-interface {v0, v12, v9}, Lio/sentry/j1;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/b7;

    if-eqz v0, :cond_24

    instance-of v13, v4, Lio/sentry/hints/a;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    if-eqz v13, :cond_20

    :try_start_9
    check-cast v4, Lio/sentry/hints/a;

    invoke-interface {v4}, Lio/sentry/hints/a;->b()Ljava/lang/Long;

    move-result-object v13

    if-eqz v13, :cond_1e

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v0}, Lio/sentry/b7;->c()Ljava/util/Date;

    move-result-object v14

    if-eqz v14, :cond_1d

    invoke-virtual {v13, v14}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v14

    if-eqz v14, :cond_1f

    goto :goto_15

    :catchall_3
    move-exception v0

    move-object v4, v0

    const/4 v15, 0x1

    goto/16 :goto_1a

    :cond_1d
    :goto_15
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    const-string v4, "Abnormal exit happened before previous session start, not ending the session."

    const/4 v13, 0x0

    new-array v11, v13, [Ljava/lang/Object;

    invoke-interface {v0, v7, v4, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_13

    :catchall_4
    move-exception v0

    const/4 v15, 0x1

    goto/16 :goto_1c

    :cond_1e
    const/4 v13, 0x0

    :cond_1f
    :try_start_b
    invoke-interface {v4}, Lio/sentry/hints/a;->d()Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lio/sentry/a7;->Abnormal:Lio/sentry/a7;

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-virtual {v0, v7, v14, v15, v4}, Lio/sentry/b7;->d(Lio/sentry/a7;Ljava/lang/String;ZLjava/lang/String;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    const/4 v15, 0x1

    goto :goto_19

    :cond_20
    :try_start_c
    instance-of v13, v4, Lio/sentry/hints/g;

    if-eqz v13, :cond_23

    check-cast v4, Lio/sentry/hints/g;

    check-cast v4, Lio/sentry/android/core/t1;

    iget-wide v13, v4, Lio/sentry/android/core/t1;->z:J

    invoke-static {v13, v14}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v0}, Lio/sentry/b7;->c()Ljava/util/Date;

    move-result-object v13

    if-eqz v13, :cond_21

    invoke-virtual {v4, v13}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v13

    if-eqz v13, :cond_22

    :cond_21
    const/4 v15, 0x1

    goto :goto_17

    :cond_22
    sget-object v7, Lio/sentry/a7;->Crashed:Lio/sentry/a7;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    const/4 v14, 0x0

    const/4 v15, 0x1

    :try_start_d
    invoke-virtual {v0, v7, v14, v15, v14}, Lio/sentry/b7;->d(Lio/sentry/a7;Ljava/lang/String;ZLjava/lang/String;)Z

    move-object v13, v4

    goto :goto_19

    :catchall_5
    move-exception v0

    :goto_16
    move-object v4, v0

    goto :goto_1a

    :catchall_6
    move-exception v0

    const/4 v15, 0x1

    goto :goto_16

    :goto_17
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    const-string v4, "Native crash exit happened before previous session start, not ending the session."

    const/4 v13, 0x0

    new-array v11, v13, [Ljava/lang/Object;

    invoke-interface {v0, v7, v4, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :goto_18
    :try_start_e
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    goto :goto_1d

    :catchall_7
    move-exception v0

    goto :goto_1c

    :cond_23
    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object v13, v14

    :goto_19
    :try_start_f
    invoke-virtual {v0, v13}, Lio/sentry/b7;->b(Ljava/util/Date;)V

    invoke-virtual {v1, v11, v0}, Lio/sentry/cache/c;->j(Ljava/io/File;Lio/sentry/b7;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_18

    :cond_24
    const/4 v15, 0x1

    goto :goto_18

    :goto_1a
    :try_start_10
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    goto :goto_1b

    :catchall_8
    move-exception v0

    :try_start_11
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1b
    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :goto_1c
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v7, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v11, "Error processing previous session."

    invoke-interface {v4, v7, v11, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1d

    :cond_25
    const/4 v15, 0x1

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v7, "No previous session file to end."

    const/4 v13, 0x0

    new-array v11, v13, [Ljava/lang/Object;

    invoke-interface {v0, v4, v7, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1d
    const-class v0, Lio/sentry/hints/j;

    invoke-virtual {v3, v8}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    const-string v4, "last_crash"

    if-eqz v0, :cond_2b

    invoke-virtual {v1, v5, v6}, Lio/sentry/cache/c;->d(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_28

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/c5;

    sget-object v6, Lio/sentry/m5;->Session:Lio/sentry/m5;

    iget-object v7, v0, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v7, v7, Lio/sentry/d5;->E:Lio/sentry/m5;

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_27

    :try_start_12
    new-instance v6, Ljava/io/BufferedReader;

    new-instance v11, Ljava/io/InputStreamReader;

    new-instance v12, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Lio/sentry/c5;->f()[B

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v11, v12, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v6, v11}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    :try_start_13
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/j1;

    invoke-interface {v0, v6, v9}, Lio/sentry/j1;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/b7;

    if-nez v0, :cond_26

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v9, "Item of type %s returned null by the parser."

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v5, v9, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1e

    :catchall_9
    move-exception v0

    move-object v5, v0

    goto :goto_1f

    :cond_26
    invoke-virtual {v1, v5, v0}, Lio/sentry/cache/c;->j(Ljava/io/File;Lio/sentry/b7;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    :goto_1e
    :try_start_14
    invoke-virtual {v6}, Ljava/io/Reader;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    goto :goto_22

    :catchall_a
    move-exception v0

    goto :goto_21

    :goto_1f
    :try_start_15
    invoke-virtual {v6}, Ljava/io/Reader;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    goto :goto_20

    :catchall_b
    move-exception v0

    :try_start_16
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_20
    throw v5
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    :goto_21
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v7, "Item failed to process."

    invoke-interface {v5, v6, v7, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_22

    :cond_27
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v6, "Current envelope has a different envelope type %s"

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v5, v6, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_22

    :cond_28
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v7, "Current envelope %s is empty"

    invoke-interface {v0, v6, v7, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_22
    new-instance v0, Ljava/io/File;

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".sentry-native/last_crash"

    invoke-direct {v0, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2a

    new-instance v5, Ljava/io/File;

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v7, "Crash marker file exists, crashedLastRun will return true."

    const/4 v13, 0x0

    new-array v9, v13, [Ljava/lang/Object;

    invoke-interface {v0, v6, v7, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_29

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v7, "Failed to delete the crash marker file. %s."

    invoke-interface {v0, v6, v7, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_29
    move v0, v15

    goto :goto_23

    :cond_2a
    const/4 v13, 0x0

    :goto_23
    sget-object v5, Lio/sentry/t4;->d:Lio/sentry/t4;

    invoke-virtual {v5, v0}, Lio/sentry/t4;->a(Z)V

    iget-object v0, v1, Lio/sentry/cache/c;->E:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_24

    :cond_2b
    const/4 v13, 0x0

    :goto_24
    invoke-virtual/range {p0 .. p1}, Lio/sentry/cache/c;->c(Lcom/google/crypto/tink/internal/l0;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Not adding Envelope to offline storage because it already exists: %s"

    invoke-interface {v0, v2, v4, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    move v9, v15

    goto/16 :goto_2b

    :cond_2c
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v9, "Adding Envelope to offline storage: %s"

    invoke-interface {v0, v6, v9, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v9, "Overwriting envelope to offline storage: %s"

    invoke-interface {v0, v6, v9, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2d

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v9, "Failed to delete: %s"

    invoke-interface {v0, v6, v9, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2d
    :try_start_17
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    :try_start_18
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/j1;

    invoke-interface {v0, v2, v6}, Lio/sentry/j1;->d(Lcom/google/crypto/tink/internal/l0;Ljava/io/OutputStream;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    :try_start_19
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_c

    move v7, v15

    goto :goto_27

    :catchall_c
    move-exception v0

    goto :goto_26

    :catchall_d
    move-exception v0

    move-object v2, v0

    :try_start_1a
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_e

    goto :goto_25

    :catchall_e
    move-exception v0

    :try_start_1b
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_25
    throw v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    :goto_26
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v7, "Error writing Envelope %s to offline storage"

    invoke-interface {v2, v6, v0, v7, v5}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move v7, v13

    :goto_27
    const-class v0, Lio/sentry/o7;

    invoke-virtual {v3, v8}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    new-instance v0, Ljava/io/File;

    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1c
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_f

    :try_start_1d
    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Ljc/x;->W(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_10

    :try_start_1e
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_f

    goto :goto_2a

    :catchall_f
    move-exception v0

    goto :goto_29

    :catchall_10
    move-exception v0

    move-object v3, v0

    :try_start_1f
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_11

    goto :goto_28

    :catchall_11
    move-exception v0

    :try_start_20
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_28
    throw v3
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_f

    :goto_29
    invoke-virtual/range {v21 .. v21}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Error writing the crash marker file to the disk"

    invoke-interface {v2, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2e
    :goto_2a
    move v9, v7

    :goto_2b
    return v9
.end method

.method public final c(Lcom/google/crypto/tink/internal/l0;)Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lio/sentry/cache/c;->F:Ljava/util/WeakHashMap;

    const-string v1, ".envelope"

    iget-object v2, p0, Lio/sentry/cache/c;->G:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {}, Lq83/g;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v1

    :goto_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lio/sentry/cache/c;->y:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-object v0

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final d(Ljava/io/File;Ljava/io/File;)V
    .locals 7

    iget-object v0, p0, Lio/sentry/cache/c;->H:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x0

    iget-object v3, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Previous session file already exists, deleting it."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v5, "Unable to delete previous session file: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v4, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v5, "Moving current session to previous session."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v1, v4, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Unable to move current session to previous session."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error moving current session to previous session."

    invoke-interface {p2, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_5
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final e(Ljava/io/File;)Lcom/google/crypto/tink/internal/l0;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p1, p0, Lio/sentry/cache/c;->x:Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/j1;

    invoke-interface {p1, v0}, Lio/sentry/j1;->c(Ljava/io/BufferedInputStream;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    iget-object v0, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to deserialize the envelope."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Lio/sentry/c5;)Lio/sentry/b7;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Lio/sentry/c5;->f()[B

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object p1, Lio/sentry/cache/c;->I:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Lio/sentry/cache/c;->x:Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/j1;

    const-class v1, Lio/sentry/b7;

    invoke-interface {p1, v0, v1}, Lio/sentry/j1;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/b7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    iget-object v0, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to deserialize the session."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final g()Z
    .locals 5

    iget-object v0, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    :try_start_0
    iget-object v1, p0, Lio/sentry/cache/c;->E:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Lio/sentry/q6;->getSessionFlushTimeoutMillis()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "Timed out waiting for previous session to flush."

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return v3
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 11

    iget-object v0, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    invoke-virtual {p0}, Lio/sentry/cache/c;->a()[Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v1, v4

    :try_start_0
    new-instance v6, Ljava/io/BufferedInputStream;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v6, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v7, p0, Lio/sentry/cache/c;->x:Lio/sentry/util/f;

    invoke-virtual {v7}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/j1;

    invoke-interface {v7, v6}, Lio/sentry/j1;->c(Ljava/io/BufferedInputStream;)Lcom/google/crypto/tink/internal/l0;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v6

    goto :goto_2

    :catchall_0
    move-exception v7

    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v6

    :try_start_4
    invoke-virtual {v7, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v7
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_2
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Error while reading cached envelope from file "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v8, v5, v6}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_1
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v7, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v8, "Envelope file \'%s\' disappeared while converting all cached files to envelopes."

    invoke-interface {v6, v7, v8, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/io/File;Lio/sentry/b7;)V
    .locals 7

    iget-object v0, p2, Lio/sentry/b7;->E:Ljava/lang/String;

    iget-object v1, p0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance p1, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/OutputStreamWriter;

    sget-object v4, Lio/sentry/cache/c;->I:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {p1, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Overwriting session to offline storage: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lio/sentry/cache/c;->x:Lio/sentry/util/f;

    invoke-virtual {v3}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/j1;

    invoke-interface {v3, p1, p2}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {p1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_1

    :catchall_2
    move-exception p2

    :try_start_5
    invoke-virtual {p1}, Ljava/io/Writer;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_0

    :catchall_3
    move-exception p1

    :try_start_6
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_1
    :try_start_7
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception p2

    :try_start_8
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_3
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error writing Session to offline storage: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v1, p1, v2, v0}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
