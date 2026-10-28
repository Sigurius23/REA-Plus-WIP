.class public final Le7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb7/b;
.implements Lb7/c;


# instance fields
.field public final b:Lv7/b;

.field public final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lv7/b;)V
    .locals 7

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    sget-object v1, Lk7/b;->a:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android.permission.health.WRITE_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "android.permission.health.READ_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    const-string v1, "android.permission.health.WRITE_EXERCISE_ROUTE"

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    const-string v1, "allPermissions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/g;->b:Lv7/b;

    iput-object v0, p0, Le7/g;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lo7/b;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Le7/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/f;

    iget v1, v0, Le7/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/f;

    invoke-direct {v0, p0, p2}, Le7/f;-><init>(Le7/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/f;->y:I

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/k2;->u()Landroidx/health/platform/client/proto/j2;

    move-result-object p2

    iget-object v2, p1, Lo7/b;->a:Lj93/d;

    invoke-static {v2}, Le4/a;->S(Lj93/d;)Landroidx/health/platform/client/proto/w;

    move-result-object v2

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v5, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v5, Landroidx/health/platform/client/proto/k2;

    invoke-static {v5, v2}, Landroidx/health/platform/client/proto/k2;->q(Landroidx/health/platform/client/proto/k2;Landroidx/health/platform/client/proto/w;)V

    iget-object v2, p1, Lo7/b;->b:Lq7/a;

    invoke-static {}, Landroidx/health/platform/client/proto/c3;->r()Landroidx/health/platform/client/proto/b3;

    move-result-object v5

    iget-object v6, v2, Lq7/a;->a:Ljava/time/Instant;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v6

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v8, v5, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v8, Landroidx/health/platform/client/proto/c3;

    invoke-static {v8, v6, v7}, Landroidx/health/platform/client/proto/c3;->p(Landroidx/health/platform/client/proto/c3;J)V

    :cond_3
    iget-object v2, v2, Lq7/a;->b:Ljava/time/Instant;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v6

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v5, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/c3;

    invoke-static {v2, v6, v7}, Landroidx/health/platform/client/proto/c3;->q(Landroidx/health/platform/client/proto/c3;J)V

    :cond_4
    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/c3;

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v5, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v5, Landroidx/health/platform/client/proto/k2;

    invoke-static {v5, v2}, Landroidx/health/platform/client/proto/k2;->p(Landroidx/health/platform/client/proto/k2;Landroidx/health/platform/client/proto/c3;)V

    iget-object p1, p1, Lo7/b;->c:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln7/a;

    invoke-static {}, Landroidx/health/platform/client/proto/o;->s()Landroidx/health/platform/client/proto/n;

    move-result-object v6

    iget-object v5, v5, Ln7/a;->a:Ljava/lang/String;

    invoke-virtual {v6}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v7, v6, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v7, Landroidx/health/platform/client/proto/o;

    invoke-static {v7, v5}, Landroidx/health/platform/client/proto/o;->p(Landroidx/health/platform/client/proto/o;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/o;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object p1, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast p1, Landroidx/health/platform/client/proto/k2;

    invoke-static {p1, v2}, Landroidx/health/platform/client/proto/k2;->r(Landroidx/health/platform/client/proto/k2;Ljava/util/ArrayList;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object p1, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast p1, Landroidx/health/platform/client/proto/k2;

    invoke-static {p1}, Landroidx/health/platform/client/proto/k2;->s(Landroidx/health/platform/client/proto/k2;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object p1, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast p1, Landroidx/health/platform/client/proto/k2;

    invoke-static {p1}, Landroidx/health/platform/client/proto/k2;->t(Landroidx/health/platform/client/proto/k2;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/k2;

    iget-object p2, p0, Le7/g;->b:Lv7/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Le8/d;

    invoke-direct {v2, p1}, Le8/d;-><init>(Landroidx/health/platform/client/proto/k2;)V

    new-instance p1, Lqm2/c;

    const/4 v5, 0x7

    invoke-direct {p1, v5, p2, v2}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v4, p1}, Lv7/b;->a(ILz7/c;)Lds/w;

    move-result-object p1

    iput v4, v0, Le7/f;->y:I

    invoke-static {p1, v0}, Lbp/b;->g(Lds/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    check-cast p2, Landroidx/health/platform/client/proto/t2;

    const-string p1, "proto"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/t2;->p()Landroidx/health/platform/client/proto/w0;

    move-result-object p1

    const-string p2, "proto.dataPointList"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/u;

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lup/d;->T(Landroidx/health/platform/client/proto/u;)Lm7/r0;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Lp7/c;

    invoke-direct {p1, p2}, Lp7/c;-><init>(Ljava/util/ArrayList;)V

    const-string p2, "HealthConnectClient"

    const-string v0, "Retrieve records successful."

    invoke-static {p2, v0}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Le7/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/b;

    iget v1, v0, Le7/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/b;

    invoke-direct {v0, p0, p2}, Le7/b;-><init>(Le7/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le7/b;->w:Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/health/platform/client/proto/g2;->q()Landroidx/health/platform/client/proto/f2;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/g2;

    invoke-static {v2, p1}, Landroidx/health/platform/client/proto/g2;->p(Landroidx/health/platform/client/proto/g2;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p2

    check-cast p2, Landroidx/health/platform/client/proto/g2;

    iget-object v2, p0, Le7/g;->b:Lv7/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lqm2/c;

    const/16 v5, 0x8

    invoke-direct {v4, v5, v2, p2}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Lv7/b;->a(ILz7/c;)Lds/w;

    move-result-object p2

    iput-object p1, v0, Le7/b;->w:Ljava/lang/String;

    iput v3, v0, Le7/b;->z:I

    invoke-static {p2, v0}, Lbp/b;->g(Lds/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Landroidx/health/platform/client/proto/p2;

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/p2;->s()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Retrieved changes successful with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", next token "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HealthConnectClient"

    invoke-static {v0, p1}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lp7/a;

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/p2;->p()Landroidx/health/platform/client/proto/w0;

    move-result-object v0

    const-string v1, "proto.changesList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/j;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/j;->r()Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v3, Ld7/a;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/j;->p()Ljava/lang/String;

    move-result-object v2

    const-string v4, "it.deleteUid"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v2}, Ld7/a;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Landroidx/health/platform/client/proto/j;->s()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Ld7/b;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/j;->q()Landroidx/health/platform/client/proto/u;

    move-result-object v2

    const-string v4, "it.upsertDataPoint"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lup/d;->T(Landroidx/health/platform/client/proto/u;)Lm7/r0;

    move-result-object v2

    invoke-direct {v3, v2}, Ld7/b;-><init>(Lm7/r0;)V

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-virtual {p2}, Landroidx/health/platform/client/proto/p2;->s()Ljava/lang/String;

    move-result-object v0

    const-string v2, "proto.nextChangesToken"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/p2;->r()Z

    move-result v2

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/p2;->q()Z

    move-result p2

    invoke-direct {p1, v1, v0, v2, p2}, Lp7/a;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object p1
.end method

.method public final c(Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Le7/e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Le7/e;

    iget v3, v2, Le7/e;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le7/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Le7/e;

    invoke-direct {v2, v0, v1}, Le7/e;-><init>(Le7/g;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Le7/e;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Le7/e;->z:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Le7/e;->w:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_77

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm7/r0;

    const-string v8, "<this>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v9, v7, Lm7/b;

    const-string v10, "temperature"

    const-string v11, "measurementLocation"

    if-eqz v9, :cond_4

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BasalBodyTemperature"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/b;

    iget-object v9, v7, Lm7/b;->c:Lr7/k0;

    iget-wide v12, v9, Lr7/k0;->w:D

    invoke-static {v12, v13}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v7, v7, Lm7/b;->d:I

    sget-object v9, Lm7/g;->b:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    :goto_2
    move-object/from16 v16, v1

    goto/16 :goto_9

    :cond_4
    instance-of v9, v7, Lm7/c;

    if-eqz v9, :cond_6

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BasalMetabolicRate"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/c;

    iget-object v7, v7, Lm7/c;->c:Lr7/h0;

    sget-object v9, Lr7/g0;->x:Lr7/e0;

    iget-object v10, v7, Lr7/h0;->x:Lr7/g0;

    if-ne v10, v9, :cond_5

    iget-wide v9, v7, Lr7/h0;->w:D

    goto :goto_3

    :cond_5
    invoke-virtual {v7}, Lr7/h0;->a()D

    move-result-wide v9

    const-wide v11, 0x3fa8cb487009bce8L    # 0.0484259259

    div-double/2addr v9, v11

    :goto_3
    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v9, "bmr"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto :goto_2

    :cond_6
    instance-of v9, v7, Lm7/d;

    const-string v12, "mealType"

    if-eqz v9, :cond_a

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BloodGlucose"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/d;

    iget-object v9, v7, Lm7/d;->c:Lr7/d;

    invoke-virtual {v9}, Lr7/d;->a()D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    const-string v10, "level"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v9, v7, Lm7/d;->d:I

    sget-object v10, Lm7/d;->l:Ljava/util/LinkedHashMap;

    invoke-static {v9, v10}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    if-eqz v9, :cond_7

    const-string v10, "specimenSource"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_7
    iget v9, v7, Lm7/d;->e:I

    sget-object v10, Lm7/i0;->b:Ljava/util/LinkedHashMap;

    invoke-static {v9, v10}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {v8, v9, v12}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_8
    iget v7, v7, Lm7/d;->f:I

    sget-object v9, Lm7/d;->j:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_9

    const-string v9, "relationToMeal"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_9
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_a
    instance-of v9, v7, Lm7/e;

    if-eqz v9, :cond_d

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BloodPressure"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/e;

    iget-object v9, v7, Lm7/e;->c:Lr7/j0;

    iget-wide v9, v9, Lr7/j0;->w:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    const-string v10, "systolic"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object v9, v7, Lm7/e;->d:Lr7/j0;

    iget-wide v9, v9, Lr7/j0;->w:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    const-string v10, "diastolic"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v9, v7, Lm7/e;->e:I

    sget-object v10, Lm7/e;->k:Ljava/util/LinkedHashMap;

    invoke-static {v9, v10}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    if-eqz v9, :cond_b

    const-string v10, "bodyPosition"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_b
    iget v7, v7, Lm7/e;->f:I

    sget-object v9, Lm7/e;->i:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_d
    instance-of v9, v7, Lm7/f;

    const-string v13, "percentage"

    if-eqz v9, :cond_e

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BodyFat"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/f;

    iget-object v7, v7, Lm7/f;->c:Lr7/c0;

    iget-wide v9, v7, Lr7/c0;->w:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    invoke-virtual {v8, v7, v13}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_e
    instance-of v9, v7, Lm7/h;

    if-eqz v9, :cond_10

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BodyTemperature"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/h;

    iget-object v9, v7, Lm7/h;->c:Lr7/k0;

    iget-wide v12, v9, Lr7/k0;->w:D

    invoke-static {v12, v13}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v7, v7, Lm7/h;->d:I

    sget-object v9, Lm7/g;->b:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_f
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_10
    instance-of v9, v7, Lm7/i;

    sget-object v10, Lr7/a0;->x:Lr7/v;

    const-string v11, "mass"

    if-eqz v9, :cond_11

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BodyWaterMass"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/i;

    iget-object v7, v7, Lm7/i;->c:Lr7/b0;

    invoke-virtual {v7, v10}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_11
    instance-of v9, v7, Lm7/j;

    if-eqz v9, :cond_12

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "BoneMass"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/j;

    iget-object v7, v7, Lm7/j;->c:Lr7/b0;

    invoke-virtual {v7, v10}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_12
    instance-of v9, v7, Lm7/k;

    if-eqz v9, :cond_15

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "CervicalMucus"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/k;

    iget v9, v7, Lm7/k;->c:I

    sget-object v10, Lm7/k;->g:Ljava/util/LinkedHashMap;

    invoke-static {v9, v10}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    if-eqz v9, :cond_13

    const-string v10, "texture"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_13
    iget v7, v7, Lm7/k;->d:I

    sget-object v9, Lm7/k;->i:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_14

    const-string v9, "amount"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_14
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_15
    instance-of v9, v7, Lm7/m;

    if-eqz v9, :cond_16

    check-cast v7, Lm7/u0;

    const-string v8, "CyclingPedalingCadenceSeries"

    sget-object v9, Lg7/b;->x:Lg7/b;

    invoke-static {v7, v8, v9}, Lvd/e;->i0(Lm7/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/u;

    move-result-object v7

    goto/16 :goto_2

    :cond_16
    instance-of v9, v7, Lm7/z;

    if-eqz v9, :cond_17

    check-cast v7, Lm7/u0;

    const-string v8, "HeartRateSeries"

    sget-object v9, Lg7/b;->y:Lg7/b;

    invoke-static {v7, v8, v9}, Lvd/e;->i0(Lm7/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/u;

    move-result-object v7

    goto/16 :goto_2

    :cond_17
    instance-of v9, v7, Lm7/b0;

    if-eqz v9, :cond_18

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "Height"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/b0;

    iget-object v7, v7, Lm7/b0;->c:Lr7/s;

    invoke-virtual {v7}, Lr7/s;->a()D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v9, "height"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_18
    instance-of v9, v7, Lm7/a0;

    if-eqz v9, :cond_19

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "HeartRateVariabilityRmssd"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/a0;

    iget-wide v9, v7, Lm7/a0;->c:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v9, "heartRateVariability"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_19
    instance-of v9, v7, Lm7/f0;

    if-eqz v9, :cond_1a

    check-cast v7, Lm7/e0;

    invoke-static {v7}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v7

    const-string v8, "IntermenstrualBleeding"

    invoke-static {v8}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    invoke-virtual {v7}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_1a
    instance-of v9, v7, Lm7/h0;

    if-eqz v9, :cond_1b

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "LeanBodyMass"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/h0;

    iget-object v7, v7, Lm7/h0;->c:Lr7/b0;

    invoke-virtual {v7, v10}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_1b
    instance-of v9, v7, Lm7/j0;

    if-eqz v9, :cond_1d

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "Menstruation"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/j0;

    iget v7, v7, Lm7/j0;->c:I

    sget-object v9, Lm7/j0;->f:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_1c

    const-string v9, "flow"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_1c
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_1d
    instance-of v9, v7, Lm7/k0;

    if-eqz v9, :cond_1e

    check-cast v7, Lm7/g0;

    invoke-static {v7}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v7

    const-string v8, "MenstruationPeriod"

    invoke-static {v8}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    invoke-virtual {v7}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_1e
    instance-of v9, v7, Lm7/n0;

    if-eqz v9, :cond_20

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "OvulationTest"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/n0;

    iget v7, v7, Lm7/n0;->c:I

    sget-object v9, Lm7/n0;->f:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_1f

    const-string v9, "result"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_1f
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_20
    instance-of v9, v7, Lm7/o0;

    if-eqz v9, :cond_21

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "OxygenSaturation"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/o0;

    iget-object v7, v7, Lm7/o0;->c:Lr7/c0;

    iget-wide v9, v7, Lr7/c0;->w:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    invoke-virtual {v8, v7, v13}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_21
    instance-of v9, v7, Lm7/q0;

    if-eqz v9, :cond_22

    check-cast v7, Lm7/u0;

    const-string v8, "PowerSeries"

    sget-object v9, Lg7/b;->z:Lg7/b;

    invoke-static {v7, v8, v9}, Lvd/e;->i0(Lm7/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/u;

    move-result-object v7

    goto/16 :goto_2

    :cond_22
    instance-of v9, v7, Lm7/s0;

    if-eqz v9, :cond_23

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "RespiratoryRate"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/s0;

    iget-wide v9, v7, Lm7/s0;->c:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v9, "rate"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_23
    instance-of v9, v7, Lm7/t0;

    if-eqz v9, :cond_24

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "RestingHeartRate"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/t0;

    iget-wide v9, v7, Lm7/t0;->c:J

    invoke-static {v9, v10}, Lvp/c;->h0(J)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v9, "bpm"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_24
    instance-of v9, v7, Lm7/v0;

    if-eqz v9, :cond_26

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "SexualActivity"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/v0;

    iget v7, v7, Lm7/v0;->c:I

    sget-object v9, Lm7/v0;->f:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_25

    const-string v9, "protectionUsed"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_25
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_26
    instance-of v9, v7, Lm7/a1;

    if-eqz v9, :cond_27

    check-cast v7, Lm7/u0;

    const-string v8, "SpeedSeries"

    sget-object v9, Lg7/b;->E:Lg7/b;

    invoke-static {v7, v8, v9}, Lvd/e;->i0(Lm7/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/u;

    move-result-object v7

    goto/16 :goto_2

    :cond_27
    instance-of v9, v7, Lm7/c1;

    if-eqz v9, :cond_28

    check-cast v7, Lm7/u0;

    const-string v8, "StepsCadenceSeries"

    sget-object v9, Lg7/b;->F:Lg7/b;

    invoke-static {v7, v8, v9}, Lvd/e;->i0(Lm7/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/u;

    move-result-object v7

    goto/16 :goto_2

    :cond_28
    instance-of v9, v7, Lm7/f1;

    if-eqz v9, :cond_2a

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "Vo2Max"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/f1;

    iget-wide v9, v7, Lm7/f1;->c:D

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    const-string v10, "vo2"

    invoke-virtual {v8, v9, v10}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v7, v7, Lm7/f1;->d:I

    sget-object v9, Lm7/f1;->g:Ljava/util/LinkedHashMap;

    invoke-static {v7, v9}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    if-eqz v7, :cond_29

    const-string v9, "measurementMethod"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_29
    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_2a
    instance-of v9, v7, Lm7/g1;

    if-eqz v9, :cond_2b

    move-object v8, v7

    check-cast v8, Lm7/e0;

    invoke-static {v8}, Lvd/f;->v(Lm7/e0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "Weight"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/g1;

    iget-object v7, v7, Lm7/g1;->c:Lr7/b0;

    invoke-virtual {v7, v10}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v9, "weight"

    invoke-virtual {v8, v7, v9}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_2b
    instance-of v9, v7, Lm7/a;

    sget-object v10, Lr7/j;->x:Lr7/h;

    const-string v11, "energy"

    if-eqz v9, :cond_2c

    move-object v8, v7

    check-cast v8, Lm7/g0;

    invoke-static {v8}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v8

    const-string v9, "ActiveCaloriesBurned"

    invoke-static {v9}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/a;

    iget-object v7, v7, Lm7/a;->e:Lr7/k;

    invoke-virtual {v7, v10}, Lr7/k;->a(Lr7/j;)D

    move-result-wide v9

    invoke-static {v9, v10}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    invoke-virtual {v8, v7, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_2

    :cond_2c
    instance-of v9, v7, Lm7/w;

    const-string v13, "notes"

    const-string v14, "title"

    if-eqz v9, :cond_3a

    move-object v9, v7

    check-cast v9, Lm7/g0;

    invoke-static {v9}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v9

    const-string v10, "ActivitySession"

    invoke-static {v10}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/w;

    iget-object v10, v7, Lm7/w;->j:Ljava/util/List;

    iget-object v11, v7, Lm7/w;->i:Ljava/util/List;

    iget-object v12, v7, Lm7/w;->k:Lkotlin/jvm/internal/j;

    instance-of v15, v12, Lm7/u;

    xor-int/2addr v15, v5

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->A()Landroidx/health/platform/client/proto/f0;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v6, v5, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v6, Landroidx/health/platform/client/proto/g0;

    invoke-static {v6, v15}, Landroidx/health/platform/client/proto/g0;->r(Landroidx/health/platform/client/proto/g0;Z)V

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/g0;

    const-string v6, "hasRoute"

    invoke-virtual {v9, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v5, v7, Lm7/w;->e:I

    sget-object v6, Lm7/w;->m:Ljava/util/LinkedHashMap;

    invoke-static {v5, v6}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    if-nez v5, :cond_2d

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->A()Landroidx/health/platform/client/proto/f0;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v6, v5, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v6, Landroidx/health/platform/client/proto/g0;

    const-string v15, "workout"

    invoke-static {v6, v15}, Landroidx/health/platform/client/proto/g0;->q(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/g0;

    :cond_2d
    const-string v6, "activityType"

    invoke-virtual {v9, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object v5, v7, Lm7/w;->f:Ljava/lang/String;

    if-eqz v5, :cond_2e

    invoke-static {v5}, Lvp/c;->m0(Ljava/lang/String;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    invoke-virtual {v9, v5, v14}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_2e
    iget-object v5, v7, Lm7/w;->g:Ljava/lang/String;

    if-eqz v5, :cond_2f

    invoke-static {v5}, Lvp/c;->m0(Ljava/lang/String;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    invoke-virtual {v9, v5, v13}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_2f
    move-object v5, v11

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_31

    invoke-static {}, Landroidx/health/platform/client/proto/r;->s()Landroidx/health/platform/client/proto/q;

    move-result-object v5

    check-cast v11, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v11, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v6, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_30

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm7/v;

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/e0;->v()Landroidx/health/platform/client/proto/c0;

    move-result-object v13

    iget-object v14, v11, Lm7/v;->a:Ljava/time/Instant;

    invoke-virtual {v14}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v14

    invoke-virtual {v13}, Landroidx/health/platform/client/proto/s0;->c()V

    move-object/from16 v16, v1

    iget-object v1, v13, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/e0;

    invoke-static {v1, v14, v15}, Landroidx/health/platform/client/proto/e0;->q(Landroidx/health/platform/client/proto/e0;J)V

    iget-object v1, v11, Lm7/v;->b:Ljava/time/Instant;

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v14

    invoke-virtual {v13}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v13, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/e0;

    invoke-static {v1, v14, v15}, Landroidx/health/platform/client/proto/e0;->r(Landroidx/health/platform/client/proto/e0;J)V

    iget v1, v11, Lm7/v;->c:I

    int-to-long v14, v1

    invoke-static {v14, v15}, Lvp/c;->h0(J)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v14, "type"

    invoke-virtual {v13, v1, v14}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget v1, v11, Lm7/v;->d:I

    int-to-long v14, v1

    invoke-static {v14, v15}, Lvp/c;->h0(J)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v11, "reps"

    invoke-virtual {v13, v1, v11}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v13}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/e0;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v16

    goto :goto_4

    :cond_30
    move-object/from16 v16, v1

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v5, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/r;

    invoke-static {v1, v6}, Landroidx/health/platform/client/proto/r;->p(Landroidx/health/platform/client/proto/r;Ljava/util/ArrayList;)V

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    const-string v5, "segments"

    invoke-virtual {v9, v5, v1}, Landroidx/health/platform/client/proto/p;->d(Ljava/lang/String;Landroidx/health/platform/client/proto/r;)V

    goto :goto_5

    :cond_31
    move-object/from16 v16, v1

    :goto_5
    move-object v1, v10

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_34

    invoke-static {}, Landroidx/health/platform/client/proto/r;->s()Landroidx/health/platform/client/proto/q;

    move-result-object v1

    check-cast v10, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v10, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_33

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm7/p;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/e0;->v()Landroidx/health/platform/client/proto/c0;

    move-result-object v10

    iget-object v11, v7, Lm7/p;->a:Ljava/time/Instant;

    invoke-virtual {v11}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v13

    invoke-virtual {v10}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v11, v10, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v11, Landroidx/health/platform/client/proto/e0;

    invoke-static {v11, v13, v14}, Landroidx/health/platform/client/proto/e0;->q(Landroidx/health/platform/client/proto/e0;J)V

    iget-object v11, v7, Lm7/p;->b:Ljava/time/Instant;

    invoke-virtual {v11}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v13

    invoke-virtual {v10}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v11, v10, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v11, Landroidx/health/platform/client/proto/e0;

    invoke-static {v11, v13, v14}, Landroidx/health/platform/client/proto/e0;->r(Landroidx/health/platform/client/proto/e0;J)V

    iget-object v7, v7, Lm7/p;->c:Lr7/s;

    if-eqz v7, :cond_32

    invoke-virtual {v7}, Lr7/s;->a()D

    move-result-wide v13

    invoke-static {v13, v14}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v11, "length"

    invoke-virtual {v10, v7, v11}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_32
    invoke-virtual {v10}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/e0;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_33
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v6, v1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v6, Landroidx/health/platform/client/proto/r;

    invoke-static {v6, v5}, Landroidx/health/platform/client/proto/r;->p(Landroidx/health/platform/client/proto/r;Ljava/util/ArrayList;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    const-string v5, "laps"

    invoke-virtual {v9, v5, v1}, Landroidx/health/platform/client/proto/p;->d(Ljava/lang/String;Landroidx/health/platform/client/proto/r;)V

    :cond_34
    instance-of v1, v12, Lm7/t;

    if-eqz v1, :cond_39

    invoke-static {}, Landroidx/health/platform/client/proto/r;->s()Landroidx/health/platform/client/proto/q;

    move-result-object v1

    check-cast v12, Lm7/t;

    iget-object v5, v12, Lm7/t;->a:Lm7/r;

    iget-object v5, v5, Lm7/r;->a:Ljava/util/ArrayList;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_38

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm7/q;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/e0;->v()Landroidx/health/platform/client/proto/c0;

    move-result-object v10

    iget-object v11, v7, Lm7/q;->a:Ljava/time/Instant;

    invoke-virtual {v11}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v12

    invoke-virtual {v10}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v14, v10, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v14, Landroidx/health/platform/client/proto/e0;

    invoke-static {v14, v12, v13}, Landroidx/health/platform/client/proto/e0;->q(Landroidx/health/platform/client/proto/e0;J)V

    invoke-virtual {v11}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v11

    invoke-virtual {v10}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v13, v10, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v13, Landroidx/health/platform/client/proto/e0;

    invoke-static {v13, v11, v12}, Landroidx/health/platform/client/proto/e0;->r(Landroidx/health/platform/client/proto/e0;J)V

    iget-wide v11, v7, Lm7/q;->b:D

    invoke-static {v11, v12}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v11

    const-string v12, "latitude"

    invoke-virtual {v10, v11, v12}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-wide v11, v7, Lm7/q;->c:D

    invoke-static {v11, v12}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v11

    const-string v12, "longitude"

    invoke-virtual {v10, v11, v12}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object v11, v7, Lm7/q;->d:Lr7/s;

    if-eqz v11, :cond_35

    invoke-virtual {v11}, Lr7/s;->a()D

    move-result-wide v11

    invoke-static {v11, v12}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v11

    const-string v12, "horizontal_accuracy"

    invoke-virtual {v10, v11, v12}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_35
    iget-object v11, v7, Lm7/q;->e:Lr7/s;

    if-eqz v11, :cond_36

    invoke-virtual {v11}, Lr7/s;->a()D

    move-result-wide v11

    invoke-static {v11, v12}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v11

    const-string v12, "vertical_accuracy"

    invoke-virtual {v10, v11, v12}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_36
    iget-object v7, v7, Lm7/q;->f:Lr7/s;

    if-eqz v7, :cond_37

    invoke-virtual {v7}, Lr7/s;->a()D

    move-result-wide v11

    invoke-static {v11, v12}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v7

    const-string v11, "altitude"

    invoke-virtual {v10, v7, v11}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_37
    invoke-virtual {v10}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/e0;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_38
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v5, v1, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v5, Landroidx/health/platform/client/proto/r;

    invoke-static {v5, v6}, Landroidx/health/platform/client/proto/r;->p(Landroidx/health/platform/client/proto/r;Ljava/util/ArrayList;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    const-string v5, "route"

    invoke-virtual {v9, v5, v1}, Landroidx/health/platform/client/proto/p;->d(Ljava/lang/String;Landroidx/health/platform/client/proto/r;)V

    :cond_39
    invoke-virtual {v9}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_3a
    move-object/from16 v16, v1

    instance-of v1, v7, Lm7/n;

    if-eqz v1, :cond_3b

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "Distance"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/n;

    iget-object v5, v7, Lm7/n;->e:Lr7/s;

    invoke-virtual {v5}, Lr7/s;->a()D

    move-result-wide v5

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    const-string v6, "distance"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_3b
    instance-of v1, v7, Lm7/o;

    if-eqz v1, :cond_3c

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "ElevationGained"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/o;

    iget-object v5, v7, Lm7/o;->e:Lr7/s;

    invoke-virtual {v5}, Lr7/s;->a()D

    move-result-wide v5

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    const-string v6, "elevation"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_3c
    instance-of v1, v7, Lm7/x;

    if-eqz v1, :cond_3d

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "FloorsClimbed"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/x;

    iget-wide v5, v7, Lm7/x;->e:D

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    const-string v6, "floors"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_3d
    instance-of v1, v7, Lm7/d0;

    if-eqz v1, :cond_3e

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "Hydration"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/d0;

    iget-object v5, v7, Lm7/d0;->e:Lr7/w0;

    invoke-virtual {v5}, Lr7/w0;->a()D

    move-result-wide v5

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    const-string v6, "volume"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_3e
    instance-of v1, v7, Lm7/m0;

    if-eqz v1, :cond_6b

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "Nutrition"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/m0;

    iget-object v5, v7, Lm7/m0;->e:Lr7/b0;

    if-eqz v5, :cond_3f

    const-string v6, "biotin"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_3f
    iget-object v5, v7, Lm7/m0;->f:Lr7/b0;

    if-eqz v5, :cond_40

    const-string v6, "caffeine"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_40
    iget-object v5, v7, Lm7/m0;->g:Lr7/b0;

    if-eqz v5, :cond_41

    const-string v6, "calcium"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_41
    iget-object v5, v7, Lm7/m0;->h:Lr7/k;

    if-eqz v5, :cond_42

    invoke-virtual {v5, v10}, Lr7/k;->a(Lr7/j;)D

    move-result-wide v5

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    const-string v6, "calories"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_42
    iget-object v5, v7, Lm7/m0;->i:Lr7/k;

    if-eqz v5, :cond_43

    invoke-virtual {v5, v10}, Lr7/k;->a(Lr7/j;)D

    move-result-wide v5

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    const-string v6, "caloriesFromFat"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_43
    iget-object v5, v7, Lm7/m0;->j:Lr7/b0;

    if-eqz v5, :cond_44

    const-string v6, "chloride"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_44
    iget-object v5, v7, Lm7/m0;->k:Lr7/b0;

    if-eqz v5, :cond_45

    const-string v6, "cholesterol"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_45
    iget-object v5, v7, Lm7/m0;->l:Lr7/b0;

    if-eqz v5, :cond_46

    const-string v6, "chromium"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_46
    iget-object v5, v7, Lm7/m0;->m:Lr7/b0;

    if-eqz v5, :cond_47

    const-string v6, "copper"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_47
    iget-object v5, v7, Lm7/m0;->n:Lr7/b0;

    if-eqz v5, :cond_48

    const-string v6, "dietaryFiber"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_48
    iget-object v5, v7, Lm7/m0;->o:Lr7/b0;

    if-eqz v5, :cond_49

    const-string v6, "folate"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_49
    iget-object v5, v7, Lm7/m0;->p:Lr7/b0;

    if-eqz v5, :cond_4a

    const-string v6, "folicAcid"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_4a
    iget-object v5, v7, Lm7/m0;->q:Lr7/b0;

    if-eqz v5, :cond_4b

    const-string v6, "iodine"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_4b
    iget-object v5, v7, Lm7/m0;->r:Lr7/b0;

    if-eqz v5, :cond_4c

    const-string v6, "iron"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_4c
    iget-object v5, v7, Lm7/m0;->s:Lr7/b0;

    if-eqz v5, :cond_4d

    const-string v6, "magnesium"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_4d
    iget-object v5, v7, Lm7/m0;->t:Lr7/b0;

    if-eqz v5, :cond_4e

    const-string v6, "manganese"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_4e
    iget-object v5, v7, Lm7/m0;->u:Lr7/b0;

    if-eqz v5, :cond_4f

    const-string v6, "molybdenum"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_4f
    iget-object v5, v7, Lm7/m0;->v:Lr7/b0;

    if-eqz v5, :cond_50

    const-string v6, "monounsaturatedFat"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_50
    iget-object v5, v7, Lm7/m0;->w:Lr7/b0;

    if-eqz v5, :cond_51

    const-string v6, "niacin"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_51
    iget-object v5, v7, Lm7/m0;->x:Lr7/b0;

    if-eqz v5, :cond_52

    const-string v6, "pantothenicAcid"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_52
    iget-object v5, v7, Lm7/m0;->y:Lr7/b0;

    if-eqz v5, :cond_53

    const-string v6, "phosphorus"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_53
    iget-object v5, v7, Lm7/m0;->z:Lr7/b0;

    if-eqz v5, :cond_54

    const-string v6, "polyunsaturatedFat"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_54
    iget-object v5, v7, Lm7/m0;->A:Lr7/b0;

    if-eqz v5, :cond_55

    const-string v6, "potassium"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_55
    iget-object v5, v7, Lm7/m0;->B:Lr7/b0;

    if-eqz v5, :cond_56

    const-string v6, "protein"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_56
    iget-object v5, v7, Lm7/m0;->C:Lr7/b0;

    if-eqz v5, :cond_57

    const-string v6, "riboflavin"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_57
    iget-object v5, v7, Lm7/m0;->D:Lr7/b0;

    if-eqz v5, :cond_58

    const-string v6, "saturatedFat"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_58
    iget-object v5, v7, Lm7/m0;->E:Lr7/b0;

    if-eqz v5, :cond_59

    const-string v6, "selenium"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_59
    iget-object v5, v7, Lm7/m0;->F:Lr7/b0;

    if-eqz v5, :cond_5a

    const-string v6, "sodium"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_5a
    iget-object v5, v7, Lm7/m0;->G:Lr7/b0;

    if-eqz v5, :cond_5b

    const-string v6, "sugar"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_5b
    iget-object v5, v7, Lm7/m0;->H:Lr7/b0;

    if-eqz v5, :cond_5c

    const-string v6, "thiamin"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_5c
    iget-object v5, v7, Lm7/m0;->I:Lr7/b0;

    if-eqz v5, :cond_5d

    const-string v6, "totalCarbohydrate"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_5d
    iget-object v5, v7, Lm7/m0;->J:Lr7/b0;

    if-eqz v5, :cond_5e

    const-string v6, "totalFat"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_5e
    iget-object v5, v7, Lm7/m0;->K:Lr7/b0;

    if-eqz v5, :cond_5f

    const-string v6, "transFat"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_5f
    iget-object v5, v7, Lm7/m0;->L:Lr7/b0;

    if-eqz v5, :cond_60

    const-string v6, "unsaturatedFat"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_60
    iget-object v5, v7, Lm7/m0;->M:Lr7/b0;

    if-eqz v5, :cond_61

    const-string v6, "vitaminA"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_61
    iget-object v5, v7, Lm7/m0;->N:Lr7/b0;

    if-eqz v5, :cond_62

    const-string v6, "vitaminB12"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_62
    iget-object v5, v7, Lm7/m0;->O:Lr7/b0;

    if-eqz v5, :cond_63

    const-string v6, "vitaminB6"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_63
    iget-object v5, v7, Lm7/m0;->P:Lr7/b0;

    if-eqz v5, :cond_64

    const-string v6, "vitaminC"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_64
    iget-object v5, v7, Lm7/m0;->Q:Lr7/b0;

    if-eqz v5, :cond_65

    const-string v6, "vitaminD"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_65
    iget-object v5, v7, Lm7/m0;->R:Lr7/b0;

    if-eqz v5, :cond_66

    const-string v6, "vitaminE"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_66
    iget-object v5, v7, Lm7/m0;->S:Lr7/b0;

    if-eqz v5, :cond_67

    const-string v6, "vitaminK"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_67
    iget-object v5, v7, Lm7/m0;->T:Lr7/b0;

    if-eqz v5, :cond_68

    const-string v6, "zinc"

    invoke-static {v5, v1, v6}, Ld13/a;->s(Lr7/b0;Landroidx/health/platform/client/proto/p;Ljava/lang/String;)V

    :cond_68
    iget v5, v7, Lm7/m0;->V:I

    sget-object v6, Lm7/i0;->b:Ljava/util/LinkedHashMap;

    invoke-static {v5, v6}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    if-eqz v5, :cond_69

    invoke-virtual {v1, v5, v12}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_69
    iget-object v5, v7, Lm7/m0;->U:Ljava/lang/String;

    if-eqz v5, :cond_6a

    const-string v6, "name"

    invoke-static {v5}, Lvp/c;->m0(Ljava/lang/String;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_6a
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_6b
    instance-of v1, v7, Lm7/x0;

    if-eqz v1, :cond_71

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "SleepSession"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/x0;

    iget-object v5, v7, Lm7/x0;->g:Ljava/util/List;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_6e

    invoke-static {}, Landroidx/health/platform/client/proto/r;->s()Landroidx/health/platform/client/proto/q;

    move-result-object v6

    check-cast v5, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v5, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm7/w0;

    const-string v11, "<this>"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/e0;->v()Landroidx/health/platform/client/proto/c0;

    move-result-object v11

    iget-object v12, v10, Lm7/w0;->a:Ljava/time/Instant;

    move-object v15, v10

    invoke-virtual {v12}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v9

    invoke-virtual {v11}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v12, v11, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v12, Landroidx/health/platform/client/proto/e0;

    invoke-static {v12, v9, v10}, Landroidx/health/platform/client/proto/e0;->q(Landroidx/health/platform/client/proto/e0;J)V

    iget-object v9, v15, Lm7/w0;->b:Ljava/time/Instant;

    invoke-virtual {v9}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v9

    invoke-virtual {v11}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v12, v11, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v12, Landroidx/health/platform/client/proto/e0;

    invoke-static {v12, v9, v10}, Landroidx/health/platform/client/proto/e0;->r(Landroidx/health/platform/client/proto/e0;J)V

    iget v9, v15, Lm7/w0;->c:I

    sget-object v10, Lm7/x0;->j:Ljava/util/LinkedHashMap;

    invoke-static {v9, v10}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v9

    if-eqz v9, :cond_6c

    const-string v10, "stage"

    invoke-virtual {v11, v9, v10}, Landroidx/health/platform/client/proto/c0;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_6c
    invoke-virtual {v11}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v9

    check-cast v9, Landroidx/health/platform/client/proto/e0;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v9, 0xa

    goto :goto_8

    :cond_6d
    invoke-virtual {v6}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v5, v6, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v5, Landroidx/health/platform/client/proto/r;

    invoke-static {v5, v8}, Landroidx/health/platform/client/proto/r;->p(Landroidx/health/platform/client/proto/r;Ljava/util/ArrayList;)V

    invoke-virtual {v6}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/r;

    const-string v6, "stages"

    invoke-virtual {v1, v6, v5}, Landroidx/health/platform/client/proto/p;->d(Ljava/lang/String;Landroidx/health/platform/client/proto/r;)V

    :cond_6e
    iget-object v5, v7, Lm7/x0;->e:Ljava/lang/String;

    if-eqz v5, :cond_6f

    invoke-static {v5}, Lvp/c;->m0(Ljava/lang/String;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    invoke-virtual {v1, v5, v14}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_6f
    iget-object v5, v7, Lm7/x0;->f:Ljava/lang/String;

    if-eqz v5, :cond_70

    invoke-static {v5}, Lvp/c;->m0(Ljava/lang/String;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    invoke-virtual {v1, v5, v13}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_70
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_71
    instance-of v1, v7, Lm7/y0;

    if-eqz v1, :cond_73

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "SleepStage"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/y0;

    iget v5, v7, Lm7/y0;->e:I

    sget-object v6, Lm7/y0;->h:Ljava/util/LinkedHashMap;

    invoke-static {v5, v6}, Lvp/c;->E(ILjava/util/Map;)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    if-eqz v5, :cond_72

    const-string v6, "stage"

    invoke-virtual {v1, v5, v6}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    :cond_72
    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto/16 :goto_9

    :cond_73
    instance-of v1, v7, Lm7/d1;

    const-string v5, "count"

    if-eqz v1, :cond_74

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v6, "Steps"

    invoke-static {v6}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/d1;

    iget-wide v6, v7, Lm7/d1;->e:J

    invoke-static {v6, v7}, Lvp/c;->h0(J)Landroidx/health/platform/client/proto/g0;

    move-result-object v6

    invoke-virtual {v1, v6, v5}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto :goto_9

    :cond_74
    instance-of v1, v7, Lm7/e1;

    if-eqz v1, :cond_75

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v5, "TotalCaloriesBurned"

    invoke-static {v5}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/e1;

    iget-object v5, v7, Lm7/e1;->e:Lr7/k;

    invoke-virtual {v5, v10}, Lr7/k;->a(Lr7/j;)D

    move-result-wide v5

    invoke-static {v5, v6}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v5

    invoke-virtual {v1, v5, v11}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    goto :goto_9

    :cond_75
    instance-of v1, v7, Lm7/h1;

    if-eqz v1, :cond_76

    move-object v1, v7

    check-cast v1, Lm7/g0;

    invoke-static {v1}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v1

    const-string v6, "WheelchairPushes"

    invoke-static {v6}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    check-cast v7, Lm7/h1;

    iget-wide v6, v7, Lm7/h1;->e:J

    invoke-static {v6, v7}, Lvp/c;->h0(J)Landroidx/health/platform/client/proto/g0;

    move-result-object v6

    invoke-virtual {v1, v6, v5}, Landroidx/health/platform/client/proto/p;->e(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/health/platform/client/proto/u;

    :goto_9
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v16

    const/4 v5, 0x1

    const/16 v6, 0xa

    goto/16 :goto_1

    :cond_76
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unsupported yet!"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_77
    iget-object v1, v0, Le7/g;->b:Lv7/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Le8/f;

    invoke-direct {v5, v4}, Le8/f;-><init>(Ljava/util/List;)V

    new-instance v4, Lqm2/c;

    const/4 v6, 0x5

    invoke-direct {v4, v6, v1, v5}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x1

    invoke-virtual {v1, v5, v4}, Lv7/b;->a(ILz7/c;)Lds/w;

    move-result-object v1

    move-object/from16 v4, p1

    check-cast v4, Ljava/util/List;

    iput-object v4, v2, Le7/e;->w:Ljava/util/List;

    iput v5, v2, Le7/e;->z:I

    invoke-static {v1, v2}, Lbp/b;->g(Lds/w;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_78

    return-object v3

    :cond_78
    move-object/from16 v2, p1

    :goto_a
    check-cast v1, Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " records inserted."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "HealthConnectClient"

    invoke-static {v3, v2}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lp7/b;

    const-string v3, "recordIdsList"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    return-object v2
.end method

.method public final d(Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Le7/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le7/d;

    iget v1, v0, Le7/d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/d;

    invoke-direct {v0, p0, p1}, Le7/d;-><init>(Le7/g;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le7/d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/d;->z:I

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Le7/d;->w:Le7/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le7/g;->c:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {}, Landroidx/health/platform/client/proto/w1;->r()Landroidx/health/platform/client/proto/v1;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v7, v6, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v7, Landroidx/health/platform/client/proto/w1;

    invoke-static {v7, v5}, Landroidx/health/platform/client/proto/w1;->p(Landroidx/health/platform/client/proto/w1;Ljava/lang/String;)V

    invoke-virtual {v6}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/w1;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object v2, p0, Le7/g;->b:Lv7/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    new-instance v6, Lqm2/c;

    const/4 v7, 0x4

    invoke-direct {v6, v7, v2, p1}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v5, v6}, Lv7/b;->a(ILz7/c;)Lds/w;

    move-result-object p1

    iput-object p0, v0, Le7/d;->w:Le7/g;

    iput v4, v0, Le7/d;->z:I

    invoke-static {p1, v0}, Lbp/b;->g(Lds/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/w1;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/w1;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Granted "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " out of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Le7/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " permissions."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HealthConnectClient"

    invoke-static {v1, v0}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e()Lb7/c;
    .locals 0

    return-object p0
.end method

.method public final f(Lo7/a;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Le7/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/c;

    iget v1, v0, Le7/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/c;

    invoke-direct {v0, p0, p2}, Le7/c;-><init>(Le7/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/health/platform/client/proto/i2;->r()Landroidx/health/platform/client/proto/h2;

    move-result-object p2

    iget-object v2, p1, Lo7/a;->a:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj93/d;

    invoke-static {v6}, Le4/a;->S(Lj93/d;)Landroidx/health/platform/client/proto/w;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/i2;

    invoke-static {v2, v4}, Landroidx/health/platform/client/proto/i2;->p(Landroidx/health/platform/client/proto/i2;Ljava/util/ArrayList;)V

    iget-object p1, p1, Lo7/a;->b:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln7/a;

    invoke-static {}, Landroidx/health/platform/client/proto/o;->s()Landroidx/health/platform/client/proto/n;

    move-result-object v5

    iget-object v4, v4, Ln7/a;->a:Ljava/lang/String;

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v6, v5, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v6, Landroidx/health/platform/client/proto/o;

    invoke-static {v6, v4}, Landroidx/health/platform/client/proto/o;->p(Landroidx/health/platform/client/proto/o;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/o;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object p1, p2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast p1, Landroidx/health/platform/client/proto/i2;

    invoke-static {p1, v2}, Landroidx/health/platform/client/proto/i2;->q(Landroidx/health/platform/client/proto/i2;Ljava/util/ArrayList;)V

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/i2;

    iget-object p2, p0, Le7/g;->b:Lv7/b;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lqm2/c;

    const/16 v4, 0x9

    invoke-direct {v2, v4, p2, p1}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v3, v2}, Lv7/b;->a(ILz7/c;)Lds/w;

    move-result-object p1

    iput v3, v0, Le7/c;->y:I

    invoke-static {p1, v0}, Lbp/b;->g(Lds/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Landroidx/health/platform/client/proto/q2;

    invoke-virtual {p2}, Landroidx/health/platform/client/proto/q2;->p()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Retrieved change token "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "HealthConnectClient"

    invoke-static {v0, p2}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "changeToken"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g(Lj93/d;Lm83/y;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Le7/a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Le7/a;

    iget v1, v0, Le7/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/a;

    check-cast p4, Ls83/c;

    invoke-direct {v0, p0, p4}, Le7/a;-><init>(Le7/g;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Le7/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le7/a;->x:Ljava/util/List;

    move-object p3, p1

    check-cast p3, Ljava/util/List;

    iget-object p2, v0, Le7/a;->w:Lm83/y;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lio/sentry/config/a;->Z(Lj93/d;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p4

    invoke-static {p1, p3}, Lio/sentry/config/a;->Z(Lj93/d;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v2, p0, Le7/g;->b:Lv7/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Le8/a;

    invoke-direct {v4, p4, p1}, Le8/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-instance p1, Lqm2/c;

    const/4 p4, 0x6

    invoke-direct {p1, p4, v2, v4}, Lqm2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3, p1}, Lv7/b;->a(ILz7/c;)Lds/w;

    move-result-object p1

    iput-object p2, v0, Le7/a;->w:Lm83/y;

    move-object p4, p3

    check-cast p4, Ljava/util/List;

    iput-object p4, v0, Le7/a;->x:Ljava/util/List;

    iput v3, v0, Le7/a;->E:I

    invoke-static {p1, v0}, Lbp/b;->g(Lds/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " records deleted."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HealthConnectClient"

    invoke-static {p2, p1}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
