.class public abstract Lv63/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public E:I

.field public F:J

.field public G:Z

.field public final w:Lx63/f;

.field public x:Lw63/a;

.field public y:Ljava/nio/ByteBuffer;

.field public z:I


# direct methods
.method public constructor <init>(Lw63/a;JLx63/f;)V
    .locals 2

    const-string v0, "head"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pool"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lv63/g;->w:Lx63/f;

    iput-object p1, p0, Lv63/g;->x:Lw63/a;

    iget-object p4, p1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast p4, Ljava/nio/ByteBuffer;

    iput-object p4, p0, Lv63/g;->y:Ljava/nio/ByteBuffer;

    iget p4, p1, Lio/seon/androidsdk/service/e1;->b:I

    iput p4, p0, Lv63/g;->z:I

    iget p1, p1, Lio/seon/androidsdk/service/e1;->c:I

    iput p1, p0, Lv63/g;->E:I

    sub-int/2addr p1, p4

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lv63/g;->F:J

    return-void
.end method


# virtual methods
.method public final J(Lw63/a;)V
    .locals 5

    invoke-virtual {p1}, Lw63/a;->g()Lw63/a;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lw63/a;->m:Lw63/a;

    :cond_0
    invoke-virtual {p0, v0}, Lv63/g;->a0(Lw63/a;)V

    iget-wide v1, p0, Lv63/g;->F:J

    iget v3, v0, Lio/seon/androidsdk/service/e1;->c:I

    iget v0, v0, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v3, v0

    int-to-long v3, v3

    sub-long/2addr v1, v3

    invoke-virtual {p0, v1, v2}, Lv63/g;->T(J)V

    iget-object v0, p0, Lv63/g;->w:Lx63/f;

    invoke-virtual {p1, v0}, Lw63/a;->j(Lx63/f;)V

    return-void
.end method

.method public final T(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iput-wide p1, p0, Lv63/g;->F:J

    return-void

    :cond_0
    const-string v0, "tailRemaining shouldn\'t be negative: "

    invoke-static {p1, p2, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final a0(Lw63/a;)V
    .locals 1

    iput-object p1, p0, Lv63/g;->x:Lw63/a;

    iget-object v0, p1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv63/g;->y:Ljava/nio/ByteBuffer;

    iget v0, p1, Lio/seon/androidsdk/service/e1;->b:I

    iput v0, p0, Lv63/g;->z:I

    iget p1, p1, Lio/seon/androidsdk/service/e1;->c:I

    iput p1, p0, Lv63/g;->E:I

    return-void
.end method

.method public final b(I)V
    .locals 6

    if-ltz p1, :cond_5

    const/4 v0, 0x0

    move v1, p1

    :goto_0
    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lv63/g;->m()Lw63/a;

    move-result-object v2

    iget v3, p0, Lv63/g;->E:I

    iget v4, p0, Lv63/g;->z:I

    sub-int/2addr v3, v4

    const/4 v4, 0x1

    if-lt v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v4, v2}, Lv63/g;->x(ILw63/a;)Lw63/a;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_3

    :goto_2
    if-ne v0, p1, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Unable to discard "

    const-string v2, " bytes due to end of packet"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v3, v2, Lio/seon/androidsdk/service/e1;->c:I

    iget v4, v2, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v2, v3}, Lio/seon/androidsdk/service/e1;->d(I)V

    iget v4, p0, Lv63/g;->z:I

    add-int/2addr v4, v3

    iput v4, p0, Lv63/g;->z:I

    iget v4, v2, Lio/seon/androidsdk/service/e1;->c:I

    iget v5, v2, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v4, v5

    if-nez v4, :cond_4

    invoke-virtual {p0, v2}, Lv63/g;->J(Lw63/a;)V

    :cond_4
    sub-int/2addr v1, v3

    add-int/2addr v0, v3

    goto :goto_0

    :cond_5
    const-string v0, "Negative discard is not allowed: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 3

    invoke-virtual {p0}, Lv63/g;->m()Lw63/a;

    move-result-object v0

    sget-object v1, Lw63/a;->m:Lw63/a;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Lv63/g;->a0(Lw63/a;)V

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, Lv63/g;->T(J)V

    iget-object v1, p0, Lv63/g;->w:Lx63/f;

    invoke-static {v0, v1}, Ls4/a;->j(Lw63/a;Lx63/f;)V

    :cond_0
    iget-boolean v0, p0, Lv63/g;->G:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv63/g;->G:Z

    :cond_1
    return-void
