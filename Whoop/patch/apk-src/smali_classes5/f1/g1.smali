.class public final Lf1/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/g;

.field public final b:J

.field public final c:Ll3/r0;

.field public final d:Lq3/r;

.field public final e:Lf1/x1;

.field public f:J

.field public final g:Ll3/g;

.field public final h:Lq3/y;

.field public final i:Lu0/p1;


# direct methods
.method public constructor <init>(Lq3/y;Lq3/r;Lu0/p1;Lf1/x1;)V
    .locals 4

    iget-object v0, p1, Lq3/y;->a:Ll3/g;

    iget-wide v1, p1, Lq3/y;->b:J

    if-eqz p3, :cond_0

    iget-object v3, p3, Lu0/p1;->a:Ll3/r0;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf1/g1;->a:Ll3/g;

    iput-wide v1, p0, Lf1/g1;->b:J

    iput-object v3, p0, Lf1/g1;->c:Ll3/r0;

    iput-object p2, p0, Lf1/g1;->d:Lq3/r;

    iput-object p4, p0, Lf1/g1;->e:Lf1/x1;

    iput-wide v1, p0, Lf1/g1;->f:J

    iput-object v0, p0, Lf1/g1;->g:Ll3/g;

    iput-object p1, p0, Lf1/g1;->h:Lq3/y;

    iput-object p3, p0, Lf1/g1;->i:Lu0/p1;

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 5

    iget-wide v0, p0, Lf1/g1;->f:J

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq3/h;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance p1, Lq3/a;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lq3/a;-><init>(Ljava/lang/String;I)V

    new-instance v0, Lq3/x;

    iget-wide v2, p0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v2

    iget-wide v3, p0, Lf1/g1;->f:J

    invoke-static {v3, v4}, Ll3/u0;->f(J)I

    move-result v3

    invoke-direct {v0, v2, v3}, Lq3/x;-><init>(II)V

    const/4 v2, 0x2

    new-array v2, v2, [Lq3/h;

    aput-object p1, v2, v1

    const/4 p1, 0x1

    aput-object v0, v2, p1

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, Lf1/g1;->c:Ll3/r0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll3/r0;->b:Ll3/w;

    iget-wide v1, p0, Lf1/g1;->f:J

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result v1

    iget-object v2, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {v2, v1}, Lq3/r;->x(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll3/w;->d(I)I

    move-result v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Ll3/w;->c(IZ)I

    move-result v0

    invoke-interface {v2, v0}, Lq3/r;->n(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, Lf1/g1;->c:Ll3/r0;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lf1/g1;->f:J

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result v1

    iget-object v2, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {v2, v1}, Lq3/r;->x(I)I

    move-result v1

    iget-object v3, v0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v3, v1}, Ll3/w;->d(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll3/r0;->h(I)I

    move-result v0

    invoke-interface {v2, v0}, Lq3/r;->n(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 6

    iget-object v0, p0, Lf1/g1;->c:Ll3/r0;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lf1/g1;->r()I

    move-result v1

    :goto_0
    iget-object v2, p0, Lf1/g1;->a:Ll3/g;

    iget-object v3, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_0

    iget-object v0, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Ll3/r0;->k(I)J

    move-result-wide v2

    sget v4, Ll3/u0;->c:I

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    if-gt v2, v1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {v0, v2}, Lq3/r;->n(I)I

    move-result v0

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 5

    iget-object v0, p0, Lf1/g1;->c:Ll3/r0;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lf1/g1;->r()I

    move-result v1

    :goto_0
    if-gtz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Lf1/g1;->g:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Ll3/r0;->k(I)J

    move-result-wide v2

    sget v4, Ll3/u0;->c:I

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    if-lt v2, v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {v0, v2}, Lq3/r;->n(I)I

    move-result v0

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lf1/g1;->c:Ll3/r0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf1/g1;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Ll3/r0;->i(I)Lw3/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lw3/j;->x:Lw3/j;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final g(Ll3/r0;I)I
    .locals 6

    invoke-virtual {p0}, Lf1/g1;->r()I

    move-result v0

    iget-object v1, p0, Lf1/g1;->e:Lf1/x1;

    iget-object v2, v1, Lf1/x1;->a:Ljava/lang/Float;

    if-nez v2, :cond_0

    invoke-virtual {p1, v0}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v2

    iget v2, v2, Lh2/c;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, v1, Lf1/x1;->a:Ljava/lang/Float;

    :cond_0
    iget-object v2, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v2, v0}, Ll3/w;->d(I)I

    move-result v0

    add-int/2addr v0, p2

    if-gez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget p2, v2, Ll3/w;->f:I

    if-lt v0, p2, :cond_2

    iget-object p1, p0, Lf1/g1;->g:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {v2, v0}, Ll3/w;->b(I)F

    move-result p2

    const/4 v3, 0x1

    int-to-float v4, v3

    sub-float/2addr p2, v4

    iget-object v1, v1, Lf1/x1;->a:Ljava/lang/Float;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {p0}, Lf1/g1;->f()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v0}, Ll3/r0;->g(I)F

    move-result v5

    cmpl-float v5, v4, v5

    if-gez v5, :cond_4

    :cond_3
    invoke-virtual {p0}, Lf1/g1;->f()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {p1, v0}, Ll3/r0;->f(I)F

    move-result p1

    cmpg-float p1, v4, p1

    if-gtz p1, :cond_5

    :cond_4
    invoke-virtual {v2, v0, v3}, Ll3/w;->c(IZ)I

    move-result p1

    return p1

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 v3, 0x20

    shl-long/2addr v0, v3

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    or-long/2addr p1, v0

    invoke-virtual {v2, p1, p2}, Ll3/w;->g(J)I

    move-result p1

    iget-object p2, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {p2, p1}, Lq3/r;->n(I)I

    move-result p1

    return p1
.end method

.method public final h(Lu0/p1;I)I
    .locals 8

    iget-object v0, p1, Lu0/p1;->b:Ly2/y;

    iget-object v1, p1, Lu0/p1;->a:Ll3/r0;

    if-eqz v0, :cond_1

    iget-object p1, p1, Lu0/p1;->c:Ly2/y;

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v2}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Lh2/c;->e:Lh2/c;

    :cond_2
    iget-object v0, p0, Lf1/g1;->h:Lq3/y;

    iget-wide v2, v0, Lq3/y;->b:J

    sget v0, Ll3/u0;->c:I

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v0, v2

    iget-object v2, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {v2, v0}, Lq3/r;->x(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v0

    iget v3, v0, Lh2/c;->a:F

    iget v0, v0, Lh2/c;->b:F

    invoke-virtual {p1}, Lh2/c;->e()J

    move-result-wide v6

    and-long/2addr v6, v4

    long-to-int p1, v6

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    int-to-float p2, p2

    mul-float/2addr p1, p2

    add-float/2addr p1, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v6, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 v0, 0x20

    shl-long/2addr v6, v0

    and-long/2addr p1, v4

    or-long/2addr p1, v6

    iget-object v0, v1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1, p2}, Ll3/w;->g(J)I

    move-result p1

    invoke-interface {v2, p1}, Lq3/r;->n(I)I

    move-result p1

    return p1
.end method

.method public final i()V
    .locals 5

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, p0, Lf1/g1;->g:Ll3/g;

    iget-object v3, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {p0}, Lf1/g1;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lf1/g1;->k()V

    return-void

    :cond_0
    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, v2, Ll3/g;->x:Ljava/lang/String;

    iget-wide v1, p0, Lf1/g1;->f:J

    sget v3, Ll3/u0;->c:I

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1, v0}, Lu0/n0;->m(ILjava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v0, v0}, Lf1/g1;->q(II)V

    :cond_1
    return-void
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lf1/g1;->g:Ll3/g;

    iget-object v1, v0, Ll3/g;->x:Ljava/lang/String;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    iget-wide v1, p0, Lf1/g1;->f:J

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result v1

    invoke-static {v1, v0}, Lu0/n0;->n(ILjava/lang/CharSequence;)I

    move-result v1

    iget-wide v2, p0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1, v0}, Lu0/n0;->n(ILjava/lang/CharSequence;)I

    move-result v1

    :cond_0
    invoke-virtual {p0, v1, v1}, Lf1/g1;->q(II)V

    :cond_1
    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lf1/g1;->g:Ll3/g;

    iget-object v1, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    iget-wide v1, p0, Lf1/g1;->f:J

    sget v3, Ll3/u0;->c:I

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1, v0}, Lu0/n0;->p(ILjava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0, v0}, Lf1/g1;->q(II)V

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lf1/g1;->g:Ll3/g;

    iget-object v1, v0, Ll3/g;->x:Ljava/lang/String;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    iget-wide v1, p0, Lf1/g1;->f:J

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result v1

    invoke-static {v1, v0}, Lu0/n0;->o(ILjava/lang/CharSequence;)I

    move-result v1

    iget-wide v2, p0, Lf1/g1;->f:J

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v2

    if-ne v1, v2, :cond_0

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, v0}, Lu0/n0;->o(ILjava/lang/CharSequence;)I

    move-result v1

    :cond_0
    invoke-virtual {p0, v1, v1}, Lf1/g1;->q(II)V

    :cond_1
    return-void
