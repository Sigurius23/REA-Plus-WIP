.class public final Ld40/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:F

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:Ljava/lang/Integer;

.field public final l:Ll3/v0;

.field public final m:Lp3/i;

.field public final n:Lp3/i;

.field public final o:Lp3/i;

.field public final p:Lp3/i;

.field public final q:Lp3/i;

.field public final r:Lp3/i;


# direct methods
.method public constructor <init>(IIIFJJJJJJLjava/lang/Integer;Ll3/v0;Lp3/i;Lp3/i;Lp3/i;Lp3/i;Lp3/i;Lp3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld40/s;->a:I

    iput p2, p0, Ld40/s;->b:I

    iput p3, p0, Ld40/s;->c:I

    iput p4, p0, Ld40/s;->d:F

    iput-wide p5, p0, Ld40/s;->e:J

    iput-wide p7, p0, Ld40/s;->f:J

    iput-wide p9, p0, Ld40/s;->g:J

    iput-wide p11, p0, Ld40/s;->h:J

    iput-wide p13, p0, Ld40/s;->i:J

    move-wide p1, p15

    iput-wide p1, p0, Ld40/s;->j:J

    move-object/from16 p1, p17

    iput-object p1, p0, Ld40/s;->k:Ljava/lang/Integer;

    move-object/from16 p1, p18

    iput-object p1, p0, Ld40/s;->l:Ll3/v0;

    move-object/from16 p1, p19

    iput-object p1, p0, Ld40/s;->m:Lp3/i;

    move-object/from16 p1, p20

    iput-object p1, p0, Ld40/s;->n:Lp3/i;

    move-object/from16 p1, p21

    iput-object p1, p0, Ld40/s;->o:Lp3/i;

    move-object/from16 p1, p22

    iput-object p1, p0, Ld40/s;->p:Lp3/i;

    move-object/from16 p1, p23

    iput-object p1, p0, Ld40/s;->q:Lp3/i;

    move-object/from16 p1, p24

    iput-object p1, p0, Ld40/s;->r:Lp3/i;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld40/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld40/s;

    iget v1, p0, Ld40/s;->a:I

    iget v3, p1, Ld40/s;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ld40/s;->b:I

    iget v3, p1, Ld40/s;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ld40/s;->c:I

    iget v3, p1, Ld40/s;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Ld40/s;->d:F

    iget v3, p1, Ld40/s;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Ld40/s;->e:J

    iget-wide v5, p1, Ld40/s;->e:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Ld40/s;->f:J

    iget-wide v5, p1, Ld40/s;->f:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Ld40/s;->g:J

    iget-wide v5, p1, Ld40/s;->g:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Ld40/s;->h:J

    iget-wide v5, p1, Ld40/s;->h:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Ld40/s;->i:J

    iget-wide v5, p1, Ld40/s;->i:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Ld40/s;->j:J

    iget-wide v5, p1, Ld40/s;->j:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ld40/s;->k:Ljava/lang/Integer;

    iget-object v3, p1, Ld40/s;->k:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ld40/s;->l:Ll3/v0;

    iget-object v3, p1, Ld40/s;->l:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ld40/s;->m:Lp3/i;

    iget-object v3, p1, Ld40/s;->m:Lp3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Ld40/s;->n:Lp3/i;

    iget-object v3, p1, Ld40/s;->n:Lp3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ld40/s;->o:Lp3/i;

    iget-object v3, p1, Ld40/s;->o:Lp3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Ld40/s;->p:Lp3/i;

    iget-object v3, p1, Ld40/s;->p:Lp3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Ld40/s;->q:Lp3/i;

    iget-object v3, p1, Ld40/s;->q:Lp3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Ld40/s;->r:Lp3/i;

    iget-object p1, p1, Ld40/s;->r:Lp3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Ld40/s;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ld40/s;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Ld40/s;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Ld40/s;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget-object v2, Ly3/o;->b:[Ly3/p;

    iget-wide v2, p0, Ld40/s;->e:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/s;->f:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/s;->g:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/s;->h:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/s;->i:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ld40/s;->j:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ld40/s;->k:Ljava/lang/Integer;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ld40/s;->l:Ll3/v0;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ll3/v0;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ld40/s;->m:Lp3/i;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ld40/s;->n:Lp3/i;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ld40/s;->o:Lp3/i;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ld40/s;->p:Lp3/i;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ld40/s;->q:Lp3/i;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Ld40/s;->r:Lp3/i;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Ld40/s;->e:J

    invoke-static {v0, v1}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Ld40/s;->f:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Ld40/s;->g:J

    invoke-static {v2, v3}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Ld40/s;->h:J

    invoke-static {v3, v4}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Ld40/s;->i:J

    invoke-static {v4, v5}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, Ld40/s;->j:J

    invoke-static {v5, v6}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v5

    const-string v6, ", fontWeightMedium="

    const-string v7, ", fontWeightBold="

    iget v8, p0, Ld40/s;->a:I

    iget v9, p0, Ld40/s;->b:I

    const-string v10, "StripeTypography(fontWeightNormal="

    invoke-static {v8, v9, v10, v6, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, p0, Ld40/s;->c:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", fontSizeMultiplier="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p0, Ld40/s;->d:F

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v7, ", xxSmallFontSize="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", xSmallFontSize="

    const-string v8, ", smallFontSize="

    invoke-static {v6, v0, v7, v1, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", mediumFontSize="

    const-string v1, ", largeFontSize="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", xLargeFontSize="

    const-string v1, ", fontFamily="

    invoke-static {v6, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ld40/s;->k:Ljava/lang/Integer;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", h4="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->l:Ll3/v0;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body1FontFamily="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->m:Lp3/i;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body2FontFamily="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->n:Lp3/i;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", h5FontFamily="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->o:Lp3/i;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", h6FontFamily="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->p:Lp3/i;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle1FontFamily="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->q:Lp3/i;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", captionFontFamily="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ld40/s;->r:Lp3/i;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