.end method

.method public final h(Lw63/a;)Lw63/a;
    .locals 6

    sget-object v0, Lw63/a;->m:Lw63/a;

    :goto_0
    if-ne p1, v0, :cond_1

    iget-boolean p1, p0, Lv63/g;->G:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lv63/g;->G:Z

    :goto_1
    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lw63/a;->g()Lw63/a;

    move-result-object v1

    iget-object v2, p0, Lv63/g;->w:Lx63/f;

    invoke-virtual {p1, v2}, Lw63/a;->j(Lx63/f;)V

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Lv63/g;->a0(Lw63/a;)V

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, Lv63/g;->T(J)V

    move-object p1, v0

    goto :goto_0

    :cond_2
    iget p1, v1, Lio/seon/androidsdk/service/e1;->c:I

    iget v2, v1, Lio/seon/androidsdk/service/e1;->b:I

    if-le p1, v2, :cond_3

    invoke-virtual {p0, v1}, Lv63/g;->a0(Lw63/a;)V

    iget-wide v2, p0, Lv63/g;->F:J

    iget p1, v1, Lio/seon/androidsdk/service/e1;->c:I

    iget v0, v1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr p1, v0

    int-to-long v4, p1

    sub-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, Lv63/g;->T(J)V

    return-object v1

    :cond_3
    move-object p1, v1

    goto :goto_0
.end method

