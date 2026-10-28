.class public abstract La2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb3/d;
.implements Log/g;
.implements Lrm/b1;
.implements Lu8/j0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, La2/a;->w:I

    packed-switch p1, :pswitch_data_0

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    return-void

    .line 7
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Lu8/n0;

    invoke-direct {p1}, Lu8/n0;-><init>()V

    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    return-void

    .line 9
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Lrm/n1;

    invoke-direct {p1}, Lrm/n1;-><init>()V

    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    return-void

    .line 11
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object p1, La0/t;->a:La0/g0;

    .line 13
    new-instance p1, La0/g0;

    invoke-direct {p1}, La0/g0;-><init>()V

    .line 14
    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Lgf/e;

    invoke-direct {p1}, Lgf/e;-><init>()V

    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La2/a;->w:I

    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Llb3/y;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La2/a;->w:I

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La2/a;->x:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, La2/a;->b(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic b(I)V
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue"

    const/4 v5, 0x0

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    const-string v6, "receiverType"

    aput-object v6, v3, v5

    goto :goto_2

    :cond_2
    aput-object v4, v3, v5

    :goto_2
    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_3

    aput-object v4, v3, v1

    goto :goto_3

    :cond_3
    const-string v4, "getOriginal"

    aput-object v4, v3, v1

    goto :goto_3

    :cond_4
    const-string v4, "getType"

    aput-object v4, v3, v1

    :goto_3
    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    const-string v4, "<init>"

    aput-object v4, v3, v0

    :cond_5
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0
.end method


# virtual methods
.method public A(I)Z
    .locals 1

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-object v0, v0, Lb9/f0;->p0:Lu8/f0;

    iget-object v0, v0, Lu8/f0;->a:Lu8/n;

    iget-object v0, v0, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1

    :pswitch_0
    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v0, v0, Lrm/u;->o0:Lrm/x0;

    iget-object v0, v0, Lrm/x0;->w:Llo/f;

    iget-object v0, v0, Llo/f;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public B()Z
    .locals 5

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lu8/n0;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v0

    iget-boolean v0, v0, Lu8/n0;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lrm/n1;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v0

    iget-boolean v0, v0, Lrm/n1;->I:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public C()Z
    .locals 5

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lu8/n0;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v0

    invoke-virtual {v0}, Lu8/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lrm/n1;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v0

    invoke-virtual {v0}, Lrm/n1;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public D()Z
    .locals 5

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lu8/n0;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v0

    iget-boolean v0, v0, Lu8/n0;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lrm/n1;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object v0

    iget-boolean v0, v0, Lrm/n1;->H:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public E(Lp1/n0;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public F()V
    .locals 3

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-wide v0, v0, Lb9/f0;->W:J

    neg-long v0, v0

    const/16 v2, 0xb

    invoke-virtual {p0, v2, v0, v1}, La2/a;->K(IJ)V

    return-void
.end method

.method public G()V
    .locals 3

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-wide v0, v0, Lb9/f0;->X:J

    const/16 v2, 0xc

    invoke-virtual {p0, v2, v0, v1}, La2/a;->K(IJ)V

    return-void
.end method

.method public abstract H(IJZ)V
.end method

.method public I(J)V
    .locals 2

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, La2/a;->H(IJZ)V

    return-void
.end method

.method public J()V
    .locals 10

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v0}, Lb9/f0;->l0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v6, v0, Lb9/f0;->h0:I

    if-ne v6, v4, :cond_2

    move v6, v5

    :cond_2
    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-boolean v7, v0, Lb9/f0;->i0:Z

    invoke-virtual {v1, v2, v6, v7}, Lu8/o0;->e(IIZ)I

    move-result v1

    :goto_0
    if-eq v1, v3, :cond_3

    move v1, v4

    goto :goto_1

    :cond_3
    move v1, v5

    :goto_1
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-eqz v2, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v8, v0, Lb9/f0;->h0:I

    if-ne v8, v4, :cond_5

    move v8, v5

    :cond_5
    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-boolean v9, v0, Lb9/f0;->i0:Z

    invoke-virtual {v1, v2, v8, v9}, Lu8/o0;->e(IIZ)I

    move-result v1

    :goto_2
    if-ne v1, v3, :cond_6

    invoke-virtual {p0}, La2/a;->z()V

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    if-ne v1, v2, :cond_7

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    invoke-virtual {p0, v0, v6, v7, v4}, La2/a;->H(IJZ)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0, v1, v6, v7, v5}, La2/a;->H(IJZ)V

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, La2/a;->C()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, La2/a;->B()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    invoke-virtual {p0, v0, v6, v7, v5}, La2/a;->H(IJZ)V

    goto :goto_4

    :cond_9
    invoke-virtual {p0}, La2/a;->z()V

    goto :goto_4

    :cond_a
    :goto_3
    invoke-virtual {p0}, La2/a;->z()V

    :goto_4
    return-void

    :pswitch_0
    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v1

    if-nez v1, :cond_12

    invoke-virtual {v0}, Lrm/u;->i0()Z

    move-result v1

    if-eqz v1, :cond_b

    goto/16 :goto_9

    :cond_b
    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eqz v2, :cond_c

    move v1, v5

    goto :goto_5

    :cond_c
    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v2

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget v6, v0, Lrm/u;->g0:I

    if-ne v6, v3, :cond_d

    move v6, v4

    :cond_d
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-boolean v7, v0, Lrm/u;->h0:Z

    invoke-virtual {v1, v2, v6, v7}, Lrm/o1;->e(IIZ)I

    move-result v1

    :goto_5
    if-eq v1, v5, :cond_e

    move v1, v3

    goto :goto_6

    :cond_e
    move v1, v4

    :goto_6
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_11

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    if-eqz v2, :cond_f

    move v1, v5

    goto :goto_8

    :cond_f
    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v2

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget v8, v0, Lrm/u;->g0:I

    if-ne v8, v3, :cond_10

    goto :goto_7

    :cond_10
    move v4, v8

    :goto_7
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-boolean v3, v0, Lrm/u;->h0:Z

    invoke-virtual {v1, v2, v4, v3}, Lrm/o1;->e(IIZ)I

    move-result v1

    :goto_8
    if-eq v1, v5, :cond_12

    invoke-virtual {v0, v1, v6, v7}, Lrm/u;->q0(IJ)V

    goto :goto_9

    :cond_11
    invoke-virtual {p0}, La2/a;->C()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {p0}, La2/a;->B()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v1

    invoke-virtual {v0, v1, v6, v7}, Lrm/u;->q0(IJ)V

    :cond_12
    :goto_9
    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public K(IJ)V
    .locals 4

    move-object p1, p0

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->a0()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-virtual {p1}, Lb9/f0;->f0()J

    move-result-wide p2

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p2, v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_0
    const-wide/16 p2, 0x0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    invoke-virtual {p1}, Lb9/f0;->Z()I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, La2/a;->H(IJZ)V

    return-void
