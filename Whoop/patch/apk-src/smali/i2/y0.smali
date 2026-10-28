.class public abstract Li2/y0;
.super Li2/t;
.source "SourceFile"


# instance fields
.field private c:Li2/f1;

.field private d:J

.field private e:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Li2/t;-><init>()V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Li2/y0;->d:J

    return-void
.end method


# virtual methods
.method public final a(JLi2/q0;F)V
    .locals 4

    iget-object v0, p0, Li2/y0;->c:Li2/f1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Li2/y0;->d:J

    invoke-static {v2, v3, p1, p2}, Lh2/e;->b(JJ)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_0
    invoke-static {p1, p2}, Lh2/e;->f(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object v1, p0, Li2/y0;->c:Li2/f1;

    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide p1, p0, Li2/y0;->d:J

    move-object v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li2/y0;->c:Li2/f1;

    if-nez v0, :cond_2

    new-instance v0, Li2/f1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li2/y0;->c:Li2/f1;

    :cond_2
    iget-object v2, p0, Li2/y0;->e:[F

    if-eqz v2, :cond_4

    iget-object v3, v0, Li2/f1;->a:Landroid/graphics/Matrix;

    if-nez v3, :cond_3

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, v0, Li2/f1;->a:Landroid/graphics/Matrix;

    :cond_3
    invoke-static {v3, v2}, Li2/w0;->A(Landroid/graphics/Matrix;[F)V

    iget-object v2, v0, Li2/f1;->b:Landroid/graphics/Shader;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    :cond_4
    invoke-virtual {p0, p1, p2}, Li2/y0;->b(J)Landroid/graphics/Shader;

    move-result-object v2

    iget-object v3, v0, Li2/f1;->a:Landroid/graphics/Matrix;

    if-eqz v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {v2, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    :cond_5
    iput-object v2, v0, Li2/f1;->b:Landroid/graphics/Shader;

    iput-object v0, p0, Li2/y0;->c:Li2/f1;

    iput-wide p1, p0, Li2/y0;->d:J

    :cond_6
    :goto_0
    check-cast p3, Li2/h;

    iget-object p1, p3, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    invoke-static {p1}, Li2/w0;->c(I)J

    move-result-wide p1

    sget-wide v2, Li2/x;->b:J

    invoke-static {p1, p2, v2, v3}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p3, v2, v3}, Li2/h;->e(J)V

    :cond_7
    iget-object p1, p3, Li2/h;->c:Landroid/graphics/Shader;

    if-eqz v0, :cond_8

    iget-object p2, v0, Li2/f1;->b:Landroid/graphics/Shader;

    goto :goto_1

    :cond_8
    move-object p2, v1

    :goto_1
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    if-eqz v0, :cond_9

    iget-object v1, v0, Li2/f1;->b:Landroid/graphics/Shader;

    :cond_9
    invoke-virtual {p3, v1}, Li2/h;->i(Landroid/graphics/Shader;)V

    :cond_a
    iget-object p1, p3, Li2/h;->a:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x437f0000    # 255.0f

    div-float/2addr p1, p2

    cmpg-float p1, p1, p4

    if-nez p1, :cond_b

    return-void

    :cond_b
    invoke-virtual {p3, p4}, Li2/h;->c(F)V

    return-void
.end method

.method public abstract b(J)Landroid/graphics/Shader;
.end method
