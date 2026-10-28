.class public final Lz53/g;
.super Ly53/c;
.source "SourceFile"


# static fields
.field public static final I:Ll83/p;


# instance fields
.field public final E:Ljava/util/Set;

.field public final F:Lq83/j;

.field public final G:Lq83/j;

.field public final H:Ljava/util/Map;

.field public final y:Lz53/b;

.field public final z:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lz53/c;->w:Lz53/c;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lz53/g;->I:Ll83/p;

    return-void
.end method

.method public constructor <init>(Lz53/b;)V
    .locals 11

    invoke-direct {p0}, Ly53/c;-><init>()V

    iput-object p1, p0, Lz53/g;->y:Lz53/b;

    new-instance v0, La3/l0;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lz53/g;->z:Ll83/p;

    const/4 v0, 0x2

    new-array v0, v0, [Ly53/d;

    sget-object v1, La63/h0;->d:La63/g0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ld63/a;->a:Ld63/a;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lz53/g;->E:Ljava/util/Set;

    new-instance v3, Landroidx/room/u;

    const/4 v9, 0x0

    const/16 v10, 0x1a

    const/4 v4, 0x1

    const-class v6, Lz53/g;

    const-string v7, "createOkHttpClient"

    const-string v8, "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;"

    move-object v5, p0

    invoke-direct/range {v3 .. v10}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget p1, p1, Lz53/b;->c:I

    new-instance v0, Lo63/k;

    invoke-direct {v0, v3, p1}, Lo63/k;-><init>(Landroidx/room/u;I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "synchronizedMap(LRUCache\u2026upplier, close, maxSize))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v5, Lz53/g;->H:Ljava/util/Map;

    invoke-super {p0}, Ly53/c;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lbc3/k1;

    new-instance v0, Lbc3/e2;

    invoke-direct {v0, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    new-instance p1, Lo63/g;

    sget-object v1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {p1, v1, v2}, Lo63/g;-><init>(Lq83/i;I)V

    invoke-static {v0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, v5, Lz53/g;->F:Lq83/j;

    invoke-super {p0}, Ly53/c;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, v5, Lz53/g;->G:Lq83/j;

    invoke-super {p0}, Ly53/c;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object v0, Lbc3/d0;->y:Lbc3/d0;

    new-instance v1, Landroidx/room/z1;

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-direct {v1, p0, v2, v3}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v2, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {v2, p1, v0, v1}, Lbc3/f0;->y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final b(Le63/e;Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lz53/d;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lz53/d;

    iget v3, v2, Lz53/d;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lz53/d;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lz53/d;

    invoke-direct {v2, v0, v1}, Lz53/d;-><init>(Lz53/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lz53/d;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lz53/d;->E:I

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v5, :cond_3

    const/4 v2, 0x2

    if-eq v3, v2, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_3
    iget-object v3, v8, Lz53/d;->x:Le63/e;

    iget-object v5, v8, Lz53/d;->w:Lz53/g;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v3

    move-object v3, v5

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v0, v8, Lz53/d;->w:Lz53/g;

    move-object/from16 v1, p1

    iput-object v1, v8, Lz53/d;->x:Le63/e;

    iput v5, v8, Lz53/d;->E:I

    sget-object v3, Ly53/h;->a:Ljava/util/Set;

    invoke-interface {v8}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    sget-object v5, Ly53/g;->x:Ljc/a;

    invoke-interface {v3, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Ly53/g;

    iget-object v3, v3, Ly53/g;->w:Lq83/j;

    if-ne v3, v2, :cond_5

    goto/16 :goto_7

    :cond_5
    move-object v7, v1

    move-object v1, v3

    move-object v3, v0

    :goto_2
    move-object v6, v1

    check-cast v6, Lq83/j;

    new-instance v1, Lud3/n0;

    invoke-direct {v1}, Lud3/n0;-><init>()V

    iget-object v5, v7, Le63/e;->a:Li63/e0;

    iget-object v9, v7, Le63/e;->b:Li63/t;

    iget-object v5, v5, Li63/e0;->g:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lud3/n0;->f(Ljava/lang/String;)V

    iget-object v5, v7, Le63/e;->c:Li63/o;

    iget-object v10, v7, Le63/e;->d:Lj63/d;

    new-instance v11, Lb2/r;

    const/16 v12, 0xa

    invoke-direct {v11, v1, v12}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    sget-object v12, Ly53/h;->a:Ljava/util/Set;

    new-instance v12, Lb3/t0;

    const/16 v13, 0xe

    invoke-direct {v12, v13, v5, v10}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Li63/n;

    invoke-direct {v13, v4}, Lal/a;-><init>(I)V

    invoke-virtual {v12, v13}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v12, v13, Lal/a;->x:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    const-string v13, "values"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Lo63/d;

    invoke-direct {v13}, Lo63/d;-><init>()V

    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Ljava/lang/String;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v15

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v15}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v16, v7

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v15, :cond_6

    invoke-interface {v14, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move/from16 p1, v7

    move-object/from16 v7, v17

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, p1, 0x1

    goto :goto_4

    :cond_6
    invoke-interface {v13, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    move-object/from16 v7, v16

    const/4 v4, 0x3

    goto :goto_3

    :cond_7
    move-object/from16 v16, v7

    new-instance v0, Lb2/r;

    const/16 v4, 0x9

    invoke-direct {v0, v11, v4}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v0, v12, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_8
    sget-object v0, Li63/r;->a:Ljava/util/List;

    const-string v0, "User-Agent"

    invoke-virtual {v5, v0}, Lo63/o;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    invoke-virtual {v10}, Lj63/d;->c()Li63/m;

    move-result-object v4

    invoke-interface {v4, v0}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    sget-boolean v4, Lo63/l;->a:Z

    const-string v4, "Ktor client"

    invoke-virtual {v11, v0, v4}, Lb2/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {v10}, Lj63/d;->b()Li63/d;

    move-result-object v0

    const-string v4, "Content-Type"

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Li63/j;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    :cond_a
    invoke-virtual {v10}, Lj63/d;->c()Li63/m;

    move-result-object v0

    invoke-interface {v0, v4}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-virtual {v5, v4}, Lo63/o;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_b
    invoke-virtual {v10}, Lj63/d;->a()Ljava/lang/Long;

    move-result-object v7

    const-string v12, "Content-Length"

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_d

    :cond_c
    invoke-virtual {v10}, Lj63/d;->c()Li63/m;

    move-result-object v7

    invoke-interface {v7, v12}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_d

    invoke-virtual {v5, v12}, Lo63/o;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :cond_d
    if-eqz v0, :cond_e

    invoke-virtual {v11, v4, v0}, Lb2/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    if-eqz v7, :cond_f

    invoke-virtual {v11, v12, v7}, Lb2/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget-object v0, v9, Li63/t;->a:Ljava/lang/String;

    invoke-static {v0}, Lwb3/f;->X(Ljava/lang/String;)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_13

    const-string v0, "callContext"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, v10, Lj63/b;

    if-eqz v0, :cond_10

    check-cast v10, Lj63/b;

    invoke-virtual {v10}, Lj63/b;->d()[B

    move-result-object v0

    sget-object v5, Lud3/v0;->Companion:Lud3/u0;

    array-length v7, v0

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    invoke-static {v4, v0, v5, v7}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object v0

    goto :goto_6

    :cond_10
    instance-of v0, v10, Lj63/c;

    if-eqz v0, :cond_11

    new-instance v0, Lz53/i;

    invoke-virtual {v10}, Lj63/d;->a()Ljava/lang/Long;

    move-result-object v5

    new-instance v7, Lm5/k;

    const/16 v11, 0x14

    invoke-direct {v7, v10, v11}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v5, v7}, Lz53/i;-><init>(Ljava/lang/Long;Lm5/k;)V

    goto :goto_6

    :cond_11
    instance-of v0, v10, Lg63/c;

    if-eqz v0, :cond_12

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    const/4 v5, 0x0

    new-array v7, v5, [B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v7, v5, v5}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object v0

    goto :goto_6

    :cond_12
    new-instance v0, Lio/ktor/client/call/UnsupportedContentTypeException;

    invoke-direct {v0, v10}, Lio/ktor/client/call/UnsupportedContentTypeException;-><init>(Lj63/d;)V

    throw v0

    :cond_13
    move-object v0, v4

    :goto_6
    iget-object v5, v9, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {v1, v5, v0}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance v5, Lud3/o0;

    invoke-direct {v5, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object v0, v3, Lz53/g;->H:Ljava/util/Map;

    sget-object v1, La63/h0;->d:La63/g0;

    invoke-virtual/range {v16 .. v16}, Le63/e;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/l0;

    if-eqz v0, :cond_15

    iput-object v4, v8, Lz53/d;->w:Lz53/g;

    iput-object v4, v8, Lz53/d;->x:Le63/e;

    const/4 v1, 0x3

    iput v1, v8, Lz53/d;->E:I

    move-object v4, v0

    move-object/from16 v7, v16

    invoke-virtual/range {v3 .. v8}, Lz53/g;->h(Lud3/l0;Lud3/o0;Lq83/j;Le63/e;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_14

    :goto_7
    return-object v2

    :cond_14
    return-object v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OkHttpClient can\'t be constructed because HttpTimeout plugin is not installed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 2

    invoke-super {p0}, Ly53/c;->close()V

    iget-object v0, p0, Lz53/g;->F:Lq83/j;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lbc3/u;

    invoke-interface {v0}, Lbc3/u;->complete()Z

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lz53/g;->G:Lq83/j;

    return-object v0
.end method

.method public final h(Lud3/l0;Lud3/o0;Lq83/j;Le63/e;Ls83/c;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    instance-of v2, v1, Lz53/e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lz53/e;

    iget v3, v2, Lz53/e;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lz53/e;->G:I

    goto :goto_0

    :cond_0
    new-instance v2, Lz53/e;

    invoke-direct {v2, p0, v1}, Lz53/e;-><init>(Lz53/g;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lz53/e;->E:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lz53/e;->G:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object p1, v2, Lz53/e;->z:Lq63/b;

    iget-object p2, v2, Lz53/e;->y:Le63/e;

    iget-object v0, v2, Lz53/e;->x:Lq83/j;

    iget-object v2, v2, Lz53/e;->w:Lz53/g;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, p1

    move-object v12, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {v5}, Lq63/a;->a(Ljava/lang/Long;)Lq63/b;

    move-result-object v1

    iput-object p0, v2, Lz53/e;->w:Lz53/g;

    move-object/from16 v4, p3

    iput-object v4, v2, Lz53/e;->x:Lq83/j;

    iput-object v0, v2, Lz53/e;->y:Le63/e;

    iput-object v1, v2, Lz53/e;->z:Lq63/b;

    iput v6, v2, Lz53/e;->G:I

    new-instance v7, Lbc3/m;

    invoke-static {v2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v2

    invoke-direct {v7, v6, v2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v7}, Lbc3/m;->s()V

    invoke-virtual/range {p1 .. p2}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    new-instance p2, Lp0/n0;

    invoke-direct {p2, v0, v7}, Lp0/n0;-><init>(Le63/e;Lbc3/m;)V

    invoke-virtual {p1, p2}, Lzd3/o;->d(Lud3/k;)V

    new-instance p2, Lz53/f;

    const/4 v2, 0x1

    invoke-direct {p2, p1, v2}, Lz53/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, p2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, p0

    move-object p2, v0

    move-object v8, v1

    move-object v12, v4

    move-object v1, p1

    :goto_1
    check-cast v1, Lud3/x0;

    iget-object p1, v1, Lud3/x0;->G:Lud3/a1;

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v12, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lbc3/k1;

    new-instance v3, Lz53/f;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lz53/f;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lud3/a1;->d1()Lne3/j;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lf0/b1;

    invoke-direct {v0, p1, v12, p2, v5}, Lf0/b1;-><init>(Lne3/j;Lq83/j;Le63/e;Lq83/d;)V

    const/4 p1, 0x0

    sget-object p2, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {p2, v12, p1, v0}, Lhg3/i;->s0(Lbc3/c0;Lq83/j;ZLc93/m;)Lio/ktor/utils/io/t;

    move-result-object p1

    iget-object p1, p1, Lio/ktor/utils/io/t;->x:Lio/ktor/utils/io/m;

    :goto_2
    move-object v11, p1

    goto :goto_3

    :cond_4
    sget-object p1, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/ktor/utils/io/p;->a()Lio/ktor/utils/io/q;

    move-result-object p1

    goto :goto_2

    :goto_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Li63/v;

    iget p1, v1, Lud3/x0;->z:I

    iget-object p2, v1, Lud3/x0;->y:Ljava/lang/String;

    invoke-direct {v7, p1, p2}, Li63/v;-><init>(ILjava/lang/String;)V

    iget-object p1, v1, Lud3/x0;->x:Lud3/m0;

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_9

    const/4 p2, 0x1

    if-eq p1, p2, :cond_8

    const/4 p2, 0x2

    if-eq p1, p2, :cond_7

    const/4 p2, 0x3

    sget-object v0, Li63/u;->d:Li63/u;

    if-eq p1, p2, :cond_5

    const/4 p2, 0x4

    if-eq p1, p2, :cond_5

    const/4 p2, 0x5

    if-ne p1, p2, :cond_6

    sget-object v0, Li63/u;->h:Li63/u;

    :cond_5
    :goto_4
    move-object v10, v0

    goto :goto_5

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    sget-object v0, Li63/u;->g:Li63/u;

    goto :goto_4

    :cond_8
    sget-object v0, Li63/u;->e:Li63/u;

    goto :goto_4

    :cond_9
    sget-object v0, Li63/u;->f:Li63/u;

    goto :goto_4

    :goto_5
    iget-object p1, v1, Lud3/x0;->F:Lud3/d0;

    new-instance v9, Lz53/h;

    invoke-direct {v9, p1}, Lz53/h;-><init>(Lud3/d0;)V

    new-instance v6, Le63/g;

    invoke-direct/range {v6 .. v12}, Le63/g;-><init>(Li63/v;Lq63/b;Lz53/h;Li63/u;Ljava/lang/Object;Lq83/j;)V

    return-object v6
.end method
