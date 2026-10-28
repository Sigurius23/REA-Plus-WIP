.class public final Ln0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/x2;


# static fields
.field public static final x:Lp0/n0;


# instance fields
.field public final a:Ln0/a;

.field public b:Z

.field public c:Ln0/n;

.field public d:Z

.field public final e:Ll2/a;

.field public final f:Lp1/k1;

.field public final g:Lj0/j;

.field public h:F

.field public final i:Lh0/d0;

.field public final j:Z

.field public k:La3/n0;

.field public final l:Ln0/s;

.field public final m:Lp0/d;

.field public final n:Landroidx/compose/foundation/lazy/layout/b;

.field public final o:Laj/d;

.field public final p:Lp0/l0;

.field public final q:Lad3/z;

.field public final r:Lp0/h0;

.field public final s:Lp1/c1;

.field public final t:Lp1/k1;

.field public final u:Lp1/k1;

.field public final v:Lp1/c1;

.field public final w:Lp0/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmu2/e;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lmu2/e;-><init>(I)V

    new-instance v1, Lmd0/b;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lmd0/b;-><init>(I)V

    invoke-static {v0, v1}, Ly1/k;->b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;

    move-result-object v0

    sput-object v0, Ln0/u;->x:Lp0/n0;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    .line 1
    new-instance v0, Ln0/a;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, -0x1

    .line 3
    iput v1, v0, Ln0/a;->a:I

    .line 4
    iput v1, v0, Ln0/a;->d:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object v0, p0, Ln0/u;->a:Ln0/a;

    .line 7
    new-instance v0, Ll2/a;

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v1, Lp1/h1;

    invoke-direct {v1, p1}, Lp1/h1;-><init>(I)V

    .line 10
    iput-object v1, v0, Ll2/a;->b:Ljava/lang/Object;

    .line 11
    new-instance v1, Lp1/h1;

    invoke-direct {v1, p2}, Lp1/h1;-><init>(I)V

    .line 12
    iput-object v1, v0, Ll2/a;->c:Ljava/lang/Object;

    .line 13
    new-instance p2, Lp0/f0;

    const/16 v1, 0x1e

    const/16 v2, 0x64

    invoke-direct {p2, p1, v1, v2}, Lp0/f0;-><init>(III)V

    iput-object p2, v0, Ll2/a;->e:Ljava/lang/Object;

    .line 14
    iput-object v0, p0, Ln0/u;->e:Ll2/a;

    .line 15
    sget-object p2, Ln0/x;->a:Ln0/n;

    .line 16
    sget-object v0, Lp1/v0;->y:Lp1/v0;

    .line 17
    new-instance v1, Lp1/k1;

    .line 18
    invoke-direct {v1, p2, v0}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    .line 19
    iput-object v1, p0, Ln0/u;->f:Lp1/k1;

    .line 20
    new-instance p2, Lj0/j;

    invoke-direct {p2}, Lj0/j;-><init>()V

    .line 21
    iput-object p2, p0, Ln0/u;->g:Lj0/j;

    .line 22
    new-instance p2, La6/i;

    const/16 v0, 0x18

    invoke-direct {p2, p0, v0}, La6/i;-><init>(Ljava/lang/Object;I)V

    .line 23
    new-instance v0, Lh0/d0;

    invoke-direct {v0, p2}, Lh0/d0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 24
    iput-object v0, p0, Ln0/u;->i:Lh0/d0;

    const/4 p2, 0x1

    .line 25
    iput-boolean p2, p0, Ln0/u;->j:Z

    .line 26
    new-instance p2, Ln0/s;

    invoke-direct {p2, p0}, Ln0/s;-><init>(Ln0/u;)V

    iput-object p2, p0, Ln0/u;->l:Ln0/s;

    .line 27
    new-instance p2, Lp0/d;

    invoke-direct {p2}, Lp0/d;-><init>()V

    iput-object p2, p0, Ln0/u;->m:Lp0/d;

    .line 28
    new-instance p2, Landroidx/compose/foundation/lazy/layout/b;

    invoke-direct {p2}, Landroidx/compose/foundation/lazy/layout/b;-><init>()V

    iput-object p2, p0, Ln0/u;->n:Landroidx/compose/foundation/lazy/layout/b;

    .line 29
    new-instance p2, Laj/d;

    const/16 v0, 0x16

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Laj/d;-><init>(IZ)V

    iput-object p2, p0, Ln0/u;->o:Laj/d;

    .line 30
    new-instance p2, Lp0/l0;

    new-instance v0, Lku0/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lku0/c;-><init>(Ljava/lang/Object;II)V

    invoke-direct {p2, v0}, Lp0/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p2, p0, Ln0/u;->p:Lp0/l0;

    .line 31
    new-instance p1, Lad3/z;

    const/16 p2, 0x17

    invoke-direct {p1, p0, p2}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ln0/u;->q:Lad3/z;

    .line 32
    new-instance p1, Lp0/h0;

    invoke-direct {p1}, Lp0/h0;-><init>()V

    iput-object p1, p0, Ln0/u;->r:Lp0/h0;

    .line 33
    invoke-static {}, Ldt/b;->j()Lp1/c1;

    move-result-object p1

    iput-object p1, p0, Ln0/u;->s:Lp1/c1;

    .line 34
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Ln0/u;->t:Lp1/k1;

    .line 35
    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ln0/u;->u:Lp1/k1;

    .line 36
    invoke-static {}, Ldt/b;->j()Lp1/c1;

    move-result-object p1

    iput-object p1, p0, Ln0/u;->v:Lp1/c1;

    .line 37
    new-instance p1, Lp0/n0;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp0/n0;-><init>(I)V

    iput-object p1, p0, Ln0/u;->w:Lp0/n0;

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move p1, p3

    .line 38
    :cond_0
    invoke-direct {p0, p1, p3}, Ln0/u;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Ln0/t;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln0/t;

    iget v1, v0, Ln0/t;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln0/t;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln0/t;

    invoke-direct {v0, p0, p3}, Ln0/t;-><init>(Ln0/u;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ln0/t;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln0/t;->E:I

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
    iget-object p1, v0, Ln0/t;->x:Ls83/i;

    move-object p2, p1

    check-cast p2, Lc93/m;

    iget-object p1, v0, Ln0/t;->w:Lf0/z0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Ln0/t;->w:Lf0/z0;

    move-object p3, p2

    check-cast p3, Ls83/i;

    iput-object p3, v0, Ln0/t;->x:Ls83/i;

    iput v4, v0, Ln0/t;->E:I

    iget-object p3, p0, Ln0/u;->m:Lp0/d;

    invoke-virtual {p3, v0}, Lp0/d;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p3, 0x0

    iput-object p3, v0, Ln0/t;->w:Lf0/z0;

    iput-object p3, v0, Ln0/t;->x:Ls83/i;

    iput v3, v0, Ln0/t;->E:I

    iget-object p3, p0, Ln0/u;->i:Lh0/d0;

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

    iget-object v0, p0, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Ln0/u;->u:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Ln0/u;->t:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v0, p1}, Lh0/d0;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(IILq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lm40/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lm40/r;-><init>(Ln0/u;IILq83/d;)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0, p1, v0, p3}, Ln0/u;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g(Ln0/n;ZZ)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v0, Ln0/n;->k:Ljava/lang/Object;

    iget v3, v0, Ln0/n;->n:I

    iget v4, v0, Ln0/n;->b:I

    iget-object v5, v0, Ln0/n;->a:Ln0/o;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    iget-object v7, v1, Ln0/u;->p:Lp0/l0;

    iput v6, v7, Lp0/l0;->e:I

    iget-object v6, v1, Ln0/u;->w:Lp0/n0;

    iget-object v7, v1, Ln0/u;->e:Ll2/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-nez p2, :cond_4

    iget-boolean v10, v1, Ln0/u;->b:Z

    if-eqz v10, :cond_4

    iput-object v0, v1, Ln0/u;->c:Ln0/n;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v8

    :goto_0
    invoke-static {v2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v10

    :try_start_0
    iget-object v0, v6, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Ld0/m;

    iget-object v0, v0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, v0, v9

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ln0/o;->getIndex()I

    move-result v0

    iget-object v5, v7, Ll2/a;->b:Ljava/lang/Object;

    check-cast v5, Lp1/h1;

    invoke-virtual {v5}, Lp1/h1;->x()I

    move-result v5

    if-ne v0, v5, :cond_3

    iget-object v0, v7, Ll2/a;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-ne v4, v0, :cond_3

    iget-object v0, v6, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v8}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    new-instance v0, Ld0/m;

    sget-object v4, Ld0/f;->i:Ld0/f2;

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/16 v7, 0x3c

    invoke-direct {v0, v4, v5, v8, v7}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;I)V

    iput-object v0, v6, Lp0/n0;->y:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {v2, v10, v3}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :goto_2
    invoke-static {v2, v10, v3}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0

    :cond_4
    const/4 v10, 0x1

    if-eqz p2, :cond_5

    iput-boolean v10, v1, Ln0/u;->b:Z

    :cond_5
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ln0/o;->getIndex()I

    move-result v12

    goto :goto_3

    :cond_6
    const/4 v12, 0x0

    :goto_3
    if-nez v12, :cond_8

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    const/4 v12, 0x0

    goto :goto_5

    :cond_8
    :goto_4
    move v12, v10

    :goto_5
    iget-object v13, v1, Ln0/u;->u:Lp1/k1;

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v13, v12}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean v12, v0, Ln0/n;->c:Z

    iget-object v13, v1, Ln0/u;->t:Lp1/k1;

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v13, v12}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget v12, v1, Ln0/u;->h:F

    iget v13, v0, Ln0/n;->d:F

    sub-float/2addr v12, v13

    iput v12, v1, Ln0/u;->h:F

    iget-object v12, v1, Ln0/u;->f:Lp1/k1;

    invoke-virtual {v12, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const-string v12, "scrollOffset should be non-negative"

    if-eqz p3, :cond_b

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-float v2, v4

    cmpl-float v2, v2, v9

    if-ltz v2, :cond_9

    goto :goto_6

    :cond_9
    const/4 v10, 0x0

    :goto_6
    if-nez v10, :cond_a

    invoke-static {v12}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_a
    iget-object v2, v7, Ll2/a;->c:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2, v4}, Lp1/h1;->y(I)V

    goto/16 :goto_e

    :cond_b
    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ln0/o;

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ln0/o;

    const-wide/16 v15, -0x1

    if-eqz v13, :cond_c

    invoke-virtual {v13}, Ln0/o;->getIndex()I

    move-result v13

    move-object/from16 v17, v12

    int-to-long v11, v13

    goto :goto_7

    :cond_c
    move-object/from16 v17, v12

    move-wide v11, v15

    :goto_7
    const-string v13, "firstVisibleItem:index"

    invoke-static {v11, v12, v13}, La4/a;->F(JLjava/lang/String;)V

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Ln0/o;->getIndex()I

    move-result v11

    int-to-long v11, v11

    goto :goto_8

    :cond_d
    move-wide v11, v15

    :goto_8
    const-string v13, "lastVisibleItem:index"

    invoke-static {v11, v12, v13}, La4/a;->F(JLjava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Ln0/o;->getKey()Ljava/lang/Object;

    move-result-object v11

    goto :goto_9

    :cond_e
    move-object v11, v8

    :goto_9
    iput-object v11, v7, Ll2/a;->d:Ljava/lang/Object;

    iget-boolean v11, v7, Ll2/a;->a:Z

    if-nez v11, :cond_f

    if-lez v3, :cond_13

    :cond_f
    iput-boolean v10, v7, Ll2/a;->a:Z

    int-to-float v11, v4

    cmpl-float v11, v11, v9

    if-ltz v11, :cond_10

    move v11, v10

    goto :goto_a

    :cond_10
    const/4 v11, 0x0

    :goto_a
    if-nez v11, :cond_11

    invoke-static/range {v17 .. v17}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_11
    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ln0/o;->getIndex()I

    move-result v5

    goto :goto_b

    :cond_12
    const/4 v5, 0x0

    :goto_b
    invoke-virtual {v7, v5, v4}, Ll2/a;->b(II)V

    :cond_13
    iget-boolean v4, v1, Ln0/u;->j:Z

    if-eqz v4, :cond_19

    iget-object v4, v1, Ln0/u;->a:Ln0/a;

    iget v5, v4, Ln0/a;->a:I

    iget-boolean v7, v4, Ln0/a;->c:Z

    const/4 v11, -0x1

    if-eq v5, v11, :cond_15

    move-object v12, v2

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_15

    invoke-static {v0, v7}, Ln0/a;->a(Ln0/n;Z)I

    move-result v7

    if-eq v5, v7, :cond_15

    iput v11, v4, Ln0/a;->a:I

    iget-object v5, v4, Ln0/a;->b:Lp0/j0;

    if-eqz v5, :cond_14

    invoke-interface {v5}, Lp0/j0;->cancel()V

    :cond_14
    iput-object v8, v4, Ln0/a;->b:Lp0/j0;

    :cond_15
    iget v5, v4, Ln0/a;->d:I

    if-eq v5, v11, :cond_18

    iget v7, v4, Ln0/a;->e:F

    cmpg-float v7, v7, v9

    if-nez v7, :cond_16

    goto :goto_d

    :cond_16
    if-eq v5, v3, :cond_18

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_18

    iget v2, v4, Ln0/a;->e:F

    cmpg-float v2, v2, v9

    if-gez v2, :cond_17

    goto :goto_c

    :cond_17
    const/4 v10, 0x0

    :goto_c
    invoke-static {v0, v10}, Ln0/a;->a(Ln0/n;Z)I

    move-result v2

    if-ltz v2, :cond_18

    if-ge v2, v3, :cond_18

    iput v2, v4, Ln0/a;->a:I

    iget-object v5, v1, Ln0/u;->q:Lad3/z;

    invoke-static {v5, v2}, Lad3/z;->x(Lad3/z;I)Lp0/j0;

    move-result-object v2

    iput-object v2, v4, Ln0/a;->b:Lp0/j0;

    :cond_18
    :goto_d
    iput v3, v4, Ln0/a;->d:I

    :cond_19
    :goto_e
    if-eqz p2, :cond_1a

    iget v2, v0, Ln0/n;->f:F

    iget-object v3, v0, Ln0/n;->i:Ly3/c;

    iget-object v0, v0, Ln0/n;->h:Lbc3/c0;

    invoke-virtual {v6, v2, v3, v0}, Lp0/n0;->m(FLy3/c;Lbc3/c0;)V

    :cond_1a
    return-void
.end method

.method public final h()Ln0/n;
    .locals 1

    iget-object v0, p0, Ln0/u;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/n;

    return-object v0
.end method

.method public final i(FLn0/n;)V
    .locals 5

    iget-boolean v0, p0, Ln0/u;->j:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Ln0/u;->a:Ln0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p2, Ln0/n;->k:Ljava/lang/Object;

    iget-object v2, p2, Ln0/n;->k:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p2, v1}, Ln0/a;->a(Ln0/n;Z)I

    move-result v3

    if-ltz v3, :cond_5

    iget v4, p2, Ln0/n;->n:I

    if-ge v3, v4, :cond_5

    iget v4, v0, Ln0/a;->a:I

    if-eq v3, v4, :cond_3

    iget-boolean v4, v0, Ln0/a;->c:Z

    if-eq v4, v1, :cond_2

    const/4 v4, -0x1

    iput v4, v0, Ln0/a;->a:I

    iget-object v4, v0, Ln0/a;->b:Lp0/j0;

    if-eqz v4, :cond_1

    invoke-interface {v4}, Lp0/j0;->cancel()V

    :cond_1
    const/4 v4, 0x0

    iput-object v4, v0, Ln0/a;->b:Lp0/j0;

    :cond_2
    iput-boolean v1, v0, Ln0/a;->c:Z

    iput v3, v0, Ln0/a;->a:I

    iget-object v4, p0, Ln0/u;->q:Lad3/z;

    invoke-static {v4, v3}, Lad3/z;->x(Lad3/z;I)Lp0/j0;

    move-result-object v3

    iput-object v3, v0, Ln0/a;->b:Lp0/j0;

    :cond_3
    if-eqz v1, :cond_4

    invoke-static {v2}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/g;

    iget v2, p2, Ln0/n;->q:I

    check-cast v1, Ln0/o;

    invoke-virtual {v1}, Ln0/o;->n()I

    move-result v3

    invoke-virtual {v1}, Ln0/o;->o()I

    move-result v1

    add-int/2addr v1, v3

    add-int/2addr v1, v2

    iget p2, p2, Ln0/n;->m:I

    sub-int/2addr v1, p2

    int-to-float p2, v1

    neg-float v1, p1

    cmpg-float p2, p2, v1

    if-gez p2, :cond_5

    iget-object p2, v0, Ln0/a;->b:Lp0/j0;

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lp0/j0;->a()V

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/g;

    iget p2, p2, Ln0/n;->l:I

    check-cast v1, Ln0/o;

    invoke-virtual {v1}, Ln0/o;->n()I

    move-result v1

    sub-int/2addr p2, v1

    int-to-float p2, p2

    cmpg-float p2, p2, p1

    if-gez p2, :cond_5

    iget-object p2, v0, Ln0/a;->b:Lp0/j0;

    if-eqz p2, :cond_5

    invoke-interface {p2}, Lp0/j0;->a()V

    :cond_5
    :goto_1
    iput p1, v0, Ln0/a;->e:F

    :cond_6
    return-void
.end method

.method public final j(IILq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ll1/t0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ll1/t0;-><init>(Ln0/u;IILq83/d;)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0, p1, v0, p3}, Ln0/u;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final k(II)V
    .locals 4

    iget-object v0, p0, Ln0/u;->e:Ll2/a;

    iget-object v1, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, p1, :cond_0

    iget-object v1, v0, Ll2/a;->c:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    if-eq v1, p2, :cond_1

    :cond_0
    iget-object v1, p0, Ln0/u;->n:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/b;->e()V

    iput-object v2, v1, Landroidx/compose/foundation/lazy/layout/b;->b:Lab/h0;

    const/4 v3, -0x1

    iput v3, v1, Landroidx/compose/foundation/lazy/layout/b;->c:I

    :cond_1
    invoke-virtual {v0, p1, p2}, Ll2/a;->b(II)V

    iput-object v2, v0, Ll2/a;->d:Ljava/lang/Object;

    iget-object p1, p0, Ln0/u;->k:La3/n0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, La3/n0;->m()V

    :cond_2
    return-void
.end method
