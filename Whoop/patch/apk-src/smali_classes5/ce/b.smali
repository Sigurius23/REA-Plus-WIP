.class public final Lce/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public final synthetic G:Lgm/r;

.field public final synthetic H:Lvg/n;

.field public final synthetic I:Lce/h;

.field public w:[Ljava/lang/Object;

.field public x:[Ljava/lang/Object;

.field public y:Lgm/r;

.field public z:Lce/v;


# direct methods
.method public constructor <init>(Lgm/r;Lvg/n;Lce/h;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lce/b;->G:Lgm/r;

    iput-object p2, p0, Lce/b;->H:Lvg/n;

    iput-object p3, p0, Lce/b;->I:Lce/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Lce/b;

    iget-object v0, p0, Lce/b;->H:Lvg/n;

    iget-object v1, p0, Lce/b;->I:Lce/h;

    iget-object v2, p0, Lce/b;->G:Lgm/r;

    invoke-direct {p1, v2, v0, v1, p2}, Lce/b;-><init>(Lgm/r;Lvg/n;Lce/h;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lce/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lce/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lce/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lce/b;->F:I

    const/4 v3, 0x0

    iget-object v4, v0, Lce/b;->H:Lvg/n;

    iget-object v5, v0, Lce/b;->G:Lgm/r;

    const/4 v6, 0x0

    iget-object v7, v0, Lce/b;->I:Lce/h;

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v9, :cond_1

    if-ne v2, v8, :cond_0

    iget v9, v0, Lce/b;->E:I

    iget-object v1, v0, Lce/b;->z:Lce/v;

    iget-object v5, v0, Lce/b;->y:Lgm/r;

    iget-object v2, v0, Lce/b;->x:[Ljava/lang/Object;

    check-cast v2, [Ljava/util/Map;

    iget-object v4, v0, Lce/b;->w:[Ljava/lang/Object;

    check-cast v4, [Ljava/util/Map;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v4

    move-object/from16 v4, p1

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lce/b;->E:I

    iget-object v10, v0, Lce/b;->z:Lce/v;

    iget-object v11, v0, Lce/b;->y:Lgm/r;

    iget-object v12, v0, Lce/b;->x:[Ljava/lang/Object;

    check-cast v12, [Ljava/util/Map;

    iget-object v13, v0, Lce/b;->w:[Ljava/lang/Object;

    check-cast v13, [Ljava/util/Map;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v12

    move-object v12, v13

    move-object v13, v11

    move-object v11, v10

    move v10, v2

    move-object/from16 v2, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-array v12, v8, [Ljava/util/Map;

    sget-object v10, Lce/v;->z:Lce/v;

    iget-object v2, v7, Lce/h;->b:Ljava/lang/String;

    iput-object v12, v0, Lce/b;->w:[Ljava/lang/Object;

    iput-object v12, v0, Lce/b;->x:[Ljava/lang/Object;

    iput-object v5, v0, Lce/b;->y:Lgm/r;

    iput-object v10, v0, Lce/b;->z:Lce/v;

    iput v6, v0, Lce/b;->E:I

    iput v9, v0, Lce/b;->F:I

    move-object v11, v4

    check-cast v11, Lvg/r;

    invoke-virtual {v11, v2, v0}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v13, v5

    move-object v11, v10

    move-object v14, v12

    move v10, v6

    :goto_0
    check-cast v2, [B

    if-eqz v2, :cond_4

    invoke-static {v2}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    invoke-static {v13, v11, v2}, Lx43/j;->Q(Log/g;Lce/v;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    aput-object v2, v14, v10

    sget-object v2, Lce/v;->E:Lce/v;

    iget-object v10, v7, Lce/h;->c:Ljava/lang/String;

    iput-object v12, v0, Lce/b;->w:[Ljava/lang/Object;

    iput-object v12, v0, Lce/b;->x:[Ljava/lang/Object;

    iput-object v5, v0, Lce/b;->y:Lgm/r;

    iput-object v2, v0, Lce/b;->z:Lce/v;

    iput v9, v0, Lce/b;->E:I

    iput v8, v0, Lce/b;->F:I

    check-cast v4, Lvg/r;

    invoke-virtual {v4, v10, v0}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object v4

    if-ne v4, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, v2

    move-object v2, v12

    :goto_3
    check-cast v4, [B

    if-eqz v4, :cond_6

    invoke-static {v4}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object v3

    :cond_6
    invoke-static {v5, v1, v3}, Lx43/j;->Q(Log/g;Lce/v;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    aput-object v1, v2, v9

    const-string v1, "maps"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln83/f;

    invoke-direct {v1}, Ln83/f;-><init>()V

    invoke-static {}, Lce/l;->values()[Lce/l;

    move-result-object v2

    array-length v3, v2

    move v4, v6

    :goto_4
    if-ge v4, v3, :cond_d

    aget-object v5, v2, v4

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    array-length v9, v12

    move v10, v6

    :goto_5
    if-ge v10, v9, :cond_8

    aget-object v11, v12, v10

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    if-eqz v11, :cond_7

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_8
    new-instance v9, Ln83/f;

    invoke-direct {v9}, Ln83/f;-><init>()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v9, v13}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lce/k;

    if-eqz v13, :cond_a

    iget-object v13, v13, Lce/k;->b:Ljava/util/Map;

    if-nez v13, :cond_b

    :cond_a
    sget-object v13, Lm83/z;->w:Lm83/z;

    :cond_b
    new-instance v14, Lce/k;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Lce/k;

    iget-object v6, v6, Lce/k;->b:Ljava/util/Map;

    invoke-static {v13, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lce/k;

    iget-object v11, v11, Lce/k;->c:Lce/l;

    invoke-direct {v14, v15, v6, v11}, Lce/k;-><init>(Ljava/lang/String;Ljava/util/Map;Lce/l;)V

    invoke-virtual {v9, v15, v14}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    goto :goto_6

    :cond_c
    invoke-virtual {v9}, Ln83/f;->b()Ln83/f;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x0

    goto/16 :goto_4

    :cond_d
    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object v1

    const-string v2, "source"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lce/j;

    invoke-direct {v2, v1, v7}, Lce/j;-><init>(Ln83/f;Lce/h;)V

    return-object v2
.end method
