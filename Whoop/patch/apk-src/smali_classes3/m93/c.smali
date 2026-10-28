.class public final Lm93/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm93/g;


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lm93/a;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;)V
    .locals 7

    sget-object v4, Lm93/b;->x:Lm93/b;

    .line 32
    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 36
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 37
    invoke-direct/range {v0 .. v5}, Lm93/c;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;Lm93/b;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;Lm93/b;Ljava/util/List;)V
    .locals 1

    const-string v0, "jClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methods"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm93/c;->a:Ljava/lang/Class;

    .line 3
    iput-object p2, p0, Lm93/c;->b:Ljava/util/ArrayList;

    .line 4
    iput-object p3, p0, Lm93/c;->c:Lm93/a;

    .line 5
    iput-object p5, p0, Lm93/c;->d:Ljava/util/List;

    .line 6
    check-cast p5, Ljava/lang/Iterable;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p5, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    .line 9
    check-cast p5, Ljava/lang/reflect/Method;

    .line 10
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object p5

    .line 11
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, p0, Lm93/c;->e:Ljava/util/ArrayList;

    .line 13
    iget-object p1, p0, Lm93/c;->d:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 14
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p5

    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    .line 16
    check-cast p5, Ljava/lang/reflect/Method;

    .line 17
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p5

    invoke-static {p5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Lx93/c;->a:Ljava/util/List;

    .line 18
    sget-object v0, Lx93/c;->c:Ljava/util/Map;

    invoke-interface {v0, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object p5, v0

    .line 19
    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 20
    :cond_2
    iput-object p3, p0, Lm93/c;->f:Ljava/util/ArrayList;

    .line 21
    iget-object p1, p0, Lm93/c;->d:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 22
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 24
    check-cast p2, Ljava/lang/reflect/Method;

    .line 25
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    move-result-object p2

    .line 26
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 27
    :cond_3
    iput-object p3, p0, Lm93/c;->g:Ljava/util/ArrayList;

    .line 28
    iget-object p1, p0, Lm93/c;->c:Lm93/a;

    sget-object p2, Lm93/a;->x:Lm93/a;

    if-ne p1, p2, :cond_5

    sget-object p1, Lm93/b;->w:Lm93/b;

    if-ne p4, p1, :cond_5

    iget-object p1, p0, Lm93/c;->b:Ljava/util/ArrayList;

    const-string p2, "value"

    invoke-static {p1, p2}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_4

    .line 29
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 30
    const-string p2, "Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm93/c;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final bridge b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "args"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lge3/g;->z(Lm93/g;)I

    move-result v2

    array-length v3, v1

    if-ne v2, v3, :cond_d

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    iget-object v7, v0, Lm93/c;->b:Ljava/util/ArrayList;

    if-ge v5, v3, :cond_c

    aget-object v8, v1, v5

    add-int/lit8 v9, v6, 0x1

    iget-object v10, v0, Lm93/c;->f:Ljava/util/ArrayList;

    if-nez v8, :cond_0

    iget-object v11, v0, Lm93/c;->c:Lm93/a;

    sget-object v12, Lm93/a;->w:Lm93/a;

    if-ne v11, v12, :cond_0

    iget-object v8, v0, Lm93/c;->g:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    goto :goto_4

    :cond_0
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Class;

    instance-of v12, v8, Ljava/lang/Class;

    if-eqz v12, :cond_2

    :cond_1
    :goto_1
    const/4 v8, 0x0

    goto :goto_4

    :cond_2
    instance-of v12, v8, Lj93/d;

    if-eqz v12, :cond_3

    check-cast v8, Lj93/d;

    invoke-static {v8}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v8

    goto :goto_3

    :cond_3
    instance-of v12, v8, [Ljava/lang/Object;

    if-eqz v12, :cond_7

    move-object v12, v8

    check-cast v12, [Ljava/lang/Object;

    instance-of v14, v12, [Ljava/lang/Class;

    if-eqz v14, :cond_4

    goto :goto_1

    :cond_4
    instance-of v14, v12, [Lj93/d;

    if-eqz v14, :cond_6

    check-cast v8, [Lj93/d;

    new-instance v12, Ljava/util/ArrayList;

    array-length v14, v8

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    array-length v14, v8

    move v15, v4

    :goto_2
    if-ge v15, v14, :cond_5

    aget-object v16, v8, v15

    invoke-static/range {v16 .. v16}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_5
    new-array v8, v4, [Ljava/lang/Class;

    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    goto :goto_3

    :cond_6
    move-object v8, v12

    :cond_7
    :goto_3
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    :goto_4
    if-nez v8, :cond_b

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    const-class v3, Ljava/lang/Class;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const-class v2, Lj93/d;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    const-class v2, [Lj93/d;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    goto :goto_5

    :cond_9
    invoke-static {v2}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v3

    const-class v4, [Ljava/lang/Object;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3c

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getComponentType(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3e

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_a
    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    :goto_6
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Argument #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not of the required type "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_b
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    move v6, v9

    goto/16 :goto_0

    :cond_c
    invoke-static {v7, v2}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, v0, Lm93/c;->d:Ljava/util/List;

    iget-object v3, v0, Lm93/c;->a:Ljava/lang/Class;

    invoke-static {v3, v1, v2}, Lse/b;->x(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_d
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Callable expects "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lge3/g;->z(Lm93/g;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " arguments, but "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, v1

    const-string v4, " were provided."

    invoke-static {v3, v1, v4}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final bridge synthetic getMember()Ljava/lang/reflect/Member;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lm93/c;->a:Ljava/lang/Class;

    return-object v0
.end method