.end method

.method public L(J)V
    .locals 9

    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->Z()J

    move-result-wide v1

    add-long/2addr v1, p1

    invoke-virtual {v0}, Lrm/u;->B0()V

    invoke-virtual {v0}, Lrm/u;->i0()Z

    move-result p1

    const-wide/16 v3, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p1, :cond_0

    iget-object p1, v0, Lrm/u;->K0:Lrm/v0;

    iget-object p2, p1, Lrm/v0;->b:Lsn/v;

    iget-object p1, p1, Lrm/v0;->a:Lrm/o1;

    iget-object v7, p2, Lsn/t;->a:Ljava/lang/Object;

    iget-object v8, v0, Lrm/u;->O:Lrm/m1;

    invoke-virtual {p1, v7, v8}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget p1, p2, Lsn/t;->b:I

    iget p2, p2, Lsn/t;->c:I

    invoke-virtual {v8, p1, p2}, Lrm/m1;->a(II)J

    move-result-wide p1

    invoke-static {p1, p2}, Llo/y;->G(J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object p1

    invoke-virtual {p1}, Lrm/o1;->p()Z

    move-result p2

    if-eqz p2, :cond_1

    move-wide p1, v5

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result p2

    iget-object v7, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v7, Lrm/n1;

    invoke-virtual {p1, p2, v7, v3, v4}, Lrm/o1;->m(ILrm/n1;J)Lrm/n1;

    move-result-object p1

    iget-wide p1, p1, Lrm/n1;->N:J

    invoke-static {p1, p2}, Llo/y;->G(J)J

    move-result-wide p1

    :goto_0
    cmp-long v5, p1, v5

    if-eqz v5, :cond_2

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :cond_2
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v1

    invoke-virtual {v0, v1, p1, p2}, Lrm/u;->q0(IJ)V

    return-void
.end method

.method public M()V
    .locals 10

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v0}, Lb9/f0;->l0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v6, v0, Lb9/f0;->h0:I

    if-ne v6, v4, :cond_2

    move v6, v5

    :cond_2
    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-boolean v7, v0, Lb9/f0;->i0:Z

    invoke-virtual {v1, v2, v6, v7}, Lu8/o0;->k(IIZ)I

    move-result v1

    :goto_0
    if-eq v1, v3, :cond_3

    move v1, v4

    goto :goto_1

    :cond_3
    move v1, v5

    :goto_1
    invoke-virtual {p0}, La2/a;->C()Z

    move-result v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_9

    invoke-virtual {p0}, La2/a;->D()Z

    move-result v2

    if-nez v2, :cond_9

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-eqz v2, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v8, v0, Lb9/f0;->h0:I

    if-ne v8, v4, :cond_5

    move v8, v5

    :cond_5
    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-boolean v9, v0, Lb9/f0;->i0:Z

    invoke-virtual {v1, v2, v8, v9}, Lu8/o0;->k(IIZ)I

    move-result v1

    :goto_2
    if-ne v1, v3, :cond_6

    invoke-virtual {p0}, La2/a;->z()V

    goto/16 :goto_5

    :cond_6
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    if-ne v1, v2, :cond_7

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    invoke-virtual {p0, v0, v6, v7, v4}, La2/a;->H(IJZ)V

    goto :goto_5

    :cond_7
    invoke-virtual {p0, v1, v6, v7, v5}, La2/a;->H(IJZ)V

    goto :goto_5

    :cond_8
    invoke-virtual {p0}, La2/a;->z()V

    goto :goto_5

    :cond_9
    if-eqz v1, :cond_e

    invoke-virtual {v0}, Lb9/f0;->a0()J

    move-result-wide v1

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-wide v8, v0, Lb9/f0;->Y:J

    cmp-long v1, v1, v8

    if-gtz v1, :cond_e

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-eqz v2, :cond_a

    move v1, v3

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v8, v0, Lb9/f0;->h0:I

    if-ne v8, v4, :cond_b

    move v8, v5

    :cond_b
    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-boolean v9, v0, Lb9/f0;->i0:Z

    invoke-virtual {v1, v2, v8, v9}, Lu8/o0;->k(IIZ)I

    move-result v1

    :goto_3
    if-ne v1, v3, :cond_c

    invoke-virtual {p0}, La2/a;->z()V

    goto :goto_5

    :cond_c
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v2

    if-ne v1, v2, :cond_d

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    invoke-virtual {p0, v0, v6, v7, v4}, La2/a;->H(IJZ)V

    goto :goto_5

    :cond_d
    invoke-virtual {p0, v1, v6, v7, v5}, La2/a;->H(IJZ)V

    goto :goto_5

    :cond_e
    const-wide/16 v1, 0x0

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    invoke-virtual {p0, v0, v1, v2, v5}, La2/a;->H(IJZ)V

    goto :goto_5

    :cond_f
    :goto_4
    invoke-virtual {p0}, La2/a;->z()V

    :goto_5
    return-void

    :pswitch_0
    move-object v0, p0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v1

    if-nez v1, :cond_1a

    invoke-virtual {v0}, Lrm/u;->i0()Z

    move-result v1

    if-eqz v1, :cond_10

    goto/16 :goto_c

    :cond_10
    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_11

    move v1, v3

    goto :goto_6

    :cond_11
    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v2

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget v6, v0, Lrm/u;->g0:I

    if-ne v6, v4, :cond_12

    move v6, v5

    :cond_12
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-boolean v7, v0, Lrm/u;->h0:Z

    invoke-virtual {v1, v2, v6, v7}, Lrm/o1;->k(IIZ)I

    move-result v1

    :goto_6
    if-eq v1, v3, :cond_13

    move v1, v4

    goto :goto_7

    :cond_13
    move v1, v5

    :goto_7
    invoke-virtual {p0}, La2/a;->C()Z

    move-result v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_16

    invoke-virtual {p0}, La2/a;->D()Z

    move-result v2

    if-nez v2, :cond_16

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    if-eqz v2, :cond_14

    move v1, v3

    goto :goto_9

    :cond_14
    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v2

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget v8, v0, Lrm/u;->g0:I

    if-ne v8, v4, :cond_15

    goto :goto_8

    :cond_15
    move v5, v8

    :goto_8
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-boolean v4, v0, Lrm/u;->h0:Z

    invoke-virtual {v1, v2, v5, v4}, Lrm/o1;->k(IIZ)I

    move-result v1

    :goto_9
    if-eq v1, v3, :cond_1a

    invoke-virtual {v0, v1, v6, v7}, Lrm/u;->q0(IJ)V

    goto :goto_c

    :cond_16
    if-eqz v1, :cond_19

    invoke-virtual {v0}, Lrm/u;->Z()J

    move-result-wide v1

    invoke-virtual {v0}, Lrm/u;->B0()V

    const-wide/16 v8, 0xbb8

    cmp-long v1, v1, v8

    if-gtz v1, :cond_19

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    if-eqz v2, :cond_17

    move v1, v3

    goto :goto_b

    :cond_17
    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v2

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget v8, v0, Lrm/u;->g0:I

    if-ne v8, v4, :cond_18

    goto :goto_a

    :cond_18
    move v5, v8

    :goto_a
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-boolean v4, v0, Lrm/u;->h0:Z

    invoke-virtual {v1, v2, v5, v4}, Lrm/o1;->k(IIZ)I

    move-result v1

    :goto_b
    if-eq v1, v3, :cond_1a

    invoke-virtual {v0, v1, v6, v7}, Lrm/u;->q0(IJ)V

    goto :goto_c

    :cond_19
    const-wide/16 v1, 0x0

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v3

    invoke-virtual {v0, v3, v1, v2}, Lrm/u;->q0(IJ)V

    :cond_1a
    :goto_c
    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public N(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p2}, La2/a;->q(ILjava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public O(Lrm/k0;)V
    .locals 17

    invoke-static/range {p1 .. p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrm/k0;

    iget-object v6, v1, Lrm/u;->R:Lsn/u;

    invoke-interface {v6, v5}, Lsn/u;->a(Lrm/k0;)Lsn/a;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lrm/u;->B0()V

    invoke-virtual {v1}, Lrm/u;->c0()I

    invoke-virtual {v1}, Lrm/u;->Z()J

    iget v0, v1, Lrm/u;->i0:I

    const/4 v4, 0x1

    add-int/2addr v0, v4

    iput v0, v1, Lrm/u;->i0:I

    iget-object v0, v1, Lrm/u;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v6, v5, -0x1

    :goto_1
    if-ltz v6, :cond_1

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_1
    iget-object v6, v1, Lrm/u;->n0:Lsn/u0;

    iget-object v7, v6, Lsn/u0;->b:[I

    array-length v8, v7

    sub-int/2addr v8, v5

    new-array v8, v8, [I

    move v9, v3

    move v10, v9

    :goto_2
    array-length v11, v7

    if-ge v9, v11, :cond_4

    aget v11, v7, v9

    if-ltz v11, :cond_2

    if-ge v11, v5, :cond_2

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_2
    sub-int v12, v9, v10

    if-ltz v11, :cond_3

    sub-int/2addr v11, v5

    :cond_3
    aput v11, v8, v12

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    new-instance v5, Lsn/u0;

    new-instance v7, Ljava/util/Random;

    iget-object v6, v6, Lsn/u0;->a:Ljava/util/Random;

    invoke-virtual {v6}, Ljava/util/Random;->nextLong()J

    move-result-wide v9

    invoke-direct {v7, v9, v10}, Ljava/util/Random;-><init>(J)V

    invoke-direct {v5, v8, v7}, Lsn/u0;-><init>([ILjava/util/Random;)V

    iput-object v5, v1, Lrm/u;->n0:Lsn/u0;

    :cond_5
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move v5, v3

    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_6

    new-instance v6, Lrm/t0;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lsn/a;

    iget-boolean v8, v1, Lrm/u;->Q:Z

    invoke-direct {v6, v7, v8}, Lrm/t0;-><init>(Lsn/a;Z)V

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lrm/t;

    iget-object v8, v6, Lrm/t0;->a:Lsn/q;

    iget-object v8, v8, Lsn/q;->o:Lsn/o;

    iget-object v6, v6, Lrm/t0;->b:Ljava/lang/Object;

    invoke-direct {v7, v6, v8}, Lrm/t;-><init>(Ljava/lang/Object;Lrm/o1;)V

    invoke-virtual {v0, v5, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    iget-object v2, v1, Lrm/u;->n0:Lsn/u0;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Lsn/u0;->a(I)Lsn/u0;

    move-result-object v2

    iput-object v2, v1, Lrm/u;->n0:Lsn/u0;

    new-instance v5, Lrm/e1;

    invoke-direct {v5, v0, v2}, Lrm/e1;-><init>(Ljava/util/ArrayList;Lsn/u0;)V

    invoke-virtual {v5}, Lrm/o1;->p()Z

    move-result v0

    const/4 v2, -0x1

    iget v6, v5, Lrm/e1;->z:I

    if-nez v0, :cond_8

    if-ge v2, v6, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Lcom/google/android/exoplayer2/IllegalSeekPositionException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_8
    :goto_5
    iget-boolean v0, v1, Lrm/u;->h0:Z

    invoke-virtual {v5, v0}, Lrm/e1;->a(Z)I

    move-result v14

    iget-object v0, v1, Lrm/u;->K0:Lrm/v0;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v1, v5, v14, v7, v8}, Lrm/u;->k0(Lrm/o1;IJ)Landroid/util/Pair;

    move-result-object v9

    invoke-virtual {v1, v0, v5, v9}, Lrm/u;->j0(Lrm/v0;Lrm/o1;Landroid/util/Pair;)Lrm/v0;

    move-result-object v0

    iget v9, v0, Lrm/v0;->e:I

    if-eq v14, v2, :cond_b

    if-eq v9, v4, :cond_b

    invoke-virtual {v5}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_a

    if-lt v14, v6, :cond_9

    goto :goto_6

    :cond_9
    const/4 v9, 0x2

    goto :goto_7

    :cond_a
    :goto_6
    const/4 v9, 0x4

    :cond_b
    :goto_7
    invoke-virtual {v0, v9}, Lrm/v0;->g(I)Lrm/v0;

    move-result-object v2

    invoke-static {v7, v8}, Llo/y;->z(J)J

    move-result-wide v15

    iget-object v13, v1, Lrm/u;->n0:Lsn/u0;

    iget-object v0, v1, Lrm/u;->L:Lrm/z;

    iget-object v0, v0, Lrm/z;->H:Llo/v;

    new-instance v11, Lrm/w;

    invoke-direct/range {v11 .. v16}, Lrm/w;-><init>(Ljava/util/ArrayList;Lsn/u0;IJ)V

    const/16 v5, 0x11

    invoke-virtual {v0, v5, v11}, Llo/v;->a(ILjava/lang/Object;)Llo/u;

    move-result-object v0

    invoke-virtual {v0}, Llo/u;->b()V

    iget-object v0, v1, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    iget-object v0, v0, Lsn/t;->a:Ljava/lang/Object;

    iget-object v5, v2, Lrm/v0;->b:Lsn/v;

    iget-object v5, v5, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, v1, Lrm/u;->K0:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v0

    if-nez v0, :cond_c

    move v6, v4

    goto :goto_8

    :cond_c
    move v6, v3

    :goto_8
    invoke-virtual {v1, v2}, Lrm/u;->a0(Lrm/v0;)J

    move-result-wide v8

    const/4 v10, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x4

    invoke-virtual/range {v1 .. v10}, Lrm/u;->z0(Lrm/v0;IIZZIJI)V

    return-void
.end method

.method public P(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, v1}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public abstract c(Ld/l;)Ld/b1;
.end method

.method public d(Ld/d0;)Ld/b1;
    .locals 5

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    iget v1, p1, Ld/d0;->b:I

    iget v2, p1, Ld/d0;->a:I

    const/16 v3, 0x80

    if-ne v1, v3, :cond_6

    const/4 v1, 0x1

    if-eq v1, v2, :cond_5

    iget-object v1, p1, Ld/d0;->d:Ld/q;

    invoke-interface {v1}, Ld/q;->d()Ld/b1;

    move-result-object v1

    const/4 v3, 0x3

    const-string v4, "unexpected object: "

    if-eq v2, v3, :cond_3

    const/4 p1, 0x4

    if-eq v2, p1, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    instance-of p1, v1, Ld/h1;

    if-eqz p1, :cond_2

    check-cast v1, Ld/h1;

    invoke-virtual {p0, v1}, La2/a;->e(Ld/h1;)Ld/b1;

    move-result-object v1

    goto :goto_1

    :cond_2
    check-cast v1, Ld/l;

    invoke-virtual {p0, v1}, La2/a;->c(Ld/l;)Ld/b1;

    move-result-object v1

    goto :goto_1

    :cond_3
    iget p1, p1, Ld/d0;->e:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ld/x;

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, Ld/x;-><init>(Ld/b1;I)V

    const/4 v1, -0x1

    iput v1, p1, Ld/x;->c:I

    goto :goto_0

    :pswitch_0
    new-instance p1, Ld/e0;

    invoke-direct {p1, v1}, Ld/h1;-><init>(Ld/b1;)V

    goto :goto_0

    :pswitch_1
    new-instance p1, Ld/x;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2}, Ld/x;-><init>(Ld/b1;I)V

    const/4 v1, -0x1

    iput v1, p1, Ld/x;->c:I

    :goto_0
    invoke-virtual {p0, p1}, La2/a;->e(Ld/h1;)Ld/b1;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "object explicit - implicit expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/16 p1, 0x40

    if-eq v1, p1, :cond_9

    if-eq v1, v3, :cond_8

    const/16 p1, 0xc0

    if-eq v1, p1, :cond_7

    const-string p1, "UNIVERSAL"

    goto :goto_2

    :cond_7
    const-string p1, "PRIVATE"

    goto :goto_2

    :cond_8
    const-string p1, "CONTEXT"

    goto :goto_2

    :cond_9
    const-string p1, "APPLICATION"

    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected CONTEXT tag but found "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract e(Ld/h1;)Ld/b1;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, La2/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p2}, La2/a;->q(ILjava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getType()Llb3/y;
    .locals 1

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Llb3/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, La2/a;->b(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public h(Ljava/lang/String;Ljava/lang/Iterable;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    invoke-virtual {p0, v0, p1}, La2/a;->q(ILjava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    return-void
.end method

.method public i()V
    .locals 18

    move-object/from16 v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-object v1, v0, Lb9/f0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const v3, 0x7fffffff

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-lez v2, :cond_9

    if-nez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v2, v0, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {v0, v2}, Lb9/f0;->e0(Lb9/c1;)I

    move-result v7

    invoke-virtual {v0, v2}, Lb9/f0;->W(Lb9/c1;)J

    move-result-wide v4

    iget-object v13, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v15

    iget v6, v0, Lb9/f0;->j0:I

    const/4 v10, 0x1

    add-int/2addr v6, v10

    iput v6, v0, Lb9/f0;->j0:I

    invoke-virtual {v0, v3}, Lb9/f0;->t0(I)V

    new-instance v14, Lb9/h1;

    iget-object v6, v0, Lb9/f0;->n0:Ll9/c1;

    invoke-direct {v14, v1, v6}, Lb9/h1;-><init>(Ljava/util/ArrayList;Ll9/c1;)V

    invoke-virtual {v13}, Lu8/o0;->p()Z

    move-result v1

    const/4 v11, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v12, -0x1

    if-nez v1, :cond_1

    invoke-virtual {v14}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    move v1, v10

    move v6, v11

    move v10, v12

    goto :goto_0

    :cond_2
    iget-object v1, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v1, Lu8/n0;

    iget-object v6, v0, Lb9/f0;->P:Lu8/m0;

    move-wide/from16 v16, v8

    invoke-static {v4, v5}, Lx8/t;->J(J)J

    move-result-wide v8

    move-object v5, v1

    move-object v4, v13

    invoke-virtual/range {v4 .. v9}, Lu8/o0;->i(Lu8/n0;Lu8/m0;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v14, v5}, Lb9/h1;->b(Ljava/lang/Object;)I

    move-result v6

    if-eq v6, v12, :cond_3

    move-object v4, v1

    move v1, v10

    move v6, v11

    goto :goto_3

    :cond_3
    iget-object v1, v0, La2/a;->x:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lu8/n0;

    move v1, v10

    iget v10, v0, Lb9/f0;->h0:I

    move v6, v11

    iget-boolean v11, v0, Lb9/f0;->i0:Z

    iget-object v9, v0, Lb9/f0;->P:Lu8/m0;

    move-object v13, v4

    move v4, v12

    move-object v12, v5

    invoke-static/range {v8 .. v14}, Lb9/l0;->Q(Lu8/n0;Lu8/m0;IZLjava/lang/Object;Lu8/o0;Lu8/o0;)I

    move-result v5

    if-eq v5, v4, :cond_4

    iget-object v4, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v4, Lu8/n0;

    const-wide/16 v8, 0x0

    invoke-virtual {v14, v5, v4, v8, v9}, Lb9/h1;->m(ILu8/n0;J)Lu8/n0;

    iget-wide v8, v4, Lu8/n0;->l:J

    invoke-static {v8, v9}, Lx8/t;->U(J)J

    move-result-wide v8

    invoke-virtual {v0, v14, v5, v8, v9}, Lb9/f0;->o0(Lu8/o0;IJ)Landroid/util/Pair;

    move-result-object v4

    goto :goto_3

    :cond_4
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v0, v14, v4, v8, v9}, Lb9/f0;->o0(Lu8/o0;IJ)Landroid/util/Pair;

    move-result-object v4

    goto :goto_3

    :goto_0
    invoke-virtual {v13}, Lu8/o0;->p()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-virtual {v14}, Lu8/o0;->p()Z

    move-result v11

    if-eqz v11, :cond_5

    move v11, v1

    goto :goto_1

    :cond_5
    move v11, v6

    :goto_1
    if-eqz v11, :cond_6

    goto :goto_2

    :cond_6
    move v10, v7

    :goto_2
    if-eqz v11, :cond_7

    move-wide v4, v8

    :cond_7
    invoke-virtual {v0, v14, v10, v4, v5}, Lb9/f0;->o0(Lu8/o0;IJ)Landroid/util/Pair;

    move-result-object v4

    :goto_3
    invoke-virtual {v0, v2, v14, v4}, Lb9/f0;->n0(Lb9/c1;Lu8/o0;Landroid/util/Pair;)Lb9/c1;

    move-result-object v2

    iget v4, v2, Lb9/c1;->e:I

    if-eq v4, v1, :cond_8

    const/4 v5, 0x4

    if-eq v4, v5, :cond_8

    if-lez v3, :cond_8

    if-ne v3, v15, :cond_8

    iget-object v4, v2, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v4}, Lu8/o0;->o()I

    move-result v4

    if-lt v7, v4, :cond_8

    invoke-static {v2, v5}, Lb9/f0;->m0(Lb9/c1;I)Lb9/c1;

    move-result-object v2

    :cond_8
    iget-object v4, v0, Lb9/f0;->n0:Ll9/c1;

    iget-object v5, v0, Lb9/f0;->M:Lb9/l0;

    iget-object v5, v5, Lb9/l0;->H:Lx8/r;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx8/r;->b()Lx8/q;

    move-result-object v7

    iget-object v5, v5, Lx8/r;->a:Landroid/os/Handler;

    const/16 v8, 0x14

    invoke-virtual {v5, v8, v6, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    iput-object v3, v7, Lx8/q;->a:Landroid/os/Message;

    invoke-virtual {v7}, Lx8/q;->b()V

    iget-object v3, v2, Lb9/c1;->b:Ll9/c0;

    iget-object v3, v3, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v4, v0, Lb9/f0;->I0:Lb9/c1;

    iget-object v4, v4, Lb9/c1;->b:Ll9/c0;

    iget-object v4, v4, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v1

    invoke-virtual {v0, v2}, Lb9/f0;->b0(Lb9/c1;)J

    move-result-wide v5

    const/4 v7, -0x1

    const/4 v8, 0x0

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v4, 0x4

    invoke-virtual/range {v0 .. v8}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    :cond_9
    :goto_4
    return-void
.end method

.method public j(Log/b;)Z
    .locals 2

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Lfg3/b;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    invoke-interface {v0}, Lfg3/b;->e()Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-interface {v0}, Lfg3/b;->b()Z

    move-result p1

    return p1

    :cond_2
    invoke-interface {v0}, Lfg3/b;->d()Z

    move-result p1

    return p1

    :cond_3
    invoke-interface {v0}, Lfg3/b;->a()Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v0}, Lfg3/b;->p()Z

    move-result p1

    return p1
.end method

.method public n(Ljava/lang/Throwable;Lc93/a;)V
    .locals 2

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Lfg3/b;

    const-string v1, "msg"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Log/b;->x:Log/b;

    invoke-virtual {p0, v1}, La2/a;->j(Log/b;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2, p1}, Lfg3/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Lfg3/b;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public q(ILjava/lang/String;)Ljava/util/List;
    .locals 2

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public r()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/Throwable;Lc93/a;)V
    .locals 2

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Lfg3/b;

    const-string v1, "msg"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Log/b;->E:Log/b;

    invoke-virtual {p0, v1}, La2/a;->j(Log/b;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2, p1}, Lfg3/b;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Lfg3/b;->s(Ljava/lang/String;)V

    return-void
.end method

.method public t(Lp1/n0;Ljava/lang/Object;)Z
    .locals 6

    iget-object p1, p1, Lp1/n0;->a:Ljava/util/ArrayList;

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lp1/a;

    if-eqz v5, :cond_1

    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_1
    instance-of v5, v4, Lp1/n0;

    if-eqz v5, :cond_3

    check-cast v4, Lp1/n0;

    invoke-virtual {p0, v4, p2}, La2/a;->t(Lp1/n0;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    return v0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected child source info "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return v2
.end method

.method public u(Ljava/lang/Throwable;Lc93/a;)V
    .locals 2

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Lfg3/b;

    const-string v1, "msg"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Log/b;->z:Log/b;

    invoke-virtual {p0, v1}, La2/a;->j(Log/b;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2, p1}, Lfg3/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Lfg3/b;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public v(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract w(IIJI)Lp0/e0;
.end method

.method public x()J
    .locals 5

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    iget-object v2, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Lu8/n0;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v0

    iget-wide v0, v0, Lu8/n0;->m:J

    invoke-static {v0, v1}, Lx8/t;->U(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public y(Lp0/d0;IJ)Ljava/util/List;
    .locals 5

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, La0/g0;

    invoke-virtual {v0, p2}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1, p2}, Lp0/d0;->a(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    invoke-interface {v4, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p2, v2}, La0/g0;->h(ILjava/lang/Object;)V

    return-object v2
.end method

.method public z()V
    .locals 1

    move-object v0, p0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    return-void
.end method
