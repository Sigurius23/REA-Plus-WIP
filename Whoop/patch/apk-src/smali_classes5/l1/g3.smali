.class public final synthetic Ll1/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic F:Lp1/t2;

.field public final synthetic G:J

.field public final synthetic H:Lk2/i;

.field public final synthetic I:J

.field public final synthetic w:Lp1/t2;

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ld0/j0;IFFLd0/j0;Ld0/j0;JLk2/i;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/g3;->w:Lp1/t2;

    iput p2, p0, Ll1/g3;->x:I

    iput p3, p0, Ll1/g3;->y:F

    iput p4, p0, Ll1/g3;->z:F

    iput-object p5, p0, Ll1/g3;->E:Lp1/t2;

    iput-object p6, p0, Ll1/g3;->F:Lp1/t2;

    iput-wide p7, p0, Ll1/g3;->G:J

    iput-object p9, p0, Ll1/g3;->H:Lk2/i;

    iput-wide p10, p0, Ll1/g3;->I:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    iget-wide v5, v1, Ll1/g3;->G:J

    iget-object v7, v1, Ll1/g3;->H:Lk2/i;

    iget-wide v10, v1, Ll1/g3;->I:J

    move-object/from16 v2, p1

    check-cast v2, Lk2/e;

    iget-object v0, v1, Ll1/g3;->w:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float v9, v0, v3

    iget v0, v1, Ll1/g3;->x:I

    iget v4, v1, Ll1/g3;->y:F

    const/16 v8, 0x20

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v12

    const-wide v14, 0xffffffffL

    and-long/2addr v12, v14

    long-to-int v0, v12

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v12

    shr-long/2addr v12, v8

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    cmpl-float v0, v0, v12

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, v1, Ll1/g3;->z:F

    add-float/2addr v4, v0

    :goto_0
    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v12

    shr-long/2addr v12, v8

    long-to-int v0, v12

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {v2, v0}, Ly3/c;->f0(F)F

    move-result v0

    float-to-double v12, v0

    const-wide v14, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v12, v14

    double-to-float v0, v12

    div-float/2addr v4, v0

    mul-float/2addr v4, v3

    iget-object v0, v1, Ll1/g3;->E:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v8, v1, Ll1/g3;->F:Lp1/t2;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    add-float/2addr v8, v0

    invoke-interface {v2}, Lk2/e;->B0()J

    move-result-wide v12

    invoke-interface {v2}, Lk2/e;->t0()La3/p;

    move-result-object v14

    move-wide/from16 v16, v10

    invoke-virtual {v14}, La3/p;->A()J

    move-result-wide v10

    invoke-virtual {v14}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v14, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    invoke-virtual {v0, v8, v12, v13}, Laj/d;->v(FJ)V

    invoke-static {v9, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    add-float/2addr v0, v9

    sub-float/2addr v3, v9

    invoke-static {v9, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/4 v8, 0x2

    int-to-float v8, v8

    mul-float/2addr v4, v8

    sub-float v4, v3, v4

    move v3, v0

    invoke-static/range {v2 .. v7}, Ll1/i3;->c(Lk2/e;FFJLk2/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v8, 0x0

    move-object v12, v7

    move-object v7, v2

    move-wide v2, v10

    move-wide/from16 v10, v16

    :try_start_1
    invoke-static/range {v7 .. v12}, Ll1/i3;->c(Lk2/e;FFJLk2/i;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v14, v2, v3}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-wide v2, v10

    :goto_1
    invoke-static {v14, v2, v3}, Ld;->z(La3/p;J)V

    throw v0
.end method
