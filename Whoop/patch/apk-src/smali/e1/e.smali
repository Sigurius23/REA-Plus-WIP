.class public final Le1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ll3/g;

.field public b:Lp3/h;

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:Ljava/util/List;

.field public h:Lu0/z0;

.field public i:Le1/b;

.field public j:J

.field public k:Ly3/c;

.field public l:Ll3/v0;

.field public m:Laa3/i1;

.field public n:Ly3/m;

.field public o:Ll3/r0;

.field public p:I

.field public q:I

.field public r:Le1/d;

.field public s:J


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;Lp3/h;IZIILjava/util/List;Lu0/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/e;->a:Ll3/g;

    iput-object p3, p0, Le1/e;->b:Lp3/h;

    iput p4, p0, Le1/e;->c:I

    iput-boolean p5, p0, Le1/e;->d:Z

    iput p6, p0, Le1/e;->e:I

    iput p7, p0, Le1/e;->f:I

    iput-object p8, p0, Le1/e;->g:Ljava/util/List;

    iput-object p9, p0, Le1/e;->h:Lu0/z0;

    sget-wide p3, Le1/a;->a:J

    iput-wide p3, p0, Le1/e;->j:J

    iput-object p2, p0, Le1/e;->l:Ll3/v0;

    const/4 p1, -0x1

    iput p1, p0, Le1/e;->p:I

    iput p1, p0, Le1/e;->q:I

    return-void
.end method


# virtual methods
.method public final a(ILy3/m;)I
    .locals 4

    iget v0, p0, Le1/e;->p:I

    iget v1, p0, Le1/e;->q:I

    if-ne p1, v0, :cond_0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    const v0, 0x7fffffff

    const/4 v1, 0x0

    invoke-static {v1, p1, v1, v0}, Ly3/b;->a(IIII)J

    move-result-wide v0

    iget v2, p0, Le1/e;->f:I

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    invoke-virtual {p0, v0, v1, p2}, Le1/e;->h(JLy3/m;)J

    move-result-wide v0

    :cond_1
    invoke-virtual {p0, v0, v1, p2}, Le1/e;->b(JLy3/m;)Ll3/w;

    move-result-object p2

    iget p2, p2, Ll3/w;->e:F

    invoke-static {p2}, Lwb3/f;->l(F)I

    move-result p2

    invoke-static {v0, v1}, Ly3/a;->j(J)I

    move-result v0

    if-ge p2, v0, :cond_2

    move p2, v0

    :cond_2
    iput p1, p0, Le1/e;->p:I

    iput p2, p0, Le1/e;->q:I

    return p2
.end method

.method public final b(JLy3/m;)Ll3/w;
    .locals 6

    invoke-virtual {p0, p3}, Le1/e;->e(Ly3/m;)Laa3/i1;

    move-result-object v1

    new-instance v0, Ll3/w;

    iget-boolean p3, p0, Le1/e;->d:Z

    iget v2, p0, Le1/e;->c:I

    invoke-virtual {v1}, Laa3/i1;->c()F

    move-result v3

    invoke-static {p1, p2, v2, p3, v3}, Lge3/g;->w(JIZF)J

    move-result-wide v2

    iget-boolean p1, p0, Le1/e;->d:Z

    iget v5, p0, Le1/e;->c:I

    iget p2, p0, Le1/e;->e:I

    const/4 p3, 0x1

    if-nez p1, :cond_2

    const/4 p1, 0x2

    if-ne v5, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    if-ne v5, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x5

    if-ne v5, p1, :cond_2

    :goto_0
    move v4, p3

    goto :goto_1

    :cond_2
    if-ge p2, p3, :cond_3

    goto :goto_0

    :cond_3
    move v4, p2

    :goto_1
    invoke-direct/range {v0 .. v5}, Ll3/w;-><init>(Laa3/i1;JII)V

    return-object v0
.end method

