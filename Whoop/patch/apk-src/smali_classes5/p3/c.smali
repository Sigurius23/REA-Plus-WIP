.class public final Lp3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public E:Z

.field public final w:Ljava/util/List;

.field public final x:Lp3/a0;

.field public final y:Lkotlin/jvm/functions/Function1;

.field public final z:Lp1/k1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/Object;Lp3/a0;La3/p;Lkotlin/jvm/functions/Function1;Laj/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/c;->w:Ljava/util/List;

    iput-object p3, p0, Lp3/c;->x:Lp3/a0;

    iput-object p5, p0, Lp3/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lp3/c;->z:Lp1/k1;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp3/c;->E:Z

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Lp3/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp3/b;

    iget v1, v0, Lp3/b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp3/b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp3/b;

    invoke-direct {v0, p0, p1}, Lp3/b;-><init>(Lp3/c;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lp3/b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp3/b;->G:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, Lp3/c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lp3/c;->z:Lp1/k1;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    const/4 v8, 0x2

    if-eq v2, v6, :cond_2

    if-ne v2, v8, :cond_1

    iget v1, v0, Lp3/b;->z:I

    iget v2, v0, Lp3/b;->y:I

    iget-object v8, v0, Lp3/b;->w:Ljava/util/List;

    check-cast v8, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lp3/b;->z:I

    iget v9, v0, Lp3/b;->y:I

    iget-object v10, v0, Lp3/b;->x:Lp3/x;

    iget-object v11, v0, Lp3/b;->w:Ljava/util/List;

    check-cast v11, Ljava/util/List;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    iget-object v1, p0, Lp3/c;->x:Lp3/a0;

    iget v2, v1, Lp3/a0;->d:I

    iget-object v6, v1, Lp3/a0;->b:Lp3/r;

    iget v1, v1, Lp3/a0;->c:I

    invoke-static {v2, p1, v10, v6, v1}, Lj93/l0;->d0(ILjava/lang/Object;Lp3/x;Lp3/r;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v5, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->x(Lq83/j;)Z

    move-result p1

    iput-boolean v7, p0, Lp3/c;->E:Z

    new-instance v0, Lp3/d0;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lp3/d0;-><init>(Ljava/lang/Object;Z)V

    :goto_1
    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :cond_3
    :try_start_2
    move-object p1, v11

    check-cast p1, Ljava/util/List;

    iput-object p1, v0, Lp3/b;->w:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, v0, Lp3/b;->x:Lp3/x;

    iput v9, v0, Lp3/b;->y:I

    iput v2, v0, Lp3/b;->z:I

    iput v8, v0, Lp3/b;->G:I

    invoke-static {v0}, Lbc3/f0;->L(Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move v1, v2

    move v2, v9

    move-object v8, v11

    goto :goto_3

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p1, p0, Lp3/c;->w:Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move-object v8, p1

    move v2, v7

    :goto_2
    if-ge v2, v1, :cond_6

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp3/x;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    add-int/2addr v2, v6

    goto :goto_2

    :cond_6
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->x(Lq83/j;)Z

    move-result p1

    iput-boolean v7, p0, Lp3/c;->E:Z

    new-instance v0, Lp3/d0;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lp3/d0;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1

    :goto_4
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v0

    iput-boolean v7, p0, Lp3/c;->E:Z

    new-instance v1, Lp3/d0;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lp3/d0;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp3/c;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
