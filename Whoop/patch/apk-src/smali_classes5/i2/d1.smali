.class public final Li2/d1;
.super Li2/y0;
.source "SourceFile"


# instance fields
.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Li2/y0;-><init>()V

    iput-object p1, p0, Li2/d1;->f:Ljava/util/List;

    iput-object p2, p0, Li2/d1;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final b(J)Landroid/graphics/Shader;
    .locals 6

    invoke-static {p1, p2}, Ljc/x;->L(J)J

    move-result-wide p1

    iget-object v0, p0, Li2/d1;->f:Ljava/util/List;

    iget-object v1, p0, Li2/d1;->g:Ljava/util/List;

    invoke-static {v0, v1}, Li2/w0;->M(Ljava/util/List;Ljava/util/List;)V

    new-instance v2, Landroid/graphics/SweepGradient;

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {v0}, Li2/w0;->y(Ljava/util/List;)[I

    move-result-object p2

    invoke-static {v1, v0}, Li2/w0;->z(Ljava/util/List;Ljava/util/List;)[F

    move-result-object v0

    invoke-direct {v2, v3, p1, p2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    return-object v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Li2/d1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Li2/d1;

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v0, v1, v0, v1}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Li2/d1;->f:Ljava/util/List;

    iget-object v1, p1, Li2/d1;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Li2/d1;->g:Ljava/util/List;

    iget-object p1, p1, Li2/d1;->g:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Li2/d1;->f:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Li2/d1;->g:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "SweepGradient("

    const-string v1, "colors="

    const-string v2, ""

    invoke-static {v0, v2, v1}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Li2/d1;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stops="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li2/d1;->g:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
