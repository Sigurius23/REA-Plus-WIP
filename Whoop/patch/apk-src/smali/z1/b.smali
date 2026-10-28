.class public Lz1/b;
.super Lz1/f;
.source "SourceFile"


# static fields
.field public static final n:[I


# instance fields
.field public final e:Lkotlin/jvm/functions/Function1;

.field public final f:Lkotlin/jvm/functions/Function1;

.field public g:I

.field public h:La0/w0;

.field public i:Ljava/util/ArrayList;

.field public j:Lz1/j;

.field public k:[I

.field public l:I

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lz1/b;->n:[I

    return-void
.end method

.method public constructor <init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz1/f;-><init>(JLz1/j;)V

    iput-object p4, p0, Lz1/b;->e:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lz1/b;->f:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lz1/j;->E:Lz1/j;

    iput-object p1, p0, Lz1/b;->j:Lz1/j;

    sget-object p1, Lz1/b;->n:[I

    iput-object p1, p0, Lz1/b;->k:[I

    const/4 p1, 0x1

    iput p1, p0, Lz1/b;->l:I

    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 2

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/b;->j:Lz1/j;

    invoke-virtual {v1, p1, p2}, Lz1/j;->g(J)Lz1/j;

    move-result-object p1

    iput-object p1, p0, Lz1/b;->j:Lz1/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public B(La0/w0;)V
    .locals 0

    iput-object p1, p0, Lz1/b;->h:La0/w0;

    return-void
.end method

.method public C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;
    .locals 11

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "Cannot use a disposed snapshot"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lz1/b;->m:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lz1/f;->d:I

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    invoke-static {v0}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lz1/b;->A(J)V

    sget-object v1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-wide v3, Lz1/l;->e:J

    const/4 v0, 0x1

    int-to-long v9, v0

    add-long v5, v3, v9

    sput-wide v5, Lz1/l;->e:J

    sget-object v2, Lz1/l;->d:Lz1/j;

    invoke-virtual {v2, v3, v4}, Lz1/j;->g(J)Lz1/j;

    move-result-object v2

    sput-object v2, Lz1/l;->d:Lz1/j;

    invoke-virtual {p0}, Lz1/f;->d()Lz1/j;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Lz1/j;->g(J)Lz1/j;

    move-result-object v5

    invoke-virtual {p0, v5}, Lz1/f;->r(Lz1/j;)V

    move-object v5, v2

    new-instance v2, Lz1/c;

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v6

    add-long/2addr v6, v9

    invoke-static {v5, v6, v7, v3, v4}, Lz1/l;->e(Lz1/j;JJ)Lz1/j;

    move-result-object v5

    invoke-virtual {p0}, Lz1/b;->y()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    invoke-static {p1, v6, v0}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    invoke-virtual {p0}, Lz1/b;->i()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-static {p2, p1}, Lz1/l;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v8, p0

    :try_start_1
    invoke-direct/range {v2 .. v8}, Lz1/c;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lz1/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    iget-boolean p1, v8, Lz1/b;->m:Z

    if-nez p1, :cond_3

    iget-boolean p1, v8, Lz1/f;->c:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide p1

    monitor-enter v1

    :try_start_2
    sget-wide v3, Lz1/l;->e:J

    add-long v5, v3, v9

    sput-wide v5, Lz1/l;->e:J

    invoke-virtual {p0, v3, v4}, Lz1/f;->s(J)V

    sget-object v0, Lz1/l;->d:Lz1/j;

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lz1/j;->g(J)Lz1/j;

    move-result-object v0

    sput-object v0, Lz1/l;->d:Lz1/j;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    invoke-virtual {p0}, Lz1/f;->d()Lz1/j;

    move-result-object v0

    add-long/2addr p1, v9

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v3

    invoke-static {v0, p1, p2, v3, v4}, Lz1/l;->e(Lz1/j;JJ)Lz1/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz1/f;->r(Lz1/j;)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v1

    throw p1

    :cond_3
    return-object v2

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v8, p0

    goto :goto_1

    :goto_2
    monitor-exit v1

    throw p1
.end method

.method public final b()V
    .locals 3

    sget-object v0, Lz1/l;->d:Lz1/j;

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lz1/j;->c(J)Lz1/j;

    move-result-object v0

    iget-object v1, p0, Lz1/b;->j:Lz1/j;

    invoke-virtual {v0, v1}, Lz1/j;->a(Lz1/j;)Lz1/j;

    move-result-object v0

    sput-object v0, Lz1/l;->d:Lz1/j;

    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz1/f;->c:Z

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lz1/f;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p0}, Lz1/b;->l()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_0
    return-void
.end method

.method public bridge synthetic e()Lkotlin/jvm/functions/Function1;
    .locals 1

    invoke-virtual {p0}, Lz1/b;->y()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lz1/b;->g:I

    return v0
.end method

.method public i()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/b;->f:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public k()V
    .locals 1

    iget v0, p0, Lz1/b;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lz1/b;->l:I

    return-void
.end method

.method public l()V
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lz1/b;->l:I

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "no pending nested snapshots"

    invoke-static {v1}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_0
    iget v1, v0, Lz1/b;->l:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lz1/b;->l:I

    if-nez v1, :cond_8

    iget-boolean v1, v0, Lz1/b;->m:Z

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lz1/b;->x()La0/w0;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-boolean v2, v0, Lz1/b;->m:Z

    if-eqz v2, :cond_1

    const-string v2, "Unsupported operation on a snapshot that has been applied"

    invoke-static {v2}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lz1/b;->B(La0/w0;)V

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v2

    iget-object v4, v1, La0/w0;->b:[Ljava/lang/Object;

    iget-object v1, v1, La0/w0;->a:[J

    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_7

    const/4 v7, 0x0

    :goto_1
    aget-wide v8, v1, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_6

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v10, :cond_5

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_4

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v4, v13

    check-cast v13, Lz1/z;

    invoke-interface {v13}, Lz1/z;->N()Lz1/b0;

    move-result-object v13

    :goto_3
    if-eqz v13, :cond_4

    iget-wide v14, v13, Lz1/b0;->a:J

    cmp-long v16, v14, v2

    if-eqz v16, :cond_2

    iget-object v6, v0, Lz1/b;->j:Lz1/j;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-static {v6, v14}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_2
    sget-object v6, Lz1/l;->a:Lz1/k;

    const-wide/16 v14, 0x0

    iput-wide v14, v13, Lz1/b0;->a:J

    :cond_3
    iget-object v13, v13, Lz1/b0;->b:Lz1/b0;

    goto :goto_3

    :cond_4
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_5
    if-ne v10, v11, :cond_7

    :cond_6
    if-eq v7, v5, :cond_7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Lz1/f;->a()V

    :cond_8
    return-void
.end method

.method public m()V
    .locals 1

    iget-boolean v0, p0, Lz1/b;->m:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lz1/b;->v()V

    :cond_1
    :goto_0
    return-void
.end method

.method public n(Lz1/z;)V
    .locals 1

    invoke-virtual {p0}, Lz1/b;->x()La0/w0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, La0/e1;->a:La0/w0;

    new-instance v0, La0/w0;

    invoke-direct {v0}, La0/w0;-><init>()V

    invoke-virtual {p0, v0}, Lz1/b;->B(La0/w0;)V

    :cond_0
    invoke-virtual {v0, p1}, La0/w0;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lz1/b;->k:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lz1/b;->k:[I

    aget v2, v2, v1

    invoke-static {v2}, Lz1/l;->u(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lz1/f;->o()V

    return-void
.end method

.method public t(I)V
    .locals 0

    iput p1, p0, Lz1/b;->g:I

    return-void
.end method

.method public u(Lkotlin/jvm/functions/Function1;)Lz1/f;
    .locals 11

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "Cannot use a disposed snapshot"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lz1/b;->m:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lz1/f;->d:I

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    invoke-static {v0}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v0

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lz1/b;->A(J)V

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-wide v4, Lz1/l;->e:J

    const/4 v3, 0x1

    int-to-long v9, v3

    add-long v6, v4, v9

    sput-wide v6, Lz1/l;->e:J

    sget-object v6, Lz1/l;->d:Lz1/j;

    invoke-virtual {v6, v4, v5}, Lz1/j;->g(J)Lz1/j;

    move-result-object v6

    sput-object v6, Lz1/l;->d:Lz1/j;

    move v6, v3

    new-instance v3, Lz1/d;

    invoke-virtual {p0}, Lz1/f;->d()Lz1/j;

    move-result-object v7

    add-long/2addr v0, v9

    invoke-static {v7, v0, v1, v4, v5}, Lz1/l;->e(Lz1/j;JJ)Lz1/j;

    move-result-object v0

    invoke-virtual {p0}, Lz1/b;->y()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {p1, v1, v6}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v8, p0

    move-object v6, v0

    :try_start_1
    invoke-direct/range {v3 .. v8}, Lz1/d;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lz1/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    iget-boolean p1, v8, Lz1/b;->m:Z

    if-nez p1, :cond_3

    iget-boolean p1, v8, Lz1/f;->c:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v0

    monitor-enter v2

    :try_start_2
    sget-wide v4, Lz1/l;->e:J

    add-long v6, v4, v9

    sput-wide v6, Lz1/l;->e:J

    invoke-virtual {p0, v4, v5}, Lz1/f;->s(J)V

    sget-object p1, Lz1/l;->d:Lz1/j;

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lz1/j;->g(J)Lz1/j;

    move-result-object p1

    sput-object p1, Lz1/l;->d:Lz1/j;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    invoke-virtual {p0}, Lz1/f;->d()Lz1/j;

    move-result-object p1

    add-long/2addr v0, v9

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v4

    invoke-static {p1, v0, v1, v4, v5}, Lz1/l;->e(Lz1/j;JJ)Lz1/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz1/f;->r(Lz1/j;)V

    return-object v3

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v2

    throw p1

    :cond_3
    return-object v3

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v8, p0

    goto :goto_1

    :goto_2
    monitor-exit v2

    throw p1
.end method

.method public final v()V
    .locals 9

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lz1/b;->A(J)V

    iget-boolean v0, p0, Lz1/b;->m:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v0

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-wide v3, Lz1/l;->e:J

    const/4 v5, 0x1

    int-to-long v5, v5

    add-long v7, v3, v5

    sput-wide v7, Lz1/l;->e:J

    invoke-virtual {p0, v3, v4}, Lz1/f;->s(J)V

    sget-object v3, Lz1/l;->d:Lz1/j;

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lz1/j;->g(J)Lz1/j;

    move-result-object v3

    sput-object v3, Lz1/l;->d:Lz1/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-virtual {p0}, Lz1/f;->d()Lz1/j;

    move-result-object v2

    add-long/2addr v0, v5

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v3

    invoke-static {v2, v0, v1, v3, v4}, Lz1/l;->e(Lz1/j;JJ)Lz1/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz1/f;->r(Lz1/j;)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    return-void
.end method

.method public w()Lz1/q;
    .locals 22

    move-object/from16 v1, p0

    invoke-virtual {v1}, Lz1/b;->x()La0/w0;

    move-result-object v4

    const/4 v0, 0x0

    if-eqz v4, :cond_0

    sget-object v2, Lz1/l;->j:Lz1/a;

    iget-wide v2, v2, Lz1/f;->b:J

    sget-object v5, Lz1/l;->d:Lz1/j;

    invoke-virtual {v5, v2, v3}, Lz1/j;->c(J)Lz1/j;

    move-result-object v5

    invoke-static {v2, v3, v1, v5}, Lz1/l;->c(JLz1/b;Lz1/j;)Ljava/util/HashMap;

    move-result-object v2

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    sget-object v2, Lm83/y;->w:Lm83/y;

    sget-object v7, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    invoke-static {v1}, Lz1/l;->d(Lz1/f;)V

    if-eqz v4, :cond_3

    iget v3, v4, La0/w0;->d:I

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    sget-object v8, Lz1/l;->j:Lz1/a;

    sget-wide v2, Lz1/l;->e:J

    sget-object v6, Lz1/l;->d:Lz1/j;

    iget-wide v9, v8, Lz1/f;->b:J

    invoke-virtual {v6, v9, v10}, Lz1/j;->c(J)Lz1/j;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lz1/b;->z(JLa0/w0;Ljava/util/HashMap;Lz1/j;)Lz1/q;

    move-result-object v2

    sget-object v3, Lz1/h;->b:Lz1/h;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_2

    monitor-exit v7

    return-object v2

    :cond_2
    :try_start_1
    invoke-virtual {v1}, Lz1/b;->b()V

    iget-object v2, v8, Lz1/b;->h:La0/w0;

    sget-object v3, Lz1/l;->a:Lz1/k;

    invoke-static {v8, v3}, Lz1/l;->v(Lz1/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lz1/b;->B(La0/w0;)V

    iput-object v0, v8, Lz1/b;->h:La0/w0;

    sget-object v3, Lz1/l;->h:Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_3
    :goto_1
    invoke-virtual {v1}, Lz1/b;->b()V

    sget-object v3, Lz1/l;->j:Lz1/a;

    iget-object v5, v3, Lz1/b;->h:La0/w0;

    sget-object v6, Lz1/l;->a:Lz1/k;

    invoke-static {v3, v6}, Lz1/l;->v(Lz1/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, La0/w0;->h()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v2, Lz1/l;->h:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v3, v2

    move-object v2, v5

    goto :goto_2

    :cond_4
    move-object v3, v2

    move-object v2, v0

    :goto_2
    monitor-exit v7

    const/4 v5, 0x1

    iput-boolean v5, v1, Lz1/b;->m:Z

    if-eqz v2, :cond_5

    new-instance v6, Lr1/e;

    invoke-direct {v6, v2}, Lr1/e;-><init>(La0/w0;)V

    invoke-virtual {v2}, La0/w0;->g()Z

    move-result v7

    if-nez v7, :cond_5

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_5

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc93/m;

    invoke-interface {v9, v6, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v4}, La0/w0;->h()Z

    move-result v6

    if-eqz v6, :cond_6

    new-instance v6, Lr1/e;

    invoke-direct {v6, v4}, Lr1/e;-><init>(La0/w0;)V

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v7, :cond_6

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc93/m;

    invoke-interface {v9, v6, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_6
    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2
    invoke-virtual {v1}, Lz1/b;->p()V

    invoke-static {}, Lz1/l;->g()V

    const/4 v10, 0x7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v13, 0x8

    if-eqz v2, :cond_a

    iget-object v14, v2, La0/w0;->b:[Ljava/lang/Object;

    iget-object v2, v2, La0/w0;->a:[J

    array-length v15, v2

    add-int/lit8 v15, v15, -0x2

    if-ltz v15, :cond_a

    const/4 v5, 0x0

    const-wide/16 v16, 0x80

    :goto_5
    aget-wide v6, v2, v5

    const-wide/16 v18, 0xff

    not-long v8, v6

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    and-long/2addr v8, v11

    cmp-long v8, v8, v11

    if-eqz v8, :cond_9

    sub-int v8, v5, v15

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    rsub-int/lit8 v8, v8, 0x8

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v8, :cond_8

    and-long v20, v6, v18

    cmp-long v20, v20, v16

    if-gez v20, :cond_7

    shl-int/lit8 v20, v5, 0x3

    add-int v20, v20, v9

    aget-object v20, v14, v20

    check-cast v20, Lz1/z;

    invoke-static/range {v20 .. v20}, Lz1/l;->q(Lz1/z;)V

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_b

    :cond_7
    :goto_7
    shr-long/2addr v6, v13

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_8
    if-ne v8, v13, :cond_b

    :cond_9
    if-eq v5, v15, :cond_b

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_a
    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    :cond_b
    if-eqz v4, :cond_f

    iget-object v2, v4, La0/w0;->b:[Ljava/lang/Object;

    iget-object v4, v4, La0/w0;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_f

    const/4 v6, 0x0

    :goto_8
    aget-wide v7, v4, v6

    not-long v14, v7

    shl-long/2addr v14, v10

    and-long/2addr v14, v7

    and-long/2addr v14, v11

    cmp-long v9, v14, v11

    if-eqz v9, :cond_e

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    rsub-int/lit8 v9, v9, 0x8

    const/4 v14, 0x0

    :goto_9
    if-ge v14, v9, :cond_d

    and-long v20, v7, v18

    cmp-long v15, v20, v16

    if-gez v15, :cond_c

    shl-int/lit8 v15, v6, 0x3

    add-int/2addr v15, v14

    aget-object v15, v2, v15

    check-cast v15, Lz1/z;

    invoke-static {v15}, Lz1/l;->q(Lz1/z;)V

    :cond_c
    shr-long/2addr v7, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    :cond_d
    if-ne v9, v13, :cond_f

    :cond_e
    if-eq v6, v5, :cond_f

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_f
    iget-object v2, v1, Lz1/b;->i:Ljava/util/ArrayList;

    if-eqz v2, :cond_10

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v4, :cond_10

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz1/z;

    invoke-static {v6}, Lz1/l;->q(Lz1/z;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_10
    iput-object v0, v1, Lz1/b;->i:Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    sget-object v0, Lz1/h;->b:Lz1/h;

    return-object v0

    :goto_b
    monitor-exit v3

    throw v0

    :goto_c
    monitor-exit v7

    throw v0
.end method

.method public x()La0/w0;
    .locals 1

    iget-object v0, p0, Lz1/b;->h:La0/w0;

    return-object v0
.end method

.method public y()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/b;->e:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final z(JLa0/w0;Ljava/util/HashMap;Lz1/j;)Lz1/q;
    .locals 28

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v0, p3

    move-object/from16 v4, p4

    invoke-virtual {v1}, Lz1/f;->d()Lz1/j;

    move-result-object v5

    invoke-virtual {v1}, Lz1/f;->g()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lz1/j;->g(J)Lz1/j;

    move-result-object v5

    iget-object v6, v1, Lz1/b;->j:Lz1/j;

    invoke-virtual {v5, v6}, Lz1/j;->e(Lz1/j;)Lz1/j;

    move-result-object v5

    iget-object v6, v0, La0/w0;->b:[Ljava/lang/Object;

    iget-object v7, v0, La0/w0;->a:[J

    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    aget-wide v14, v7, v11

    const/16 v16, 0x0

    not-long v9, v14

    const/16 v17, 0x7

    shl-long v9, v9, v17

    and-long/2addr v9, v14

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v9, v17

    cmp-long v9, v9, v17

    if-eqz v9, :cond_f

    sub-int v9, v11, v8

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move/from16 v17, v10

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_e

    const-wide/16 v18, 0xff

    and-long v18, v14, v18

    const-wide/16 v20, 0x80

    cmp-long v18, v18, v20

    if-gez v18, :cond_d

    shl-int/lit8 v18, v11, 0x3

    add-int v18, v18, v10

    aget-object v18, v6, v18

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    check-cast v6, Lz1/z;

    move-object/from16 v18, v7

    invoke-interface {v6}, Lz1/z;->N()Lz1/b0;

    move-result-object v7

    move/from16 v20, v10

    move-object/from16 v21, v12

    move-object/from16 v10, p5

    invoke-static {v7, v2, v3, v10}, Lz1/l;->s(Lz1/b0;JLz1/j;)Lz1/b0;

    move-result-object v12

    if-nez v12, :cond_0

    move-object/from16 v25, v5

    move-object/from16 v22, v13

    move-wide/from16 v23, v14

    goto :goto_2

    :cond_0
    move-object/from16 v22, v13

    move-wide/from16 v23, v14

    invoke-virtual {v1}, Lz1/f;->g()J

    move-result-wide v13

    invoke-static {v7, v13, v14, v5}, Lz1/l;->s(Lz1/b0;JLz1/j;)Lz1/b0;

    move-result-object v13

    if-nez v13, :cond_1

    move-object/from16 v25, v5

    goto :goto_2

    :cond_1
    iget-wide v14, v13, Lz1/b0;->a:J

    move-object/from16 v25, v5

    const/4 v5, 0x1

    move-wide/from16 v26, v14

    int-to-long v14, v5

    cmp-long v5, v26, v14

    if-nez v5, :cond_2

    :goto_2
    goto/16 :goto_8

    :cond_2
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v1}, Lz1/f;->g()J

    move-result-wide v14

    invoke-virtual {v1}, Lz1/f;->d()Lz1/j;

    move-result-object v5

    invoke-static {v7, v14, v15, v5}, Lz1/l;->s(Lz1/b0;JLz1/j;)Lz1/b0;

    move-result-object v5

    if-eqz v5, :cond_b

    if-eqz v4, :cond_3

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz1/b0;

    if-nez v7, :cond_4

    :cond_3
    invoke-interface {v6, v13, v12, v5}, Lz1/z;->S(Lz1/b0;Lz1/b0;Lz1/b0;)Lz1/b0;

    move-result-object v7

    :cond_4
    if-nez v7, :cond_5

    new-instance v0, Lz1/g;

    invoke-direct {v0, v1}, Lz1/g;-><init>(Lz1/b;)V

    return-object v0

    :cond_5
    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    if-nez v21, :cond_6

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    goto :goto_3

    :cond_6
    move-object/from16 v5, v21

    :goto_3
    invoke-virtual {v1}, Lz1/f;->g()J

    move-result-wide v13

    invoke-virtual {v12, v13, v14}, Lz1/b0;->b(J)Lz1/b0;

    move-result-object v7

    new-instance v12, Ll83/k;

    invoke-direct {v12, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v22, :cond_7

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    goto :goto_4

    :cond_7
    move-object/from16 v13, v22

    :goto_4
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v12, v5

    goto :goto_9

    :cond_8
    if-nez v21, :cond_9

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    goto :goto_5

    :cond_9
    move-object/from16 v12, v21

    :goto_5
    invoke-virtual {v7, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    new-instance v5, Ll83/k;

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Lz1/f;->g()J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Lz1/b0;->b(J)Lz1/b0;

    move-result-object v5

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v7

    :goto_6
    invoke-interface {v12, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    move-object/from16 v13, v22

    goto :goto_9

    :cond_b
    invoke-static {}, Lz1/l;->r()V

    throw v16

    :cond_c
    :goto_8
    move-object/from16 v12, v21

    goto :goto_7

    :cond_d
    move-object/from16 v25, v5

    move-object/from16 v19, v6

    move-object/from16 v18, v7

    move/from16 v20, v10

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    move-wide/from16 v23, v14

    move-object/from16 v10, p5

    :goto_9
    shr-long v14, v23, v17

    add-int/lit8 v5, v20, 0x1

    move v10, v5

    move-object/from16 v7, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v25

    goto/16 :goto_1

    :cond_e
    move-object/from16 v10, p5

    move-object/from16 v25, v5

    move-object/from16 v19, v6

    move-object/from16 v18, v7

    move-object/from16 v21, v12

    move-object/from16 v22, v13

    move/from16 v5, v17

    if-ne v9, v5, :cond_12

    goto :goto_a

    :cond_f
    move-object/from16 v10, p5

    move-object/from16 v25, v5

    move-object/from16 v19, v6

    move-object/from16 v18, v7

    :goto_a
    if-eq v11, v8, :cond_10

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v7, v18

    move-object/from16 v6, v19

    move-object/from16 v5, v25

    goto/16 :goto_0

    :cond_10
    move-object v9, v12

    goto :goto_b

    :cond_11
    const/16 v16, 0x0

    move-object/from16 v9, v16

    move-object v13, v9

    :goto_b
    move-object v12, v9

    :cond_12
    if-eqz v12, :cond_13

    invoke-virtual {v1}, Lz1/b;->v()V

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_c
    if-ge v5, v4, :cond_13

    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Lz1/z;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Lz1/b0;

    iput-wide v2, v6, Lz1/b0;->a:J

    sget-object v8, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v8

    :try_start_0
    invoke-interface {v7}, Lz1/z;->N()Lz1/b0;

    move-result-object v9

    iput-object v9, v6, Lz1/b0;->b:Lz1/b0;

    invoke-interface {v7, v6}, Lz1/z;->m0(Lz1/b0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :catchall_0
    move-exception v0

    monitor-exit v8

    throw v0

    :cond_13
    if-eqz v13, :cond_16

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v10, 0x0

    :goto_d
    if-ge v10, v2, :cond_14

    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz1/z;

    invoke-virtual {v0, v3}, La0/w0;->l(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    :cond_14
    iget-object v0, v1, Lz1/b;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-static {v0, v13}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v13

    :goto_e
    iput-object v13, v1, Lz1/b;->i:Ljava/util/ArrayList;

    :cond_16
    sget-object v0, Lz1/h;->b:Lz1/h;

    return-object v0
.end method
