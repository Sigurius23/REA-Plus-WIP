.class public final Lcom/squareup/wire/g;
.super Lcom/squareup/wire/j;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/Class;

.field public final e:Ljava/util/LinkedHashMap;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lne3/l;->E:Lne3/l;

    iput-object v0, p0, Lcom/squareup/wire/j;->a:Lne3/l;

    iput-object p1, p0, Lcom/squareup/wire/g;->d:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    array-length p1, p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/squareup/wire/g;->e:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/squareup/wire/g;->f:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/squareup/wire/g;->g:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Lcom/squareup/wire/l;
    .locals 15

    iget-object v0, p0, Lcom/squareup/wire/g;->d:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    const-string v2, "declaredFields"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x0

    if-ge v5, v3, :cond_4

    aget-object v7, v1, v5

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v8

    const-string v9, "field.declaredAnnotations"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    array-length v10, v8

    move v11, v4

    :goto_1
    if-ge v11, v10, :cond_1

    aget-object v12, v8, v11

    const-class v13, Lcom/squareup/wire/a0;

    invoke-virtual {v13, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v9}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/squareup/wire/a0;

    if-eqz v8, :cond_2

    new-instance v6, Lcom/squareup/wire/f;

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    const-string v8, "field.type"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    new-instance v1, Lb2/d;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Lb2/d;-><init>(I)V

    invoke-static {v2, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lm83/m;

    invoke-direct {v2}, Lm83/m;-><init>()V

    new-instance v3, Lm83/m;

    invoke-direct {v3}, Lm83/m;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_c

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v5, "messageType.constructors"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v0

    move v7, v4

    :goto_2
    if-ge v7, v5, :cond_b

    aget-object v8, v0, v7

    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    move-result v9

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    if-ne v9, v10, :cond_a

    invoke-virtual {v8}, Ljava/lang/reflect/Executable;->getParameters()[Ljava/lang/reflect/Parameter;

    move-result-object v0

    const-string v5, "constructor.parameters"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    array-length v7, v0

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    array-length v7, v0

    move v9, v4

    move v10, v9

    :goto_3
    if-ge v9, v7, :cond_9

    aget-object v11, v0, v9

    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v11}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    move-result-object v13

    const-class v14, Ljava/util/List;

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    invoke-virtual {v11}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    move-result-object v11

    const-class v13, Ljava/util/Map;

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v11

    if-ne v10, v11, :cond_7

    iget-object v10, p0, Lcom/squareup/wire/j;->b:Lne3/h;

    if-eqz v10, :cond_6

    iget-wide v13, v10, Lne3/h;->x:J

    invoke-virtual {v10, v13, v14}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v10

    iput-object v10, p0, Lcom/squareup/wire/j;->a:Lne3/l;

    iput-object v6, p0, Lcom/squareup/wire/j;->b:Lne3/h;

    iput-object v6, p0, Lcom/squareup/wire/j;->c:Lcom/squareup/wire/s;

    :cond_6
    iget-object v10, p0, Lcom/squareup/wire/j;->a:Lne3/l;

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Lm83/m;->removeFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/squareup/wire/f;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {p0, v10}, Lcom/squareup/wire/g;->b(Lcom/squareup/wire/a0;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_5

    :cond_8
    :goto_4
    invoke-virtual {v2}, Lm83/m;->removeFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/squareup/wire/f;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {p0, v10}, Lcom/squareup/wire/g;->b(Lcom/squareup/wire/a0;)Ljava/lang/Object;

    move-result-object v10

    :goto_5
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move v10, v12

    goto :goto_3

    :cond_9
    new-array v0, v4, [Ljava/lang/Object;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/squareup/wire/l;

    return-object v0

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_2

    :cond_b
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0
.end method

.method public final b(Lcom/squareup/wire/a0;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p1}, Lcom/squareup/wire/a0;->keyAdapter()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p1}, Lcom/squareup/wire/a0;->tag()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lcom/squareup/wire/g;->g:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll83/k;

    if-eqz p1, :cond_1

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lm83/z;->w:Lm83/z;

    return-object p1

    :cond_2
    invoke-interface {p1}, Lcom/squareup/wire/a0;->label()Lcom/squareup/wire/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/wire/z;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Lcom/squareup/wire/a0;->tag()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lcom/squareup/wire/g;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll83/k;

    if-eqz p1, :cond_4

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    return-object p1

    :cond_4
    :goto_1
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_5
    invoke-interface {p1}, Lcom/squareup/wire/a0;->tag()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/wire/g;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    if-eqz v0, :cond_6

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_7

    invoke-interface {p1}, Lcom/squareup/wire/a0;->label()Lcom/squareup/wire/z;

    move-result-object v1

    sget-object v2, Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;

    if-ne v1, v2, :cond_7

    sget-object v0, Lcom/squareup/wire/q;->Companion:Lcom/squareup/wire/p;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->adapter()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "adapterString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/squareup/wire/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v0
.end method
