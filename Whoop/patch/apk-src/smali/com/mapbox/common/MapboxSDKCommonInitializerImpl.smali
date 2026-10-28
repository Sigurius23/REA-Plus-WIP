.class public final Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyb/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyb/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0004*\u0001\u0013\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00010\r0\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;",
        "Lyb/b;",
        "Lcom/mapbox/common/MapboxSDKCommon;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "initTileStoreServiceIfAvailable",
        "(Landroid/content/Context;)V",
        "create",
        "(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;",
        "",
        "Ljava/lang/Class;",
        "dependencies",
        "()Ljava/util/List;",
        "Lcom/mapbox/common/LifecycleService;",
        "lifecycleService",
        "Lcom/mapbox/common/LifecycleService;",
        "com/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1",
        "lifecycleServiceConnection",
        "Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;",
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


# instance fields
.field private lifecycleService:Lcom/mapbox/common/LifecycleService;

.field private final lifecycleServiceConnection:Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;

    invoke-direct {v0, p0}, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;-><init>(Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;)V

    iput-object v0, p0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;->lifecycleServiceConnection:Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;

    return-void
.end method

.method public static final synthetic access$setLifecycleService$p(Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;Lcom/mapbox/common/LifecycleService;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;->lifecycleService:Lcom/mapbox/common/LifecycleService;

    return-void
.end method

.method private final initTileStoreServiceIfAvailable(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.mapbox.common.tilestore.TileStoreServiceInitializer"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    const-class v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    const-string v3, "init"

    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public create(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;->initTileStoreServiceIfAvailable(Landroid/content/Context;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/mapbox/common/LifecycleService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    iget-object v1, p0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;->lifecycleServiceConnection:Lcom/mapbox/common/MapboxSDKCommonInitializerImpl$lifecycleServiceConnection$1;

    const/4 v2, 0x1

    .line 5
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 6
    sget-object p1, Lcom/mapbox/common/MapboxSDKCommon;->INSTANCE:Lcom/mapbox/common/MapboxSDKCommon;

    return-object p1
.end method

.method public bridge synthetic create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;->create(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;

    move-result-object p1

    return-object p1
.end method

.method public dependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lyb/b;",
            ">;>;"
        }
    .end annotation

    const-class v0, Lcom/mapbox/common/CoreInitializer;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
