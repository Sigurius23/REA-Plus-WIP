.class public final Lo2/g;
.super Lo2/b0;
.source "SourceFile"


# instance fields
.field public b:Li2/t;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:Li2/t;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lk2/i;

.field public final r:Li2/j;

.field public s:Li2/j;

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo2/g;->c:F

    sget v1, Lo2/f0;->a:I

    sget-object v1, Lm83/y;->w:Lm83/y;

    iput-object v1, p0, Lo2/g;->d:Ljava/util/List;

    iput v0, p0, Lo2/g;->e:F

    const/4 v1, 0x0

    iput v1, p0, Lo2/g;->h:I

    iput v1, p0, Lo2/g;->i:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, p0, Lo2/g;->j:F

    iput v0, p0, Lo2/g;->l:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/g;->n:Z

    iput-boolean v0, p0, Lo2/g;->o:Z

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    iput-object v0, p0, Lo2/g;->r:Li2/j;

    iput-object v0, p0, Lo2/g;->s:Li2/j;

    sget-object v0, Ll83/i;->y:Ll83/i;

    sget-object v1, Lo2/f;->x:Lo2/f;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lo2/g;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lk2/e;)V
    .locals 18

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lo2/g;->n:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lo2/g;->d:Ljava/util/List;

    iget-object v2, v0, Lo2/g;->r:Li2/j;

    invoke-static {v1, v2}, Lo2/a;->d(Ljava/util/List;Li2/s0;)V

    invoke-virtual {v0}, Lo2/g;->e()V

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Lo2/g;->p:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lo2/g;->e()V

    :cond_1
    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, v0, Lo2/g;->n:Z

    iput-boolean v1, v0, Lo2/g;->p:Z

    iget-object v4, v0, Lo2/g;->b:Li2/t;

    if-eqz v4, :cond_2

    iget-object v3, v0, Lo2/g;->s:Li2/j;

    iget v5, v0, Lo2/g;->c:F

    const/4 v6, 0x0

    const/16 v7, 0x38

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v7}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    :cond_2
    iget-object v10, v0, Lo2/g;->g:Li2/t;

    if-eqz v10, :cond_5

    iget-object v2, v0, Lo2/g;->q:Lk2/i;

    iget-boolean v3, v0, Lo2/g;->o:Z

    if-nez v3, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v12, v2

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v11, Lk2/i;

    iget v12, v0, Lo2/g;->f:F

    iget v13, v0, Lo2/g;->j:F

    iget v14, v0, Lo2/g;->h:I

    iget v15, v0, Lo2/g;->i:I

    const/16 v16, 0x0

    const/16 v17, 0x10

    invoke-direct/range {v11 .. v17}, Lk2/i;-><init>(FFIILi2/t0;I)V

    iput-object v11, v0, Lo2/g;->q:Lk2/i;

    iput-boolean v1, v0, Lo2/g;->o:Z

    move-object v12, v11

    :goto_2
    iget-object v9, v0, Lo2/g;->s:Li2/j;

    iget v11, v0, Lo2/g;->e:F

    const/16 v13, 0x30

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v13}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    :cond_5
    return-void
.end method

.method public final e()V
    .locals 7

    iget v0, p0, Lo2/g;->k:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    iget-object v2, p0, Lo2/g;->r:Li2/j;

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez v0, :cond_0

    iget v0, p0, Lo2/g;->l:F

    cmpg-float v0, v0, v3

    if-nez v0, :cond_0

    iput-object v2, p0, Lo2/g;->s:Li2/j;

    return-void

    :cond_0
    iget-object v0, p0, Lo2/g;->s:Li2/j;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    iput-object v0, p0, Lo2/g;->s:Li2/j;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lo2/g;->s:Li2/j;

    iget-object v0, v0, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    move-result-object v0

    sget-object v4, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    if-ne v0, v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v4, p0, Lo2/g;->s:Li2/j;

    iget-object v4, v4, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->rewind()V

    iget-object v4, p0, Lo2/g;->s:Li2/j;

    invoke-virtual {v4, v0}, Li2/j;->l(I)V

    :goto_1
    iget-object v0, p0, Lo2/g;->t:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/l;

    invoke-virtual {v4, v2}, Li2/l;->c(Li2/j;)V

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/l;

    invoke-virtual {v2}, Li2/l;->a()F

    move-result v2

    iget v4, p0, Lo2/g;->k:F

    iget v5, p0, Lo2/g;->m:F

    add-float/2addr v4, v5

    rem-float/2addr v4, v3

    mul-float/2addr v4, v2

    iget v6, p0, Lo2/g;->l:F

    add-float/2addr v6, v5

    rem-float/2addr v6, v3

    mul-float/2addr v6, v2

    cmpl-float v3, v4, v6

    if-lez v3, :cond_3

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/l;

    iget-object v5, p0, Lo2/g;->s:Li2/j;

    invoke-virtual {v3, v4, v2, v5}, Li2/l;->b(FFLi2/j;)V

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/l;

    iget-object v2, p0, Lo2/g;->s:Li2/j;

    invoke-virtual {v0, v1, v6, v2}, Li2/l;->b(FFLi2/j;)V

    return-void

    :cond_3
    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/l;

    iget-object v1, p0, Lo2/g;->s:Li2/j;

    invoke-virtual {v0, v4, v6, v1}, Li2/l;->b(FFLi2/j;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo2/g;->r:Li2/j;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
