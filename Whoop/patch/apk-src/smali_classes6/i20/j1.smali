.class public final Li20/j1;
.super Landroidx/lifecycle/w1;
.source "SourceFile"

# interfaces
.implements Lg40/a0;


# instance fields
.field public final E:Ljava/util/LinkedHashMap;

.field public final F:Lec3/h2;

.field public G:Ljava/util/LinkedHashMap;

.field public final H:Lec3/r1;

.field public final I:Lec3/h2;

.field public final J:Lec3/h2;

.field public final K:Lf1/p1;

.field public final L:Lm63/d;

.field public final M:Lec3/h2;

.field public final N:Lec3/h2;

.field public final O:Lec3/h2;

.field public final P:Lec3/h2;

.field public final w:Li20/h;

.field public final x:Li20/k1;

.field public final y:Lj20/c;

.field public z:Leg/j;


# direct methods
.method public constructor <init>(Li20/h;Li20/k1;Lj20/c;)V
    .locals 9

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Li20/j1;->w:Li20/h;

    iput-object p2, p0, Li20/j1;->x:Li20/k1;

    iput-object p3, p0, Li20/j1;->y:Lj20/c;

    new-instance p2, Lhm/d;

    iget-object p1, p1, Li20/h;->x:Li20/s;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    iget-object v0, p1, Li20/s;->I:Lh20/i1;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lh20/i1;->y:Ljava/lang/String;

    iget-object v2, v0, Lh20/i1;->z:Ljava/lang/String;

    iget-object v0, v0, Lh20/i1;->w:Lh20/x0;

    new-instance v3, Li20/b;

    invoke-direct {v3, v1, v0, v2, p3}, Li20/b;-><init>(Ljava/lang/String;Lh20/x0;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p0, v3}, Li20/j1;->g(Li20/b;)Li20/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p2, v0}, Lhm/d;->m(Li20/b;)Ljava/util/LinkedHashMap;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    iput-object v1, p0, Li20/j1;->E:Ljava/util/LinkedHashMap;

    if-eqz p1, :cond_2

    iget-object v2, p1, Li20/s;->x:Li20/b;

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2}, Li20/j1;->g(Li20/b;)Li20/b;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {p2, v2}, Lhm/d;->m(Li20/b;)Ljava/util/LinkedHashMap;

    move-result-object p2

    goto :goto_3

    :cond_3
    move-object p2, p3

    :goto_3
    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p1, :cond_4

    if-nez v1, :cond_5

    :cond_4
    move v6, v4

    goto :goto_6

    :cond_5
    if-eqz v0, :cond_9

    iget-object v6, v0, Li20/b;->x:Lh20/x0;

    if-eqz v6, :cond_9

    iget-object v6, v6, Lh20/x0;->x:Ljava/lang/String;

    if-nez v6, :cond_6

    goto :goto_5

    :cond_6
    iget-object v7, p1, Li20/s;->y:Ljava/util/LinkedHashSet;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_4

    :cond_7
    move-object v7, p3

    :goto_4
    if-nez v7, :cond_8

    sget-object v7, Lvy/a;->a:Ljava/util/Set;

    :cond_8
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_6

    :cond_9
    :goto_5
    move v6, v5

    :goto_6
    if-eqz v6, :cond_d

    new-instance v6, Li20/h1;

    if-eqz v1, :cond_a

    if-eqz p2, :cond_b

    :cond_a
    if-eqz v3, :cond_c

    :cond_b
    move v4, v5

    :cond_c
    invoke-direct {v6, v4}, Li20/h1;-><init>(Z)V

    goto :goto_7

    :cond_d
    sget-object v6, Li20/g1;->a:Li20/g1;

    :goto_7
    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Li20/j1;->F:Lec3/h2;

    if-eqz v3, :cond_e

    move-object p2, p3

    :cond_e
    iput-object p2, p0, Li20/j1;->G:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Li20/j1;->H:Lec3/r1;

    if-nez v2, :cond_f

    goto :goto_8

    :cond_f
    move-object v0, v2

    :goto_8
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Li20/j1;->I:Lec3/h2;

    iput-object p2, p0, Li20/j1;->J:Lec3/h2;

    new-instance v0, Lf1/p1;

    if-eqz p1, :cond_10

    iget-object v1, p1, Li20/s;->G:Ljava/lang/String;

    goto :goto_9

    :cond_10
    move-object v1, p3

    :goto_9
    if-eqz p1, :cond_11

    iget-object v3, p1, Li20/s;->H:Ljava/util/LinkedHashSet;

    goto :goto_a

    :cond_11
    sget-object v3, Lm83/a0;->w:Lm83/a0;

    :goto_a
    invoke-direct {v0, v1, v3}, Lf1/p1;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    iput-object v0, p0, Li20/j1;->K:Lf1/p1;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li20/b;

    if-eqz p2, :cond_12

    invoke-static {p2, p3}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object p2

    goto :goto_b

    :cond_12
    sget-object p2, Lm83/z;->w:Lm83/z;

    :goto_b
    new-instance v0, Lm63/d;

    invoke-direct {v0, p2, p1, p0}, Lm63/d;-><init>(Ljava/util/Map;Li20/s;Li20/j1;)V

    iput-object v0, p0, Li20/j1;->L:Lm63/d;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Li20/j1;->M:Lec3/h2;

    iput-object p1, p0, Li20/j1;->N:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Li20/j1;->O:Lec3/h2;

    iput-object p1, p0, Li20/j1;->P:Lec3/h2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    new-instance v0, Li20/e1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p3, v1}, Li20/e1;-><init>(Li20/j1;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p2, p3, p3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    new-instance v0, Li20/e1;

    const/4 v3, 0x1

    invoke-direct {v0, p0, p3, v3}, Li20/e1;-><init>(Li20/j1;Lq83/d;I)V

    invoke-static {p2, p3, p3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    if-eqz v2, :cond_13

    iget-object p2, v2, Li20/b;->z:Ljava/lang/Boolean;

    if-eqz p2, :cond_13

    invoke-virtual {p1, p3, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_13
    return-void
.end method


# virtual methods
.method public final d(Leg/j;)V
    .locals 0

    iput-object p1, p0, Li20/j1;->z:Leg/j;

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lh20/i0;

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final f()Lf1/p1;
    .locals 1

    iget-object v0, p0, Li20/j1;->K:Lf1/p1;

    return-object v0
.end method

.method public final g(Li20/b;)Li20/b;
    .locals 4

    iget-object v0, p0, Li20/j1;->w:Li20/h;

    iget-object v0, v0, Li20/h;->x:Li20/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, Li20/s;->y:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lvy/a;->a:Ljava/util/Set;

    :cond_2
    iget-object v2, p1, Li20/b;->x:Lh20/x0;

    if-eqz v2, :cond_3

    iget-object v3, v2, Lh20/x0;->x:Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_5

    iget-object v2, v2, Lh20/x0;->x:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    return-object v1

    :cond_5
    :goto_2
    return-object p1
.end method
