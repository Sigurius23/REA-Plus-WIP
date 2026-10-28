.class public final Lu0/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lp1/k1;

.field public final B:Lp1/k1;

.field public a:Lu0/c1;

.field public final b:Lp1/v1;

.field public final c:Lb3/x2;

.field public final d:Lq3/i;

.field public e:Lq3/d0;

.field public final f:Lp1/k1;

.field public final g:Lp1/k1;

.field public h:Ly2/y;

.field public final i:Lp1/k1;

.field public j:Ll3/g;

.field public final k:Lp1/k1;

.field public final l:Lp1/k1;

.field public final m:Lp1/k1;

.field public final n:Lp1/k1;

.field public final o:Lp1/k1;

.field public p:Z

.field public final q:Lp1/k1;

.field public final r:Lu0/o0;

.field public final s:Lp1/k1;

.field public final t:Lp1/k1;

.field public u:Lkotlin/jvm/functions/Function1;

.field public final v:Lu0/v;

.field public final w:Lu0/v;

.field public final x:Lu0/v;

.field public final y:Li2/h;

.field public z:J


# direct methods
.method public constructor <init>(Lu0/c1;Lp1/v1;Lb3/x2;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/s0;->a:Lu0/c1;

    iput-object p2, p0, Lu0/s0;->b:Lp1/v1;

    iput-object p3, p0, Lu0/s0;->c:Lb3/x2;

    new-instance p1, Lq3/i;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lq3/y;

    sget-object v0, Ll3/h;->a:Ll3/g;

    sget-wide v1, Ll3/u0;->b:J

    const/4 v3, 0x0

    invoke-direct {p2, v0, v1, v2, v3}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    iput-object p2, p1, Lq3/i;->w:Ljava/lang/Object;

    new-instance v4, Ldn/e;

    iget-wide v5, p2, Lq3/y;->b:J

    invoke-direct {v4, v0, v5, v6}, Ldn/e;-><init>(Ll3/g;J)V

    iput-object v4, p1, Lq3/i;->x:Ljava/lang/Object;

    iput-object p1, p0, Lu0/s0;->d:Lq3/i;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->f:Lp1/k1;

    const/4 p2, 0x0

    int-to-float p2, p2

    new-instance v0, Ly3/f;

    invoke-direct {v0, p2}, Ly3/f;-><init>(F)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->g:Lp1/k1;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->i:Lp1/k1;

    sget-object p2, Lu0/g0;->w:Lu0/g0;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->k:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->l:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->m:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->n:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->o:Lp1/k1;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lu0/s0;->p:Z

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->q:Lp1/k1;

    new-instance p2, Lu0/o0;

    invoke-direct {p2, p3}, Lu0/o0;-><init>(Lb3/x2;)V

    iput-object p2, p0, Lu0/s0;->r:Lu0/o0;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lu0/s0;->s:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lu0/s0;->t:Lp1/k1;

    new-instance p1, Lu0/r;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lu0/r;-><init>(I)V

    iput-object p1, p0, Lu0/s0;->u:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lu0/v;

    invoke-direct {p1, p0, p2}, Lu0/v;-><init>(Lu0/s0;I)V

    iput-object p1, p0, Lu0/s0;->v:Lu0/v;

    new-instance p1, Lu0/v;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lu0/v;-><init>(Lu0/s0;I)V

    iput-object p1, p0, Lu0/s0;->w:Lu0/v;

    new-instance p1, Lu0/v;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lu0/v;-><init>(Lu0/s0;I)V

    iput-object p1, p0, Lu0/s0;->x:Lu0/v;

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object p1

    iput-object p1, p0, Lu0/s0;->y:Li2/h;

    sget-wide p1, Li2/x;->n:J

    iput-wide p1, p0, Lu0/s0;->z:J

    new-instance p1, Ll3/u0;

    invoke-direct {p1, v1, v2}, Ll3/u0;-><init>(J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lu0/s0;->A:Lp1/k1;

    new-instance p1, Ll3/u0;

    invoke-direct {p1, v1, v2}, Ll3/u0;-><init>(J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lu0/s0;->B:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()Lu0/g0;
    .locals 1

    iget-object v0, p0, Lu0/s0;->k:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/g0;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lu0/s0;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c()Ly2/y;
    .locals 2

    iget-object v0, p0, Lu0/s0;->h:Ly2/y;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lu0/p1;
    .locals 1

    iget-object v0, p0, Lu0/s0;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/p1;

    return-object v0
.end method

.method public final e(J)V
    .locals 1

    new-instance v0, Ll3/u0;

    invoke-direct {v0, p1, p2}, Ll3/u0;-><init>(J)V

    iget-object p1, p0, Lu0/s0;->B:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(J)V
    .locals 1

    new-instance v0, Ll3/u0;

    invoke-direct {v0, p1, p2}, Ll3/u0;-><init>(J)V

    iget-object p1, p0, Lu0/s0;->A:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
