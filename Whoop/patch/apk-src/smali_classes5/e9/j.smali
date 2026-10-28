.class public final Le9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm9/c;

.field public final b:Lf9/m;

.field public final c:Lf9/b;

.field public final d:Le9/i;

.field public final e:J

.field public final f:J


# direct methods
.method public constructor <init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le9/j;->e:J

    iput-object p3, p0, Le9/j;->b:Lf9/m;

    iput-object p4, p0, Le9/j;->c:Lf9/b;

    iput-wide p6, p0, Le9/j;->f:J

    iput-object p5, p0, Le9/j;->a:Lm9/c;

    iput-object p8, p0, Le9/j;->d:Le9/i;

    return-void
.end method


# virtual methods
.method public final a(JLf9/m;)Le9/j;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Le9/j;->b:Lf9/m;

    invoke-virtual {v1}, Lf9/m;->c()Le9/i;

    move-result-object v9

    move-object v1, v9

    invoke-virtual/range {p3 .. p3}, Lf9/m;->c()Le9/i;

    move-result-object v9

    if-nez v1, :cond_0

    move-object v9, v1

    new-instance v1, Le9/j;

    iget-object v6, v0, Le9/j;->a:Lm9/c;

    iget-wide v7, v0, Le9/j;->f:J

    iget-object v5, v0, Le9/j;->c:Lf9/b;

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v9}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    return-object v1

    :cond_0
    move-object/from16 v18, v9

    move-object v9, v1

    move-object/from16 v1, v18

    invoke-interface {v9}, Le9/i;->A()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v9, v1

    new-instance v1, Le9/j;

    iget-object v6, v0, Le9/j;->a:Lm9/c;

    iget-wide v7, v0, Le9/j;->f:J

    iget-object v5, v0, Le9/j;->c:Lf9/b;

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v9}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    return-object v1

    :cond_1
    move-object v2, v9

    move-object v9, v1

    move-object v1, v2

    move-wide/from16 v2, p1

    invoke-interface {v1, v2, v3}, Le9/i;->w(J)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-nez v6, :cond_2

    new-instance v1, Le9/j;

    iget-object v6, v0, Le9/j;->a:Lm9/c;

    iget-wide v7, v0, Le9/j;->f:J

    iget-object v5, v0, Le9/j;->c:Lf9/b;

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v9}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    return-object v1

    :cond_2
    invoke-static {v9}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v1}, Le9/i;->B()J

    move-result-wide v6

    invoke-interface {v1, v6, v7}, Le9/i;->a(J)J

    move-result-wide v10

    add-long/2addr v4, v6

    const-wide/16 v12, 0x1

    sub-long v12, v4, v12

    invoke-interface {v1, v12, v13}, Le9/i;->a(J)J

    move-result-wide v14

    invoke-interface {v1, v12, v13, v2, v3}, Le9/i;->q(JJ)J

    move-result-wide v12

    add-long/2addr v12, v14

    invoke-interface {v9}, Le9/i;->B()J

    move-result-wide v14

    move-wide/from16 v16, v4

    invoke-interface {v9, v14, v15}, Le9/i;->a(J)J

    move-result-wide v4

    cmp-long v8, v12, v4

    iget-wide v12, v0, Le9/j;->f:J

    if-nez v8, :cond_3

    sub-long v4, v16, v14

    :goto_0
    add-long/2addr v4, v12

    :goto_1
    move-wide v7, v4

    goto :goto_2

    :cond_3
    if-ltz v8, :cond_5

    cmp-long v8, v4, v10

    if-gez v8, :cond_4

    invoke-interface {v9, v10, v11, v2, v3}, Le9/i;->u(JJ)J

    move-result-wide v4

    sub-long/2addr v4, v6

    sub-long v4, v12, v4

    goto :goto_1

    :cond_4
    invoke-interface {v1, v4, v5, v2, v3}, Le9/i;->u(JJ)J

    move-result-wide v4

    sub-long/2addr v4, v14

    goto :goto_0

    :goto_2
    new-instance v1, Le9/j;

    iget-object v5, v0, Le9/j;->c:Lf9/b;

    iget-object v6, v0, Le9/j;->a:Lm9/c;

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v9}, Le9/j;-><init>(JLf9/m;Lf9/b;Lm9/c;JLe9/i;)V

    return-object v1

    :cond_5
    new-instance v1, Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    invoke-direct {v1}, Landroidx/media3/exoplayer/source/BehindLiveWindowException;-><init>()V

    throw v1
.end method

.method public final b(J)J
    .locals 3

    iget-object v0, p0, Le9/j;->d:Le9/i;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v1, p0, Le9/j;->e:J

    invoke-interface {v0, v1, v2, p1, p2}, Le9/i;->r(JJ)J

    move-result-wide p1

    iget-wide v0, p0, Le9/j;->f:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final c(J)J
    .locals 5

    invoke-virtual {p0, p1, p2}, Le9/j;->b(J)J

    move-result-wide v0

    iget-object v2, p0, Le9/j;->d:Le9/i;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v3, p0, Le9/j;->e:J

    invoke-interface {v2, v3, v4, p1, p2}, Le9/i;->D(JJ)J

    move-result-wide p1

    add-long/2addr p1, v0

    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final d()J
    .locals 3

    iget-object v0, p0, Le9/j;->d:Le9/i;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v1, p0, Le9/j;->e:J

    invoke-interface {v0, v1, v2}, Le9/i;->w(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 5

    invoke-virtual {p0, p1, p2}, Le9/j;->f(J)J

    move-result-wide v0

    iget-object v2, p0, Le9/j;->d:Le9/i;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v3, p0, Le9/j;->f:J

    sub-long/2addr p1, v3

    iget-wide v3, p0, Le9/j;->e:J

    invoke-interface {v2, p1, p2, v3, v4}, Le9/i;->q(JJ)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final f(J)J
    .locals 3

    iget-object v0, p0, Le9/j;->d:Le9/i;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v1, p0, Le9/j;->f:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Le9/i;->a(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final g(JJ)Z
    .locals 2

    iget-object v0, p0, Le9/j;->d:Le9/i;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v0}, Le9/i;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2}, Le9/j;->e(J)J

    move-result-wide p1

    cmp-long p1, p1, p3

    if-gtz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
