.class public final Lvy0/p$c;
.super Li2/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvy0/p;
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
        "vy0/p$c",
        "Li2/y0;",
        "Lh2/e;",
        "size",
        "Landroid/graphics/Shader;",
        "Landroidx/compose/ui/graphics/Shader;",
        "b",
        "(J)Landroid/graphics/Shader;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li2/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(J)Landroid/graphics/Shader;
    .locals 11

    const-wide v0, 0xffffffffL

    and-long v2, p1, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v2, v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    const/16 v2, 0x20

    shl-long/2addr v3, v2

    and-long/2addr v0, v5

    or-long v5, v3, v0

    shr-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    const p2, 0x3f19999a    # 0.6f

    mul-float v7, p1, p2

    invoke-static {}, Lvy0/p;->m1()J

    move-result-wide p1

    const v0, 0x3ee66666    # 0.45f

    invoke-static {v0, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {}, Lvy0/p;->l1()J

    move-result-wide p1

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-static {v1, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    new-instance v1, Li2/x;

    invoke-direct {v1, p1, p2}, Li2/x;-><init>(J)V

    invoke-static {}, Lvy0/p;->l1()J

    move-result-wide p1

    const/4 v2, 0x0

    invoke-static {v2, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    new-instance v2, Li2/x;

    invoke-direct {v2, p1, p2}, Li2/x;-><init>(J)V

    filled-new-array {v0, v1, v2}, [Li2/x;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Li2/w0;->k(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/RadialGradient;

    move-result-object p1

    return-object p1
.end method
