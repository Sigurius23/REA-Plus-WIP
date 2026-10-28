.class public final Ll3/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/q0;

.field public final b:Ll3/w;

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll3/q0;Ll3/w;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/r0;->a:Ll3/q0;

    iput-object p2, p0, Ll3/r0;->b:Ll3/w;

    iput-wide p3, p0, Ll3/r0;->c:J

    iget-object p1, p2, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move p3, p4

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v0, v0, Ll3/y;->a:Ll3/a;

    iget-object v0, v0, Ll3/a;->d:Lm3/m;

    invoke-virtual {v0, p3}, Lm3/m;->d(I)F

    move-result p3

    :goto_0
    iput p3, p0, Ll3/r0;->d:F

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/y;

    iget-object p3, p1, Ll3/y;->a:Ll3/a;

    iget-object p3, p3, Ll3/a;->d:Lm3/m;

    iget p4, p3, Lm3/m;->g:I

    add-int/lit8 p4, p4, -0x1

    invoke-virtual {p3, p4}, Lm3/m;->d(I)F

    move-result p3

    iget p1, p1, Ll3/y;->f:F

    add-float p4, p3, p1

    :goto_1
    iput p4, p0, Ll3/r0;->e:F

    iget-object p1, p2, Ll3/w;->g:Ljava/util/ArrayList;

    iput-object p1, p0, Ll3/r0;->f:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(I)Lw3/j;
    .locals 2

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v1, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ll3/w;->l(I)V

    iget-object v0, v0, Ll3/w;->a:Laa3/i1;

    iget-object v0, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Ll3/s;->c(ILjava/util/List;)I

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    invoke-virtual {v0, p1}, Ll3/y;->d(I)I

    move-result p1

    iget-object v0, v1, Ll3/a;->d:Lm3/m;

    iget-object v0, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lw3/j;->x:Lw3/j;

    return-object p1

    :cond_1
    sget-object p1, Lw3/j;->w:Lw3/j;

    return-object p1
.end method