.method public final c(JLy3/m;)Z
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-wide v2, v0, Le1/e;->s:J

    const/4 v4, 0x2

    shl-long/2addr v2, v4

    const-wide/16 v4, 0x3

    or-long/2addr v2, v4

    iput-wide v2, v0, Le1/e;->s:J

    iget v2, v0, Le1/e;->f:I

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    invoke-virtual/range {p0 .. p3}, Le1/e;->h(JLy3/m;)J

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    iget-object v2, v0, Le1/e;->o:Ll3/r0;

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object v6, v2, Ll3/r0;->b:Ll3/w;

    iget-object v2, v2, Ll3/r0;->a:Ll3/q0;

    iget-object v7, v6, Ll3/w;->a:Laa3/i1;

    invoke-virtual {v7}, Laa3/i1;->b()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    iget-object v7, v2, Ll3/q0;->h:Ly3/m;

    iget-wide v8, v2, Ll3/q0;->j:J

    if-eq v1, v7, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v4, v5, v8, v9}, Ly3/a;->c(JJ)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v4, v5}, Ly3/a;->i(J)I

    move-result v2

    invoke-static {v8, v9}, Ly3/a;->i(J)I

    move-result v7

    if-eq v2, v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v4, v5}, Ly3/a;->k(J)I

    move-result v2

    invoke-static {v8, v9}, Ly3/a;->k(J)I

    move-result v7

    if-eq v2, v7, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v4, v5}, Ly3/a;->h(J)I

    move-result v2

    int-to-float v2, v2

    iget v7, v6, Ll3/w;->e:F

    cmpg-float v2, v2, v7

    if-ltz v2, :cond_9

    iget-boolean v2, v6, Ll3/w;->c:Z

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    :goto_1
    iget-object v2, v0, Le1/e;->o:Ll3/r0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, Ll3/r0;->a:Ll3/q0;

    iget-wide v6, v2, Ll3/q0;->j:J

    invoke-static {v4, v5, v6, v7}, Ly3/a;->c(JJ)Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v1, 0x0

    return v1

    :cond_8
    iget-object v2, v0, Le1/e;->o:Ll3/r0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, v1, v4, v5, v2}, Le1/e;->g(Ly3/m;JLl3/w;)Ll3/r0;

    move-result-object v1

    iput-object v1, v0, Le1/e;->o:Ll3/r0;

    return v3

    :cond_9
    :goto_2
    iget-object v2, v0, Le1/e;->h:Lu0/z0;

    if-eqz v2, :cond_e

    iput-object v1, v0, Le1/e;->n:Ly3/m;

    iget-object v6, v0, Le1/e;->l:Ll3/v0;

    iget-object v6, v6, Ll3/v0;->a:Ll3/m0;

    iget-wide v6, v6, Ll3/m0;->b:J

    iget-object v8, v0, Le1/e;->r:Le1/d;

    if-nez v8, :cond_a

    new-instance v8, Le1/d;

    invoke-direct {v8, v0}, Le1/d;-><init>(Le1/e;)V

    iput-object v8, v0, Le1/e;->r:Le1/d;

    :cond_a
    iget-object v8, v0, Le1/e;->r:Le1/d;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v9, v0, Le1/e;->a:Ll3/g;

    check-cast v2, Lu0/e;

    move-wide/from16 v10, p1

    invoke-virtual {v2, v8, v10, v11, v9}, Lu0/e;->b(Le1/d;JLl3/g;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ly3/o;->d(J)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {v6, v7, v8, v9}, Le1/f;->a(JJ)J

    move-result-wide v8

    :cond_b
    move-wide v13, v8

    iget-object v2, v0, Le1/e;->r:Le1/d;

    if-nez v2, :cond_c

    new-instance v2, Le1/d;

    invoke-direct {v2, v0}, Le1/d;-><init>(Le1/e;)V

    iput-object v2, v0, Le1/e;->r:Le1/d;

    :cond_c
    iget-object v2, v0, Le1/e;->r:Le1/d;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/d;->a()Ll3/r0;

    move-result-object v2

    if-eqz v2, :cond_d

    iget-object v6, v2, Ll3/r0;->a:Ll3/q0;

    iget-object v7, v6, Ll3/q0;->b:Ll3/v0;

    iget-object v7, v7, Ll3/v0;->a:Ll3/m0;

    iget-wide v7, v7, Ll3/m0;->b:J

    invoke-static {v13, v14, v7, v8}, Ly3/o;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_d

    iget v6, v6, Ll3/q0;->f:I

    iget v7, v0, Le1/e;->c:I

    if-ne v6, v7, :cond_d

    iput-object v2, v0, Le1/e;->o:Ll3/r0;

    return v3

    :cond_d
    iget-object v10, v0, Le1/e;->l:Ll3/v0;

    const/16 v23, 0x0

    const v24, 0xfffffd

    const-wide/16 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v10 .. v24}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v2

    invoke-virtual {v0, v2}, Le1/e;->f(Ll3/v0;)V

    :cond_e
    invoke-virtual {v0, v4, v5, v1}, Le1/e;->b(JLy3/m;)Ll3/w;

    move-result-object v2

    invoke-virtual {v0, v1, v4, v5, v2}, Le1/e;->g(Ly3/m;JLl3/w;)Ll3/r0;

    move-result-object v1

    iput-object v1, v0, Le1/e;->o:Ll3/r0;

    return v3
