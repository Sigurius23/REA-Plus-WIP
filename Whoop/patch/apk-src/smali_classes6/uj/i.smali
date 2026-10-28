.class public final Luj/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:Ljava/lang/Float;

.field public final c:F

.field public final d:F

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Li2/x;

.field public final k:Li2/x;

.field public final l:Li2/x;

.field public final m:Li2/x;

.field public final n:Li2/x;

.field public final o:Li2/x;


# direct methods
.method public synthetic constructor <init>(FFJJJILi2/x;Li2/x;Li2/x;I)V
    .locals 21

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/high16 v1, 0x42000000    # 32.0f

    move v3, v1

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/high16 v1, 0x40c00000    # 6.0f

    move v6, v1

    goto :goto_1

    :cond_1
    move/from16 v6, p2

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    const/16 v1, 0x258

    move v13, v1

    goto :goto_2

    :cond_2
    move/from16 v13, p9

    :goto_2
    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object/from16 v16, v2

    goto :goto_3

    :cond_3
    move-object/from16 v16, p10

    :goto_3
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_4

    move-object/from16 v19, v2

    goto :goto_4

    :cond_4
    move-object/from16 v19, p11

    :goto_4
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_5

    move-object/from16 v20, v2

    goto :goto_5

    :cond_5
    move-object/from16 v20, p12

    :goto_5
    const/4 v4, 0x0

    const/high16 v5, 0x41000000    # 8.0f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v2, p0

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    .line 1
    invoke-direct/range {v2 .. v20}, Luj/i;-><init>(FLjava/lang/Float;FFJJJILjava/lang/String;Li2/x;Li2/x;Li2/x;Li2/x;Li2/x;Li2/x;)V

    return-void
.end method

