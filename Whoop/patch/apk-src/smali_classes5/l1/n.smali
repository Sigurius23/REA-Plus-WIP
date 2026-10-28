.class public abstract Ll1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lku2/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lku2/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ll1/n;->a:Lp1/u2;

    new-instance v0, Lku2/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lku2/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Ll1/n;->b:Lp1/u2;

    return-void
.end method

.method public static final a(Ll1/m;J)J
    .locals 10

    iget-wide v0, p0, Ll1/m;->a:J

    iget-wide v2, p0, Ll1/m;->U:J

    iget-wide v4, p0, Ll1/m;->Q:J

    iget-wide v6, p0, Ll1/m;->M:J

    iget-wide v8, p0, Ll1/m;->q:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide p0, p0, Ll1/m;->b:J

    return-wide p0

    :cond_0
    iget-wide v0, p0, Ll1/m;->f:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide p0, p0, Ll1/m;->g:J

    return-wide p0

    :cond_1
    iget-wide v0, p0, Ll1/m;->j:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide p0, p0, Ll1/m;->k:J

    return-wide p0

    :cond_2
    iget-wide v0, p0, Ll1/m;->n:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide p0, p0, Ll1/m;->o:J

    return-wide p0

    :cond_3
    iget-wide v0, p0, Ll1/m;->w:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-wide p0, p0, Ll1/m;->x:J

    return-wide p0

    :cond_4
    iget-wide v0, p0, Ll1/m;->c:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-wide p0, p0, Ll1/m;->d:J

    return-wide p0

    :cond_5
    iget-wide v0, p0, Ll1/m;->h:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-wide p0, p0, Ll1/m;->i:J

    return-wide p0

    :cond_6
    iget-wide v0, p0, Ll1/m;->l:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-wide p0, p0, Ll1/m;->m:J

    return-wide p0

    :cond_7
    iget-wide v0, p0, Ll1/m;->y:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-wide p0, p0, Ll1/m;->z:J

    return-wide p0

    :cond_8
    iget-wide v0, p0, Ll1/m;->u:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-wide p0, p0, Ll1/m;->v:J

    return-wide p0

    :cond_9
    iget-wide v0, p0, Ll1/m;->p:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_a

    return-wide v8

    :cond_a
    iget-wide v0, p0, Ll1/m;->r:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-wide p0, p0, Ll1/m;->s:J

    return-wide p0

    :cond_b
    iget-wide v0, p0, Ll1/m;->D:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    return-wide v8

    :cond_c
    iget-wide v0, p0, Ll1/m;->F:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_d

    return-wide v8

    :cond_d
    iget-wide v0, p0, Ll1/m;->G:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_e

    return-wide v8

    :cond_e
    iget-wide v0, p0, Ll1/m;->H:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_f

    return-wide v8

    :cond_f
    iget-wide v0, p0, Ll1/m;->I:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_10

    return-wide v8

    :cond_10
    iget-wide v0, p0, Ll1/m;->J:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_11

    return-wide v8

    :cond_11
    iget-wide v0, p0, Ll1/m;->E:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_12

    return-wide v8

    :cond_12
    iget-wide v0, p0, Ll1/m;->K:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_13

    return-wide v6

    :cond_13
    iget-wide v0, p0, Ll1/m;->L:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_14

    return-wide v6

    :cond_14
    iget-wide v0, p0, Ll1/m;->O:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_15

    return-wide v4

    :cond_15
    iget-wide v0, p0, Ll1/m;->P:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_16

    return-wide v4

    :cond_16
    iget-wide v0, p0, Ll1/m;->S:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_17

    return-wide v2

    :cond_17
    iget-wide v0, p0, Ll1/m;->T:J

    invoke-static {p1, p2, v0, v1}, Li2/x;->d(JJ)Z

    move-result p0

    if-eqz p0, :cond_18

    return-wide v2

    :cond_18
    sget p0, Li2/x;->o:I

    sget-wide p0, Li2/x;->n:J

    return-wide p0
.end method