.method public final i(Lw63/a;)V
    .locals 6

    iget-boolean v0, p0, Lv63/g;->G:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lw63/a;->h()Lw63/a;

    move-result-object v0

    if-nez v0, :cond_0

    iget v0, p1, Lio/seon/androidsdk/service/e1;->b:I

    iput v0, p0, Lv63/g;->z:I

    iget p1, p1, Lio/seon/androidsdk/service/e1;->c:I

    iput p1, p0, Lv63/g;->E:I

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lv63/g;->T(J)V

    return-void

    :cond_0
    iget v0, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v1, p1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v0, v1

    iget v1, p1, Lio/seon/androidsdk/service/e1;->f:I

    iget v2, p1, Lio/seon/androidsdk/service/e1;->e:I

    sub-int/2addr v1, v2

    rsub-int/lit8 v1, v1, 0x8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lv63/g;->w:Lx63/f;

    if-le v0, v1, :cond_1

    invoke-interface {v2}, Lx63/f;->t0()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw63/a;

    invoke-interface {v2}, Lx63/f;->t0()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw63/a;

    invoke-virtual {v3}, Lio/seon/androidsdk/service/e1;->f()V

    invoke-virtual {v4}, Lio/seon/androidsdk/service/e1;->f()V

    invoke-virtual {v3, v4}, Lw63/a;->l(Lw63/a;)V

    invoke-virtual {p1}, Lw63/a;->g()Lw63/a;

    move-result-object v5

    invoke-virtual {v4, v5}, Lw63/a;->l(Lw63/a;)V

    sub-int/2addr v0, v1

    invoke-static {v3, p1, v0}, Ls3/d;->v(Lw63/a;Lw63/a;I)I

    invoke-static {v4, p1, v1}, Ls3/d;->v(Lw63/a;Lw63/a;I)I

    invoke-virtual {p0, v3}, Lv63/g;->a0(Lw63/a;)V

    invoke-static {v4}, Ls4/a;->k(Lw63/a;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lv63/g;->T(J)V

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Lx63/f;->t0()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw63/a;

    invoke-virtual {v1}, Lio/seon/androidsdk/service/e1;->f()V

    invoke-virtual {p1}, Lw63/a;->g()Lw63/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Lw63/a;->l(Lw63/a;)V

    invoke-static {v1, p1, v0}, Ls3/d;->v(Lw63/a;Lw63/a;I)I

    invoke-virtual {p0, v1}, Lv63/g;->a0(Lw63/a;)V

    :goto_0
    invoke-virtual {p1, v2}, Lw63/a;->j(Lx63/f;)V

    return-void
.end method

.method public final k()Z
    .locals 4

    iget v0, p0, Lv63/g;->E:I

    iget v1, p0, Lv63/g;->z:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_2

    iget-wide v0, p0, Lv63/g;->F:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lv63/g;->G:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lv63/g;->G:Z

    :cond_1
    :goto_0
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final m()Lw63/a;
    .locals 3

    iget-object v0, p0, Lv63/g;->x:Lw63/a;

    iget v1, p0, Lv63/g;->z:I

    if-ltz v1, :cond_1

    iget v2, v0, Lio/seon/androidsdk/service/e1;->c:I

    if-gt v1, v2, :cond_1

    iget v2, v0, Lio/seon/androidsdk/service/e1;->b:I

    if-eq v2, v1, :cond_0

    iput v1, v0, Lio/seon/androidsdk/service/e1;->b:I

    :cond_0
    return-object v0

    :cond_1
    iget v2, v0, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v1, v2

    iget v0, v0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ls30/b;->e(II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final s()J
    .locals 4

    iget v0, p0, Lv63/g;->E:I

    iget v1, p0, Lv63/g;->z:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    iget-wide v2, p0, Lv63/g;->F:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final x(ILw63/a;)Lw63/a;
    .locals 7

    :goto_0
    iget v0, p0, Lv63/g;->E:I

    iget v1, p0, Lv63/g;->z:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lw63/a;->h()Lw63/a;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-boolean p1, p0, Lv63/g;->G:Z

    if-eqz p1, :cond_1

    return-object v2

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lv63/g;->G:Z

    return-object v2

    :cond_2
    if-nez v0, :cond_4

    sget-object v0, Lw63/a;->m:Lw63/a;

    if-eq p2, v0, :cond_3

    invoke-virtual {p0, p2}, Lv63/g;->J(Lw63/a;)V

    :cond_3
    move-object p2, v1

    goto :goto_0

    :cond_4
    sub-int v0, p1, v0

    invoke-static {p2, v1, v0}, Ls3/d;->v(Lw63/a;Lw63/a;I)I

    move-result v0

    iget v3, p2, Lio/seon/androidsdk/service/e1;->c:I

    iput v3, p0, Lv63/g;->E:I

    iget-wide v3, p0, Lv63/g;->F:J

    int-to-long v5, v0

    sub-long/2addr v3, v5

    invoke-virtual {p0, v3, v4}, Lv63/g;->T(J)V

    iget v3, v1, Lio/seon/androidsdk/service/e1;->c:I

    iget v4, v1, Lio/seon/androidsdk/service/e1;->b:I

    if-le v3, v4, :cond_9

    if-ltz v0, :cond_8

    if-lt v4, v0, :cond_5

    iput v0, v1, Lio/seon/androidsdk/service/e1;->d:I

    goto :goto_1

    :cond_5
    if-ne v4, v3, :cond_7

    iget v3, v1, Lio/seon/androidsdk/service/e1;->e:I

    if-gt v0, v3, :cond_6

    iput v0, v1, Lio/seon/androidsdk/service/e1;->c:I

    iput v0, v1, Lio/seon/androidsdk/service/e1;->b:I

    iput v0, v1, Lio/seon/androidsdk/service/e1;->d:I

    goto :goto_1

    :cond_6
    invoke-static {v0, v1}, Ls30/b;->v(ILw63/a;)V

    throw v2

    :cond_7
    invoke-static {v0, v1}, Ls30/b;->u(ILw63/a;)V

    throw v2

    :cond_8
    const-string p1, "startGap shouldn\'t be negative: "

    invoke-static {v0, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    invoke-virtual {p2}, Lw63/a;->g()Lw63/a;

    invoke-virtual {v1}, Lw63/a;->g()Lw63/a;

    move-result-object v0

    invoke-virtual {p2, v0}, Lw63/a;->l(Lw63/a;)V

    iget-object v0, p0, Lv63/g;->w:Lx63/f;

    invoke-virtual {v1, v0}, Lw63/a;->j(Lx63/f;)V

    :goto_1
    iget v0, p2, Lio/seon/androidsdk/service/e1;->c:I

    iget v1, p2, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_a

    :goto_2
    return-object p2

    :cond_a
    const/16 v0, 0x8

    if-gt p1, v0, :cond_b

    goto/16 :goto_0

    :cond_b
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "minSize of "

    const-string v1, " is too big (should be less than 8)"

    invoke-static {p1, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
