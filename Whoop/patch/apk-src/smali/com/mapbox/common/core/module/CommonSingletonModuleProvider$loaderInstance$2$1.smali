.class final synthetic Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;->invoke()Lcom/mapbox/common/module/LibraryLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "paramsProvider(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

    const-string v5, "paramsProvider"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lpu/b;

    invoke-virtual {p0, p1}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2$1;->invoke(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

    invoke-static {v0, p1}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->access$paramsProvider(Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p1

    return-object p1
.end method
