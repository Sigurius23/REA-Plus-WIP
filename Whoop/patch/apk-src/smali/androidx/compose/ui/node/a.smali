.class public final Landroidx/compose/ui/node/a;
.super Landroidx/compose/ui/node/NodeCoordinator;
.source "SourceFile"


# static fields
.field public static final r0:Li2/h;


# instance fields
.field public final p0:La3/l2;

.field public q0:La3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object v0

    sget-wide v1, Li2/x;->g:J

    invoke-virtual {v0, v1, v2}, Li2/h;->e(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Li2/h;->l(F)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li2/h;->m(I)V

    sput-object v0, Landroidx/compose/ui/node/a;->r0:Li2/h;

    return-void
.end method

.method public constructor <init>(La3/n0;)V
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;-><init>(La3/n0;)V

    new-instance v0, La3/l2;

    invoke-direct {v0}, Lb2/v;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lb2/v;->z:I

    iput-object v0, p0, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iput-object p0, v0, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object p1, p1, La3/n0;->G:La3/n0;

    if-eqz p1, :cond_0

    new-instance p1, La3/w;

    invoke-direct {p1, p0}, La3/x0;-><init>(Landroidx/compose/ui/node/NodeCoordinator;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/node/a;->q0:La3/w;

    return-void
.end method


# virtual methods
.method public final C(I)I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->b(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final F0(Ly2/a;)I
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La3/w;->F0(Ly2/a;)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-object v1, v0, La3/g1;->Y:La3/o0;

    iget-boolean v2, v0, La3/g1;->M:Z

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iget-object v2, v0, La3/g1;->F:La3/r0;

    iget-object v2, v2, La3/r0;->d:La3/h0;

    sget-object v4, La3/h0;->w:La3/h0;

    if-ne v2, v4, :cond_1

    iput-boolean v3, v1, La3/a;->f:Z

    iget-boolean v2, v1, La3/a;->b:Z

    if-eqz v2, :cond_2

    iput-boolean v3, v0, La3/g1;->W:Z

    iput-boolean v3, v0, La3/g1;->X:Z

    goto :goto_0

    :cond_1
    iput-boolean v3, v1, La3/a;->g:Z

    :cond_2
    :goto_0
    invoke-virtual {v0}, La3/g1;->J()Landroidx/compose/ui/node/a;

    move-result-object v2

    iput-boolean v3, v2, La3/w0;->K:Z

    invoke-virtual {v0}, La3/g1;->t()V

    invoke-virtual {v0}, La3/g1;->J()Landroidx/compose/ui/node/a;

    move-result-object v0

    const/4 v2, 0x0

    iput-boolean v2, v0, La3/w0;->K:Z

    iget-object v0, v1, La3/a;->i:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_3
    const/high16 p1, -0x80000000

    return p1
.end method

.method public final O(I)I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->e(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final Q(I)I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->c(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final T(J)Ly2/j1;
    .locals 6

    invoke-virtual {p0, p1, p2}, Ly2/j1;->v0(J)V

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->M()Lr1/c;

    move-result-object v1

    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v2, v3

    check-cast v4, La3/n0;

    invoke-virtual {v4}, La3/n0;->z()La3/g1;

    move-result-object v4

    sget-object v5, La3/j0;->y:La3/j0;

    iput-object v5, v4, La3/g1;->L:La3/j0;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, v0, La3/n0;->V:Ly2/r0;

    invoke-virtual {v0}, La3/n0;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, p0, v0, p1, p2}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->z1(Ly2/s0;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->r1()V

    return-object p0
.end method

.method public final b(I)I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->E()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->R()Ly2/r0;

    move-result-object v1

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, La3/n0;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Ly2/r0;->d(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final b1()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-nez v0, :cond_0

    new-instance v0, La3/w;

    invoke-direct {v0, p0}, La3/x0;-><init>(Landroidx/compose/ui/node/NodeCoordinator;)V

    iput-object v0, p0, Landroidx/compose/ui/node/a;->q0:La3/w;

    :cond_0
    return-void
.end method

.method public final e1()La3/x0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->q0:La3/w;

    return-object v0
.end method

.method public final g1()Lb2/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p0:La3/l2;

    return-object v0
.end method

.method public final m1(La3/e;JLa3/v;IZ)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v3, p2

    move-object/from16 v9, p4

    iget v2, v1, La3/e;->w:I

    const/4 v12, 0x1

    const/4 v13, 0x0

    iget-object v5, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    packed-switch v2, :pswitch_data_0

    invoke-virtual {v5}, La3/n0;->I()Li3/l;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-boolean v2, v2, Li3/l;->z:Z

    if-ne v2, v12, :cond_0

    move v2, v12

    goto :goto_0

    :cond_0
    move v2, v13

    :goto_0
    xor-int/2addr v2, v12

    goto :goto_1

    :pswitch_0
    move v2, v12

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v0, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->H1(J)Z

    move-result v2

    if-eqz v2, :cond_1

    move/from16 v2, p5

    move/from16 v11, p6

    move v6, v12

    goto :goto_2

    :cond_1
    move/from16 v2, p5

    invoke-static {v2, v12}, Lu2/d0;->f(II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->f1()J

    move-result-wide v6

    invoke-virtual {v0, v3, v4, v6, v7}, Landroidx/compose/ui/node/NodeCoordinator;->Y0(JJ)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    const v7, 0x7fffffff

    and-int/2addr v6, v7

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v6, v7, :cond_3

    move v6, v12

    move v11, v13

    goto :goto_2

    :cond_2
    move/from16 v2, p5

    :cond_3
    move/from16 v11, p6

    move v6, v13

    :goto_2
    if-eqz v6, :cond_10

    iget v14, v9, La3/v;->y:I

    invoke-virtual {v5}, La3/n0;->L()Lr1/c;

    move-result-object v5

    iget-object v15, v5, Lr1/c;->w:[Ljava/lang/Object;

    iget v5, v5, Lr1/c;->y:I

    sub-int/2addr v5, v12

    move/from16 v16, v5

    :goto_3
    if-ltz v16, :cond_f

    aget-object v5, v15, v16

    check-cast v5, La3/n0;

    invoke-virtual {v5}, La3/n0;->Y()Z

    move-result v6

    if-eqz v6, :cond_e

    iget v6, v1, La3/e;->w:I

    packed-switch v6, :pswitch_data_1

    iget-object v6, v5, La3/n0;->e0:La3/l1;

    iget-object v7, v6, La3/l1;->e:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v7, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->d1(J)J

    move-result-wide v7

    iget-object v6, v6, La3/l1;->e:Ljava/lang/Object;

    check-cast v6, Landroidx/compose/ui/node/NodeCoordinator;

    move-object v10, v5

    move-object v5, v6

    sget-object v6, Landroidx/compose/ui/node/NodeCoordinator;->o0:La3/e;

    move-object/from16 v17, v10

    const/4 v10, 0x1

    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/node/NodeCoordinator;->l1(La3/e;JLa3/v;IZ)V

    move-object/from16 v9, p4

    move-object/from16 v10, v17

    goto :goto_4

    :pswitch_1
    move v6, v2

    move-object v2, v5

    move-object v5, v9

    move v7, v11

    invoke-virtual/range {v2 .. v7}, La3/n0;->N(JLa3/v;IZ)V

    move-object v10, v2

    :goto_4
    invoke-virtual {v9}, La3/v;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Lds/p;->H(J)F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-gez v4, :cond_e

    invoke-static {v2, v3}, Lds/p;->L(J)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {v2, v3}, Lds/p;->K(J)Z

    move-result v2

    if-nez v2, :cond_e

    iget-object v2, v10, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0x10

    invoke-static {v3}, La3/r1;->g(I)Z

    move-result v4

    invoke-virtual {v2, v4}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v2

    if-nez v2, :cond_4

    goto/16 :goto_a

    :cond_4
    iget-boolean v4, v2, Lb2/v;->N:Z

    if-eqz v4, :cond_f

    iget-object v4, v2, Lb2/v;->w:Lb2/v;

    iget-boolean v4, v4, Lb2/v;->N:Z

    if-nez v4, :cond_5

    const-string v4, "visitLocalDescendants called on an unattached node"

    invoke-static {v4}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_5
    iget-object v2, v2, Lb2/v;->w:Lb2/v;

    iget v4, v2, Lb2/v;->z:I

    and-int/2addr v4, v3

    if-eqz v4, :cond_f

    :goto_5
    if-eqz v2, :cond_f

    iget v4, v2, Lb2/v;->y:I

    and-int/2addr v4, v3

    if-eqz v4, :cond_d

    const/4 v4, 0x0

    move-object v5, v2

    move-object v6, v4

    :goto_6
    if-eqz v5, :cond_d

    instance-of v7, v5, La3/f2;

    if-eqz v7, :cond_6

    check-cast v5, La3/f2;

    invoke-interface {v5}, La3/f2;->C0()Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v2, v9, La3/v;->w:La0/q0;

    iget v2, v2, La0/q0;->b:I

    sub-int/2addr v2, v12

    iput v2, v9, La3/v;->y:I

    goto :goto_9

    :cond_6
    iget v7, v5, Lb2/v;->y:I

    and-int/2addr v7, v3

    if-eqz v7, :cond_c

    instance-of v7, v5, La3/o;

    if-eqz v7, :cond_c

    move-object v7, v5

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    move v8, v13

    :goto_7
    if-eqz v7, :cond_b

    iget v10, v7, Lb2/v;->y:I

    and-int/2addr v10, v3

    if-eqz v10, :cond_a

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v12, :cond_7

    move-object v5, v7

    goto :goto_8

    :cond_7
    if-nez v6, :cond_8

    new-instance v6, Lr1/c;

    new-array v10, v3, [Lb2/v;

    invoke-direct {v6, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v5, :cond_9

    invoke-virtual {v6, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_9
    invoke-virtual {v6, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_8
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_7

    :cond_b
    if-ne v8, v12, :cond_c

    goto :goto_6

    :cond_c
    invoke-static {v6}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v5

    goto :goto_6

    :cond_d
    iget-object v2, v2, Lb2/v;->F:Lb2/v;

    goto :goto_5

    :cond_e
    :goto_9
    add-int/lit8 v16, v16, -0x1

    move-wide/from16 v3, p2

    move/from16 v2, p5

    goto/16 :goto_3

    :cond_f
    :goto_a
    iput v14, v9, La3/v;->y:I

    :cond_10
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
    .end packed-switch
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->w1(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    iget-boolean p1, v0, La3/w0;->J:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {p1}, La3/n0;->z()La3/g1;

    move-result-object p1

    invoke-virtual {p1}, La3/g1;->L0()V

    return-void
.end method

.method public final p0(JFLl2/c;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->w1(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    iget-boolean p1, v0, La3/w0;->J:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {p1}, La3/n0;->z()La3/g1;

    move-result-object p1

    invoke-virtual {p1}, La3/g1;->L0()V

    return-void
.end method

.method public final v1(Li2/v;Ll2/c;)V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-virtual {v0}, La3/n0;->L()Lr1/c;

    move-result-object v0

    iget-object v2, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    aget-object v4, v2, v3

    check-cast v4, La3/n0;

    invoke-virtual {v4}, La3/n0;->Y()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, p1, p2}, La3/n0;->k(Li2/v;Ll2/c;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getShowLayoutBounds()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-wide v0, p0, Ly2/j1;->y:J

    const/16 p2, 0x20

    shr-long v2, v0, p2

    long-to-int p2, v2

    int-to-float p2, p2

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float v6, p2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int p2, v0

    int-to-float p2, p2

    sub-float v7, p2, v2

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    sget-object v8, Landroidx/compose/ui/node/a;->r0:Li2/h;

    move-object v3, p1

    invoke-interface/range {v3 .. v8}, Li2/v;->b(FFFFLi2/q0;)V

    :cond_2
    return-void
.end method
