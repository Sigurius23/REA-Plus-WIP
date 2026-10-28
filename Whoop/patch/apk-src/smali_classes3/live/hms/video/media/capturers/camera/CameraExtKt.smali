.class public final Llive/hms/video/media/capturers/camera/CameraExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u0008\u001a\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0008\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a$\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u001b\u001a!\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\r\u001a\u001b\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Landroid/content/Context;",
        "",
        "cameraId",
        "",
        "isFlashAvailable",
        "(Landroid/content/Context;Ljava/lang/String;)Z",
        "",
        "getWhiteBalanceMeteringRegionsSupported",
        "(Landroid/content/Context;Ljava/lang/String;)I",
        "getExposureMaxMeteringRegionsSupported",
        "Landroid/util/Range;",
        "",
        "getZoomRatioRange",
        "(Landroid/content/Context;Ljava/lang/String;)Landroid/util/Range;",
        "getFocusMaxMeteringRegionsSupported",
        "computeRelativeRotation",
        "Landroid/hardware/camera2/CameraCharacteristics;",
        "getCameraCharacteristics",
        "(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;",
        "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
        "result",
        "Ljava/io/File;",
        "filePathToSave",
        "Ll83/a0;",
        "saveResult",
        "(Landroid/content/Context;Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;Ljava/io/File;Lq83/d;)Ljava/lang/Object;",
        "context",
        "(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;",
        "getLensDistanceRange",
        "mirrored",
        "computeExifOrientation",
        "(IZ)I",
        "lib_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final computeExifOrientation(IZ)I
    .locals 3

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/16 v0, 0xb4

    if-ne p0, v0, :cond_2

    if-nez p1, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    if-ne p0, v0, :cond_3

    if-eqz p1, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 v0, 0x7

    const/16 v1, 0x10e

    if-ne p0, v1, :cond_4

    if-eqz p1, :cond_4

    return v0

    :cond_4
    const/16 v2, 0x5a

    if-ne p0, v2, :cond_5

    if-nez p1, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    if-ne p0, v2, :cond_6

    if-eqz p1, :cond_6

    const/4 p0, 0x5

    return p0

    :cond_6
    if-ne p0, v1, :cond_7

    if-eqz p1, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    if-ne p0, v1, :cond_8

    if-nez p1, :cond_8

    return v0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public static final computeRelativeRotation(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p1

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    sget-object p1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    invoke-virtual {p1, p0}, Llive/hms/video/utils/HMSUtils;->getOrientation(Landroid/content/Context;)I

    move-result p0

    rsub-int p0, p0, 0x168

    goto :goto_1

    :cond_1
    sget-object p1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    invoke-virtual {p1, p0}, Llive/hms/video/utils/HMSUtils;->getOrientation(Landroid/content/Context;)I

    move-result p0

    :goto_1
    add-int/2addr v0, p0

    rem-int/lit16 v0, v0, 0x168

    return v0
.end method

.method public static final getCameraCharacteristics(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    const-string v0, "camera"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.hardware.camera2.CameraManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "getCameraIdList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    array-length v2, v1

    if-ge p0, v2, :cond_0

    .line 6
    aget-object p0, v1, p0

    invoke-virtual {p1, p0}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static final getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v0, "camera"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.hardware.camera2.CameraManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/hardware/camera2/CameraManager;

    .line 2
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    const-string p1, "getCameraCharacteristics(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final getExposureMaxMeteringRegionsSupported(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final getFocusMaxMeteringRegionsSupported(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final getLensDistanceRange(Landroid/content/Context;Ljava/lang/String;)Landroid/util/Range;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/util/Range;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_MINIMUM_FOCUS_DISTANCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object v0
.end method

.method public static final getWhiteBalanceMeteringRegionsSupported(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AWB:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final getZoomRatioRange(Landroid/content/Context;Ljava/lang/String;)Landroid/util/Range;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cameraId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_1

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_ZOOM_RATIO_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/Range;

    if-nez p0, :cond_0

    new-instance p0, Landroid/util/Range;

    invoke-direct {p0, v0, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    :cond_0
    return-object p0

    :cond_1
    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    new-instance p1, Landroid/util/Range;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object p1

    :cond_2
    new-instance p0, Landroid/util/Range;

    invoke-direct {p0, v0, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object p0
.end method

.method public static final isFlashAvailable(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p0

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->FLASH_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final saveResult(Landroid/content/Context;Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;Ljava/io/File;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            "Ljava/io/File;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Lq83/l;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    invoke-direct {p0, p3}, Lq83/l;-><init>(Lq83/d;)V

    invoke-virtual {p1}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->getFormat()I

    move-result p3

    const/16 v0, 0x100

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eq p3, v0, :cond_0

    const v0, 0x69656963

    if-eq p3, v0, :cond_0

    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unknown image format: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->getImage()Landroid/media/Image;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/Image;->getFormat()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->getImage()Landroid/media/Image;

    move-result-object p3

    invoke-virtual {p3}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p3

    const/4 v0, 0x0

    aget-object p3, p3, v0

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/4 p3, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {p0, v1}, Lq83/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {p1}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->close()V

    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object p3, v2

    goto :goto_2

    :catch_0
    move-exception p2

    move-object p3, v2

    goto :goto_0

    :catchall_2
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p2

    :goto_0
    :try_start_3
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p0, p2}, Lq83/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p1}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->close()V

    if-eqz p3, :cond_1

    :try_start_4
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    return-object v1

    :goto_2
    invoke-virtual {p1}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->close()V

    if-eqz p3, :cond_3

    :try_start_5
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_3
    :goto_3
    throw p0
.end method
