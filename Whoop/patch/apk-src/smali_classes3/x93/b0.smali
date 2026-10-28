.class public final Lx93/b0;
.super Lx93/r;
.source "SourceFile"

# interfaces
.implements Lma3/b;
.implements Lma3/c;


# instance fields
.field public final a:Ljava/lang/reflect/TypeVariable;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/TypeVariable;)V
    .locals 1

    const-string v0, "typeVariable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;)Lx93/d;
    .locals 3

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    instance-of v1, v0, Ljava/lang/reflect/AnnotatedElement;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/reflect/AnnotatedElement;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Ls7/a;->e([Ljava/lang/annotation/Annotation;Lva3/e;)Lx93/d;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lx93/b0;

    if-eqz v0, :cond_0

    check-cast p1, Lx93/b0;

    iget-object p1, p1, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    iget-object v0, p0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getAnnotations()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    instance-of v1, v0, Ljava/lang/reflect/AnnotatedElement;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/reflect/AnnotatedElement;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Ls7/a;->f([Ljava/lang/annotation/Annotation;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v0, Lm83/y;->w:Lm83/y;

    :goto_1
    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lx93/b0;

    const-string v2, ": "

    invoke-static {v1, v0, v2}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v1, p0, Lx93/b0;->a:Ljava/lang/reflect/TypeVariable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
