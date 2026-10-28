.class public Lcom/mapbox/common/SystemInformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final applicationBuildNumber:Ljava/lang/String;

.field private final applicationCachePath:Ljava/lang/String;

.field private final applicationDataPath:Ljava/lang/String;

.field private final applicationName:Ljava/lang/String;

.field private final applicationPackage:Ljava/lang/String;

.field private final applicationVersion:Ljava/lang/String;

.field private final architecture:Ljava/lang/String;

.field private final device:Ljava/lang/String;

.field private final deviceInfo:Ljava/lang/String;

.field private final isPhysicalDevice:Z

.field private final platform:Lcom/mapbox/common/Platform;

.field private final platformName:Ljava/lang/String;

.field private final platformVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;

    invoke-static {v0}, Lcom/mapbox/common/BaseMapboxInitializer;->init(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/common/Platform;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/SystemInformation;->platform:Lcom/mapbox/common/Platform;

    iput-object p2, p0, Lcom/mapbox/common/SystemInformation;->platformName:Ljava/lang/String;

    iput-object p3, p0, Lcom/mapbox/common/SystemInformation;->platformVersion:Ljava/lang/String;

    iput-object p4, p0, Lcom/mapbox/common/SystemInformation;->applicationName:Ljava/lang/String;

    iput-object p5, p0, Lcom/mapbox/common/SystemInformation;->applicationPackage:Ljava/lang/String;

    iput-object p6, p0, Lcom/mapbox/common/SystemInformation;->applicationVersion:Ljava/lang/String;

    iput-object p7, p0, Lcom/mapbox/common/SystemInformation;->applicationBuildNumber:Ljava/lang/String;

    iput-object p8, p0, Lcom/mapbox/common/SystemInformation;->device:Ljava/lang/String;

    iput-object p9, p0, Lcom/mapbox/common/SystemInformation;->architecture:Ljava/lang/String;

    iput-object p10, p0, Lcom/mapbox/common/SystemInformation;->deviceInfo:Ljava/lang/String;

    iput-object p11, p0, Lcom/mapbox/common/SystemInformation;->applicationDataPath:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/mapbox/common/SystemInformation;->isPhysicalDevice:Z

    iput-object p13, p0, Lcom/mapbox/common/SystemInformation;->applicationCachePath:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lcom/mapbox/common/SystemInformation;

    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->platform:Lcom/mapbox/common/Platform;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->platform:Lcom/mapbox/common/Platform;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->platformName:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->platformName:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->platformVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->platformVersion:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->applicationName:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->applicationName:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->applicationPackage:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->applicationPackage:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->applicationVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->applicationVersion:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->applicationBuildNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->applicationBuildNumber:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->device:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->device:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->architecture:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->architecture:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->deviceInfo:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->deviceInfo:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->applicationDataPath:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/SystemInformation;->applicationDataPath:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-boolean v2, p0, Lcom/mapbox/common/SystemInformation;->isPhysicalDevice:Z

    iget-boolean v3, p1, Lcom/mapbox/common/SystemInformation;->isPhysicalDevice:Z

    if-eq v2, v3, :cond_d

    return v1

    :cond_d
    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->applicationCachePath:Ljava/lang/String;

    iget-object p1, p1, Lcom/mapbox/common/SystemInformation;->applicationCachePath:Ljava/lang/String;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v1

    :cond_e
    return v0

    :cond_f
    :goto_0
    return v1
.end method

.method public getApplicationBuildNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->applicationBuildNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationCachePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->applicationCachePath:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationDataPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->applicationDataPath:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->applicationName:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationPackage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->applicationPackage:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->applicationVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getArchitecture()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->architecture:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->device:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->deviceInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getIsPhysicalDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/common/SystemInformation;->isPhysicalDevice:Z

    return v0
.end method

.method public getPlatform()Lcom/mapbox/common/Platform;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->platform:Lcom/mapbox/common/Platform;

    return-object v0
.end method

.method public getPlatformName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->platformName:Ljava/lang/String;

    return-object v0
.end method

.method public getPlatformVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->platformVersion:Ljava/lang/String;

    return-object v0
.end method

.method public native getPrettyDeviceName()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 13

    iget-object v0, p0, Lcom/mapbox/common/SystemInformation;->platform:Lcom/mapbox/common/Platform;

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->platformName:Ljava/lang/String;

    iget-object v2, p0, Lcom/mapbox/common/SystemInformation;->platformVersion:Ljava/lang/String;

    iget-object v3, p0, Lcom/mapbox/common/SystemInformation;->applicationName:Ljava/lang/String;

    iget-object v4, p0, Lcom/mapbox/common/SystemInformation;->applicationPackage:Ljava/lang/String;

    iget-object v5, p0, Lcom/mapbox/common/SystemInformation;->applicationVersion:Ljava/lang/String;

    iget-object v6, p0, Lcom/mapbox/common/SystemInformation;->applicationBuildNumber:Ljava/lang/String;

    iget-object v7, p0, Lcom/mapbox/common/SystemInformation;->device:Ljava/lang/String;

    iget-object v8, p0, Lcom/mapbox/common/SystemInformation;->architecture:Ljava/lang/String;

    iget-object v9, p0, Lcom/mapbox/common/SystemInformation;->deviceInfo:Ljava/lang/String;

    iget-object v10, p0, Lcom/mapbox/common/SystemInformation;->applicationDataPath:Ljava/lang/String;

    iget-boolean v11, p0, Lcom/mapbox/common/SystemInformation;->isPhysicalDevice:Z

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    iget-object v12, p0, Lcom/mapbox/common/SystemInformation;->applicationCachePath:Ljava/lang/String;

    filled-new-array/range {v0 .. v12}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public native runningTime()J
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[platform: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->platform:Lcom/mapbox/common/Platform;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", platformName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->platformName:Ljava/lang/String;

    const-string v2, ", platformVersion: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->platformVersion:Ljava/lang/String;

    const-string v2, ", applicationName: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->applicationName:Ljava/lang/String;

    const-string v2, ", applicationPackage: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->applicationPackage:Ljava/lang/String;

    const-string v2, ", applicationVersion: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->applicationVersion:Ljava/lang/String;

    const-string v2, ", applicationBuildNumber: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->applicationBuildNumber:Ljava/lang/String;

    const-string v2, ", device: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->device:Ljava/lang/String;

    const-string v2, ", architecture: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->architecture:Ljava/lang/String;

    const-string v2, ", deviceInfo: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->deviceInfo:Ljava/lang/String;

    const-string v2, ", applicationDataPath: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->applicationDataPath:Ljava/lang/String;

    const-string v2, ", isPhysicalDevice: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-boolean v1, p0, Lcom/mapbox/common/SystemInformation;->isPhysicalDevice:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", applicationCachePath: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/SystemInformation;->applicationCachePath:Ljava/lang/String;

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Lc13/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public native totalMemory()J
.end method
