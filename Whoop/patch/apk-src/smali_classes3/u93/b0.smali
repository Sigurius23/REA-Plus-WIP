.class public final Lu93/b0;
.super Lu93/c0;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/ArrayList;

.field public F:Llb3/i;

.field public final w:Lu93/c0;

.field public final x:Llb3/a1;

.field public y:Llb3/a1;

.field public z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lu93/c0;Llb3/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu93/b0;->w:Lu93/c0;

    iput-object p2, p0, Lu93/b0;->x:Llb3/a1;

    return-void
.end method

.method public static synthetic E(I)V
    .locals 15

    const/16 v0, 0x17

    const/16 v1, 0xd

    const/16 v2, 0xa

    const/16 v3, 0x8

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq p0, v7, :cond_0

    if-eq p0, v6, :cond_0

    if-eq p0, v5, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v8, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v8, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v7, :cond_1

    if-eq p0, v6, :cond_1

    if-eq p0, v5, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    move v9, v6

    :goto_1
    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"

    const/4 v11, 0x0

    if-eq p0, v7, :cond_5

    if-eq p0, v6, :cond_4

    if-eq p0, v5, :cond_3

    if-eq p0, v4, :cond_4

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_3

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_2

    aput-object v10, v9, v11

    goto :goto_2

    :cond_2
    const-string v12, "substitutor"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_3
    const-string v12, "typeSubstitution"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_4
    const-string v12, "kotlinTypeRefiner"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_5
    const-string v12, "typeArguments"

    aput-object v12, v9, v11

    :goto_2
    const-string v11, "getMemberScope"

    const-string v12, "getUnsubstitutedMemberScope"

    const-string v13, "substitute"

    const/4 v14, 0x1

    packed-switch p0, :pswitch_data_0

    const-string v10, "getTypeConstructor"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_0
    const-string v10, "getSealedSubclasses"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_1
    const-string v10, "getDeclaredTypeParameters"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_2
    const-string v10, "getSource"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_3
    const-string v10, "getUnsubstitutedInnerClassesScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_4
    const-string v10, "getVisibility"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_5
    const-string v10, "getModality"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_6
    const-string v10, "getKind"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_7
    aput-object v13, v9, v14

    goto :goto_3

    :pswitch_8
    const-string v10, "getContainingDeclaration"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_9
    const-string v10, "getOriginal"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_a
    const-string v10, "getName"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_b
    const-string v10, "getAnnotations"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_c
    const-string v10, "getConstructors"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_d
    const-string v10, "getContextReceivers"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_e
    const-string v10, "getDefaultType"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_f
    const-string v10, "getStaticScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_10
    aput-object v12, v9, v14

    goto :goto_3

    :pswitch_11
    aput-object v11, v9, v14

    goto :goto_3

    :pswitch_12
    aput-object v10, v9, v14

    :goto_3
    if-eq p0, v7, :cond_8

    if-eq p0, v6, :cond_8

    if-eq p0, v5, :cond_8

    if-eq p0, v4, :cond_8

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_6

    goto :goto_4

    :cond_6
    aput-object v13, v9, v7

    goto :goto_4

    :cond_7
    aput-object v12, v9, v7

    goto :goto_4

    :cond_8
    aput-object v11, v9, v7

    :goto_4
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eq p0, v7, :cond_9

    if-eq p0, v6, :cond_9

    if-eq p0, v5, :cond_9

    if-eq p0, v4, :cond_9

    if-eq p0, v3, :cond_9

    if-eq p0, v2, :cond_9

    if-eq p0, v1, :cond_9

    if-eq p0, v0, :cond_9

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_12
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final G()Llb3/a1;
    .locals 4

    iget-object v0, p0, Lu93/b0;->y:Llb3/a1;

    if-nez v0, :cond_3

    iget-object v0, p0, Lu93/b0;->x:Llb3/a1;

    iget-object v1, v0, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v1}, Llb3/y0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-object v0, p0, Lu93/b0;->y:Llb3/a1;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v1}, Lr93/h;->e()Llb3/q0;

    move-result-object v1

    invoke-interface {v1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lu93/b0;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Llb3/a1;->f()Llb3/y0;

    move-result-object v0

    iget-object v2, p0, Lu93/b0;->z:Ljava/util/ArrayList;

    invoke-static {v1, v0, p0, v2}, Llb3/o;->m(Ljava/util/List;Llb3/y0;Lr93/k;Ljava/util/ArrayList;)Llb3/a1;

    move-result-object v0

    iput-object v0, p0, Lu93/b0;->y:Llb3/a1;

    iget-object v0, p0, Lu93/b0;->z:Ljava/util/ArrayList;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr93/x0;

    invoke-interface {v3}, Lr93/x0;->D()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lu93/b0;->E:Ljava/util/ArrayList;

    :cond_3
    :goto_1
    iget-object v0, p0, Lu93/b0;->y:Llb3/a1;

    return-object v0
.end method

.method public final H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x1c

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final I()Lr93/y0;
    .locals 7

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->I()Lr93/y0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    instance-of v1, v0, Lr93/x;

    iget-object v2, p0, Lu93/b0;->x:Llb3/a1;

    if-eqz v1, :cond_3

    new-instance v1, Lr93/x;

    check-cast v0, Lr93/x;

    iget-object v3, v0, Lr93/x;->a:Lva3/h;

    iget-object v0, v0, Lr93/x;->b:Lob3/h;

    check-cast v0, Llb3/c0;

    if-eqz v0, :cond_2

    iget-object v2, v2, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v2}, Llb3/y0;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v2

    sget-object v4, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v2, v0, v4}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v0

    check-cast v0, Llb3/c0;

    :cond_2
    :goto_0
    invoke-direct {v1, v3, v0}, Lr93/x;-><init>(Lva3/h;Lob3/h;)V

    return-object v1

    :cond_3
    instance-of v1, v0, Lr93/c0;

    if-eqz v1, :cond_7

    check-cast v0, Lr93/c0;

    iget-object v0, v0, Lr93/c0;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Lva3/h;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lob3/h;

    check-cast v3, Llb3/c0;

    if-eqz v3, :cond_5

    iget-object v5, v2, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v5}, Llb3/y0;->e()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v5

    sget-object v6, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v5, v3, v6}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v3

    check-cast v3, Llb3/c0;

    :cond_5
    :goto_2
    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v0, Lr93/c0;

    invoke-direct {v0, v1}, Lr93/c0;-><init>(Ljava/util/ArrayList;)V

    return-object v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-static {v0}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object v0

    invoke-static {v0}, Lcb3/e;->i(Lr93/b0;)V

    sget-object v0, Lmb3/f;->a:Lmb3/f;

    invoke-virtual {p0, v0}, Lu93/b0;->l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0