.end method

.method public final d(Ly3/c;)V
    .locals 5

    iget-object v0, p0, Le1/e;->k:Ly3/c;

    if-eqz p1, :cond_0

    sget v1, Le1/a;->b:I

    invoke-interface {p1}, Ly3/c;->getDensity()F

    move-result v1

    invoke-interface {p1}, Ly3/c;->m0()F

    move-result v2

    invoke-static {v1, v2}, Le1/a;->a(FF)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    sget-wide v1, Le1/a;->a:J

    :goto_0
    if-nez v0, :cond_1

    iput-object p1, p0, Le1/e;->k:Ly3/c;

    iput-wide v1, p0, Le1/e;->j:J

    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-wide v3, p0, Le1/e;->j:J

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    return-void

    :cond_2
    iput-object p1, p0, Le1/e;->k:Ly3/c;

    iput-wide v1, p0, Le1/e;->j:J

    iget-wide v0, p0, Le1/e;->s:J

    const/4 p1, 0x2

    shl-long/2addr v0, p1

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Le1/e;->s:J

    const/4 p1, 0x0

    iput-object p1, p0, Le1/e;->m:Laa3/i1;

    iput-object p1, p0, Le1/e;->o:Ll3/r0;

    const/4 v0, -0x1

    iput v0, p0, Le1/e;->q:I

    iput v0, p0, Le1/e;->p:I

    iput-object p1, p0, Le1/e;->r:Le1/d;

    return-void
.end method

.method public final e(Ly3/m;)Laa3/i1;
    .locals 8

    iget-object v0, p0, Le1/e;->m:Laa3/i1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le1/e;->n:Ly3/m;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, Laa3/i1;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iput-object p1, p0, Le1/e;->n:Ly3/m;

    iget-object v3, p0, Le1/e;->a:Ll3/g;

    iget-object v0, p0, Le1/e;->l:Ll3/v0;

    invoke-static {v0, p1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v4

    iget-object v6, p0, Le1/e;->k:Ly3/c;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, p0, Le1/e;->b:Lp3/h;

    iget-object p1, p0, Le1/e;->g:Ljava/util/List;

    if-nez p1, :cond_1

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_1
    move-object v5, p1

    new-instance v2, Laa3/i1;

    invoke-direct/range {v2 .. v7}, Laa3/i1;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;Ly3/c;Lp3/h;)V

    move-object v0, v2

    :cond_2
    iput-object v0, p0, Le1/e;->m:Laa3/i1;

    return-object v0
.end method

