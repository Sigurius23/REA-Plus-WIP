.class public final Ld0/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public E:Ld0/y0;

.field public F:Ld0/p1;

.field public final G:Lp1/k1;

.field public final H:Lp1/g1;

.field public I:Z

.field public final J:Lp1/k1;

.field public K:Ld0/r;

.field public final L:Lp1/i1;

.field public M:Z

.field public final N:Ld0/i1;

.field public final synthetic O:Ld0/z1;

.field public final w:Ld0/f2;

.field public final x:Lp1/k1;

.field public final y:Lp1/k1;

.field public final z:Lp1/k1;


# direct methods
.method public constructor <init>(Ld0/z1;Ljava/lang/Object;Ld0/r;Ld0/f2;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/v1;->O:Ld0/z1;

    iput-object p4, p0, Ld0/v1;->w:Ld0/f2;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/v1;->x:Lp1/k1;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v1, v0, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/v1;->y:Lp1/k1;

    new-instance v3, Ld0/p1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ld0/c0;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v6, p2

    move-object v8, p3

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/v1;->z:Lp1/k1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/v1;->G:Lp1/k1;

    new-instance p1, Lp1/g1;

    const/high16 p2, -0x40800000    # -1.0f

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Ld0/v1;->H:Lp1/g1;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/v1;->J:Lp1/k1;

    iput-object v8, p0, Ld0/v1;->K:Ld0/r;

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p1

    invoke-virtual {p1}, Ld0/p1;->d()J

    move-result-wide p1

    new-instance p3, Lp1/i1;

    invoke-direct {p3, p1, p2}, Lp1/i1;-><init>(J)V

    iput-object p3, p0, Ld0/v1;->L:Lp1/i1;

    sget-object p1, Ld0/p2;->a:Ljava/lang/Object;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p2, v5, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld0/r;

    invoke-virtual {p2}, Ld0/r;->b()I

    move-result p3

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_0

    invoke-virtual {p2, p1, p4}, Ld0/r;->e(FI)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ld0/v1;->w:Ld0/f2;

    iget-object p1, p1, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :cond_1
    const/4 p1, 0x3

    invoke-static {v1, v1, p1, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    iput-object p1, p0, Ld0/v1;->N:Ld0/i1;

    return-void
.end method


# virtual methods
.method public final a()Ld0/p1;
    .locals 1

    iget-object v0, p0, Ld0/v1;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/p1;

    return-object v0
.end method

.method public final c(J)V
    .locals 2

    iget-object v0, p0, Ld0/v1;->H:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld0/v1;->M:Z

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object v0

    iget-object v0, v0, Ld0/p1;->c:Ljava/lang/Object;

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object v1

    iget-object v1, v1, Ld0/p1;->d:Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p1

    iget-object p1, p1, Ld0/p1;->c:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ld0/v1;->d(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld0/p1;->f(J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ld0/v1;->d(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld0/p1;->b(J)Ld0/r;

    move-result-object p1

    iput-object p1, p0, Ld0/v1;->K:Ld0/r;

    :cond_1
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;Z)V
    .locals 12

    iget-object v0, p0, Ld0/v1;->F:Ld0/p1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ld0/p1;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ld0/v1;->x:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Ld0/v1;->L:Lp1/i1;

    iget-object v3, p0, Ld0/v1;->z:Lp1/k1;

    if-eqz v0, :cond_1

    new-instance v4, Ld0/p1;

    iget-object p2, p0, Ld0/v1;->K:Ld0/r;

    invoke-virtual {p2}, Ld0/r;->c()Ld0/r;

    move-result-object v9

    iget-object v5, p0, Ld0/v1;->N:Ld0/i1;

    iget-object v6, p0, Ld0/v1;->w:Ld0/f2;

    move-object v8, p1

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    invoke-virtual {v3, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld0/v1;->I:Z

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p1

    invoke-virtual {p1}, Ld0/p1;->d()J

    move-result-wide p1

    invoke-virtual {v2, p1, p2}, Lp1/i1;->y(J)V

    return-void

    :cond_1
    move-object v7, p1

    iget-object p1, p0, Ld0/v1;->y:Lp1/k1;

    if-eqz p2, :cond_3

    iget-boolean p2, p0, Ld0/v1;->M:Z

    if-nez p2, :cond_3

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld0/c0;

    instance-of p2, p2, Ld0/i1;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/c0;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Ld0/v1;->N:Ld0/i1;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/c0;

    :goto_1
    iget-object p2, p0, Ld0/v1;->O:Ld0/z1;

    invoke-virtual {p2}, Ld0/z1;->e()J

    move-result-wide v4

    iget-object v0, p2, Ld0/z1;->h:Lp1/k1;

    const-wide/16 v10, 0x0

    cmp-long v4, v4, v10

    if-gtz v4, :cond_4

    move-object v5, p1

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Ld0/z1;->e()J

    move-result-wide v4

    new-instance v6, Ld0/j1;

    invoke-direct {v6, p1, v4, v5}, Ld0/j1;-><init>(Ld0/c0;J)V

    move-object v5, v6

    :goto_2
    new-instance v4, Ld0/p1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    iget-object v9, p0, Ld0/v1;->K:Ld0/r;

    iget-object v6, p0, Ld0/v1;->w:Ld0/f2;

    invoke-direct/range {v4 .. v9}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    invoke-virtual {v3, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p1

    invoke-virtual {p1}, Ld0/p1;->d()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lp1/i1;->y(J)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld0/v1;->I:Z

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ld0/z1;->g()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object p2, p2, Ld0/z1;->i:Lz1/p;

    invoke-virtual {p2}, Lz1/p;->size()I

    move-result v1

    move-wide v2, v10

    :goto_3
    if-ge p1, v1, :cond_5

    invoke-virtual {p2, p1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/v1;

    iget-object v5, v4, Ld0/v1;->L:Lp1/i1;

    invoke-virtual {v5}, Lp1/i1;->x()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v4, v10, v11}, Ld0/v1;->c(J)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;)V
    .locals 1

    iget-object v0, p0, Ld0/v1;->x:Lp1/k1;

    invoke-virtual {v0, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/v1;->y:Lp1/k1;

    invoke-virtual {v0, p3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p3

    iget-object p3, p3, Ld0/p1;->d:Ljava/lang/Object;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p3

    iget-object p3, p3, Ld0/p1;->c:Ljava/lang/Object;

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ld0/v1;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/lang/Object;Ld0/c0;)V
    .locals 6

    iget-boolean v0, p0, Ld0/v1;->I:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld0/v1;->F:Ld0/p1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ld0/p1;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld0/v1;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ld0/v1;->H:Lp1/g1;

    const/high16 v3, -0x40800000    # -1.0f

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v1

    cmpg-float v1, v1, v3

    if-nez v1, :cond_2

    :goto_1
    return-void

    :cond_2
    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/v1;->y:Lp1/k1;

    invoke-virtual {v0, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result p2

    const/high16 v0, -0x3fc00000    # -3.0f

    cmpg-float p2, p2, v0

    if-nez p2, :cond_3

    move-object p2, p1

    goto :goto_2

    :cond_3
    iget-object p2, p0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {p2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    :goto_2
    iget-object v1, p0, Ld0/v1;->G:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x1

    xor-int/2addr v4, v5

    invoke-virtual {p0, p2, v4}, Ld0/v1;->e(Ljava/lang/Object;Z)V

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result p2

    cmpg-float p2, p2, v0

    const/4 v4, 0x0

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    move v5, v4

    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result p2

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-ltz p2, :cond_5

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object p1

    invoke-virtual {p1}, Ld0/p1;->d()J

    move-result-wide p1

    invoke-virtual {p0}, Ld0/v1;->a()Ld0/p1;

    move-result-object v0

    long-to-float p1, p1

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result p2

    mul-float/2addr p2, p1

    float-to-long p1, p2

    invoke-virtual {v0, p1, p2}, Ld0/p1;->f(J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ld0/v1;->d(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result p2

    cmpg-float p2, p2, v0

    if-nez p2, :cond_6

    invoke-virtual {p0, p1}, Ld0/v1;->d(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iput-boolean v4, p0, Ld0/v1;->I:Z

    invoke-virtual {v2, v3}, Lp1/g1;->y(F)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "current value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/v1;->x:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld0/v1;->y:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld0/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
