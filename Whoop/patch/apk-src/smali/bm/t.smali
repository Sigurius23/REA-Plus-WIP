.class public final Lbm/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/x2;


# static fields
.field public static final h:Lp0/n0;


# instance fields
.field public final a:Ln0/u;

.field public final b:Lp1/k1;

.field public final c:Lp1/k1;

.field public final d:Lp1/f0;

.field public final e:Lp1/f0;

.field public final f:Lp1/k1;

.field public final g:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lbm/o;->w:Lbm/o;

    sget-object v1, Lbm/p;->w:Lbm/p;

    invoke-static {v0, v1}, Ly1/k;->b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;

    move-result-object v0

    sput-object v0, Lbm/t;->h:Lp0/n0;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln0/u;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Ln0/u;-><init>(III)V

    iput-object v0, p0, Lbm/t;->a:Ln0/u;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lbm/t;->b:Lp1/k1;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lbm/t;->c:Lp1/k1;

    new-instance p1, Lbm/r;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lbm/r;-><init>(Lbm/t;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lbm/t;->d:Lp1/f0;

    new-instance p1, Lbm/r;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lbm/r;-><init>(Lbm/t;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lbm/t;->e:Lp1/f0;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lbm/t;->f:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lbm/t;->g:Lp1/k1;

    return-void
.end method

.method public static n(I)V
    .locals 2

    if-ltz p0, :cond_0

    return-void

    :cond_0
    const-string v0, "page["

    const-string v1, "] must be >= 0"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    invoke-virtual {v0, p1, p2, p3}, Ln0/u;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    iget-object v0, v0, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    iget-object v0, v0, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v0, p1}, Lh0/d0;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(ILs83/c;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    instance-of v1, p2, Lbm/q;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lbm/q;

    iget v2, v1, Lbm/q;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lbm/q;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lbm/q;

    invoke-direct {v1, p0, p2}, Lbm/q;-><init>(Lbm/t;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lbm/q;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lbm/q;->F:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v1, Lbm/q;->w:Lbm/t;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_a

    :catchall_0
    move-exception p2

    goto/16 :goto_c

    :pswitch_1
    iget p1, v1, Lbm/q;->y:I

    iget v0, v1, Lbm/q;->x:I

    iget-object v3, v1, Lbm/q;->w:Lbm/t;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v9, v3

    move v3, p1

    move-object p1, v9

    goto/16 :goto_7

    :catchall_1
    move-exception p2

    move-object p1, v3

    goto/16 :goto_c

    :pswitch_2
    iget p1, v1, Lbm/q;->x:I

    iget-object v0, v1, Lbm/q;->w:Lbm/t;

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v9, v0

    move v0, p1

    move-object p1, v9

    goto/16 :goto_5

    :catchall_2
    move-exception p2

    move-object p1, v0

    goto/16 :goto_c

    :pswitch_3
    iget p1, v1, Lbm/q;->x:I

    iget-object v0, v1, Lbm/q;->w:Lbm/t;

    :try_start_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :pswitch_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lbm/t;->n(I)V

    :try_start_4
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-virtual {p0, p2}, Lbm/t;->p(Ljava/lang/Integer;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    iget-object p2, v0, Ln0/u;->e:Ll2/a;

    iget-object p2, p2, Ll2/a;->b:Ljava/lang/Object;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    sub-int v3, p1, p2

    :try_start_7
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-le v3, v7, :cond_3

    if-le p1, p2, :cond_1

    add-int/lit8 p2, p1, -0x3

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p1, 0x3

    :goto_1
    iput-object p0, v1, Lbm/q;->w:Lbm/t;

    iput p1, v1, Lbm/q;->x:I

    iput v4, v1, Lbm/q;->F:I

    invoke-virtual {v0, p2, v5, v1}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-ne p2, v2, :cond_2

    goto/16 :goto_9

    :cond_2
    move-object v0, p0

    :goto_2
    move p2, p1

    move-object p1, v0

    goto :goto_4

    :catchall_3
    move-exception p2

    :goto_3
    move-object p1, p0

    goto/16 :goto_c

    :cond_3
    move p2, p1

    move-object p1, p0

    :goto_4
    :try_start_8
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v3, 0x3ba3d70a    # 0.005f

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_4

    iget-object v0, p1, Lbm/t;->a:Ln0/u;

    iput-object p1, v1, Lbm/q;->w:Lbm/t;

    const/4 v3, 0x2

    iput v3, v1, Lbm/q;->F:I

    sget-object v3, Ln0/u;->x:Lp0/n0;

    invoke-virtual {v0, p2, v5, v1}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_c

    goto/16 :goto_9

    :cond_4
    iget-object v0, p1, Lbm/t;->a:Ln0/u;

    new-instance v3, Lb3/z0;

    invoke-direct {v3, v4}, Lb3/z0;-><init>(I)V

    iput-object p1, v1, Lbm/q;->w:Lbm/t;

    iput p2, v1, Lbm/q;->x:I

    iput v7, v1, Lbm/q;->F:I

    sget-object v4, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {v0, v4, v3, v1}, Ln0/u;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    goto/16 :goto_9

    :cond_5
    move v0, p2

    :goto_5
    iget-object p2, p1, Lbm/t;->a:Ln0/u;

    invoke-virtual {p2}, Ln0/u;->h()Ln0/n;

    move-result-object v3

    iget-object v4, v3, Ln0/n;->k:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ln0/g;

    check-cast v7, Ln0/o;

    invoke-virtual {v7}, Ln0/o;->getIndex()I

    move-result v7

    if-ne v7, v0, :cond_6

    goto :goto_6

    :cond_7
    move-object v5, v8

    :goto_6
    check-cast v5, Ln0/g;

    if-eqz v5, :cond_8

    check-cast v5, Ln0/o;

    invoke-virtual {v5}, Ln0/o;->o()I

    move-result v3

    invoke-virtual {p1}, Lbm/t;->i()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    mul-float/2addr v3, v6

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    iput-object p1, v1, Lbm/q;->w:Lbm/t;

    const/4 v4, 0x4

    iput v4, v1, Lbm/q;->F:I

    invoke-virtual {p2, v0, v3, v1}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_c

    goto/16 :goto_9

    :cond_8
    iget-object v4, v3, Ln0/n;->k:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    iget-object v3, v3, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/g;

    check-cast v3, Ln0/o;

    invoke-virtual {v3}, Ln0/o;->o()I

    move-result v3

    invoke-virtual {p1}, Lbm/t;->i()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v4, v3

    mul-float/2addr v4, v6

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    iput-object p1, v1, Lbm/q;->w:Lbm/t;

    iput v0, v1, Lbm/q;->x:I

    iput v3, v1, Lbm/q;->y:I

    const/4 v5, 0x5

    iput v5, v1, Lbm/q;->F:I

    invoke-virtual {p2, v0, v4, v1}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_9

    goto :goto_9

    :cond_9
    :goto_7
    iget-object p2, p1, Lbm/t;->a:Ln0/u;

    invoke-virtual {p2}, Ln0/u;->h()Ln0/n;

    move-result-object p2

    iget-object p2, p2, Ln0/n;->k:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ln0/g;

    check-cast v5, Ln0/o;

    invoke-virtual {v5}, Ln0/o;->getIndex()I

    move-result v5

    if-ne v5, v0, :cond_a

    goto :goto_8

    :cond_b
    move-object v4, v8

    :goto_8
    check-cast v4, Ln0/g;

    if-eqz v4, :cond_c

    check-cast v4, Ln0/o;

    invoke-virtual {v4}, Ln0/o;->o()I

    move-result p2

    invoke-virtual {p1}, Lbm/t;->i()I

    move-result v5

    add-int/2addr p2, v5

    if-eq p2, v3, :cond_c

    iget-object p2, p1, Lbm/t;->a:Ln0/u;

    invoke-virtual {v4}, Ln0/o;->o()I

    move-result v3

    invoke-virtual {p1}, Lbm/t;->i()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    mul-float/2addr v3, v6

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    iput-object p1, v1, Lbm/q;->w:Lbm/t;

    const/4 v4, 0x6

    iput v4, v1, Lbm/q;->F:I

    invoke-virtual {p2, v0, v3, v1}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-ne p2, v2, :cond_c

    :goto_9
    return-object v2

    :cond_c
    :goto_a
    invoke-virtual {p1, v8}, Lbm/t;->p(Ljava/lang/Integer;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_b
    move-object p2, p1

    goto/16 :goto_3

    :catchall_4
    move-exception p1

    goto :goto_b

    :catchall_5
    move-exception p1

    goto :goto_b

    :goto_c
    invoke-virtual {p1, v8}, Lbm/t;->p(Ljava/lang/Integer;)V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Ln0/g;
    .locals 4

    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ln0/g;

    check-cast v2, Ln0/o;

    invoke-virtual {v2}, Ln0/o;->getIndex()I

    move-result v2

    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Ln0/g;

    return-object v1
.end method

.method public final h()F
    .locals 1

    iget-object v0, p0, Lbm/t;->e:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lbm/t;->c:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final j()Ln0/g;
    .locals 9

    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v1, v0, Ln0/n;->k:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    move-object v0, v2

    goto :goto_1

    :cond_1
    move-object v3, v2

    check-cast v3, Ln0/g;

    check-cast v3, Ln0/o;

    invoke-virtual {v3}, Ln0/o;->n()I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v3}, Ln0/o;->n()I

    move-result v6

    invoke-virtual {v3}, Ln0/o;->o()I

    move-result v3

    add-int/2addr v3, v6

    iget v6, v0, Ln0/n;->p:I

    iget v0, v0, Ln0/n;->m:I

    sub-int/2addr v0, v6

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, v4

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ln0/g;

    check-cast v6, Ln0/o;

    invoke-virtual {v6}, Ln0/o;->n()I

    move-result v7

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v6}, Ln0/o;->n()I

    move-result v8

    invoke-virtual {v6}, Ln0/o;->o()I

    move-result v6

    add-int/2addr v6, v8

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v6, v7

    if-ge v3, v6, :cond_3

    move-object v2, v4

    move v3, v6

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :goto_1
    check-cast v0, Ln0/g;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Lbm/t;->d:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final l()I
    .locals 2

    iget-object v0, p0, Lbm/t;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lbm/t;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_2
    iget-object v0, p0, Lbm/t;->a:Ln0/u;

    iget-object v0, v0, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v0

    return v0

    :cond_3
    invoke-virtual {p0}, Lbm/t;->h()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3a83126f    # 0.001f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v0

    return v0

    :cond_4
    invoke-virtual {p0}, Lbm/t;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_5

    const/4 v0, 0x0

    :cond_5
    return v0

    :cond_6
    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lbm/t;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_7

    return v1

    :cond_7
    return v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lbm/t;->b:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final o(ILs83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lbm/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbm/s;

    iget v1, v0, Lbm/s;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbm/s;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbm/s;

    invoke-direct {v0, p0, p2}, Lbm/s;-><init>(Lbm/t;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lbm/s;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbm/s;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lbm/s;->w:Lbm/t;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lbm/s;->w:Lbm/t;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lbm/t;->n(I)V

    :try_start_2
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p0, p2}, Lbm/t;->p(Ljava/lang/Integer;)V

    iget-object p2, p0, Lbm/t;->a:Ln0/u;

    iput-object p0, v0, Lbm/s;->w:Lbm/t;

    iput v4, v0, Lbm/s;->z:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    sget-object v2, Ln0/u;->x:Lp0/n0;

    const/4 v2, 0x0

    invoke-virtual {p2, p1, v2, v0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    :goto_1
    :try_start_5
    invoke-virtual {p1}, Lbm/t;->j()Ln0/g;

    move-result-object p2

    if-eqz p2, :cond_5

    check-cast p2, Ln0/o;

    invoke-virtual {p2}, Ln0/o;->getIndex()I

    move-result p2

    invoke-virtual {p1}, Lbm/t;->m()I

    move-result v2

    if-eq p2, v2, :cond_5

    iget-object v2, p1, Lbm/t;->b:Lp1/k1;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_5
    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    const v2, 0x38d1b717    # 1.0E-4f

    cmpl-float p2, p2, v2

    if-lez p2, :cond_6

    invoke-virtual {p1}, Lbm/t;->g()Ln0/g;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v2, Lay/u;

    invoke-direct {v2, p2, p1, v5, v4}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lbm/s;->w:Lbm/t;

    iput v3, v0, Lbm/s;->z:I

    sget-object p2, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p1, p2, v2, v0}, Lbm/t;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-ne p2, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    invoke-virtual {p1, v5}, Lbm/t;->p(Ljava/lang/Integer;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception p1

    move-object p2, p1

    :goto_4
    move-object p1, p0

    goto :goto_5

    :catchall_2
    move-exception p2

    goto :goto_4

    :goto_5
    invoke-virtual {p1, v5}, Lbm/t;->p(Ljava/lang/Integer;)V

    throw p2
.end method

.method public final p(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lbm/t;->f:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PagerState(pageCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lbm/t;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentPage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbm/t;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentPageOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbm/t;->h()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