.end method

.method public final m()V
    .locals 5

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v2, p0, Lf1/g1;->g:Ll3/g;

    iget-object v3, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {p0}, Lf1/g1;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, v2, Ll3/g;->x:Ljava/lang/String;

    iget-wide v1, p0, Lf1/g1;->f:J

    sget v3, Ll3/u0;->c:I

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1, v0}, Lu0/n0;->m(ILjava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v0, v0}, Lf1/g1;->q(II)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lf1/g1;->k()V

    :cond_1
    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lf1/g1;->g:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lf1/g1;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v0}, Lf1/g1;->q(II)V

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lf1/g1;->e:Lf1/x1;

    const/4 v1, 0x0

    iput-object v1, v0, Lf1/x1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lf1/g1;->g:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lf1/g1;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v0}, Lf1/g1;->q(II)V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 5

    iget-object v0, p0, Lf1/g1;->g:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, Ll3/u0;->c:I

    const/16 v0, 0x20

    iget-wide v1, p0, Lf1/g1;->b:J

    shr-long v0, v1, v0

    long-to-int v0, v0

    iget-wide v1, p0, Lf1/g1;->f:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v0, v1}, Lj93/l0;->f(II)J

    move-result-wide v0

    iput-wide v0, p0, Lf1/g1;->f:J

    :cond_0
    return-void
.end method

.method public final q(II)V
    .locals 0

    invoke-static {p1, p2}, Lj93/l0;->f(II)J

    move-result-wide p1

    iput-wide p1, p0, Lf1/g1;->f:J

    return-void
.end method

.method public final r()I
    .locals 4

    iget-wide v0, p0, Lf1/g1;->f:J

    sget v2, Ll3/u0;->c:I

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lf1/g1;->d:Lq3/r;

    invoke-interface {v1, v0}, Lq3/r;->x(I)I

    move-result v0

    return v0
.end method
