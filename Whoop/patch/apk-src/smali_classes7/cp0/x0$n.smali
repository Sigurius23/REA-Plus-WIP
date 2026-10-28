.class public final Lcp0/x0$n;
.super Li2/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/x0;->n1(F)Li2/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "cp0/x0$n",
        "Li2/y0;",
        "Lh2/e;",
        "size",
        "Landroid/graphics/Shader;",
        "Landroidx/compose/ui/graphics/Shader;",
        "b",
        "(J)Landroid/graphics/Shader;",
        "coach-everywhere_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic f:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    iput p1, p0, Lcp0/x0$n;->f:F

    invoke-direct {p0}, Li2/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(J)Landroid/graphics/Shader;
    .locals 6

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    const p2, 0x3f59999a    # 0.85f

    mul-float v2, p1, p2

    invoke-static {}, Lcp0/x0;->h1()J

    move-result-wide p1

    const v0, 0x3ee66666    # 0.45f

    iget v1, p0, Lcp0/x0$n;->f:F

    mul-float/2addr v1, v0

    invoke-static {v1, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {}, Lcp0/x0;->g1()J

    move-result-wide p1

    const v1, 0x3df5c28f    # 0.12f

    iget v3, p0, Lcp0/x0$n;->f:F

    mul-float/2addr v3, v1

    invoke-static {v3, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    new-instance v1, Li2/x;

    invoke-direct {v1, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {}, Lcp0/x0;->g1()J

    move-result-wide p1

    const/4 v3, 0x0

    invoke-static {v3, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    new-instance v3, Li2/x;

    invoke-direct {v3, p1, p2}, Li2/x;-><init>(J)V

    filled-new-array {v0, v1, v3}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v0, 0x0

    invoke-static/range {v0 .. v5}, Li2/w0;->k(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/RadialGradient;

    move-result-object p1

    return-object p1
.end method