.end method

.method public final L()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/z;->L()Z

    move-result v0

    return v0
.end method

.method public final M()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x11

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final N()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->N()Z

    move-result v0

    return v0
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->Q()Z

    move-result v0

    return v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitClassDescriptor(Lr93/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final U()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/z;->U()Z

    move-result v0

    return v0
.end method

.method public final V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0xf

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final a()Lr93/e;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->a()Lr93/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x15

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-virtual {v0, p1, p2}, Lu93/c0;->b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    iget-object p2, p0, Lu93/b0;->x:Llb3/a1;

    iget-object p2, p2, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {p2}, Llb3/y0;->e()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x7

    invoke-static {p1}, Lu93/b0;->E(I)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;

    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/a1;)V

    return-object p2
.end method

.method public final d(Llb3/a1;)Lr93/l;
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lu93/b0;

    invoke-virtual {p1}, Llb3/a1;->f()Llb3/y0;

    move-result-object p1

    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v1

    invoke-virtual {v1}, Llb3/a1;->f()Llb3/y0;

    move-result-object v1

    invoke-static {p1, v1}, Llb3/a1;->e(Llb3/y0;Llb3/y0;)Llb3/a1;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lu93/b0;-><init>(Lu93/c0;Llb3/a1;)V

    return-object v0

    :cond_1
    const/16 p1, 0x17

    invoke-static {p1}, Lu93/b0;->E(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final e()Llb3/q0;
    .locals 6

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    iget-object v1, p0, Lu93/b0;->x:Llb3/a1;

    iget-object v1, v1, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v1}, Llb3/y0;->e()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lu93/b0;->E(I)V

    throw v2

    :cond_1
    iget-object v1, p0, Lu93/b0;->F:Llb3/i;

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v1

    invoke-interface {v0}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/y;

    sget-object v5, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v1, v4, v5}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Llb3/i;

    iget-object v1, p0, Lu93/b0;->z:Ljava/util/ArrayList;

    sget-object v4, Lkb3/k;->e:Lkb3/b;

    invoke-direct {v0, p0, v1, v3, v4}, Llb3/i;-><init>(Lu93/c0;Ljava/util/List;Ljava/util/Collection;Lkb3/n;)V

    iput-object v0, p0, Lu93/b0;->F:Llb3/i;

    :cond_3
    iget-object v0, p0, Lu93/b0;->F:Llb3/i;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Lu93/b0;->E(I)V

    throw v2
