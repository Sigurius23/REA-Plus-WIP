.class public final Lui/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/b;


# instance fields
.field public final E:Lp1/k1;

.field public final F:Lp1/k1;

.field public final G:Lp1/k1;

.field public final H:Lp1/f0;

.field public final I:Lp1/k1;

.field public final J:Lp1/k1;

.field public final K:Lp1/k1;

.field public final L:Lp1/k1;

.field public final M:Lp1/f0;

.field public final N:Lp1/f0;

.field public final O:Lf0/c1;

.field public final w:Lp1/k1;

.field public final x:Lp1/k1;

.field public final y:Lp1/k1;

.field public final z:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lui/i;->w:Lp1/k1;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    iput-object v2, p0, Lui/i;->x:Lp1/k1;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lui/i;->y:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lui/i;->z:Lp1/k1;

    const/4 v1, 0x0

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    iput-object v2, p0, Lui/i;->E:Lp1/k1;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    iput-object v2, p0, Lui/i;->F:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lui/i;->G:Lp1/k1;

    new-instance v0, Lui/g;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lui/g;-><init>(Lui/i;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lui/i;->H:Lp1/f0;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lui/i;->I:Lp1/k1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lui/i;->J:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lui/i;->K:Lp1/k1;

    const-wide/high16 v0, -0x8000000000000000L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lui/i;->L:Lp1/k1;

    new-instance v0, Lui/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lui/g;-><init>(Lui/i;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lui/i;->M:Lp1/f0;

    new-instance v0, Lui/g;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lui/g;-><init>(Lui/i;I)V

    invoke-static {v0}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v0

    iput-object v0, p0, Lui/i;->N:Lp1/f0;

    new-instance v0, Lf0/c1;

    invoke-direct {v0}, Lf0/c1;-><init>()V

    iput-object v0, p0, Lui/i;->O:Lf0/c1;

    return-void
.end method

.method public static final a(Lui/i;IJ)Z
    .locals 9

    invoke-virtual {p0}, Lui/i;->e()Lqi/i;

    move-result-object v0

    iget-object v1, p0, Lui/i;->J:Lp1/k1;

    iget-object v2, p0, Lui/i;->H:Lp1/f0;

    iget-object v3, p0, Lui/i;->L:Lp1/k1;

    const/4 v4, 0x1

    if-nez v0, :cond_0

    return v4

    :cond_0
    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    const-wide/16 v5, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    sub-long v5, p2, v5

    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v3, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lui/i;->d()Lui/o;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2, v0}, Lui/o;->b(Lqi/i;)F

    move-result p2

    goto :goto_1

    :cond_2
    move p2, p3

    :goto_1
    invoke-virtual {p0}, Lui/i;->d()Lui/o;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3, v0}, Lui/o;->a(Lqi/i;)F

    move-result v3

    goto :goto_2

    :cond_3
    const/high16 v3, 0x3f800000    # 1.0f

    :goto_2
    const v7, 0xf4240

    int-to-long v7, v7

    div-long/2addr v5, v7

    long-to-float v5, v5

    invoke-virtual {v0}, Lqi/i;->b()F

    move-result v0

    div-float/2addr v5, v0

    invoke-virtual {v2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    mul-float/2addr v0, v5

    invoke-virtual {v2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpg-float v5, v5, p3

    if-gez v5, :cond_4

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    add-float/2addr v5, v0

    sub-float v5, p2, v5

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    add-float/2addr v5, v0

    sub-float/2addr v5, v3

    :goto_3
    cmpg-float v6, v5, p3

    if-gez v6, :cond_5

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1, p2, v3}, Le93/b;->m(FFF)F

    move-result p1

    add-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lui/i;->n(F)V

    return v4

    :cond_5
    sub-float v0, v3, p2

    div-float v1, v5, v0

    float-to-int v1, v1

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {p0}, Lui/i;->j()I

    move-result v7

    add-int/2addr v7, v6

    if-le v7, p1, :cond_6

    invoke-virtual {p0}, Lui/i;->g()F

    move-result p2

    invoke-virtual {p0, p2}, Lui/i;->n(F)V

    invoke-virtual {p0, p1}, Lui/i;->m(I)V

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-virtual {p0}, Lui/i;->j()I

    move-result p1

    add-int/2addr p1, v6

    invoke-virtual {p0, p1}, Lui/i;->m(I)V

    int-to-float p1, v1

    mul-float/2addr p1, v0

    sub-float/2addr v5, p1

    invoke-virtual {v2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    cmpg-float p1, p1, p3

    if-gez p1, :cond_7

    sub-float/2addr v3, v5

    goto :goto_4

    :cond_7
    add-float v3, p2, v5

    :goto_4
    invoke-virtual {p0, v3}, Lui/i;->n(F)V

    return v4
.end method

.method public static final c(Lui/i;Z)V
    .locals 0

    iget-object p0, p0, Lui/i;->w:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d()Lui/o;
    .locals 1

    iget-object v0, p0, Lui/i;->E:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lui/o;

    return-object v0
.end method

.method public final e()Lqi/i;
    .locals 1

    iget-object v0, p0, Lui/i;->I:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi/i;

    return-object v0
.end method

.method public final g()F
    .locals 1

    iget-object v0, p0, Lui/i;->M:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lui/i;->k()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lui/i;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final k()F
    .locals 1

    iget-object v0, p0, Lui/i;->K:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final l()F
    .locals 1

    iget-object v0, p0, Lui/i;->F:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final m(I)V
    .locals 1

    iget-object v0, p0, Lui/i;->x:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final n(F)V
    .locals 2

    iget-object v0, p0, Lui/i;->J:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lui/i;->G:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lui/i;->e()Lqi/i;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, Lqi/i;->n:F

    const/4 v1, 0x1

    int-to-float v1, v1

    div-float/2addr v1, v0

    rem-float v0, p1, v1

    sub-float/2addr p1, v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lui/i;->K:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
