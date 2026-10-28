.class public final Lzi/k;
.super Lzi/b;
.source "SourceFile"


# instance fields
.field public final D:Ljava/lang/StringBuilder;

.field public final E:Landroid/graphics/RectF;

.field public final F:Landroid/graphics/Matrix;

.field public final G:Lzi/i;

.field public final H:Lzi/i;

.field public final I:Ljava/util/HashMap;

.field public final J:La0/y;

.field public final K:Ljava/util/ArrayList;

.field public final L:Lti/p;

.field public final M:Lqi/w;

.field public final N:Lqi/i;

.field public final O:I

.field public final P:Lti/e;

.field public Q:Lti/r;

.field public final R:Lti/e;

.field public S:Lti/r;

.field public final T:Lti/h;

.field public U:Lti/r;

.field public final V:Lti/h;

.field public W:Lti/r;

.field public final X:Lti/e;

.field public Y:Lti/r;

.field public Z:Lti/r;

.field public final a0:Lti/e;

.field public final b0:Lti/e;

.field public final c0:Lti/e;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/e;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Lzi/b;-><init>(Lqi/w;Lzi/e;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lzi/k;->D:Ljava/lang/StringBuilder;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lzi/k;->E:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lzi/k;->F:Landroid/graphics/Matrix;

    new-instance v0, Lzi/i;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lzi/k;->G:Lzi/i;

    new-instance v0, Lzi/i;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lzi/k;->H:Lzi/i;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzi/k;->I:Ljava/util/HashMap;

    new-instance v0, La0/y;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lzi/k;->J:La0/y;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzi/k;->K:Ljava/util/ArrayList;

    iput v1, p0, Lzi/k;->O:I

    iput-object p1, p0, Lzi/k;->M:Lqi/w;

    iget-object p1, p2, Lzi/e;->b:Lqi/i;

    iput-object p1, p0, Lzi/k;->N:Lqi/i;

    iget-object p1, p2, Lzi/e;->q:Lxi/d;

    new-instance v0, Lti/p;

    iget-object p1, p1, Lal/a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Lti/d;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lzi/k;->L:Lti/p;

    invoke-virtual {v0, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, v0}, Lzi/b;->f(Lti/d;)V

    iget-object p1, p2, Lzi/e;->r:Lso/q;

    if-eqz p1, :cond_0

    iget-object p2, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast p2, Lb30/m;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lb30/m;->x:Ljava/lang/Object;

    check-cast p2, Lxi/a;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lxi/a;->k0()Lti/d;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lti/e;

    iput-object v0, p0, Lzi/k;->P:Lti/e;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p2, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast p2, Lb30/m;

    if-eqz p2, :cond_1

    iget-object p2, p2, Lb30/m;->y:Ljava/lang/Object;

    check-cast p2, Lxi/a;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lxi/a;->k0()Lti/d;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lti/e;

    iput-object v0, p0, Lzi/k;->R:Lti/e;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_1
    if-eqz p1, :cond_2

    iget-object p2, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast p2, Lb30/m;

    if-eqz p2, :cond_2

    iget-object p2, p2, Lb30/m;->z:Ljava/lang/Object;

    check-cast p2, Lxi/b;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lxi/b;->H0()Lti/h;

    move-result-object p2

    iput-object p2, p0, Lzi/k;->T:Lti/h;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_2
    if-eqz p1, :cond_3

    iget-object p2, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast p2, Lb30/m;

    if-eqz p2, :cond_3

    iget-object p2, p2, Lb30/m;->E:Ljava/lang/Object;

    check-cast p2, Lxi/b;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lxi/b;->H0()Lti/h;

    move-result-object p2

    iput-object p2, p0, Lzi/k;->V:Lti/h;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_3
    if-eqz p1, :cond_4

    iget-object p2, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast p2, Lb30/m;

    if-eqz p2, :cond_4

    iget-object p2, p2, Lb30/m;->F:Ljava/lang/Object;

    check-cast p2, Lxi/a;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lxi/a;->k0()Lti/d;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lti/e;

    iput-object v0, p0, Lzi/k;->X:Lti/e;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_4
    if-eqz p1, :cond_5

    iget-object p2, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p2, Lz7/a;

    if-eqz p2, :cond_5

    iget-object p2, p2, Lz7/a;->b:Ljava/lang/Object;

    check-cast p2, Lxi/a;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lxi/a;->k0()Lti/d;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lti/e;

    iput-object v0, p0, Lzi/k;->a0:Lti/e;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_5
    if-eqz p1, :cond_6

    iget-object p2, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p2, Lz7/a;

    if-eqz p2, :cond_6

    iget-object p2, p2, Lz7/a;->c:Ljava/lang/Object;

    check-cast p2, Lxi/a;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lxi/a;->k0()Lti/d;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lti/e;

    iput-object v0, p0, Lzi/k;->b0:Lti/e;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_6
    if-eqz p1, :cond_7

    iget-object p2, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p2, Lz7/a;

    if-eqz p2, :cond_7

    iget-object p2, p2, Lz7/a;->d:Ljava/lang/Object;

    check-cast p2, Lxi/a;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lxi/a;->k0()Lti/d;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lti/e;

    iput-object v0, p0, Lzi/k;->c0:Lti/e;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    :cond_7
    if-eqz p1, :cond_8

    iget-object p1, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p1, Lz7/a;

    if-eqz p1, :cond_8

    iget p1, p1, Lz7/a;->a:I

    iput p1, p0, Lzi/k;->O:I

    :cond_8
    return-void
.end method

.method public static r(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 8

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move-object v7, p1

    move-object v1, p2

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public static s(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 2

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2, p0, p1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method


# virtual methods
.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lzi/k;->N:Lqi/i;

    iget-object p3, p2, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p3

    int-to-float p3, p3

    iget-object p2, p2, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p3, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 3

    invoke-super {p0, p1, p2}, Lzi/b;->g(Ld1/j;Ljava/lang/Object;)V

    sget-object v0, Lqi/a0;->a:Landroid/graphics/PointF;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lzi/k;->Q:Lti/r;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_0
    if-nez p1, :cond_1

    iput-object v1, p0, Lzi/k;->Q:Lti/r;

    return-void

    :cond_1
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lzi/k;->Q:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/k;->Q:Lti/r;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p2, v0, :cond_5

    iget-object p2, p0, Lzi/k;->S:Lti/r;

    if-eqz p2, :cond_3

    invoke-virtual {p0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_3
    if-nez p1, :cond_4

    iput-object v1, p0, Lzi/k;->S:Lti/r;

    return-void

    :cond_4
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lzi/k;->S:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/k;->S:Lti/r;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_5
    sget-object v0, Lqi/a0;->n:Ljava/lang/Float;

    if-ne p2, v0, :cond_8

    iget-object p2, p0, Lzi/k;->U:Lti/r;

    if-eqz p2, :cond_6

    invoke-virtual {p0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_6
    if-nez p1, :cond_7

    iput-object v1, p0, Lzi/k;->U:Lti/r;

    return-void

    :cond_7
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lzi/k;->U:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/k;->U:Lti/r;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_8
    sget-object v0, Lqi/a0;->o:Ljava/lang/Float;

    if-ne p2, v0, :cond_b

    iget-object p2, p0, Lzi/k;->W:Lti/r;

    if-eqz p2, :cond_9

    invoke-virtual {p0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_9
    if-nez p1, :cond_a

    iput-object v1, p0, Lzi/k;->W:Lti/r;

    return-void

    :cond_a
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lzi/k;->W:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/k;->W:Lti/r;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_b
    sget-object v0, Lqi/a0;->A:Ljava/lang/Float;

    if-ne p2, v0, :cond_e

    iget-object p2, p0, Lzi/k;->Y:Lti/r;

    if-eqz p2, :cond_c

    invoke-virtual {p0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_c
    if-nez p1, :cond_d

    iput-object v1, p0, Lzi/k;->Y:Lti/r;

    return-void

    :cond_d
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lzi/k;->Y:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/k;->Y:Lti/r;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_e
    sget-object v0, Lqi/a0;->H:Landroid/graphics/Typeface;

    if-ne p2, v0, :cond_11

    iget-object p2, p0, Lzi/k;->Z:Lti/r;

    if-eqz p2, :cond_f

    invoke-virtual {p0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_f
    if-nez p1, :cond_10

    iput-object v1, p0, Lzi/k;->Z:Lti/r;

    return-void

    :cond_10
    new-instance p2, Lti/r;

    invoke-direct {p2, p1, v1}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object p2, p0, Lzi/k;->Z:Lti/r;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/k;->Z:Lti/r;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_11
    sget-object v0, Lqi/a0;->J:Ljava/lang/String;

    if-ne p2, v0, :cond_12

    iget-object p2, p0, Lzi/k;->L:Lti/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lej/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lwi/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lti/o;

    invoke-direct {v2, v0, p1, v1}, Lti/o;-><init>(Lej/b;Ld1/j;Lwi/b;)V

    invoke-virtual {p2, v2}, Lti/d;->j(Ld1/j;)V

    :cond_12
    return-void
.end method

.method public final i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    iget-object v1, v0, Lzi/k;->L:Lti/p;

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lwi/b;

    iget-object v10, v0, Lzi/k;->N:Lqi/i;

    iget-object v1, v10, Lqi/i;->f:Ljava/util/HashMap;

    iget-object v2, v9, Lwi/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lwi/c;

    if-nez v3, :cond_0

    return-void

    :cond_0
    iget-object v11, v3, Lwi/c;->c:Ljava/lang/String;

    iget-object v12, v3, Lwi/c;->a:Ljava/lang/String;

    invoke-virtual {v7}, Landroid/graphics/Canvas;->save()I

    invoke-virtual/range {p1 .. p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    const/4 v13, 0x0

    invoke-virtual {v0, v9, v8, v13}, Lzi/k;->q(Lwi/b;II)V

    iget-object v14, v0, Lzi/k;->M:Lqi/w;

    iget-object v1, v14, Lqi/w;->J:Ljava/util/Map;

    const-string v2, "\n"

    const-string v4, "\u0003"

    const-string v5, "\r"

    const-string v6, "\r\n"

    const/16 v16, 0x2

    const/16 v17, -0x1

    const/16 p4, 0x3

    iget-object v15, v0, Lzi/k;->V:Lti/h;

    const/high16 v18, 0x41200000    # 10.0f

    const/high16 v19, 0x42c80000    # 100.0f

    move/from16 v20, v13

    iget-object v13, v0, Lzi/k;->G:Lzi/i;

    move-object/from16 v21, v15

    iget-object v15, v0, Lzi/k;->H:Lzi/i;

    const/16 v22, 0x1

    move-object/from16 v23, v15

    if-nez v1, :cond_e

    iget-object v1, v14, Lqi/w;->w:Lqi/i;

    iget-object v1, v1, Lqi/i;->h:La0/g1;

    invoke-virtual {v1}, La0/g1;->g()I

    move-result v1

    if-lez v1, :cond_e

    iget-object v1, v0, Lzi/k;->Y:Lti/r;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_0

    :cond_1
    iget v1, v9, Lwi/b;->c:F

    :goto_0
    div-float v1, v1, v19

    sget-object v19, Ldj/i;->e:Lae3/d;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v19

    const/16 v24, 0x0

    move-object/from16 v15, v19

    check-cast v15, [F

    aput v24, v15, v20

    aput v24, v15, v22

    sget v19, Ldj/i;->f:F

    aput v19, v15, v16

    aput v19, v15, p4

    move/from16 v19, v1

    move-object/from16 v1, p2

    invoke-virtual {v1, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    aget v1, v15, v16

    aget v16, v15, v20

    sub-float v1, v1, v16

    aget v16, v15, p4

    aget v15, v15, v22

    sub-float v15, v16, v15

    move-object/from16 v26, v13

    move-object/from16 v25, v14

    float-to-double v13, v1

    move-object/from16 v27, v10

    move-object/from16 v28, v11

    float-to-double v10, v15

    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    iget-object v1, v9, Lwi/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v6, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    iget v1, v9, Lwi/b;->e:I

    int-to-float v1, v1

    div-float v1, v1, v18

    iget-object v2, v0, Lzi/k;->W:Lti/r;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_1
    add-float/2addr v1, v2

    :cond_2
    move v5, v1

    goto :goto_2

    :cond_3
    if-eqz v21, :cond_2

    invoke-virtual/range {v21 .. v21}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_1

    :goto_2
    move/from16 v13, v20

    :goto_3
    if-ge v13, v11, :cond_d

    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, v9, Lwi/b;->m:Landroid/graphics/PointF;

    if-nez v2, :cond_4

    move/from16 v2, v24

    goto :goto_4

    :cond_4
    iget v2, v2, Landroid/graphics/PointF;->x:F

    :goto_4
    const/4 v6, 0x1

    move/from16 v4, v19

    invoke-virtual/range {v0 .. v6}, Lzi/k;->w(Ljava/lang/String;FLwi/c;FFZ)Ljava/util/List;

    move-result-object v1

    move/from16 v2, v20

    :goto_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_c

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzi/j;

    add-int/lit8 v14, v17, 0x1

    invoke-virtual {v7}, Landroid/graphics/Canvas;->save()I

    iget v15, v6, Lzi/j;->b:F

    invoke-virtual {v0, v7, v9, v14, v15}, Lzi/k;->v(Landroid/graphics/Canvas;Lwi/b;IF)Z

    move-result v15

    if-eqz v15, :cond_b

    iget-object v6, v6, Lzi/j;->a:Ljava/lang/String;

    move-object/from16 p2, v1

    move/from16 v15, v20

    :goto_6
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v15, v1, :cond_a

    invoke-virtual {v6, v15}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move-object/from16 p4, v10

    move-object/from16 v10, v28

    invoke-static {v1, v12, v10}, Lwi/d;->a(CLjava/lang/String;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v2

    move/from16 v18, v5

    move-object/from16 v2, v27

    iget-object v5, v2, Lqi/i;->h:La0/g1;

    invoke-virtual {v5, v1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi/d;

    if-nez v1, :cond_5

    move-object/from16 v27, v2

    move-object/from16 v17, v6

    move/from16 v19, v11

    move/from16 v21, v13

    move/from16 v22, v14

    move-object/from16 v2, v23

    move-object/from16 v14, v25

    move-object/from16 v13, v26

    goto/16 :goto_b

    :cond_5
    invoke-virtual {v0, v9, v8, v15}, Lzi/k;->q(Lwi/b;II)V

    iget-object v5, v0, Lzi/k;->I:Ljava/util/HashMap;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    move-object/from16 v17, v6

    move/from16 v19, v11

    move/from16 v21, v13

    move/from16 v22, v14

    move-object/from16 v14, v25

    goto :goto_8

    :cond_6
    move-object/from16 v17, v6

    iget-object v6, v1, Lwi/d;->a:Ljava/util/ArrayList;

    move/from16 v19, v11

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v11

    move/from16 v21, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v22, v14

    move/from16 v14, v20

    :goto_7
    if-ge v14, v11, :cond_7

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v28, v6

    move-object/from16 v6, v27

    check-cast v6, Lyi/n;

    move/from16 v27, v11

    new-instance v11, Lsi/d;

    move/from16 v29, v14

    move-object/from16 v14, v25

    invoke-direct {v11, v14, v0, v6, v2}, Lsi/d;-><init>(Lqi/w;Lzi/b;Lyi/n;Lqi/i;)V

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v29, 0x1

    move/from16 v11, v27

    move v14, v6

    move-object/from16 v6, v28

    goto :goto_7

    :cond_7
    move-object/from16 v14, v25

    invoke-virtual {v5, v1, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v13

    :goto_8
    move/from16 v6, v20

    :goto_9
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-ge v6, v11, :cond_9

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lsi/d;

    invoke-virtual {v11}, Lsi/d;->getPath()Landroid/graphics/Path;

    move-result-object v11

    iget-object v13, v0, Lzi/k;->E:Landroid/graphics/RectF;

    move-object/from16 v27, v2

    move/from16 v2, v20

    invoke-virtual {v11, v13, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-object v2, v0, Lzi/k;->F:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    iget v13, v9, Lwi/b;->g:F

    neg-float v13, v13

    invoke-static {}, Ldj/i;->c()F

    move-result v25

    mul-float v13, v13, v25

    move-object/from16 v25, v5

    move/from16 v5, v24

    invoke-virtual {v2, v5, v13}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-virtual {v2, v4, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    invoke-virtual {v11, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-boolean v2, v9, Lwi/b;->k:Z

    if-eqz v2, :cond_8

    move-object/from16 v13, v26

    invoke-static {v11, v13, v7}, Lzi/k;->s(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    move-object/from16 v2, v23

    invoke-static {v11, v2, v7}, Lzi/k;->s(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_a

    :cond_8
    move-object/from16 v2, v23

    move-object/from16 v13, v26

    invoke-static {v11, v2, v7}, Lzi/k;->s(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    invoke-static {v11, v13, v7}, Lzi/k;->s(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    :goto_a
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v23, v2

    move-object/from16 v26, v13

    move-object/from16 v5, v25

    move-object/from16 v2, v27

    const/16 v20, 0x0

    const/16 v24, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v27, v2

    move-object/from16 v2, v23

    move-object/from16 v13, v26

    iget-wide v5, v1, Lwi/d;->c:D

    double-to-float v1, v5

    mul-float/2addr v1, v4

    invoke-static {}, Ldj/i;->c()F

    move-result v5

    mul-float/2addr v5, v1

    add-float v5, v5, v18

    const/4 v1, 0x0

    invoke-virtual {v7, v5, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :goto_b
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v23, v2

    move-object/from16 v28, v10

    move-object/from16 v26, v13

    move-object/from16 v25, v14

    move/from16 v2, v16

    move-object/from16 v6, v17

    move/from16 v5, v18

    move/from16 v11, v19

    move/from16 v13, v21

    move/from16 v14, v22

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v10, p4

    goto/16 :goto_6

    :cond_a
    :goto_c
    move/from16 v16, v2

    move/from16 v18, v5

    move-object/from16 p4, v10

    move/from16 v19, v11

    move/from16 v21, v13

    move/from16 v22, v14

    move-object/from16 v2, v23

    move-object/from16 v14, v25

    move-object/from16 v13, v26

    move-object/from16 v10, v28

    goto :goto_d

    :cond_b
    move-object/from16 p2, v1

    goto :goto_c

    :goto_d
    invoke-virtual {v7}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v1, v16, 0x1

    move-object/from16 v23, v2

    move-object/from16 v28, v10

    move-object/from16 v26, v13

    move-object/from16 v25, v14

    move/from16 v5, v18

    move/from16 v11, v19

    move/from16 v13, v21

    move/from16 v17, v22

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v10, p4

    move v2, v1

    move-object/from16 v1, p2

    goto/16 :goto_5

    :cond_c
    move/from16 v18, v5

    move-object/from16 p4, v10

    move/from16 v19, v11

    move/from16 v21, v13

    move-object/from16 v2, v23

    move-object/from16 v14, v25

    move-object/from16 v13, v26

    move-object/from16 v10, v28

    add-int/lit8 v1, v21, 0x1

    const/16 v20, 0x0

    const/16 v24, 0x0

    move-object/from16 v10, p4

    move v13, v1

    move/from16 v19, v4

    goto/16 :goto_3

    :cond_d
    move-object v15, v7

    goto/16 :goto_21

    :cond_e
    move-object v10, v11

    move-object/from16 v11, v23

    iget-object v1, v0, Lzi/k;->Z:Lti/r;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_f

    move-object/from16 v23, v2

    goto/16 :goto_13

    :cond_f
    iget-object v1, v14, Lqi/w;->J:Ljava/util/Map;

    if-eqz v1, :cond_12

    invoke-interface {v1, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    :goto_e
    move-object/from16 v23, v2

    goto/16 :goto_12

    :cond_10
    iget-object v15, v3, Lwi/c;->b:Ljava/lang/String;

    invoke-interface {v1, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_11

    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    goto :goto_e

    :cond_11
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v25, v14

    const-string v14, "-"

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v1, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    goto :goto_e

    :cond_12
    move-object/from16 v25, v14

    :cond_13
    invoke-virtual/range {v25 .. v25}, Lqi/w;->j()Lb30/m;

    move-result-object v1

    if-eqz v1, :cond_1b

    iget-object v14, v1, Lb30/m;->x:Ljava/lang/Object;

    check-cast v14, Lpg3/p;

    iput-object v12, v14, Lpg3/p;->x:Ljava/lang/Object;

    iput-object v10, v14, Lpg3/p;->y:Ljava/lang/Object;

    iget-object v15, v1, Lb30/m;->y:Ljava/lang/Object;

    check-cast v15, Ljava/util/HashMap;

    invoke-virtual {v15, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/graphics/Typeface;

    if-eqz v23, :cond_14

    move-object/from16 v1, v23

    goto :goto_e

    :cond_14
    iget-object v8, v1, Lb30/m;->z:Ljava/lang/Object;

    check-cast v8, Ljava/util/HashMap;

    invoke-virtual {v8, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/graphics/Typeface;

    if-eqz v23, :cond_15

    move-object/from16 v1, v23

    move-object/from16 v23, v2

    goto :goto_f

    :cond_15
    iget-object v7, v3, Lwi/c;->d:Landroid/graphics/Typeface;

    if-eqz v7, :cond_16

    move-object/from16 v23, v2

    move-object v1, v7

    goto :goto_f

    :cond_16
    new-instance v7, Ljava/lang/StringBuilder;

    move-object/from16 v23, v2

    const-string v2, "fonts/"

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lb30/m;->E:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/AssetManager;

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v8, v12, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_f
    const-string v2, "Italic"

    invoke-virtual {v10, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v7, "Bold"

    invoke-virtual {v10, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v2, :cond_17

    if-eqz v7, :cond_17

    move/from16 v2, p4

    goto :goto_10

    :cond_17
    if-eqz v2, :cond_18

    move/from16 v2, v16

    goto :goto_10

    :cond_18
    if-eqz v7, :cond_19

    move/from16 v2, v22

    goto :goto_10

    :cond_19
    const/4 v2, 0x0

    :goto_10
    invoke-virtual {v1}, Landroid/graphics/Typeface;->getStyle()I

    move-result v7

    if-ne v7, v2, :cond_1a

    goto :goto_11

    :cond_1a
    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    :goto_11
    invoke-virtual {v15, v14, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_1b
    move-object/from16 v23, v2

    const/4 v1, 0x0

    :goto_12
    if-eqz v1, :cond_1c

    goto :goto_13

    :cond_1c
    iget-object v1, v3, Lwi/c;->d:Landroid/graphics/Typeface;

    :goto_13
    if-nez v1, :cond_1e

    :cond_1d
    move-object/from16 v15, p1

    goto/16 :goto_21

    :cond_1e
    iget-object v2, v9, Lwi/b;->a:Ljava/lang/String;

    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v1, v0, Lzi/k;->Y:Lti/r;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_14

    :cond_1f
    iget v1, v9, Lwi/b;->c:F

    :goto_14
    invoke-static {}, Ldj/i;->c()F

    move-result v7

    mul-float/2addr v7, v1

    invoke-virtual {v13, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v13}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v7

    invoke-virtual {v11, v7}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {v13}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    invoke-virtual {v11, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    iget v7, v9, Lwi/b;->e:I

    int-to-float v7, v7

    div-float v7, v7, v18

    iget-object v8, v0, Lzi/k;->W:Lti/r;

    if-eqz v8, :cond_20

    invoke-virtual {v8}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    :goto_15
    add-float/2addr v7, v8

    goto :goto_16

    :cond_20
    if-eqz v21, :cond_21

    invoke-virtual/range {v21 .. v21}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    goto :goto_15

    :cond_21
    :goto_16
    invoke-static {}, Ldj/i;->c()F

    move-result v8

    mul-float/2addr v8, v7

    mul-float/2addr v8, v1

    div-float v8, v8, v19

    invoke-virtual {v2, v6, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v23

    invoke-virtual {v1, v2, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_17
    if-ge v12, v10, :cond_1d

    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, v9, Lwi/b;->m:Landroid/graphics/PointF;

    if-nez v2, :cond_22

    const/4 v2, 0x0

    goto :goto_18

    :cond_22
    iget v5, v2, Landroid/graphics/PointF;->x:F

    move v2, v5

    :goto_18
    const/4 v4, 0x0

    const/4 v6, 0x0

    move v5, v8

    invoke-virtual/range {v0 .. v6}, Lzi/k;->w(Ljava/lang/String;FLwi/c;FFZ)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    :goto_19
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_2b

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzi/j;

    add-int/lit8 v6, v17, 0x1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget-object v8, v4, Lzi/j;->a:Ljava/lang/String;

    invoke-virtual {v13, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v8

    move-object/from16 v15, p1

    invoke-virtual {v0, v15, v9, v6, v8}, Lzi/k;->v(Landroid/graphics/Canvas;Lwi/b;IF)Z

    move-result v8

    if-eqz v8, :cond_2a

    iget-object v8, v4, Lzi/j;->a:Ljava/lang/String;

    move-object/from16 p2, v1

    move/from16 v16, v2

    const/4 v1, 0x0

    :goto_1a
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_29

    invoke-virtual {v8, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v17

    add-int v17, v17, v1

    move/from16 p4, v17

    move/from16 v17, v1

    move/from16 v1, p4

    move-object/from16 p4, v3

    :goto_1b
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_24

    invoke-virtual {v8, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    move/from16 v18, v3

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->getType(I)I

    move-result v3

    move/from16 v19, v5

    const/16 v5, 0x10

    if-eq v3, v5, :cond_23

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->getType(I)I

    move-result v3

    const/16 v5, 0x1b

    if-eq v3, v5, :cond_23

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->getType(I)I

    move-result v3

    const/4 v5, 0x6

    if-eq v3, v5, :cond_23

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->getType(I)I

    move-result v3

    const/16 v5, 0x1c

    if-eq v3, v5, :cond_23

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->getType(I)I

    move-result v3

    const/16 v5, 0x8

    if-eq v3, v5, :cond_23

    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->getType(I)I

    move-result v3

    const/16 v5, 0x13

    if-ne v3, v5, :cond_25

    :cond_23
    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v1, v3

    mul-int/lit8 v2, v2, 0x1f

    add-int v2, v2, v18

    move/from16 v5, v19

    goto :goto_1b

    :cond_24
    move/from16 v19, v5

    :cond_25
    int-to-long v2, v2

    iget-object v5, v0, Lzi/k;->J:La0/y;

    invoke-virtual {v5, v2, v3}, La0/y;->b(J)Z

    move-result v18

    if-eqz v18, :cond_26

    invoke-virtual {v5, v2, v3}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move/from16 v18, v6

    move-object/from16 v21, v7

    goto :goto_1d

    :cond_26
    move/from16 v18, v6

    iget-object v6, v0, Lzi/k;->D:Ljava/lang/StringBuilder;

    move-object/from16 v21, v7

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    move/from16 v7, v17

    :goto_1c
    if-ge v7, v1, :cond_27

    move/from16 v22, v1

    invoke-virtual {v8, v7}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v7, v1

    move/from16 v1, v22

    goto :goto_1c

    :cond_27
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v2, v3, v1}, La0/y;->g(JLjava/lang/Object;)V

    :goto_1d
    add-int v2, v14, v17

    move/from16 v3, p3

    invoke-virtual {v0, v9, v3, v2}, Lzi/k;->q(Lwi/b;II)V

    iget-boolean v2, v9, Lwi/b;->k:Z

    if-eqz v2, :cond_28

    invoke-static {v1, v13, v15}, Lzi/k;->r(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    invoke-static {v1, v11, v15}, Lzi/k;->r(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_1e

    :cond_28
    invoke-static {v1, v11, v15}, Lzi/k;->r(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    invoke-static {v1, v13, v15}, Lzi/k;->r(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    :goto_1e
    invoke-virtual {v13, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    add-float v2, v2, v19

    const/4 v5, 0x0

    invoke-virtual {v15, v2, v5}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int v1, v1, v17

    move-object/from16 v3, p4

    move/from16 v6, v18

    move/from16 v5, v19

    move-object/from16 v7, v21

    goto/16 :goto_1a

    :cond_29
    :goto_1f
    move-object/from16 p4, v3

    move/from16 v19, v5

    move/from16 v18, v6

    move-object/from16 v21, v7

    const/4 v5, 0x0

    move/from16 v3, p3

    goto :goto_20

    :cond_2a
    move-object/from16 p2, v1

    move/from16 v16, v2

    goto :goto_1f

    :goto_20
    iget-object v1, v4, Lzi/j;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v14, v1

    invoke-virtual {v15}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v2, v16, 0x1

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move/from16 v17, v18

    move/from16 v5, v19

    move-object/from16 v7, v21

    goto/16 :goto_19

    :cond_2b
    move-object/from16 v15, p1

    move-object/from16 p4, v3

    move/from16 v19, v5

    move-object/from16 v21, v7

    const/4 v5, 0x0

    move/from16 v3, p3

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, p4

    move/from16 v8, v19

    goto/16 :goto_17

    :goto_21
    invoke-virtual {v15}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final q(Lwi/b;II)V
    .locals 6

    iget-object v0, p0, Lzi/k;->Q:Lti/r;

    iget-object v1, p0, Lzi/k;->G:Lzi/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzi/k;->P:Lti/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0, p3}, Lzi/k;->u(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_1
    iget v0, p1, Lwi/b;->h:I

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    iget-object v0, p0, Lzi/k;->S:Lti/r;

    iget-object v2, p0, Lzi/k;->H:Lzi/i;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lzi/k;->R:Lti/e;

    if-eqz v0, :cond_3

    invoke-virtual {p0, p3}, Lzi/k;->u(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_3
    iget v0, p1, Lwi/b;->i:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_1
    iget-object v0, p0, Lzi/b;->w:Lti/q;

    iget-object v0, v0, Lti/q;->j:Lti/d;

    const/16 v3, 0x64

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_2
    iget-object v4, p0, Lzi/k;->X:Lti/e;

    if-eqz v4, :cond_5

    invoke-virtual {p0, p3}, Lzi/k;->u(I)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_5
    int-to-float v0, v0

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float/2addr v0, v4

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v0, v5

    int-to-float v3, v3

    div-float/2addr v3, v5

    mul-float/2addr v3, v0

    int-to-float p2, p2

    mul-float/2addr v3, p2

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, Lzi/k;->U:Lti/r;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lti/r;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void

    :cond_6
    iget-object p2, p0, Lzi/k;->T:Lti/h;

    if-eqz p2, :cond_7

    invoke-virtual {p0, p3}, Lzi/k;->u(I)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p2}, Lti/d;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void

    :cond_7
    iget p1, p1, Lwi/b;->j:F

    invoke-static {}, Ldj/i;->c()F

    move-result p2

    mul-float/2addr p2, p1

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public final t(I)Lzi/j;
    .locals 4

    iget-object v0, p0, Lzi/k;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v1, p1, :cond_0

    new-instance v2, Lzi/j;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v3, ""

    iput-object v3, v2, Lzi/j;->a:Ljava/lang/String;

    const/4 v3, 0x0

    iput v3, v2, Lzi/j;->b:F

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzi/j;

    return-object p1
.end method

.method public final u(I)Z
    .locals 5

    iget-object v0, p0, Lzi/k;->L:Lti/p;

    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi/b;

    iget-object v0, v0, Lwi/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lzi/k;->a0:Lti/e;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lzi/k;->b0:Lti/e;

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, p0, Lzi/k;->c0:Lti/e;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v3, v2

    add-int/2addr v1, v2

    :cond_0
    iget v2, p0, Lzi/k;->O:I

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    if-lt p1, v3, :cond_2

    if-ge p1, v1, :cond_2

    goto :goto_0

    :cond_1
    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr p1, v0

    int-to-float v0, v3

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_2

    int-to-float v0, v1

    cmpg-float p1, p1, v0

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final v(Landroid/graphics/Canvas;Lwi/b;IF)Z
    .locals 6

    iget-object v0, p2, Lwi/b;->l:Landroid/graphics/PointF;

    iget-object v1, p2, Lwi/b;->m:Landroid/graphics/PointF;

    invoke-static {}, Ldj/i;->c()F

    move-result v2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    iget v4, p2, Lwi/b;->f:F

    mul-float/2addr v4, v2

    iget v5, v0, Landroid/graphics/PointF;->y:F

    add-float/2addr v4, v5

    :goto_0
    int-to-float p3, p3

    iget v5, p2, Lwi/b;->f:F

    mul-float/2addr p3, v5

    mul-float/2addr p3, v2

    add-float/2addr p3, v4

    iget-object v2, p0, Lzi/k;->M:Lqi/w;

    iget-boolean v2, v2, Lqi/w;->U:Z

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    iget v2, v0, Landroid/graphics/PointF;->y:F

    iget v4, v1, Landroid/graphics/PointF;->y:F

    add-float/2addr v2, v4

    iget v4, p2, Lwi/b;->c:F

    add-float/2addr v2, v4

    cmpl-float v2, p3, v2

    if-ltz v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    if-nez v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    iget v0, v0, Landroid/graphics/PointF;->x:F

    :goto_1
    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    iget v3, v1, Landroid/graphics/PointF;->x:F

    :goto_2
    iget p2, p2, Lwi/b;->d:I

    invoke-static {p2}, Le4/p;->e(I)I

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_6

    if-eq p2, v1, :cond_5

    const/4 v2, 0x2

    if-eq p2, v2, :cond_4

    return v1

    :cond_4
    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v3, p2

    add-float/2addr v3, v0

    div-float/2addr p4, p2

    sub-float/2addr v3, p4

    invoke-virtual {p1, v3, p3}, Landroid/graphics/Canvas;->translate(FF)V

    return v1

    :cond_5
    add-float/2addr v0, v3

    sub-float/2addr v0, p4

    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    return v1

    :cond_6
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    return v1
.end method

.method public final w(Ljava/lang/String;FLwi/c;FFZ)Ljava/util/List;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v3

    move v7, v5

    move v8, v7

    move v9, v8

    move v11, v9

    move v6, v4

    move v10, v6

    move v12, v10

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v5, v13, :cond_7

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-eqz p6, :cond_1

    iget-object v14, v2, Lwi/c;->a:Ljava/lang/String;

    iget-object v15, v2, Lwi/c;->c:Ljava/lang/String;

    invoke-static {v13, v14, v15}, Lwi/d;->a(CLjava/lang/String;Ljava/lang/String;)I

    move-result v14

    iget-object v15, v0, Lzi/k;->N:Lqi/i;

    iget-object v15, v15, Lqi/i;->h:La0/g1;

    invoke-virtual {v15, v14}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwi/d;

    if-nez v14, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-wide v14, v14, Lwi/d;->c:D

    double-to-float v14, v14

    mul-float v14, v14, p4

    invoke-static {}, Ldj/i;->c()F

    move-result v15

    mul-float/2addr v15, v14

    add-float v15, v15, p5

    goto :goto_1

    :cond_1
    add-int/lit8 v14, v5, 0x1

    invoke-virtual {v1, v5, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v0, Lzi/k;->G:Lzi/i;

    invoke-virtual {v15, v14}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v14

    add-float v15, v14, p5

    :goto_1
    const/16 v14, 0x20

    if-ne v13, v14, :cond_2

    const/4 v9, 0x1

    move v12, v15

    goto :goto_2

    :cond_2
    if-eqz v9, :cond_3

    move v9, v3

    move v11, v5

    move v10, v15

    goto :goto_2

    :cond_3
    add-float/2addr v10, v15

    :goto_2
    add-float/2addr v6, v15

    cmpl-float v16, p2, v4

    if-lez v16, :cond_6

    cmpl-float v16, v6, p2

    if-ltz v16, :cond_6

    if-ne v13, v14, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v0, v7}, Lzi/k;->t(I)Lzi/j;

    move-result-object v13

    if-ne v11, v8, :cond_5

    invoke-virtual {v1, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v11, v8

    int-to-float v8, v11

    mul-float/2addr v8, v12

    sub-float/2addr v6, v15

    sub-float/2addr v6, v8

    iput-object v10, v13, Lzi/j;->a:Ljava/lang/String;

    iput v6, v13, Lzi/j;->b:F

    move v8, v5

    move v11, v8

    move v6, v15

    move v10, v6

    goto :goto_3

    :cond_5
    add-int/lit8 v14, v11, -0x1

    invoke-virtual {v1, v8, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v15

    sub-int/2addr v8, v15

    int-to-float v8, v8

    mul-float/2addr v8, v12

    sub-float/2addr v6, v10

    sub-float/2addr v6, v8

    sub-float/2addr v6, v12

    iput-object v14, v13, Lzi/j;->a:Ljava/lang/String;

    iput v6, v13, Lzi/j;->b:F

    move v6, v10

    move v8, v11

    :cond_6
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_7
    cmpl-float v2, v6, v4

    if-lez v2, :cond_8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v0, v7}, Lzi/k;->t(I)Lzi/j;

    move-result-object v2

    invoke-virtual {v1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lzi/j;->a:Ljava/lang/String;

    iput v6, v2, Lzi/j;->b:F

    :cond_8
    iget-object v1, v0, Lzi/k;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v3, v7}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method
