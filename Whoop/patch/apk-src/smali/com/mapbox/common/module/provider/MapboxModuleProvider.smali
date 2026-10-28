.class public final Lcom/mapbox/common/module/provider/MapboxModuleProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0004\u0012\u0015\u0018\u001b\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J5\u0010\u000e\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\u00082\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider;",
        "",
        "<init>",
        "()V",
        "",
        "asGetterFun",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "T",
        "Lpu/b;",
        "type",
        "Lkotlin/Function1;",
        "",
        "Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "paramsProvider",
        "createModule",
        "(Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "TAG",
        "Ljava/lang/String;",
        "com/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1",
        "noArgConstructorCreator",
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;",
        "com/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1",
        "kotlinObjectReferenceProvider",
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;",
        "com/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1",
        "singletonReferenceProvider",
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;",
        "com/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1",
        "defaultMapboxModuleCreator",
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;",
        "Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;",
        "instanceCreators",
        "[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;",
        "ModuleInstanceProvider",
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


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/module/provider/MapboxModuleProvider;

.field private static final TAG:Ljava/lang/String; = "MapboxModuleProvider"

.field private static final defaultMapboxModuleCreator:Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;

.field private static final instanceCreators:[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;

.field private static final kotlinObjectReferenceProvider:Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;

.field private static final noArgConstructorCreator:Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;

.field private static final singletonReferenceProvider:Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider;

    invoke-direct {v0}, Lcom/mapbox/common/module/provider/MapboxModuleProvider;-><init>()V

    sput-object v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->INSTANCE:Lcom/mapbox/common/module/provider/MapboxModuleProvider;

    new-instance v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;

    invoke-direct {v0}, Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;-><init>()V

    sput-object v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->noArgConstructorCreator:Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;

    new-instance v1, Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;

    invoke-direct {v1}, Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;-><init>()V

    sput-object v1, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->kotlinObjectReferenceProvider:Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;

    new-instance v2, Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;

    invoke-direct {v2}, Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;-><init>()V

    sput-object v2, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->singletonReferenceProvider:Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;

    new-instance v3, Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;

    invoke-direct {v3}, Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;-><init>()V

    sput-object v3, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->defaultMapboxModuleCreator:Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;

    const/4 v4, 0x4

    new-array v4, v4, [Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    sput-object v4, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->instanceCreators:[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final asGetterFun(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "this as java.lang.String).substring(startIndex)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final createModule(Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpu/b;",
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    const-string v0, "com.mapbox.module."

    const-string v1, "type"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lpu/b;->w:Ljava/lang/String;

    const-string v2, "paramsProvider"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v2, "Mapbox_%sModuleConfiguration"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "enableConfiguration"

    invoke-direct {p0, v2}, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->asGetterFun(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p2, "moduleProvider"

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    const-string v0, "configurationClass.getDe\u2026N_PROVIDER_VARIABLE_NAME)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p2

    const-string v2, "providerField.type"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "create%s"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    const-string v1, "providerClass.getDeclare\u2026            )\n          )"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "providerMethod.invoke(provider)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_4

    :cond_0
    new-instance p2, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;

    invoke-direct {p2, p1}, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;-><init>(Lpu/b;)V

    throw p2

    :cond_1
    const-string v1, "implClass"

    invoke-direct {p0, v1}, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->asGetterFun(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.lang.Class<T of com.mapbox.common.module.provider.MapboxModuleProvider.createModule>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->instanceCreators:[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    aget-object v6, v2, v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-interface {v6, v0, p1, p2}, Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;->getInstance(Ljava/lang/Class;Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v6

    :try_start_2
    instance-of v7, v6, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;

    if-nez v7, :cond_3

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    throw v6

    :cond_4
    :goto_2
    if-nez v3, :cond_5

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    const-string v1, "MapboxModuleProvider"

    const-string v2, "Module loading failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :cond_5
    if-eqz v3, :cond_6

    return-object v3

    :cond_6
    new-instance p2, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;

    invoke-direct {p2, p1}, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;-><init>(Lpu/b;)V

    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    instance-of v0, p2, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;

    if-eqz v0, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;

    invoke-direct {p2, p1}, Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;-><init>(Lpu/b;)V

    :goto_5
    throw p2
.end method
