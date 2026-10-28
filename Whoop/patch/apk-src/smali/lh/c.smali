.class public final Llh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lud3/o0;

.field public final b:Llh/b;

.field public final c:Ljava/util/Date;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Date;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/Date;

.field public final h:J

.field public final i:J

.field public final j:Ljava/lang/String;

.field public final k:I


# direct methods
.method public constructor <init>(Lud3/o0;Llh/b;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh/c;->a:Lud3/o0;

    iput-object p2, p0, Llh/c;->b:Llh/b;

    const/4 p1, -0x1

    iput p1, p0, Llh/c;->k:I

    if-eqz p2, :cond_b

    iget-wide v0, p2, Llh/b;->c:J

    iput-wide v0, p0, Llh/c;->h:J

    iget-wide v0, p2, Llh/b;->d:J

    iput-wide v0, p0, Llh/c;->i:J

    iget-object p2, p2, Llh/b;->f:Lud3/d0;

    invoke-virtual {p2}, Lud3/d0;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_b

    invoke-virtual {p2, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Date"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {p2, v4}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lae3/e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    :cond_0
    iput-object v6, p0, Llh/c;->c:Ljava/util/Date;

    invoke-virtual {p2, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Llh/c;->d:Ljava/lang/String;

    goto/16 :goto_2

    :cond_1
    const-string v4, "Expires"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p2, v4}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lae3/e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    :cond_2
    iput-object v6, p0, Llh/c;->g:Ljava/util/Date;

    goto :goto_2

    :cond_3
    const-string v4, "Last-Modified"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {p2, v4}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v3}, Lae3/e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    :cond_4
    iput-object v6, p0, Llh/c;->e:Ljava/util/Date;

    invoke-virtual {p2, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Llh/c;->f:Ljava/lang/String;

    goto :goto_2

    :cond_5
    const-string v4, "ETag"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p2, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Llh/c;->j:Ljava/lang/String;

    goto :goto_2

    :cond_6
    const-string v4, "Age"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p2, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {v3}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/32 v5, 0x7fffffff

    cmp-long v5, v3, v5

    if-lez v5, :cond_7

    const v3, 0x7fffffff

    goto :goto_1

    :cond_7
    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-gez v5, :cond_8

    move v3, v1

    goto :goto_1

    :cond_8
    long-to-int v3, v3

    goto :goto_1

    :cond_9
    move v3, p1

    :goto_1
    iput v3, p0, Llh/c;->k:I

    :cond_a
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method


# virtual methods
.method public final a()Llh/d;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Llh/c;->a:Lud3/o0;

    iget-object v2, v1, Lud3/o0;->c:Lud3/d0;

    iget-object v3, v1, Lud3/o0;->a:Lud3/e0;

    const/4 v4, 0x0

    iget-object v5, v0, Llh/c;->b:Llh/b;

    if-nez v5, :cond_0

    new-instance v2, Llh/d;

    invoke-direct {v2, v1, v4}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v2

    :cond_0
    iget-object v6, v5, Llh/b;->a:Ljava/lang/Object;

    invoke-virtual {v3}, Lud3/e0;->f()Z

    move-result v7

    if-eqz v7, :cond_1

    iget-boolean v7, v5, Llh/b;->e:Z

    if-nez v7, :cond_1

    new-instance v2, Llh/d;

    invoke-direct {v2, v1, v4}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v2

    :cond_1
    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lud3/h;

    invoke-virtual {v1}, Lud3/o0;->a()Lud3/h;

    move-result-object v8

    iget-boolean v8, v8, Lud3/h;->b:Z

    if-nez v8, :cond_12

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lud3/h;

    iget-boolean v8, v8, Lud3/h;->b:Z

    if-nez v8, :cond_12

    iget-object v8, v5, Llh/b;->f:Lud3/d0;

    const-string v9, "Vary"

    invoke-virtual {v8, v9}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "*"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    invoke-virtual {v1}, Lud3/o0;->a()Lud3/h;

    move-result-object v8

    iget-boolean v9, v8, Lud3/h;->a:Z

    if-nez v9, :cond_11

    const-string v9, "If-Modified-Since"

    invoke-virtual {v2, v9}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_11

    const-string v10, "If-None-Match"

    invoke-virtual {v2, v10}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    goto/16 :goto_6

    :cond_2
    iget-wide v11, v0, Llh/c;->i:J

    iget-object v2, v0, Llh/c;->c:Ljava/util/Date;

    const-wide/16 v13, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v15

    move-object/from16 v17, v5

    sub-long v4, v11, v15

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_0

    :cond_3
    move-object/from16 v17, v5

    move-wide v4, v13

    :goto_0
    const/4 v15, -0x1

    move-wide/from16 v18, v13

    iget v13, v0, Llh/c;->k:I

    if-eq v13, v15, :cond_4

    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v20, v2

    move-object/from16 v16, v3

    int-to-long v2, v13

    invoke-virtual {v14, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_1

    :cond_4
    move-object/from16 v20, v2

    move-object/from16 v16, v3

    :goto_1
    iget-wide v2, v0, Llh/c;->h:J

    sub-long v13, v11, v2

    sget-object v21, Lqh/i;->a:Lqh/h;

    invoke-virtual/range {v21 .. v21}, Lqh/h;->invoke()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Ljava/lang/Number;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Number;->longValue()J

    move-result-wide v21

    sub-long v21, v21, v11

    add-long/2addr v4, v13

    add-long v4, v4, v21

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lud3/h;

    iget v6, v6, Lud3/h;->c:I

    iget-object v13, v0, Llh/c;->e:Ljava/util/Date;

    if-eq v6, v15, :cond_5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v11, v6

    invoke-virtual {v2, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    goto :goto_2

    :cond_5
    iget-object v6, v0, Llh/c;->g:Ljava/util/Date;

    if-eqz v6, :cond_8

    if-eqz v20, :cond_6

    invoke-virtual/range {v20 .. v20}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    :cond_6
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v2, v11

    cmp-long v6, v2, v18

    if-lez v6, :cond_7

    goto :goto_2

    :cond_7
    move-wide/from16 v2, v18

    goto :goto_2

    :cond_8
    if-eqz v13, :cond_7

    invoke-virtual/range {v16 .. v16}, Lud3/e0;->i()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    if-eqz v20, :cond_9

    invoke-virtual/range {v20 .. v20}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    :cond_9
    invoke-virtual {v13}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    sub-long/2addr v2, v11

    cmp-long v6, v2, v18

    if-lez v6, :cond_7

    const/16 v6, 0xa

    int-to-long v11, v6

    div-long/2addr v2, v11

    :goto_2
    iget v6, v8, Lud3/h;->c:I

    if-eq v6, v15, :cond_a

    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v21, v4

    int-to-long v4, v6

    invoke-virtual {v11, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_3

    :cond_a
    move-wide/from16 v21, v4

    :goto_3
    iget v4, v8, Lud3/h;->i:I

    if-eq v4, v15, :cond_b

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v11, v4

    invoke-virtual {v5, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    goto :goto_4

    :cond_b
    move-wide/from16 v4, v18

    :goto_4
    iget-boolean v6, v7, Lud3/h;->g:Z

    if-nez v6, :cond_c

    iget v6, v8, Lud3/h;->h:I

    if-eq v6, v15, :cond_c

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v11, v6

    invoke-virtual {v8, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    move-wide/from16 v18, v11

    :cond_c
    iget-boolean v6, v7, Lud3/h;->a:Z

    if-nez v6, :cond_d

    add-long v4, v21, v4

    add-long v2, v2, v18

    cmp-long v2, v4, v2

    if-gez v2, :cond_d

    new-instance v1, Llh/d;

    move-object/from16 v3, v17

    const/4 v2, 0x0

    invoke-direct {v1, v2, v3}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v1

    :cond_d
    move-object/from16 v3, v17

    iget-object v2, v0, Llh/c;->j:Ljava/lang/String;

    if-eqz v2, :cond_e

    move-object v9, v10

    goto :goto_5

    :cond_e
    if-eqz v13, :cond_f

    iget-object v2, v0, Llh/c;->f:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_5

    :cond_f
    if-eqz v20, :cond_10

    iget-object v2, v0, Llh/c;->d:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_5
    invoke-virtual {v1}, Lud3/o0;->b()Lud3/n0;

    move-result-object v1

    invoke-virtual {v1, v9, v2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lud3/o0;

    invoke-direct {v2, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance v1, Llh/d;

    invoke-direct {v1, v2, v3}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v1

    :cond_10
    new-instance v2, Llh/d;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v2

    :cond_11
    :goto_6
    move-object v3, v4

    new-instance v2, Llh/d;

    invoke-direct {v2, v1, v3}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v2

    :cond_12
    move-object v3, v4

    new-instance v2, Llh/d;

    invoke-direct {v2, v1, v3}, Llh/d;-><init>(Lud3/o0;Llh/b;)V

    return-object v2
.end method
