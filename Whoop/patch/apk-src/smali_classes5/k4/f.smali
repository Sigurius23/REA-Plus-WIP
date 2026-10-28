.class public final Lk4/f;
.super Lj4/g;
.source "SourceFile"


# instance fields
.field public A0:Ljava/lang/String;

.field public B0:I

.field public n0:Ll4/a;

.field public o0:I

.field public p0:I

.field public q0:I

.field public r0:I

.field public s0:I

.field public t0:I

.field public u0:I

.field public v0:F

.field public w0:F

.field public x0:Ljava/lang/String;

.field public y0:Ljava/lang/String;

.field public z0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le4/s;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lj4/g;-><init>(Le4/s;I)V

    const/4 p1, 0x0

    iput p1, p0, Lk4/f;->o0:I

    iput p1, p0, Lk4/f;->p0:I

    iput p1, p0, Lk4/f;->q0:I

    iput p1, p0, Lk4/f;->r0:I

    const/16 p1, 0xa

    const/4 v0, 0x1

    if-ne p2, p1, :cond_0

    iput v0, p0, Lk4/f;->t0:I

    return-void

    :cond_0
    const/16 p1, 0xb

    if-ne p2, p1, :cond_1

    iput v0, p0, Lk4/f;->u0:I

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 0

    iput p1, p0, Lk4/f;->p0:I

    return-void
.end method

.method public final B(I)V
    .locals 0

    iput p1, p0, Lk4/f;->o0:I

    return-void
.end method

.method public final C(I)V
    .locals 0

    iput p1, p0, Lk4/f;->q0:I

    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lk4/f;->x0:Ljava/lang/String;

    return-void
.end method

.method public final E(I)V
    .locals 2

    iget v0, p0, Lj4/g;->l0:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lk4/f;->t0:I

    return-void
.end method

