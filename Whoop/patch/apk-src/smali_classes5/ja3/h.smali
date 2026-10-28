.class public final Lja3/h;
.super Llb3/b;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lu93/b;

.field public final synthetic y:I

.field public final z:Lkb3/i;


# direct methods
.method public constructor <init>(Lja3/i;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lja3/h;->y:I

    .line 1
    iput-object p1, p0, Lja3/h;->E:Lu93/b;

    .line 2
    iget-object v0, p1, Lja3/i;->J:Lzt/q;

    .line 3
    iget-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    .line 4
    iget-object v1, v1, Lia3/a;->a:Lkb3/n;

    .line 5
    invoke-direct {p0, v1}, Llb3/b;-><init>(Lkb3/n;)V

    .line 6
    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    .line 7
    iget-object v0, v0, Lia3/a;->a:Lkb3/n;

    .line 8
    new-instance v1, Lja3/g;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lja3/g;-><init>(Lja3/i;I)V

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    new-instance p1, Lkb3/i;

    .line 10
    invoke-direct {p1, v0, v1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    .line 11
    iput-object p1, p0, Lja3/h;->z:Lkb3/i;

    return-void
.end method

.method public constructor <init>(Ljb3/h;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lja3/h;->y:I

    .line 12
    iput-object p1, p0, Lja3/h;->E:Lu93/b;

    .line 13
    iget-object v0, p1, Ljb3/h;->L:Lhb3/k;

    .line 14
    iget-object v1, v0, Lhb3/k;->a:Lhb3/i;

    .line 15
    iget-object v1, v1, Lhb3/i;->a:Lkb3/k;

    .line 16
    invoke-direct {p0, v1}, Llb3/b;-><init>(Lkb3/n;)V

    .line 17
    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    .line 18
    iget-object v0, v0, Lhb3/i;->a:Lkb3/k;

    .line 19
    new-instance v1, Ljb3/d;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Ljb3/d;-><init>(Ljb3/h;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    new-instance p1, Lkb3/i;

    .line 21
    invoke-direct {p1, v0, v1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    .line 22
    iput-object p1, p0, Lja3/h;->z:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lja3/h;->y:I

    const/16 v3, 0xa

    iget-object v4, v0, Lja3/h;->E:Lu93/b;

    packed-switch v1, :pswitch_data_0

    check-cast v4, Ljb3/h;

    iget-object v1, v4, Ljb3/h;->E:Lqa3/k;

    iget-object v5, v4, Ljb3/h;->L:Lhb3/k;

    iget-object v6, v5, Lhb3/k;->d:Lsa3/h;

    invoke-static {v1, v6}, Ljc/x;->t0(Lqa3/k;Lsa3/h;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/w0;

    iget-object v8, v5, Lhb3/k;->h:Lhb3/h0;

    invoke-virtual {v8, v7}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, v5, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->n:Lt93/b;

    invoke-interface {v1, v4}, Lt93/b;->b(Lr93/e;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v6, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Llb3/y;

    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v8

    invoke-interface {v8}, Llb3/q0;->d()Lr93/h;

    move-result-object v8

    instance-of v9, v8, Lr93/f0;

    if-eqz v9, :cond_2

    check-cast v8, Lr93/f0;

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_1

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, v5, Lhb3/k;->a:Lhb3/i;

    iget-object v2, v2, Lhb3/i;->h:Lhb3/o;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v6, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/f0;

    invoke-static {v6}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lva3/c;->a()Lva3/e;

    move-result-object v7

    if-eqz v7, :cond_4

    iget-object v7, v7, Lva3/e;->a:Lva3/f;

    iget-object v7, v7, Lva3/f;->a:Ljava/lang/String;

    if-nez v7, :cond_5

    :cond_4
    invoke-virtual {v6}, Lu93/b;->getName()Lva3/h;

    move-result-object v6

    invoke-virtual {v6}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v7

    const-string v6, "asString(...)"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-interface {v2, v4, v5}, Lhb3/o;->b(Lr93/e;Ljava/util/ArrayList;)V

    :cond_7
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    return-object v1

    :pswitch_0
    check-cast v4, Lja3/i;

    iget-object v8, v4, Lja3/i;->J:Lzt/q;

    iget-object v1, v4, Lja3/i;->H:Lx93/n;

    iget-object v1, v1, Lx93/n;->a:Ljava/lang/Class;

    const-class v5, Ljava/lang/Object;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x2

    sget-object v12, Lm83/y;->w:Lm83/y;

    if-eqz v6, :cond_8

    move-object v5, v12

    goto :goto_6

    :cond_8
    new-instance v6, Lkotlin/jvm/internal/k0;

    invoke-direct {v6, v7}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v9

    if-nez v9, :cond_9

    goto :goto_4

    :cond_9
    move-object v5, v9

    :goto_4
    invoke-virtual {v6, v5}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v6, v1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    iget-object v1, v6, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v5, v5, [Ljava/lang/reflect/Type;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Type;

    new-instance v9, Lx93/p;

    invoke-direct {v9, v6}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v15, Ljava/util/ArrayList;

    const/4 v11, 0x0

    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v6, v4, Lja3/i;->U:Lia3/c;

    sget-object v9, Lfa3/x;->n:Lva3/e;

    const-string v10, "PURELY_IMPLEMENTS_ANNOTATION"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Lia3/c;->T(Lva3/e;)Ls93/b;

    move-result-object v6

    const/4 v9, 0x1

    if-nez v6, :cond_c

    :cond_b
    :goto_7
    const/4 v2, 0x0

    goto/16 :goto_d

    :cond_c
    invoke-interface {v6}, Ls93/b;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v6

    instance-of v10, v6, Lab3/x;

    if-eqz v10, :cond_d

    check-cast v6, Lab3/x;

    goto :goto_8

    :cond_d
    const/4 v6, 0x0

    :goto_8
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_e

    goto :goto_7

    :cond_e
    sget-object v10, Lva3/m;->w:Lva3/m;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    move v14, v11

    :goto_9
    if-ge v14, v13, :cond_15

    invoke-virtual {v6, v14}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_12

    if-eq v11, v9, :cond_10

    if-ne v11, v7, :cond_f

    goto :goto_b

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_10
    const/16 v11, 0x2e

    if-ne v2, v11, :cond_11

    sget-object v2, Lva3/m;->y:Lva3/m;

    :goto_a
    move-object v10, v2

    goto :goto_c

    :cond_11
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_7

    :cond_12
    :goto_b
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_7

    :cond_13
    sget-object v2, Lva3/m;->x:Lva3/m;

    goto :goto_a

    :cond_14
    :goto_c
    add-int/lit8 v14, v14, 0x1

    const/4 v11, 0x0

    goto :goto_9

    :cond_15
    sget-object v2, Lva3/m;->y:Lva3/m;

    if-eq v10, v2, :cond_b

    new-instance v2, Lva3/e;

    invoke-direct {v2, v6}, Lva3/e;-><init>(Ljava/lang/String;)V

    :goto_d
    if-eqz v2, :cond_16

    iget-object v6, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v6}, Lva3/f;->c()Z

    move-result v7

    if-nez v7, :cond_16

    sget-object v7, Lo93/n;->j:Lva3/h;

    const-string v10, "segment"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lva3/f;->h(Lva3/h;)Z

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_e

    :cond_16
    const/4 v2, 0x0

    :goto_e
    if-nez v2, :cond_18

    sget-object v6, Lfa3/j;->a:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v6

    invoke-static {v6}, Lfa3/j;->b(Lva3/e;)Lva3/e;

    move-result-object v6

    if-nez v6, :cond_19

    :cond_17
    :goto_f
    const/4 v2, 0x0

    goto/16 :goto_13

    :cond_18
    move-object v6, v2

    :cond_19
    iget-object v7, v8, Lzt/q;->x:Ljava/lang/Object;

    check-cast v7, Lia3/a;

    iget-object v7, v7, Lia3/a;->o:Lr93/b0;

    sget-object v10, Lz93/c;->H:Lz93/c;

    sget v11, Lcb3/e;->a:I

    const-string v11, "<this>"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v6, Lva3/e;->a:Lva3/f;

    invoke-virtual {v11}, Lva3/f;->c()Z

    invoke-virtual {v6}, Lva3/e;->b()Lva3/e;

    move-result-object v6

    invoke-interface {v7, v6}, Lr93/b0;->F(Lva3/e;)Lr93/k0;

    move-result-object v6

    check-cast v6, Lu93/a0;

    iget-object v6, v6, Lu93/a0;->H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    invoke-virtual {v11}, Lva3/f;->g()Lva3/h;

    move-result-object v7

    invoke-virtual {v6, v7, v10}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v6

    instance-of v7, v6, Lr93/e;

    if-eqz v7, :cond_1a

    check-cast v6, Lr93/e;

    goto :goto_10

    :cond_1a
    const/4 v6, 0x0

    :goto_10
    if-nez v6, :cond_1b

    goto :goto_f

    :cond_1b
    invoke-interface {v6}, Lr93/h;->e()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    iget-object v10, v4, Lja3/i;->P:Lja3/h;

    invoke-virtual {v10}, Lja3/h;->getParameters()Ljava/util/List;

    move-result-object v10

    const-string v11, "getParameters(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    if-ne v11, v7, :cond_1c

    check-cast v10, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v10, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr93/x0;

    new-instance v10, Llb3/v0;

    sget-object v11, Llb3/g1;->y:Llb3/g1;

    invoke-interface {v9}, Lr93/h;->i()Llb3/c0;

    move-result-object v9

    invoke-direct {v10, v9, v11}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1c
    if-ne v11, v9, :cond_17

    if-le v7, v9, :cond_17

    if-nez v2, :cond_17

    new-instance v2, Llb3/v0;

    sget-object v11, Llb3/g1;->y:Llb3/g1;

    invoke-static {v10}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr93/x0;

    invoke-interface {v10}, Lr93/h;->i()Llb3/c0;

    move-result-object v10

    invoke-direct {v2, v10, v11}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    new-instance v10, Li93/j;

    invoke-direct {v10, v9, v7, v9}, Li93/h;-><init>(III)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v10, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_12
    move-object v10, v9

    check-cast v10, Li93/i;

    iget-boolean v10, v10, Li93/i;->y:Z

    if-eqz v10, :cond_1d

    move-object v10, v9

    check-cast v10, Lm83/e0;

    invoke-virtual {v10}, Lm83/e0;->nextInt()I

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1d
    move-object v2, v7

    :cond_1e
    sget-object v7, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Llb3/k0;->y:Llb3/k0;

    invoke-static {v7, v6, v2}, Llb3/o;->h(Llb3/k0;Lr93/e;Ljava/util/List;)Llb3/c0;

    move-result-object v2

    :goto_13
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :cond_1f
    :goto_14
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_24

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lx93/p;

    iget-object v5, v8, Lzt/q;->E:Ljava/lang/Object;

    check-cast v5, La3/p;

    sget-object v6, Llb3/b1;->w:Llb3/b1;

    const/4 v7, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v6, v14, v13, v7}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v6

    invoke-virtual {v5, v11, v6}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v16

    iget-object v5, v8, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Lia3/a;

    iget-object v5, v5, Lia3/a;->r:Ljc/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Llg3/q;

    sget-object v9, Lfa3/a;->E:Lfa3/a;

    move-object v6, v5

    move-object v5, v10

    const/4 v10, 0x1

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v17, v7

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v10}, Llg3/q;-><init>(Ls93/a;ZLzt/q;Lfa3/a;Z)V

    move-object v6, v13

    const/4 v13, 0x0

    move v7, v14

    const/4 v14, 0x0

    move-object v10, v5

    move-object v5, v11

    move-object/from16 v11, v16

    move-object/from16 v9, v17

    move-object/from16 v16, v6

    move/from16 v17, v7

    invoke-virtual/range {v9 .. v14}, Ljc/b;->m(Llg3/q;Llb3/y;Ljava/util/List;Lna3/q;Z)Llb3/y;

    move-result-object v6

    if-nez v6, :cond_20

    move-object v6, v11

    :cond_20
    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->d()Lr93/h;

    move-result-object v7

    instance-of v7, v7, Lr93/f0;

    if-eqz v7, :cond_21

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    if-eqz v2, :cond_22

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v13

    goto :goto_15

    :cond_22
    move-object/from16 v13, v16

    :goto_15
    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    goto :goto_14

    :cond_23
    invoke-static {v6}, Lo93/h;->y(Llb3/y;)Z

    move-result v5

    if-nez v5, :cond_1f

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_24
    const/16 v16, 0x0

    iget-object v5, v4, Lja3/i;->I:Lr93/e;

    if-eqz v5, :cond_25

    invoke-static {v5, v4}, Lcom/squareup/wire/n;->u(Lr93/e;Lr93/e;)Llb3/r0;

    move-result-object v6

    new-instance v7, Llb3/a1;

    invoke-direct {v7, v6}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-interface {v5}, Lr93/e;->i()Llb3/c0;

    move-result-object v5

    sget-object v6, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v7, v5, v6}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v5

    goto :goto_16

    :cond_25
    move-object/from16 v5, v16

    :goto_16
    invoke-static {v1, v5}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_27

    iget-object v2, v8, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lia3/a;

    iget-object v2, v2, Lia3/a;->f:Lhb3/o;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v15, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_26

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lma3/e;

    const-string v7, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lx93/p;

    invoke-virtual {v6}, Lx93/p;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_26
    invoke-interface {v2, v4, v5}, Lhb3/o;->b(Lr93/e;Ljava/util/ArrayList;)V

    :cond_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_28

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    :goto_18
    check-cast v1, Ljava/util/Collection;

    goto :goto_19

    :cond_28
    iget-object v1, v8, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->o:Lr93/b0;

    invoke-interface {v1}, Lr93/b0;->c()Lo93/h;

    move-result-object v1

    invoke-virtual {v1}, Lo93/h;->e()Llb3/c0;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_18

    :goto_19
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lr93/h;
    .locals 1

    iget v0, p0, Lja3/h;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Ljb3/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Lja3/i;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()Z
    .locals 1

    iget v0, p0, Lja3/h;->y:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Lr93/v0;
    .locals 1

    iget v0, p0, Lja3/h;->y:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr93/v0;->x:Lr93/v0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Lja3/i;

    iget-object v0, v0, Lja3/i;->J:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->m:Lr93/v0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    iget v0, p0, Lja3/h;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/h;->z:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/h;->z:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()Lr93/e;
    .locals 1

    iget v0, p0, Lja3/h;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Ljb3/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Lja3/i;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lja3/h;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Ljb3/h;

    invoke-virtual {v0}, Lu93/b;->getName()Lva3/h;

    move-result-object v0

    iget-object v0, v0, Lva3/h;->w:Ljava/lang/String;

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/h;->E:Lu93/b;

    check-cast v0, Lja3/i;

    invoke-virtual {v0}, Lu93/b;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
