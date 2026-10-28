.class public final Li2/u0;
.super Li2/y0;
.source "SourceFile"


# instance fields
.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public final h:J

.field public final i:F

.field public final j:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;JFI)V
    .locals 0

    invoke-direct {p0}, Li2/y0;-><init>()V

    iput-object p1, p0, Li2/u0;->f:Ljava/util/List;

    iput-object p2, p0, Li2/u0;->g:Ljava/util/List;

    iput-wide p3, p0, Li2/u0;->h:J

    iput p5, p0, Li2/u0;->i:F

    iput p6, p0, Li2/u0;->j:I

    return-void
.end method


# virtual methods
.method public final b(J)Landroid/graphics/Shader;
    .locals 14

    const-wide v0, 0x7fffffff7fffffffL

    iget-wide v2, p0, Li2/u0;->h:J

    and-long/2addr v0, v2

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v4

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    const-wide v4, 0xffffffffL

    const/16 v6, 0x20

    if-nez v0, :cond_0

    invoke-static/range {p1 .. p2}, Ljc/x;->L(J)J

    move-result-wide v2

    shr-long v7, v2, v6

    long-to-int v0, v7

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    goto :goto_0

    :cond_0
    shr-long v7, v2, v6

    long-to-int v0, v7

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    cmpg-float v7, v7, v1

    if-nez v7, :cond_1

    shr-long v7, p1, v6

    long-to-int v0, v7

    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    cmpg-float v3, v3, v1

    if-nez v3, :cond_2

    and-long v2, p1, v4

    long-to-int v2, v2

    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    shl-long v6, v7, v6

    and-long/2addr v2, v4

    or-long v8, v6, v2

    iget v0, p0, Li2/u0;->i:F

    cmpg-float v1, v0, v1

    if-nez v1, :cond_3

    invoke-static/range {p1 .. p2}, Lh2/e;->d(J)F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    :cond_3
    move v10, v0

    iget v13, p0, Li2/u0;->j:I

    iget-object v11, p0, Li2/u0;->f:Ljava/util/List;

    iget-object v12, p0, Li2/u0;->g:Ljava/util/List;

    invoke-static/range {v8 .. v13}, Li2/w0;->k(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/RadialGradient;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Li2/u0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Li2/u0;

    iget-object v0, p1, Li2/u0;->f:Ljava/util/List;

    iget-object v1, p0, Li2/u0;->f:Ljava/util/List;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Li2/u0;->g:Ljava/util/List;

    iget-object v1, p1, Li2/u0;->g:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v0, p0, Li2/u0;->h:J

    iget-wide v2, p1, Li2/u0;->h:J

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget v0, p0, Li2/u0;->i:F

    iget v1, p1, Li2/u0;->i:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_5

    iget v0, p0, Li2/u0;->j:I

    iget p1, p1, Li2/u0;->j:I

    if-ne v0, p1, :cond_5

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Li2/u0;->f:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Li2/u0;->g:Ljava/util/List;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Li2/u0;->h:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Li2/u0;->i:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Li2/u0;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const-wide v0, 0x7fffffff7fffffffL

    iget-wide v2, p0, Li2/u0;->h:J

    and-long/2addr v0, v2

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v4

    const-string v1, ""

    const-string v4, ", "

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "center="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget v2, p0, Li2/u0;->i:F

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    const v5, 0x7fffffff

    and-int/2addr v3, v5

    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v3, v5, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "radius="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "RadialGradient(colors="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Li2/u0;->f:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", stops="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Li2/u0;->g:Ljava/util/List;

    invoke-static {v4, v0, v1, v2, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v0, "tileMode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Li2/u0;->j:I

    invoke-static {v0}, Li2/w0;->L(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