.method public final b(I)Lh2/c;
    .locals 9

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->k(I)V

    iget-object v0, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll3/s;->c(ILjava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    invoke-virtual {v0, p1}, Ll3/y;->d(I)I

    move-result p1

    iget-object v2, v1, Ll3/a;->e:Ljava/lang/CharSequence;

    if-ltz p1, :cond_0

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge p1, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "offset("

    const-string v4, ") is out of bounds [0,"

    invoke-static {p1, v3, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v1, v1, Ll3/a;->d:Lm3/m;

    iget-object v2, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v3

    invoke-virtual {v1, v3}, Lm3/m;->g(I)F

    move-result v4

    invoke-virtual {v1, v3}, Lm3/m;->e(I)F

    move-result v5

    invoke-virtual {v2, v3}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v3, v6, :cond_1

    move v3, v6

    goto :goto_1

    :cond_1
    move v3, v7

    :goto_1
    invoke-virtual {v2, p1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v2

    if-eqz v3, :cond_2

    if-nez v2, :cond_2

    invoke-virtual {v1, p1, v7}, Lm3/m;->h(IZ)F

    move-result v2

    add-int/2addr p1, v6

    invoke-virtual {v1, p1, v6}, Lm3/m;->h(IZ)F

    move-result p1

    goto :goto_3

    :cond_2
    if-eqz v3, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {v1, p1, v7}, Lm3/m;->i(IZ)F

    move-result v2

    add-int/2addr p1, v6

    invoke-virtual {v1, p1, v6}, Lm3/m;->i(IZ)F

    move-result p1

    :goto_2
    move v8, v2

    move v2, p1

    move p1, v8

    goto :goto_3

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v1, p1, v7}, Lm3/m;->h(IZ)F

    move-result v2

    add-int/2addr p1, v6

    invoke-virtual {v1, p1, v6}, Lm3/m;->h(IZ)F

    move-result p1

    goto :goto_2

    :cond_4
    invoke-virtual {v1, p1, v7}, Lm3/m;->i(IZ)F

    move-result v2

    add-int/2addr p1, v6

    invoke-virtual {v1, p1, v6}, Lm3/m;->i(IZ)F

    move-result p1

    :goto_3
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v2, v4, p1, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance p1, Lh2/c;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v3, v1, Landroid/graphics/RectF;->top:F

    iget v4, v1, Landroid/graphics/RectF;->right:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p1, v2, v3, v4, v1}, Lh2/c;-><init>(FFFF)V

    invoke-virtual {v0, p1}, Ll3/y;->a(Lh2/c;)Lh2/c;

    move-result-object p1

    return-object p1
.end method

.method public final c(I)Lh2/c;
    .locals 5

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v1, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ll3/w;->l(I)V

    iget-object v0, v0, Ll3/w;->a:Laa3/i1;

    iget-object v0, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Ll3/s;->c(ILjava/util/List;)I

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    invoke-virtual {v0, p1}, Ll3/y;->d(I)I

    move-result p1

    iget-object v2, v1, Ll3/a;->e:Ljava/lang/CharSequence;

    iget-object v1, v1, Ll3/a;->d:Lm3/m;

    if-ltz p1, :cond_1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-gt p1, v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "offset("

    const-string v4, ") is out of bounds [0,"

    invoke-static {p1, v3, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_1
    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lm3/m;->h(IZ)F

    move-result v2

    iget-object v3, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v3, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    new-instance v3, Lh2/c;

    invoke-virtual {v1, p1}, Lm3/m;->g(I)F

    move-result v4

    invoke-virtual {v1, p1}, Lm3/m;->e(I)F

    move-result p1

    invoke-direct {v3, v2, v4, v2, p1}, Lh2/c;-><init>(FFFF)V

    invoke-virtual {v0, v3}, Ll3/y;->a(Lh2/c;)Lh2/c;

    move-result-object p1

    return-object p1
.end method

.method public final d()Z
    .locals 5

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-boolean v1, v0, Ll3/w;->c:Z

    if-nez v1, :cond_1

    iget-wide v1, p0, Ll3/r0;->c:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    int-to-float v1, v1

    iget v0, v0, Ll3/w;->e:F

    cmpg-float v0, v1, v0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Z
    .locals 3

    iget-wide v0, p0, Ll3/r0;->c:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    iget-object v1, p0, Ll3/r0;->b:Ll3/w;

    iget v1, v1, Ll3/w;->d:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll3/r0;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ll3/r0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ll3/r0;

    iget-object v0, p1, Ll3/r0;->a:Ll3/q0;

    iget-object v1, p0, Ll3/r0;->a:Ll3/q0;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v0, p0, Ll3/r0;->c:J

    iget-wide v2, p1, Ll3/r0;->c:J

    invoke-static {v0, v1, v2, v3}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget v0, p0, Ll3/r0;->d:F

    iget v1, p1, Ll3/r0;->d:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_6

    iget v0, p0, Ll3/r0;->e:F

    iget v1, p1, Ll3/r0;->e:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_6

    iget-object v0, p0, Ll3/r0;->f:Ljava/util/ArrayList;

    iget-object p1, p1, Ll3/r0;->f:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final f(I)F
    .locals 3

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->m(I)V

    iget-object v0, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll3/s;->d(ILjava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    iget v0, v0, Ll3/y;->d:I

    sub-int/2addr p1, v0

    iget-object v0, v1, Ll3/a;->d:Lm3/m;

    iget-object v1, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    iget v2, v0, Lm3/m;->g:I

    add-int/lit8 v2, v2, -0x1

    if-ne p1, v2, :cond_0

    iget p1, v0, Lm3/m;->j:F

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-float/2addr v1, p1

    return v1
.end method

.method public final g(I)F
    .locals 3

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->m(I)V

    iget-object v0, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll3/s;->d(ILjava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    iget v0, v0, Ll3/y;->d:I

    sub-int/2addr p1, v0

    iget-object v0, v1, Ll3/a;->d:Lm3/m;

    iget-object v1, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    iget v2, v0, Lm3/m;->g:I

    add-int/lit8 v2, v2, -0x1

    if-ne p1, v2, :cond_0

    iget p1, v0, Lm3/m;->k:F

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-float/2addr v1, p1

    return v1
.end method

.method public final h(I)I
    .locals 3

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->m(I)V

    iget-object v0, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll3/s;->d(ILjava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    iget v2, v0, Ll3/y;->d:I

    sub-int/2addr p1, v2

    iget-object v1, v1, Ll3/a;->d:Lm3/m;

    iget-object v1, v1, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    iget v0, v0, Ll3/y;->b:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Ll3/r0;->a:Ll3/q0;

    invoke-virtual {v0}, Ll3/q0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Ll3/r0;->c:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Ll3/r0;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Ll3/r0;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Ll3/r0;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(I)Lw3/j;
    .locals 2

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v1, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ll3/w;->l(I)V

    iget-object v0, v0, Ll3/w;->a:Laa3/i1;

    iget-object v0, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Ll3/s;->c(ILjava/util/List;)I

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    invoke-virtual {v0, p1}, Ll3/y;->d(I)I

    move-result p1

    iget-object v0, v1, Ll3/a;->d:Lm3/m;

    iget-object v1, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    iget-object v0, v0, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    sget-object p1, Lw3/j;->w:Lw3/j;

    return-object p1

    :cond_1
    sget-object p1, Lw3/j;->x:Lw3/j;

    return-object p1
.end method

.method public final j(II)Li2/j;
    .locals 6

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v1, v0, Ll3/w;->a:Laa3/i1;

    iget-object v1, v1, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Ll3/g;

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    iget-object v2, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-gt p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, ") or End("

    const-string v3, ") is out of range [0.."

    const-string v4, "Start("

    invoke-static {p1, p2, v4, v2, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "), or start > end!"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    if-ne p1, p2, :cond_1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    iget-object v0, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lj93/l0;->f(II)J

    move-result-wide v2

    new-instance v4, Ld62/f;

    const/4 v5, 0x2

    invoke-direct {v4, v1, p1, p2, v5}, Ld62/f;-><init>(Ljava/lang/Object;III)V

    invoke-static {v0, v2, v3, v4}, Ll3/s;->f(Ljava/util/ArrayList;JLkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public final k(I)J
    .locals 3

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v1, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ll3/w;->l(I)V

    iget-object v0, v0, Ll3/w;->a:Laa3/i1;

    iget-object v0, v0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Ll3/s;->c(ILjava/util/List;)I

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v1, v0, Ll3/y;->a:Ll3/a;

    invoke-virtual {v0, p1}, Ll3/y;->d(I)I

    move-result p1

    iget-object v1, v1, Ll3/a;->d:Lm3/m;

    invoke-virtual {v1}, Lm3/m;->j()Lcom/google/android/material/textfield/p;

    move-result-object v1

    invoke-static {v1, p1}, Lug/m;->F(Lcom/google/android/material/textfield/p;I)I

    move-result v2

    invoke-static {v1, p1}, Lug/m;->E(Lcom/google/android/material/textfield/p;I)I

    move-result p1

    invoke-static {v2, p1}, Lj93/l0;->f(II)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1}, Ll3/y;->b(JZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final l(I)Z
    .locals 2

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->m(I)V

    iget-object v0, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll3/s;->d(ILjava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/y;

    iget-object v0, v0, Ll3/y;->a:Ll3/a;

    iget-object v0, v0, Ll3/a;->d:Lm3/m;

    iget-object v0, v0, Lm3/m;->f:Landroid/text/Layout;

    sget-object v1, Lm3/n;->a:Lm3/l;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextLayoutResult(layoutInput="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll3/r0;->a:Ll3/q0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", multiParagraph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/r0;->c:J

    invoke-static {v1, v2}, Ly3/l;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firstBaseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/r0;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", lastBaseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll3/r0;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderRects="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/r0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
