.class public abstract Llb3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(I)V
    .locals 7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x2

    if-eq p0, v0, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor"

    const/4 v5, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v6, "typeParameters"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_1
    aput-object v4, v3, v5

    goto :goto_2

    :pswitch_2
    const-string v6, "result"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_3
    const-string v6, "newContainingDeclaration"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_4
    const-string v6, "originalSubstitution"

    aput-object v6, v3, v5

    :goto_2
    const-string v5, "substituteTypeParameters"

    const/4 v6, 0x1

    if-eq p0, v0, :cond_2

    aput-object v4, v3, v6

    goto :goto_3

    :cond_2
    aput-object v5, v3, v6

    :goto_3
    if-eq p0, v0, :cond_3

    aput-object v5, v3, v2

    :cond_3
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static final b(Llb3/c0;Llb3/c0;)Llb3/f1;
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Llb3/y;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Llb3/s;

    invoke-direct {v0, p0, p1}, Llb3/s;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public static final c(Llb3/y;)Llb3/y;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb3/e1;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/e1;

    invoke-interface {p0}, Llb3/e1;->b()Llb3/y;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final d(Llb3/f1;Llb3/y;)Llb3/f1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Llb3/o;->c(Llb3/y;)Llb3/y;

    move-result-object p1

    invoke-static {p0, p1}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Llb3/y;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of v0, p0, Lnb3/i;

    if-nez v0, :cond_1

    instance-of v0, p0, Llb3/r;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/r;

    invoke-virtual {p0}, Llb3/r;->u0()Llb3/c0;

    move-result-object p0

    instance-of p0, p0, Lnb3/i;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final f(Llb3/f1;Z)Llb3/f1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llb3/d;->m(Llb3/f1;Z)Llb3/l;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {p0}, Llb3/o;->g(Llb3/f1;)Llb3/c0;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Llb3/f1;->r0(Z)Llb3/f1;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Llb3/f1;)Llb3/c0;
    .locals 7

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    instance-of v0, p0, Llb3/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Llb3/x;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    goto :goto_4

    :cond_1
    iget-object v0, p0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/y;

    invoke-static {v5}, Llb3/d1;->e(Llb3/y;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Llb3/y;->p0()Llb3/f1;

    move-result-object v4

    invoke-static {v4, v3}, Llb3/o;->f(Llb3/f1;Z)Llb3/f1;

    move-result-object v5

    const/4 v4, 0x1

    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    move-object v2, v1

    goto :goto_3

    :cond_4
    iget-object p0, p0, Llb3/x;->w:Llb3/y;

    if-eqz p0, :cond_5

    invoke-static {p0}, Llb3/d1;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    invoke-static {p0, v3}, Llb3/o;->f(Llb3/f1;Z)Llb3/f1;

    move-result-object p0

    goto :goto_2

    :cond_5
    move-object p0, v1

    :cond_6
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    new-instance v2, Llb3/x;

    invoke-direct {v2, v0}, Llb3/x;-><init>(Ljava/util/AbstractCollection;)V

    iput-object p0, v2, Llb3/x;->w:Llb3/y;

    :goto_3
    if-nez v2, :cond_7

    :goto_4
    return-object v1

    :cond_7
    invoke-virtual {v2}, Llb3/x;->a()Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Llb3/k0;Lr93/e;Ljava/util/List;)Llb3/c0;
    .locals 1

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/h;->e()Llb3/q0;

    move-result-object p1

    const-string v0, "getTypeConstructor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p2, p0, p1, v0}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;
    .locals 7

    const-string v0, "attributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lrb3/d;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    invoke-interface {p2}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p0}, Lr93/h;->i()Llb3/c0;

    move-result-object p0

    const-string p1, "getDefaultType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    invoke-interface {p2}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/x0;

    if-eqz v1, :cond_1

    check-cast v0, Lr93/x0;

    invoke-interface {v0}, Lr93/h;->i()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto/16 :goto_3

    :cond_1
    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_9

    invoke-static {v0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object v1

    invoke-static {v1}, Lcb3/e;->i(Lr93/b0;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    sget-object v3, Lmb3/f;->a:Lmb3/f;

    if-eqz v1, :cond_5

    check-cast v0, Lr93/e;

    instance-of v1, v0, Lu93/c0;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Lu93/c0;

    :cond_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Lu93/c0;->l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v5, v1

    goto :goto_3

    :cond_4
    :goto_1
    invoke-interface {v0}, Lr93/e;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    const-string v1, "getUnsubstitutedMemberScope(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    check-cast v0, Lr93/e;

    sget-object v1, Llb3/s0;->b:Llb3/d;

    invoke-virtual {v1, p2, p0}, Llb3/d;->f(Llb3/q0;Ljava/util/List;)Llb3/y0;

    move-result-object v1

    instance-of v4, v0, Lu93/c0;

    if-eqz v4, :cond_6

    move-object v2, v0

    check-cast v2, Lu93/c0;

    :cond_6
    if-eqz v2, :cond_8

    invoke-virtual {v2, v1, v3}, Lu93/c0;->b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    move-object v5, v2

    goto :goto_3

    :cond_8
    :goto_2
    invoke-interface {v0, v1}, Lr93/e;->n(Llb3/y0;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    const-string v1, "getMemberScope(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_9
    instance-of v1, v0, Lr93/w0;

    if-eqz v1, :cond_a

    sget-object v1, Lnb3/h;->z:Lnb3/h;

    check-cast v0, Lr93/w0;

    check-cast v0, Lu93/n;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    iget-object v0, v0, Lva3/h;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lnb3/l;->a(Lnb3/h;Z[Ljava/lang/String;)Lnb3/g;

    move-result-object v0

    goto :goto_0

    :cond_a
    instance-of v1, p2, Llb3/x;

    if-eqz v1, :cond_b

    move-object v0, p2

    check-cast v0, Llb3/x;

    const-string v1, "member scope for intersection type"

    iget-object v0, v0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->y(Ljava/lang/String;Ljava/util/Collection;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    goto/16 :goto_0

    :goto_3
    new-instance v6, Ldc3/s;

    invoke-direct {v6, p0, p1, p2, p3}, Ldc3/s;-><init>(Ljava/util/List;Llb3/k0;Llb3/q0;Z)V

    move-object v3, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    invoke-static/range {v1 .. v6}, Llb3/o;->l(Llb3/k0;Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)Llb3/c0;

    move-result-object p0

    return-object p0

    :cond_b
    move-object v2, p2

    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unsupported classifier: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for constructor: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j(Llb3/c0;Llb3/q0;)Llb3/c0;
    .locals 4

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v2

    const-string v3, "baseType"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "annotations"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "arguments"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0, p1, v2}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)Llb3/c0;
    .locals 8

    const-string v0, "attributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llb3/d0;

    new-instance v2, Ls;

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v2 .. v7}, Ls;-><init>(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)V

    move-object p0, v6

    move-object v6, v2

    move-object v2, p0

    move-object p0, v5

    move-object v5, v4

    move v4, v7

    invoke-direct/range {v1 .. v6}, Llb3/d0;-><init>(Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lrb3/d;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v1

    :cond_0
    new-instance p1, Llb3/e0;

    invoke-direct {p1, v1, p0}, Llb3/e0;-><init>(Llb3/c0;Llb3/k0;)V

    return-object p1
.end method

.method public static final l(Llb3/k0;Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)Llb3/c0;
    .locals 7

    const-string v0, "attributes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llb3/d0;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Llb3/d0;-><init>(Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lrb3/d;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v1

    :cond_0
    new-instance p1, Llb3/e0;

    invoke-direct {p1, v1, p0}, Llb3/e0;-><init>(Llb3/c0;Llb3/k0;)V

    return-object p1
.end method

.method public static m(Ljava/util/List;Llb3/y0;Lr93/k;Ljava/util/ArrayList;)Llb3/a1;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    invoke-static {p0, p1, p2, p3, v0}, Llb3/o;->n(Ljava/util/List;Llb3/y0;Lr93/k;Ljava/util/List;[Z)Llb3/a1;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "Substitution failed"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    const/4 p0, 0x3

    invoke-static {p0}, Llb3/o;->a(I)V

    throw v0

    :cond_2
    const/4 p0, 0x2

    invoke-static {p0}, Llb3/o;->a(I)V

    throw v0

    :cond_3
    const/4 p0, 0x1

    invoke-static {p0}, Llb3/o;->a(I)V

    throw v0
.end method

.method public static n(Ljava/util/List;Llb3/y0;Lr93/k;Ljava/util/List;[Z)Llb3/a1;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    if-eqz p2, :cond_7

    if-eqz v1, :cond_6

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    move v12, v6

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Lr93/x0;

    invoke-interface {v14}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object v8

    invoke-interface {v14}, Lr93/x0;->isReified()Z

    move-result v9

    invoke-interface {v14}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v10

    invoke-interface {v14}, Lr93/k;->getName()Lva3/h;

    move-result-object v11

    add-int/lit8 v15, v12, 0x1

    invoke-interface {v14}, Lr93/x0;->z()Lkb3/n;

    move-result-object v13

    move-object/from16 v7, p2

    invoke-static/range {v7 .. v13}, Lu93/u0;->M0(Lr93/k;Ls93/i;ZLlb3/g1;Lva3/h;ILkb3/n;)Lu93/u0;

    move-result-object v8

    invoke-interface {v14}, Lr93/x0;->e()Llb3/q0;

    move-result-object v7

    new-instance v9, Llb3/v0;

    invoke-virtual {v8}, Lu93/i;->i()Llb3/c0;

    move-result-object v10

    invoke-direct {v9, v10}, Llb3/v0;-><init>(Llb3/y;)V

    invoke-virtual {v3, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v14, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v12, v15

    goto :goto_0

    :cond_0
    new-instance v1, Llb3/r0;

    invoke-direct {v1, v3}, Llb3/r0;-><init>(Ljava/util/Map;)V

    invoke-static {v0, v1}, Llb3/a1;->e(Llb3/y0;Llb3/y0;)Llb3/a1;

    move-result-object v3

    new-instance v5, Llb3/x0;

    invoke-direct {v5, v0}, Llb3/x0;-><init>(Llb3/y0;)V

    invoke-static {v5, v1}, Llb3/a1;->e(Llb3/y0;Llb3/y0;)Llb3/a1;

    move-result-object v0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/x0;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu93/u0;

    invoke-interface {v5}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Llb3/y;

    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v9

    invoke-interface {v9}, Llb3/q0;->d()Lr93/h;

    move-result-object v9

    instance-of v10, v9, Lr93/x0;

    if-eqz v10, :cond_1

    check-cast v9, Lr93/x0;

    invoke-static {v9}, Lio/sentry/config/a;->H(Lr93/x0;)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v9, v3

    goto :goto_3

    :cond_1
    move-object v9, v0

    :goto_3
    sget-object v10, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {v9, v8, v10}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v9

    if-nez v9, :cond_2

    return-object v2

    :cond_2
    if-eq v9, v8, :cond_3

    if-eqz p4, :cond_3

    const/4 v8, 0x1

    aput-boolean v8, p4, v6

    :cond_3
    invoke-virtual {v7, v9}, Lu93/u0;->L0(Llb3/y;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, Lu93/u0;->Q0()V

    goto :goto_1

    :cond_5
    return-object v3

    :cond_6
    const/16 v0, 0x8

    invoke-static {v0}, Llb3/o;->a(I)V

    throw v2

    :cond_7
    const/4 v0, 0x7

    invoke-static {v0}, Llb3/o;->a(I)V

    throw v2

    :cond_8
    const/4 v0, 0x6

    invoke-static {v0}, Llb3/o;->a(I)V

    throw v2
.end method

.method public static final o(Llb3/c0;Llb3/c0;)Llb3/c0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abbreviatedType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Llb3/a;

    invoke-direct {v0, p0, p1}, Llb3/a;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public static final p(Llb3/f1;Llb3/y;)Llb3/f1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb3/e1;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/e1;

    invoke-interface {p0}, Llb3/e1;->G()Llb3/f1;

    move-result-object p0

    invoke-static {p0, p1}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_4

    invoke-virtual {p1, p0}, Llb3/y;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, Llb3/c0;

    if-eqz v0, :cond_2

    new-instance v0, Llb3/f0;

    check-cast p0, Llb3/c0;

    invoke-direct {v0, p0, p1}, Llb3/f0;-><init>(Llb3/c0;Llb3/y;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Llb3/r;

    if-eqz v0, :cond_3

    new-instance v0, Llb3/t;

    check-cast p0, Llb3/r;

    invoke-direct {v0, p0, p1}, Llb3/t;-><init>(Llb3/r;Llb3/y;)V

    return-object v0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_0
    return-object p0
.end method
