.class public final Llive/hms/video/media/capturers/camera/utils/OrientationTools;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/media/capturers/camera/utils/OrientationTools;",
        "",
        "<init>",
        "()V",
        "correctOrientation",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "orientation",
        "",
        "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)Landroid/graphics/Bitmap;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$3(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$4(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$0(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$0(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->flipHorizontally()Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$1(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {p0, v0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->rotate(F)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$2(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->flipVertically()Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$3(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->flipHorizontally()Landroid/graphics/Matrix;

    const/high16 v0, -0x3d4c0000    # -90.0f

    invoke-virtual {p0, v0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->rotate(F)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$4(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {p0, v0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->rotate(F)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$5(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->flipVertically()Landroid/graphics/Matrix;

    const/high16 v0, 0x43870000    # 270.0f

    invoke-virtual {p0, v0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->rotate(F)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method private static final correctOrientation$lambda$6(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 1

    const-string v0, "$this$applyMatrix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x43870000    # 270.0f

    invoke-virtual {p0, v0}, Llive/hms/video/media/capturers/camera/utils/BitMatrix;->rotate(F)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$6(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$2(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$1(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/utils/OrientationTools;->correctOrientation$lambda$5(Llive/hms/video/media/capturers/camera/utils/BitMatrix;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final correctOrientation(Landroid/graphics/Bitmap;Ljava/lang/Integer;)Landroid/graphics/Bitmap;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    :goto_1
    return-object p1

    :cond_4
    :goto_2
    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    new-instance p2, Llc0/g;

    const/16 v0, 0x19

    invoke-direct {p2, v0}, Llc0/g;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_3
    if-nez p2, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_8

    new-instance p2, Llc0/g;

    const/16 v0, 0x1a

    invoke-direct {p2, v0}, Llc0/g;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_8
    :goto_4
    if-nez p2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_a

    new-instance p2, Llc0/g;

    const/16 v0, 0x1b

    invoke-direct {p2, v0}, Llc0/g;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_5
    if-nez p2, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_c

    new-instance p2, Llc0/g;

    const/16 v0, 0x1c

    invoke-direct {p2, v0}, Llc0/g;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_6
    if-nez p2, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x6

    if-ne v1, v2, :cond_e

    new-instance p2, Llc0/g;

    const/16 v0, 0x1d

    invoke-direct {p2, v0}, Llc0/g;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_e
    :goto_7
    if-nez p2, :cond_f

    goto :goto_8

    :cond_f
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x7

    if-ne v1, v2, :cond_10

    new-instance p2, Llive/hms/video/media/capturers/camera/utils/a;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_10
    :goto_8
    if-nez p2, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v1, 0x8

    if-ne p2, v1, :cond_12

    new-instance p2, Llive/hms/video/media/capturers/camera/utils/a;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/camera/utils/OrientationToolsKt;->applyMatrix(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_12
    :goto_9
    return-object v0
.end method
