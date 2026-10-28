.class public final synthetic Lv3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:F

.field public final synthetic w:J

.field public final synthetic x:I

.field public final synthetic y:Landroid/graphics/Canvas;

.field public final synthetic z:Landroid/graphics/Paint;


# direct methods
.method public synthetic constructor <init>(Lv3/b;JILandroid/graphics/Canvas;Landroid/graphics/Paint;IF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lv3/a;->w:J

    iput p4, p0, Lv3/a;->x:I

    iput-object p5, p0, Lv3/a;->y:Landroid/graphics/Canvas;

    iput-object p6, p0, Lv3/a;->z:Landroid/graphics/Paint;

    iput p7, p0, Lv3/a;->E:I

    iput p8, p0, Lv3/a;->F:F

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lv3/a;->x:I

    sget-object v2, Ly3/m;->w:Ly3/m;

    iget-wide v2, v0, Lv3/a;->w:J

    invoke-static {v2, v3}, Lh2/e;->d(J)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v8, v4

    const/16 v4, 0x20

    shl-long/2addr v6, v4

    const-wide v10, 0xffffffffL

    and-long/2addr v8, v10

    or-long v11, v6, v8

    new-instance v6, Li2/o0;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v2, v3}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v10

    move-wide v13, v11

    move-wide v15, v11

    move-wide/from16 v17, v11

    invoke-static/range {v10 .. v18}, Lj93/l0;->c(Lh2/c;JJJJ)Lh2/d;

    move-result-object v2

    invoke-direct {v6, v2}, Li2/o0;-><init>(Lh2/d;)V

    iget v3, v0, Lv3/a;->E:I

    int-to-float v7, v3

    iget-object v6, v0, Lv3/a;->y:Landroid/graphics/Canvas;

    iget-object v13, v0, Lv3/a;->z:Landroid/graphics/Paint;

    iget v3, v0, Lv3/a;->F:F

    invoke-static {v2}, Lj93/l0;->O(Lh2/d;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    invoke-static {v1, v2}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {v2}, Lh2/d;->a()F

    move-result v2

    div-float/2addr v2, v5

    sub-float/2addr v3, v2

    invoke-virtual {v6, v7, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v1, v1, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v6, v1, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v6}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0

    :cond_0
    iget-wide v8, v2, Lh2/d;->e:J

    shr-long/2addr v8, v4

    long-to-int v4, v8

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    invoke-virtual {v2}, Lh2/d;->a()F

    move-result v4

    div-float/2addr v4, v5

    sub-float v8, v3, v4

    int-to-float v1, v1

    invoke-virtual {v2}, Lh2/d;->b()F

    move-result v4

    mul-float/2addr v4, v1

    add-float v9, v4, v7

    invoke-virtual {v2}, Lh2/d;->a()F

    move-result v1

    div-float/2addr v1, v5

    add-float v10, v1, v3

    move v12, v11

    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
