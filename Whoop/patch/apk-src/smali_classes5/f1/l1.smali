.class public final Lf1/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/d1;


# instance fields
.field public final synthetic a:Lf1/s1;


# direct methods
.method public constructor <init>(Lf1/s1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/l1;->a:Lf1/s1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(J)V
    .locals 2

    const/4 p1, 0x1

    iget-object p2, p0, Lf1/l1;->a:Lf1/s1;

    invoke-virtual {p2, p1}, Lf1/s1;->k(Z)J

    move-result-wide v0

    invoke-static {v0, v1}, Lf1/p0;->a(J)J

    move-result-wide v0

    iget-object p1, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lu0/s0;->d()Lu0/p1;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0, v1}, Lu0/p1;->e(J)J

    move-result-wide v0

    iput-wide v0, p2, Lf1/s1;->o:J

    new-instance p1, Lh2/b;

    invoke-direct {p1, v0, v1}, Lh2/b;-><init>(J)V

    iget-object v0, p2, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p2, Lf1/s1;->q:J

    sget-object p1, Lu0/f0;->w:Lu0/f0;

    iget-object v0, p2, Lf1/s1;->r:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lf1/s1;->s(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lf1/l1;->a:Lf1/s1;

    iget-object v1, v0, Lf1/s1;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(J)V
    .locals 5

    iget-object v0, p0, Lf1/l1;->a:Lf1/s1;

    iget-wide v1, v0, Lf1/s1;->q:J

    invoke-static {v1, v2, p1, p2}, Lh2/b;->h(JJ)J

    move-result-wide p1

    iput-wide p1, v0, Lf1/s1;->q:J

    iget-object p1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lu0/s0;->d()Lu0/p1;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-wide v1, v0, Lf1/s1;->o:J

    iget-wide v3, v0, Lf1/s1;->q:J

    invoke-static {v1, v2, v3, v4}, Lh2/b;->h(JJ)J

    move-result-wide v1

    new-instance p2, Lh2/b;

    invoke-direct {p2, v1, v2}, Lh2/b;-><init>(J)V

    iget-object v1, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p2, v0, Lf1/s1;->b:Lq3/r;

    invoke-virtual {v0}, Lf1/s1;->i()Lh2/b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v1, v1, Lh2/b;->a:J

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v2, v3}, Lu0/p1;->b(JZ)I

    move-result p1

    invoke-interface {p2, p1}, Lq3/r;->n(I)I

    move-result p1

    invoke-static {p1, p1}, Lj93/l0;->f(II)J

    move-result-wide p1

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-wide v1, v1, Lq3/y;->b:J

    invoke-static {p1, p2, v1, v2}, Ll3/u0;->b(JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lu0/s0;->q:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lf1/s1;->k:Lq2/a;

    if-eqz v1, :cond_2

    const/16 v2, 0x9

    invoke-interface {v1, v2}, Lq2/a;->a(I)V

    :cond_2
    :goto_0
    iget-object v1, v0, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-object v2, v2, Lq3/y;->a:Ll3/g;

    invoke-static {v2, p1, p2}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll3/u0;

    invoke-direct {v1, p1, p2}, Ll3/u0;-><init>(J)V

    iput-object v1, v0, Lf1/s1;->w:Ll3/u0;

    :cond_3
    :goto_1
    return-void
.end method

.method public final onCancel()V
    .locals 0

    return-void
.end method

.method public final onStop()V
    .locals 3

    iget-object v0, p0, Lf1/l1;->a:Lf1/s1;

    iget-object v1, v0, Lf1/s1;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
