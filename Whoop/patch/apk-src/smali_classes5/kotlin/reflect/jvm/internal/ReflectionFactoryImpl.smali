.class public Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;
.super Lkotlin/jvm/internal/i0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static clearCaches()V
    .locals 0

    invoke-static {}, Lkotlin/reflect/jvm/internal/CachesKt;->clearCaches()V

    invoke-static {}, Lkotlin/reflect/jvm/internal/ModuleByClassLoaderKt;->clearModuleByClassLoaderCache()V

    return-void
.end method

.method private static getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getOwner()Lj93/f;

    move-result-object p0

    instance-of v0, p0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;->INSTANCE:Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;

    return-object p0
.end method


# virtual methods
.method public createKotlinClass(Ljava/lang/Class;)Lj93/d;
    .locals 1

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/KClassImpl;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public createKotlinClass(Ljava/lang/Class;Ljava/lang/String;)Lj93/d;
    .locals 0

    .line 2
    new-instance p2, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/KClassImpl;-><init>(Ljava/lang/Class;)V

    return-object p2
.end method

.method public function(Lkotlin/jvm/internal/h;)Lj93/g;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/CachesKt;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;

    move-result-object p1

    return-object p1
.end method

.method public getOrCreateKotlinClass(Ljava/lang/Class;Ljava/lang/String;)Lj93/d;
    .locals 0

    .line 2
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/CachesKt;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;

    move-result-object p1

    return-object p1
.end method

.method public getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lj93/f;
    .locals 0

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/CachesKt;->getOrCreateKotlinPackage(Ljava/lang/Class;)Lj93/f;

    move-result-object p1

    return-object p1
.end method

.method public mutableCollectionType(Lj93/a0;)Lj93/a0;
    .locals 0

    invoke-static {p1}, Lsc3/l;->d(Lj93/a0;)Lwb3/a;

    move-result-object p1

    return-object p1
.end method

.method public mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public mutableProperty2(Lkotlin/jvm/internal/r;)Lj93/n;
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    const/4 p1, 0x0

    throw p1
.end method

.method public nothingType(Lj93/a0;)Lj93/a0;
    .locals 0

    invoke-static {p1}, Lsc3/l;->e(Lj93/a0;)Lwb3/a;

    move-result-object p1

    return-object p1
.end method

.method public platformType(Lj93/a0;Lj93/a0;)Lj93/a0;
    .locals 0

    invoke-static {p1, p2}, Lsc3/l;->f(Lj93/a0;Lj93/a0;)Lwb3/a;

    move-result-object p1

    return-object p1
.end method

.method public property0(Lkotlin/jvm/internal/u;)Lj93/u;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public property1(Lkotlin/jvm/internal/w;)Lj93/w;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty1;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty1;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public property2(Lkotlin/jvm/internal/y;)Lj93/y;
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty2;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->getOwner(Lkotlin/jvm/internal/c;)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/c;->getSignature()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty2;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public renderLambdaToString(Lkotlin/jvm/internal/g;)Ljava/lang/String;
    .locals 1

    .line 2
    invoke-static {p1}, Lbi/g;->S(Lkotlin/jvm/internal/g;)Lkotlin/reflect/jvm/internal/DescriptorKFunction;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    sget-object p1, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->INSTANCE:Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->renderLambda(Lj93/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lkotlin/jvm/internal/i0;->renderLambdaToString(Lkotlin/jvm/internal/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public renderLambdaToString(Lkotlin/jvm/internal/m;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/ReflectionFactoryImpl;->renderLambdaToString(Lkotlin/jvm/internal/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setUpperBounds(Lj93/b0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/b0;",
            "Ljava/util/List<",
            "Lj93/a0;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public typeOf(Lj93/e;Ljava/util/List;Z)Lj93/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/e;",
            "Ljava/util/List<",
            "Lj93/d0;",
            ">;Z)",
            "Lj93/a0;"
        }
    .end annotation

    instance-of v0, p1, Lkotlin/jvm/internal/d;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlin/jvm/internal/d;

    invoke-interface {p1}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p2, p3}, Lkotlin/reflect/jvm/internal/CachesKt;->getOrCreateKType(Ljava/lang/Class;Ljava/util/List;Z)Lj93/a0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {p1, p2, p3, v0}, Ljc/x;->z(Lj93/e;Ljava/util/List;ZLjava/util/List;)Lwb3/a;

    move-result-object p1

    return-object p1
.end method

.method public typeParameter(Ljava/lang/Object;Ljava/lang/String;Lj93/e0;Z)Lj93/b0;
    .locals 1

    instance-of p3, p1, Lj93/d;

    if-eqz p3, :cond_0

    move-object p3, p1

    check-cast p3, Lj93/d;

    invoke-interface {p3}, Lj93/d;->getTypeParameters()Ljava/util/List;

    move-result-object p3

    goto :goto_0

    :cond_0
    instance-of p3, p1, Lj93/c;

    if-eqz p3, :cond_3

    move-object p3, p1

    check-cast p3, Lj93/c;

    invoke-interface {p3}, Lj93/c;->getTypeParameters()Ljava/util/List;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lj93/b0;

    invoke-interface {p4}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p4

    :cond_2
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Type parameter "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is not found in container: "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Type parameter container must be a class or a callable: "

    invoke-static {p1, p3}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
