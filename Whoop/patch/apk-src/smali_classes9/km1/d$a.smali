.class public final Lkm1/d$a;
.super Li2/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkm1/d;->d(Ljava/util/List;)Li2/t;
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
        "km1/d$a",
        "Li2/y0;",
        "Lh2/e;",
        "size",
        "Landroid/graphics/Shader;",
        "Landroidx/compose/ui/graphics/Shader;",
        "b",
        "(J)Landroid/graphics/Shader;",
        "home_release"
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
.field final synthetic f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/x;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkm1/d$a;->f:Ljava/util/List;

    invoke-direct {p0}, Li2/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(J)Landroid/graphics/Shader;
    .locals 14

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    const/16 v0, 0x20

    shl-long/2addr v1, v0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long v7, v1, v3

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    and-long v2, p1, v5

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v3, v0

    and-long v0, v1, v5

    or-long v9, v3, v0

    iget-object v11, p0, Lkm1/d$a;->f:Ljava/util/List;

    const/4 v13, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v13}, Li2/w0;->i(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/LinearGradient;

    move-result-object v0

    return-object v0
.end method
