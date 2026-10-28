.class public final Lk4/e;
.super Lj4/g;
.source "SourceFile"


# instance fields
.field public A0:I

.field public B0:I

.field public C0:I

.field public D0:I

.field public E0:I

.field public F0:I

.field public G0:I

.field public H0:I

.field public I0:F

.field public J0:F

.field public K0:F

.field public L0:F

.field public n0:Lm4/h;

.field public o0:Ljava/util/HashMap;

.field public p0:Ljava/util/HashMap;

.field public q0:Ljava/util/HashMap;

.field public r0:I

.field public s0:I

.field public t0:I

.field public u0:I

.field public v0:I

.field public w0:I

.field public x0:I

.field public y0:I

.field public z0:I


# direct methods
.method public constructor <init>(Le4/s;I)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lj4/g;-><init>(Le4/s;I)V

    const/4 p1, 0x0

    iput p1, p0, Lk4/e;->r0:I

    const/4 v0, -0x1

    iput v0, p0, Lk4/e;->s0:I

    iput v0, p0, Lk4/e;->t0:I

    iput v0, p0, Lk4/e;->u0:I

    iput v0, p0, Lk4/e;->v0:I

    iput v0, p0, Lk4/e;->w0:I

    iput v0, p0, Lk4/e;->x0:I

    const/4 v1, 0x2

    iput v1, p0, Lk4/e;->y0:I

    iput v1, p0, Lk4/e;->z0:I

    iput p1, p0, Lk4/e;->A0:I

    iput p1, p0, Lk4/e;->B0:I

    iput p1, p0, Lk4/e;->C0:I

    iput p1, p0, Lk4/e;->D0:I

    iput p1, p0, Lk4/e;->E0:I

    iput p1, p0, Lk4/e;->F0:I

    iput v0, p0, Lk4/e;->G0:I

    iput p1, p0, Lk4/e;->H0:I

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lk4/e;->I0:F

    iput p1, p0, Lk4/e;->J0:F

    iput p1, p0, Lk4/e;->K0:F

    iput p1, p0, Lk4/e;->L0:F

    const/16 p1, 0x8

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lk4/e;->H0:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 0

    iput p1, p0, Lk4/e;->v0:I

    return-void
.end method

.method public final B(F)V
    .locals 0

    iput p1, p0, Lk4/e;->L0:F

    return-void
.end method

.method public final C(I)V
    .locals 0

    iput p1, p0, Lk4/e;->x0:I

    return-void
.end method

.method public final D(F)V
    .locals 0

    iput p1, p0, Lk4/e;->J0:F

    return-void
.end method

.method public final E(I)V
    .locals 0

    iput p1, p0, Lk4/e;->u0:I

    return-void
.end method

.method public final F(I)V
    .locals 0

    iput p1, p0, Lk4/e;->G0:I

    return-void
.end method

.method public final G(I)V
    .locals 0

    iput p1, p0, Lk4/e;->H0:I

    return-void
.end method

.method public final H(I)V
    .locals 0

    iput p1, p0, Lk4/e;->F0:I

    return-void
.end method

.method public final I(I)V
    .locals 0

    iput p1, p0, Lk4/e;->C0:I

    return-void
.end method

.method public final J(I)V
    .locals 0

    iput p1, p0, Lk4/e;->D0:I

    return-void
.end method

.method public final K(I)V
    .locals 0

    iput p1, p0, Lk4/e;->E0:I

    return-void
.end method

.method public final L(I)V
    .locals 0

    iput p1, p0, Lk4/e;->y0:I

    return-void
.end method

.method public final M(I)V
    .locals 0

    iput p1, p0, Lk4/e;->A0:I

    return-void
.end method

.method public final N(I)V
    .locals 0

    iput p1, p0, Lk4/e;->s0:I

    return-void
.end method

.method public final O(I)V
    .locals 0

    iput p1, p0, Lk4/e;->r0:I

    return-void
.end method

