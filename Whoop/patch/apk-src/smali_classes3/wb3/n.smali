.class public final Lwb3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/d;
.implements Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
.implements Lob3/l;


# static fields
.field public static final x:Lwb3/n;


# instance fields
.field public final synthetic w:Lj93/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwb3/n;

    invoke-direct {v0}, Lwb3/n;-><init>()V

    sput-object v0, Lwb3/n;->x:Lwb3/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ljava/lang/Void;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    iput-object v0, p0, Lwb3/n;->w:Lj93/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0, p1}, Lj93/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getConstructors()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getMembers()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getMembers()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getObjectInstance()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getObjectInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Void;

    return-object v0
.end method

.method public final getQualifiedName()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Nothing"

    return-object v0
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 1

    const-string v0, "Nothing"

    return-object v0
.end method

.method public final getSupertypes()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getSupertypes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isAbstract()Z
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isInner()Z

    move-result v0

    return v0
.end method

.method public final isInstance(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0, p1}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isSealed()Z
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isSealed()Z

    move-result v0

    return v0
.end method

.method public final isValue()Z
    .locals 1

    iget-object v0, p0, Lwb3/n;->w:Lj93/d;

    invoke-interface {v0}, Lj93/d;->isValue()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NothingKClass"

    return-object v0
.end method
