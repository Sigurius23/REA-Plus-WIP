.class public final Lx93/n;
.super Lx93/r;
.source "SourceFile"

# interfaces
.implements Lma3/b;
.implements Lma3/c;
.implements Lma3/f;


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/n;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;)Lx93/d;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Ls7/a;->e([Ljava/lang/annotation/Annotation;Lva3/e;)Lx93/d;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b()Ljava/util/Collection;
    .locals 4

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v1, "getDeclaredFields(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v0

    sget-object v1, Lx93/k;->w:Lx93/k;

    new-instance v2, Lxb3/f;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v1}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    sget-object v0, Lx93/l;->w:Lx93/l;

    invoke-static {v2, v0}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final c()Lva3/e;
    .locals 1

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-static {v0}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v0

    invoke-virtual {v0}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getDeclaredMethods(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v0

    new-instance v1, Ls;

    const/16 v2, 0x1c

    invoke-direct {v1, p0, v2}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    sget-object v1, Lx93/m;->w:Lx93/m;

    invoke-static {v0, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final e()Lva3/h;
    .locals 2

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-static {v0, v1, v0}, Lyb3/r;->G0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lx93/n;

    if-eqz v0, :cond_0

    check-cast p1, Lx93/n;

    iget-object p1, p1, Lx93/n;->a:Ljava/lang/Class;

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 8

    const-string v0, "clazz"

    iget-object v1, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/b;->a:Lzt/q;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-class v0, Ljava/lang/Class;

    :try_start_0
    new-instance v3, Lzt/q;

    const-string v4, "isSealed"

    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "getPermittedSubclasses"

    invoke-virtual {v0, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v6, "isRecord"

    invoke-virtual {v0, v6, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const-string v7, "getRecordComponents"

    invoke-virtual {v0, v7, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-direct {v3, v4, v5, v6, v0}, Lzt/q;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v3

    goto :goto_0

    :catch_0
    new-instance v0, Lzt/q;

    invoke-direct {v0, v2, v2, v2, v2}, Lzt/q;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    :goto_0
    sput-object v0, Lvo/b;->a:Lzt/q;

    :cond_0
    iget-object v0, v0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    :goto_1
    const/4 v0, 0x0

    if-nez v2, :cond_2

    new-array v2, v0, [Ljava/lang/Object;

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    array-length v3, v2

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v2

    :goto_2
    if-ge v0, v3, :cond_3

    aget-object v4, v2, v0

    new-instance v5, Lx93/z;

    invoke-direct {v5, v4}, Lx93/z;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    return-object v1
.end method

.method public final g()Z
    .locals 8

    const-string v0, "clazz"

    iget-object v1, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/b;->a:Lzt/q;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-class v0, Ljava/lang/Class;

    :try_start_0
    new-instance v3, Lzt/q;

    const-string v4, "isSealed"

    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "getPermittedSubclasses"

    invoke-virtual {v0, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v6, "isRecord"

    invoke-virtual {v0, v6, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const-string v7, "getRecordComponents"

    invoke-virtual {v0, v7, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-direct {v3, v4, v5, v6, v0}, Lzt/q;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v3

    goto :goto_0

    :catch_0
    new-instance v0, Lzt/q;

    invoke-direct {v0, v2, v2, v2, v2}, Lzt/q;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    :goto_0
    sput-object v0, Lvo/b;->a:Lzt/q;

    :cond_0
    iget-object v0, v0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Boolean;

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final getAnnotations()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls7/a;->f([Ljava/lang/annotation/Annotation;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :goto_0
    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    new-instance v5, Lx93/b0;

    invoke-direct {v5, v4}, Lx93/b0;-><init>(Ljava/lang/reflect/TypeVariable;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lx93/n;

    const-string v2, ": "

    invoke-static {v1, v0, v2}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v1, p0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
