.class public final Lt23/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt23/d1;->w:I

    iput p2, p0, Lt23/d1;->x:I

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v0, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    iget v1, p0, Lt23/d1;->w:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget p1, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v2, p0, Lt23/d1;->x:I

    sub-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v0, p2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget p2, p2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    sub-int/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    add-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
