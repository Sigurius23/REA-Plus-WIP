.class public final Lu2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:F

.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:I

.field public final j:J

.field public final k:Ljava/util/List;

.field public final l:J

.field public m:Z

.field public n:Z

.field public o:Lu2/r;


# direct methods
.method public synthetic constructor <init>(JJJFJJZZI)V
    .locals 18

    const/4 v7, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    .line 1
    invoke-direct/range {v0 .. v17}, Lu2/r;-><init>(JJJZFJJZZIJ)V

    return-void
.end method

.method public constructor <init>(JJJZFJJZILjava/util/List;JJ)V
    .locals 18

    const/4 v14, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move/from16 v13, p13

    move/from16 v15, p14

    move-wide/from16 v16, p16

    .line 16
    invoke-direct/range {v0 .. v17}, Lu2/r;-><init>(JJJZFJJZZIJ)V

    move-object/from16 v1, p15

    .line 17
    iput-object v1, v0, Lu2/r;->k:Ljava/util/List;

    move-wide/from16 v1, p18

    .line 18
    iput-wide v1, v0, Lu2/r;->l:J

    return-void
.end method

.method public constructor <init>(JJJZFJJZZIJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lu2/r;->a:J

    .line 4
    iput-wide p3, p0, Lu2/r;->b:J

    .line 5
    iput-wide p5, p0, Lu2/r;->c:J

    .line 6
    iput-boolean p7, p0, Lu2/r;->d:Z

    .line 7
    iput p8, p0, Lu2/r;->e:F

    .line 8
    iput-wide p9, p0, Lu2/r;->f:J

    .line 9
    iput-wide p11, p0, Lu2/r;->g:J

    .line 10
    iput-boolean p13, p0, Lu2/r;->h:Z

    move p1, p15

    .line 11
    iput p1, p0, Lu2/r;->i:I

    move-wide/from16 p1, p16

    .line 12
    iput-wide p1, p0, Lu2/r;->j:J

    const-wide/16 p1, 0x0

    .line 13
    iput-wide p1, p0, Lu2/r;->l:J

    .line 14
    iput-boolean p14, p0, Lu2/r;->m:Z

    .line 15
    iput-boolean p14, p0, Lu2/r;->n:Z

    return-void
.end method

.method public static b(Lu2/r;JJLjava/util/ArrayList;)Lu2/r;
    .locals 21

    move-object/from16 v0, p0

    iget-wide v2, v0, Lu2/r;->a:J

    iget-wide v4, v0, Lu2/r;->b:J

    iget-boolean v8, v0, Lu2/r;->d:Z

    iget-wide v10, v0, Lu2/r;->f:J

    iget-boolean v14, v0, Lu2/r;->h:Z

    iget v15, v0, Lu2/r;->i:I

    iget-wide v6, v0, Lu2/r;->j:J

    iget v9, v0, Lu2/r;->e:F

    new-instance v1, Lu2/r;

    iget-wide v12, v0, Lu2/r;->l:J

    move-object/from16 v16, p5

    move-wide/from16 v17, v6

    move-wide/from16 v19, v12

    move-wide/from16 v6, p1

    move-wide/from16 v12, p3

    invoke-direct/range {v1 .. v20}, Lu2/r;-><init>(JJJZFJJZILjava/util/List;JJ)V

    iget-object v2, v0, Lu2/r;->o:Lu2/r;

    if-nez v2, :cond_0

    move-object v2, v0

    :cond_0
    iput-object v2, v1, Lu2/r;->o:Lu2/r;

    iget-object v2, v0, Lu2/r;->o:Lu2/r;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    iput-object v0, v1, Lu2/r;->o:Lu2/r;

    return-object v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lu2/r;->o:Lu2/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu2/r;->m:Z

    iput-boolean v0, p0, Lu2/r;->n:Z

    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu2/r;->a()V

    :cond_1
    return-void
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu2/r;->k:Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lu2/r;->a:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lu2/r;->c:J

    return-wide v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lu2/r;->d:Z

    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lu2/r;->e:F

    return v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lu2/r;->g:J

    return-wide v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lu2/r;->h:Z

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lu2/r;->i:I

    return v0
.end method

.method public final k()J
    .locals 2

    iget-wide v0, p0, Lu2/r;->b:J

    return-wide v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lu2/r;->o:Lu2/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu2/r;->l()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Lu2/r;->m:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lu2/r;->n:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PointerInputChange(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lu2/r;->a:J

    invoke-static {v1, v2}, Lu2/q;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uptimeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu2/r;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu2/r;->c:J

    invoke-static {v1, v2}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pressed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lu2/r;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lu2/r;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", previousUptimeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu2/r;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", previousPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu2/r;->g:J

    invoke-static {v1, v2}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", previousPressed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lu2/r;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isConsumed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu2/r;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    iget v2, p0, Lu2/r;->i:I

    if-eq v2, v1, :cond_3

    const/4 v1, 0x2

    if-eq v2, v1, :cond_2

    const/4 v1, 0x3

    if-eq v2, v1, :cond_1

    const/4 v1, 0x4

    if-eq v2, v1, :cond_0

    const-string v1, "Unknown"

    goto :goto_0

    :cond_0
    const-string v1, "Eraser"

    goto :goto_0

    :cond_1
    const-string v1, "Stylus"

    goto :goto_0

    :cond_2
    const-string v1, "Mouse"

    goto :goto_0

    :cond_3
    const-string v1, "Touch"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", historical="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu2/r;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",scrollDelta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lu2/r;->j:J

    invoke-static {v1, v2}, Lh2/b;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
