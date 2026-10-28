.class public final La3/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:La3/f;

.field public static final F:La3/f;

.field public static final G:La3/f;

.field public static final H:La3/f;

.field public static final I:La3/f;

.field public static final J:La3/f;

.field public static final K:La3/f;

.field public static final L:La3/f;

.field public static final M:La3/f;

.field public static final x:La3/f;

.field public static final y:La3/f;

.field public static final z:La3/f;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, La3/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->x:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->y:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->z:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->E:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->F:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->G:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->H:La3/f;

    new-instance v0, La3/f;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->I:La3/f;

    new-instance v0, La3/f;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->J:La3/f;

    new-instance v0, La3/f;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->K:La3/f;

    new-instance v0, La3/f;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->L:La3/f;

    new-instance v0, La3/f;

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, La3/f;-><init>(II)V

    sput-object v0, La3/f;->M:La3/f;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, La3/f;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, La3/f;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, La3/n0;->V()V

    :cond_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, La3/n0;->v0(La3/n0;ZI)V

    :cond_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, La3/n0;->t0(La3/n0;ZI)V

    :cond_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La3/n0;->s0(Z)V

    :cond_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La3/n0;->s0(Z)V

    :cond_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La3/n0;->u0(Z)V

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La3/n0;->u0(Z)V

    :cond_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, La3/x1;

    invoke-virtual {v1}, La3/x1;->U()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v1, v1, La3/x1;->w:La3/w1;

    invoke-interface {v1}, La3/w1;->C()V

    :cond_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->U()Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/compose/ui/node/NodeCoordinator;->G1(Z)Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v3, v1, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v3}, La3/n0;->t()La3/r0;

    move-result-object v4

    iget v5, v4, La3/r0;->l:I

    const/4 v6, 0x0

    if-lez v5, :cond_a

    iget-boolean v5, v4, La3/r0;->k:Z

    if-nez v5, :cond_8

    iget-boolean v5, v4, La3/r0;->j:Z

    if-eqz v5, :cond_9

    :cond_8
    invoke-virtual {v3, v6}, La3/n0;->u0(Z)V

    :cond_9
    iget-object v4, v4, La3/r0;->p:La3/g1;

    invoke-virtual {v4}, La3/g1;->H0()V

    :cond_a
    invoke-virtual {v3}, La3/n0;->k0()V

    invoke-static {v3}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/ui/node/Owner;->getRectManager()Lj3/b;

    move-result-object v5

    iget-object v7, v3, La3/n0;->e0:La3/l1;

    iget-object v7, v7, La3/l1;->e:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/node/NodeCoordinator;

    if-ne v1, v7, :cond_b

    invoke-virtual {v5, v3, v6}, Lj3/b;->g(La3/n0;Z)V

    invoke-virtual {v5, v3}, Lj3/b;->e(La3/n0;)V

    goto :goto_0

    :cond_b
    invoke-virtual {v5, v3}, Lj3/b;->f(La3/n0;)V

    :goto_0
    iget v1, v3, La3/n0;->n0:I

    if-lez v1, :cond_d

    check-cast v4, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, v4, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-object v1, v1, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v3, La3/n0;->n0:I

    if-lez v5, :cond_c

    iget-object v1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    invoke-virtual {v1, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    iput-boolean v2, v3, La3/n0;->m0:Z

    :cond_c
    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->I(La3/n0;)V

    :cond_d
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v1, :cond_e

    invoke-interface {v1}, La3/a2;->invalidate()V

    :cond_e
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_9
    move-object/from16 v3, p1

    check-cast v3, La3/e2;

    invoke-virtual {v3}, La3/e2;->U()Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v2, v3, La3/e2;->x:La3/w0;

    iget-boolean v1, v2, La3/w0;->K:Z

    if-eqz v1, :cond_f

    goto :goto_3

    :cond_f
    iget-object v1, v3, La3/e2;->w:Ly2/s0;

    invoke-interface {v1}, Ly2/s0;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v4, v2, La3/w0;->N:La0/v0;

    if-nez v1, :cond_14

    if-eqz v4, :cond_15

    iget-object v1, v4, La0/v0;->c:[Ljava/lang/Object;

    iget-object v3, v4, La0/v0;->a:[J

    array-length v5, v3

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_13

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    aget-wide v8, v3, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_12

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_2
    if-ge v12, v10, :cond_11

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_10

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v1, v13

    check-cast v13, La0/w0;

    invoke-virtual {v2, v13}, La3/w0;->T0(La0/w0;)V

    :cond_10
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_11
    if-ne v10, v11, :cond_13

    :cond_12
    if-eq v7, v5, :cond_13

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_13
    invoke-virtual {v4}, La0/v0;->a()V

    goto :goto_3

    :cond_14
    const-wide v4, 0x7fffffff7fffffffL

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, La3/w0;->G0(La3/e2;JJ)V

    iput-object v1, v2, La3/w0;->G:Lkotlin/jvm/functions/Function1;

    :cond_15
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, La3/d;

    invoke-virtual {v1}, La3/d;->Z0()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
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
