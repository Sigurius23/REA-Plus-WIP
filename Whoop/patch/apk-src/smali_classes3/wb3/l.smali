.class public final Lwb3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/d;
.implements Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
.implements Lob3/l;


# instance fields
.field public final w:Lj93/d;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/util/List;

.field public final z:Ljava/util/List;


# direct methods
.method public constructor <init>(Lj93/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiedName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb3/l;->w:Lj93/d;

    iput-object p2, p0, Lwb3/l;->x:Ljava/lang/String;

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lwb3/l;->y:Ljava/util/List;

    invoke-interface {p4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lwb3/l;->z:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lwb3/l;

    if-eqz v0, :cond_0

    check-cast p1, Lwb3/l;

    iget-object p1, p1, Lwb3/l;->w:Lj93/d;

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getConstructors()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getMembers()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getMembers()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getObjectInstance()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getObjectInstance()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getQualifiedName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwb3/l;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lwb3/l;->x:Ljava/lang/String;

    const-string v1, "."

    invoke-static {v0, v1, v0}, Lyb3/r;->G0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSupertypes()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/l;->z:Ljava/util/List;

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/l;->y:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isAbstract()Z
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isInner()Z

    move-result v0

    return v0
.end method

.method public final isInstance(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0, p1}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isSealed()Z
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isSealed()Z

    move-result v0

    return v0
.end method

.method public final isValue()Z
    .locals 1

    iget-object v0, p0, Lwb3/l;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isValue()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MutableCollectionKClass("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwb3/l;->w:Lj93/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
