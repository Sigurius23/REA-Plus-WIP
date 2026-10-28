.class public final Lwb3/h;
.super Lwb3/a;
.source "SourceFile"


# static fields
.field public static final synthetic F:[Lj93/z;


# instance fields
.field public final E:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

.field public final x:Llb3/y;

.field public final y:Z

.field public final z:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lwb3/h;

    const-string v2, "classifier"

    const-string v3, "getClassifier()Lkotlin/reflect/KClassifier;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "arguments"

    const-string v5, "getArguments()Ljava/util/List;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lwb3/h;->F:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Llb3/y;Lc93/a;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, v0}, Lwb3/h;-><init>(Llb3/y;Lc93/a;Z)V

    return-void
.end method

.method public constructor <init>(Llb3/y;Lc93/a;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Lwb3/a;-><init>(Lc93/a;)V

    .line 2
    iput-object p1, p0, Lwb3/h;->x:Llb3/y;

    .line 3
    iput-boolean p3, p0, Lwb3/h;->y:Z

    .line 4
    new-instance p1, Lwb3/g;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lwb3/g;-><init>(Lwb3/h;I)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object p1

    iput-object p1, p0, Lwb3/h;->z:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    .line 5
    new-instance p1, Lce/d;

    const/16 p3, 0xe

    invoke-direct {p1, p3, p0, p2}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object p1

    iput-object p1, p0, Lwb3/h;->E:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    return-void
.end method


# virtual methods
.method public final a()Lj93/a0;
    .locals 4

    const-string v0, "<this>"

    iget-object v1, p0, Lwb3/h;->x:Llb3/y;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    instance-of v1, v0, Llb3/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Llb3/a;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llb3/a;->z0()Llb3/c0;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    new-instance v1, Lwb3/h;

    iget-object v2, p0, Lwb3/a;->w:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lwb3/h;-><init>(Llb3/y;Lc93/a;Z)V

    return-object v1

    :cond_2
    return-object v2
.end method

.method public final b()Lj93/d;
    .locals 7

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v1

    sget-object v3, Lq93/d;->j:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :goto_1
    return-object v2

    :cond_2
    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v1

    const-string v2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    if-eqz v1, :cond_3

    new-instance v1, Lwb3/l;

    invoke-virtual {p0}, Lwb3/h;->getClassifier()Lj93/e;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lj93/d;

    invoke-static {v0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v2

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    iget-object v2, v2, Lva3/f;->a:Ljava/lang/String;

    new-instance v4, Lka3/e;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5}, Lka3/e;-><init>(Lr93/e;I)V

    new-instance v5, Lka3/e;

    const/4 v6, 0x2

    invoke-direct {v5, v0, v6}, Lka3/e;-><init>(Lr93/e;I)V

    invoke-direct {v1, v3, v2, v4, v5}, Lwb3/l;-><init>(Lj93/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :cond_3
    invoke-static {v0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v0

    invoke-virtual {p0}, Lwb3/h;->getClassifier()Lj93/e;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lj93/d;

    invoke-static {v1, v0}, Lsb3/a;->i(Lj93/d;Lva3/e;)Lwb3/l;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 2

    const-string v0, "<this>"

    iget-object v1, p0, Lwb3/h;->x:Llb3/y;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    instance-of v0, v0, Llb3/l;

    return v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    if-eqz v0, :cond_0

    sget-object v1, Lo93/h;->e:Lva3/h;

    sget-object v1, Lo93/m;->b:Lva3/f;

    invoke-static {v0, v1}, Lo93/h;->B(Llb3/y;Lva3/f;)Z

    move-result v0

    return v0

    :cond_0
    const/16 v0, 0x8a

    invoke-static {v0}, Lo93/h;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    instance-of v0, v0, Lka3/h;

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lwb3/h;

    if-eqz v0, :cond_0

    check-cast p1, Lwb3/h;

    iget-object v0, p1, Lwb3/h;->x:Llb3/y;

    iget-object v1, p0, Lwb3/h;->x:Llb3/y;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwb3/h;->getClassifier()Lj93/e;

    move-result-object v0

    invoke-virtual {p1}, Lwb3/h;->getClassifier()Lj93/e;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwb3/h;->getArguments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lwb3/h;->getArguments()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-static {v0}, Lcom/squareup/wire/n;->R(Llb3/y;)Z

    move-result v0

    return v0
.end method

.method public final g()Lwb3/a;
    .locals 3

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v0}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    instance-of v1, v0, Llb3/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Lwb3/h;

    check-cast v0, Llb3/r;

    iget-object v0, v0, Llb3/r;->x:Llb3/c0;

    invoke-direct {v1, v0, v2}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object v1

    :cond_0
    return-object v2
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->computeAnnotations(Ls93/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getArguments()Ljava/util/List;
    .locals 2

    sget-object v0, Lwb3/h;->F:[Lj93/z;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lwb3/h;->E:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v1, p0, v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getClassifier()Lj93/e;
    .locals 2

    sget-object v0, Lwb3/h;->F:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lwb3/h;->z:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v1, p0, v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/e;

    return-object v0
.end method

.method public final h(Z)Lwb3/a;
    .locals 2

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Llb3/d;->m(Llb3/f1;Z)Llb3/l;

    move-result-object p1

    if-eqz p1, :cond_2

    :goto_0
    move-object v0, p1

    goto :goto_2

    :cond_0
    instance-of p1, v0, Llb3/l;

    if-eqz p1, :cond_1

    move-object p1, v0

    check-cast p1, Llb3/l;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    iget-object p1, p1, Llb3/l;->x:Llb3/c0;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    new-instance p1, Lwb3/h;

    iget-object v1, p0, Lwb3/a;->w:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-direct {p1, v0, v1}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object p1
.end method

.method public final hashCode()I
    .locals 2

    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v0}, Llb3/y;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwb3/h;->getClassifier()Lj93/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwb3/h;->getArguments()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1

    :cond_1
    invoke-super {p0}, Lwb3/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i(Z)Lwb3/a;
    .locals 2

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-static {v0}, Lds/p;->J(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v1

    if-ne v1, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v1, Lwb3/h;

    invoke-static {v0, p1}, Llb3/d1;->g(Llb3/y;Z)Llb3/f1;

    move-result-object p1

    const-string v0, "makeNullableAsSpecified(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwb3/a;->w:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-direct {v1, p1, v0}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object v1
.end method

.method public final isMarkedNullable()Z
    .locals 1

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v0}, Llb3/y;->k0()Z

    move-result v0

    return v0
.end method

.method public final j()Lwb3/a;
    .locals 3

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v0}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    instance-of v1, v0, Llb3/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Lwb3/h;

    check-cast v0, Llb3/r;

    iget-object v0, v0, Llb3/r;->y:Llb3/c0;

    invoke-direct {v1, v0, v2}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object v1

    :cond_0
    return-object v2
.end method

.method public final k(Llb3/y;)Lj93/e;
    .locals 3

    iget-boolean v0, p0, Lwb3/h;->y:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v2, v0, Lr93/f0;

    if-eqz v2, :cond_0

    check-cast v0, Lr93/f0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    new-instance p1, Lkotlin/reflect/jvm/internal/KTypeAliasImpl;

    invoke-static {v0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KTypeAliasImpl;-><init>(Lva3/e;)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v2, v0, Lr93/e;

    if-eqz v2, :cond_9

    check-cast v0, Lr93/e;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->toJavaClass(Lr93/e;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lo93/h;->z(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Llb3/y;->X()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/u0;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lio/sentry/config/a;->Q(Llb3/y;)Llb3/f1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwb3/h;->k(Llb3/y;)Lj93/e;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-static {p1}, Lx43/j;->D(Lj93/e;)Lj93/d;

    move-result-object p1

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->createArrayType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/KClassImpl;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot determine classifier for array element type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    new-instance p1, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KClassImpl;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_6
    invoke-static {p1}, Llb3/d1;->e(Llb3/y;)Z

    move-result p1

    if-nez p1, :cond_8

    new-instance p1, Lkotlin/reflect/jvm/internal/KClassImpl;

    sget-object v1, Lx93/c;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    if-nez v1, :cond_7

    goto :goto_2

    :cond_7
    move-object v0, v1

    :goto_2
    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KClassImpl;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KClassImpl;-><init>(Ljava/lang/Class;)V

    return-object p1

    :cond_9
    instance-of p1, v0, Lr93/x0;

    if-eqz p1, :cond_a

    new-instance p1, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    check-cast v0, Lr93/x0;

    invoke-direct {p1, v1, v0}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;-><init>(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lr93/x0;)V

    return-object p1

    :cond_a
    :goto_3
    return-object v1
.end method

.method public final l()Llb3/y;
    .locals 1

    iget-object v0, p0, Lwb3/h;->x:Llb3/y;

    return-object v0
.end method
