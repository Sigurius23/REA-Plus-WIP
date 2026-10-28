.class public final Lh0/m1;
.super Lh0/f1;
.source "SourceFile"


# instance fields
.field public Z:Lh0/n1;

.field public a0:Lh0/d2;

.field public b0:Z

.field public c0:Lkotlin/jvm/functions/Function3;

.field public d0:Lkotlin/jvm/functions/Function3;

.field public e0:Z


# virtual methods
.method public final e1(Lh0/e1;Lh0/e1;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lh0/m1;->Z:Lh0/n1;

    sget-object v1, Lf0/z0;->x:Lf0/z0;

    new-instance v2, Lg20/p;

    const/4 v3, 0x0

    const/16 v4, 0x8

    invoke-direct {v2, p1, p0, v3, v4}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-interface {v0, v1, v2, p2}, Lh0/n1;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f1(J)V
    .locals 8

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh0/m1;->c0:Lkotlin/jvm/functions/Function3;

    sget-object v1, Lh0/k1;->a:Lh0/j1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v2, Lh0/l1;

    const/4 v7, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-wide v4, p1

    invoke-direct/range {v2 .. v7}, Lh0/l1;-><init>(Lh0/m1;JLq83/d;I)V

    const/4 p1, 0x1

    invoke-static {v0, v6, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    :goto_0
    return-void
.end method

.method public final g1(J)V
    .locals 8

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh0/m1;->d0:Lkotlin/jvm/functions/Function3;

    sget-object v1, Lh0/k1;->b:Lh0/j1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v2, Lh0/l1;

    const/4 v7, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    move-wide v4, p1

    invoke-direct/range {v2 .. v7}, Lh0/l1;-><init>(Lh0/m1;JLq83/d;I)V

    const/4 p1, 0x1

    invoke-static {v0, v6, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    :goto_0
    return-void
.end method

.method public final h1()Z
    .locals 1

    iget-boolean v0, p0, Lh0/m1;->b0:Z

    return v0
.end method
