.class public abstract Lic/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/util/UUID;

.field public c:Lqc/q;

.field public final d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 38

    move-object/from16 v0, p0

    const-string v1, "workerClass"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    const-string v3, "randomUUID(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lic/q0;->b:Ljava/util/UUID;

    new-instance v4, Lqc/q;

    iget-object v1, v0, Lic/q0;->b:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v1, "toString(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    const/16 v36, 0x0

    const v37, 0x1fffffa

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v4 .. v37}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IJIILjava/lang/String;Ljava/lang/Boolean;I)V

    iput-object v4, v0, Lic/q0;->c:Lqc/q;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldt/b;->A([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lic/q0;->d:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lic/q0;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lic/q0;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lic/q0;->d()Lic/q0;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lic/r0;
    .locals 43

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lic/q0;->c()Lic/r0;

    move-result-object v1

    iget-object v2, v0, Lic/q0;->c:Lqc/q;

    iget-object v2, v2, Lqc/q;->j:Lic/e;

    invoke-virtual {v2}, Lic/e;->b()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    iget-boolean v3, v2, Lic/e;->e:Z

    if-nez v3, :cond_1

    iget-boolean v3, v2, Lic/e;->c:Z

    if-nez v3, :cond_1

    iget-boolean v2, v2, Lic/e;->d:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    iget-object v3, v0, Lic/q0;->c:Lqc/q;

    iget-boolean v6, v3, Lqc/q;->q:Z

    if-eqz v6, :cond_4

    if-nez v2, :cond_3

    iget-wide v6, v3, Lqc/q;->g:J

    const-wide/16 v8, 0x0

    cmp-long v2, v6, v8

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expedited jobs cannot be delayed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expedited jobs only support network and storage constraints"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_2
    iget-object v2, v3, Lqc/q;->x:Ljava/lang/String;

    const/16 v6, 0x7f

    if-nez v2, :cond_7

    iget-object v2, v3, Lqc/q;->c:Ljava/lang/String;

    const-string v7, "."

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v2, v7, v8}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    if-ne v7, v4, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    :cond_5
    invoke-static {v2}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v6, v2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_4
    iput-object v2, v3, Lqc/q;->x:Ljava/lang/String;

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v6, :cond_8

    iget-object v3, v0, Lic/q0;->c:Lqc/q;

    invoke-static {v6, v2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lqc/q;->x:Ljava/lang/String;

    :cond_8
    :goto_5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v3, "randomUUID(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lic/q0;->b:Ljava/util/UUID;

    new-instance v4, Lqc/q;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v2, "toString(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lic/q0;->c:Lqc/q;

    const-string v3, "other"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v2, Lqc/q;->c:Ljava/lang/String;

    iget-object v6, v2, Lqc/q;->b:Lic/m0;

    iget-object v8, v2, Lqc/q;->d:Ljava/lang/String;

    new-instance v9, Lic/g;

    iget-object v3, v2, Lqc/q;->e:Lic/g;

    invoke-direct {v9, v3}, Lic/g;-><init>(Lic/g;)V

    new-instance v10, Lic/g;

    iget-object v3, v2, Lqc/q;->f:Lic/g;

    invoke-direct {v10, v3}, Lic/g;-><init>(Lic/g;)V

    iget-wide v11, v2, Lqc/q;->g:J

    iget-wide v13, v2, Lqc/q;->h:J

    move-object v15, v4

    iget-wide v3, v2, Lqc/q;->i:J

    move-object/from16 v38, v1

    new-instance v1, Lic/e;

    move-wide/from16 v16, v3

    iget-object v3, v2, Lqc/q;->j:Lic/e;

    invoke-direct {v1, v3}, Lic/e;-><init>(Lic/e;)V

    iget v3, v2, Lqc/q;->k:I

    iget-object v4, v2, Lqc/q;->l:Lic/a;

    move/from16 v18, v3

    move-object/from16 v19, v4

    iget-wide v3, v2, Lqc/q;->m:J

    move-wide/from16 v20, v3

    iget-wide v3, v2, Lqc/q;->n:J

    move-wide/from16 v22, v3

    iget-wide v3, v2, Lqc/q;->o:J

    move-wide/from16 v24, v3

    iget-wide v3, v2, Lqc/q;->p:J

    move-object/from16 v26, v1

    iget-boolean v1, v2, Lqc/q;->q:Z

    move/from16 v28, v1

    iget-object v1, v2, Lqc/q;->r:Lic/i0;

    move-object/from16 v29, v1

    iget v1, v2, Lqc/q;->s:I

    move-wide/from16 v30, v3

    iget-wide v3, v2, Lqc/q;->u:J

    move/from16 v27, v1

    iget v1, v2, Lqc/q;->v:I

    move/from16 v33, v1

    iget v1, v2, Lqc/q;->w:I

    move/from16 v34, v1

    iget-object v1, v2, Lqc/q;->x:Ljava/lang/String;

    iget-object v2, v2, Lqc/q;->y:Ljava/lang/Boolean;

    const/high16 v37, 0x80000

    move-object/from16 v35, v1

    move-object/from16 v36, v2

    move-wide/from16 v39, v3

    move-object v4, v15

    move-wide/from16 v15, v16

    move-object/from16 v17, v26

    move-wide/from16 v41, v30

    move/from16 v30, v27

    move-wide/from16 v31, v39

    move-wide/from16 v26, v41

    invoke-direct/range {v4 .. v37}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IJIILjava/lang/String;Ljava/lang/Boolean;I)V

    move-object v15, v4

    iput-object v15, v0, Lic/q0;->c:Lqc/q;

    return-object v38
.end method

.method public abstract c()Lic/r0;
.end method

.method public abstract d()Lic/q0;
.end method

.method public final e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;
    .locals 1

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lic/q0;->a:Z

    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    iput-object p1, v0, Lqc/q;->l:Lic/a;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lqc/q;->d(J)V

    invoke-virtual {p0}, Lic/q0;->d()Lic/q0;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lic/e;)Lic/q0;
    .locals 1

    const-string v0, "constraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    iput-object p1, v0, Lqc/q;->j:Lic/e;

    invoke-virtual {p0}, Lic/q0;->d()Lic/q0;

    move-result-object p1

    return-object p1
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lic/q0;
    .locals 2

    const-string v0, "timeUnit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, v0, Lqc/q;->g:J

    const-wide p1, 0x7fffffffffffffffL

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr p1, v0

    iget-object p3, p0, Lic/q0;->c:Lqc/q;

    iget-wide v0, p3, Lqc/q;->g:J

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lic/q0;->d()Lic/q0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The given initial delay is too large and will cause an overflow!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lic/g;)Lic/q0;
    .locals 1

    const-string v0, "inputData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    iput-object p1, v0, Lqc/q;->e:Lic/g;

    invoke-virtual {p0}, Lic/q0;->d()Lic/q0;

    move-result-object p1

    return-object p1
.end method
