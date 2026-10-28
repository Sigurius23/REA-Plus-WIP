.class public final Lo0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/x2;


# static fields
.field public static final w:Lp0/n0;


# instance fields
.field public final a:Lo0/a;

.field public b:Z

.field public c:Lo0/o;

.field public final d:Lc33/c;

.field public final e:Lp1/k1;

.field public final f:Lj0/j;

.field public g:F

.field public final h:Lh0/d0;

.field public final i:Z

.field public j:La3/n0;

.field public final k:Lo0/w;

.field public final l:Lp0/d;

.field public final m:Landroidx/compose/foundation/lazy/layout/b;

.field public final n:Laj/d;

.field public final o:Lp0/l0;

.field public final p:Lla/b;

.field public final q:Lp0/h0;

.field public final r:Lp1/c1;

.field public final s:Lp1/c1;

.field public final t:Lp1/k1;

.field public final u:Lp1/k1;

.field public final v:Lp0/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm22/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lm22/b;-><init>(I)V

    new-instance v1, Lny0/m;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lny0/m;-><init>(I)V

    invoke-static {v0, v1}, Ly1/k;->b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;

    move-result-object v0

    sput-object v0, Lo0/y;->w:Lp0/n0;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    new-instance v0, Lo0/a;

    invoke-direct {v0}, Lo0/a;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo0/y;->a:Lo0/a;

    new-instance v0, Lc33/c;

    invoke-direct {v0, p1, p2}, Lc33/c;-><init>(II)V

    iput-object v0, p0, Lo0/y;->d:Lc33/c;

    sget-object p2, Lo0/a0;->a:Lo0/o;

    sget-object v0, Lp1/v0;->y:Lp1/v0;

    new-instance v1, Lp1/k1;

    invoke-direct {v1, p2, v0}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v1, p0, Lo0/y;->e:Lp1/k1;

    new-instance p2, Lj0/j;

    invoke-direct {p2}, Lj0/j;-><init>()V

    iput-object p2, p0, Lo0/y;->f:Lj0/j;

    new-instance p2, Lno0/e0;

    const/16 v0, 0xa

    invoke-direct {p2, p0, v0}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lh0/d0;

    invoke-direct {v0, p2}, Lh0/d0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lo0/y;->h:Lh0/d0;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lo0/y;->i:Z

    new-instance p2, Lo0/w;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lo0/w;-><init>(Lh0/x2;I)V

    iput-object p2, p0, Lo0/y;->k:Lo0/w;

    new-instance p2, Lp0/d;

    invoke-direct {p2}, Lp0/d;-><init>()V

    iput-object p2, p0, Lo0/y;->l:Lp0/d;

    new-instance p2, Landroidx/compose/foundation/lazy/layout/b;

    invoke-direct {p2}, Landroidx/compose/foundation/lazy/layout/b;-><init>()V

    iput-object p2, p0, Lo0/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    new-instance p2, Laj/d;

    const/16 v0, 0x16

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Laj/d;-><init>(IZ)V

    iput-object p2, p0, Lo0/y;->n:Laj/d;

    new-instance p2, Lp0/l0;

    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v1, 0xd

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    invoke-direct {p2, v0}, Lp0/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p2, p0, Lo0/y;->o:Lp0/l0;

    new-instance p1, Lla/b;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, Lla/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lo0/y;->p:Lla/b;

    new-instance p1, Lp0/h0;

    invoke-direct {p1}, Lp0/h0;-><init>()V

    iput-object p1, p0, Lo0/y;->q:Lp0/h0;

    invoke-static {}, Ldt/b;->j()Lp1/c1;

    move-result-object p1

    iput-object p1, p0, Lo0/y;->r:Lp1/c1;

    invoke-static {}, Ldt/b;->j()Lp1/c1;

    move-result-object p1

    iput-object p1, p0, Lo0/y;->s:Lp1/c1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lo0/y;->t:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lo0/y;->u:Lp1/k1;

    new-instance p1, Lp0/n0;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp0/n0;-><init>(I)V

    iput-object p1, p0, Lo0/y;->v:Lp0/n0;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lo0/x;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lo0/x;

    iget v1, v0, Lo0/x;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo0/x;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo0/x;

    invoke-direct {v0, p0, p3}, Lo0/x;-><init>(Lo0/y;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lo0/x;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lo0/x;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lo0/x;->x:Ls83/i;

    move-object p2, p1

    check-cast p2, Lc93/m;

    iget-object p1, v0, Lo0/x;->w:Lf0/z0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lo0/x;->w:Lf0/z0;

    move-object p3, p2

    check-cast p3, Ls83/i;

    iput-object p3, v0, Lo0/x;->x:Ls83/i;

    iput v4, v0, Lo0/x;->E:I

    iget-object p3, p0, Lo0/y;->l:Lp0/d;

    invoke-virtual {p3, v0}, Lp0/d;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p3, 0x0

    iput-object p3, v0, Lo0/x;->w:Lf0/z0;

    iput-object p3, v0, Lo0/x;->x:Ls83/i;

    iput v3, v0, Lo0/x;->E:I

    iget-object p3, p0, Lo0/y;->h:Lh0/d0;

    invoke-virtual {p3, p1, p2, v0}, Lh0/d0;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lo0/y;->h:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lo0/y;->u:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lo0/y;->t:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lo0/y;->h:Lh0/d0;

    invoke-virtual {v0, p1}, Lh0/d0;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(Lo0/o;ZZ)V
    .locals 11

    iget-object v0, p1, Lo0/o;->m:Ljava/lang/Object;

    iget v1, p1, Lo0/o;->p:I

    iget v2, p1, Lo0/o;->b:I

    iget-object v3, p1, Lo0/o;->a:Lo0/q;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    iget-object v5, p0, Lo0/y;->o:Lp0/l0;

    iput v4, v5, Lp0/l0;->e:I

    if-nez p2, :cond_0

    iget-boolean v4, p0, Lo0/y;->b:Z

    if-eqz v4, :cond_0

    iput-object p1, p0, Lo0/y;->c:Lo0/o;

    return-void

    :cond_0
    const/4 v4, 0x1

    if-eqz p2, :cond_1

    iput-boolean v4, p0, Lo0/y;->b:Z

    :cond_1
    iget v5, p0, Lo0/y;->g:F

    iget v6, p1, Lo0/o;->d:F

    sub-float/2addr v5, v6

    iput v5, p0, Lo0/y;->g:F

    iget-object v5, p0, Lo0/y;->e:Lp1/k1;

    invoke-virtual {v5, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    iget v6, v3, Lo0/q;->a:I

    goto :goto_0

    :cond_2
    move v6, v5

    :goto_0
    if-nez v6, :cond_4

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    move v6, v5

    goto :goto_2

    :cond_4
    :goto_1
    move v6, v4

    :goto_2
    iget-object v7, p0, Lo0/y;->u:Lp1/k1;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v7, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean v6, p1, Lo0/o;->c:Z

    iget-object v7, p0, Lo0/y;->t:Lp1/k1;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v7, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v6, p0, Lo0/y;->d:Lc33/c;

    const/4 v7, 0x0

    if-eqz p3, :cond_7

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-float p3, v2

    cmpl-float p3, p3, v7

    if-ltz p3, :cond_5

    goto :goto_3

    :cond_5
    move v4, v5

    :goto_3
    if-nez v4, :cond_6

    const-string p3, "scrollOffset should be non-negative"

    invoke-static {p3}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_6
    iget-object p3, v6, Lc33/c;->b:Ljava/lang/Object;

    check-cast p3, Lp1/h1;

    invoke-virtual {p3, v2}, Lp1/h1;->y(I)V

    goto/16 :goto_b

    :cond_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_8

    iget-object p3, v3, Lo0/q;->b:[Lo0/p;

    invoke-static {p3}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lo0/p;

    if-eqz p3, :cond_8

    iget-object p3, p3, Lo0/p;->b:Ljava/lang/Object;

    goto :goto_4

    :cond_8
    const/4 p3, 0x0

    :goto_4
    iput-object p3, v6, Lc33/c;->d:Ljava/lang/Object;

    iget-boolean p3, v6, Lc33/c;->a:Z

    if-nez p3, :cond_9

    if-lez v1, :cond_d

    :cond_9
    iput-boolean v4, v6, Lc33/c;->a:Z

    int-to-float p3, v2

    cmpl-float p3, p3, v7

    if-ltz p3, :cond_a

    move p3, v4

    goto :goto_5

    :cond_a
    move p3, v5

    :goto_5
    if-nez p3, :cond_b

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v8, "scrollOffset should be non-negative ("

    invoke-direct {p3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v8, 0x29

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_b
    if-eqz v3, :cond_c

    iget-object p3, v3, Lo0/q;->b:[Lo0/p;

    invoke-static {p3}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lo0/p;

    if-eqz p3, :cond_c

    iget p3, p3, Lo0/p;->a:I

    goto :goto_6

    :cond_c
    move p3, v5

    :goto_6
    invoke-virtual {v6, p3, v2}, Lc33/c;->g(II)V

    :cond_d
    iget-boolean p3, p0, Lo0/y;->i:Z

    if-eqz p3, :cond_14

    iget-object p3, p0, Lo0/y;->a:Lo0/a;

    iget-object v2, p3, Lo0/a;->b:Lr1/c;

    iget v3, p3, Lo0/a;->a:I

    iget-boolean v6, p3, Lo0/a;->c:Z

    const/4 v8, -0x1

    if-eq v3, v8, :cond_f

    move-object v9, v0

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_f

    invoke-static {p1, v6}, Lo0/a;->b(Lo0/o;Z)I

    move-result v6

    if-eq v3, v6, :cond_f

    iput v8, p3, Lo0/a;->a:I

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v6, v2, Lr1/c;->y:I

    move v9, v5

    :goto_7
    if-ge v9, v6, :cond_e

    aget-object v10, v3, v9

    check-cast v10, Lp0/j0;

    invoke-interface {v10}, Lp0/j0;->cancel()V

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_e
    invoke-virtual {v2}, Lr1/c;->g()V

    :cond_f
    iget v3, p3, Lo0/a;->d:I

    if-eq v3, v8, :cond_13

    iget v6, p3, Lo0/a;->e:F

    cmpg-float v6, v6, v7

    if-nez v6, :cond_10

    goto :goto_a

    :cond_10
    if-eq v3, v1, :cond_13

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    iget v0, p3, Lo0/a;->e:F

    cmpg-float v0, v0, v7

    if-gez v0, :cond_11

    move v0, v4

    goto :goto_8

    :cond_11
    move v0, v5

    :goto_8
    invoke-static {p1, v0}, Lo0/a;->b(Lo0/o;Z)I

    move-result v0

    iget v3, p3, Lo0/a;->e:F

    cmpg-float v3, v3, v7

    if-gez v3, :cond_12

    goto :goto_9

    :cond_12
    move v4, v5

    :goto_9
    invoke-static {p1, v4}, Lo0/a;->a(Lo0/o;Z)I

    move-result v3

    if-ltz v3, :cond_13

    if-ge v3, v1, :cond_13

    iget v3, p3, Lo0/a;->a:I

    if-eq v0, v3, :cond_13

    if-ltz v0, :cond_13

    iput v0, p3, Lo0/a;->a:I

    invoke-virtual {v2}, Lr1/c;->g()V

    iget-object v3, p0, Lo0/y;->p:Lla/b;

    invoke-virtual {v3, v0}, Lla/b;->F(I)Ljava/util/ArrayList;

    move-result-object v0

    iget v3, v2, Lr1/c;->y:I

    invoke-virtual {v2, v3, v0}, Lr1/c;->c(ILjava/util/List;)V

    :cond_13
    :goto_a
    iput v1, p3, Lo0/a;->d:I

    :cond_14
    :goto_b
    if-eqz p2, :cond_15

    iget p2, p1, Lo0/o;->f:F

    iget-object p3, p1, Lo0/o;->i:Ly3/c;

    iget-object p1, p1, Lo0/o;->h:Lbc3/c0;

    iget-object v0, p0, Lo0/y;->v:Lp0/n0;

    invoke-virtual {v0, p2, p3, p1}, Lp0/n0;->m(FLy3/c;Lbc3/c0;)V

    :cond_15
    return-void
.end method

.method public final g()Lo0/o;
    .locals 1

    iget-object v0, p0, Lo0/y;->e:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/o;

    return-object v0
.end method

.method public final h(FLo0/o;)V
    .locals 11

    iget-boolean v0, p0, Lo0/y;->i:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo0/y;->a:Lo0/a;

    iget-object v1, v0, Lo0/a;->b:Lr1/c;

    iget-object v2, p2, Lo0/o;->m:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    const/4 v2, 0x0

    cmpg-float v2, p1, v2

    const/4 v3, 0x0

    if-gez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-static {p2, v2}, Lo0/a;->b(Lo0/o;Z)I

    move-result v4

    invoke-static {p2, v2}, Lo0/a;->a(Lo0/o;Z)I

    move-result v5

    if-ltz v5, :cond_5

    iget-object v6, p2, Lo0/o;->q:Lh0/d2;

    iget-object v7, p2, Lo0/o;->m:Ljava/lang/Object;

    iget v8, p2, Lo0/o;->p:I

    if-ge v5, v8, :cond_5

    iget v5, v0, Lo0/a;->a:I

    if-eq v4, v5, :cond_2

    if-ltz v4, :cond_2

    iget-boolean v5, v0, Lo0/a;->c:Z

    if-eq v5, v2, :cond_1

    iget-object v5, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v8, v1, Lr1/c;->y:I

    move v9, v3

    :goto_1
    if-ge v9, v8, :cond_1

    aget-object v10, v5, v9

    check-cast v10, Lp0/j0;

    invoke-interface {v10}, Lp0/j0;->cancel()V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, v0, Lo0/a;->c:Z

    iput v4, v0, Lo0/a;->a:I

    invoke-virtual {v1}, Lr1/c;->g()V

    iget-object v5, p0, Lo0/y;->p:Lla/b;

    invoke-virtual {v5, v4}, Lla/b;->F(I)Ljava/util/ArrayList;

    move-result-object v4

    iget v5, v1, Lr1/c;->y:I

    invoke-virtual {v1, v5, v4}, Lr1/c;->c(ILjava/util/List;)V

    :cond_2
    if-eqz v2, :cond_4

    invoke-static {v7}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/p;

    sget-object v4, Lh0/d2;->w:Lh0/d2;

    if-ne v6, v4, :cond_3

    iget-wide v4, v2, Lo0/p;->s:J

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    :goto_2
    long-to-int v4, v4

    goto :goto_3

    :cond_3
    iget-wide v4, v2, Lo0/p;->s:J

    const/16 v7, 0x20

    shr-long/2addr v4, v7

    goto :goto_2

    :goto_3
    iget v5, p2, Lo0/o;->s:I

    invoke-static {v2, v6}, Lse/g;->G(Lo0/p;Lh0/d2;)I

    move-result v2

    add-int/2addr v2, v4

    add-int/2addr v2, v5

    iget p2, p2, Lo0/o;->o:I

    sub-int/2addr v2, p2

    int-to-float p2, v2

    neg-float v2, p1

    cmpg-float p2, p2, v2

    if-gez p2, :cond_5

    iget-object p2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    :goto_4
    if-ge v3, v1, :cond_5

    aget-object v2, p2, v3

    check-cast v2, Lp0/j0;

    invoke-interface {v2}, Lp0/j0;->a()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v7}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/p;

    iget p2, p2, Lo0/o;->n:I

    invoke-static {v2, v6}, Lse/g;->G(Lo0/p;Lh0/d2;)I

    move-result v2

    sub-int/2addr p2, v2

    int-to-float p2, p2

    cmpg-float p2, p2, p1

    if-gez p2, :cond_5

    iget-object p2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    :goto_5
    if-ge v3, v1, :cond_5

    aget-object v2, p2, v3

    check-cast v2, Lp0/j0;

    invoke-interface {v2}, Lp0/j0;->a()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    iput p1, v0, Lo0/a;->e:F

    :cond_6
    return-void
.end method
