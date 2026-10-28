.class public final Lt23/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

.field public final b:Ljava/util/List;

.field public final c:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/util/List;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceModel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/s1;->a:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iput-object p2, p0, Lt23/s1;->b:Ljava/util/List;

    iput-object p3, p0, Lt23/s1;->c:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iput-object p4, p0, Lt23/s1;->d:Ljava/lang/String;

    iput-object p5, p0, Lt23/s1;->e:Ljava/lang/String;

    iput-object p6, p0, Lt23/s1;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt23/s1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lt23/s1;

    iget-object v0, p0, Lt23/s1;->a:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget-object v1, p1, Lt23/s1;->a:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lt23/s1;->b:Ljava/util/List;

    iget-object v1, p1, Lt23/s1;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lt23/s1;->c:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget-object v1, p1, Lt23/s1;->c:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lt23/s1;->d:Ljava/lang/String;

    iget-object v1, p1, Lt23/s1;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lt23/s1;->e:Ljava/lang/String;

    iget-object v1, p1, Lt23/s1;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lt23/s1;->f:Ljava/lang/String;

    iget-object p1, p1, Lt23/s1;->f:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lt23/s1;->a:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lt23/s1;->b:Ljava/util/List;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lt23/s1;->c:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lt23/s1;->d:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lt23/s1;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    const v0, 0x563d4225

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lt23/s1;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocalStats(resolution="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt23/s1;->a:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", availableResolutions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/s1;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/s1;->c:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sfu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt23/s1;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", os="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdkVersion=1.28.0, deviceModel="

    const-string v2, ")"

    iget-object v3, p0, Lt23/s1;->e:Ljava/lang/String;

    iget-object v4, p0, Lt23/s1;->f:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