.method public final apply()V
    .locals 5

    invoke-virtual {p0}, Lk4/e;->s()Lm4/j;

    iget-object v0, p0, Lk4/e;->n0:Lm4/h;

    invoke-virtual {p0, v0}, Lj4/b;->b(Lm4/e;)V

    iget-object v0, p0, Lk4/e;->n0:Lm4/h;

    iget v1, p0, Lk4/e;->H0:I

    iput v1, v0, Lm4/h;->W0:I

    iget v1, p0, Lk4/e;->r0:I

    iput v1, v0, Lm4/h;->U0:I

    iget v1, p0, Lk4/e;->G0:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iput v1, v0, Lm4/h;->V0:I

    :cond_0
    iget v1, p0, Lk4/e;->C0:I

    if-eqz v1, :cond_1

    iput v1, v0, Lm4/l;->x0:I

    :cond_1
    iget v1, p0, Lk4/e;->E0:I

    if-eqz v1, :cond_2

    iput v1, v0, Lm4/l;->t0:I

    :cond_2
    iget v1, p0, Lk4/e;->D0:I

    if-eqz v1, :cond_3

    iput v1, v0, Lm4/l;->y0:I

    :cond_3
    iget v1, p0, Lk4/e;->F0:I

    if-eqz v1, :cond_4

    iput v1, v0, Lm4/l;->u0:I

    :cond_4
    iget v1, p0, Lk4/e;->B0:I

    if-eqz v1, :cond_5

    iput v1, v0, Lm4/h;->Q0:I

    :cond_5
    iget v1, p0, Lk4/e;->A0:I

    if-eqz v1, :cond_6

    iput v1, v0, Lm4/h;->R0:I

    :cond_6
    iget v1, p0, Lj4/b;->h:F

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_7

    iput v1, v0, Lm4/h;->K0:F

    :cond_7
    iget v1, p0, Lk4/e;->K0:F

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_8

    iput v1, v0, Lm4/h;->M0:F

    :cond_8
    iget v1, p0, Lk4/e;->L0:F

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_9

    iput v1, v0, Lm4/h;->O0:F

    :cond_9
    iget v1, p0, Lj4/b;->i:F

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_a

    iput v1, v0, Lm4/h;->L0:F

    :cond_a
    iget v1, p0, Lk4/e;->I0:F

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_b

    iput v1, v0, Lm4/h;->N0:F

    :cond_b
    iget v1, p0, Lk4/e;->J0:F

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_c

    iput v1, v0, Lm4/h;->P0:F

    :cond_c
    iget v1, p0, Lk4/e;->z0:I

    const/4 v3, 0x2

    if-eq v1, v3, :cond_d

    iput v1, v0, Lm4/h;->S0:I

    :cond_d
    iget v1, p0, Lk4/e;->y0:I

    if-eq v1, v3, :cond_e

    iput v1, v0, Lm4/h;->T0:I

    :cond_e
    iget v1, p0, Lk4/e;->s0:I

    if-eq v1, v2, :cond_f

    iput v1, v0, Lm4/h;->F0:I

    :cond_f
    iget v1, p0, Lk4/e;->t0:I

    if-eq v1, v2, :cond_10

    iput v1, v0, Lm4/h;->H0:I

    :cond_10
    iget v1, p0, Lk4/e;->u0:I

    if-eq v1, v2, :cond_11

    iput v1, v0, Lm4/h;->J0:I

    :cond_11
    iget v1, p0, Lk4/e;->v0:I

    if-eq v1, v2, :cond_12

    iput v1, v0, Lm4/h;->E0:I

    :cond_12
    iget v1, p0, Lk4/e;->w0:I

    if-eq v1, v2, :cond_13

    iput v1, v0, Lm4/h;->G0:I

    :cond_13
    iget v1, p0, Lk4/e;->x0:I

    if-eq v1, v2, :cond_14

    iput v1, v0, Lm4/h;->I0:I

    :cond_14
    invoke-virtual {p0}, Lj4/g;->r()V

    return-void
.end method

.method public final s()Lm4/j;
    .locals 1

    iget-object v0, p0, Lk4/e;->n0:Lm4/h;

    if-nez v0, :cond_0

    new-instance v0, Lm4/h;

    invoke-direct {v0}, Lm4/h;-><init>()V

    iput-object v0, p0, Lk4/e;->n0:Lm4/h;

    :cond_0
    iget-object v0, p0, Lk4/e;->n0:Lm4/h;

    return-object v0
.end method

.method public final t(Ljava/lang/String;FFF)V
    .locals 1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj4/g;->q([Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lk4/e;->o0:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk4/e;->o0:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lk4/e;->o0:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lk4/e;->p0:Ljava/util/HashMap;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lk4/e;->p0:Ljava/util/HashMap;

    :cond_2
    iget-object p2, p0, Lk4/e;->p0:Ljava/util/HashMap;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lk4/e;->q0:Ljava/util/HashMap;

    if-nez p2, :cond_4

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lk4/e;->q0:Ljava/util/HashMap;

    :cond_4
    iget-object p2, p0, Lk4/e;->q0:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method

.method public final u(F)V
    .locals 0

    iput p1, p0, Lk4/e;->K0:F

    return-void
.end method

.method public final v(I)V
    .locals 0

    iput p1, p0, Lk4/e;->w0:I

    return-void
.end method

.method public final w(F)V
    .locals 0

    iput p1, p0, Lk4/e;->I0:F

    return-void
.end method

.method public final x(I)V
    .locals 0

    iput p1, p0, Lk4/e;->t0:I

    return-void
.end method

.method public final y(I)V
    .locals 0

    iput p1, p0, Lk4/e;->z0:I

    return-void
.end method

.method public final z(I)V
    .locals 0

    iput p1, p0, Lk4/e;->B0:I

    return-void
.end method