.method public static final b(JLandroidx/compose/runtime/Composer;)J
    .locals 2

    check-cast p2, Lp1/q;

    const v0, 0x553c0da

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll1/n;->a:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/m;

    invoke-static {v0, p0, p1}, Ll1/n;->a(Ll1/m;J)J

    move-result-wide p0

    const-wide/16 v0, 0x10

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Ll1/s;->a:Lp1/b0;

    invoke-virtual {p2, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide p0, p0, Li2/x;->a:J

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    return-wide p0
.end method

.method public static final c(Ll1/m;Lo1/f;)J
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    iget-wide p0, p0, Ll1/m;->T:J

    return-wide p0

    :pswitch_1
    iget-wide p0, p0, Ll1/m;->S:J

    return-wide p0

    :pswitch_2
    iget-wide p0, p0, Ll1/m;->l:J

    return-wide p0

    :pswitch_3
    iget-wide p0, p0, Ll1/m;->j:J

    return-wide p0

    :pswitch_4
    iget-wide p0, p0, Ll1/m;->r:J

    return-wide p0

    :pswitch_5
    iget-wide p0, p0, Ll1/m;->t:J

    return-wide p0

    :pswitch_6
    iget-wide p0, p0, Ll1/m;->E:J

    return-wide p0

    :pswitch_7
    iget-wide p0, p0, Ll1/m;->J:J

    return-wide p0

    :pswitch_8
    iget-wide p0, p0, Ll1/m;->I:J

    return-wide p0

    :pswitch_9
    iget-wide p0, p0, Ll1/m;->H:J

    return-wide p0

    :pswitch_a
    iget-wide p0, p0, Ll1/m;->G:J

    return-wide p0

    :pswitch_b
    iget-wide p0, p0, Ll1/m;->F:J

    return-wide p0

    :pswitch_c
    iget-wide p0, p0, Ll1/m;->D:J

    return-wide p0

    :pswitch_d
    iget-wide p0, p0, Ll1/m;->p:J

    return-wide p0

    :pswitch_e
    iget-wide p0, p0, Ll1/m;->P:J

    return-wide p0

    :pswitch_f
    iget-wide p0, p0, Ll1/m;->O:J

    return-wide p0

    :pswitch_10
    iget-wide p0, p0, Ll1/m;->h:J

    return-wide p0

    :pswitch_11
    iget-wide p0, p0, Ll1/m;->f:J

    return-wide p0

    :pswitch_12
    iget-wide p0, p0, Ll1/m;->C:J

    return-wide p0

    :pswitch_13
    iget-wide p0, p0, Ll1/m;->L:J

    return-wide p0

    :pswitch_14
    iget-wide p0, p0, Ll1/m;->K:J

    return-wide p0

    :pswitch_15
    iget-wide p0, p0, Ll1/m;->c:J

    return-wide p0

    :pswitch_16
    iget-wide p0, p0, Ll1/m;->a:J

    return-wide p0

    :pswitch_17
    iget-wide p0, p0, Ll1/m;->B:J

    return-wide p0

    :pswitch_18
    iget-wide p0, p0, Ll1/m;->A:J

    return-wide p0

    :pswitch_19
    iget-wide p0, p0, Ll1/m;->V:J

    return-wide p0

    :pswitch_1a
    iget-wide p0, p0, Ll1/m;->U:J

    return-wide p0

    :pswitch_1b
    iget-wide p0, p0, Ll1/m;->m:J

    return-wide p0

    :pswitch_1c
    iget-wide p0, p0, Ll1/m;->k:J

    return-wide p0

    :pswitch_1d
    iget-wide p0, p0, Ll1/m;->s:J

    return-wide p0

    :pswitch_1e
    iget-wide p0, p0, Ll1/m;->q:J

    return-wide p0

    :pswitch_1f
    iget-wide p0, p0, Ll1/m;->R:J

    return-wide p0

    :pswitch_20
    iget-wide p0, p0, Ll1/m;->Q:J

    return-wide p0

    :pswitch_21
    iget-wide p0, p0, Ll1/m;->i:J

    return-wide p0

    :pswitch_22
    iget-wide p0, p0, Ll1/m;->g:J

    return-wide p0

    :pswitch_23
    iget-wide p0, p0, Ll1/m;->N:J

    return-wide p0

    :pswitch_24
    iget-wide p0, p0, Ll1/m;->M:J

    return-wide p0

    :pswitch_25
    iget-wide p0, p0, Ll1/m;->d:J

    return-wide p0

    :pswitch_26
    iget-wide p0, p0, Ll1/m;->b:J

    return-wide p0

    :pswitch_27
    iget-wide p0, p0, Ll1/m;->z:J

    return-wide p0

    :pswitch_28
    iget-wide p0, p0, Ll1/m;->x:J

    return-wide p0

    :pswitch_29
    iget-wide p0, p0, Ll1/m;->o:J

    return-wide p0

    :pswitch_2a
    iget-wide p0, p0, Ll1/m;->u:J

    return-wide p0

    :pswitch_2b
    iget-wide p0, p0, Ll1/m;->e:J

    return-wide p0

    :pswitch_2c
    iget-wide p0, p0, Ll1/m;->v:J

    return-wide p0

    :pswitch_2d
    iget-wide p0, p0, Ll1/m;->y:J

    return-wide p0

    :pswitch_2e
    iget-wide p0, p0, Ll1/m;->w:J

    return-wide p0

    :pswitch_2f
    iget-wide p0, p0, Ll1/m;->n:J

    return-wide p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final d(Lo1/f;Landroidx/compose/runtime/Composer;)J
    .locals 1

    sget-object v0, Ll1/n;->a:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/m;

    invoke-static {p1, p0}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide p0

    return-wide p0
.end method
