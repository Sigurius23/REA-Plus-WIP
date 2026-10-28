.class public final Llb/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final w:Ltb/c;

.field public final x:J

.field public final synthetic y:Llb/a0;


# direct methods
.method public constructor <init>(Llb/a0;Ltb/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llb/t;->y:Llb/a0;

    iput-object p2, p0, Llb/t;->w:Ltb/c;

    invoke-static {}, Lvd/e;->m()J

    move-result-wide p1

    iput-wide p1, p0, Llb/t;->x:J

    return-void
.end method


# virtual methods
.method public final J0(I)Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final L(ILjava/lang/String;)V
    .locals 7

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final close()V
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final e1()Z
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->e1()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final getBlob(I)[B
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getBlob(I)[B

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final getColumnCount()I
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->getColumnCount()I

    move-result v0

    return v0

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getColumnName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final getDouble(I)D
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getDouble(I)D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final getLong(I)J
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->getLong(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final isNull(I)Z
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->isNull(I)Z

    move-result p1

    return p1

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final p(IJ)V
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->p(IJ)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final q(I[B)V
    .locals 7

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1, p2}, Ltb/c;->q(I[B)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final reset()V
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->reset()V

    return-void

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final t(DI)V
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1, p2, p3}, Ltb/c;->t(DI)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final u(I)V
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0, p1}, Ltb/c;->u(I)V

    return-void

    :cond_0
    const-string p1, "Attempted to use statement on a different thread"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "Statement is recycled"

    invoke-static {v2, p1}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method

.method public final w()V
    .locals 7

    iget-object v0, p0, Llb/t;->y:Llb/a0;

    iget-boolean v0, v0, Llb/a0;->e:Z

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-nez v0, :cond_1

    iget-wide v3, p0, Llb/t;->x:J

    invoke-static {}, Lvd/e;->m()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    iget-object v0, p0, Llb/t;->w:Ltb/c;

    invoke-interface {v0}, Ltb/c;->w()V

    return-void

    :cond_0
    const-string v0, "Attempted to use statement on a different thread"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Statement is recycled"

    invoke-static {v2, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v1
.end method
