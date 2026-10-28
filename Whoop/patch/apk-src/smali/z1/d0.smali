.class public final Lz1/d0;
.super Lz1/b;
.source "SourceFile"


# instance fields
.field public final o:Lz1/b;

.field public final p:Z

.field public final q:Z

.field public r:Lkotlin/jvm/functions/Function1;

.field public s:Lkotlin/jvm/functions/Function1;

.field public final t:J


# direct methods
.method public constructor <init>(Lz1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 7

    sget-object v0, Lz1/l;->a:Lz1/k;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lz1/b;->y()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lz1/l;->j:Lz1/a;

    iget-object v0, v0, Lz1/b;->e:Lkotlin/jvm/functions/Function1;

    :cond_1
    invoke-static {p2, v0, p4}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v5

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lz1/b;->i()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_3

    :cond_2
    sget-object p2, Lz1/l;->j:Lz1/a;

    iget-object p2, p2, Lz1/b;->f:Lkotlin/jvm/functions/Function1;

    :cond_3
    invoke-static {p3, p2}, Lz1/l;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    const-wide/16 v2, 0x0

    sget-object v4, Lz1/j;->E:Lz1/j;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lz1/b;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v1, Lz1/d0;->o:Lz1/b;

    iput-boolean p4, v1, Lz1/d0;->p:Z

    iput-boolean p5, v1, Lz1/d0;->q:Z

    iget-object p1, v1, Lz1/b;->e:Lkotlin/jvm/functions/Function1;

    iput-object p1, v1, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    iget-object p1, v1, Lz1/b;->f:Lkotlin/jvm/functions/Function1;

    iput-object p1, v1, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    invoke-static {}, Lx1/c;->c()J

    move-result-wide p1

    iput-wide p1, v1, Lz1/d0;->t:J

    return-void
.end method


# virtual methods
.method public final B(La0/w0;)V
    .locals 0

    invoke-static {}, Lz1/t;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;
    .locals 8

    iget-object v0, p0, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v4

    iget-object p1, p0, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    invoke-static {p2, p1}, Lz1/l;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v5

    iget-boolean p1, p0, Lz1/d0;->p:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v5}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v3

    new-instance v2, Lz1/d0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Lz1/d0;-><init>(Lz1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object p1

    return-object p1
.end method

.method public final D()Lz1/b;
    .locals 1

    iget-object v0, p0, Lz1/d0;->o:Lz1/b;

    if-nez v0, :cond_0

    sget-object v0, Lz1/l;->j:Lz1/a;

    :cond_0
    return-object v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz1/f;->c:Z

    iget-boolean v0, p0, Lz1/d0;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz1/d0;->o:Lz1/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz1/b;->c()V

    :cond_0
    return-void
.end method

.method public final d()Lz1/j;
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->d()Lz1/j;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/b;->f()Z

    move-result v0

    return v0
.end method

.method public final g()J
    .locals 2

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h()I
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/b;->h()I

    move-result v0

    return v0
.end method

.method public final i()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final k()V
    .locals 1

    invoke-static {}, Lz1/t;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l()V
    .locals 1

    invoke-static {}, Lz1/t;->a()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/b;->m()V

    return-void
.end method

.method public final n(Lz1/z;)V
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/b;->n(Lz1/z;)V

    return-void
.end method

.method public final r(Lz1/j;)V
    .locals 0

    invoke-static {}, Lz1/t;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final s(J)V
    .locals 0

    invoke-static {}, Lz1/t;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final t(I)V
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/b;->t(I)V

    return-void
.end method

.method public final u(Lkotlin/jvm/functions/Function1;)Lz1/f;
    .locals 3

    iget-object v0, p0, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iget-boolean v0, p0, Lz1/d0;->p:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lz1/b;->u(Lkotlin/jvm/functions/Function1;)Lz1/f;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lz1/l;->h(Lz1/f;Lkotlin/jvm/functions/Function1;Z)Lz1/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/b;->u(Lkotlin/jvm/functions/Function1;)Lz1/f;

    move-result-object p1

    return-object p1
.end method

.method public final w()Lz1/q;
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/b;->w()Lz1/q;

    move-result-object v0

    return-object v0
.end method

.method public final x()La0/w0;
    .locals 1

    invoke-virtual {p0}, Lz1/d0;->D()Lz1/b;

    move-result-object v0

    invoke-virtual {v0}, Lz1/b;->x()La0/w0;

    move-result-object v0

    return-object v0
.end method

.method public final y()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
