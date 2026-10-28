.class public Lgn2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lgn2/b;->a:[F

    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/drawable/shapes/Shape;
    .locals 2

    iget-object v0, p0, Lgn2/b;->a:[F

    int-to-float p1, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    invoke-static {v0, p1}, Ljava/util/Arrays;->fill([FF)V

    new-instance p1, Landroid/graphics/drawable/shapes/RoundRectShape;

    iget-object v0, p0, Lgn2/b;->a:[F

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, v1}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    return-object p1
.end method
