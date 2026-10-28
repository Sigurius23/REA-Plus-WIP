.class public abstract Lu2/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/StackTraceElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    sput-object v0, Lu2/d0;->a:[Ljava/lang/StackTraceElement;

    return-void
.end method

.method public static final a(ZZZ)I
    .locals 0

    shl-int/lit8 p1, p1, 0x1

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x2

    or-int/2addr p0, p1

    return p0
.end method

.method public static final b(Lu2/r;)Z
    .locals 1

    invoke-virtual {p0}, Lu2/r;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lu2/r;->h:Z

    if-nez v0, :cond_0

    iget-boolean p0, p0, Lu2/r;->d:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Lu2/r;)Z
    .locals 1

    iget-boolean v0, p0, Lu2/r;->h:Z

    if-nez v0, :cond_0

    iget-boolean p0, p0, Lu2/r;->d:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final d(Lu2/r;)Z
    .locals 1

    invoke-virtual {p0}, Lu2/r;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lu2/r;->h:Z

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Lu2/r;->d:Z

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(Lu2/r;)Z
    .locals 1

    iget-boolean v0, p0, Lu2/r;->h:Z

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Lu2/r;->d:Z

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final f(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final g(Lu2/r;J)Z
    .locals 7

    iget-wide v0, p0, Lu2/r;->c:J

    const/16 p0, 0x20

    shr-long v2, v0, p0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    shr-long v5, p1, p0

    long-to-int p0, v5

    and-long/2addr p1, v3

    long-to-int p1, p1

    const/4 p2, 0x0

    cmpg-float v1, v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    int-to-float p0, p0

    cmpl-float p0, v2, p0

    if-lez p0, :cond_1

    move p0, v4

    goto :goto_1

    :cond_1
    move p0, v3

    :goto_1
    or-int/2addr p0, v1

    cmpg-float p2, v0, p2

    if-gez p2, :cond_2

    move p2, v4

    goto :goto_2

    :cond_2
    move p2, v3

    :goto_2
    or-int/2addr p0, p2

    int-to-float p1, p1

    cmpl-float p1, v0, p1

    if-lez p1, :cond_3

    move v3, v4

    :cond_3
    or-int/2addr p0, v3

    return p0
.end method

.method public static final h(Lu2/r;JJ)Z
    .locals 10

    iget v0, p0, Lu2/r;->i:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-wide v3, p0, Lu2/r;->c:J

    const/16 p0, 0x20

    shr-long v5, v3, p0

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    const-wide v6, 0xffffffffL

    and-long/2addr v3, v6

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    shr-long v8, p3, p0

    long-to-int v4, v8

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    int-to-float v0, v0

    mul-float/2addr v4, v0

    shr-long v8, p1, p0

    long-to-int p0, v8

    int-to-float p0, p0

    add-float/2addr p0, v4

    and-long/2addr p3, v6

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    mul-float/2addr p3, v0

    and-long/2addr p1, v6

    long-to-int p1, p1

    int-to-float p1, p1

    add-float/2addr p1, p3

    neg-float p2, v4

    cmpg-float p2, v5, p2

    if-gez p2, :cond_1

    move p2, v2

    goto :goto_1

    :cond_1
    move p2, v1

    :goto_1
    cmpl-float p0, v5, p0

    if-lez p0, :cond_2

    move p0, v2

    goto :goto_2

    :cond_2
    move p0, v1

    :goto_2
    or-int/2addr p0, p2

    neg-float p2, p3

    cmpg-float p2, v3, p2

    if-gez p2, :cond_3

    move p2, v2

    goto :goto_3

    :cond_3
    move p2, v1

    :goto_3
    or-int/2addr p0, p2

    cmpl-float p1, v3, p1

    if-lez p1, :cond_4

    move v1, v2

    :cond_4
    or-int/2addr p0, v1

    return p0
.end method

.method public static i(Landroidx/compose/ui/Modifier;Lu2/a;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;-><init>(Lu2/a;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Lb4/l;)Landroidx/compose/ui/Modifier;
    .locals 4

    new-instance v0, Lu2/y;

    invoke-direct {v0}, Lu2/y;-><init>()V

    new-instance v1, Lb4/e;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lb4/e;-><init>(Lb4/l;I)V

    iput-object v1, v0, Lu2/y;->w:Lb4/e;

    new-instance v1, Ls;

    invoke-direct {v1}, Ls;-><init>()V

    iget-object v2, v0, Lu2/y;->x:Ls;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    iput-object v3, v2, Ls;->x:Ljava/lang/Object;

    :cond_0
    iput-object v1, v0, Lu2/y;->x:Ls;

    iput-object v0, v1, Ls;->x:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lb4/l;->setOnRequestDisallowInterceptTouchEvent$ui_release(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lu2/r;Z)J
    .locals 4

    iget-wide v0, p0, Lu2/r;->g:J

    iget-wide v2, p0, Lu2/r;->c:J

    invoke-static {v2, v3, v0, v1}, Lh2/b;->g(JJ)J

    move-result-wide v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lu2/r;->l()Z

    move-result p0

    if-eqz p0, :cond_0

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_0
    return-wide v0
.end method

.method public static final l(Lu2/r;)Z
    .locals 4

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lh2/b;->c(JJ)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final m(Lu2/r;)Z
    .locals 5

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Lh2/b;->c(JJ)Z

    move-result p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public static final n(Lu2/k;JLkotlin/jvm/functions/Function1;Z)V
    .locals 4

    iget-object p0, p0, Lu2/k;->b:Lf1/p1;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lf1/p1;->l()Landroid/view/MotionEvent;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz p4, :cond_1

    const/4 p4, 0x3

    invoke-virtual {p0, p4}, Landroid/view/MotionEvent;->setAction(I)V

    :cond_1
    const/16 p4, 0x20

    shr-long v1, p1, p4

    long-to-int p4, v1

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    neg-float v1, v1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    neg-float p2, p2

    invoke-virtual {p0, v1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->setAction(I)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The PointerEvent receiver cannot have a null MotionEvent."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
