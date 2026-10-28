.class public final Ln0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/k2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lh0/k2;

.field public final synthetic c:Lh0/x2;


# direct methods
.method public synthetic constructor <init>(Lh0/k2;Lh0/x2;I)V
    .locals 0

    iput p3, p0, Ln0/r;->a:I

    iput-object p2, p0, Ln0/r;->c:Lh0/x2;

    iput-object p1, p0, Ln0/r;->b:Lh0/k2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 1

    iget v0, p0, Ln0/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/r;->b:Lh0/k2;

    invoke-interface {v0, p1}, Lh0/k2;->a(F)F

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ln0/r;->b:Lh0/k2;

    invoke-interface {v0, p1}, Lh0/k2;->a(F)F

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)I
    .locals 11

    iget v0, p0, Ln0/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0}, Lq0/y;->o()I

    move-result v1

    mul-int/2addr v1, p1

    int-to-float p1, v1

    iget-object v1, v0, Lq0/y;->d:Ll9/o;

    iget-object v1, v1, Ll9/o;->d:Ljava/lang/Object;

    check-cast v1, Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-virtual {v0}, Lq0/y;->o()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sub-float/2addr p1, v1

    const/4 v1, 0x0

    int-to-float v1, v1

    add-float/2addr p1, v1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-static {v0}, Le4/a;->t(Lq0/y;)J

    move-result-wide v1

    int-to-long v3, p1

    add-long v5, v1, v3

    iget-wide v7, v0, Lq0/y;->h:J

    iget-wide v9, v0, Lq0/y;->g:J

    invoke-static/range {v5 .. v10}, Le93/b;->p(JJJ)J

    move-result-wide v1

    invoke-static {v0}, Le4/a;->t(Lq0/y;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    long-to-int p1, v1

    return p1

    :pswitch_0
    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v1, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Ln0/r;->c()I

    move-result v1

    invoke-virtual {p0}, Ln0/r;->e()I

    move-result v3

    if-gt p1, v3, :cond_3

    if-gt v1, p1, :cond_3

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ln0/g;

    check-cast v5, Ln0/o;

    iget v5, v5, Ln0/o;->a:I

    if-ne v5, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Ln0/g;

    if-eqz v4, :cond_4

    check-cast v4, Ln0/o;

    iget v2, v4, Ln0/o;->o:I

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lse/a;->k0(Ln0/n;)I

    move-result v0

    invoke-virtual {p0}, Ln0/r;->c()I

    move-result v1

    sub-int/2addr p1, v1

    mul-int/2addr p1, v0

    invoke-virtual {p0}, Ln0/r;->d()I

    move-result v0

    sub-int v2, p1, v0

    :cond_4
    :goto_2
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Ln0/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    iget v0, v0, Lq0/y;->e:I

    return v0

    :pswitch_0
    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    iget-object v0, v0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ln0/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    iget v0, v0, Lq0/y;->f:I

    return v0

    :pswitch_0
    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    iget-object v0, v0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ln0/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    iget-object v0, v0, Lq0/q;->a:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/d;

    iget v0, v0, Lq0/d;->a:I

    return v0

    :pswitch_0
    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    if-eqz v0, :cond_0

    check-cast v0, Ln0/o;

    iget v0, v0, Ln0/o;->a:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(II)V
    .locals 2

    iget v0, p0, Ln0/r;->a:I

    packed-switch v0, :pswitch_data_0

    int-to-float p2, p2

    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-virtual {v0}, Lq0/y;->o()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr p2, v1

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p1, v1}, Lq0/y;->w(FIZ)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ln0/r;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    invoke-virtual {v0, p1, p2}, Ln0/u;->k(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
