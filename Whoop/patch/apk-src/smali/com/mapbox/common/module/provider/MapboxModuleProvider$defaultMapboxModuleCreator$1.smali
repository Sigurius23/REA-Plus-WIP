.class public final Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/module/provider/MapboxModuleProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1",
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;",
        "Ljava/lang/Class;",
        "implClass",
        "Lpu/b;",
        "type",
        "Lkotlin/Function1;",
        "",
        "Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "paramsProvider",
        "",
        "getInstance",
        "(Ljava/lang/Class;Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "common-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInstance(Ljava/lang/Class;Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lpu/b;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "implClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paramsProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    new-instance p3, Ljava/util/ArrayList;

    array-length v0, p2

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p2, v2

    invoke-virtual {v3}, Lcom/mapbox/common/module/provider/ModuleProviderArgument;->getExpectedArgumentClass()Ljava/lang/Class;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v1, [Ljava/lang/Class;

    invoke-interface {p3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Class;

    array-length v2, p3

    invoke-static {p3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/Class;

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    const-string p3, "implClass.getConstructor\u2026ntClass }.toTypedArray())"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/util/ArrayList;

    array-length v2, p2

    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p2

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, p2, v3

    invoke-virtual {v4}, Lcom/mapbox/common/module/provider/ModuleProviderArgument;->getArgumentInstance()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-array p2, v1, [Ljava/lang/Object;

    invoke-interface {p3, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
