.class public final Lwn/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/y;


# static fields
.field public static final O:Lux/f0;


# instance fields
.field public final E:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public F:Lsn/z;

.field public G:Lko/c0;

.field public H:Landroid/os/Handler;

.field public I:Lvn/l;

.field public J:Lwn/m;

.field public K:Landroid/net/Uri;

.field public L:Lwn/j;

.field public M:Z

.field public N:J

.field public final w:Lty/c;

.field public final x:Lwn/p;

.field public final y:Lg73/d;

.field public final z:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lux/f0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lux/f0;-><init>(I)V

    sput-object v0, Lwn/c;->O:Lux/f0;

    return-void
.end method

.method public constructor <init>(Lty/c;Lg73/d;Lwn/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/c;->w:Lty/c;

    iput-object p3, p0, Lwn/c;->x:Lwn/p;

    iput-object p2, p0, Lwn/c;->y:Lg73/d;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lwn/c;->z:Ljava/util/HashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lwn/c;->N:J

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/net/Uri;)Lwn/j;
    .locals 4

    iget-object v0, p0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/b;

    iget-object v1, v1, Lwn/b;->z:Lwn/j;

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    iget-object p1, p0, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {p2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lwn/c;->J:Lwn/m;

    iget-object p1, p1, Lwn/m;->e:Ljava/util/List;

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwn/l;

    iget-object v3, v3, Lwn/l;->a:Landroid/net/Uri;

    invoke-virtual {p2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object p1, p0, Lwn/c;->L:Lwn/j;

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lwn/j;->o:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    iput-object p2, p0, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwn/b;

    iget-object v0, p1, Lwn/b;->z:Lwn/j;

    if-eqz v0, :cond_1

    iget-boolean v2, v0, Lwn/j;->o:Z

    if-eqz v2, :cond_1

    iput-object v0, p0, Lwn/c;->L:Lwn/j;

    iget-object p1, p0, Lwn/c;->I:Lvn/l;

    invoke-virtual {p1, v0}, Lvn/l;->q(Lwn/j;)V

    return-object v1

    :cond_1
    invoke-virtual {p0, p2}, Lwn/c;->b(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwn/b;->d(Landroid/net/Uri;)V

    return-object v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final b(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    iget-object v0, p0, Lwn/c;->L:Lwn/j;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lwn/j;->v:Lwn/i;

    iget-boolean v1, v1, Lwn/i;->e:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Lwn/j;->t:Lzr/b1;

    invoke-virtual {v0, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/f;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    iget-wide v1, v0, Lwn/f;->b:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_msn"

    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget v0, v0, Lwn/f;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v1, "_HLS_part"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final c(Lko/a0;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lko/e0;

    iget-object v2, v1, Lko/e0;->f:Ljava/lang/Object;

    check-cast v2, Lwn/n;

    instance-of v3, v2, Lwn/j;

    if-eqz v3, :cond_0

    iget-object v4, v2, Lwn/n;->a:Ljava/lang/String;

    sget-object v5, Lwn/m;->n:Lwn/m;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    new-instance v4, Lrm/b0;

    invoke-direct {v4}, Lrm/b0;-><init>()V

    const-string v5, "0"

    iput-object v5, v4, Lrm/b0;->a:Ljava/lang/String;

    const-string v5, "application/x-mpegURL"

    iput-object v5, v4, Lrm/b0;->j:Ljava/lang/String;

    new-instance v8, Lrm/c0;

    invoke-direct {v8, v4}, Lrm/c0;-><init>(Lrm/b0;)V

    new-instance v6, Lwn/l;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lwn/l;-><init>(Landroid/net/Uri;Lrm/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v7, Lwn/m;

    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/16 v17, 0x0

    sget-object v18, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v8, ""

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v11, v9

    move-object v12, v9

    move-object v13, v9

    move-object v14, v9

    move-object/from16 v19, v9

    invoke-direct/range {v7 .. v19}, Lwn/m;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrm/c0;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    move-object v7, v2

    check-cast v7, Lwn/m;

    :goto_0
    iput-object v7, v0, Lwn/c;->J:Lwn/m;

    iget-object v4, v7, Lwn/m;->e:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/l;

    iget-object v4, v4, Lwn/l;->a:Landroid/net/Uri;

    iput-object v4, v0, Lwn/c;->K:Landroid/net/Uri;

    iget-object v4, v0, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v6, Lwn/a;

    invoke-direct {v6, v0}, Lwn/a;-><init>(Lwn/c;)V

    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v7, Lwn/m;->d:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    :goto_1
    if-ge v5, v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/net/Uri;

    new-instance v8, Lwn/b;

    invoke-direct {v8, v0, v7}, Lwn/b;-><init>(Lwn/c;Landroid/net/Uri;)V

    iget-object v9, v0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v9, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    new-instance v8, Lsn/m;

    iget-object v1, v1, Lko/e0;->d:Lko/i0;

    iget-object v1, v1, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iget-object v1, v0, Lwn/c;->z:Ljava/util/HashMap;

    iget-object v4, v0, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/b;

    if-eqz v3, :cond_2

    check-cast v2, Lwn/j;

    invoke-virtual {v1, v2}, Lwn/b;->e(Lwn/j;)V

    goto :goto_2

    :cond_2
    iget-object v2, v1, Lwn/b;->w:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Lwn/b;->d(Landroid/net/Uri;)V

    :goto_2
    iget-object v1, v0, Lwn/c;->y:Lg73/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v0, Lwn/c;->F:Lsn/z;

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x4

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {v7 .. v17}, Lsn/z;->e(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final d(Landroid/net/Uri;)Z
    .locals 7

    iget-object v0, p0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwn/b;

    iget-object v0, p1, Lwn/b;->z:Lwn/j;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p1, Lwn/b;->z:Lwn/j;

    iget-wide v2, v2, Lwn/j;->u:J

    invoke-static {v2, v3}, Llo/y;->G(J)J

    move-result-wide v2

    const-wide/16 v4, 0x7530

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iget-object v4, p1, Lwn/b;->z:Lwn/j;

    iget-boolean v5, v4, Lwn/j;->o:Z

    const/4 v6, 0x1

    if-nez v5, :cond_2

    iget v4, v4, Lwn/j;->d:I

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    if-eq v4, v6, :cond_2

    iget-wide v4, p1, Lwn/b;->E:J

    add-long/2addr v4, v2

    cmp-long p1, v4, v0

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    return v6
.end method

.method public final p(Lko/a0;Z)V
    .locals 11

    check-cast p1, Lko/e0;

    new-instance v1, Lsn/m;

    iget-wide v2, p1, Lko/e0;->a:J

    iget-object p1, p1, Lko/e0;->d:Lko/i0;

    iget-object p1, p1, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Lwn/c;->y:Lg73/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lwn/c;->F:Lsn/z;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x4

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v10}, Lsn/z;->c(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final q(Lko/a0;Ljava/io/IOException;I)Lbb/f;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v1, p1

    check-cast v1, Lko/e0;

    new-instance v2, Lsn/m;

    iget-wide v3, v1, Lko/e0;->a:J

    iget-object v3, v1, Lko/e0;->d:Lko/i0;

    iget-object v3, v3, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget v3, v1, Lko/e0;->c:I

    iget-object v1, v0, Lwn/c;->y:Lg73/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, v12, Lcom/google/android/exoplayer2/ParserException;

    const/4 v4, 0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_2

    instance-of v1, v12, Ljava/io/FileNotFoundException;

    if-nez v1, :cond_2

    instance-of v1, v12, Lcom/google/android/exoplayer2/upstream/HttpDataSource$CleartextNotPermittedException;

    if-nez v1, :cond_2

    instance-of v1, v12, Lcom/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException;

    if-nez v1, :cond_2

    sget v1, Lcom/google/android/exoplayer2/upstream/DataSourceException;->x:I

    move-object v1, v12

    :goto_0
    if-eqz v1, :cond_1

    instance-of v7, v1, Lcom/google/android/exoplayer2/upstream/DataSourceException;

    if-eqz v7, :cond_0

    move-object v7, v1

    check-cast v7, Lcom/google/android/exoplayer2/upstream/DataSourceException;

    iget v7, v7, Lcom/google/android/exoplayer2/upstream/DataSourceException;->w:I

    const/16 v8, 0x7d8

    if-ne v7, v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, p3, -0x1

    mul-int/lit16 v1, v1, 0x3e8

    const/16 v7, 0x1388

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v7, v1

    move-wide v14, v7

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v14, v5

    :goto_2
    cmp-long v1, v14, v5

    const/4 v5, 0x0

    if-nez v1, :cond_3

    move v13, v4

    goto :goto_3

    :cond_3
    move v13, v5

    :goto_3
    iget-object v1, v0, Lwn/c;->F:Lsn/z;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v16, v7

    const/4 v7, 0x0

    move/from16 v0, v16

    invoke-virtual/range {v1 .. v13}, Lsn/z;->g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v13, :cond_4

    sget-object v0, Lko/c0;->f:Lbb/f;

    return-object v0

    :cond_4
    new-instance v1, Lbb/f;

    invoke-direct {v1, v0, v14, v15, v0}, Lbb/f;-><init>(IJB)V

    return-object v1
.end method
