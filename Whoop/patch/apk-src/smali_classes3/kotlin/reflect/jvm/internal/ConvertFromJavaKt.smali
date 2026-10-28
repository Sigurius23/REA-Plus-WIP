.class public final Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aE\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a3\u0010\u001a\u001a\u00020\t2\n\u0010\u0019\u001a\u0006\u0012\u0002\u0008\u00030\u00182\u0016\u0010\u0004\u001a\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u000f*\u0006\u0012\u0002\u0008\u00030\u0018H\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a\u0019\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000f*\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a+\u0010!\u001a\u00020\u0010*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008!\u0010\"\u001a/\u0010#\u001a\u00020\u0003*\u0006\u0012\u0002\u0008\u00030\u00022\u0016\u0010\u0004\u001a\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008#\u0010$\u001a%\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f*\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00020%H\u0000\u00a2\u0006\u0004\u0008&\u0010\'\u001a\u001b\u0010*\u001a\u00020)*\u00020\u00152\u0006\u0010(\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008*\u0010+\"\u001c\u0010/\u001a\u00020,*\u0006\u0012\u0002\u0008\u00030\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.\u00a8\u00060"
    }
    d2 = {
        "Ljava/lang/reflect/Type;",
        "",
        "Ljava/lang/reflect/TypeVariable;",
        "Lj93/b0;",
        "knownTypeParameters",
        "Lkotlin/reflect/jvm/internal/TypeNullability;",
        "nullability",
        "",
        "replaceNonArrayArgumentsWithStarProjections",
        "Lj93/a0;",
        "toKType",
        "(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;Z)Lj93/a0;",
        "type",
        "Lj93/e;",
        "classifier",
        "",
        "Lj93/d0;",
        "arguments",
        "isMarkedNullable",
        "Lj93/d;",
        "mutableCollectionClass",
        "Lwb3/q;",
        "createJavaSimpleType",
        "(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;)Lwb3/q;",
        "Ljava/lang/Class;",
        "klass",
        "createRawJavaType",
        "(Ljava/lang/Class;Ljava/util/Map;)Lj93/a0;",
        "allTypeParameters",
        "(Ljava/lang/Class;)Ljava/util/List;",
        "Ljava/lang/reflect/ParameterizedType;",
        "collectAllArguments",
        "(Ljava/lang/reflect/ParameterizedType;)Ljava/util/List;",
        "toKTypeProjection",
        "(Ljava/lang/reflect/Type;Ljava/util/Map;)Lj93/d0;",
        "findKTypeParameterInContainer",
        "(Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Lj93/b0;",
        "",
        "toKTypeParameters",
        "([Ljava/lang/reflect/TypeVariable;)Ljava/util/List;",
        "javaType",
        "Lwb3/i;",
        "toFlexibleArrayElementVarianceType",
        "(Lwb3/q;Ljava/lang/reflect/Type;)Lwb3/i;",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "getKotlinContainer",
        "(Ljava/lang/reflect/TypeVariable;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "kotlinContainer",
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
.method public static synthetic accessor$ConvertFromJavaKt$lambda0(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$lambda$3$0(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda1(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$lambda$4(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda2(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$lambda$0(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda3(Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/TypeVariable;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createRawJavaType$lambda$0$0(Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda4(Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createRawJavaType$lambda$2(Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda5(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->allTypeParameters$lambda$0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda6(Ljava/lang/Class;)Lxb3/i;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->allTypeParameters$lambda$1(Ljava/lang/Class;)Lxb3/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda7(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/ParameterizedType;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->collectAllArguments$lambda$0(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/ParameterizedType;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda8(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->collectAllArguments$lambda$1(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$ConvertFromJavaKt$lambda9(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toFlexibleArrayElementVarianceType$lambda$1(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static final allTypeParameters(Ljava/lang/Class;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$5;->INSTANCE:Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$5;

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$6;->INSTANCE:Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$6;

    invoke-static {p0, v0}, Lxb3/k;->t(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final allTypeParameters$lambda$0(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final allTypeParameters$lambda$1(Ljava/lang/Class;)Lxb3/i;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    const-string v0, "getTypeParameters(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object p0

    return-object p0
.end method

.method private static final collectAllArguments(Ljava/lang/reflect/ParameterizedType;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/ParameterizedType;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    sget-object v0, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$7;->INSTANCE:Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$7;

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$8;->INSTANCE:Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$8;

    invoke-static {p0, v0}, Lxb3/k;->u(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final collectAllArguments$lambda$0(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/ParameterizedType;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final collectAllArguments$lambda$1(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Iterable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    const-string v0, "getActualTypeArguments(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method

.method private static final createJavaSimpleType(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;)Lwb3/q;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lj93/e;",
            "Ljava/util/List<",
            "Lj93/d0;",
            ">;Z",
            "Lj93/d;",
            ")",
            "Lwb3/q;"
        }
    .end annotation

    new-instance v0, Lwb3/q;

    new-instance v10, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$2;

    invoke-direct {v10, p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$2;-><init>(Ljava/lang/reflect/Type;)V

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v9, p4

    invoke-direct/range {v0 .. v10}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v0
.end method

.method public static synthetic createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;
    .locals 0

    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;)Lwb3/q;

    move-result-object p0

    return-object p0
.end method

.method private static final createJavaSimpleType$lambda$0(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    return-object p0
.end method

.method private static final createRawJavaType(Ljava/lang/Class;Ljava/util/Map;)Lj93/a0;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;+",
            "Lj93/b0;",
            ">;)",
            "Lj93/a0;"
        }
    .end annotation

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->allTypeParameters(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/TypeVariable;

    sget-object v4, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$3;->INSTANCE:Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$3;

    invoke-static {v3, v4}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v3

    invoke-static {v3}, Lxb3/k;->z(Lxb3/i;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/TypeVariable;

    invoke-interface {v3}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v3

    const-string v4, "getBounds(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/reflect/Type;

    sget-object v3, Lj93/d0;->c:Lj93/d0;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v9, p1

    invoke-static/range {v8 .. v13}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$default(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;ZILjava/lang/Object;)Lj93/a0;

    move-result-object p1

    invoke-static {p1}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p1, v9

    goto :goto_0

    :cond_0
    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p0

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->allTypeParameters(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/TypeVariable;

    sget-object v3, Lj93/d0;->c:Lj93/d0;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p1

    new-instance v1, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$4;

    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$4;-><init>(Ljava/lang/Class;)V

    const-string v0, "lowerBound"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    new-instance v0, Lwb3/i;

    const/4 v2, 0x1

    invoke-direct {v0, p0, p1, v2, v1}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    return-object v0
.end method

.method private static final createRawJavaType$lambda$0$0(Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/TypeVariable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    const-string v0, "getBounds(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/TypeVariable;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final createRawJavaType$lambda$2(Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 0

    return-object p0
.end method

.method private static final findKTypeParameterInContainer(Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Lj93/b0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;+",
            "Lj93/b0;",
            ">;)",
            "Lj93/b0;"
        }
    .end annotation

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj93/b0;

    if-nez p1, :cond_5

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->getKotlinContainer(Ljava/lang/reflect/TypeVariable;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;->getTypeParameters()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lj93/b0;

    invoke-interface {v4}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    check-cast v0, Lj93/b0;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Type parameter "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not found in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->getKotlinContainer(Ljava/lang/reflect/TypeVariable;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-object p1
.end method

.method private static final getKotlinContainer(Ljava/lang/reflect/TypeVariable;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;)",
            "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/reflect/jvm/internal/KClassImpl;

    return-object p0

    :cond_0
    new-instance v1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Non-class container of a type parameter is not supported: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final toFlexibleArrayElementVarianceType(Lwb3/q;Ljava/lang/reflect/Type;)Lwb3/i;
    .locals 7

    iget-object v1, p0, Lwb3/q;->x:Lj93/e;

    iget-object v0, p0, Lwb3/q;->y:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj93/d0;

    iget-object v4, v3, Lj93/d0;->b:Lj93/a0;

    if-eqz v4, :cond_0

    sget-object v3, Lj93/d0;->c:Lj93/d0;

    new-instance v3, Lj93/d0;

    sget-object v5, Lj93/e0;->y:Lj93/e0;

    invoke-direct {v3, v5, v4}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p1

    new-instance v1, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$9;

    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$9;-><init>(Ljava/lang/reflect/Type;)V

    const-string v0, "upperBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lwb3/i;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    move-object p0, v0

    :goto_1
    check-cast p0, Lwb3/i;

    return-object p0
.end method

.method private static final toFlexibleArrayElementVarianceType$lambda$1(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    return-object p0
.end method

.method public static final toKType(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;Z)Lj93/a0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;+",
            "Lj93/b0;",
            ">;",
            "Lkotlin/reflect/jvm/internal/TypeNullability;",
            "Z)",
            "Lj93/a0;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "knownTypeParameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nullability"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/lang/Class;

    const/16 v1, 0xa

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->allTypeParameters(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    if-nez p3, :cond_0

    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createRawJavaType(Ljava/lang/Class;Ljava/util/Map;)Lj93/a0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    const-string p3, "getComponentType(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKTypeProjection(Ljava/lang/reflect/Type;Ljava/util/Map;)Lj93/d0;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toFlexibleArrayElementVarianceType(Lwb3/q;Ljava/lang/reflect/Type;)Lwb3/i;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v2, p0

    move p0, v1

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->allTypeParameters(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    move-object v0, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, p0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p0

    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/TypeVariable;

    sget-object p1, Lj93/d0;->c:Lj93/d0;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p0

    goto/16 :goto_3

    :cond_3
    move-object v0, p0

    move p0, v1

    instance-of v1, v0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v1, :cond_4

    move-object p0, v0

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p0

    const-string p2, "getGenericComponentType(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKTypeProjection(Ljava/lang/reflect/Type;Ljava/util/Map;)Lj93/d0;

    move-result-object p0

    iget-object p1, p0, Lj93/d0;->b:Lj93/a0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lx43/j;->E(Lj93/a0;)Lj93/d;

    move-result-object p1

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->createArrayType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toFlexibleArrayElementVarianceType(Lwb3/q;Ljava/lang/reflect/Type;)Lwb3/i;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_8

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type java.lang.Class<*>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Class;

    invoke-static {v2}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    if-eqz p3, :cond_5

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->collectAllArguments(Ljava/lang/reflect/ParameterizedType;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p1, p0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p0

    invoke-direct {p3, p0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Type;

    sget-object p1, Lj93/d0;->c:Lj93/d0;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->collectAllArguments(Ljava/lang/reflect/ParameterizedType;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p3, p0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p0

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/reflect/Type;

    invoke-static {p3, p1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKTypeProjection(Ljava/lang/reflect/Type;Ljava/util/Map;)Lj93/d0;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    move-object p3, v1

    :cond_7
    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v2

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p0

    goto :goto_3

    :cond_8
    instance-of p0, v0, Ljava/lang/reflect/TypeVariable;

    if-eqz p0, :cond_12

    move-object p0, v0

    check-cast p0, Ljava/lang/reflect/TypeVariable;

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->findKTypeParameterInContainer(Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Lj93/b0;

    move-result-object v1

    const/16 v5, 0x10

    const/4 v6, 0x0

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType$default(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;ILjava/lang/Object;)Lwb3/q;

    move-result-object p0

    :goto_3
    iget-object p1, p0, Lwb3/q;->x:Lj93/e;

    instance-of p3, p1, Lj93/d;

    const/4 v1, 0x0

    if-eqz p3, :cond_9

    check-cast p1, Lj93/d;

    goto :goto_4

    :cond_9
    move-object p1, v1

    :goto_4
    sget-object p3, Lq93/d;->a:Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-interface {p1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v1, Lva3/f;

    invoke-direct {v1, p3}, Lva3/f;-><init>(Ljava/lang/String;)V

    :cond_a
    invoke-static {v1}, Lq93/d;->h(Lva3/f;)Lva3/e;

    move-result-object p3

    const/4 v1, 0x0

    if-eqz p3, :cond_c

    if-eqz p1, :cond_c

    iget-object v2, p0, Lwb3/q;->x:Lj93/e;

    iget-object v3, p0, Lwb3/q;->y:Ljava/util/List;

    iget-boolean v4, p0, Lwb3/q;->z:Z

    invoke-static {p1, p3}, Lsb3/a;->i(Lj93/d;Lva3/e;)Lwb3/l;

    move-result-object p1

    invoke-static {v0, v2, v3, v4, p1}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->createJavaSimpleType(Ljava/lang/reflect/Type;Lj93/e;Ljava/util/List;ZLj93/d;)Lwb3/q;

    move-result-object p1

    new-instance p3, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$0;

    invoke-direct {p3, v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$0;-><init>(Ljava/lang/reflect/Type;)V

    const-string v2, "lowerBound"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move-object p0, p1

    goto :goto_5

    :cond_b
    new-instance v2, Lwb3/i;

    invoke-direct {v2, p1, p0, v1, p3}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    move-object p0, v2

    :cond_c
    :goto_5
    sget-object p1, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_11

    const/4 p3, 0x2

    if-eq p1, p3, :cond_10

    invoke-virtual {p0}, Lwb3/a;->g()Lwb3/a;

    move-result-object p1

    if-nez p1, :cond_d

    move-object p1, p0

    :cond_d
    invoke-virtual {p0}, Lwb3/a;->j()Lwb3/a;

    move-result-object p3

    if-nez p3, :cond_e

    goto :goto_6

    :cond_e
    move-object p0, p3

    :goto_6
    invoke-virtual {p0, p2}, Lwb3/a;->i(Z)Lwb3/a;

    move-result-object p0

    new-instance p2, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$1;

    invoke-direct {p2, v0}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt$$Lambda$1;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, p0}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_f

    return-object p1

    :cond_f
    new-instance p3, Lwb3/i;

    invoke-direct {p3, p1, p0, v1, p2}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    return-object p3

    :cond_10
    invoke-virtual {p0, p2}, Lwb3/a;->i(Z)Lwb3/a;

    move-result-object p0

    :cond_11
    return-object p0

    :cond_12
    instance-of p0, v0, Ljava/lang/reflect/WildcardType;

    if-eqz p0, :cond_13

    new-instance p0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Wildcard type is not possible here: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    new-instance p0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Type is not supported: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic toKType$default(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;ZILjava/lang/Object;)Lj93/a0;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lkotlin/reflect/jvm/internal/TypeNullability;->FLEXIBLE:Lkotlin/reflect/jvm/internal/TypeNullability;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;Z)Lj93/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final toKType$lambda$3$0(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    return-object p0
.end method

.method private static final toKType$lambda$4(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 0

    return-object p0
.end method

.method public static final toKTypeParameters([Ljava/lang/reflect/TypeVariable;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;)",
            "Ljava/util/List<",
            "Lj93/b0;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/LinkedHashMap;

    array-length v0, p0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, p0

    const/4 v7, 0x0

    move v1, v7

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p0, v1

    new-instance v4, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    invoke-static {v3}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->getKotlinContainer(Ljava/lang/reflect/TypeVariable;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;

    move-result-object v5

    invoke-interface {v3}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "getName(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lj93/e0;->w:Lj93/e0;

    invoke-direct {v4, v5, v6, v8, v7}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;-><init>(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/String;Lj93/e0;Z)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/TypeVariable;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    invoke-interface {v1}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v8

    const-string v1, "getBounds(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/util/ArrayList;

    array-length v1, v8

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v10, v8

    move v11, v7

    :goto_2
    if-ge v11, v10, :cond_2

    aget-object v1, v8, v11

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$default(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;ZILjava/lang/Object;)Lj93/a0;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v9}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;->setUpperBounds(Ljava/util/List;)V

    goto :goto_1

    :cond_3
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final toKTypeProjection(Ljava/lang/reflect/Type;Ljava/util/Map;)Lj93/d0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/TypeVariable<",
            "*>;+",
            "Lj93/b0;",
            ">;)",
            "Lj93/d0;"
        }
    .end annotation

    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-nez v0, :cond_0

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$default(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;ZILjava/lang/Object;)Lj93/a0;

    move-result-object p0

    invoke-static {p0}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v1, p0

    move-object v2, p1

    move-object p0, v1

    check-cast p0, Ljava/lang/reflect/WildcardType;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object p0

    array-length v0, p1

    const/4 v3, 0x1

    if-gt v0, v3, :cond_3

    array-length v0, p0

    if-gt v0, v3, :cond_3

    array-length v0, p0

    const-string v6, "type"

    const-string v1, "single(...)"

    if-ne v0, v3, :cond_1

    sget-object p1, Lj93/d0;->c:Lj93/d0;

    invoke-static {p0}, Lm83/n;->M0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/Type;

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$default(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;ZILjava/lang/Object;)Lj93/a0;

    move-result-object p0

    invoke-static {p0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj93/d0;

    sget-object v0, Lj93/e0;->x:Lj93/e0;

    invoke-direct {p1, v0, p0}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    return-object p1

    :cond_1
    array-length p0, p1

    if-ne p0, v3, :cond_2

    sget-object p0, Lj93/d0;->c:Lj93/d0;

    invoke-static {p1}, Lm83/n;->M0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/Type;

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/ConvertFromJavaKt;->toKType$default(Ljava/lang/reflect/Type;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeNullability;ZILjava/lang/Object;)Lj93/a0;

    move-result-object p0

    invoke-static {p0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj93/d0;

    sget-object v0, Lj93/e0;->y:Lj93/e0;

    invoke-direct {p1, v0, p0}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    return-object p1

    :cond_2
    sget-object p0, Lj93/d0;->c:Lj93/d0;

    return-object p0

    :cond_3
    new-instance p0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Wildcard types with many bounds are not supported: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p0
.end method
