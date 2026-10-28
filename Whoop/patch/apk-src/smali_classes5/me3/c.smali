.class public final Lme3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# instance fields
.field public final w:Lme3/b;

.field public volatile x:Ljava/lang/Object;

.field public volatile y:Lm83/a0;

.field public volatile z:Lme3/a;


# direct methods
.method public constructor <init>(Lme3/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme3/c;->w:Lme3/b;

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    iput-object p1, p0, Lme3/c;->x:Ljava/lang/Object;

    iput-object p1, p0, Lme3/c;->y:Lm83/a0;

    sget-object p1, Lme3/a;->w:Lme3/a;

    iput-object p1, p0, Lme3/c;->z:Lme3/a;

    return-void
.end method


# virtual methods
.method public final a(Lud3/d0;I)V
    .locals 3

    iget-object v0, p0, Lme3/c;->x:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u2588\u2588"

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lme3/c;->w:Lme3/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lme3/b;->log(Ljava/lang/String;)V

    return-void
.end method

.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "chain"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lme3/c;->z:Lme3/a;

    check-cast v0, Lae3/i;

    iget-object v3, v0, Lae3/i;->e:Lud3/o0;

    sget-object v4, Lme3/a;->w:Lme3/a;

    if-ne v2, v4, :cond_0

    invoke-virtual {v0, v3}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v4, Lme3/a;->z:Lme3/a;

    const/4 v6, 0x1

    if-ne v2, v4, :cond_1

    move v4, v6

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_3

    sget-object v7, Lme3/a;->y:Lme3/a;

    if-ne v2, v7, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :cond_3
    :goto_1
    iget-object v2, v3, Lud3/o0;->d:Lud3/v0;

    iget-object v7, v0, Lae3/i;->d:Lzd3/g;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lzd3/g;->c()Lzd3/p;

    move-result-object v7

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "--> "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x20

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v10, v3, Lud3/o0;->a:Lud3/e0;

    const-string v11, "url"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v1, Lme3/c;->y:Lm83/a0;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v10, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ""

    const-string v12, " "

    if-eqz v7, :cond_5

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v7, Lzd3/p;->g:Lud3/m0;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_5
    move-object v7, v10

    :goto_3
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v9, "-byte body)"

    const-string v13, " ("

    if-nez v6, :cond_6

    if-eqz v2, :cond_6

    invoke-static {v7, v13}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v2}, Lud3/v0;->contentLength()J

    move-result-wide v14

    invoke-virtual {v7, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_6
    iget-object v14, v1, Lme3/c;->w:Lme3/b;

    invoke-interface {v14, v7}, Lme3/b;->log(Ljava/lang/String;)V

    const-string v7, "identity"

    const-string v14, "-byte body omitted)"

    const-string v15, "Content-Encoding"

    const-string v5, "gzip"

    const-wide/16 v16, -0x1

    if-eqz v6, :cond_16

    iget-object v8, v3, Lud3/o0;->c:Lud3/d0;

    move/from16 v18, v4

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v4

    move/from16 v19, v6

    if-eqz v4, :cond_7

    const-string v6, "Content-Type"

    invoke-virtual {v8, v6}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    iget-object v6, v1, Lme3/c;->w:Lme3/b;

    move-object/from16 v20, v11

    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v21, v12

    const-string v12, "Content-Type: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Lme3/b;->log(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    move-object/from16 v20, v11

    move-object/from16 v21, v12

    :goto_4
    invoke-virtual {v2}, Lud3/v0;->contentLength()J

    move-result-wide v11

    cmp-long v4, v11, v16

    if-eqz v4, :cond_9

    const-string v4, "Content-Length"

    invoke-virtual {v8, v4}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    iget-object v4, v1, Lme3/c;->w:Lme3/b;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "Content-Length: "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lud3/v0;->contentLength()J

    move-result-wide v11

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Lme3/b;->log(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    move/from16 v19, v6

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    :cond_9
    :goto_5
    invoke-virtual {v8}, Lud3/d0;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v4, :cond_a

    invoke-virtual {v1, v8, v6}, Lme3/c;->a(Lud3/d0;I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_a
    const-string v4, "--> END "

    if-eqz v18, :cond_15

    if-nez v2, :cond_b

    goto/16 :goto_9

    :cond_b
    iget-object v6, v3, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v6, v15}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_c

    goto :goto_7

    :cond_c
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_d

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_d

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (encoded body omitted)"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lme3/b;->log(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_d
    :goto_7
    invoke-virtual {v2}, Lud3/v0;->isDuplex()Z

    move-result v6

    if-eqz v6, :cond_e

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (duplex request body omitted)"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lme3/b;->log(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_e
    invoke-virtual {v2}, Lud3/v0;->isOneShot()Z

    move-result v6

    if-eqz v6, :cond_f

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (one-shot body omitted)"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lme3/b;->log(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_f
    new-instance v6, Lne3/h;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v6}, Lud3/v0;->writeTo(Lne3/i;)V

    invoke-virtual {v8, v15}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    iget-wide v11, v6, Lne3/h;->x:J

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v11, Lne3/v;

    invoke-direct {v11, v6}, Lne3/v;-><init>(Lne3/j;)V

    :try_start_0
    new-instance v6, Lne3/h;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v6, v11}, Lne3/h;->N0(Lne3/p0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v11}, Lne3/v;->close()V

    goto :goto_8

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v11, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_10
    const/4 v8, 0x0

    :goto_8
    invoke-virtual {v2}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v11

    if-eqz v11, :cond_11

    sget-object v12, Lud3/h0;->e:Lyb3/p;

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v11

    if-nez v11, :cond_12

    :cond_11
    sget-object v11, Lyb3/a;->a:Ljava/nio/charset/Charset;

    :cond_12
    iget-object v12, v1, Lme3/c;->w:Lme3/b;

    invoke-interface {v12, v10}, Lme3/b;->log(Ljava/lang/String;)V

    invoke-static {v6}, Lv63/b;->e(Lne3/h;)Z

    move-result v12

    if-nez v12, :cond_13

    iget-object v6, v1, Lme3/c;->w:Lme3/b;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (binary "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lud3/v0;->contentLength()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v6, v2}, Lme3/b;->log(Ljava/lang/String;)V

    goto/16 :goto_a

    :cond_13
    if-eqz v8, :cond_14

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, v6, Lne3/h;->x:J

    invoke-virtual {v9, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-byte, "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-gzipped-byte body)"

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lme3/b;->log(Ljava/lang/String;)V

    goto :goto_a

    :cond_14
    iget-object v8, v1, Lme3/c;->w:Lme3/b;

    invoke-virtual {v6, v11}, Lne3/h;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v6}, Lme3/b;->log(Ljava/lang/String;)V

    iget-object v6, v1, Lme3/c;->w:Lme3/b;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lud3/v0;->contentLength()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v6, v2}, Lme3/b;->log(Ljava/lang/String;)V

    goto :goto_a

    :cond_15
    :goto_9
    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lme3/b;->log(Ljava/lang/String;)V

    goto :goto_a

    :cond_16
    move/from16 v18, v4

    move/from16 v19, v6

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    :goto_a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    :try_start_2
    invoke-virtual {v0, v3}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long/2addr v3, v8

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    iget-object v4, v0, Lud3/x0;->G:Lud3/a1;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lud3/a1;->i()J

    move-result-wide v11

    cmp-long v6, v11, v16

    move-object/from16 v16, v4

    const-string v4, "-byte"

    if-eqz v6, :cond_17

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_b
    move-wide/from16 v22, v8

    goto :goto_c

    :cond_17
    const-string v6, "unknown-length"

    goto :goto_b

    :goto_c
    iget-object v8, v1, Lme3/c;->w:Lme3/b;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v24, v11

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "<-- "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v12, v0, Lud3/x0;->z:I

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lud3/x0;->y:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_18

    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v12, v21

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v4

    iget-object v4, v0, Lud3/x0;->y:Ljava/lang/String;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    :cond_18
    move-object/from16 v17, v4

    move-object/from16 v12, v21

    :goto_d
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, v0, Lud3/x0;->w:Lud3/o0;

    iget-object v11, v11, Lud3/o0;->a:Lud3/e0;

    move-object/from16 v12, v20

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v1, Lme3/c;->y:Lm83/a0;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v11, v11, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    if-nez v19, :cond_19

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " body"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_19
    const-string v3, ")"

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v8, v3}, Lme3/b;->log(Ljava/lang/String;)V

    if-eqz v19, :cond_26

    iget-object v3, v0, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v3}, Lud3/d0;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_e
    if-ge v6, v4, :cond_1a

    invoke-virtual {v1, v3, v6}, Lme3/c;->a(Lud3/d0;I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_1a
    if-eqz v18, :cond_25

    invoke-static {v0}, Lae3/h;->a(Lud3/x0;)Z

    move-result v4

    if-nez v4, :cond_1b

    goto/16 :goto_11

    :cond_1b
    iget-object v4, v0, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v4, v15}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1c

    goto :goto_f

    :cond_1c
    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1d

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1d

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    const-string v3, "<-- END HTTP (encoded body omitted)"

    invoke-interface {v2, v3}, Lme3/b;->log(Ljava/lang/String;)V

    return-object v0

    :cond_1d
    :goto_f
    iget-object v4, v0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v4}, Lud3/a1;->k()Lud3/h0;

    move-result-object v4

    if-eqz v4, :cond_1e

    iget-object v6, v4, Lud3/h0;->b:Ljava/lang/String;

    const-string v7, "text"

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1e

    iget-object v4, v4, Lud3/h0;->c:Ljava/lang/String;

    const-string v6, "event-stream"

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    const-string v3, "<-- END HTTP (streaming)"

    invoke-interface {v2, v3}, Lme3/b;->log(Ljava/lang/String;)V

    return-object v0

    :cond_1e
    invoke-virtual/range {v16 .. v16}, Lud3/a1;->d1()Lne3/j;

    move-result-object v4

    const-wide v6, 0x7fffffffffffffffL

    invoke-interface {v4, v6, v7}, Lne3/j;->request(J)Z

    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    sub-long v7, v7, v22

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    invoke-interface {v4}, Lne3/j;->f()Lne3/h;

    move-result-object v4

    invoke-virtual {v3, v15}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1f

    iget-wide v8, v4, Lne3/h;->x:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    new-instance v3, Lne3/v;

    invoke-virtual {v4}, Lne3/h;->i()Lne3/h;

    move-result-object v4

    invoke-direct {v3, v4}, Lne3/v;-><init>(Lne3/j;)V

    :try_start_3
    new-instance v4, Lne3/h;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v3}, Lne3/h;->N0(Lne3/p0;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v3}, Lne3/v;->close()V

    goto :goto_10

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v3, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1f
    const/4 v12, 0x0

    :goto_10
    invoke-virtual/range {v16 .. v16}, Lud3/a1;->k()Lud3/h0;

    move-result-object v3

    if-eqz v3, :cond_20

    sget-object v5, Lud3/h0;->e:Lyb3/p;

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lud3/h0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v3

    if-nez v3, :cond_21

    :cond_20
    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    :cond_21
    invoke-static {v4}, Lv63/b;->e(Lne3/h;)Z

    move-result v5

    const-string v8, "<-- END HTTP ("

    if-nez v5, :cond_22

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    invoke-interface {v2, v10}, Lme3/b;->log(Ljava/lang/String;)V

    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    const-string v3, "ms, binary "

    invoke-static {v6, v7, v8, v3}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v4, v4, Lne3/h;->x:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lme3/b;->log(Ljava/lang/String;)V

    return-object v0

    :cond_22
    const-wide/16 v13, 0x0

    cmp-long v5, v24, v13

    if-eqz v5, :cond_23

    iget-object v5, v1, Lme3/c;->w:Lme3/b;

    invoke-interface {v5, v10}, Lme3/b;->log(Ljava/lang/String;)V

    iget-object v5, v1, Lme3/c;->w:Lme3/b;

    invoke-virtual {v4}, Lne3/h;->i()Lne3/h;

    move-result-object v9

    invoke-virtual {v9, v3}, Lne3/h;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v3}, Lme3/b;->log(Ljava/lang/String;)V

    :cond_23
    iget-object v3, v1, Lme3/c;->w:Lme3/b;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "ms, "

    invoke-static {v6, v7, v8, v9}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-wide v7, v4, Lne3/h;->x:J

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v4, v17

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v12, :cond_24

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "-gzipped-byte"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_24
    const-string v2, " body)"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lme3/b;->log(Ljava/lang/String;)V

    return-object v0

    :cond_25
    :goto_11
    iget-object v2, v1, Lme3/c;->w:Lme3/b;

    const-string v3, "<-- END HTTP"

    invoke-interface {v2, v3}, Lme3/b;->log(Ljava/lang/String;)V

    :cond_26
    return-object v0

    :catch_0
    move-exception v0

    move-wide/from16 v22, v8

    move-object/from16 v2, v20

    move-object/from16 v12, v21

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long v5, v5, v22

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    iget-object v6, v1, Lme3/c;->w:Lme3/b;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "<-- HTTP FAILED: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v9, 0x2e

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v3, Lud3/o0;->a:Lud3/e0;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lme3/c;->y:Lm83/a0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v3, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms)"

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v6, v2}, Lme3/b;->log(Ljava/lang/String;)V

    throw v0
.end method
