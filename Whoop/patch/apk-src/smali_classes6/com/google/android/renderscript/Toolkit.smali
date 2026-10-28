.class public final Lcom/google/android/renderscript/Toolkit;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0014\n\u0002\u0008\u000b\n\u0002\u0010\u0015\n\u0002\u0008\'\u0008\u00c6\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 \u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0082 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008JJ\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008\u0012\u0010\u0013J:\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008\u0017\u0010\u0018JR\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ:\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\t2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008!\u0010\"Jb\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008(\u0010)JB\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008*\u0010+JR\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020%2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008-\u0010.J:\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010,\u001a\u00020%2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008/\u00100JJ\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u0002012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u00082\u00103J2\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u0002012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u00084\u00105JR\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u0002012\u0006\u0010,\u001a\u00020%2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u00086\u00107J:\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u0002012\u0006\u0010,\u001a\u00020%2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u00088\u00109Jb\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008>\u0010?JR\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008@\u0010AJb\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008F\u0010GJR\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008H\u0010IJZ\u0010N\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010J\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008N\u0010OJ2\u0010P\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 \u00a2\u0006\u0004\u0008P\u0010QJ@\u0010S\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010R\u001a\u00020\tH\u0082 \u00a2\u0006\u0004\u0008S\u0010TJ@\u0010V\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010U\u001a\u00020\tH\u0082 \u00a2\u0006\u0004\u0008V\u0010W\u00a8\u0006X"
    }
    d2 = {
        "Lcom/google/android/renderscript/Toolkit;",
        "",
        "",
        "createNative",
        "()J",
        "nativeHandle",
        "Ll83/a0;",
        "destroyNative",
        "(J)V",
        "",
        "mode",
        "",
        "sourceArray",
        "destArray",
        "sizeX",
        "sizeY",
        "Lcom/google/android/renderscript/Range2d;",
        "restriction",
        "nativeBlend",
        "(JI[B[BIILcom/google/android/renderscript/Range2d;)V",
        "Landroid/graphics/Bitmap;",
        "sourceBitmap",
        "destBitmap",
        "nativeBlendBitmap",
        "(JILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V",
        "inputArray",
        "vectorSize",
        "radius",
        "outputArray",
        "nativeBlur",
        "(J[BIIII[BLcom/google/android/renderscript/Range2d;)V",
        "inputBitmap",
        "outputBitmap",
        "nativeBlurBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILcom/google/android/renderscript/Range2d;)V",
        "inputVectorSize",
        "outputVectorSize",
        "",
        "matrix",
        "addVector",
        "nativeColorMatrix",
        "(J[BIII[BI[F[FLcom/google/android/renderscript/Range2d;)V",
        "nativeColorMatrixBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[F[FLcom/google/android/renderscript/Range2d;)V",
        "coefficients",
        "nativeConvolve",
        "(J[BIII[B[FLcom/google/android/renderscript/Range2d;)V",
        "nativeConvolveBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V",
        "",
        "nativeHistogram",
        "(J[BIII[ILcom/google/android/renderscript/Range2d;)V",
        "nativeHistogramBitmap",
        "(JLandroid/graphics/Bitmap;[ILcom/google/android/renderscript/Range2d;)V",
        "nativeHistogramDot",
        "(J[BIII[I[FLcom/google/android/renderscript/Range2d;)V",
        "nativeHistogramDotBitmap",
        "(JLandroid/graphics/Bitmap;[I[FLcom/google/android/renderscript/Range2d;)V",
        "red",
        "green",
        "blue",
        "alpha",
        "nativeLut",
        "(J[B[BII[B[B[B[BLcom/google/android/renderscript/Range2d;)V",
        "nativeLutBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[B[B[B[BLcom/google/android/renderscript/Range2d;)V",
        "cube",
        "cubeSizeX",
        "cubeSizeY",
        "cubeSizeZ",
        "nativeLut3d",
        "(J[B[BII[BIIILcom/google/android/renderscript/Range2d;)V",
        "nativeLut3dBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[BIIILcom/google/android/renderscript/Range2d;)V",
        "inputSizeX",
        "inputSizeY",
        "outputSizeX",
        "outputSizeY",
        "nativeResize",
        "(J[BIII[BIILcom/google/android/renderscript/Range2d;)V",
        "nativeResizeBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V",
        "format",
        "nativeYuvToRgb",
        "(J[B[BIII)V",
        "value",
        "nativeYuvToRgbBitmap",
        "(J[BIILandroid/graphics/Bitmap;I)V",
        "renderscript-toolkit_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/renderscript/Toolkit;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "renderscript-toolkit"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/google/android/renderscript/Toolkit;->createNative()J

    return-void
.end method

.method private final native createNative()J
.end method

.method private final native destroyNative(J)V
.end method

.method private final native nativeBlend(JI[B[BIILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeBlendBitmap(JILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeBlur(J[BIIII[BLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeBlurBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeColorMatrix(J[BIII[BI[F[FLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeColorMatrixBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[F[FLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeConvolve(J[BIII[B[FLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeConvolveBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogram(J[BIII[ILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogramBitmap(JLandroid/graphics/Bitmap;[ILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogramDot(J[BIII[I[FLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogramDotBitmap(JLandroid/graphics/Bitmap;[I[FLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeLut(J[B[BII[B[B[B[BLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeLut3d(J[B[BII[BIIILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeLut3dBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[BIIILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeLutBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[B[B[B[BLcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeResize(J[BIII[BIILcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeResizeBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V
.end method

.method private final native nativeYuvToRgb(J[B[BIII)V
.end method

.method private final native nativeYuvToRgbBitmap(J[BIILandroid/graphics/Bitmap;I)V
.end method
