.class public final Lwb3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob3/o;


# static fields
.field public static final w:Lwb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwb3/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwb3/p;->w:Lwb3/p;

    return-void
.end method

.method public static o0(Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    const-string v1, "This method should not be called on "

    const-string v2, " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue"

    invoke-static {p0, v1, v2}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public A(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->f(Lob3/g;)Lob3/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwb3/p;->T(Lob3/h;)Lob3/l;

    move-result-object v0

    invoke-virtual {p0, p1}, Lwb3/p;->l0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwb3/p;->T(Lob3/h;)Lob3/l;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public B(Lob3/k;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwb3/j;

    iget-object p1, p1, Lwb3/j;->a:Lj93/d0;

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public C(Lob3/l;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lj93/d;

    return p1
.end method

.method public D(Lob3/j;I)Lob3/k;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lob3/i;

    if-eqz v0, :cond_0

    check-cast p1, Lob3/g;

    invoke-virtual {p0, p1, p2}, Lwb3/p;->K(Lob3/g;I)Lob3/k;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lob3/a;

    if-eqz v0, :cond_1

    check-cast p1, Lob3/a;

    invoke-virtual {p1, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lob3/k;

    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unknown type argument list type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public E(Lob3/l;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj93/d;

    if-eqz v0, :cond_0

    check-cast p1, Lj93/d;

    invoke-static {p1}, Lwb3/f;->c(Lj93/d;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public F(Lob3/g;)Lob3/g;
    .locals 0

    invoke-static {p1}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public G(Lob3/h;)Lob3/h;
    .locals 14

    sget-object v0, Lob3/b;->w:Lob3/b;

    check-cast p1, Lj93/a0;

    invoke-interface {p1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    instance-of v1, v0, Lj93/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lj93/d;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-nez v4, :cond_1

    goto/16 :goto_a

    :cond_1
    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_a

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj93/d0;

    iget-object v3, v3, Lj93/d0;->a:Lj93/e0;

    sget-object v5, Lj93/e0;->w:Lj93/e0;

    if-ne v3, v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v4}, Lwb3/f;->c(Lj93/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-eq v3, v5, :cond_4

    goto/16 :goto_a

    :cond_4
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj93/d0;

    iget-object v8, v6, Lj93/d0;->a:Lj93/e0;

    sget-object v9, Lj93/e0;->w:Lj93/e0;

    if-ne v8, v9, :cond_5

    goto :goto_4

    :cond_5
    iget-object v9, v6, Lj93/d0;->b:Lj93/a0;

    sget-object v10, Lj93/e0;->x:Lj93/e0;

    if-ne v8, v10, :cond_6

    goto :goto_3

    :cond_6
    move-object v9, v2

    :goto_3
    sget-object v8, Lj93/d0;->c:Lj93/d0;

    new-instance v8, Lwb3/c;

    new-instance v10, Lwb3/d;

    invoke-direct {v10, v6}, Lwb3/d;-><init>(Lj93/d0;)V

    invoke-direct {v8, v9, v10, v7}, Lwb3/c;-><init>(Lj93/a0;Lwb3/d;Z)V

    invoke-static {v8}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v6

    :goto_4
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    new-instance v3, Lwb3/k;

    invoke-static {v4}, Lwb3/f;->c(Lj93/d;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6, v5}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-static {v6}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v6

    invoke-direct {v3, v6}, Lwb3/k;-><init>(Ljava/util/Map;)V

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_5
    if-ge v7, v6, :cond_b

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj93/d0;

    iget-object v9, v8, Lj93/d0;->a:Lj93/e0;

    sget-object v10, Lj93/e0;->w:Lj93/e0;

    if-eq v9, v10, :cond_a

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lj93/b0;

    invoke-interface {v9}, Lj93/b0;->getUpperBounds()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lj93/a0;

    invoke-virtual {v3, v11}, Lwb3/k;->a(Lj93/a0;)Lj93/d0;

    move-result-object v11

    iget-object v11, v11, Lj93/d0;->b:Lj93/a0;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    iget-object v9, v8, Lj93/d0;->a:Lj93/e0;

    sget-object v11, Lj93/e0;->y:Lj93/e0;

    if-ne v9, v11, :cond_9

    iget-object v8, v8, Lj93/d0;->b:Lj93/a0;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj93/d0;

    iget-object v8, v8, Lj93/d0;->b:Lj93/a0;

    const-string v9, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.CapturedKType"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lwb3/c;

    iget-object v8, v8, Lwb3/c;->y:Lwb3/d;

    iput-object v10, v8, Lwb3/d;->x:Ljava/util/ArrayList;

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_b
    new-instance v3, Lwb3/q;

    invoke-interface {p1}, Lj93/a0;->isMarkedNullable()Z

    move-result v6

    invoke-interface {p1}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v7

    instance-of v0, p1, Lwb3/a;

    if-eqz v0, :cond_c

    move-object v1, p1

    check-cast v1, Lwb3/a;

    goto :goto_7

    :cond_c
    move-object v1, v2

    :goto_7
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lwb3/a;->a()Lj93/a0;

    move-result-object v1

    move-object v8, v1

    goto :goto_8

    :cond_d
    move-object v8, v2

    :goto_8
    if-eqz v0, :cond_e

    check-cast p1, Lwb3/a;

    goto :goto_9

    :cond_e
    move-object p1, v2

    :goto_9
    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lwb3/a;->b()Lj93/d;

    move-result-object v2

    :cond_f
    move-object v12, v2

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v3

    :cond_10
    :goto_a
    return-object v2
.end method

.method public H(Lob3/l;Lob3/l;)Z
    .locals 1

    const-string v0, "c1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public I(Lob3/h;Lob3/l;)V
    .locals 0

    return-void
.end method

.method public J(Lob3/l;)Z
    .locals 2

    instance-of v0, p1, Lkotlin/reflect/jvm/internal/KClassImpl;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KClassImpl;->isFinal()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassKind$kotlin_reflection()Laa3/q;

    move-result-object v0

    sget-object v1, Laa3/q;->z:Laa3/q;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassKind$kotlin_reflection()Laa3/q;

    move-result-object v0

    sget-object v1, Laa3/q;->E:Laa3/q;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassKind$kotlin_reflection()Laa3/q;

    move-result-object p1

    sget-object v0, Laa3/q;->F:Laa3/q;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public K(Lob3/g;I)Lob3/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwb3/j;

    check-cast p1, Lj93/a0;

    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj93/d0;

    invoke-direct {v0, p1}, Lwb3/j;-><init>(Lj93/d0;)V

    return-object v0
.end method

.method public M(Lob3/h;)Lob3/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lob3/j;

    return-object p1
.end method

.method public N(Lob3/g;)Lob3/l;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->h0(Lob3/g;)Lob3/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lwb3/p;->f(Lob3/g;)Lob3/h;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lwb3/p;->T(Lob3/h;)Lob3/l;

    move-result-object p1

    return-object p1
.end method

.method public O(Lob3/d;)Lob3/b;
    .locals 0

    sget-object p1, Lob3/b;->w:Lob3/b;

    return-object p1
.end method

.method public P(Lob3/h;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lwb3/p;->T(Lob3/h;)Lob3/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwb3/p;->m0(Lob3/l;)Z

    const/4 p1, 0x0

    return p1
.end method

.method public Q(Lob3/g;)Lob3/g;
    .locals 0

    invoke-static {p1}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public R(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj93/a0;

    invoke-interface {p1}, Lj93/a0;->isMarkedNullable()Z

    move-result p1

    return p1
.end method

.method public S(Lob3/h;I)Lob3/k;
    .locals 1

    if-ltz p2, :cond_0

    invoke-virtual {p0, p1}, Lwb3/p;->g(Lob3/g;)I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lwb3/p;->K(Lob3/g;I)Lob3/k;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public T(Lob3/h;)Lob3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwb3/c;

    if-eqz v0, :cond_0

    check-cast p1, Lwb3/c;

    iget-object p1, p1, Lwb3/c;->y:Lwb3/d;

    return-object p1

    :cond_0
    check-cast p1, Lwb3/a;

    invoke-virtual {p1}, Lwb3/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lwb3/n;->x:Lwb3/n;

    return-object p1

    :cond_1
    invoke-interface {p1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    instance-of v1, v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    if-eqz v1, :cond_2

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-static {v0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_3

    const-class p1, [Ljava/lang/Object;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    check-cast p1, Lob3/l;

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lwb3/a;->b()Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    :goto_1
    const-string p1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.TypeConstructorMarker"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lob3/l;

    return-object v0
.end method

.method public U(Lob3/g;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public V(Lob3/h;Lob3/h;)Z
    .locals 1

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "b"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public W(Llb3/f1;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->f(Lob3/g;)Lob3/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwb3/p;->R(Lob3/g;)Z

    move-result v0

    invoke-virtual {p0, p1}, Lwb3/p;->l0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwb3/p;->R(Lob3/g;)Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public X(Lob3/h;)Ljava/util/Collection;
    .locals 0

    invoke-static {p1}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public Y(Lob3/j;)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lob3/h;

    if-eqz v0, :cond_0

    check-cast p1, Lob3/g;

    invoke-virtual {p0, p1}, Lwb3/p;->g(Lob3/g;)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Lob3/a;

    if-eqz v0, :cond_1

    check-cast p1, Lob3/a;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown type argument list type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public Z(Lob3/k;)Lob3/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwb3/j;

    iget-object p1, p1, Lwb3/j;->a:Lj93/d0;

    iget-object p1, p1, Lj93/d0;->b:Lj93/a0;

    check-cast p1, Lob3/g;

    return-object p1
.end method

.method public a(Lob3/f;)Lob3/h;
    .locals 1

    check-cast p1, Lwb3/a;

    invoke-virtual {p1}, Lwb3/a;->j()Lwb3/a;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public a0(Lob3/h;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lob3/f;)Lob3/h;
    .locals 1

    check-cast p1, Lwb3/a;

    invoke-virtual {p1}, Lwb3/a;->g()Lwb3/a;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b0(Lob3/l;)Z
    .locals 2

    const-class v0, Ljava/lang/Object;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c0(Lob3/l;I)Lob3/m;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj93/d;

    invoke-static {p1}, Lwb3/f;->c(Lj93/d;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeParameterImpl"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    return-object p1
.end method

.method public d(Lob3/h;)Lob3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwb3/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lwb3/a;->i(Z)Lwb3/a;

    move-result-object p1

    return-object p1
.end method

.method public d0(Lob3/d;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public e(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->h0(Lob3/g;)Lob3/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lwb3/p;->i0(Lob3/h;)Lob3/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public e0(Lob3/g;)Lob3/k;
    .locals 0

    invoke-static {p1}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public f(Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->r(Lob3/g;)Lob3/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lwb3/p;->b(Lob3/f;)Lob3/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lwb3/p;->h0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public f0(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->h0(Lob3/g;)Lob3/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lwb3/p;->n0(Lob3/h;)Lob3/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public g(Lob3/g;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj93/a0;

    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public g0(Lob3/d;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public h(Lob3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->N(Lob3/g;)Lob3/l;

    move-result-object v0

    invoke-virtual {p0, v0}, Lwb3/p;->u(Lob3/l;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public h0(Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->r(Lob3/g;)Lob3/f;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lob3/h;

    return-object p1
.end method

.method public i(Lob3/k;)Lob3/p;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwb3/j;

    iget-object p1, p1, Lwb3/j;->a:Lj93/d0;

    iget-object p1, p1, Lj93/d0;->a:Lj93/e0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lob3/p;->y:Lob3/p;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lob3/p;->x:Lob3/p;

    return-object p1

    :cond_2
    sget-object p1, Lob3/p;->z:Lob3/p;

    return-object p1

    :cond_3
    sget-object p1, Lob3/p;->y:Lob3/p;

    return-object p1
.end method

.method public i0(Lob3/h;)Lob3/d;
    .locals 1

    invoke-virtual {p0, p1}, Lwb3/p;->n0(Lob3/h;)Lob3/e;

    move-result-object v0

    if-nez v0, :cond_1

    check-cast p1, Lob3/i;

    instance-of v0, p1, Lob3/d;

    if-eqz v0, :cond_0

    check-cast p1, Lob3/d;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-static {v0}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public j(Lob3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->T(Lob3/h;)Lob3/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwb3/p;->C(Lob3/l;)Z

    move-result p1

    return p1
.end method

.method public j0(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public k(Lob3/d;)Lob3/c;
    .locals 0

    check-cast p1, Lwb3/c;

    iget-object p1, p1, Lwb3/c;->y:Lwb3/d;

    return-object p1
.end method

.method public k0(Lob3/d;)Lob3/g;
    .locals 0

    check-cast p1, Lwb3/c;

    iget-object p1, p1, Lwb3/c;->x:Lj93/a0;

    check-cast p1, Lob3/g;

    return-object p1
.end method

.method public l(Lob3/m;)Lob3/p;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj93/b0;

    invoke-interface {p1}, Lj93/b0;->getVariance()Lj93/e0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lob3/p;->y:Lob3/p;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lob3/p;->x:Lob3/p;

    return-object p1

    :cond_2
    sget-object p1, Lob3/p;->z:Lob3/p;

    return-object p1
.end method

.method public l0(Lob3/g;)Lob3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->r(Lob3/g;)Lob3/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lwb3/p;->a(Lob3/f;)Lob3/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lwb3/p;->h0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public m(Lob3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/p;->n0(Lob3/h;)Lob3/e;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public m0(Lob3/l;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public n(Lob3/h;)Ls2/e;
    .locals 6

    sget-object v0, Lwb3/k;->b:Lwb3/k;

    check-cast p1, Lj93/a0;

    move-object v0, p1

    check-cast v0, Lwb3/a;

    sget-object v1, Lwb3/p;->w:Lwb3/p;

    invoke-virtual {v1, v0}, Lwb3/p;->T(Lob3/h;)Lob3/l;

    move-result-object v0

    invoke-virtual {v1, v0}, Lwb3/p;->E(Lob3/l;)I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-virtual {v1, v0, v4}, Lwb3/p;->c0(Lob3/l;I)Lob3/m;

    move-result-object v5

    check-cast v5, Lj93/b0;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lwb3/k;

    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v3, p1}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lwb3/k;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lwb3/k;->b:Lwb3/k;

    :goto_1
    new-instance p1, Lwb3/o;

    invoke-direct {p1, v0}, Lwb3/o;-><init>(Lwb3/k;)V

    return-object p1
.end method

.method public n0(Lob3/h;)Lob3/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwb3/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lob3/e;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Lob3/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public p(Lob3/h;)V
    .locals 0

    return-void
.end method

.method public q(Lob3/m;Lob3/l;)Z
    .locals 0

    invoke-static {p1}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public r(Lob3/g;)Lob3/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwb3/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->g()Lwb3/a;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast p1, Lob3/f;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s(Lob3/l;)Ljava/util/Collection;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj93/d;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker"

    const/16 v2, 0xa

    if-eqz v0, :cond_1

    check-cast p1, Lj93/d;

    invoke-interface {p1}, Lj93/d;->getSupertypes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/a0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lob3/g;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    instance-of v0, p1, Lj93/b0;

    if-eqz v0, :cond_3

    check-cast p1, Lj93/b0;

    invoke-interface {p1}, Lj93/b0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/a0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lob3/g;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    instance-of v0, p1, Lwb3/d;

    if-eqz v0, :cond_6

    check-cast p1, Lwb3/d;

    iget-object p1, p1, Lwb3/d;->x:Ljava/util/ArrayList;

    if-eqz p1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/a0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lob3/g;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    const-string p1, "supertypes"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported type constructor: "

    const-string v2, " ("

    invoke-static {v1, p1, v2}, Lm4/a;->m(Ljava/lang/String;Lob3/l;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t(Lob3/l;)Z
    .locals 0

    instance-of p1, p1, Lwb3/d;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public u(Lob3/l;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ljava/lang/Void;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public v(Lob3/l;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public x(Lob3/c;)Lob3/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwb3/j;

    check-cast p1, Lwb3/d;

    iget-object p1, p1, Lwb3/d;->w:Lj93/d0;

    invoke-direct {v0, p1}, Lwb3/j;-><init>(Lj93/d0;)V

    return-object v0
.end method

.method public y(Lob3/i;)Lob3/d;
    .locals 1

    instance-of v0, p1, Lob3/d;

    if-eqz v0, :cond_0

    check-cast p1, Lob3/d;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public z(Ljava/util/ArrayList;)Lob3/g;
    .locals 0

    invoke-static {p0}, Lwb3/p;->o0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method
