.class public final Ld1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld1/a;

.field public final b:Ld1/j;

.field public final c:Ljava/lang/Object;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lq3/y;

.field public k:Ll3/r0;

.field public l:Lq3/r;

.field public m:Lh2/c;

.field public n:Lh2/c;

.field public final o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field public final p:[F

.field public final q:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Ld1/a;Ld1/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/l;->a:Ld1/a;

    iput-object p2, p0, Ld1/l;->b:Ld1/j;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/l;->c:Ljava/lang/Object;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, Ld1/l;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-static {}, Li2/l0;->a()[F

    move-result-object p1

    iput-object p1, p0, Ld1/l;->p:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Ld1/l;->q:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Ld1/l;->b:Ld1/j;

    invoke-virtual {v1}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v2

    iget-object v3, v1, Ld1/j;->x:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, v0, Ld1/l;->j:Lq3/y;

    if-eqz v2, :cond_18

    iget-object v2, v0, Ld1/l;->l:Lq3/r;

    if-eqz v2, :cond_18

    iget-object v2, v0, Ld1/l;->k:Ll3/r0;

    if-eqz v2, :cond_18

    iget-object v2, v0, Ld1/l;->m:Lh2/c;

    if-eqz v2, :cond_18

    iget-object v2, v0, Ld1/l;->n:Lh2/c;

    if-nez v2, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object v2, v0, Ld1/l;->p:[F

    invoke-static {v2}, Li2/l0;->d([F)V

    iget-object v4, v0, Ld1/l;->a:Ld1/a;

    iget-object v4, v4, Ld1/a;->w:Ld1/k;

    iget-object v4, v4, Ld1/k;->R:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/y;

    if-eqz v4, :cond_3

    invoke-interface {v4}, Ly2/y;->g()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v4, v2}, Ly2/y;->N([F)V

    :cond_3
    :goto_1
    iget-object v4, v0, Ld1/l;->n:Lh2/c;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v4, v4, Lh2/c;->a:F

    neg-float v4, v4

    iget-object v5, v0, Ld1/l;->n:Lh2/c;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v5, v5, Lh2/c;->b:F

    neg-float v5, v5

    invoke-static {v2, v4, v5}, Li2/l0;->g([FFF)V

    iget-object v4, v0, Ld1/l;->q:Landroid/graphics/Matrix;

    invoke-static {v4, v2}, Li2/w0;->A(Landroid/graphics/Matrix;[F)V

    iget-object v2, v0, Ld1/l;->j:Lq3/y;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v5, v2, Lq3/y;->b:J

    iget-object v7, v0, Ld1/l;->l:Lq3/r;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, v0, Ld1/l;->k:Ll3/r0;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v9, v0, Ld1/l;->m:Lh2/c;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v10, v0, Ld1/l;->n:Lh2/c;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-boolean v11, v0, Ld1/l;->f:Z

    iget-boolean v12, v0, Ld1/l;->g:Z

    iget-boolean v13, v0, Ld1/l;->h:Z

    iget-boolean v14, v0, Ld1/l;->i:Z

    iget-object v15, v0, Ld1/l;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-virtual {v15}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    invoke-virtual {v15, v4}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    iget-object v4, v2, Lq3/y;->c:Ll3/u0;

    move-object/from16 v22, v1

    invoke-static {v5, v6}, Ll3/u0;->f(J)I

    move-result v1

    invoke-static {v5, v6}, Ll3/u0;->e(J)I

    move-result v5

    invoke-virtual {v15, v1, v5}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    if-eqz v11, :cond_b

    if-gez v1, :cond_4

    goto :goto_5

    :cond_4
    invoke-interface {v7, v1}, Lq3/r;->x(I)I

    move-result v1

    invoke-virtual {v8, v1}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v11

    iget v6, v11, Lh2/c;->a:F

    move/from16 v16, v6

    iget-wide v5, v8, Ll3/r0;->c:J

    const/16 v17, 0x20

    shr-long v5, v5, v17

    long-to-int v5, v5

    int-to-float v5, v5

    const/4 v6, 0x0

    move/from16 v21, v12

    move/from16 v12, v16

    invoke-static {v12, v6, v5}, Le93/b;->m(FFF)F

    move-result v5

    iget v6, v11, Lh2/c;->b:F

    invoke-static {v9, v5, v6}, Lbi/g;->u(Lh2/c;FF)Z

    move-result v6

    iget v12, v11, Lh2/c;->d:F

    invoke-static {v9, v5, v12}, Lbi/g;->u(Lh2/c;FF)Z

    move-result v12

    invoke-virtual {v8, v1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v1

    move/from16 v16, v5

    sget-object v5, Lw3/j;->x:Lw3/j;

    if-ne v1, v5, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    if-nez v6, :cond_7

    if-eqz v12, :cond_6

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v5, 0x1

    :goto_4
    if-eqz v6, :cond_8

    if-nez v12, :cond_9

    :cond_8
    or-int/lit8 v5, v5, 0x2

    :cond_9
    if-eqz v1, :cond_a

    or-int/lit8 v5, v5, 0x4

    :cond_a
    move/from16 v20, v5

    iget v1, v11, Lh2/c;->b:F

    iget v5, v11, Lh2/c;->d:F

    move/from16 v19, v5

    move/from16 v17, v1

    move/from16 v18, v5

    invoke-virtual/range {v15 .. v20}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    goto :goto_6

    :cond_b
    :goto_5
    move/from16 v21, v12

    :goto_6
    if-eqz v21, :cond_15

    const/4 v1, -0x1

    if-eqz v4, :cond_c

    iget-wide v5, v4, Ll3/u0;->a:J

    invoke-static {v5, v6}, Ll3/u0;->f(J)I

    move-result v5

    goto :goto_7

    :cond_c
    move v5, v1

    :goto_7
    if-eqz v4, :cond_d

    iget-wide v11, v4, Ll3/u0;->a:J

    invoke-static {v11, v12}, Ll3/u0;->e(J)I

    move-result v1

    :cond_d
    if-ltz v5, :cond_15

    if-ge v5, v1, :cond_15

    iget-object v2, v2, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2, v5, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v15, v5, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-interface {v7, v5}, Lq3/r;->x(I)I

    move-result v2

    invoke-interface {v7, v1}, Lq3/r;->x(I)I

    move-result v4

    sub-int v6, v4, v2

    mul-int/lit8 v6, v6, 0x4

    new-array v6, v6, [F

    iget-object v11, v8, Ll3/r0;->b:Ll3/w;

    move v12, v5

    invoke-static {v2, v4}, Lj93/l0;->f(II)J

    move-result-wide v4

    invoke-virtual {v11, v4, v5, v6}, Ll3/w;->a(J[F)V

    move v5, v12

    :goto_8
    if-ge v5, v1, :cond_15

    invoke-interface {v7, v5}, Lq3/r;->x(I)I

    move-result v4

    sub-int v11, v4, v2

    mul-int/lit8 v11, v11, 0x4

    aget v12, v6, v11

    add-int/lit8 v16, v11, 0x1

    move/from16 v23, v1

    aget v1, v6, v16

    add-int/lit8 v16, v11, 0x2

    move/from16 v24, v2

    aget v2, v6, v16

    add-int/lit8 v11, v11, 0x3

    aget v11, v6, v11

    move/from16 v16, v5

    iget v5, v9, Lh2/c;->a:F

    cmpg-float v5, v5, v2

    if-gez v5, :cond_e

    const/16 v17, 0x1

    goto :goto_9

    :cond_e
    const/16 v17, 0x0

    :goto_9
    iget v5, v9, Lh2/c;->c:F

    cmpg-float v5, v12, v5

    if-gez v5, :cond_f

    const/4 v5, 0x1

    goto :goto_a

    :cond_f
    const/4 v5, 0x0

    :goto_a
    and-int v5, v17, v5

    move/from16 v17, v5

    iget v5, v9, Lh2/c;->b:F

    cmpg-float v5, v5, v11

    if-gez v5, :cond_10

    const/4 v5, 0x1

    goto :goto_b

    :cond_10
    const/4 v5, 0x0

    :goto_b
    and-int v5, v17, v5

    move/from16 v17, v5

    iget v5, v9, Lh2/c;->d:F

    cmpg-float v5, v1, v5

    if-gez v5, :cond_11

    const/4 v5, 0x1

    goto :goto_c

    :cond_11
    const/4 v5, 0x0

    :goto_c
    and-int v5, v17, v5

    invoke-static {v9, v12, v1}, Lbi/g;->u(Lh2/c;FF)Z

    move-result v17

    if-eqz v17, :cond_12

    invoke-static {v9, v2, v11}, Lbi/g;->u(Lh2/c;FF)Z

    move-result v17

    if-nez v17, :cond_13

    :cond_12
    or-int/lit8 v5, v5, 0x2

    :cond_13
    invoke-virtual {v8, v4}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v4

    move/from16 v18, v1

    sget-object v1, Lw3/j;->x:Lw3/j;

    if-ne v4, v1, :cond_14

    or-int/lit8 v5, v5, 0x4

    :cond_14
    move/from16 v19, v2

    move/from16 v21, v5

    move/from16 v20, v11

    move/from16 v17, v12

    invoke-virtual/range {v15 .. v21}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    add-int/lit8 v5, v16, 0x1

    move/from16 v1, v23

    move/from16 v2, v24

    goto :goto_8

    :cond_15
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_16

    if-eqz v13, :cond_16

    invoke-static {v15, v10}, Lc4/v;->j(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lh2/c;)V

    :cond_16
    const/16 v2, 0x22

    if-lt v1, v2, :cond_17

    if-eqz v14, :cond_17

    invoke-static {v15, v8, v9}, Lb3/g1;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll3/r0;Lh2/c;)V

    :cond_17
    invoke-virtual {v15}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v1

    invoke-virtual/range {v22 .. v22}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld1/l;->e:Z

    :cond_18
    :goto_d
    return-void
.end method
