.class public Lkotlin/jvm/internal/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final KOTLIN_JVM_FUNCTIONS:Ljava/lang/String; = "kotlin.jvm.functions."


# virtual methods
.method public createKotlinClass(Ljava/lang/Class;)Lj93/d;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/e;

    invoke-direct {v0, p1}, Lkotlin/jvm/internal/e;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public function(Lkotlin/jvm/internal/h;)Lj93/g;
    .locals 0

    return-object p1
.end method

.method public getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/e;

    invoke-direct {v0, p1}, Lkotlin/jvm/internal/e;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lj93/f;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/t;

    invoke-direct {v0, p1, p2}, Lkotlin/jvm/internal/t;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public mutableCollectionType(Lj93/a0;)Lj93/a0;
    .locals 4

    move-object v0, p1

    check-cast v0, Lkotlin/jvm/internal/n0;

    new-instance v1, Lkotlin/jvm/internal/n0;

    invoke-interface {p1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v2

    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lkotlin/jvm/internal/n0;->c()Lj93/a0;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/jvm/internal/n0;->b()I

    move-result v0

    or-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v2, p1, v3, v0}, Lkotlin/jvm/internal/n0;-><init>(Lj93/e;Ljava/util/List;Lj93/a0;I)V

    return-object v1
.end method

.method public mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;
    .locals 0

    return-object p1
.end method

.method public mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;
    .locals 0

    return-object p1
.end method

.method public property0(Lkotlin/jvm/internal/u;)Lj93/u;
    .locals 0

    return-object p1
.end method

.method public property1(Lkotlin/jvm/internal/w;)Lj93/w;
    .locals 0

    return-object p1
.end method

.method public property2(Lkotlin/jvm/internal/y;)Lj93/y;
    .locals 0

    return-object p1
.end method

.method public renderLambdaToString(Lkotlin/jvm/internal/g;)Ljava/lang/String;
    .locals 1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public renderLambdaToString(Lkotlin/jvm/internal/m;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->renderLambdaToString(Lkotlin/jvm/internal/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public typeOf(Lj93/e;Ljava/util/List;Z)Lj93/a0;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/n0;

    invoke-direct {v0, p1, p2, p3}, Lkotlin/jvm/internal/n0;-><init>(Lj93/e;Ljava/util/List;Z)V

    return-object v0
.end method
