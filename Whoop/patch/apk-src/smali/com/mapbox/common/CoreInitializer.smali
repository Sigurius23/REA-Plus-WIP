.class public final Lcom/mapbox/common/CoreInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyb/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/CoreInitializer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyb/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00010\r0\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/mapbox/common/CoreInitializer;",
        "Lyb/b;",
        "Lcom/mapbox/common/MapboxSDKCommon;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "setupSqlite",
        "(Landroid/content/Context;)V",
        "create",
        "(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;",
        "",
        "Ljava/lang/Class;",
        "dependencies",
        "()Ljava/util/List;",
        "Companion",
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
.field public static final Companion:Lcom/mapbox/common/CoreInitializer$Companion;

.field private static final SQLITE_TMPDIR_VAR_NAME:Ljava/lang/String; = "SQLITE_TMPDIR"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/CoreInitializer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/CoreInitializer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/CoreInitializer;->Companion:Lcom/mapbox/common/CoreInitializer$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final createSystemInformation()Lcom/mapbox/common/SystemInformation;
    .locals 1

    sget-object v0, Lcom/mapbox/common/CoreInitializer;->Companion:Lcom/mapbox/common/CoreInitializer$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/CoreInitializer$Companion;->createSystemInformation()Lcom/mapbox/common/SystemInformation;

    move-result-object v0

    return-object v0
.end method

.method private final setupSqlite(Landroid/content/Context;)V
    .locals 2

    const-string v0, "SQLITE_TMPDIR"

    invoke-static {v0}, Landroid/system/Os;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public create(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/mapbox/common/CoreInitializer;->setupSqlite(Landroid/content/Context;)V

    .line 3
    sget-object v0, Lcom/mapbox/common/MapboxSDKCommon;->INSTANCE:Lcom/mapbox/common/MapboxSDKCommon;

    invoke-virtual {v0, p1}, Lcom/mapbox/common/MapboxSDKCommon;->invoke(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;

    move-result-object p1

    .line 4
    sget-object v0, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->INSTANCE:Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;

    invoke-virtual {v0}, Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;->getLoaderInstance()Lcom/mapbox/common/module/LibraryLoader;

    move-result-object v0

    const-string v1, "mapbox-common"

    invoke-interface {v0, v1}, Lcom/mapbox/common/module/LibraryLoader;->load(Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Using Mapbox Common SDK v"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/mapbox/common/Version;->getCommonSDKVersionString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/mapbox/common/Version;->getCommonSDKRevisionString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "common"

    invoke-static {v0, v1}, Lcom/mapbox/common/Log;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/mapbox/common/MapboxOptions;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    const-string v0, "Telemetry service not started, missing token"

    const-string v1, "telemetry"

    invoke-static {v0, v1}, Lcom/mapbox/common/Log;->info(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 9
    :cond_0
    invoke-static {v0}, Lcom/mapbox/common/MapboxOptions;->setAccessToken(Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/mapbox/common/CoreInitializer;->create(Landroid/content/Context;)Lcom/mapbox/common/MapboxSDKCommon;

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

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
