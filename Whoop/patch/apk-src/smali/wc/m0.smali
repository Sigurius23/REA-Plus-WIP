.class public final Lwc/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public final E:Ljava/lang/Object;

.field public final w:Ljava/lang/String;

.field public final x:Lvg/n;

.field public final y:Lpf/a;

.field public final z:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpf/a;Lvg/n;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/m0;->w:Ljava/lang/String;

    iput-object p3, p0, Lwc/m0;->x:Lvg/n;

    iput-object p2, p0, Lwc/m0;->y:Lpf/a;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lwc/m0;->z:Ljava/util/LinkedHashSet;

    new-instance p1, Lwc/l;

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0x19

    const/4 v1, 0x1

    const-class v3, Lvg/n;

    const-string v4, "getenv"

    const-string v5, "getenv(Ljava/lang/String;)Ljava/lang/String;"

    move-object v2, p3

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {p1, v0}, Lwc/l;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p3, Ll83/k;

    const-string v0, "Environment"

    invoke-direct {p3, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lwc/s;

    new-instance v0, Lm83/p;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    invoke-direct {p1, v0, v2}, Lwc/s;-><init>(Ll83/p;Lvg/n;)V

    new-instance v0, Ll83/k;

    const-string v1, "Ec2InstanceMetadata"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lwc/i;

    invoke-direct {p1, v2, p2}, Lwc/i;-><init>(Lvg/n;Lpf/a;)V

    new-instance p2, Ll83/k;

    const-string v1, "EcsContainer"

    invoke-direct {p2, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3, v0, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lwc/m0;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lwc/j0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lwc/j0;

    iget v3, v2, Lwc/j0;->M:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwc/j0;->M:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lwc/j0;

    invoke-direct {v2, v1, v0}, Lwc/j0;-><init>(Lwc/m0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lwc/j0;->K:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lwc/j0;->M:I

    const/4 v8, 0x0

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    iget-object v13, v1, Lwc/m0;->z:Ljava/util/LinkedHashSet;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v3, :cond_5

    if-eq v2, v12, :cond_4

    if-eq v2, v11, :cond_3

    if-eq v2, v10, :cond_2

    if-ne v2, v9, :cond_1

    iget v2, v6, Lwc/j0;->I:I

    iget-object v3, v6, Lwc/j0;->H:Lkotlin/jvm/internal/g0;

    iget-object v5, v6, Lwc/j0;->G:Ljava/util/Iterator;

    iget-object v11, v6, Lwc/j0;->F:Lkotlin/jvm/internal/g0;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v6, Lwc/j0;->E:Lkotlin/jvm/internal/g0;

    iget-object v12, v6, Lwc/j0;->z:Ls/m2;

    iget-object v14, v6, Lwc/j0;->x:Log/g;

    iget-object v15, v6, Lwc/j0;->w:Lgf/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v4

    move v4, v2

    move-object v2, v8

    move v8, v9

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v2, v6, Lwc/j0;->J:I

    iget v3, v6, Lwc/j0;->I:I

    iget-object v5, v6, Lwc/j0;->G:Ljava/util/Iterator;

    iget-object v11, v6, Lwc/j0;->F:Lkotlin/jvm/internal/g0;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v6, Lwc/j0;->E:Lkotlin/jvm/internal/g0;

    iget-object v12, v6, Lwc/j0;->z:Ls/m2;

    iget-object v14, v6, Lwc/j0;->x:Log/g;

    iget-object v15, v6, Lwc/j0;->w:Lgf/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move v4, v2

    move-object/from16 v2, v16

    goto/16 :goto_7

    :cond_3
    iget-object v2, v6, Lwc/j0;->F:Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Lwc/j0;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, v6, Lwc/j0;->z:Ls/m2;

    iget-object v11, v6, Lwc/j0;->y:Lwd/l;

    iget-object v12, v6, Lwc/j0;->x:Log/g;

    iget-object v14, v6, Lwc/j0;->w:Lgf/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v4, v16

    goto/16 :goto_5

    :cond_4
    iget-object v2, v6, Lwc/j0;->z:Ls/m2;

    iget-object v3, v6, Lwc/j0;->y:Lwd/l;

    iget-object v5, v6, Lwc/j0;->x:Log/g;

    iget-object v12, v6, Lwc/j0;->w:Lgf/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v3

    move-object v14, v12

    move-object v12, v5

    move-object v5, v2

    move-object v2, v4

    goto/16 :goto_4

    :cond_5
    iget-object v2, v6, Lwc/j0;->x:Log/g;

    iget-object v3, v6, Lwc/j0;->w:Lgf/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_2
    move-object v14, v2

    goto :goto_3

    :cond_6
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v6}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    const-class v2, Lwc/m0;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-static {v0, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v2

    move-object/from16 v0, p1

    iput-object v0, v6, Lwc/j0;->w:Lgf/b;

    iput-object v2, v6, Lwc/j0;->x:Log/g;

    iput v3, v6, Lwc/j0;->M:I

    iget-object v3, v1, Lwc/m0;->x:Lvg/n;

    invoke-static {v3, v6}, Lx30/s0;->v(Lvg/n;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_7

    goto/16 :goto_9

    :cond_7
    move-object v14, v3

    move-object v3, v0

    move-object v0, v14

    goto :goto_2

    :goto_3
    check-cast v0, Lce/j;

    new-instance v2, Lvv1/c;

    const/16 v5, 0x8

    invoke-direct {v2, v0, v5}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v14, v2}, Log/g;->m(Log/g;Lc93/a;)V

    invoke-static {v0}, Ls2/d;->r(Lce/j;)Lwd/l;

    move-result-object v15

    new-instance v0, La00/f;

    const/4 v5, 0x7

    move-object v2, v4

    invoke-direct/range {v0 .. v5}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    new-instance v4, Ls/m2;

    invoke-direct {v4, v0}, Ls/m2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v15}, Lwd/l;->a()Lrv/n;

    move-result-object v0

    iput-object v3, v6, Lwc/j0;->w:Lgf/b;

    iput-object v14, v6, Lwc/j0;->x:Log/g;

    iput-object v15, v6, Lwc/j0;->y:Lwd/l;

    iput-object v4, v6, Lwc/j0;->z:Ls/m2;

    iput v12, v6, Lwc/j0;->M:I

    invoke-virtual {v1, v0, v4, v6}, Lwc/m0;->h(Lrv/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_8

    goto/16 :goto_9

    :cond_8
    move-object v5, v4

    move-object v12, v14

    move-object v14, v3

    :goto_4
    check-cast v0, Lve/f;

    new-instance v3, Lui0/q;

    const/16 v4, 0x18

    invoke-direct {v3, v4, v1, v15}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v12, v3}, Log/g;->m(Log/g;Lc93/a;)V

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v14, v6, Lwc/j0;->w:Lgf/b;

    iput-object v12, v6, Lwc/j0;->x:Log/g;

    iput-object v15, v6, Lwc/j0;->y:Lwd/l;

    iput-object v5, v6, Lwc/j0;->z:Ls/m2;

    iput-object v3, v6, Lwc/j0;->E:Lkotlin/jvm/internal/g0;

    iput-object v3, v6, Lwc/j0;->F:Lkotlin/jvm/internal/g0;

    iput v11, v6, Lwc/j0;->M:I

    invoke-interface {v0, v14, v6}, Lxf/c;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_9

    goto/16 :goto_9

    :cond_9
    move-object v4, v3

    move-object v11, v15

    :goto_5
    iput-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v11}, Lwd/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v8

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lwd/m;

    new-instance v15, Lvv1/c;

    const/16 v9, 0x9

    invoke-direct {v15, v11, v9}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v12, v15}, Log/g;->m(Log/g;Lc93/a;)V

    invoke-virtual {v11}, Lwd/m;->d()Lwd/n;

    move-result-object v9

    sget-object v15, Lwd/n;->w:Lwd/n;

    if-ne v9, v15, :cond_a

    sget-object v9, Lie/a;->I:Lie/a;

    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_a
    iget-object v9, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lve/e;

    iput-object v14, v6, Lwc/j0;->w:Lgf/b;

    iput-object v12, v6, Lwc/j0;->x:Log/g;

    iput-object v2, v6, Lwc/j0;->y:Lwd/l;

    iput-object v5, v6, Lwc/j0;->z:Ls/m2;

    iput-object v4, v6, Lwc/j0;->E:Lkotlin/jvm/internal/g0;

    iput-object v2, v6, Lwc/j0;->F:Lkotlin/jvm/internal/g0;

    iput-object v0, v6, Lwc/j0;->G:Ljava/util/Iterator;

    iput-object v2, v6, Lwc/j0;->H:Lkotlin/jvm/internal/g0;

    iput v3, v6, Lwc/j0;->I:I

    iput v8, v6, Lwc/j0;->J:I

    iput v10, v6, Lwc/j0;->M:I

    invoke-virtual {v1, v11, v9, v5, v6}, Lwc/m0;->i(Lwd/m;Lve/e;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_b

    goto :goto_9

    :cond_b
    move-object v11, v4

    move v4, v8

    move-object v15, v14

    move-object v14, v12

    move-object v12, v5

    move-object v5, v0

    move-object v0, v9

    :goto_7
    check-cast v0, Lve/f;

    iget-object v9, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lve/e;

    invoke-virtual {v9}, Lve/e;->getAttributes()Lgf/b;

    move-result-object v9

    invoke-static {}, Lbf/b;->d()Lgf/a;

    move-result-object v8

    invoke-interface {v9, v8}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Set;

    if-eqz v8, :cond_c

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lbf/a;

    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_c
    iput-object v15, v6, Lwc/j0;->w:Lgf/b;

    iput-object v14, v6, Lwc/j0;->x:Log/g;

    iput-object v2, v6, Lwc/j0;->y:Lwd/l;

    iput-object v12, v6, Lwc/j0;->z:Ls/m2;

    iput-object v11, v6, Lwc/j0;->E:Lkotlin/jvm/internal/g0;

    iput-object v2, v6, Lwc/j0;->F:Lkotlin/jvm/internal/g0;

    iput-object v5, v6, Lwc/j0;->G:Ljava/util/Iterator;

    iput-object v11, v6, Lwc/j0;->H:Lkotlin/jvm/internal/g0;

    iput v3, v6, Lwc/j0;->I:I

    iput v4, v6, Lwc/j0;->J:I

    const/4 v8, 0x5

    iput v8, v6, Lwc/j0;->M:I

    invoke-interface {v0, v15, v6}, Lxf/c;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_d

    :goto_9
    return-object v7

    :cond_d
    move v4, v3

    move-object v3, v11

    :goto_a
    iput-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move v3, v4

    move-object v0, v5

    move v9, v8

    move-object v4, v11

    move-object v5, v12

    move-object v12, v14

    move-object v14, v15

    const/4 v8, 0x0

    goto/16 :goto_6

    :cond_e
    new-instance v0, Lle3/c;

    const/4 v2, 0x2

    invoke-direct {v0, v4, v2}, Lle3/c;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v12, v0}, Log/g;->m(Log/g;Lc93/a;)V

    iget-object v0, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lve/e;

    invoke-static {v0, v13}, Ldc/a;->S(Lve/e;Ljava/util/LinkedHashSet;)Lve/e;

    move-result-object v0

    return-object v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lwc/m0;->E:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lyf/j;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(Lrv/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lwc/k0;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lwc/k0;

    iget v5, v4, Lwc/k0;->F:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lwc/k0;->F:I

    goto :goto_0

    :cond_0
    new-instance v4, Lwc/k0;

    invoke-direct {v4, v0, v3}, Lwc/k0;-><init>(Lwc/m0;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lwc/k0;->z:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lwc/k0;->F:I

    iget-object v13, v0, Lwc/m0;->y:Lpf/a;

    iget-object v14, v0, Lwc/m0;->x:Lvg/n;

    const/4 v7, 0x1

    const/4 v8, 0x2

    iget-object v15, v0, Lwc/m0;->z:Ljava/util/LinkedHashSet;

    if-eqz v6, :cond_3

    if-eq v6, v7, :cond_2

    if-ne v6, v8, :cond_1

    iget-object v1, v4, Lwc/k0;->x:Ljava/lang/String;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v3

    move-object v3, v15

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lwc/k0;->y:Ljava/lang/String;

    iget-object v2, v4, Lwc/k0;->x:Ljava/lang/String;

    iget-object v4, v4, Lwc/k0;->w:Lwd/g;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v1

    move-object v8, v2

    move-object v1, v4

    goto :goto_1

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lwd/d;

    if-eqz v3, :cond_5

    check-cast v1, Lwd/d;

    invoke-virtual {v1}, Lwd/d;->m()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lwc/m0;->E:Ljava/lang/Object;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lve/f;

    sget-object v3, Lie/a;->J:Lie/a;

    invoke-interface {v15, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    new-instance v2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "unknown credentials source: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lwd/d;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    instance-of v3, v1, Lwd/a;

    if-eqz v3, :cond_6

    new-instance v2, Lwc/a1;

    check-cast v1, Lwd/a;

    invoke-virtual {v1}, Lwd/a;->m()Lve/e;

    move-result-object v1

    invoke-direct {v2, v1}, Lwc/a1;-><init>(Lve/e;)V

    sget-object v1, Lie/a;->H:Lie/a;

    invoke-interface {v15, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v2

    :cond_6
    instance-of v3, v1, Lwd/g;

    if-eqz v3, :cond_8

    move-object v3, v1

    check-cast v3, Lwd/g;

    invoke-virtual {v3}, Lwd/g;->m()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lwd/g;->o()Ljava/lang/String;

    move-result-object v8

    iput-object v3, v4, Lwc/k0;->w:Lwd/g;

    iput-object v6, v4, Lwc/k0;->x:Ljava/lang/String;

    iput-object v8, v4, Lwc/k0;->y:Ljava/lang/String;

    iput v7, v4, Lwc/k0;->F:I

    invoke-virtual {v2, v4}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_7

    goto/16 :goto_2

    :cond_7
    move-object v9, v8

    move-object v8, v6

    :goto_1
    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    check-cast v1, Lwd/g;

    invoke-virtual {v1}, Lwd/g;->n()Ljava/lang/String;

    move-result-object v11

    new-instance v7, Lwc/h1;

    move-object v12, v14

    invoke-direct/range {v7 .. v13}, Lwc/h1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvg/n;Lpf/a;)V

    sget-object v1, Lie/a;->K:Lie/a;

    invoke-interface {v15, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v7

    :cond_8
    instance-of v3, v1, Lwd/f;

    if-eqz v3, :cond_9

    new-instance v7, Lwc/p0;

    check-cast v1, Lwd/f;

    invoke-virtual {v1}, Lwd/f;->m()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lwd/f;->o()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lwd/f;->q()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lwd/f;->n()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lwd/f;->p()Ljava/lang/String;

    move-result-object v12

    move-object v1, v15

    const/16 v15, 0x80

    move-object v3, v1

    invoke-direct/range {v7 .. v15}, Lwc/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;Lvg/n;I)V

    sget-object v1, Lie/a;->L:Lie/a;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v7

    :cond_9
    move-object v3, v15

    instance-of v6, v1, Lwd/b;

    if-eqz v6, :cond_a

    new-instance v7, Lwc/p0;

    check-cast v1, Lwd/b;

    invoke-virtual {v1}, Lwd/b;->m()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lwd/b;->o()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lwd/b;->p()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lwd/b;->n()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/16 v15, 0x90

    invoke-direct/range {v7 .. v15}, Lwc/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;Lvg/n;I)V

    sget-object v1, Lie/a;->N:Lie/a;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v7

    :cond_a
    instance-of v6, v1, Lwd/c;

    if-eqz v6, :cond_c

    check-cast v1, Lwd/c;

    invoke-virtual {v1}, Lwd/c;->m()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    iput-object v6, v4, Lwc/k0;->w:Lwd/g;

    iput-object v1, v4, Lwc/k0;->x:Ljava/lang/String;

    iput v8, v4, Lwc/k0;->F:I

    invoke-virtual {v2, v4}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_b

    :goto_2
    return-object v5

    :cond_b
    :goto_3
    check-cast v2, Ljava/lang/String;

    new-instance v4, Lwc/w;

    invoke-direct {v4, v1, v2}, Lwc/w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lie/a;->T:Lie/a;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v4

    :cond_c
    instance-of v2, v1, Lwd/e;

    if-eqz v2, :cond_d

    new-instance v2, Lwc/i0;

    check-cast v1, Lwd/e;

    invoke-virtual {v1}, Lwd/e;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lwc/i0;-><init>(Ljava/lang/String;)V

    sget-object v1, Lie/a;->P:Lie/a;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v2

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final i(Lwd/m;Lve/e;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p4, Lwc/l0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lwc/l0;

    iget v1, v0, Lwc/l0;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/l0;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/l0;

    invoke-direct {v0, p0, p4}, Lwc/l0;-><init>(Lwc/m0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lwc/l0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/l0;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/l0;->y:Ljava/lang/String;

    iget-object p2, v0, Lwc/l0;->x:Lwc/a1;

    iget-object p3, v0, Lwc/l0;->w:Lwd/m;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, p1

    move-object v3, p2

    move-object p1, p3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Lwc/a1;

    invoke-direct {p4, p2}, Lwc/a1;-><init>(Lve/e;)V

    invoke-virtual {p1}, Lwd/m;->b()Ljava/lang/String;

    move-result-object p2

    iput-object p1, v0, Lwc/l0;->w:Lwd/m;

    iput-object p4, v0, Lwc/l0;->x:Lwc/a1;

    iput-object p2, v0, Lwc/l0;->y:Ljava/lang/String;

    iput v3, v0, Lwc/l0;->F:I

    invoke-virtual {p3, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, p2

    move-object v3, p4

    move-object p4, p3

    :goto_1
    move-object v5, p4

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1}, Lwd/m;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lwd/m;->a()Ljava/lang/String;

    move-result-object v7

    new-instance v2, Lwc/d1;

    iget-object v8, p0, Lwc/m0;->y:Lpf/a;

    invoke-direct/range {v2 .. v8}, Lwc/d1;-><init>(Lve/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;)V

    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
