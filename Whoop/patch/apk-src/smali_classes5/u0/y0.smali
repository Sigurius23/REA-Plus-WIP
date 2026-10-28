.class public final Lu0/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu0/y0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(IJJ)Lu0/e;
    .locals 7

    and-int/lit8 v0, p0, 0x1

    if-eqz v0, :cond_0

    sget-wide p1, Lu0/a1;->a:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    sget-wide p3, Lu0/a1;->b:J

    :cond_1
    move-wide v3, p3

    const-wide/high16 p0, 0x3fd0000000000000L    # 0.25

    invoke-static {p0, p1}, Lv63/c;->g(D)J

    move-result-wide v5

    new-instance v0, Lu0/e;

    invoke-direct/range {v0 .. v6}, Lu0/e;-><init>(JJJ)V

    return-object v0
.end method


# virtual methods
.method public b(Landroid/view/KeyEvent;)Lu0/k0;
    .locals 6

    iget v0, p0, Lu0/y0;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->i:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lu0/k0;->q0:Lu0/k0;

    goto :goto_0

    :cond_0
    sget-wide v4, Lu0/w0;->j:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lu0/k0;->r0:Lu0/k0;

    goto :goto_0

    :cond_1
    sget-wide v4, Lu0/w0;->k:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lu0/k0;->i0:Lu0/k0;

    goto :goto_0

    :cond_2
    sget-wide v4, Lu0/w0;->l:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lu0/k0;->j0:Lu0/k0;

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->i:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lu0/k0;->J:Lu0/k0;

    goto :goto_0

    :cond_5
    sget-wide v4, Lu0/w0;->j:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lu0/k0;->K:Lu0/k0;

    goto :goto_0

    :cond_6
    sget-wide v4, Lu0/w0;->k:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lu0/k0;->Q:Lu0/k0;

    goto :goto_0

    :cond_7
    sget-wide v4, Lu0/w0;->l:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lu0/k0;->R:Lu0/k0;

    :goto_0
    if-nez v0, :cond_19

    sget-object v0, Lu0/m0;->a:Lty/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-static {v2}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->i:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v1, Lu0/k0;->k0:Lu0/k0;

    goto/16 :goto_1

    :cond_8
    sget-wide v4, Lu0/w0;->j:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v1, Lu0/k0;->l0:Lu0/k0;

    goto/16 :goto_1

    :cond_9
    sget-wide v4, Lu0/w0;->k:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v1, Lu0/k0;->n0:Lu0/k0;

    goto/16 :goto_1

    :cond_a
    sget-wide v4, Lu0/w0;->l:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_17

    sget-object v1, Lu0/k0;->m0:Lu0/k0;

    goto/16 :goto_1

    :cond_b
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-static {v2}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->i:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v1, Lu0/k0;->E:Lu0/k0;

    goto/16 :goto_1

    :cond_c
    sget-wide v4, Lu0/w0;->j:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v1, Lu0/k0;->z:Lu0/k0;

    goto/16 :goto_1

    :cond_d
    sget-wide v4, Lu0/w0;->k:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v1, Lu0/k0;->G:Lu0/k0;

    goto/16 :goto_1

    :cond_e
    sget-wide v4, Lu0/w0;->l:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v1, Lu0/k0;->F:Lu0/k0;

    goto/16 :goto_1

    :cond_f
    sget-wide v4, Lu0/w0;->c:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_10

    sget-object v1, Lu0/k0;->V:Lu0/k0;

    goto/16 :goto_1

    :cond_10
    sget-wide v4, Lu0/w0;->v:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_11

    sget-object v1, Lu0/k0;->Y:Lu0/k0;

    goto :goto_1

    :cond_11
    sget-wide v4, Lu0/w0;->u:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v1, Lu0/k0;->X:Lu0/k0;

    goto :goto_1

    :cond_12
    sget-wide v4, Lu0/w0;->h:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_17

    sget-object v1, Lu0/k0;->s0:Lu0/k0;

    goto :goto_1

    :cond_13
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-static {v2}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->p:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_14

    sget-object v1, Lu0/k0;->o0:Lu0/k0;

    goto :goto_1

    :cond_14
    sget-wide v4, Lu0/w0;->q:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_17

    sget-object v1, Lu0/k0;->p0:Lu0/k0;

    goto :goto_1

    :cond_15
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-static {v2}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->u:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_16

    sget-object v1, Lu0/k0;->Z:Lu0/k0;

    goto :goto_1

    :cond_16
    sget-wide v4, Lu0/w0;->v:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_17

    sget-object v1, Lu0/k0;->a0:Lu0/k0;

    :cond_17
    :goto_1
    if-nez v1, :cond_18

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lu0/y0;

    invoke-virtual {v0, p1}, Lu0/y0;->b(Landroid/view/KeyEvent;)Lu0/k0;

    move-result-object p1

    move-object v0, p1

    goto :goto_2

    :cond_18
    move-object v0, v1

    :cond_19
    :goto_2
    return-object v0

    :pswitch_0
    sget v0, Lu0/l0;->w:I

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->g:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_3c

    sget-object v1, Lu0/k0;->w0:Lu0/k0;

    goto/16 :goto_5

    :cond_1a
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->b:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_20

    sget-wide v4, Lu0/w0;->r:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1b

    goto :goto_3

    :cond_1b
    sget-wide v4, Lu0/w0;->d:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1c

    sget-object v1, Lu0/k0;->T:Lu0/k0;

    goto/16 :goto_5

    :cond_1c
    sget-wide v4, Lu0/w0;->f:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1d

    sget-object v1, Lu0/k0;->U:Lu0/k0;

    goto/16 :goto_5

    :cond_1d
    sget-wide v4, Lu0/w0;->a:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1e

    sget-object v1, Lu0/k0;->b0:Lu0/k0;

    goto/16 :goto_5

    :cond_1e
    sget-wide v4, Lu0/w0;->e:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1f

    sget-object v1, Lu0/k0;->w0:Lu0/k0;

    goto/16 :goto_5

    :cond_1f
    sget-wide v4, Lu0/w0;->g:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_3c

    sget-object v1, Lu0/k0;->v0:Lu0/k0;

    goto/16 :goto_5

    :cond_20
    :goto_3
    sget-object v1, Lu0/k0;->S:Lu0/k0;

    goto/16 :goto_5

    :cond_21
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-eqz v0, :cond_22

    goto/16 :goto_5

    :cond_22
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->i:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_23

    sget-object v1, Lu0/k0;->c0:Lu0/k0;

    goto/16 :goto_5

    :cond_23
    sget-wide v4, Lu0/w0;->j:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_24

    sget-object v1, Lu0/k0;->d0:Lu0/k0;

    goto/16 :goto_5

    :cond_24
    sget-wide v4, Lu0/w0;->k:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_25

    sget-object v1, Lu0/k0;->e0:Lu0/k0;

    goto/16 :goto_5

    :cond_25
    sget-wide v4, Lu0/w0;->l:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_26

    sget-object v1, Lu0/k0;->f0:Lu0/k0;

    goto/16 :goto_5

    :cond_26
    sget-wide v4, Lu0/w0;->n:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_27

    sget-object v1, Lu0/k0;->g0:Lu0/k0;

    goto/16 :goto_5

    :cond_27
    sget-wide v4, Lu0/w0;->o:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_28

    sget-object v1, Lu0/k0;->h0:Lu0/k0;

    goto/16 :goto_5

    :cond_28
    sget-wide v4, Lu0/w0;->p:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_29

    sget-object v1, Lu0/k0;->o0:Lu0/k0;

    goto/16 :goto_5

    :cond_29
    sget-wide v4, Lu0/w0;->q:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2a

    sget-object v1, Lu0/k0;->p0:Lu0/k0;

    goto/16 :goto_5

    :cond_2a
    sget-wide v4, Lu0/w0;->r:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_3c

    sget-object v1, Lu0/k0;->T:Lu0/k0;

    goto/16 :goto_5

    :cond_2b
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Ls2/h;->b(I)J

    move-result-wide v2

    sget-wide v4, Lu0/w0;->i:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2c

    sget-object v1, Lu0/k0;->x:Lu0/k0;

    goto/16 :goto_5

    :cond_2c
    sget-wide v4, Lu0/w0;->j:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2d

    sget-object v1, Lu0/k0;->y:Lu0/k0;

    goto/16 :goto_5

    :cond_2d
    sget-wide v4, Lu0/w0;->k:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2e

    sget-object v1, Lu0/k0;->L:Lu0/k0;

    goto/16 :goto_5

    :cond_2e
    sget-wide v4, Lu0/w0;->l:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2f

    sget-object v1, Lu0/k0;->M:Lu0/k0;

    goto/16 :goto_5

    :cond_2f
    sget-wide v4, Lu0/w0;->m:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_30

    sget-object v1, Lu0/k0;->N:Lu0/k0;

    goto/16 :goto_5

    :cond_30
    sget-wide v4, Lu0/w0;->n:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_31

    sget-object v1, Lu0/k0;->O:Lu0/k0;

    goto/16 :goto_5

    :cond_31
    sget-wide v4, Lu0/w0;->o:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_32

    sget-object v1, Lu0/k0;->P:Lu0/k0;

    goto/16 :goto_5

    :cond_32
    sget-wide v4, Lu0/w0;->p:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_33

    sget-object v1, Lu0/k0;->H:Lu0/k0;

    goto :goto_5

    :cond_33
    sget-wide v4, Lu0/w0;->q:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_34

    sget-object v1, Lu0/k0;->I:Lu0/k0;

    goto :goto_5

    :cond_34
    sget-wide v4, Lu0/w0;->s:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_3b

    sget-wide v4, Lu0/w0;->t:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_35

    goto :goto_4

    :cond_35
    sget-wide v4, Lu0/w0;->u:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_36

    sget-object v1, Lu0/k0;->V:Lu0/k0;

    goto :goto_5

    :cond_36
    sget-wide v4, Lu0/w0;->v:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_37

    sget-object v1, Lu0/k0;->W:Lu0/k0;

    goto :goto_5

    :cond_37
    sget-wide v4, Lu0/w0;->w:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_38

    sget-object v1, Lu0/k0;->T:Lu0/k0;

    goto :goto_5

    :cond_38
    sget-wide v4, Lu0/w0;->x:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_39

    sget-object v1, Lu0/k0;->U:Lu0/k0;

    goto :goto_5

    :cond_39
    sget-wide v4, Lu0/w0;->y:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_3a

    sget-object v1, Lu0/k0;->S:Lu0/k0;

    goto :goto_5

    :cond_3a
    sget-wide v4, Lu0/w0;->z:J

    invoke-static {v2, v3, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_3c

    sget-object v1, Lu0/k0;->u0:Lu0/k0;

    goto :goto_5

    :cond_3b
    :goto_4
    sget-object v1, Lu0/k0;->t0:Lu0/k0;

    :cond_3c
    :goto_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
