.class public final Lqx/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqx/i0;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lqx/i0;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 26

    if-eqz p1, :cond_17

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    :goto_0
    const-class v3, Ljava/lang/Object;

    if-eq v2, v3, :cond_14

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    array-length v5, v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_13

    aget-object v11, v3, v6

    const-class v7, Lqx/t0;

    invoke-virtual {v11, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v7

    const-string v8, "Nullable"

    const-class v9, Lcom/squareup/moshi/JsonAdapter;

    const/4 v10, 0x1

    const-string v12, "\n    "

    const-string v13, "Unexpected signature for "

    sget-object v14, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eqz v7, :cond_8

    invoke-virtual {v11, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v15

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v16

    move/from16 v17, v10

    array-length v10, v7

    const/16 v19, 0x0

    const/4 v4, 0x2

    if-lt v10, v4, :cond_3

    aget-object v10, v7, v19

    const-class v4, Lqx/c0;

    if-ne v10, v4, :cond_3

    if-ne v15, v14, :cond_3

    array-length v4, v7

    const/4 v10, 0x2

    :goto_2
    if-ge v10, v4, :cond_2

    move-object/from16 v20, v2

    aget-object v2, v7, v10

    move-object/from16 v21, v3

    instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;

    if-nez v3, :cond_0

    goto :goto_3

    :cond_0
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    if-eq v2, v9, :cond_1

    :goto_3
    move-object v4, v8

    move-object v3, v9

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    move/from16 v2, v17

    goto :goto_4

    :cond_1
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    goto :goto_2

    :cond_2
    move-object/from16 v20, v2

    move-object/from16 v21, v3

    aget-object v2, v16, v17

    invoke-static {v2}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, Lqx/b;

    move-object v4, v8

    aget-object v8, v7, v17

    move-object v10, v12

    array-length v12, v7

    move-object v7, v14

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x2

    move-object/from16 v24, v7

    move-object/from16 v22, v10

    move-object/from16 v23, v16

    move-object/from16 v10, p1

    move-object v7, v3

    move-object v3, v9

    move-object v9, v2

    move/from16 v2, v17

    invoke-direct/range {v7 .. v15}, Lqx/b;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZI)V

    move-object/from16 v25, v24

    goto :goto_7

    :cond_3
    move-object/from16 v20, v2

    move-object/from16 v21, v3

    goto :goto_3

    :goto_4
    array-length v8, v7

    if-ne v8, v2, :cond_7

    move-object/from16 v8, v24

    if-eq v15, v8, :cond_7

    sget-object v9, Lrx/f;->a:Ljava/util/Set;

    invoke-interface {v11}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v9

    invoke-static {v9}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v17

    aget-object v9, v16, v19

    invoke-static {v9}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v9

    aget-object v10, v16, v19

    array-length v12, v10

    move/from16 v13, v19

    :goto_5
    if-ge v13, v12, :cond_5

    aget-object v14, v10, v13

    invoke-interface {v14}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move v13, v2

    goto :goto_6

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_5
    move/from16 v13, v19

    :goto_6
    new-instance v10, Lqx/c;

    move-object/from16 v24, v8

    aget-object v8, v7, v19

    array-length v12, v7

    const/16 v18, 0x0

    move-object/from16 v16, v9

    move-object v14, v7

    move-object v7, v10

    move-object/from16 v25, v24

    move-object/from16 v10, p1

    invoke-direct/range {v7 .. v18}, Lqx/c;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;I)V

    :goto_7
    iget-object v8, v7, Lqx/d;->a:Ljava/lang/reflect/Type;

    iget-object v9, v7, Lqx/d;->b:Ljava/util/Set;

    invoke-static {v0, v8, v9}, Lqx/e;->a(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lqx/d;

    move-result-object v8

    if-nez v8, :cond_6

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, v22

    move-object/from16 v7, v23

    goto :goto_8

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Conflicting @ToJson methods:\n    "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v8, Lqx/d;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v8, v22

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Lqx/d;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    move-object/from16 v7, v23

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move-object v4, v8

    move-object v3, v9

    move v2, v10

    move-object v8, v12

    move-object v7, v13

    move-object/from16 v25, v14

    const/16 v19, 0x0

    :goto_8
    const-class v9, Lqx/p;

    invoke-virtual {v11, v9}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v11, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move-object/from16 v22, v8

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v8

    sget-object v9, Lrx/f;->a:Ljava/util/Set;

    invoke-interface {v11}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v9

    invoke-static {v9}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v14

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v10

    array-length v12, v14

    if-lt v12, v2, :cond_d

    aget-object v12, v14, v19

    const-class v13, Lcom/squareup/moshi/JsonReader;

    if-ne v12, v13, :cond_d

    move-object/from16 v12, v25

    if-eq v8, v12, :cond_c

    array-length v13, v14

    move v15, v2

    :goto_9
    if-ge v15, v13, :cond_b

    aget-object v2, v14, v15

    move/from16 v23, v5

    instance-of v5, v2, Ljava/lang/reflect/ParameterizedType;

    if-nez v5, :cond_9

    goto :goto_a

    :cond_9
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    if-eq v2, v3, :cond_a

    :goto_a
    move-object/from16 v2, v22

    goto :goto_b

    :cond_a
    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v23

    const/4 v2, 0x1

    goto :goto_9

    :cond_b
    move/from16 v23, v5

    new-instance v7, Lqx/b;

    array-length v12, v14

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/4 v13, 0x1

    move-object/from16 v10, p1

    move-object/from16 v2, v22

    invoke-direct/range {v7 .. v15}, Lqx/b;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZI)V

    goto :goto_e

    :cond_c
    move/from16 v23, v5

    goto :goto_a

    :cond_d
    move/from16 v23, v5

    move-object/from16 v2, v22

    move-object/from16 v12, v25

    :goto_b
    array-length v3, v14

    const/4 v5, 0x1

    if-ne v3, v5, :cond_11

    if-eq v8, v12, :cond_11

    aget-object v3, v10, v19

    invoke-static {v3}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v16

    aget-object v3, v10, v19

    array-length v7, v3

    move/from16 v10, v19

    :goto_c
    if-ge v10, v7, :cond_f

    aget-object v12, v3, v10

    invoke-interface {v12}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    move v13, v5

    goto :goto_d

    :cond_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    :cond_f
    move/from16 v13, v19

    :goto_d
    new-instance v7, Lqx/c;

    array-length v12, v14

    const/16 v18, 0x1

    move-object v15, v8

    move-object/from16 v17, v9

    move-object/from16 v10, p1

    invoke-direct/range {v7 .. v18}, Lqx/c;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;I)V

    :goto_e
    iget-object v3, v7, Lqx/d;->a:Ljava/lang/reflect/Type;

    iget-object v4, v7, Lqx/d;->b:Ljava/util/Set;

    invoke-static {v1, v3, v4}, Lqx/e;->a(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lqx/d;

    move-result-object v3

    if-nez v3, :cond_10

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Conflicting @FromJson methods:\n    "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v3, Lqx/d;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Lqx/d;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move/from16 v23, v5

    :goto_f
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move/from16 v5, v23

    goto/16 :goto_1

    :cond_13
    move-object/from16 v20, v2

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto/16 :goto_0

    :cond_14
    const/16 v19, 0x0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_10

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Expected at least one @ToJson or @FromJson method on "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    :goto_10
    new-instance v2, Lqx/e;

    move/from16 v3, v19

    invoke-direct {v2, v3, v0, v1}, Lqx/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lqx/i0;->c(Lqx/s;)V

    return-void

    :cond_17
    move-object/from16 v0, p0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "adapter == null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V
    .locals 2

    sget-object v0, Lqx/l0;->d:Ljava/util/ArrayList;

    new-instance v0, Lqx/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lqx/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lqx/i0;->c(Lqx/s;)V

    return-void
.end method

.method public final c(Lqx/s;)V
    .locals 2

    if-eqz p1, :cond_0

    iget v0, p0, Lqx/i0;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lqx/i0;->b:I

    iget-object v1, p0, Lqx/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "factory == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
