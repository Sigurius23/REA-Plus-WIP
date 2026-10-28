.class public final Lqx/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqx/s;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqx/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/reflect/Type;Ljava/lang/Class;)V
    .locals 4

    invoke-static {p0}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No JsonAdapter for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", you should probably use "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " instead of "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final create(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;
    .locals 11

    iget v0, p0, Lqx/f;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_1

    sget-object p1, Lqx/s0;->b:Lqx/p0;

    goto/16 :goto_1

    :cond_1
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_2

    sget-object p1, Lqx/s0;->c:Lqx/p0;

    goto/16 :goto_1

    :cond_2
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_3

    sget-object p1, Lqx/s0;->d:Lqx/p0;

    goto/16 :goto_1

    :cond_3
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_4

    sget-object p1, Lqx/s0;->e:Lqx/p0;

    goto/16 :goto_1

    :cond_4
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_5

    sget-object p1, Lqx/s0;->f:Lqx/p0;

    goto/16 :goto_1

    :cond_5
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_6

    sget-object p1, Lqx/s0;->g:Lqx/p0;

    goto/16 :goto_1

    :cond_6
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_7

    sget-object p1, Lqx/s0;->h:Lqx/p0;

    goto/16 :goto_1

    :cond_7
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_8

    sget-object p1, Lqx/s0;->i:Lqx/p0;

    goto/16 :goto_1

    :cond_8
    const-class p2, Ljava/lang/Boolean;

    if-ne p1, p2, :cond_9

    sget-object p1, Lqx/s0;->b:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto/16 :goto_1

    :cond_9
    const-class p2, Ljava/lang/Byte;

    if-ne p1, p2, :cond_a

    sget-object p1, Lqx/s0;->c:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto/16 :goto_1

    :cond_a
    const-class p2, Ljava/lang/Character;

    if-ne p1, p2, :cond_b

    sget-object p1, Lqx/s0;->d:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto/16 :goto_1

    :cond_b
    const-class p2, Ljava/lang/Double;

    if-ne p1, p2, :cond_c

    sget-object p1, Lqx/s0;->e:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_c
    const-class p2, Ljava/lang/Float;

    if-ne p1, p2, :cond_d

    sget-object p1, Lqx/s0;->f:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_d
    const-class p2, Ljava/lang/Integer;

    if-ne p1, p2, :cond_e

    sget-object p1, Lqx/s0;->g:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_e
    const-class p2, Ljava/lang/Long;

    if-ne p1, p2, :cond_f

    sget-object p1, Lqx/s0;->h:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_f
    const-class p2, Ljava/lang/Short;

    if-ne p1, p2, :cond_10

    sget-object p1, Lqx/s0;->i:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_10
    const-class p2, Ljava/lang/String;

    if-ne p1, p2, :cond_11

    sget-object p1, Lqx/s0;->j:Lqx/p0;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_11
    const-class p2, Ljava/lang/Object;

    if-ne p1, p2, :cond_12

    new-instance p1, Lqx/r0;

    invoke-direct {p1, p3}, Lqx/r0;-><init>(Lqx/l0;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_12
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3, p1, p2}, Lrx/f;->c(Lqx/l0;Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    if-eqz p1, :cond_13

    goto :goto_1

    :cond_13
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_14

    new-instance p1, Lqx/q0;

    invoke-direct {p1, p2}, Lqx/q0;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_14
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_15

    goto :goto_2

    :cond_15
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/util/Map;

    if-eq p2, v0, :cond_16

    :goto_2
    const/4 p1, 0x0

    goto :goto_3

    :cond_16
    invoke-static {p1, p2}, Landroidx/room/c1;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object p1

    new-instance p2, Lqx/g;

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-direct {p2, p3, v0, p1}, Lqx/g;-><init>(Lqx/l0;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    invoke-virtual {p2}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    :goto_3
    return-object p1

    :pswitch_2
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    const/4 v1, 0x0

    if-nez p2, :cond_17

    goto :goto_5

    :cond_17
    const-class p2, Ljava/util/List;

    if-eq v0, p2, :cond_19

    const-class p2, Ljava/util/Collection;

    if-ne v0, p2, :cond_18

    goto :goto_4

    :cond_18
    const-class p2, Ljava/util/Set;

    if-ne v0, p2, :cond_1a

    invoke-static {p1}, Landroidx/room/c1;->j(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    sget-object p2, Lrx/f;->a:Ljava/util/Set;

    invoke-virtual {p3, p1, p2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    new-instance p2, Lqx/n;

    invoke-direct {p2, p1}, Lqx/n;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    invoke-virtual {p2}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    goto :goto_5

    :cond_19
    :goto_4
    invoke-static {p1}, Landroidx/room/c1;->j(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    sget-object p2, Lrx/f;->a:Ljava/util/Set;

    invoke-virtual {p3, p1, p2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    new-instance p2, Lqx/m;

    invoke-direct {p2, p1}, Lqx/o;-><init>(Lcom/squareup/moshi/JsonAdapter;)V

    invoke-virtual {p2}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    :cond_1a
    :goto_5
    return-object v1

    :pswitch_3
    instance-of v0, p1, Ljava/lang/Class;

    if-nez v0, :cond_1b

    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-nez v0, :cond_1b

    goto/16 :goto_c

    :cond_1b
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-nez v1, :cond_30

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_1c

    goto/16 :goto_c

    :cond_1c
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1d

    goto/16 :goto_c

    :cond_1d
    invoke-static {v0}, Lrx/f;->e(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_1f

    const-class p2, Ljava/util/List;

    invoke-static {p1, p2}, Lqx/f;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    const-class p2, Ljava/util/Set;

    invoke-static {p1, p2}, Lqx/f;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    const-class p2, Ljava/util/Map;

    invoke-static {p1, p2}, Lqx/f;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    const-class p2, Ljava/util/Collection;

    invoke-static {p1, p2}, Lqx/f;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Platform "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    instance-of p3, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p3, :cond_1e

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " in "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, " requires explicit JsonAdapter to be registered"

    invoke-static {p2, p3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result p2

    if-nez p2, :cond_2f

    invoke-virtual {v0}, Ljava/lang/Class;->isLocalClass()Z

    move-result p2

    if-nez p2, :cond_2e

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object p2

    if-eqz p2, :cond_21

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result p2

    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p2

    if-eqz p2, :cond_20

    goto :goto_6

    :cond_20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Cannot serialize non-static nested class "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result p2

    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result p2

    if-nez p2, :cond_2d

    sget-object p2, Lrx/f;->d:Ljava/lang/Class;

    if-eqz p2, :cond_23

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_22

    goto :goto_7

    :cond_22
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Cannot serialize Kotlin type "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_23
    :goto_7
    invoke-static {v0}, Ltx/f;->L(Ljava/lang/Class;)Ltx/f;

    move-result-object p2

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    :goto_8
    const-class v1, Ljava/lang/Object;

    if-eq p1, v1, :cond_2c

    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lrx/f;->e(Ljava/lang/Class;)Z

    move-result v2

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v4, :cond_2b

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v7

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-nez v8, :cond_2a

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v8

    if-eqz v8, :cond_24

    goto/16 :goto_b

    :cond_24
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v8

    if-nez v8, :cond_25

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v7

    if-nez v7, :cond_25

    if-nez v2, :cond_2a

    :cond_25
    const-class v7, Lqx/q;

    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Lqx/q;

    if-eqz v7, :cond_26

    invoke-interface {v7}, Lqx/q;->ignore()Z

    move-result v8

    if-eqz v8, :cond_26

    goto :goto_b

    :cond_26
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v8

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p1, v1, v8, v9}, Lrx/f;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-interface {v6}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v9

    invoke-static {v9}, Lrx/f;->f([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p3, v8, v9, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v8

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    if-nez v7, :cond_27

    goto :goto_a

    :cond_27
    invoke-interface {v7}, Lqx/q;->name()Ljava/lang/String;

    move-result-object v7

    const-string v9, "\u0000"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_28

    goto :goto_a

    :cond_28
    move-object v10, v7

    :goto_a
    new-instance v7, Lqx/k;

    invoke-direct {v7, v10, v6, v8}, Lqx/k;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/squareup/moshi/JsonAdapter;)V

    invoke-virtual {v0, v10, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqx/k;

    if-nez v7, :cond_29

    goto :goto_b

    :cond_29
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Conflicting fields:\n    "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, v7, Lqx/k;->b:Ljava/lang/reflect/Field;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "\n    "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    :goto_b
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_9

    :cond_2b
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p1, v1, v2, v3}, Lrx/f;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    move-result-object p1

    goto/16 :goto_8

    :cond_2c
    new-instance p1, Lqx/l;

    invoke-direct {p1, p2, v0}, Lqx/l;-><init>(Ltx/f;Ljava/util/TreeMap;)V

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_d

    :cond_2d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Cannot serialize abstract class "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Cannot serialize local class "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Cannot serialize anonymous class "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_30
    :goto_c
    const/4 p1, 0x0

    :goto_d
    return-object p1

    :pswitch_4
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    const/4 v1, 0x0

    if-eqz v0, :cond_31

    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p1

    goto :goto_e

    :cond_31
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_32

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    goto :goto_e

    :cond_32
    move-object p1, v1

    :goto_e
    if-nez p1, :cond_33

    goto :goto_f

    :cond_33
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_34

    goto :goto_f

    :cond_34
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    sget-object v0, Lrx/f;->a:Ljava/util/Set;

    invoke-virtual {p3, p1, v0, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    new-instance p3, Lqx/g;

    invoke-direct {p3, p2, p1}, Lqx/g;-><init>(Ljava/lang/Class;Lcom/squareup/moshi/JsonAdapter;)V

    invoke-virtual {p3}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    :goto_f
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
