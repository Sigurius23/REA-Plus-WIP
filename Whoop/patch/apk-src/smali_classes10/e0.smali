.class public final Le0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# instance fields
.field public final a:F

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:F

.field public final f:F

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:F

.field public final k:F

.field public final l:F

.field public final m:F

.field public final n:I

.field public final o:F

.field public final p:I

.field public final q:I

.field public final r:J

.field public final s:F

.field public final t:F


# direct methods
.method public constructor <init>(FLjava/lang/String;Ljava/lang/String;)V
    .locals 12

    const-wide v0, 0xff00ffb0L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    const-wide v2, 0xff3a4047L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    const/4 v6, 0x5

    int-to-float v6, v6

    const/16 v7, 0xa

    int-to-float v8, v7

    const/16 v9, 0x1e

    int-to-float v9, v9

    const/16 v10, 0x140

    int-to-float v10, v10

    const-string v11, "subtitle"

    invoke-static {p2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le0;->a:F

    iput-object p2, p0, Le0;->b:Ljava/lang/String;

    iput-object p3, p0, Le0;->c:Ljava/lang/String;

    const/16 p1, 0x64

    iput p1, p0, Le0;->d:I

    const/high16 p1, 0x43700000    # 240.0f

    iput p1, p0, Le0;->e:F

    const/high16 p1, 0x436e0000    # 238.0f

    iput p1, p0, Le0;->f:F

    iput-wide v0, p0, Le0;->g:J

    iput-wide v2, p0, Le0;->h:J

    iput-wide v4, p0, Le0;->i:J

    iput v6, p0, Le0;->j:F

    iput v8, p0, Le0;->k:F

    iput v9, p0, Le0;->l:F

    const p1, 0x3e99999a    # 0.3f

    iput p1, p0, Le0;->m:F

    iput v7, p0, Le0;->n:I

    const p1, 0x3f4ccccd    # 0.8f

    iput p1, p0, Le0;->o:F

    const/16 p1, 0x640

    iput p1, p0, Le0;->p:I

    const/16 p1, 0x960

    iput p1, p0, Le0;->q:I

    const-wide/16 p1, 0x5dc

    iput-wide p1, p0, Le0;->r:J

    const/high16 p1, 0x41700000    # 15.0f

    iput p1, p0, Le0;->s:F

    iput v10, p0, Le0;->t:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le0;

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Le0;

    iget v1, p0, Le0;->a:F

    iget v2, p1, Le0;->a:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v1, p0, Le0;->b:Ljava/lang/String;

    iget-object v2, p1, Le0;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object v1, p0, Le0;->c:Ljava/lang/String;

    iget-object v2, p1, Le0;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_4
    iget v1, p0, Le0;->d:I

    iget v2, p1, Le0;->d:I

    if-eq v1, v2, :cond_5

    goto/16 :goto_0

    :cond_5
    iget v1, p0, Le0;->e:F

    iget v2, p1, Le0;->e:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_0

    :cond_6
    iget v1, p0, Le0;->f:F

    iget v2, p1, Le0;->f:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-wide v1, p0, Le0;->g:J

    iget-wide v3, p1, Le0;->g:J

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-wide v1, p0, Le0;->h:J

    iget-wide v3, p1, Le0;->h:J

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-wide v1, p0, Le0;->i:J

    iget-wide v3, p1, Le0;->i:J

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    iget v1, p0, Le0;->j:F

    iget v2, p1, Le0;->j:F

    invoke-static {v1, v2}, Ly3/f;->b(FF)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_0

    :cond_b
    iget v1, p0, Le0;->k:F

    iget v2, p1, Le0;->k:F

    invoke-static {v1, v2}, Ly3/f;->b(FF)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_0

    :cond_c
    iget v1, p0, Le0;->l:F

    iget v2, p1, Le0;->l:F

    invoke-static {v1, v2}, Ly3/f;->b(FF)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_0

    :cond_d
    iget v1, p0, Le0;->m:F

    iget v2, p1, Le0;->m:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_0

    :cond_e
    iget v1, p0, Le0;->n:I

    iget v2, p1, Le0;->n:I

    if-eq v1, v2, :cond_f

    goto :goto_0

    :cond_f
    iget v1, p0, Le0;->o:F

    iget v2, p1, Le0;->o:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_0

    :cond_10
    iget v1, p0, Le0;->p:I

    iget v2, p1, Le0;->p:I

    if-eq v1, v2, :cond_11

    goto :goto_0

    :cond_11
    iget v1, p0, Le0;->q:I

    iget v2, p1, Le0;->q:I

    if-eq v1, v2, :cond_12

    goto :goto_0

    :cond_12
    iget-wide v1, p0, Le0;->r:J

    iget-wide v3, p1, Le0;->r:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_13

    goto :goto_0

    :cond_13
    iget v1, p0, Le0;->s:F

    iget v2, p1, Le0;->s:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_0

    :cond_14
    iget v1, p0, Le0;->t:F

    iget p1, p1, Le0;->t:F

    invoke-static {v1, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_15

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_15
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Le0;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Le0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Le0;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Le0;->d:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Le0;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->f:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget v2, Li2/x;->o:I

    iget-wide v2, p0, Le0;->g:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Le0;->h:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Le0;->i:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Le0;->j:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->k:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->l:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->m:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->n:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Le0;->o:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->p:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Le0;->q:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Le0;->r:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Le0;->s:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le0;->t:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Le0;->g:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Le0;->h:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Le0;->i:J

    invoke-static {v2, v3}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Le0;->j:F

    invoke-static {v3}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Le0;->k:F

    invoke-static {v4}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Le0;->l:F

    invoke-static {v5}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Le0;->t:F

    invoke-static {v6}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PercentageGaugeViewState(percentage="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v8, p0, Le0;->a:F

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, ", subtitle="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Le0;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", percentSymbol="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", totalSegments="

    const-string v9, ", arcSweepAngle="

    iget v10, p0, Le0;->d:I

    iget-object v11, p0, Le0;->c:Ljava/lang/String;

    invoke-static {v10, v11, v8, v9, v7}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v8, ", startAngle="

    const-string v9, ", activeColor="

    iget v10, p0, Le0;->e:F

    iget v11, p0, Le0;->f:F

    invoke-static {v7, v10, v8, v11, v9}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    const-string v8, ", inactiveColor="

    const-string v9, ", shootingStarColor="

    invoke-static {v7, v0, v8, v1, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", segmentWidth="

    const-string v1, ", segmentHeight="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", shadowHeight="

    const-string v1, ", taperFactor="

    invoke-static {v7, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Le0;->m:F

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", largeGapEvery="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le0;->n:I

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", largeGapExtraDeg="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le0;->o:F

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", animationDuration="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le0;->p:I

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", highlightDuration="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le0;->q:I

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", highlightPauseMillis="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Le0;->r:J

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", highlightTailLengthPercent="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le0;->s:F

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isPreview=false)"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