.method public final F(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lk4/f;->A0:Ljava/lang/String;

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lk4/f;->z0:Ljava/lang/String;

    return-void
.end method

.method public final H(F)V
    .locals 0

    iput p1, p0, Lk4/f;->w0:F

    return-void
.end method

.method public final apply()V
    .locals 5

    invoke-virtual {p0}, Lk4/f;->s()Lm4/j;

    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    iget v1, p0, Lk4/f;->s0:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, v0, Ll4/a;->R0:I

    if-ne v2, v1, :cond_1

    goto :goto_0

    :cond_1
    iput v1, v0, Ll4/a;->R0:I

    :goto_0
    iget v0, p0, Lk4/f;->t0:I

    const/16 v1, 0x32

    if-eqz v0, :cond_4

    iget-object v2, p0, Lk4/f;->n0:Ll4/a;

    if-le v0, v1, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_2
    iget v3, v2, Ll4/a;->I0:I

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    iput v0, v2, Ll4/a;->I0:I

    invoke-virtual {v2}, Ll4/a;->k0()V

    invoke-virtual {v2}, Ll4/a;->g0()V

    :cond_4
    :goto_1
    iget v0, p0, Lk4/f;->u0:I

    if-eqz v0, :cond_7

    iget-object v2, p0, Lk4/f;->n0:Ll4/a;

    if-le v0, v1, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_5
    iget v1, v2, Ll4/a;->K0:I

    if-ne v1, v0, :cond_6

    goto :goto_2

    :cond_6
    iput v0, v2, Ll4/a;->K0:I

    invoke-virtual {v2}, Ll4/a;->k0()V

    invoke-virtual {v2}, Ll4/a;->g0()V

    :cond_7
    :goto_2
    iget v0, p0, Lk4/f;->v0:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_a

    iget-object v2, p0, Lk4/f;->n0:Ll4/a;

    cmpg-float v3, v0, v1

    if-gez v3, :cond_8

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_8
    iget v3, v2, Ll4/a;->L0:F

    cmpl-float v3, v3, v0

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    iput v0, v2, Ll4/a;->L0:F

    :cond_a
    :goto_3
    iget v0, p0, Lk4/f;->w0:F

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_d

    iget-object v2, p0, Lk4/f;->n0:Ll4/a;

    cmpg-float v1, v0, v1

    if-gez v1, :cond_b

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :cond_b
    iget v1, v2, Ll4/a;->M0:F

    cmpl-float v1, v1, v0

    if-nez v1, :cond_c

    goto :goto_4

    :cond_c
    iput v0, v2, Ll4/a;->M0:F

    :cond_d
    :goto_4
    iget-object v0, p0, Lk4/f;->x0:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    iget-object v1, p0, Lk4/f;->x0:Ljava/lang/String;

    iget-object v2, v0, Ll4/a;->N0:Ljava/lang/String;

    if-eqz v2, :cond_e

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_5

    :cond_e
    iput-object v1, v0, Ll4/a;->N0:Ljava/lang/String;

    :cond_f
    :goto_5
    iget-object v0, p0, Lk4/f;->y0:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    iget-object v1, p0, Lk4/f;->y0:Ljava/lang/String;

    iget-object v2, v0, Ll4/a;->O0:Ljava/lang/String;

    if-eqz v2, :cond_10

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_6

    :cond_10
    iput-object v1, v0, Ll4/a;->O0:Ljava/lang/String;

    :cond_11
    :goto_6
    iget-object v0, p0, Lk4/f;->z0:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    iget-object v2, p0, Lk4/f;->z0:Ljava/lang/String;

    iget-object v3, v0, Ll4/a;->P0:Ljava/lang/String;

    if-eqz v3, :cond_12

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_7

    :cond_12
    iput-boolean v1, v0, Ll4/a;->G0:Z

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll4/a;->P0:Ljava/lang/String;

    :cond_13
    :goto_7
    iget-object v0, p0, Lk4/f;->A0:Ljava/lang/String;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    iget-object v2, p0, Lk4/f;->A0:Ljava/lang/String;

    iget-object v3, v0, Ll4/a;->Q0:Ljava/lang/String;

    if-eqz v3, :cond_14

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    goto :goto_8

    :cond_14
    iput-boolean v1, v0, Ll4/a;->G0:Z

    iput-object v2, v0, Ll4/a;->Q0:Ljava/lang/String;

    :cond_15
    :goto_8
    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    iget v1, p0, Lk4/f;->B0:I

    iput v1, v0, Ll4/a;->W0:I

    iget v1, p0, Lk4/f;->o0:I

    iput v1, v0, Lm4/l;->v0:I

    iput v1, v0, Lm4/l;->x0:I

    iput v1, v0, Lm4/l;->y0:I

    iget v1, p0, Lk4/f;->p0:I

    iput v1, v0, Lm4/l;->w0:I

    iget v1, p0, Lk4/f;->q0:I

    iput v1, v0, Lm4/l;->t0:I

    iget v1, p0, Lk4/f;->r0:I

    iput v1, v0, Lm4/l;->u0:I

    invoke-virtual {p0}, Lj4/g;->r()V

    return-void
.end method

.method public final s()Lm4/j;
    .locals 7

    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    if-nez v0, :cond_8

    new-instance v0, Ll4/a;

    invoke-direct {v0}, Lm4/l;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll4/a;->G0:Z

    iput v1, v0, Ll4/a;->S0:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v0, Ll4/a;->U0:Ljava/util/HashSet;

    iput v1, v0, Ll4/a;->Y0:I

    invoke-virtual {v0}, Ll4/a;->k0()V

    iget-object v2, v0, Ll4/a;->V0:[[I

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    array-length v2, v2

    iget v4, v0, Lm4/j;->s0:I

    if-ne v2, v4, :cond_0

    iget-object v2, v0, Ll4/a;->T0:[[Z

    if-eqz v2, :cond_0

    array-length v4, v2

    iget v5, v0, Ll4/a;->H0:I

    if-ne v4, v5, :cond_0

    aget-object v2, v2, v1

    array-length v2, v2

    iget v4, v0, Ll4/a;->J0:I

    if-ne v2, v4, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    invoke-virtual {v0}, Ll4/a;->g0()V

    :cond_1
    if-eqz v2, :cond_5

    move v2, v1

    :goto_1
    iget-object v4, v0, Ll4/a;->T0:[[Z

    array-length v4, v4

    if-ge v2, v4, :cond_3

    move v4, v1

    :goto_2
    iget-object v5, v0, Ll4/a;->T0:[[Z

    aget-object v6, v5, v1

    array-length v6, v6

    if-ge v4, v6, :cond_2

    aget-object v5, v5, v2

    aput-boolean v3, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_3
    iget-object v4, v0, Ll4/a;->V0:[[I

    array-length v4, v4

    if-ge v2, v4, :cond_5

    move v4, v1

    :goto_4
    iget-object v5, v0, Ll4/a;->V0:[[I

    aget-object v6, v5, v1

    array-length v6, v6

    if-ge v4, v6, :cond_4

    aget-object v5, v5, v2

    const/4 v6, -0x1

    aput v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    iput v1, v0, Ll4/a;->S0:I

    iget-object v2, v0, Ll4/a;->Q0:Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, Ll4/a;->Q0:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ll4/a;->i0(Ljava/lang/String;Z)[[I

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, Ll4/a;->e0([[I)V

    :cond_6
    iget-object v1, v0, Ll4/a;->P0:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, Ll4/a;->P0:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Ll4/a;->i0(Ljava/lang/String;Z)[[I

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v0, v1}, Ll4/a;->f0([[I)V

    :cond_7
    iput-object v0, p0, Lk4/f;->n0:Ll4/a;

    :cond_8
    iget-object v0, p0, Lk4/f;->n0:Ll4/a;

    return-object v0
.end method

.method public final t(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lk4/f;->y0:Ljava/lang/String;

    return-void
.end method

.method public final u(I)V
    .locals 2

    iget v0, p0, Lj4/g;->l0:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lk4/f;->u0:I

    return-void
.end method

.method public final v(I)V
    .locals 0

    iput p1, p0, Lk4/f;->B0:I

    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    iput v0, p0, Lk4/f;->B0:I

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "subgridbycolrow"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "spansrespectwidgetorder"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget v2, p0, Lk4/f;->B0:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Lk4/f;->B0:I

    goto :goto_1

    :cond_2
    iget v2, p0, Lk4/f;->B0:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lk4/f;->B0:I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final x(F)V
    .locals 0

    iput p1, p0, Lk4/f;->v0:F

    return-void
.end method

.method public final y(I)V
    .locals 0

    iput p1, p0, Lk4/f;->s0:I

    return-void
.end method

.method public final z(I)V
    .locals 0

    iput p1, p0, Lk4/f;->r0:I

    return-void
.end method
