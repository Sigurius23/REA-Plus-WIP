.class public abstract Lwb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/l;
.implements Lob3/e;
.implements Lob3/f;
.implements Lob3/i;
.implements Lob3/j;


# instance fields
.field public final w:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of v0, p1, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    iput-object v1, p0, Lwb3/a;->w:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    return-void
.end method


# virtual methods
.method public abstract a()Lj93/a0;
.end method

.method public abstract b()Lj93/d;
.end method

.method public abstract c()Z
.end method

.method public abstract d()Z
.end method

.method public abstract e()Z
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lwb3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lwb3/p;->w:Lwb3/p;

    check-cast p1, Lob3/g;

    invoke-static {v0, p0, p1}, Lcom/squareup/wire/n;->d0(Lob3/o;Lob3/g;Lob3/g;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract f()Z
.end method

.method public abstract g()Lwb3/a;
.end method

.method public abstract h(Z)Lwb3/a;
.end method

.method public hashCode()I
    .locals 2

    invoke-interface {p0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-interface {p0}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-interface {p0}, Lj93/a0;->isMarkedNullable()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public abstract i(Z)Lwb3/a;
.end method

.method public abstract j()Lwb3/a;
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->INSTANCE:Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->renderType$default(Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;Lj93/a0;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