.method public final f(Ll3/v0;)V
    .locals 2

    iget-object v0, p0, Le1/e;->l:Ll3/v0;

    invoke-virtual {p1, v0}, Ll3/v0;->d(Ll3/v0;)Z

    move-result v0

    iput-object p1, p0, Le1/e;->l:Ll3/v0;

    if-nez v0, :cond_0

    iget-wide v0, p0, Le1/e;->s:J

    const/4 p1, 0x2

    shl-long/2addr v0, p1

    iput-wide v0, p0, Le1/e;->s:J

    const/4 p1, 0x0

    iput-object p1, p0, Le1/e;->m:Laa3/i1;

    iput-object p1, p0, Le1/e;->o:Ll3/r0;

    const/4 p1, -0x1

    iput p1, p0, Le1/e;->q:I

    iput p1, p0, Le1/e;->p:I

    :cond_0
    return-void
.end method

.method public final g(Ly3/m;JLl3/w;)Ll3/r0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    iget-object v2, v1, Ll3/w;->a:Laa3/i1;

    invoke-virtual {v2}, Laa3/i1;->c()F

    move-result v2

    iget v3, v1, Ll3/w;->d:F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    new-instance v3, Ll3/r0;

    new-instance v4, Ll3/q0;

    iget-object v5, v0, Le1/e;->a:Ll3/g;

    iget-object v6, v0, Le1/e;->l:Ll3/v0;

    iget-object v7, v0, Le1/e;->g:Ljava/util/List;

    if-nez v7, :cond_0

    sget-object v7, Lm83/y;->w:Lm83/y;

    :cond_0
    iget v8, v0, Le1/e;->e:I

    iget-boolean v9, v0, Le1/e;->d:Z

    iget v10, v0, Le1/e;->c:I

    iget-object v11, v0, Le1/e;->k:Ly3/c;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v13, v0, Le1/e;->b:Lp3/h;

    move-object/from16 v12, p1

    move-wide/from16 v14, p2

    invoke-direct/range {v4 .. v15}, Ll3/q0;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V

    invoke-static {v2}, Lwb3/f;->l(F)I

    move-result v2

    iget v5, v1, Ll3/w;->e:F

    invoke-static {v5}, Lwb3/f;->l(F)I

    move-result v5

    int-to-long v6, v2

    const/16 v2, 0x20

    shl-long/2addr v6, v2

    int-to-long v8, v5

    const-wide v10, 0xffffffffL

    and-long/2addr v8, v10

    or-long v5, v6, v8

    invoke-static {v14, v15, v5, v6}, Ly3/b;->d(JJ)J

    move-result-wide v5

    invoke-direct {v3, v4, v1, v5, v6}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    return-object v3
.end method

.method public final h(JLy3/m;)J
    .locals 4

    iget-object v0, p0, Le1/e;->i:Le1/b;

    iget-object v1, p0, Le1/e;->l:Ll3/v0;

    iget-object v2, p0, Le1/e;->k:Ly3/c;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, p0, Le1/e;->b:Lp3/h;

    invoke-static {v0, p3, v1, v2, v3}, Ldc/a;->y(Le1/b;Ly3/m;Ll3/v0;Ly3/c;Lp3/h;)Le1/b;

    move-result-object p3

    iput-object p3, p0, Le1/e;->i:Le1/b;

    iget v0, p0, Le1/e;->f:I

    invoke-virtual {p3, v0, p1, p2}, Le1/b;->a(IJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MultiParagraphLayoutCache(textLayoutResult="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le1/e;->o:Ll3/r0;

    const-string v2, "null"

    if-eqz v1, :cond_0

    const-string v1, "<TextLayoutResult>"

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastDensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Le1/e;->j:J

    invoke-static {v3, v4}, Le1/a;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", history="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Le1/e;->s:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le1/e;->o:Ll3/r0;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ll3/r0;->a:Ll3/q0;

    if-eqz v1, :cond_1

    iget-wide v1, v1, Ll3/q0;->j:J

    new-instance v3, Ly3/a;

    invoke-direct {v3, v1, v2}, Ly3/a;-><init>(J)V

    move-object v2, v3

    :cond_1
    const/16 v1, 0x29

    invoke-static {v0, v2, v1}, Ld13/a;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
