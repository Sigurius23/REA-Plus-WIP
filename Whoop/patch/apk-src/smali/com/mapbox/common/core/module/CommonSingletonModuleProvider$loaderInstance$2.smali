.class final Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/mapbox/common/module/LibraryLoader;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;

    invoke-direct {v0}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;-><init>()V

    sput-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;->INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/mapbox/common/module/LibraryLoader;
    .locals 3

    .line 1
    sget-object v0, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->INSTANCE:Lcom/mapbox/common/module/provider/MapboxModuleProvider;

    new-instance v1, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2$1;

    sget-object v2, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

    invoke-direct {v1, v2}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2$1;-><init>(Ljava/lang/Object;)V

    sget-object v2, Lpu/b;->z:Lpu/b;

    invoke-virtual {v0, v2, v1}, Lcom/mapbox/common/module/provider/MapboxModuleProvider;->createModule(Lpu/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/module/LibraryLoader;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;->invoke()Lcom/mapbox/common/module/LibraryLoader;

    move-result-object v0

    return-object v0
.end method
