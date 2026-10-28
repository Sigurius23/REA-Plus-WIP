.class public final Lj93/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/TypeVariable;
.implements Ljava/lang/reflect/Type;


# instance fields
.field public final w:Lj93/b0;


# direct methods
.method public constructor <init>(Lj93/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj93/i0;->w:Lj93/b0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj93/i0;->w:Lj93/b0;

    invoke-interface {v0}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ljava/lang/reflect/TypeVariable;

    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj93/i0;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getBounds()[Ljava/lang/reflect/Type;
    .locals 4

    iget-object v0, p0, Lj93/i0;->w:Lj93/b0;

    invoke-interface {v0}, Lj93/b0;->getUpperBounds()Ljava/util/List;

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

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/a0;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lj93/l0;->r(Lj93/a0;Z)Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/reflect/Type;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getGenericDeclaration() is not yet supported for type variables created from KType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj93/i0;->w:Lj93/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/j;

    const-string v2, "An operation is not implemented: "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll83/j;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj93/i0;->w:Lj93/b0;

    invoke-interface {v0}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj93/i0;->w:Lj93/b0;

    invoke-interface {v0}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lj93/i0;->w:Lj93/b0;

    invoke-interface {v0}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Lj93/i0;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    const/4 v0, 0x0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj93/i0;->w:Lj93/b0;

    invoke-interface {v0}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
