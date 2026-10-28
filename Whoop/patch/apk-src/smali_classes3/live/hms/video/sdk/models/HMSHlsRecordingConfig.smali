.class public final Llive/hms/video/sdk/models/HMSHlsRecordingConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSHlsRecordingConfig;",
        "",
        "singleFilePerLayer",
        "",
        "videoOnDemand",
        "<init>",
        "(ZZ)V",
        "getSingleFilePerLayer",
        "()Z",
        "getVideoOnDemand",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final singleFilePerLayer:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "single_file_per_layer"
    .end annotation
.end field

.field private final videoOnDemand:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hls_vod"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    iput-boolean p2, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSHlsRecordingConfig;ZZILjava/lang/Object;)Llive/hms/video/sdk/models/HMSHlsRecordingConfig;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->copy(ZZ)Llive/hms/video/sdk/models/HMSHlsRecordingConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    return v0
.end method

.method public final copy(ZZ)Llive/hms/video/sdk/models/HMSHlsRecordingConfig;
    .locals 1

    new-instance v0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;

    invoke-direct {v0, p1, p2}, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;-><init>(ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getSingleFilePerLayer()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    return v0
.end method

.method public final getVideoOnDemand()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSHlsRecordingConfig(singleFilePerLayer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->singleFilePerLayer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", videoOnDemand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHlsRecordingConfig;->videoOnDemand:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
