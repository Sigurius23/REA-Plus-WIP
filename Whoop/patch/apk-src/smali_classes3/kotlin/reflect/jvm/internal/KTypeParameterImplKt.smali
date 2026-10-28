.class public final Lkotlin/reflect/jvm/internal/KTypeParameterImplKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/KTypeParameterImplKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llb3/g1;",
        "Lj93/e0;",
        "toKVariance",
        "(Llb3/g1;)Lj93/e0;",
        "Lr93/x0;",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "toContainer",
        "(Lr93/x0;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "Lr93/e;",
        "Lkotlin/reflect/jvm/internal/KClassImpl;",
        "toKClassImpl",
        "(Lr93/e;)Lkotlin/reflect/jvm/internal/KClassImpl;",
        "Ljb3/k;",
        "Ljava/lang/Class;",
        "getContainerClass",
        "(Ljb3/k;)Ljava/lang/Class;",
        "kotlin-reflection"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$toContainer(Lr93/x0;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KTypeParameterImplKt;->toContainer(Lr93/x0;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toKVariance(Llb3/g1;)Lj93/e0;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KTypeParameterImplKt;->toKVariance(Llb3/g1;)Lj93/e0;

    move-result-object p0

    return-object p0
.end method

.method private static final getContainerClass(Ljb3/k;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb3/k;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-interface {p0}, Ljb3/k;->x()Ljb3/j;

    move-result-object v0

    instance-of v1, v0, Loa3/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Loa3/h;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Loa3/h;->y:Lw93/b;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    instance-of v1, v0, Lw93/b;

    if-eqz v1, :cond_2

    move-object v2, v0

    :cond_2
    if-eqz v2, :cond_3

    iget-object v0, v2, Lw93/b;->a:Ljava/lang/Class;

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Container of deserialized member is not resolved: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final toContainer(Lr93/x0;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
    .locals 3

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    const-string v0, "getContainingDeclaration(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p0, Lr93/e;

    if-eqz v1, :cond_0

    check-cast p0, Lr93/e;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KTypeParameterImplKt;->toKClassImpl(Lr93/e;)Lkotlin/reflect/jvm/internal/KClassImpl;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v1, p0, Lr93/c;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lr93/c;

    invoke-interface {v1}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, v1, Lr93/e;

    if-eqz v0, :cond_1

    check-cast v1, Lr93/e;

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/KTypeParameterImplKt;->toKClassImpl(Lr93/e;)Lkotlin/reflect/jvm/internal/KClassImpl;

    move-result-object v0

    goto :goto_1

    :cond_1
    instance-of v0, p0, Ljb3/k;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljb3/k;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/KTypeParameterImplKt;->getContainerClass(Ljb3/k;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    :goto_1
    new-instance v1, Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;

    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p0, v1, v0}, Lr93/k;->T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p0, Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;

    return-object p0

    :cond_3
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Non-class callable descriptor must be deserialized: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown type parameter container: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final toKClassImpl(Lr93/e;)Lkotlin/reflect/jvm/internal/KClassImpl;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr93/e;",
            ")",
            "Lkotlin/reflect/jvm/internal/KClassImpl<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/UtilKt;->toJavaClass(Lr93/e;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Type parameter container is not resolved: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final toKVariance(Llb3/g1;)Lj93/e0;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lj93/e0;->y:Lj93/e0;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lj93/e0;->x:Lj93/e0;

    return-object p0

    :cond_2
    sget-object p0, Lj93/e0;->w:Lj93/e0;

    return-object p0
.end method
