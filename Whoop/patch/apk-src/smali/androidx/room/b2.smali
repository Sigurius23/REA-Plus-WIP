.class public final Landroidx/room/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Landroidx/room/b2;->w:I

    iput-object p1, p0, Landroidx/room/b2;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/b2;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/b2;->z:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/room/b2;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/g0;Lbc3/c0;Lfc3/k;Lec3/m;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/room/b2;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/b2;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/b2;->z:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/b2;->E:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/room/b2;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Lec3/l;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lfc3/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfc3/e;

    iget v1, v0, Lfc3/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfc3/e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfc3/e;

    invoke-direct {v0, p0, p2}, Lfc3/e;-><init>(Landroidx/room/b2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfc3/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfc3/e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfc3/e;->x:Lec3/l;

    iget-object v0, v0, Lfc3/e;->w:Landroidx/room/b2;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    move-object v3, p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/room/b2;->x:Ljava/lang/Object;

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_4

    invoke-interface {p2}, Lbc3/k1;->isActive()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p2}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_2
    iget-object p2, p0, Landroidx/room/b2;->y:Ljava/lang/Object;

    check-cast p2, Lmc3/i;

    iput-object p0, v0, Lfc3/e;->w:Landroidx/room/b2;

    iput-object p1, v0, Lfc3/e;->x:Lec3/l;

    iput v3, v0, Lfc3/e;->E:I

    invoke-virtual {p2, v0}, Lmc3/h;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, p0

    goto :goto_1

    :goto_3
    iget-object p1, v0, Landroidx/room/b2;->z:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v2, La1/h;

    iget-object p2, v0, Landroidx/room/b2;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lfc3/w;

    iget-object p2, v0, Landroidx/room/b2;->y:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lmc3/i;

    const/16 v7, 0x19

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v6, v6, v2, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c([ILq83/d;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Landroidx/room/b2;->z:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    iget-object v1, p0, Landroidx/room/b2;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, p0, Landroidx/room/b2;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    instance-of v3, p2, Landroidx/room/a2;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Landroidx/room/a2;

    iget v4, v3, Landroidx/room/a2;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Landroidx/room/a2;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Landroidx/room/a2;

    invoke-direct {v3, p0, p2}, Landroidx/room/a2;-><init>(Landroidx/room/b2;Lq83/d;)V

    :goto_0
    iget-object p2, v3, Landroidx/room/a2;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Landroidx/room/a2;->z:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v3, Landroidx/room/a2;->w:[I

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p2, :cond_4

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    iput-object p1, v3, Landroidx/room/a2;->w:[I

    iput v7, v3, Landroidx/room/a2;->z:I

    invoke-interface {v1, p2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_8

    goto :goto_3

    :cond_4
    iget-object p2, p0, Landroidx/room/b2;->E:Ljava/lang/Object;

    check-cast p2, [I

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v0

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    if-ge v8, v7, :cond_7

    aget-object v10, v0, v8

    add-int/lit8 v11, v9, 0x1

    iget-object v12, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v12, :cond_6

    check-cast v12, [I

    aget v9, p2, v9

    aget v12, v12, v9

    aget v9, p1, v9

    if-eq v12, v9, :cond_5

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v8, v8, 0x1

    move v9, v11

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8

    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    iput-object p1, v3, Landroidx/room/a2;->w:[I

    iput v6, v3, Landroidx/room/a2;->z:I

    invoke-interface {v1, p2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_8

    :goto_3
    return-object v4

    :cond_8
    :goto_4
    iput-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Landroidx/room/b2;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lfc3/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfc3/j;

    iget v1, v0, Lfc3/j;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfc3/j;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfc3/j;

    invoke-direct {v0, p0, p2}, Lfc3/j;-><init>(Landroidx/room/b2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfc3/j;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfc3/j;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfc3/j;->x:Ljava/lang/Object;

    iget-object v0, v0, Lfc3/j;->w:Landroidx/room/b2;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/room/b2;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_3

    new-instance v2, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    invoke-direct {v2}, Lkotlinx/coroutines/flow/internal/ChildCancelledException;-><init>()V

    invoke-interface {p2, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, Lfc3/j;->w:Landroidx/room/b2;

    iput-object p1, v0, Lfc3/j;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfc3/j;->y:Lbc3/k1;

    iput v3, v0, Lfc3/j;->F:I

    invoke-interface {p2, v0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Landroidx/room/b2;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object v1, v0, Landroidx/room/b2;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v4, Lfc3/i;

    iget-object v5, v0, Landroidx/room/b2;->E:Ljava/lang/Object;

    check-cast v5, Lfc3/k;

    iget-object v0, v0, Landroidx/room/b2;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v0, p1, v6}, Lfc3/i;-><init>(Lfc3/k;Lec3/m;Ljava/lang/Object;Lq83/d;)V

    invoke-static {v1, v6, v2, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v1

    :pswitch_0
    check-cast p1, Lec3/l;

    invoke-virtual {p0, p1, p2}, Landroidx/room/b2;->b(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lj0/h;

    iget-object p2, p0, Landroidx/room/b2;->z:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/e0;

    iget-object v0, p0, Landroidx/room/b2;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    iget-object v1, p0, Landroidx/room/b2;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/e0;

    instance-of v2, p1, Lj0/l;

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    iget p1, v1, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p1, v3

    iput p1, v1, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_3

    :cond_4
    instance-of v2, p1, Lj0/m;

    if-eqz v2, :cond_5

    iget p1, v1, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v1, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_3

    :cond_5
    instance-of v2, p1, Lj0/k;

    if-eqz v2, :cond_6

    iget p1, v1, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v1, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_3

    :cond_6
    instance-of v2, p1, Lj0/f;

    if-eqz v2, :cond_7

    iget p1, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p1, v3

    iput p1, v0, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_3

    :cond_7
    instance-of v2, p1, Lj0/g;

    if-eqz v2, :cond_8

    iget p1, v0, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v0, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_3

    :cond_8
    instance-of v2, p1, Lj0/d;

    if-eqz v2, :cond_9

    iget p1, p2, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p1, v3

    iput p1, p2, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_3

    :cond_9
    instance-of p1, p1, Lj0/e;

    if-eqz p1, :cond_a

    iget p1, p2, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p2, Lkotlin/jvm/internal/e0;->w:I

    :cond_a
    :goto_3
    iget p1, v1, Lkotlin/jvm/internal/e0;->w:I

    const/4 v1, 0x0

    if-lez p1, :cond_b

    move p1, v3

    goto :goto_4

    :cond_b
    move p1, v1

    :goto_4
    iget v0, v0, Lkotlin/jvm/internal/e0;->w:I

    if-lez v0, :cond_c

    move v0, v3

    goto :goto_5

    :cond_c
    move v0, v1

    :goto_5
    iget p2, p2, Lkotlin/jvm/internal/e0;->w:I

    if-lez p2, :cond_d

    move p2, v3

    goto :goto_6

    :cond_d
    move p2, v1

    :goto_6
    iget-object v2, p0, Landroidx/room/b2;->E:Ljava/lang/Object;

    check-cast v2, Lf0/d0;

    iget-boolean v4, v2, Lf0/d0;->P:Z

    if-eq v4, p1, :cond_e

    iput-boolean p1, v2, Lf0/d0;->P:Z

    move v1, v3

    :cond_e
    iget-boolean p1, v2, Lf0/d0;->Q:Z

    if-eq p1, v0, :cond_f

    iput-boolean v0, v2, Lf0/d0;->Q:Z

    move v1, v3

    :cond_f
    iget-boolean p1, v2, Lf0/d0;->R:Z

    if-eq p1, p2, :cond_10

    iput-boolean p2, v2, Lf0/d0;->R:Z

    goto :goto_7

    :cond_10
    move v3, v1

    :goto_7
    if-eqz v3, :cond_11

    invoke-static {v2}, La3/g;->h(La3/r;)V

    :cond_11
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, [I

    invoke-virtual {p0, p1, p2}, Landroidx/room/b2;->c([ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
