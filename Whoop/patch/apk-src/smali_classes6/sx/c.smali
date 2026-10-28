.class public final Lsx/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqx/s;


# virtual methods
.method public final create(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;
    .locals 17

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    const-string v3, "type"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "annotations"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    const-string v0, "getRawType(this)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-class v0, Lkotlin/Metadata;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v4}, Lrx/f;->e(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    :try_start_0
    invoke-static {v2, v1, v4}, Lrx/f;->c(Lqx/l0;Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_5

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v5, v5, Ljava/lang/ClassNotFoundException;

    if-eqz v5, :cond_30

    :cond_5
    invoke-virtual {v4}, Ljava/lang/Class;->isLocalClass()Z

    move-result v0

    if-nez v0, :cond_2f

    invoke-static {v4}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->isAbstract()Z

    move-result v5

    if-nez v5, :cond_2e

    invoke-interface {v0}, Lj93/d;->isInner()Z

    move-result v5

    if-nez v5, :cond_2d

    invoke-interface {v0}, Lj93/d;->getObjectInstance()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2c

    invoke-interface {v0}, Lj93/d;->isSealed()Z

    move-result v5

    if-nez v5, :cond_2b

    invoke-static {v0}, Lk93/c;->a(Lj93/d;)Lj93/g;

    move-result-object v5

    if-nez v5, :cond_6

    :goto_0
    return-object v3

    :cond_6
    invoke-interface {v5}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    const/16 v7, 0xa

    invoke-static {v6, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-static {v8}, Lm83/g0;->W(I)I

    move-result v8

    const/16 v9, 0x10

    if-ge v8, v9, :cond_7

    move v8, v9

    :cond_7
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lj93/q;

    invoke-interface {v10}, Lj93/q;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_8
    invoke-static {v5}, Lx30/s0;->G(Lj93/c;)V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getData()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getAllNonStaticMembers()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lkotlin/reflect/jvm/internal/DescriptorKCallable;

    invoke-virtual {v11}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v12

    invoke-interface {v12}, Lr93/b;->B()Lr93/q0;

    move-result-object v12

    if-eqz v12, :cond_a

    goto :goto_2

    :cond_a
    instance-of v11, v11, Lj93/w;

    if-eqz v11, :cond_9

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v10, 0x0

    if-eqz v8, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lj93/w;

    invoke-interface {v14}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Lj93/q;

    invoke-static {v14}, Lx30/s0;->G(Lj93/c;)V

    invoke-interface {v14}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/lang/annotation/Annotation;

    instance-of v12, v12, Lqx/q;

    if-eqz v12, :cond_d

    goto :goto_4

    :cond_e
    move-object v11, v3

    :goto_4
    check-cast v11, Lqx/q;

    invoke-interface {v14}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    if-eqz v15, :cond_11

    invoke-interface {v15}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v8, v12}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    if-nez v11, :cond_11

    invoke-interface {v15}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ljava/lang/annotation/Annotation;

    instance-of v13, v13, Lqx/q;

    if-eqz v13, :cond_f

    goto :goto_5

    :cond_10
    move-object v12, v3

    :goto_5
    move-object v11, v12

    check-cast v11, Lqx/q;

    :cond_11
    invoke-static {v14}, Lo73/a;->G(Lj93/z;)Ljava/lang/reflect/Field;

    move-result-object v12

    if-eqz v12, :cond_12

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v12

    goto :goto_6

    :cond_12
    move v12, v10

    :goto_6
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v12

    if-eqz v12, :cond_14

    if-eqz v15, :cond_c

    invoke-interface {v15}, Lj93/q;->isOptional()Z

    move-result v8

    if-eqz v8, :cond_13

    goto/16 :goto_3

    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No default value for transient constructor "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    if-eqz v11, :cond_16

    invoke-interface {v11}, Lqx/q;->ignore()Z

    move-result v12

    const/4 v13, 0x1

    if-ne v12, v13, :cond_16

    if-eqz v15, :cond_c

    invoke-interface {v15}, Lj93/q;->isOptional()Z

    move-result v8

    if-eqz v8, :cond_15

    goto/16 :goto_3

    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No default value for ignored constructor "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    if-eqz v15, :cond_18

    invoke-interface {v15}, Lj93/q;->getType()Lj93/a0;

    move-result-object v12

    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_17

    goto :goto_7

    :cond_17
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v14}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' has a constructor parameter of type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v15}, Lj93/q;->getType()Lj93/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but a property of type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_18
    :goto_7
    instance-of v12, v14, Lj93/l;

    if-nez v12, :cond_19

    if-eqz v15, :cond_c

    :cond_19
    if-eqz v11, :cond_1c

    invoke-interface {v11}, Lqx/q;->name()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1c

    const-string v12, "\u0000"

    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    goto :goto_8

    :cond_1a
    move-object v11, v3

    :goto_8
    if-nez v11, :cond_1b

    goto :goto_a

    :cond_1b
    :goto_9
    move-object v12, v11

    goto :goto_b

    :cond_1c
    :goto_a
    invoke-interface {v14}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v11

    goto :goto_9

    :goto_b
    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v11

    invoke-interface {v11}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v11

    instance-of v13, v11, Lj93/d;

    if-eqz v13, :cond_22

    check-cast v11, Lj93/d;

    invoke-interface {v11}, Lj93/d;->isValue()Z

    move-result v13

    if-eqz v13, :cond_21

    invoke-static {v11}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v11

    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v13

    invoke-interface {v13}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_1d

    goto :goto_e

    :cond_1d
    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v13

    invoke-interface {v13}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_20

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Lj93/d0;

    iget-object v7, v7, Lj93/d0;->b:Lj93/a0;

    if-eqz v7, :cond_1e

    invoke-static {v7}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v7

    goto :goto_d

    :cond_1e
    const/4 v7, 0x0

    :goto_d
    if-eqz v7, :cond_1f

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    const/16 v7, 0xa

    goto :goto_c

    :cond_20
    new-array v7, v10, [Ljava/lang/reflect/Type;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/reflect/Type;

    array-length v7, v3

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/reflect/Type;

    invoke-static {v11, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v11

    goto :goto_e

    :cond_21
    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v3

    invoke-static {v3}, Lo73/a;->I(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v11

    goto :goto_e

    :cond_22
    instance-of v3, v11, Lj93/b0;

    if-eqz v3, :cond_24

    invoke-interface {v14}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v3

    invoke-static {v3}, Lo73/a;->I(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v11

    :goto_e
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v1, v4, v11, v3}, Lrx/f;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    move-result-object v3

    new-array v7, v10, [Ljava/lang/annotation/Annotation;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/annotation/Annotation;

    invoke-static {v7}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v7

    invoke-interface {v14}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v3, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v13

    invoke-interface {v14}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v11, Lsx/a;

    if-eqz v15, :cond_23

    invoke-interface {v15}, Lj93/q;->getIndex()I

    move-result v7

    :goto_f
    move/from16 v16, v7

    goto :goto_10

    :cond_23
    const/4 v7, -0x1

    goto :goto_f

    :goto_10
    invoke-direct/range {v11 .. v16}, Lsx/a;-><init>(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lj93/w;Lj93/q;I)V

    invoke-interface {v6, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    const/16 v7, 0xa

    goto/16 :goto_3

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not possible!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/q;

    invoke-interface {v2}, Lj93/q;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsx/a;

    if-nez v3, :cond_27

    invoke-interface {v2}, Lj93/q;->isOptional()Z

    move-result v4

    if-eqz v4, :cond_26

    goto :goto_12

    :cond_26
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No property for required constructor "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_27
    :goto_12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move/from16 v16, v1

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsx/a;

    add-int/lit8 v3, v16, 0x1

    iget-object v12, v1, Lsx/a;->a:Ljava/lang/String;

    iget-object v13, v1, Lsx/a;->b:Lcom/squareup/moshi/JsonAdapter;

    iget-object v14, v1, Lsx/a;->c:Lj93/w;

    iget-object v15, v1, Lsx/a;->d:Lj93/q;

    const-string v1, "jsonName"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Lsx/a;

    invoke-direct/range {v11 .. v16}, Lsx/a;-><init>(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lj93/w;Lj93/q;I)V

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v16, v3

    goto :goto_13

    :cond_29
    invoke-static {v0}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsx/a;

    iget-object v4, v4, Lsx/a;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_2a
    new-array v3, v10, [Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    new-instance v3, Lqx/q0;

    invoke-direct {v3, v5, v0, v1, v2}, Lqx/q0;-><init>(Lj93/g;Ljava/util/ArrayList;Ljava/util/ArrayList;Lqx/v;)V

    invoke-virtual {v3}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    return-object v0

    :cond_2b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot reflectively serialize sealed class "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Please register an adapter."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2c
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Cannot serialize object declaration "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2d
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Cannot serialize inner class "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2e
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Cannot serialize abstract class "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2f
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Cannot serialize local class or object expression "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_30
    throw v0
.end method
