.class public final Lz1/c;
.super Lz1/b;
.source "SourceFile"


# instance fields
.field public final o:Lz1/b;

.field public p:Z


# direct methods
.method public constructor <init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lz1/b;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz1/b;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    move-object p1, p0

    iput-object p6, p1, Lz1/c;->o:Lz1/b;

    invoke-virtual {p6}, Lz1/b;->k()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lz1/f;->c:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lz1/b;->c()V

    iget-boolean v0, p0, Lz1/c;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz1/c;->p:Z

    iget-object v0, p0, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/b;->l()V

    :cond_0
    return-void
.end method

.method public final w()Lz1/q;
    .locals 11

    iget-object v0, p0, Lz1/c;->o:Lz1/b;

    iget-boolean v1, v0, Lz1/b;->m:Z

    if-nez v1, :cond_0

    iget-boolean v1, v0, Lz1/f;->c:Z

    if-eqz v1, :cond_1

    :cond_0
    move-object v2, p0

    goto/16 :goto_7

    :cond_1
    iget-object v5, p0, Lz1/b;->h:La0/w0;

    iget-wide v8, p0, Lz1/f;->b:J

    const/4 v1, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v2

    iget-object v0, p0, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/f;->d()Lz1/j;

    move-result-object v0

    invoke-static {v2, v3, p0, v0}, Lz1/l;->c(JLz1/b;Lz1/j;)Ljava/util/HashMap;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_2
    move-object v6, v1

    :goto_0
    sget-object v10, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v10

    :try_start_0
    invoke-static {p0}, Lz1/l;->d(Lz1/f;)V

    if-eqz v5, :cond_3

    iget v0, v5, La0/w0;->d:I

    if-nez v0, :cond_4

    :cond_3
    move-object v2, p0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v3

    iget-object v0, p0, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/f;->d()Lz1/j;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v2, p0

    :try_start_1
    invoke-virtual/range {v2 .. v7}, Lz1/b;->z(JLa0/w0;Ljava/util/HashMap;Lz1/j;)Lz1/q;

    move-result-object v0

    sget-object v3, Lz1/h;->b:Lz1/h;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_5

    monitor-exit v10

    return-object v0

    :cond_5
    :try_start_2
    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/b;->x()La0/w0;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0, v5}, La0/w0;->j(La0/w0;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_6
    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0, v5}, Lz1/b;->B(La0/w0;)V

    iput-object v1, v2, Lz1/b;->h:La0/w0;

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, p0

    goto/16 :goto_6

    :goto_1
    invoke-virtual {p0}, Lz1/f;->a()V

    :goto_2
    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v0

    invoke-static {v0, v1, v8, v9}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v0

    if-gez v0, :cond_7

    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/b;->v()V

    :cond_7
    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/f;->d()Lz1/j;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Lz1/j;->c(J)Lz1/j;

    move-result-object v1

    iget-object v3, v2, Lz1/b;->j:Lz1/j;

    invoke-virtual {v1, v3}, Lz1/j;->a(Lz1/j;)Lz1/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz1/f;->r(Lz1/j;)V

    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0, v8, v9}, Lz1/b;->A(J)V

    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    iget v1, v2, Lz1/f;->d:I

    const/4 v3, -0x1

    iput v3, v2, Lz1/f;->d:I

    if-ltz v1, :cond_8

    iget-object v3, v0, Lz1/b;->k:[I

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v3

    add-int/lit8 v5, v4, 0x1

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    aput v1, v3, v4

    iput-object v3, v0, Lz1/b;->k:[I

    goto :goto_3

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    iget-object v1, v2, Lz1/b;->j:Lz1/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v3, v0, Lz1/b;->j:Lz1/j;

    invoke-virtual {v3, v1}, Lz1/j;->e(Lz1/j;)Lz1/j;

    move-result-object v1

    iput-object v1, v0, Lz1/b;->j:Lz1/j;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    monitor-exit v10

    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    iget-object v1, v2, Lz1/b;->k:[I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v3, v1

    if-nez v3, :cond_9

    goto :goto_5

    :cond_9
    iget-object v3, v0, Lz1/b;->k:[I

    array-length v4, v3

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {v3, v1}, Lm83/n;->G0([I[I)[I

    move-result-object v1

    :goto_4
    iput-object v1, v0, Lz1/b;->k:[I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_5
    monitor-exit v10

    const/4 v0, 0x1

    iput-boolean v0, v2, Lz1/b;->m:Z

    iget-boolean v1, v2, Lz1/c;->p:Z

    if-nez v1, :cond_b

    iput-boolean v0, v2, Lz1/c;->p:Z

    iget-object v0, v2, Lz1/c;->o:Lz1/b;

    invoke-virtual {v0}, Lz1/b;->l()V

    :cond_b
    sget-object v0, Lz1/h;->b:Lz1/h;

    return-object v0

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v10

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_6
    monitor-exit v10

    throw v0

    :goto_7
    new-instance v0, Lz1/g;

    invoke-direct {v0, p0}, Lz1/g;-><init>(Lz1/b;)V

    return-object v0
.end method
