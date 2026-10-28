.class public abstract Llb3/b;
.super Llb3/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lkb3/n;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Llb3/f;-><init>(Lkb3/n;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Llb3/b;->k(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic k(I)V
    .locals 9

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v5, v1

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"

    const/4 v7, 0x0

    if-eq p0, v2, :cond_3

    if-eq p0, v4, :cond_2

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_3

    const-string v8, "storageManager"

    aput-object v8, v5, v7

    goto :goto_2

    :cond_2
    const-string v8, "classifier"

    aput-object v8, v5, v7

    goto :goto_2

    :cond_3
    aput-object v6, v5, v7

    :goto_2
    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    aput-object v6, v5, v2

    goto :goto_3

    :cond_4
    const-string v6, "getAdditionalNeighboursInSupertypeGraph"

    aput-object v6, v5, v2

    goto :goto_3

    :cond_5
    const-string v6, "getBuiltIns"

    aput-object v6, v5, v2

    :goto_3
    if-eq p0, v2, :cond_7

    if-eq p0, v4, :cond_6

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    const-string v6, "<init>"

    aput-object v6, v5, v4

    goto :goto_4

    :cond_6
    const-string v6, "isSameClassifier"

    aput-object v6, v5, v4

    :cond_7
    :goto_4
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_8

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0
.end method


# virtual methods
.method public final c()Lo93/h;
    .locals 1

    invoke-virtual {p0}, Llb3/b;->l()Lr93/e;

    move-result-object v0

    invoke-static {v0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Llb3/b;->k(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public bridge synthetic d()Lr93/h;
    .locals 1

    invoke-virtual {p0}, Llb3/b;->l()Lr93/e;

    move-result-object v0

    return-object v0
.end method

.method public final e()Llb3/y;
    .locals 3

    invoke-virtual {p0}, Llb3/b;->l()Lr93/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    sget-object v2, Lo93/h;->e:Lva3/h;

    sget-object v2, Lo93/m;->a:Lva3/f;

    invoke-static {v0, v2}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lo93/m;->b:Lva3/f;

    invoke-static {v0, v2}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Llb3/b;->c()Lo93/h;

    move-result-object v0

    invoke-virtual {v0}, Lo93/h;->e()Llb3/c0;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object v1

    :cond_2
    const/16 v0, 0x6b

    invoke-static {v0}, Lo93/h;->a(I)V

    throw v1
.end method

.method public final i(Lr93/h;)Z
    .locals 5

    instance-of v0, p1, Lr93/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Llb3/b;->l()Lr93/e;

    move-result-object v0

    const-string v2, "first"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    move p1, v1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    :goto_1
    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    instance-of v2, v0, Lr93/b0;

    if-eqz v2, :cond_2

    instance-of p1, p1, Lr93/b0;

    goto :goto_2

    :cond_2
    instance-of v2, p1, Lr93/b0;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    instance-of v2, v0, Lr93/g0;

    if-eqz v2, :cond_5

    instance-of v2, p1, Lr93/g0;

    if-eqz v2, :cond_0

    check-cast v0, Lr93/g0;

    check-cast v0, Lu93/g0;

    iget-object v0, v0, Lu93/g0;->F:Lva3/e;

    check-cast p1, Lr93/g0;

    check-cast p1, Lu93/g0;

    iget-object p1, p1, Lu93/g0;->F:Lva3/e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    :cond_4
    move p1, v3

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lr93/g0;

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    goto :goto_1

    :goto_2
    if-eqz p1, :cond_8

    return v3

    :cond_8
    return v1
.end method

.method public abstract l()Lr93/e;
.end method
