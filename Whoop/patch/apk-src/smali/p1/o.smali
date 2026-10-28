.class public final Lp1/o;
.super Lp1/t;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Z

.field public d:Ljava/util/HashSet;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Lp1/k1;

.field public final synthetic g:Lp1/q;


# direct methods
.method public constructor <init>(Lp1/q;JZZLbu/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/o;->g:Lp1/q;

    iput-wide p2, p0, Lp1/o;->a:J

    iput-boolean p4, p0, Lp1/o;->b:Z

    iput-boolean p5, p0, Lp1/o;->c:Z

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lp1/o;->e:Ljava/util/LinkedHashSet;

    sget-object p1, Lx1/g;->z:Lx1/g;

    sget-object p2, Lp1/v0;->z:Lp1/v0;

    new-instance p3, Lp1/k1;

    invoke-direct {p3, p1, p2}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object p3, p0, Lp1/o;->f:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Lp1/w;Lc93/m;)V
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1, p2}, Lp1/t;->a(Lp1/w;Lc93/m;)V

    return-void
.end method

.method public final b(Lp1/w;Lux/f0;Lc93/m;)La0/w0;
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1, p2, p3}, Lp1/t;->b(Lp1/w;Lux/f0;Lc93/m;)La0/w0;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget v1, v0, Lp1/q;->A:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lp1/q;->A:I

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0}, Lp1/t;->d()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lp1/o;->b:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lp1/o;->c:Z

    return v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lp1/o;->a:J

    return-wide v0
.end method

.method public final h()Lp1/s;
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->h:Lp1/w;

    return-object v0
.end method

.method public final i()Lp1/p1;
    .locals 1

    iget-object v0, p0, Lp1/o;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/p1;

    return-object v0
.end method

.method public final j()Lq83/j;
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0}, Lp1/t;->j()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lp1/w;)V
    .locals 3

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v1, v0, Lp1/q;->b:Lp1/t;

    iget-object v2, v0, Lp1/q;->h:Lp1/w;

    invoke-virtual {v1, v2}, Lp1/t;->k(Lp1/w;)V

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1}, Lp1/t;->k(Lp1/w;)V

    return-void
.end method

.method public final l(Lp1/y0;)Lp1/x0;
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1}, Lp1/t;->l(Lp1/y0;)Lp1/x0;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lp1/w;Lux/f0;La0/w0;)La0/w0;
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1, p2, p3}, Lp1/t;->m(Lp1/w;Lux/f0;La0/w0;)La0/w0;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/util/Set;)V
    .locals 1

    iget-object v0, p0, Lp1/o;->d:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lp1/o;->d:Ljava/util/HashSet;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final o(Lp1/q;)V
    .locals 1

    iget-object v0, p0, Lp1/o;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final p(Lp1/v1;)V
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1}, Lp1/t;->p(Lp1/v1;)V

    return-void
.end method

.method public final q(Lp1/w;)V
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1}, Lp1/t;->q(Lp1/w;)V

    return-void
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget v1, v0, Lp1/q;->A:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lp1/q;->A:I

    return-void
.end method

.method public final s(Landroidx/compose/runtime/Composer;)V
    .locals 3

    iget-object v0, p0, Lp1/o;->d:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Lp1/q;

    iget-object v2, v2, Lp1/q;->c:Lp1/f2;

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp1/o;->e:Ljava/util/LinkedHashSet;

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->a(Ljava/util/AbstractCollection;)Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final t(Lp1/w;)V
    .locals 1

    iget-object v0, p0, Lp1/o;->g:Lp1/q;

    iget-object v0, v0, Lp1/q;->b:Lp1/t;

    invoke-virtual {v0, p1}, Lp1/t;->t(Lp1/w;)V

    return-void
.end method

.method public final u()V
    .locals 7

    iget-object v0, p0, Lp1/o;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lp1/o;->d:Ljava/util/HashSet;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/q;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    iget-object v6, v3, Lp1/q;->c:Lp1/f2;

    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_2
    return-void
.end method
