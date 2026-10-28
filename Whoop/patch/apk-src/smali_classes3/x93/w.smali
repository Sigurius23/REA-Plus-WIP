.class public final Lx93/w;
.super Lx93/v;
.source "SourceFile"

# interfaces
.implements Lma3/f;


# instance fields
.field public final a:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

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

.method public final j()Z
    .locals 4

    iget-object v0, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lx93/c;->a:Ljava/util/List;

    const-class v3, Ljava/lang/Enum;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lx93/s;

    check-cast v0, Ljava/lang/Enum;

    invoke-direct {v2, v1, v0}, Lx93/s;-><init>(Lva3/h;Ljava/lang/Enum;)V

    :goto_0
    move-object v1, v2

    goto :goto_1

    :cond_0
    instance-of v2, v0, Ljava/lang/annotation/Annotation;

    if-eqz v2, :cond_1

    new-instance v2, Lx93/f;

    check-cast v0, Ljava/lang/annotation/Annotation;

    invoke-direct {v2, v1, v0}, Lx93/f;-><init>(Lva3/h;Ljava/lang/annotation/Annotation;)V

    goto :goto_0

    :cond_1
    instance-of v2, v0, [Ljava/lang/Object;

    if-eqz v2, :cond_2

    new-instance v2, Lx93/g;

    check-cast v0, [Ljava/lang/Object;

    invoke-direct {v2, v1, v0}, Lx93/g;-><init>(Lva3/h;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v2, v0, Ljava/lang/Class;

    if-eqz v2, :cond_3

    new-instance v2, Lx93/o;

    check-cast v0, Ljava/lang/Class;

    invoke-direct {v2, v1, v0}, Lx93/o;-><init>(Lva3/h;Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    new-instance v2, Lx93/u;

    invoke-direct {v2, v1, v0}, Lx93/u;-><init>(Lva3/h;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    const/4 v0, 0x1

    return v0

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public final l()Lx93/a0;
    .locals 4

    iget-object v0, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getGenericReturnType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Lx93/y;

    invoke-direct {v0, v2}, Lx93/y;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_0
    instance-of v2, v0, Ljava/lang/reflect/GenericArrayType;

    if-nez v2, :cond_3

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_2

    new-instance v1, Lx93/d0;

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-direct {v1, v0}, Lx93/d0;-><init>(Ljava/lang/reflect/WildcardType;)V

    return-object v1

    :cond_2
    new-instance v1, Lx93/p;

    invoke-direct {v1, v0}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    return-object v1

    :cond_3
    :goto_0
    new-instance v1, Lx93/h;

    invoke-direct {v1, v0}, Lx93/h;-><init>(Ljava/lang/reflect/Type;)V

    return-object v1
.end method

.method public final m()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lx93/w;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericParameterTypes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    const-string v3, "getParameterAnnotations(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->isVarArgs()Z

    move-result v0

    invoke-virtual {p0, v1, v2, v0}, Lx93/v;->e([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