.method public constructor <init>(FLjava/lang/Float;FFJJJILjava/lang/String;Li2/x;Li2/x;Li2/x;Li2/x;Li2/x;Li2/x;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Luj/i;->a:F

    .line 4
    iput-object p2, p0, Luj/i;->b:Ljava/lang/Float;

    .line 5
    iput p3, p0, Luj/i;->c:F

    .line 6
    iput p4, p0, Luj/i;->d:F

    .line 7
    iput-wide p5, p0, Luj/i;->e:J

    .line 8
    iput-wide p7, p0, Luj/i;->f:J

    .line 9
    iput-wide p9, p0, Luj/i;->g:J

    .line 10
    iput p11, p0, Luj/i;->h:I

    .line 11
    iput-object p12, p0, Luj/i;->i:Ljava/lang/String;

    .line 12
    iput-object p13, p0, Luj/i;->j:Li2/x;

    .line 13
    iput-object p14, p0, Luj/i;->k:Li2/x;

    .line 14
    iput-object p15, p0, Luj/i;->l:Li2/x;

    move-object/from16 p1, p16

    .line 15
    iput-object p1, p0, Luj/i;->m:Li2/x;

    move-object/from16 p1, p17

    .line 16
    iput-object p1, p0, Luj/i;->n:Li2/x;

    move-object/from16 p1, p18

    .line 17
    iput-object p1, p0, Luj/i;->o:Li2/x;

    return-void
.end method

.method public static a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Luj/i;->a:F

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Luj/i;->b:Ljava/lang/Float;

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_2

    iget v2, v0, Luj/i;->c:F

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_3

    iget v2, v0, Luj/i;->d:F

    move v7, v2

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    iget-wide v8, v0, Luj/i;->e:J

    iget-wide v10, v0, Luj/i;->f:J

    iget-wide v12, v0, Luj/i;->g:J

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_4

    iget v2, v0, Luj/i;->h:I

    move v14, v2

    goto :goto_4

    :cond_4
    move/from16 v14, p5

    :goto_4
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_5

    iget-object v2, v0, Luj/i;->i:Ljava/lang/String;

    move-object v15, v2

    goto :goto_5

    :cond_5
    move-object/from16 v15, p6

    :goto_5
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_6

    iget-object v2, v0, Luj/i;->j:Li2/x;

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, p7

    :goto_6
    iget-object v2, v0, Luj/i;->k:Li2/x;

    and-int/lit16 v3, v1, 0x800

    if-eqz v3, :cond_7

    iget-object v3, v0, Luj/i;->l:Li2/x;

    move-object/from16 v18, v3

    goto :goto_7

    :cond_7
    move-object/from16 v18, p8

    :goto_7
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_8

    iget-object v1, v0, Luj/i;->m:Li2/x;

    move-object/from16 v19, v1

    goto :goto_8

    :cond_8
    move-object/from16 v19, p9

    :goto_8
    iget-object v1, v0, Luj/i;->n:Li2/x;

    iget-object v3, v0, Luj/i;->o:Li2/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v21, v3

    new-instance v3, Luj/i;

    move-object/from16 v20, v1

    move-object/from16 v17, v2

    invoke-direct/range {v3 .. v21}, Luj/i;-><init>(FLjava/lang/Float;FFJJJILjava/lang/String;Li2/x;Li2/x;Li2/x;Li2/x;Li2/x;Li2/x;)V

    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Luj/i;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Luj/i;

    iget v0, p0, Luj/i;->a:F

    iget v1, p1, Luj/i;->a:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Luj/i;->b:Ljava/lang/Float;

    iget-object v1, p1, Luj/i;->b:Ljava/lang/Float;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget v0, p0, Luj/i;->c:F

    iget v1, p1, Luj/i;->c:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget v0, p0, Luj/i;->d:F

    iget v1, p1, Luj/i;->d:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-wide v0, p0, Luj/i;->e:J

    iget-wide v2, p1, Luj/i;->e:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-wide v0, p0, Luj/i;->f:J

    iget-wide v2, p1, Luj/i;->f:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-wide v0, p0, Luj/i;->g:J

    iget-wide v2, p1, Luj/i;->g:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget v0, p0, Luj/i;->h:I

    iget v1, p1, Luj/i;->h:I

    if-eq v0, v1, :cond_9

    goto :goto_0

    :cond_9
    iget-object v0, p0, Luj/i;->i:Ljava/lang/String;

    iget-object v1, p1, Luj/i;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    iget-object v0, p0, Luj/i;->j:Li2/x;

    iget-object v1, p1, Luj/i;->j:Li2/x;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    iget-object v0, p0, Luj/i;->k:Li2/x;

    iget-object v1, p1, Luj/i;->k:Li2/x;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    iget-object v0, p0, Luj/i;->l:Li2/x;

    iget-object v1, p1, Luj/i;->l:Li2/x;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    iget-object v0, p0, Luj/i;->m:Li2/x;

    iget-object v1, p1, Luj/i;->m:Li2/x;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget-object v0, p0, Luj/i;->n:Li2/x;

    iget-object v1, p1, Luj/i;->n:Li2/x;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget-object v0, p0, Luj/i;->o:Li2/x;

    iget-object p1, p1, Luj/i;->o:Li2/x;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_10
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget v0, p0, Luj/i;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Luj/i;->b:Ljava/lang/Float;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Luj/i;->c:F

    invoke-static {v3, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v3, p0, Luj/i;->d:F

    invoke-static {v3, v0, v1}, Ld;->a(FII)I

    move-result v0

    sget v3, Li2/x;->o:I

    iget-wide v3, p0, Luj/i;->e:J

    invoke-static {v0, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v3, p0, Luj/i;->f:J

    invoke-static {v0, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v3, p0, Luj/i;->g:J

    invoke-static {v0, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget v3, p0, Luj/i;->h:I

    invoke-static {v3, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Luj/i;->i:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Luj/i;->j:Li2/x;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    iget-wide v3, v3, Li2/x;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Luj/i;->k:Li2/x;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    iget-wide v3, v3, Li2/x;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Luj/i;->l:Li2/x;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    iget-wide v3, v3, Li2/x;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Luj/i;->m:Li2/x;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    iget-wide v3, v3, Li2/x;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Luj/i;->n:Li2/x;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    iget-wide v3, v3, Li2/x;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Luj/i;->o:Li2/x;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    iget-wide v1, v1, Li2/x;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3c1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FormControlTheme(height="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Luj/i;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->b:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", padding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Luj/i;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cornerRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Luj/i;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Luj/i;->e:J

    const-string v3, ", borderColor="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Luj/i;->f:J

    const-string v3, ", contentColor="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Luj/i;->g:J

    const-string v3, ", fontWeight="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Luj/i;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", shadow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shadowColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->j:Li2/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->k:Li2/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", baseAccent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->l:Li2/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activeBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->m:Li2/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nudgeRatingStarColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->n:Li2/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nudgeRatingStarColorSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/i;->o:Li2/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutCornerRadius=null, heightSmall=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
