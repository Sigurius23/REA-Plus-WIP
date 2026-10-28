.class public final Lae3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# static fields
.field public static final w:Lae3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lae3/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lae3/c;->w:Lae3/c;

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 24

    move-object/from16 v0, p1

    const-string v1, "close"

    const-string v2, "chain"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lae3/i;

    iget-object v3, v0, Lae3/i;->d:Lzd3/g;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v9, v3, Lzd3/g;->d:Lae3/g;

    iget-object v10, v3, Lzd3/g;->b:Lud3/a0;

    iget-object v2, v3, Lzd3/g;->a:Lzd3/o;

    iget-object v11, v0, Lae3/i;->e:Lud3/o0;

    iget-object v0, v11, Lud3/o0;->d:Lud3/v0;

    iget-object v4, v11, Lud3/o0;->c:Lud3/d0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iget-object v5, v11, Lud3/o0;->b:Ljava/lang/String;

    invoke-static {v5}, Lwb3/f;->X(Ljava/lang/String;)Z

    move-result v5

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eqz v5, :cond_0

    if-eqz v0, :cond_0

    move v5, v15

    goto :goto_0

    :cond_0
    move v5, v14

    :goto_0
    const-string v6, "Connection"

    invoke-virtual {v4, v6}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "upgrade"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v16

    const/16 v17, 0x0

    :try_start_0
    invoke-virtual {v10, v2}, Lud3/a0;->requestHeadersStart(Lud3/j;)V

    invoke-interface {v9, v11}, Lae3/g;->f(Lud3/o0;)V

    invoke-virtual {v10, v2, v11}, Lud3/a0;->requestHeadersEnd(Lud3/j;Lud3/o0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_a

    if-eqz v5, :cond_6

    :try_start_1
    const-string v5, "100-continue"

    const-string v7, "Expect"

    invoke-virtual {v4, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6

    if-eqz v4, :cond_1

    :try_start_2
    invoke-interface {v9}, Lae3/g;->h()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    invoke-virtual {v3, v15}, Lzd3/g;->e(Z)Lud3/w0;

    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-virtual {v10, v2}, Lud3/a0;->responseHeadersStart(Lud3/j;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v18, v4

    move/from16 v19, v14

    goto :goto_2

    :catch_0
    move-exception v0

    move-object/from16 v22, v6

    move/from16 v19, v15

    :goto_1
    move-object v15, v8

    goto/16 :goto_a

    :catch_1
    move-exception v0

    move-object/from16 v22, v6

    move/from16 v19, v15

    move-object/from16 v4, v17

    goto :goto_1

    :catch_2
    move-exception v0

    :try_start_5
    invoke-virtual {v10, v2, v0}, Lud3/a0;->requestFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-virtual {v3, v0}, Lzd3/g;->f(Ljava/io/IOException;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :cond_1
    move/from16 v19, v15

    move-object/from16 v18, v17

    :goto_2
    if-nez v18, :cond_3

    :try_start_6
    invoke-virtual {v0}, Lud3/v0;->isDuplex()Z

    move-result v4
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    if-eqz v4, :cond_2

    :try_start_7
    invoke-interface {v9}, Lae3/g;->h()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    :try_start_8
    invoke-virtual {v3, v11, v15}, Lzd3/g;->b(Lud3/o0;Z)Lzd3/e;

    move-result-object v4

    invoke-static {v4}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v4

    invoke-virtual {v0, v4}, Lud3/v0;->writeTo(Lne3/i;)V

    :goto_3
    move-object/from16 v22, v6

    move-object v15, v8

    goto :goto_6

    :catch_3
    move-exception v0

    move-object/from16 v22, v6

    move-object v15, v8

    :goto_4
    move-object/from16 v4, v18

    goto/16 :goto_a

    :catch_4
    move-exception v0

    invoke-virtual {v10, v2, v0}, Lud3/a0;->requestFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-virtual {v3, v0}, Lzd3/g;->f(Ljava/io/IOException;)V

    throw v0

    :cond_2
    invoke-virtual {v3, v11, v14}, Lzd3/g;->b(Lud3/o0;Z)Lzd3/e;

    move-result-object v4

    invoke-static {v4}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v4

    invoke-virtual {v0, v4}, Lud3/v0;->writeTo(Lne3/i;)V

    invoke-virtual {v4}, Lne3/h0;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_3

    :cond_3
    move-object v4, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v8

    const/4 v8, 0x0

    move-object/from16 v20, v4

    const/4 v4, 0x1

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 v22, v20

    move-object/from16 v15, v21

    :try_start_9
    invoke-virtual/range {v2 .. v8}, Lzd3/o;->h(Lzd3/g;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    invoke-virtual {v3}, Lzd3/g;->c()Lzd3/p;

    move-result-object v4

    iget-object v4, v4, Lzd3/p;->j:Lce3/q;

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_5

    :cond_4
    move v4, v14

    :goto_5
    if-nez v4, :cond_5

    invoke-interface {v9}, Lae3/g;->j()Lae3/f;

    move-result-object v4

    invoke-interface {v4}, Lae3/f;->c()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    :cond_5
    :goto_6
    move-object/from16 v4, v18

    goto :goto_8

    :catch_5
    move-exception v0

    goto :goto_4

    :catch_6
    move-exception v0

    move-object/from16 v22, v6

    move-object v15, v8

    :goto_7
    move-object/from16 v4, v17

    const/16 v19, 0x1

    goto :goto_a

    :cond_6
    move-object/from16 v22, v6

    move-object v15, v8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    :try_start_a
    invoke-virtual/range {v2 .. v8}, Lzd3/o;->h(Lzd3/g;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    move-object/from16 v4, v17

    const/16 v19, 0x1

    :goto_8
    if-eqz v0, :cond_7

    :try_start_b
    invoke-virtual {v0}, Lud3/v0;->isDuplex()Z

    move-result v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    if-nez v0, :cond_8

    goto :goto_9

    :catch_7
    move-exception v0

    goto :goto_a

    :cond_7
    :goto_9
    :try_start_c
    invoke-interface {v9}, Lae3/g;->a()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8

    :cond_8
    move-object v0, v4

    move-object/from16 v4, v17

    goto :goto_b

    :catch_8
    move-exception v0

    :try_start_d
    invoke-virtual {v10, v2, v0}, Lud3/a0;->requestFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-virtual {v3, v0}, Lzd3/g;->f(Ljava/io/IOException;)V

    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    :catch_9
    move-exception v0

    goto :goto_7

    :catch_a
    move-exception v0

    move-object/from16 v22, v6

    move-object v15, v8

    :try_start_e
    invoke-virtual {v10, v2, v0}, Lud3/a0;->requestFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-virtual {v3, v0}, Lzd3/g;->f(Ljava/io/IOException;)V

    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9

    :goto_a
    instance-of v5, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    if-nez v5, :cond_1d

    iget-boolean v5, v3, Lzd3/g;->f:Z

    if-eqz v5, :cond_1c

    move-object/from16 v23, v4

    move-object v4, v0

    move-object/from16 v0, v23

    :goto_b
    if-nez v0, :cond_9

    :try_start_f
    invoke-virtual {v3, v14}, Lzd3/g;->e(Z)Lud3/w0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz v19, :cond_9

    invoke-virtual {v10, v2}, Lud3/a0;->responseHeadersStart(Lud3/j;)V

    move/from16 v19, v14

    goto :goto_c

    :catch_b
    move-exception v0

    goto/16 :goto_14

    :cond_9
    :goto_c
    iput-object v11, v0, Lud3/w0;->a:Lud3/o0;

    invoke-virtual {v3}, Lzd3/g;->c()Lzd3/p;

    move-result-object v5

    iget-object v5, v5, Lzd3/p;->f:Lud3/c0;

    iput-object v5, v0, Lud3/w0;->e:Lud3/c0;

    iput-wide v12, v0, Lud3/w0;->l:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-wide v5, v0, Lud3/w0;->m:J

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    iget v5, v0, Lud3/x0;->z:I
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_b

    :goto_d
    iget-object v6, v0, Lud3/x0;->G:Lud3/a1;

    const/16 v7, 0x64

    if-ne v5, v7, :cond_a

    goto :goto_e

    :cond_a
    const/16 v7, 0x66

    if-gt v7, v5, :cond_c

    const/16 v7, 0xc8

    if-ge v5, v7, :cond_c

    :goto_e
    :try_start_10
    invoke-virtual {v3, v14}, Lzd3/g;->e(Z)Lud3/w0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz v19, :cond_b

    invoke-virtual {v10, v2}, Lud3/a0;->responseHeadersStart(Lud3/j;)V

    :cond_b
    iput-object v11, v0, Lud3/w0;->a:Lud3/o0;

    invoke-virtual {v3}, Lzd3/g;->c()Lzd3/p;

    move-result-object v5

    iget-object v5, v5, Lzd3/p;->f:Lud3/c0;

    iput-object v5, v0, Lud3/w0;->e:Lud3/c0;

    iput-wide v12, v0, Lud3/w0;->l:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-wide v5, v0, Lud3/w0;->m:J

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    iget v5, v0, Lud3/x0;->z:I

    goto :goto_d

    :cond_c
    invoke-virtual {v10, v2, v0}, Lud3/a0;->responseHeadersEnd(Lud3/j;Lud3/x0;)V

    const/16 v2, 0x65

    if-ne v5, v2, :cond_d

    const/4 v2, 0x1

    goto :goto_f

    :cond_d
    move v2, v14

    :goto_f
    if-eqz v2, :cond_10

    invoke-virtual {v3}, Lzd3/g;->c()Lzd3/p;

    move-result-object v7

    iget-object v7, v7, Lzd3/p;->j:Lce3/q;

    if-eqz v7, :cond_e

    const/4 v7, 0x1

    goto :goto_10

    :cond_e
    move v7, v14

    :goto_10
    if-nez v7, :cond_f

    goto :goto_11

    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected 101 code on HTTP/2 connection"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_11
    if-eqz v2, :cond_12

    iget-object v2, v0, Lud3/x0;->F:Lud3/d0;

    move-object/from16 v7, v22

    invoke-virtual {v2, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_11

    move-object/from16 v2, v17

    :cond_11
    invoke-virtual {v15, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v14, 0x1

    goto :goto_12

    :cond_12
    move-object/from16 v7, v22

    :cond_13
    :goto_12
    if-eqz v16, :cond_14

    if-eqz v14, :cond_14

    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v0

    new-instance v2, Lwd3/d;

    invoke-virtual {v6}, Lud3/a1;->k()Lud3/h0;

    move-result-object v8

    invoke-virtual {v6}, Lud3/a1;->i()J

    move-result-wide v10

    invoke-direct {v2, v8, v10, v11}, Lwd3/d;-><init>(Lud3/h0;J)V

    iput-object v2, v0, Lud3/w0;->g:Lud3/a1;

    invoke-virtual {v3}, Lzd3/g;->g()Lz63/d;

    move-result-object v2

    iput-object v2, v0, Lud3/w0;->h:Lne3/o0;

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    goto :goto_13

    :cond_14
    invoke-virtual {v3, v0}, Lzd3/g;->d(Lud3/x0;)Lae3/j;

    move-result-object v2

    invoke-virtual {v0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v0

    iput-object v2, v0, Lud3/w0;->g:Lud3/a1;

    new-instance v2, Lae3/b;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Lud3/w0;->o:Lud3/d1;

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object v0

    :goto_13
    iget-object v2, v0, Lud3/x0;->w:Lud3/o0;

    iget-object v2, v2, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v2, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_16

    iget-object v2, v0, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v2, v7}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_15

    move-object/from16 v2, v17

    :cond_15
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_17

    :cond_16
    invoke-interface {v9}, Lae3/g;->j()Lae3/f;

    move-result-object v1

    invoke-interface {v1}, Lae3/f;->c()V

    :cond_17
    const/16 v1, 0xcc

    if-eq v5, v1, :cond_18

    const/16 v1, 0xcd

    if-ne v5, v1, :cond_19

    :cond_18
    iget-object v1, v0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v1}, Lud3/a1;->i()J

    move-result-wide v1

    const-wide/16 v6, 0x0

    cmp-long v1, v1, v6

    if-gtz v1, :cond_1a

    :cond_19
    return-object v0

    :cond_1a
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HTTP "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " had non-zero Content-Length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b

    :goto_14
    if-eqz v4, :cond_1b

    invoke-static {v4, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v4

    :cond_1b
    throw v0

    :cond_1c
    throw v0

    :cond_1d
    throw v0
.end method
