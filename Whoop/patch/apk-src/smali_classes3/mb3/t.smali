.class public final Lmb3/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmb3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb3/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmb3/t;->a:Lmb3/t;

    return-void
.end method

.method public static a(Ljava/util/AbstractCollection;Lc93/m;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-string v1, "iterator(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/c0;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/c0;

    if-eq v3, v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;)Llb3/c0;
    .locals 18

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0xa

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/c0;

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    instance-of v5, v5, Llb3/x;

    if-eqz v5, :cond_2

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v5

    const-string v6, "getSupertypes(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/y;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object v5

    invoke-virtual {v2}, Llb3/y;->k0()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5, v3}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v5

    :cond_0
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v1, Lmb3/s;->w:Lmb3/q;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/f1;

    invoke-virtual {v1, v5}, Lmb3/s;->a(Llb3/f1;)Lmb3/s;

    move-result-object v1

    goto :goto_2

    :cond_4
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "<this>"

    const/4 v7, 0x0

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/c0;

    sget-object v8, Lmb3/s;->z:Lmb3/p;

    if-ne v1, v8, :cond_8

    instance-of v8, v5, Lmb3/h;

    if-eqz v8, :cond_5

    check-cast v5, Lmb3/h;

    new-instance v8, Lmb3/h;

    iget-object v9, v5, Lmb3/h;->x:Lob3/b;

    iget-object v10, v5, Lmb3/h;->y:Lmb3/i;

    iget-object v11, v5, Lmb3/h;->z:Llb3/f1;

    iget-object v12, v5, Lmb3/h;->E:Llb3/k0;

    iget-boolean v13, v5, Lmb3/h;->F:Z

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZZ)V

    move-object v5, v8

    :cond_5
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v7}, Llb3/d;->m(Llb3/f1;Z)Llb3/l;

    move-result-object v6

    if-eqz v6, :cond_7

    :cond_6
    move-object v5, v6

    goto :goto_4

    :cond_7
    invoke-static {v5}, Llb3/o;->g(Llb3/f1;)Llb3/c0;

    move-result-object v6

    if-nez v6, :cond_6

    invoke-virtual {v5, v7}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v5

    :cond_8
    :goto_4
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v1, p1

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/c0;

    invoke-virtual {v4}, Llb3/y;->Y()Llb3/k0;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v4, "Empty collection can\'t be reduced."

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v8, 0x0

    const-string v9, "other"

    if-eqz v5, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/k0;

    check-cast v1, Llb3/k0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Llb3/k0;->x:Lwe/o;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lrb3/d;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual {v5}, Lrb3/d;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_6

    :cond_b
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget-object v10, v10, Lwe/o;->w:Ljava/lang/Object;

    check-cast v10, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v10

    const-string v11, "<get-values>(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    iget-object v12, v1, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v12, v11}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Llb3/g;

    iget-object v13, v5, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v13, v11}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Llb3/g;

    if-nez v12, :cond_d

    if-eqz v11, :cond_c

    invoke-virtual {v11, v12}, Llb3/g;->c(Llb3/g;)Llb3/g;

    move-result-object v11

    goto :goto_8

    :cond_c
    move-object v11, v8

    goto :goto_8

    :cond_d
    invoke-virtual {v12, v11}, Llb3/g;->c(Llb3/g;)Llb3/g;

    move-result-object v11

    :goto_8
    invoke-static {v9, v11}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_7

    :cond_e
    invoke-static {v9}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object v1

    goto :goto_6

    :cond_f
    check-cast v1, Llb3/k0;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    if-ne v0, v3, :cond_10

    invoke-static {v2}, Lm83/s;->o1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    goto/16 :goto_c

    :cond_10
    new-instance v10, Landroidx/room/v0;

    const/16 v16, 0x0

    const/16 v17, 0xa

    const/4 v11, 0x2

    const-class v13, Lmb3/t;

    const-string v14, "isStrictSupertype"

    const-string v15, "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z"

    move-object/from16 v12, p0

    invoke-direct/range {v10 .. v17}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v2, v10}, Lmb3/t;->a(Ljava/util/AbstractCollection;Lc93/m;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    sget-object v5, Lab3/n;->w:[Lab3/n;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_11

    goto/16 :goto_b

    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Llb3/c0;

    check-cast v4, Llb3/c0;

    if-eqz v4, :cond_14

    if-nez v10, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v11

    invoke-virtual {v10}, Llb3/y;->i0()Llb3/q0;

    move-result-object v12

    instance-of v13, v11, Lab3/o;

    if-eqz v13, :cond_13

    instance-of v14, v12, Lab3/o;

    if-eqz v14, :cond_13

    check-cast v11, Lab3/o;

    iget-object v4, v11, Lab3/o;->w:Ljava/util/Set;

    check-cast v12, Lab3/o;

    iget-object v10, v12, Lab3/o;->w:Ljava/util/Set;

    check-cast v4, Ljava/lang/Iterable;

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    invoke-static {v4, v10}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    new-instance v10, Lab3/o;

    invoke-direct {v10, v4}, Lab3/o;-><init>(Ljava/util/Set;)V

    sget-object v4, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Llb3/k0;->y:Llb3/k0;

    const-string v11, "attributes"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lnb3/h;->y:Lnb3/h;

    const-string v12, "unknown integer literal type"

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v3, v12}, Lnb3/l;->a(Lnb3/h;Z[Ljava/lang/String;)Lnb3/g;

    move-result-object v11

    sget-object v12, Lm83/y;->w:Lm83/y;

    invoke-static {v12, v11, v4, v10, v7}, Llb3/o;->k(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v4

    goto :goto_9

    :cond_13
    if-eqz v13, :cond_15

    check-cast v11, Lab3/o;

    iget-object v4, v11, Lab3/o;->w:Ljava/util/Set;

    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    move-object v4, v10

    goto :goto_9

    :cond_14
    :goto_a
    move-object v4, v8

    goto :goto_9

    :cond_15
    instance-of v10, v12, Lab3/o;

    if-eqz v10, :cond_14

    check-cast v12, Lab3/o;

    iget-object v10, v12, Lab3/o;->w:Ljava/util/Set;

    invoke-interface {v10, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_14

    goto :goto_9

    :cond_16
    move-object v8, v4

    check-cast v8, Llb3/c0;

    :goto_b
    if-eqz v8, :cond_17

    move-object v0, v8

    goto :goto_c

    :cond_17
    new-instance v9, Landroidx/room/v0;

    sget-object v3, Lmb3/k;->b:Lmb3/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, Lmb3/j;->b:Lmb3/l;

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v10, 0x2

    const-class v12, Lmb3/l;

    const-string v13, "equalTypes"

    const-string v14, "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z"

    invoke-direct/range {v9 .. v16}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v0, v9}, Lmb3/t;->a(Ljava/util/AbstractCollection;Lc93/m;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_18

    invoke-static {v0}, Lm83/s;->o1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    goto :goto_c

    :cond_18
    new-instance v0, Llb3/x;

    invoke-direct {v0, v2}, Llb3/x;-><init>(Ljava/util/AbstractCollection;)V

    invoke-virtual {v0}, Llb3/x;->a()Llb3/c0;

    move-result-object v0

    :goto_c
    invoke-virtual {v0, v1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object v0

    return-object v0

    :cond_19
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