.end method

.method public final g()Lr93/k;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x16

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x13

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->getConstructors()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu93/j;

    move-object v3, v2

    check-cast v3, Lu93/x;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {v3, v4}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object v4

    invoke-virtual {v2}, Lu93/j;->W0()Lu93/j;

    move-result-object v2

    iput-object v2, v4, Lu93/w;->E:Lr93/w;

    invoke-virtual {v3}, Lu93/x;->k()Lr93/a0;

    move-result-object v2

    invoke-virtual {v4, v2}, Lu93/w;->p(Lr93/a0;)Lr93/v;

    invoke-virtual {v3}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v2

    invoke-virtual {v4, v2}, Lu93/w;->w(Lr93/r;)Lr93/v;

    invoke-virtual {v3}, Lu93/x;->getKind()I

    move-result v2

    invoke-virtual {v4, v2}, Lu93/w;->f(I)Lr93/v;

    const/4 v2, 0x0

    iput-boolean v2, v4, Lu93/w;->M:Z

    iget-object v2, v4, Lu93/w;->X:Lu93/x;

    invoke-virtual {v2, v4}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object v2

    check-cast v2, Lu93/j;

    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu93/j;->Z0(Llb3/a1;)Lu93/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final getKind()Lr93/f;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->getKind()Lr93/f;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x19

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getName()Lva3/h;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x14

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->getVisibility()Lr93/r;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x1b

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i()Llb3/c0;
    .locals 5

    invoke-virtual {p0}, Lu93/b0;->e()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Llb3/d1;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lu93/b0;->getAnnotations()Ls93/i;

    move-result-object v1

    invoke-interface {v1}, Ls93/i;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v1, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Llb3/k0;->y:Llb3/k0;

    goto :goto_0

    :cond_0
    sget-object v2, Llb3/k0;->x:Lwe/o;

    new-instance v3, Llb3/g;

    invoke-direct {v3, v1}, Llb3/g;-><init>(Ls93/i;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object v1

    :goto_0
    invoke-virtual {p0}, Lu93/b0;->e()Llb3/q0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0}, Lu93/b0;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v4

    invoke-static {v0, v4, v1, v2, v3}, Llb3/o;->k(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v0

    return-object v0
.end method

.method public final isExternal()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/z;->isExternal()Z

    move-result v0

    return v0
.end method

.method public final isInline()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->isInline()Z

    move-result v0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/i;->isInner()Z

    move-result v0

    return v0
.end method

.method public final isValue()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->isValue()Z

    move-result v0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    iget-object v0, p0, Lu93/b0;->E:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x1e

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->k()Lr93/a0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x1a

    invoke-static {v0}, Lu93/b0;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-virtual {v0, p1}, Lu93/c0;->l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    iget-object v0, p0, Lu93/b0;->x:Llb3/a1;

    iget-object v0, v0, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0xe

    invoke-static {p1}, Lu93/b0;->E(I)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;

    invoke-virtual {p0}, Lu93/b0;->G()Llb3/a1;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/a1;)V

    return-object v0
.end method

.method public final n(Llb3/y0;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-static {p0}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object v0

    invoke-static {v0}, Lcb3/e;->i(Lr93/b0;)V

    sget-object v0, Lmb3/f;->a:Lmb3/f;

    invoke-virtual {p0, p1, v0}, Lu93/b0;->b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    return-object p1
.end method

.method public final o0()Z
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->o0()Z

    move-result v0

    return v0
.end method

.method public final q0()Lr93/q0;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final s()Lu93/j;
    .locals 1

    iget-object v0, p0, Lu93/b0;->w:Lu93/c0;

    invoke-interface {v0}, Lr93/e;->s()Lu93/j;

    move-result-object v0

    return-object v0
.end method
