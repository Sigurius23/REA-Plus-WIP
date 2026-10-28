.class public interface abstract Li61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li61/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0016\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0014\u0010\r\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u0008R\u0014\u0010\u0011\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0008R\u0014\u0010\u0015\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0008R\u0014\u0010\u0019\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0008R\u0014\u0010\u001b\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0008R\u0014\u0010\u001d\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0008R\u0014\u0010\u001f\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0008R\u0014\u0010!\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0010R\u0014\u0010#\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0010\u00a8\u0006$\u00c0\u0006\u0003"
    }
    d2 = {
        "Li61/b;",
        "",
        "Lj61/c;",
        "state",
        "Lh2/c;",
        "b",
        "(Lj61/c;)Lh2/c;",
        "c",
        "()Lh2/c;",
        "gridLineRect",
        "a",
        "contentRect",
        "k",
        "bottomHorizontalAxisRect",
        "",
        "n",
        "()F",
        "bottomHorizontalAxisSize",
        "g",
        "topHorizontalAxisRect",
        "i",
        "topHorizontalAxisSize",
        "f",
        "startVerticalAxisRect",
        "m",
        "endVerticalAxisRect",
        "e",
        "axisDescriptionRect",
        "h",
        "scrubberRect",
        "j",
        "scaledInsets",
        "d",
        "startVerticalAxisSize",
        "l",
        "endVerticalAxisSize",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lh2/c;
.end method

.method public b(Lj61/c;)Lh2/c;
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lj61/c;->d()Lj61/a;

    move-result-object p1

    sget-object v0, Li61/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    invoke-interface {p0}, Li61/b;->a()Lh2/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Lh2/c;

    invoke-interface {p0}, Li61/b;->d()F

    move-result v0

    invoke-interface {p0}, Li61/b;->j()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->a:F

    add-float/2addr v0, v3

    invoke-interface {p0}, Li61/b;->l()F

    move-result v3

    sub-float v3, v2, v3

    invoke-interface {p0}, Li61/b;->j()Lh2/c;

    move-result-object v4

    iget v4, v4, Lh2/c;->c:F

    sub-float/2addr v3, v4

    invoke-direct {p1, v0, v1, v3, v2}, Lh2/c;-><init>(FFFF)V

    return-object p1

    :cond_2
    new-instance p1, Lh2/c;

    invoke-interface {p0}, Li61/b;->i()F

    move-result v0

    invoke-interface {p0}, Li61/b;->j()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->b:F

    add-float/2addr v0, v3

    invoke-interface {p0}, Li61/b;->n()F

    move-result v3

    sub-float v3, v2, v3

    invoke-interface {p0}, Li61/b;->j()Lh2/c;

    move-result-object v4

    iget v4, v4, Lh2/c;->d:F

    sub-float/2addr v3, v4

    invoke-direct {p1, v1, v0, v2, v3}, Lh2/c;-><init>(FFFF)V

    return-object p1
.end method

.method public abstract c()Lh2/c;
.end method

.method public abstract d()F
.end method

.method public abstract e()Lh2/c;
.end method

.method public abstract f()Lh2/c;
.end method

.method public abstract g()Lh2/c;
.end method

.method public abstract h()Lh2/c;
.end method

.method public abstract i()F
.end method

.method public abstract j()Lh2/c;
.end method

.method public abstract k()Lh2/c;
.end method

.method public abstract l()F
.end method

.method public abstract m()Lh2/c;
.end method

.method public abstract n()F
.end method
