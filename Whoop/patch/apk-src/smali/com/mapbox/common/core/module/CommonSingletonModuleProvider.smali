.class public final Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;",
        "",
        "<init>",
        "()V",
        "Lpu/b;",
        "type",
        "",
        "Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "paramsProvider",
        "(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;",
        "Lcom/mapbox/common/module/LibraryLoader;",
        "loaderInstance$delegate",
        "Ll83/h;",
        "getLoaderInstance",
        "()Lcom/mapbox/common/module/LibraryLoader;",
        "loaderInstance",
        "common_release"
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
.field public static final INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

.field private static final loaderInstance$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

    invoke-direct {v0}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;-><init>()V

    sput-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

    sget-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;->INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$loaderInstance$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->loaderInstance$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$paramsProvider(Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->paramsProvider(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    move-result-object p0

    return-object p0
.end method

.method private final paramsProvider(Lpu/b;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;
    .locals 3

    sget-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-array p1, v2, [Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unsupported module type - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-array p1, v2, [Lcom/mapbox/common/module/provider/ModuleProviderArgument;

    return-object p1
.end method


# virtual methods
.method public final getLoaderInstance()Lcom/mapbox/common/module/LibraryLoader;
    .locals 1

    sget-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->loaderInstance$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/module/LibraryLoader;

    return-object v0
.end method
