.class public final Lbe3/c;
.super Lbe3/a;
.source "SourceFile"


# instance fields
.field public E:J

.field public F:Z

.field public final synthetic G:Lbe3/g;


# direct methods
.method public constructor <init>(Lbe3/g;Lud3/e0;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe3/c;->G:Lbe3/g;

    invoke-direct {p0, p1, p2}, Lbe3/a;-><init>(Lbe3/g;Lud3/e0;)V

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lbe3/c;->E:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbe3/c;->F:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lbe3/a;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lbe3/c;->F:Z

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    const-string v1, "timeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x64

    :try_start_0
    invoke-static {p0, v0}, Lwd3/h;->g(Lne3/p0;I)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lbe3/c;->G:Lbe3/g;

    iget-object v0, v0, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->c()V

    sget-object v0, Lbe3/g;->f:Lud3/d0;

    invoke-virtual {p0, v0}, Lbe3/a;->b(Lud3/d0;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbe3/a;->y:Z

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    iget-object v4, v1, Lbe3/c;->G:Lbe3/g;

    iget-object v5, v4, Lbe3/g;->c:Ls/m2;

    const-string v6, "sink"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-ltz v8, :cond_10

    iget-boolean v8, v1, Lbe3/a;->y:Z

    if-nez v8, :cond_f

    iget-boolean v8, v1, Lbe3/c;->F:Z

    const-wide/16 v9, -0x1

    if-nez v8, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-wide v11, v1, Lbe3/c;->E:J

    cmp-long v8, v11, v6

    if-eqz v8, :cond_1

    cmp-long v8, v11, v9

    if-nez v8, :cond_c

    :cond_1
    cmp-long v8, v11, v9

    if-eqz v8, :cond_2

    iget-object v8, v5, Ls/m2;->x:Ljava/lang/Object;

    check-cast v8, Lne3/j0;

    const-wide v11, 0x7fffffffffffffffL

    invoke-virtual {v8, v11, v12}, Lne3/j0;->M(J)Ljava/lang/String;

    :cond_2
    :try_start_0
    iget-object v8, v5, Ls/m2;->x:Ljava/lang/Object;

    check-cast v8, Lne3/j0;

    iget-object v11, v8, Lne3/j0;->x:Lne3/h;

    const-wide/16 v12, 0x1

    invoke-virtual {v8, v12, v13}, Lne3/j0;->g0(J)V

    const/4 v12, 0x0

    move v13, v12

    :goto_0
    add-int/lit8 v14, v13, 0x1

    move-wide v15, v6

    int-to-long v6, v14

    invoke-virtual {v8, v6, v7}, Lne3/j0;->request(J)Z

    move-result v6

    if-eqz v6, :cond_8

    int-to-long v6, v13

    invoke-virtual {v11, v6, v7}, Lne3/h;->s(J)B

    move-result v6

    const/16 v7, 0x30

    if-lt v6, v7, :cond_3

    const/16 v7, 0x39

    if-le v6, v7, :cond_5

    :cond_3
    const/16 v7, 0x61

    if-lt v6, v7, :cond_4

    const/16 v7, 0x66

    if-le v6, v7, :cond_5

    :cond_4
    const/16 v7, 0x41

    if-lt v6, v7, :cond_6

    const/16 v7, 0x46

    if-le v6, v7, :cond_5

    goto :goto_1

    :cond_5
    move v13, v14

    move-wide v6, v15

    goto :goto_0

    :cond_6
    :goto_1
    if-eqz v13, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    const/16 v2, 0x10

    invoke-static {v2}, Lva3/d;->c(I)V

    invoke-static {v6, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_2
    invoke-virtual {v11}, Lne3/h;->p0()J

    move-result-wide v6

    iput-wide v6, v1, Lbe3/c;->E:J

    iget-object v5, v5, Ls/m2;->x:Ljava/lang/Object;

    check-cast v5, Lne3/j0;

    const-wide v6, 0x7fffffffffffffffL

    invoke-virtual {v5, v6, v7}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget-wide v6, v1, Lbe3/c;->E:J

    cmp-long v6, v6, v15

    if-ltz v6, :cond_e

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_9

    const-string v6, ";"

    invoke-static {v5, v6, v12}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v6, :cond_e

    goto :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_9
    :goto_3
    iget-wide v5, v1, Lbe3/c;->E:J

    cmp-long v5, v5, v15

    if-nez v5, :cond_b

    iput-boolean v12, v1, Lbe3/c;->F:Z

    iget-object v5, v4, Lbe3/g;->e:Lan/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lkotlin/jvm/internal/k0;

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    :goto_4
    iget-object v7, v5, Lan/d;->y:Ljava/lang/Object;

    check-cast v7, Lne3/j;

    iget-wide v11, v5, Lan/d;->x:J

    invoke-interface {v7, v11, v12}, Lne3/j;->M(J)Ljava/lang/String;

    move-result-object v7

    iget-wide v11, v5, Lan/d;->x:J

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    int-to-long v13, v8

    sub-long/2addr v11, v13

    iput-wide v11, v5, Lan/d;->x:J

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v6}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v5

    invoke-virtual {v1, v5}, Lbe3/a;->b(Lud3/d0;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/k0;->c(Ljava/lang/String;)V

    goto :goto_4

    :cond_b
    :goto_5
    iget-boolean v5, v1, Lbe3/c;->F:Z

    if-nez v5, :cond_c

    :goto_6
    return-wide v9

    :cond_c
    iget-wide v5, v1, Lbe3/c;->E:J

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-super {v1, v0, v2, v3}, Lbe3/a;->h1(Lne3/h;J)J

    move-result-wide v2

    cmp-long v0, v2, v9

    if-eqz v0, :cond_d

    iget-wide v4, v1, Lbe3/c;->E:J

    sub-long/2addr v4, v2

    iput-wide v4, v1, Lbe3/c;->E:J

    return-wide v2

    :cond_d
    iget-object v0, v4, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->c()V

    new-instance v0, Ljava/net/ProtocolException;

    const-string v2, "unexpected end of stream"

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    sget-object v2, Lbe3/g;->f:Lud3/d0;

    invoke-virtual {v1, v2}, Lbe3/a;->b(Lud3/d0;)V

    throw v0

    :cond_e
    :try_start_1
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected chunk size and optional extensions but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v1, Lbe3/c;->E:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_7
    new-instance v2, Ljava/net/ProtocolException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    const-string v0, "byteCount < 0: "

    invoke-static {v2, v3, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
