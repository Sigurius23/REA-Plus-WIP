.class public final Lcom/google/accompanist/drawablepainter/DrawablePainter;
.super Ln2/a;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/google/accompanist/drawablepainter/DrawablePainter;",
        "Ln2/a;",
        "Lp1/z1;",
        "drawablepainter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Landroid/graphics/drawable/Drawable;

.field public final F:Lp1/k1;

.field public final G:Lp1/k1;

.field public final H:Ll83/p;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    const-string v0, "drawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ln2/a;-><init>()V

    iput-object p1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->F:Lp1/k1;

    sget-object v1, Lzl/c;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2}, Ljc/x;->b(FF)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    :goto_0
    new-instance v3, Lh2/e;

    invoke-direct {v3, v1, v2}, Lh2/e;-><init>(J)V

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->G:Lp1/k1;

    new-instance v1, La3/l0;

    const/16 v2, 0x1a

    invoke-direct {v1, p0, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->H:Ll83/p;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->H:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable$Callback;

    iget-object v1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    instance-of v0, v1, Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_0

    check-cast v1, Landroid/graphics/drawable/Animatable;

    invoke-interface {v1}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_0
    return-void
.end method

.method public final b(F)V
    .locals 2

    const/16 v0, 0xff

    int-to-float v1, v0

    mul-float/2addr p1, v1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Le93/b;->n(III)I

    move-result p1

    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public final c()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/accompanist/drawablepainter/DrawablePainter;->d()V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/Animatable;

    invoke-interface {v1}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void
.end method

.method public final e(Li2/y;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Li2/y;->a:Landroid/graphics/ColorFilter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final f(Ly3/m;)V
    .locals 1

    const-string v0, "layoutDirection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object p1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    return-void
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->G:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/e;

    iget-wide v0, v0, Lh2/e;->a:J

    return-wide v0
.end method

.method public final i(Lk2/e;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object v0

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v0

    iget-object v1, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->F:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Lh2/e;->e(J)F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    invoke-interface {p1}, Lk2/e;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Lh2/e;->c(J)F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    iget-object v2, p0, Lcom/google/accompanist/drawablepainter/DrawablePainter;->E:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3, v1, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :try_start_0
    invoke-interface {v0}, Li2/v;->q()V

    invoke-static {v0}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Li2/v;->g()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Li2/v;->g()V

    throw p1
.end method
