.class public abstract Lse/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lr93/c;)Lr93/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfa3/g0;->j:Ljava/util/HashSet;

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lfa3/f;->d:Ljava/util/Set;

    invoke-static {p0}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object v1

    invoke-interface {v1}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lr93/n0;

    if-nez v0, :cond_3

    instance-of v0, p0, Lr93/m0;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lu93/q0;

    if-eqz v0, :cond_2

    sget-object v0, Lfa3/d;->G:Lfa3/d;

    invoke-static {p0, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_1
    sget-object v0, Lfa3/d;->F:Lfa3/d;

    invoke-static {p0, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p0

    return-object p0
.end method

.method public static final B(Lr93/c;)Lr93/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lse/g;->A(Lr93/c;)Lr93/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget v0, Lfa3/e;->l:I

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lfa3/e;->b(Lva3/h;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    sget-object v0, Lfa3/d;->H:Lfa3/d;

    invoke-static {p0, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p0

    return-object p0
.end method

.method public static final C(Lwz/g0;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lwz/g0;->w:Ly00/c8;

    invoke-interface {p0}, Ly00/c8;->q()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/core/model/CountryCode;->access$getUS$cp()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final D(Lr93/e;Lr93/c;)Z
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "specialCallableDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lr93/e;

    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object p1

    const-string v0, "getDefaultType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lya3/f;->i(Lr93/e;)Lr93/e;

    move-result-object p0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_f

    instance-of v1, p0, Lha3/c;

    if-nez v1, :cond_e

    invoke-interface {p0}, Lr93/e;->i()Llb3/c0;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz v1, :cond_d

    new-instance v4, Ljava/util/ArrayDeque;

    invoke-direct {v4}, Ljava/util/ArrayDeque;-><init>()V

    new-instance v5, Lmb3/n;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lmb3/n;-><init>(Llb3/y;Lmb3/n;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb3/n;

    iget-object v7, v5, Lmb3/n;->a:Llb3/y;

    invoke-virtual {v7}, Llb3/y;->i0()Llb3/q0;

    move-result-object v8

    if-eqz v8, :cond_b

    if-eqz v1, :cond_a

    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v7}, Llb3/y;->k0()Z

    move-result v4

    iget-object v5, v5, Lmb3/n;->b:Lmb3/n;

    :goto_1
    if-eqz v5, :cond_6

    iget-object v8, v5, Lmb3/n;->a:Llb3/y;

    invoke-virtual {v8}, Llb3/y;->X()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    instance-of v10, v9, Ljava/util/Collection;

    sget-object v11, Llb3/s0;->b:Llb3/d;

    if-eqz v10, :cond_1

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Llb3/u0;

    invoke-virtual {v10}, Llb3/u0;->a()Llb3/g1;

    move-result-object v10

    sget-object v12, Llb3/g1;->y:Llb3/g1;

    if-eq v10, v12, :cond_2

    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v9

    invoke-virtual {v8}, Llb3/y;->X()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v11, v9, v10}, Llb3/d;->f(Llb3/q0;Ljava/util/List;)Llb3/y0;

    move-result-object v9

    invoke-static {v9}, Lva3/b;->l(Llb3/y0;)Llb3/y0;

    move-result-object v9

    new-instance v10, Llb3/a1;

    invoke-direct {v10, v9}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-virtual {v10, v7, v12}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v7

    invoke-static {v7}, Ldp/d;->o(Llb3/y;)Lqb3/a;

    move-result-object v7

    iget-object v7, v7, Lqb3/a;->b:Ljava/lang/Object;

    check-cast v7, Llb3/y;

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v9

    invoke-virtual {v8}, Llb3/y;->X()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v11, v9, v10}, Llb3/d;->f(Llb3/q0;Ljava/util/List;)Llb3/y0;

    move-result-object v9

    new-instance v10, Llb3/a1;

    invoke-direct {v10, v9}, Llb3/a1;-><init>(Llb3/y0;)V

    sget-object v9, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v10, v7, v9}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v7

    :goto_3
    if-nez v4, :cond_5

    invoke-virtual {v8}, Llb3/y;->k0()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    move v4, v0

    goto :goto_5

    :cond_5
    :goto_4
    move v4, v3

    :goto_5
    iget-object v5, v5, Lmb3/n;->b:Lmb3/n;

    goto :goto_1

    :cond_6
    invoke-virtual {v7}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v7, v4}, Llb3/d1;->g(Llb3/y;Z)Llb3/f1;

    move-result-object v6

    goto :goto_7

    :cond_7
    new-instance p0, Ljava/lang/AssertionError;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "Type constructors should be equals!\nsubstitutedSuperType: "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lvd/e;->n(Llb3/q0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", \n\nsupertype: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lvd/e;->n(Llb3/q0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \n"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_8
    invoke-static {v2}, Lv8/b;->a(I)V

    throw v6

    :cond_9
    invoke-interface {v8}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Llb3/y;

    new-instance v9, Lmb3/n;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v9, v8, v5}, Lmb3/n;-><init>(Llb3/y;Lmb3/n;)V

    invoke-virtual {v4, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    const/4 p0, 0x4

    invoke-static {p0}, Lv8/b;->a(I)V

    throw v6

    :cond_b
    invoke-static {v2}, Lv8/b;->a(I)V

    throw v6

    :cond_c
    :goto_7
    if-eqz v6, :cond_e

    invoke-static {p0}, Lo93/h;->A(Lr93/k;)Z

    move-result p0

    xor-int/2addr p0, v3

    return p0

    :cond_d
    new-array p0, v2, [Ljava/lang/Object;

    const-string p1, "subtype"

    aput-object p1, p0, v0

    const-string p1, "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure"

    aput-object p1, p0, v3

    const-string p1, "findCorrespondingSupertype"

    const/4 v0, 0x2

    aput-object p1, p0, v0

    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p0}, Lya3/f;->i(Lr93/e;)Lr93/e;

    move-result-object p0

    goto/16 :goto_0

    :cond_f
    return v0
.end method

.method public static E(Landroid/net/ConnectivityManager;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    move-result p0

    return p0
.end method

.method public static final F(Lma3/e;)Z
    .locals 1

    instance-of v0, p0, Lx93/d0;

    if-eqz v0, :cond_0

    check-cast p0, Lx93/d0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lx93/d0;->c()Lx93/a0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lx93/d0;->d()Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final G(Lo0/p;Lh0/d2;)I
    .locals 2

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    if-ne p1, v0, :cond_0

    iget-wide p0, p0, Lo0/p;->t:J

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    :goto_0
    long-to-int p0, p0

    return p0

    :cond_0
    iget-wide p0, p0, Lo0/p;->t:J

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    goto :goto_0
.end method

.method public static final H(Ltb/c;)Ljava/util/List;
    .locals 10

    const-string v0, "id"

    invoke-static {p0, v0}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "seq"

    invoke-static {p0, v1}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "from"

    invoke-static {p0, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "to"

    invoke-static {p0, v3}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v3

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v4

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, Lob/g;

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-interface {p0, v1}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-interface {p0, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v5, v6, v7, v8, v9}, Lob/g;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v4}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->t1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final I(Ljava/lang/String;Ltb/a;Z)Lob/j;
    .locals 13

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PRAGMA index_xinfo(`"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "`)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    const-string v0, "seqno"

    invoke-static {p1, v0}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "cid"

    invoke-static {p1, v1}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "name"

    invoke-static {p1, v2}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "desc"

    invoke-static {p1, v3}, Ljc/x;->s(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eq v0, v4, :cond_6

    if-eq v1, v4, :cond_6

    if-eq v2, v4, :cond_6

    if-ne v3, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    if-gez v7, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-interface {p1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v9, v9, v11

    if-lez v9, :cond_2

    const-string v9, "DESC"

    goto :goto_1

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_2
    const-string v9, "ASC"

    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v4, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lb2/d;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lb2/d;-><init>(I)V

    invoke-static {v0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Lb2/d;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lb2/d;-><init>(I)V

    invoke-static {v1, v3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lob/j;

    invoke-direct {v2, p0, v0, v1, p2}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v2

    :cond_6
    :goto_4
    invoke-static {p1, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v5

    :goto_5
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {p1, p0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static J(Lkotlin/Metadata;)V
    .locals 9

    invoke-static {p0}, Lse/b;->Z(Lkotlin/Metadata;)[Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lua3/g;->i([Ljava/lang/String;[Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lua3/f;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lqa3/g0;

    new-instance v1, Lda3/a;

    invoke-interface {p0}, Lkotlin/Metadata;->mv()[I

    move-result-object p0

    invoke-direct {v1, p0}, Lda3/a;-><init>([I)V

    new-instance p0, Lda3/a;

    const/4 v2, 0x1

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-direct {p0, v2, v4, v5}, Lda3/a;-><init>(III)V

    invoke-virtual {v1, p0}, Lda3/a;->a(Lda3/a;)I

    move-result p0

    if-gez p0, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move v6, v5

    :goto_0
    const-string p0, "<this>"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "strings"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, La00/g;

    const/4 v1, 0x3

    invoke-direct {p0, v1}, La00/g;-><init>(I)V

    new-instance v2, Lba3/i;

    new-instance v4, Lsa3/h;

    iget-object v1, v0, Lqa3/g0;->G:Lqa3/c1;

    const-string v5, "getTypeTable(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v1}, Lsa3/h;-><init>(Lqa3/c1;)V

    sget-object v1, Lsa3/j;->b:Lsa3/j;

    iget-object v1, v0, Lqa3/g0;->H:Lqa3/j1;

    const-string v5, "getVersionRequirementTable(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lpf/c;->r(Lqa3/j1;)Lsa3/j;

    move-result-object v5

    const/16 v8, 0x10

    sget-object v7, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v2 .. v8}, Lba3/i;-><init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLjava/util/List;I)V

    iget-object v1, v0, Lqa3/g0;->z:Ljava/util/List;

    const-string v3, "getFunctionList(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lqa3/g0;->E:Ljava/util/List;

    const-string v4, "getPropertyList(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lqa3/g0;->F:Ljava/util/List;

    const-string v5, "getTypeAliasList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v1, v3, v4, v2}, Lts/o;->T(Laa3/t0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lba3/i;)V

    iget-object v1, v2, Lba3/i;->h:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lca3/l;

    check-cast v3, Lea3/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lea3/e;->b:Lca3/d;

    const-string v4, "type"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v3

    check-cast v3, Lca3/f;

    check-cast v3, Lea3/e;

    sget-object v4, Lta3/l;->l:Lwa3/o;

    invoke-virtual {v0, v4}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/k0;

    iget-object v6, v3, Lea3/e;->a:Ljava/util/ArrayList;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v2}, Lts/o;->N(Lqa3/k0;Lba3/i;)Laa3/z0;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    sget-object v3, Lta3/l;->k:Lwa3/o;

    const-string v4, "packageModuleName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, v2, Lba3/i;->a:Lsa3/f;

    invoke-interface {v4, v3}, Lsa3/f;->getString(I)Ljava/lang/String;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static K(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lal0/f;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p0

    invoke-virtual {p0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getValue(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/content/SharedPreferences;

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static final L(Lio/getstream/android/video/generated/models/ICEServer;)Lc43/e;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc43/e;

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/ICEServer;->getUrls()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/ICEServer;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/ICEServer;->getPassword()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lc43/e;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lb30/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "form"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValuesChanged"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, 0x416422aa

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v9, 0x20

    if-eqz v1, :cond_1

    move v1, v9

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr p2, v1

    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_5

    :cond_3
    :goto_2
    iget-object v1, p0, Lb30/m;->E:Ljava/lang/Object;

    check-cast v1, Ln53/e;

    const/4 v10, 0x0

    invoke-static {v1, v6, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    iget-object v2, p0, Lb30/m;->z:Ljava/lang/Object;

    check-cast v2, Lg40/w2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Set;

    const/16 v7, 0xc46

    const/16 v8, 0x10

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/jvm/internal/j;->p(ZLg40/w2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const v1, -0x4cd31554

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x1

    if-ne v1, v0, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v10

    :goto_3
    and-int/lit8 p2, p2, 0x70

    if-ne p2, v9, :cond_5

    goto :goto_4

    :cond_5
    move v2, v10

    :goto_4
    or-int p2, v0, v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_6

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_7

    :cond_6
    new-instance v0, Le;

    const/16 p2, 0xf

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, p2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lc93/m;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v6, v0, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, La0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p3, v1}, La0;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static b(Lg40/m3;ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    const-string v0, "modifier"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x1a4f70e9

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-interface/range {p2 .. p2}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x6

    goto :goto_0

    :goto_1
    shr-int/lit8 v0, p7, 0xf

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, p7, 0x3

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x1c00

    or-int v12, v0, v1

    const/16 v13, 0x3f0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    invoke-static/range {v1 .. v13}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    const/4 p0, 0x0

    invoke-virtual {v11, p0}, Lp1/q;->q(Z)V

    return-void
.end method

.method public static final c(Lg1/l6;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    sget-object v0, Lg1/i1;->a:Lx1/b;

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v1, 0x50b985f0

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v8, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v8

    goto :goto_2

    :cond_2
    move v1, v8

    :goto_2
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    and-int/lit16 v3, v8, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x100

    goto :goto_4

    :cond_5
    const/16 v0, 0x80

    :goto_4
    or-int/2addr v1, v0

    :cond_6
    and-int/lit16 v0, v1, 0x93

    const/16 v3, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v0, v3, :cond_7

    move v0, v11

    goto :goto_5

    :cond_7
    move v0, v10

    :goto_5
    and-int/2addr v1, v11

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_8

    new-instance v0, Lg1/w2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lg1/w2;->a:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lg1/w2;->b:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v0

    check-cast v4, Lg1/w2;

    const/4 v0, 0x7

    invoke-static {v9, v0}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    iget-object v0, v4, Lg1/w2;->a:Ljava/lang/Object;

    iget-object v12, v4, Lg1/w2;->b:Ljava/util/ArrayList;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const v0, 0x86ffd03

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    iput-object v2, v4, Lg1/w2;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v1

    move v3, v10

    :goto_6
    if-ge v3, v1, :cond_9

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/v2;

    iget-object v6, v6, Lg1/v2;->a:Ljava/lang/Object;

    check-cast v6, Lg1/l6;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_9
    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    invoke-static {v3}, La4/b;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    move v15, v10

    :goto_7
    if-ge v15, v14, :cond_b

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lg1/l6;

    new-instance v0, Lg1/v2;

    move-object v6, v0

    new-instance v0, Lg1/j6;

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move/from16 p2, v11

    move-object/from16 v11, v16

    invoke-direct/range {v0 .. v6}, Lg1/j6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, -0x3d89679e

    invoke-static {v6, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-direct {v11, v1, v0}, Lg1/v2;-><init>(Lg1/l6;Lx1/b;)V

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move/from16 v11, p2

    goto :goto_7

    :cond_b
    move/from16 p2, v11

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    move/from16 p2, v11

    const v0, 0x5b75532

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_8
    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v1, v9, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lp1/q;->B()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    iget v1, v0, Lp1/v1;->b:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Lp1/v1;->b:I

    iput-object v0, v4, Lg1/w2;->c:Lp1/v1;

    const v0, -0x68c4deca

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v10

    :goto_a
    if-ge v1, v0, :cond_10

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/v2;

    iget-object v4, v3, Lg1/v2;->a:Ljava/lang/Object;

    check-cast v4, Lg1/l6;

    iget-object v3, v3, Lg1/v2;->b:Lx1/b;

    const v5, -0x5a553bb6

    invoke-virtual {v9, v5, v4}, Lp1/q;->b0(ILjava/lang/Object;)V

    new-instance v5, Lg1/k6;

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Lg1/k6;-><init>(Lg1/l6;I)V

    const v4, 0x7840dcef

    invoke-static {v4, v9, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v9, v5}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_10
    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move/from16 v0, p2

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no recompose scope found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Lf01/b;

    invoke-direct {v1, v2, v7, v8}, Lf01/b;-><init>(Lg1/l6;Landroidx/compose/ui/Modifier;I)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p4

    const-string v0, "sourceUrl"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, -0x2349bd2

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0xe

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v2, v9, 0x70

    if-nez v2, :cond_3

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v9, 0x380

    if-nez v2, :cond_5

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    move v6, v0

    and-int/lit16 v0, v6, 0x2db

    const/16 v2, 0x92

    if-ne v0, v2, :cond_7

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_7
    :goto_4
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x0

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v0, v10, :cond_8

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v2, v0

    check-cast v2, Lp1/c1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v3, v0

    check-cast v3, Lp1/c1;

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_a

    if-ne v5, v10, :cond_b

    :cond_a
    new-instance v0, Ln43/a;

    const/16 v5, 0xe

    invoke-direct/range {v0 .. v5}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_b
    check-cast v5, Lc93/m;

    invoke-static {v15, v5, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_5
    int-to-float v0, v0

    goto :goto_6

    :cond_c
    const/16 v0, 0x18

    goto :goto_5

    :goto_6
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    const/4 v11, 0x7

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    if-eqz v5, :cond_f

    const v3, -0x2b40b03f

    invoke-virtual {v15, v3}, Lp1/q;->f0(I)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v3, Li2/g;

    invoke-direct {v3, v2}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_d

    if-ne v5, v10, :cond_e

    :cond_d
    new-instance v5, Lch/c;

    const/16 v2, 0xa

    invoke-direct {v5, v8, v2}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lc93/a;

    invoke-static {v0, v13, v4, v5, v11}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    shl-int/lit8 v0, v6, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v5, v0, 0x8

    const/16 v6, 0xf8

    move-object v0, v3

    const/4 v3, 0x0

    move-object v4, v15

    invoke-static/range {v0 .. v6}, Lpf/c;->e(Li2/g;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_f
    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_12

    const v2, -0x2b40af2d

    invoke-virtual {v15, v2}, Lp1/q;->f0(I)V

    const v2, 0x7f0805ef

    invoke-static {v2, v15, v13}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_10

    if-ne v5, v10, :cond_11

    :cond_10
    new-instance v5, Lch/c;

    const/16 v3, 0xb

    invoke-direct {v5, v8, v3}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lc93/a;

    invoke-static {v0, v13, v4, v5, v11}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move v0, v13

    sget-wide v13, Li2/x;->n:J

    const/16 v16, 0xc38

    const-string v11, "Info Circle"

    move-object v10, v2

    invoke-static/range {v10 .. v16}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_12
    move v0, v13

    const v2, -0x2b40ad87

    invoke-virtual {v15, v2}, Lp1/q;->f0(I)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_13

    return-void

    :cond_13
    new-instance v2, Lc4/c;

    invoke-direct {v2, v1, v7, v8, v9}, Lc4/c;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lc93/a;I)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final e(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "onLogoutClicked"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, 0x76052d29

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v2, p1, 0x3

    if-ne v2, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_3

    :cond_2
    :goto_1
    const v0, 0x5a35e013

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_3

    sget-object v0, Lh00/i0;->a:Lh00/i0;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Ljava/util/List;

    const/4 v3, 0x0

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    const v4, 0x5a35eb65

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    and-int/lit8 p1, p1, 0xe

    if-ne p1, v1, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    move p1, v3

    :goto_2
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_5

    if-ne v1, v2, :cond_6

    :cond_5
    new-instance v1, Lh0/l0;

    const/4 p1, 0x2

    invoke-direct {v1, p0, p1}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v3, v1

    const/4 v1, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lse/b;->l(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lb30/y3;

    const/4 v1, 0x3

    invoke-direct {v0, p2, v1, p0}, Lb30/y3;-><init>(IILc93/a;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final f(Lk/f;)Lj/m;
    .locals 3

    invoke-static {}, Lc4/v;->c()I

    move-result v0

    new-instance v1, Lj/m;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lk/c;->a:Lk/c;

    iput-object v2, v1, Lj/m;->a:Lk/f;

    invoke-static {}, Lc4/v;->c()I

    iput-object p0, v1, Lj/m;->a:Lk/f;

    iput v0, v1, Lj/m;->b:I

    return-object v1
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, 0x389d996f

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    sget-object p1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v5, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld40/r;->p(J)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-wide v0, Li2/x;->b:J

    :goto_1
    move-wide v3, v0

    goto :goto_2

    :cond_2
    sget-wide v0, Li2/x;->f:J

    goto :goto_1

    :goto_2
    sget-object v0, Lb2/e;->E:Lb2/m;

    sget-object v1, Lt0/j;->a:Lt0/i;

    invoke-static {p0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/c1;

    invoke-virtual {p1}, Lg1/c1;->f()J

    move-result-wide v6

    sget-object p1, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v6, v7, p1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v2, v5, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x7f08084c

    invoke-static {p1, v5, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/16 p1, 0xc

    int-to-float p1, p1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x1

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lb30/v3;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lb30/v3;-><init>(Landroidx/compose/ui/Modifier;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final h(Lg1/n6;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 9

    check-cast p3, Lp1/q;

    const v0, 0x50888a6f

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    :goto_3
    or-int/lit16 v0, v0, 0x180

    and-int/lit16 v2, v0, 0x93

    const/16 v3, 0x92

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p3, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    if-eqz v1, :cond_6

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_6
    sget-object p2, Lg1/i1;->a:Lx1/b;

    iget-object v1, p0, Lg1/n6;->b:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/l6;

    sget-object v2, Lb3/v1;->a:Lp1/u2;

    invoke-virtual {p3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/g;

    invoke-virtual {p3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Ld30/o;

    const/4 v3, 0x0

    const/16 v5, 0x13

    invoke-direct {v4, v1, v2, v3, v5}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lc93/m;

    invoke-static {p3, v4, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v1, p0, Lg1/n6;->b:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/l6;

    and-int/lit16 v0, v0, 0x3f0

    invoke-static {v1, p1, p3, v0}, Lse/g;->c(Lg1/l6;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    move-object v4, p1

    move-object v5, p2

    goto :goto_6

    :cond_9
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v2, Lf02/c;

    const/16 v8, 0x9

    move-object v3, p0

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v8}, Lf02/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v2, p1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final i(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v2, p0

    move-object/from16 v0, p1

    move/from16 v11, p3

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v1, 0x6128be5b

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v20, v8

    goto :goto_4

    :cond_5
    :goto_3
    sget-object v3, Ld40/p;->e:Ld40/k;

    iget-object v3, v3, Ld40/k;->c:Ld40/j;

    iget v3, v3, Ld40/j;->a:F

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ld40/p;->e:Ld40/k;

    iget-object v5, v5, Ld40/k;->c:Ld40/j;

    iget v5, v5, Ld40/j;->c:F

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v4, v6, v5, v7}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x30

    invoke-static {v5, v8, v6}, Ld40/r;->d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v5

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    invoke-static {v8}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v6

    invoke-virtual {v6}, Lg1/c1;->h()J

    move-result-wide v12

    invoke-static {v8}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v6

    invoke-virtual {v6}, Lg1/c1;->h()J

    move-result-wide v16

    const/16 v21, 0x0

    const/16 v22, 0xa

    const-wide/16 v14, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v20, v8

    invoke-static/range {v12 .. v22}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v6

    sget-object v7, Lny/b;->a:Lx1/b;

    shr-int/lit8 v8, v1, 0x3

    and-int/lit8 v8, v8, 0xe

    const/high16 v9, 0x30000000

    or-int/2addr v8, v9

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int v9, v8, v1

    const/16 v10, 0x118

    move-object v1, v4

    move-object v4, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v8, v20

    invoke-static/range {v0 .. v10}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v3, La41/j;

    const/4 v4, 0x5

    invoke-direct {v3, v2, v0, v11, v4}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final j(Z)Lk3/a;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lk3/a;->w:Lk3/a;

    return-object p0

    :cond_0
    sget-object p0, Lk3/a;->x:Lk3/a;

    return-object p0
.end method

.method public static final k(Lcom/amplitude/android/engagement/types/Marker;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "marker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x3acccdd

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 v0, p2, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    instance-of v0, p0, Lcom/amplitude/android/engagement/types/IconMarker;

    const/4 v1, 0x0

    const/4 v8, 0x0

    if-eqz v0, :cond_7

    const p2, 0xdf29ddc

    invoke-virtual {v6, p2}, Lp1/q;->f0(I)V

    move-object p2, p0

    check-cast p2, Lcom/amplitude/android/engagement/types/IconMarker;

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/IconMarker;->getIcon()Lcom/amplitude/android/engagement/types/IconType;

    move-result-object v0

    sget-object v2, Lqj/c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const v0, 0x7f0805f1

    goto :goto_3

    :pswitch_1
    const v0, 0x7f0805f0

    goto :goto_3

    :pswitch_2
    const v0, 0x7f0805eb

    goto :goto_3

    :pswitch_3
    const v0, 0x7f0805ee

    goto :goto_3

    :pswitch_4
    const v0, 0x7f0805ed

    goto :goto_3

    :pswitch_5
    const v0, 0x7f0805ef

    :goto_3
    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/IconMarker;->getWidth()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :goto_4
    int-to-float p2, p2

    goto :goto_5

    :cond_4
    const/16 p2, 0x18

    goto :goto_4

    :goto_5
    invoke-static {v0, v6, v8}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lch/c;

    const/16 v2, 0xc

    invoke-direct {v3, p1, v2}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lc93/a;

    const/4 v2, 0x7

    invoke-static {p2, v8, v1, v3, v2}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-wide v4, Li2/x;->n:J

    const/16 v7, 0xc38

    const-string v2, "Tooltip Marker"

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    instance-of v0, p0, Lcom/amplitude/android/engagement/types/BeaconMarker;

    if-eqz v0, :cond_8

    const v0, 0xdf2a1f7

    invoke-virtual {v6, v0}, Lp1/q;->f0(I)V

    and-int/lit8 p2, p2, 0x70

    const/4 v0, 0x1

    invoke-static {v1, p1, v6, p2, v0}, Le4/a;->c(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    instance-of v0, p0, Lcom/amplitude/android/engagement/types/ImageMarker;

    if-eqz v0, :cond_9

    const v0, 0xdf2a269

    invoke-virtual {v6, v0}, Lp1/q;->f0(I)V

    move-object v0, p0

    check-cast v0, Lcom/amplitude/android/engagement/types/ImageMarker;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ImageMarker;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ImageMarker;->getWidth()Ljava/lang/Integer;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x3

    and-int/lit16 p2, p2, 0x380

    invoke-static {v1, v0, p1, v6, p2}, Lse/g;->d(Ljava/lang/String;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const p2, 0xdf2a2e0

    invoke-virtual {v6, p2}, Lp1/q;->f0(I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-nez p2, :cond_a

    return-void

    :cond_a
    new-instance v0, Lc4/q;

    const/4 v1, 0x7

    invoke-direct {v0, p0, p1, p3, v1}, Lc4/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final l(ZLt00/a;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "formHeaderInformation"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, -0x3f1a41d5

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v3, v3, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_5
    :goto_3
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    const v4, -0x40d804bc

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_6

    new-instance v4, Lm40/w;

    const/16 v5, 0x1e

    invoke-direct {v4, v3, v5}, Lm40/w;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v4

    check-cast v6, Lm40/w;

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const/16 v4, 0xc

    int-to-float v12, v4

    const/4 v14, 0x7

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v5

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v7, v5, v8, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v8, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v7, v8, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x29568d66

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    iget-boolean v4, v1, Lt00/a;->b:Z

    const/4 v15, 0x1

    if-eqz v4, :cond_c

    const v4, 0x20a0f6

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    iget v4, v1, Lt00/a;->c:I

    iget-object v5, v1, Lt00/a;->d:Ljava/lang/Integer;

    iget-object v7, v1, Lt00/a;->i:Ljava/lang/Integer;

    invoke-static {v4, v5, v7, v8}, Lx43/j;->H(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;)I

    move-result v4

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const v5, 0x384c01c9

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    iget-object v5, v1, Lt00/a;->e:Ljava/lang/String;

    iget-object v7, v1, Lt00/a;->f:Ljava/lang/String;

    const v10, -0xc01f75b

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    const v10, -0x5b23d4c6

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    invoke-static {v8}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v10

    iget-wide v10, v10, Ld40/n;->a:J

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    move-result v10

    float-to-double v10, v10

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    cmpg-double v10, v10, v16

    if-gez v10, :cond_a

    move v10, v15

    goto :goto_5

    :cond_a
    move v10, v3

    :goto_5
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    if-eqz v10, :cond_b

    if-eqz v7, :cond_b

    move-object v5, v7

    :cond_b
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    iget-boolean v7, v1, Lt00/a;->g:Z

    move v12, v13

    const/4 v13, 0x0

    const/16 v14, 0xb

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move/from16 v29, v12

    move-object v12, v9

    const/16 v9, 0x14

    int-to-float v9, v9

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v25, v8

    move-object v8, v9

    sget-object v9, Lb2/e;->E:Lb2/m;

    const v11, 0x36200

    move-object/from16 v10, v25

    invoke-static/range {v4 .. v11}, Ldc/a;->i(ILjava/lang/String;Lm40/w;ZLandroidx/compose/ui/Modifier;Lb2/m;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v10

    goto :goto_6

    :cond_c
    move-object v12, v9

    move/from16 v29, v13

    :goto_6
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->e()J

    move-result-wide v4

    iget-object v6, v1, Lt00/a;->a:Lzy/c;

    invoke-static {v6, v8}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/h9;

    iget-object v7, v7, Lg1/h9;->d:Ll3/v0;

    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    const v9, 0x3f19999a    # 0.6f

    invoke-static {v9, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    :goto_7
    const-string v9, "TEST_TAG_HEADER_TITLE"

    invoke-static {v12, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v27, 0xc30

    const v28, 0xd7f8

    move-object/from16 v24, v7

    move-object/from16 v25, v8

    move-wide/from16 v32, v4

    move-object v4, v6

    move-wide/from16 v6, v32

    move-object v5, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    move-object/from16 v20, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x2

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x1

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v26

    const/16 v26, 0x30

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const v4, 0x2956ff44

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    iget-object v4, v1, Lt00/a;->h:Ljava/lang/String;

    if-eqz v4, :cond_e

    const/4 v13, 0x0

    const/16 v14, 0xe

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v10, v29

    move-object/from16 v9, v31

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v9, 0x30

    const/16 v10, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lio/sentry/config/a;->k(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    :cond_e
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lam0/b;

    const/16 v5, 0x8

    invoke-direct {v4, v0, v1, v2, v5}, Lam0/b;-><init>(ZLjava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final m(Ld30/v;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "interactor"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x3674a7de

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_9

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v3, v6

    goto/16 :goto_12

    :cond_9
    :goto_6
    if-eqz v5, :cond_a

    sget-object v5, Lb2/t;->w:Lb2/t;

    move-object v15, v5

    goto :goto_7

    :cond_a
    move-object v15, v6

    :goto_7
    sget-object v5, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v10

    const v5, -0x52d06a9a

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_b

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lp1/c1;

    const/4 v7, 0x0

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    iget-object v8, v1, Ld30/v;->l:Ln53/e;

    invoke-static {v8, v13, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v11, v13, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v13, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v13, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v11, v13, v11, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld30/g1;

    iget-object v3, v3, Ld30/g1;->g:Lt00/a;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld30/g1;

    iget-boolean v7, v7, Ld30/g1;->b:Z

    const/4 v9, 0x1

    xor-int/2addr v7, v9

    const v11, -0x5aec02e6

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    if-eqz v3, :cond_11

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld30/g1;

    iget-object v11, v11, Ld30/g1;->a:Ljava/lang/String;

    sget-object v12, Ly00/f4;->G:Lt9/c0;

    const-string v12, "card"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    if-nez v2, :cond_10

    :cond_f
    move v11, v9

    goto :goto_9

    :cond_10
    const/4 v11, 0x0

    :goto_9
    if-eqz v11, :cond_11

    const/4 v11, 0x0

    invoke-static {v7, v3, v13, v11}, Lse/g;->l(ZLt00/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_11
    const/4 v11, 0x0

    :goto_a
    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld30/g1;

    iget-object v3, v3, Ld30/g1;->a:Ljava/lang/String;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld30/g1;

    iget-object v11, v11, Ld30/g1;->h:Ljava/util/List;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld30/g1;

    iget-object v12, v12, Ld30/g1;->e:Ls20/a;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld30/g1;

    iget-object v8, v8, Ld30/g1;->d:Lt20/n;

    const v14, -0x5aebb6a4

    invoke-virtual {v13, v14}, Lp1/q;->e0(I)V

    and-int/lit8 v14, v0, 0xe

    const/4 v9, 0x4

    if-eq v14, v9, :cond_13

    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_12

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    goto :goto_c

    :cond_12
    const/4 v9, 0x0

    :goto_b
    move/from16 v17, v0

    goto :goto_d

    :cond_13
    :goto_c
    const/4 v9, 0x1

    goto :goto_b

    :goto_d
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_14

    if-ne v0, v6, :cond_15

    :cond_14
    new-instance v0, Lck1/c;

    const/16 v9, 0x11

    invoke-direct {v0, v1, v9}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    const v9, -0x5aeb9af1

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x4

    if-eq v14, v9, :cond_17

    and-int/lit8 v9, v17, 0x8

    if-eqz v9, :cond_16

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    goto :goto_e

    :cond_16
    const/4 v9, 0x0

    goto :goto_f

    :cond_17
    :goto_e
    const/4 v9, 0x1

    :goto_f
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v9, :cond_19

    if-ne v14, v6, :cond_18

    goto :goto_10

    :cond_18
    const/4 v6, 0x1

    goto :goto_11

    :cond_19
    :goto_10
    new-instance v14, Ld30/l;

    const/4 v6, 0x1

    invoke-direct {v14, v6, v1, v5}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v14, Lc93/a;

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    move-object v9, v8

    move-object v8, v12

    move-object v12, v14

    const/4 v14, 0x0

    move v5, v7

    move-object v7, v11

    move-object v11, v0

    move v0, v6

    move-object v6, v3

    invoke-static/range {v5 .. v14}, Lce/w;->n(ZLjava/lang/String;Ljava/util/List;Ls20/a;Lt20/n;Ll0/l1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move-object v3, v15

    :goto_12
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lbg0/h;

    const/4 v6, 0x5

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method public static final n(Landroidx/compose/ui/Modifier;Ly00/c0;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSetDefaultClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRemoveClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdateClick"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x2058bb8f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v10, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x100

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v6, 0x800

    if-eqz v1, :cond_2

    move v1, v6

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v7, 0x4000

    if-eqz v1, :cond_3

    move v1, v7

    goto :goto_3

    :cond_3
    const/16 v1, 0x2000

    :goto_3
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x2493

    const/16 v8, 0x2492

    if-ne v1, v8, :cond_5

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_5
    :goto_4
    const v1, 0x3fea836b

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_6

    if-ne v8, v9, :cond_c

    :cond_6
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v1

    invoke-virtual {p1}, Ly00/c0;->h()Z

    move-result v8

    if-nez v8, :cond_7

    sget-object v8, Lq00/t;->d:Lq00/t;

    invoke-virtual {v1, v8}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_7
    instance-of v8, p1, Ly00/a0;

    if-eqz v8, :cond_8

    sget-object v11, Lq00/u;->d:Lq00/u;

    invoke-virtual {v1, v11}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_8
    new-instance v11, Lq00/s;

    if-nez v8, :cond_b

    instance-of v8, p1, Ly00/b0;

    if-eqz v8, :cond_9

    goto :goto_5

    :cond_9
    instance-of v8, p1, Ly00/x;

    if-eqz v8, :cond_a

    const v8, 0x7f14111d

    goto :goto_6

    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_b
    :goto_5
    const v8, 0x7f1410c0

    :goto_6
    invoke-static {v8}, Ls4/i;->h(I)Lzy/b;

    move-result-object v8

    invoke-direct {v11, v8}, Lq00/s;-><init>(Lzy/b;)V

    invoke-virtual {v1, v11}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Ljava/util/List;

    const/4 v1, 0x0

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const v11, 0x3feacd15

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    and-int/lit16 v11, v0, 0x380

    const/4 v12, 0x1

    if-ne v11, v2, :cond_d

    move v2, v12

    goto :goto_7

    :cond_d
    move v2, v1

    :goto_7
    and-int/lit16 v11, v0, 0x1c00

    if-ne v11, v6, :cond_e

    move v6, v12

    goto :goto_8

    :cond_e
    move v6, v1

    :goto_8
    or-int/2addr v2, v6

    const v6, 0xe000

    and-int/2addr v0, v6

    if-ne v0, v7, :cond_f

    goto :goto_9

    :cond_f
    move v12, v1

    :goto_9
    or-int v0, v2, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_10

    if-ne v2, v9, :cond_11

    :cond_10
    new-instance v2, Lno0/j0;

    const/16 v0, 0xf

    invoke-direct {v2, p2, v4, v5, v0}, Lno0/j0;-><init>(Lc93/a;Ll83/e;Ljava/lang/Object;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/4 v9, 0x6

    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, v8

    move-object v8, v2

    invoke-static/range {v6 .. v11}, Lse/b;->l(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V

    :goto_a
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, La81/g;

    const/16 v7, 0xd

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static o(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p0, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x21

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p2, :cond_0

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, p3, :cond_0

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v5

    if-ne v5, v3, :cond_0

    invoke-interface {p0, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p0, p1, p2, p3, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public static final p(Lrf/n;)Lq83/j;
    .locals 1

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p0

    sget-object v0, Lpf/u;->x:Lpf/s;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p0, Lpf/u;

    iget-object p0, p0, Lpf/u;->w:Lq83/j;

    return-object p0
.end method

.method public static q(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static r(Lqt/e;)Lio/sentry/e1;
    .locals 2

    sget-boolean p0, Lio/sentry/util/i;->a:Z

    if-nez p0, :cond_0

    sget-object p0, Lio/sentry/t2;->w:Lio/sentry/t2;

    const-string v0, "io.sentry.opentelemetry.OtelContextScopesStorage"

    invoke-static {p0, v0}, Lqt/e;->h(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, v0}, Lqt/e;->o(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    instance-of v0, p0, Lio/sentry/e1;

    if-eqz v0, :cond_0

    check-cast p0, Lio/sentry/e1;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    new-instance p0, Lio/sentry/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method public static final s(Lpf/a;Lq83/j;)Lq83/j;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    new-instance v2, Lbc3/l1;

    invoke-direct {v2, v0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p0

    invoke-interface {p0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    new-instance v0, Lbc3/b0;

    const-string v3, "call-context"

    invoke-direct {v0, v3}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    new-instance v0, Lmg/i;

    invoke-static {p1}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v3

    invoke-direct {v0, v3}, Lmg/i;-><init>(Lmg/h;)V

    invoke-interface {p0, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    new-instance v0, Log/k;

    sget-object v3, Log/k;->x:Log/d;

    invoke-interface {p1, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Log/k;

    if-eqz v3, :cond_0

    iget-object v3, v3, Log/k;->w:Ljava/util/Map;

    if-nez v3, :cond_1

    :cond_0
    sget-object v3, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-direct {v0, v3}, Log/k;-><init>(Ljava/util/Map;)V

    invoke-interface {p0, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-static {p1}, Lds/q;->z(Lq83/j;)Lng/f;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v3, Lng/h;

    invoke-direct {v3, v0}, Lng/h;-><init>(Lng/f;)V

    goto :goto_0

    :cond_2
    sget-object v3, Lq83/k;->w:Lq83/k;

    :goto_0
    invoke-interface {p0, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-interface {p1, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-nez p1, :cond_3

    return-object p0

    :cond_3
    new-instance v0, Lno0/e0;

    const/16 v1, 0x1d

    invoke-direct {v0, v2, v1}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x1

    invoke-interface {p1, v1, v1, v0}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    new-instance v0, Lpf/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-object p0
.end method

.method public static final t(Lu93/q0;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lse/g;->A(Lr93/c;)Lr93/c;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final u([B[B)[B
    .locals 5

    const-string v0, "key"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkf/a;

    invoke-direct {v0, p0}, Lkf/a;-><init>([B)V

    const-string p0, "EC"

    invoke-static {p0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v1

    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    const-string v3, "secp256r1"

    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    new-instance v2, Ljava/security/spec/ECPrivateKeySpec;

    new-instance v3, Ljava/math/BigInteger;

    iget-object v0, v0, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    const-string v4, "toByteArray(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v2, v3, v1}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    invoke-static {p0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p0

    const-string v0, "SHA256withECDSA"

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object p0

    const-string p1, "sign(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static v(Lcom/google/crypto/tink/shaded/protobuf/i;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->a(I)B

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/16 v3, 0x27

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    const/16 v4, 0x20

    if-lt v2, v4, :cond_0

    const/16 v4, 0x7e

    if-gt v2, v4, :cond_0

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x7

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v2, "\\r"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v2, "\\f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string v2, "\\v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string v2, "\\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string v2, "\\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string v2, "\\b"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string v2, "\\a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\\\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "\\\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "\\\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final w()Lp3/r;
    .locals 1

    sget-object v0, Lp3/r;->x:Lp3/r;

    sget-object v0, Lp3/r;->z:Lp3/r;

    return-object v0
.end method

.method public static final x(Lp3/r;I)I
    .locals 2

    sget-object v0, Lp3/r;->z:Lp3/r;

    invoke-virtual {p0, v0}, Lp3/r;->a(Lp3/r;)I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    if-ne p1, v1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    if-eqz p1, :cond_2

    if-eqz p0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    if-eqz p0, :cond_3

    return v1

    :cond_3
    if-eqz p1, :cond_4

    const/4 p0, 0x2

    return p0

    :cond_4
    return v0
.end method

.method public static final y(I)Lr7/k0;
    .locals 2

    int-to-double v0, p0

    new-instance p0, Lr7/k0;

    invoke-direct {p0, v0, v1}, Lr7/k0;-><init>(D)V

    return-object p0
.end method

.method public static final z(Lr93/c;)Ljava/lang/String;
    .locals 2

    const-string v0, "callableMemberDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lo93/h;->A(Lr93/k;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lse/g;->A(Lr93/c;)Lr93/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_4

    invoke-static {p0}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object p0

    instance-of v0, p0, Lr93/n0;

    if-eqz v0, :cond_2

    invoke-static {p0}, Lo93/h;->A(Lr93/k;)Z

    invoke-static {p0}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object p0

    sget-object v0, Lfa3/d;->z:Lfa3/d;

    invoke-static {p0, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_2

    :cond_1
    sget-object v0, Lfa3/f;->a:Ljava/lang/Object;

    invoke-static {p0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/h;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Lu93/q0;

    if-eqz v0, :cond_4

    sget v0, Lfa3/c;->l:I

    check-cast p0, Lu93/q0;

    sget-object v0, Lfa3/g0;->i:Ljava/util/LinkedHashMap;

    invoke-static {p0}, Lio/sentry/config/a;->p(Lr93/b;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    move-object p0, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/h;

    :goto_1
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_2
    return-object v1
.end method
