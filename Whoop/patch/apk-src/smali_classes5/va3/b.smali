.class public abstract Lva3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Class;)Lab3/f;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    const-string v1, "getComponentType(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p0, Lab3/f;

    sget-object v1, Lo93/m;->d:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->i()Lva3/e;

    move-result-object v1

    new-instance v2, Lva3/c;

    invoke-virtual {v1}, Lva3/e;->b()Lva3/e;

    move-result-object v3

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->g()Lva3/h;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-direct {p0, v2, v0}, Lab3/f;-><init>(Lva3/c;I)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldb3/c;->b(Ljava/lang/String;)Ldb3/c;

    move-result-object p0

    invoke-virtual {p0}, Ldb3/c;->d()Lo93/j;

    move-result-object p0

    const-string v1, "getPrimitiveType(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "topLevelFqName"

    if-lez v0, :cond_2

    new-instance v2, Lab3/f;

    iget-object p0, p0, Lo93/j;->z:Ljava/lang/Object;

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/e;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lva3/c;

    invoke-virtual {p0}, Lva3/e;->b()Lva3/e;

    move-result-object v3

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {p0}, Lva3/f;->g()Lva3/h;

    move-result-object p0

    invoke-direct {v1, v3, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v2, v1, v0}, Lab3/f;-><init>(Lva3/c;I)V

    return-object v2

    :cond_2
    new-instance v2, Lab3/f;

    iget-object p0, p0, Lo93/j;->y:Ljava/lang/Object;

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/e;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lva3/c;

    invoke-virtual {p0}, Lva3/e;->b()Lva3/e;

    move-result-object v3

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {p0}, Lva3/f;->g()Lva3/h;

    move-result-object p0

    invoke-direct {v1, v3, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-direct {v2, v1, v0}, Lab3/f;-><init>(Lva3/c;I)V

    return-object v2

    :cond_3
    invoke-static {p0}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object p0

    sget-object v1, Lq93/d;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lva3/c;->a()Lva3/e;

    move-result-object v1

    const-string v2, "fqName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lq93/d;->h:Ljava/util/HashMap;

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lva3/c;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p0, v1

    :goto_1
    new-instance v1, Lab3/f;

    invoke-direct {v1, p0, v0}, Lab3/f;-><init>(Lva3/c;I)V

    return-object v1
.end method

.method public static final b(Lkotlin/jvm/internal/k0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final c(Llb3/u0;Lr93/x0;)Llb3/u0;
    .locals 4

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v0

    sget-object v1, Llb3/g1;->y:Llb3/g1;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object p1

    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v0

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Llb3/u0;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Llb3/v0;

    new-instance v0, Llb3/z;

    sget-object v1, Lkb3/k;->e:Lkb3/b;

    const-string v2, "NO_LOCKS"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lbg/j;

    const/16 v3, 0x15

    invoke-direct {v2, p0, v3}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1, v2}, Llb3/z;-><init>(Lkb3/n;Lc93/a;)V

    invoke-direct {p1, v0}, Llb3/v0;-><init>(Llb3/y;)V

    return-object p1

    :cond_1
    new-instance p1, Llb3/v0;

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object p0

    invoke-direct {p1, p0}, Llb3/v0;-><init>(Llb3/y;)V

    return-object p1

    :cond_2
    new-instance p1, Llb3/v0;

    new-instance v0, Lza3/a;

    invoke-direct {v0, p0}, Lza3/a;-><init>(Llb3/u0;)V

    invoke-direct {p1, v0}, Llb3/v0;-><init>(Llb3/y;)V

    return-object p1

    :cond_3
    :goto_0
    return-object p0
.end method

.method public static d(Ljava/lang/String;Z)Lva3/c;
    .locals 8

    const-string v0, "string"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    const/16 v1, 0x60

    const/4 v2, 0x0

    invoke-static {p0, v1, v2, v2, v0}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_0
    const/4 v3, 0x4

    const-string v4, "/"

    invoke-static {p0, v4, v0, v3}, Lyb3/r;->l0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v0

    const-string v3, "`"

    const-string v4, ""

    if-ne v0, v1, :cond_1

    invoke-static {p0, v3, v4, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v5, "substring(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x2f

    const/16 v7, 0x2e

    invoke-static {v1, v6, v7}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v3, v4, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    move-object v4, v1

    :goto_0
    new-instance v0, Lva3/c;

    new-instance v1, Lva3/e;

    invoke-direct {v1, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v2, Lva3/e;

    invoke-direct {v2, p0}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2, p1}, Lva3/c;-><init>(Lva3/e;Lva3/e;Z)V

    return-object v0
.end method

.method public static final e(Ljava/lang/String;)V
    .locals 5

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x21

    if-gt v3, v2, :cond_0

    const/16 v3, 0x7f

    if-ge v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected char 0x"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x10

    invoke-static {v3}, Lva3/d;->c(I)V

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    const-string v3, "0"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v3, " at "

    const-string v4, " in header name: "

    invoke-static {v1, v2, v3, v4, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "name is empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x9

    if-eq v2, v3, :cond_3

    const/16 v3, 0x20

    if-gt v3, v2, :cond_0

    const/16 v3, 0x7f

    if-ge v2, v3, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected char 0x"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x10

    invoke-static {v3}, Lva3/d;->c(I)V

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    const-string v3, "0"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v3, " at "

    const-string v4, " in "

    invoke-static {v1, v2, v3, v4, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lwd3/f;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p0, ""

    goto :goto_1

    :cond_2
    const-string p1, ": "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Loa3/p;Ljava/lang/annotation/Annotation;)V
    .locals 3

    invoke-static {p1}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v0

    invoke-static {v0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v1

    new-instance v2, Lw93/a;

    invoke-direct {v2, p1}, Lw93/a;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {p0, v1, v2}, Loa3/p;->i(Lva3/c;Lw93/a;)Loa3/n;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1, v0}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public static i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 11

    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p2

    const-string v0, "getDeclaredMethods(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_d

    aget-object v3, p2, v2

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ljava/lang/Class;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    check-cast v4, Ljava/lang/Class;

    invoke-static {v4}, Lva3/b;->a(Ljava/lang/Class;)Lab3/f;

    move-result-object v4

    invoke-interface {p0, v3, v4}, Loa3/n;->n(Lva3/h;Lab3/f;)V

    goto/16 :goto_7

    :cond_0
    sget-object v7, Lw93/c;->a:Ljava/util/Set;

    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {p0, v3, v4}, Loa3/n;->p(Lva3/h;Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    sget-object v7, Lx93/c;->a:Ljava/util/List;

    const-class v7, Ljava/lang/Enum;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Ljava/lang/Class;->isEnum()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v5

    :goto_1
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v5

    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v4

    invoke-interface {p0, v3, v5, v4}, Loa3/n;->q(Lva3/h;Lva3/c;Lva3/h;)V

    goto/16 :goto_7

    :cond_3
    const-class v7, Ljava/lang/annotation/Annotation;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v5}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v5

    const-string v6, "getInterfaces(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lm83/n;->M0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v6

    invoke-interface {p0, v6, v3}, Loa3/n;->s(Lva3/c;Lva3/h;)Loa3/n;

    move-result-object v3

    if-nez v3, :cond_4

    goto/16 :goto_7

    :cond_4
    check-cast v4, Ljava/lang/annotation/Annotation;

    invoke-static {v3, v4, v5}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    goto/16 :goto_7

    :cond_5
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {p0, v3}, Loa3/n;->m(Lva3/h;)Loa3/o;

    move-result-object v3

    if-nez v3, :cond_6

    goto/16 :goto_7

    :cond_6
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isEnum()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-static {v5}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v5

    check-cast v4, [Ljava/lang/Object;

    array-length v6, v4

    move v7, v1

    :goto_2
    if-ge v7, v6, :cond_b

    aget-object v8, v4, v7

    const-string v9, "null cannot be cast to non-null type kotlin.Enum<*>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/Enum;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    invoke-interface {v3, v5, v8}, Loa3/o;->G(Lva3/c;Lva3/h;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    check-cast v4, [Ljava/lang/Object;

    array-length v5, v4

    move v6, v1

    :goto_3
    if-ge v6, v5, :cond_b

    aget-object v7, v4, v6

    const-string v8, "null cannot be cast to non-null type java.lang.Class<*>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Class;

    invoke-static {v7}, Lva3/b;->a(Ljava/lang/Class;)Lab3/f;

    move-result-object v7

    invoke-interface {v3, v7}, Loa3/o;->X(Lab3/f;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_a

    check-cast v4, [Ljava/lang/Object;

    array-length v6, v4

    move v7, v1

    :goto_4
    if-ge v7, v6, :cond_b

    aget-object v8, v4, v7

    invoke-static {v5}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v9

    invoke-interface {v3, v9}, Loa3/o;->i0(Lva3/c;)Loa3/n;

    move-result-object v9

    if-nez v9, :cond_9

    goto :goto_5

    :cond_9
    const-string v10, "null cannot be cast to non-null type kotlin.Annotation"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/annotation/Annotation;

    invoke-static {v9, v8, v5}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_a
    check-cast v4, [Ljava/lang/Object;

    array-length v5, v4

    move v6, v1

    :goto_6
    if-ge v6, v5, :cond_b

    aget-object v7, v4, v6

    invoke-interface {v3, v7}, Loa3/o;->Y(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_b
    invoke-interface {v3}, Loa3/o;->l()V

    goto :goto_7

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unsupported annotation argument value ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "): "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_d
    invoke-interface {p0}, Loa3/n;->l()V

    return-void
.end method

.method public static final j(Lz93/b;Lz93/a;Lr93/g0;Lva3/h;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "from"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "scopeOwner"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "name"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lu93/g0;

    iget-object p0, p2, Lu93/g0;->F:Lva3/e;

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    iget-object p0, p0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {p3}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "asString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "packageFqName"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static k(Lva3/e;)Lva3/c;
    .locals 2

    const-string v0, "topLevelFqName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lva3/c;

    invoke-virtual {p0}, Lva3/e;->b()Lva3/e;

    move-result-object v1

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {p0}, Lva3/f;->g()Lva3/h;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static l(Llb3/y0;)Llb3/y0;
    .locals 4

    instance-of v0, p0, Llb3/u;

    if-eqz v0, :cond_1

    check-cast p0, Llb3/u;

    iget-object v0, p0, Llb3/u;->b:[Lr93/x0;

    iget-object p0, p0, Llb3/u;->c:[Llb3/u0;

    invoke-static {p0, v0}, Lm83/n;->d1([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Llb3/u0;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Lr93/x0;

    invoke-static {v3, v2}, Lva3/b;->c(Llb3/u0;Lr93/x0;)Llb3/u0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Llb3/u0;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Llb3/u0;

    new-instance v1, Llb3/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p0, v2}, Llb3/u;-><init>([Lr93/x0;[Llb3/u0;Z)V

    return-object v1

    :cond_1
    new-instance v0, Lza3/d;

    invoke-direct {v0, p0}, Lza3/d;-><init>(Llb3/y0;)V

    return-object v0
.end method
