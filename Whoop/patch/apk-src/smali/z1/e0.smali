.class public final Lz1/e0;
.super Lz1/f;
.source "SourceFile"


# instance fields
.field public final e:Lz1/f;

.field public final f:Z

.field public final g:Z

.field public h:Lkotlin/jvm/functions/Function1;

.field public final i:J


# direct methods
.method public constructor <init>(Lz1/f;Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 3

    sget-object v0, Lz1/l;->a:Lz1/k;

    const-wide/16 v0, 0x0

    sget-object v2, Lz1/j;->E:Lz1/j;

    invoke-direct {p0, v0, v1, v2}, Lz1/f;-><init>(JLz1/j;)V

    iput-object p1, p0, Lz1/e0;->e:Lz1/f;

    iput-boolean p3, p0, Lz1/e0;->f:Z

    iput-boolean p4, p0, Lz1/e0;->g:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lz1/l;->j:Lz1/a;

    iget-object p1, p1, Lz1/b;->e:Lkotlin/jvm/functions/Function1;

    :cond_1
    invoke-static {p2, p1, p3}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object p1, p0, Lz1/e0;->h:Lkotlin/jvm/functions/Function1;

    invoke-static {}, Lx1/c;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lz1/e0;->i:J

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz1/f;->c:Z

    iget-boolean v0, p0, Lz1/e0;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz1/e0;->e:Lz1/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz1/f;->c()V

    :cond_0
    return-void
.end method

.method public final d()Lz1/j;
    .locals 1

    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->d()Lz1/j;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lz1/e0;->h:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->f()Z

    move-result v0

    return v0
.end method

.method public final g()J
    .locals 2

    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()Lkotlin/jvm/functions/Function1;
    .locals 1

    const/4 v0, 0x0

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

    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->m()V

    return-void
.end method

.method public final n(Lz1/z;)V
    .locals 1

    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/f;->n(Lz1/z;)V

    return-void
.end method

.method public final u(Lkotlin/jvm/functions/Function1;)Lz1/f;
    .locals 3

    iget-object v0, p0, Lz1/e0;->h:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iget-boolean v0, p0, Lz1/e0;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lz1/f;->u(Lkotlin/jvm/functions/Function1;)Lz1/f;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lz1/l;->h(Lz1/f;Lkotlin/jvm/functions/Function1;Z)Lz1/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lz1/e0;->v()Lz1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/f;->u(Lkotlin/jvm/functions/Function1;)Lz1/f;

    move-result-object p1

    return-object p1
.end method

.method public final v()Lz1/f;
    .locals 1

    iget-object v0, p0, Lz1/e0;->e:Lz1/f;

    if-nez v0, :cond_0

    sget-object v0, Lz1/l;->j:Lz1/a;

    :cond_0
    return-object v0
.end method
