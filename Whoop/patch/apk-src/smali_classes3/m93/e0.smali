.class public final Lm93/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm93/g;


# instance fields
.field public final a:Z

.field public final b:Lm93/g;

.field public final c:Ljava/lang/reflect/Member;

.field public final d:Lgm/r;

.field public final e:[Li93/j;

.field public final f:Z


# direct methods
.method public constructor <init>(Lm93/g;Lr93/c;Z)V
    .locals 10

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lm93/e0;->a:Z

    instance-of v0, p1, Lm93/u;

    const-string v1, "getValueParameters(...)"

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lr93/b;->y()Lr93/q0;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    check-cast v0, Lu93/d;

    invoke-virtual {v0}, Lu93/d;->getType()Llb3/y;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_6

    invoke-static {v0}, Lya3/h;->g(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz p3, :cond_4

    invoke-interface {p2}, Lr93/b;->v()Ljava/util/List;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Iterable;

    instance-of v4, p3, Ljava/util/Collection;

    if-eqz v4, :cond_2

    move-object v4, p3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/a1;

    check-cast v4, Lu93/w0;

    invoke-virtual {v4}, Lu93/w0;->J0()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_4
    invoke-static {v0}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object p3

    invoke-static {p3}, Lhg3/i;->S(Llb3/c0;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    move-object v5, p1

    check-cast v5, Lm93/u;

    iget-object v5, v5, Lm93/u;->g:Ljava/lang/Object;

    invoke-virtual {v4, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-array p3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    new-instance v0, Lm93/v;

    check-cast p1, Lm93/x;

    iget-object p1, p1, Lm93/y;->a:Ljava/lang/reflect/Member;

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-direct {v0, p1, p3}, Lm93/v;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    move-object p1, v0

    :cond_6
    :goto_2
    iput-object p1, p0, Lm93/e0;->b:Lm93/g;

    invoke-interface {p1}, Lm93/g;->getMember()Ljava/lang/reflect/Member;

    move-result-object p3

    iput-object p3, p0, Lm93/e0;->c:Ljava/lang/reflect/Member;

    invoke-interface {p2}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    instance-of v0, p2, Lr93/w;

    const/4 v4, 0x1

    if-eqz v0, :cond_8

    move-object v5, p2

    check-cast v5, Lr93/w;

    invoke-interface {v5}, Lr93/w;->isSuspend()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-static {p3}, Lya3/h;->h(Llb3/y;)Llb3/c0;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-static {v5}, Lo93/h;->G(Llb3/y;)Z

    move-result v5

    if-ne v5, v4, :cond_8

    :cond_7
    move-object v5, v2

    goto :goto_3

    :cond_8
    invoke-static {p3}, Lhg3/i;->o0(Llb3/y;)Ljava/lang/Class;

    move-result-object p3

    if-eqz p3, :cond_7

    :try_start_0
    const-string v5, "box-impl"

    invoke-static {p3, p2}, Lhg3/i;->R(Ljava/lang/Class;Lr93/c;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p3, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No box method found in inline class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " (calling "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    invoke-static {p2}, Lya3/h;->a(Lr93/c;)Z

    move-result p3

    if-eqz p3, :cond_9

    new-instance p1, Lgm/r;

    sget-object p2, Li93/j;->z:Li93/j;

    new-array p3, v3, [Ljava/util/List;

    invoke-direct {p1, p2, p3, v5}, Lgm/r;-><init>(Li93/j;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    goto/16 :goto_13

    :cond_9
    instance-of p3, p1, Lm93/u;

    const-string v6, "getContainingDeclaration(...)"

    const/4 v7, -0x1

    if-eqz p3, :cond_a

    move-object p3, p1

    check-cast p3, Lm93/u;

    iget-boolean p3, p3, Lm93/u;->f:Z

    if-nez p3, :cond_a

    goto :goto_5

    :cond_a
    instance-of p3, p1, Lm93/v;

    if-eqz p3, :cond_b

    goto :goto_5

    :cond_b
    instance-of p3, p2, Lr93/j;

    if-eqz p3, :cond_d

    instance-of p3, p1, Lm93/f;

    if-eqz p3, :cond_c

    goto :goto_5

    :cond_c
    :goto_4
    move v7, v3

    goto :goto_5

    :cond_d
    invoke-interface {p2}, Lr93/b;->y()Lr93/q0;

    move-result-object p3

    if-eqz p3, :cond_c

    instance-of p3, p1, Lm93/f;

    if-nez p3, :cond_c

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object p3

    invoke-static {p3, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lya3/h;->e(Lr93/k;)Z

    move-result p3

    if-eqz p3, :cond_e

    goto :goto_4

    :cond_e
    move v7, v4

    :goto_5
    instance-of p3, p1, Lm93/v;

    if-eqz p3, :cond_f

    move-object p3, p1

    check-cast p3, Lm93/v;

    iget-object p3, p3, Lm93/v;->f:[Ljava/lang/Object;

    array-length p3, p3

    neg-int p3, p3

    goto :goto_6

    :cond_f
    move p3, v7

    :goto_6
    invoke-interface {p1}, Lm93/g;->getMember()Ljava/lang/reflect/Member;

    move-result-object p1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Lr93/b;->B()Lr93/q0;

    move-result-object v9

    if-eqz v9, :cond_10

    check-cast v9, Lu93/d;

    invoke-virtual {v9}, Lu93/d;->getType()Llb3/y;

    move-result-object v9

    goto :goto_7

    :cond_10
    move-object v9, v2

    :goto_7
    if-eqz v9, :cond_11

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_11
    instance-of v9, p2, Lr93/j;

    if-eqz v9, :cond_12

    move-object p1, p2

    check-cast p1, Lr93/j;

    invoke-interface {p1}, Lr93/j;->P()Lr93/e;

    move-result-object p1

    const-string v6, "getConstructedClass(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/i;->isInner()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lr93/e;

    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_12
    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v9, Lr93/e;

    if-eqz v6, :cond_16

    check-cast v9, Lr93/e;

    invoke-static {v9}, Lya3/h;->e(Lr93/k;)Z

    move-result v6

    if-eqz v6, :cond_16

    if-eqz p1, :cond_14

    invoke-interface {p1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    if-nez p1, :cond_13

    move p1, v3

    goto :goto_8

    :cond_13
    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->isValue()Z

    move-result p1

    xor-int/2addr p1, v4

    :goto_8
    if-ne p1, v4, :cond_14

    move p1, v4

    goto :goto_9

    :cond_14
    move p1, v3

    :goto_9
    if-eqz p1, :cond_15

    invoke-interface {v9}, Lr93/e;->i()Llb3/c0;

    move-result-object p1

    const-string v6, "getDefaultType(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/sentry/config/a;->Q(Llb3/y;)Llb3/f1;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_15
    invoke-interface {v9}, Lr93/e;->i()Llb3/c0;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    :goto_a
    invoke-interface {p2}, Lr93/b;->v()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/a1;

    check-cast v1, Lu93/x0;

    invoke-virtual {v1}, Lu93/x0;->getType()Llb3/y;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_17
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v1, v3

    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/y;

    invoke-static {v6}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v6

    invoke-static {v6}, Lhg3/i;->S(Llb3/c0;)Ljava/util/ArrayList;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    goto :goto_d

    :cond_18
    move v6, v4

    :goto_d
    add-int/2addr v1, v6

    goto :goto_c

    :cond_19
    iget-boolean p1, p0, Lm93/e0;->a:Z

    if-eqz p1, :cond_1a

    add-int/lit8 p1, v1, 0x1f

    div-int/lit8 p1, p1, 0x20

    add-int/2addr p1, v4

    goto :goto_e

    :cond_1a
    move p1, v3

    :goto_e
    if-eqz v0, :cond_1b

    move-object v0, p2

    check-cast v0, Lr93/w;

    invoke-interface {v0}, Lr93/w;->isSuspend()Z

    move-result v0

    if-eqz v0, :cond_1b

    move v0, v4

    goto :goto_f

    :cond_1b
    move v0, v3

    :goto_f
    add-int/2addr p1, v0

    add-int/2addr v1, p3

    add-int/2addr v1, p1

    iget-boolean p1, p0, Lm93/e0;->a:Z

    invoke-static {p0}, Lge3/g;->z(Lm93/g;)I

    move-result p3

    if-ne p3, v1, :cond_2a

    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/2addr p3, v7

    invoke-static {p1, p3}, Le93/b;->i0(II)Li93/j;

    move-result-object p1

    new-array p3, v1, [Ljava/util/List;

    move v0, v3

    :goto_10
    if-ge v0, v1, :cond_1f

    iget v6, p1, Li93/h;->w:I

    iget v9, p1, Li93/h;->x:I

    if-gt v0, v9, :cond_1c

    if-gt v6, v0, :cond_1c

    move v6, v4

    goto :goto_11

    :cond_1c
    move v6, v3

    :goto_11
    if-eqz v6, :cond_1d

    sub-int v6, v0, v7

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/y;

    invoke-static {v6}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v6

    invoke-static {v6}, Lhg3/i;->S(Llb3/c0;)Ljava/util/ArrayList;

    move-result-object v9

    if-nez v9, :cond_1e

    invoke-static {v6}, Lhg3/i;->o0(Llb3/y;)Ljava/lang/Class;

    move-result-object v6

    if-eqz v6, :cond_1d

    invoke-static {v6, p2}, Lhg3/i;->R(Ljava/lang/Class;Lr93/c;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    goto :goto_12

    :cond_1d
    move-object v9, v2

    :cond_1e
    :goto_12
    aput-object v9, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_1f
    new-instance p2, Lgm/r;

    invoke-direct {p2, p1, p3, v5}, Lgm/r;-><init>(Li93/j;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    move-object p1, p2

    :goto_13
    iput-object p1, p0, Lm93/e0;->d:Lgm/r;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p2

    iget-object p3, p0, Lm93/e0;->b:Lm93/g;

    instance-of v0, p3, Lm93/v;

    if-eqz v0, :cond_20

    check-cast p3, Lm93/v;

    iget-object p3, p3, Lm93/v;->f:[Ljava/lang/Object;

    array-length p3, p3

    goto :goto_14

    :cond_20
    instance-of p3, p3, Lm93/u;

    if-eqz p3, :cond_21

    move p3, v4

    goto :goto_14

    :cond_21
    move p3, v3

    :goto_14
    if-lez p3, :cond_22

    invoke-static {v3, p3}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_22
    iget-object p1, p1, Lgm/r;->y:Ljava/lang/Object;

    check-cast p1, [Ljava/util/List;

    array-length v0, p1

    move v1, v3

    :goto_15
    if-ge v1, v0, :cond_24

    aget-object v2, p1, v1

    if-eqz v2, :cond_23

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_16

    :cond_23
    move v2, v4

    :goto_16
    add-int/2addr v2, p3

    invoke-static {p3, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object p3

    invoke-virtual {p2, p3}, Ln83/c;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    move p3, v2

    goto :goto_15

    :cond_24
    invoke-static {p2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-array p2, v3, [Li93/j;

    invoke-virtual {p1, p2}, Ln83/c;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Li93/j;

    iput-object p1, p0, Lm93/e0;->e:[Li93/j;

    iget-object p1, p0, Lm93/e0;->d:Lgm/r;

    iget-object p1, p1, Lgm/r;->x:Ljava/lang/Object;

    check-cast p1, Li93/j;

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_25

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_25

    goto :goto_18

    :cond_25
    invoke-virtual {p1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_26
    move-object p2, p1

    check-cast p2, Li93/i;

    iget-boolean p2, p2, Li93/i;->y:Z

    if-eqz p2, :cond_29

    move-object p2, p1

    check-cast p2, Lm83/e0;

    invoke-virtual {p2}, Lm83/e0;->nextInt()I

    move-result p2

    iget-object p3, p0, Lm93/e0;->d:Lgm/r;

    iget-object p3, p3, Lgm/r;->y:Ljava/lang/Object;

    check-cast p3, [Ljava/util/List;

    aget-object p2, p3, p2

    if-nez p2, :cond_28

    :cond_27
    move p2, v3

    goto :goto_17

    :cond_28
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-le p2, v4, :cond_27

    move p2, v4

    :goto_17
    if-eqz p2, :cond_26

    move v3, v4

    :cond_29
    :goto_18
    iput-boolean v3, p0, Lm93/e0;->f:Z

    return-void

    :cond_2a
    new-instance p3, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lge3/g;->z(Lm93/g;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " != "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nCalling: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\nParameter types: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lm93/e0;->b:Lm93/g;

    invoke-interface {p2}, Lm93/g;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ")\nDefault: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p3
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm93/e0;->b:Lm93/g;

    invoke-interface {v0}, Lm93/g;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lm93/e0;->b:Lm93/g;

    instance-of v0, v0, Lm93/s;

    return v0
.end method

.method public final c(I)Li93/j;
    .locals 3

    iget-object v0, p0, Lm93/e0;->e:[Li93/j;

    if-ltz p1, :cond_0

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    array-length v1, v0

    const/4 v2, 0x1

    if-nez v1, :cond_1

    new-instance v0, Li93/j;

    invoke-direct {v0, p1, p1, v2}, Li93/h;-><init>(III)V

    return-object v0

    :cond_1
    array-length v1, v0

    sub-int/2addr p1, v1

    invoke-static {v0}, Lm83/n;->E0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li93/j;

    iget v0, v0, Li93/h;->x:I

    add-int/2addr v0, v2

    add-int/2addr v0, p1

    new-instance p1, Li93/j;

    invoke-direct {p1, v0, v0, v2}, Li93/h;-><init>(III)V

    return-object p1
.end method

.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm93/e0;->d:Lgm/r;

    iget-object v1, v0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v1, Li93/j;

    iget-object v2, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v2, [Ljava/util/List;

    iget-object v0, v0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Li93/j;->isEmpty()Z

    move-result v3

    iget v4, v1, Li93/h;->x:I

    iget v1, v1, Li93/h;->w:I

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-boolean v3, p0, Lm93/e0;->f:Z

    const-string v6, "getReturnType(...)"

    const/4 v7, 0x0

    if-eqz v3, :cond_7

    array-length v3, p1

    new-instance v8, Ln83/c;

    invoke-direct {v8, v3}, Ln83/c;-><init>(I)V

    move v3, v7

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v9, p1, v3

    invoke-virtual {v8, v9}, Ln83/c;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-gt v1, v4, :cond_5

    :goto_1
    aget-object v3, v2, v1

    aget-object v9, p1, v1

    if-eqz v3, :cond_3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/reflect/Method;

    if-eqz v9, :cond_2

    invoke-virtual {v10, v9, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_3

    :cond_2
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Lkotlin/reflect/jvm/internal/UtilKt;->defaultPrimitiveValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v10

    :goto_3
    invoke-virtual {v8, v10}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v8, v9}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eq v1, v4, :cond_5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v4, v4, 0x1

    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    if-gt v4, v1, :cond_6

    :goto_4
    aget-object v2, p1, v4

    invoke-virtual {v8, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eq v4, v1, :cond_6

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_6
    invoke-static {v8}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-array v1, v7, [Ljava/lang/Object;

    invoke-virtual {p1, v1}, Ln83/c;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_8

    :cond_7
    array-length v3, p1

    new-array v8, v3, [Ljava/lang/Object;

    :goto_5
    if-ge v7, v3, :cond_c

    if-gt v7, v4, :cond_b

    if-gt v1, v7, :cond_b

    aget-object v9, v2, v7

    if-eqz v9, :cond_8

    invoke-static {v9}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/reflect/Method;

    goto :goto_6

    :cond_8
    move-object v9, v5

    :goto_6
    aget-object v10, p1, v7

    if-nez v9, :cond_9

    goto :goto_7

    :cond_9
    if-eqz v10, :cond_a

    invoke-virtual {v9, v10, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lkotlin/reflect/jvm/internal/UtilKt;->defaultPrimitiveValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_7

    :cond_b
    aget-object v10, p1, v7

    :goto_7
    aput-object v10, v8, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_c
    move-object p1, v8

    :goto_8
    iget-object v1, p0, Lm93/e0;->b:Lm93/g;

    invoke-interface {v1, p1}, Lm93/g;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_d

    goto :goto_9

    :cond_d
    if-eqz v0, :cond_f

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_9

    :cond_e
    return-object v0

    :cond_f
    :goto_9
    return-object p1
.end method

.method public final getMember()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lm93/e0;->c:Ljava/lang/reflect/Member;

    return-object v0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lm93/e0;->b:Lm93/g;

    invoke-interface {v0}, Lm93/g;->getReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
