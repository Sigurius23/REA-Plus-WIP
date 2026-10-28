.class final Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/MapProvider;->getMapTelemetryInstance(Landroid/content/Context;)Lcom/mapbox/maps/module/MapTelemetry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lpu/b;",
        "it",
        "",
        "Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "invoke",
        "(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$2;->$context:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lpu/b;

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$2;->invoke(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, Lcom/mapbox/maps/MapProvider;->INSTANCE:Lcom/mapbox/maps/MapProvider;

    iget-object v0, p0, Lcom/mapbox/maps/MapProvider$getMapTelemetryInstance$2;->$context:Landroid/content/Context;

    sget-object v1, Lpu/b;->F:Lpu/b;

    invoke-static {p1, v0, v1}, Lcom/mapbox/maps/MapProvider;->access$paramsProvider(Lcom/mapbox/maps/MapProvider;Landroid/content/Context;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p1

    return-object p1
.end method
