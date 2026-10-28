.class public final Lno/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:I

.field public final b:[F

.field public final c:[F

.field public final d:[F

.field public final e:[F

.field public final f:Landroid/view/Display;

.field public g:Z

.field public final h:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Display;[Lno/c;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lno/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 2
    new-array v1, v0, [F

    iput-object v1, p0, Lno/d;->b:[F

    .line 3
    new-array v1, v0, [F

    iput-object v1, p0, Lno/d;->c:[F

    .line 4
    new-array v0, v0, [F

    iput-object v0, p0, Lno/d;->d:[F

    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [F

    iput-object v0, p0, Lno/d;->e:[F

    .line 6
    iput-object p1, p0, Lno/d;->f:Landroid/view/Display;

    .line 7
    iput-object p2, p0, Lno/d;->h:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/Display;[Ls9/c;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lno/d;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 9
    new-array v1, v0, [F

    iput-object v1, p0, Lno/d;->b:[F

    .line 10
    new-array v1, v0, [F

    iput-object v1, p0, Lno/d;->c:[F

    .line 11
    new-array v0, v0, [F

    iput-object v0, p0, Lno/d;->d:[F

    const/4 v0, 0x3

    .line 12
    new-array v0, v0, [F

    iput-object v0, p0, Lno/d;->e:[F

    .line 13
    iput-object p1, p0, Lno/d;->f:Landroid/view/Display;

    .line 14
    iput-object p2, p0, Lno/d;->h:[Ljava/lang/Object;

    return-void
.end method

.method private final a(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    iget p1, p0, Lno/d;->a:I

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 10

    iget v0, p0, Lno/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    iget-object v0, p0, Lno/d;->b:[F

    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    iget-object p1, p0, Lno/d;->f:Landroid/view/Display;

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    iget-object v6, p0, Lno/d;->c:[F

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz p1, :cond_3

    const/16 v1, 0x81

    if-eq p1, v9, :cond_1

    const/16 v2, 0x82

    if-eq p1, v8, :cond_2

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    move v1, v2

    move v2, v9

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    move v2, v1

    move v1, v8

    :cond_2
    :goto_0
    array-length p1, v6

    invoke-static {v0, v7, v6, v7, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v6, v1, v2, v0}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    :cond_3
    const/16 p1, 0x83

    invoke-static {v0, v9, p1, v6}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    iget-object p1, p0, Lno/d;->e:[F

    invoke-static {v6, p1}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    aget p1, p1, v8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    iget-boolean v1, p0, Lno/d;->g:Z

    iget-object v4, p0, Lno/d;->d:[F

    if-nez v1, :cond_4

    invoke-static {v4, v0}, Lb9/b;->h([F[F)V

    iput-boolean v9, p0, Lno/d;->g:Z

    :cond_4
    array-length v1, v6

    invoke-static {v0, v7, v6, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v2, v6

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v1, p0, Lno/d;->h:[Ljava/lang/Object;

    check-cast v1, [Ls9/c;

    :goto_1
    if-ge v7, v8, :cond_5

    aget-object v2, v1, v7

    invoke-interface {v2, v0, p1}, Ls9/c;->a([FF)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    return-void

    :pswitch_0
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    iget-object v0, p0, Lno/d;->b:[F

    invoke-static {v0, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    iget-object p1, p0, Lno/d;->f:Landroid/view/Display;

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    iget-object v6, p0, Lno/d;->c:[F

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz p1, :cond_9

    const/16 v1, 0x81

    if-eq p1, v9, :cond_7

    const/16 v2, 0x82

    if-eq p1, v8, :cond_8

    const/4 v1, 0x3

    if-ne p1, v1, :cond_6

    move v1, v2

    move v2, v9

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_7
    move v2, v1

    move v1, v8

    :cond_8
    :goto_2
    array-length p1, v6

    invoke-static {v0, v7, v6, v7, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v6, v1, v2, v0}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    :cond_9
    const/16 p1, 0x83

    invoke-static {v0, v9, p1, v6}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    iget-object p1, p0, Lno/d;->e:[F

    invoke-static {v6, p1}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    aget p1, p1, v8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    iget-boolean v1, p0, Lno/d;->g:Z

    iget-object v4, p0, Lno/d;->d:[F

    if-nez v1, :cond_a

    invoke-static {v4, v0}, Lb9/b;->g([F[F)V

    iput-boolean v9, p0, Lno/d;->g:Z

    :cond_a
    array-length v1, v6

    invoke-static {v0, v7, v6, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v2, v6

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v1, p0, Lno/d;->h:[Ljava/lang/Object;

    check-cast v1, [Lno/c;

    :goto_3
    if-ge v7, v8, :cond_b

    aget-object v2, v1, v7

    invoke-interface {v2, v0, p1}, Lno/c;->a([FF)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
