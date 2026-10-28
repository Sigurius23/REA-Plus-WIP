.class public final Lqi/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public f:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lqi/y;->a:I

    iput p2, p0, Lqi/y;->b:I

    iput-object p3, p0, Lqi/y;->c:Ljava/lang/String;

    iput-object p4, p0, Lqi/y;->d:Ljava/lang/String;

    iput-object p5, p0, Lqi/y;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(F)Lqi/y;
    .locals 6

    new-instance v0, Lqi/y;

    iget v1, p0, Lqi/y;->a:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    iget v2, p0, Lqi/y;->b:I

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    iget-object v4, p0, Lqi/y;->d:Ljava/lang/String;

    iget-object v5, p0, Lqi/y;->e:Ljava/lang/String;

    iget-object v3, p0, Lqi/y;->c:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lqi/y;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lqi/y;->f:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    invoke-static {p1, v1, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, v0, Lqi/y;->f:Landroid/graphics/Bitmap;

    :cond_0
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqi/y;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lqi/y;->b:I

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqi/y;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lqi/y;->a:I

    return v0
.end method

.method public final f(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lqi/y;->f:Landroid/graphics/Bitmap;

    return-void
.end method
