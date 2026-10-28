.class public final Lx93/p;
.super Lx93/a0;
.source "SourceFile"

# interfaces
.implements Lma3/e;


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Lx93/r;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 3

    const-string v0, "reflectType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/p;->a:Ljava/lang/reflect/Type;

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    new-instance v0, Lx93/n;

    check-cast p1, Ljava/lang/Class;

    invoke-direct {v0, p1}, Lx93/n;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_1

    new-instance v0, Lx93/b0;

    check-cast p1, Ljava/lang/reflect/TypeVariable;

    invoke-direct {v0, p1}, Lx93/b0;-><init>(Ljava/lang/reflect/TypeVariable;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    new-instance v0, Lx93/n;

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type java.lang.Class<*>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Class;

    invoke-direct {v0, p1}, Lx93/n;-><init>(Ljava/lang/Class;)V

    :goto_0
    iput-object v0, p0, Lx93/p;->b:Lx93/r;

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not a classifier type ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Lva3/e;)Lx93/d;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lx93/p;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final c()Lma3/c;
    .locals 1

    iget-object v0, p0, Lx93/p;->b:Lx93/r;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Type not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lx93/p;->a:Ljava/lang/reflect/Type;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx93/p;->a:Ljava/lang/reflect/Type;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lx93/p;->a:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lx93/c;->c(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Type;

    const-string v3, "type"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_0

    move-object v4, v2

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v2, Lx93/y;

    invoke-direct {v2, v4}, Lx93/y;-><init>(Ljava/lang/Class;)V

    goto :goto_3

    :cond_0
    instance-of v4, v2, Ljava/lang/reflect/GenericArrayType;

    if-nez v4, :cond_3

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    instance-of v3, v2, Ljava/lang/reflect/WildcardType;

    if-eqz v3, :cond_2

    new-instance v3, Lx93/d0;

    check-cast v2, Ljava/lang/reflect/WildcardType;

    invoke-direct {v3, v2}, Lx93/d0;-><init>(Ljava/lang/reflect/WildcardType;)V

    :goto_1
    move-object v2, v3

    goto :goto_3

    :cond_2
    new-instance v3, Lx93/p;

    invoke-direct {v3, v2}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    goto :goto_1

    :cond_3
    :goto_2
    new-instance v3, Lx93/h;

    invoke-direct {v3, v2}, Lx93/h;-><init>(Ljava/lang/reflect/Type;)V

    goto :goto_1

    :goto_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, Lx93/p;->a:Ljava/lang/reflect/Type;

    instance-of v1, v0, Ljava/lang/Class;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    return v1

    :cond_1
    return v2
.end method

.method public final getAnnotations()Ljava/util/Collection;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
