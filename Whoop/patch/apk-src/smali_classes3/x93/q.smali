.class public final Lx93/q;
.super Lx93/v;
.source "SourceFile"

# interfaces
.implements Lma3/f;


# instance fields
.field public final a:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/q;->a:Ljava/lang/reflect/Constructor;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lx93/q;->a:Ljava/lang/reflect/Constructor;

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lx93/q;->a:Ljava/lang/reflect/Constructor;

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

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

.method public final j()Ljava/lang/reflect/Constructor;
    .locals 1

    iget-object v0, p0, Lx93/q;->a:Ljava/lang/reflect/Constructor;

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lx93/q;->a:Ljava/lang/reflect/Constructor;

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length v2, v1

    if-nez v2, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    array-length v3, v1

    invoke-static {v2, v3, v1}, Lm83/n;->m0(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/reflect/Type;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    array-length v3, v2

    array-length v4, v1

    if-lt v3, v4, :cond_3

    array-length v3, v2

    array-length v4, v1

    if-le v3, v4, :cond_2

    array-length v3, v2

    array-length v4, v1

    sub-int/2addr v3, v4

    array-length v4, v2

    invoke-static {v3, v4, v2}, Lm83/n;->m0(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[Ljava/lang/annotation/Annotation;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->isVarArgs()Z

    move-result v0

    invoke-virtual {p0, v1, v2, v0}, Lx93/v;->e([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Illegal generic signature: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
